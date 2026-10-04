package o0OOoO0o;

import java.util.Map;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOoO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27754OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f97985OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f97985OooOo0o) {
            case 0:
                Map.Entry it = (Map.Entry) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return (String) it.getKey();
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM ImageEntity");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
