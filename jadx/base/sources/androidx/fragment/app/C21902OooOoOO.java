package androidx.fragment.app;

import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.search.SearchBar;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: androidx.fragment.app.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21902OooOoOO implements InterfaceC21912Oooo0o, AccessibilityManagerCompat.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f64995OooOo0o;

    public /* synthetic */ C21902OooOoOO(Object obj) {
        this.f64995OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        ((InterfaceC32508OooOOOo) this.f64995OooOo0o).invoke(str, bundle);
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.f64995OooOo0o).lambda$new$0(z);
    }
}
