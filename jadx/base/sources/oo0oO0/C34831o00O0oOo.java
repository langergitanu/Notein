package oo0oO0;

import com.orion.notein.data.p602db.entity.StrokeEntity;
import java.io.Serializable;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00O0oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34831o00O0oOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125296OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125297OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Serializable f125298OooOoO0;

    public /* synthetic */ C34831o00O0oOo(Object obj, Serializable serializable, int i) {
        this.f125297OooOo0o = i;
        this.f125296OooOo = obj;
        this.f125298OooOoO0 = serializable;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125297OooOo0o) {
            case 0:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = interfaceC24747OooO0O0.o0ooOOo("delete from NoteMetaEntity where id = ? and user_id = ?");
                String str = (String) this.f125296OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    String str2 = (String) this.f125298OooOoO0;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            default:
                ((o0oO0Ooo) this.f125296OooOo).f125656OooO0OO.OooOoo0(interfaceC24747OooO0O0, (StrokeEntity[]) this.f125298OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
