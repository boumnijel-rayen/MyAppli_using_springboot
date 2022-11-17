package com.isg.myAppli.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class commandeKey implements Serializable {
    private static final long serialVersionUID = -270318519857743333L;
    private long id_p;
    private long id_fr;
}
