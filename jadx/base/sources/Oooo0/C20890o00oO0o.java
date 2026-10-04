package Oooo0;

import OooOoo.C20601OooOO0o;
import OooOoo.C20603OooOOOo;
import OooOoo.C20623Oooo0o0;
import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: Oooo0.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", m80623f = "LongPressTextDragObserver.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C20890o00oO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25088OooOoO f60224OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f60225OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20865o00000oO f60226OooOoO0;

    /* JADX INFO: renamed from: Oooo0.o00oO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", m80623f = "LongPressTextDragObserver.kt", m80624l = {82}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25088OooOoO f60227OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60228OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20865o00000oO f60229OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(InterfaceC25088OooOoO interfaceC25088OooOoO, InterfaceC20865o00000oO interfaceC20865o00000oO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60227OooOo = interfaceC25088OooOoO;
            this.f60229OooOoO0 = interfaceC20865o00000oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f60227OooOo, this.f60229OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60228OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f60228OooOo0o = 1;
                Object objOooO0O0 = C20623Oooo0o0.OooO0O0(this.f60227OooOo, new o0O0O00(this.f60229OooOoO0, null), this);
                if (objOooO0O0 != obj2) {
                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0O0 == obj2) {
                    return obj2;
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

    /* JADX INFO: renamed from: Oooo0.o00oO0o$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", m80623f = "LongPressTextDragObserver.kt", m80624l = {85}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25088OooOoO f60230OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60231OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20865o00000oO f60232OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InterfaceC25088OooOoO interfaceC25088OooOoO, InterfaceC20865o00000oO interfaceC20865o00000oO, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f60230OooOo = interfaceC25088OooOoO;
            this.f60232OooOoO0 = interfaceC20865o00000oO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f60230OooOo, this.f60232OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60231OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f60231OooOo0o = 1;
                InterfaceC20865o00000oO interfaceC20865o00000oO = this.f60232OooOoO0;
                o0OOO0o o0ooo0o2 = new o0OOO0o(interfaceC20865o00000oO);
                o0Oo0oo o0oo0oo2 = new o0Oo0oo(interfaceC20865o00000oO);
                o0OO00O o0oo00o2 = new o0OO00O(interfaceC20865o00000oO);
                oo0o0Oo oo0o0oo = new oo0o0Oo(interfaceC20865o00000oO);
                C20601OooOO0o.OooO00o oooO00o = C20601OooOO0o.f58918OooO00o;
                Object objOooO0O0 = C20623Oooo0o0.OooO0O0(this.f60230OooOo, new C20603OooOOOo(o0ooo0o2, oo0o0oo, o0oo00o2, o0oo0oo2, null), this);
                if (objOooO0O0 != obj2) {
                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0O0 != obj2) {
                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0O0 == obj2) {
                    return obj2;
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
    public C20890o00oO0o(InterfaceC25088OooOoO interfaceC25088OooOoO, InterfaceC20865o00000oO interfaceC20865o00000oO, Continuation<? super C20890o00oO0o> continuation) {
        super(2, continuation);
        this.f60224OooOo = interfaceC25088OooOoO;
        this.f60226OooOoO0 = interfaceC20865o00000oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C20890o00oO0o c20890o00oO0o = new C20890o00oO0o(this.f60224OooOo, this.f60226OooOoO0, continuation);
        c20890o00oO0o.f60225OooOo0o = obj;
        return c20890o00oO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo> continuation) {
        return ((C20890o00oO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f60225OooOo0o;
        InterfaceC25088OooOoO interfaceC25088OooOoO = this.f60224OooOo;
        InterfaceC20865o00000oO interfaceC20865o00000oO = this.f60226OooOoO0;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(interfaceC25088OooOoO, interfaceC20865o00000oO, null), 3);
        return C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(interfaceC25088OooOoO, interfaceC20865o00000oO, null), 3);
    }
}
