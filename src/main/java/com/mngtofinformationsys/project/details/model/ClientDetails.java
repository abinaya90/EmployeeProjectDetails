package com.mngtofinformationsys.project.details.model;

import javax.persistence.*;

@Entity
@Table(name= "client_dtls")
public class ClientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;
    private String clientName;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private ProjectDetails projectDetails;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "ClientDetails{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", projectDetails=" + projectDetails +
                '}';
    }
}
