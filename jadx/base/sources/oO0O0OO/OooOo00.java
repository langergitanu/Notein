package oO0O0OO;

import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OOOo.InterfaceC33000OooOOoo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 {

    public /* synthetic */ class OooO00o extends kotlin.jvm.internal.OooOO0O implements InterfaceC32507OooOO0o<C33476OooO0O0, C33476OooO0O0> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117256OooOo0o = new OooO00o(1);

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
        public final InterfaceC34596OooO0o getOwner() {
            return C24035Oooo00o.f80943OooO00o.OooO0O0(C33476OooO0O0.class);
        }

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C33476OooO0O0 invoke(C33476OooO0O0 c33476OooO0O0) {
            C33476OooO0O0 p0 = c33476OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
            return p0.OooO0o();
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33476OooO0O0, Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f117257OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Integer invoke(C33476OooO0O0 c33476OooO0O0) {
            C33476OooO0O0 it = c33476OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return 0;
        }
    }

    public static final InterfaceC32596OooO0o0 OooO00o(InterfaceC32615OooOoo interfaceC32615OooOoo, C33476OooO0O0 classId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32615OooOoo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0O0 = OooO0O0(interfaceC32615OooOoo, classId);
        if (interfaceC32598OooO0ooOooO0O0 instanceof InterfaceC32596OooO0o0) {
            return (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0O0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC32598OooO0oo OooO0O0(InterfaceC32615OooOoo interfaceC32615OooOoo, C33476OooO0O0 classId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32615OooOoo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        InterfaceC33000OooOOoo interfaceC33000OooOOoo = (InterfaceC33000OooOOoo) interfaceC32615OooOoo.OooooOo(oO0OOOo.OooOo00.f119387OooO00o);
        InterfaceC32615OooOoo interfaceC32615OooOooOooO00o = interfaceC33000OooOOoo != null ? interfaceC33000OooOOoo.OooO00o() : null;
        oOo0o0oO.OooO0O0 oooO0O0 = oOo0o0oO.OooO0O0.f123890OooOoo;
        if (interfaceC32615OooOooOooO00o == null) {
            C33477OooO0OO c33477OooO0OOOooO0oO = classId.OooO0oO();
            kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "classId.packageFqName");
            InterfaceC32623Oooo0OO interfaceC32623Oooo0OOO00oO0o = interfaceC32615OooOoo.o00oO0o(c33477OooO0OOOooO0oO);
            List<C33479OooO0o> listOooO0o0 = classId.OooO0oo().f120971OooO00o.OooO0o0();
            oO0Oo0o0.OooOO0 oooOO0OooOOO0 = interfaceC32623Oooo0OOO00oO0o.OooOOO0();
            Object objOooo0oO = oOo000Oo.OooOo.Oooo0oO(listOooO0o0);
            kotlin.jvm.internal.OooOOO0.OooO0o(objOooo0oO, "segments.first()");
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = ((oO0Oo0o0.OooO00o) oooOO0OooOOO0).OooO0oO((C33479OooO0o) objOooo0oO, oooO0O0);
            if (interfaceC32598OooO0ooOooO0oO != null) {
                for (C33479OooO0o name : listOooO0o0.subList(1, listOooO0o0.size())) {
                    if (interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32596OooO0o0) {
                        oO0Oo0o0.OooOO0 oooOO0OooOooo = ((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO).OooOooo();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name, "name");
                        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO2 = oooOO0OooOooo.OooO0oO(name, oooO0O0);
                        interfaceC32598OooO0ooOooO0oO = interfaceC32598OooO0ooOooO0oO2 instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO2 : null;
                        if (interfaceC32598OooO0ooOooO0oO != null) {
                        }
                    }
                }
                return interfaceC32598OooO0ooOooO0oO;
            }
        } else {
            C33477OooO0OO c33477OooO0OOOooO0oO2 = classId.OooO0oO();
            kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO2, "classId.packageFqName");
            InterfaceC32623Oooo0OO interfaceC32623Oooo0OOO00oO0o2 = interfaceC32615OooOooOooO00o.o00oO0o(c33477OooO0OOOooO0oO2);
            List<C33479OooO0o> listOooO0o02 = classId.OooO0oo().f120971OooO00o.OooO0o0();
            oO0Oo0o0.OooOO0 oooOO0OooOOO02 = interfaceC32623Oooo0OOO00oO0o2.OooOOO0();
            Object objOooo0oO2 = oOo000Oo.OooOo.Oooo0oO(listOooO0o02);
            kotlin.jvm.internal.OooOOO0.OooO0o(objOooo0oO2, "segments.first()");
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO3 = ((oO0Oo0o0.OooO00o) oooOO0OooOOO02).OooO0oO((C33479OooO0o) objOooo0oO2, oooO0O0);
            if (interfaceC32598OooO0ooOooO0oO3 == null) {
                interfaceC32598OooO0ooOooO0oO3 = null;
                if (interfaceC32598OooO0ooOooO0oO3 == null) {
                    return interfaceC32598OooO0ooOooO0oO3;
                }
                C33477OooO0OO c33477OooO0OOOooO0oO3 = classId.OooO0oO();
                kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO3, "classId.packageFqName");
                InterfaceC32623Oooo0OO interfaceC32623Oooo0OOO00oO0o3 = interfaceC32615OooOoo.o00oO0o(c33477OooO0OOOooO0oO3);
                List<C33479OooO0o> listOooO0o03 = classId.OooO0oo().f120971OooO00o.OooO0o0();
                oO0Oo0o0.OooOO0 oooOO0OooOOO03 = interfaceC32623Oooo0OOO00oO0o3.OooOOO0();
                Object objOooo0oO3 = oOo000Oo.OooOo.Oooo0oO(listOooO0o03);
                kotlin.jvm.internal.OooOOO0.OooO0o(objOooo0oO3, "segments.first()");
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO4 = ((oO0Oo0o0.OooO00o) oooOO0OooOOO03).OooO0oO((C33479OooO0o) objOooo0oO3, oooO0O0);
                if (interfaceC32598OooO0ooOooO0oO4 != null) {
                    for (C33479OooO0o name2 : listOooO0o03.subList(1, listOooO0o03.size())) {
                        if (interfaceC32598OooO0ooOooO0oO4 instanceof InterfaceC32596OooO0o0) {
                            oO0Oo0o0.OooOO0 oooOO0OooOooo2 = ((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO4).OooOooo();
                            kotlin.jvm.internal.OooOOO0.OooO0o(name2, "name");
                            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO5 = oooOO0OooOooo2.OooO0oO(name2, oooO0O0);
                            interfaceC32598OooO0ooOooO0oO4 = interfaceC32598OooO0ooOooO0oO5 instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO5 : null;
                            if (interfaceC32598OooO0ooOooO0oO4 != null) {
                            }
                        }
                    }
                    return interfaceC32598OooO0ooOooO0oO4;
                }
            } else {
                for (C33479OooO0o name3 : listOooO0o02.subList(1, listOooO0o02.size())) {
                    if (interfaceC32598OooO0ooOooO0oO3 instanceof InterfaceC32596OooO0o0) {
                        oO0Oo0o0.OooOO0 oooOO0OooOooo3 = ((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO3).OooOooo();
                        kotlin.jvm.internal.OooOOO0.OooO0o(name3, "name");
                        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO6 = oooOO0OooOooo3.OooO0oO(name3, oooO0O0);
                        interfaceC32598OooO0ooOooO0oO3 = interfaceC32598OooO0ooOooO0oO6 instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO6 : null;
                        if (interfaceC32598OooO0ooOooO0oO3 != null) {
                        }
                    }
                    interfaceC32598OooO0ooOooO0oO3 = null;
                }
                if (interfaceC32598OooO0ooOooO0oO3 == null) {
                }
            }
        }
        return null;
    }

    public static final InterfaceC32596OooO0o0 OooO0OO(InterfaceC32615OooOoo interfaceC32615OooOoo, C33476OooO0O0 classId, C32618OooOooo notFoundClasses) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32615OooOoo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notFoundClasses, "notFoundClasses");
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = OooO00o(interfaceC32615OooOoo, classId);
        return interfaceC32596OooO0o0OooO00o != null ? interfaceC32596OooO0o0OooO00o : notFoundClasses.OooO00o(classId, C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33574OooOOO0.OooO(classId, OooO00o.f117256OooOo0o), OooO0O0.f117257OooOo0o)));
    }
}
