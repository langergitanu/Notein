package o00O0OOo;

/* JADX INFO: renamed from: o00O0OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24853OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f84400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f84401OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f84402OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f84403OooO0Oo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24853OooO0O0)) {
            return false;
        }
        C24853OooO0O0 c24853OooO0O0 = (C24853OooO0O0) obj;
        return this.f84400OooO00o == c24853OooO0O0.f84400OooO00o && this.f84401OooO0O0 == c24853OooO0O0.f84401OooO0O0 && this.f84402OooO0OO == c24853OooO0O0.f84402OooO0OO && this.f84403OooO0Oo == c24853OooO0O0.f84403OooO0Oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.f84401OooO0O0;
        ?? r1 = this.f84400OooO00o;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.f84402OooO0OO) {
            i2 = i + 256;
        }
        return this.f84403OooO0Oo ? i2 + 4096 : i2;
    }

    public final String toString() {
        return "[ Connected=" + this.f84400OooO00o + " Validated=" + this.f84401OooO0O0 + " Metered=" + this.f84402OooO0OO + " NotRoaming=" + this.f84403OooO0Oo + " ]";
    }
}
