package o0OO0o0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {105, 106}, m80625m = "ensureInitialized-IoAF18A")
public final class o00Oo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93047OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00oO0O f93048OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93049OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f93050OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93050OooOoO0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93047OooOo = obj;
        this.f93049OooOoO |= Integer.MIN_VALUE;
        Object objOooOo0 = this.f93050OooOoO0.OooOo0(this);
        return objOooOo0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0 : new C32445OooOOOO(objOooOo0);
    }
}
