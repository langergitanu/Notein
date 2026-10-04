package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQG implements zzZBH {
    private boolean zzYEo;
    private boolean zzYEp;
    private boolean zzYEq;

    public zzZQG() {
        this(false);
    }

    @Override // com.aspose.words.zzZBH
    public final boolean zzZ(char c, String str, int i, StringBuilder sb) {
        return false;
    }

    public zzZQG(boolean z) {
        this(z, true);
    }

    @Override // com.aspose.words.zzZBH
    public final ArrayList<Object> zzZ(ArrayList<Object> arrayList, zzZQM zzzqm) throws Exception {
        zzZBJ zzzbjZzZ;
        if (arrayList.size() == 0 || (!this.zzYEp && !this.zzYEo)) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = new ArrayList<>(arrayList.size());
        for (Object obj : arrayList) {
            zzY94 zzy94 = (zzY94) com.aspose.words.internal.zzZKW.zzZ(obj, zzY94.class);
            if (zzy94 == null || (zzzbjZzZ = zzZ(zzy94.zz8W(), zzzqm)) == null) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, obj);
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZBJ>) arrayList2, zzzbjZzZ);
            }
        }
        return arrayList2;
    }

    public zzZQG(boolean z, boolean z2) {
        this.zzYEq = z;
        this.zzYEp = true;
        this.zzYEo = z2;
    }

    @Override // com.aspose.words.zzZBH
    public final zzZSM zzZ(zzZSM zzzsm, zzZQM zzzqm, String str) {
        if (zzzsm.getCount() == 1) {
            zzZBJ zzzbjZzZi1 = zzzsm.zzZi1();
            zzY94 zzy94 = (zzY94) com.aspose.words.internal.zzZKW.zzZ(zzzbjZzZi1, zzY94.class);
            if (zzy94 != null) {
                if (this.zzYEq) {
                    zzzbjZzZi1 = new zzY7(zzzqm, zzy94.zz8W());
                } else {
                    zzzbjZzZi1 = new zzY94(str);
                }
            }
            zzzsm.zzY(zzzbjZzZi1);
        }
        return zzzsm;
    }

    private zzZBJ zzZ(String str, zzZQM zzzqm) throws Exception {
        zzZBJ zzzbjZzZ = this.zzYEo ? zzWL.zzZ(zzzqm, str, false) : null;
        return (!(com.aspose.words.internal.zzZYD.zzXk(str) && Character.isDigit(str.charAt(0))) && this.zzYEp && zzzqm.zzLZ(str)) ? new zzY7(zzzqm, str) : zzzbjZzZ;
    }
}
