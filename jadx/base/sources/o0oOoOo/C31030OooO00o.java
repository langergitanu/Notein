package o0oOoOo;

import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: o0oOoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31030OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110776OooO0Oo;

    public C31030OooO00o(String id, int i, String pageContent, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageContent, "pageContent");
        this.f110773OooO00o = id;
        this.f110774OooO0O0 = i;
        this.f110775OooO0OO = pageContent;
        this.f110776OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31030OooO00o)) {
            return false;
        }
        C31030OooO00o c31030OooO00o = (C31030OooO00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110773OooO00o, c31030OooO00o.f110773OooO00o) && this.f110774OooO0O0 == c31030OooO00o.f110774OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110775OooO0OO, c31030OooO00o.f110775OooO0OO) && this.f110776OooO0Oo == c31030OooO00o.f110776OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110776OooO0Oo) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.f110774OooO0O0, this.f110773OooO00o.hashCode() * 31, 31), 31, this.f110775OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiOcrTextPageVO(id=");
        sb.append(this.f110773OooO00o);
        sb.append(", pageIndex=");
        sb.append(this.f110774OooO0O0);
        sb.append(", pageContent=");
        sb.append(this.f110775OooO0OO);
        sb.append(", isSelected=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110776OooO0Oo);
    }
}
