package com.vinapex.organizationservicenew.services;

import com.vinapex.organizationservicenew.model.Organization;
import com.vinapex.organizationservicenew.repository.OrganizationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class OrganizationService {
    @Autowired
    private OrganizationRepository orgRepository;

    public Organization getOrg(String organizationId) {
        log.info("The organization Id is :" + organizationId);
        return orgRepository.findById(organizationId).get();
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());

        orgRepository.save(org);

    }

    public void updateOrg(Organization org){
        orgRepository.save(org);
    }

    public void deleteOrg(String orgId){
        Organization organization = new Organization();
        organization.setId(orgId);
        orgRepository.delete(organization);
    }
}
