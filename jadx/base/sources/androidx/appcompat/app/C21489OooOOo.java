package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21489OooOOo extends ViewPropertyAnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f62461OooO00o;

    public C21489OooOOo(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f62461OooO00o = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f62461OooO00o;
        appCompatDelegateImpl.f62346OoooO0.setAlpha(1.0f);
        appCompatDelegateImpl.f62349OoooOO0.setListener(null);
        appCompatDelegateImpl.f62349OoooOO0 = null;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f62461OooO00o;
        appCompatDelegateImpl.f62346OoooO0.setVisibility(0);
        if (appCompatDelegateImpl.f62346OoooO0.getParent() instanceof View) {
            ViewCompat.requestApplyInsets((View) appCompatDelegateImpl.f62346OoooO0.getParent());
        }
    }
}
