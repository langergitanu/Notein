package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2320, 2323}, m80625m = "fetchCloudMetaRemote-gIAlu-s$suspendImpl")
public final class C27932Oooo0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98848OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f98849OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98850OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98851OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98852OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27932Oooo0oo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98850OooOoO = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98851OooOoO0 = obj;
        this.f98852OooOoOO |= Integer.MIN_VALUE;
        Object objOoooOoo = AbstractC27907OooOo0O.OoooOoo(this.f98850OooOoO, null, this);
        return objOoooOoo == EnumC32485OooO00o.f116726OooOo0o ? objOoooOoo : new C32445OooOOOO(objOoooOoo);
    }
}
