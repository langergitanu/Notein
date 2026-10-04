package oO0o;

import OooO0o.C20424OooO0Oo;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00ooOO.C32466OooO0OO;
import oO00ooOO.C32469OooO0o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.OooOOO0;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o0O0O00;
import oO0oO00.oo0o0Oo;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {
    public static final oo0o0Oo OooO00o(String str, AbstractC33526OooO0Oo.OooO kind) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kind, "kind");
        if (C33599OooOo0O.Oooo0o0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((C32469OooO0o) o0O0O00.f122274OooO00o.values()).iterator();
        while (((C32466OooO0OO.OooO0Oo) it).hasNext()) {
            InterfaceC33911OooO0OO interfaceC33911OooO0OO = (InterfaceC33911OooO0OO) ((C32466OooO0OO.OooO0o) it).next();
            if (str.equals(interfaceC33911OooO0OO.getDescriptor().OooO0oo())) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbOooO0o0.append(C24035Oooo00o.f80943OooO00o.OooO0O0(interfaceC33911OooO0OO.getClass()).OooOO0());
                sbOooO0o0.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(C33591OooOOO.OooO0oo(sbOooO0o0.toString()));
            }
        }
        return new oo0o0Oo(str, kind);
    }

    public static final C33532OooO0oO OooO0O0(String str, InterfaceC33531OooO0o0[] interfaceC33531OooO0o0Arr, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        if (C33599OooOo0O.Oooo0o0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C33523OooO00o c33523OooO00o = new C33523OooO00o(str);
        interfaceC32507OooOO0o.invoke(c33523OooO00o);
        return new C33532OooO0oO(str, OooOOO0.OooO00o.f121132OooO00o, c33523OooO00o.f121095OooO0OO.size(), OooOOO.OoooOO0(interfaceC33531OooO0o0Arr), c33523OooO00o);
    }

    public static final C33532OooO0oO OooO0OO(String serialName, AbstractC33534OooOO0o kind, InterfaceC33531OooO0o0[] interfaceC33531OooO0o0Arr, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(serialName, "serialName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kind, "kind");
        if (C33599OooOo0O.Oooo0o0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(OooOOO0.OooO00o.f121132OooO00o)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C33523OooO00o c33523OooO00o = new C33523OooO00o(serialName);
        interfaceC32507OooOO0o.invoke(c33523OooO00o);
        return new C33532OooO0oO(serialName, kind, c33523OooO00o.f121095OooO0OO.size(), OooOOO.OoooOO0(interfaceC33531OooO0o0Arr), c33523OooO00o);
    }
}
