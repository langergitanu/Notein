package oOO00O00;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f123278OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f123279OooO0O0;

    public final boolean equals(Object obj) {
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (oooO00o != this) {
                Object obj2 = oooO00o.f123278OooO00o;
                String str = this.f123278OooO00o;
                if (str == obj2 ? true : (str == null || obj2 == null) ? false : str.equals(obj2)) {
                    String str2 = this.f123279OooO0O0;
                    String str3 = oooO00o.f123279OooO0O0;
                    if (str2 == str3 ? true : (str2 == null || str3 == null) ? false : str2.equals(str3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f123278OooO00o;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.f123279OooO0O0;
        return ((str2 != null ? str2.hashCode() : 1) * 31) + iHashCode;
    }
}
