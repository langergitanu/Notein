package com.huawei.hms.framework.network.grs.p582h;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17957c {

    /* JADX INFO: renamed from: a */
    private static final String f53750a = "c";

    /* JADX INFO: renamed from: a */
    public static String m77155a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpen = null;
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStreamOpen = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            byteArrayOutputStream.flush();
                            String str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStreamOpen);
                            return str2;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
            } catch (IOException unused) {
                Logger.m76969w(f53750a, "local config file is not exist.filename is {%s}", str);
            }
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            return "";
        } catch (Throwable th) {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            throw th;
        }
    }
}
