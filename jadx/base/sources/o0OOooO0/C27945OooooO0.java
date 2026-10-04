package o0OOooO0;

import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {618, 645}, m80625m = "maintainRemoteContentConsistency-yxL6bBk")
public final class C27945OooooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98919OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f98920OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public DriveSnapshotCacheEntity f98921OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f98922OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public CloudMetaRemoteEntity f98923OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98924OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f98925OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f98926OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27945OooooO0(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98924OooOoo = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98925OooOoo0 = obj;
        this.f98926OooOooO |= Integer.MIN_VALUE;
        Object objO00Ooo = this.f98924OooOoo.o00Ooo(null, null, null, null, this);
        return objO00Ooo == EnumC32485OooO00o.f116726OooOo0o ? objO00Ooo : new C32445OooOOOO(objO00Ooo);
    }
}
