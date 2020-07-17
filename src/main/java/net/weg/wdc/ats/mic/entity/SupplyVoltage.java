package net.weg.wdc.ats.mic.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="SUPPLY_VOLTAGE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplyVoltage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false)
	private long id;

	@Column(name="SUPPLY_VOLTAGE", nullable=false, length=50)
	private String supplyVoltage;

	//bi-directional many-to-one association to Recipe
	@OneToMany(mappedBy="supplyVoltage")
	@JsonIgnore
	private List<Recipe> recipes;

	
}