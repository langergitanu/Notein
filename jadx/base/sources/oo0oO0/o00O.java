package oo0oO0;

import android.view.View;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oOoo0O.C31144OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125240OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125241OooOo0o;

    public /* synthetic */ o00O(Object obj, int i) {
        this.f125241OooOo0o = i;
        this.f125240OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo;
        switch (this.f125241OooOo0o) {
            case 0:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select count(*) from NoteMetaEntity where parent_id is null and is_in_trash_bin = 0 and user_id = ?");
                String str = (String) this.f125240OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    Integer numValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o() && !interfaceC24749OooO0OoO0ooOOo.isNull(0)) {
                        numValueOf = Integer.valueOf((int) interfaceC24749OooO0OoO0ooOOo.getLong(0));
                        break;
                    }
                    return numValueOf;
                } finally {
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
            case 1:
                interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM StrokeEntity WHERE page_id = ? and layer_id = ?");
                String str2 = (String) this.f125240OooOo;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return null;
                } finally {
                }
            default:
                View it = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                ((C31144OooO00o) this.f125240OooOo).OooO0O0(it);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
