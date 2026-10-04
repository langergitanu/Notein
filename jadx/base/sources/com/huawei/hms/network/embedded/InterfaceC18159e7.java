package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e7 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18159e7 extends Cloneable {

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e7$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceC18159e7 mo77936a(C18160e8 c18160e8);
    }

    void cancel();

    InterfaceC18159e7 clone();

    void enqueue(InterfaceC18173f7 interfaceC18173f7);

    C18188g8 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C18160e8 request();

    C18248kc timeout();
}
