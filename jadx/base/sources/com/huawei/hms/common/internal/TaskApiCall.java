package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {
    private static final String TAG = "TaskApiCall";
    private int apiLevel;
    private final String mRequestJson;
    private final String mUri;
    private Parcelable parcelable;
    private OooO00o token;
    private String transactionId;

    @Deprecated
    public TaskApiCall(String str, String str2) {
        this.apiLevel = 1;
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = null;
    }

    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<ResultT> c25834OooO0oO);

    public int getApiLevel() {
        return this.apiLevel;
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public String getRequestJson() {
        return this.mRequestJson;
    }

    public OooO00o getToken() {
        return null;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getUri() {
        return this.mUri;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, C25834OooO0oO<ResultT> c25834OooO0oO) {
        HMSLog.m80174i(TAG, "doExecute, uri:" + this.mUri + ", errorCode:" + responseErrorCode.getErrorCode() + ", transactionId:" + this.transactionId);
        doExecute(clientt, responseErrorCode, str, c25834OooO0oO);
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setParcelable(Parcelable parcelable) {
        this.parcelable = parcelable;
    }

    public void setToken(OooO00o oooO00o) {
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.apiLevel = 1;
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = str3;
        this.apiLevel = i;
    }
}
