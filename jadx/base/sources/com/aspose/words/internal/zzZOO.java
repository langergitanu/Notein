package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOO extends zzZOK {
    static final /* synthetic */ boolean zzVr = true;
    private boolean zzZXb;
    private boolean zzZXc;
    private boolean zzZXd;
    private int zzZXe;
    private int zzZXf;
    private int zzZXg;
    private int zzZXh;
    private int zzZXi;
    private byte[] zzZXj;
    private char[] zzZXk;
    private byte[] zzZXl;
    private zzZO6 zzZXm;
    private zzZO0 zzZXn;
    private zzZOP zzZXo;

    public zzZOO() {
    }

    private void zzQC(int i) {
        if (!zzVr && this.zzZXg < i) {
            throw new AssertionError("CompressBuffer was called with a number of bytes greater than the current buffer length.  Are two threads using this StreamReader at the same time?");
        }
        byte[] bArr = this.zzZXl;
        System.arraycopy(bArr, i, bArr, 0, this.zzZXg - i);
        this.zzZXg -= i;
    }

    private void zzZ(zzZOP zzzop, zzZO0 zzzo0, boolean z, int i) {
        this.zzZXo = zzzop;
        this.zzZXn = zzzo0;
        this.zzZXm = zzzo0.zzil();
        this.zzZXl = new byte[1024];
        int iZzQA = zzzo0.zzQA(EditingLanguage.BULGARIAN);
        this.zzZXe = iZzQA;
        this.zzZXk = new char[iZzQA];
        this.zzZXg = 0;
        this.zzZXf = 0;
        this.zzZXd = z;
        byte[] bArrZzi3 = zzzo0.zzi3();
        this.zzZXj = bArrZzi3;
        this.zzZXc = bArrZzi3.length > 0;
        this.zzZXb = false;
    }

    private int zzis() throws Exception {
        int i;
        this.zzZXh = 0;
        this.zzZXi = 0;
        if (!this.zzZXc) {
            this.zzZXg = 0;
        }
        do {
            if (this.zzZXc) {
                boolean z = zzVr;
                if (!z && this.zzZXf > this.zzZXj.length) {
                    throw new AssertionError("possible bug in _compressPreamble.  Are two threads using this StreamReader at the same time?");
                }
                zzZOP zzzop = this.zzZXo;
                byte[] bArr = this.zzZXl;
                int i2 = this.zzZXf;
                int i3 = zzzop.read(bArr, i2, bArr.length - i2);
                if (!z && i3 < 0) {
                    throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
                }
                if (i3 == 0) {
                    int i4 = this.zzZXg;
                    if (i4 > 0) {
                        int i5 = this.zzZXh;
                        this.zzZXh = i5 + this.zzZXm.zzZ(this.zzZXl, 0, i4, this.zzZXk, i5);
                    }
                    return this.zzZXh;
                }
                this.zzZXg += i3;
            } else {
                boolean z2 = zzVr;
                if (!z2 && this.zzZXf != 0) {
                    throw new AssertionError("bytePos can be non zero only when we are trying to _checkPreamble.  Are two threads using this StreamReader at the same time?");
                }
                zzZOP zzzop2 = this.zzZXo;
                byte[] bArr2 = this.zzZXl;
                int i6 = zzzop2.read(bArr2, 0, bArr2.length);
                this.zzZXg = i6;
                if (!z2 && i6 < 0) {
                    throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
                }
                if (i6 == 0) {
                    return this.zzZXh;
                }
            }
            this.zzZXb = this.zzZXg < this.zzZXl.length;
            if (!zzit()) {
                if (this.zzZXd && this.zzZXg >= 2) {
                    zziu();
                }
                int i7 = this.zzZXh;
                this.zzZXh = i7 + this.zzZXm.zzZ(this.zzZXl, 0, this.zzZXg, this.zzZXk, i7);
            }
            i = this.zzZXh;
        } while (i == 0);
        return i;
    }

    private boolean zzit() {
        boolean z = this.zzZXc;
        if (!z) {
            return z;
        }
        if (!zzVr && this.zzZXf > this.zzZXj.length) {
            throw new AssertionError("_compressPreamble was called with the current bytePos greater than the preamble buffer length.  Are two threads using this StreamReader at the same time?");
        }
        int length = this.zzZXg;
        byte[] bArr = this.zzZXj;
        if (length >= bArr.length) {
            length = bArr.length;
        }
        int i = length - this.zzZXf;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            byte[] bArr2 = this.zzZXl;
            int i3 = this.zzZXf;
            if (bArr2[i3] != this.zzZXj[i3]) {
                this.zzZXf = 0;
                this.zzZXc = false;
                break;
            }
            i2++;
            this.zzZXf = i3 + 1;
        }
        if (!zzVr && this.zzZXf > this.zzZXj.length) {
            throw new AssertionError("possible bug in _compressPreamble.  Are two threads using this StreamReader at the same time?");
        }
        if (this.zzZXc) {
            int i4 = this.zzZXf;
            byte[] bArr3 = this.zzZXj;
            if (i4 == bArr3.length) {
                zzQC(bArr3.length);
                this.zzZXf = 0;
                this.zzZXc = false;
                this.zzZXd = false;
            }
        }
        return this.zzZXc;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zziu() {
        int i = this.zzZXg;
        if (i < 2) {
            return;
        }
        boolean z = false;
        this.zzZXd = false;
        byte[] bArr = this.zzZXl;
        byte b = bArr[0];
        if (b == -2 && bArr[1] == -1) {
            this.zzZXn = zzZO0.zzZ4(true);
            zzQC(2);
        } else if (b == -1 && bArr[1] == -2) {
            if (i >= 4 && bArr[2] == 0 && bArr[3] == 0) {
                this.zzZXn = zzZO0.zzZ5(false);
                zzQC(4);
            } else {
                this.zzZXn = zzZO0.zzZ4(false);
                zzQC(2);
            }
        } else if (i >= 3 && b == -17 && bArr[1] == -69 && bArr[2] == -65) {
            this.zzZXn = zzZO0.zzhV();
            zzQC(3);
        } else {
            if (i < 4 || b != 0 || bArr[1] != 0 || bArr[2] != -2 || bArr[3] != -1) {
                if (i >= 5 && b == 43 && bArr[1] == 47 && bArr[2] == 118 && bArr[3] == 56 && bArr[4] == 45) {
                    if (this.zzZXn.getCodePage() != 65000) {
                        this.zzZXn = zzZO0.zzhW();
                        z = true;
                    }
                    zzQC(5);
                } else if (i == 2) {
                    this.zzZXd = true;
                }
                if (z) {
                    return;
                }
                this.zzZXm = this.zzZXn.zzil();
                int iZzQA = this.zzZXn.zzQA(this.zzZXl.length + 2);
                this.zzZXe = iZzQA;
                this.zzZXk = new char[iZzQA];
                return;
            }
            this.zzZXn = zzZO0.zzZ5(true);
        }
        z = true;
        if (z) {
        }
    }

    @Override // com.aspose.words.internal.zzZOK
    public final void close() throws IOException {
        zzGY();
    }

    @Override // com.aspose.words.internal.zzZOK
    public final int read() throws Exception {
        if (this.zzZXo == null) {
            throw new IllegalStateException("StreamReader Closed");
        }
        if (this.zzZXi == this.zzZXh && zzis() == 0) {
            return -1;
        }
        char[] cArr = this.zzZXk;
        int i = this.zzZXi;
        char c = cArr[i];
        this.zzZXi = i + 1;
        return c;
    }

    @Override // com.aspose.words.internal.zzZOK
    public final String readLine() throws Exception {
        String str;
        int i;
        if (this.zzZXo == null) {
            throw new IllegalStateException("StreamReader Closed");
        }
        StringBuilder sb = null;
        if (this.zzZXi == this.zzZXh && zzis() == 0) {
            return null;
        }
        do {
            int i2 = this.zzZXi;
            do {
                char[] cArr = this.zzZXk;
                char c = cArr[i2];
                if (c == '\r' || c == '\n') {
                    if (sb != null) {
                        int i3 = this.zzZXi;
                        sb.append(cArr, i3, i2 - i3);
                        str = sb.toString();
                    } else {
                        int i4 = this.zzZXi;
                        str = new String(cArr, i4, i2 - i4);
                    }
                    int i5 = i2 + 1;
                    this.zzZXi = i5;
                    if (c == '\r' && (i5 < this.zzZXh || zzis() > 0)) {
                        char[] cArr2 = this.zzZXk;
                        int i6 = this.zzZXi;
                        if (cArr2[i6] == '\n') {
                            this.zzZXi = i6 + 1;
                        }
                    }
                    return str;
                }
                i2++;
                i = this.zzZXh;
            } while (i2 < i);
            int i7 = i - this.zzZXi;
            if (sb == null) {
                sb = new StringBuilder(i7 + 80);
            }
            sb.append(this.zzZXk, this.zzZXi, i7);
        } while (zzis() > 0);
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzZOK
    public final int zzCR() throws Exception {
        if (this.zzZXo == null) {
            throw new IllegalStateException("StreamReader Closed");
        }
        if (this.zzZXi == this.zzZXh && (this.zzZXb || zzis() == 0)) {
            return -1;
        }
        return this.zzZXk[this.zzZXi];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.internal.zzZOK
    public final void zzGY() throws IOException {
        try {
            zzZOP zzzop = this.zzZXo;
            if (zzzop != null) {
                zzzop.close();
            }
        } finally {
            if (this.zzZXo != null) {
                this.zzZXo = null;
                this.zzZXn = null;
                this.zzZXm = null;
                this.zzZXl = null;
                this.zzZXk = null;
                this.zzZXi = 0;
                this.zzZXh = 0;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZOK
    public final String zziv() throws Exception {
        if (this.zzZXo == null) {
            throw new IllegalStateException("StreamReader Closed");
        }
        StringBuilder sb = new StringBuilder(this.zzZXh - this.zzZXi);
        do {
            char[] cArr = this.zzZXk;
            int i = this.zzZXi;
            sb.append(cArr, i, this.zzZXh - i);
            this.zzZXi = this.zzZXh;
            zzis();
        } while (this.zzZXh > 0);
        return sb.toString();
    }

    public final zzZO0 zziw() {
        return this.zzZXn;
    }

    public final zzZOP zzq() {
        return this.zzZXo;
    }

    public zzZOO(zzZOP zzzop) {
        this(zzzop, (byte) 0);
    }

    private zzZOO(zzZOP zzzop, byte b) {
        this(zzzop, zzZO0.zzhV(), true);
    }

    public zzZOO(zzZOP zzzop, zzZO0 zzzo0) {
        this(zzzop, zzzo0, true);
    }

    private zzZOO(zzZOP zzzop, zzZO0 zzzo0, boolean z) {
        if (zzzop != null && zzzo0 != null) {
            zzZ(zzzop, zzzo0, true, 1024);
            return;
        }
        throw new NullPointerException(zzzop == null ? "stream" : "encoding");
    }

    @Override // com.aspose.words.internal.zzZOK
    public final int read(char[] cArr, int i, int i2) throws Exception {
        if (this.zzZXo == null) {
            throw new IllegalStateException("StreamReader Closed");
        }
        if (cArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i >= 0 && i2 >= 0) {
            if (cArr.length - i >= i2) {
                boolean[] zArr = {false};
                int i3 = 0;
                while (i2 > 0) {
                    int iZzZ = this.zzZXh - this.zzZXi;
                    if (iZzZ == 0) {
                        iZzZ = zzZ(cArr, i + i3, i2, zArr);
                    }
                    if (iZzZ == 0) {
                        break;
                    }
                    if (iZzZ > i2) {
                        iZzZ = i2;
                    }
                    if (!zArr[0]) {
                        System.arraycopy(this.zzZXk, this.zzZXi, cArr, i + i3, iZzZ);
                        this.zzZXi += iZzZ;
                    }
                    i3 += iZzZ;
                    i2 -= iZzZ;
                    if (this.zzZXb) {
                        break;
                    }
                }
                return i3;
            }
            throw new IllegalArgumentException("index and count don't match buffer length");
        }
        throw new IndexOutOfBoundsException(i < 0 ? FirebaseAnalytics.Param.INDEX : C18293o1.f55803f);
    }

    public zzZOO(String str, zzZO0 zzzo0) throws IOException {
        if (str != null && str.length() > 0) {
            zzZOS zzzos = new zzZOS(str);
            if (zzzo0 != null) {
                zzZ((zzZOP) zzzos, zzzo0, true, 1024);
                return;
            }
            throw new NullPointerException("encoding");
        }
        throw new IllegalArgumentException("The argument cannot be null or empty string.\r\nParameter name: path");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(char[] cArr, int i, int i2, boolean[] zArr) throws Exception {
        this.zzZXh = 0;
        this.zzZXi = 0;
        if (!this.zzZXc) {
            this.zzZXg = 0;
        }
        zArr[0] = i2 >= this.zzZXe;
        int iZzZ = 0;
        do {
            if (this.zzZXc) {
                boolean z = zzVr;
                if (!z && this.zzZXf > this.zzZXj.length) {
                    throw new AssertionError("possible bug in _compressPreamble.  Are two threads using this StreamReader at the same time?");
                }
                zzZOP zzzop = this.zzZXo;
                byte[] bArr = this.zzZXl;
                int i3 = this.zzZXf;
                int i4 = zzzop.read(bArr, i3, bArr.length - i3);
                if (!z && i4 < 0) {
                    throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
                }
                if (i4 == 0) {
                    int i5 = this.zzZXg;
                    if (i5 > 0) {
                        if (zArr[0]) {
                            int iZzZ2 = iZzZ + this.zzZXm.zzZ(this.zzZXl, 0, i5, cArr, i + iZzZ);
                            this.zzZXh = 0;
                            return iZzZ2;
                        }
                        int iZzZ3 = this.zzZXm.zzZ(this.zzZXl, 0, i5, this.zzZXk, iZzZ);
                        this.zzZXh += iZzZ3;
                        return iZzZ3;
                    }
                    return iZzZ;
                }
                this.zzZXg += i4;
                this.zzZXb = this.zzZXg >= this.zzZXl.length;
                if (!zzit()) {
                    if (this.zzZXd && this.zzZXg >= 2) {
                        zziu();
                        zArr[0] = i2 >= this.zzZXe;
                    }
                    this.zzZXi = 0;
                    if (zArr[0]) {
                        iZzZ += this.zzZXm.zzZ(this.zzZXl, 0, this.zzZXg, cArr, i + iZzZ);
                        this.zzZXh = 0;
                    } else {
                        iZzZ = this.zzZXm.zzZ(this.zzZXl, 0, this.zzZXg, this.zzZXk, iZzZ);
                        this.zzZXh += iZzZ;
                    }
                }
            } else {
                boolean z2 = zzVr;
                if (!z2 && this.zzZXf != 0) {
                    throw new AssertionError("bytePos can be non zero only when we are trying to _checkPreamble.  Are two threads using this StreamReader at the same time?");
                }
                zzZOP zzzop2 = this.zzZXo;
                byte[] bArr2 = this.zzZXl;
                int i6 = zzzop2.read(bArr2, 0, bArr2.length);
                this.zzZXg = i6;
                if (!z2 && i6 < 0) {
                    throw new AssertionError("Stream.Read returned a negative number!  This is a bug in your stream class.");
                }
                if (i6 == 0) {
                    return iZzZ;
                }
                this.zzZXb = this.zzZXg >= this.zzZXl.length;
                if (!zzit()) {
                }
            }
        } while (iZzZ == 0);
        this.zzZXb &= iZzZ < i2;
        return iZzZ;
    }
}
