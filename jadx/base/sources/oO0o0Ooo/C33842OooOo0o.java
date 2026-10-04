package oO0o0Ooo;

import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33665o00000o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33842OooOo0o implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = (InterfaceC34415OooO0oo.OooO0O0) obj2;
        if (!(oooO0O0 instanceof InterfaceC33665o00000o0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? oooO0O0 : Integer.valueOf(iIntValue + 1);
    }
}
