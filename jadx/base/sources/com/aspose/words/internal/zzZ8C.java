package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8C extends zzZDB implements zzZDL {
    private static zzZ8B zzWsv = zzZ89.zzWrP;
    private zzZ8D[] zzWsr;
    private zzZ8B zzWss;
    private int zzWst;
    private boolean zzWsu;

    private zzZ8C(zzZ8B zzz8b, zzZ8C zzz8c) {
        this.zzWsr = zzz8c.zzWsr;
        this.zzWss = zzz8b;
    }

    public static zzZ8C zzU(zzZCY zzzcy) {
        return zzXn(zzZD4.zzX(zzzcy, true));
    }

    public static zzZ8C zzXn(Object obj) {
        if (obj instanceof zzZ8C) {
            return (zzZ8C) obj;
        }
        if (obj != null) {
            return new zzZ8C(zzZD4.zzYy(obj));
        }
        return null;
    }

    public static zzZ8C zzZ(zzZ8B zzz8b, Object obj) {
        if (obj instanceof zzZ8C) {
            return new zzZ8C(zzz8b, (zzZ8C) obj);
        }
        if (obj != null) {
            return new zzZ8C(zzz8b, zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzZ8C) && !(obj instanceof zzZD4)) {
            return false;
        }
        if (zzXL0().equals(((zzZDK) obj).zzXL0())) {
            return true;
        }
        try {
            return this.zzWss.zzZ(this, new zzZ8C(zzZD4.zzYy(((zzZDK) obj).zzXL0())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.aspose.words.internal.zzZDB
    public final int hashCode() {
        if (this.zzWsu) {
            return this.zzWst;
        }
        this.zzWsu = true;
        int iZzY = this.zzWss.zzY(this);
        this.zzWst = iZzY;
        return iZzY;
    }

    public final String toString() {
        return this.zzWss.zzX(this);
    }

    public final zzZ8D[] zzS(zzZDA zzzda) {
        int i;
        zzZ8D[] zzz8dArr = new zzZ8D[this.zzWsr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzZ8D[] zzz8dArr2 = this.zzWsr;
            if (i2 == zzz8dArr2.length) {
                zzZ8D[] zzz8dArr3 = new zzZ8D[i3];
                System.arraycopy(zzz8dArr, 0, zzz8dArr3, 0, i3);
                return zzz8dArr3;
            }
            zzZ8D zzz8d = zzz8dArr2[i2];
            if (!zzz8d.zzXIr()) {
                if (zzz8d.zzXIq().zzXIt().equals(zzzda)) {
                    i = i3 + 1;
                    zzz8dArr[i3] = zzz8d;
                    i3 = i;
                    break;
                    break;
                }
            } else {
                zzZ8E[] zzz8eArrZzXIp = zzz8d.zzXIp();
                for (int i4 = 0; i4 != zzz8eArrZzXIp.length; i4++) {
                    if (zzz8eArrZzXIp[i4].zzXIt().equals(zzzda)) {
                        i = i3 + 1;
                        zzz8dArr[i3] = zzz8d;
                        i3 = i;
                        break;
                    }
                }
            }
            i2++;
        }
    }

    public final zzZ8D[] zzXIo() {
        zzZ8D[] zzz8dArr = this.zzWsr;
        int length = zzz8dArr.length;
        zzZ8D[] zzz8dArr2 = new zzZ8D[length];
        System.arraycopy(zzz8dArr, 0, zzz8dArr2, 0, length);
        return zzz8dArr2;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return new zzZC2(this.zzWsr);
    }

    private zzZ8C(zzZD4 zzzd4) {
        this(zzWsv, zzzd4);
    }

    private zzZ8C(zzZ8B zzz8b, zzZD4 zzzd4) {
        this.zzWss = zzz8b;
        this.zzWsr = new zzZ8D[zzzd4.size()];
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        int i = 0;
        while (enumerationZzXKE.hasMoreElements()) {
            this.zzWsr[i] = zzZ8D.zzXo(enumerationZzXKE.nextElement());
            i++;
        }
    }
}
