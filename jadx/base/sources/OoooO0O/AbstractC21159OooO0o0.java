package OoooO0O;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OoooO0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21159OooO0o0<K, V, T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f61389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC21167OooOo0<K, V, T>[] f61390OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f61391OooOoO0 = true;

    public AbstractC21159OooO0o0(OooOo00<K, V> oooOo00, AbstractC21167OooOo0<K, V, T>[] abstractC21167OooOo0Arr) {
        this.f61390OooOo0o = abstractC21167OooOo0Arr;
        abstractC21167OooOo0Arr[0].OooO00o(oooOo00.f61411OooO0Oo, Integer.bitCount(oooOo00.f61408OooO00o) * 2, 0);
        this.f61389OooOo = 0;
        OooO00o();
    }

    public final void OooO00o() {
        int i = this.f61389OooOo;
        AbstractC21167OooOo0<K, V, T>[] abstractC21167OooOo0Arr = this.f61390OooOo0o;
        AbstractC21167OooOo0<K, V, T> abstractC21167OooOo0 = abstractC21167OooOo0Arr[i];
        if (abstractC21167OooOo0.f61406OooOoO0 < abstractC21167OooOo0.f61404OooOo) {
            return;
        }
        while (-1 < i) {
            int iOooO0O0 = OooO0O0(i);
            if (iOooO0O0 == -1) {
                AbstractC21167OooOo0<K, V, T> abstractC21167OooOo02 = abstractC21167OooOo0Arr[i];
                int i2 = abstractC21167OooOo02.f61406OooOoO0;
                Object[] objArr = abstractC21167OooOo02.f61405OooOo0o;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    abstractC21167OooOo02.f61406OooOoO0 = i2 + 1;
                    iOooO0O0 = OooO0O0(i);
                }
            }
            if (iOooO0O0 != -1) {
                this.f61389OooOo = iOooO0O0;
                return;
            }
            if (i > 0) {
                AbstractC21167OooOo0<K, V, T> abstractC21167OooOo03 = abstractC21167OooOo0Arr[i - 1];
                int i3 = abstractC21167OooOo03.f61406OooOoO0;
                int length2 = abstractC21167OooOo03.f61405OooOo0o.length;
                abstractC21167OooOo03.f61406OooOoO0 = i3 + 1;
            }
            abstractC21167OooOo0Arr[i].OooO00o(OooOo00.f61407OooO0o0.f61411OooO0Oo, 0, 0);
            i--;
        }
        this.f61391OooOoO0 = false;
    }

    public final int OooO0O0(int i) {
        AbstractC21167OooOo0<K, V, T>[] abstractC21167OooOo0Arr = this.f61390OooOo0o;
        AbstractC21167OooOo0<K, V, T> abstractC21167OooOo0 = abstractC21167OooOo0Arr[i];
        int i2 = abstractC21167OooOo0.f61406OooOoO0;
        if (i2 < abstractC21167OooOo0.f61404OooOo) {
            return i;
        }
        Object[] objArr = abstractC21167OooOo0.f61405OooOo0o;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        OooOo00 oooOo00 = (OooOo00) obj;
        if (i == 6) {
            AbstractC21167OooOo0<K, V, T> abstractC21167OooOo02 = abstractC21167OooOo0Arr[i + 1];
            Object[] objArr2 = oooOo00.f61411OooO0Oo;
            abstractC21167OooOo02.OooO00o(objArr2, objArr2.length, 0);
        } else {
            abstractC21167OooOo0Arr[i + 1].OooO00o(oooOo00.f61411OooO0Oo, Integer.bitCount(oooOo00.f61408OooO00o) * 2, 0);
        }
        return OooO0O0(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61391OooOoO0;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f61391OooOoO0) {
            throw new NoSuchElementException();
        }
        T next = this.f61390OooOo0o[this.f61389OooOo].next();
        OooO00o();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
