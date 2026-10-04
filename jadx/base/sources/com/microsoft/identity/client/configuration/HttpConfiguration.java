package com.microsoft.identity.client.configuration;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.embedded.C18115b5;

/* JADX INFO: loaded from: classes9.dex */
public class HttpConfiguration {

    @SerializedName(C18115b5.CONNECT_TIMEOUT)
    private int mConnectTimeout;

    @SerializedName(C18115b5.READ_TIMEOUT)
    private int mReadTimeout;

    public int getConnectTimeout() {
        return this.mConnectTimeout;
    }

    public int getReadTimeout() {
        return this.mReadTimeout;
    }

    public void setConnectTimeout(int i) {
        this.mConnectTimeout = i;
    }

    public void setReadTimeout(int i) {
        this.mReadTimeout = i;
    }
}
