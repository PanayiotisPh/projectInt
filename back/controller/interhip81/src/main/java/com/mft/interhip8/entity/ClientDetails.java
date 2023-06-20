package com.mft.interhip8.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "client_details")

public class ClientDetails {

        @Id
        @Column(nullable = false)
        private Long clientId;

        @Column(nullable = false)
        private String clientUserName;

        @Column(nullable = false)
        private String clientName;

        @Column(nullable = false)
        private String clientSurname;

        @Column(nullable = false)
        private String clientCompany;

        private String clientLEI;

        @Column(nullable = false)
        private String clientEmail;

        private String clientPhone;

        @Column(nullable = false)
        private boolean clientDemoFlag;

        @Column(nullable = false)
        private String clientStatus;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(nullable = false)
        private Date clientDateCreated;

        @Temporal(TemporalType.TIMESTAMP)
        @Column(nullable = false)
        private Date clientDateUpdated;

        @Column(nullable = false)
        private String clientUserCreated;

        @Column(nullable = false)
        private String clientUserUpdated;

        // Constructors, getters, setters, toString, and equals methods remain the same
        // ...
        // Getters and setters
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

        // toString method
        @Override
        public String toString() {
            return "ClientDetails{" +
                    "clientId='" + clientId + '\'' +
                    ", clientUserName='" + clientUserName + '\'' +
                    ", clientName='" + clientName + '\'' +
                    ", clientSurname='" + clientSurname + '\'' +
                    ", clientCompany='" + clientCompany + '\'' +
                    ", clientLEI='" + clientLEI + '\'' +
                    ", clientEmail='" + clientEmail + '\'' +
                    ", clientPhone='" + clientPhone + '\'' +
                    ", clientDemoFlag=" + clientDemoFlag +
                    ", clientStatus='" + clientStatus + '\'' +
                    ", clientDateCreated=" + clientDateCreated +
                    ", clientDateUpdated=" + clientDateUpdated +
                    ", clientUserCreated='" + clientUserCreated + '\'' +
                    ", clientUserUpdated='" + clientUserUpdated + '\'' +
                    '}';
        }

        // equals method
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClientDetails that = (ClientDetails) o;
            return clientId.equals(that.clientId);
        }

}
