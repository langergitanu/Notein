package androidx.ink.authoring.internal;

import android.view.View;

/* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC21940OooO0o0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> f65260OooOo0o;

    public ViewOnAttachStateChangeListenerC21940OooO0o0(OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0O0) {
        this.f65260OooOo0o = oooO0O0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        this.f65260OooOo0o.OooOOO0();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        OooO0O0<Object, o000O0oO.OooO0O0<Object, Object>, Object> oooO0O0 = this.f65260OooOo0o;
        oooO0O0.f65195OooOOOO.getClass();
        oooO0O0.f65187OooO0o0.release();
        oooO0O0.f65184OooO0OO.removeView(oooO0O0.f65190OooOO0);
    }
}
