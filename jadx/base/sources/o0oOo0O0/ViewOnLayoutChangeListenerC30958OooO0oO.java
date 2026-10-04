package o0oOo0O0;

import android.view.View;

/* JADX INFO: renamed from: o0oOo0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC30958OooO0oO implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30956OooO0o f110631OooOo0o;

    public ViewOnLayoutChangeListenerC30958OooO0oO(C30956OooO0o c30956OooO0o) {
        this.f110631OooOo0o = c30956OooO0o;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.f110631OooOo0o.OooO0OO();
    }
}
