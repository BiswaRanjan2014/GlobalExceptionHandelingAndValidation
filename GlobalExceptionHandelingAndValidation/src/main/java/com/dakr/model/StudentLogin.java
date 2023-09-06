package com.dakr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Stu_Login")
public class StudentLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stuId;

	@NotEmpty
	@Size(max = 6, message = "Student name should be in 6 charater")
	@NotNull(message = "Student name must not be empty")
	private String stuName;

	@NotEmpty
	@NotNull(message = "Student Last Name Must not be empty")
	private String stulastName;

	@NotBlank
	private String stuAdres;

	//@NotBlank
	//@Pattern(regexp = "^\\{10}$", message = "Invalid Mobile Number Enter Again")
	private Long stuMobNo;

	@NotEmpty
	private String doB;

	@NotBlank
	@Email(message = "Email-Id is Not Valid")
	private String stuEmail;

	//@NotBlank
	@Min(18)
	@Max(60)
	private Integer stuAge;

	@NotBlank(message = "Gender should be fillup")
	private String stuGender;

	@NotEmpty
	@Size(min = 4, max = 15, message = "password must bu 4 to 10 char")
	private String loginPswd;

}
