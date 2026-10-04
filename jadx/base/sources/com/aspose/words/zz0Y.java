package com.aspose.words;

import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zz0Y implements Cloneable {
    private String zzYXW;
    private String zzYXX;
    private String zzYXY;
    private String zzYXZ;

    public zz0Y(String str, String str2, String str3, String str4) {
        this.zzYXZ = str;
        this.zzYXY = str2;
        this.zzYXX = str3;
        this.zzYXW = str4;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static float zzZ(String str, zz6U zz6u) {
        double dZzR = zzYU4.zzR(str, null);
        return !Double.isNaN(dZzR) ? (float) dZzR : (float) zz6u.zzOy(str);
    }

    public final String zzZtm() {
        return this.zzYXW;
    }

    public final String zzZtn() {
        return this.zzYXX;
    }

    public final String zzZto() {
        return this.zzYXY;
    }

    public final String zzZtp() {
        return this.zzYXZ;
    }

    public final zz0Y zzZtq() {
        return (zz0Y) memberwiseClone();
    }

    public final com.aspose.words.internal.zzZQ4 zzZ(zz6U zz6u, boolean z) {
        try {
            com.aspose.words.internal.zzZQ4 zzzq4ZzX = com.aspose.words.internal.zzZQ4.zzX(zzZ(this.zzYXZ, zz6u), zzZ(this.zzYXY, zz6u), zzZ(this.zzYXX, zz6u), zzZ(this.zzYXW, zz6u));
            if (!z) {
                return zzzq4ZzX;
            }
            return new com.aspose.words.internal.zzZQ4(zzzq4ZzX.getX(), zzzq4ZzX.getHeight(), zzzq4ZzX.getWidth(), zzZ(C18773h.f57233c, zz6u) - zzzq4ZzX.getHeight());
        } catch (Exception unused) {
            return com.aspose.words.internal.zzZQ4.zz2T;
        }
    }
}
