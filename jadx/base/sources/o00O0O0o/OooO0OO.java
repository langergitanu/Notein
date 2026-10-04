package o00O0O0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO0OO f84231OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f84233OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f84234OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f84235OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f84237OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public EnumC24838OooOO0o f84232OooO00o = EnumC24838OooOO0o.f84258OooOo0o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f84236OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f84238OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C24834OooO0Oo f84239OooO0oo = new C24834OooO0Oo();

    static {
        EnumC24838OooOO0o enumC24838OooOO0o = EnumC24838OooOO0o.f84258OooOo0o;
        C24834OooO0Oo c24834OooO0Oo = new C24834OooO0Oo();
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f84232OooO00o = enumC24838OooOO0o;
        oooO0OO.f84236OooO0o = -1L;
        oooO0OO.f84238OooO0oO = -1L;
        new C24834OooO0Oo();
        oooO0OO.f84233OooO0O0 = false;
        oooO0OO.f84234OooO0OO = false;
        oooO0OO.f84232OooO00o = enumC24838OooOO0o;
        oooO0OO.f84235OooO0Oo = false;
        oooO0OO.f84237OooO0o0 = false;
        oooO0OO.f84239OooO0oo = c24834OooO0Oo;
        oooO0OO.f84236OooO0o = -1L;
        oooO0OO.f84238OooO0oO = -1L;
        f84231OooO = oooO0OO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0OO.class != obj.getClass()) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        if (this.f84233OooO0O0 == oooO0OO.f84233OooO0O0 && this.f84234OooO0OO == oooO0OO.f84234OooO0OO && this.f84235OooO0Oo == oooO0OO.f84235OooO0Oo && this.f84237OooO0o0 == oooO0OO.f84237OooO0o0 && this.f84236OooO0o == oooO0OO.f84236OooO0o && this.f84238OooO0oO == oooO0OO.f84238OooO0oO && this.f84232OooO00o == oooO0OO.f84232OooO00o) {
            return this.f84239OooO0oo.equals(oooO0OO.f84239OooO0oo);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f84232OooO00o.hashCode() * 31) + (this.f84233OooO0O0 ? 1 : 0)) * 31) + (this.f84234OooO0OO ? 1 : 0)) * 31) + (this.f84235OooO0Oo ? 1 : 0)) * 31) + (this.f84237OooO0o0 ? 1 : 0)) * 31;
        long j = this.f84236OooO0o;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f84238OooO0oO;
        return this.f84239OooO0oo.f84240OooO00o.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
