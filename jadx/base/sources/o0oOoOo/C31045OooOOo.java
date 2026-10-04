package o0oOoOo;

/* JADX INFO: renamed from: o0oOoOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31045OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110844OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110845OooO0O0;

    public C31045OooOOo(int i, boolean z) {
        this.f110844OooO00o = i;
        this.f110845OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31045OooOOo)) {
            return false;
        }
        C31045OooOOo c31045OooOOo = (C31045OooOOo) obj;
        return this.f110844OooO00o == c31045OooOOo.f110844OooO00o && this.f110845OooO0O0 == c31045OooOOo.f110845OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110845OooO0O0) + (Integer.hashCode(this.f110844OooO00o) * 31);
    }

    public final String toString() {
        return "LaserDisappearVO(duration=" + this.f110844OooO00o + ", isSelected=" + this.f110845OooO0O0 + ")";
    }
}
