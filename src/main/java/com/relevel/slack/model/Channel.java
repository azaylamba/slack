package com.relevel.slack.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Channel {

    @Id
    private long channel_id;
}
