package o0OOooO0;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOooO0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {135, 137, 146}, m80625m = "cancelAuthorize$suspendImpl")
public final class C27918OooOoo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98774OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC27907OooOo0O f98775OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98776OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f98777OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98778OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27918OooOoo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98776OooOoO = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98777OooOoO0 = obj;
        this.f98778OooOoOO |= Integer.MIN_VALUE;
        return AbstractC27907OooOo0O.OoooO0(this.f98776OooOoO, this);
    }
}
