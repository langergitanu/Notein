package oo0oO0;

import com.orion.notein.data.p602db.entity.NotePdfLostInfoEntity;
import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import java.util.Set;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34717OooOoO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125028OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125029OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125030OooOoO0;

    public /* synthetic */ C34717OooOoO0(int i, Object obj, Object obj2) {
        this.f125029OooOo0o = i;
        this.f125028OooOo = obj;
        this.f125030OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f125029OooOo0o) {
            case 0:
                Set<String> set = (Set) this.f125030OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f125028OooOo);
                try {
                    int i = 1;
                    for (String str : set) {
                        if (str == null) {
                            interfaceC24749OooO0OoO0ooOOo.OooO0oO(i);
                        } else {
                            interfaceC24749OooO0OoO0ooOOo.o000000O(i, str);
                        }
                        i++;
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            case 1:
                ((o00OOO0O) this.f125028OooOo).f125335OooO0O0.OooOoOO((InterfaceC24747OooO0O0) obj, (NotePdfLostInfoEntity) this.f125030OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                ((o0O0O0O) this.f125028OooOo).f125630OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (ToolBoxInfoEntity[]) this.f125030OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
