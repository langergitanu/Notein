package o0oOoOo;

/* JADX INFO: renamed from: o0oOoOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31038OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110814OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110815OooO0O0;

    public C31038OooOO0(int i, boolean z) {
        this.f110814OooO00o = i;
        this.f110815OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31038OooOO0)) {
            return false;
        }
        C31038OooOO0 c31038OooOO0 = (C31038OooOO0) obj;
        return this.f110814OooO00o == c31038OooOO0.f110814OooO00o && this.f110815OooO0O0 == c31038OooOO0.f110815OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110815OooO0O0) + (Integer.hashCode(this.f110814OooO00o) * 31);
    }

    public final String toString() {
        return "FeedbackTypeVO(type=" + this.f110814OooO00o + ", isSelected=" + this.f110815OooO0O0 + ")";
    }
}
