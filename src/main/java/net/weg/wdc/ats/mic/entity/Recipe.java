package net.weg.wdc.ats.mic.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The persistent class for the RECIPES database table.
 * 
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "RECIPES")
public class Recipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue()
	@Column(name = "ID", unique = true, nullable = false)
	private long id;

	@Column(name = "ACCESSORY_MODEL_ACTIVE", nullable = false)
	private boolean accessoryModelActive;

	@Column(name = "ACCESSORY_MODEL_MODEL")
	private short accessoryModelModel;

	@Column(name = "ACTIVE", nullable = false)
	private boolean active;

	@Column(name = "ANALOG_INPUT_CALIBRATION_ACTIVE", nullable = false)
	private boolean analogInputCalibrationActive;

	@Column(name = "ANALOG_INPUTS_ACTIVE", nullable = false)
	private boolean analogInputsActive;

	@Column(name = "ANALOG_INPUTS_MAXIMUM_CURRENT_1", precision = 5, scale = 3)
	private BigDecimal analogInputsMaximumCurrent1;

	@Column(name = "ANALOG_INPUTS_MAXIMUM_CURRENT_2", precision = 5, scale = 3)
	private BigDecimal analogInputsMaximumCurrent2;

	@Column(name = "ANALOG_INPUTS_MAXIMUM_CURRENT_3", precision = 5, scale = 3)
	private BigDecimal analogInputsMaximumCurrent3;

	@Column(name = "ANALOG_INPUTS_MAXIMUM_VOLTAGE_1", precision = 5, scale = 3)
	private BigDecimal analogInputsMaximumVoltage1;

	@Column(name = "ANALOG_INPUTS_MAXIMUM_VOLTAGE_2", precision = 5, scale = 3)
	private BigDecimal analogInputsMaximumVoltage2;

	@Column(name = "ANALOG_INPUTS_MAXIMUM_VOLTAGE_3", precision = 5, scale = 3)
	private BigDecimal analogInputsMaximumVoltage3;

	@Column(name = "ANALOG_INPUTS_MINIMUM_CURRENT_1", precision = 5, scale = 3)
	private BigDecimal analogInputsMinimumCurrent1;

	@Column(name = "ANALOG_INPUTS_MINIMUM_CURRENT_2", precision = 5, scale = 3)
	private BigDecimal analogInputsMinimumCurrent2;

	@Column(name = "ANALOG_INPUTS_MINIMUM_CURRENT_3", precision = 5, scale = 3)
	private BigDecimal analogInputsMinimumCurrent3;

	@Column(name = "ANALOG_INPUTS_MINIMUM_VOLTAGE_1", precision = 5, scale = 3)
	private BigDecimal analogInputsMinimumVoltage1;

	@Column(name = "ANALOG_INPUTS_MINIMUM_VOLTAGE_2", precision = 5, scale = 3)
	private BigDecimal analogInputsMinimumVoltage2;

	@Column(name = "ANALOG_INPUTS_MINIMUM_VOLTAGE_3", precision = 5, scale = 3)
	private BigDecimal analogInputsMinimumVoltage3;

	@Column(name = "ANALOG_INPUTS_VALUE_1", precision = 5, scale = 3)
	private BigDecimal analogInputsValue1;

	@Column(name = "ANALOG_INPUTS_VALUE_2", precision = 5, scale = 3)
	private BigDecimal analogInputsValue2;

	@Column(name = "ANALOG_INPUTS_VALUE_3", precision = 5, scale = 3)
	private BigDecimal analogInputsValue3;

	@Column(name = "APPLIED_VOLTAGE_CONTROL_ACTIVE", nullable = false)
	private boolean appliedVoltageControlActive;

	@Column(name = "APPLIED_VOLTAGE_CONTROL_CUT_OFF_CURRENT", precision = 8, scale = 2)
	private BigDecimal appliedVoltageControlCutOffCurrent;

	@Column(name = "APPLIED_VOLTAGE_CONTROL_FALL_TIME", precision = 7, scale = 2)
	private BigDecimal appliedVoltageControlFallTime;

	@Column(name = "APPLIED_VOLTAGE_CONTROL_RAMP_TIME", precision = 7, scale = 2)
	private BigDecimal appliedVoltageControlRampTime;

	@Column(name = "APPLIED_VOLTAGE_CONTROL_TEST_TIME", precision = 7, scale = 2)
	private BigDecimal appliedVoltageControlTestTime;

	@Column(name = "APPLIED_VOLTAGE_CONTROL_TEST_VOLTAGE")
	private short appliedVoltageControlTestVoltage;

	@Column(name = "APPLIED_VOLTAGE_POWER_ACTIVE", nullable = false)
	private boolean appliedVoltagePowerActive;

	@Column(name = "APPLIED_VOLTAGE_POWER_CUT_OFF_CURRENT", precision = 8, scale = 2)
	private BigDecimal appliedVoltagePowerCutOffCurrent;

	@Column(name = "APPLIED_VOLTAGE_POWER_FALL_TIME", precision = 7, scale = 2)
	private BigDecimal appliedVoltagePowerFallTime;

	@Column(name = "APPLIED_VOLTAGE_POWER_RAMP_TIME", precision = 7, scale = 2)
	private BigDecimal appliedVoltagePowerRampTime;

	@Column(name = "APPLIED_VOLTAGE_POWER_TEST_TIME", precision = 7, scale = 2)
	private BigDecimal appliedVoltagePowerTestTime;

	@Column(name = "APPLIED_VOLTAGE_POWER_TEST_VOLTAGE")
	private short appliedVoltagePowerTestVoltage;

	@Column(name = "BRAKING_ACTIVE", nullable = false)
	private boolean brakingActive;

	@Column(name = "BRAKING_MINIMUM_VOLTAGE")
	private int brakingMinimumVoltage;

	@Column(name = "COMMUNICATION_TEST_ACTIVE", nullable = false)
	private boolean communicationTestActive;

	@Column(name = "CURRENT_PID_KD", nullable = false, precision = 6, scale = 3)
	private BigDecimal currentPidKd;

	@Column(name = "CURRENT_PID_KI", nullable = false, precision = 6, scale = 3)
	private BigDecimal currentPidKi;

	@Column(name = "CURRENT_PID_KP", nullable = false, precision = 6, scale = 3)
	private BigDecimal currentPidKp;

	@Column(name = "CURRENT_PID_TOL", nullable = false, precision = 6, scale = 3)
	private BigDecimal currentPidTol;

	@Column(name = "CURRENT_PID_TORQUE_STEP", nullable = false, precision = 6, scale = 3)
	private BigDecimal currentPidTorqueStep;

	@Column(name = "DIGITAL_INPUTS_ACTIVE", nullable = false)
	private boolean digitalInputsActive;

	@Column(name = "DIGITAL_OUTPUTS_ACTIVE", nullable = false)
	private boolean digitalOutputsActive;

	@Column(name = "DISPLAY_VERIFICATION_ACTIVE", nullable = false)
	private boolean displayVerificationActive;

	@Column(name = "EARTH_FAULT_ACTIVE", nullable = false)
	private boolean earthFaultActive;

	@Column(name = "FAMILY_MODEL", nullable = false)
	private short familyModel;

	@Column(name = "FIRMWARE_DOCUMENT_NUMBER", length = 20)
	private String firmwareDocumentNumber;

	@Column(name = "FIRMWARE_IDENTIFICATION_ACTIVE", nullable = false)
	private boolean firmwareIdentificationActive;

	@Column(name = "FIRMWARE_RECORDING_ACTIVE", nullable = false)
	private boolean firmwareRecordingActive;

	@Column(name = "HARDWARE_IDENTIFICATION_ACTIVE", nullable = false)
	private boolean hardwareIdentificationActive;

	@Column(name = "HARDWARE_IDENTIFICATION_VALUE", length = 10)
	private String hardwareIdentificationValue;

	@Column(name = "LINK_DC_ACTIVE", nullable = false)
	private boolean linkDcActive;

	@Column(name = "LINK_DC_TOLERANCE", precision = 5, scale = 2)
	private BigDecimal linkDcTolerance;

	@Column(name = "LOAD_TEST_ACTIVE", nullable = false)
	private boolean loadTestActive;

	@Column(name = "LOAD_TEST_DERATING_PERCENTAGE")
	private short loadTestDeratingPercentage;

	@Column(name = "LOAD_TEST_DERATING_START")
	private short loadTestDeratingStart;

	@Column(name = "LOAD_TEST_MAXIMUM_TEMPERATURE")
	private short loadTestMaximumTemperature;

	@Column(name = "LOAD_TEST_REFERENCE")
	private short loadTestReference;

	@Column(name = "LOAD_TEST_TIME")
	private int loadTestTime;

	@Column(name = "MODIFICATION_DATE", nullable = false)
	private Timestamp modificationDate;

	@Column(name = "MODIFICATION_USER", nullable = false, length = 100)
	private String modificationUser;

	@Column(name = "NOTES", length = 300)
	private String notes;

	@Column(name = "OUTPUT_CURRENT_ACTIVE", nullable = false)
	private boolean outputCurrentActive;

	@Column(name = "OUTPUT_CURRENT_TOLERANCE", precision = 5, scale = 2)
	private BigDecimal outputCurrentTolerance;

	@Column(name = "PARAMETERS_FINAL_ACTIVE", nullable = false)
	private boolean parametersFinalActive;

	@Column(name = "PARAMETERS_INITIAL_ACTIVE", nullable = false)
	private boolean parametersInitialActive;

	@Column(name = "POWER_SUPPLY_01_ACTIVE", nullable = false)
	private boolean powerSupply01Active;

	@Column(name = "POWER_SUPPLY_01_MAX", precision = 5, scale = 2)
	private BigDecimal powerSupply01Max;

	@Column(name = "POWER_SUPPLY_01_MIN", precision = 5, scale = 2)
	private BigDecimal powerSupply01Min;

	@Column(name = "POWER_SUPPLY_02_ACTIVE")
	private boolean powerSupply02Active;

	@Column(name = "POWER_SUPPLY_02_MAX", precision = 5, scale = 2)
	private BigDecimal powerSupply02Max;

	@Column(name = "POWER_SUPPLY_02_MIN", precision = 5, scale = 2)
	private BigDecimal powerSupply02Min;

	@Column(name = "SERIAL_NUMBER_RECORDING_ACTIVE", nullable = false)
	private boolean serialNumberRecordingActive;

	@Column(name = "SETPOINT_CURRENT", nullable = false, precision = 7, scale = 2)
	private BigDecimal setpointCurrent;

	@Column(name = "SHORT_CIRCUIT_ACTIVE", nullable = false)
	private boolean shortCircuitActive;

	@Column(name = "SPEED_TEST_ACTIVE", nullable = false)
	private boolean speedTestActive;

	@Column(name = "SPEED_TEST_REFERENCE")
	private short speedTestReference;

	@Column(name = "SPEED_TEST_TOLERANCE", precision = 5, scale = 2)
	private BigDecimal speedTestTolerance;

	@Column(name = "TEMPERATURE", nullable = false)
	private short temperature;
	
	@Column(name = "MATERIAL", nullable = false)
	private Item item;

	// bi-directional many-to-one association to ParametersList
	@OneToMany(mappedBy = "recipe")
	private List<ParametersList> parametersLists;

	// bi-directional many-to-one association to EarthFault
	@ManyToOne
	@JoinColumn(name = "EARTH_FAULT_CONFIG")
	private EarthFault earthFault;

	// bi-directional many-to-one association to MotorPower
	@ManyToOne
	@JoinColumn(name = "MOTOR_POWER", nullable = false)
	private MotorPower motorPowerBean;

	// bi-directional many-to-one association to MotorVoltage
	@ManyToOne
	@JoinColumn(name = "VOLTAGE_MOTOR", nullable = false)
	private MotorVoltage motorVoltage;

	// bi-directional many-to-one association to SupplyVoltage
	@ManyToOne
	@JoinColumn(name = "VOLTAGE_SUPPLY", nullable = false)
	private SupplyVoltage supplyVoltage;

}