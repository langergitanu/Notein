package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.y7 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18429y7 {

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.y7$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C18188g8 mo79643a(C18160e8 c18160e8) throws IOException;

        /* JADX INFO: renamed from: a */
        InterfaceC18229j7 mo79645a();

        /* JADX INFO: renamed from: a */
        a mo79646a(int i, TimeUnit timeUnit);

        /* JADX INFO: renamed from: b */
        int mo79647b();

        /* JADX INFO: renamed from: b */
        a mo79648b(int i, TimeUnit timeUnit);

        /* JADX INFO: renamed from: c */
        int mo79649c();

        /* JADX INFO: renamed from: c */
        a mo79650c(int i, TimeUnit timeUnit);

        InterfaceC18159e7 call();

        /* JADX INFO: renamed from: d */
        int mo79651d();

        C18160e8 request();
    }

    C18188g8 intercept(a aVar) throws IOException;
}
