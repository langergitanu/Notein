package com.huawei.hms.drive;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.drive.af */
/* JADX INFO: loaded from: classes6.dex */
public class C17769af {

    /* JADX INFO: renamed from: a */
    private static final Pattern f52547a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    /* JADX INFO: renamed from: a */
    private static String m75942a(String str, boolean z) {
        StringBuilder sb = new StringBuilder(512);
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                sb.append(m75941a(str));
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m75943a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, m75942a(str2, z));
    }

    /* JADX INFO: renamed from: a */
    private static String m75941a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (f52547a.matcher(String.valueOf(cCharAt)).matches()) {
                if (i % 2 == 0) {
                    cCharAt = '*';
                }
                i++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
