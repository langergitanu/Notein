package oO0o0O0;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOOO;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: oO0o0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33558OooO0Oo<T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f121176OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f121177OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f121178OooOo0o;

    /* JADX INFO: renamed from: oO0o0O0.OooO0Oo$OooO00o */
    public static final class OooO00o<T> implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final kotlin.jvm.internal.OooO0O0 f121179OooOo0o;

        public OooO00o(T[] array) {
            OooOOO0.OooO0oO(array, "array");
            this.f121179OooOo0o = kotlin.jvm.internal.OooO0OO.OooO0O0(array);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f121179OooOo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.f121179OooOo0o.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0<T> implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f121180OooOo = true;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final T f121181OooOo0o;

        public OooO0O0(T t) {
            this.f121181OooOo0o = t;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f121180OooOo;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f121180OooOo) {
                throw new NoSuchElementException();
            }
            this.f121180OooOo = false;
            return this.f121181OooOo0o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t) {
        Object obj;
        int i = this.f121177OooOo;
        if (i == 0) {
            this.f121178OooOo0o = t;
        } else if (i == 1) {
            if (OooOOO0.OooO0O0(this.f121178OooOo0o, t)) {
                return false;
            }
            this.f121178OooOo0o = new Object[]{this.f121178OooOo0o, t};
        } else if (i < 5) {
            Object obj2 = this.f121178OooOo0o;
            OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (OooOOO.OooOoO0(objArr, t)) {
                return false;
            }
            int i2 = this.f121177OooOo;
            if (i2 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                OooOOO0.OooO0oO(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(Oooo0.OooO0Oo(elements.length));
                OooOOO.Oooo(elements, linkedHashSet);
                linkedHashSet.add(t);
                obj = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i2 + 1);
                OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = t;
                obj = objArrCopyOf;
            }
            this.f121178OooOo0o = obj;
        } else {
            Object obj3 = this.f121178OooOo0o;
            OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!C24039Oooo0o0.OooO0Oo(obj3).add(t)) {
                return false;
            }
        }
        this.f121177OooOo++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f121178OooOo0o = null;
        this.f121177OooOo = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f121177OooOo;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return OooOOO0.OooO0O0(this.f121178OooOo0o, obj);
        }
        if (i < 5) {
            Object obj2 = this.f121178OooOo0o;
            OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return OooOOO.OooOoO0((Object[]) obj2, obj);
        }
        Object obj3 = this.f121178OooOo0o;
        OooOOO0.OooO0o0(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        int i = this.f121177OooOo;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i == 1) {
            return new OooO0O0(this.f121178OooOo0o);
        }
        if (i < 5) {
            Object obj = this.f121178OooOo0o;
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new OooO00o((Object[]) obj);
        }
        Object obj2 = this.f121178OooOo0o;
        OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C24039Oooo0o0.OooO0Oo(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f121177OooOo;
    }
}
