package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZON extends zzZOJ {
    static final /* synthetic */ boolean zzVr = true;
    private static zzZO0 zzZX6;
    private boolean zzZX7;
    private boolean zzZX8;
    boolean zzZX9;
    private zzZO3 zzZXa;
    int zzZXh;
    int zzZXi;
    char[] zzZXk;
    byte[] zzZXl;
    private zzZO0 zzZXn;
    zzZOP zzZXo;

    public zzZON() {
    }

    private static zzZOP zzJ(String str, boolean z) throws IOException {
        return new zzZOS(str, z ? 6 : 2, 2);
    }

    private void zzS(boolean z, boolean z2) throws Exception {
        if (this.zzZXo == null) {
            throw new IllegalStateException("StreamWriter already closed.");
        }
        if (this.zzZXi != 0 || z || z2) {
            if (!this.zzZX8) {
                this.zzZX8 = true;
                byte[] bArrZzi3 = this.zzZXn.zzi3();
                if (bArrZzi3.length > 0) {
                    this.zzZXo.write(bArrZzi3, 0, bArrZzi3.length);
                }
            }
            int iZzZ = this.zzZXa.zzZ(this.zzZXk, this.zzZXi, this.zzZXl);
            this.zzZXi = 0;
            if (iZzZ > 0) {
                this.zzZXo.write(this.zzZXl, 0, iZzZ);
            }
        }
    }

    private void zzZ(zzZOP zzzop, zzZO0 zzzo0, int i) throws Exception {
        this.zzZXo = zzzop;
        this.zzZXn = zzzo0;
        this.zzZXa = zzzo0.zzik();
        if (i < 128) {
            i = 128;
        }
        this.zzZXk = new char[i];
        this.zzZXl = new byte[zzzo0.zzQB(i)];
        this.zzZXh = i;
        if (zzzop.zzRG() && zzzop.getPosition() > 0) {
            this.zzZX8 = true;
        }
        this.zzZX7 = true;
    }

    private static zzZO0 zzir() {
        if (zzZX6 == null) {
            zzZX6 = new zzZNI(false);
        }
        return zzZX6;
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void close() throws Exception {
        zzi(true);
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void flush() throws Exception {
        zzS(true, true);
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void write(char[] cArr) throws Exception {
        int i;
        if (cArr == null) {
            return;
        }
        int i2 = 0;
        for (int length = cArr.length; length > 0; length -= i) {
            if (this.zzZXi == this.zzZXh) {
                zzS(false, false);
            }
            int i3 = this.zzZXh;
            int i4 = this.zzZXi;
            i = i3 - i4;
            if (i > length) {
                i = length;
            }
            if (!zzVr && i <= 0) {
                throw new AssertionError("StreamWriter::Write(char[]) isn't making progress!  This is most likely a race in user code.");
            }
            System.arraycopy(cArr, i2, this.zzZXk, i4, i);
            this.zzZXi += i;
            i2 += i;
        }
        if (this.zzZX9) {
            zzS(true, false);
        }
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void zzZR(char c) throws Exception {
        if (this.zzZXi == this.zzZXh) {
            zzS(false, false);
        }
        char[] cArr = this.zzZXk;
        int i = this.zzZXi;
        cArr[i] = c;
        this.zzZXi = i + 1;
        if (this.zzZX9) {
            zzS(true, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.internal.zzZOJ
    public final void zzi(boolean z) throws Exception {
        zzZOP zzzop;
        zzZOP zzzop2;
        try {
            if (this.zzZXo != null && (z || !this.zzZX7)) {
                zzS(true, true);
            }
            if (!this.zzZX7 || (zzzop2 = this.zzZXo) == null) {
                return;
            }
            if (z) {
                try {
                    zzzop2.close();
                } finally {
                }
            }
        } catch (Throwable th) {
            if (this.zzZX7 && (zzzop = this.zzZXo) != null) {
                if (z) {
                    try {
                        zzzop.close();
                    } finally {
                    }
                }
            }
            throw th;
        }
    }

    public final zzZOP zzq() {
        return this.zzZXo;
    }

    public zzZON(zzZOP zzzop) throws Exception {
        this(zzzop, zzir(), 1024);
    }

    public zzZON(zzZOP zzzop, zzZO0 zzzo0) throws Exception {
        this(zzzop, zzzo0, 1024);
    }

    public zzZON(zzZOP zzzop, zzZO0 zzzo0, int i) throws Exception {
        if (zzzop != null && zzzo0 != null) {
            if (!zzzop.canWrite()) {
                throw new IllegalArgumentException("stream can't write");
            }
            if (i > 0) {
                zzZ(zzzop, zzzo0, i);
                return;
            }
            throw new IndexOutOfBoundsException("bufferSize");
        }
        throw new NullPointerException(zzzop == null ? "stream" : "encoding");
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void write(char[] cArr, int i, int i2) throws Exception {
        if (cArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 >= 0) {
            if (cArr.length - i >= i2) {
                while (i2 > 0) {
                    if (this.zzZXi == this.zzZXh) {
                        zzS(false, false);
                    }
                    int i3 = this.zzZXh;
                    int i4 = this.zzZXi;
                    int i5 = i3 - i4;
                    if (i5 > i2) {
                        i5 = i2;
                    }
                    if (!zzVr && i5 <= 0) {
                        throw new AssertionError("StreamWriter::Write(char[], int, int) isn't making progress!  This is most likely a race condition in user code.");
                    }
                    System.arraycopy(cArr, i, this.zzZXk, i4, i5);
                    this.zzZXi += i5;
                    i += i5;
                    i2 -= i5;
                }
                if (this.zzZX9) {
                    zzS(true, false);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("buffer.length - index < count");
        }
        throw new IndexOutOfBoundsException(C18293o1.f55803f);
    }

    public zzZON(String str) throws Exception {
        this(str, false, zzir());
    }

    public zzZON(String str, byte b) throws Exception {
        this(str, true, zzir());
    }

    private zzZON(String str, boolean z, zzZO0 zzzo0) throws Exception {
        zzZOP zzzopZzJ;
        if (str != null && zzzo0 != null) {
            try {
                zzzopZzJ = zzJ(str, z);
            } catch (IOException e) {
                e = e;
                zzzopZzJ = null;
            }
            try {
                zzZ(zzzopZzJ, zzzo0, 1024);
                return;
            } catch (IOException e2) {
                e = e2;
                if (zzzopZzJ != null) {
                    zzzopZzJ.close();
                }
                throw e;
            }
        }
        throw new NullPointerException(str == null ? "path" : "encoding");
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void write(String str) throws Exception {
        int i;
        if (str != null) {
            int i2 = 0;
            for (int length = str.length(); length > 0; length -= i) {
                if (this.zzZXi == this.zzZXh) {
                    zzS(false, false);
                }
                int i3 = this.zzZXh;
                int i4 = this.zzZXi;
                i = i3 - i4;
                if (i > length) {
                    i = length;
                }
                if (!zzVr && i <= 0) {
                    throw new AssertionError("StreamWriter::Write(String) isn't making progress!  This is most likely a race condition in user code.");
                }
                zzZKN.zzZ(str, i2, this.zzZXk, i4, i);
                this.zzZXi += i;
                i2 += i;
            }
            if (this.zzZX9) {
                zzS(true, false);
            }
        }
    }
}
