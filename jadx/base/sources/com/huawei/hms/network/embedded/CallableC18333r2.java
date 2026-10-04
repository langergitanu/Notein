package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r2 */
/* JADX INFO: loaded from: classes9.dex */
public class CallableC18333r2 implements Callable<C18385v2> {

    /* JADX INFO: renamed from: c */
    public static final String f55995c = "DnsCallable";

    /* JADX INFO: renamed from: a */
    public final String f55996a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f55997b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.r2$a */
    public static class a implements Callable<C18385v2> {

        /* JADX INFO: renamed from: a */
        public final String f55998a;

        public a(String str) {
            this.f55998a = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public C18385v2 call() {
            return InterfaceC18320q2.f55928d.lookup(this.f55998a);
        }
    }

    public CallableC18333r2(String str, ExecutorService executorService) {
        this.f55996a = str;
        this.f55997b = executorService;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public C18385v2 call() {
        if (C18126c2.m78048j().m78079h()) {
            try {
                C18385v2 c18385v2 = (C18385v2) this.f55997b.submit(new a(this.f55996a)).get(1000L, TimeUnit.MILLISECONDS);
                if (!c18385v2.m79691i()) {
                    return c18385v2;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Logger.m76968w(f55995c, this.f55996a + "httpDns query failed", e);
            }
        }
        C18126c2.m78048j().m78058a(this.f55996a, 2);
        return InterfaceC18320q2.f55926b.lookup(this.f55996a);
    }
}
