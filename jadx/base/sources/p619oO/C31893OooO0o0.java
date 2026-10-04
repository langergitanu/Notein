package p619oO;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31893OooO0o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, C31893OooO0o0> f113629OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113630OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113631OooO0O0;

    static {
        HashMap map = new HashMap();
        map.put(OooO00o(32, 16, 67, 10, KeyUtil.HMAC_KEY_HASH_ALGORITHM), new C31893OooO0o0(1, "XMSS_SHA2_10_256"));
        map.put(OooO00o(32, 16, 67, 16, KeyUtil.HMAC_KEY_HASH_ALGORITHM), new C31893OooO0o0(2, "XMSS_SHA2_16_256"));
        map.put(OooO00o(32, 16, 67, 20, KeyUtil.HMAC_KEY_HASH_ALGORITHM), new C31893OooO0o0(3, "XMSS_SHA2_20_256"));
        map.put(OooO00o(64, 16, 131, 10, "SHA-512"), new C31893OooO0o0(4, "XMSS_SHA2_10_512"));
        map.put(OooO00o(64, 16, 131, 16, "SHA-512"), new C31893OooO0o0(5, "XMSS_SHA2_16_512"));
        map.put(OooO00o(64, 16, 131, 20, "SHA-512"), new C31893OooO0o0(6, "XMSS_SHA2_20_512"));
        map.put(OooO00o(32, 16, 67, 10, "SHAKE128"), new C31893OooO0o0(7, "XMSS_SHAKE_10_256"));
        map.put(OooO00o(32, 16, 67, 16, "SHAKE128"), new C31893OooO0o0(8, "XMSS_SHAKE_16_256"));
        map.put(OooO00o(32, 16, 67, 20, "SHAKE128"), new C31893OooO0o0(9, "XMSS_SHAKE_20_256"));
        map.put(OooO00o(64, 16, 131, 10, "SHAKE256"), new C31893OooO0o0(10, "XMSS_SHAKE_10_512"));
        map.put(OooO00o(64, 16, 131, 16, "SHAKE256"), new C31893OooO0o0(11, "XMSS_SHAKE_16_512"));
        map.put(OooO00o(64, 16, 131, 20, "SHAKE256"), new C31893OooO0o0(12, "XMSS_SHAKE_20_512"));
        f113629OooO0OO = Collections.unmodifiableMap(map);
    }

    public C31893OooO0o0(int i, String str) {
        this.f113630OooO00o = i;
        this.f113631OooO0O0 = str;
    }

    public static String OooO00o(int i, int i2, int i3, int i4, String str) {
        return str + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i2 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i3 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i4;
    }

    public final String toString() {
        return this.f113631OooO0O0;
    }
}
