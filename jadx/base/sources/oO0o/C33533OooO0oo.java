package oO0o;

import java.util.Iterator;
import oO0oO00.C33961OooOooo;

/* JADX INFO: renamed from: oO0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33533OooO0oo implements Iterator<String>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33961OooOooo f121128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121129OooOo0o;

    public C33533OooO0oo(C33961OooOooo c33961OooOooo) {
        this.f121128OooOo = c33961OooOooo;
        this.f121129OooOo0o = c33961OooOooo.f122282OooO0OO;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f121129OooOo0o > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        C33961OooOooo c33961OooOooo = this.f121128OooOo;
        int i = this.f121129OooOo0o;
        this.f121129OooOo0o = i - 1;
        return c33961OooOooo.f122285OooO0o0[c33961OooOooo.f122282OooO0OO - i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
