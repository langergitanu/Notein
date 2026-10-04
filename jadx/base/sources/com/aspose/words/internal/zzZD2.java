package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import com.aspose.words.internal.zzYGU;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZD2 extends zzZD5 implements zzYGQ {
    private boolean zzWIg;
    private Vector zzWIh;

    public zzZD2() {
        this.zzWIh = new Vector();
        this.zzWIg = false;
    }

    private void sort() {
        if (this.zzWIg) {
            return;
        }
        this.zzWIg = true;
        if (this.zzWIh.size() > 1) {
            int size = this.zzWIh.size() - 1;
            boolean z = true;
            while (z) {
                int i = 0;
                byte[] bArrZzX = zzX((zzZDK) this.zzWIh.elementAt(0));
                z = false;
                int i2 = 0;
                while (i2 != size) {
                    int i3 = i2 + 1;
                    byte[] bArrZzX2 = zzX((zzZDK) this.zzWIh.elementAt(i3));
                    if (zzQ(bArrZzX, bArrZzX2)) {
                        bArrZzX = bArrZzX2;
                    } else {
                        Object objElementAt = this.zzWIh.elementAt(i2);
                        Vector vector = this.zzWIh;
                        vector.setElementAt(vector.elementAt(i3), i2);
                        this.zzWIh.setElementAt(objElementAt, i3);
                        z = true;
                        i = i2;
                    }
                    i2 = i3;
                }
                size = i;
            }
        }
    }

    private static boolean zzQ(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != iMin; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return iMin == bArr.length;
    }

    public static zzZD2 zzW(zzZCY zzzcy, boolean z) {
        if (z) {
            if (zzzcy.zzWI9) {
                return (zzZD2) zzzcy.zzXKw();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        if (zzzcy.zzWI9) {
            return zzzcy instanceof zzZCL ? new zzZCN(zzzd5ZzXKw) : new zzZBM(zzzd5ZzXKw);
        }
        if (zzzd5ZzXKw instanceof zzZD2) {
            return (zzZD2) zzzd5ZzXKw;
        }
        if (!(zzzd5ZzXKw instanceof zzZD4)) {
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(zzzcy.getClass().getName()));
        }
        zzZD4 zzzd4 = (zzZD4) zzzd5ZzXKw;
        return zzzcy instanceof zzZCL ? new zzZCN(zzzd4.zzXKF()) : new zzZBM(zzzd4.zzXKF());
    }

    private static byte[] zzX(zzZDK zzzdk) {
        try {
            return zzzdk.zzXL0().getEncoded("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    private zzZDK[] zzXKF() {
        zzZDK[] zzzdkArr = new zzZDK[this.zzWIh.size()];
        for (int i = 0; i != this.zzWIh.size(); i++) {
            zzzdkArr[i] = zzg6(i);
        }
        return zzzdkArr;
    }

    public static zzZD2 zzYx(Object obj) {
        while (obj != null && !(obj instanceof zzZD2)) {
            if (!(obj instanceof zzZD1)) {
                if (obj instanceof byte[]) {
                    try {
                        return zzYx(zzZD5.zzXo((byte[]) obj));
                    } catch (IOException e) {
                        throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct set from byte[]: ")));
                    }
                }
                if (obj instanceof zzZDK) {
                    zzZD5 zzzd5ZzXL0 = ((zzZDK) obj).zzXL0();
                    if (zzzd5ZzXL0 instanceof zzZD2) {
                        return (zzZD2) zzzd5ZzXL0;
                    }
                }
                throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
            }
            obj = ((zzZD1) obj).zzXL0();
        }
        return (zzZD2) obj;
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        Enumeration enumerationElements = this.zzWIh.elements();
        int size = this.zzWIh.size();
        while (enumerationElements.hasMoreElements()) {
            size = (size * 17) ^ zzZ(enumerationElements).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<zzZDK> iterator() {
        return new zzYGU.zzZ(zzXKF());
    }

    public final int size() {
        return this.zzWIh.size();
    }

    public String toString() {
        return this.zzWIh.toString();
    }

    public final zzZD1 zzXKB() {
        return new zzZD1() { // from class: com.aspose.words.internal.zzZD2.1
            private final int max;

            {
                this.max = zzZD2.this.size();
            }

            @Override // com.aspose.words.internal.zzZBI
            public final zzZD5 zzXKI() {
                return this;
            }

            @Override // com.aspose.words.internal.zzZDK
            public final zzZD5 zzXL0() {
                return this;
            }
        };
    }

    public final Enumeration zzXKE() {
        return this.zzWIh.elements();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL2() {
        zzZBM zzzbm = new zzZBM();
        zzzbm.zzWIh = this.zzWIh;
        return zzzbm;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final zzZD5 zzXL3() {
        if (this.zzWIg) {
            zzZC0 zzzc0 = new zzZC0();
            zzzc0.zzWIh = this.zzWIh;
            return zzzc0;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.zzWIh.size(); i++) {
            vector.addElement(this.zzWIh.elementAt(i));
        }
        zzZC0 zzzc02 = new zzZC0();
        zzzc02.zzWIh = vector;
        zzzc02.sort();
        return zzzc02;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZD5
    public abstract void zzZ(zzZD7 zzzd7) throws IOException;

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (!(zzzd5 instanceof zzZD2)) {
            return false;
        }
        zzZD2 zzzd2 = (zzZD2) zzzd5;
        if (this.zzWIh.size() != zzzd2.zzWIh.size()) {
            return false;
        }
        Enumeration enumerationElements = this.zzWIh.elements();
        Enumeration enumerationElements2 = zzzd2.zzWIh.elements();
        while (enumerationElements.hasMoreElements()) {
            zzZDK zzzdkZzZ = zzZ(enumerationElements);
            zzZDK zzzdkZzZ2 = zzZ(enumerationElements2);
            zzZD5 zzzd5ZzXL0 = zzzdkZzZ.zzXL0();
            zzZD5 zzzd5ZzXL02 = zzzdkZzZ2.zzXL0();
            if (zzzd5ZzXL0 != zzzd5ZzXL02 && !zzzd5ZzXL0.equals(zzzd5ZzXL02)) {
                return false;
            }
        }
        return true;
    }

    public final zzZDK zzg6(int i) {
        return (zzZDK) this.zzWIh.elementAt(i);
    }

    public zzZD2(zzZDK zzzdk) {
        Vector vector = new Vector();
        this.zzWIh = vector;
        this.zzWIg = false;
        vector.addElement(zzzdk);
    }

    public zzZD2(zzZDJ zzzdj, boolean z) {
        this.zzWIh = new Vector();
        this.zzWIg = false;
        for (int i = 0; i != zzzdj.size(); i++) {
            this.zzWIh.addElement(zzzdj.zzg8(i));
        }
        if (z) {
            sort();
        }
    }

    private static zzZDK zzZ(Enumeration enumeration) {
        zzZDK zzzdk = (zzZDK) enumeration.nextElement();
        return zzzdk == null ? zzZC8.zzWHS : zzzdk;
    }

    public zzZD2(zzZDK[] zzzdkArr, boolean z) {
        this.zzWIh = new Vector();
        this.zzWIg = false;
        for (int i = 0; i != zzzdkArr.length; i++) {
            this.zzWIh.addElement(zzzdkArr[i]);
        }
    }
}
