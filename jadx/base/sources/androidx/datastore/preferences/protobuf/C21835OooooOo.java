package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21835OooooOo<E> extends OooO0OO<E> implements RandomAccess {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C21835OooooOo<Object> f64549OooOoO = new C21835OooooOo<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public E[] f64550OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64551OooOoO0;

    public C21835OooooOo(E[] eArr, int i, boolean z) {
        super(z);
        this.f64550OooOo = eArr;
        this.f64551OooOoO0 = i;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f64551OooOoO0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64551OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        OooO0O0();
        int i = this.f64551OooOoO0;
        E[] eArr = this.f64550OooOo;
        if (i == eArr.length) {
            this.f64550OooOo = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f64550OooOo;
        int i2 = this.f64551OooOoO0;
        this.f64551OooOoO0 = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        OooO0OO(i);
        return this.f64550OooOo[i];
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final C21805OooOoO.OooO0OO mutableCopyWithCapacity(int i) {
        if (i >= this.f64551OooOoO0) {
            return new C21835OooooOo(Arrays.copyOf(this.f64550OooOo, i), this.f64551OooOoO0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        OooO0O0();
        OooO0OO(i);
        E[] eArr = this.f64550OooOo;
        E e = eArr[i];
        if (i < this.f64551OooOoO0 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.f64551OooOoO0--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        OooO0O0();
        OooO0OO(i);
        E[] eArr = this.f64550OooOo;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64551OooOoO0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        OooO0O0();
        if (i >= 0 && i <= (i2 = this.f64551OooOoO0)) {
            E[] eArr = this.f64550OooOo;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.f64550OooOo, i, eArr2, i + 1, this.f64551OooOoO0 - i);
                this.f64550OooOo = eArr2;
            }
            this.f64550OooOo[i] = e;
            this.f64551OooOoO0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
        sbOooO0OO.append(this.f64551OooOoO0);
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }
}
