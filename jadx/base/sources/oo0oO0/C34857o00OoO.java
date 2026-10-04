package oo0oO0;

import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0ooO.C35024OooOo;

/* JADX INFO: renamed from: oo0oO0.o00OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34857o00OoO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f125361OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125362OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object[] f125363OooOoO0;

    public /* synthetic */ C34857o00OoO(Object obj, Object[] objArr, int i) {
        this.f125362OooOo0o = i;
        this.f125361OooOo = obj;
        this.f125363OooOoO0 = objArr;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        InterfaceC24747OooO0O0 interfaceC24747OooO0O0 = (InterfaceC24747OooO0O0) obj;
        switch (this.f125362OooOo0o) {
            case 0:
                ((C34866o00OoOo0) this.f125361OooOo).f125380OooO0OO.OooOoo0(interfaceC24747OooO0O0, (NoteinGoogleSubscriptionPurchaseEntity[]) this.f125363OooOoO0);
                break;
            default:
                ((C35024OooOo) this.f125361OooOo).f125752OooO0O0.OooOoo0(interfaceC24747OooO0O0, (DriveSnapshotCacheEntity[]) this.f125363OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
