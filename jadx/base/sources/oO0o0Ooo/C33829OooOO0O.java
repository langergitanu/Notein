package oO0o0Ooo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C24026OooOo0o;
import oO0o0OO.C33640Oooo0o0;

/* JADX INFO: renamed from: oO0o0Ooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33829OooOO0O {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121935OooOo0o = AtomicReferenceFieldUpdater.newUpdater(C33829OooOO0O.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121934OooOo = AtomicReferenceFieldUpdater.newUpdater(C33829OooOO0O.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121936OooOoO0 = AtomicReferenceFieldUpdater.newUpdater(C33829OooOO0O.class, Object.class, "_removedRef$volatile");

    /* JADX INFO: renamed from: oO0o0Ooo.OooOO0O$OooO00o */
    public /* synthetic */ class OooO00o extends C24026OooOo0o {
        public final Object OooO() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    public final boolean OooO0O0(C33829OooOO0O c33829OooOO0O, int i) {
        while (true) {
            C33829OooOO0O c33829OooOO0OOooO0OO = OooO0OO();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121934OooOo;
            if (c33829OooOO0OOooO0OO == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c33829OooOO0OOooO0OO = (C33829OooOO0O) obj;
                    if (!c33829OooOO0OOooO0OO.OooO0o()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c33829OooOO0OOooO0OO);
                }
            }
            if (c33829OooOO0OOooO0OO instanceof C33819OooO) {
                return (((C33819OooO) c33829OooOO0OOooO0OO).f121912OooOoO & i) == 0 && c33829OooOO0OOooO0OO.OooO0O0(c33829OooOO0O, i);
            }
            atomicReferenceFieldUpdater.set(c33829OooOO0O, c33829OooOO0OOooO0OO);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f121935OooOo0o;
            atomicReferenceFieldUpdater2.set(c33829OooOO0O, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c33829OooOO0OOooO0OO, this, c33829OooOO0O)) {
                if (atomicReferenceFieldUpdater2.get(c33829OooOO0OOooO0OO) != this) {
                    break;
                }
            }
            c33829OooOO0O.OooO0Oo(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((oO0o0Ooo.C33834OooOOOo) r6).f121947OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C33829OooOO0O OooO0OO() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121934OooOo;
            C33829OooOO0O c33829OooOO0O = (C33829OooOO0O) atomicReferenceFieldUpdater.get(this);
            C33829OooOO0O c33829OooOO0O2 = c33829OooOO0O;
            while (true) {
                C33829OooOO0O c33829OooOO0O3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f121935OooOo0o;
                    Object obj = atomicReferenceFieldUpdater2.get(c33829OooOO0O2);
                    if (obj == this) {
                        if (c33829OooOO0O == c33829OooOO0O2) {
                            return c33829OooOO0O2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, c33829OooOO0O, c33829OooOO0O2)) {
                            if (atomicReferenceFieldUpdater.get(this) != c33829OooOO0O) {
                                break;
                            }
                        }
                        return c33829OooOO0O2;
                    }
                    if (OooO0o()) {
                        return null;
                    }
                    if (!(obj instanceof C33834OooOOOo)) {
                        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c33829OooOO0O3 = c33829OooOO0O2;
                        c33829OooOO0O2 = (C33829OooOO0O) obj;
                    } else {
                        if (c33829OooOO0O3 != null) {
                            break;
                        }
                        c33829OooOO0O2 = (C33829OooOO0O) atomicReferenceFieldUpdater.get(c33829OooOO0O2);
                    }
                }
                c33829OooOO0O2 = c33829OooOO0O3;
            }
        }
    }

    public final void OooO0Oo(C33829OooOO0O c33829OooOO0O) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121934OooOo;
            C33829OooOO0O c33829OooOO0O2 = (C33829OooOO0O) atomicReferenceFieldUpdater.get(c33829OooOO0O);
            if (f121935OooOo0o.get(this) != c33829OooOO0O) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c33829OooOO0O, c33829OooOO0O2, this)) {
                if (atomicReferenceFieldUpdater.get(c33829OooOO0O) != c33829OooOO0O2) {
                    break;
                }
            }
            if (OooO0o()) {
                c33829OooOO0O.OooO0OO();
                return;
            }
            return;
        }
    }

    public boolean OooO0o() {
        return f121935OooOo0o.get(this) instanceof C33834OooOOOo;
    }

    public final C33829OooOO0O OooO0o0() {
        C33829OooOO0O c33829OooOO0O;
        Object obj = f121935OooOo0o.get(this);
        C33834OooOOOo c33834OooOOOo = obj instanceof C33834OooOOOo ? (C33834OooOOOo) obj : null;
        if (c33834OooOOOo != null && (c33829OooOO0O = c33834OooOOOo.f121947OooO00o) != null) {
            return c33829OooOO0O;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C33829OooOO0O) obj;
    }

    public final void OooO0oO() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121935OooOo0o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C33834OooOOOo) {
                C33829OooOO0O c33829OooOO0O = ((C33834OooOOOo) obj).f121947OooO00o;
                return;
            }
            if (obj == this) {
                return;
            }
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            C33829OooOO0O c33829OooOO0O2 = (C33829OooOO0O) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f121936OooOoO0;
            C33834OooOOOo c33834OooOOOo = (C33834OooOOOo) atomicReferenceFieldUpdater2.get(c33829OooOO0O2);
            if (c33834OooOOOo == null) {
                c33834OooOOOo = new C33834OooOOOo(c33829OooOO0O2);
                atomicReferenceFieldUpdater2.set(c33829OooOO0O2, c33834OooOOOo);
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33834OooOOOo)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            c33829OooOO0O2.OooO0OO();
            return;
        }
    }

    public void dispose() {
        OooO0oO();
    }

    public String toString() {
        return new OooO00o(this, C33640Oooo0o0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + C33640Oooo0o0.OooO00o(this);
    }
}
