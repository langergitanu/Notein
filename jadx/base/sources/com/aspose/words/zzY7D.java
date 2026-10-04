package com.aspose.words;

import android.os.Bundle;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7D {
    private static float[] zzGs = new float[0];
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("", "tref", "tspan", "a", "altGlyph", "textPath", "middle", "central", "mathematical", "hanging", "alphabetic", "ideographic", "text-top", "end", "start");
    private zzY7J zzX7S;
    private zzY7X zzX7l;
    private float zzX7m;
    private float zzX7n;
    private zzY7X zzX7o;
    private String zzX7p;
    private float zzX7q;
    private float zzX7r;
    private ArrayList<zzY7V> zzX7s = new ArrayList<>();
    private ITextShaperFactory zzYg5;
    private com.aspose.words.internal.zzH3 zzwm;

    public zzY7D(zzY7J zzy7j, com.aspose.words.internal.zzH3 zzh3, ITextShaperFactory iTextShaperFactory) {
        this.zzX7S = zzy7j;
        this.zzwm = zzh3;
        this.zzYg5 = iTextShaperFactory;
    }

    private String zzAj(String str) {
        if (!zzZDY.zzXd(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length() && zzZDY.isWhitespace(str.charAt(i))) {
            i++;
        }
        if (i > 0 && this.zzX7s.size() > 0 && !com.aspose.words.internal.zzZKN.zzW(((zzY7V) C21505OooO0Oo.OooO00o(1, this.zzX7s)).zzY1k().getText(), " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            sb.append(ControlChar.SPACE_CHAR);
        }
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (zzZDY.isWhitespace(cCharAt)) {
                z = true;
            } else {
                if (z) {
                    sb.append(ControlChar.SPACE_CHAR);
                    z = false;
                }
                sb.append(cCharAt);
            }
            i++;
        }
        if (z) {
            sb.append(ControlChar.SPACE_CHAR);
        }
        return sb.toString();
    }

    private static double zzE(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("letter-spacing");
        if (zzptZzSx == null) {
            return 0.0d;
        }
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        double dZzL = zzl4ZzZVx.zzP(zzL4.zzZnb) ? 0.0d : zzL5.zzL(zzl4ZzZVx);
        if (com.aspose.words.internal.zzAN.zzZC(dZzL)) {
            return 0.0d;
        }
        return dZzL;
    }

    private static int zzH(zzY7X zzy7x) {
        int iZzZ = zzZ(zzy7x, zzy7x.zzZWe().zzZy("font-style", "italic") ? 2 : 0);
        zzPT zzptZzSx = zzy7x.zzZWe().zzSx("text-decoration");
        if (zzptZzSx != null) {
            if (zzptZzSx.zzZWj().zzO(zzL4.zzZna)) {
                iZzZ |= 4;
            }
            if (zzptZzSx.zzZWj().zzO(zzL4.zzZn8)) {
                return iZzZ | 8;
            }
        }
        return iZzZ;
    }

    private void zzI(zzY7X zzy7x) throws Exception {
        if (zzy7x.zzQw().size() == 0) {
            return;
        }
        boolean z = zzy7x.hasAttribute("transformation") || com.aspose.words.internal.zzZYD.zzXk(zzy7x.zzZWe().zzSE("clip-path"));
        if (z) {
            this.zzX7S.zzPM(true);
        }
        zzL(zzy7x);
        zzO(zzy7x);
        if (z) {
            this.zzX7S.zzZAD();
        }
    }

    private void zzJ(zzY7X zzy7x) {
        this.zzX7o = zzy7x;
        this.zzX7n = this.zzX7r;
        this.zzX7m = this.zzX7q;
    }

    private void zzK(zzY7X zzy7x) {
        this.zzX7r = zzY7B.zzZ(this.zzX7S, zzy7x, "x", this.zzX7r) + zzY7B.zzZ(this.zzX7S, zzy7x, "dx", 0.0f);
        this.zzX7q = zzY7B.zzZ(this.zzX7S, zzy7x, "y", this.zzX7q) + zzY7B.zzZ(this.zzX7S, zzy7x, "dy", 0.0f);
        this.zzX7l = zzy7x;
    }

    private void zzL(zzY7X zzy7x) throws Exception {
        String strZzSE = zzy7x.zzZWe().zzSE("clip-path");
        com.aspose.words.internal.zzP8 zzp8ZzAr = com.aspose.words.internal.zzZYD.zzXk(strZzSE) ? this.zzX7S.zzAr(strZzSE) : null;
        if (zzp8ZzAr != null) {
            this.zzX7S.zzY0U().zzZ(zzp8ZzAr);
        }
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzY7B.zzZ(this.zzX7S, zzy7x, (com.aspose.words.internal.zzP9) null);
        if (zzp9ZzZ != null && !zzp9ZzZ.isIdentity()) {
            this.zzX7S.zzY0U().zzW(zzp9ZzZ);
        }
        if (zzp9ZzZ != null) {
            zzY0I();
        }
        zzK(zzy7x);
    }

    private void zzM(zzY7X zzy7x) throws Exception {
        zzY7X zzy7x2 = zzy7x;
        int i = 0;
        zzY7X zzy7x3 = zzy7x2.zzQw().get(0);
        float[] fArrZzZ = zzZ(zzy7x2, "x");
        float[] fArrZzZ2 = zzZ(zzy7x2, "dx");
        float[] fArrZzZ3 = zzZ(zzy7x2, "y");
        float[] fArrZzZ4 = zzZ(zzy7x2, "dy");
        int iMax = Math.max(Math.max(fArrZzZ.length, fArrZzZ2.length), Math.max(fArrZzZ3.length, fArrZzZ4.length));
        String strZzAj = zzAj(zzy7x3.getValue());
        int iMin = Math.min(iMax, strZzAj.length());
        while (i < iMin) {
            zzY7X zzy7xZzL = zzy7x3.zzL(zzy7x2);
            zzy7xZzL.zzG(zzy7x3.zzZWe());
            int i2 = iMin - 1;
            zzy7xZzL.setValue(i < i2 ? com.aspose.words.internal.zzZKN.zzS(strZzAj.charAt(i), 1) : strZzAj.substring(i2));
            if (i < fArrZzZ.length) {
                zzy7xZzL.setAttribute("x", com.aspose.words.internal.zzJB.zzp(fArrZzZ[i]));
            }
            if (i < fArrZzZ2.length) {
                zzy7xZzL.setAttribute("dx", com.aspose.words.internal.zzJB.zzp(fArrZzZ2[i]));
            }
            if (i < fArrZzZ3.length) {
                zzy7xZzL.setAttribute("y", com.aspose.words.internal.zzJB.zzp(fArrZzZ3[i]));
            }
            if (i < fArrZzZ4.length) {
                zzy7xZzL.setAttribute("dy", com.aspose.words.internal.zzJB.zzp(fArrZzZ4[i]));
            }
            zzK(zzy7xZzL);
            zzW(zzy7xZzL);
            i++;
            zzy7x2 = zzy7x;
        }
    }

    private static boolean zzN(zzY7X zzy7x) {
        return zzZ(zzy7x, "x").length > 0 || zzZ(zzy7x, "dx").length > 0 || zzZ(zzy7x, "y").length > 0 || zzZ(zzy7x, "dy").length > 0;
    }

    private void zzO(zzY7X zzy7x) throws Exception {
        for (zzY7X zzy7x2 : zzy7x.zzQw()) {
            int iZzTP = zzUR.zzTP(zzy7x2.zzZTQ());
            if (iZzTP != 0) {
                if (iZzTP != 1) {
                    if (iZzTP != 2) {
                        this.zzX7S.zzT(1, com.aspose.words.internal.zzZKN.format("'{0}' element is not supported.", zzy7x.zzZTQ()));
                    } else {
                        zzI(zzy7x2);
                    }
                }
            } else if (zzN(zzy7x)) {
                zzM(zzy7x);
            } else {
                zzW(zzy7x2);
            }
        }
    }

    public static boolean zzP(zzY7X zzy7x) {
        return zzy7x.zzZWe().zzZy(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "rtl");
    }

    public static double zzT(zzY7X zzy7x, zzY7J zzy7j) {
        if (zzy7x.zzZWe().zzSx("font-size") != null) {
            return zzY7B.zzZ(zzy7j, zzy7x, "font-size", 12.0d);
        }
        return 12.0d;
    }

    private static float zzV(String str, float f) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 6) {
            return f / 2.0f;
        }
        if (iZzTP != 13) {
            return 0.0f;
        }
        return f;
    }

    private void zzW(zzY7X zzy7x) throws Exception {
        zzy7x.isText();
        String strZzAj = zzAj(zzy7x.getValue());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzAj)) {
            if (" ".equals(strZzAj)) {
                zzJ(zzy7x);
                return;
            }
            if (this.zzX7o != null && !com.aspose.words.internal.zzZKN.zzS(strZzAj, " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                zzY0H();
            }
            boolean zZzW = com.aspose.words.internal.zzZKN.zzW(strZzAj, " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
            if (zZzW) {
                strZzAj = com.aspose.words.internal.zzZKN.zzn(strZzAj, strZzAj.length() - 1);
            }
            zzY(zzy7x, strZzAj);
            if (zZzW) {
                zzJ(zzy7x);
            }
        }
    }

    private static String zzX9(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Iterator itOooO00o = com.aspose.words.internal.OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            sb.insert(0, com.aspose.words.internal.zzZKU.zzS7(((Integer) itOooO00o.next()).intValue()));
        }
        return sb.toString();
    }

    private void zzXU(float f) {
        if (this.zzX7s.size() == 0) {
            return;
        }
        for (int size = this.zzX7s.size() - 1; size >= 0; size--) {
            zzY7V zzy7v = this.zzX7s.get(size);
            zzy7v.zzY1k().zzY(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzy7v.zzY1k().zzZT()) - f, com.aspose.words.internal.zzZPY.zzYC(zzy7v.zzY1k().zzZT())));
            if (this.zzX7s.get(size).zzY1j()) {
                return;
            }
        }
    }

    private void zzY(zzY7X zzy7x, String str) throws Exception {
        float fZz7;
        Cluster[] clusterArrZzZ;
        zzy7x.isText();
        com.aspose.words.internal.zzPM zzpmZzZ = zzZ(zzy7x, zzT(zzy7x, this.zzX7S), this.zzX7S.zzZqy());
        boolean z = false;
        boolean z2 = "tspan".equals(zzy7x.zzY1C().zzZTQ()) && zzy7x.zzY1C().hasAttribute("x") && zzy7x.zzY1C().zzQw().size() == 1;
        boolean zZzP = zzP(zzy7x);
        com.aspose.words.internal.zzPV zzpvZzZ = zzZ(zzy7x, "fill", com.aspose.words.internal.zzPV.zzKa);
        com.aspose.words.internal.zzPV zzpvZzZ2 = zzZ(zzy7x, "stroke", com.aspose.words.internal.zzPV.zzHZ);
        double dZzE = zzE(zzy7x.zzZWe());
        int i = 0;
        for (com.aspose.words.internal.zz6R zz6r : zzZ(str, zzpmZzZ, zZzP)) {
            com.aspose.words.internal.zzY3 zzy3 = (com.aspose.words.internal.zzY3) zz6r.getFirst();
            com.aspose.words.internal.zzPM zzpm = (com.aspose.words.internal.zzPM) zz6r.zzwW();
            String text = zzy3.getText();
            if (this.zzYg5 != null) {
                clusterArrZzZ = zzYBO.zzZ(text, zzpm, zzy3.zzXn(), z, this.zzYg5);
                if (zzy3.zzXn()) {
                    com.aspose.words.internal.zzZKV.zzZ(clusterArrZzZ, clusterArrZzZ.length);
                }
                fZz7 = zzYBQ.zzY(zzpm, clusterArrZzZ);
            } else {
                if (zzy3.zzXn()) {
                    text = zzX9(text);
                }
                fZz7 = zzpm.zz7(text);
                clusterArrZzZ = null;
            }
            float f = fZz7;
            String str2 = text;
            Cluster[] clusterArr = clusterArrZzZ;
            long jZzG = com.aspose.words.internal.zzZPY.zzG(this.zzX7r, this.zzX7q - (zzZ(zzy7x, zzpm) + zzY(zzy7x, zzpm)));
            long jZzG2 = com.aspose.words.internal.zzZPW.zzG(f, zzpm.zzPf());
            com.aspose.words.internal.zzZU zzzu = new com.aspose.words.internal.zzZU(zzpm, zzpvZzZ, zzpvZzZ2, jZzG, str2, jZzG2, (float) dZzE, zzy3.zzXn(), clusterArr);
            this.zzX7S.zzS(zzzu);
            zzY7V zzy7v = new zzY7V(zzzu, i == 0 && z2);
            com.aspose.words.internal.zzZQG.zzZ(this.zzX7s, zzy7v);
            i++;
            this.zzX7r = Float.intBitsToFloat((int) jZzG2) + this.zzX7r;
            zzZ(zzy7x, zzy7v);
            z = false;
        }
    }

    private void zzY0G() {
        zzY7X zzy7x = this.zzX7l;
        if (zzy7x == null) {
            return;
        }
        zzK(zzy7x);
        this.zzX7l = null;
    }

    private void zzY0H() throws Exception {
        this.zzX7r = this.zzX7n;
        this.zzX7q = this.zzX7m;
        zzY(this.zzX7o, " ");
        zzY0G();
        this.zzX7o = null;
    }

    private void zzY0I() {
        this.zzX7r = 0.0f;
        this.zzX7q = 0.0f;
        this.zzX7o = null;
        this.zzX7l = null;
    }

    public static com.aspose.words.internal.zzPM zzZ(zzY7X zzy7x, double d, zzZYZ zzzyz) {
        return zzzyz.zzY(zzy7x.zzZWe().zzZ(zzzyz), (float) d, zzH(zzy7x));
    }

    public final void zzQ(zzY7X zzy7x) throws Exception {
        this.zzX7S.zzPM(true);
        zzL(zzy7x);
        zzO(zzy7x);
        this.zzX7S.zzZAD();
        zzY0I();
        this.zzX7p = null;
        this.zzX7s.clear();
    }

    private float zzZ(zzY7X zzy7x, com.aspose.words.internal.zzPM zzpm) {
        zzPT zzptZzSx = zzy7x.zzZWe().zzSx("baseline-shift");
        if (zzptZzSx == null) {
            return 0.0f;
        }
        if (!zzptZzSx.zzMt(4) && !zzptZzSx.zzMt(3)) {
            if (zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZmS)) {
                return -((zzpm.zzPg() - (zzpm.getDescentPoints() / 2.0f)) - zzpm.zzPl().zzJ(zzpm.zzPl().zzpK(), zzpm.getLineSpacingPoints()));
            }
            if (zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZmR)) {
                return ((zzpm.getDescentPoints() / 2.0f) + zzpm.zzPg()) - zzpm.zzPl().zzJ(zzpm.zzPl().zzpM(), zzpm.zzPg());
            }
            if (!zzptZzSx.zzMt(5)) {
                return 0.0f;
            }
            return zzpm.zzPg() * (((float) zzy7x.zzZWe().zzSC("baseline-shift")) / 100.0f);
        }
        return (float) zzY7B.zzZ(this.zzX7S, zzy7x, "baseline-shift", 0.0d);
    }

    private ArrayList<zzY7N> zzW(String str, com.aspose.words.internal.zzPM zzpm) throws Exception {
        com.aspose.words.internal.zzYB zzyb = new com.aspose.words.internal.zzYB(str, zzpm);
        ArrayList<zzY7N> arrayList = new ArrayList<>();
        zzY7N zzy7n = null;
        while (zzyb.moveNext()) {
            String text = zzyb.getText();
            com.aspose.words.internal.zzPM zzpmZzY = zzyb.zzr6() ? zzY(zzpm, text) : zzpm;
            if (zzy7n == null) {
                zzy7n = new zzY7N(text, zzpmZzY);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzy7n);
            } else if (com.aspose.words.internal.zzZKN.equals(zzy7n.zzZr().zzPh(), zzpmZzY.zzPh())) {
                zzy7n.append(text);
            } else {
                zzy7n = new zzY7N(text, zzpmZzY);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzy7n);
            }
        }
        return arrayList;
    }

    private static float[] zzZ(zzY7X zzy7x, String str) {
        String strZzKM = zzy7x.zzKM(str);
        float[] fArrZzZZ = (com.aspose.words.internal.zzZYD.zzXk(strZzKM) && (com.aspose.words.internal.zzZYD.zzXd(strZzKM) || strZzKM.contains(","))) ? zzY80.zzZZ(strZzKM, false) : null;
        return (fArrZzZZ == null || fArrZzZZ.length < 2) ? zzGs : fArrZzZZ;
    }

    private void zzZ(zzY7X zzy7x, zzY7V zzy7v) {
        zzy7x.zzY1C();
        zzy7x.isText();
        if (zzy7x.zzY1C() == null) {
            return;
        }
        String strZzSF = this.zzX7p;
        if (strZzSF == null) {
            strZzSF = "start";
        }
        if (this.zzX7s.size() == 1 || zzy7v.zzY1j()) {
            strZzSF = zzy7x.zzZWe().zzSF("text-anchor");
        }
        if (com.aspose.words.internal.zzZKN.zzU3(strZzSF)) {
            return;
        }
        float fZzV = zzV(strZzSF, zzy7v.zzY1k().zzZj().getWidth());
        if (!com.aspose.words.internal.zzAN.zzf(fZzV)) {
            zzXU(fZzV);
            this.zzX7r -= fZzV;
        }
        this.zzX7p = strZzSF;
    }

    private com.aspose.words.internal.zzPM zzY(com.aspose.words.internal.zzPM zzpm, String str) {
        com.aspose.words.internal.zzZXH zzzxhZzZ = this.zzwm.zzZ(zzpm.zzPl(), com.aspose.words.internal.zzZVS.zzA(str, 0), true);
        return zzzxhZzZ == null ? zzpm : new com.aspose.words.internal.zzPM(zzpm.zzPg(), zzpm.zzPk(), zzzxhZzZ);
    }

    private ArrayList<com.aspose.words.internal.zz6R> zzZ(String str, com.aspose.words.internal.zzPM zzpm, boolean z) throws Exception {
        ArrayList<com.aspose.words.internal.zz6R> arrayList = new ArrayList<>();
        int size = -1;
        for (zzY7N zzy7n : zzW(str, zzpm)) {
            String text = zzy7n.getText();
            com.aspose.words.internal.zzPM zzpmZzZr = zzy7n.zzZr();
            com.aspose.words.internal.zzY3[] zzy3ArrZzW = com.aspose.words.internal.zzY9.zzW(text, z);
            for (com.aspose.words.internal.zzY3 zzy3 : zzy3ArrZzW) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new com.aspose.words.internal.zz6R(zzy3, zzpmZzZr));
                if (zzy3.zzXn() && size == -1) {
                    size = arrayList.size() - 1;
                }
                if (!zzy3.zzXn() && size != -1) {
                    com.aspose.words.internal.zzZQG.zzU(arrayList, size, (arrayList.size() - size) - 1);
                    size = -1;
                }
            }
            z = zzy3ArrZzW[zzy3ArrZzW.length - 1].zzXn();
        }
        if (size != -1) {
            com.aspose.words.internal.zzZQG.zzU(arrayList, size, arrayList.size() - size);
        }
        return arrayList;
    }

    private static float zzY(zzY7X zzy7x, com.aspose.words.internal.zzPM zzpm) {
        String strZzSF = zzy7x.zzZWe().zzSF("dominant-baseline");
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzSF)) {
            return 0.0f;
        }
        switch (zzUR.zzTP(strZzSF)) {
            case 9:
                break;
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [int, java.lang.String] */
    private static com.aspose.words.internal.zzPV zzZ(zzY7X zzy7x, String str, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzPV zzpvZzSB = (zzy7x.zzZWe().zzSx(str) == null || zzy7x.zzZWe().zzSx(str).zzZWj().zzP(zzL4.zzZno)) ? null : zzy7x.zzZWe().zzSB(str);
        if (zzpvZzSB != null) {
            zzpv = zzpvZzSB;
        }
        if (!zzpv.isEmpty()) {
            double dZzX = zzY7B.zzX(zzy7x, Bundle.getInt(str));
            if (dZzX >= 0.0d && dZzX < 1.0d) {
                return new com.aspose.words.internal.zzPV((int) (dZzX * 255.0d), zzpv);
            }
        }
        return zzpv;
    }

    private static int zzZ(zzY7X zzy7x, int i) {
        zzPT zzptZzSx = zzy7x.zzZWe().zzSx("font-weight");
        if (zzptZzSx != null) {
            zzptZzSx.zzZWj().getCount();
            zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
            int valueType = zzl4ZzZVx.getValueType();
            if (valueType != 0) {
                if (valueType == 3 && zzl4ZzZVx.getDoubleValue() >= 600.0d) {
                    return i | 1;
                }
            } else if (zzl4ZzZVx.zzP(zzL4.zzZn3) || zzl4ZzZVx.zzP(zzL4.zzZn2)) {
                return i | 1;
            }
        }
        return i;
    }
}
