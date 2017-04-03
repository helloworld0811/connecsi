package com.connecsi.metamodel.model;

/**
 * Created by hku on 02.04.17.
 */
public class Channel {

    private ChannelType channelType;

    private Boolean isVideo;

    private Boolean isPicture;

    private Boolean isSocial;

    private Boolean isImplemented;

    public ChannelType getChannelType() {
        return channelType;
    }

    public void setChannelType(ChannelType channelType) {
        this.channelType = channelType;
    }

    public Boolean getVideo() {
        return isVideo;
    }

    public void setVideo(Boolean video) {
        isVideo = video;
    }

    public Boolean getPicture() {
        return isPicture;
    }

    public void setPicture(Boolean picture) {
        isPicture = picture;
    }

    public Boolean getSocial() {
        return isSocial;
    }

    public void setSocial(Boolean social) {
        isSocial = social;
    }

    public Boolean getImplemented() {
        return isImplemented;
    }

    public void setImplemented(Boolean implemented) {
        isImplemented = implemented;
    }
}
