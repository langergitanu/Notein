package oo0oO0;

import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34741OoooOoo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125079OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125080OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object[] f125081OooOoO0;

    public /* synthetic */ C34741OoooOoo(Object obj, Object[] objArr, int i) {
        this.f125080OooOo0o = i;
        this.f125079OooOo = obj;
        this.f125081OooOoO0 = objArr;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f125080OooOo0o) {
            case 0:
                String[] strArr = (String[]) this.f125081OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f125079OooOo);
                try {
                    int i = 1;
                    for (String str : strArr) {
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
            default:
                ((C34856o00Oo0oo) this.f125079OooOo).f125359OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (NoteinGoogleDeveloperOfferEntity[]) this.f125081OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
