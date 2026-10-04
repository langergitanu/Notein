package Oooo0OO;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20528OooOOO0;
import OooOoOO.C20538OooOoO;
import OooOoOO.C20573OoooooO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: Oooo0OO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m80623f = "RippleAnimation.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C20955OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20956OooOO0O f60480OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f60481OooOo0o;

    /* JADX INFO: renamed from: Oooo0OO.OooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m80623f = "RippleAnimation.kt", m80624l = {112}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20956OooOO0O f60482OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60483OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20956OooOO0O c20956OooOO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60482OooOo = c20956OooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f60482OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60483OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C20956OooOO0O c20956OooOO0O = this.f60482OooOo;
                Float f = new Float(0.0f);
                C20573OoooooO c20573OoooooOOooO0O0 = C20528OooOOO0.OooO0O0(150, 2, C20538OooOoO.f58667OooO0OO);
                this.f60483OooOo0o = 1;
                if (C20518OooO0OO.OooO0O0(c20956OooOO0O.f60491OooO0oO, f, c20573OoooooOOooO0O0, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20955OooOO0(C20956OooOO0O c20956OooOO0O, Continuation<? super C20955OooOO0> continuation) {
        super(2, continuation);
        this.f60480OooOo = c20956OooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20955OooOO0 c20955OooOO0 = new C20955OooOO0(this.f60480OooOo, continuation);
        c20955OooOO0.f60481OooOo0o = obj;
        return c20955OooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo> continuation) {
        return ((C20955OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f60481OooOo0o, null, null, new OooO00o(this.f60480OooOo, null), 3);
    }
}
