package com.orion.notein.data.repo.transactions;

import java.util.concurrent.atomic.AtomicLong;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC22939OooOoo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70151OooOo0o;

    public RunnableC22939OooOoo0(GoogleBillingDataSource googleBillingDataSource) {
        this.f70151OooOo0o = googleBillingDataSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objOooO00o;
        GoogleBillingDataSource googleBillingDataSource = this.f70151OooOo0o;
        long j = googleBillingDataSource.f70029OooOO0O.get();
        boolean zOooOOOo = googleBillingDataSource.f70039OooOo0.OooOOOo();
        AtomicLong atomicLong = googleBillingDataSource.f70029OooOO0O;
        if (zOooOOOo) {
            atomicLong.set(googleBillingDataSource.f70030OooOO0o);
            return;
        }
        if (googleBillingDataSource.f70028OooOO0.getAndIncrement() > 66) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0OO("Retry failed -- max retry attempts reached", new Object[0]);
            return;
        }
        long j2 = (long) (j * googleBillingDataSource.f70031OooOOO);
        long j3 = googleBillingDataSource.f70032OooOOO0;
        if (j2 > j3) {
            j2 = j3;
        }
        atomicLong.set(j2);
        try {
            googleBillingDataSource.f70039OooOo0.OooO0o0(googleBillingDataSource.f70041OooOo0O);
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o2.OooO00o("Retry startConnection success", new Object[0]);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o3.OooO0OO("Retry Failed -- Cause: " + thOooO00o.getCause() + " -- Message: " + thOooO00o.getMessage(), new Object[0]);
        }
    }
}
