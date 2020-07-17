package net.weg.wdc.ats.mic.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="MOTOR_VOLTAGE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MotorVoltage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false)
	private long id;

	@Column(name="MOTOR_VOLTAGE", nullable=false, length=50)
	private String motorVoltage;

	
}