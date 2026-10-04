package o0oooO0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0oooO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31832OooO0OO implements Iterator<C31831OooO0O0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31831OooO0O0 f113452OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C31831OooO0O0 f113453OooOo0o;

    public C31832OooO0OO(C31831OooO0O0 c31831OooO0O0) {
        this.f113452OooOo = c31831OooO0O0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C31831OooO0O0 c31831OooO0O0 = this.f113452OooOo;
        if (c31831OooO0O0 == null) {
            return false;
        }
        C31831OooO0O0 c31831OooO0O02 = this.f113453OooOo0o;
        if (c31831OooO0O02 == null) {
            return true;
        }
        c31831OooO0O02.getClass();
        C31831OooO0O0 c31831OooO0O0OooO00o = c31831OooO0O02.OooO00o(C31441OooOO0.f112362o000ooO0);
        return (c31831OooO0O0OooO00o == null || c31831OooO0O0.equals(c31831OooO0O0OooO00o)) ? false : true;
    }

    @Override // java.util.Iterator
    public final C31831OooO0O0 next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C31831OooO0O0 c31831OooO0O0 = this.f113453OooOo0o;
        if (c31831OooO0O0 == null) {
            this.f113453OooOo0o = this.f113452OooOo;
        } else {
            this.f113453OooOo0o = c31831OooO0O0.OooO00o(C31441OooOO0.f112362o000ooO0);
        }
        return this.f113453OooOo0o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
