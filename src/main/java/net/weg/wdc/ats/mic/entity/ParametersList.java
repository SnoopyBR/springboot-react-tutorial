package net.weg.wdc.ats.mic.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="PARAMETERS_LIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParametersList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false)
	private long id;

	@Column(name="[COMMENT]", length=300)
	private String comment;

	@Column(name="LIST_TYPE", nullable=false)
	private short listType;

	@Column(name="[PARAMETER]", nullable=false)
	private int parameter;

	@Column(name="[VALUE]", nullable=false)
	private int value;

	//bi-directional many-to-one association to Recipe
	@ManyToOne
	@JoinColumn(name="MATERIAL", referencedColumnName="MATERIAL", nullable=false)
	@JsonIgnore
	private Recipe recipe;

}