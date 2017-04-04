package com.example.ericksson.tallerandroid.retrofit.model;
//Created by ericksson on 04-04-17.


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChampionInfo {
    @SerializedName("rankedPlayEnabled")
    @Expose
    private Boolean rankedPlayEnabled;
    @SerializedName("botEnabled")
    @Expose
    private Boolean botEnabled;
    @SerializedName("botMmEnabled")
    @Expose
    private Boolean botMmEnabled;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("freeToPlay")
    @Expose
    private Boolean freeToPlay;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Boolean getRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(Boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }

    public Boolean getBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(Boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public Boolean getBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(Boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(Boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
