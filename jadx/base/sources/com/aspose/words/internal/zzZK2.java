package com.aspose.words.internal;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import com.aspose.slides.C22218Oooo;
import com.aspose.words.EditingLanguage;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK2 {
    protected int bgColor;
    protected int height;
    protected int status;
    protected int width;
    protected int zzZNA;
    protected int zzZNB;
    protected int zzZNC;
    protected int[] zzZND;
    protected int[] zzZNE;
    protected int[] zzZNF;
    protected int zzZNH;
    protected boolean zzZNI;
    protected InputStream zzZNJ;
    protected byte[] zzZNU;
    protected Bitmap zzZNV;
    protected int zzZNY;
    protected int zzZNf;
    protected List<zzZ> zzZNg;
    protected byte[] zzZNh;
    protected byte[] zzZNi;
    protected short[] zzZNj;
    protected Bitmap zzZNo;
    protected int zzZNp;
    protected int zzZNq;
    protected int zzZNr;
    protected int zzZNs;
    protected int zzZNt;
    protected int zzZNu;
    protected int zzZNv;
    protected int zzZNw;
    protected int zzZNx;
    protected boolean zzZNy;
    protected boolean zzZNz;
    protected int zzZNG = 1;
    protected byte[] zzZNn = new byte[256];
    protected int zzZNm = 0;
    protected int zzZNO = 0;
    protected int zzZNl = 0;
    protected boolean zzZNk = false;
    protected int delay = 0;

    public static class zzZ {
        public int delay;
        public Bitmap zzZNV;

        public zzZ(Bitmap bitmap, int i) {
            this.zzZNV = bitmap;
            this.delay = i;
        }
    }

    private int read() {
        try {
            return this.zzZNJ.read();
        } catch (Exception unused) {
            this.status = 1;
            return 0;
        }
    }

    private void zzLh() {
        String string = "";
        for (int i = 0; i < 6; i++) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(string);
            sbOooO0OO.append((char) read());
            string = sbOooO0OO.toString();
        }
        if (!string.startsWith("GIF")) {
            this.status = 1;
            return;
        }
        zzef();
        if (!this.zzZNI || zzek()) {
            return;
        }
        int[] iArrZzQh = zzQh(this.zzZNH);
        this.zzZNF = iArrZzQh;
        this.bgColor = iArrZzQh[this.zzZNC];
    }

    private int[] zzQh(int i) {
        int i2;
        int i3 = i * 3;
        byte[] bArr = new byte[i3];
        try {
            i2 = this.zzZNJ.read(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            i2 = 0;
        }
        if (i2 < i3) {
            this.status = 1;
            return null;
        }
        int[] iArr = new int[256];
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = bArr[i4] & 255;
            int i7 = i4 + 2;
            int i8 = bArr[i4 + 1] & 255;
            i4 += 3;
            iArr[i5] = (i8 << 8) | (i6 << 16) | ViewCompat.MEASURED_STATE_MASK | (bArr[i7] & 255);
        }
        return iArr;
    }

    private void zzec() {
        this.zzZNl = this.zzZNO;
        this.zzZNs = this.zzZNw;
        this.zzZNr = this.zzZNv;
        this.zzZNq = this.zzZNu;
        this.zzZNp = this.zzZNt;
        this.zzZNo = this.zzZNV;
        this.zzZNB = this.bgColor;
        this.zzZNO = 0;
        this.zzZNk = false;
        this.delay = 0;
        this.zzZNE = null;
    }

    private int zzed() {
        return read() | (read() << 8);
    }

    private void zzee() {
        do {
            zzej();
            byte[] bArr = this.zzZNn;
            if (bArr[0] == 1) {
                this.zzZNG = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.zzZNm <= 0) {
                return;
            }
        } while (!zzek());
    }

    private void zzef() {
        this.width = zzed();
        this.height = zzed();
        int i = read();
        this.zzZNI = (i & 128) != 0;
        this.zzZNH = 2 << (i & 7);
        this.zzZNC = read();
        this.zzZNA = read();
    }

    private void zzeg() {
        this.zzZNw = zzed();
        this.zzZNv = zzed();
        this.zzZNu = zzed();
        this.zzZNt = zzed();
        int i = read();
        int i2 = 0;
        this.zzZNz = (i & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (i & 7) + 1);
        this.zzZNx = iPow;
        this.zzZNy = (i & 64) != 0;
        if (this.zzZNz) {
            int[] iArrZzQh = zzQh(iPow);
            this.zzZNE = iArrZzQh;
            this.zzZND = iArrZzQh;
        } else {
            this.zzZND = this.zzZNF;
            if (this.zzZNC == this.zzZNY) {
                this.bgColor = 0;
            }
        }
        if (this.zzZNk) {
            int[] iArr = this.zzZND;
            int i3 = this.zzZNY;
            int i4 = iArr[i3];
            iArr[i3] = 0;
            i2 = i4;
        }
        if (this.zzZND == null) {
            this.status = 1;
        }
        if (zzek()) {
            return;
        }
        zzel();
        zzfo();
        if (zzek()) {
            return;
        }
        this.zzZNf++;
        this.zzZNV = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_4444);
        zzem();
        this.zzZNg.add(new zzZ(this.zzZNV, this.delay));
        if (this.zzZNk) {
            this.zzZND[this.zzZNY] = i2;
        }
        zzec();
    }

    private void zzeh() {
        read();
        int i = read();
        int i2 = (i & 28) >> 2;
        this.zzZNO = i2;
        if (i2 == 0) {
            this.zzZNO = 1;
        }
        this.zzZNk = (i & 1) != 0;
        this.delay = zzed() * 10;
        this.zzZNY = read();
        read();
    }

    private void zzei() {
        boolean z = false;
        while (!z && !zzek()) {
            int i = read();
            if (i == 33) {
                int i2 = read();
                if (i2 == 1) {
                    zzfo();
                } else if (i2 == 249) {
                    zzeh();
                } else if (i2 == 254) {
                    zzfo();
                } else if (i2 != 255) {
                    zzfo();
                } else {
                    zzej();
                    String string = "";
                    for (int i3 = 0; i3 < 11; i3++) {
                        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(string);
                        sbOooO0OO.append((char) this.zzZNn[i3]);
                        string = sbOooO0OO.toString();
                    }
                    if (string.equals("NETSCAPE2.0")) {
                        zzee();
                    } else {
                        zzfo();
                    }
                }
            } else if (i == 44) {
                zzeg();
            } else if (i != 59) {
                this.status = 1;
            } else {
                z = true;
            }
        }
    }

    private int zzej() {
        int i = read();
        this.zzZNm = i;
        int i2 = 0;
        if (i > 0) {
            while (true) {
                try {
                    int i3 = this.zzZNm;
                    if (i2 >= i3) {
                        break;
                    }
                    int i4 = this.zzZNJ.read(this.zzZNn, i2, i3 - i2);
                    if (i4 == -1) {
                        break;
                    }
                    i2 += i4;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (i2 < this.zzZNm) {
                this.status = 1;
            }
        }
        return i2;
    }

    private boolean zzek() {
        return this.status != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bb -> B:39:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzel() {
        int i;
        int i2;
        int i3 = this.zzZNu * this.zzZNt;
        byte[] bArr = this.zzZNU;
        if (bArr == null || bArr.length < i3) {
            this.zzZNU = new byte[i3];
        }
        if (this.zzZNj == null) {
            this.zzZNj = new short[4096];
        }
        if (this.zzZNi == null) {
            this.zzZNi = new byte[4096];
        }
        if (this.zzZNh == null) {
            this.zzZNh = new byte[EditingLanguage.ARABIC_LIBYA];
        }
        int i4 = read();
        int i5 = 1 << i4;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = i4 + 1;
        int i9 = (1 << i8) - 1;
        for (int i10 = 0; i10 < i5; i10++) {
            this.zzZNj[i10] = 0;
            this.zzZNi[i10] = (byte) i10;
        }
        int i11 = i8;
        int i12 = i7;
        int i13 = i9;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int iZzej = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = -1;
        while (i15 < i3) {
            if (i16 != 0) {
                i = i8;
            } else if (i17 < i11) {
                if (iZzej == 0) {
                    iZzej = zzej();
                    if (iZzej <= 0) {
                        break;
                    } else {
                        i19 = 0;
                    }
                }
                i18 += (this.zzZNn[i19] & 255) << i17;
                i17 += 8;
                i19++;
                iZzej--;
            } else {
                int i22 = i18 & i13;
                i18 >>= i11;
                i17 -= i11;
                if (i22 > i12 || i22 == i6) {
                    break;
                }
                if (i22 == i5) {
                    i11 = i8;
                    i12 = i7;
                    i13 = i9;
                    i21 = -1;
                } else {
                    i = i8;
                    if (i21 == -1) {
                        this.zzZNh[i16] = this.zzZNi[i22];
                        i16++;
                        i14 = i22;
                        i21 = i14;
                        i8 = i;
                    } else if (i22 == i12) {
                        int i23 = i16 + 1;
                        this.zzZNh[i16] = (byte) i14;
                        int i24 = i21;
                        i16 = i23;
                        i2 = i24;
                        if (i2 > i5) {
                            i23 = i16 + 1;
                            int i25 = i2;
                            this.zzZNh[i16] = this.zzZNi[i25 == true ? 1 : 0];
                            i24 = this.zzZNj[i25 == true ? 1 : 0];
                            i16 = i23;
                            i2 = i24;
                            if (i2 > i5) {
                                int i26 = i2;
                                byte[] bArr2 = this.zzZNi;
                                i14 = bArr2[i26 == true ? 1 : 0] & 255;
                                if (i12 >= 4096) {
                                    break;
                                }
                                int i27 = i16 + 1;
                                byte b = (byte) i14;
                                this.zzZNh[i16] = b;
                                this.zzZNj[i12] = (short) i21;
                                bArr2[i12] = b;
                                i12++;
                                if ((i12 & i13) == 0 && i12 < 4096) {
                                    i11++;
                                    i13 += i12;
                                }
                                i21 = i22;
                                i16 = i27;
                            }
                        }
                    } else {
                        i2 = i22;
                        if (i2 > i5) {
                        }
                    }
                }
            }
            i16--;
            this.zzZNU[i20] = this.zzZNh[i16];
            i15++;
            i20++;
            i8 = i;
        }
        for (int i28 = i20; i28 < i3; i28++) {
            this.zzZNU[i28] = 0;
        }
    }

    private void zzem() {
        int i;
        int[] iArr = new int[this.width * this.height];
        int i2 = this.zzZNl;
        int i3 = 0;
        if (i2 > 0) {
            if (i2 == 3) {
                int i4 = this.zzZNf;
                if (i4 - 2 > 0) {
                    this.zzZNo = zzQi(i4 - 3);
                } else {
                    this.zzZNo = null;
                }
            }
            Bitmap bitmap = this.zzZNo;
            if (bitmap != null) {
                int i5 = this.width;
                bitmap.getPixels(iArr, 0, i5, 0, 0, i5, this.height);
                if (this.zzZNl == 2) {
                    int i6 = !this.zzZNk ? this.zzZNB : 0;
                    for (int i7 = 0; i7 < this.zzZNp; i7++) {
                        int i8 = ((this.zzZNr + i7) * this.width) + this.zzZNs;
                        int i9 = this.zzZNq + i8;
                        while (i8 < i9) {
                            iArr[i8] = i6;
                            i8++;
                        }
                    }
                }
            }
        }
        int i10 = 8;
        int i11 = 1;
        int i12 = 0;
        while (true) {
            int i13 = this.zzZNt;
            if (i3 >= i13) {
                this.zzZNV = Bitmap.createBitmap(iArr, this.width, this.height, Bitmap.Config.ARGB_4444);
                return;
            }
            if (this.zzZNy) {
                if (i12 >= i13) {
                    i11++;
                    if (i11 == 2) {
                        i12 = 4;
                    } else if (i11 == 3) {
                        i10 = 4;
                        i12 = 2;
                    } else if (i11 == 4) {
                        i12 = 1;
                        i10 = 2;
                    }
                }
                i = i12 + i10;
            } else {
                i = i12;
                i12 = i3;
            }
            int i14 = i12 + this.zzZNv;
            if (i14 < this.height) {
                int i15 = this.width;
                int i16 = i14 * i15;
                int i17 = this.zzZNw + i16;
                int i18 = this.zzZNu;
                int i19 = i17 + i18;
                if (i16 + i15 < i19) {
                    i19 = i16 + i15;
                }
                int i20 = i18 * i3;
                while (i17 < i19) {
                    int i21 = i20 + 1;
                    int i22 = this.zzZND[this.zzZNU[i20] & 255];
                    if (i22 != 0) {
                        iArr[i17] = i22;
                    }
                    i17++;
                    i20 = i21;
                }
            }
            i3++;
            i12 = i;
        }
    }

    private void zzfo() {
        do {
            zzej();
            if (this.zzZNm <= 0) {
                return;
            }
        } while (!zzek());
    }

    private void zzra() {
        this.status = 0;
        this.zzZNf = 0;
        this.zzZNg = new ArrayList();
        this.zzZNF = null;
        this.zzZNE = null;
    }

    public final Bitmap zzQi(int i) {
        int i2 = this.zzZNf;
        if (i2 <= 0) {
            return null;
        }
        return this.zzZNg.get(i % i2).zzZNV;
    }

    public final int zzV(InputStream inputStream) {
        zzra();
        this.zzZNJ = inputStream;
        zzLh();
        if (!zzek()) {
            zzei();
            if (this.zzZNf < 0) {
                this.status = 1;
            }
        }
        return this.status;
    }
}
