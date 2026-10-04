package com.huawei.hms.drive;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.drive.dy */
/* JADX INFO: loaded from: classes6.dex */
public class C17869dy {
    /* JADX INFO: renamed from: a */
    private static byte[] m76775a(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    /* JADX INFO: renamed from: b */
    public static String m76776b(byte[] bArr) {
        return m76773a(bArr, C17866dv.f53403f);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m76774a(String str) {
        return m76775a(str, C17866dv.f53403f);
    }

    /* JADX INFO: renamed from: a */
    private static String m76773a(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: a */
    public static String m76772a(byte[] bArr) {
        return m76773a(bArr, C17866dv.f53399b);
    }
}
