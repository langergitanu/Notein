package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {701, 2412, 710, 711}, m80625m = "pullRemoteChanges-IoAF18A$suspendImpl")
public final class o00Oo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f99020OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f99021OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f99022OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f99023OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99024OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99022OooOoO = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99023OooOoO0 = obj;
        this.f99024OooOoOO |= Integer.MIN_VALUE;
        Object objO0ooOoO = AbstractC27907OooOo0O.o0ooOoO(this.f99022OooOoO, this);
        return objO0ooOoO == EnumC32485OooO00o.f116726OooOo0o ? objO0ooOoO : new C32445OooOOOO(objO0ooOoO);
    }
}
