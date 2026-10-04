package com.google.firebase.crashlytics.internal.concurrency;

import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
public /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends C24019OooOO0o implements oO0O000o.OooO00o<Boolean> {
    public CrashlyticsWorkers$Companion$checkNotMainThread$1(Object obj) {
        super(0, obj, CrashlyticsWorkers.Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // oO0O000o.OooO00o
    public final Boolean invoke() {
        return Boolean.valueOf(((CrashlyticsWorkers.Companion) this.receiver).isNotMainThread());
    }
}
