package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTX implements zzYUR {
    private byte[] buf;
    private byte[] zzVZc;
    private byte[] zzVZd;
    private byte[] zzVZe;
    private byte[] zzVZf;
    private zzYV8 zzW67;
    private byte[] zzW6l;
    private int zzW6m;
    private int zzW6n;

    public zzYTX(zzYV8 zzyv8) {
        this(zzyv8, zzyv8.getBlockSize() * 8);
    }

    private static void zzW(zzYV3 zzyv3) {
        if (zzyv3 != null && !(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    private byte[] zzWd(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = (-zzy(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b = bArr2[length];
        byte[] bArr3 = this.zzVZf;
        bArr2[length] = (byte) (b ^ (bArr3[1] & i));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] zzf3(int i) {
        int i2 = i * 8;
        int i3 = 135;
        switch (i2) {
            case 64:
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6 /* 320 */:
                i3 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i3 = 45;
                break;
            case 224:
                i3 = 777;
                break;
            case 256:
                i3 = EditingLanguage.ESTONIAN;
                break;
            case 384:
                i3 = 4109;
                break;
            case 448:
                i3 = EditingLanguage.TIBETAN_BUTAN;
                break;
            case 512:
                i3 = StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2;
                break;
            case ViewUtils.EDGE_TO_EDGE_FLAGS /* 768 */:
                i3 = 655377;
                break;
            case 1024:
                i3 = 524355;
                break;
            case 2048:
                i3 = 548865;
                break;
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Unknown block size for CMAC: "));
        }
        return zzYGN.zzeB(i3);
    }

    private static int zzy(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int i2 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i2 << 1));
            i = (i2 >>> 7) & 1;
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.zzW6m == this.zzW67.getBlockSize()) {
            bArr2 = this.zzVZd;
        } else {
            new zzYT8().zzZV(this.buf, this.zzW6m);
            bArr2 = this.zzVZc;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.zzW6l;
            if (i2 >= bArr3.length) {
                this.zzW67.zzY(this.buf, 0, bArr3, 0);
                System.arraycopy(this.zzW6l, 0, bArr, 0, this.zzW6n);
                reset();
                return this.zzW6n;
            }
            byte[] bArr4 = this.buf;
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr2[i2]);
            i2++;
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.zzW6m = 0;
                this.zzW67.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) {
        int i = this.zzW6m;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            this.zzW67.zzY(bArr, 0, this.zzW6l, 0);
            this.zzW6m = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.zzW6m;
        this.zzW6m = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return this.zzW67.zzXGi();
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) {
        zzW(zzyv3);
        this.zzW67.zzZ(true, zzyv3);
        byte[] bArr = this.zzVZe;
        byte[] bArr2 = new byte[bArr.length];
        this.zzW67.zzY(bArr, 0, bArr2, 0);
        byte[] bArrZzWd = zzWd(bArr2);
        this.zzVZd = bArrZzWd;
        this.zzVZc = zzWd(bArrZzWd);
        reset();
    }

    public zzYTX(zzYV8 zzyv8, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > zzyv8.getBlockSize() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (zzyv8.getBlockSize() * 8));
        }
        this.zzW67 = new zzYTR(zzyv8);
        this.zzW6n = i / 8;
        this.zzVZf = zzf3(zzyv8.getBlockSize());
        this.zzW6l = new byte[zzyv8.getBlockSize()];
        this.buf = new byte[zzyv8.getBlockSize()];
        this.zzVZe = new byte[zzyv8.getBlockSize()];
        this.zzW6m = 0;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int blockSize = this.zzW67.getBlockSize();
            int i3 = this.zzW6m;
            int i4 = blockSize - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.buf, i3, i4);
                this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
                this.zzW6m = 0;
                i2 -= i4;
                i += i4;
                while (i2 > blockSize) {
                    this.zzW67.zzY(bArr, i, this.zzW6l, 0);
                    i2 -= blockSize;
                    i += blockSize;
                }
            }
            System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
            this.zzW6m += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
