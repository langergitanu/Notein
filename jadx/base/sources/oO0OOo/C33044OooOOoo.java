package oO0OOo;

import oO00ooO.C32442OooOO0o;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.C33351Oooooo0;
import oO0OooO0.C33476OooO0O0;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;
import oO0o000.C33538OooO0OO;

/* JADX INFO: renamed from: oO0OOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33044OooOOoo extends AbstractC33038OooO0oO<OooO00o> {

    /* JADX INFO: renamed from: oO0OOo.OooOOoo$OooO00o */
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: oO0OOo.OooOOoo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20295OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final AbstractC33320OooOoo f119492OooO00o;

            public C20295OooO00o(AbstractC33320OooOoo abstractC33320OooOoo) {
                this.f119492OooO00o = abstractC33320OooOoo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C20295OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f119492OooO00o, ((C20295OooO00o) obj).f119492OooO00o);
            }

            public final int hashCode() {
                return this.f119492OooO00o.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f119492OooO00o + ')';
            }
        }

        /* JADX INFO: renamed from: oO0OOo.OooOOoo$OooO00o$OooO0O0 */
        public static final class OooO0O0 extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final C33036OooO0o f119493OooO00o;

            public OooO0O0(C33036OooO0o c33036OooO0o) {
                this.f119493OooO00o = c33036OooO0o;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f119493OooO00o, ((OooO0O0) obj).f119493OooO00o);
            }

            public final int hashCode() {
                return this.f119493OooO00o.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f119493OooO00o + ')';
            }
        }
    }

    public C33044OooOOoo(C33476OooO0O0 c33476OooO0O0, int i) {
        super(new OooO00o.OooO0O0(new C33036OooO0o(c33476OooO0O0, i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0OOo.AbstractC33038OooO0oO
    public final AbstractC33320OooOoo OooO00o(InterfaceC32615OooOoo module) {
        AbstractC33320OooOoo abstractC33320OooOooOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        C33339OoooOOO.f120598OooOo.getClass();
        C33339OoooOOO c33339OoooOOO = C33339OoooOOO.f120599OooOoO0;
        oO0O0O0o.OooOO0 oooOO0OooOO0O = module.OooOO0O();
        oooOO0OooOO0O.getClass();
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO = oooOO0OooOO0O.OooO(OooOOO.OooO00o.f117180Oooo.OooO0oO());
        T t = this.f119483OooO00o;
        OooO00o oooO00o = (OooO00o) t;
        if (oooO00o instanceof OooO00o.C20295OooO00o) {
            abstractC33320OooOooOooO0OO = ((OooO00o.C20295OooO00o) t).f119492OooO00o;
        } else {
            if (!(oooO00o instanceof OooO00o.OooO0O0)) {
                throw new C32442OooOO0o();
            }
            C33036OooO0o c33036OooO0o = ((OooO00o.OooO0O0) t).f119493OooO00o;
            C33476OooO0O0 c33476OooO0O0 = c33036OooO0o.f119481OooO00o;
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = oO0O0OO.OooOo00.OooO00o(module, c33476OooO0O0);
            int i = c33036OooO0o.f119482OooO0O0;
            if (interfaceC32596OooO0o0OooO00o == null) {
                EnumC33517OooO0oo enumC33517OooO0oo = EnumC33517OooO0oo.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String string = c33476OooO0O0.toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "classId.toString()");
                abstractC33320OooOooOooO0OO = C33509OooO.OooO0OO(enumC33517OooO0oo, string, String.valueOf(i));
            } else {
                AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = interfaceC32596OooO0o0OooO00o.OooOOO();
                kotlin.jvm.internal.OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "descriptor.defaultType");
                AbstractC33354o00o0O abstractC33354o00o0OOooOO0O = C33538OooO0OO.OooOO0O(abstractC33328Oooo0O0OooOOO);
                for (int i2 = 0; i2 < i; i2++) {
                    abstractC33354o00o0OOooOO0O = module.OooOO0O().OooO0oo(abstractC33354o00o0OOooOO0O);
                }
                abstractC33320OooOooOooO0OO = abstractC33354o00o0OOooOO0O;
            }
        }
        return C33322OooOooO.OooO0Oo(c33339OoooOOO, interfaceC32596OooO0o0OooO, com.facebook.soloader.OooOo.OooO0oO(new C33351Oooooo0(abstractC33320OooOooOooO0OO)));
    }
}
