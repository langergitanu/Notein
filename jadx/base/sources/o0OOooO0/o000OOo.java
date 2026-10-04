package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2088, 2093, 2095}, m80625m = "uploadMetaWithLock-yxL6bBk")
public final class o000OOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f99006OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f99007OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f99008OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99009OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99009OooOoO0 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99006OooOo = obj;
        this.f99008OooOoO |= Integer.MIN_VALUE;
        Object objOooo0O0 = AbstractC27907OooOo0O.Oooo0O0(this.f99009OooOoO0, null, null, null, null, this);
        return objOooo0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooo0O0 : new C32445OooOOOO(objOooo0O0);
    }
}
