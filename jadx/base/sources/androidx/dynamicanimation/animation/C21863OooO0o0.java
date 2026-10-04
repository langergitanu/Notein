package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.OooO00o;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.dynamicanimation.animation.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21863OooO0o0 extends OooO0O0<C21863OooO0o0> {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0o f64700OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f64701OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f64702OooOo00;

    public final void OooO0OO(float f) {
        if (this.f64678OooO0o) {
            this.f64702OooOo00 = f;
            return;
        }
        if (this.f64700OooOOoo == null) {
            this.f64700OooOOoo = new OooO0o(f);
        }
        OooO0o oooO0o = this.f64700OooOOoo;
        double d = f;
        oooO0o.f64690OooO = d;
        double d2 = (float) d;
        if (d2 > this.f64680OooO0oO) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < this.f64681OooO0oo) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f64682OooOO0 * 0.75f);
        oooO0o.f64694OooO0Oo = dAbs;
        oooO0o.f64696OooO0o0 = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f64678OooO0o;
        if (z || z) {
            return;
        }
        this.f64678OooO0o = true;
        if (!this.f64676OooO0OO) {
            this.f64675OooO0O0 = this.f64679OooO0o0.getValue(this.f64677OooO0Oo);
        }
        float f2 = this.f64675OooO0O0;
        if (f2 > this.f64680OooO0oO || f2 < this.f64681OooO0oo) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal<OooO00o> threadLocal = OooO00o.f64656OooO0o;
        if (threadLocal.get() == null) {
            threadLocal.set(new OooO00o());
        }
        OooO00o oooO00o = threadLocal.get();
        ArrayList<OooO00o.OooO0O0> arrayList = oooO00o.f64658OooO0O0;
        if (arrayList.size() == 0) {
            if (oooO00o.f64660OooO0Oo == null) {
                oooO00o.f64660OooO0Oo = new OooO00o.C21853OooO0Oo(oooO00o.f64659OooO0OO);
            }
            OooO00o.C21853OooO0Oo c21853OooO0Oo = oooO00o.f64660OooO0Oo;
            c21853OooO0Oo.f64664OooO0O0.postFrameCallback(c21853OooO0Oo.f64665OooO0OO);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void OooO0Oo() {
        if (this.f64700OooOOoo.f64692OooO0O0 <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f64678OooO0o) {
            this.f64701OooOo0 = true;
        }
    }
}
