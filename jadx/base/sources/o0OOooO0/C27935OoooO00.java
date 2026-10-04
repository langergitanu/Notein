package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {556, 566}, m80625m = "fetchFileSnapshot-gIAlu-s")
public final class C27935OoooO00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f98869OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98870OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f98871OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98872OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27935OoooO00(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98872OooOoO0 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98869OooOo = obj;
        this.f98871OooOoO |= Integer.MIN_VALUE;
        Object objOoooo0o = this.f98872OooOoO0.Ooooo0o(null, this);
        return objOoooo0o == EnumC32485OooO00o.f116726OooOo0o ? objOoooo0o : new C32445OooOOOO(objOoooo0o);
    }
}
