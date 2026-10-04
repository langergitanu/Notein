package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYM5 {

    /* JADX INFO: renamed from: J */
    private static Map<zzZDA, String> f51195J;

    static {
        HashMap map = new HashMap();
        f51195J = map;
        map.put(zzZ96.zzWy7, "MD2");
        f51195J.put(zzZ96.zzWy6, "MD4");
        f51195J.put(zzZ96.zzWy5, "MD5");
        f51195J.put(zzZ9K.zzWyW, IDevicePopManager.SHA_1);
        f51195J.put(zzZ9O.zzWAI, "SHA-224");
        f51195J.put(zzZ9O.zzWAL, KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        f51195J.put(zzZ9O.zzWAK, "SHA-384");
        f51195J.put(zzZ9O.zzWAJ, "SHA-512");
        f51195J.put(zzZ8R.zzWBE, "RIPEMD-128");
        f51195J.put(zzZ8R.zzWBF, "RIPEMD-160");
        f51195J.put(zzZ8R.zzWu4, "RIPEMD-128");
        f51195J.put(zzZ9Y.zzWBE, "RIPEMD-128");
        f51195J.put(zzZ9Y.zzWBF, "RIPEMD-160");
        f51195J.put(zzZAE.zzWF1, "GOST3411");
        f51195J.put(zzZA1.zzWCB, "Tiger");
        f51195J.put(zzZ9Y.zzWBD, "Whirlpool");
        f51195J.put(zzZ9O.zzWAF, "SHA3-224");
        f51195J.put(zzZ9O.zzWAE, "SHA3-256");
        f51195J.put(zzZ9O.zzWAD, "SHA3-384");
        f51195J.put(zzZ9O.zzWAC, "SHA3-512");
    }

    public static String zzC(zzZDA zzzda) {
        String str = f51195J.get(zzzda);
        return str != null ? str : zzzda.getId();
    }
}
