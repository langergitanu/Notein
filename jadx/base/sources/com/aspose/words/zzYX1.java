package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYX1 {
    private ArrayList<zzYX2> zzXWN = new ArrayList<>();
    private HashMap<String, ArrayList<zzYX2>> zzXWM = new HashMap<>();
    private HashMap<Section, ArrayList<zzYX2>> zzXWL = new HashMap<>();

    private void zzM(Section section) {
        Section section2 = (Section) section.zztC(2);
        if (section2 == null) {
            return;
        }
        zzZ(section, section2, 1);
        zzZ(section, section2, 4);
        zzZ(section, section2, 3);
        zzZ(section, section2, 5);
    }

    private zzYX2 zzX(Section section, int i) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzXWL, section, ref);
        ArrayList<zzYX2> arrayList = (ArrayList) ref.get();
        if (!zZzZ) {
            return null;
        }
        for (zzYX2 zzyx2 : arrayList) {
            if (zzyx2.getType() == i) {
                return zzyx2;
            }
        }
        return null;
    }

    public final zzYX2[] zzHH(String str) {
        ArrayList<zzYX2> arrayList = this.zzXWM.get(str);
        return arrayList != null ? (zzYX2[]) arrayList.toArray(new zzYX2[0]) : new zzYX2[0];
    }

    public final String[] zzYBv() {
        String[] strArr = new String[this.zzXWM.size()];
        com.aspose.words.internal.zzZQG.zzZ(this.zzXWM.keySet(), strArr);
        return strArr;
    }

    public final zzYX2[] zzYBw() {
        return (zzYX2[]) this.zzXWN.toArray(new zzYX2[0]);
    }

    public final void zzZ(zzPS zzps, Section section) {
        if (zzps == null) {
            return;
        }
        zzZ(zzps.zzSx("mso-header"), 1, section);
        zzZ(zzps.zzSx("mso-first-header"), 4, section);
        zzZ(zzps.zzSx("mso-even-header"), 0, section);
        zzZ(zzps.zzSx("mso-footer"), 3, section);
        zzZ(zzps.zzSx("mso-first-footer"), 5, section);
        zzZ(zzps.zzSx("mso-even-footer"), 2, section);
    }

    public final void zzh(Document document) {
        for (Section firstSection = document.getFirstSection(); firstSection != null; firstSection = (Section) firstSection.zztD(2)) {
            zzM(firstSection);
        }
    }

    private void zzZ(Section section, Section section2, int i) {
        zzYX2 zzyx2ZzX;
        zzYX2 zzyx2ZzX2 = zzX(section, i);
        if (zzyx2ZzX2 == null || (zzyx2ZzX = zzX(section2, i)) == null || !zzyx2ZzX2.zzYBy().equals(zzyx2ZzX.zzYBy())) {
            return;
        }
        zzyx2ZzX2.zzYBz();
    }

    private void zzZ(zzPT zzpt, int i, Section section) {
        zzYX0 zzyx0ZzR;
        if (zzpt == null || (zzyx0ZzR = zzYX0.zzR(zzpt.zzZWj())) == null) {
            return;
        }
        zzZ(zzyx0ZzR, i, section);
    }

    private void zzZ(zzYX0 zzyx0, int i, Section section) {
        ArrayList<zzYX2> arrayList;
        zzYX2 zzyx2 = new zzYX2(zzyx0, i, section);
        if (zzyx0.getUrl().length() == 0) {
            arrayList = this.zzXWN;
        } else {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzXWM, zzyx0.getUrl(), ref);
            ArrayList<zzYX2> arrayList2 = (ArrayList) ref.get();
            if (!zZzZ) {
                arrayList2 = new ArrayList<>();
                com.aspose.words.internal.zzZQF.zzY(this.zzXWM, zzyx0.getUrl(), arrayList2);
            }
            arrayList = arrayList2;
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyx2);
        Ref ref2 = new Ref(arrayList);
        boolean zZzZ2 = com.aspose.words.internal.zzZQF.zzZ(this.zzXWL, section, ref2);
        ArrayList arrayList3 = (ArrayList) ref2.get();
        if (!zZzZ2) {
            arrayList3 = new ArrayList();
            com.aspose.words.internal.zzZQF.zzY(this.zzXWL, section, arrayList3);
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYX2>) arrayList3, zzyx2);
    }
}
