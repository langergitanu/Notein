package o0Oo0OO0;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Oo0OO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28071OooO0oo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C28071OooO0oo f99511OooO0o0 = new C28071OooO0oo(null, 15);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f99512OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f99513OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C28069OooO0o0 f99514OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f99515OooO0Oo;

    public C28071OooO0oo() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28071OooO0oo)) {
            return false;
        }
        C28071OooO0oo c28071OooO0oo = (C28071OooO0oo) obj;
        return this.f99512OooO00o == c28071OooO0oo.f99512OooO00o && OooOOO0.OooO0O0(this.f99513OooO0O0, c28071OooO0oo.f99513OooO0O0) && OooOOO0.OooO0O0(this.f99514OooO0OO, c28071OooO0oo.f99514OooO0OO) && this.f99515OooO0Oo == c28071OooO0oo.f99515OooO0Oo;
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f99512OooO00o.hashCode() * 31, 31, this.f99513OooO0O0);
        C28069OooO0o0 c28069OooO0o0 = this.f99514OooO0OO;
        return Boolean.hashCode(this.f99515OooO0Oo) + ((iOooO0O0 + (c28069OooO0o0 == null ? 0 : c28069OooO0o0.hashCode())) * 31);
    }

    public final String toString() {
        return "ServerState(serverStatus=" + this.f99512OooO00o + ", requestHash=" + this.f99513OooO0O0 + ", serverVerdict=" + this.f99514OooO0OO + ", commandSuccess=" + this.f99515OooO0Oo + ")";
    }

    public C28071OooO0oo(OooO serverStatus, String requestHash, C28069OooO0o0 c28069OooO0o0, boolean z) {
        OooOOO0.OooO0oO(serverStatus, "serverStatus");
        OooOOO0.OooO0oO(requestHash, "requestHash");
        this.f99512OooO00o = serverStatus;
        this.f99513OooO0O0 = requestHash;
        this.f99514OooO0OO = c28069OooO0o0;
        this.f99515OooO0Oo = z;
    }

    public /* synthetic */ C28071OooO0oo(OooO oooO, int i) {
        this((i & 1) != 0 ? OooO.f99480OooOo0o : oooO, "", null, false);
    }
}
