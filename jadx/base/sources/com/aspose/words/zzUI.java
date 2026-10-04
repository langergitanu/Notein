package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
class zzUI extends zzYCT {
    private zzUN zzZuS;

    @Override // com.aspose.words.zzZ6T
    public final zzZ6T zz6u() {
        return new zzUI();
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzZuS;
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzZuS;
    }

    @Override // com.aspose.words.zzYCT, com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) {
        int iZz60 = zzymd.zz60();
        if (iZz60 != 8 && iZz60 != 32) {
            throw new IllegalStateException("Unexpected part type.");
        }
        if (this.zzZuS == null) {
            zzUN zzun = new zzUN();
            this.zzZuS = zzun;
            zzun.zzZ(this);
        }
        return this.zzZuS;
    }

    public final void zzZ(zzYAQ zzyaq) throws Exception {
        zzZ4N zzz4nZzYPe = ((zzY9C) zza9()).zzY4s().zzYPe();
        zzz4nZzYPe.zzX(((zzYMM) zzZXY()).zzZ9r());
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        do {
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            zzYAU zzyauZzY71 = zzyau.zzY71();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAU>) arrayList, zzyauZzY71);
            com.aspose.words.internal.zzZQF.zzY(map, zzyau, zzyauZzY71);
            if (!zzz4nZzYPe.movePrevious()) {
                break;
            }
        } while (!zzY9R.zzmT(((zzYAU) zzz4nZzYPe.zzYPi()).zzZo6()));
        arrayList.size();
        zzY9B zzy9b = new zzY9B((zzY9C) zza9());
        int size = arrayList.size() - 1;
        zzYAU zzyau2 = null;
        while (size >= 0) {
            zzz4nZzYPe.moveNext();
            zzYAU zzyau3 = (zzYAU) zzz4nZzYPe.zzYPi();
            zzYAU zzyau4 = (zzYAU) arrayList.get(size);
            zzy9b.zzD(zzyau2, zzyau4);
            zzyau4.zzZ(map, zzyau3);
            size--;
            zzyau2 = zzyau4;
        }
        zzyau2.zzZx(zzyaq);
        zzyaq.zzZx(zzyau2);
        zzy9b.commit();
    }

    public final zzYAQ zzZZC() {
        return (zzYAQ) zzYc6();
    }
}
