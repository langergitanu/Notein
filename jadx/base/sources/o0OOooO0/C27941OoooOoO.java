package o0OOooO0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooO0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.drive.DriveCloudSyncDataSource", m80623f = "DriveCloudSyncDataSource.kt", m80624l = {2201}, m80625m = "getCurrentDriveId-IoAF18A$suspendImpl")
public final class C27941OoooOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC27907OooOo0O f98899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98900OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98901OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27941OoooOoO(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98899OooOo = abstractC27907OooOo0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f98900OooOo0o = obj;
        this.f98901OooOoO0 |= Integer.MIN_VALUE;
        Object objO0OoOo0 = AbstractC27907OooOo0O.o0OoOo0(this.f98899OooOo, this);
        return objO0OoOo0 == EnumC32485OooO00o.f116726OooOo0o ? objO0OoOo0 : new C32445OooOOOO(objO0OoOo0);
    }
}
