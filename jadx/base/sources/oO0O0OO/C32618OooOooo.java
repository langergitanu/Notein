package oO0O0OO;

import OooOoo0.C20694Ooooo00;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oO0O00oo.C32520OooO0oo;
import oO0O0OO.C32602OooOOo0;
import oO0O0Oo0.C32703OoooOoO;
import oO0Oo00.C33194OooO0O0;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33306OooOOO0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33369OooO0oo;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0OO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32618OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33361OooO0Oo f117268OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32615OooOoo f117269OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33369OooO0oo<C33477OooO0OO, InterfaceC32620Oooo00O> f117270OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC33369OooO0oo<OooO00o, InterfaceC32596OooO0o0> f117271OooO0Oo;

    /* JADX INFO: renamed from: oO0O0OO.OooOooo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C33476OooO0O0 f117272OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<Integer> f117273OooO0O0;

        public OooO00o(C33476OooO0O0 classId, List<Integer> list) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
            this.f117272OooO00o = classId;
            this.f117273OooO0O0 = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117272OooO00o, oooO00o.f117272OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117273OooO0O0, oooO00o.f117273OooO0O0);
        }

        public final int hashCode() {
            return this.f117273OooO0O0.hashCode() + (this.f117272OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "ClassRequest(classId=" + this.f117272OooO00o + ", typeParametersCount=" + this.f117273OooO0O0 + ')';
        }
    }

    /* JADX INFO: renamed from: oO0O0OO.OooOooo$OooO0O0 */
    public static final class OooO0O0 extends oO0O0Oo0.OooOOOO {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final boolean f117274OooOoo;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final ArrayList f117275OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final C33306OooOOO0 f117276OooOooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33361OooO0Oo c33361OooO0Oo, InterfaceC32597OooO0oO container, C33479OooO0o c33479OooO0o, boolean z, int i) {
            super(c33361OooO0Oo, container, c33479OooO0o, o000oOoO.f117308OooO00o);
            kotlin.jvm.internal.OooOOO0.OooO0oO(container, "container");
            this.f117274OooOoo = z;
            oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, i);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
            Iterator<Integer> it = OooO2.iterator();
            while (((C32520OooO0oo) it).f116817OooOoO0) {
                int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
                arrayList.add(C32703OoooOoO.o00000O(this, 1, C33479OooO0o.OooO0o0("T" + iNextInt), iNextInt, c33361OooO0Oo));
            }
            this.f117275OooOooO = arrayList;
            this.f117276OooOooo = new C33306OooOOO0(this, C32638Ooooo00.OooO0O0(this), C34449Oooo0oo.OooOO0(C33194OooO0O0.OooOO0(this).OooOO0O().OooO0o0()), c33361OooO0Oo);
        }

        @Override // oO0O0OO.InterfaceC32598OooO0oo
        public final InterfaceC33342OoooOo0 OooO() {
            return this.f117276OooOooo;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.InterfaceC32612OooOoO
        public final EnumC32614OooOoOO OooO0oO() {
            return EnumC32614OooOoOO.f117261OooOo0o;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final Collection<InterfaceC32595OooO0Oo> OooOO0() {
            return C34438OooOoo0.f123458OooOo0o;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooO
        public final List<InterfaceC32637OoooOoo> OooOOOO() {
            return this.f117275OooOooO;
        }

        @Override // oO0O0OO.OooO
        public final boolean OooOo00() {
            return this.f117274OooOoo;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final InterfaceC32595OooO0Oo OooOo0o() {
            return null;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final Collection<InterfaceC32596OooO0o0> OoooO0O() {
            return C34434OooOoO.f123453OooOo0o;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final AbstractC32639Ooooo0o<AbstractC33328Oooo0O0> Ooooo00() {
            return null;
        }

        @Override // oO0O0OO.InterfaceC32612OooOoO
        public final boolean OooooO0() {
            return false;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final boolean Oooooo0() {
            return false;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final boolean OoooooO() {
            return false;
        }

        @Override // oOo0oooO.OooO00o
        public final InterfaceC34588OooO0oO getAnnotations() {
            return InterfaceC34588OooO0oO.OooO00o.f123919OooO00o;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final OooO0o getKind() {
            return OooO0o.f117230OooOo0o;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0, oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
        public final AbstractC32601OooOOo getVisibility() {
            C32602OooOOo0.C32606OooO0oo PUBLIC = C32602OooOOo0.f117243OooO0o0;
            kotlin.jvm.internal.OooOOO0.OooO0o(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // oO0O0Oo0.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
        public final boolean isExternal() {
            return false;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final boolean isInline() {
            return false;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final boolean o000000() {
            return false;
        }

        @Override // oO0O0OO.InterfaceC32612OooOoO
        public final boolean o00Oo0() {
            return false;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final oO0Oo0o0.OooOO0 o00Ooo() {
            return OooOO0.OooO0O0.f120222OooO0O0;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final InterfaceC32596OooO0o0 o00o0O() {
            return null;
        }

        @Override // oO0O0Oo0.AbstractC32688Oooo00o
        public final oO0Oo0o0.OooOO0 o0OoOo0(AbstractC33457OooO0oO kotlinTypeRefiner) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
            return OooOO0.OooO0O0.f120222OooO0O0;
        }

        @Override // oO0O0OO.InterfaceC32596OooO0o0
        public final boolean ooOO() {
            return false;
        }

        public final String toString() {
            return "class " + getName() + " (not found)";
        }
    }

    public C32618OooOooo(C33361OooO0Oo c33361OooO0Oo, InterfaceC32615OooOoo module) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        this.f117268OooO00o = c33361OooO0Oo;
        this.f117269OooO0O0 = module;
        this.f117270OooO0OO = c33361OooO0Oo.OooO0Oo(new C20694Ooooo00(this, 2));
        this.f117271OooO0Oo = c33361OooO0Oo.OooO0Oo(new Oooo000(this));
    }

    public final InterfaceC32596OooO0o0 OooO00o(C33476OooO0O0 classId, List<Integer> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        return (InterfaceC32596OooO0o0) ((C33361OooO0Oo.OooOO0O) this.f117271OooO0Oo).invoke(new OooO00o(classId, list));
    }
}
