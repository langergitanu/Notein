package o000o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC24590OooOooo<Object> f83168OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f83169OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f83170OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f83171OooO0Oo;

    public OooO(AbstractC24590OooOooo<Object> abstractC24590OooOooo, boolean z, Object obj, boolean z2) {
        if (!abstractC24590OooOooo.f83351OooO00o && z) {
            throw new IllegalArgumentException(abstractC24590OooOooo.OooO0O0().concat(" does not allow nullable values").toString());
        }
        if (!z && z2 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC24590OooOooo.OooO0O0() + " has null value but is not nullable.").toString());
        }
        this.f83168OooO00o = abstractC24590OooOooo;
        this.f83169OooO0O0 = z;
        this.f83171OooO0Oo = obj;
        this.f83170OooO0OO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OooO.class.equals(obj.getClass())) {
            OooO oooO = (OooO) obj;
            if (this.f83169OooO0O0 != oooO.f83169OooO0O0 || this.f83170OooO0OO != oooO.f83170OooO0OO || !kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83168OooO00o, oooO.f83168OooO00o)) {
                return false;
            }
            Object obj2 = oooO.f83171OooO0Oo;
            Object obj3 = this.f83171OooO0Oo;
            if (obj3 != null) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f83168OooO00o.hashCode() * 31) + (this.f83169OooO0O0 ? 1 : 0)) * 31) + (this.f83170OooO0OO ? 1 : 0)) * 31;
        Object obj = this.f83171OooO0Oo;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OooO.class.getSimpleName());
        sb.append(" Type: " + this.f83168OooO00o);
        sb.append(" Nullable: " + this.f83169OooO0O0);
        if (this.f83170OooO0OO) {
            sb.append(" DefaultValue: " + this.f83171OooO0Oo);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "sb.toString()");
        return string;
    }
}
