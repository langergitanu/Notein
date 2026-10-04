package o0oOoOo;

/* JADX INFO: renamed from: o0oOoOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31035OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110805OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110806OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110807OooO0OO;

    public C31035OooO0o0(String id, String fileName, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileName, "fileName");
        this.f110805OooO00o = id;
        this.f110806OooO0O0 = fileName;
        this.f110807OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31035OooO0o0)) {
            return false;
        }
        C31035OooO0o0 c31035OooO0o0 = (C31035OooO0o0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110805OooO00o, c31035OooO0o0.f110805OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110806OooO0O0, c31035OooO0o0.f110806OooO0O0) && this.f110807OooO0OO == c31035OooO0o0.f110807OooO0OO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110807OooO0OO) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110805OooO00o.hashCode() * 31, 31, this.f110806OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudSyncingFileVO(id=");
        sb.append(this.f110805OooO00o);
        sb.append(", fileName=");
        sb.append(this.f110806OooO0O0);
        sb.append(", isUploading=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110807OooO0OO);
    }
}
