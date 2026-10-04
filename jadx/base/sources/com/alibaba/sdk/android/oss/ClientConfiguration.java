package com.alibaba.sdk.android.oss;

import com.huawei.cloud.base.http.HttpRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private String ipWithHeader;
    private String mUserAgentMark;
    private String proxyHost;
    private int proxyPort;
    private int maxConcurrentRequest = 5;
    private int socketTimeout = 60000;
    private int connectionTimeout = 60000;
    private long max_log_size = HttpRequest.DEFAULT_PROGRESS_STEP_SIZE;
    private int maxErrorRetry = 2;
    private List<String> customCnameExcludeList = new ArrayList();
    private boolean httpDnsEnable = false;
    private boolean checkCRC64 = false;
    private boolean pathStyleAccessEnable = false;
    private boolean customPathPrefixEnable = false;
    private boolean followRedirectsEnable = false;
    private OkHttpClient okHttpClient = null;

    public static ClientConfiguration getDefaultConf() {
        return new ClientConfiguration();
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public List<String> getCustomCnameExcludeList() {
        return Collections.unmodifiableList(this.customCnameExcludeList);
    }

    public String getCustomUserMark() {
        return this.mUserAgentMark;
    }

    public String getIpWithHeader() {
        return this.ipWithHeader;
    }

    public int getMaxConcurrentRequest() {
        return this.maxConcurrentRequest;
    }

    public int getMaxErrorRetry() {
        return this.maxErrorRetry;
    }

    public long getMaxLogSize() {
        return this.max_log_size;
    }

    public OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public String getProxyHost() {
        return this.proxyHost;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public boolean isCheckCRC64() {
        return this.checkCRC64;
    }

    public boolean isCustomPathPrefixEnable() {
        return this.customPathPrefixEnable;
    }

    public boolean isFollowRedirectsEnable() {
        return this.followRedirectsEnable;
    }

    public boolean isHttpDnsEnable() {
        return this.httpDnsEnable;
    }

    public boolean isPathStyleAccessEnable() {
        return this.pathStyleAccessEnable;
    }

    public void setCheckCRC64(boolean z) {
        this.checkCRC64 = z;
    }

    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    public void setCustomCnameExcludeList(List<String> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("cname exclude list should not be null.");
        }
        this.customCnameExcludeList.clear();
        for (String str : list) {
            if (str.contains("://")) {
                this.customCnameExcludeList.add(str.substring(str.indexOf("://") + 3));
            } else {
                this.customCnameExcludeList.add(str);
            }
        }
    }

    public void setCustomPathPrefixEnable(boolean z) {
        this.customPathPrefixEnable = z;
    }

    public void setFollowRedirectsEnable(boolean z) {
        this.followRedirectsEnable = z;
    }

    public void setHttpDnsEnable(boolean z) {
        this.httpDnsEnable = z;
    }

    public void setIpWithHeader(String str) {
        this.ipWithHeader = str;
    }

    public void setMaxConcurrentRequest(int i) {
        this.maxConcurrentRequest = i;
    }

    public void setMaxErrorRetry(int i) {
        this.maxErrorRetry = i;
    }

    public void setMaxLogSize(long j) {
        this.max_log_size = j;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public void setPathStyleAccessEnable(boolean z) {
        this.pathStyleAccessEnable = z;
    }

    public void setProxyHost(String str) {
        this.proxyHost = str;
    }

    public void setProxyPort(int i) {
        this.proxyPort = i;
    }

    public void setSocketTimeout(int i) {
        this.socketTimeout = i;
    }

    public void setUserAgentMark(String str) {
        this.mUserAgentMark = str;
    }
}
