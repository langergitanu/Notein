package oO0o0Ooo;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import oO0o0OO.o000000O;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33837OooOOoo<S extends AbstractC33837OooOOoo<S>> extends AbstractC33821OooO0O0<S> implements o000000O {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121949OooOoO = AtomicIntegerFieldUpdater.newUpdater(AbstractC33837OooOOoo.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f121950OooOoO0;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC33837OooOOoo(long j, S s, int i) {
        super(s);
        this.f121950OooOoO0 = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final void OooO() {
        if (f121949OooOoO.incrementAndGet(this) == OooO0oO()) {
            OooO0o0();
        }
    }

    @Override // oO0o0Ooo.AbstractC33821OooO0O0
    public final boolean OooO0Oo() {
        return f121949OooOoO.get(this) == OooO0oO() && OooO0OO() != null;
    }

    public final boolean OooO0o() {
        return f121949OooOoO.addAndGet(this, SupportMenu.CATEGORY_MASK) == OooO0oO() && OooO0OO() != null;
    }

    public abstract int OooO0oO();

    public abstract void OooO0oo(int i, InterfaceC34415OooO0oo interfaceC34415OooO0oo);

    public final boolean OooOO0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f121949OooOoO;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == OooO0oO() && OooO0OO() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
