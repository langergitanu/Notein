package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzNY {
    private HashMap<String, ArrayList<zzPS>> zzZpH = new HashMap<>();
    private zzME[] zzZpI;
    private int zzZr3;

    public zzNY(Collection<zzLT> collection, int i) {
        this.zzZr3 = i;
        ArrayList arrayList = new ArrayList(collection.size());
        for (zzLT zzlt : collection) {
            if (!zzZ(zzlt)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzME>) arrayList, new zzME(zzlt, i));
            } else if (zzlt.zzZUV().length > 1) {
                ArrayList arrayList2 = new ArrayList();
                for (zzMD zzmd : zzlt.zzZUV()) {
                    if (!(zzmd instanceof zzOU)) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzMD>) arrayList2, zzmd);
                    }
                }
                if (arrayList2.size() > 0) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzME>) arrayList, new zzME(new zzLT((zzMD[]) arrayList2.toArray(new zzMD[0]), zzlt.zzZWe()), i));
                }
            }
        }
        this.zzZpI = (zzME[]) arrayList.toArray(new zzME[0]);
    }

    private String zzSs(String str) {
        return this.zzZr3 == 2 ? com.aspose.words.internal.zzZKN.zzU2(str) : str;
    }

    private zzNZ zzX(zzZBM zzzbm) {
        String strZzKM = zzzbm.zzKM("id");
        zzNZ zznz = null;
        if (strZzKM != null) {
            String strZzSs = zzSs(strZzKM);
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZpH, strZzSs, ref);
            ArrayList<zzPS> arrayList = (ArrayList) ref.get();
            if (zZzZ) {
                zznz = new zzNZ();
                zzOU zzou = new zzOU(strZzSs);
                for (zzPS zzps : arrayList) {
                    ArrayList<zzMD> arrayList2 = new ArrayList<>();
                    arrayList2.add(zzou);
                    zznz.zzZ(arrayList2, zzps);
                }
            }
        }
        return zznz;
    }

    private boolean zzZ(zzLT zzlt) {
        boolean z = false;
        for (zzMD zzmd : zzlt.zzZUV()) {
            if (zzmd instanceof zzOU) {
                String strZzSs = zzSs(((zzOU) zzmd).getId());
                Ref ref = new Ref(null);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZpH, strZzSs, ref);
                ArrayList arrayList = (ArrayList) ref.get();
                if (!zZzZ) {
                    arrayList = new ArrayList();
                    com.aspose.words.internal.zzZQF.zzY(this.zzZpH, strZzSs, arrayList);
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzPS>) arrayList, zzlt.zzZWe());
                z = true;
            }
        }
        return z;
    }

    public final zzNZ zzY(zzZBM zzzbm) {
        zzNZ zznzZzX = zzX(zzzbm);
        for (zzME zzme : this.zzZpI) {
            ArrayList<zzMD> arrayListZzQ = zzme.zzQ(zzzbm);
            if (arrayListZzQ != null) {
                if (zznzZzX == null) {
                    zznzZzX = new zzNZ();
                }
                zznzZzX.zzZ(arrayListZzQ, zzme.zzZWe());
            }
        }
        return zznzZzX == null ? zzNZ.zzZpM : zznzZzX;
    }

    public final void zzZP() {
        for (zzME zzme : this.zzZpI) {
            zzme.zzZP();
        }
    }
}
