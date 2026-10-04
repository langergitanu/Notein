package o0ooOO0;

import Oooo0oO.C21082o00000oO;
import android.view.View;

/* JADX INFO: renamed from: o0ooOO0.o000OO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC31589o000OO0o implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21082o00000oO f112866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ View f112867OooOo0o;

    public ViewOnAttachStateChangeListenerC31589o000OO0o(View view, C21082o00000oO c21082o00000oO) {
        this.f112867OooOo0o = view;
        this.f112866OooOo = c21082o00000oO;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        this.f112867OooOo0o.removeOnAttachStateChangeListener(this);
        this.f112866OooOo.OooOo0O();
    }
}
