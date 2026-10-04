package oO0O0O;

import java.util.ArrayList;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32620Oooo00O;

/* JADX INFO: renamed from: oO0O0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32522OooO0o0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32615OooOoo, oO0O0O0o.OooO0O0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C32522OooO0o0 f116846OooOo0o = new C32522OooO0o0(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final oO0O0O0o.OooO0O0 invoke(InterfaceC32615OooOoo interfaceC32615OooOoo) {
        InterfaceC32615OooOoo module = interfaceC32615OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        List<InterfaceC32620Oooo00O> listOooo0 = module.o00oO0o(OooO0o.f116839OooO0o).Oooo0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOooo0) {
            if (obj instanceof oO0O0O0o.OooO0O0) {
                arrayList.add(obj);
            }
        }
        return (oO0O0O0o.OooO0O0) oOo000Oo.OooOo.Oooo0oO(arrayList);
    }
}
