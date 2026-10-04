package o000O0oo;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o000O0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC24419OooO0Oo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ androidx.ink.authoring.internal.OooO00o<Object, o000O0oO.OooO0O0<Object, Object>, Object> f82433OooOo0o;

    public ViewOnAttachStateChangeListenerC24419OooO0Oo(androidx.ink.authoring.internal.OooO00o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO00o) {
        this.f82433OooOo0o = oooO00o;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        androidx.ink.authoring.internal.OooO00o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO00o = this.f82433OooOo0o;
        oooO00o.getClass();
        C24442Oooo00o.OooO00o();
        oooO00o.f65177OooO0OO.addView(oooO00o.f65181OooO0oO, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        androidx.ink.authoring.internal.OooO00o<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO00o = this.f82433OooOo0o;
        oooO00o.f65177OooO0OO.removeView(oooO00o.f65181OooO0oO);
    }
}
