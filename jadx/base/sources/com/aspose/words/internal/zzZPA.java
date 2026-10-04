package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPA extends zzZPK {
    zzZPH zzZYT = new zzZPH(this, zzZZ9);
    static zzZPJ[] zzZZ9 = zzZPH.zzQV(14);
    static zzZQ9 zz1P = new zzZQ9(1960, 1, 28);
    static zzZQ9 zz1O = new zzZQ9(new zzZQ9(2050, 1, 22, 23, 59, 59, 999).zzkP() + 9999);
    static int[][] zz1N = {new int[]{6, 1, 28, 44368}, new int[]{0, 2, 15, 43856}, new int[]{0, 2, 5, 19808}, new int[]{4, 1, 25, 42352}, new int[]{0, 2, 13, 42352}, new int[]{0, 2, 2, 21104}, new int[]{3, 1, 22, 26928}, new int[]{0, 2, 9, 55632}, new int[]{7, 1, 30, 27304}, new int[]{0, 2, 17, 22176}, new int[]{0, 2, 6, 39632}, new int[]{5, 1, 27, 19176}, new int[]{0, 2, 15, 19168}, new int[]{0, 2, 3, 42208}, new int[]{4, 1, 23, 53864}, new int[]{0, 2, 11, 53840}, new int[]{8, 1, 31, 54600}, new int[]{0, 2, 18, 46400}, new int[]{0, 2, 7, 54944}, new int[]{6, 1, 28, 38608}, new int[]{0, 2, 16, 38320}, new int[]{0, 2, 5, 18864}, new int[]{4, 1, 25, 42200}, new int[]{0, 2, 13, 42160}, new int[]{10, 2, 2, 45656}, new int[]{0, 2, 20, 27216}, new int[]{0, 2, 9, 27968}, new int[]{6, 1, 29, 46504}, new int[]{0, 2, 18, 11104}, new int[]{0, 2, 6, 38320}, new int[]{5, 1, 27, 18872}, new int[]{0, 2, 15, 18800}, new int[]{0, 2, 4, 25776}, new int[]{3, 1, 23, 27216}, new int[]{0, 2, 10, 59984}, new int[]{8, 1, 31, 27976}, new int[]{0, 2, 19, 23248}, new int[]{0, 2, 8, 11104}, new int[]{5, 1, 28, 37744}, new int[]{0, 2, 16, 37600}, new int[]{0, 2, 5, 51552}, new int[]{4, 1, 24, 58536}, new int[]{0, 2, 12, 54432}, new int[]{0, 2, 1, 55888}, new int[]{2, 1, 22, 23208}, new int[]{0, 2, 9, 22208}, new int[]{7, 1, 29, 43736}, new int[]{0, 2, 18, 9680}, new int[]{0, 2, 7, 37584}, new int[]{5, 1, 26, 51544}, new int[]{0, 2, 14, 43344}, new int[]{0, 2, 3, 46240}, new int[]{3, 1, 23, 47696}, new int[]{0, 2, 10, 46416}, new int[]{9, 1, 31, 21928}, new int[]{0, 2, 19, 19360}, new int[]{0, 2, 8, 42416}, new int[]{5, 1, 28, 21176}, new int[]{0, 2, 16, 21168}, new int[]{0, 2, 5, 43344}, new int[]{4, 1, 25, 46248}, new int[]{0, 2, 12, 27296}, new int[]{0, 2, 1, 44368}, new int[]{2, 1, 22, 21928}, new int[]{0, 2, 10, 19296}, new int[]{6, 1, 29, 42352}, new int[]{0, 2, 17, 42352}, new int[]{0, 2, 7, 21104}, new int[]{5, 1, 27, 26928}, new int[]{0, 2, 13, 55600}, new int[]{0, 2, 3, 23200}, new int[]{3, 1, 23, 43856}, new int[]{0, 2, 11, 38608}, new int[]{11, 1, 31, 19176}, new int[]{0, 2, 19, 19168}, new int[]{0, 2, 8, 42192}, new int[]{6, 1, 28, 53864}, new int[]{0, 2, 15, 53840}, new int[]{0, 2, 4, 54560}, new int[]{5, 1, 24, 55968}, new int[]{0, 2, 12, 46752}, new int[]{0, 2, 1, 38608}, new int[]{2, 1, 22, 19160}, new int[]{0, 2, 10, 18864}, new int[]{7, 1, 30, 42168}, new int[]{0, 2, 17, 42160}, new int[]{0, 2, 6, 45648}, new int[]{5, 1, 26, 46376}, new int[]{0, 2, 14, 27968}, new int[]{0, 2, 2, 44448}};

    @Override // com.aspose.words.internal.zzZPU
    public final int getID() {
        return 14;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzG(zzZQ9 zzzq9) {
        return this.zzZYT.zzG(zzzq9);
    }

    @Override // com.aspose.words.internal.zzZPK
    public final int zzZ(int i, zzZQ9 zzzq9) {
        return this.zzZYT.zzZ(i, zzzq9);
    }

    @Override // com.aspose.words.internal.zzZPK
    public final int zzZj(int i, int i2) {
        return this.zzZYT.zzZj(i, i2);
    }

    @Override // com.aspose.words.internal.zzZPK
    public final int zzZk(int i, int i2) {
        if (i < 1960 || i > 2049) {
            throw new IllegalArgumentException("Parameter name: ArgumentOutOfRange_Range");
        }
        return zz1N[i - 1960][i2];
    }

    @Override // com.aspose.words.internal.zzZPK
    public final zzZQ9 zzk5() {
        return zz1O;
    }

    @Override // com.aspose.words.internal.zzZPK
    public final zzZQ9 zzk6() {
        return zz1P;
    }

    @Override // com.aspose.words.internal.zzZPK
    public final int zzk7() {
        return EditingLanguage.ARABIC_IRAQ;
    }

    @Override // com.aspose.words.internal.zzZPK
    public final int zzk8() {
        return 1960;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int[] zzkj() {
        return this.zzZYT.zzkj();
    }

    @Override // com.aspose.words.internal.zzZPU
    public final int zzkn() {
        return 3;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzko() {
        return zz1O;
    }

    @Override // com.aspose.words.internal.zzZPU
    public final zzZQ9 zzkp() {
        return zz1P;
    }
}
