package com.github.instagram4j.Instagram4J.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.instagram4j.Instagram4J.IGClient;

import lombok.Data;

@Data
public class IGResponse {
    private String status;
    private String message;
    private boolean spam;
    private boolean lock;
    private String feedback_title;
    private String feedback_message;
    private String error_type;
    private String checkpoint_url;
    @JsonIgnore
    private IGClient client;
}
