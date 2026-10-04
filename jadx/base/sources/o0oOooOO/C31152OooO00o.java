package o0oOooOO;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOooOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.BasePageOptionFragment$collectSelection$1", m80623f = "BasePageOptionFragment.kt", m80624l = {91}, m80625m = "invokeSuspend")
public final class C31152OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BasePageOptionFragment<Object> f111162OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111163OooOo0o;

    /* JADX INFO: renamed from: o0oOooOO.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.page.BasePageOptionFragment$collectSelection$1$1", m80623f = "BasePageOptionFragment.kt", m80624l = {92}, m80625m = "invokeSuspend")
    public static final class C20156OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BasePageOptionFragment<Object> f111164OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f111165OooOo0o;

        /* JADX INFO: renamed from: o0oOooOO.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20157OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ BasePageOptionFragment<T> f111166OooOo0o;

            public C20157OooO00o(BasePageOptionFragment<T> basePageOptionFragment) {
                this.f111166OooOo0o = basePageOptionFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
                BasePageOptionFragment<T> basePageOptionFragment = this.f111166OooOo0o;
                basePageOptionFragment.f79185OooOoO0 = t;
                for (BasePageOptionFragment.OooO00o oooO00o : (Iterable) basePageOptionFragment.f79183OooOo) {
                    oooO00o.f79188OooO0OO.setSelected(OooOOO0.OooO0O0(oooO00o.f79186OooO00o, t));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20156OooO00o(BasePageOptionFragment<Object> basePageOptionFragment, Continuation<? super C20156OooO00o> continuation) {
            super(2, continuation);
            this.f111164OooOo = basePageOptionFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C20156OooO00o(this.f111164OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C20156OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f111165OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                BasePageOptionFragment<Object> basePageOptionFragment = this.f111164OooOo;
                C33769Ooooo0o c33769Ooooo0oOooOoo0 = basePageOptionFragment.OooOoo0();
                C20157OooO00o c20157OooO00o = new C20157OooO00o(basePageOptionFragment);
                this.f111165OooOo0o = 1;
                if (c33769Ooooo0oOooOoo0.f121747OooOo0o.collect(c20157OooO00o, this) == enumC32485OooO00o) {
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
    public C31152OooO00o(BasePageOptionFragment<Object> basePageOptionFragment, Continuation<? super C31152OooO00o> continuation) {
        super(2, continuation);
        this.f111162OooOo = basePageOptionFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31152OooO00o(this.f111162OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31152OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111163OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BasePageOptionFragment<Object> basePageOptionFragment = this.f111162OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = basePageOptionFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            C20156OooO00o c20156OooO00o = new C20156OooO00o(basePageOptionFragment, null);
            this.f111163OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c20156OooO00o, this) == enumC32485OooO00o) {
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
