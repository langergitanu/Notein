package com.huawei.hms.network.inner.api;

import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;

/* JADX INFO: loaded from: classes9.dex */
public abstract class RequestContext {
    public abstract Request request();

    public abstract RequestFinishedInfo requestFinishedInfo();

    public abstract Response<ResponseBody> response();

    public abstract Throwable throwable();
}
