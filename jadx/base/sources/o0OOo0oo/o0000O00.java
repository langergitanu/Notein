package o0OOo0oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.ResolveRemoteNotFoundUseCase", m80623f = "ResolveRemoteNotFoundUseCase.kt", m80624l = {169, 170}, m80625m = "fetchRemoteState")
public final class o0000O00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f97440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97441OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0000 f97442OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97443OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97444OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(o0000 o0000Var, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97442OooOoO = o0000Var;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97443OooOoO0 = obj;
        this.f97444OooOoOO |= Integer.MIN_VALUE;
        return this.f97442OooOoO.OooO00o(null, this);
    }
}
