package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ10 {
    private static com.aspose.words.internal.zzZNR zzY1M = new com.aspose.words.internal.zzZNR("[<=>≃≄≇≈≉≊≠≡≢≤≥≦≧≪≫]");
    private zzZ13 zzY1L;
    private float zzY1N;
    private float zzY1O;
    private zzZ13 zzY1P;
    private float zzY1W;
    private ArrayList<zzZ13> zzY1Q = new ArrayList<>();
    private float zzY1K = 0.0f;
    private float zzY1J = 60.0f;
    private float zzY1I = 0.0f;

    private zzZ10(float f) {
        this.zzY1W = Float.NaN;
        this.zzY1W = f;
    }

    private static boolean zzA(zzZ13 zzz13) {
        Iterator<zzZ13> it = zzz13.zzQw().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof zzZ0U) {
                return true;
            }
        }
        return false;
    }

    private boolean zzB(zzZ13 zzz13) throws Exception {
        if (Float.isNaN(this.zzY1W) || zzz13.zzQw().size() <= 1) {
            return false;
        }
        float width = 0.0f;
        for (zzZ13 zzz132 : zzz13.zzQw()) {
            zzz132.zzZE4();
            width += zzz132.zzZj().getWidth();
        }
        return width > this.zzY1W;
    }

    private static boolean zzC(zzZ13 zzz13) {
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz13, zzYZP.class);
        return zzyzp != null && zzyzp.getText().contains(",         ");
    }

    private static boolean zzD(zzZ13 zzz13) {
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz13, zzYZP.class);
        if (zzyzp != null) {
            return zzY1M.zzUV(zzyzp.getText());
        }
        return false;
    }

    private static zzZ13 zzE(zzZ13 zzz13) {
        if (zzz13.zzYG8().getMathObjectType() != 6 || (zzz13.zzYGr() != null && zzz13.zzYGr().zzYG8().getMathObjectType() == 6)) {
            return zzz13;
        }
        zzZ13 zzz132 = new zzZ13(zzz13.zzYGj(), zzz13.zzYGk());
        zzz132.zzZ(zzz13.zzQw().get(0));
        Iterator<zzZ13> it = zzz13.zzQw().get(1).zzQw().get(0).zzQw().iterator();
        while (it.hasNext()) {
            zzz132.zzZ(it.next());
        }
        zzz132.zzZ(zzz13.zzQw().get(2));
        return zzz132;
    }

    private void zzF(zzZ13 zzz13) throws Exception {
        this.zzY1I = zzZ15.zzW(zzz13.zzQw().size() > 0 ? zzz13.zzQw().get(0) : zzz13) * 1.1f;
        this.zzY1J = ((float) (((double) zzz13.zzYGj().zzYGE().zzZpV().zzYVd.zzYEo()) / 20.0d)) - this.zzY1I;
    }

    private void zzG(zzZ13 zzz13) throws Exception {
        if (zzB(zzz13)) {
            OfficeMath officeMathZzYGk = zzz13.zzYGk();
            zzZ14 zzz14ZzYGj = zzz13.zzYGj();
            zzZ18 zzz18 = new zzZ18(zzz14ZzYGj, officeMathZzYGk);
            zzZ13 zzz132 = new zzZ13(zzz14ZzYGj, officeMathZzYGk);
            zzF(zzz13);
            zzz132.zzYo(Math.max(this.zzY1J, 0.0f));
            zzz18.zzZ(zzz132);
            for (int i = 0; i < zzz13.zzQw().size(); i++) {
                for (zzZ13 zzz133 : zzZ(zzz13.zzQw().get(i), zzz14ZzYGj)) {
                    this.zzY1K = zzZ(this.zzY1K, zzz133, zzz18);
                }
            }
            zzZ(zzz18);
            zzZ(zzz13, zzz18);
            zzz13.zzQw().clear();
            zzz13.zzQw().add(zzz18);
        }
    }

    private void zzH(zzZ13 zzz13) throws Exception {
        OfficeMath officeMathZzYGk = zzz13.zzYGk();
        zzZ14 zzz14ZzYGj = zzz13.zzYGj();
        zzZ18 zzz18 = new zzZ18(zzz14ZzYGj, officeMathZzYGk);
        zzZ13 zzz132 = new zzZ13(zzz14ZzYGj, officeMathZzYGk);
        zzz18.zzZ(zzz132);
        for (zzZ13 zzz133 : zzz13.zzQw()) {
            if (zzz133 instanceof zzZ0U) {
                zzG(zzz132);
                zzz132 = new zzZ13(zzz14ZzYGj, officeMathZzYGk);
                zzz18.zzZ(zzz132);
            } else {
                zzz132.zzZ(zzz133);
            }
        }
        zzG(zzz132);
        zzz13.zzQw().clear();
        zzz13.zzQw().add(zzz18);
    }

    private void zzU(zzZ18 zzz18) {
        zzZ13 zzz13 = new zzZ13(zzz18.zzYGj(), zzz18.zzYGk());
        zzz13.zzYo(0.0f);
        zzz18.zzZ(zzz13);
        this.zzY1L = zzz13;
        this.zzY1K = this.zzY1J;
    }

    public static void zzV(zzZ13 zzz13, float f) throws Exception {
        zzZ10 zzz10 = new zzZ10(f);
        if (zzA(zzz13)) {
            zzz10.zzH(zzz13);
        } else {
            zzz10.zzG(zzz13);
        }
    }

    private void zzW(zzZ13 zzz13, zzZ18 zzz18) throws Exception {
        zzY(zzz18);
        this.zzY1P = null;
        this.zzY1O = 0.0f;
        zzX(zzz18);
        this.zzY1L.zzZ(zzZ(",", zzz13, zzz18.zzYGj()));
        zzU(zzz18);
    }

    private void zzX(zzZ18 zzz18) throws Exception {
        zzYZP zzyzpZzW = zzW(zzz18);
        if (zzyzpZzW == null || !zzyzpZzW.getText().contains(",")) {
            return;
        }
        zzZ13 zzz13 = zzz18.zzQw().get(zzz18.zzQw().size() - 2).zzQw().get(0);
        float fZzY = zzY(zzz13, zzz18.zzQw().size());
        zzYZP zzyzpZzZ = zzZ(",         ", zzyzpZzW, zzz18.zzYGj());
        if (zzyzpZzZ.getWidth() + fZzY < this.zzY1W) {
            zzz13.zzQw().set(zzz13.zzQw().size() - 1, zzyzpZzZ);
            zzZ(zzz18, zzz13, fZzY);
        }
    }

    private static void zzY(zzZ13 zzz13, zzZ18 zzz18) throws Exception {
        zzZ13 zzz132 = zzz13.zzQw().get(0);
        float fZzYG2 = zzz132.zzYG2();
        float f = fZzYG2 * 2.0f;
        float fZzYG1 = (zzz132.zzYG1() / 2.0f) + fZzYG2;
        if (zzz13.zzYG6()) {
            float fZzS = zzZ11.zzS(zzz132);
            f += fZzS;
            fZzYG1 += fZzS;
        }
        for (int i = 0; i < zzz18.zzQw().size(); i++) {
            zzZ11.zzW(zzz18.zzuV(i), f, fZzYG1);
        }
    }

    private boolean zzYFX() {
        return this.zzY1P != null;
    }

    private float zzYFY() {
        return this.zzY1N + this.zzY1O;
    }

    private void zzYFZ() {
        if (zzYFX()) {
            this.zzY1N += this.zzY1O;
            this.zzY1Q.add(0, this.zzY1P);
            this.zzY1P = null;
            this.zzY1O = 0.0f;
        }
        Iterator<zzZ13> it = this.zzY1Q.iterator();
        while (it.hasNext()) {
            this.zzY1L.zzZ(it.next());
        }
        this.zzY1K += this.zzY1N;
        this.zzY1Q.clear();
        this.zzY1N = 0.0f;
    }

    private static zzZ13[] zzZ(zzZ13 zzz13, zzZ14 zzz14) throws Exception {
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz13, zzYZP.class);
        if (zzyzp == null || !zzyzp.getText().contains(",         ")) {
            return new zzZ13[]{zzz13};
        }
        String[] strArrZzZ = com.aspose.words.internal.zzZKN.zzZ(zzyzp.getText(), new String[]{",         "}, com.aspose.words.internal.zzZOE.NONE$77a9e2fd);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        while (i < strArrZzZ.length) {
            String str = strArrZzZ[i];
            boolean zZzU3 = com.aspose.words.internal.zzZKN.zzU3(str);
            if (i > 0 && !z) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, ",         ");
            }
            if (i != strArrZzZ.length - 1 || !zZzU3) {
                if (zZzU3) {
                    str = ",         ";
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, str);
            }
            i++;
            z = zZzU3;
        }
        zzZ13[] zzz13Arr = new zzZ13[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzz13Arr[i2] = zzZ((String) arrayList.get(i2), zzz13, zzz14);
        }
        return zzz13Arr;
    }

    private static float zzZr(ArrayList<zzZ13> arrayList) {
        Iterator<zzZ13> it = arrayList.iterator();
        float width = 0.0f;
        while (it.hasNext()) {
            width += it.next().getWidth();
        }
        return width;
    }

    private void zzV(zzZ18 zzz18) {
        int size = zzz18.zzQw().size();
        if (size < 2) {
            return;
        }
        zzZ13 zzz13 = zzz18.zzQw().get(size - 2).zzQw().get(0);
        zzZ13 zzz132 = this.zzY1L.zzQw().get(0);
        float fZzY = zzY(zzz13, size);
        if (!zzD(zzz132) || fZzY >= this.zzY1W) {
            return;
        }
        zzZ(zzz18, zzz13, fZzY);
    }

    private static zzYZP zzW(zzZ18 zzz18) {
        int size = zzz18.zzQw().size();
        if (size < 2) {
            return null;
        }
        zzZ13 zzz13 = zzz18.zzQw().get(size - 2).zzQw().get(0);
        return (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz13.zzQw().size() > 0 ? zzz13.zzQw().get(zzz13.zzQw().size() - 1) : null, zzYZP.class);
    }

    private float zzX(zzZ13 zzz13, zzZ18 zzz18) throws Exception {
        zzz18.zzuV(0);
        zzz18.zzYHb();
        if (zzC(zzz13)) {
            zzW(zzz13, zzz18);
        } else if (zzz13.zzYGh()) {
            zzY(zzz18);
            zzZ(zzz18, zzz13);
            this.zzY1P = zzz13;
            this.zzY1O = zzz13.zzZj().getWidth();
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzY1Q, zzz13);
            this.zzY1N = zzz13.zzZj().getWidth() + this.zzY1N;
        }
        return this.zzY1K;
    }

    private void zzY(zzZ18 zzz18) {
        boolean zZzD = zzD(this.zzY1P);
        if (zzYFX() && this.zzY1K + zzYFY() >= this.zzY1W && !zZzD) {
            zzU(zzz18);
        }
        zzYFZ();
    }

    private float zzY(zzZ13 zzz13, int i) {
        return zzZr(zzz13.zzQw()) + (i == 2 ? 0.0f : this.zzY1J) + zzZr(this.zzY1L.zzQw());
    }

    private void zzZ(zzZ13 zzz13, zzZ18 zzz18) throws Exception {
        zzY(zzz13, zzz18);
        zzz18.zzYi(zzZ11.zzG(zzz13.zzQw().get(0).zzYG4().zzZr()) * ((((float) (((double) zzz13.zzYG8().getParentParagraph().zzqw(1).zzHT()) / 20.0d)) / 12.0f) - 1.0f));
        if (this.zzY1J > 0.0f) {
            return;
        }
        for (int i = 0; i < zzz18.zzQw().size(); i++) {
            zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzz18.zzuV(i).zzQw().get(0), zzYZP.class);
            if (zzyzp != null && zzyzp.getText().charAt(0) != '/' && zzZ15.zzYv(zzyzp.getText().charAt(0))) {
                com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(zzyzp.zzZj().getX() + this.zzY1I, zzyzp.zzZj().getY(), zzyzp.zzZj().getWidth() - this.zzY1I, zzyzp.zzZj().getHeight());
                if (zzyzp.zzYGn().zzZO() == null) {
                    com.aspose.words.internal.OooO0O0.OooO00o(zzyzp.zzYGn());
                }
                zzyzp.zzYGn().zzZO().zzY(-this.zzY1I, 0.0f, 0);
                zzyzp.zzYGn().zzZ(com.aspose.words.internal.zzP8.zzM(zzzq4));
                zzyzp.zzI(zzzq4);
            }
        }
    }

    private void zzZ(zzZ18 zzz18) throws Exception {
        if (zzYFX() && this.zzY1K + zzYFY() >= this.zzY1W) {
            float fZzYFY = zzYFY();
            float f = this.zzY1W;
            if (fZzYFY > f - this.zzY1J || this.zzY1K > f) {
                zzz18.zzuV(0).zzYo(0.0f);
            }
            zzU(zzz18);
        }
        zzYFZ();
        if (this.zzY1L.zzQw().size() > 0 && zzD(this.zzY1L.zzQw().get(0)) && this.zzY1K > this.zzY1J) {
            zzV(zzz18);
        }
        zzX(zzz18);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float zzZ(float f, zzZ13 zzz13, zzZ18 zzz18) throws Exception {
        this.zzY1L = zzz18.zzYHb();
        this.zzY1K = f;
        if (zzz13.zzZj().getWidth() + f + zzYFY() >= this.zzY1W && zzz13.zzYGs()) {
            if (zzYFX() && !zzD(this.zzY1P)) {
                zzU(zzz18);
            }
            if (zzYFY() > 0.0f) {
                zzYFZ();
            }
            zzZ13 zzz13ZzE = zzE(zzz13);
            if (zzz13ZzE.zzQw().size() != 0) {
                if (zzz13.zzZj().getWidth() + this.zzY1K + zzYFY() >= this.zzY1W) {
                    Iterator<zzZ13> it = zzz13ZzE.zzQw().iterator();
                    while (it.hasNext()) {
                        this.zzY1K = zzZ(this.zzY1K, it.next(), zzz18);
                    }
                } else {
                    zzX(zzz13ZzE, zzz18);
                }
            }
        } else {
            this.zzY1K = zzX(zzz13, zzz18);
        }
        return this.zzY1K;
    }

    private void zzZ(zzZ18 zzz18, zzZ13 zzz13) {
        if (!zzD(zzz13) || this.zzY1K <= this.zzY1J) {
            return;
        }
        zzV(zzz18);
        zzU(zzz18);
    }

    private static zzYZP zzZ(String str, zzZ13 zzz13, zzZ14 zzz14) throws Exception {
        zzYZP zzyzp = new zzYZP(zzz14, str, zzz13.zzZYh());
        zzyzp.zzZE4();
        return zzyzp;
    }

    private void zzZ(zzZ18 zzz18, zzZ13 zzz13, float f) {
        Iterator<zzZ13> it = this.zzY1L.zzQw().iterator();
        while (it.hasNext()) {
            zzz13.zzZ(it.next());
        }
        this.zzY1L.zzQw().clear();
        zzz18.zzQw().remove(zzz18.zzQw().size() - 1);
        this.zzY1K = f;
        this.zzY1L = zzz13;
    }
}
