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

@Entity(name = "PetCareCenterImages")
@Table(schema = "\"slv_sts\"", name = "\"PetCareCenterImages\"")
@Data
public class PetCareCenterImages{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"DocId\"")
    private Integer docId;
 
}