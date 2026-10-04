package o0oOoOo;

/* JADX INFO: renamed from: o0oOoOo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31086Oooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f110944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110945OooO0O0;

    public C31086Oooooo(float f, boolean z) {
        this.f110944OooO00o = f;
        this.f110945OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31086Oooooo)) {
            return false;
        }
        C31086Oooooo c31086Oooooo = (C31086Oooooo) obj;
        return Float.compare(this.f110944OooO00o, c31086Oooooo.f110944OooO00o) == 0 && this.f110945OooO0O0 == c31086Oooooo.f110945OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110945OooO0O0) + (Float.hashCode(this.f110944OooO00o) * 31);
    }

    public final String toString() {
        return "TextLineHeightVO(scaleFactor=" + this.f110944OooO00o + ", isSelected=" + this.f110945OooO0O0 + ")";
    }
}
