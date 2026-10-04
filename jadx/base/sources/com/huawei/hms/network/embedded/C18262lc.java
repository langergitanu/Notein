package com.huawei.hms.network.embedded;

import OooO0O0.OooO0o;
import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.lc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18262lc {
    /* JADX INFO: renamed from: a */
    public static long m79107a(String str) {
        return m79108a(str, 0, str.length());
    }

    /* JADX INFO: renamed from: a */
    public static long m79108a(String str, int i, int i2) {
        long j;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbOooO0OO = OooO0o.OooO0OO(i2, "endIndex > string.length: ", " > ");
            sbOooO0OO.append(str.length());
            throw new IllegalArgumentException(sbOooO0OO.toString());
        }
        long j2 = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i3 = i + 1;
                    char cCharAt2 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i3;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }
}
