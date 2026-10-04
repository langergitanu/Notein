package oO0OOOo;

import java.util.Collection;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32612OooOoO;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.OooO0O0;
import oO0O0OO.o000oOoO;
import oO0OOOo.C32995OooOOO0;
import oO0OooO.AbstractC33456OooO0o0;
import oO0OooO.AbstractC33457OooO0oO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32989OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32989OooO0oO f119360OooO00o = new C32989OooO0oO();

    public static o000oOoO OooO0Oo(oO0O0OO.OooO00o oooO00o) {
        while (oooO00o instanceof oO0O0OO.OooO0O0) {
            oO0O0OO.OooO0O0 oooO0O0 = (oO0O0OO.OooO0O0) oooO00o;
            if (oooO0O0.getKind() != OooO0O0.OooO00o.f117221OooOo) {
                break;
            }
            Collection<? extends oO0O0OO.OooO0O0> overriddenDescriptors = oooO0O0.OooOO0o();
            kotlin.jvm.internal.OooOOO0.OooO0o(overriddenDescriptors, "overriddenDescriptors");
            oooO00o = (oO0O0OO.OooO0O0) OooOo.Ooooooo(overriddenDescriptors);
            if (oooO00o == null) {
                return null;
            }
        }
        return oooO00o.getSource();
    }

    public final boolean OooO00o(oO0O0OO.OooOO0O oooOO0O, oO0O0OO.OooOO0O oooOO0O2, boolean z) {
        if ((oooOO0O instanceof InterfaceC32596OooO0o0) && (oooOO0O2 instanceof InterfaceC32596OooO0o0)) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32596OooO0o0) oooOO0O).OooO(), ((InterfaceC32596OooO0o0) oooOO0O2).OooO());
        }
        if ((oooOO0O instanceof InterfaceC32637OoooOoo) && (oooOO0O2 instanceof InterfaceC32637OoooOoo)) {
            return OooO0O0((InterfaceC32637OoooOoo) oooOO0O, (InterfaceC32637OoooOoo) oooOO0O2, z, C32987OooO0o.f119357OooOo0o);
        }
        if (!(oooOO0O instanceof oO0O0OO.OooO00o) || !(oooOO0O2 instanceof oO0O0OO.OooO00o)) {
            return ((oooOO0O instanceof InterfaceC32620Oooo00O) && (oooOO0O2 instanceof InterfaceC32620Oooo00O)) ? kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32620Oooo00O) oooOO0O).OooO0OO(), ((InterfaceC32620Oooo00O) oooOO0O2).OooO0OO()) : kotlin.jvm.internal.OooOOO0.OooO0O0(oooOO0O, oooOO0O2);
        }
        oO0O0OO.OooO00o a = (oO0O0OO.OooO00o) oooOO0O;
        oO0O0OO.OooO00o b = (oO0O0OO.OooO00o) oooOO0O2;
        AbstractC33457OooO0oO.OooO00o kotlinTypeRefiner = AbstractC33457OooO0oO.OooO00o.f120916OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!a.equals(b)) {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(a.getName(), b.getName())) {
                return false;
            }
            if ((a instanceof InterfaceC32612OooOoO) && (b instanceof InterfaceC32612OooOoO) && ((InterfaceC32612OooOoO) a).o00Oo0() != ((InterfaceC32612OooOoO) b).o00Oo0()) {
                return false;
            }
            if ((kotlin.jvm.internal.OooOOO0.OooO0O0(a.OooO0Oo(), b.OooO0Oo()) && (!z || !kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0Oo(a), OooO0Oo(b)))) || C32982OooO.OooOOOO(a) || C32982OooO.OooOOOO(b) || !OooO0OO(a, b, C32986OooO0Oo.f119356OooOo0o, z)) {
                return false;
            }
            C32995OooOOO0 c32995OooOOO0 = new C32995OooOOO0(new C32985OooO0OO(a, b, z), kotlinTypeRefiner, AbstractC33456OooO0o0.OooO00o.f120915OooO00o);
            C32995OooOOO0.OooO0O0.OooO00o oooO00oOooO0OO = c32995OooOOO0.OooOOO0(a, b, null, true).OooO0OO();
            C32995OooOOO0.OooO0O0.OooO00o oooO00o = C32995OooOOO0.OooO0O0.OooO00o.f119379OooOo0o;
            if (oooO00oOooO0OO != oooO00o || c32995OooOOO0.OooOOO0(b, a, null, true).OooO0OO() != oooO00o) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooO0O0(InterfaceC32637OoooOoo a, InterfaceC32637OoooOoo b, boolean z, InterfaceC32508OooOOOo<? super oO0O0OO.OooOO0O, ? super oO0O0OO.OooOO0O, Boolean> equivalentCallables) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(a, "a");
        kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
        kotlin.jvm.internal.OooOOO0.OooO0oO(equivalentCallables, "equivalentCallables");
        if (a.equals(b)) {
            return true;
        }
        return !kotlin.jvm.internal.OooOOO0.OooO0O0(a.OooO0Oo(), b.OooO0Oo()) && OooO0OO(a, b, equivalentCallables, z) && a.getIndex() == b.getIndex();
    }

    public final boolean OooO0OO(oO0O0OO.OooOO0O oooOO0O, oO0O0OO.OooOO0O oooOO0O2, InterfaceC32508OooOOOo<? super oO0O0OO.OooOO0O, ? super oO0O0OO.OooOO0O, Boolean> interfaceC32508OooOOOo, boolean z) {
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = oooOO0O.OooO0Oo();
        oO0O0OO.OooOO0O oooOO0OOooO0Oo2 = oooOO0O2.OooO0Oo();
        return ((oooOO0OOooO0Oo instanceof oO0O0OO.OooO0O0) || (oooOO0OOooO0Oo2 instanceof oO0O0OO.OooO0O0)) ? interfaceC32508OooOOOo.invoke(oooOO0OOooO0Oo, oooOO0OOooO0Oo2).booleanValue() : OooO00o(oooOO0OOooO0Oo, oooOO0OOooO0Oo2, z);
    }
}
