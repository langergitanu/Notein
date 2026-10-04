package o0o0OoOO;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;

/* JADX INFO: renamed from: o0o0OoOO.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30713Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109835OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f109836OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f109837OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f109838OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f109839OooO0o0;

    public C30713Oooo000() {
        this(null, 0L, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30713Oooo000)) {
            return false;
        }
        C30713Oooo000 c30713Oooo000 = (C30713Oooo000) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109835OooO00o, c30713Oooo000.f109835OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f109836OooO0O0, c30713Oooo000.f109836OooO0O0) && this.f109837OooO0OO == c30713Oooo000.f109837OooO0OO && this.f109838OooO0Oo == c30713Oooo000.f109838OooO0Oo && this.f109839OooO0o0 == c30713Oooo000.f109839OooO0o0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109839OooO0o0) + o00000.OooO0O0(C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f109835OooO00o.hashCode() * 31, 31, this.f109836OooO0O0), 31, this.f109837OooO0OO), 31, this.f109838OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugImage(noteName=");
        sb.append(this.f109835OooO00o);
        sb.append(", uri=");
        sb.append(this.f109836OooO0O0);
        sb.append(", creationTime=");
        sb.append(this.f109837OooO0OO);
        sb.append(", isUsed=");
        sb.append(this.f109838OooO0Oo);
        sb.append(", isNote=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f109839OooO0o0);
    }

    public C30713Oooo000(String noteName, long j, String uri, int i) {
        noteName = (i & 1) != 0 ? "" : noteName;
        uri = (i & 2) != 0 ? "" : uri;
        j = (i & 4) != 0 ? 0L : j;
        boolean z = (i & 8) != 0;
        boolean z2 = (i & 16) == 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteName, "noteName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        this.f109835OooO00o = noteName;
        this.f109836OooO0O0 = uri;
        this.f109837OooO0OO = j;
        this.f109838OooO0Oo = z;
        this.f109839OooO0o0 = z2;
    }
}
