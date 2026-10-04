package o00o0Ooo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: o00o0Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25428OooO0o<K, V> extends HashMap<K, V> {
    public C25428OooO0o() {
        throw null;
    }

    public static Map OooO00o(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put(str, str2);
        return Collections.unmodifiableMap(map);
    }

    public static Map OooO0O0(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap(2);
        map.put(str, str2);
        map.put(str3, str4);
        return Collections.unmodifiableMap(map);
    }
}
