package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2330, 2332, 2337, 2352}, m80625m = "fetchReconciledCloudMeta-gIAlu-s$suspendImpl")
public final class C27934OoooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC27907OooOo0O f98862OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f98863OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f98864OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f98865OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f98866OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f98867OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98868OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27934OoooO0(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98868OooOoo0 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98866OooOoOO = obj;
        this.f98867OooOoo |= Integer.MIN_VALUE;
        Object objOooooO0 = AbstractC27907OooOo0O.OooooO0(this.f98868OooOoo0, null, this);
        return objOooooO0 == EnumC32485OooO00o.f116726OooOo0o ? objOooooO0 : new C32445OooOOOO(objOooooO0);
    }
}
