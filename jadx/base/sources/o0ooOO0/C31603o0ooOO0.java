package o0ooOO0;

import kotlin.coroutines.Continuation;
import o00000oo.C24127OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0ooOO0.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m80623f = "InfiniteAnimationPolicy.kt", m80624l = {65}, m80625m = "invokeSuspend")
public final class C31603o0ooOO0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24127OooO0oO.OooO00o f112930OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f112931OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31603o0ooOO0(C24127OooO0oO.OooO00o oooO00o, Continuation continuation) {
        super(1, continuation);
        this.f112930OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C31603o0ooOO0(this.f112930OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<Object> continuation) {
        return ((C31603o0ooOO0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f112931OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f112931OooOo0o = 1;
        Object objO00000oO = Oooo0oO.o0OoOo0.OooO00o(getContext()).o00000oO(this.f112930OooOo, this);
        return objO00000oO == enumC32485OooO00o ? enumC32485OooO00o : objO00000oO;
    }
}
