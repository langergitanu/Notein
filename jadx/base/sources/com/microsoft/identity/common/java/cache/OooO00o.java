package com.microsoft.identity.common.java.cache;

import android.widget.TextView;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f69008OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f69009OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f69009OooOo0o = i;
        this.f69008OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69009OooOo0o) {
            case 0:
                ((SharedPreferencesAccountCredentialCacheWithMemoryCache) this.f69008OooOo).lambda$new$0();
                return;
            default:
                TextView textView = ((EditorSummaryFragment) this.f69008OooOo).f75541OooOooo;
                if (textView != null) {
                    textView.setTextIsSelectable(true);
                    return;
                } else {
                    OooOOO0.OooOOOO("summaryText");
                    throw null;
                }
        }
    }
}
