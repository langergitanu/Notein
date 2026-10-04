package o0oOoOo;

/* JADX INFO: renamed from: o0oOoOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31040OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110822OooO0O0;

    public C31040OooOO0o(int i, boolean z) {
        this.f110821OooO00o = i;
        this.f110822OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31040OooOO0o)) {
            return false;
        }
        C31040OooOO0o c31040OooOO0o = (C31040OooOO0o) obj;
        return this.f110821OooO00o == c31040OooOO0o.f110821OooO00o && this.f110822OooO0O0 == c31040OooOO0o.f110822OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110822OooO0O0) + (Integer.hashCode(this.f110821OooO00o) * 31);
    }

    public final String toString() {
        return "FolderColorVO(color=" + this.f110821OooO00o + ", isSelected=" + this.f110822OooO0O0 + ")";
    }
}
