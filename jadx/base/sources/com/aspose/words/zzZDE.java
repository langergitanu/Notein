package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDE extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zzG zzbp;
    private com.aspose.words.internal.zzZQH<Integer, ArrayList<zzZDD>> zzYka = new com.aspose.words.internal.zzZQH<>();
    private int zzYw = -1;
    private int zzYk9 = -1;

    private zzZDE(com.aspose.words.internal.zzG zzg) {
        this.zzbp = zzg;
    }

    public static ArrayList<zzZDD> zz8(com.aspose.words.internal.zzG zzg) throws Exception {
        zzZDE zzzde = new zzZDE(zzg);
        zzg.zzZ(zzzde);
        return zzzde.zzYX9();
    }

    private static com.aspose.words.internal.zzZR zzC(com.aspose.words.internal.zzZL zzzl) {
        if (zzzl instanceof com.aspose.words.internal.zzZU) {
            return ((com.aspose.words.internal.zzZU) zzzl).zzZl();
        }
        if (zzzl instanceof com.aspose.words.internal.zzG) {
            return (com.aspose.words.internal.zzZR) com.aspose.words.internal.zzZKW.zzZ(((com.aspose.words.internal.zzG) zzzl).zzZM(), com.aspose.words.internal.zzZR.class);
        }
        return null;
    }

    private ArrayList<zzZDD> zzYX9() {
        ArrayList<zzZDD> arrayList = new ArrayList<>();
        for (int count = this.zzYka.getCount() - 1; count >= 0; count--) {
            ArrayList<zzZDD> arrayList2 = this.zzYka.zzl9().get(count);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, arrayList2.get(size));
            }
        }
        return arrayList;
    }

    private boolean zzYXa() {
        return this.zzYk9 >= 0;
    }

    private void zzYXb() {
        if (zzYXa()) {
            return;
        }
        this.zzYk9 = this.zzYw;
    }

    private void zzZa(com.aspose.words.internal.zzZQ4 zzzq4) {
        for (int i = 0; i < this.zzYka.getCount(); i++) {
            Integer num = this.zzYka.getKeys().get(i);
            if (num.intValue() <= this.zzYw) {
                Iterator<zzZDD> it = this.zzYka.get(num).iterator();
                while (it.hasNext()) {
                    it.next().zzZa(zzzq4);
                }
            }
        }
    }

    private ArrayList<zzZDD> zzyx(int i) {
        Ref<ArrayList<zzZDD>> ref = new Ref<>(null);
        boolean zZzY = this.zzYka.zzY(Integer.valueOf(this.zzYw), ref);
        ArrayList<zzZDD> arrayList = ref.get();
        if (zZzY) {
            return arrayList;
        }
        ArrayList<zzZDD> arrayList2 = new ArrayList<>();
        this.zzYka.zzB(Integer.valueOf(i), arrayList2);
        return arrayList2;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) throws Exception {
        int i = this.zzYw;
        if (i == this.zzYk9) {
            this.zzYk9 = -1;
        }
        this.zzYw = i - 1;
        super.zzY(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) throws Exception {
        this.zzYw++;
        super.zzZ(zzg);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzg, this.zzbp);
        if (!zzYXa()) {
            zzZa(zzzq4ZzZ);
        }
        if (zzg.zzZM() == null) {
            return;
        }
        zzZ(zzg, zzzq4ZzZ);
        zzYXb();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZU zzzu) throws Exception {
        if (zzzu.isHidden() || zzzu.zzZl() == null) {
            return;
        }
        this.zzYw++;
        zzZ(zzzu, zzZ(zzzu, this.zzbp));
        this.zzYw--;
    }

    private void zzZ(com.aspose.words.internal.zzZL zzzl, com.aspose.words.internal.zzZQ4 zzzq4) {
        ArrayList<zzZDD> arrayListZzyx = zzyx(this.zzYw);
        com.aspose.words.internal.zzZR zzzrZzC = zzC(zzzl);
        if (zzzrZzC == null) {
            return;
        }
        String target = zzzrZzC.getTarget();
        if (zzzrZzC.zzZf()) {
            target = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("#", target);
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayListZzyx, new zzZDD(target, zzzq4));
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZL zzzl, com.aspose.words.internal.zzZL zzzl2) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ(zzzl);
        long jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzZm(), zzzq4ZzZ.zzZo());
        for (com.aspose.words.internal.zz7 zz7VarZzZ5 = zzzl.zzZ5(); zz7VarZzZ5 != null && zz7VarZzZ5 != zzzl2; zz7VarZzZ5 = zz7VarZzZ5.zzZ5()) {
            if (zz7VarZzZ5 instanceof com.aspose.words.internal.zzHU) {
                com.aspose.words.internal.zzHU zzhu = (com.aspose.words.internal.zzHU) zz7VarZzZ5;
                if (zzhu.zzZO() != null) {
                    com.aspose.words.internal.zzP9 zzp9ZzZO = zzhu.zzZO();
                    jZzG = com.aspose.words.internal.zzZPY.zzG(zzp9ZzZO.zzOb() + Float.intBitsToFloat((int) jZzG), zzp9ZzZO.zzOa() + com.aspose.words.internal.zzZPY.zzYC(jZzG));
                }
            }
        }
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) jZzG), com.aspose.words.internal.zzZPY.zzYC(jZzG), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight());
    }
}
