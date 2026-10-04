package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCP {
    static zzYCP zzXnG = new zzYCP(0, 0);
    private int zzWz;
    private int zzZja;

    public zzYCP(int i, int i2) {
        this.zzZja = i2;
        this.zzWz = i;
    }

    public static zzYCP zzL(zzYN8 zzyn8) throws Exception {
        return new zzYCP(zzyn8.getX(), zzyn8.getRight());
    }

    public static zzYCP zzM(zzYN8 zzyn8) throws Exception {
        return new zzYCP(0, zzyn8.getBottom() - zzyn8.getY());
    }

    private boolean zzZ(zzYCP zzycp) {
        return this.zzWz < zzycp.zzZja && this.zzZja > zzycp.zzWz;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzYCP)) {
            return false;
        }
        zzYCP zzycp = (zzYCP) obj;
        return zzycp.zzWz == this.zzWz && zzycp.zzZja == this.zzZja;
    }

    public final int getEnd() {
        return this.zzZja;
    }

    public final int getLeft() {
        return this.zzWz;
    }

    public final int getLength() {
        return this.zzZja - this.zzWz;
    }

    public final int getRight() {
        return this.zzZja;
    }

    public final int getStart() {
        return this.zzWz;
    }

    public final int getX() {
        return this.zzWz;
    }

    public final int hashCode() {
        return (this.zzWz * 397) ^ this.zzZja;
    }

    public final boolean isEmpty() {
        return this.zzZja == this.zzWz;
    }

    public final boolean zzY(zzYCP zzycp) {
        return zzycp.zzWz <= this.zzWz && this.zzZja <= zzycp.zzZja;
    }

    public final ArrayList<zzYCP> zzZ1(ArrayList<zzYCP> arrayList) {
        ArrayList<zzYCP> arrayList2 = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList2, this);
        for (zzYCP zzycp : arrayList) {
            ArrayList<zzYCP> arrayList3 = new ArrayList<>();
            for (zzYCP zzycp2 : arrayList2) {
                if (zzycp2.zzZ(zzycp)) {
                    int i = zzycp.zzWz;
                    int i2 = zzycp2.zzWz;
                    if (i > i2) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList3, new zzYCP(i2, i));
                    }
                    int i3 = zzycp.zzZja;
                    int i4 = zzycp2.zzZja;
                    if (i3 < i4) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList3, new zzYCP(i3, i4));
                    }
                } else {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList3, zzycp2);
                }
            }
            arrayList2 = arrayList3;
        }
        return arrayList2;
    }

    public final zzYCP zzmt(int i) {
        return new zzYCP(this.zzWz + i, this.zzZja + i);
    }
}
