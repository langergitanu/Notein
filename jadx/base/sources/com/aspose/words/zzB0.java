package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzB0 extends com.aspose.words.internal.zz6 {
    private int zzYO;
    private ArrayList<com.aspose.words.internal.zzZL> zzZ7F = new ArrayList<>();
    private ArrayList<com.aspose.words.internal.zzZL> zzZ7E = new ArrayList<>();

    private zzB0(int i) {
        this.zzYO = i;
    }

    private static void zz8(ArrayList<com.aspose.words.internal.zzZL> arrayList) {
        int iZzW;
        for (com.aspose.words.internal.zzZL zzzl : arrayList) {
            if (zzzl != null && zzzl.zzZ5() != null && (iZzW = zzzl.zzZ5().zzW(zzzl)) >= 0) {
                zzzl.zzZ5().removeAt(iZzW);
            }
        }
    }

    public static com.aspose.words.internal.zzG[] zzZ(com.aspose.words.internal.zzG zzg, int i) throws Exception {
        zzB0 zzb0 = new zzB0(i);
        zzg.zzZ(zzb0);
        com.aspose.words.internal.zzG[] zzgArr = new com.aspose.words.internal.zzG[2];
        if (zzb0.zzZ7E.size() == 0) {
            zzgArr[0] = zzg;
            zzgArr[1] = null;
            return zzgArr;
        }
        com.aspose.words.internal.zz7[] zz7VarArr = new com.aspose.words.internal.zz7[zzb0.zzZ7E.size()];
        for (int i2 = 0; i2 < zzb0.zzZ7E.size(); i2++) {
            com.aspose.words.internal.zzZL zzzl = zzb0.zzZ7E.get(i2);
            com.aspose.words.internal.zz7 zz7VarZzZ5 = zzzl.zzZ5();
            zz7VarArr[i2] = zz7VarZzZ5;
            zz7VarZzZ5.removeAt(zz7VarZzZ5.zzW(zzzl));
        }
        zzgArr[0] = (com.aspose.words.internal.zzG) zzg.zz1();
        zz8(zzb0.zzZ7F);
        for (int i3 = 0; i3 < zzb0.zzZ7E.size(); i3++) {
            zz7VarArr[i3].zzX(zzb0.zzZ7E.get(i3));
        }
        zzgArr[1] = zzg;
        return zzgArr;
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(com.aspose.words.internal.zzZS zzzs) {
        if ((this.zzYO & zzzs.zzZg()) == 0) {
            return true;
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZS>) this.zzZ7E, zzzs);
        return false;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzI zzi) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzI>) this.zzZ7F, zzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zz9 zz9Var) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zz9>) this.zzZ7F, zz9Var);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzC zzc) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzC>) this.zzZ7F, zzc);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZC zzzc) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZC>) this.zzZ7F, zzzc);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZB zzzb) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZB>) this.zzZ7F, zzzb);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZU zzzu) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZU>) this.zzZ7F, zzzu);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZP zzzp) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZP>) this.zzZ7F, zzzp);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZI zzzi) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZI>) this.zzZ7F, zzzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) this.zzZ7F, zzzg);
    }
}
