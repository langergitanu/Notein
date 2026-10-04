package Oooo0oO;

import android.view.Choreographer;
import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: Oooo0oO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21057Oooo0o0 implements InterfaceC21078Ooooooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Choreographer f60996OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C21057Oooo0o0 f60997OooOo0o = new C21057Oooo0o0();

    /* JADX INFO: renamed from: Oooo0oO.Oooo0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", m80623f = "ActualAndroid.android.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Choreographer>, Object> {
        public OooO00o() {
            throw null;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(2, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Choreographer> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return Choreographer.getInstance();
        }
    }

    static {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        f60996OooOo = (Choreographer) C33609OooO0oo.OooO0Oo(C33833OooOOOO.f121946OooO00o.o000OOoO(), new OooO00o(2, null));
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        return (E) InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0O0(this, oooO0OO);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0OO(this, oooO0OO);
    }

    @Override // Oooo0oO.InterfaceC21078Ooooooo
    public final Object o00000oO(InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        c33614OooOOO0.OooOOoo();
        ChoreographerFrameCallbackC21058Oooo0oO choreographerFrameCallbackC21058Oooo0oO = new ChoreographerFrameCallbackC21058Oooo0oO(interfaceC32507OooOO0o, c33614OooOOO0);
        f60996OooOo.postFrameCallback(choreographerFrameCallbackC21058Oooo0oO);
        c33614OooOOO0.OooOo0(new C21056Oooo0o(choreographerFrameCallbackC21058Oooo0oO));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
