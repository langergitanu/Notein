package oO0o0OO;

import kotlin.coroutines.Continuation;
import o00oo0OO.C25683OooO0OO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0Ooo.C33835OooOOo;
import oO0o0Ooo.C33844OooOoO0;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O0<T> extends C33835OooOOo<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ThreadLocal<C32443OooOOO<InterfaceC34415OooO0oo, Object>> f121362OooOoOO;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0000O0(Continuation continuation, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        o0000O0O o0000o0o2 = o0000O0O.f121364OooOo0o;
        super(continuation, interfaceC34415OooO0oo.get(o0000o0o2) == null ? interfaceC34415OooO0oo.plus(o0000o0o2) : interfaceC34415OooO0oo);
        this.f121362OooOoOO = new ThreadLocal<>();
        if (continuation.getContext().get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o) instanceof AbstractC33630OooOooO) {
            return;
        }
        Object objOooO0OO = C33844OooOoO0.OooO0OO(interfaceC34415OooO0oo, null);
        C33844OooOoO0.OooO00o(interfaceC34415OooO0oo, objOooO0OO);
        o00O0O(interfaceC34415OooO0oo, objOooO0OO);
    }

    @Override // oO0o0Ooo.C33835OooOOo, oO0o0OO.o0ooOOo
    public final void OooOOoo(Object obj) {
        if (this.threadLocalIsSet) {
            C32443OooOOO<InterfaceC34415OooO0oo, Object> c32443OooOOO = this.f121362OooOoOO.get();
            if (c32443OooOOO != null) {
                C33844OooOoO0.OooO00o(c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
            }
            this.f121362OooOoOO.remove();
        }
        Object objOooO0O0 = C25683OooO0OO.OooO0O0(obj);
        Continuation<T> continuation = this.f121948OooOoO;
        InterfaceC34415OooO0oo context = continuation.getContext();
        Object objOooO0OO = C33844OooOoO0.OooO0OO(context, null);
        o0000O0<?> o0000o0OooO0OO = objOooO0OO != C33844OooOoO0.f121957OooO00o ? C33628OooOoo.OooO0OO(continuation, context, objOooO0OO) : null;
        try {
            this.f121948OooOoO.resumeWith(objOooO0O0);
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
    }

    public final void o00O0O(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Object obj) {
        this.threadLocalIsSet = true;
        this.f121362OooOoOO.set(new C32443OooOOO<>(interfaceC34415OooO0oo, obj));
    }

    public final boolean o0OoOo0() {
        boolean z = this.threadLocalIsSet && this.f121362OooOoOO.get() == null;
        this.f121362OooOoOO.remove();
        return !z;
    }
}
