package o0ooOO0;

import Oooo0oO.InterfaceC21078Ooooooo;
import android.view.Choreographer;
import androidx.fragment.app.C21904OooOoo0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0ooOO0.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31546OoooOoo implements InterfaceC21078Ooooooo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Choreographer f112763OooOo0o;

    public C31546OoooOoo(Choreographer choreographer) {
        this.f112763OooOo0o = choreographer;
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
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = abstractC32479OooO0OO.getContext().get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
        C31542OoooOOO c31542OoooOOO = oooO0O0 instanceof C31542OoooOOO ? (C31542OoooOOO) oooO0O0 : null;
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        c33614OooOOO0.OooOOoo();
        ChoreographerFrameCallbackC31545OoooOoO choreographerFrameCallbackC31545OoooOoO = new ChoreographerFrameCallbackC31545OoooOoO(c33614OooOOO0, this, interfaceC32507OooOO0o);
        if (c31542OoooOOO == null || !kotlin.jvm.internal.OooOOO0.OooO0O0(c31542OoooOOO.f112746OooOoO0, this.f112763OooOo0o)) {
            this.f112763OooOo0o.postFrameCallback(choreographerFrameCallbackC31545OoooOoO);
            c33614OooOOO0.OooOo0(new C31544OoooOo0(this, choreographerFrameCallbackC31545OoooOoO));
        } else {
            synchronized (c31542OoooOOO.f112747OooOoOO) {
                try {
                    c31542OoooOOO.f112748OooOoo.add(choreographerFrameCallbackC31545OoooOoO);
                    if (!c31542OoooOOO.f112752Oooo000) {
                        c31542OoooOOO.f112752Oooo000 = true;
                        c31542OoooOOO.f112746OooOoO0.postFrameCallback(c31542OoooOOO.f112753Oooo00O);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c33614OooOOO0.OooOo0(new C31543OoooOOo(c31542OoooOOO, choreographerFrameCallbackC31545OoooOoO));
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }
}
