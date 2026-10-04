package o0OOooO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOooO0.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2311, 2312}, m80625m = "getCachedCloudMetaRemote$suspendImpl")
public final class C27939OoooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98891OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f98892OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98893OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98894OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98895OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27939OoooOOo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98893OooOoO = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98894OooOoO0 = obj;
        this.f98895OooOoOO |= Integer.MIN_VALUE;
        return AbstractC27907OooOo0O.OoooooO(this.f98893OooOoO, null, this);
    }
}
