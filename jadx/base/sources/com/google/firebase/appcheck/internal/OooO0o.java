package com.google.firebase.appcheck.internal;

import com.google.android.gms.tasks.OnFailureListener;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO0o implements OnFailureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67895OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f67896OooO0O0;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f67895OooO00o = i;
        this.f67896OooO0O0 = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception it) {
        switch (this.f67895OooO00o) {
            case 0:
                ((DefaultTokenRefresher) this.f67896OooO0O0).lambda$onRefresh$0(it);
                break;
            default:
                OooOOO0.OooO0oO(it, "it");
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                c20358OooO00o.OooO0Oo(it, "checkPendingResultTask: failed", new Object[0]);
                ((FirebaseUserLoginFragment) this.f67896OooO0O0).Oooo0o(1003);
                break;
        }
    }
}
