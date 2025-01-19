package com.agencyconnect.api.repository.interfaces;

import com.agencyconnect.api.model.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizationRepository extends MongoRepository<Organization,String> {
}
