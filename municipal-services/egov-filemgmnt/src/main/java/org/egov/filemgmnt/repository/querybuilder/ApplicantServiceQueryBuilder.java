package org.egov.filemgmnt.repository.querybuilder;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.egov.filemgmnt.web.models.ApplicantServiceSearchCriteria;
import org.springframework.stereotype.Component;

@Component
public class ApplicantServiceQueryBuilder extends BaseQueryBuilder {

    private static final String QUERY = new StringBuilder().append(" SELECT aps.id, aps.applicantpersonalid, aps.serviceid, aps.servicecode, aps.businessservice, aps.workflowcode")
                                                           .append("     , ap.createdby, ap.createddate, ap.lastmodifiedby, ap.lastmodifieddate")
                                                           .append(" FROM eg_fm_servicedetails aps")
                                                           .toString();

    public String getApplicantServiceSearchQuery(@NotNull ApplicantServiceSearchCriteria criteria,
                                                 @NotNull List<Object> preparedStmtValues, Boolean isCount) {

        StringBuilder query = new StringBuilder(QUERY);

        addIdsFilter("ap.id", criteria.getIds(), query, preparedStmtValues);

        return query.toString();
    }
}