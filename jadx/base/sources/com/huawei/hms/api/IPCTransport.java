package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.C17756a;
import com.huawei.hms.core.aidl.C17757b;
import com.huawei.hms.core.aidl.C17760e;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.InterfaceC17758c;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: loaded from: classes6.dex */
public class IPCTransport implements DatagramTransport {

    /* JADX INFO: renamed from: a */
    private final String f52464a;

    /* JADX INFO: renamed from: b */
    private final IMessageEntity f52465b;

    /* JADX INFO: renamed from: c */
    private final Class<? extends IMessageEntity> f52466c;

    /* JADX INFO: renamed from: d */
    private int f52467d;

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
        this.f52464a = str;
        this.f52465b = iMessageEntity;
        this.f52466c = cls;
    }

    /* JADX INFO: renamed from: a */
    private int m75798a(ApiClient apiClient, InterfaceC17758c interfaceC17758c) {
        if (!(apiClient instanceof HuaweiApiClientImpl)) {
            if (apiClient instanceof AidlApiClient) {
                AidlApiClient aidlApiClient = (AidlApiClient) apiClient;
                C17757b c17757b = new C17757b(this.f52464a, ProtocolNegotiate.getInstance().getVersion());
                c17757b.m75894a(C17756a.m75890a(c17757b.m75896c()).m75905a(this.f52465b, new Bundle()));
                try {
                    aidlApiClient.getService().mo75897a(c17757b, interfaceC17758c);
                    return 0;
                } catch (Exception e) {
                    HMSLog.m80172e("IPCTransport", "sync call ex:" + e);
                }
            }
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
        C17757b c17757b2 = new C17757b(this.f52464a, ProtocolNegotiate.getInstance().getVersion());
        C17760e c17760eM75890a = C17756a.m75890a(c17757b2.m75896c());
        c17757b2.m75894a(c17760eM75890a.m75905a(this.f52465b, new Bundle()));
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setAppID(apiClient.getAppID());
        requestHeader.setPackageName(apiClient.getPackageName());
        requestHeader.setSdkVersion(60400302);
        requestHeader.setApiNameList(((HuaweiApiClientImpl) apiClient).getApiNameList());
        requestHeader.setSessionId(apiClient.getSessionId());
        requestHeader.setApiLevel(this.f52467d);
        c17757b2.f52536b = c17760eM75890a.m75905a(requestHeader, new Bundle());
        try {
            HuaweiApiClientImpl huaweiApiClientImpl = (HuaweiApiClientImpl) apiClient;
            if (huaweiApiClientImpl.getService() == null) {
                HMSLog.m80172e("IPCTransport", "HuaweiApiClient is not binded to service yet.");
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
            huaweiApiClientImpl.getService().mo75897a(c17757b2, interfaceC17758c);
            return 0;
        } catch (Exception e2) {
            HMSLog.m80172e("IPCTransport", "sync call ex:" + e2);
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.InterfaceC18470a interfaceC18470a) {
        send(apiClient, interfaceC18470a);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.InterfaceC18470a interfaceC18470a) {
        int iM75798a = m75798a(apiClient, new IPCCallback(this.f52466c, interfaceC18470a));
        if (iM75798a != 0) {
            interfaceC18470a.mo80100a(iM75798a, null);
        }
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls, int i) {
        this.f52464a = str;
        this.f52465b = iMessageEntity;
        this.f52466c = cls;
        this.f52467d = i;
    }
}
