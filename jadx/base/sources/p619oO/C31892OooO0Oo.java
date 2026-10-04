package p619oO;

import com.aspose.slides.internal.p097e0.OooO00o;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31892OooO0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<String, C31892OooO0Oo> f113624OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113625OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113626OooO0O0;

    static {
        HashMap map = new HashMap();
        OooO00o.OooO0O0(1, "XMSSMT_SHA2_20/2_256", map, OooO00o(32, 16, 67, 20, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 2));
        OooO00o.OooO0O0(2, "XMSSMT_SHA2_20/4_256", map, OooO00o(32, 16, 67, 20, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 4));
        OooO00o.OooO0O0(3, "XMSSMT_SHA2_40/2_256", map, OooO00o(32, 16, 67, 40, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 2));
        OooO00o.OooO0O0(4, "XMSSMT_SHA2_40/4_256", map, OooO00o(32, 16, 67, 40, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 2));
        OooO00o.OooO0O0(5, "XMSSMT_SHA2_40/8_256", map, OooO00o(32, 16, 67, 40, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 4));
        OooO00o.OooO0O0(6, "XMSSMT_SHA2_60/3_256", map, OooO00o(32, 16, 67, 60, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 8));
        OooO00o.OooO0O0(7, "XMSSMT_SHA2_60/6_256", map, OooO00o(32, 16, 67, 60, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 6));
        OooO00o.OooO0O0(8, "XMSSMT_SHA2_60/12_256", map, OooO00o(32, 16, 67, 60, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 12));
        OooO00o.OooO0O0(9, "XMSSMT_SHA2_20/2_512", map, OooO00o(64, 16, 131, 20, "SHA-512", 2));
        OooO00o.OooO0O0(10, "XMSSMT_SHA2_20/4_512", map, OooO00o(64, 16, 131, 20, "SHA-512", 4));
        OooO00o.OooO0O0(11, "XMSSMT_SHA2_40/2_512", map, OooO00o(64, 16, 131, 40, "SHA-512", 2));
        OooO00o.OooO0O0(12, "XMSSMT_SHA2_40/4_512", map, OooO00o(64, 16, 131, 40, "SHA-512", 4));
        OooO00o.OooO0O0(13, "XMSSMT_SHA2_40/8_512", map, OooO00o(64, 16, 131, 40, "SHA-512", 8));
        OooO00o.OooO0O0(14, "XMSSMT_SHA2_60/3_512", map, OooO00o(64, 16, 131, 60, "SHA-512", 3));
        OooO00o.OooO0O0(15, "XMSSMT_SHA2_60/6_512", map, OooO00o(64, 16, 131, 60, "SHA-512", 6));
        OooO00o.OooO0O0(16, "XMSSMT_SHA2_60/12_512", map, OooO00o(64, 16, 131, 60, "SHA-512", 12));
        OooO00o.OooO0O0(17, "XMSSMT_SHAKE_20/2_256", map, OooO00o(32, 16, 67, 20, "SHAKE128", 2));
        OooO00o.OooO0O0(18, "XMSSMT_SHAKE_20/4_256", map, OooO00o(32, 16, 67, 20, "SHAKE128", 4));
        OooO00o.OooO0O0(19, "XMSSMT_SHAKE_40/2_256", map, OooO00o(32, 16, 67, 40, "SHAKE128", 2));
        OooO00o.OooO0O0(20, "XMSSMT_SHAKE_40/4_256", map, OooO00o(32, 16, 67, 40, "SHAKE128", 4));
        OooO00o.OooO0O0(21, "XMSSMT_SHAKE_40/8_256", map, OooO00o(32, 16, 67, 40, "SHAKE128", 8));
        OooO00o.OooO0O0(22, "XMSSMT_SHAKE_60/3_256", map, OooO00o(32, 16, 67, 60, "SHAKE128", 3));
        OooO00o.OooO0O0(23, "XMSSMT_SHAKE_60/6_256", map, OooO00o(32, 16, 67, 60, "SHAKE128", 6));
        OooO00o.OooO0O0(24, "XMSSMT_SHAKE_60/12_256", map, OooO00o(32, 16, 67, 60, "SHAKE128", 12));
        OooO00o.OooO0O0(25, "XMSSMT_SHAKE_20/2_512", map, OooO00o(64, 16, 131, 20, "SHAKE256", 2));
        OooO00o.OooO0O0(26, "XMSSMT_SHAKE_20/4_512", map, OooO00o(64, 16, 131, 20, "SHAKE256", 4));
        OooO00o.OooO0O0(27, "XMSSMT_SHAKE_40/2_512", map, OooO00o(64, 16, 131, 40, "SHAKE256", 2));
        OooO00o.OooO0O0(28, "XMSSMT_SHAKE_40/4_512", map, OooO00o(64, 16, 131, 40, "SHAKE256", 4));
        OooO00o.OooO0O0(29, "XMSSMT_SHAKE_40/8_512", map, OooO00o(64, 16, 131, 40, "SHAKE256", 8));
        OooO00o.OooO0O0(30, "XMSSMT_SHAKE_60/3_512", map, OooO00o(64, 16, 131, 60, "SHAKE256", 3));
        OooO00o.OooO0O0(31, "XMSSMT_SHAKE_60/6_512", map, OooO00o(64, 16, 131, 60, "SHAKE256", 6));
        map.put(OooO00o(64, 16, 131, 60, "SHAKE256", 12), new C31892OooO0Oo(32, "XMSSMT_SHAKE_60/12_512"));
        f113624OooO0OO = Collections.unmodifiableMap(map);
    }

    public C31892OooO0Oo(int i, String str) {
        this.f113625OooO00o = i;
        this.f113626OooO0O0 = str;
    }

    public static String OooO00o(int i, int i2, int i3, int i4, String str, int i5) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        return str + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i2 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i3 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i4 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + i5;
    }

    public final String toString() {
        return this.f113626OooO0O0;
    }
}
