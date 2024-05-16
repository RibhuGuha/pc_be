package com.slv.sts.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.slv.sts.model.Pet;
import com.slv.sts.model.PetCareCenter;
import com.slv.sts.model.PetOwner;
import com.slv.sts.model.Document;
import com.slv.sts.model.PetService;
import com.slv.sts.enums.PetServiceType;
import com.slv.sts.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"slv_sts\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}