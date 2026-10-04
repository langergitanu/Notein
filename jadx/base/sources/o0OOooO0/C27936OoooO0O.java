package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {175, 178, 183}, m80625m = "fetchRemoteBundle-BWLJW6A$suspendImpl")
public final class C27936OoooO0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f98874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f98875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f98876OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f98877OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f98878OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98879OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27936OoooO0O(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98879OooOoo0 = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98877OooOoOO = obj;
        this.f98878OooOoo |= Integer.MIN_VALUE;
        Object objOooooOO = AbstractC27907OooOo0O.OooooOO(this.f98879OooOoo0, null, null, null, this);
        return objOooooOO == EnumC32485OooO00o.f116726OooOo0o ? objOooooOO : new C32445OooOOOO(objOooooOO);
    }
}
