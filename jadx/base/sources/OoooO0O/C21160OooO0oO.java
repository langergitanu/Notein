package OoooO0O;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24039Oooo0o0;

/* JADX INFO: renamed from: OoooO0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21160OooO0oO<K, V, T> extends AbstractC21159OooO0o0<K, V, T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C21158OooO0o<K, V> f61392OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public K f61393OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f61394OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f61395OooOoo0;

    public C21160OooO0oO(C21158OooO0o<K, V> c21158OooO0o, AbstractC21167OooOo0<K, V, T>[] abstractC21167OooOo0Arr) {
        super(c21158OooO0o.f61386OooOoO0, abstractC21167OooOo0Arr);
        this.f61392OooOoO = c21158OooO0o;
        this.f61394OooOoo = c21158OooO0o.f61387OooOoOO;
    }

    public final void OooO0Oo(int i, OooOo00<?, ?> oooOo00, K k, int i2) {
        int i3 = i2 * 5;
        AbstractC21167OooOo0<K, V, T>[] abstractC21167OooOo0Arr = this.f61390OooOo0o;
        if (i3 <= 30) {
            int iOooOO0o = 1 << OooOo.OooOO0o(i, i3);
            if (oooOo00.OooO0oo(iOooOO0o)) {
                abstractC21167OooOo0Arr[i2].OooO00o(oooOo00.f61411OooO0Oo, Integer.bitCount(oooOo00.f61408OooO00o) * 2, oooOo00.OooO0o(iOooOO0o));
                this.f61389OooOo = i2;
                return;
            } else {
                int iOooOo00 = oooOo00.OooOo00(iOooOO0o);
                OooOo00<?, ?> oooOo00OooOOoo = oooOo00.OooOOoo(iOooOo00);
                abstractC21167OooOo0Arr[i2].OooO00o(oooOo00.f61411OooO0Oo, Integer.bitCount(oooOo00.f61408OooO00o) * 2, iOooOo00);
                OooO0Oo(i, oooOo00OooOOoo, k, i2 + 1);
                return;
            }
        }
        AbstractC21167OooOo0<K, V, T> abstractC21167OooOo0 = abstractC21167OooOo0Arr[i2];
        Object[] objArr = oooOo00.f61411OooO0Oo;
        abstractC21167OooOo0.OooO00o(objArr, objArr.length, 0);
        while (true) {
            AbstractC21167OooOo0<K, V, T> abstractC21167OooOo02 = abstractC21167OooOo0Arr[i2];
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC21167OooOo02.f61405OooOo0o[abstractC21167OooOo02.f61406OooOoO0], k)) {
                this.f61389OooOo = i2;
                return;
            } else {
                abstractC21167OooOo0Arr[i2].f61406OooOoO0 += 2;
            }
        }
    }

    @Override // OoooO0O.AbstractC21159OooO0o0, java.util.Iterator
    public final T next() {
        if (this.f61392OooOoO.f61387OooOoOO != this.f61394OooOoo) {
            throw new ConcurrentModificationException();
        }
        if (!this.f61391OooOoO0) {
            throw new NoSuchElementException();
        }
        AbstractC21167OooOo0<K, V, T> abstractC21167OooOo0 = this.f61390OooOo0o[this.f61389OooOo];
        this.f61393OooOoOO = (K) abstractC21167OooOo0.f61405OooOo0o[abstractC21167OooOo0.f61406OooOoO0];
        this.f61395OooOoo0 = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OoooO0O.AbstractC21159OooO0o0, java.util.Iterator
    public final void remove() {
        if (!this.f61395OooOoo0) {
            throw new IllegalStateException();
        }
        boolean z = this.f61391OooOoO0;
        C21158OooO0o<K, V> c21158OooO0o = this.f61392OooOoO;
        if (!z) {
            C24039Oooo0o0.OooO0OO(c21158OooO0o).remove(this.f61393OooOoOO);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            AbstractC21167OooOo0<K, V, T> abstractC21167OooOo0 = this.f61390OooOo0o[this.f61389OooOo];
            Object obj = abstractC21167OooOo0.f61405OooOo0o[abstractC21167OooOo0.f61406OooOoO0];
            C24039Oooo0o0.OooO0OO(c21158OooO0o).remove(this.f61393OooOoOO);
            OooO0Oo(obj != null ? obj.hashCode() : 0, c21158OooO0o.f61386OooOoO0, obj, 0);
        }
        this.f61393OooOoOO = null;
        this.f61395OooOoo0 = false;
        this.f61394OooOoo = c21158OooO0o.f61387OooOoOO;
    }
}
