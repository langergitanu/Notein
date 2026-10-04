package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import com.aspose.words.internal.zzYGU;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZD4 extends zzZD5 implements zzYGQ {
    protected Vector zzWIk;

    public zzZD4() {
        this.zzWIk = new Vector();
    }

    public static zzZD4 zzX(zzZCY zzzcy, boolean z) {
        if (z) {
            if (zzzcy.zzWI9) {
                return zzYy(zzzcy.zzXKw().zzXL0());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        zzZD5 zzzd5ZzXKw = zzzcy.zzXKw();
        if (zzzcy.zzWI9) {
            return zzzcy instanceof zzZCL ? new zzZCP(zzzd5ZzXKw) : new zzZBN(zzzd5ZzXKw);
        }
        if (zzzd5ZzXKw instanceof zzZD4) {
            return (zzZD4) zzzd5ZzXKw;
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(zzzcy.getClass().getName()));
    }

    public static zzZD4 zzYy(Object obj) {
        while (obj != null && !(obj instanceof zzZD4)) {
            if (!(obj instanceof zzZD3)) {
                if (obj instanceof byte[]) {
                    try {
                        return zzYy(zzZD5.zzXo((byte[]) obj));
                    } catch (IOException e) {
                        throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct sequence from byte[]: ")));
                    }
                }
                if (obj instanceof zzZDK) {
                    zzZD5 zzzd5ZzXL0 = ((zzZDK) obj).zzXL0();
                    if (zzzd5ZzXL0 instanceof zzZD4) {
                        return (zzZD4) zzzd5ZzXL0;
                    }
                }
                throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "unknown object in getInstance: "));
            }
            obj = ((zzZD3) obj).zzXL0();
        }
        return (zzZD4) obj;
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public int hashCode() {
        Enumeration enumerationZzXKE = zzXKE();
        int size = size();
        while (enumerationZzXKE.hasMoreElements()) {
            size = (size * 17) ^ zzZ(enumerationZzXKE).hashCode();
        }
        return size;
    }

    @Override // java.lang.Iterable
    public Iterator<zzZDK> iterator() {
        return new zzYGU.zzZ(zzXKF());
    }

    public int size() {
        return this.zzWIk.size();
    }

    public String toString() {
        return this.zzWIk.toString();
    }

    public final zzZD3 zzXKD() {
        return new zzZD3() { // from class: com.aspose.words.internal.zzZD4.1
            private int index;
            private final int max;

            {
                this.max = zzZD4.this.size();
            }

            @Override // com.aspose.words.internal.zzZD3
            public final zzZDK zzXKC() throws IOException {
                int i = this.index;
                if (i == this.max) {
                    return null;
                }
                zzZD4 zzzd4 = zzZD4.this;
                this.index = i + 1;
                zzZDK zzzdkZzg6 = zzzd4.zzg6(i);
                return zzzdkZzg6 instanceof zzZD4 ? ((zzZD4) zzzdkZzg6).zzXKD() : zzzdkZzg6 instanceof zzZD2 ? ((zzZD2) zzzdkZzg6).zzXKB() : zzzdkZzg6;
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

    public Enumeration zzXKE() {
        return this.zzWIk.elements();
    }

    public final zzZDK[] zzXKF() {
        zzZDK[] zzzdkArr = new zzZDK[size()];
        for (int i = 0; i != size(); i++) {
            zzzdkArr[i] = zzg6(i);
        }
        return zzzdkArr;
    }

    @Override // com.aspose.words.internal.zzZD5
    public zzZD5 zzXL2() {
        zzZBN zzzbn = new zzZBN();
        zzzbn.zzWIk = this.zzWIk;
        return zzzbn;
    }

    @Override // com.aspose.words.internal.zzZD5
    public zzZD5 zzXL3() {
        zzZC2 zzzc2 = new zzZC2();
        zzzc2.zzWIk = this.zzWIk;
        return zzzc2;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZD5
    public abstract void zzZ(zzZD7 zzzd7) throws IOException;

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (!(zzzd5 instanceof zzZD4)) {
            return false;
        }
        zzZD4 zzzd4 = (zzZD4) zzzd5;
        if (size() != zzzd4.size()) {
            return false;
        }
        Enumeration enumerationZzXKE = zzXKE();
        Enumeration enumerationZzXKE2 = zzzd4.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzZDK zzzdkZzZ = zzZ(enumerationZzXKE);
            zzZDK zzzdkZzZ2 = zzZ(enumerationZzXKE2);
            zzZD5 zzzd5ZzXL0 = zzzdkZzZ.zzXL0();
            zzZD5 zzzd5ZzXL02 = zzzdkZzZ2.zzXL0();
            if (zzzd5ZzXL0 != zzzd5ZzXL02 && !zzzd5ZzXL0.equals(zzzd5ZzXL02)) {
                return false;
            }
        }
        return true;
    }

    public zzZDK zzg6(int i) {
        return (zzZDK) this.zzWIk.elementAt(i);
    }

    public zzZD4(zzZDK zzzdk) {
        Vector vector = new Vector();
        this.zzWIk = vector;
        vector.addElement(zzzdk);
    }

    public zzZD4(zzZDJ zzzdj) {
        this.zzWIk = new Vector();
        for (int i = 0; i != zzzdj.size(); i++) {
            this.zzWIk.addElement(zzzdj.zzg8(i));
        }
    }

    public zzZD4(zzZDK[] zzzdkArr) {
        this.zzWIk = new Vector();
        for (int i = 0; i != zzzdkArr.length; i++) {
            this.zzWIk.addElement(zzzdkArr[i]);
        }
    }

    private static zzZDK zzZ(Enumeration enumeration) {
        return (zzZDK) enumeration.nextElement();
    }
}
