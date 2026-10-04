package com.google.firebase.analytics.ktxtesting;

import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/analytics/FirebaseAnalytics;", "analytics", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "block", "withAnalyticsForTest", "(Lcom/google/firebase/analytics/FirebaseAnalytics;LoO0O000o/OooO00o;)V", "java.com.google.android.gmscore.integ.client.measurement_api_measurement_api"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TestingKt {
    public static final void withAnalyticsForTest(FirebaseAnalytics analytics, OooO00o<C32460OooOooO> block) {
        OooOOO0.OooO0oO(analytics, "analytics");
        OooOOO0.OooO0oO(block, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics2 = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(analytics);
            try {
                block.invoke();
                AnalyticsKt.setANALYTICS(analytics2);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                AnalyticsKt.setANALYTICS(analytics2);
                throw th;
            }
        }
    }
}
