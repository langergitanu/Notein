package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO0o0Oo.o00O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33778o00O0O implements InterfaceC33788ooOO {

    /* JADX INFO: renamed from: oO0o0Oo.o00O0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.StartedLazily$command$1", m80623f = "SharingStarted.kt", m80624l = {151}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super EnumC33776Ooooooo>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121781OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121782OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33780o00Ooo<Integer> f121783OooOoO0;

        /* JADX INFO: renamed from: oO0o0Oo.o00O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20330OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO<EnumC33776Ooooooo> f121784OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C24030OooOoo f121785OooOo0o;

            /* JADX INFO: renamed from: oO0o0Oo.o00O0O$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m80623f = "SharingStarted.kt", m80624l = {154}, m80625m = "emit")
            public static final class C20331OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ C20330OooO00o<T> f121786OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f121787OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public int f121788OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C20331OooO00o(C20330OooO00o<? super T> c20330OooO00o, Continuation<? super C20331OooO00o> continuation) {
                    super(continuation);
                    this.f121786OooOo = c20330OooO00o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f121787OooOo0o = obj;
                    this.f121788OooOoO0 |= Integer.MIN_VALUE;
                    return this.f121786OooOo.OooO00o(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C20330OooO00o(C24030OooOoo c24030OooOoo, InterfaceC33723OooO0oO<? super EnumC33776Ooooooo> interfaceC33723OooO0oO) {
                this.f121785OooOo0o = c24030OooOoo;
                this.f121784OooOo = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object OooO00o(int i, Continuation<? super C32460OooOooO> continuation) {
                C20331OooO00o c20331OooO00o;
                if (continuation instanceof C20331OooO00o) {
                    c20331OooO00o = (C20331OooO00o) continuation;
                    int i2 = c20331OooO00o.f121788OooOoO0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c20331OooO00o.f121788OooOoO0 = i2 - Integer.MIN_VALUE;
                    } else {
                        c20331OooO00o = new C20331OooO00o(this, continuation);
                    }
                }
                Object obj = c20331OooO00o.f121787OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i3 = c20331OooO00o.f121788OooOoO0;
                if (i3 == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (i > 0) {
                        C24030OooOoo c24030OooOoo = this.f121785OooOo0o;
                        if (!c24030OooOoo.f80938OooOo0o) {
                            c24030OooOoo.f80938OooOo0o = true;
                            EnumC33776Ooooooo enumC33776Ooooooo = EnumC33776Ooooooo.f121772OooOo0o;
                            c20331OooO00o.f121788OooOoO0 = 1;
                            if (this.f121784OooOo.emit(enumC33776Ooooooo, c20331OooO00o) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return OooO00o(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC33780o00Ooo<Integer> interfaceC33780o00Ooo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f121783OooOoO0 = interfaceC33780o00Ooo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f121783OooOoO0, continuation);
            oooO00o.f121781OooOo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super EnumC33776Ooooooo> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121782OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C20330OooO00o c20330OooO00o = new C20330OooO00o(new C24030OooOoo(), (InterfaceC33723OooO0oO) this.f121781OooOo);
                this.f121782OooOo0o = 1;
                if (this.f121783OooOoO0.collect(c20330OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    @Override // oO0o0Oo.InterfaceC33788ooOO
    public final InterfaceC33721OooO0o<EnumC33776Ooooooo> OooO00o(InterfaceC33780o00Ooo<Integer> interfaceC33780o00Ooo) {
        return new C33770OooooO0(new OooO00o(interfaceC33780o00Ooo, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
