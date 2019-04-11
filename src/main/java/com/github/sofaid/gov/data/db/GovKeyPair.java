package com.github.sofaid.gov.data.db;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "gov_key_pairs")
public class GovKeyPair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dbId;

    // Citizen identifier
    private String bsn;

    // Key pairs generated by the gov for the citizen
    private String govMasterPrivateKey;
    private String govMasterPublicKey;

    // Active key index: how many times user enrolled
    private int activeKeyIndex;

    // Every new enrollment, key pairs are created so track if the current key pair is the active one
    private boolean active;

    // Timestamps
    private Long createdTs;
    private Long updatedTs;
}