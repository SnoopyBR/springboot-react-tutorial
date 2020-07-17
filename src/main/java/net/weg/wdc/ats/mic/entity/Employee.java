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
@Table(name="EMPLOYEE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE", unique=true, nullable=false, length=20)
	private String code;

	@Column(name="NAME", nullable=false, length=100)
	private String name;

}