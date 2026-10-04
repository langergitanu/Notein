package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzJV {
    private zzU8 zzZGE;
    private int zzZiT;
    private zzX9 zzZiU;
    private zzX9 zzZiV;
    private zzU5 zzZiW;
    private zzU5 zzZiX;
    private int zzZiY;
    private int zzZiZ;

    public zzJV(zzU5 zzu5, zzU5 zzu52, zzU8 zzu8) {
        this.zzZiX = zzu5;
        this.zzZiW = zzu52;
        this.zzZGE = zzu8;
    }

    private static boolean zz3(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int iZzZr = zzU7.zzZr(cCharAt);
            if (cCharAt != 57613 && cCharAt != 57614 && iZzZr != 6 && iZzZr != 3) {
                return false;
            }
            i++;
        }
        return true;
    }

    private void zzLM(int i) throws Exception {
        int i2 = 0;
        while (i > 0) {
            int i3 = this.zzZiZ + i2;
            char c = this.zzZiX.zzYAc().get(i3);
            if (!zzU7.zzZq(c) || this.zzZiX.zztx(i3).getNodeType() == 21) {
                i2++;
            } else {
                zzLR(i2);
                zzZ8(c);
                i2 = 0;
            }
            i--;
        }
        zzLR(i2);
    }

    private int zzLN(int i) throws Exception {
        int i2 = 0;
        int iZzZ9 = 0;
        while (i > 0) {
            int i3 = this.zzZiY + i2;
            char c = this.zzZiW.zzYAc().get(i3);
            if (!zzU7.zzZq(c) || this.zzZiW.zztx(i3).getNodeType() == 21) {
                i2++;
            } else {
                if (i2 > 0) {
                    iZzZ9 += zzLS(i2);
                }
                iZzZ9 += zzZ9(c);
                i2 = 0;
            }
            i--;
        }
        return i2 > 0 ? iZzZ9 + zzLS(i2) : iZzZ9;
    }

    private void zzLO(int i) throws Exception {
        int i2 = 0;
        while (i > 0) {
            int i3 = this.zzZiY + i2;
            char c = this.zzZiW.zzYAc().get(i3);
            if (!zzU7.zzZq(c) || this.zzZiW.zztx(i3).getNodeType() == 21) {
                i2++;
            } else {
                zzLQ(i2);
                zzZ7(c);
                i2 = 0;
            }
            i--;
        }
        zzLQ(i2);
    }

    private void zzLP(int i) throws Exception {
        String strSubstring = this.zzZiX.zzYAc().substring(this.zzZiZ, i);
        String strSubstring2 = this.zzZiW.zzYAc().substring(this.zzZiY, i);
        if (this.zzZGE.zzZup.getIgnoreCaseChanges()) {
            strSubstring = strSubstring.toLowerCase();
        }
        if (this.zzZGE.zzZup.getIgnoreCaseChanges()) {
            strSubstring2 = strSubstring2.toLowerCase();
        }
        String strZzZ = com.aspose.words.internal.zzZKN.zzZ(strSubstring, (char) 57614, (char) 57613);
        String strZzZ2 = com.aspose.words.internal.zzZKN.zzZ(strSubstring2, (char) 57614, (char) 57613);
        if (!com.aspose.words.internal.zzZKN.equals(strZzZ, strZzZ2) && (!zzRP(strZzZ) || !zzRP(strZzZ2))) {
            throw new IllegalStateException("NC sync failed.");
        }
        zzLO(i);
    }

    private boolean zzN(ArrayList<zzJS> arrayList, int i) throws Exception {
        zzJS zzjs = arrayList.get(i);
        zzJS zzjs2 = arrayList.get(i + 1);
        return this.zzZGE.zzZup.getGranularity() == 0 ? zzZ(arrayList, i, zzjs, zzjs2) : zzY(arrayList, i, zzjs, zzjs2);
    }

    private static boolean zzRP(String str) {
        return str.length() == 1 && zzU7.zzZp(str.charAt(0));
    }

    private boolean zzU(int i, int i2, String str) {
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (zzU7.zzZo(str.charAt(i4))) {
                i3++;
                int i5 = i + i2 + i4;
                Paragraph paragraph = (Paragraph) this.zzZiX.zztx(i5);
                int iZztw = this.zzZiX.zztw(i5) - (paragraph.getText().length() - 1);
                if (!zzN(paragraph) && (iZztw < i || i3 > 1 || !zz3(str, i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean zzV(int i, int i2, String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (zzU7.zzZq(cCharAt) && cCharAt != 57613 && cCharAt != 57614) {
                return false;
            }
        }
        return this.zzZGE.zzZup.getGranularity() != 1 || zzU(i, i2, str);
    }

    private zzJS zzW(zzJS zzjs) {
        zzJS zzjs2 = new zzJS();
        zzX7 zzx7 = (zzX7) (zzjs.zzZiQ >= this.zzZiV.getCount() ? null : this.zzZiV.zzOH(zzjs.zzZiQ));
        zzX7 zzx72 = (zzX7) (zzjs.zzZiP < this.zzZiU.getCount() ? this.zzZiU.zzOH(zzjs.zzZiP) : null);
        zzjs2.zzZiQ = zzx7 == null ? zzY(this.zzZiV) : zzx7.zzZAO;
        zzjs2.zzZiP = zzx72 == null ? zzY(this.zzZiU) : zzx72.zzZAO;
        if (zzx7 != null) {
            for (int i = 0; i < zzjs.zzZiO; i++) {
                zzjs2.zzZiO += ((zzX7) this.zzZiV.zzOH(zzjs.zzZiQ + i)).zzci;
            }
        }
        if (zzx72 != null) {
            for (int i2 = 0; i2 < zzjs.zzZiN; i2++) {
                zzjs2.zzZiN += ((zzX7) this.zzZiU.zzOH(zzjs.zzZiP + i2)).zzci;
            }
        }
        return zzjs2;
    }

    private void zzX(zzJS zzjs) throws Exception {
        int i = this.zzZiT + zzjs.zzZiQ;
        int i2 = zzjs.zzZiO;
        String strSubstring = this.zzZiX.zzYAc().substring(i, i2);
        int i3 = zzjs.zzZiP;
        int i4 = zzjs.zzZiN;
        String strSubstring2 = this.zzZiW.zzYAc().substring(i3, i4);
        if (zzRP(strSubstring) && zzRP(strSubstring2)) {
            zzLP(1);
            return;
        }
        if (i2 > 0) {
            if (this.zzZiZ != i) {
                throw new IllegalStateException("DEL sync failed.");
            }
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("-(A:{0}|{3} L:{1}) '{2}'", Integer.valueOf(i), Integer.valueOf(i2), zzU6.zzST(strSubstring), Integer.valueOf(zzjs.zzZiQ)));
            zzLM(i2);
            if (this.zzZiZ != i + zzjs.zzZiO) {
                throw new IllegalStateException("DEL sync failed.");
            }
        }
        if (i4 > 0) {
            int i5 = this.zzZiT + zzjs.zzZiQ + zzjs.zzZiO;
            if (this.zzZiZ != i5 || this.zzZiY != i3) {
                throw new IllegalStateException("INS sync failed.");
            }
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("+(A:{0}|{4} B:{1}|{5} L:{2}) '{3}'", Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(i4), zzU6.zzST(strSubstring2), Integer.valueOf(zzjs.zzZiQ), Integer.valueOf(zzjs.zzZiP)));
            int iZzLN = zzLN(i4);
            this.zzZiT += iZzLN;
            if (this.zzZiZ != i5 + iZzLN || this.zzZiY != i3 + zzjs.zzZiN) {
                throw new IllegalStateException("INS sync failed.");
            }
        }
    }

    private void zzY(zzJS zzjs) {
        while (zzjs.zzZiO > 0 && zzjs.zzZiN > 0) {
            char c = this.zzZiX.zzYAc().get((zzjs.zzZiQ + zzjs.zzZiO) - 1);
            char c2 = this.zzZiW.zzYAc().get((zzjs.zzZiP + zzjs.zzZiN) - 1);
            if (!zzU7.zzZo(c) || !zzU7.zzZo(c2)) {
                return;
            }
            zzjs.zzZiO--;
            zzjs.zzZiN--;
        }
    }

    private void zzZ(zzJS zzjs, zzJS zzjs2) throws Exception {
        int i;
        if (!zzjs.zzZSC() || (i = zzjs.zzZiP) == 0) {
            return;
        }
        int i2 = i - 1;
        int i3 = 0;
        int i4 = 0;
        while (i2 > 0) {
            i2 = (zzjs.zzZiP - 1) - i3;
            zzX7 zzx7 = (zzX7) this.zzZiU.zzOH(i2);
            zzX7 zzx72 = (zzX7) this.zzZiU.zzOH(zzjs.zzZiN + i2);
            boolean z = zzjs2.zzZiQ + zzjs2.zzZiO >= zzjs.zzZiQ - i3;
            if (zzx7.zze0 != zzx72.zze0 || zzx7.zz6X() || z) {
                break;
            }
            i3++;
            i4 += zzx7.zzci;
        }
        if (i3 <= 0 || i4 <= 1) {
            return;
        }
        String str = com.aspose.words.internal.zzZKN.format("Prev: {0}; Original: {1}; ", zzjs2, zzjs);
        zzjs.zzZiQ -= i3;
        zzjs.zzZiP -= i3;
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{0}Modified: {1}; Count: {2};", str, zzjs, Integer.valueOf(i3)));
    }

    private ArrayList<zzJS> zzZSR() throws Exception {
        HashMap map = new HashMap();
        this.zzZiV = zzX7.zzZ(this.zzZiX.zzYAc(), map, this.zzZGE.zzZup);
        zzX9 zzx9ZzZ = zzX7.zzZ(this.zzZiW.zzYAc(), map, this.zzZGE.zzZup);
        this.zzZiU = zzx9ZzZ;
        ArrayList<zzJS> arrayListZzY = zzY(this.zzZiV, zzx9ZzZ, map);
        zzk(arrayListZzY);
        ArrayList<zzJS> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayListZzY.size(); i++) {
            zzJS zzjs = arrayListZzY.get(i);
            if (i > 0) {
                zzZ(zzjs, arrayListZzY.get(i - 1));
            }
            zzZ(zzjs);
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzW(zzjs));
        }
        return arrayList;
    }

    private ArrayList<zzJS> zzZSS() throws Exception {
        ArrayList<zzJS> arrayListZzZ = zzJT.zzZ(this.zzZiX.zzYAc(), this.zzZiW.zzYAc(), this.zzZGE.zzZup.getIgnoreCaseChanges());
        Iterator<zzJS> it = arrayListZzZ.iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
        zzk(arrayListZzZ);
        return arrayListZzZ;
    }

    private void zzj(ArrayList<zzJS> arrayList) throws Exception {
        int i = 0;
        while (i < arrayList.size() - 1) {
            if (!zzN(arrayList, i)) {
                i++;
            }
        }
    }

    private void zzk(ArrayList<zzJS> arrayList) throws Exception {
        int size = arrayList.size();
        zzU6.zzSU("{Optimizer}");
        zzU6.zzZZ2();
        zzj(arrayList);
        zzU6.zzZZ1();
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{{Optimizer result: {0}->{1}}}", Integer.valueOf(size), Integer.valueOf(arrayList.size())));
    }

    public final void zzLK(int i) {
        this.zzZiY = i;
    }

    public final void zzLL(int i) {
        this.zzZiZ = i;
    }

    public abstract void zzLQ(int i) throws Exception;

    public abstract void zzLR(int i) throws Exception;

    public abstract int zzLS(int i) throws Exception;

    public abstract void zzZ7(char c) throws Exception;

    public abstract void zzZ8(char c);

    public abstract int zzZ9(char c) throws Exception;

    public final zzU5 zzZSD() {
        return this.zzZiW;
    }

    public final zzU5 zzZSE() {
        return this.zzZiX;
    }

    public final int zzZSF() {
        int i = this.zzZiY;
        return i - this.zzZiW.zztw(i);
    }

    public final int zzZSG() {
        int i = this.zzZiZ;
        return i - this.zzZiX.zztw(i);
    }

    public final String zzZSH() {
        return zzU6.zzZ(this.zzZiW.zzYAc());
    }

    public final String zzZSI() {
        return zzU6.zzZ(this.zzZiX.zzYAc());
    }

    public final int zzZSJ() {
        return this.zzZiY;
    }

    public final int zzZSK() {
        return this.zzZiZ;
    }

    public final Node zzZSL() {
        return this.zzZiW.zztx(this.zzZiY);
    }

    public final Node zzZSM() {
        return this.zzZiX.zztx(this.zzZiZ);
    }

    public final boolean zzZSN() {
        return this.zzZiZ >= this.zzZiX.zzYAc().getLength();
    }

    public abstract boolean zzZSO();

    public final void zzZSP() throws Exception {
        this.zzZiX.update();
    }

    public final void zzZSQ() throws Exception {
        ArrayList<zzJS> arrayList = new ArrayList<>();
        if (this.zzZiX.zzYAc() != this.zzZiW.zzYAc()) {
            arrayList = this.zzZGE.zzZup.getGranularity() == 1 ? zzZSR() : zzZSS();
        }
        for (zzJS zzjs : arrayList) {
            int i = (this.zzZiT + zzjs.zzZiQ) - this.zzZiZ;
            if (i > 0) {
                zzLP(i);
            }
            zzX(zzjs);
        }
        int length = this.zzZiX.zzYAc().getLength() - this.zzZiZ;
        if (length > 0) {
            zzLP(length);
        }
    }

    private static boolean zzN(Paragraph paragraph) {
        String text = paragraph.getText();
        for (int i = 0; i < text.length(); i++) {
            char cCharAt = text.charAt(i);
            int iZzZr = zzU7.zzZr(cCharAt);
            if (cCharAt != 57613 && cCharAt != 57614 && iZzZr != 6 && iZzZr != 3) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<zzJS> zzY(zzX9 zzx9, zzX9 zzx92, Map<String, Integer> map) {
        if (zzZSO()) {
            return zzZ(zzx9, zzx92, map);
        }
        return zzJT.zzZ(zzZ(zzx9), zzZ(zzx92), zzx9, zzx92);
    }

    private void zzZ(zzJS zzjs) throws Exception {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (zzjs.zzZiO > 0 && zzjs.zzZiN > 0) {
                zzX7 zzx7 = (zzX7) this.zzZiV.zzOH((zzjs.zzZiQ + r2) - 1);
                zzX7 zzx72 = (zzX7) this.zzZiU.zzOH((zzjs.zzZiP + zzjs.zzZiN) - 1);
                if (zzx7.zz6U() && zzx72.zz6U()) {
                    if (!zzx7.zz6V() && !zzx72.zz6V()) {
                        break;
                    }
                    zzjs.zzZiO--;
                    zzjs.zzZiN--;
                    com.aspose.words.internal.zzZNH.zzU(sb, zzU6.zzST(zzx7.zzZAL));
                    com.aspose.words.internal.zzZNH.zzU(sb2, zzU6.zzST(zzx72.zzZAL));
                } else {
                    if (zzx7.zze0 != zzx72.zze0) {
                        break;
                    }
                    zzjs.zzZiO--;
                    zzjs.zzZiN--;
                    com.aspose.words.internal.zzZNH.zzU(sb, zzU6.zzST(zzx7.zzZAL));
                    com.aspose.words.internal.zzZNH.zzU(sb2, zzU6.zzST(zzx72.zzZAL));
                }
            } else {
                break;
            }
        }
        if (sb.length() > 0 || sb2.length() > 0) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Removed at the end: '{0}'/'{1}", sb, sb2));
        }
    }

    private static int zzY(zzX9 zzx9) {
        if (zzx9.getCount() == 0) {
            return 0;
        }
        zzX7 zzx7 = (zzX7) zzx9.zzOH(zzx9.getCount() - 1);
        return zzx7.zzZAO + zzx7.zzci;
    }

    private boolean zzY(ArrayList<zzJS> arrayList, int i, zzJS zzjs, zzJS zzjs2) throws Exception {
        zzJS zzjsZzW = zzW(zzjs);
        zzJS zzjsZzW2 = zzW(zzjs2);
        String strSubstring = this.zzZiX.zzYAc().substring(zzjsZzW.zzZiQ + zzjsZzW.zzZiO, zzjsZzW2.zzZiQ - (zzjsZzW.zzZiQ + zzjsZzW.zzZiO));
        String strSubstring2 = this.zzZiX.zzYAc().substring(zzjsZzW.zzZiQ, zzjsZzW.zzZiO);
        String strSubstring3 = this.zzZiW.zzYAc().substring(zzjsZzW.zzZiP, zzjsZzW.zzZiN);
        String strSubstring4 = this.zzZiX.zzYAc().substring(zzjsZzW2.zzZiQ, zzjsZzW2.zzZiO);
        String strSubstring5 = this.zzZiW.zzYAc().substring(zzjsZzW2.zzZiP, zzjsZzW2.zzZiN);
        int length = strSubstring2.length();
        int length2 = strSubstring3.length();
        int length3 = strSubstring4.length();
        int length4 = strSubstring5.length();
        int length5 = strSubstring.length();
        if (zzU6.zzZtG) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("-'{0}'{{L:{1}}}", zzU6.zzST(strSubstring2), Integer.valueOf(length)));
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("+'{0}'{{L:{1}}}", zzU6.zzST(strSubstring3), Integer.valueOf(length2)));
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("='{0}'{{L:{1}}}", zzU6.zzST(strSubstring), Integer.valueOf(length5)));
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("-'{0}'{{L:{1}}}", zzU6.zzST(strSubstring4), Integer.valueOf(length3)));
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("+'{0}'{{L:{1}}}", zzU6.zzST(strSubstring5), Integer.valueOf(length4)));
        }
        int i2 = length + length3;
        int i3 = length2 + length4;
        int i4 = i3 + i2;
        if (zzV(zzjsZzW.zzZiQ, zzjsZzW.zzZiO, strSubstring) && (length5 <= 0 || length5 * 8 <= i4)) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{0} (-:{1}; +:{2}; T:{3})", "Y", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            zzU6.zzSU("");
            int i5 = zzjs2.zzZiQ;
            int i6 = zzjs.zzZiQ;
            int i7 = zzjs.zzZiO;
            int i8 = i5 - (i6 + i7);
            zzjs.zzZiO = i7 + i8 + zzjs2.zzZiO;
            zzjs.zzZiN = zzjs.zzZiN + i8 + zzjs2.zzZiN;
            arrayList.remove(i);
            arrayList.remove(i);
            arrayList.add(i, zzjs);
            return true;
        }
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("N (-:{0}; +:{1}; T:{2} -> {3})", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i4 / length5)));
        zzU6.zzSU("");
        return false;
    }

    private ArrayList<zzJS> zzZ(zzX9 zzx9, zzX9 zzx92, Map<String, Integer> map) {
        zzX9 zzx9ZzZ = zzX8.zzZ(zzx9, map, this.zzZGE.zzZup);
        zzX9 zzx9ZzZ2 = zzX8.zzZ(zzx92, map, this.zzZGE.zzZup);
        ArrayList<zzJS> arrayListZzZ = zzJT.zzZ(zzZ(zzx9ZzZ), zzZ(zzx9ZzZ2), (zzX9) null, (zzX9) null);
        ArrayList<zzJS> arrayList = new ArrayList<>();
        for (zzJS zzjs : arrayListZzZ) {
            int size = 0;
            for (int i = 0; i < zzjs.zzZiQ; i++) {
                size += ((zzX8) zzx9ZzZ.zzOH(i)).zzZAM.size();
            }
            int size2 = 0;
            for (int i2 = 0; i2 < zzjs.zzZiP; i2++) {
                size2 += ((zzX8) zzx9ZzZ2.zzOH(i2)).zzZAM.size();
            }
            if (zzjs.zzZSB()) {
                int size3 = 0;
                for (int i3 = zzjs.zzZiQ; i3 < zzjs.zzZiQ + zzjs.zzZiO; i3++) {
                    size3 += ((zzX8) zzx9ZzZ.zzOH(i3)).zzZAM.size();
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzJS(size, size2, size3, 0));
            } else if (zzjs.zzZSC()) {
                int size4 = 0;
                for (int i4 = zzjs.zzZiP; i4 < zzjs.zzZiP + zzjs.zzZiN; i4++) {
                    size4 += ((zzX8) zzx9ZzZ2.zzOH(i4)).zzZAM.size();
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzJS(size, size2, 0, size4));
            } else {
                zzX9 zzx93 = new zzX9();
                zzX9 zzx94 = new zzX9();
                for (int i5 = zzjs.zzZiQ; i5 < zzjs.zzZiQ + zzjs.zzZiO; i5++) {
                    Iterator<Integer> it = ((zzX8) zzx9ZzZ.zzOH(i5)).zzZAM.iterator();
                    while (it.hasNext()) {
                        zzx93.zzZ(zzx9.zzOG(it.next().intValue()));
                    }
                }
                for (int i6 = zzjs.zzZiP; i6 < zzjs.zzZiP + zzjs.zzZiN; i6++) {
                    Iterator<Integer> it2 = ((zzX8) zzx9ZzZ2.zzOH(i6)).zzZAM.iterator();
                    while (it2.hasNext()) {
                        zzx94.zzZ(zzx92.zzOG(it2.next().intValue()));
                    }
                }
                for (zzJS zzjs2 : zzJT.zzZ(zzZ(zzx93), zzZ(zzx94), zzx9, zzx92)) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzJS(zzjs2.zzZiQ + size, zzjs2.zzZiP + size2, zzjs2.zzZiO, zzjs2.zzZiN));
                }
            }
        }
        return arrayList;
    }

    private static int[] zzZ(zzX9 zzx9) {
        int weight = 0;
        for (int i = 0; i < zzx9.getCount(); i++) {
            weight += zzx9.zzOH(i).getWeight();
        }
        int[] iArr = new int[weight];
        int i2 = 0;
        for (int i3 = 0; i3 < zzx9.getCount(); i3++) {
            zzXA zzxaZzOH = zzx9.zzOH(i3);
            int i4 = 0;
            while (i4 < zzxaZzOH.getWeight()) {
                iArr[i2] = zzxaZzOH.zze0;
                i4++;
                i2++;
            }
        }
        return iArr;
    }

    private boolean zzZ(ArrayList<zzJS> arrayList, int i, zzJS zzjs, zzJS zzjs2) {
        int i2 = zzjs.zzZiQ + zzjs.zzZiO;
        int i3 = zzjs2.zzZiQ - i2;
        String strSubstring = this.zzZiX.zzYAc().substring(i2, i3);
        String strSubstring2 = this.zzZiX.zzYAc().substring(zzjs.zzZiQ, zzjs.zzZiO);
        String strSubstring3 = this.zzZiW.zzYAc().substring(zzjs.zzZiP, zzjs.zzZiN);
        if (i3 > 2 || !zzV(i2, zzjs.zzZiO, strSubstring) || !zzV(zzjs.zzZiP, zzjs.zzZiN, strSubstring3) || !zzV(zzjs.zzZiQ, zzjs.zzZiO, strSubstring2)) {
            return false;
        }
        zzjs.zzZiO = zzjs.zzZiO + i3 + zzjs2.zzZiO;
        zzjs.zzZiN = zzjs.zzZiN + i3 + zzjs2.zzZiN;
        arrayList.remove(i);
        arrayList.remove(i);
        arrayList.add(i, zzjs);
        return true;
    }
}
