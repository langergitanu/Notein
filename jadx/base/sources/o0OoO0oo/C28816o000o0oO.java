package o0OoO0oo;

import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oOoOo.C31031OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.o000o0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28816o000o0oO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102024OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f102024OooOo0o) {
            case 0:
                return Boolean.valueOf(!((C31031OooO0O0) obj).f110781OooO0Oo);
            case 1:
                InterfaceC33569OooO0oo it = (InterfaceC33569OooO0oo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return it.iterator();
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT layer_id FROM TextBoxEntity");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        arrayList.add(interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(0));
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
