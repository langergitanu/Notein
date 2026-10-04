package o00ooo;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: o00ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25796OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f87971OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f87972OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f87973OooO0OO;

    public C25796OooO0OO(float f, float f2, long j) {
        this.f87971OooO00o = f;
        this.f87972OooO0O0 = f2;
        this.f87973OooO0OO = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25796OooO0OO)) {
            return false;
        }
        C25796OooO0OO c25796OooO0OO = (C25796OooO0OO) obj;
        return c25796OooO0OO.f87971OooO00o == this.f87971OooO00o && c25796OooO0OO.f87972OooO0O0 == this.f87972OooO0O0 && c25796OooO0OO.f87973OooO0OO == this.f87973OooO0OO;
    }

    public final int hashCode() {
        return Long.hashCode(this.f87973OooO0OO) + C20509OooO0oo.OooO0OO(this.f87972OooO0O0, Float.hashCode(this.f87971OooO00o) * 31, 31);
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f87971OooO00o + ",horizontalScrollPixels=" + this.f87972OooO0O0 + ",uptimeMillis=" + this.f87973OooO0OO + ')';
    }
}
