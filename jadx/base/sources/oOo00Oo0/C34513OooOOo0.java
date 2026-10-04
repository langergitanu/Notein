package oOo00Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C24017OooO0oO;
import oO0O00.InterfaceC32498OooO0o0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oOo00Oo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34513OooOOo0<From, To> implements Set<To>, InterfaceC32498OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f123689OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Set<From> f123690OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f123691OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f123692OooOoO0;

    /* JADX INFO: renamed from: oOo00Oo0.OooOOo0$OooO00o */
    public static final class OooO00o implements Iterator<To>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C34513OooOOo0<From, To> f123693OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<From> f123694OooOo0o;

        public OooO00o(C34513OooOOo0<From, To> c34513OooOOo0) {
            this.f123693OooOo = c34513OooOOo0;
            this.f123694OooOo0o = c34513OooOOo0.f123690OooOo0o.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f123694OooOo0o.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        @Override // java.util.Iterator
        public final To next() {
            return (To) this.f123693OooOo.f123689OooOo.invoke(this.f123694OooOo0o.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f123694OooOo0o.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34513OooOOo0(Set<From> delegate, InterfaceC32507OooOO0o<? super From, ? extends To> convertTo, InterfaceC32507OooOO0o<? super To, ? extends From> convert) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        kotlin.jvm.internal.OooOOO0.OooO0oO(convertTo, "convertTo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(convert, "convert");
        this.f123690OooOo0o = delegate;
        this.f123689OooOo = (kotlin.jvm.internal.OooOOOO) convertTo;
        this.f123692OooOoO0 = (kotlin.jvm.internal.OooOOOO) convert;
        this.f123691OooOoO = delegate.size();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    public final ArrayList OooO0O0(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f123692OooOoO0.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    public final ArrayList OooO0Oo(Collection collection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f123689OooOo.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(To to) {
        return this.f123690OooOo0o.add((From) this.f123692OooOoO0.invoke(to));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends To> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return this.f123690OooOo0o.addAll(OooO0O0(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f123690OooOo0o.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f123690OooOo0o.contains(this.f123692OooOoO0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return this.f123690OooOo0o.containsAll(OooO0O0(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListOooO0Oo = OooO0Oo(this.f123690OooOo0o);
        return ((Set) obj).containsAll(arrayListOooO0Oo) && arrayListOooO0Oo.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f123690OooOo0o.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f123690OooOo0o.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<To> iterator() {
        return new OooO00o(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f123690OooOo0o.remove(this.f123692OooOoO0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return this.f123690OooOo0o.removeAll(OooO0O0(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return this.f123690OooOo0o.retainAll(OooO0O0(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f123691OooOoO;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return OooO0Oo(this.f123690OooOo0o).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
