package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZOM extends zzZOK {
    private int zzZX4;
    private String zzZX5;
    private int zzc7;

    public zzZOM(String str) {
        if (str == null) {
            throw new NullPointerException("s");
        }
        this.zzZX5 = str;
        this.zzc7 = str.length();
    }

    @Override // com.aspose.words.internal.zzZOK
    public final int read() throws Exception {
        String str = this.zzZX5;
        if (str == null) {
            throw new IllegalStateException("StringReader Closed");
        }
        int i = this.zzZX4;
        if (i == this.zzc7) {
            return -1;
        }
        this.zzZX4 = i + 1;
        return str.charAt(i);
    }

    @Override // com.aspose.words.internal.zzZOK
    public final String readLine() throws Exception {
        if (this.zzZX5 == null) {
            throw new IllegalStateException("StringReader Closed");
        }
        int i = this.zzZX4;
        while (i < this.zzc7) {
            char cCharAt = this.zzZX5.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                String strSubstring = this.zzZX5.substring(this.zzZX4, i);
                int i2 = i + 1;
                this.zzZX4 = i2;
                if (cCharAt == '\r' && i2 < this.zzc7 && this.zzZX5.charAt(i2) == '\n') {
                    this.zzZX4++;
                }
                return strSubstring;
            }
            i++;
        }
        int i3 = this.zzZX4;
        if (i <= i3) {
            return null;
        }
        String strSubstring2 = this.zzZX5.substring(i3, i);
        this.zzZX4 = i;
        return strSubstring2;
    }

    @Override // com.aspose.words.internal.zzZOK
    public final int zzCR() throws Exception {
        String str = this.zzZX5;
        if (str == null) {
            throw new IllegalStateException("StringReader Closed");
        }
        int i = this.zzZX4;
        if (i == this.zzc7) {
            return -1;
        }
        return str.charAt(i);
    }

    @Override // com.aspose.words.internal.zzZOK
    public final void zzGY() {
        this.zzZX5 = null;
        this.zzZX4 = 0;
        this.zzc7 = 0;
    }

    @Override // com.aspose.words.internal.zzZOK
    public final String zziv() throws Exception {
        String strSubstring = this.zzZX5;
        if (strSubstring == null) {
            throw new IllegalStateException("StringReader Closed");
        }
        int i = this.zzZX4;
        if (i != 0) {
            strSubstring = strSubstring.substring(i, this.zzc7);
        }
        this.zzZX4 = this.zzc7;
        return strSubstring;
    }

    @Override // com.aspose.words.internal.zzZOK
    public final int read(char[] cArr, int i, int i2) throws Exception {
        if (cArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 >= 0) {
            if (cArr.length - i >= i2) {
                String str = this.zzZX5;
                if (str != null) {
                    int i3 = this.zzc7;
                    int i4 = this.zzZX4;
                    int i5 = i3 - i4;
                    if (i5 <= 0) {
                        return i5;
                    }
                    if (i5 <= i2) {
                        i2 = i5;
                    }
                    zzZKN.zzZ(str, i4, cArr, i, i2);
                    this.zzZX4 += i2;
                    return i2;
                }
                throw new IllegalStateException("StringReader Closed");
            }
            throw new IllegalArgumentException("index and count don't match buffer length");
        }
        throw new IndexOutOfBoundsException(C18293o1.f55803f);
    }
}
