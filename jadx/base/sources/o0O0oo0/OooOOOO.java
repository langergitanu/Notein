package o0O0oo0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f89518OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f89519OooO0O0;

    public OooOOOO(String id, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        this.f89518OooO00o = id;
        this.f89519OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f89518OooO00o, oooOOOO.f89518OooO00o) && this.f89519OooO0O0.equals(oooOOOO.f89519OooO0O0);
    }

    public final int hashCode() {
        return com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f89518OooO00o.hashCode() * 31, 31, this.f89519OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingleSelectDropdownOption(id=");
        sb.append(this.f89518OooO00o);
        sb.append(", label=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f89519OooO0O0, ", contentDescription=null)");
    }
}
