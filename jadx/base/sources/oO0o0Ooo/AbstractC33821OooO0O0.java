package oO0o0Ooo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO0o0Ooo.AbstractC33821OooO0O0;

/* JADX INFO: renamed from: oO0o0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33821OooO0O0<N extends AbstractC33821OooO0O0<N>> {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121915OooOo0o = AtomicReferenceFieldUpdater.newUpdater(AbstractC33821OooO0O0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f121914OooOo = AtomicReferenceFieldUpdater.newUpdater(AbstractC33821OooO0O0.class, Object.class, "_prev$volatile");

    public AbstractC33821OooO0O0(AbstractC33837OooOOoo abstractC33837OooOOoo) {
        this._prev$volatile = abstractC33837OooOOoo;
    }

    public final void OooO0O0() {
        f121914OooOo.set(this, null);
    }

    public final N OooO0OO() {
        Object obj = f121915OooOo0o.get(this);
        if (obj == C33820OooO00o.f121913OooO00o) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean OooO0Oo();

    public final void OooO0o0() {
        AbstractC33821OooO0O0 abstractC33821OooO0O0OooO0OO;
        if (OooO0OO() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f121914OooOo;
            AbstractC33821OooO0O0 abstractC33821OooO0O0 = (AbstractC33821OooO0O0) atomicReferenceFieldUpdater.get(this);
            while (abstractC33821OooO0O0 != null && abstractC33821OooO0O0.OooO0Oo()) {
                abstractC33821OooO0O0 = (AbstractC33821OooO0O0) atomicReferenceFieldUpdater.get(abstractC33821OooO0O0);
            }
            AbstractC33821OooO0O0 abstractC33821OooO0O0OooO0OO2 = OooO0OO();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33821OooO0O0OooO0OO2);
            while (abstractC33821OooO0O0OooO0OO2.OooO0Oo() && (abstractC33821OooO0O0OooO0OO = abstractC33821OooO0O0OooO0OO2.OooO0OO()) != null) {
                abstractC33821OooO0O0OooO0OO2 = abstractC33821OooO0O0OooO0OO;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(abstractC33821OooO0O0OooO0OO2);
                AbstractC33821OooO0O0 abstractC33821OooO0O02 = ((AbstractC33821OooO0O0) obj) == null ? null : abstractC33821OooO0O0;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC33821OooO0O0OooO0OO2, obj, abstractC33821OooO0O02)) {
                    if (atomicReferenceFieldUpdater.get(abstractC33821OooO0O0OooO0OO2) != obj) {
                        break;
                    }
                }
            }
            if (abstractC33821OooO0O0 != null) {
                f121915OooOo0o.set(abstractC33821OooO0O0, abstractC33821OooO0O0OooO0OO2);
            }
            if (!abstractC33821OooO0O0OooO0OO2.OooO0Oo() || abstractC33821OooO0O0OooO0OO2.OooO0OO() == null) {
                if (abstractC33821OooO0O0 == null || !abstractC33821OooO0O0.OooO0Oo()) {
                    return;
                }
            }
        }
    }
}
