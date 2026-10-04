package o0Oo0o00;

import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0oOoOo.C31032OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.C34731Oooo0oo;

/* JADX INFO: renamed from: o0Oo0o00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28163OooOOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99800OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99801OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f99802OooOoO0;

    public /* synthetic */ C28163OooOOo(int i, Object obj, Object obj2) {
        this.f99801OooOo0o = i;
        this.f99800OooOo = obj;
        this.f99802OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f99801OooOo0o) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ((CloudSyncDetailsFragment) this.f99800OooOo).OooOooo().OooOO0O(((C31032OooO0OO) this.f99802OooOoO0).f110782OooO00o);
                }
                return C32460OooOooO.f116667OooO00o;
            case 1:
                ((C34731Oooo0oo) this.f99800OooOo).f125054OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (AudioSyncRecordEntity[]) this.f99802OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                String[] strArr = (String[]) this.f99802OooOoO0;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo((String) this.f99800OooOo);
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
        }
    }
}
