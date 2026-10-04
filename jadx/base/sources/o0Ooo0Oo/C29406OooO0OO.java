package o0Ooo0Oo;

/* JADX INFO: renamed from: o0Ooo0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29406OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f104279OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f104280OooO0O0;

    public C29406OooO0OO(int i, boolean z) {
        this.f104279OooO00o = i;
        this.f104280OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29406OooO0OO)) {
            return false;
        }
        C29406OooO0OO c29406OooO0OO = (C29406OooO0OO) obj;
        return this.f104279OooO00o == c29406OooO0OO.f104279OooO00o && this.f104280OooO0O0 == c29406OooO0OO.f104280OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104280OooO0O0) + (Integer.hashCode(this.f104279OooO00o) * 31);
    }

    public final String toString() {
        return "PagePaddingColorVO(color=" + this.f104279OooO00o + ", isSelected=" + this.f104280OooO0O0 + ")";
    }
}
