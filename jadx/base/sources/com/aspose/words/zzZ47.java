package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ47 {
    private int zzYQG;
    private zzZ48 zzYbJ;
    private int[] zzYbK;
    private com.aspose.words.internal.zzIM<Integer> zzYbL;
    private int zzYbM;
    private zzZ4J zzYbN;
    private int zzYbO;
    private int zzYbP;
    private int[] zzYbS;
    private List zzYo7;

    public zzZ47(List list) {
        this.zzYbN = list.zzYPa();
        this.zzYo7 = list;
        this.zzYbL = new com.aspose.words.internal.zzIM<>();
        zzra();
    }

    private void zzWO(int i, int i2) {
        this.zzYbS[this.zzYo7.getListLevels().zzwX(i)] = i2;
    }

    private int zzWP(int i, int i2) {
        if (this.zzYbM == 0) {
            return 1;
        }
        if (i < 0) {
            return 0;
        }
        for (int i3 = i + 1; i3 < i2; i3++) {
            if (com.aspose.words.internal.zzXU.zzN(this.zzYbM, 1 << i3)) {
                return 0;
            }
        }
        return 1;
    }

    private void zzra() {
        this.zzYbP = -1;
        this.zzYbS = new int[this.zzYo7.getListLevels().getCount()];
        this.zzYbK = new int[this.zzYo7.getListLevels().getCount()];
        int i = 0;
        this.zzYbM = 0;
        this.zzYbJ = new zzZ48(this.zzYbS, this.zzYo7);
        while (true) {
            int[] iArr = this.zzYbS;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = this.zzYo7.zzxx(i) - 1;
            i++;
        }
    }

    private int zzwS(int i) {
        return this.zzYo7.getListLevels().zzwY(i).getRestartAfterLevel();
    }

    public final ListLevel getListLevel() {
        return zzwT(this.zzYbP);
    }

    public final int getLocaleId() {
        return this.zzYQG;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[LOOP:0: B:9:0x0033->B:11:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void init(int i) {
        int[] iArr;
        int i2 = i - 1;
        this.zzYbP = i2;
        this.zzYbM = i2;
        this.zzYbK = new int[this.zzYo7.getListLevels().getCount()];
        if (this.zzYbS == null) {
            this.zzYbS = new int[this.zzYo7.getListLevels().getCount()];
        } else {
            int i3 = i;
            while (true) {
                int[] iArr2 = this.zzYbS;
                if (i3 < iArr2.length) {
                    iArr2[i3] = 0;
                    i3++;
                }
            }
            while (true) {
                iArr = this.zzYbS;
                if (i < iArr.length) {
                    this.zzYbJ = new zzZ48(iArr, this.zzYo7);
                    return;
                } else {
                    iArr[i] = this.zzYo7.zzxx(i) - 1;
                    i++;
                }
            }
        }
        while (true) {
            iArr = this.zzYbS;
            if (i < iArr.length) {
            }
            iArr[i] = this.zzYo7.zzxx(i) - 1;
            i++;
        }
    }

    public final void setLocaleId(int i) {
        this.zzYQG = i;
    }

    public final int zzR0(int i) {
        int iZzwX = this.zzYo7.getListLevels().zzwX(i);
        return this.zzYbS[iZzwX] - this.zzYbK[iZzwX];
    }

    public final int zzYNY() {
        return this.zzYbM;
    }

    public final int zzYNZ() {
        return this.zzYbO;
    }

    public final int zzYO0() {
        return this.zzYbP;
    }

    public final int zzYO1() {
        return zzR0(this.zzYbP);
    }

    public final zzZ47 zzYO2() {
        return new zzZ47(this);
    }

    public final zzZ4J zzYPa() {
        return this.zzYbN;
    }

    public final void zzZ(List list, int i, boolean z) {
        list.zzYPa();
        this.zzYo7 = list;
        int iZzwX = list.getListLevels().zzwX(i);
        if (!this.zzYbL.contains(Integer.valueOf(list.getListId())) && list.zzxy(iZzwX)) {
            this.zzYbL.add(Integer.valueOf(list.getListId()));
            this.zzYbS[iZzwX] = list.zzxx(iZzwX) - 1;
        }
        int[] iArr = this.zzYbS;
        iArr[iZzwX] = iArr[iZzwX] + 1;
        for (int i2 = this.zzYbP + 1; i2 < iZzwX; i2++) {
            int iZzWP = zzWP(zzwS(i2), i2);
            int[] iArr2 = this.zzYbS;
            iArr2[i2] = iArr2[i2] + iZzWP;
        }
        if (this.zzYbM != 0 && iZzwX != this.zzYbP && list.zzYPb().getCount() > 0) {
            this.zzYbJ.zzZ(list, this.zzYbP, iZzwX);
        }
        if (iZzwX < this.zzYbP) {
            for (int i3 = iZzwX + 1; i3 < this.zzYbS.length; i3++) {
                if (zzwS(i3) >= iZzwX) {
                    zzZ4B zzz4bZzZ = zzZ48.zzZ(i3, list);
                    this.zzYbS[i3] = zzz4bZzZ != null ? zzz4bZzZ.getListLevel().getStartAt() : list.zzxx(i3);
                    int[] iArr3 = this.zzYbS;
                    iArr3[i3] = iArr3[i3] - 1;
                }
            }
        }
        this.zzYbP = iZzwX;
        if (z) {
            this.zzYbO = iZzwX;
        }
        this.zzYbM = com.aspose.words.internal.zzXU.zzZ(this.zzYbM, 1 << iZzwX, true) & ((1 << (iZzwX + 1)) - 1);
    }

    public final ListLevel zzwT(int i) {
        return this.zzYo7.zzxw(i);
    }

    public final void zzwU(int i) {
        zzWO(this.zzYbP, i);
    }

    public zzZ47(List list, int i, int[] iArr) {
        this.zzYo7 = list;
        this.zzYbP = i;
        this.zzYbS = iArr;
        this.zzYbK = new int[list.getListLevels().getCount()];
    }

    private zzZ47(zzZ47 zzz47) {
        this.zzYo7 = zzz47.zzYo7;
        this.zzYbP = zzz47.zzYbP;
        this.zzYQG = zzz47.zzYQG;
        int[] iArr = new int[zzz47.zzYbS.length];
        this.zzYbS = iArr;
        int[] iArr2 = zzz47.zzYbS;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        int[] iArr3 = new int[zzz47.zzYbK.length];
        this.zzYbK = iArr3;
        int[] iArr4 = zzz47.zzYbK;
        System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
        this.zzYbM = zzz47.zzYbM;
        this.zzYbJ = new zzZ48(this.zzYbS, this.zzYo7);
    }
}
