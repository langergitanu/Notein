package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZS extends com.aspose.words.internal.zzZYU {
    private zzZ7L zzZF1;

    private static boolean zzPh(int i) {
        switch (i) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 30:
            case 40:
            case 890:
            case EditingLanguage.DIVEHI /* 1125 */:
            case 1580:
            case 1610:
            case 1620:
            case 1630:
            case 1640:
            case 5103:
            case 5106:
            case 5107:
            case 9999:
            case 10010:
                return true;
            default:
                return false;
        }
    }

    private static boolean zzZL(Object obj) {
        return (obj instanceof zzZCY) && ((zzZCY) obj).isInheritedComplexAttr();
    }

    private static void zzx(Object obj, Object obj2) {
        if (obj instanceof IExpandableAttr) {
            ((IExpandableAttr) obj).collapse((IExpandableAttr) obj2);
        }
    }

    private static boolean zzy(Object obj, Object obj2) {
        return obj instanceof zzZCW ? ((zzZCW) obj).zzZ((zzZCW) obj2) : obj2.equals(obj);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final void add(int i, Object obj) {
        zzbp();
        super.add(i, obj);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final void clear() {
        zzbp();
        super.clear();
    }

    @Override // com.aspose.words.internal.zzZYU
    public final boolean contains(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.contains(i);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        return zzV((zzZS) com.aspose.words.internal.zzZKW.zzZ(obj, zzZS.class));
    }

    @Override // com.aspose.words.internal.zzZYU
    public final Object get(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.get(i);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final int getCount() {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.getCount();
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < getCount(); i2++) {
            int iZzT3 = i + zzT3(i2);
            int i3 = iZzT3 + (iZzT3 << 10);
            i = i3 ^ (i3 >> 6);
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzZYU
    public final int indexOfKey(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.indexOfKey(i);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final void remove(int i) {
        zzbp();
        super.remove(i);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final void removeAt(int i) {
        zzbp();
        super.removeAt(i);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final void set(int i, Object obj) {
        zzbp();
        super.set(i, obj);
    }

    public final boolean zzD(int[] iArr) {
        for (int i = 0; i < getCount(); i++) {
            if (com.aspose.words.internal.zzZ1.binarySearch(iArr, 0, iArr.length, zzT3(i)) < 0 && !zzZL(zzVY(i))) {
                return true;
            }
        }
        return false;
    }

    public final void zzN(int i, Object obj) {
        if (zzVE(i)) {
            return;
        }
        zzQ(i, obj);
    }

    public final void zzO(int i, Object obj) {
        Object objZzPi = zzPi(i);
        if (objZzPi == null || !obj.equals(objZzPi)) {
            zzQ(i, obj);
        }
    }

    public final void zzP(int i, Object obj) {
        if (obj != null) {
            zzQ(i, obj);
        }
    }

    public final boolean zzPg(int i) {
        Object objZzPk = zzPk(i);
        if (objZzPk == null) {
            return true;
        }
        Object objZzPi = zzPi(i);
        if (objZzPi == null) {
            return false;
        }
        return objZzPk.equals(objZzPi);
    }

    public final Object zzPi(int i) {
        zzZS zzzsZzbo = zzbo();
        int iIndexOfKey = zzzsZzbo.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return zzzsZzbo.zzVY(iIndexOfKey);
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Requested default value for an unknown attribute {0}.", Integer.valueOf(i)));
    }

    public final Object zzPj(int i) {
        Object objZzPk = zzPk(i);
        return objZzPk != null ? objZzPk : zzPi(i);
    }

    public final Object zzPk(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.get(i);
    }

    public final void zzQ(int i, Object obj) {
        zzbp();
        super.set(i, obj);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final boolean zzS(int... iArr) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.zzS(iArr);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final int zzT3(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.zzT3(i);
    }

    public final boolean zzV(zzZS zzzs) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzzs)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzzs)) {
            return true;
        }
        return zzZ(this, zzzs, (int[]) null);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final boolean zzVE(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.zzVE(i);
    }

    @Override // com.aspose.words.internal.zzZYU
    public final Object zzVY(int i) {
        zzZS zzzs = this;
        while (zzzs.zzbq() == 2) {
            zzzs = zzzs.zzZF1.zzYhD;
        }
        return super.zzVY(i);
    }

    public final void zzW(zzZS zzzs, int i) {
        Object obj = get(i);
        if (obj != null) {
            zzzs.zzQ(i, obj);
        }
    }

    public final void zzX(int i, Object obj, boolean z) {
        if (z) {
            zzQ(i, obj);
        } else {
            remove(i);
        }
    }

    public final void zzY(zzZS zzzs, int i) {
        Object objZzPk = zzPk(i);
        if (objZzPk != null) {
            remove(i);
            zzzs.zzQ(i, objZzPk);
        }
    }

    public final void zzZ(zzZS zzzs, int... iArr) {
        for (int i : iArr) {
            zzX(zzzs, i);
        }
    }

    public final zzZ7L zzbk() {
        return this.zzZF1;
    }

    public final void zzbl() {
        zzW(zzbo());
    }

    public final void zzbm() {
        for (int i : zzrc()) {
            if (zzPh(i)) {
                remove(i);
            }
        }
    }

    public zzZS zzbn() {
        zzZS zzzs = zzbq() == 2 ? (zzZS) this.zzZF1.zzYhD.zzr8() : (zzZS) zzr8();
        zzzs.zzZF1 = null;
        for (int i = 0; i < getCount(); i++) {
            int iZzT3 = zzT3(i);
            Object objZzVY = zzVY(i);
            if (objZzVY instanceof zzZCY) {
                zzZCY zzzcy = (zzZCY) objZzVY;
                if (!zzzcy.isInheritedComplexAttr()) {
                    if (!(objZzVY instanceof zzU1)) {
                        objZzVY = zzzcy.deepCloneComplexAttr();
                    }
                    zzzs.set(iZzT3, objZzVY);
                }
            } else {
                zzzs.set(iZzT3, objZzVY);
            }
        }
        return zzzs;
    }

    public abstract zzZS zzbo();

    public final void zzbp() {
        zzZ7L zzz7l = this.zzZF1;
        if (zzz7l != null) {
            zzz7l.zzYUM().zzQ(this);
        }
    }

    public final int zzbq() {
        zzZ7L zzz7l = this.zzZF1;
        if (zzz7l == null) {
            return 0;
        }
        return com.aspose.words.internal.zzZKO.zzA(zzz7l.zzYhD, this) ? 1 : 2;
    }

    public final int[] zzrc() {
        int[] iArr = new int[getCount()];
        for (int i = 0; i < getCount(); i++) {
            iArr[i] = zzT3(i);
        }
        return iArr;
    }

    public final int hashCode(int[] iArr) {
        int iHashCode = 0;
        for (int i = 0; i < getCount(); i++) {
            int iZzT3 = zzT3(i);
            if (com.aspose.words.internal.zzZ1.binarySearch(iArr, 0, iArr.length, iZzT3) < 0) {
                iHashCode = (iHashCode * 397) ^ iZzT3;
                Object objZzVY = zzVY(i);
                if (objZzVY != null && !zzZL(objZzVY)) {
                    iHashCode = (iHashCode * 397) ^ objZzVY.hashCode();
                }
            }
        }
        return iHashCode;
    }

    public final boolean zzW(zzZS zzzs, int[] iArr) {
        return zzZ(this, zzzs, iArr);
    }

    public final void zzX(zzZS zzzs, int i) {
        Object objZzPk = zzPk(i);
        if (objZzPk != null) {
            zzzs.zzQ(i, objZzPk);
        } else {
            zzzs.remove(i);
        }
    }

    public final void zzZ(zzZS zzzs) {
        for (int i = 0; i < getCount(); i++) {
            int iZzT3 = zzT3(i);
            zzzs.zzQ(iZzT3, get(iZzT3));
        }
    }

    public final void zzW(zzZS zzzs) {
        for (int i = 0; i < zzzs.getCount(); i++) {
            int iIndexOfKey = indexOfKey(zzzs.zzT3(i));
            if (iIndexOfKey >= 0) {
                Object objZzVY = zzzs.zzVY(i);
                Object objZzVY2 = zzVY(iIndexOfKey);
                if (objZzVY != null && objZzVY.equals(objZzVY2)) {
                    removeAt(iIndexOfKey);
                }
            }
        }
    }

    public final void zzY(zzZS zzzs) {
        zzZ(zzzs, (zzZBI) null);
    }

    public final void zzY(zzZS zzzs, int... iArr) {
        if (iArr != null) {
            for (int i : iArr) {
                Object obj = get(i);
                if (obj != null) {
                    zzZ(zzzs, i, obj, (zzZBI) null);
                }
            }
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: keys");
    }

    public final void zzX(zzZS zzzs) {
        zzX(zzzs, -1);
    }

    public final void zzZ(zzZS zzzs, boolean z) {
        if (z) {
            zzbo().zzZ(zzzs, (zzZBI) null);
        }
        zzZ(zzzs, (zzZBI) null);
    }

    public final void zzX(zzZS zzzs, int... iArr) {
        if (zzzs != null) {
            for (int i = 0; i < zzzs.getCount(); i++) {
                int iZzT3 = zzzs.zzT3(i);
                if (!com.aspose.words.internal.zzZ1.zzZ(iArr, iZzT3) && !zzPh(iZzT3)) {
                    int iIndexOfKey = indexOfKey(iZzT3);
                    if (iIndexOfKey >= 0) {
                        Object objZzVY = zzzs.zzVY(i);
                        Object objZzVY2 = zzVY(iIndexOfKey);
                        if (zzy(objZzVY2, objZzVY)) {
                            removeAt(iIndexOfKey);
                        } else {
                            zzx(objZzVY2, objZzVY);
                        }
                    } else {
                        Object objZzPi = zzPi(iZzT3);
                        if (objZzPi instanceof zzZCY) {
                            if (!(objZzPi instanceof zzU1)) {
                                objZzPi = ((zzZCY) objZzPi).deepCloneComplexAttr();
                            }
                            zzx(objZzPi, zzzs.zzVY(i));
                        }
                        set(iZzT3, objZzPi);
                    }
                }
            }
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: baseAttrs");
    }

    public final void zzZ(zzZS zzzs, zzZBI zzzbi) {
        if (zzzs != null) {
            for (int i = 0; i < getCount(); i++) {
                zzZ(zzzs, zzT3(i), zzVY(i), zzzbi);
            }
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstAttrs");
    }

    private static void zzZ(zzZS zzzs, int i, Object obj, zzZBI zzzbi) {
        Object objZzZ;
        if (obj instanceof zzZCY) {
            zzZCY zzzcy = (zzZCY) obj;
            if (zzzcy.isInheritedComplexAttr()) {
                return;
            }
            if (zzzcy instanceof IExpandableAttr) {
                objZzZ = ((IExpandableAttr) zzzcy).expand((IExpandableAttr) zzzs.get(i));
            } else {
                boolean z = zzzcy instanceof zzU1;
                objZzZ = zzzcy;
                if (!z) {
                    objZzZ = zzzcy.deepCloneComplexAttr();
                }
            }
        } else {
            boolean z2 = obj instanceof zzZU;
            objZzZ = obj;
            if (z2) {
                objZzZ = ((zzZU) obj).zzZ(zzzs, i);
            }
        }
        if (zzzbi != null) {
            zzzbi.zzZ(zzzs, i, objZzZ);
        } else {
            zzzs.set(i, objZzZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[LOOP:0: B:3:0x0006->B:24:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzZ(zzZS zzzs, zzZS zzzs2, int[] iArr) {
        boolean zZzZL;
        int i;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            RefInt refInt = new RefInt(i2);
            RefInt refInt2 = new RefInt(i3);
            boolean zZzZ = zzZ(zzzs, refInt, refInt2, iArr);
            int i6 = refInt.get();
            int i7 = refInt2.get();
            RefInt refInt3 = new RefInt(i4);
            RefInt refInt4 = new RefInt(i5);
            boolean zZzZ2 = zzZ(zzzs2, refInt3, refInt4, iArr);
            int i8 = refInt3.get();
            int i9 = refInt4.get();
            if (!zZzZ && !zZzZ2) {
                return z;
            }
            if (zZzZ && zZzZ2 && i7 != i9) {
                if (zzzs2.zzVE(i7)) {
                    zZzZ = false;
                } else {
                    zZzZ2 = false;
                }
            }
            if (zZzZ && zZzZ2) {
                i = i8 + 1;
                zZzZL = zzzs.zzVY(i6).equals(zzzs2.zzVY(i8));
                i6++;
            } else if (zZzZ) {
                boolean zZzZL2 = zzZL(zzzs.zzVY(i6));
                i6++;
                z = zZzZL2;
                i = i8;
                if (z) {
                    return z;
                }
                int i10 = i;
                i5 = i9;
                i4 = i10;
                i3 = i7;
                i2 = i6;
            } else {
                zZzZL = zzZL(zzzs2.zzVY(i8));
                i = i8 + 1;
            }
            z = zZzZL;
            if (z) {
            }
        }
    }

    private static boolean zzZ(zzZS zzzs, RefInt refInt, RefInt refInt2, int[] iArr) {
        int count = zzzs.getCount();
        int length = iArr != null ? iArr.length : 0;
        while (refInt.get() < count) {
            refInt2.set(zzzs.zzT3(refInt.get()));
            if (iArr == null || com.aspose.words.internal.zzZ1.binarySearch(iArr, 0, length, refInt2.get()) < 0) {
                return true;
            }
            com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
        }
        return false;
    }

    public final void zzZ(zzZ7L zzz7l) {
        this.zzZF1 = zzz7l;
    }
}
