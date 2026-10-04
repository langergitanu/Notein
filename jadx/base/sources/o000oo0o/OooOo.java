package o000oo0o;

import kotlin.coroutines.Continuation;
import o00OooO0.C25150OooO00o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.C33662Ooooooo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33622OooOo00;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", m80623f = "RunBlockingUninterruptible.android.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o<T> extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC32476OooO f83837OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f83838OooOo0o;

        /* JADX INFO: renamed from: o000oo0o.OooOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", m80623f = "RunBlockingUninterruptible.android.kt", m80624l = {52}, m80625m = "invokeSuspend")
        public static final class C19646OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f83839OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83840OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ AbstractC32476OooO f83841OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C33621OooOo0 f83842OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19646OooO00o(C33621OooOo0 c33621OooOo0, InterfaceC32508OooOOOo interfaceC32508OooOOOo, Continuation continuation) {
                super(2, continuation);
                this.f83842OooOoO0 = c33621OooOo0;
                this.f83841OooOoO = (AbstractC32476OooO) interfaceC32508OooOOOo;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19646OooO00o c19646OooO00o = new C19646OooO00o(this.f83842OooOoO0, this.f83841OooOoO, continuation);
                c19646OooO00o.f83839OooOo = obj;
                return c19646OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19646OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                InterfaceC33622OooOo00 interfaceC33622OooOo00;
                InterfaceC33622OooOo00 interfaceC33622OooOo002;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83840OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f83839OooOo;
                    C33621OooOo0 c33621OooOo0 = this.f83842OooOoO0;
                    ?? r3 = this.f83841OooOoO;
                    try {
                        this.f83839OooOo = c33621OooOo0;
                        this.f83840OooOo0o = 1;
                        obj = r3.invoke(interfaceC33636Oooo00o, this);
                        if (obj == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        interfaceC33622OooOo002 = c33621OooOo0;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC33622OooOo00 = c33621OooOo0;
                        obj = C32446OooOOOo.OooO00o(th);
                        interfaceC33622OooOo002 = interfaceC33622OooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33622OooOo00 = (InterfaceC33622OooOo00) this.f83839OooOo;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        interfaceC33622OooOo002 = interfaceC33622OooOo00;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = C32446OooOOOo.OooO00o(th);
                        interfaceC33622OooOo002 = interfaceC33622OooOo00;
                    }
                }
                Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
                if (thOooO00o == null) {
                    interfaceC33622OooOo002.Oooo0(obj);
                } else {
                    interfaceC33622OooOo002.OooO00o(thOooO00o);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", m80623f = "RunBlockingUninterruptible.android.kt", m80624l = {58}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super T>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C33621OooOo0 f83843OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f83844OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(C33621OooOo0 c33621OooOo0, Continuation continuation) {
                super(2, continuation);
                this.f83843OooOo = c33621OooOo0;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f83843OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Object obj) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, (Continuation) obj)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f83844OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return obj;
                }
                C32446OooOOOo.OooO0O0(obj);
                this.f83844OooOo0o = 1;
                Object objOooOo00 = this.f83843OooOo.OooOo00(this);
                return objOooOo00 == enumC32485OooO00o ? enumC32485OooO00o : objOooOo00;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super T>, ? extends Object> interfaceC32508OooOOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f83837OooOo = (AbstractC32476OooO) interfaceC32508OooOOOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f83837OooOo, continuation);
            oooO00o.f83838OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Object obj) {
            return ((OooO00o) create(interfaceC33636Oooo00o, (Continuation) obj)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = ((InterfaceC33636Oooo00o) this.f83838OooOo0o).OooOOO0().get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
            InterfaceC34412OooO0o interfaceC34412OooO0o = (InterfaceC34412OooO0o) oooO0O0;
            C33621OooOo0 c33621OooOo0OooO0Oo = C25150OooO00o.OooO0Oo();
            C33609OooO0oo.OooO0O0(C33662Ooooooo.f121350OooOo0o, interfaceC34412OooO0o, EnumC33637Oooo0O0.f121318OooOoO, new C19646OooO00o(c33621OooOo0OooO0Oo, this.f83837OooOo, null));
            while (!c33621OooOo0OooO0Oo.isCompleted()) {
                try {
                    return C33609OooO0oo.OooO0Oo(interfaceC34412OooO0o, new OooO0O0(c33621OooOo0OooO0Oo, null));
                } catch (InterruptedException unused) {
                }
            }
            return c33621OooOo0OooO0Oo.OooOoo();
        }
    }

    public static final <T> T OooO00o(InterfaceC32508OooOOOo<? super InterfaceC33636Oooo00o, ? super Continuation<? super T>, ? extends Object> interfaceC32508OooOOOo) {
        Thread.interrupted();
        return (T) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooO00o(interfaceC32508OooOOOo, null));
    }
}
