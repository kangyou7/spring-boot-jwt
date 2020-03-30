package com.zeta.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Mbr {

	@Id
	@Column
	private String mbrId;

	@Column
	private String mbrPw;

}
