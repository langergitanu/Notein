package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class WordAttrCollection extends zzZS {

    public final class ValueVersion {
        public static final int AFTER_CHANGES = 2;
        public static final int FINAL = 1;
        public static final int ORIGINAL = 0;
        public static final int length = 3;
    }

    private Object zzUZ(int i, int i2) {
        if (i2 == 2 && zz6D()) {
            return zzYsN().zzZ6C().get(i);
        }
        if (i2 == 1 && zz6D()) {
            WordAttrCollection wordAttrCollectionZzZ6C = zzYsN().zzZ6C();
            Object obj = wordAttrCollectionZzZ6C.get(i);
            if (obj != null) {
                return obj;
            }
            if (wordAttrCollectionZzZ6C.contains(1000) || wordAttrCollectionZzZ6C.contains(50)) {
                return null;
            }
        }
        return get(i);
    }

    private static int zznd(int i) {
        return i == 1 ? 1 : 0;
    }

    public final zzZV8 getDeleteRevision() {
        return (zzZV8) zzPk(12);
    }

    public final zzZV8 getInsertRevision() {
        return (zzZV8) zzPk(14);
    }

    public final zzYX5 getMoveFromRevision() {
        return (zzYX5) zzPk(13);
    }

    public final zzYX5 getMoveToRevision() {
        return (zzYX5) zzPk(15);
    }

    public final boolean hasRevisions() {
        return zz6D() || zzYrV() || zzYrW() || zzXS4() || zzXS3();
    }

    public final boolean zz6D() {
        return zzYsN() != null && zzYsN().zzZ6C().getCount() > 0;
    }

    public final Object zzB(int i, int i2, boolean z) {
        Object objZzUZ = zzUZ(i, i2);
        return (z && objZzUZ == null) ? zzbo().get(i) : objZzUZ;
    }

    public final void zzR(WordAttrCollection wordAttrCollection) {
        zzQ(9999, new zzZR(wordAttrCollection));
    }

    public final void zzS(int i, int[] iArr) {
        zzZMK zzzmkZzYsN = zzYsN();
        if (zzzmkZzYsN != null) {
            WordAttrCollection wordAttrCollectionZzZ6C = zzzmkZzYsN.zzZ6C();
            if (i >= 0 && wordAttrCollectionZzZ6C.zzPk(i) != null && iArr != null) {
                zzZX(iArr);
            }
            remove(10010);
            wordAttrCollectionZzZ6C.zzY(this);
        }
        remove(10010);
    }

    public Object zzVQ(int i, int i2) {
        return zzB(i, zznd(i2), false);
    }

    public Object zzVR(int i, int i2) {
        return zzB(i, zznd(i2), true);
    }

    public final WordAttrCollection zzXS2() {
        return contains(9999) ? ((zzZR) get(9999)).zzbj() : this;
    }

    public final boolean zzXS3() {
        return getMoveToRevision() != null;
    }

    public final boolean zzXS4() {
        return getMoveFromRevision() != null;
    }

    public final boolean zzY3m() {
        return (zzYsN() == null || zz6D()) ? false : true;
    }

    public void zzYpN() {
        zzS(-1, null);
    }

    public final boolean zzYrV() {
        return getInsertRevision() != null;
    }

    public final boolean zzYrW() {
        return getDeleteRevision() != null;
    }

    public final zzZMK zzYsN() {
        return (zzZMK) zzPk(10010);
    }

    public final void zzZ(zzZMK zzzmk) {
        zzQ(10010, zzzmk);
    }

    public final void zzZX(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            clear();
            return;
        }
        int i = 0;
        while (i < getCount()) {
            if (com.aspose.words.internal.zzZKV.zzZ(iArr, zzT3(i), 0, iArr.length) < 0) {
                removeAt(i);
            } else {
                i++;
            }
        }
    }

    public final Object zzhM(int i) {
        Object obj = get(i);
        if (obj != null) {
            return obj;
        }
        zzZCY zzzcyDeepCloneComplexAttr = ((zzZCY) zzbo().get(i)).deepCloneComplexAttr();
        zzQ(i, zzzcyDeepCloneComplexAttr);
        return zzzcyDeepCloneComplexAttr;
    }
}
