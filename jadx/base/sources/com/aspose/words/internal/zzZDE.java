package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDE extends FilterInputStream {
    private final int limit;
    private final byte[][] zzWIs;
    private final boolean zzWIt;

    public zzZDE(InputStream inputStream) {
        this(inputStream, zzZBC.zzR(inputStream));
    }

    private zzZDJ zzXKO() throws IOException {
        zzZDJ zzzdj = new zzZDJ();
        while (true) {
            zzZD5 zzzd5ZzXKN = zzXKN();
            if (zzzd5ZzXKN == null) {
                return zzzdj;
            }
            zzzdj.zzZ(zzzd5ZzXKN);
        }
    }

    private int zzXKP() throws IOException {
        return zzY(this, this.limit);
    }

    public static int zzY(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 <= 127) {
            return i2;
        }
        int i3 = i2 & 127;
        if (i3 > 4) {
            throw new IOException(C21532OooOOo.OooO0OO(i3, "DER length more than 4 bytes: "));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i4 = (i4 << 8) + i6;
        }
        if (i4 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i4 < i) {
            return i4;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    private static zzZDJ zzZ(zzZBJ zzzbj) throws IOException {
        return new zzZDE(zzzbj).zzXKO();
    }

    private zzZD5 zzZQ(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        zzZBJ zzzbj = new zzZBJ(this, i3);
        if ((i & 64) != 0) {
            return new zzZBR(z, i2, zzzbj.toByteArray());
        }
        if ((i & 128) != 0) {
            return new zzZD0(zzzbj).zzO(z, i2);
        }
        if (!z) {
            return zzZ(i2, zzzbj, this.zzWIs);
        }
        if (i2 != 4) {
            if (i2 == 8) {
                return new zzZBP(zzZ(zzzbj));
            }
            if (i2 == 16) {
                return this.zzWIt ? new zzZBF(zzzbj.toByteArray()) : zzZCD.zzX(zzZ(zzzbj));
            }
            if (i2 == 17) {
                return zzZCD.zzW(zzZ(zzzbj));
            }
            throw new IOException(o0Oo0oo.OooO0O0(i2, "unknown tag ", " encountered"));
        }
        zzZDJ zzzdjZzZ = zzZ(zzzbj);
        int size = zzzdjZzZ.size();
        zzZD9[] zzzd9Arr = new zzZD9[size];
        for (int i4 = 0; i4 != size; i4++) {
            zzzd9Arr[i4] = (zzZD9) zzzdjZzZ.zzg8(i4);
        }
        return new zzZCS(zzzd9Arr);
    }

    public final int getLimit() {
        return this.limit;
    }

    public final zzZD5 zzXKN() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iZzZ = zzZ(this, i);
        boolean z = (i & 32) != 0;
        int iZzXKP = zzXKP();
        if (iZzXKP >= 0) {
            try {
                return zzZQ(i, iZzZ, iZzXKP);
            } catch (IllegalArgumentException e) {
                throw new zzZDH("corrupted stream detected", e);
            }
        }
        if (!z) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        zzZD0 zzzd0 = new zzZD0(new zzZBH(this, this.limit), this.limit);
        if ((i & 64) != 0) {
            return new zzZCU(iZzZ, zzzd0).zzXKI();
        }
        if ((i & 128) != 0) {
            return new zzZCK(true, iZzZ, zzzd0).zzXKI();
        }
        if (iZzZ == 4) {
            return new zzZCR(zzzd0).zzXKI();
        }
        if (iZzZ == 8) {
            return new zzZCE(zzzd0).zzXKI();
        }
        if (iZzZ == 16) {
            return new zzZCO(zzzd0).zzXKI();
        }
        if (iZzZ == 17) {
            return new zzZCM(zzzd0).zzXKI();
        }
        throw new IOException("unknown BER object encountered");
    }

    public zzZDE(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public static int zzZ(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if ((i3 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i4 = 0;
        while (i3 >= 0 && (i3 & 128) != 0) {
            i4 = ((i3 & 127) | i4) << 7;
            i3 = inputStream.read();
        }
        if (i3 >= 0) {
            return (i3 & 127) | i4;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public zzZDE(byte[] bArr, byte b) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    private zzZDE(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    private zzZDE(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.limit = i;
        this.zzWIt = z;
        this.zzWIs = new byte[11][];
    }

    private static byte[] zzZ(zzZBJ zzzbj, byte[][] bArr) throws IOException {
        int remaining = zzzbj.getRemaining();
        if (zzzbj.getRemaining() < bArr.length) {
            byte[] bArr2 = bArr[remaining];
            if (bArr2 == null) {
                bArr2 = new byte[remaining];
                bArr[remaining] = bArr2;
            }
            zzYG9.zzZ(zzzbj, bArr2);
            return bArr2;
        }
        return zzzbj.toByteArray();
    }

    public static zzZD5 zzZ(int i, zzZBJ zzzbj, byte[][] bArr) throws IOException {
        if (i == 10) {
            return zzZDI.zzXq(zzZ(zzzbj, bArr));
        }
        if (i == 12) {
            return new zzZBV(zzzbj.toByteArray());
        }
        if (i != 30) {
            switch (i) {
                case 1:
                    return zzZDM.zzXr(zzZ(zzzbj, bArr));
                case 2:
                    return new zzZDD(zzzbj.toByteArray(), false);
                case 3:
                    return zzZDN.zzZ(zzzbj.getRemaining(), zzzbj);
                case 4:
                    return new zzZC6(zzzbj.toByteArray());
                case 5:
                    return zzZC8.zzWHS;
                case 6:
                    return zzZDA.zzXp(zzZ(zzzbj, bArr));
                default:
                    switch (i) {
                        case 18:
                            return new zzZC7(zzzbj.toByteArray());
                        case 19:
                            return new zzZC3(zzzbj.toByteArray());
                        case 20:
                            return new zzZBY(zzzbj.toByteArray());
                        case 21:
                            return new zzZBT(zzzbj.toByteArray());
                        case 22:
                            return new zzZC9(zzzbj.toByteArray());
                        case 23:
                            return new zzZCW(zzzbj.toByteArray());
                        case 24:
                            return new zzZDF(zzzbj.toByteArray());
                        case 25:
                            return new zzZCA(zzzbj.toByteArray());
                        case 26:
                            return new zzZBS(zzzbj.toByteArray());
                        case 27:
                            return new zzZCC(zzzbj.toByteArray());
                        case 28:
                            return new zzZBU(zzzbj.toByteArray());
                        default:
                            throw new IOException(o0Oo0oo.OooO0O0(i, "unknown tag ", " encountered"));
                    }
            }
        }
        return new zzZCH(zzY(zzzbj));
    }

    private static char[] zzY(zzZBJ zzzbj) throws IOException {
        int i;
        int remaining = zzzbj.getRemaining() / 2;
        char[] cArr = new char[remaining];
        for (int i2 = 0; i2 < remaining; i2++) {
            int i3 = zzzbj.read();
            if (i3 < 0 || (i = zzzbj.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }
}
