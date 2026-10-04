package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTV implements zzYUR {
    private static Hashtable zzVZ4;
    private byte[] zzVZ5;
    private byte[] zzVZ6;
    private zzYGP zzVZ7;
    private zzYGP zzVZ8;
    private int zzVZ9;
    private int zzVZa;
    private zzYUX zzWkt;

    static {
        Hashtable hashtable = new Hashtable();
        zzVZ4 = hashtable;
        hashtable.put("GOST3411", 32);
        zzVZ4.put("MD2", 16);
        zzVZ4.put("MD4", 64);
        zzVZ4.put("MD5", 64);
        zzVZ4.put("RIPEMD128", 64);
        zzVZ4.put("RIPEMD160", 64);
        zzVZ4.put(IDevicePopManager.SHA_1, 64);
        zzVZ4.put("SHA-224", 64);
        zzVZ4.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, 64);
        zzVZ4.put("SHA-384", 128);
        zzVZ4.put("SHA-512", 128);
        zzVZ4.put("Tiger", 64);
        zzVZ4.put("Whirlpool", 64);
    }

    public zzYTV(zzYUX zzyux) {
        this(zzyux, zzW(zzyux));
    }

    private static int zzW(zzYUX zzyux) {
        if (zzyux instanceof zzYUU) {
            return ((zzYUU) zzyux).zzXE6();
        }
        Integer num = (Integer) zzVZ4.get(zzyux.zzXGi());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + zzyux.zzXGi());
    }

    private static void zzY(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) {
        this.zzWkt.doFinal(this.zzVZ5, this.zzVZ9);
        zzYGP zzygp = this.zzVZ7;
        if (zzygp != null) {
            ((zzYGP) this.zzWkt).zzZ(zzygp);
            zzYUX zzyux = this.zzWkt;
            zzyux.update(this.zzVZ5, this.zzVZ9, zzyux.zzQI());
        } else {
            zzYUX zzyux2 = this.zzWkt;
            byte[] bArr2 = this.zzVZ5;
            zzyux2.update(bArr2, 0, bArr2.length);
        }
        int iDoFinal = this.zzWkt.doFinal(bArr, 0);
        int i2 = this.zzVZ9;
        while (true) {
            byte[] bArr3 = this.zzVZ5;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        zzYGP zzygp2 = this.zzVZ8;
        if (zzygp2 != null) {
            ((zzYGP) this.zzWkt).zzZ(zzygp2);
            return iDoFinal;
        }
        zzYUX zzyux3 = this.zzWkt;
        byte[] bArr4 = this.zzVZ6;
        zzyux3.update(bArr4, 0, bArr4.length);
        return iDoFinal;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        this.zzWkt.reset();
        zzYUX zzyux = this.zzWkt;
        byte[] bArr = this.zzVZ6;
        zzyux.update(bArr, 0, bArr.length);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) {
        this.zzWkt.update(b);
    }

    public final zzYUX zzXCH() {
        return this.zzWkt;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzVZa;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return this.zzWkt.zzXGi() + "/HMAC";
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) {
        byte[] bArr;
        this.zzWkt.reset();
        byte[] key = ((zzYS8) zzyv3).getKey();
        int length = key.length;
        if (length > this.zzVZ9) {
            this.zzWkt.update(key, 0, length);
            this.zzWkt.doFinal(this.zzVZ6, 0);
            length = this.zzVZa;
        } else {
            System.arraycopy(key, 0, this.zzVZ6, 0, length);
        }
        while (true) {
            bArr = this.zzVZ6;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.zzVZ5, 0, this.zzVZ9);
        zzY(this.zzVZ6, this.zzVZ9, PatternStyle.DiagonalCross);
        zzY(this.zzVZ5, this.zzVZ9, (byte) 92);
        zzYUX zzyux = this.zzWkt;
        if (zzyux instanceof zzYGP) {
            zzYGP zzygpZzXE2 = ((zzYGP) zzyux).zzXE2();
            this.zzVZ7 = zzygpZzXE2;
            ((zzYUX) zzygpZzXE2).update(this.zzVZ5, 0, this.zzVZ9);
        }
        zzYUX zzyux2 = this.zzWkt;
        byte[] bArr2 = this.zzVZ6;
        zzyux2.update(bArr2, 0, bArr2.length);
        zzYUX zzyux3 = this.zzWkt;
        if (zzyux3 instanceof zzYGP) {
            this.zzVZ8 = ((zzYGP) zzyux3).zzXE2();
        }
    }

    private zzYTV(zzYUX zzyux, int i) {
        this.zzWkt = zzyux;
        int iZzQI = zzyux.zzQI();
        this.zzVZa = iZzQI;
        this.zzVZ9 = i;
        this.zzVZ6 = new byte[i];
        this.zzVZ5 = new byte[i + iZzQI];
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) {
        this.zzWkt.update(bArr, i, i2);
    }
}
