package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.C22162OooO0oo;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22924OooO0o0 implements com.android.billingclient.api.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70064OooO00o;

    public C22924OooO0o0(GoogleBillingDataSource googleBillingDataSource) {
        this.f70064OooO00o = googleBillingDataSource;
    }

    @Override // com.android.billingclient.api.OooO0o
    public final void OooO00o(C22162OooO0oo billingResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("GoogleBillingDataSource");
        c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO00o(billingResult.f66936OooO00o, "onBillingSetupFinished: ", " ", billingResult.f66938OooO0OO), new Object[0]);
        if (billingResult.f66936OooO00o == 0) {
            GoogleBillingDataSource googleBillingDataSource = this.f70064OooO00o;
            googleBillingDataSource.f70019OooO.removeCallbacks(googleBillingDataSource.f70042OooOo0o);
            googleBillingDataSource.f70029OooOO0O.set(googleBillingDataSource.f70030OooOO0o);
            this.f70064OooO00o.OooO(0L);
            return;
        }
        GoogleBillingDataSource googleBillingDataSource2 = this.f70064OooO00o;
        synchronized (googleBillingDataSource2.f70027OooO0oo) {
            C22162OooO0oo.OooO00o OooO00o2 = C22162OooO0oo.OooO00o();
            OooO00o2.f66939OooO00o = billingResult.f66936OooO00o;
            OooO00o2.f66941OooO0OO = billingResult.f66938OooO0OO;
            googleBillingDataSource2.f70027OooO0oo = OooO00o2.OooO00o();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        GoogleBillingDataSource.OooO0OO(this.f70064OooO00o);
    }

    @Override // com.android.billingclient.api.OooO0o
    public final void OooO0O0() {
        GoogleBillingDataSource googleBillingDataSource = this.f70064OooO00o;
        synchronized (googleBillingDataSource.f70027OooO0oo) {
            C22162OooO0oo.OooO00o OooO00o2 = C22162OooO0oo.OooO00o();
            OooO00o2.f66939OooO00o = -1;
            OooO00o2.f66941OooO0OO = "Connection to the Google Play Store service via the BillingClient has been severed.";
            googleBillingDataSource.f70027OooO0oo = OooO00o2.OooO00o();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        GoogleBillingDataSource.OooO0OO(this.f70064OooO00o);
    }
}
