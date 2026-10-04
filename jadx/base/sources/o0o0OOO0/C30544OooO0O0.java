package o0o0OOO0;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o0OOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30544OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f109256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f109257OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f109258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f109259OooO0o0;

    public C30544OooO0O0(String id, String title, long j, boolean z, long j2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        this.f109255OooO00o = id;
        this.f109256OooO0O0 = title;
        this.f109257OooO0OO = z;
        this.f109258OooO0Oo = j;
        this.f109259OooO0o0 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30544OooO0O0)) {
            return false;
        }
        C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f109255OooO00o, c30544OooO0O0.f109255OooO00o) && OooOOO0.OooO0O0(this.f109256OooO0O0, c30544OooO0O0.f109256OooO0O0) && this.f109257OooO0OO == c30544OooO0O0.f109257OooO0OO && this.f109258OooO0Oo == c30544OooO0O0.f109258OooO0Oo && this.f109259OooO0o0 == c30544OooO0O0.f109259OooO0o0;
    }

    public final int hashCode() {
        return Long.hashCode(this.f109259OooO0o0) + C20703o000000o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f109255OooO00o.hashCode() * 31, 31, this.f109256OooO0O0), 31, this.f109257OooO0OO), 31, this.f109258OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetNoteVO(id=");
        sb.append(this.f109255OooO00o);
        sb.append(", title=");
        sb.append(this.f109256OooO0O0);
        sb.append(", isSelected=");
        sb.append(this.f109257OooO0OO);
        sb.append(", creationTime=");
        sb.append(this.f109258OooO0Oo);
        sb.append(", lastModificationTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f109259OooO0o0, ")", sb);
    }
}
