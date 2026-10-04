package o0o00Ooo;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import androidx.appcompat.app.OooOOO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o00Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29920OooO0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f106157OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f106158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f106159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Integer> f106160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f106161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f106162OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f106163OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f106164OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Integer f106165OooO0oo;

    public C29920OooO0oo(String id, String name, List colors, int i, int i2, int i3, boolean z, Integer num, boolean z2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(colors, "colors");
        this.f106158OooO00o = id;
        this.f106159OooO0O0 = name;
        this.f106160OooO0OO = colors;
        this.f106161OooO0Oo = i;
        this.f106163OooO0o0 = i2;
        this.f106162OooO0o = i3;
        this.f106164OooO0oO = z;
        this.f106165OooO0oo = num;
        this.f106157OooO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29920OooO0oo)) {
            return false;
        }
        C29920OooO0oo c29920OooO0oo = (C29920OooO0oo) obj;
        return OooOOO0.OooO0O0(this.f106158OooO00o, c29920OooO0oo.f106158OooO00o) && OooOOO0.OooO0O0(this.f106159OooO0O0, c29920OooO0oo.f106159OooO0O0) && OooOOO0.OooO0O0(this.f106160OooO0OO, c29920OooO0oo.f106160OooO0OO) && this.f106161OooO0Oo == c29920OooO0oo.f106161OooO0Oo && this.f106163OooO0o0 == c29920OooO0oo.f106163OooO0o0 && this.f106162OooO0o == c29920OooO0oo.f106162OooO0o && this.f106164OooO0oO == c29920OooO0oo.f106164OooO0oO && OooOOO0.OooO0O0(this.f106165OooO0oo, c29920OooO0oo.f106165OooO0oo) && this.f106157OooO == c29920OooO0oo.f106157OooO;
    }

    public final int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f106162OooO0o, C20785Oooo00o.OooO00o(this.f106163OooO0o0, C20785Oooo00o.OooO00o(this.f106161OooO0Oo, C21445Oooo.OooO00o(this.f106160OooO0OO, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f106158OooO00o.hashCode() * 31, 31, this.f106159OooO0O0), 31), 31), 31), 31), 31, false), 31, this.f106164OooO0oO);
        Integer num = this.f106165OooO0oo;
        return Boolean.hashCode(this.f106157OooO) + ((iOooO0O0 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorSetVO(id=");
        sb.append(this.f106158OooO00o);
        sb.append(", name=");
        sb.append(this.f106159OooO0O0);
        sb.append(", colors=");
        sb.append(this.f106160OooO0OO);
        sb.append(", backgroundColor=");
        sb.append(this.f106161OooO0Oo);
        sb.append(", foregroundColor=");
        sb.append(this.f106163OooO0o0);
        sb.append(", type=");
        sb.append(this.f106162OooO0o);
        sb.append(", selected=false, canUseVipColorSet=");
        sb.append(this.f106164OooO0oO);
        sb.append(", nameResId=");
        sb.append(this.f106165OooO0oo);
        sb.append(", isVipBadgeVisible=");
        return OooOOO.OooO00o(sb, ")", this.f106157OooO);
    }
}
