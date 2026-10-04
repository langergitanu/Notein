package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: com.huawei.agconnect.config.impl.l */
/* JADX INFO: loaded from: classes8.dex */
public class C17587l {
    /* JADX INFO: renamed from: a */
    private static String m75380a(Context context, String str, String str2) {
        int identifier;
        if (TextUtils.isEmpty(str2) || (identifier = context.getResources().getIdentifier(str2, "string", str)) == 0) {
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m75381a(Context context, String str, String str2, String str3) {
        try {
            return m75380a(context, str, str2 + Hex.encodeHexString(m75382a(str3.getBytes("utf-8"))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Log.e("ResourcesUtils", "getResources exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m75382a(byte[] bArr) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM).digest(bArr);
    }
}
