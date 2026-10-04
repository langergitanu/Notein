package com.google.android.material.search;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.android.material.search.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22480OooOOo0 implements OnApplyWindowInsetsListener, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67733OooOo0o;

    public /* synthetic */ C22480OooOOo0(Object obj) {
        this.f67733OooOo0o = obj;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((AnalyticsDeferredProxy) this.f67733OooOo0o).lambda$init$2(provider);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return ((SearchView) this.f67733OooOo0o).lambda$setUpStatusBarSpacerInsetListener$5(view, windowInsetsCompat);
    }
}
