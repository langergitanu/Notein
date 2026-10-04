package oO000o;

import kotlin.coroutines.Continuation;
import oO000oo.C32134OooO0o0;
import oO000oo.C32135OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: oO000o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", m80623f = "HttpClientEngine.kt", m80624l = {99}, m80625m = "invokeSuspend")
public final class C32081OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32135OooO0oO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f114912OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f114913OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f114914OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32081OooO0Oo(OooO0O0 oooO0O0, C32134OooO0o0 c32134OooO0o0, Continuation<? super C32081OooO0Oo> continuation) {
        super(2, continuation);
        this.f114912OooOo = oooO0O0;
        this.f114914OooOoO0 = c32134OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C32081OooO0Oo(this.f114912OooOo, this.f114914OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32135OooO0oO> continuation) {
        return ((C32081OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f114913OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO0O0 oooO0O0 = this.f114912OooOo;
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) oooO0O0.OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (!(interfaceC33672o00ooo != null ? interfaceC33672o00ooo.isActive() : false)) {
            throw new OooO00o();
        }
        this.f114913OooOo0o = 1;
        Object objOoooOo0 = oooO0O0.OoooOo0(this.f114914OooOoO0, this);
        return objOoooOo0 == enumC32485OooO00o ? enumC32485OooO00o : objOoooOo0;
    }
}
