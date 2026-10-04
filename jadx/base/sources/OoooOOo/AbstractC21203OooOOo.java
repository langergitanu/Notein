package OoooOOo;

import java.util.Set;
import kotlin.jvm.internal.C24017OooO0oO;
import oO0O00.InterfaceC32498OooO0o0;

/* JADX INFO: renamed from: OoooOOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21203OooOOo<K, V, E> implements Set<E>, InterfaceC32498OooO0o0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21210OooOo0o<K, V> f61510OooOo0o;

    public AbstractC21203OooOOo(C21210OooOo0o<K, V> c21210OooOo0o) {
        this.f61510OooOo0o = c21210OooOo0o;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f61510OooOo0o.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f61510OooOo0o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f61510OooOo0o.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C24017OooO0oO.OooO0O0(this, tArr);
    }
}
