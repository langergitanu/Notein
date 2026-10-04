package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY22 {
    private ArrayList<com.aspose.words.internal.zzZG[]> zzMM;
    private zzY5O zzWVA;
    private ArrayList<com.aspose.words.internal.zzZG[]> zzWVB;
    private com.aspose.words.internal.zzGQ zzWVC;
    private com.aspose.words.internal.zzG zzWVE;
    private TextPath zzWVF;
    private boolean zzWVv;
    private int zzWVw;
    private float[] zzWVx;
    private int zzWVy;
    private zzY0G zzWVz;
    private com.aspose.words.internal.zzPY zzXnc;
    private com.aspose.words.internal.zzOU zzXnd;
    private com.aspose.words.internal.zzPM zzYX;
    private IWarningCallback zzZG0;
    private long zzWVD = 0;
    private com.aspose.words.internal.zzZQ4 zzZ3N = com.aspose.words.internal.zzZQ4.zz2T;

    private com.aspose.words.internal.zzZQ4 zzPx(boolean z) {
        float x;
        com.aspose.words.internal.zzZQ4 zzzq4;
        if (z) {
            zzzq4 = this.zzZ3N;
        } else {
            long jZzXS7 = this.zzWVz.zzXS7();
            int i = (int) jZzXS7;
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzXS7);
            if (Float.intBitsToFloat(i) < this.zzZ3N.getWidth()) {
                fIntBitsToFloat = this.zzZ3N.getWidth();
                x = this.zzZ3N.getX();
            } else {
                x = 0.0f;
            }
            zzzq4 = new com.aspose.words.internal.zzZQ4(x, 0.0f, fIntBitsToFloat, fZzYz);
        }
        return this.zzWVF.getTextPathAlignment() == 0 ? new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), this.zzWVx[this.zzWVw], zzzq4.getHeight()) : zzzq4;
    }

    private void zzS(int i, long j) throws Exception {
        String strZzhQ = this.zzWVz.zzhQ(i);
        zzY5O zzy5o = this.zzWVA;
        float spacing = (float) this.zzWVF.getSpacing();
        int textPathAlignment = this.zzWVF.getTextPathAlignment();
        float width = this.zzWVz.zzhN(i).getWidth();
        float fZzXS6 = this.zzWVz.zzXS6();
        boolean z = this.zzWVv;
        com.aspose.words.internal.zzZQG.zzZ(this.zzWVB, zzy5o.zzZ(strZzhQ, j, spacing, textPathAlignment, width, fZzXS6, z, z, this.zzWVF.getRotateLetters()));
    }

    private static boolean zzT(zzYCD zzycd) {
        long[] jArrZzY90 = zzycd.zzYae().zzY90();
        return (!zzycd.getShape().getExtrusionEnabled() && jArrZzY90.length == 4 && Float.intBitsToFloat((int) jArrZzY90[0]) == com.aspose.words.internal.zzZPY.zzYC(jArrZzY90[0]) && Float.intBitsToFloat((int) jArrZzY90[3]) == com.aspose.words.internal.zzZPY.zzYC(jArrZzY90[3]) && Float.intBitsToFloat((int) jArrZzY90[1]) == com.aspose.words.internal.zzZPY.zzYC(jArrZzY90[2])) ? false : true;
    }

    private void zzU(zzYCD zzycd) throws Exception {
        this.zzWVF = zzycd.getShape().getTextPath();
        this.zzWVE = zzycd.zz7v();
        this.zzXnd = zzycd.zzSe();
        this.zzXnc = zzycd.zzYak();
        this.zzWVD = zzycd.getShape().zzYzG().getSize();
        this.zzZG0 = zzycd.getWarningCallback();
        this.zzWVy = this.zzWVF.getTextPathAlignment();
        this.zzWVv = zzT(zzycd);
        this.zzWVC = new zzY0J(zzycd.getShape().getDocument().zzZqy());
        String fontFamily = this.zzWVF.getFontFamily();
        if ("Arial Black".equals(fontFamily)) {
            String text = this.zzWVF.getText();
            if (com.aspose.words.internal.zzZYD.zzXk(text) && com.aspose.words.internal.zzUX.zzM(text.charAt(0))) {
                fontFamily = "Arial";
            }
        }
        this.zzYX = zzycd.getShape().getDocument().zzZqy().zzZ(fontFamily, (float) this.zzWVF.getSize(), zzZ(this.zzWVF), zzZ(this.zzWVF), false, false, false, false, false, false);
        com.aspose.words.internal.zzPM zzpm = this.zzYX;
        com.aspose.words.internal.zzOU zzou = this.zzXnd;
        com.aspose.words.internal.zzPY zzpy = this.zzXnc;
        com.aspose.words.internal.zzGQ zzgq = this.zzWVC;
        new zzY21(zzycd.getWarningCallback());
        this.zzWVA = new zzY5O(zzpm, zzou, zzpy, zzgq);
    }

    private com.aspose.words.internal.zzG zzV(zzYCD zzycd) throws Exception {
        if (com.aspose.words.internal.zzZPW.zzYz(zzycd.getShape().zzYzG().getSize()) <= 0.0f) {
            return null;
        }
        zzU(zzycd);
        this.zzWVz = new zzY0G(this.zzWVy, this.zzWVF.getText(), this.zzWVE, this.zzWVD, this.zzYX, this.zzWVC, this.zzWVF.getRotateLetters());
        this.zzWVB = new ArrayList<>();
        zzY8q();
        this.zzZ3N = zzYT(this.zzWVB);
        if (!zzXSL()) {
            zzYS(this.zzWVB);
        }
        return zzY0L.zzZ(this.zzMM, this.zzXnd, this.zzXnc);
    }

    public static com.aspose.words.internal.zzG zzW(zzYCD zzycd) throws Exception {
        return com.aspose.words.internal.zzZKN.zzU3(com.aspose.words.internal.zzZKN.zzTX(zzycd.getShape().getTextPath().getText())) ? new com.aspose.words.internal.zzG() : new zzY22().zzV(zzycd);
    }

    private boolean zzXSL() throws Exception {
        if (this.zzWVz.zzXS8() || !this.zzWVF.getFitShape()) {
            return false;
        }
        zzZ(this.zzWVB, this.zzWVF.getTrim(), this.zzWVz.zzXS5());
        return true;
    }

    private void zzY8q() throws Exception {
        int iZzYqt = this.zzWVz.zzYqt();
        this.zzWVx = new float[iZzYqt];
        for (int i = 0; i < iZzYqt; i++) {
            zzS(i, this.zzWVz.zzhN(i).zzZE());
        }
    }

    private void zzYS(ArrayList<com.aspose.words.internal.zzZG[]> arrayList) throws Exception {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 256, 4, "WordArt unsupported rendering mode.");
        }
        zzZ(arrayList, true, 2);
    }

    private com.aspose.words.internal.zzZQ4 zzYT(ArrayList<com.aspose.words.internal.zzZG[]> arrayList) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzT = com.aspose.words.internal.zzZQ4.zz2T;
        for (int i = 0; i < arrayList.size(); i++) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzY5S.zzZ(arrayList.get(i));
            String strZzhQ = this.zzWVz.zzhQ(i);
            if (strZzhQ.length() - com.aspose.words.internal.zzZKN.zzTX(strZzhQ).length() != 0) {
                float fZzY7 = this.zzYX.zzY7(32);
                int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
                if (com.aspose.words.internal.zzZKN.zzS(strZzhQ, " ", i2)) {
                    float length = (strZzhQ.length() - com.aspose.words.internal.zzZKN.zzTZ(strZzhQ).length()) * fZzY7;
                    zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzZ, new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX() - length, zzzq4ZzZ.getY(), length, zzzq4ZzZ.getHeight()));
                }
                if (com.aspose.words.internal.zzZKN.zzW(strZzhQ, " ", i2)) {
                    zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzZ, new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getWidth() + zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), fZzY7 * (strZzhQ.length() - com.aspose.words.internal.zzZKN.zzTY(strZzhQ).length()), zzzq4ZzZ.getHeight()));
                }
            }
            this.zzWVx[i] = zzzq4ZzZ.getWidth();
            zzzq4ZzT = com.aspose.words.internal.zzZQ4.zzV(zzzq4ZzT, com.aspose.words.internal.zzZQ4.zz2T) ? zzzq4ZzZ : com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzT, zzzq4ZzZ);
        }
        return zzzq4ZzT;
    }

    private void zzZ(ArrayList<com.aspose.words.internal.zzZG[]> arrayList, boolean z, int i) throws Exception {
        if (arrayList.size() == 0) {
            return;
        }
        this.zzMM = new ArrayList<>();
        com.aspose.words.internal.zzP5[] zzp5Arr = i % 2 == 0 ? new com.aspose.words.internal.zzP5[2] : new com.aspose.words.internal.zzP5[1];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            com.aspose.words.internal.zzZG[] zzzgArr = arrayList.get(i2);
            zzp5Arr[0] = this.zzWVz.zzhP(i2);
            if (zzp5Arr.length == 2) {
                zzp5Arr[1] = this.zzWVz.zzhO(i2);
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzMM, zzY0H.zzZ(zzzgArr, zzPx(z), zzp5Arr));
            this.zzWVw++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    private static int zzZ(TextPath textPath) {
        boolean bold = textPath.getBold();
        ?? r0 = bold;
        if (textPath.getItalic()) {
            r0 = (bold ? 1 : 0) | 2;
        }
        return textPath.getUnderline() ? r0 | 4 : r0;
    }
}
