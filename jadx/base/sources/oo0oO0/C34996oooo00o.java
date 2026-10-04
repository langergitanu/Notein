package oo0oO0;

import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34996oooo00o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f125681OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125682OooOo0o;

    public /* synthetic */ C34996oooo00o(String str, int i) {
        this.f125682OooOo0o = i;
        this.f125681OooOo = str;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125682OooOo0o) {
            case 0:
                interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("SELECT EXISTS(SELECT 1 FROM material_download_state WHERE material_id = ?)");
                String str = this.f125681OooOo;
                boolean z = true;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    Boolean boolValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Integer numValueOf = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                            break;
                        }
                    }
                    return boolValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            default:
                interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("delete from PenInfoEntity where note_id = ?");
                String str2 = this.f125681OooOo;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } finally {
                }
        }
    }
}
