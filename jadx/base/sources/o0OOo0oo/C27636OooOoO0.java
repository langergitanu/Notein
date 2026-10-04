package o0OOo0oo;

import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0OOooO0.EnumC27953o00000Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OOo0oo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.CloudSyncNetworkStrategyUseCase$set$2", m80623f = "CloudSyncNetworkStrategyUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27636OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27635OooOoO f97187OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97188OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC27953o00000Oo f97189OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27636OooOoO0(C27635OooOoO c27635OooOoO, EnumC27953o00000Oo enumC27953o00000Oo, Continuation<? super C27636OooOoO0> continuation) {
        super(2, continuation);
        this.f97187OooOo = c27635OooOoO;
        this.f97189OooOoO0 = enumC27953o00000Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27636OooOoO0 c27636OooOoO0 = new C27636OooOoO0(this.f97187OooOo, this.f97189OooOoO0, continuation);
        c27636OooOoO0.f97188OooOo0o = obj;
        return c27636OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C27636OooOoO0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f97188OooOo0o).OooO0oO(this.f97187OooOo.f97186OooO0Oo, new Integer(this.f97189OooOoO0.ordinal()));
        return C32460OooOooO.f116667OooO00o;
    }
}
