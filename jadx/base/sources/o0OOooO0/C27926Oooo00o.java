package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {683, 686, 691}, m80625m = "ensureCloudMetaRemoteDeleted-BWLJW6A")
public final class C27926Oooo00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98814OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f98815OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Throwable f98816OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC27907OooOo0O f98817OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f98818OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f98819OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98820OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27926Oooo00o(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98820OooOoo0 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98818OooOoOO = obj;
        this.f98819OooOoo |= Integer.MIN_VALUE;
        Object objOoooOO0 = this.f98820OooOoo0.OoooOO0(null, null, null, this);
        return objOoooOO0 == EnumC32485OooO00o.f116726OooOo0o ? objOoooOO0 : new C32445OooOOOO(objOoooOO0);
    }
}
