package oO0Ooo;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21091o0000o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0O0OoO0.C25898OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32447OooOOo;
import oO00ooOO.C32463OooO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Oooo.C33514OooO0o;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34449Oooo0oo;
import oOo00OOO.C34484OooO00o;

/* JADX INFO: renamed from: oO0Ooo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33345Ooooo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25898OooO0Oo f120614OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32447OooOOo f120615OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33361OooO0Oo.OooOO0O f120616OooO0OO;

    /* JADX INFO: renamed from: oO0Ooo.Ooooo00$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC32637OoooOoo f120617OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C34484OooO00o f120618OooO0O0;

        public OooO00o(InterfaceC32637OoooOoo typeParameter, C34484OooO00o typeAttr) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
            kotlin.jvm.internal.OooOOO0.OooO0oO(typeAttr, "typeAttr");
            this.f120617OooO00o = typeParameter;
            this.f120618OooO0O0 = typeAttr;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.f120617OooO00o, this.f120617OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.f120618OooO0O0, this.f120618OooO0O0);
        }

        public final int hashCode() {
            int iHashCode = this.f120617OooO00o.hashCode();
            return this.f120618OooO0O0.hashCode() + (iHashCode * 31) + iHashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f120617OooO00o + ", typeAttr=" + this.f120618OooO0O0 + ')';
        }
    }

    public C33345Ooooo00(C25898OooO0Oo c25898OooO0Oo) {
        this.f120614OooO00o = c25898OooO0Oo;
        C33361OooO0Oo c33361OooO0Oo = new C33361OooO0Oo("Type parameter upper bound erasure results");
        this.f120615OooO0O0 = C20519OooO0Oo.OooO0OO(new C33346Ooooo0o(this));
        this.f120616OooO0OO = c33361OooO0Oo.OooO0Oo(new C33347OooooO0(this));
    }

    public final AbstractC33354o00o0O OooO00o(C34484OooO00o c34484OooO00o) {
        AbstractC33354o00o0O abstractC33354o00o0OOooOO0O;
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = c34484OooO00o.f123578OooO0oO;
        return (abstractC33328Oooo0O0 == null || (abstractC33354o00o0OOooOO0O = C33538OooO0OO.OooOO0O(abstractC33328Oooo0O0)) == null) ? (C33514OooO0o) this.f120615OooO0O0.getValue() : abstractC33354o00o0OOooOO0O;
    }

    public final AbstractC33320OooOoo OooO0O0(InterfaceC32637OoooOoo typeParameter, C34484OooO00o typeAttr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeParameter, "typeParameter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeAttr, "typeAttr");
        return (AbstractC33320OooOoo) this.f120616OooO0OO.invoke(new OooO00o(typeParameter, typeAttr));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32463OooO OooO0OO(C33356ooOO c33356ooOO, List list, C34484OooO00o c34484OooO00o) {
        AbstractC33354o00o0O abstractC33354o00o0OOooO0Oo;
        C32463OooO c32463OooO = new C32463OooO();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC33320OooOoo abstractC33320OooOoo = (AbstractC33320OooOoo) it.next();
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
            if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0) {
                Set<InterfaceC32637OoooOoo> setOooO0O0 = c34484OooO00o.OooO0O0();
                AbstractC33354o00o0O abstractC33354o00o0OO00000OO = abstractC33320OooOoo.o00000OO();
                if (abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o) {
                    AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO;
                    AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0Oo = abstractC33316OooOo0o.f120554OooOo;
                    if (!abstractC33328Oooo0O0OooO0Oo.o00000().getParameters().isEmpty() && abstractC33328Oooo0O0OooO0Oo.o00000().OooO0OO() != null) {
                        List<InterfaceC32637OoooOoo> parameters = abstractC33328Oooo0O0OooO0Oo.o00000().getParameters();
                        kotlin.jvm.internal.OooOOO0.OooO0o(parameters, "constructor.parameters");
                        List<InterfaceC32637OoooOoo> list2 = parameters;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        for (InterfaceC32637OoooOoo interfaceC32637OoooOoo : list2) {
                            InterfaceC33348OooooOO c33325Oooo = (InterfaceC33348OooooOO) oOo000Oo.OooOo.OoooO00(interfaceC32637OoooOoo.getIndex(), abstractC33320OooOoo.o000000O());
                            boolean z = setOooO0O0 != null && setOooO0O0.contains(interfaceC32637OoooOoo);
                            if (c33325Oooo == null || z) {
                                c33325Oooo = new C33325Oooo(interfaceC32637OoooOoo);
                            } else {
                                AbstractC33350Oooooo abstractC33350OoooooOooO0oO = c33356ooOO.OooO0oO();
                                AbstractC33320OooOoo type = c33325Oooo.getType();
                                kotlin.jvm.internal.OooOOO0.OooO0o(type, "argument.type");
                                if (abstractC33350OoooooOooO0oO.OooO0Oo(type) == null) {
                                }
                            }
                            arrayList.add(c33325Oooo);
                        }
                        abstractC33328Oooo0O0OooO0Oo = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0OooO0Oo, arrayList, null, 2);
                    }
                    AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0Oo2 = abstractC33316OooOo0o.f120555OooOoO0;
                    if (!abstractC33328Oooo0O0OooO0Oo2.o00000().getParameters().isEmpty() && abstractC33328Oooo0O0OooO0Oo2.o00000().OooO0OO() != null) {
                        List<InterfaceC32637OoooOoo> parameters2 = abstractC33328Oooo0O0OooO0Oo2.o00000().getParameters();
                        kotlin.jvm.internal.OooOOO0.OooO0o(parameters2, "constructor.parameters");
                        List<InterfaceC32637OoooOoo> list3 = parameters2;
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                        for (InterfaceC32637OoooOoo interfaceC32637OoooOoo2 : list3) {
                            InterfaceC33348OooooOO c33325Oooo2 = (InterfaceC33348OooooOO) oOo000Oo.OooOo.OoooO00(interfaceC32637OoooOoo2.getIndex(), abstractC33320OooOoo.o000000O());
                            boolean z2 = setOooO0O0 != null && setOooO0O0.contains(interfaceC32637OoooOoo2);
                            if (c33325Oooo2 == null || z2) {
                                c33325Oooo2 = new C33325Oooo(interfaceC32637OoooOoo2);
                            } else {
                                AbstractC33350Oooooo abstractC33350OoooooOooO0oO2 = c33356ooOO.OooO0oO();
                                AbstractC33320OooOoo type2 = c33325Oooo2.getType();
                                kotlin.jvm.internal.OooOOO0.OooO0o(type2, "argument.type");
                                if (abstractC33350OoooooOooO0oO2.OooO0Oo(type2) == null) {
                                }
                            }
                            arrayList2.add(c33325Oooo2);
                        }
                        abstractC33328Oooo0O0OooO0Oo2 = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0OooO0Oo2, arrayList2, null, 2);
                    }
                    abstractC33354o00o0OOooO0Oo = C33322OooOooO.OooO0OO(abstractC33328Oooo0O0OooO0Oo, abstractC33328Oooo0O0OooO0Oo2);
                } else {
                    if (!(abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0)) {
                        throw new C32442OooOO0o();
                    }
                    AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = (AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO;
                    if (abstractC33328Oooo0O0.o00000().getParameters().isEmpty() || abstractC33328Oooo0O0.o00000().OooO0OO() == null) {
                        abstractC33354o00o0OOooO0Oo = abstractC33328Oooo0O0;
                    } else {
                        List<InterfaceC32637OoooOoo> parameters3 = abstractC33328Oooo0O0.o00000().getParameters();
                        kotlin.jvm.internal.OooOOO0.OooO0o(parameters3, "constructor.parameters");
                        List<InterfaceC32637OoooOoo> list4 = parameters3;
                        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        for (InterfaceC32637OoooOoo interfaceC32637OoooOoo3 : list4) {
                            InterfaceC33348OooooOO c33325Oooo3 = (InterfaceC33348OooooOO) oOo000Oo.OooOo.OoooO00(interfaceC32637OoooOoo3.getIndex(), abstractC33320OooOoo.o000000O());
                            boolean z3 = setOooO0O0 != null && setOooO0O0.contains(interfaceC32637OoooOoo3);
                            if (c33325Oooo3 == null || z3) {
                                c33325Oooo3 = new C33325Oooo(interfaceC32637OoooOoo3);
                            } else {
                                AbstractC33350Oooooo abstractC33350OoooooOooO0oO3 = c33356ooOO.OooO0oO();
                                AbstractC33320OooOoo type3 = c33325Oooo3.getType();
                                kotlin.jvm.internal.OooOOO0.OooO0o(type3, "argument.type");
                                if (abstractC33350OoooooOooO0oO3.OooO0Oo(type3) == null) {
                                }
                            }
                            arrayList3.add(c33325Oooo3);
                        }
                        abstractC33354o00o0OOooO0Oo = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0, arrayList3, null, 2);
                    }
                }
                c32463OooO.add(c33356ooOO.OooO0oo(3, C21091o0000o.OooOOOO(abstractC33354o00o0OOooO0Oo, abstractC33354o00o0OO00000OO)));
            } else if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) {
                Set<InterfaceC32637OoooOoo> setOooO0O02 = c34484OooO00o.OooO0O0();
                if (setOooO0O02 == null || !setOooO0O02.contains(interfaceC32598OooO0ooOooO0OO)) {
                    List<AbstractC33320OooOoo> upperBounds = ((InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO).getUpperBounds();
                    kotlin.jvm.internal.OooOOO0.OooO0o(upperBounds, "declaration.upperBounds");
                    c32463OooO.addAll(OooO0OO(c33356ooOO, upperBounds, c34484OooO00o));
                } else {
                    c32463OooO.add(OooO00o(c34484OooO00o));
                }
            }
        }
        return C34449Oooo0oo.OooO0Oo(c32463OooO);
    }
}
