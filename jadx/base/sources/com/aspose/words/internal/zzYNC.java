package com.aspose.words.internal;

import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzZ0P;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.IOException;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNC {
    static Map<String, zzZ5K> zzVOz = new HashMap();
    static Map<zzZ5K, zzZ5K> zzVOy = new HashMap();

    static {
        Map<String, zzZ5K> map = zzVOz;
        zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
        map.put(IDevicePopManager.SHA_1, zzz1j);
        Map<String, zzZ5K> map2 = zzVOz;
        zzZ1J zzz1j2 = zzZ0P.zzZ.zzWdJ;
        map2.put("SHA-224", zzz1j2);
        Map<String, zzZ5K> map3 = zzVOz;
        zzZ1J zzz1j3 = zzZ0P.zzZ.zzWdH;
        map3.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzz1j3);
        Map<String, zzZ5K> map4 = zzVOz;
        zzZ1J zzz1j4 = zzZ0P.zzZ.zzWdF;
        map4.put("SHA-384", zzz1j4);
        Map<String, zzZ5K> map5 = zzVOz;
        zzZ1J zzz1j5 = zzZ0P.zzZ.zzWdD;
        map5.put("SHA-512", zzz1j5);
        Map<String, zzZ5K> map6 = zzVOz;
        zzZ1J zzz1j6 = zzZ0P.zzZ.zzWdx;
        map6.put("SHA3-224", zzz1j6);
        Map<String, zzZ5K> map7 = zzVOz;
        zzZ1J zzz1j7 = zzZ0P.zzZ.zzWdv;
        map7.put("SHA3-256", zzz1j7);
        Map<String, zzZ5K> map8 = zzVOz;
        zzZ1J zzz1j8 = zzZ0P.zzZ.zzWdt;
        map8.put("SHA3-384", zzz1j8);
        Map<String, zzZ5K> map9 = zzVOz;
        zzZ1J zzz1j9 = zzZ0P.zzZ.zzWdr;
        map9.put("SHA3-512", zzz1j9);
        zzVOy.put(zzZ0P.zzZ.zzWdK, zzz1j);
        zzVOy.put(zzZ0P.zzZ.zzWdI, zzz1j2);
        zzVOy.put(zzZ0P.zzZ.zzWdG, zzz1j3);
        zzVOy.put(zzZ0P.zzZ.zzWdE, zzz1j4);
        zzVOy.put(zzZ0P.zzZ.zzWdC, zzz1j5);
        zzVOy.put(zzZ0P.zzZ.zzWdA, zzZ0P.zzZ.zzWdB);
        zzVOy.put(zzZ0P.zzZ.zzWdy, zzZ0P.zzZ.zzWdz);
        zzVOy.put(zzZ0P.zzZ.zzWdw, zzz1j6);
        zzVOy.put(zzZ0P.zzZ.zzWdu, zzz1j7);
        zzVOy.put(zzZ0P.zzZ.zzWds, zzz1j8);
        zzVOy.put(zzZ0P.zzZ.zzWdq, zzz1j9);
        zzVOy.put(zzYW0.zzZ.zzW1V, zzYW0.zzZ.zzW1W);
        zzVOy.put(zzYW0.zzZ.zzW1T, zzYW0.zzZ.zzW1U);
        zzVOy.put(zzYW0.zzZ.zzW1R, zzYW0.zzZ.zzW1S);
        zzVOy.put(zzYW0.zzZ.zzW1P, zzYW0.zzZ.zzW1Q);
        zzVOy.put(zzYW0.zzZ.zzW1N, zzYW0.zzZ.zzW1O);
        zzVOy.put(zzYW0.zzZ.zzW1L, zzYW0.zzZ.zzW1M);
        zzVOy.put(zzYW0.zzZ.zzW1H, zzYW0.zzZ.zzW1I);
        zzVOy.put(zzYW0.zzZ.zzW1J, zzYW0.zzZ.zzW1K);
    }

    public static zzZ5K zzR(zzZ5W zzz5w) {
        zzZ5K zzz5k = zzVOy.get(zzz5w);
        if (zzz5k != null) {
            return zzz5k;
        }
        throw new IllegalStateException("HMAC algorithm not recognized: " + zzz5w.getName());
    }

    public static String zzS(zzZ5W zzz5w) {
        String name = zzz5w.getName();
        int iIndexOf = name.indexOf(47);
        if (iIndexOf > 0) {
            name = name.substring(0, iIndexOf);
        }
        return name.equals("TripleDES") ? "DESede" : name;
    }

    public static boolean zzT(zzZ5W zzz5w) {
        String name = zzz5w.getName();
        return name.contains("/CCM") || name.contains("/EAX") || name.contains("/GCM") || name.contains("/CFB8MAC") || name.contains("/OCB") || name.contains("/GMAC") || name.contains("/CMAC") || name.contains("/CBCMAC") || name.contains("/MAC");
    }

    public static boolean zzU(zzZDK zzzdk) {
        return (zzzdk == null || zzZC8.zzWHS.equals(zzzdk.zzXL0())) ? false : true;
    }

    public static Set<zzZ5W> zzY(zzZ5W[] zzz5wArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (zzZ5W zzz5w : zzz5wArr) {
            if (zzz5w instanceof zzZ1P) {
                linkedHashSet.add(zzz5w);
            }
        }
        return linkedHashSet;
    }

    public static <T> T zzZ(T t, SecureRandom secureRandom) {
        return t instanceof zzZ50 ? (T) ((zzZ50) t).zzX(secureRandom) : t;
    }

    public static byte[] zzZ(Key key) throws InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null || encoded.length == 0) {
            throw new InvalidKeyException("no encoding for key");
        }
        return encoded;
    }

    public static zzZ46 zzZ(zzZ5W zzz5w, Key key) throws InvalidKeyException {
        if (key instanceof SecretKey) {
            if (key instanceof zzYNP) {
                return ((zzYNP) key).zzXAj();
            }
            return new zzZ43(zzz5w, key.getEncoded());
        }
        throw new InvalidKeyException("Key needs to be SecretKey.");
    }

    public static boolean zzZ(final zzZ46 zzz46, int i) {
        return ((byte[]) AccessController.doPrivileged(new PrivilegedAction<byte[]>() { // from class: com.aspose.words.internal.zzYNC.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXDZ, reason: merged with bridge method [inline-methods] */
            public byte[] run() {
                return zzz46.zzXK4();
            }
        })).length != (i + 7) / 8;
    }

    public static char[] zzZ(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (protectionParameter instanceof KeyStore.CallbackHandlerProtection) {
            CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
            PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
            try {
                callbackHandler.handle(new Callback[]{passwordCallback});
                return passwordCallback.getPassword();
            } catch (UnsupportedCallbackException e) {
                throw new IllegalArgumentException("PasswordCallback not recognised: " + e.getMessage(), e);
            }
        }
        throw new IllegalArgumentException("no support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
    }
}
