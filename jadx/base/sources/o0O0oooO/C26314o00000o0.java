package o0O0oooO;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0O0oooO.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$2", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26314o00000o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90159OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f90160OooOo0o;

    /* JADX INFO: renamed from: o0O0oooO.o00000o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$2$1", m80623f = "UserViewModel.kt", m80624l = {396}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26320o0000OoO f90161OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90162OooOo0o;

        /* JADX INFO: renamed from: o0O0oooO.o00000o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$2$1$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19737OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C26320o0000OoO f90163OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19737OooO00o(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
                super(2, continuation);
                this.f90163OooOo0o = c26320o0000OoO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19737OooO00o(continuation, this.f90163OooOo0o);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19737OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = this.f90163OooOo0o;
                c26320o0000OoO.getClass();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c26320o0000OoO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C26316o00000oo(null, c26320o0000OoO), 2);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
            super(2, continuation);
            this.f90161OooOo = c26320o0000OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(continuation, this.f90161OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90162OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = this.f90161OooOo;
                InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(c26320o0000OoO.f90248OoooOOO, 5000L);
                C19737OooO00o c19737OooO00o = new C19737OooO00o(null, c26320o0000OoO);
                this.f90162OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, c19737OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0O0oooO.o00000o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$2$2", m80623f = "UserViewModel.kt", m80624l = {400}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26320o0000OoO f90164OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90165OooOo0o;

        /* JADX INFO: renamed from: o0O0oooO.o00000o0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$2$2$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {
            public OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
            super(2, continuation);
            this.f90164OooOo = c26320o0000OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(continuation, this.f90164OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90165OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f90164OooOo.f90249OoooOOo;
                OooO00o oooO00o = new OooO00o(2, null);
                this.f90165OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
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
    public C26314o00000o0(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90159OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26314o00000o0 c26314o00000o0 = new C26314o00000o0(continuation, this.f90159OooOo);
        c26314o00000o0.f90160OooOo0o = obj;
        return c26314o00000o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26314o00000o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f90160OooOo0o;
        C26320o0000OoO c26320o0000OoO = this.f90159OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(null, c26320o0000OoO), 3);
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(null, c26320o0000OoO), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
