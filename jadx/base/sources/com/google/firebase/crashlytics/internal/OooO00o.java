package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements Deferred.DeferredHandler, TabLayoutMediator.TabConfigurationStrategy {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67977OooOo0o;

    public /* synthetic */ OooO00o(Object obj) {
        this.f67977OooOo0o = obj;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((CrashlyticsNativeComponentDeferredProxy) this.f67977OooOo0o).lambda$new$0(provider);
    }

    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
    public void onConfigureTab(TabLayout.Tab tab, int i) {
        OooOOO0.OooO0oO(tab, "tab");
        Context context = (Context) this.f67977OooOo0o;
        if (i == 0) {
            tab.setIcon(context.getDrawable(R.drawable.ic_ni_note));
            tab.setText(context.getString(R.string.label_ai_note_summary));
        } else if (i != 1) {
            tab.setText("unknown tab");
        } else {
            tab.setIcon(context.getDrawable(R.drawable.ic_ni_ai_chat));
            tab.setText(context.getString(R.string.label_ai_note_chat));
        }
    }
}
