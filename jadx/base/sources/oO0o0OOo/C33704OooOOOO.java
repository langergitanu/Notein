package oO0o0OOo;

import java.util.concurrent.atomic.AtomicReferenceArray;
import oO0o0OO.o000OO;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OOo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33704OooOOOO<E> extends AbstractC33837OooOOoo<C33704OooOOOO<E>> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33695OooO0o0<E> f121486OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f121487OooOoo0;

    public C33704OooOOOO(long j, C33704OooOOOO<E> c33704OooOOOO, C33695OooO0o0<E> c33695OooO0o0, int i) {
        super(j, c33704OooOOOO, i);
        this.f121486OooOoOO = c33695OooO0o0;
        this.f121487OooOoo0 = new AtomicReferenceArray(C33689OooO.f121434OooO0O0 * 2);
    }

    @Override // oO0o0Ooo.AbstractC33837OooOOoo
    public final int OooO0oO() {
        return C33689OooO.f121434OooO0O0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        OooOOO(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.OooOOO0.OooO0Oo(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // oO0o0Ooo.AbstractC33837OooOOoo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo(int i, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        int i2 = C33689OooO.f121434OooO0O0;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f121487OooOoo0.get(i * 2);
        while (true) {
            Object objOooOO0o = OooOO0o(i);
            boolean z2 = objOooOO0o instanceof o000OO;
            C33695OooO0o0<E> c33695OooO0o0 = this.f121486OooOoOO;
            if (z2 || (objOooOO0o instanceof C33714OooOoO)) {
                if (OooOO0O(i, objOooOO0o, z ? C33689OooO.f121441OooOO0 : C33689OooO.f121442OooOO0O)) {
                    OooOOO(i, null);
                    OooOOO0(i, !z);
                    if (z) {
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c33695OooO0o0);
                        return;
                    }
                    return;
                }
            } else {
                if (objOooOO0o == C33689OooO.f121441OooOO0 || objOooOO0o == C33689OooO.f121442OooOO0O) {
                    break;
                }
                if (objOooOO0o != C33689OooO.f121439OooO0oO && objOooOO0o != C33689OooO.f121437OooO0o) {
                    if (objOooOO0o == C33689OooO.f121432OooO || objOooOO0o == C33689OooO.f121436OooO0Oo || objOooOO0o == C33689OooO.f121443OooOO0o) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objOooOO0o).toString());
                }
            }
        }
    }

    public final boolean OooOO0O(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f121487OooOoo0;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object OooOO0o(int i) {
        return this.f121487OooOoo0.get((i * 2) + 1);
    }

    public final void OooOOO(int i, Object obj) {
        this.f121487OooOoo0.set(i * 2, obj);
    }

    public final void OooOOO0(int i, boolean z) {
        if (z) {
            C33695OooO0o0<E> c33695OooO0o0 = this.f121486OooOoOO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c33695OooO0o0);
            c33695OooO0o0.Oooo0o((this.f121950OooOoO0 * ((long) C33689OooO.f121434OooO0O0)) + ((long) i));
        }
        OooO();
    }

    public final void OooOOOO(int i, C33839OooOo0 c33839OooOo0) {
        this.f121487OooOoo0.set((i * 2) + 1, c33839OooOo0);
    }
}
