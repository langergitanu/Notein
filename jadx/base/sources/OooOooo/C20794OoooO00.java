package OooOooo;

import OooOooo.AbstractC20742OooO;

/* JADX INFO: renamed from: OooOooo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20794OoooO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f59716OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f59717OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC20742OooO.C20744OooO0o0 f59718OooO0OO;

    public C20794OoooO00() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20794OoooO00)) {
            return false;
        }
        C20794OoooO00 c20794OoooO00 = (C20794OoooO00) obj;
        return Float.compare(this.f59716OooO00o, c20794OoooO00.f59716OooO00o) == 0 && this.f59717OooO0O0 == c20794OoooO00.f59717OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f59718OooO0OO, c20794OoooO00.f59718OooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f59716OooO00o) * 31;
        boolean z = this.f59717OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        AbstractC20742OooO.C20744OooO0o0 c20744OooO0o0 = this.f59718OooO0OO;
        return i + (c20744OooO0o0 == null ? 0 : c20744OooO0o0.hashCode());
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f59716OooO00o + ", fill=" + this.f59717OooO0O0 + ", crossAxisAlignment=" + this.f59718OooO0OO + ')';
    }

    public C20794OoooO00(int i) {
        this.f59716OooO00o = 0.0f;
        this.f59717OooO0O0 = true;
        this.f59718OooO0OO = null;
    }
}
