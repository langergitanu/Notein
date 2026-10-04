package oo0oO0;

import com.orion.notein.data.p602db.entity.DownloadedMaterialEntity;
import com.orion.notein.data.p602db.entity.NoteinMessageEntity;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o00Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34869o00Ooo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125385OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125386OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f125387OooOoO0;

    public /* synthetic */ C34869o00Ooo(int i, Object obj, Object obj2) {
        this.f125386OooOo0o = i;
        this.f125385OooOo = obj;
        this.f125387OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125386OooOo0o) {
            case 0:
                ((C34965o00ooo) this.f125385OooOo).f125578OooO0O0.OooOoOO(interfaceC24747OooO0O0, (DownloadedMaterialEntity) this.f125387OooOoO0);
                break;
            default:
                ((C34876o00OooOO) this.f125385OooOo).f125399OooO0Oo.OoooOOO(interfaceC24747OooO0O0, (NoteinMessageEntity[]) this.f125387OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
