package o0OOo0oo;

import o0OOooO0.EnumC27953o00000Oo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncNetworkStrategyUseCase", m80623f = "CloudSyncNetworkStrategyUseCase.kt", m80624l = {32, 33}, m80625m = "set")
public final class C27630OooOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public EnumC27953o00000Oo f97155OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27635OooOoO f97156OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27635OooOoO f97157OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f97158OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f97159OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27630OooOo(C27635OooOoO c27635OooOoO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97157OooOoO = c27635OooOoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97158OooOoO0 = obj;
        this.f97159OooOoOO |= Integer.MIN_VALUE;
        return this.f97157OooOoO.OooO0OO(null, this);
    }
}
