package com.isg.myAppli.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class factureKey implements Serializable {
    private static final long serialVersionUID = 5042918102417575623L;
    private long id_p;
    private long id_fr;
}
