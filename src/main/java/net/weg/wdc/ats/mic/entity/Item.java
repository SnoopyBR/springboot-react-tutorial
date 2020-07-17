package net.weg.wdc.ats.mic.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * The persistent class for the ITEM database table.
 * 
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="ITEM")
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MATERIAL", unique=true, nullable=false)
	private long material;

	@Column(name="EAN", nullable=false)
	private long ean;

	@Column(name="ITEM_DESCRIPTION", nullable=false, length=50)
	private String itemDescription;

	@Column(name="FAMILY", nullable=false, length=255)
	private String family;

	@Column(name="INPUT_VOLTAGE", nullable=false, length=255)
	private String inputVoltage;

	@Column(name="OUTPUT_NOMINAL_CURRENT", nullable=false, precision=7, scale=2)
	private BigDecimal outputNominalCurrent;

	@Column(name="SINGLE_PHASE_INPUT_CURRENT", precision=7, scale=2)
	private BigDecimal singlePhaseInputCurrent;

	@Column(name="THREE_PHASE_INPUT_CURRENT", precision=7, scale=2)
	private BigDecimal threePhaseInputCurrent;

	@Column(name="INPUT_VOLTAGE_TYPE", nullable=false, length=255)
	private String inputVoltageType;

	@Column(name="FILTER", length=255)
	private String filter;

	@Column(name="DYNAMIC_BRAKING", length=255)
	private String dynamicBraking;

	@Column(name="ITEM_SIZE", nullable=false, length=255)
	private String itemSize;

	@Column(name="HARDWARE", length=255)
	private String hardware;

	@Column(name="SAFETY_STOP", length=255)
	private String safetyStop;
	
	@Column(name="FIRMWARE_VERSION", length=100)
	private String firmwareVersion;
	
	@Column(name="APPLICATION_VERSION", length=100)
	private String applicationVersion;

	@Column(name="FINAL_CONFIGURATION_VERSION", length=100)
	private String finalConfigurationVersion;

	@Column(name="FIRMWARE_DOCUMENT_NUMBER", nullable=false, length=255)
	private String firmwareDocumentNumber;
	
	@Column(name="APPLICATION_DOCUMENT_NUMBER", length=255)
	private String applicationDocumentNumber;

	@Column(name="FINAL_CONFIGURATION_DOCUMENT_NUMBER", length=255)
	private String finalConfigurationDocumentNumber;
	
	@Column(name="ADD_DATE", nullable=false, length=1)
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date addDate;

	//bi-directional many-to-one association to Recipe
	@OneToMany(mappedBy="item")
	private List<Recipe> recipes;

}