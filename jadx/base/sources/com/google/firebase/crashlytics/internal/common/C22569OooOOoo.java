package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22569OooOOoo implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return SessionReportingCoordinator.lambda$getSortedCustomAttributes$1((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
    }
}
