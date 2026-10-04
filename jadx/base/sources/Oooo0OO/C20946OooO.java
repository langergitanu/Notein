package Oooo0OO;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20528OooOOO0;
import OooOoOO.C20529OooOOOO;
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

/* JADX INFO: renamed from: Oooo0OO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m80623f = "RippleAnimation.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C20946OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20956OooOO0O f60435OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f60436OooOo0o;

    /* JADX INFO: renamed from: Oooo0OO.OooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m80623f = "RippleAnimation.kt", m80624l = {89}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20956OooOO0O f60437OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60438OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20956OooOO0O c20956OooOO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60437OooOo = c20956OooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f60437OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60438OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO = this.f60437OooOo.f60491OooO0oO;
                Float f = new Float(1.0f);
                C20573OoooooO c20573OoooooOOooO0O0 = C20528OooOOO0.OooO0O0(75, 2, C20538OooOoO.f58667OooO0OO);
                this.f60438OooOo0o = 1;
                if (C20518OooO0OO.OooO0O0(c20518OooO0OO, f, c20573OoooooOOooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: Oooo0OO.OooO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m80623f = "RippleAnimation.kt", m80624l = {95}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20956OooOO0O f60439OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60440OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C20956OooOO0O c20956OooOO0O, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f60439OooOo = c20956OooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f60439OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60440OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO = this.f60439OooOo.f60492OooO0oo;
                Float f = new Float(1.0f);
                C20573OoooooO c20573OoooooOOooO0O0 = C20528OooOOO0.OooO0O0(225, 2, C20538OooOoO.f58665OooO00o);
                this.f60440OooOo0o = 1;
                if (C20518OooO0OO.OooO0O0(c20518OooO0OO, f, c20573OoooooOOooO0O0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: Oooo0OO.OooO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m80623f = "RippleAnimation.kt", m80624l = {101}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20956OooOO0O f60441OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60442OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C20956OooOO0O c20956OooOO0O, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f60441OooOo = c20956OooOO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f60441OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60442OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO = this.f60441OooOo.f60484OooO;
                Float f = new Float(1.0f);
                C20573OoooooO c20573OoooooOOooO0O0 = C20528OooOOO0.OooO0O0(225, 2, C20538OooOoO.f58667OooO0OO);
                this.f60442OooOo0o = 1;
                if (C20518OooO0OO.OooO0O0(c20518OooO0OO, f, c20573OoooooOOooO0O0, this) == enumC32485OooO00o) {
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
    public C20946OooO(C20956OooOO0O c20956OooOO0O, Continuation<? super C20946OooO> continuation) {
        super(2, continuation);
        this.f60435OooOo = c20956OooOO0O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20946OooO c20946OooO = new C20946OooO(this.f60435OooOo, continuation);
        c20946OooO.f60436OooOo0o = obj;
        return c20946OooO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo> continuation) {
        return ((C20946OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f60436OooOo0o;
        C20956OooOO0O c20956OooOO0O = this.f60435OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(c20956OooOO0O, null), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(c20956OooOO0O, null), 3);
        return C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(c20956OooOO0O, null), 3);
    }
}
