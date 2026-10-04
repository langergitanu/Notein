package o0oOoOo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31051OooOo0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f110858OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110860OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f110861OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f110862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f110863OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f110864OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f110865OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f110866OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f110867OooOO0;

    public C31051OooOo0O(String name, boolean z, boolean z2, long j, long j2, long j3, long j4, String str, String str2, String str3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f110859OooO00o = name;
        this.f110860OooO0O0 = z;
        this.f110861OooO0OO = z2;
        this.f110862OooO0Oo = j;
        this.f110864OooO0o0 = j2;
        this.f110863OooO0o = j3;
        this.f110865OooO0oO = j4;
        this.f110866OooO0oo = str;
        this.f110858OooO = str2;
        this.f110867OooOO0 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31051OooOo0O)) {
            return false;
        }
        C31051OooOo0O c31051OooOo0O = (C31051OooOo0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110859OooO00o, c31051OooOo0O.f110859OooO00o) && this.f110860OooO0O0 == c31051OooOo0O.f110860OooO0O0 && this.f110861OooO0OO == c31051OooOo0O.f110861OooO0OO && this.f110862OooO0Oo == c31051OooOo0O.f110862OooO0Oo && this.f110864OooO0o0 == c31051OooOo0O.f110864OooO0o0 && this.f110863OooO0o == c31051OooOo0O.f110863OooO0o && this.f110865OooO0oO == c31051OooOo0O.f110865OooO0oO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110866OooO0oo, c31051OooOo0O.f110866OooO0oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110858OooO, c31051OooOo0O.f110858OooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110867OooOO0, c31051OooOo0O.f110867OooOO0);
    }

    public final int hashCode() {
        return this.f110867OooOO0.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(this.f110859OooO00o.hashCode() * 31, 31, this.f110860OooO0O0), 31, this.f110861OooO0OO), 31, this.f110862OooO0Oo), 31, this.f110864OooO0o0), 31, this.f110863OooO0o), 31, this.f110865OooO0oO), 31, this.f110866OooO0oo), 31, this.f110858OooO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteSimpleInfoVO(name=");
        sb.append(this.f110859OooO00o);
        sb.append(", isPdf=");
        sb.append(this.f110860OooO0O0);
        sb.append(", isFolder=");
        sb.append(this.f110861OooO0OO);
        sb.append(", creationTime=");
        sb.append(this.f110862OooO0Oo);
        sb.append(", lastModificationTime=");
        sb.append(this.f110864OooO0o0);
        sb.append(", size=");
        sb.append(this.f110863OooO0o);
        sb.append(", lastSyncTime=");
        sb.append(this.f110865OooO0oO);
        sb.append(", creationTimeStr=");
        sb.append(this.f110866OooO0oo);
        sb.append(", lastModificationTimeStr=");
        sb.append(this.f110858OooO);
        sb.append(", lastSyncTimeStr=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110867OooOO0, ")");
    }
}
