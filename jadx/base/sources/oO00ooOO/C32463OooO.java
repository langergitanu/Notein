package oO00ooOO;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooOO.C32466OooO0OO;

/* JADX INFO: renamed from: oO00ooOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32463OooO<E> extends oOo000Oo.OooO<E> implements Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C32463OooO f116670OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32466OooO0OO<E, ?> f116671OooOo0o;

    static {
        C32466OooO0OO c32466OooO0OO = C32466OooO0OO.f116689Oooo0O0;
        f116670OooOo = new C32463OooO(C32466OooO0OO.f116689Oooo0O0);
    }

    public C32463OooO(C32466OooO0OO<E, ?> backing) {
        OooOOO0.OooO0oO(backing, "backing");
        this.f116671OooOo0o = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f116671OooOo0o.f116699Oooo0) {
            return new C32471OooO0oO(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // oOo000Oo.OooO
    public final int OooO0O0() {
        return this.f116671OooOo0o.f116698OooOooo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        return this.f116671OooOo0o.OooO00o(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116671OooOo0o.OooO0Oo();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f116671OooOo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f116671OooOo0o.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f116671OooOo0o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        C32466OooO0OO<E, ?> c32466OooO0OO = this.f116671OooOo0o;
        c32466OooO0OO.getClass();
        return new C32466OooO0OO.C32467OooO0o0(c32466OooO0OO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C32466OooO0OO<E, ?> c32466OooO0OO = this.f116671OooOo0o;
        c32466OooO0OO.OooO0Oo();
        int iOooO = c32466OooO0OO.OooO(obj);
        if (iOooO < 0) {
            return false;
        }
        c32466OooO0OO.OooOOO(iOooO);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116671OooOo0o.OooO0Oo();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116671OooOo0o.OooO0Oo();
        return super.retainAll(elements);
    }

    public C32463OooO() {
        this(new C32466OooO0OO());
    }
}
