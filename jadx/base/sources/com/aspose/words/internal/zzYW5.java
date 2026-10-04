package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
final class zzYW5 extends zzYRX {
    private static final Hashtable zzWbv;

    static {
        Hashtable hashtable = new Hashtable();
        zzWbv = hashtable;
        hashtable.put("RIPEMD128", zzZ8R.zzWBE);
        hashtable.put("RIPEMD160", zzZ8R.zzWBF);
        hashtable.put("RIPEMD256", zzZ8R.zzWu4);
        hashtable.put(IDevicePopManager.SHA_1, zzZ79.zzWpe);
        hashtable.put("SHA-224", zzZ9O.zzWAI);
        hashtable.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzZ9O.zzWAL);
        hashtable.put("SHA-384", zzZ9O.zzWAK);
        hashtable.put("SHA-512", zzZ9O.zzWAJ);
        hashtable.put("SHA-512/224", zzZ9O.zzWAH);
        hashtable.put("SHA-512/256", zzZ9O.zzWAG);
        hashtable.put("MD2", zzZ96.zzWy7);
        hashtable.put("MD4", zzZ96.zzWy6);
        hashtable.put("MD5", zzZ96.zzWy5);
    }

    public zzYW5(zzYUX zzyux) {
        this(zzyux, (zzZDA) zzWbv.get(zzyux.zzXGi()));
    }

    private zzYW5(zzYUX zzyux, zzZDA zzzda) {
        super(new zzYU8((zzYVC) zzYXY.zzS(zzZ0Q.zzWjd).zzXFZ()), zzyux, zzzda);
    }
}
