package com.mft.interhip8.dto;

import java.util.Date;
public class ClientDetailsDTO {
    private Long clientId;
    private String clientUserName;
    private String clientName;
    private String clientSurname;
    private String clientCompany;
    private String clientLEI;
    private String clientEmail;
    private String clientPhone;
    private boolean clientDemoFlag;
    private String clientStatus;
    private Date clientDateCreated;
    private Date clientDateUpdated;
    private String clientUserCreated;
    private String clientUserUpdated;

    // Constructors, getters, and setters

    public ClientDetailsDTO() {
    }

    public ClientDetailsDTO(Long clientId, String clientUserName, String clientName, String clientSurname, String clientCompany,
                            String clientLEI, String clientEmail, String clientPhone, boolean clientDemoFlag, String clientStatus,
                            Date clientDateCreated, Date clientDateUpdated, String clientUserCreated, String clientUserUpdated) {
        this.clientId = clientId;
        this.clientUserName = clientUserName;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientCompany = clientCompany;
        this.clientLEI = clientLEI;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
        this.clientDemoFlag = clientDemoFlag;
        this.clientStatus = clientStatus;
        this.clientDateCreated = clientDateCreated;
        this.clientDateUpdated = clientDateUpdated;
        this.clientUserCreated = clientUserCreated;
        this.clientUserUpdated = clientUserUpdated;
    }

    // Getters and setters for the fields

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientCompany() {
        return clientCompany;
    }

    public void setClientCompany(String clientCompany) {
        this.clientCompany = clientCompany;
    }

    public String getClientLEI() {
        return clientLEI;
    }

    public void setClientLEI(String clientLEI) {
        this.clientLEI = clientLEI;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public boolean isClientDemoFlag() {
        return clientDemoFlag;
    }

    public void setClientDemoFlag(boolean clientDemoFlag) {
        this.clientDemoFlag = clientDemoFlag;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public Date getClientDateCreated() {
        return clientDateCreated;
    }

    public void setClientDateCreated(Date clientDateCreated) {
        this.clientDateCreated = clientDateCreated;
    }

    public Date getClientDateUpdated() {
        return clientDateUpdated;
    }

    public void setClientDateUpdated(Date clientDateUpdated) {
        this.clientDateUpdated = clientDateUpdated;
    }

    public String getClientUserCreated() {
        return clientUserCreated;
    }

    public void setClientUserCreated(String clientUserCreated) {
        this.clientUserCreated = clientUserCreated;
    }

    public String getClientUserUpdated() {
        return clientUserUpdated;
    }

    public void setClientUserUpdated(String clientUserUpdated) {
        this.clientUserUpdated = clientUserUpdated;
    }
}
