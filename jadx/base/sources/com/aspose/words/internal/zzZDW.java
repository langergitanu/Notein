package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDW {
    private int zzVf;
    private String[] zzWN5;

    public zzZDW(int i) {
        this.zzWN5 = new String[i];
    }

    public final String getString(int i) {
        if (i >= 0 && i < this.zzVf) {
            return this.zzWN5[i];
        }
        throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(".", this.zzVf, OooO0O0.OooO0o.OooO0OO(i, "Index ", " out of valid range; current size: ")));
    }

    public final boolean isEmpty() {
        return this.zzVf == 0;
    }

    public final int size() {
        return this.zzVf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.zzVf * 16);
        sb.append("[(size = ");
        sb.append(this.zzVf);
        sb.append(" ) ");
        for (int i = 0; i < this.zzVf; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append('\"');
            sb.append(this.zzWN5[i]);
            sb.append("\" == ");
            sb.append(Integer.toHexString(System.identityHashCode(this.zzWN5[i])));
        }
        sb.append(']');
        return sb.toString();
    }

    public final void zzB1(String str) {
        int i = this.zzVf;
        String[] strArr = this.zzWN5;
        if (i == strArr.length) {
            int length = strArr.length;
            String[] strArr2 = new String[(length << 1) + length];
            this.zzWN5 = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, length);
        }
        String[] strArr3 = this.zzWN5;
        int i2 = this.zzVf;
        this.zzVf = i2 + 1;
        strArr3[i2] = str;
    }

    public final String zzXLA() {
        int i = this.zzVf;
        if (i > 0) {
            return this.zzWN5[i - 1];
        }
        throw new IllegalStateException("getLastString() called on empty StringVector.");
    }

    public final String zzXLy() {
        String[] strArr = this.zzWN5;
        int i = this.zzVf - 1;
        this.zzVf = i;
        String str = strArr[i];
        strArr[i] = null;
        return str;
    }

    public final String[] zzXLz() {
        return this.zzWN5;
    }

    public final void zzXt(String str, String str2) {
        int i = this.zzVf + 2;
        String[] strArr = this.zzWN5;
        if (i > strArr.length) {
            int length = strArr.length;
            String[] strArr2 = new String[(length << 1) + length];
            this.zzWN5 = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, length);
        }
        String[] strArr3 = this.zzWN5;
        int i2 = this.zzVf;
        strArr3[i2] = str;
        strArr3[i2 + 1] = str2;
        this.zzVf = i2 + 2;
    }

    public final void zzgg(int i) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            String[] strArr = this.zzWN5;
            int i2 = this.zzVf - 1;
            this.zzVf = i2;
            strArr[i2] = null;
        }
    }

    public final String zzwW(String str) {
        int i = this.zzVf;
        while (true) {
            int i2 = i - 2;
            if (i2 < 0) {
                return null;
            }
            String str2 = this.zzWN5[i2];
            if (str2 == str || (str2 != null && str2.equals(str))) {
                break;
            }
            i = i2;
        }
        return this.zzWN5[i - 1];
    }

    public final String zzwX(String str) {
        int i = this.zzVf;
        while (true) {
            int i2 = i - 2;
            if (i2 < 0) {
                return null;
            }
            String[] strArr = this.zzWN5;
            if (strArr[i2] == str) {
                return strArr[i - 1];
            }
            i = i2;
        }
    }
}
