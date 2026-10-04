package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzH1 extends zz80 implements Cloneable {
    private DocumentBase zzZCL;
    private ArrayList<zz8E> zzZgA;
    private int zzZgB;
    private byte[] zzZgx;
    private String zzZgy;
    private byte[] zzZgz;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzZ(zzH1 zzh1) {
        if (zzh1.zzZQ7().size() != zzZQ7().size()) {
            return false;
        }
        boolean zEquals = true;
        for (int i = 0; i < zzZQ7().size() && ((zEquals = zEquals & com.aspose.words.internal.zzZKO.equals(zzZQ7().get(i), zzh1.zzZQ7().get(i)))); i++) {
        }
        return zEquals;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzH1 zzh1 = (zzH1) obj;
        return zzh1.zzZgB == this.zzZgB && com.aspose.words.internal.zzZKO.equals(zzh1.zzZgy, this.zzZgy) && com.aspose.words.internal.zzZKO.equals(com.aspose.words.internal.zzSJ.zzK(zzh1.zzZgx), com.aspose.words.internal.zzSJ.zzK(this.zzZgx)) && zzZ(zzh1);
    }

    public final DocumentBase getDocument() {
        return this.zzZCL;
    }

    public final byte[] getImageBytes() throws Exception {
        byte[] bArr = this.zzZgx;
        if (bArr != null) {
            return com.aspose.words.internal.zzSJ.zzK(bArr);
        }
        if (this.zzZgz == null && com.aspose.words.internal.zzZYD.zzXk(this.zzZgy)) {
            this.zzZgz = zzZ8I.zzZ(this.zzZgy, this.zzZCL);
        }
        return this.zzZgz;
    }

    public final int getImageType() throws Exception {
        return com.aspose.words.internal.zzZ1.zzX(this.zzZgx) ? com.aspose.words.internal.zzEF.zzZU(this.zzZgx) : com.aspose.words.internal.zzEF.zzZU(getImageBytes());
    }

    public final int hashCode() {
        int iHashCode = this.zzZgB;
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzZgy)) {
            iHashCode ^= this.zzZgy.hashCode();
        }
        if (com.aspose.words.internal.zzZ1.zzX(this.zzZgx)) {
            iHashCode ^= com.aspose.words.internal.zzSJ.zzK(this.zzZgx).hashCode();
        }
        Iterator<zz8E> it = zzZQ7().iterator();
        while (it.hasNext()) {
            iHashCode ^= it.next().hashCode();
        }
        return iHashCode;
    }

    public final void zzLD(int i) {
        this.zzZgB = i;
    }

    public final void zzRE(String str) {
        this.zzZgy = str;
    }

    public final void zzY(DocumentBase documentBase) {
        this.zzZCL = documentBase;
    }

    public final void zzYt(byte[] bArr) {
        this.zzZgx = bArr;
    }

    public final ArrayList<zz8E> zzZQ7() {
        if (this.zzZgA == null) {
            this.zzZgA = new ArrayList<>();
        }
        return this.zzZgA;
    }

    public final int zzZQ8() {
        return this.zzZgB;
    }

    public final String zzZQ9() {
        return this.zzZgy;
    }

    public final byte[] zzZQa() {
        return com.aspose.words.internal.zzSJ.zzK(this.zzZgx);
    }

    public final boolean zzZQb() {
        return com.aspose.words.internal.zzZ1.zzX(this.zzZgx);
    }

    public final zzH1 zzZQc() {
        zzH1 zzh1 = (zzH1) memberwiseClone();
        if (this.zzZgA != null) {
            zzh1.zzZgA = new ArrayList<>();
            Iterator<zz8E> it = this.zzZgA.iterator();
            while (it.hasNext()) {
                zzh1.zzZgA.add(it.next().zzZQY());
            }
        }
        zzh1.setExtensions(zzZBz());
        return zzh1;
    }

    public final void zzi(ArrayList<zz8E> arrayList) {
        this.zzZgA = arrayList;
    }
}
