package Oooo0oO;

import Oooo0oO.InterfaceC21078Ooooooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {
    public static final InterfaceC21078Ooooooo OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        InterfaceC21078Ooooooo interfaceC21078Ooooooo = (InterfaceC21078Ooooooo) interfaceC34415OooO0oo.get(InterfaceC21078Ooooooo.OooO00o.f61048OooOo0o);
        if (interfaceC21078Ooooooo != null) {
            return interfaceC21078Ooooooo;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
