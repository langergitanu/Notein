package o00Ooo;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OooooO0.C21290OooO0o0;
import java.util.ArrayList;

/* JADX INFO: renamed from: o00Ooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25087OooOo0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f85157OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f85158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f85159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f85160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f85161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f85162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f85163OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f85164OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f85165OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f85166OooOO0;

    public C25087OooOo0o() {
        throw null;
    }

    public C25087OooOo0o(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5) {
        this.f85158OooO00o = j;
        this.f85159OooO0O0 = j2;
        this.f85160OooO0OO = j3;
        this.f85161OooO0Oo = j4;
        this.f85163OooO0o0 = z;
        this.f85162OooO0o = f;
        this.f85164OooO0oO = i;
        this.f85165OooO0oo = z2;
        this.f85157OooO = arrayList;
        this.f85166OooOO0 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25087OooOo0o)) {
            return false;
        }
        C25087OooOo0o c25087OooOo0o = (C25087OooOo0o) obj;
        return C25084OooOOoo.OooO00o(this.f85158OooO00o, c25087OooOo0o.f85158OooO00o) && this.f85159OooO0O0 == c25087OooOo0o.f85159OooO0O0 && C21290OooO0o0.OooO00o(this.f85160OooO0OO, c25087OooOo0o.f85160OooO0OO) && C21290OooO0o0.OooO00o(this.f85161OooO0Oo, c25087OooOo0o.f85161OooO0Oo) && this.f85163OooO0o0 == c25087OooOo0o.f85163OooO0o0 && Float.compare(this.f85162OooO0o, c25087OooOo0o.f85162OooO0o) == 0 && this.f85164OooO0oO == c25087OooOo0o.f85164OooO0oO && this.f85165OooO0oo == c25087OooOo0o.f85165OooO0oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f85157OooO, c25087OooOo0o.f85157OooO) && C21290OooO0o0.OooO00o(this.f85166OooOO0, c25087OooOo0o.f85166OooOO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final int hashCode() {
        int iOooO0O0 = C20703o000000o.OooO0O0(Long.hashCode(this.f85158OooO00o) * 31, 31, this.f85159OooO0O0);
        int i = C21290OooO0o0.f61721OooO0o0;
        int iOooO0O02 = C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(iOooO0O0, 31, this.f85160OooO0OO), 31, this.f85161OooO0Oo);
        boolean z = this.f85163OooO0o0;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        int iOooO00o = C20785Oooo00o.OooO00o(this.f85164OooO0oO, C20509OooO0oo.OooO0OO(this.f85162OooO0o, (iOooO0O02 + r3) * 31, 31), 31);
        boolean z2 = this.f85165OooO0oo;
        return Long.hashCode(this.f85166OooOO0) + ((this.f85157OooO.hashCode() + ((iOooO00o + (z2 ? 1 : z2)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) C25084OooOOoo.OooO0O0(this.f85158OooO00o));
        sb.append(", uptime=");
        sb.append(this.f85159OooO0O0);
        sb.append(", positionOnScreen=");
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f85160OooO0OO));
        sb.append(", position=");
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f85161OooO0Oo));
        sb.append(", down=");
        sb.append(this.f85163OooO0o0);
        sb.append(", pressure=");
        sb.append(this.f85162OooO0o);
        sb.append(", type=");
        int i = this.f85164OooO0oO;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", issuesEnterExit=");
        sb.append(this.f85165OooO0oo);
        sb.append(", historical=");
        sb.append(this.f85157OooO);
        sb.append(", scrollDelta=");
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f85166OooOO0));
        sb.append(')');
        return sb.toString();
    }
}
