package o0oOoOo;

import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31032OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110782OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f110786OooO0o0;

    public C31032OooO0OO(String id, String fileName, boolean z, boolean z2, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileName, "fileName");
        this.f110782OooO00o = id;
        this.f110783OooO0O0 = fileName;
        this.f110784OooO0OO = z;
        this.f110785OooO0Oo = z2;
        this.f110786OooO0o0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31032OooO0OO)) {
            return false;
        }
        C31032OooO0OO c31032OooO0OO = (C31032OooO0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110782OooO00o, c31032OooO0OO.f110782OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110783OooO0O0, c31032OooO0OO.f110783OooO0O0) && this.f110784OooO0OO == c31032OooO0OO.f110784OooO0OO && this.f110785OooO0Oo == c31032OooO0OO.f110785OooO0Oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110786OooO0o0, c31032OooO0OO.f110786OooO0o0);
    }

    public final int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110782OooO00o.hashCode() * 31, 31, this.f110783OooO0O0), 31, this.f110784OooO0OO), 31, this.f110785OooO0Oo);
        String str = this.f110786OooO0o0;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudSyncIssueFileVO(id=");
        sb.append(this.f110782OooO00o);
        sb.append(", fileName=");
        sb.append(this.f110783OooO0O0);
        sb.append(", isConflict=");
        sb.append(this.f110784OooO0OO);
        sb.append(", isGlobalError=");
        sb.append(this.f110785OooO0Oo);
        sb.append(", errorCode=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110786OooO0o0, ")");
    }
}
