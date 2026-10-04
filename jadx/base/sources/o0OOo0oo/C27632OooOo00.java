package o0OOo0oo;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncNetworkStrategyUseCase", m80623f = "CloudSyncNetworkStrategyUseCase.kt", m80624l = {58}, m80625m = "checkNetworkStrategy")
public final class C27632OooOo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f97167OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27635OooOoO f97168OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f97169OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27635OooOoO f97170OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27632OooOo00(C27635OooOoO c27635OooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97170OooOoO0 = c27635OooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97167OooOo = obj;
        this.f97169OooOoO |= Integer.MIN_VALUE;
        return this.f97170OooOoO0.OooO00o(this);
    }
}
