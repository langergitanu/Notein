package oO0o0ooO;

import java.util.ArrayList;
import java.util.List;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0ooo.C33928OooO00o;
import oO0oO00o.C34006OooO0O0;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: oO0o0ooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33920OooOOO implements InterfaceC32508OooOOOo {
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC34595OooO0Oo clazz = (InterfaceC34595OooO0Oo) obj;
        final List types = (List) obj2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(clazz, "clazz");
        kotlin.jvm.internal.OooOOO0.OooO0oO(types, "types");
        ArrayList arrayListOooO0oo = o000ooOO.OooOOO0.OooO0oo(C34006OooO0O0.f122302OooO00o, types, true);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(arrayListOooO0oo);
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0o = o000ooOO.OooOOO0.OooO0o(clazz, arrayListOooO0oo, new oO0O000o.OooO00o() { // from class: oO0o0ooO.OooOOOO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return ((InterfaceC34606OooOOOo) types.get(0)).OooO0O0();
            }
        });
        if (interfaceC33911OooO0OOOooO0o != null) {
            return C33928OooO00o.OooO0OO(interfaceC33911OooO0OOOooO0o);
        }
        return null;
    }
}
