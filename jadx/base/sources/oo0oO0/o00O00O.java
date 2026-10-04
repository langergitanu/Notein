package oo0oO0;

import com.orion.notein.data.p602db.entity.ShapeEntity;
import java.io.Serializable;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o00O00O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125254OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125255OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Serializable f125256OooOoO0;

    public /* synthetic */ o00O00O(Object obj, Serializable serializable, int i) {
        this.f125255OooOo0o = i;
        this.f125254OooOo = obj;
        this.f125256OooOoO0 = serializable;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125255OooOo0o) {
            case 0:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("select MIN(sort_key) from NoteMetaEntity where parent_id = ? and user_id = ?");
                String str = (String) this.f125254OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    String str2 = (String) this.f125256OooOoO0;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
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
            default:
                ((C34973o00oooo) this.f125254OooOo).f125591OooO0O0.OooOoo0(interfaceC24747OooO0O0, (ShapeEntity[]) this.f125256OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
