package com.huawei.agconnect.common.api;

import android.util.Log;
import java.security.SecureRandom;
import o0O00o0o.C25846OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public class RandomWrapper {
    public static byte[] generateSecureRandom(int i) {
        Log.i("SecurityComp10200303: ".concat("EncryptUtil"), "setBouncycastleFlag: true");
        C25846OooO00o.f88194OooO00o = true;
        byte[] bArrOooO00o = C25846OooO00o.OooO00o(i);
        if (bArrOooO00o.length != 0) {
            return bArrOooO00o;
        }
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
