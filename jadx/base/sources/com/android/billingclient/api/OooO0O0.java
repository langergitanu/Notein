package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0O0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile OooOO0 f66889OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f66890OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile OooOOO0 f66891OooO0OO;

        public /* synthetic */ OooO00o(Context context) {
            this.f66890OooO0O0 = context;
        }

        public final C22159OooO0Oo OooO00o() {
            Context context = this.f66890OooO0O0;
            if (this.f66891OooO0OO == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f66889OooO00o == null) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            this.f66889OooO00o.getClass();
            if (this.f66891OooO0OO == null) {
                OooOO0 oooOO02 = this.f66889OooO00o;
                return OooO0O0() ? new C22184Oooo0o(oooOO02, context, this) : new C22159OooO0Oo(oooOO02, context, this);
            }
            OooOO0 oooOO03 = this.f66889OooO00o;
            OooOOO0 oooOOO0 = this.f66891OooO0OO;
            return OooO0O0() ? new C22184Oooo0o(oooOO03, context, oooOOO0, this) : new C22159OooO0Oo(oooOO03, context, oooOOO0, this);
        }

        public final boolean OooO0O0() {
            try {
                Context context = this.f66890OooO0O0;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }
    }
}
