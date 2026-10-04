package io.ktor.utils.p616io;

import OooO0Oo.C20414OooOo0o;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo0000O.OooO;

/* JADX INFO: renamed from: io.ktor.utils.io.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24005o00o0O {
    public static final C23993Ooooooo OooO00o(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, OooO00o oooO00o, boolean z, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        o00000OO o00000ooOooO0OO = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, interfaceC34415OooO0oo, null, new o00Ooo(z, oooO00o, interfaceC32508OooOOOo, (AbstractC33630OooOooO) interfaceC33636Oooo00o.OooOOO0().get(AbstractC33630OooOooO.f121312OooOo), null), 2);
        o00000ooOooO0OO.invokeOnCompletion(new C20414OooOo0o(oooO00o, 1));
        return new C23993Ooooooo(o00000ooOooO0OO, oooO00o);
    }

    public static final C23993Ooooooo OooO0O0(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo coroutineContext, OooO00o oooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        OooOOO0.OooO0oO(interfaceC33636Oooo00o, "<this>");
        OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        return OooO00o(interfaceC33636Oooo00o, coroutineContext, oooO00o, false, interfaceC32508OooOOOo);
    }

    public static final C23993Ooooooo OooO0OO(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo coroutineContext, boolean z, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        OooOOO0.OooO0oO(interfaceC33636Oooo00o, "<this>");
        OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        return OooO00o(interfaceC33636Oooo00o, coroutineContext, new OooO00o(z), true, interfaceC32508OooOOOo);
    }

    public static /* synthetic */ C23993Ooooooo OooO0Oo(InterfaceC33636Oooo00o interfaceC33636Oooo00o, InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC32508OooOOOo interfaceC32508OooOOOo, int i) {
        if ((i & 1) != 0) {
            interfaceC34415OooO0oo = OooO.f123416OooOo0o;
        }
        return OooO0OO(interfaceC33636Oooo00o, interfaceC34415OooO0oo, (i & 2) == 0, interfaceC32508OooOOOo);
    }
}
