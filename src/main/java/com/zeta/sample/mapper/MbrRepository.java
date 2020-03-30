package com.zeta.sample.mapper;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeta.sample.entity.Mbr;

public interface MbrRepository extends JpaRepository<Mbr, Long> {
	public Mbr findByMbrId(String mbrId);
}