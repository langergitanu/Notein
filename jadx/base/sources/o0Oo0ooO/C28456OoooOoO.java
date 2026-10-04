package o0Oo0ooO;

import OooOoO.C20509OooO0oo;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import java.util.List;

/* JADX INFO: renamed from: o0Oo0ooO.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28456OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f100833OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f100834OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f100835OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f100836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f100837OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<C28422OooOOo> f100838OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f100839OooO0oO;

    public C28456OoooOoO(long j, String name, int i, float f, List<C28422OooOOo> list, boolean z, long j2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f100833OooO00o = j;
        this.f100834OooO0O0 = name;
        this.f100835OooO0OO = i;
        this.f100836OooO0Oo = f;
        this.f100838OooO0o0 = list;
        this.f100837OooO0o = z;
        this.f100839OooO0oO = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28456OoooOoO)) {
            return false;
        }
        C28456OoooOoO c28456OoooOoO = (C28456OoooOoO) obj;
        return this.f100833OooO00o == c28456OoooOoO.f100833OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100834OooO0O0, c28456OoooOoO.f100834OooO0O0) && this.f100835OooO0OO == c28456OoooOoO.f100835OooO0OO && Float.compare(this.f100836OooO0Oo, c28456OoooOoO.f100836OooO0Oo) == 0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100838OooO0o0, c28456OoooOoO.f100838OooO0o0) && this.f100837OooO0o == c28456OoooOoO.f100837OooO0o && this.f100839OooO0oO == c28456OoooOoO.f100839OooO0oO;
    }

    public final int hashCode() {
        return Long.hashCode(this.f100839OooO0oO) + o00000.OooO0O0(C21445Oooo.OooO00o(this.f100838OooO0o0, C20509OooO0oo.OooO0OO(this.f100836OooO0Oo, C20785Oooo00o.OooO00o(this.f100835OooO0OO, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Long.hashCode(this.f100833OooO00o) * 31, 31, this.f100834OooO0O0), 31), 31), 31), 31, this.f100837OooO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelVO(id=");
        sb.append(this.f100833OooO00o);
        sb.append(", name=");
        sb.append(this.f100834OooO0O0);
        sb.append(", color=");
        sb.append(this.f100835OooO0OO);
        sb.append(", index=");
        sb.append(this.f100836OooO0Oo);
        sb.append(", colorList=");
        sb.append(this.f100838OooO0o0);
        sb.append(", isEditing=");
        sb.append(this.f100837OooO0o);
        sb.append(", createdTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f100839OooO0oO, ")", sb);
    }
}
