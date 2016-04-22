/*
 * Copyright (C) 2014 Pivotal Software, Inc. All rights reserved.
 */
package io.pivotal.android.push.sample.model;

import com.google.gson.annotations.SerializedName;

public class PCFPushMessageTarget {

    @SerializedName("devices")
    public String[] devices;

    @SerializedName("tags")
    public String[] tags;

    @SerializedName("custom_user_ids")
    public String[] customUserIds;

    public PCFPushMessageTarget(String[] devices, String[] tags, String[] customUserIds) {
        this.devices = devices;
        this.tags = tags;
        this.customUserIds = customUserIds;
    }
}
