package Oooo0oO;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: Oooo0oO.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21067OoooOo0 implements Iterator<Object>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61019OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21093o0000o0O f61020OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f61021OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61022OooOoO0;

    public C21067OoooOo0(C21093o0000o0O c21093o0000o0O, int i, int i2) {
        this.f61020OooOo0o = c21093o0000o0O;
        this.f61019OooOo = i2;
        this.f61022OooOoO0 = i;
        this.f61021OooOoO = c21093o0000o0O.f61159OooOoo;
        if (c21093o0000o0O.f61160OooOoo0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61022OooOoO0 < this.f61019OooOo;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C21093o0000o0O c21093o0000o0O = this.f61020OooOo0o;
        int i = c21093o0000o0O.f61159OooOoo;
        int i2 = this.f61021OooOoO;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.f61022OooOoO0;
        this.f61022OooOoO0 = C21091o0000o.OooO0Oo(c21093o0000o0O.f61155OooOo0o, i3) + i3;
        return new C21094o0000o0o(c21093o0000o0O, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
