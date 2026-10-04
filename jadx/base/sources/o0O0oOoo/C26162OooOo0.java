package o0O0oOoo;

/* JADX INFO: renamed from: o0O0oOoo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26162OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f89295OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC26161OooOOoo f89296OooO0O0;

    static {
        OooO oooO = OooO.f89235OooOo0o;
        EnumC26161OooOOoo enumC26161OooOOoo = EnumC26161OooOOoo.f89287OooOo0o;
        new C26162OooOo0(oooO, enumC26161OooOOoo);
        EnumC26161OooOOoo enumC26161OooOOoo2 = EnumC26161OooOOoo.f89286OooOo;
        new C26162OooOo0(oooO, enumC26161OooOOoo2);
        OooO oooO2 = OooO.f89234OooOo;
        new C26162OooOo0(oooO2, enumC26161OooOOoo);
        new C26162OooOo0(oooO2, enumC26161OooOOoo2);
    }

    public C26162OooOo0(OooO baseStyle, EnumC26161OooOOoo selectionStyle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(baseStyle, "baseStyle");
        kotlin.jvm.internal.OooOOO0.OooO0oO(selectionStyle, "selectionStyle");
        this.f89295OooO00o = baseStyle;
        this.f89296OooO0O0 = selectionStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26162OooOo0)) {
            return false;
        }
        C26162OooOo0 c26162OooOo0 = (C26162OooOo0) obj;
        return this.f89295OooO00o == c26162OooOo0.f89295OooO00o && this.f89296OooO0O0 == c26162OooOo0.f89296OooO0O0;
    }

    public final int hashCode() {
        return this.f89296OooO0O0.hashCode() + (this.f89295OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableSymbolButtonVariant(baseStyle=" + this.f89295OooO00o + ", selectionStyle=" + this.f89296OooO0O0 + ")";
    }
}
