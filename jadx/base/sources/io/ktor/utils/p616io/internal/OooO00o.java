package io.ktor.utils.p616io.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o<T> implements Continuation<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80797OooOo0o = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "state");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80796OooOo = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C19594OooO00o implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public InterfaceC33651OoooOoO f80798OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33672o00ooo f80799OooOo0o;

        public C19594OooO00o(InterfaceC33672o00ooo interfaceC33672o00ooo) {
            this.f80799OooOo0o = interfaceC33672o00ooo;
            InterfaceC33651OoooOoO interfaceC33651OoooOoOInvokeOnCompletion = interfaceC33672o00ooo.invokeOnCompletion(true, true, this);
            if (interfaceC33672o00ooo.isActive()) {
                this.f80798OooOo = interfaceC33651OoooOoOInvokeOnCompletion;
            }
        }

        public final void OooO00o() {
            InterfaceC33651OoooOoO interfaceC33651OoooOoO = this.f80798OooOo;
            if (interfaceC33651OoooOoO != null) {
                this.f80798OooOo = null;
                interfaceC33651OoooOoO.dispose();
            }
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            Throwable th2 = th;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OooO00o.f80797OooOo0o;
            OooO00o<T> oooO00o = OooO00o.this;
            oooO00o.getClass();
            do {
                atomicReferenceFieldUpdater = OooO00o.f80796OooOo;
                if (atomicReferenceFieldUpdater.compareAndSet(oooO00o, this, null)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(oooO00o) == this);
            OooO00o();
            if (th2 != null) {
                OooO00o.OooO00o(oooO00o, this.f80799OooOo0o, th2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final void OooO00o(OooO00o oooO00o, InterfaceC33672o00ooo interfaceC33672o00ooo, Throwable th) {
        while (true) {
            Object obj = oooO00o.state;
            if (obj instanceof Continuation) {
                Continuation continuation = (Continuation) obj;
                if (continuation.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o) != interfaceC33672o00ooo) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80797OooOo0o;
                while (!atomicReferenceFieldUpdater.compareAndSet(oooO00o, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(oooO00o) != obj) {
                        break;
                    }
                }
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
                continuation.resumeWith(C32446OooOOOo.OooO00o(th));
                return;
            }
            return;
        }
    }

    public final void OooO0OO(Throwable cause) {
        OooOOO0.OooO0oO(cause, "cause");
        resumeWith(C32446OooOOOo.OooO00o(cause));
        C19594OooO00o c19594OooO00o = (C19594OooO00o) f80796OooOo.getAndSet(this, null);
        if (c19594OooO00o != null) {
            c19594OooO00o.OooO00o();
        }
    }

    public final Object OooO0Oo(Continuation<? super T> continuation) {
        while (true) {
            Object obj = this.state;
            if (obj != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80797OooOo0o;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                return obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f80797OooOo0o;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, continuation)) {
                if (atomicReferenceFieldUpdater2.get(this) != null) {
                    break;
                }
            }
            InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) continuation.getContext().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
            C19594OooO00o c19594OooO00o = (C19594OooO00o) this.jobCancellationHandler;
            if ((c19594OooO00o != null ? c19594OooO00o.f80799OooOo0o : null) != interfaceC33672o00ooo) {
                if (interfaceC33672o00ooo == null) {
                    C19594OooO00o c19594OooO00o2 = (C19594OooO00o) f80796OooOo.getAndSet(this, null);
                    if (c19594OooO00o2 != null) {
                        c19594OooO00o2.OooO00o();
                    }
                } else {
                    C19594OooO00o c19594OooO00o3 = new C19594OooO00o(interfaceC33672o00ooo);
                    while (true) {
                        Object obj2 = this.jobCancellationHandler;
                        C19594OooO00o c19594OooO00o4 = (C19594OooO00o) obj2;
                        if (c19594OooO00o4 != null && c19594OooO00o4.f80799OooOo0o == interfaceC33672o00ooo) {
                            c19594OooO00o3.OooO00o();
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f80796OooOo;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, c19594OooO00o3)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                                break;
                            }
                        }
                        if (c19594OooO00o4 != null) {
                            c19594OooO00o4.OooO00o();
                        }
                    }
                }
            }
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        InterfaceC34415OooO0oo context;
        Object obj = this.state;
        Continuation continuation = obj instanceof Continuation ? (Continuation) obj : null;
        return (continuation == null || (context = continuation.getContext()) == null) ? OooO.f123416OooOo0o : context;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object objOooO00o;
        while (true) {
            Object obj2 = this.state;
            if (obj2 == null) {
                objOooO00o = C32445OooOOOO.OooO00o(obj);
                if (objOooO00o == null) {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO00o = obj;
                }
            } else if (!(obj2 instanceof Continuation)) {
                return;
            } else {
                objOooO00o = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80797OooOo0o;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objOooO00o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (obj2 instanceof Continuation) {
                ((Continuation) obj2).resumeWith(obj);
                return;
            }
            return;
        }
    }
}
