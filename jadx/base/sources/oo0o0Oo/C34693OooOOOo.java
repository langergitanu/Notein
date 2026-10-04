package oo0o0Oo;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import java.util.List;
import o000000o.AbstractC24088OooO0oO;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: oo0o0Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34693OooOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final AbstractC24088OooO0oO.OooO00o f124962OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34680OooO0O0 f124963OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34698OooOo00 f124964OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<C34680OooO0O0.C20372OooO0O0<C34687OooOO0>> f124965OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f124966OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f124967OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f124968OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC24229OooO0OO f124969OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final EnumC24238OooOOO f124970OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f124971OooOO0;

    public C34693OooOOOo() {
        throw null;
    }

    public C34693OooOOOo(C34680OooO0O0 c34680OooO0O0, C34698OooOo00 c34698OooOo00, List list, int i, boolean z, int i2, InterfaceC24229OooO0OO interfaceC24229OooO0OO, EnumC24238OooOOO enumC24238OooOOO, AbstractC24088OooO0oO.OooO00o oooO00o, long j) {
        this.f124963OooO00o = c34680OooO0O0;
        this.f124964OooO0O0 = c34698OooOo00;
        this.f124965OooO0OO = list;
        this.f124966OooO0Oo = i;
        this.f124968OooO0o0 = z;
        this.f124967OooO0o = i2;
        this.f124969OooO0oO = interfaceC24229OooO0OO;
        this.f124970OooO0oo = enumC24238OooOOO;
        this.f124962OooO = oooO00o;
        this.f124971OooOO0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34693OooOOOo)) {
            return false;
        }
        C34693OooOOOo c34693OooOOOo = (C34693OooOOOo) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124963OooO00o, c34693OooOOOo.f124963OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124964OooO0O0, c34693OooOOOo.f124964OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124965OooO0OO, c34693OooOOOo.f124965OooO0OO) && this.f124966OooO0Oo == c34693OooOOOo.f124966OooO0Oo && this.f124968OooO0o0 == c34693OooOOOo.f124968OooO0o0) {
            return this.f124967OooO0o == c34693OooOOOo.f124967OooO0o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124969OooO0oO, c34693OooOOOo.f124969OooO0oO) && this.f124970OooO0oo == c34693OooOOOo.f124970OooO0oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124962OooO, c34693OooOOOo.f124962OooO) && C24227OooO00o.OooO0O0(this.f124971OooOO0, c34693OooOOOo.f124971OooOO0);
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f124971OooOO0) + ((this.f124962OooO.hashCode() + ((this.f124970OooO0oo.hashCode() + ((this.f124969OooO0oO.hashCode() + C20785Oooo00o.OooO00o(this.f124967OooO0o, o00000.OooO0O0((C21445Oooo.OooO00o(this.f124965OooO0OO, (this.f124964OooO0O0.hashCode() + (this.f124963OooO00o.hashCode() * 31)) * 31, 31) + this.f124966OooO0Oo) * 31, 31, this.f124968OooO0o0), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f124963OooO00o);
        sb.append(", style=");
        sb.append(this.f124964OooO0O0);
        sb.append(", placeholders=");
        sb.append(this.f124965OooO0OO);
        sb.append(", maxLines=");
        sb.append(this.f124966OooO0Oo);
        sb.append(", softWrap=");
        sb.append(this.f124968OooO0o0);
        sb.append(", overflow=");
        int i = this.f124967OooO0o;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 3 ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f124969OooO0oO);
        sb.append(", layoutDirection=");
        sb.append(this.f124970OooO0oo);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f124962OooO);
        sb.append(", constraints=");
        sb.append((Object) C24227OooO00o.OooOO0O(this.f124971OooOO0));
        sb.append(')');
        return sb.toString();
    }
}
