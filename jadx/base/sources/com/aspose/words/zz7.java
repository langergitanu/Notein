package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zz7 extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zz7 zzZFS;
    private HashMap<Integer, ArrayList<zz8>> zzZFt;

    private zz7(com.aspose.words.internal.zz7 zz7Var) {
        this.zzZFS = zz7Var;
        HashMap<Integer, ArrayList<zz8>> map = new HashMap<>();
        this.zzZFt = map;
        com.aspose.words.internal.zzZQF.zzY(map, 524288, new ArrayList());
        com.aspose.words.internal.zzZQF.zzY(this.zzZFt, 1048576, new ArrayList());
        com.aspose.words.internal.zzZQF.zzY(this.zzZFt, 2097152, new ArrayList());
        com.aspose.words.internal.zzZQF.zzY(this.zzZFt, 4194304, new ArrayList());
        com.aspose.words.internal.zzZQF.zzY(this.zzZFt, 8388608, new ArrayList());
        com.aspose.words.internal.zzZQF.zzY(this.zzZFt, 16777216, new ArrayList());
    }

    private ArrayList<com.aspose.words.internal.zzZL> zzC(ArrayList<zz8> arrayList) throws Exception {
        zzYBT.zzS(arrayList);
        ArrayList<com.aspose.words.internal.zzZL> arrayList2 = new ArrayList<>();
        for (zz8 zz8Var : arrayList) {
            com.aspose.words.internal.zzZL zzzlZzY = zzY(zz8Var);
            zz8Var.zzbA().zzZ6();
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzzlZzY);
        }
        return arrayList2;
    }

    private com.aspose.words.internal.zzP9 zzN(com.aspose.words.internal.zz7 zz7Var) {
        com.aspose.words.internal.zzP9 zzp9ZzZO;
        if (zz7Var == this.zzZFS) {
            return null;
        }
        com.aspose.words.internal.zzP9 zzp9ZzN = zzN(zz7Var.zzZ5());
        com.aspose.words.internal.zzHR zzhr = (com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(zz7Var, com.aspose.words.internal.zzHR.class);
        if (zzhr == null || (zzp9ZzZO = zzhr.zzZO()) == null) {
            return zzp9ZzN;
        }
        if (zzp9ZzN == null) {
            return zzp9ZzZO;
        }
        com.aspose.words.internal.zzP9 zzp9ZzOh = zzp9ZzN.zzOh();
        zzp9ZzOh.zzZ(zzp9ZzZO, 0);
        return zzp9ZzOh;
    }

    private void zzO(com.aspose.words.internal.zz7 zz7Var) throws Exception {
        for (int i = 0; i < zz7Var.getCount(); i++) {
            com.aspose.words.internal.zzZS zzzs = (com.aspose.words.internal.zzZS) com.aspose.words.internal.zzZKW.zzZ(zz7Var.zzN(i), com.aspose.words.internal.zzZS.class);
            if (zzzs != null) {
                Ref ref = new Ref(null);
                com.aspose.words.internal.zzZQF.zzZ(this.zzZFt, Integer.valueOf(zzzs.zzZg()), ref);
                ArrayList<zz8> arrayList = (ArrayList) ref.get();
                if (arrayList != null && arrayList.size() > 0) {
                    zzzs.zzZ(zzC(arrayList));
                }
            }
        }
    }

    public static void zzP(com.aspose.words.internal.zz7 zz7Var) throws Exception {
        zz7Var.zzZ(new zz7(zz7Var));
    }

    private boolean zzU(com.aspose.words.internal.zzZS zzzs) throws Exception {
        zz8 zz8Var = (zz8) com.aspose.words.internal.zzZKW.zzZ(zzzs.getTag(), zz8.class);
        if (zz8Var == null || !zz8Var.zzbx().zzYRz()) {
            return false;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZFt.get(Integer.valueOf(zzZ(zz8Var))), zz8Var);
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzZH zzzh) throws Exception {
        if (zzzh == this.zzZFS) {
            zzO(zzzh);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(com.aspose.words.internal.zzZS zzzs) throws Exception {
        return (zzzs.zzZg() == 33554432 && zzU(zzzs)) ? false : true;
    }

    private static int zzZ(zz8 zz8Var) {
        if (zz8Var.zzbD()) {
            if (zz8Var.zzbC()) {
                return 4194304;
            }
            return zz8Var.zzbB() ? 8388608 : 16777216;
        }
        if (zz8Var.zzbC()) {
            return 524288;
        }
        return zz8Var.zzbB() ? 1048576 : 2097152;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) throws Exception {
        if (zzg == this.zzZFS) {
            zzO(zzg);
        }
    }

    private com.aspose.words.internal.zzZL zzY(zz8 zz8Var) throws Exception {
        com.aspose.words.internal.zzP9 zzp9ZzN;
        zz8Var.zzbA().getCount();
        com.aspose.words.internal.zzZL zzzlZzN = zz8Var.zzbA().zzN(0);
        if (!zz8Var.zzbz().isInline() || (zzp9ZzN = zzN(zz8Var.zzbJ().zzZ5())) == null || zzp9ZzN.isIdentity()) {
            return zzzlZzN;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(zzp9ZzN);
        zzg.zzX(zzzlZzN);
        if (zz8Var.zzbw() != null) {
            zzZ(zz8Var, zzg);
        }
        return zzg;
    }

    private static void zzZ(zz8 zz8Var, com.aspose.words.internal.zzG zzg) {
        if (!zz8Var.zzbK()) {
            zzg.zzZ(zz8Var.zzbw());
            return;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.OooO0O0.OooO00o(zzg2);
        zzg2.zzZ(com.aspose.words.internal.zzP8.zzM(((com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(zz8Var.zzbJ(), com.aspose.words.internal.zzHR.class)).zzZO().zzO(zz8Var.zzbL())));
        zzg2.zzZ(zz8Var.zzbw());
        zzg.zzX((com.aspose.words.internal.zzZL) zzg2);
    }
}
