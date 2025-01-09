package io.github.dekkerding.infrastructure.service.impl;

import org.camunda.bpm.application.ProcessApplicationReference;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.*;
import org.camunda.bpm.engine.task.IdentityLink;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.cmmn.CmmnModelInstance;
import org.camunda.bpm.model.dmn.DmnModelInstance;

import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class RepositoryServiceImpl implements RepositoryService {
    /**
     * @return
     */
    @Override
    public DeploymentBuilder createDeployment() {
        return null;
    }

    /**
     * @param processApplicationReference
     * @return
     */
    @Override
    public ProcessApplicationDeploymentBuilder createDeployment(ProcessApplicationReference processApplicationReference) {
        return null;
    }

    /**
     * @param s
     */
    @Override
    public void deleteDeployment(String s) {

    }

    /**
     * @param s
     * @deprecated
     */
    @Override
    public void deleteDeploymentCascade(String s) {

    }

    /**
     * @param s
     * @param b
     */
    @Override
    public void deleteDeployment(String s, boolean b) {

    }

    /**
     * @param s
     * @param b
     * @param b1
     */
    @Override
    public void deleteDeployment(String s, boolean b, boolean b1) {

    }

    /**
     * @param s
     * @param b
     * @param b1
     * @param b2
     */
    @Override
    public void deleteDeployment(String s, boolean b, boolean b1, boolean b2) {

    }

    /**
     * @param s
     */
    @Override
    public void deleteProcessDefinition(String s) {

    }

    /**
     * @param s
     * @param b
     */
    @Override
    public void deleteProcessDefinition(String s, boolean b) {

    }

    /**
     * @param s
     * @param b
     * @param b1
     */
    @Override
    public void deleteProcessDefinition(String s, boolean b, boolean b1) {

    }

    /**
     * @param s
     * @param b
     * @param b1
     * @param b2
     */
    @Override
    public void deleteProcessDefinition(String s, boolean b, boolean b1, boolean b2) {

    }

    /**
     * @return
     */
    @Override
    public DeleteProcessDefinitionsSelectBuilder deleteProcessDefinitions() {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public List<String> getDeploymentResourceNames(String s) {
        return Collections.emptyList();
    }

    /**
     * @param s
     * @return
     */
    @Override
    public List<Resource> getDeploymentResources(String s) {
        return Collections.emptyList();
    }

    /**
     * @param s
     * @param s1
     * @return
     */
    @Override
    public InputStream getResourceAsStream(String s, String s1) {
        return null;
    }

    /**
     * @param s
     * @param s1
     * @return
     */
    @Override
    public InputStream getResourceAsStreamById(String s, String s1) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public ProcessDefinitionQuery createProcessDefinitionQuery() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public CaseDefinitionQuery createCaseDefinitionQuery() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public DecisionDefinitionQuery createDecisionDefinitionQuery() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public DecisionRequirementsDefinitionQuery createDecisionRequirementsDefinitionQuery() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public DeploymentQuery createDeploymentQuery() {
        return null;
    }

    /**
     * @param s
     */
    @Override
    public void suspendProcessDefinitionById(String s) {

    }

    /**
     * @param s
     * @param b
     * @param date
     */
    @Override
    public void suspendProcessDefinitionById(String s, boolean b, Date date) {

    }

    /**
     * @param s
     */
    @Override
    public void suspendProcessDefinitionByKey(String s) {

    }

    /**
     * @param s
     * @param b
     * @param date
     */
    @Override
    public void suspendProcessDefinitionByKey(String s, boolean b, Date date) {

    }

    /**
     * @param s
     */
    @Override
    public void activateProcessDefinitionById(String s) {

    }

    /**
     * @param s
     * @param b
     * @param date
     */
    @Override
    public void activateProcessDefinitionById(String s, boolean b, Date date) {

    }

    /**
     * @param s
     */
    @Override
    public void activateProcessDefinitionByKey(String s) {

    }

    /**
     * @param s
     * @param b
     * @param date
     */
    @Override
    public void activateProcessDefinitionByKey(String s, boolean b, Date date) {

    }

    /**
     * @return
     */
    @Override
    public UpdateProcessDefinitionSuspensionStateSelectBuilder updateProcessDefinitionSuspensionState() {
        return null;
    }

    /**
     * @param s
     * @param integer
     */
    @Override
    public void updateProcessDefinitionHistoryTimeToLive(String s, Integer integer) {

    }

    /**
     * @param s
     * @param integer
     */
    @Override
    public void updateDecisionDefinitionHistoryTimeToLive(String s, Integer integer) {

    }

    /**
     * @param s
     * @param integer
     */
    @Override
    public void updateCaseDefinitionHistoryTimeToLive(String s, Integer integer) {

    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getProcessModel(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getProcessDiagram(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public ProcessDefinition getProcessDefinition(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public DiagramLayout getProcessDiagramLayout(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public BpmnModelInstance getBpmnModelInstance(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public CmmnModelInstance getCmmnModelInstance(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public DmnModelInstance getDmnModelInstance(String s) {
        return null;
    }

    /**
     * @param s
     * @param s1
     * @deprecated
     */
    @Override
    public void addCandidateStarterUser(String s, String s1) {

    }

    /**
     * @param s
     * @param s1
     * @deprecated
     */
    @Override
    public void addCandidateStarterGroup(String s, String s1) {

    }

    /**
     * @param s
     * @param s1
     * @deprecated
     */
    @Override
    public void deleteCandidateStarterUser(String s, String s1) {

    }

    /**
     * @param s
     * @param s1
     * @deprecated
     */
    @Override
    public void deleteCandidateStarterGroup(String s, String s1) {

    }

    /**
     * @param s
     * @deprecated
     */
    @Override
    public List<IdentityLink> getIdentityLinksForProcessDefinition(String s) {
        return Collections.emptyList();
    }

    /**
     * @param s
     * @return
     */
    @Override
    public CaseDefinition getCaseDefinition(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getCaseModel(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getCaseDiagram(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public DecisionDefinition getDecisionDefinition(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public DecisionRequirementsDefinition getDecisionRequirementsDefinition(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getDecisionModel(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getDecisionRequirementsModel(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getDecisionDiagram(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public InputStream getDecisionRequirementsDiagram(String s) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public Collection<CalledProcessDefinition> getStaticCalledProcessDefinitions(String s) {
        return Collections.emptyList();
    }
}
