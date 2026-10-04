package o0oOoOo;

import OooOoo0.C20703o000000o;

/* JADX INFO: renamed from: o0oOoOo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31043OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f110838OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f110839OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110840OooO0Oo;

    public C31043OooOOOO(String id, boolean z, long j, long j2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        this.f110837OooO00o = id;
        this.f110838OooO0O0 = j;
        this.f110839OooO0OO = j2;
        this.f110840OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31043OooOOOO)) {
            return false;
        }
        C31043OooOOOO c31043OooOOOO = (C31043OooOOOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110837OooO00o, c31043OooOOOO.f110837OooO00o) && this.f110838OooO0O0 == c31043OooOOOO.f110838OooO0O0 && this.f110839OooO0OO == c31043OooOOOO.f110839OooO0OO && this.f110840OooO0Oo == c31043OooOOOO.f110840OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110840OooO0Oo) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(this.f110837OooO00o.hashCode() * 31, 31, this.f110838OooO0O0), 31, this.f110839OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryVersionVO(id=");
        sb.append(this.f110837OooO00o);
        sb.append(", size=");
        sb.append(this.f110838OooO0O0);
        sb.append(", editedTime=");
        sb.append(this.f110839OooO0OO);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110840OooO0Oo);
    }
}
