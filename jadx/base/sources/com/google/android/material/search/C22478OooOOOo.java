package com.google.android.material.search;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import java.util.List;
import o0o0O00.C30191OooO0oO;
import o0o0O00.C30191OooO0oO.OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: com.google.android.material.search.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22478OooOOOo implements ViewUtils.OnApplyWindowInsetsListener, AnalyticsEventLogger, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67730OooOo0o;

    public /* synthetic */ C22478OooOOOo(Object obj) {
        this.f67730OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        List uris = (List) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(uris, "uris");
        C30191OooO0oO c30191OooO0oO = (C30191OooO0oO) this.f67730OooOo0o;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(c30191OooO0oO.OooOOO()), null, null, c30191OooO0oO.new OooO0O0(uris, null), 3);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        ((AnalyticsDeferredProxy) this.f67730OooOo0o).lambda$getAnalyticsEventLogger$1(str, bundle);
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f67730OooOo0o).lambda$setUpToolbarInsetListener$4(view, windowInsetsCompat, relativePadding);
    }
}
