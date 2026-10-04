package o0o0OoOO;

/* JADX INFO: renamed from: o0o0OoOO.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30717Oooo0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109846OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f109847OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f109848OooO0OO;

    public C30717Oooo0OO(String str, String size, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(size, "size");
        this.f109846OooO00o = str;
        this.f109847OooO0O0 = size;
        this.f109848OooO0OO = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30717Oooo0OO)) {
            return false;
        }
        C30717Oooo0OO c30717Oooo0OO = (C30717Oooo0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109846OooO00o, c30717Oooo0OO.f109846OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109847OooO0O0, c30717Oooo0OO.f109847OooO0O0) && this.f109848OooO0OO == c30717Oooo0OO.f109848OooO0OO;
    }

    public final int hashCode() {
        return Long.hashCode(this.f109848OooO0OO) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f109846OooO00o.hashCode() * 31, 31, this.f109847OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugPdf(name=");
        sb.append(this.f109846OooO00o);
        sb.append(", size=");
        sb.append(this.f109847OooO0O0);
        sb.append(", importedTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f109848OooO0OO, ")", sb);
    }
}
