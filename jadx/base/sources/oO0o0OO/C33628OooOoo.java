package oO0o0OO;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0oOoOo.C31071OoooO;
import o0oOoOo.C31090o000oOoO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33628OooOoo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    public static final InterfaceC34415OooO0oo OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC34415OooO0oo interfaceC34415OooO0oo2, final boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC34415OooO0oo.fold(bool, new C31071OoooO(1))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC34415OooO0oo2.fold(bool, new C31071OoooO(1))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC34415OooO0oo.plus(interfaceC34415OooO0oo2);
        }
        final C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        c24034Oooo00O.f80942OooOo0o = interfaceC34415OooO0oo2;
        oOo0000O.OooO oooO = oOo0000O.OooO.f123416OooOo0o;
        InterfaceC34415OooO0oo interfaceC34415OooO0oo3 = (InterfaceC34415OooO0oo) interfaceC34415OooO0oo.fold(oooO, new InterfaceC32508OooOOOo() { // from class: oO0o0OO.OooOoo0
            /* JADX WARN: Type inference failed for: r1v5, types: [T, oOo0000O.OooO0oo] */
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                InterfaceC34415OooO0oo interfaceC34415OooO0oo4 = (InterfaceC34415OooO0oo) obj;
                InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = (InterfaceC34415OooO0oo.OooO0O0) obj2;
                if (!(oooO0O0 instanceof InterfaceC33625OooOoO)) {
                    return interfaceC34415OooO0oo4.plus(oooO0O0);
                }
                C24034Oooo00O c24034Oooo00O2 = c24034Oooo00O;
                if (((InterfaceC34415OooO0oo) c24034Oooo00O2.f80942OooOo0o).get(oooO0O0.getKey()) != null) {
                    c24034Oooo00O2.f80942OooOo0o = ((InterfaceC34415OooO0oo) c24034Oooo00O2.f80942OooOo0o).minusKey(oooO0O0.getKey());
                    return interfaceC34415OooO0oo4.plus(((InterfaceC33625OooOoO) oooO0O0).o0000O());
                }
                InterfaceC33625OooOoO interfaceC33625OooOoOOooo000 = (InterfaceC33625OooOoO) oooO0O0;
                if (z) {
                    interfaceC33625OooOoOOooo000 = interfaceC33625OooOoOOooo000.Oooo000();
                }
                return interfaceC34415OooO0oo4.plus(interfaceC33625OooOoOOooo000);
            }
        });
        if (zBooleanValue2) {
            c24034Oooo00O.f80942OooOo0o = ((InterfaceC34415OooO0oo) c24034Oooo00O.f80942OooOo0o).fold(oooO, new C31090o000oOoO(1));
        }
        return interfaceC34415OooO0oo3.plus((InterfaceC34415OooO0oo) c24034Oooo00O.f80942OooOo0o);
    }

    public static final InterfaceC34415OooO0oo OooO0O0(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o = OooO00o(interfaceC33636Oooo00o.OooOOO0(), interfaceC34415OooO0oo, true);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return (interfaceC34415OooO0ooOooO00o == c33874OooO0OO || interfaceC34415OooO0ooOooO00o.get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o) != null) ? interfaceC34415OooO0ooOooO00o : interfaceC34415OooO0ooOooO00o.plus(c33874OooO0OO);
    }

    public static final o0000O0<?> OooO0OO(Continuation<?> continuation, InterfaceC34415OooO0oo interfaceC34415OooO0oo, Object obj) {
        o0000O0<?> o0000o0 = null;
        if ((continuation instanceof InterfaceC32480OooO0Oo) && interfaceC34415OooO0oo.get(o0000O0O.f121364OooOo0o) != null) {
            InterfaceC32480OooO0Oo callerFrame = (InterfaceC32480OooO0Oo) continuation;
            while (true) {
                if ((callerFrame instanceof C33643OoooO) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof o0000O0) {
                    o0000o0 = (o0000O0) callerFrame;
                    break;
                }
            }
            if (o0000o0 != null) {
                o0000o0.o00O0O(interfaceC34415OooO0oo, obj);
            }
        }
        return o0000o0;
    }
}
