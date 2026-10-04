package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzG1 extends zz80 implements Cloneable {
    private String zzZeR;
    private zzFZ[] zzZeS;
    private zzBW[] zzZeT;
    private String zzZh;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getId() {
        return this.zzZh;
    }

    public final String getMethod() {
        return this.zzZeR;
    }

    public final void setId(String str) {
        this.zzZh = str;
    }

    public final void zzRA(String str) {
        this.zzZeR = str;
    }

    public final void zzZ(zzBW[] zzbwArr) {
        this.zzZeT = zzbwArr;
    }

    public final zzFZ[] zzZNZ() {
        return this.zzZeS;
    }

    public final zzBW[] zzZO0() {
        return this.zzZeT;
    }

    public final zzG1 zzZO1() {
        zzG1 zzg1 = (zzG1) memberwiseClone();
        zzBW[] zzbwArr = this.zzZeT;
        int i = 0;
        if (zzbwArr != null) {
            zzg1.zzZeT = new zzBW[zzbwArr.length];
            int i2 = 0;
            while (true) {
                zzBW[] zzbwArr2 = this.zzZeT;
                if (i2 >= zzbwArr2.length) {
                    break;
                }
                zzg1.zzZeT[i2] = zzbwArr2[i2].zzZHt();
                i2++;
            }
        }
        zzFZ[] zzfzArr = this.zzZeS;
        if (zzfzArr != null) {
            zzg1.zzZeS = new zzFZ[zzfzArr.length];
            while (true) {
                zzFZ[] zzfzArr2 = this.zzZeS;
                if (i >= zzfzArr2.length) {
                    break;
                }
                zzg1.zzZeS[i] = zzfzArr2[i].zzZNY();
                i++;
            }
        }
        zzg1.setExtensions(zzZBz());
        return zzg1;
    }

    public final void zzZ(zzFZ[] zzfzArr) {
        this.zzZeS = zzfzArr;
    }
}
