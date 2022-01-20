package com.hfad.wellbeingtechheartapp;

import java.util.Map;

public class DBHeartRate {

    private Integer heartBeat;
    private Map serverTimestamp;

    public Integer getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(Integer heartBeat) {
        this.heartBeat = heartBeat;
    }

    public Map getServerTimestamp() {
        return serverTimestamp;
    }

    public void setServerTimestamp(Map serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }



    public DBHeartRate(Integer heartBeat, Map serverTimestamp) {
        this.heartBeat = heartBeat;
        this.serverTimestamp = serverTimestamp;
    }






}
