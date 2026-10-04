package oo0oO0;

import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00o0o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34907o00o0o0O implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT layer_id FROM ImageEntity");
        try {
            ArrayList arrayList = new ArrayList();
            while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                arrayList.add(interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(0));
            }
            return arrayList;
        } finally {
            interfaceC24749OooO0OoO0ooOOo.close();
        }
    }
}
