package oO0O0ooo;

/* JADX INFO: renamed from: oO0O0ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32850OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC32849OooOO0O f117914OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f117915OooO0O0;

    public C32850OooOO0o(EnumC32849OooOO0O enumC32849OooOO0O) {
        this.f117914OooO00o = enumC32849OooOO0O;
        this.f117915OooO0O0 = false;
    }

    public static C32850OooOO0o OooO00o(C32850OooOO0o c32850OooOO0o, EnumC32849OooOO0O qualifier, boolean z, int i) {
        if ((i & 1) != 0) {
            qualifier = c32850OooOO0o.f117914OooO00o;
        }
        if ((i & 2) != 0) {
            z = c32850OooOO0o.f117915OooO0O0;
        }
        c32850OooOO0o.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(qualifier, "qualifier");
        return new C32850OooOO0o(qualifier, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32850OooOO0o)) {
            return false;
        }
        C32850OooOO0o c32850OooOO0o = (C32850OooOO0o) obj;
        return this.f117914OooO00o == c32850OooOO0o.f117914OooO00o && this.f117915OooO0O0 == c32850OooOO0o.f117915OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f117914OooO00o.hashCode() * 31;
        boolean z = this.f117915OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f117914OooO00o + ", isForWarningOnly=" + this.f117915OooO0O0 + ')';
    }

    public C32850OooOO0o(EnumC32849OooOO0O enumC32849OooOO0O, boolean z) {
        this.f117914OooO00o = enumC32849OooOO0O;
        this.f117915OooO0O0 = z;
    }
}
