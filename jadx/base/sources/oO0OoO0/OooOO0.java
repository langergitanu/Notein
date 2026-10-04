package oO0OoO0;

import java.util.Iterator;
import java.util.Set;
import o00OO0o.C24991OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0OO00.C32892OooOOoo;
import oO0OO00.C32895OooOo0O;
import oO0OO0Oo.AbstractC32916OooO00o;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.C32923OooO0oo;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OoOO.AbstractC33273OooOO0o;
import oO0OoOO.C33263OooO0Oo;
import oO0Ooo0.InterfaceC33357OooO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34449Oooo0oo;
import ooOOOoOo.InterfaceC35102OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Set<C33476OooO0O0> f120261OooO0OO = C34449Oooo0oo.OooOO0(C33476OooO0O0.OooOO0(OooOOO.OooO00o.f117152OooO0OO.OooO0oO()));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33239OooOO0o f120262OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33357OooO f120263OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C33476OooO0O0 f120264OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33238OooO0oo f120265OooO0O0;

        public OooO00o(C33476OooO0O0 classId, C33238OooO0oo c33238OooO0oo) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
            this.f120264OooO00o = classId;
            this.f120265OooO0O0 = c33238OooO0oo;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120264OooO00o, ((OooO00o) obj).f120264OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f120264OooO00o.hashCode();
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooO00o, InterfaceC32596OooO0o0> {
        public OooO0O0() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final InterfaceC32596OooO0o0 invoke(OooO00o oooO00o) {
            C33238OooO0oo c33238OooO0ooOooO00o;
            Object next;
            OooOOO oooOOOOooO00o;
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0OO;
            OooO00o key = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
            OooOO0 oooOO02 = OooOO0.this;
            oooOO02.getClass();
            C33239OooOO0o c33239OooOO0o = oooOO02.f120262OooO00o;
            Iterator<InterfaceC35102OooO0O0> it = c33239OooOO0o.f120278OooOO0O.iterator();
            do {
                boolean zHasNext = it.hasNext();
                C33476OooO0O0 c33476OooO0O0 = key.f120264OooO00o;
                if (!zHasNext) {
                    if (!OooOO0.f120261OooO0OO.contains(c33476OooO0O0) && ((c33238OooO0ooOooO00o = key.f120265OooO0O0) != null || (c33238OooO0ooOooO00o = c33239OooOO0o.f120272OooO0Oo.OooO00o(c33476OooO0O0)) != null)) {
                        C33476OooO0O0 c33476OooO0O0OooO0o = c33476OooO0O0.OooO0o();
                        AbstractC32916OooO00o abstractC32916OooO00o = c33238OooO0ooOooO00o.f120259OooO0OO;
                        InterfaceC32918OooO0OO interfaceC32918OooO0OO = c33238OooO0ooOooO00o.f120257OooO00o;
                        oO0OO00.OooO0O0 oooO0O0 = c33238OooO0ooOooO00o.f120258OooO0O0;
                        if (c33476OooO0O0OooO0o != null) {
                            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = oooOO02.OooO00o(c33476OooO0O0OooO0o, null);
                            C33263OooO0Oo c33263OooO0Oo = interfaceC32596OooO0o0OooO00o instanceof C33263OooO0Oo ? (C33263OooO0Oo) interfaceC32596OooO0o0OooO00o : null;
                            if (c33263OooO0Oo != null) {
                                C33479OooO0o c33479OooO0oOooO = c33476OooO0O0.OooO();
                                kotlin.jvm.internal.OooOOO0.OooO0o(c33479OooO0oOooO, "classId.shortClassName");
                                if (c33263OooO0Oo.o000000o().OooOOO0().contains(c33479OooO0oOooO)) {
                                    oooOOOOooO00o = c33263OooO0Oo.f120407Oooo00o;
                                    return new C33263OooO0Oo(oooOOOOooO00o, oooO0O0, interfaceC32918OooO0OO, abstractC32916OooO00o, c33238OooO0ooOooO00o.f120260OooO0Oo);
                                }
                            }
                        } else {
                            C33477OooO0OO c33477OooO0OOOooO0oO = c33476OooO0O0.OooO0oO();
                            kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "classId.packageFqName");
                            Iterator it2 = C24991OooO00o.OooO0o0(c33239OooOO0o.f120273OooO0o, c33477OooO0OOOooO0oO).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                InterfaceC32620Oooo00O interfaceC32620Oooo00O = (InterfaceC32620Oooo00O) next;
                                if (!(interfaceC32620Oooo00O instanceof OooOOOO)) {
                                    break;
                                }
                                OooOOOO oooOOOO = (OooOOOO) interfaceC32620Oooo00O;
                                C33479OooO0o c33479OooO0oOooO2 = c33476OooO0O0.OooO();
                                kotlin.jvm.internal.OooOOO0.OooO0o(c33479OooO0oOooO2, "classId.shortClassName");
                                oooOOOO.getClass();
                                if (((AbstractC33273OooOO0o) ((AbstractC33240OooOOOo) oooOOOO).OooOOO0()).OooOOO0().contains(c33479OooO0oOooO2)) {
                                    break;
                                }
                            }
                            InterfaceC32620Oooo00O interfaceC32620Oooo00O2 = (InterfaceC32620Oooo00O) next;
                            if (interfaceC32620Oooo00O2 != null) {
                                C32892OooOOoo c32892OooOOoo = oooO0O0.f118104OoooOoo;
                                kotlin.jvm.internal.OooOOO0.OooO0o(c32892OooOOoo, "classProto.typeTable");
                                C32922OooO0oO c32922OooO0oO = new C32922OooO0oO(c32892OooOOoo);
                                C32923OooO0oo c32923OooO0oo = C32923OooO0oo.f118802OooO0O0;
                                C32895OooOo0O c32895OooOo0O = oooO0O0.f118106Ooooo0o;
                                kotlin.jvm.internal.OooOOO0.OooO0o(c32895OooOo0O, "classProto.versionRequirementTable");
                                oooOOOOooO00o = oooOO02.f120262OooO00o.OooO00o(interfaceC32620Oooo00O2, interfaceC32918OooO0OO, c32922OooO0oO, C32923OooO0oo.OooO00o.OooO00o(c32895OooOo0O), abstractC32916OooO00o, null);
                                abstractC32916OooO00o = abstractC32916OooO00o;
                                return new C33263OooO0Oo(oooOOOOooO00o, oooO0O0, interfaceC32918OooO0OO, abstractC32916OooO00o, c33238OooO0ooOooO00o.f120260OooO0Oo);
                            }
                        }
                    }
                    return null;
                }
                interfaceC32596OooO0o0OooO0OO = it.next().OooO0OO(c33476OooO0O0);
            } while (interfaceC32596OooO0o0OooO0OO == null);
            return interfaceC32596OooO0o0OooO0OO;
        }
    }

    public OooOO0(C33239OooOO0o components) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(components, "components");
        this.f120262OooO00o = components;
        this.f120263OooO0O0 = components.f120269OooO00o.OooO0o0(new OooO0O0());
    }

    public final InterfaceC32596OooO0o0 OooO00o(C33476OooO0O0 classId, C33238OooO0oo c33238OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        return (InterfaceC32596OooO0o0) this.f120263OooO0O0.invoke(new OooO00o(classId, c33238OooO0oo));
    }
}
