package oO0o0OO;

import androidx.fragment.app.C21904OooOoo0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o00oo0OO.C25683OooO0OO;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33835OooOOo;

/* JADX INFO: renamed from: oO0o0OO.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33643OoooO<T> extends C33835OooOOo<T> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121325OooOoOO = AtomicIntegerFieldUpdater.newUpdater(C33643OoooO.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C33643OoooO() {
        throw null;
    }

    @Override // oO0o0Ooo.C33835OooOOo, oO0o0OO.o0ooOOo
    public final void OooOOo(Object obj) {
        OooOOoo(obj);
    }

    @Override // oO0o0Ooo.C33835OooOOo, oO0o0OO.o0ooOOo
    public final void OooOOoo(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f121325OooOoOO;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C33826OooO0oO.OooO00o(C25683OooO0OO.OooO0O0(obj), C21904OooOoo0.OooO0o0(this.f121948OooOoO));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
