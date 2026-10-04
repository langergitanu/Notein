package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRT {
    private static final Map<String, Integer> zzVXw;

    static {
        HashMap map = new HashMap();
        com.aspose.words.OooO0OO.OooO0O0(13004, map, "RIPEMD128", 12748, "RIPEMD160");
        com.aspose.words.OooO0OO.OooO0O0(13260, map, IDevicePopManager.SHA_1, 14540, "SHA-224");
        com.aspose.words.OooO0OO.OooO0O0(13516, map, KeyUtil.HMAC_KEY_HASH_ALGORITHM, 14028, "SHA-384");
        com.aspose.words.OooO0OO.OooO0O0(13772, map, "SHA-512", 14796, "SHA-512/224");
        com.aspose.words.OooO0OO.OooO0O0(15052, map, "SHA-512/256", 14284, "WHIRLPOOL");
        zzVXw = Collections.unmodifiableMap(map);
    }

    public static boolean zzU(zzYUX zzyux) {
        return !zzVXw.containsKey(zzyux.zzXGi());
    }

    public static Integer zzV(zzYUX zzyux) {
        return zzVXw.get(zzyux.zzXGi());
    }
}
