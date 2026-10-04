package o0OoooOO;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import Oooo0oO.C21023OooO0Oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OoooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29633OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f105071OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f105072OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f105073OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f105074OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f105075OooO0o0;

    public C29633OooO00o(String str, String str2, boolean z, long j, int i) {
        this.f105071OooO00o = str;
        this.f105072OooO0O0 = str2;
        this.f105073OooO0OO = z;
        this.f105074OooO0Oo = j;
        this.f105075OooO0o0 = i;
    }

    public static C29633OooO00o OooO00o(C29633OooO00o c29633OooO00o, String str, int i) {
        if ((i & 2) != 0) {
            str = c29633OooO00o.f105072OooO0O0;
        }
        String text = str;
        String id = c29633OooO00o.f105071OooO00o;
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(text, "text");
        return new C29633OooO00o(id, text, c29633OooO00o.f105073OooO0OO, c29633OooO00o.f105074OooO0Oo, c29633OooO00o.f105075OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29633OooO00o)) {
            return false;
        }
        C29633OooO00o c29633OooO00o = (C29633OooO00o) obj;
        return OooOOO0.OooO0O0(this.f105071OooO00o, c29633OooO00o.f105071OooO00o) && OooOOO0.OooO0O0(this.f105072OooO0O0, c29633OooO00o.f105072OooO0O0) && this.f105073OooO0OO == c29633OooO00o.f105073OooO0OO && this.f105074OooO0Oo == c29633OooO00o.f105074OooO0Oo && this.f105075OooO0o0 == c29633OooO00o.f105075OooO0o0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105075OooO0o0) + C20703o000000o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f105071OooO00o.hashCode() * 31, 31, this.f105072OooO0O0), 31, this.f105073OooO0OO), 31, this.f105074OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Message(id=");
        sb.append(this.f105071OooO00o);
        sb.append(", text=");
        sb.append(this.f105072OooO0O0);
        sb.append(", isLocalUser=");
        sb.append(this.f105073OooO0OO);
        sb.append(", timestamp=");
        sb.append(this.f105074OooO0Oo);
        sb.append(", textResId=");
        return C21023OooO0Oo.OooO0OO(")", this.f105075OooO0o0, sb);
    }
}
