package oO0o0OO;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33824OooO0o;
import oO0o0Ooo.C33844OooOoO0;
import oO0o0o0o.AbstractRunnableC33878OooO0oO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33647OoooOO0<T> extends AbstractRunnableC33878OooO0oO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f121326OooOoO0;

    public AbstractC33647OoooOO0(int i) {
        this.f121326OooOoO0 = i;
    }

    public void OooO00o(CancellationException cancellationException) {
    }

    public abstract Continuation<T> OooO0Oo();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T OooO0o(Object obj) {
        return obj;
    }

    public Throwable OooO0o0(Object obj) {
        C33620OooOo c33620OooOo = obj instanceof C33620OooOo ? (C33620OooOo) obj : null;
        if (c33620OooOo != null) {
            return c33620OooOo.f121304OooO00o;
        }
        return null;
    }

    public final void OooO0oO(Throwable th) {
        C33634Oooo000.OooO00o(new C33638Oooo0OO("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), OooO0Oo().getContext());
    }

    public abstract Object OooO0oo();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation<T> continuationOooO0Oo = OooO0Oo();
            kotlin.jvm.internal.OooOOO0.OooO0o0(continuationOooO0Oo, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C33824OooO0o c33824OooO0o = (C33824OooO0o) continuationOooO0Oo;
            AbstractC32479OooO0OO abstractC32479OooO0OO = c33824OooO0o.f121920OooOoOO;
            Object obj = c33824OooO0o.f121921OooOoo;
            InterfaceC34415OooO0oo context = abstractC32479OooO0OO.getContext();
            Object objOooO0OO = C33844OooOoO0.OooO0OO(context, obj);
            InterfaceC33672o00ooo interfaceC33672o00ooo = null;
            o0000O0<?> o0000o0OooO0OO = objOooO0OO != C33844OooOoO0.f121957OooO00o ? C33628OooOoo.OooO0OO(abstractC32479OooO0OO, context, objOooO0OO) : null;
            try {
                InterfaceC34415OooO0oo context2 = abstractC32479OooO0OO.getContext();
                Object objOooO0oo = OooO0oo();
                Throwable thOooO0o0 = OooO0o0(objOooO0oo);
                if (thOooO0o0 == null) {
                    int i = this.f121326OooOoO0;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC33672o00ooo = (InterfaceC33672o00ooo) context2.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                    }
                }
                if (interfaceC33672o00ooo != null && !interfaceC33672o00ooo.isActive()) {
                    CancellationException cancellationException = interfaceC33672o00ooo.getCancellationException();
                    OooO00o(cancellationException);
                    abstractC32479OooO0OO.resumeWith(C32446OooOOOo.OooO00o(cancellationException));
                } else if (thOooO0o0 != null) {
                    abstractC32479OooO0OO.resumeWith(C32446OooOOOo.OooO00o(thOooO0o0));
                } else {
                    abstractC32479OooO0OO.resumeWith(OooO0o(objOooO0oo));
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                if (o0000o0OooO0OO == null || o0000o0OooO0OO.o0OoOo0()) {
                    C33844OooOoO0.OooO00o(context, objOooO0OO);
                }
            } catch (Throwable th) {
                if (o0000o0OooO0OO == null || o0000o0OooO0OO.o0OoOo0()) {
                    C33844OooOoO0.OooO00o(context, objOooO0OO);
                }
                throw th;
            }
        } catch (Throwable th2) {
            OooO0oO(th2);
        }
    }
}
