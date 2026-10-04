package oO0o0OoO;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.C33710OooOo0;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33800OooOO0o<T> extends AbstractC33796OooO0oO<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Object f121859OooOoO;

    /* JADX INFO: renamed from: oO0o0OoO.OooOO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m80623f = "Merge.kt", m80624l = {92}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o<T> f121860OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f121861OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C33815OooOoOO<T> f121862OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC33721OooO0o<? extends T> interfaceC33721OooO0o, C33815OooOoOO<T> c33815OooOoOO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f121860OooOo = interfaceC33721OooO0o;
            this.f121862OooOoO0 = c33815OooOoOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f121860OooOo, this.f121862OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f121861OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f121861OooOo0o = 1;
                if (this.f121860OooOo.collect(this.f121862OooOoO0, this) == enumC32485OooO00o) {
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

    public C33800OooOO0o(Iterable<? extends InterfaceC33721OooO0o<? extends T>> iterable, InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        super(interfaceC34415OooO0oo, i, enumC33692OooO0OO);
        this.f121859OooOoO = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final Object OooO0O0(InterfaceC33712OooOo0O<? super T> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        C33815OooOoOO c33815OooOoOO = new C33815OooOoOO(interfaceC33712OooOo0O);
        Iterator it = this.f121859OooOoO.iterator();
        while (it.hasNext()) {
            C33609OooO0oo.OooO0OO(interfaceC33712OooOo0O, null, null, new OooO00o((InterfaceC33721OooO0o) it.next(), c33815OooOoOO, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final AbstractC33796OooO0oO<T> OooO0o0(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return new C33800OooOO0o(this.f121859OooOoO, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
    }

    @Override // oO0o0OoO.AbstractC33796OooO0oO
    public final C33710OooOo0 OooO0oo(InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
        InterfaceC32508OooOOOo c33794OooO0o = new C33794OooO0o(this, null);
        EnumC33692OooO0OO enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
        EnumC33637Oooo0O0 enumC33637Oooo0O0 = EnumC33637Oooo0O0.f121317OooOo0o;
        C33710OooOo0 c33710OooOo0 = new C33710OooOo0(C33628OooOoo.OooO0O0(interfaceC33636Oooo00o, this.f121835OooOo0o), C33703OooOOO0.OooO00o(this.f121834OooOo, 4, enumC33692OooO0OO), true, true);
        c33710OooOo0.Ooooooo(enumC33637Oooo0O0, c33710OooOo0, c33794OooO0o);
        return c33710OooOo0;
    }
}
