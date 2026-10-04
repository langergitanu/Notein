package o000OO;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: o000OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class InterpolatorC24450OooOOo0 implements Interpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000O00.OooO0OO f82623OooO00o;

    public InterpolatorC24450OooOOo0(o0000O00.OooO0OO oooO0OO) {
        this.f82623OooO00o = oooO0OO;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f82623OooO00o.OooO00o(f);
    }
}
