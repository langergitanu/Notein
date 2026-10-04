package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0OOooO0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {193, 196, 201}, m80625m = "fetchRemoteBundleWithProgress-hUnOzRk$suspendImpl")
public final class C27933OoooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98853OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f98854OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f98855OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f98856OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC32507OooOO0o f98857OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f98858OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f98859OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98860OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f98861OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27933OoooO(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98860OooOooO = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98858OooOoo = obj;
        this.f98861OooOooo |= Integer.MIN_VALUE;
        Object objOooooOo = AbstractC27907OooOo0O.OooooOo(this.f98860OooOooO, null, null, null, 0L, null, this);
        return objOooooOo == EnumC32485OooO00o.f116726OooOo0o ? objOooooOo : new C32445OooOOOO(objOooooOo);
    }
}
