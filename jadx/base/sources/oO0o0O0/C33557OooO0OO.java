package oO0o0O0;

import OooO0O0.OooO0o;
import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: oO0o0O0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33557OooO0OO<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f121170OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121171OooOo0o;

    /* JADX INFO: renamed from: oO0o0O0.OooO0OO$OooO00o */
    public static class OooO00o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f121172OooOo0o = new OooO00o();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO0OO$OooO0O0 */
    public class OooO0O0 extends AbstractC20323OooO0OO<E> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f121173OooOo;

        public OooO0O0() {
            this.f121173OooOo = ((AbstractList) C33557OooO0OO.this).modCount;
        }

        @Override // oO0o0O0.C33557OooO0OO.AbstractC20323OooO0OO
        public final void OooO00o() {
            C33557OooO0OO c33557OooO0OO = C33557OooO0OO.this;
            int i = ((AbstractList) c33557OooO0OO).modCount;
            int i2 = this.f121173OooOo;
            if (i == i2) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c33557OooO0OO).modCount + "; expected: " + i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            OooO00o();
            C33557OooO0OO.this.clear();
        }
    }

    /* JADX INFO: renamed from: oO0o0O0.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static abstract class AbstractC20323OooO0OO<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f121175OooOo0o;

        public abstract void OooO00o();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f121175OooOo0o;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f121175OooOo0o) {
                throw new NoSuchElementException();
            }
            this.f121175OooOo0o = true;
            OooO00o();
            return (T) C33557OooO0OO.this.f121170OooOo;
        }
    }

    public static /* synthetic */ void OooO0O0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        int i = this.f121171OooOo0o;
        if (i == 0) {
            this.f121170OooOo = e;
        } else if (i == 1) {
            this.f121170OooOo = new Object[]{this.f121170OooOo, e};
        } else {
            Object[] objArr = (Object[]) this.f121170OooOo;
            int length = objArr.length;
            if (i >= length) {
                int iOooO00o = C21791OooO0o0.OooO00o(length, 3, 2, 1);
                int i2 = i + 1;
                if (iOooO00o < i2) {
                    iOooO00o = i2;
                }
                Object[] objArr2 = new Object[iOooO00o];
                this.f121170OooOo = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f121171OooOo0o] = e;
        }
        this.f121171OooOo0o++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f121170OooOo = null;
        this.f121171OooOo0o = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f121171OooOo0o)) {
            return i2 == 1 ? (E) this.f121170OooOo : (E) ((Object[]) this.f121170OooOo)[i];
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Index: ", ", Size: ");
        sbOooO0OO.append(this.f121171OooOo0o);
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        int i = this.f121171OooOo0o;
        if (i == 0) {
            return OooO00o.f121172OooOo0o;
        }
        if (i == 1) {
            return new OooO0O0();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        OooO0O0(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f121171OooOo0o)) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Index: ", ", Size: ");
            sbOooO0OO.append(this.f121171OooOo0o);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        if (i2 == 1) {
            e = (E) this.f121170OooOo;
            this.f121170OooOo = null;
        } else {
            Object[] objArr = (Object[]) this.f121170OooOo;
            Object obj = objArr[i];
            if (i2 == 2) {
                this.f121170OooOo = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f121171OooOo0o - 1] = null;
            }
            e = (E) obj;
        }
        this.f121171OooOo0o--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f121171OooOo0o)) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Index: ", ", Size: ");
            sbOooO0OO.append(this.f121171OooOo0o);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        if (i2 == 1) {
            E e2 = (E) this.f121170OooOo;
            this.f121170OooOo = e;
            return e2;
        }
        Object[] objArr = (Object[]) this.f121170OooOo;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f121171OooOo0o;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i = this.f121171OooOo0o;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f121170OooOo, 0, i, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            OooO0O0(4);
            throw null;
        }
        int length = tArr.length;
        int i = this.f121171OooOo0o;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f121170OooOo;
                return tArr2;
            }
            tArr[0] = this.f121170OooOo;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f121170OooOo, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                OooO0O0(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.f121170OooOo, 0, tArr, 0, i);
            }
        }
        int i2 = this.f121171OooOo0o;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f121171OooOo0o)) {
            if (i2 == 0) {
                this.f121170OooOo = e;
            } else if (i2 == 1 && i == 0) {
                this.f121170OooOo = new Object[]{e, this.f121170OooOo};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f121170OooOo;
                } else {
                    Object[] objArr2 = (Object[]) this.f121170OooOo;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f121171OooOo0o - i);
                }
                objArr[i] = e;
                this.f121170OooOo = objArr;
            }
            this.f121171OooOo0o++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO(i, "Index: ", ", Size: ");
        sbOooO0OO.append(this.f121171OooOo0o);
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }
}
