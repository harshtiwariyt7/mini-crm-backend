package com.minicrm.Mini_crm.entity;

public class CrmEnums {
    public enum Role { SALES_REP, ACCOUNT_MANAGER, SUPPORT_AGENT, ADMIN }
    public enum LeadStatus { NEW, CONTACTED, QUALIFIED, UNQUALIFIED, CONVERTED }
    public enum OpportunityStage { PROSPECTING, QUALIFICATION, PROPOSAL, NEGOTIATION, CLOSED_WON, CLOSED_LOST }
    public enum Priority { LOW, MEDIUM, HIGH, URGENT }
    public enum TicketStatus { OPEN, IN_PROGRESS, WAITING_ON_CUSTOMER, RESOLVED, CLOSED }
    public enum ActivityType { CALL, MEETING, EMAIL, TASK, NOTE }
    public enum ActivityStatus { PENDING, COMPLETED, CANCELLED }
}