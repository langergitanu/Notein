package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZOJ {
    public static final zzZOJ zzZX2 = new zzZ();
    protected static char[] zzZX1 = {ControlChar.PARAGRAPH_BREAK_CHAR, '\n'};

    public static final class zzZ extends zzZOJ {
        @Override // com.aspose.words.internal.zzZOJ
        public final void write(String str) {
        }

        @Override // com.aspose.words.internal.zzZOJ
        public final void zzFg() {
        }

        @Override // com.aspose.words.internal.zzZOJ
        public final void zzXB(String str) {
        }

        @Override // com.aspose.words.internal.zzZOJ
        public final void write(char[] cArr, int i, int i2) {
        }
    }

    public void close() throws Exception {
        zzi(true);
    }

    public void flush() throws Exception {
    }

    public void write(char[] cArr) throws Exception {
        if (cArr != null) {
            write(cArr, 0, cArr.length);
        }
    }

    public void zzFg() throws Exception {
        write(zzZX1);
    }

    public final void zzV(String str, Object obj) throws Exception {
        zzXB(zzZKN.format(str, obj));
    }

    public void zzXB(String str) throws Exception {
        if (str == null) {
            zzFg();
            return;
        }
        int length = str.length();
        int length2 = zzZX1.length;
        int i = length + length2;
        char[] cArr = new char[i];
        zzZKN.zzZ(str, 0, cArr, 0, length);
        if (length2 == 2) {
            char[] cArr2 = zzZX1;
            cArr[length] = cArr2[0];
            cArr[length + 1] = cArr2[1];
        } else if (length2 == 1) {
            cArr[length] = zzZX1[0];
        } else {
            System.arraycopy(zzZX1, 0, cArr, length * 2, length2 * 2);
        }
        write(cArr, 0, i);
    }

    public final void zzZ(char[] cArr, int i) throws Exception {
        write(cArr, 0, i);
        zzFg();
    }

    public void zzZR(char c) throws Exception {
    }

    public void zzi(boolean z) throws Exception {
    }

    public void write(char[] cArr, int i, int i2) throws Exception {
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
            throw new IllegalArgumentException("(buffer.length - index) should be less than count");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            zzZR(cArr[i + i3]);
        }
    }

    public final void zzZ(String str, Object... objArr) throws Exception {
        zzXB(zzZKN.format(str, objArr));
    }

    public void write(String str) throws Exception {
        if (str != null) {
            write(str.toCharArray());
        }
    }
}
