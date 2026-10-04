package p619oO;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31896OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<String, C31896OooOO0o> f113648OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113649OooO00o;

    static {
        HashMap map = new HashMap();
        map.put(OooO00o(32, 67, KeyUtil.HMAC_KEY_HASH_ALGORITHM), new C31896OooOO0o(16777217, "WOTSP_SHA2-256_W16"));
        map.put(OooO00o(64, 131, "SHA-512"), new C31896OooOO0o(33554434, "WOTSP_SHA2-512_W16"));
        map.put(OooO00o(32, 67, "SHAKE128"), new C31896OooOO0o(50331651, "WOTSP_SHAKE128_W16"));
        map.put(OooO00o(64, 131, "SHAKE256"), new C31896OooOO0o(67108868, "WOTSP_SHAKE256_W16"));
        f113648OooO0O0 = Collections.unmodifiableMap(map);
    }

    public C31896OooOO0o(int i, String str) {
        this.f113649OooO00o = str;
    }

    public static String OooO00o(int i, int i2, String str) {
        return str + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i + "-16-" + i2;
    }

    public final String toString() {
        return this.f113649OooO00o;
    }
}
