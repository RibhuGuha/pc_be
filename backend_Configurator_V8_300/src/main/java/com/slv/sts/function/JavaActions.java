package com.slv.sts.function;

import com.slv.sts.model.Pet;
import com.slv.sts.model.PetCareCenter;
import com.slv.sts.model.PetOwner;
import com.slv.sts.model.Document;
import com.slv.sts.model.PetService;




import com.slv.sts.enums.PetServiceType;
import com.slv.sts.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  