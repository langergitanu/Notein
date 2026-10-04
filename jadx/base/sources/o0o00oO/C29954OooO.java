package o0o00oO;

/* JADX INFO: renamed from: o0o00oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29954OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f106400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f106401OooO0O0;

    public C29954OooO(int i, boolean z) {
        this.f106400OooO00o = i;
        this.f106401OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29954OooO)) {
            return false;
        }
        C29954OooO c29954OooO = (C29954OooO) obj;
        return this.f106400OooO00o == c29954OooO.f106400OooO00o && this.f106401OooO0O0 == c29954OooO.f106401OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106401OooO0O0) + (Integer.hashCode(this.f106400OooO00o) * 31);
    }

    public final String toString() {
        return "LanguageVO(nameResId=" + this.f106400OooO00o + ", isSelected=" + this.f106401OooO0O0 + ")";
    }
}
