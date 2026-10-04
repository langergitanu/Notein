package oO0o0OO;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32477OooO00o;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33844OooOoO0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33602OooO00o<T> extends o0ooOOo implements Continuation<T>, InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121272OooOoO0;

    public AbstractC33602OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, boolean z, boolean z2) {
        super(z2);
        if (z) {
            Oooo0oO((InterfaceC33672o00ooo) interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o));
        }
        this.f121272OooOoO0 = interfaceC34415OooO0oo.plus(this);
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f121272OooOoO0;
    }

    @Override // oO0o0OO.o0ooOOo
    public final String OooOo() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // oO0o0OO.o0ooOOo
    public final void Oooo0o(C33626OooOoO0 c33626OooOoO0) {
        C33634Oooo000.OooO00o(c33626OooOoO0, this.f121272OooOoO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0o0OO.o0ooOOo
    public final void OoooOOO(Object obj) {
        if (!(obj instanceof C33620OooOo)) {
            OoooooO(obj);
            return;
        }
        C33620OooOo c33620OooOo = (C33620OooOo) obj;
        Oooooo(C33620OooOo.f121303OooO0O0.get(c33620OooOo) != 0, c33620OooOo.f121304OooO00o);
    }

    public void Oooooo(boolean z, Throwable th) {
    }

    public void OoooooO(T t) {
    }

    public final void Ooooooo(EnumC33637Oooo0O0 enumC33637Oooo0O0, AbstractC33602OooO00o abstractC33602OooO00o, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        Object objInvoke;
        int iOrdinal = enumC33637Oooo0O0.ordinal();
        if (iOrdinal == 0) {
            try {
                C33826OooO0oO.OooO00o(C32460OooOooO.f116667OooO00o, C21904OooOoo0.OooO0o0(C21904OooOoo0.OooO0O0(abstractC33602OooO00o, this, interfaceC32508OooOOOo)));
                return;
            } finally {
                resumeWith(C32446OooOOOo.OooO00o(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32508OooOOOo, "<this>");
                C21904OooOoo0.OooO0o0(C21904OooOoo0.OooO0O0(abstractC33602OooO00o, this, interfaceC32508OooOOOo)).resumeWith(C32460OooOooO.f116667OooO00o);
                return;
            }
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
            try {
                InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121272OooOoO0;
                Object objOooO0OO = C33844OooOoO0.OooO0OO(interfaceC34415OooO0oo, null);
                try {
                    if (interfaceC32508OooOOOo instanceof AbstractC32477OooO00o) {
                        C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
                        objInvoke = interfaceC32508OooOOOo.invoke(abstractC33602OooO00o, this);
                    } else {
                        objInvoke = C21904OooOoo0.OooO0oo(interfaceC32508OooOOOo, abstractC33602OooO00o, this);
                    }
                    C33844OooOoO0.OooO00o(interfaceC34415OooO0oo, objOooO0OO);
                    if (objInvoke != EnumC32485OooO00o.f116726OooOo0o) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    C33844OooOoO0.OooO00o(interfaceC34415OooO0oo, objOooO0OO);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return this.f121272OooOoO0;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o != null) {
            obj = new C33620OooOo(false, thOooO00o);
        }
        Object objOoooO0 = OoooO0(obj);
        if (objOoooO0 == o0Oo0oo.f121383OooO0O0) {
            return;
        }
        OooOOoo(objOoooO0);
    }
}
