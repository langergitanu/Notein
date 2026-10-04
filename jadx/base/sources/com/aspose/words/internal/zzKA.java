package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class zzKA {
    private static float[] zzGs = new float[0];
    private float[] zzBJ;
    private int zzVf;

    public zzKA() {
        this.zzBJ = zzGs;
    }

    private void ensureCapacity(int i) {
        float[] fArr = this.zzBJ;
        if (fArr.length >= i) {
            return;
        }
        int length = fArr.length == 0 ? 4 : fArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzH(int i) {
        if (i == this.zzBJ.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzBJ = zzGs;
            return;
        }
        float[] fArr = new float[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzBJ, 0, fArr, 0, i2);
        }
        this.zzBJ = fArr;
    }

    public static zzKA zzIc() {
        return new zzKA((byte) 0);
    }

    private boolean zzZ(zzKA zzka) {
        if (zzZKO.zzA(null, zzka)) {
            return false;
        }
        if (zzZKO.zzA(this, zzka)) {
            return true;
        }
        if (this.zzVf != zzka.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (get(i) != zzka.get(i)) {
                return false;
            }
        }
        return true;
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
        if (obj.getClass() != zzKA.class) {
            return false;
        }
        return zzZ((zzKA) obj);
    }

    public final float get(int i) {
        zzZQ(i);
        return this.zzBJ[i];
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int iFloatToIntBits = 0;
        for (float f : this.zzBJ) {
            iFloatToIntBits = (iFloatToIntBits * 397) ^ Float.floatToIntBits(f);
        }
        return iFloatToIntBits;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            sb.append(this.zzBJ[i]);
        }
        return sb.toString();
    }

    public final float[] zzIb() {
        int i = this.zzVf;
        float[] fArr = new float[i];
        zzZKV.zzZ(this.zzBJ, 0, fArr, 0, i);
        return fArr;
    }

    public final void zzY(int i, float f) {
        zzZP(i);
        ensureCapacity(this.zzVf + 1);
        int i2 = this.zzVf;
        if (i < i2) {
            float[] fArr = this.zzBJ;
            zzZKV.zzZ(fArr, i, fArr, i + 1, i2 - i);
        }
        this.zzBJ[i] = f;
        this.zzVf++;
    }

    public final void zzu(float f) {
        ensureCapacity(this.zzVf + 1);
        float[] fArr = this.zzBJ;
        int i = this.zzVf;
        this.zzVf = i + 1;
        fArr[i] = f;
    }

    private zzKA(byte b) {
        zzZ4.zzY(16, "capacity");
        this.zzBJ = new float[16];
    }
}
