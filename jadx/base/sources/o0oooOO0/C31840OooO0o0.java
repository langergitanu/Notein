package o0oooOO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o0oooOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31840OooO0o0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f113469OooOo0o;

    /* JADX INFO: renamed from: o0oooOO0.OooO0o0$OooO00o */
    public class OooO00o implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f113471OooOo0o;

        public OooO00o(int i) {
            this.f113471OooOo0o = i;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return getKey().equals(oooO00o.getKey()) && getValue().equals(oooO00o.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return (K) C31840OooO0o0.this.f113469OooOo0o[this.f113471OooOo0o];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return (V) C31840OooO0o0.this.f113469OooOo0o[this.f113471OooOo0o + 1];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (v == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            V v2 = (V) getValue();
            C31840OooO0o0.this.f113469OooOo0o[this.f113471OooOo0o + 1] = v;
            return v2;
        }
    }

    public final int OooO00o(Object obj) {
        if (!isEmpty() && obj != null) {
            int i = 0;
            while (true) {
                Object[] objArr = this.f113469OooOo0o;
                if (i >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f113469OooOo0o = null;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO00o(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = -1;
        if (!isEmpty() && obj != null) {
            int i2 = 1;
            while (true) {
                Object[] objArr = this.f113469OooOo0o;
                if (i2 >= objArr.length) {
                    break;
                }
                if (obj.equals(objArr[i2])) {
                    i = i2;
                    break;
                }
                i2 += 2;
            }
        }
        return i >= 0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < this.f113469OooOo0o.length; i += 2) {
            linkedHashSet.add(new OooO00o(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int iOooO00o = OooO00o(obj);
        if (iOooO00o < 0) {
            return null;
        }
        return (V) this.f113469OooOo0o[iOooO00o + 1];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Object[] objArr = this.f113469OooOo0o;
        return objArr == null || objArr.length == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (true) {
            Object[] objArr = this.f113469OooOo0o;
            if (i >= objArr.length) {
                return Collections.unmodifiableSet(linkedHashSet);
            }
            linkedHashSet.add(objArr[i]);
            i += 2;
        }
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("Key or value must not be null.");
        }
        if (this.f113469OooOo0o == null) {
            this.f113469OooOo0o = new Object[]{k, v};
            return null;
        }
        int iOooO00o = OooO00o(k);
        if (iOooO00o >= 0) {
            Object[] objArr = this.f113469OooOo0o;
            int i = iOooO00o + 1;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
        Object[] objArr2 = this.f113469OooOo0o;
        int length = objArr2.length;
        Object[] objArr3 = new Object[length + 2];
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        objArr3[length] = k;
        objArr3[length + 1] = v;
        this.f113469OooOo0o = objArr3;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = this.f113469OooOo0o;
        int i = 0;
        if (objArr == null || objArr.length == 0) {
            this.f113469OooOo0o = new Object[map.size() << 1];
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new NullPointerException("Key or value must not be null.");
                }
                int i2 = i + 1;
                this.f113469OooOo0o[i] = entry.getKey();
                i += 2;
                this.f113469OooOo0o[i2] = entry.getValue();
            }
            return;
        }
        int length = objArr.length;
        int size = (map.size() << 1) + length;
        Object[] objArr2 = new Object[size];
        System.arraycopy(this.f113469OooOo0o, 0, objArr2, 0, length);
        for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
            if (entry2.getKey() == null || entry2.getValue() == null) {
                throw new NullPointerException("Key or value must not be null.");
            }
            int iOooO00o = OooO00o(entry2.getKey());
            if (iOooO00o >= 0) {
                objArr2[iOooO00o + 1] = entry2.getValue();
            } else {
                int i3 = length + 1;
                objArr2[length] = entry2.getKey();
                length += 2;
                objArr2[i3] = entry2.getValue();
            }
        }
        if (length < size) {
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr2 = objArr3;
        }
        this.f113469OooOo0o = objArr2;
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        int iOooO00o = OooO00o(obj);
        if (iOooO00o < 0) {
            return null;
        }
        Object[] objArr = this.f113469OooOo0o;
        V v = (V) objArr[iOooO00o + 1];
        int length = objArr.length;
        if (length == 2) {
            this.f113469OooOo0o = null;
            return v;
        }
        Object[] objArr2 = new Object[length - 2];
        System.arraycopy(objArr, 0, objArr2, 0, iOooO00o);
        System.arraycopy(this.f113469OooOo0o, iOooO00o + 2, objArr2, iOooO00o, (length - iOooO00o) - 2);
        this.f113469OooOo0o = objArr2;
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        Object[] objArr = this.f113469OooOo0o;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        int i = 1;
        ArrayList arrayList = new ArrayList(this.f113469OooOo0o.length >> 1);
        while (true) {
            Object[] objArr = this.f113469OooOo0o;
            if (i >= objArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(objArr[i]);
            i += 2;
        }
    }
}
