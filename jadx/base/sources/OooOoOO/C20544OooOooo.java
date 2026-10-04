package OooOoOO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m80623f = "InfiniteAnimationPolicy.kt", m80624l = {31}, m80625m = "invokeSuspend")
public final class C20544OooOooo extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f58674OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f58675OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20544OooOooo(InterfaceC32507OooOO0o<? super Long, Object> interfaceC32507OooOO0o, Continuation<? super C20544OooOooo> continuation) {
        super(1, continuation);
        this.f58674OooOo = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C20544OooOooo(this.f58674OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<Object> continuation) {
        return ((C20544OooOooo) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f58675OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f58675OooOo0o = 1;
        Object objO00000oO = Oooo0oO.o0OoOo0.OooO00o(getContext()).o00000oO(this.f58674OooOo, this);
        return objO00000oO == enumC32485OooO00o ? enumC32485OooO00o : objO00000oO;
    }
}
