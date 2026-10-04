package o0oOoOo;

import OoooooO.C21445Oooo;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import java.util.List;

/* JADX INFO: renamed from: o0oOoOo.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31091ooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f110975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110976OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PageColorThemeVO> f110977OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110978OooO0Oo;

    public C31091ooOO(int i, String name, List<PageColorThemeVO> colors, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(colors, "colors");
        this.f110975OooO00o = i;
        this.f110976OooO0O0 = name;
        this.f110977OooO0OO = colors;
        this.f110978OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31091ooOO)) {
            return false;
        }
        C31091ooOO c31091ooOO = (C31091ooOO) obj;
        return this.f110975OooO00o == c31091ooOO.f110975OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110976OooO0O0, c31091ooOO.f110976OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110977OooO0OO, c31091ooOO.f110977OooO0OO) && this.f110978OooO0Oo == c31091ooOO.f110978OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110978OooO0Oo) + C21445Oooo.OooO00o(this.f110977OooO0OO, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.f110975OooO00o) * 31, 31, this.f110976OooO0O0), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeCategoryVO(id=");
        sb.append(this.f110975OooO00o);
        sb.append(", name=");
        sb.append(this.f110976OooO0O0);
        sb.append(", colors=");
        sb.append(this.f110977OooO0OO);
        sb.append(", isVipBadgeVisible=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110978OooO0Oo);
    }
}
