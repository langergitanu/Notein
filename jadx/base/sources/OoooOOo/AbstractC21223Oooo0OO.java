package OoooOOo;

import Oooo0oO.C21027OooO0oo;

/* JADX INFO: renamed from: OoooOOo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21223Oooo0OO implements InterfaceC21222Oooo0O0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21027OooO0oo f61567OooOo0o = new C21027OooO0oo(0);

    public final void OooO(int i) {
        C21027OooO0oo c21027OooO0oo;
        int i2;
        do {
            c21027OooO0oo = this.f61567OooOo0o;
            i2 = c21027OooO0oo.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!c21027OooO0oo.compareAndSet(i2, i2 | i));
    }

    public final boolean OooO0oo(int i) {
        return (i & this.f61567OooOo0o.get()) != 0;
    }
}
