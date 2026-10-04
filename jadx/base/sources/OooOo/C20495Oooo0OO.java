package OooOo;

import java.util.Iterator;

/* JADX INFO: renamed from: OooOo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20495Oooo0OO implements Iterator<Object>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object> f58552OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f58553OooOo0o;

    public C20495Oooo0OO(Oooo0<Object> oooo0) {
        this.f58552OooOo = oooo0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58553OooOo0o < this.f58552OooOo.OooO0o();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f58553OooOo0o;
        this.f58553OooOo0o = i + 1;
        return this.f58552OooOo.OooO0oO(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
