package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2362, 2364, 2366, 2369}, m80625m = "fetchDriveSnapshot-gIAlu-s$suspendImpl")
public final class C27922Oooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC27907OooOo0O f98795OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f98796OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f98797OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f98798OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98799OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f98800OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27922Oooo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98799OooOoOO = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98797OooOoO = obj;
        this.f98800OooOoo0 |= Integer.MIN_VALUE;
        Object objOoooo00 = AbstractC27907OooOo0O.Ooooo00(this.f98799OooOoOO, null, this);
        return objOoooo00 == EnumC32485OooO00o.f116726OooOo0o ? objOoooo00 : new C32445OooOOOO(objOoooo00);
    }
}
