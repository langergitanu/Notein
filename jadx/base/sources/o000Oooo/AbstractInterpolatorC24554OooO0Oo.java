package o000Oooo;

import OooOoO.C20509OooO0oo;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: o000Oooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractInterpolatorC24554OooO0Oo implements Interpolator {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float[] f83133OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f83134OooO0O0;

    public AbstractInterpolatorC24554OooO0Oo(float[] fArr) {
        this.f83133OooO00o = fArr;
        this.f83134OooO0O0 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f83133OooO00o;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f83134OooO0O0;
        float fOooO0O0 = C20509OooO0oo.OooO0O0(iMin, f2, f, f2);
        float f3 = fArr[iMin];
        return OooOO0.OooO0OO.OooO0O0(fArr[iMin + 1], f3, fOooO0O0, f3);
    }
}
