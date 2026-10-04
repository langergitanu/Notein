package com.huawei.hms.support.api.transport;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;

/* JADX INFO: loaded from: classes9.dex */
public interface DatagramTransport {

    /* JADX INFO: renamed from: com.huawei.hms.support.api.transport.DatagramTransport$a */
    public interface InterfaceC18470a {
        /* JADX INFO: renamed from: a */
        void mo80100a(int i, IMessageEntity iMessageEntity);
    }

    void post(ApiClient apiClient, InterfaceC18470a interfaceC18470a);

    void send(ApiClient apiClient, InterfaceC18470a interfaceC18470a);
}
