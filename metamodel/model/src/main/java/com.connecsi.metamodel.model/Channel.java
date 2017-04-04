package com.connecsi.metamodel.model;

import java.util.Map;

/**
 * Created by hku on 02.04.17.
 */
public class Channel {

    private ChannelType channelType;

    private Boolean isVideo;

    private Boolean isPicture;

    private Boolean isSocial;

    private Boolean isImplemented;

    private String country;

    private String title;

    private String publishedTime;

    private String description;

    private String imageUrl;

    private String titleLocal;

    private String descriptionLocal;

    private Map<Long, PerformanceMetrics> timestampToPerformanceMetricsMap;


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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitleLocal() {
        return titleLocal;
    }

    public void setTitleLocal(String titleLocal) {
        this.titleLocal = titleLocal;
    }

    public String getDescriptionLocal() {
        return descriptionLocal;
    }

    public void setDescriptionLocal(String descriptionLocal) {
        this.descriptionLocal = descriptionLocal;
    }

    public Map<Long, PerformanceMetrics> getTimestampToPerformanceMetricsMap() {
        return timestampToPerformanceMetricsMap;
    }

    public void setTimestampToPerformanceMetricsMap(Map<Long, PerformanceMetrics> timestampToPerformanceMetricsMap) {
        this.timestampToPerformanceMetricsMap = timestampToPerformanceMetricsMap;
    }
}
