package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZOK implements zzZOY {
    public void close() throws Exception {
        zzGY();
    }

    @Override // com.aspose.words.internal.zzZOY
    public void dispose() throws Exception {
        zzGY();
    }

    public abstract int read() throws Exception;

    public int read(char[] cArr, int i, int i2) throws Exception {
        if (cArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C18293o1.f55803f);
        }
        if (cArr.length - i < i2) {
            throw new IllegalArgumentException("index and count don't match buffer length");
        }
        int i3 = 0;
        while (true) {
            int i4 = read();
            if (i4 == -1) {
                return i3;
            }
            int i5 = i3 + 1;
            cArr[i3 + i] = (char) i4;
            if (i5 >= i2) {
                return i5;
            }
            i3 = i5;
        }
    }

    public String readLine() throws Exception {
        int i;
        StringBuilder sb = new StringBuilder();
        while (true) {
            i = read();
            if (i == -1) {
                if (sb.length() > 0) {
                    return sb.toString();
                }
                return null;
            }
            if (i == 13 || i == 10) {
                break;
            }
            sb.append((char) i);
        }
        if (i == 13 && zzCR() == 10) {
            read();
        }
        return sb.toString();
    }

    public abstract int zzCR() throws Exception;

    public abstract void zzGY() throws Exception;

    public String zziv() throws Exception {
        char[] cArr = new char[4096];
        StringBuilder sb = new StringBuilder(4096);
        while (true) {
            int i = read(cArr, 0, 4096);
            if (i == 0) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }
}
