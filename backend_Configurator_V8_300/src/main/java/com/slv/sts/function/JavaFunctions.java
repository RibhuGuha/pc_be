package com.slv.sts.function;

import com.slv.sts.model.Pet;
import com.slv.sts.model.PetCareCenter;
import com.slv.sts.model.PetOwner;
import com.slv.sts.model.Document;
import com.slv.sts.model.PetService;
import com.slv.sts.enums.PetServiceType;
import com.slv.sts.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.slv.sts.repository.PetServiceRepository;
import com.slv.sts.repository.PetOwnerRepository;
import com.slv.sts.repository.PetCareCenterRepository;
import com.slv.sts.repository.DocumentRepository;
import com.slv.sts.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
