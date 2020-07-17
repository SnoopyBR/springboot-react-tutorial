package net.weg.wdc.ats.mic.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="FAMILY_MODEL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false)
	private long id;

	@Column(name="FAMILY", nullable=false, length=100)
	private String family;

	
}