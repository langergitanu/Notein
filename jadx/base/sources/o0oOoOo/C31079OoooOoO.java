package o0oOoOo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;

/* JADX INFO: renamed from: o0oOoOo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31079OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110917OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110918OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110919OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110920OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f110921OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f110922OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f110923OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f110924OooO0oo;

    public C31079OoooOoO(String id, String parentId, String path, boolean z, long j, boolean z2, boolean z3, float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentId, "parentId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        this.f110917OooO00o = id;
        this.f110918OooO0O0 = parentId;
        this.f110919OooO0OO = path;
        this.f110920OooO0Oo = z;
        this.f110922OooO0o0 = j;
        this.f110921OooO0o = z2;
        this.f110923OooO0oO = z3;
        this.f110924OooO0oo = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31079OoooOoO)) {
            return false;
        }
        C31079OoooOoO c31079OoooOoO = (C31079OoooOoO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110917OooO00o, c31079OoooOoO.f110917OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110918OooO0O0, c31079OoooOoO.f110918OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110919OooO0OO, c31079OoooOoO.f110919OooO0OO) && this.f110920OooO0Oo == c31079OoooOoO.f110920OooO0Oo && this.f110922OooO0o0 == c31079OoooOoO.f110922OooO0o0 && this.f110921OooO0o == c31079OoooOoO.f110921OooO0o && this.f110923OooO0oO == c31079OoooOoO.f110923OooO0oO && Float.compare(this.f110924OooO0oo, c31079OoooOoO.f110924OooO0oo) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110924OooO0oo) + o00000.OooO0O0(o00000.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110917OooO00o.hashCode() * 31, 31, this.f110918OooO0O0), 31, this.f110919OooO0OO), 31, this.f110920OooO0Oo), 31, this.f110922OooO0o0), 31, this.f110921OooO0o), 31, this.f110923OooO0oO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerVO(id=");
        sb.append(this.f110917OooO00o);
        sb.append(", parentId=");
        sb.append(this.f110918OooO0O0);
        sb.append(", path=");
        sb.append(this.f110919OooO0OO);
        sb.append(", builtIn=");
        sb.append(this.f110920OooO0Oo);
        sb.append(", lastUsedTime=");
        sb.append(this.f110922OooO0o0);
        sb.append(", isSelected=");
        sb.append(this.f110921OooO0o);
        sb.append(", isMultiSelectMode=");
        sb.append(this.f110923OooO0oO);
        sb.append(", svgAspectRatio=");
        return Oooo00o.OooO0OO.OooO0OO(sb, this.f110924OooO0oo, ")");
    }
}
