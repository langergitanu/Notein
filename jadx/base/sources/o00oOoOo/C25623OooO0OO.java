package o00oOoOo;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00oOoOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25623OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25623OooO0OO f87455OooO0OO = new C25623OooO0OO(GrsBaseInfo.CountryCodeSource.UNKNOWN, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f87456OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f87457OooO0O0;

    public C25623OooO0OO(String str, String str2) {
        this.f87456OooO00o = str;
        this.f87457OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25623OooO0OO)) {
            return false;
        }
        C25623OooO0OO c25623OooO0OO = (C25623OooO0OO) obj;
        return OooOOO0.OooO0O0(this.f87456OooO00o, c25623OooO0OO.f87456OooO00o) && OooOOO0.OooO0O0(this.f87457OooO0O0, c25623OooO0OO.f87457OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f87456OooO00o.hashCode() * 31;
        String str = this.f87457OooO0O0;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.f87456OooO00o;
    }
}
