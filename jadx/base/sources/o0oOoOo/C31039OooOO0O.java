package o0oOoOo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31039OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110816OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110817OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110818OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f110819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f110820OooO0o0;

    public C31039OooOO0O(String str, String str2, boolean z, long j, boolean z2) {
        this.f110816OooO00o = str;
        this.f110817OooO0O0 = str2;
        this.f110818OooO0OO = z;
        this.f110819OooO0Oo = j;
        this.f110820OooO0o0 = z2;
    }

    public static C31039OooOO0O OooO00o(C31039OooOO0O c31039OooOO0O, boolean z) {
        return new C31039OooOO0O(c31039OooOO0O.f110816OooO00o, c31039OooOO0O.f110817OooO0O0, c31039OooOO0O.f110818OooO0OO, c31039OooOO0O.f110819OooO0Oo, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31039OooOO0O)) {
            return false;
        }
        C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110816OooO00o, c31039OooOO0O.f110816OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110817OooO0O0, c31039OooOO0O.f110817OooO0O0) && this.f110818OooO0OO == c31039OooOO0O.f110818OooO0OO && this.f110819OooO0Oo == c31039OooOO0O.f110819OooO0Oo && this.f110820OooO0o0 == c31039OooOO0O.f110820OooO0o0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110820OooO0o0) + C20703o000000o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110816OooO00o.hashCode() * 31, 31, this.f110817OooO0O0), 31, this.f110818OooO0OO), 31, this.f110819OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileTreeNodeVO(path=");
        sb.append(this.f110816OooO00o);
        sb.append(", name=");
        sb.append(this.f110817OooO0O0);
        sb.append(", isDir=");
        sb.append(this.f110818OooO0OO);
        sb.append(", lastModified=");
        sb.append(this.f110819OooO0Oo);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110820OooO0o0);
    }
}
