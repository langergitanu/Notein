package Oooooo0;

import OooOOO0.AbstractC20449OooO0Oo;
import OooooO0.C21285OooO00o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooOO.AbstractC21341OoooOO0;
import OooooOO.C21331Oooo0O0;
import OooooOO.C21332Oooo0OO;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21349OooooO0;
import OooooOO.C21368o0ooOoO;
import OooooOO.InterfaceC21342OoooOOO;
import OooooOO.InterfaceC21352Oooooo;
import OooooOO.InterfaceC21370ooOO;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24230OooO0Oo;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: renamed from: Oooooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21397OooO00o implements InterfaceC21402OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f61911OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C18987OooO00o f61912OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C21331Oooo0O0 f61913OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21331Oooo0O0 f61914OooOoO0;

    /* JADX INFO: renamed from: Oooooo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C18987OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public InterfaceC24229OooO0OO f61915OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public EnumC24238OooOOO f61916OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InterfaceC21342OoooOOO f61917OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f61918OooO0Oo;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18987OooO00o)) {
                return false;
            }
            C18987OooO00o c18987OooO00o = (C18987OooO00o) obj;
            return OooOOO0.OooO0O0(this.f61915OooO00o, c18987OooO00o.f61915OooO00o) && this.f61916OooO0O0 == c18987OooO00o.f61916OooO0O0 && OooOOO0.OooO0O0(this.f61917OooO0OO, c18987OooO00o.f61917OooO0OO) && C21293OooOO0.OooO00o(this.f61918OooO0Oo, c18987OooO00o.f61918OooO0Oo);
        }

        public final int hashCode() {
            int iHashCode = (this.f61917OooO0OO.hashCode() + ((this.f61916OooO0O0.hashCode() + (this.f61915OooO00o.hashCode() * 31)) * 31)) * 31;
            long j = this.f61918OooO0Oo;
            int i = C21293OooOO0.f61730OooO0Oo;
            return Long.hashCode(j) + iHashCode;
        }

        public final String toString() {
            return "DrawParams(density=" + this.f61915OooO00o + ", layoutDirection=" + this.f61916OooO0O0 + ", canvas=" + this.f61917OooO0OO + ", size=" + ((Object) C21293OooOO0.OooO0o(this.f61918OooO0Oo)) + ')';
        }
    }

    /* JADX INFO: renamed from: Oooooo0.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C21398OooO0O0 f61919OooO00o = new C21398OooO0O0(this);

        public OooO0O0() {
        }

        public final InterfaceC21342OoooOOO OooO00o() {
            return C21397OooO00o.this.f61912OooOo0o.f61917OooO0OO;
        }

        public final long OooO0O0() {
            return C21397OooO00o.this.f61912OooOo0o.f61918OooO0Oo;
        }

        public final void OooO0OO(long j) {
            C21397OooO00o.this.f61912OooOo0o.f61918OooO0Oo = j;
        }
    }

    public C21397OooO00o() {
        C24230OooO0Oo c24230OooO0Oo = C21399OooO0OO.f61922OooO00o;
        EnumC24238OooOOO enumC24238OooOOO = EnumC24238OooOOO.f81494OooOo0o;
        C21401OooO0o c21401OooO0o = new C21401OooO0o();
        long j = C21293OooOO0.f61728OooO0O0;
        C18987OooO00o c18987OooO00o = new C18987OooO00o();
        c18987OooO00o.f61915OooO00o = c24230OooO0Oo;
        c18987OooO00o.f61916OooO0O0 = enumC24238OooOOO;
        c18987OooO00o.f61917OooO0OO = c21401OooO0o;
        c18987OooO00o.f61918OooO0Oo = j;
        this.f61912OooOo0o = c18987OooO00o;
        this.f61911OooOo = new OooO0O0();
    }

    public static C21331Oooo0O0 OooO0O0(C21397OooO00o c21397OooO00o, long j, AbstractC20449OooO0Oo abstractC20449OooO0Oo, int i) {
        C21331Oooo0O0 c21331Oooo0O0OooO0Oo = c21397OooO00o.OooO0Oo(abstractC20449OooO0Oo);
        if (!C21348Ooooo0o.OooO0OO(c21331Oooo0O0OooO0Oo.OooO0OO(), j)) {
            c21331Oooo0O0OooO0Oo.OooOO0o(j);
        }
        if (c21331Oooo0O0OooO0Oo.f61742OooO0OO != null) {
            c21331Oooo0O0OooO0Oo.OooOOOO(null);
        }
        if (!OooOOO0.OooO0O0(c21331Oooo0O0OooO0Oo.f61743OooO0Oo, null)) {
            c21331Oooo0O0OooO0Oo.OooOOO0(null);
        }
        if (c21331Oooo0O0OooO0Oo.f61741OooO0O0 != i) {
            c21331Oooo0O0OooO0Oo.OooOO0O(i);
        }
        if (c21331Oooo0O0OooO0Oo.OooO0Oo() == 1) {
            return c21331Oooo0O0OooO0Oo;
        }
        c21331Oooo0O0OooO0Oo.OooOOO(1);
        return c21331Oooo0O0OooO0Oo;
    }

    public final C21331Oooo0O0 OooO0OO(AbstractC21341OoooOO0 abstractC21341OoooOO0, AbstractC20449OooO0Oo abstractC20449OooO0Oo, float f, C21349OooooO0 c21349OooooO0, int i, int i2) {
        C21331Oooo0O0 c21331Oooo0O0OooO0Oo = OooO0Oo(abstractC20449OooO0Oo);
        if (abstractC21341OoooOO0 != null) {
            abstractC21341OoooOO0.OooO00o(f, OooOOo0(), c21331Oooo0O0OooO0Oo);
        } else if (c21331Oooo0O0OooO0Oo.OooO0O0() != f) {
            c21331Oooo0O0OooO0Oo.OooOO0(f);
        }
        if (!OooOOO0.OooO0O0(c21331Oooo0O0OooO0Oo.f61743OooO0Oo, c21349OooooO0)) {
            c21331Oooo0O0OooO0Oo.OooOOO0(c21349OooooO0);
        }
        if (c21331Oooo0O0OooO0Oo.f61741OooO0O0 != i) {
            c21331Oooo0O0OooO0Oo.OooOO0O(i);
        }
        if (c21331Oooo0O0OooO0Oo.OooO0Oo() == i2) {
            return c21331Oooo0O0OooO0Oo;
        }
        c21331Oooo0O0OooO0Oo.OooOOO(i2);
        return c21331Oooo0O0OooO0Oo;
    }

    public final C21331Oooo0O0 OooO0Oo(AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        if (OooOOO0.OooO0O0(abstractC20449OooO0Oo, C21403OooO0oO.f61923OooOo0o)) {
            C21331Oooo0O0 c21331Oooo0O0 = this.f61914OooOoO0;
            if (c21331Oooo0O0 != null) {
                return c21331Oooo0O0;
            }
            C21331Oooo0O0 c21331Oooo0O0OooO00o = C21332Oooo0OO.OooO00o();
            c21331Oooo0O0OooO00o.OooOo00(0);
            this.f61914OooOoO0 = c21331Oooo0O0OooO00o;
            return c21331Oooo0O0OooO00o;
        }
        if (!(abstractC20449OooO0Oo instanceof C21404OooO0oo)) {
            throw new C32442OooOO0o();
        }
        C21331Oooo0O0 c21331Oooo0O0OooO00o2 = this.f61913OooOoO;
        if (c21331Oooo0O0OooO00o2 == null) {
            c21331Oooo0O0OooO00o2 = C21332Oooo0OO.OooO00o();
            c21331Oooo0O0OooO00o2.OooOo00(1);
            this.f61913OooOoO = c21331Oooo0O0OooO00o2;
        }
        float fOooO = c21331Oooo0O0OooO00o2.OooO();
        C21404OooO0oo c21404OooO0oo = (C21404OooO0oo) abstractC20449OooO0Oo;
        float f = c21404OooO0oo.f61925OooOo0o;
        if (fOooO != f) {
            c21331Oooo0O0OooO00o2.OooOOoo(f);
        }
        int iOooO0o = c21331Oooo0O0OooO00o2.OooO0o();
        int i = c21404OooO0oo.f61927OooOoO0;
        if (iOooO0o != i) {
            c21331Oooo0O0OooO00o2.OooOOOo(i);
        }
        float fOooO0oo = c21331Oooo0O0OooO00o2.OooO0oo();
        float f2 = c21404OooO0oo.f61924OooOo;
        if (fOooO0oo != f2) {
            c21331Oooo0O0OooO00o2.OooOOo(f2);
        }
        int iOooO0oO = c21331Oooo0O0OooO00o2.OooO0oO();
        int i2 = c21404OooO0oo.f61926OooOoO;
        if (iOooO0oO != i2) {
            c21331Oooo0O0OooO00o2.OooOOo0(i2);
        }
        return c21331Oooo0O0OooO00o2;
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void OooOoOO(AbstractC21341OoooOO0 abstractC21341OoooOO0, long j, long j2, float f, float f2) {
        InterfaceC21342OoooOOO interfaceC21342OoooOOO = this.f61912OooOo0o.f61917OooO0OO;
        C21331Oooo0O0 c21331Oooo0O0OooO00o = this.f61913OooOoO;
        if (c21331Oooo0O0OooO00o == null) {
            c21331Oooo0O0OooO00o = C21332Oooo0OO.OooO00o();
            c21331Oooo0O0OooO00o.OooOo00(1);
            this.f61913OooOoO = c21331Oooo0O0OooO00o;
        }
        abstractC21341OoooOO0.OooO00o(f2, OooOOo0(), c21331Oooo0O0OooO00o);
        if (!OooOOO0.OooO0O0(c21331Oooo0O0OooO00o.f61743OooO0Oo, null)) {
            c21331Oooo0O0OooO00o.OooOOO0(null);
        }
        if (c21331Oooo0O0OooO00o.f61741OooO0O0 != 3) {
            c21331Oooo0O0OooO00o.OooOO0O(3);
        }
        if (c21331Oooo0O0OooO00o.OooO() != f) {
            c21331Oooo0O0OooO00o.OooOOoo(f);
        }
        if (c21331Oooo0O0OooO00o.OooO0oo() != 4.0f) {
            c21331Oooo0O0OooO00o.OooOOo(4.0f);
        }
        if (c21331Oooo0O0OooO00o.OooO0o() != 0) {
            c21331Oooo0O0OooO00o.OooOOOo(0);
        }
        if (c21331Oooo0O0OooO00o.OooO0oO() != 0) {
            c21331Oooo0O0OooO00o.OooOOo0(0);
        }
        if (c21331Oooo0O0OooO00o.OooO0Oo() != 1) {
            c21331Oooo0O0OooO00o.OooOOO(1);
        }
        interfaceC21342OoooOOO.OooO0oo(j, j2, c21331Oooo0O0OooO00o);
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void Oooo0o0(InterfaceC21370ooOO path, AbstractC21341OoooOO0 brush, float f, AbstractC20449OooO0Oo style) {
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(brush, "brush");
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooOo00(path, OooO0OO(brush, style, f, null, 3, 1));
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void Oooo0oo(long j, long j2, long j3, AbstractC20449OooO0Oo style, int i) {
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooOOO0(C21290OooO0o0.OooO0OO(j2), C21290OooO0o0.OooO0Oo(j2), C21293OooOO0.OooO0Oo(j3) + C21290OooO0o0.OooO0OO(j2), C21293OooOO0.OooO0O0(j3) + C21290OooO0o0.OooO0Oo(j2), OooO0O0(this, j, style, i));
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void OoooO0O(C21368o0ooOoO brush, long j, long j2, long j3, float f, AbstractC20449OooO0Oo style) {
        OooOOO0.OooO0oO(brush, "brush");
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooO0oO(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), C21293OooOO0.OooO0Oo(j2) + C21290OooO0o0.OooO0OO(j), C21293OooOO0.OooO0O0(j2) + C21290OooO0o0.OooO0Oo(j), C21285OooO00o.OooO0O0(j3), C21285OooO00o.OooO0OO(j3), OooO0OO(brush, style, f, null, 3, 1));
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void OoooOO0(C21368o0ooOoO brush, long j, long j2, float f, AbstractC20449OooO0Oo style) {
        OooOOO0.OooO0oO(brush, "brush");
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooOOO0(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), C21293OooOO0.OooO0Oo(j2) + C21290OooO0o0.OooO0OO(j), C21293OooOO0.OooO0O0(j2) + C21290OooO0o0.OooO0Oo(j), OooO0OO(brush, style, f, null, 3, 1));
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final OooO0O0 OoooOo0() {
        return this.f61911OooOo;
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void OooooO0(InterfaceC21352Oooooo image, long j, long j2, long j3, long j4, float f, AbstractC20449OooO0Oo style, C21349OooooO0 c21349OooooO0, int i, int i2) {
        OooOOO0.OooO0oO(image, "image");
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooO(image, j, j2, j3, j4, OooO0OO(null, style, f, c21349OooooO0, i, i2));
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void OooooOo(long j, float f, long j2, AbstractC20449OooO0Oo style) {
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooOOO(f, j2, OooO0O0(this, j, style, 3));
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float getDensity() {
        return this.f61912OooOo0o.f61915OooO00o.getDensity();
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final EnumC24238OooOOO getLayoutDirection() {
        return this.f61912OooOo0o.f61916OooO0O0;
    }

    @Override // Oooooo0.InterfaceC21402OooO0o0
    public final void o000oOoO(InterfaceC21352Oooooo interfaceC21352Oooooo, long j, AbstractC20449OooO0Oo style, C21349OooooO0 c21349OooooO0) {
        OooOOO0.OooO0oO(style, "style");
        this.f61912OooOo0o.f61917OooO0OO.OooOO0(interfaceC21352Oooooo, j, OooO0OO(null, style, 1.0f, c21349OooooO0, 3, 1));
    }

    @Override // o0000Ooo.InterfaceC24229OooO0OO
    public final float o0ooOoO() {
        return this.f61912OooOo0o.f61915OooO00o.o0ooOoO();
    }
}
