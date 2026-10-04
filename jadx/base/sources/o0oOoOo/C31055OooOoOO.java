package o0oOoOo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31055OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110868OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110869OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110870OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f110872OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f110873OooO0o0;

    public C31055OooOoOO(String id, String name, String path, boolean z, long j, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        this.f110868OooO00o = id;
        this.f110869OooO0O0 = name;
        this.f110870OooO0OO = path;
        this.f110871OooO0Oo = z;
        this.f110873OooO0o0 = j;
        this.f110872OooO0o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31055OooOoOO)) {
            return false;
        }
        C31055OooOoOO c31055OooOoOO = (C31055OooOoOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110868OooO00o, c31055OooOoOO.f110868OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110869OooO0O0, c31055OooOoOO.f110869OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110870OooO0OO, c31055OooOoOO.f110870OooO0OO) && this.f110871OooO0Oo == c31055OooOoOO.f110871OooO0Oo && this.f110873OooO0o0 == c31055OooOoOO.f110873OooO0o0 && this.f110872OooO0o == c31055OooOoOO.f110872OooO0o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110872OooO0o) + C20703o000000o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110868OooO00o.hashCode() * 31, 31, this.f110869OooO0O0), 31, this.f110870OooO0OO), 31, this.f110871OooO0Oo), 31, this.f110873OooO0o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoteinFileVO(id=");
        sb.append(this.f110868OooO00o);
        sb.append(", name=");
        sb.append(this.f110869OooO0O0);
        sb.append(", path=");
        sb.append(this.f110870OooO0OO);
        sb.append(", isDir=");
        sb.append(this.f110871OooO0Oo);
        sb.append(", creationTime=");
        sb.append(this.f110873OooO0o0);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110872OooO0o);
    }
}
