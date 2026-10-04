package o0OO0Ooo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSyncBackend", m80623f = "GoogleDriveSyncBackend.kt", m80624l = {152, 155, 161}, m80625m = "fetchFileSnapshot-gIAlu-s")
public final class o000oOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92704OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f92705OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f92706OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C26791OoooOoO f92707OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C26791OoooOoO f92708OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f92709OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(C26791OoooOoO c26791OoooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92708OooOoOO = c26791OoooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92706OooOoO = obj;
        this.f92709OooOoo0 |= Integer.MIN_VALUE;
        Object objOooOOo0 = this.f92708OooOoOO.OooOOo0(null, this);
        return objOooOOo0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo0 : new C32445OooOOOO(objOooOOo0);
    }
}
