package oo0oO0;

import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34764o0000o0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125149OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125149OooOo0o) {
            case 0:
                try {
                    interfaceC24747OooO0O0.o0ooOOo("delete from HyperLinkEntity").o00oO0o();
                    return C32460OooOooO.f116667OooO00o;
                } finally {
                }
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("SELECT COUNT(*) FROM PageLayerEntity");
                try {
                    Integer numValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                }
        }
    }
}
