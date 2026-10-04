package oO0o0OO;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32460OooOooO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.InterfaceC33610OooOO0;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33824OooO0o;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33614OooOOO0<T> extends AbstractC33647OoooOO0<T> implements InterfaceC33611OooOO0O<T>, InterfaceC32480OooO0Oo, o000OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Continuation<T> f121298OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121299OooOoOO;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121296OooOoo0 = AtomicIntegerFieldUpdater.newUpdater(C33614OooOOO0.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121295OooOoo = AtomicReferenceFieldUpdater.newUpdater(C33614OooOOO0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121297OooOooO = AtomicReferenceFieldUpdater.newUpdater(C33614OooOOO0.class, Object.class, "_parentHandle$volatile");

    public C33614OooOOO0(int i, Continuation continuation) {
        super(i);
        this.f121298OooOoO = continuation;
        this.f121299OooOoOO = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C33603OooO0O0.f121273OooOo0o;
    }

    public static void OooOoO(o000000O o000000o2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + o000000o2 + ", already has " + obj).toString());
    }

    public static Object OooOooo(o000000O o000000o2, Object obj, int i, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        if (obj instanceof C33620OooOo) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC32510OooOOo0 != null || (o000000o2 instanceof InterfaceC33610OooOO0)) {
            return new C33624OooOo0o(obj, o000000o2 instanceof InterfaceC33610OooOO0 ? (InterfaceC33610OooOO0) o000000o2 : null, interfaceC32510OooOOo0, (CancellationException) null, 16);
        }
        return obj;
    }

    public final void OooO(InterfaceC33610OooOO0 interfaceC33610OooOO0, Throwable th) {
        try {
            interfaceC33610OooOO0.OooO00o(th);
        } catch (Throwable th2) {
            C33634Oooo000.OooO00o(new C33626OooOoO0("Exception in invokeOnCancellation handler for " + this, th2), this.f121299OooOoOO);
        }
    }

    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final void OooO00o(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121295OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o000000O) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C33620OooOo) {
                return;
            }
            if (!(obj instanceof C33624OooOo0o)) {
                cancellationException2 = cancellationException;
                C33624OooOo0o c33624OooOo0o = new C33624OooOo0o(obj, (InterfaceC33610OooOO0) null, (InterfaceC32510OooOOo0) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33624OooOo0o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C33624OooOo0o c33624OooOo0o2 = (C33624OooOo0o) obj;
            if (c33624OooOo0o2.f121309OooO0o0 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C33624OooOo0o c33624OooOo0oOooO00o = C33624OooOo0o.OooO00o(c33624OooOo0o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33624OooOo0oOooO00o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC33610OooOO0 interfaceC33610OooOO0 = c33624OooOo0o2.f121306OooO0O0;
            if (interfaceC33610OooOO0 != null) {
                OooO(interfaceC33610OooOO0, cancellationException);
            }
            InterfaceC32510OooOOo0<Throwable, R, InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0 = c33624OooOo0o2.f121307OooO0OO;
            if (interfaceC32510OooOOo0 != 0) {
                OooOO0(interfaceC32510OooOOo0, cancellationException, c33624OooOo0o2.f121305OooO00o);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // oO0o0OO.InterfaceC33611OooOO0O
    public final C33839OooOo0 OooO0O0(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        return Oooo000(obj, interfaceC32510OooOOo0);
    }

    @Override // oO0o0OO.o000OO
    public final void OooO0OO(AbstractC33837OooOOoo<?> abstractC33837OooOOoo, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f121296OooOoo0;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        OooOo0O(abstractC33837OooOOoo);
    }

    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final Continuation<T> OooO0Oo() {
        return this.f121298OooOoO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final <T> T OooO0o(Object obj) {
        return obj instanceof C33624OooOo0o ? (T) ((C33624OooOo0o) obj).f121305OooO00o : obj;
    }

    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final Throwable OooO0o0(Object obj) {
        Throwable thOooO0o0 = super.OooO0o0(obj);
        if (thOooO0o0 != null) {
            return thOooO0o0;
        }
        return null;
    }

    @Override // oO0o0OO.AbstractC33647OoooOO0
    public final Object OooO0oo() {
        return f121295OooOoo.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void OooOO0(InterfaceC32510OooOOo0<? super Throwable, ? super R, ? super InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0, Throwable th, R r) {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121299OooOoOO;
        try {
            interfaceC32510OooOOo0.invoke(th, r, interfaceC34415OooO0oo);
        } catch (Throwable th2) {
            C33634Oooo000.OooO00o(new C33626OooOoO0("Exception in resume onCancellation handler for " + this, th2), interfaceC34415OooO0oo);
        }
    }

    public final void OooOO0O(AbstractC33837OooOOoo<?> abstractC33837OooOOoo, Throwable th) {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f121299OooOoOO;
        int i = f121296OooOoo0.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC33837OooOOoo.OooO0oo(i, interfaceC34415OooO0oo);
        } catch (Throwable th2) {
            C33634Oooo000.OooO00o(new C33626OooOoO0("Exception in invokeOnCancellation handler for " + this, th2), interfaceC34415OooO0oo);
        }
    }

    public final void OooOO0o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121297OooOooO;
        InterfaceC33651OoooOoO interfaceC33651OoooOoO = (InterfaceC33651OoooOoO) atomicReferenceFieldUpdater.get(this);
        if (interfaceC33651OoooOoO == null) {
            return;
        }
        interfaceC33651OoooOoO.dispose();
        atomicReferenceFieldUpdater.set(this, o000000.f121353OooOo0o);
    }

    public final void OooOOO(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f121296OooOoo0;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                Continuation<T> continuation = this.f121298OooOoO;
                if (!z && (continuation instanceof C33824OooO0o)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f121326OooOoO0;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C33824OooO0o c33824OooO0o = (C33824OooO0o) continuation;
                        AbstractC33630OooOooO abstractC33630OooOooO = c33824OooO0o.f121919OooOoO;
                        InterfaceC34415OooO0oo context = c33824OooO0o.f121920OooOoOO.getContext();
                        if (abstractC33630OooOooO.o000OOO(context)) {
                            abstractC33630OooOooO.o0OoO0o(context, this);
                            return;
                        }
                        AbstractC33655OooooO0 abstractC33655OooooO0OooO00o = o0000Ooo.OooO00o();
                        if (abstractC33655OooooO0OooO00o.f121336OooOoO0 >= 4294967296L) {
                            abstractC33655OooooO0OooO00o.o000Oo00(this);
                            return;
                        }
                        abstractC33655OooooO0OooO00o.o000Oo0O(true);
                        try {
                            C33669o000oOoO.OooO00o(this, continuation, true);
                            do {
                            } while (abstractC33655OooooO0OooO00o.o000Oo());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                C33669o000oOoO.OooO00o(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final void OooOOO0() {
        if (OooOoO0()) {
            return;
        }
        OooOO0o();
    }

    @Override // oO0o0OO.InterfaceC33611OooOO0O
    public final void OooOOOO(Object obj) {
        OooOOO(this.f121326OooOoO0);
    }

    @Override // oO0o0OO.InterfaceC33611OooOO0O
    public final <R extends T> void OooOOOo(R r, InterfaceC32510OooOOo0<? super Throwable, ? super R, ? super InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0) {
        OooOoo(r, this.f121326OooOoO0, interfaceC32510OooOOo0);
    }

    public final Object OooOOo() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zOooOoO0 = OooOoO0();
        do {
            atomicIntegerFieldUpdater = f121296OooOoo0;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zOooOoO0) {
                    OooOoo0();
                }
                Object obj = f121295OooOoo.get(this);
                if (obj instanceof C33620OooOo) {
                    throw ((C33620OooOo) obj).f121304OooO00o;
                }
                int i3 = this.f121326OooOoO0;
                if (i3 == 1 || i3 == 2) {
                    InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) this.f121299OooOoOO.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
                    if (interfaceC33672o00ooo != null && !interfaceC33672o00ooo.isActive()) {
                        CancellationException cancellationException = interfaceC33672o00ooo.getCancellationException();
                        OooO00o(cancellationException);
                        throw cancellationException;
                    }
                }
                return OooO0o(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC33651OoooOoO) f121297OooOooO.get(this)) == null) {
            OooOo00();
        }
        if (zOooOoO0) {
            OooOoo0();
        }
        return EnumC32485OooO00o.f116726OooOo0o;
    }

    public Throwable OooOOo0(o0ooOOo o0ooooo2) {
        return o0ooooo2.getCancellationException();
    }

    public final void OooOOoo() {
        InterfaceC33651OoooOoO interfaceC33651OoooOoOOooOo00 = OooOo00();
        if (interfaceC33651OoooOoOOooOo00 == null || (f121295OooOoo.get(this) instanceof o000000O)) {
            return;
        }
        interfaceC33651OoooOoOOooOo00.dispose();
        f121297OooOooO.set(this, o000000.f121353OooOo0o);
    }

    public final boolean OooOo() {
        return f121295OooOoo.get(this) instanceof C33615OooOOOO;
    }

    public final void OooOo0(InterfaceC32507OooOO0o<? super Throwable, C32460OooOooO> interfaceC32507OooOO0o) {
        OooOo0O(new InterfaceC33610OooOO0.OooO00o(interfaceC32507OooOO0o));
    }

    public final InterfaceC33651OoooOoO OooOo00() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) this.f121299OooOoOO.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        if (interfaceC33672o00ooo == null) {
            return null;
        }
        InterfaceC33651OoooOoO interfaceC33651OoooOoOOooO0o0 = oO00o00.OooO0OO.OooO0o0(interfaceC33672o00ooo, new C33616OooOOOo(this));
        do {
            atomicReferenceFieldUpdater = f121297OooOooO;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC33651OoooOoOOooO0o0)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC33651OoooOoOOooO0o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b7, code lost:
    
        OooOoO(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOo0O(o000000O o000000o2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121295OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C33603OooO0O0) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000o2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC33610OooOO0) || (obj instanceof AbstractC33837OooOOoo)) {
                break;
            }
            if (obj instanceof C33620OooOo) {
                C33620OooOo c33620OooOo = (C33620OooOo) obj;
                c33620OooOo.getClass();
                if (!C33620OooOo.f121303OooO0O0.compareAndSet(c33620OooOo, 0, 1)) {
                    OooOoO(o000000o2, obj);
                    throw null;
                }
                if (obj instanceof C33615OooOOOO) {
                    if (obj == null) {
                        c33620OooOo = null;
                    }
                    Throwable th = c33620OooOo != null ? c33620OooOo.f121304OooO00o : null;
                    if (o000000o2 instanceof InterfaceC33610OooOO0) {
                        OooO((InterfaceC33610OooOO0) o000000o2, th);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(o000000o2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        OooOO0O((AbstractC33837OooOOoo) o000000o2, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C33624OooOo0o)) {
                if (o000000o2 instanceof AbstractC33837OooOOoo) {
                    return;
                }
                kotlin.jvm.internal.OooOOO0.OooO0o0(o000000o2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C33624OooOo0o c33624OooOo0o = new C33624OooOo0o(obj, (InterfaceC33610OooOO0) o000000o2, (InterfaceC32510OooOOo0) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33624OooOo0o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C33624OooOo0o c33624OooOo0o2 = (C33624OooOo0o) obj;
            if (c33624OooOo0o2.f121306OooO0O0 != null) {
                OooOoO(o000000o2, obj);
                throw null;
            }
            if (o000000o2 instanceof AbstractC33837OooOOoo) {
                return;
            }
            kotlin.jvm.internal.OooOOO0.OooO0o0(o000000o2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC33610OooOO0 interfaceC33610OooOO0 = (InterfaceC33610OooOO0) o000000o2;
            Throwable th2 = c33624OooOo0o2.f121309OooO0o0;
            if (th2 != null) {
                OooO(interfaceC33610OooOO0, th2);
                return;
            }
            C33624OooOo0o c33624OooOo0oOooO00o = C33624OooOo0o.OooO00o(c33624OooOo0o2, interfaceC33610OooOO0, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33624OooOo0oOooO00o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean OooOo0o() {
        return f121295OooOoo.get(this) instanceof o000000O;
    }

    public final boolean OooOoO0() {
        if (this.f121326OooOoO0 != 2) {
            return false;
        }
        Continuation<T> continuation = this.f121298OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0o0(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C33824OooO0o.f121918OooOooO.get((C33824OooO0o) continuation) != null;
    }

    public String OooOoOO() {
        return "CancellableContinuation";
    }

    public final <R> void OooOoo(R r, int i, InterfaceC32510OooOOo0<? super Throwable, ? super R, ? super InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121295OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o000000O) {
                Object objOooOooo = OooOooo((o000000O) obj, r, i, interfaceC32510OooOOo0);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, objOooOooo)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                OooOOO0();
                OooOOO(i);
                return;
            }
            if (obj instanceof C33615OooOOOO) {
                C33615OooOOOO c33615OooOOOO = (C33615OooOOOO) obj;
                c33615OooOOOO.getClass();
                if (C33615OooOOOO.f121300OooO0OO.compareAndSet(c33615OooOOOO, 0, 1)) {
                    if (interfaceC32510OooOOo0 != null) {
                        OooOO0(interfaceC32510OooOOo0, c33615OooOOOO.f121304OooO00o, r);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + r).toString());
        }
    }

    public final void OooOoo0() {
        Continuation<T> continuation = this.f121298OooOoO;
        Throwable th = null;
        C33824OooO0o c33824OooO0o = continuation instanceof C33824OooO0o ? (C33824OooO0o) continuation : null;
        if (c33824OooO0o != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33824OooO0o.f121918OooOooO;
                Object obj = atomicReferenceFieldUpdater.get(c33824OooO0o);
                C33839OooOo0 c33839OooOo0 = C33826OooO0oO.f121925OooO0O0;
                if (obj == c33839OooOo0) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(c33824OooO0o, c33839OooOo0, this)) {
                        if (atomicReferenceFieldUpdater.get(c33824OooO0o) != c33839OooOo0) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c33824OooO0o, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c33824OooO0o) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            OooOO0o();
            cancel(th);
        }
    }

    public final void OooOooO(AbstractC33630OooOooO abstractC33630OooOooO, C32460OooOooO c32460OooOooO) {
        Continuation<T> continuation = this.f121298OooOoO;
        C33824OooO0o c33824OooO0o = continuation instanceof C33824OooO0o ? (C33824OooO0o) continuation : null;
        OooOoo(c32460OooOooO, (c33824OooO0o != null ? c33824OooO0o.f121919OooOoO : null) == abstractC33630OooOooO ? 4 : this.f121326OooOoO0, null);
    }

    public final C33839OooOo0 Oooo000(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121295OooOoo;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof o000000O;
            C33839OooOo0 c33839OooOo0 = C33613OooOOO.f121294OooO00o;
            if (!z) {
                boolean z2 = obj2 instanceof C33624OooOo0o;
                return null;
            }
            Object objOooOooo = OooOooo((o000000O) obj2, obj, this.f121326OooOoO0, interfaceC32510OooOOo0);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objOooOooo)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            OooOOO0();
            return c33839OooOo0;
        }
    }

    @Override // oO0o0OO.InterfaceC33611OooOO0O
    public final boolean cancel(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121295OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof o000000O)) {
                return false;
            }
            C33615OooOOOO c33615OooOOOO = new C33615OooOOOO(this, th, (obj instanceof InterfaceC33610OooOO0) || (obj instanceof AbstractC33837OooOOoo));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33615OooOOOO)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            o000000O o000000o2 = (o000000O) obj;
            if (o000000o2 instanceof InterfaceC33610OooOO0) {
                OooO((InterfaceC33610OooOO0) obj, th);
            } else if (o000000o2 instanceof AbstractC33837OooOOoo) {
                OooOO0O((AbstractC33837OooOOoo) obj, th);
            }
            OooOOO0();
            OooOOO(this.f121326OooOoO0);
            return true;
        }
    }

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        Continuation<T> continuation = this.f121298OooOoO;
        if (continuation instanceof InterfaceC32480OooO0Oo) {
            return (InterfaceC32480OooO0Oo) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final InterfaceC34415OooO0oo getContext() {
        return this.f121299OooOoOO;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o != null) {
            obj = new C33620OooOo(false, thOooO00o);
        }
        OooOoo(obj, this.f121326OooOoO0, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OooOoOO());
        sb.append('(');
        sb.append(C33640Oooo0o0.OooO0O0(this.f121298OooOoO));
        sb.append("){");
        Object obj = f121295OooOoo.get(this);
        sb.append(obj instanceof o000000O ? "Active" : obj instanceof C33615OooOOOO ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(C33640Oooo0o0.OooO00o(this));
        return sb.toString();
    }
}
