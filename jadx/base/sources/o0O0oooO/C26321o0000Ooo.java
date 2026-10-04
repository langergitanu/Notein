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
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;

/* JADX INFO: renamed from: o0O0oooO.o0000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$3", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26321o0000Ooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90266OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f90267OooOo0o;

    /* JADX INFO: renamed from: o0O0oooO.o0000Ooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$3$1", m80623f = "UserViewModel.kt", m80624l = {406}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26320o0000OoO f90268OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90269OooOo0o;

        /* JADX INFO: renamed from: o0O0oooO.o0000Ooo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$3$1$1", m80623f = "UserViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19740OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {
            public C19740OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19740OooO00o(2, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C19740OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
            super(2, continuation);
            this.f90268OooOo = c26320o0000OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(continuation, this.f90268OooOo);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90269OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33769Ooooo0o c33769Ooooo0o = this.f90268OooOo.f90249OoooOOo;
                C19740OooO00o c19740OooO00o = new C19740OooO00o(2, null);
                this.f90269OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, c19740OooO00o, this) == enumC32485OooO00o) {
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
    public C26321o0000Ooo(Continuation continuation, C26320o0000OoO c26320o0000OoO) {
        super(2, continuation);
        this.f90266OooOo = c26320o0000OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26321o0000Ooo c26321o0000Ooo = new C26321o0000Ooo(continuation, this.f90266OooOo);
        c26321o0000Ooo.f90267OooOo0o = obj;
        return c26321o0000Ooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26321o0000Ooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f90267OooOo0o, null, null, new OooO00o(null, this.f90266OooOo), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
