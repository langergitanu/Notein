package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public class zzXE {
    private static byte zzVd;
    private static byte[] zzVe = new byte[0];
    private int zzVf;
    private byte[] zzVg;

    public zzXE() {
        this.zzVg = zzVe;
    }

    private void ensureCapacity(int i) {
        byte[] bArr = this.zzVg;
        if (bArr.length >= i) {
            return;
        }
        int length = bArr.length == 0 ? 4 : bArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzH(int i) {
        if (i == this.zzVg.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzVg = zzVe;
            return;
        }
        byte[] bArr = new byte[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzVg, 0, bArr, 0, i2);
        }
        this.zzVg = bArr;
    }

    private void zzK(int i, int i2) {
        zzZ4.zzY(i, FirebaseAnalytics.Param.INDEX);
        zzZ4.zzY(i2, C18293o1.f55803f);
        if (i + i2 > this.zzVf) {
            throw new IllegalArgumentException("The given index or/and count specify an invalid offset length.");
        }
    }

    private int zzZ(byte b, int i, int i2) {
        zzK(i, i2);
        return zzZKV.zzZ(this.zzVg, b, i, i2);
    }

    private void zzZO(int i) {
        zzK(0, i);
        zzZKV.zzP(this.zzVg, 0, i);
    }

    private void zzZP(int i) {
        zzZ4.zzZ(i, 0, this.zzVf, FirebaseAnalytics.Param.INDEX);
    }

    private void zzZQ(int i) {
        zzZ4.zzZ(i, 0, this.zzVf - 1, FirebaseAnalytics.Param.INDEX);
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXE.class) {
            return false;
        }
        return zzZ((zzXE) obj);
    }

    public final byte get(int i) {
        zzZQ(i);
        return this.zzVg[i];
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int i = 0;
        for (byte b : this.zzVg) {
            i = (i * 397) ^ b;
        }
        return i;
    }

    public final void removeAt(int i) {
        zzZQ(i);
        int i2 = this.zzVf - 1;
        this.zzVf = i2;
        if (i < i2) {
            byte[] bArr = this.zzVg;
            zzZKV.zzZ(bArr, i + 1, bArr, i, i2 - i);
        }
        this.zzVg[this.zzVf] = zzVd;
    }

    public final void reverse() {
        zzZO(this.zzVf);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            sb.append((int) this.zzVg[i]);
        }
        return sb.toString();
    }

    public final void zzR(byte[] bArr) {
        zzZ(this.zzVf, bArr);
    }

    public final void zzV(byte[] bArr, int i) {
        zzK(2, i);
        zzZKV.zzZ(this.zzVg, 2, bArr, 0, i);
    }

    public final void zzW(byte b) {
        zzZQ(0);
        this.zzVg[0] = b;
    }

    public final byte[] zzWy() {
        int i = this.zzVf;
        byte[] bArr = new byte[i];
        zzZKV.zzZ(this.zzVg, 0, bArr, 0, i);
        return bArr;
    }

    public final void zzX(byte b) {
        ensureCapacity(this.zzVf + 1);
        byte[] bArr = this.zzVg;
        int i = this.zzVf;
        this.zzVf = i + 1;
        bArr[i] = b;
    }

    public final int zzY(byte b, int i) {
        return zzZ(b, i, this.zzVf - i);
    }

    private void zzY(int i, byte[] bArr, int i2) {
        zzZP(i);
        if (i2 == 0) {
            return;
        }
        ensureCapacity(this.zzVf + i2);
        int i3 = this.zzVf;
        if (i < i3) {
            byte[] bArr2 = this.zzVg;
            zzZKV.zzZ(bArr2, i, bArr2, i + i2, i3 - i);
        }
        byte[] bArr3 = this.zzVg;
        if (bArr3 == bArr) {
            zzZKV.zzZ(bArr3, 0, bArr3, i, i);
            byte[] bArr4 = this.zzVg;
            zzZKV.zzZ(bArr4, i + i2, bArr4, i * 2, this.zzVf - i);
        } else {
            zzZKV.zzZ(bArr, 0, bArr3, i, i2);
        }
        this.zzVf += i2;
    }

    public zzXE(int i) {
        zzZ4.zzY(i, "capacity");
        this.zzVg = new byte[i];
    }

    public final void zzZ(int i, byte[] bArr) {
        zzZ4.zzY((Object) bArr, "array");
        zzY(i, bArr, bArr.length);
    }

    private boolean zzZ(zzXE zzxe) {
        if (zzZKO.zzA(null, zzxe)) {
            return false;
        }
        if (zzZKO.zzA(this, zzxe)) {
            return true;
        }
        if (this.zzVf != zzxe.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (get(i) != zzxe.get(i)) {
                return false;
            }
        }
        return true;
    }

    public zzXE(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private zzXE(byte[] bArr, byte b) {
        zzZ4.zzY((Object) bArr, "array");
        int length = bArr.length;
        this.zzVf = length;
        byte[] bArr2 = new byte[length];
        this.zzVg = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
