package com.privateBanking.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
@Schema(description = "test")
public class example {
    @Schema(description = "Bank ID", example = "5")
    @JsonProperty("id")
    private int id;

    @Schema(description = "Minimal Deposit, in millions", example = "10")
    @JsonProperty("minimal_deposit")
    private int deposit;

    @Schema(description = "Net Worth, in millions", example = "3100")
    @JsonProperty("net_worth")
    private int worth;

    @Schema(description = "description", example = "This Bank is the most...")
    @JsonProperty("description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
