package oOo000Oo;

import java.util.Iterator;

/* JADX INFO: renamed from: oOo000Oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34439OooOooO<T> implements Iterable<C34437OooOoo<? extends T>>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final oO0O000o.OooO00o<Iterator<T>> f123459OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C34439OooOooO(oO0O000o.OooO00o<? extends Iterator<? extends T>> oooO00o) {
        this.f123459OooOo0o = oooO00o;
    }

    @Override // java.lang.Iterable
    public final Iterator<C34437OooOoo<T>> iterator() {
        return new C34440OooOooo(this.f123459OooOo0o.invoke());
    }
}
