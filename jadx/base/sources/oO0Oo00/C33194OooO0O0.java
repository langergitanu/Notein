package oO0Oo00;

import com.facebook.soloader.OooOo;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O0o.OooOO0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32626Oooo0oO;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO;
import oO0OOOo.C32982OooO;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33552OooO00o;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0Oo00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33194OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f120130OooO00o = 0;

    /* JADX INFO: renamed from: oO0Oo00.OooO0O0$OooO00o */
    public /* synthetic */ class OooO00o extends OooOO0O implements InterfaceC32507OooOO0o<InterfaceC32641OooooOO, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f120131OooOo0o = new OooO00o(1);

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
        public final InterfaceC34596OooO0o getOwner() {
            return C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC32641OooooOO.class);
        }

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(InterfaceC32641OooooOO interfaceC32641OooooOO) {
            InterfaceC32641OooooOO p0 = interfaceC32641OooooOO;
            OooOOO0.OooO0oO(p0, "p0");
            return Boolean.valueOf(p0.Oooo0o());
        }
    }

    static {
        C33479OooO0o.OooO0o0("value");
    }

    public static final AbstractC33457OooO0oO.OooO00o OooO(InterfaceC32615OooOoo interfaceC32615OooOoo) {
        OooOOO0.OooO0oO(interfaceC32615OooOoo, "<this>");
        return AbstractC33457OooO0oO.OooO00o.f120916OooOo0o;
    }

    public static final boolean OooO00o(InterfaceC32641OooooOO interfaceC32641OooooOO) {
        OooOOO0.OooO0oO(interfaceC32641OooooOO, "<this>");
        Boolean boolOooO0Oo = C33552OooO00o.OooO0Oo(OooOo.OooO0oO(interfaceC32641OooooOO), C33193OooO00o.f120129OooO00o, OooO00o.f120131OooOo0o);
        OooOOO0.OooO0o(boolOooO0Oo, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolOooO0Oo.booleanValue();
    }

    public static oO0O0OO.OooO0O0 OooO0O0(oO0O0OO.OooO0O0 oooO0O0, InterfaceC32507OooOO0o predicate) {
        OooOOO0.OooO0oO(oooO0O0, "<this>");
        OooOOO0.OooO0oO(predicate, "predicate");
        return (oO0O0OO.OooO0O0) C33552OooO00o.OooO0O0(OooOo.OooO0oO(oooO0O0), new o000000o.OooOo(), new C33195OooO0OO(predicate, new C24034Oooo00O()));
    }

    public static final C33477OooO0OO OooO0OO(InterfaceC32599OooOO0o interfaceC32599OooOO0o) {
        OooOOO0.OooO0oO(interfaceC32599OooOO0o, "<this>");
        C33478OooO0Oo c33478OooO0OoOooO0oo = OooO0oo(interfaceC32599OooOO0o);
        if (!c33478OooO0OoOooO0oo.OooO0Oo()) {
            c33478OooO0OoOooO0oo = null;
        }
        if (c33478OooO0OoOooO0oo != null) {
            return c33478OooO0OoOooO0oo.OooO0oO();
        }
        return null;
    }

    public static final InterfaceC32596OooO0o0 OooO0Oo(oOo0oooO.OooO0OO oooO0OO) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = oooO0OO.getType().o00000().OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0) {
            return (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO;
        }
        return null;
    }

    public static final C33476OooO0O0 OooO0o(InterfaceC32598OooO0oo interfaceC32598OooO0oo) {
        oO0O0OO.OooOO0O oooOO0OOooO0Oo;
        C33476OooO0O0 c33476OooO0O0OooO0o;
        if (interfaceC32598OooO0oo == null || (oooOO0OOooO0Oo = interfaceC32598OooO0oo.OooO0Oo()) == null) {
            return null;
        }
        if (oooOO0OOooO0Oo instanceof InterfaceC32620Oooo00O) {
            return new C33476OooO0O0(((InterfaceC32620Oooo00O) oooOO0OOooO0Oo).OooO0OO(), interfaceC32598OooO0oo.getName());
        }
        if (!(oooOO0OOooO0Oo instanceof OooO) || (c33476OooO0O0OooO0o = OooO0o((InterfaceC32598OooO0oo) oooOO0OOooO0Oo)) == null) {
            return null;
        }
        return c33476OooO0O0OooO0o.OooO0Oo(interfaceC32598OooO0oo.getName());
    }

    public static final OooOO0 OooO0o0(oO0O0OO.OooOO0O oooOO0O) {
        OooOOO0.OooO0oO(oooOO0O, "<this>");
        return OooOO0(oooOO0O).OooOO0O();
    }

    public static final C33477OooO0OO OooO0oO(oO0O0OO.OooOO0O oooOO0O) {
        OooOOO0.OooO0oO(oooOO0O, "<this>");
        C33477OooO0OO c33477OooO0OOOooO0oo = C32982OooO.OooO0oo(oooOO0O);
        if (c33477OooO0OOOooO0oo == null) {
            c33477OooO0OOOooO0oo = C32982OooO.OooO0oO(oooOO0O.OooO0Oo()).OooO0O0(oooOO0O.getName()).OooO0oO();
        }
        if (c33477OooO0OOOooO0oo != null) {
            return c33477OooO0OOOooO0oo;
        }
        C32982OooO.OooO00o(4);
        throw null;
    }

    public static final C33478OooO0Oo OooO0oo(oO0O0OO.OooOO0O oooOO0O) {
        OooOOO0.OooO0oO(oooOO0O, "<this>");
        C33478OooO0Oo c33478OooO0OoOooO0oO = C32982OooO.OooO0oO(oooOO0O);
        OooOOO0.OooO0o(c33478OooO0OoOooO0oO, "getFqName(this)");
        return c33478OooO0OoOooO0oO;
    }

    public static final InterfaceC32615OooOoo OooOO0(oO0O0OO.OooOO0O oooOO0O) {
        OooOOO0.OooO0oO(oooOO0O, "<this>");
        InterfaceC32615OooOoo interfaceC32615OooOooOooO0Oo = C32982OooO.OooO0Oo(oooOO0O);
        OooOOO0.OooO0o(interfaceC32615OooOooOooO0Oo, "getContainingModule(this)");
        return interfaceC32615OooOooOooO0Oo;
    }

    public static final oO0O0OO.OooO0O0 OooOO0O(oO0O0OO.OooO0O0 oooO0O0) {
        OooOOO0.OooO0oO(oooO0O0, "<this>");
        if (!(oooO0O0 instanceof InterfaceC32626Oooo0oO)) {
            return oooO0O0;
        }
        InterfaceC32627Oooo0oo correspondingProperty = ((InterfaceC32626Oooo0oO) oooO0O0).Ooooo0o();
        OooOOO0.OooO0o(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }
}
