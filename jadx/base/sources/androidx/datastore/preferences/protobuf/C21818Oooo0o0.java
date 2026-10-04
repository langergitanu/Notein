package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21818Oooo0o0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C21818Oooo0o0<?, ?> f64514OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f64515OooOo0o = true;

    static {
        C21818Oooo0o0<?, ?> c21818Oooo0o0 = new C21818Oooo0o0<>();
        f64514OooOo = c21818Oooo0o0;
        c21818Oooo0o0.f64515OooOo0o = false;
    }

    public static int OooO00o(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof C21805OooOoO.OooO00o) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C21805OooOoO.f64482OooO00o;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public final void OooO0O0() {
        if (!this.f64515OooOo0o) {
            throw new UnsupportedOperationException();
        }
    }

    public final C21818Oooo0o0<K, V> OooO0Oo() {
        if (isEmpty()) {
            return new C21818Oooo0o0<>();
        }
        C21818Oooo0o0<K, V> c21818Oooo0o0 = new C21818Oooo0o0<>(this);
        c21818Oooo0o0.f64515OooOo0o = true;
        return c21818Oooo0o0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        return true;
                    }
                }
                z = false;
                if (z) {
                }
            } else {
                z = true;
                if (z) {
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iOooO00o = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iOooO00o += OooO00o(entry.getValue()) ^ OooO00o(entry.getKey());
        }
        return iOooO00o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        OooO0O0();
        Charset charset = C21805OooOoO.f64482OooO00o;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        OooO0O0();
        for (K k : map.keySet()) {
            Charset charset = C21805OooOoO.f64482OooO00o;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO0O0();
        return (V) super.remove(obj);
    }
}
