package o0oo0Oo;

import java.util.Set;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0oo0Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31254OooOOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f111552OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f111553OooOo0o;

    public /* synthetic */ C31254OooOOo(Object obj, int i) {
        this.f111553OooOo0o = i;
        this.f111552OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f111553OooOo0o) {
            case 0:
                InterfaceC31284OooO0O0 it = (InterfaceC31284OooO0O0) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return Boolean.valueOf(((Set) this.f111552OooOo).contains(it.getId()));
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM downloaded_material WHERE id = ?");
                try {
                    interfaceC24749OooO0OoO0ooOOo.o000000O(1, (String) this.f111552OooOo);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
        }
    }
}
