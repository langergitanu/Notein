package o00o0O;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00o0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25305OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f86121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Float[] f86122OooO0O0;

    public C25305OooO0OO(int i) {
        this.f86121OooO00o = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.f86122OooO0O0 = fArr;
    }

    public final float OooO00o(C25305OooO0OO a) {
        OooOOO0.OooO0oO(a, "a");
        float fFloatValue = 0.0f;
        for (int i = 0; i < this.f86121OooO00o; i++) {
            fFloatValue += a.f86122OooO0O0[i].floatValue() * this.f86122OooO0O0[i].floatValue();
        }
        return fFloatValue;
    }
}
