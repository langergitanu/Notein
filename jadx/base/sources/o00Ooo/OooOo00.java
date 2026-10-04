package o00Ooo;

import OooooO0.C21290OooO0o0;
import java.util.ArrayList;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f85143OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f85144OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f85145OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f85146OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f85147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f85148OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f85149OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f85150OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f85151OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Float f85152OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f85153OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C25075OooO0Oo f85154OooOO0o;

    public OooOo00() {
        throw null;
    }

    public OooOo00(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f85144OooO00o = j;
        this.f85145OooO0O0 = j2;
        this.f85146OooO0OO = j3;
        this.f85147OooO0Oo = z;
        this.f85149OooO0o0 = j4;
        this.f85148OooO0o = j5;
        this.f85150OooO0oO = z2;
        this.f85151OooO0oo = i;
        this.f85143OooO = j6;
        C25075OooO0Oo c25075OooO0Oo = new C25075OooO0Oo();
        c25075OooO0Oo.f85102OooO00o = z3;
        c25075OooO0Oo.f85103OooO0O0 = z3;
        this.f85154OooOO0o = c25075OooO0Oo;
        this.f85152OooOO0 = Float.valueOf(f);
    }

    public final void OooO00o() {
        C25075OooO0Oo c25075OooO0Oo = this.f85154OooOO0o;
        c25075OooO0Oo.f85103OooO0O0 = true;
        c25075OooO0Oo.f85102OooO00o = true;
    }

    public final boolean OooO0O0() {
        C25075OooO0Oo c25075OooO0Oo = this.f85154OooOO0o;
        return c25075OooO0Oo.f85103OooO0O0 || c25075OooO0Oo.f85102OooO00o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) C25084OooOOoo.OooO0O0(this.f85144OooO00o));
        sb.append(", uptimeMillis=");
        sb.append(this.f85145OooO0O0);
        sb.append(", position=");
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f85146OooO0OO));
        sb.append(", pressed=");
        sb.append(this.f85147OooO0Oo);
        sb.append(", pressure=");
        Float f = this.f85152OooOO0;
        sb.append(f != null ? f.floatValue() : 0.0f);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f85149OooO0o0);
        sb.append(", previousPosition=");
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f85148OooO0o));
        sb.append(", previousPressed=");
        sb.append(this.f85150OooO0oO);
        sb.append(", isConsumed=");
        sb.append(OooO0O0());
        sb.append(", type=");
        int i = this.f85151OooO0oo;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f85153OooOO0O;
        if (obj == null) {
            obj = C34434OooOoO.f123453OooOo0o;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C21290OooO0o0.OooO0oo(this.f85143OooO));
        sb.append(')');
        return sb.toString();
    }

    public OooOo00(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.f85153OooOO0O = arrayList;
    }
}
