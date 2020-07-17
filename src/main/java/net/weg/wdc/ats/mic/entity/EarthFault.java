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
@Table(name = "EARTH_FAULT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EarthFault implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private long id;

	@Column(name = "EARTH_FAULT", nullable = false)
	private String earthFault;

}