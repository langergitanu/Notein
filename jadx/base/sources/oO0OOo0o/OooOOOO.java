package oO0OOo0o;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f119560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0 f119561OooO0O0;

    public OooOOOO(OooOOO oooOOO, o00Oo0 o00oo02) {
        this.f119560OooO00o = (OooOOO) Preconditions.checkNotNull(oooOOO, "state is null");
        this.f119561OooO0O0 = (o00Oo0) Preconditions.checkNotNull(o00oo02, "status is null");
    }

    public static OooOOOO OooO00o(OooOOO oooOOO) {
        Preconditions.checkArgument(oooOOO != OooOOO.f119555OooOoO0, "state is TRANSIENT_ERROR. Use forError() instead");
        return new OooOOOO(oooOOO, o00Oo0.f119717OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return this.f119560OooO00o.equals(oooOOOO.f119560OooO00o) && this.f119561OooO0O0.equals(oooOOOO.f119561OooO0O0);
    }

    public final int hashCode() {
        return this.f119560OooO00o.hashCode() ^ this.f119561OooO0O0.hashCode();
    }

    public final String toString() {
        o00Oo0 o00oo02 = this.f119561OooO0O0;
        boolean zOooO0o = o00oo02.OooO0o();
        OooOOO oooOOO = this.f119560OooO00o;
        if (zOooO0o) {
            return oooOOO.toString();
        }
        return oooOOO + "(" + o00oo02 + ")";
    }
}
