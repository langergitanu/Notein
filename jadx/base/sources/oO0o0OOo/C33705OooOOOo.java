package oO0o0OOo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33702OooOOO;

/* JADX INFO: renamed from: oO0o0OOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m80623f = "Channels.kt", m80624l = {39}, m80625m = "invokeSuspend")
public final class C33705OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C33702OooOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121488OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121489OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f121490OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33715OooOoO0<Object> f121491OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33705OooOOOo(InterfaceC33715OooOoO0<Object> interfaceC33715OooOoO0, Object obj, Continuation<? super C33705OooOOOo> continuation) {
        super(2, continuation);
        this.f121491OooOoO0 = interfaceC33715OooOoO0;
        this.f121490OooOoO = obj;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33705OooOOOo c33705OooOOOo = new C33705OooOOOo(this.f121491OooOoO0, this.f121490OooOoO, continuation);
        c33705OooOOOo.f121488OooOo = obj;
        return c33705OooOOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C33702OooOOO<? extends C32460OooOooO>> continuation) {
        return ((C33705OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121489OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33715OooOoO0<Object> interfaceC33715OooOoO0 = this.f121491OooOoO0;
                Object obj2 = this.f121490OooOoO;
                this.f121489OooOo0o = 1;
                if (interfaceC33715OooOoO0.OooOOO(obj2, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        return new C33702OooOOO(!(objOooO00o instanceof C32445OooOOOO.OooO00o) ? C32460OooOooO.f116667OooO00o : new C33702OooOOO.OooO00o(C32445OooOOOO.OooO00o(objOooO00o)));
    }
}
