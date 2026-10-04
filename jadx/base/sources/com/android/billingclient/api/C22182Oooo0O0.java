package com.android.billingclient.api;

import androidx.core.util.Consumer;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcs;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.android.billingclient.api.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22182Oooo0O0 implements zzcs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Consumer f67046OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Runnable f67047OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C22184Oooo0o f67048OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f67049OooO0Oo;

    public C22182Oooo0O0(C22184Oooo0o c22184Oooo0o, int i, Consumer consumer, Runnable runnable) {
        this.f67049OooO0Oo = i;
        this.f67046OooO00o = consumer;
        this.f67047OooO0O0 = runnable;
        Objects.requireNonNull(c22184Oooo0o);
        this.f67048OooO0OO = c22184Oooo0o;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zza(Throwable th) {
        boolean z = th instanceof TimeoutException;
        C22184Oooo0o c22184Oooo0o = this.f67048OooO0OO;
        if (z) {
            c22184Oooo0o.Oooo00O(28, C22179Oooo.f67035OooOOo, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            c22184Oooo0o.Oooo00O(28, C22179Oooo.f67035OooOOo, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        this.f67047OooO0O0.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            this.f67047OooO0O0.run();
            return;
        }
        int iIntValue = num.intValue();
        C22184Oooo0o c22184Oooo0o = this.f67048OooO0OO;
        c22184Oooo0o.getClass();
        C22162OooO0oo c22162OooO0ooOooO00o = C22179Oooo.OooO00o(iIntValue, "Billing override value was set by a license tester.");
        c22184Oooo0o.Oooo00O(this.f67049OooO0Oo, c22162OooO0ooOooO00o, zzie.LICENSE_TESTER_BILLING_OVERRIDE);
        this.f67046OooO00o.accept(c22162OooO0ooOooO00o);
    }
}
