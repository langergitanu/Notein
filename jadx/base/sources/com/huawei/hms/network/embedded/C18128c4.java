package com.huawei.hms.network.embedded;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.SecurityBase64Utils;
import com.huawei.hms.network.embedded.C18156e4;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c4 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18128c4 {

    /* JADX INFO: renamed from: a */
    public static final String f54416a = "EncryptKey";

    /* JADX INFO: renamed from: b */
    public static byte[] f54417b = null;

    /* JADX INFO: renamed from: c */
    public static final String f54418c = "fruit";

    /* JADX INFO: renamed from: d */
    public static final String f54419d = "APPLE";

    /* JADX INFO: renamed from: a */
    public static byte[] m78093a(PLSharedPreferences pLSharedPreferences, boolean z) throws IOException {
        byte[] bArrDecode;
        String string = pLSharedPreferences.getString(f54419d, "");
        if (!TextUtils.isEmpty(string)) {
            bArrDecode = SecurityBase64Utils.decode(C18142d4.m78172a(string), 0);
        } else {
            if (!z) {
                throw new C18156e4.b("The workKey does not exist");
            }
            bArrDecode = C18142d4.m78173a();
            String strM78174b = C18142d4.m78174b(SecurityBase64Utils.encodeToString(bArrDecode, 0));
            SharedPreferences.Editor editorEdit = pLSharedPreferences.edit();
            editorEdit.putString(f54419d, strM78174b);
            editorEdit.apply();
            Logger.m76963i(f54416a, "generate work key success");
        }
        if (bArrDecode != null && bArrDecode.length != 0) {
            return bArrDecode;
        }
        if (!z) {
            throw new C18156e4.b("WorkKey is invalid");
        }
        Logger.m76967w(f54416a, "WorkKey is Empty!");
        SharedPreferences.Editor editorEdit2 = pLSharedPreferences.edit();
        editorEdit2.putString(f54419d, "");
        editorEdit2.apply();
        return m78093a(pLSharedPreferences, true);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m78094a(boolean z) throws IOException {
        byte[] bArr;
        synchronized (C18128c4.class) {
            try {
                byte[] bArr2 = f54417b;
                if (bArr2 == null || bArr2.length == 0) {
                    f54417b = m78093a(new PLSharedPreferences(ContextHolder.getAppContext(), f54418c), z);
                }
                bArr = f54417b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
