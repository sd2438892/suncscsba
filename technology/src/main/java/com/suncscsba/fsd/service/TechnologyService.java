package com.suncscsba.fsd.service;

import com.suncscsba.fsd.entity.TTechnology;

import java.util.List;

public interface TechnologyService {
    List<TTechnology> findAllTechnologies();

    TTechnology findBySkillId(String skillId);
}
