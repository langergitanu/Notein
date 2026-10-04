package io.ktor.utils.p616io.jvm.javaio;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.AbstractC33655OooooO0;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OO.o0000Ooo;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f80842OooO0o = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "state");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33672o00ooo f80843OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f80844OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33651OoooOoO f80845OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f80846OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f80847OooO0o0;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    /* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", m80623f = "Blocking.kt", m80624l = {186}, m80625m = "invokeSuspend")
    public static final class C19596OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f80849OooOo0o;

        public C19596OooO00o(Continuation<? super C19596OooO00o> continuation) {
            super(1, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return OooO00o.this.new C19596OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((C19596OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f80849OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f80849OooOo0o = 1;
                if (OooO00o.this.OooO00o(this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {
        public OooO0O0() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 != null) {
                OooO00o.this.f80844OooO0O0.resumeWith(C32446OooOOOo.OooO00o(th2));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO implements Continuation<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC34415OooO0oo f80852OooOo0o;

        public OooO0OO() {
            InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO0Oo;
            InterfaceC33672o00ooo interfaceC33672o00ooo = OooO00o.this.f80843OooO00o;
            if (interfaceC33672o00ooo != null) {
                OooOO0 oooOO02 = OooOO0.f80867OooOoO0;
                oooOO02.getClass();
                interfaceC34415OooO0ooOooO0Oo = InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(oooOO02, interfaceC33672o00ooo);
            } else {
                interfaceC34415OooO0ooOooO0Oo = OooOO0.f80867OooOoO0;
            }
            this.f80852OooOo0o = interfaceC34415OooO0ooOooO0Oo;
        }

        @Override // kotlin.coroutines.Continuation
        public final InterfaceC34415OooO0oo getContext() {
            return this.f80852OooOo0o;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            Object obj2;
            boolean z;
            boolean z2;
            Throwable thOooO00o;
            InterfaceC33672o00ooo interfaceC33672o00ooo;
            Object objOooO00o = C32445OooOOOO.OooO00o(obj);
            if (objOooO00o == null) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            OooO00o oooO00o = OooO00o.this;
            do {
                obj2 = oooO00o.state;
                z = obj2 instanceof Thread;
                z2 = true;
                if (!(z ? true : obj2 instanceof Continuation ? true : OooOOO0.OooO0O0(obj2, this))) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o.f80842OooO0o;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(oooO00o, obj2, objOooO00o)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(oooO00o) != obj2) {
                        z2 = false;
                        break;
                    }
                }
            } while (!z2);
            if (z) {
                OooO0o oooO0o = C24003OooO0oO.f80865OooO00o.get();
                if (oooO0o == null) {
                    oooO0o = io.ktor.utils.p616io.jvm.javaio.OooO0OO.f80855OooO00o;
                }
                oooO0o.OooO0O0(obj2);
            } else if ((obj2 instanceof Continuation) && (thOooO00o = C32445OooOOOO.OooO00o(obj)) != null) {
                ((Continuation) obj2).resumeWith(C32446OooOOOo.OooO00o(thOooO00o));
            }
            if ((obj instanceof C32445OooOOOO.OooO00o) && !(C32445OooOOOO.OooO00o(obj) instanceof CancellationException) && (interfaceC33672o00ooo = OooO00o.this.f80843OooO00o) != null) {
                interfaceC33672o00ooo.cancel((CancellationException) null);
            }
            InterfaceC33651OoooOoO interfaceC33651OoooOoO = OooO00o.this.f80845OooO0OO;
            if (interfaceC33651OoooOoO != null) {
                interfaceC33651OoooOoO.dispose();
            }
        }
    }

    public OooO00o() {
        this(null);
    }

    public abstract Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO);

    public final int OooO0O0(int i, int i2, byte[] bArr) throws Throwable {
        Object c32442OooOO0o;
        this.f80846OooO0Oo = i;
        this.f80847OooO0o0 = i2;
        Thread thread = Thread.currentThread();
        Continuation continuation = null;
        while (true) {
            Object obj = this.state;
            if (obj instanceof Continuation) {
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>");
                continuation = (Continuation) obj;
                c32442OooOO0o = thread;
            } else {
                if (obj instanceof C32460OooOooO) {
                    return this.result;
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                if (obj instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (OooOOO0.OooO0O0(obj, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                c32442OooOO0o = new C32442OooOO0o();
            }
            OooOOO0.OooO0o(c32442OooOO0o, "when (value) {\n         …Exception()\n            }");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80842OooO0o;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c32442OooOO0o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            OooOOO0.OooO0Oo(continuation);
            continuation.resumeWith(bArr);
            OooOOO0.OooO0o(thread, "thread");
            if (this.state == thread) {
                OooO0o<Thread> oooO0o = C24003OooO0oO.f80865OooO00o.get();
                io.ktor.utils.p616io.jvm.javaio.OooO0OO oooO0OO = io.ktor.utils.p616io.jvm.javaio.OooO0OO.f80855OooO00o;
                if (oooO0o == null) {
                    oooO0o = oooO0OO;
                }
                if (oooO0o == C24004OooO0oo.f80866OooO00o) {
                    ((InterfaceC34352OooO0O0) io.ktor.utils.p616io.jvm.javaio.OooO0O0.f80853OooO00o.getValue()).OooOOoo("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
                }
                while (true) {
                    AbstractC33655OooooO0 abstractC33655OooooO0 = o0000Ooo.f121365OooO00o.get();
                    long jO000Oo0o = abstractC33655OooooO0 != null ? abstractC33655OooooO0.o000Oo0o() : LocationRequestCompat.PASSIVE_INTERVAL;
                    if (this.state != thread) {
                        break;
                    }
                    if (jO000Oo0o > 0) {
                        OooO0o<Thread> oooO0o2 = C24003OooO0oO.f80865OooO00o.get();
                        if (oooO0o2 == null) {
                            oooO0o2 = oooO0OO;
                        }
                        oooO0o2.OooO00o(jO000Oo0o);
                    }
                }
            }
            Object obj2 = this.state;
            if (obj2 instanceof Throwable) {
                throw ((Throwable) obj2);
            }
            return this.result;
        }
    }

    public OooO00o(InterfaceC33672o00ooo interfaceC33672o00ooo) {
        this.f80843OooO00o = interfaceC33672o00ooo;
        OooO0OO oooO0OO = new OooO0OO();
        this.f80844OooO0O0 = oooO0OO;
        this.state = this;
        this.result = 0;
        this.f80845OooO0OO = interfaceC33672o00ooo != null ? interfaceC33672o00ooo.invokeOnCompletion(new OooO0O0()) : null;
        C19596OooO00o c19596OooO00o = new C19596OooO00o(null);
        C24039Oooo0o0.OooO0o0(1, c19596OooO00o);
        c19596OooO00o.invoke(oooO0OO);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
