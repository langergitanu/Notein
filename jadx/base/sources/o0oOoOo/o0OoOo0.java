package o0oOoOo;

import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31091ooOO f110973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<ThemeVO> f110974OooO0O0;

    public o0OoOo0(C31091ooOO c31091ooOO, List<ThemeVO> themes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(themes, "themes");
        this.f110973OooO00o = c31091ooOO;
        this.f110974OooO0O0 = themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo02 = (o0OoOo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110973OooO00o, o0oooo02.f110973OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110974OooO0O0, o0oooo02.f110974OooO0O0);
    }

    public final int hashCode() {
        return this.f110974OooO0O0.hashCode() + (this.f110973OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "ThemeCategoryGroup(category=" + this.f110973OooO00o + ", themes=" + this.f110974OooO0O0 + ")";
    }
}
