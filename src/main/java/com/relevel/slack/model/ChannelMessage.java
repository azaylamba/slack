package com.relevel.slack.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChannelMessage {

    @Id
    private long message_id;
}
