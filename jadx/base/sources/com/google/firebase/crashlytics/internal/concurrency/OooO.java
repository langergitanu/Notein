package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68018OooOo0o;

    public /* synthetic */ OooO(int i) {
        this.f68018OooOo0o = i;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f68018OooOo0o) {
            case 0:
                return CrashlyticsWorkers.Companion.checkBackgroundThread$lambda$2();
            default:
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
