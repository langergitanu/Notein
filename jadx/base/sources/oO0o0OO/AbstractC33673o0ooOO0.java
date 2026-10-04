package oO0o0OO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO0o0Ooo.C33829OooOO0O;

/* JADX INFO: renamed from: oO0o0OO.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33673o0ooOO0 extends C33829OooOO0O implements InterfaceC33651OoooOoO, InterfaceC33678ooOO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o0ooOOo f121390OooOoO;

    public abstract boolean OooO();

    @Override // oO0o0OO.InterfaceC33678ooOO
    public final o0O0O00 OooO00o() {
        return null;
    }

    public final o0ooOOo OooO0oo() {
        o0ooOOo o0ooooo2 = this.f121390OooOoO;
        if (o0ooooo2 != null) {
            return o0ooooo2;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("job");
        throw null;
    }

    public abstract void OooOO0(Throwable th);

    @Override // oO0o0Ooo.C33829OooOO0O, oO0o0OO.InterfaceC33651OoooOoO
    public final void dispose() {
        o0ooOOo o0oooooOooO0oo = OooO0oo();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o0ooOOo.f121392OooOo0o;
            Object obj = atomicReferenceFieldUpdater.get(o0oooooOooO0oo);
            if (!(obj instanceof AbstractC33673o0ooOO0)) {
                if (!(obj instanceof InterfaceC33678ooOO) || ((InterfaceC33678ooOO) obj).OooO00o() == null) {
                    return;
                }
                OooO0oO();
                return;
            }
            if (obj != this) {
                return;
            }
            C33654Ooooo0o c33654Ooooo0o = o0Oo0oo.f121388OooO0oO;
            while (!atomicReferenceFieldUpdater.compareAndSet(o0oooooOooO0oo, obj, c33654Ooooo0o)) {
                if (atomicReferenceFieldUpdater.get(o0oooooOooO0oo) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public InterfaceC33672o00ooo getParent() {
        return OooO0oo();
    }

    @Override // oO0o0OO.InterfaceC33678ooOO
    public final boolean isActive() {
        return true;
    }

    @Override // oO0o0Ooo.C33829OooOO0O
    public final String toString() {
        return getClass().getSimpleName() + '@' + C33640Oooo0o0.OooO00o(this) + "[job@" + C33640Oooo0o0.OooO00o(OooO0oo()) + ']';
    }
}
