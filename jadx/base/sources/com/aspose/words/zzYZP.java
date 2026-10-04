package com.aspose.words;

import com.google.logging.type.LogSeverity;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYZP extends zzZ13 {
    private int zzAr;
    private float zzHi;
    private boolean zzY08;
    private String zzY09;
    private com.aspose.words.internal.zzZNR zzY0a;
    private com.aspose.words.internal.zzZNR zzY0b;
    private com.aspose.words.internal.zzZNR zzY0c;
    private boolean zzY0n;
    private boolean zzY0o;
    private boolean zzY0p;
    private zzYZP zzY0q;
    private zzYZP zzY0r;
    private zzZ13 zzY0s;
    private float zzY0t;
    private float zzY1I;
    private int zzY7n;
    private float zzZcc;
    private String zzZi;
    private float zzwo;
    private static int[] zzY0m = {21};
    private static int[] zzY0l = {21, 8};
    private static int[] zzY0k = {13, 14};
    private static int[] zzY0j = {13, 8};
    private static int[] zzY0i = {10, 12};
    private static int[] zzY0h = {10, 11};
    private static int[] zzY0g = {21, 25};
    private static int[] zzY0f = {21, 24};
    private static int[] zzY0e = {6, 8};
    private static int[] zzY0d = {23, 8};
    static String zzZWP = Character.toString(',');

    public zzYZP(zzZ14 zzz14, String str, zzYEF zzyef) {
        super(zzz14, zzyef);
        this.zzY0c = new com.aspose.words.internal.zzZNR(",\\s{2}\\S");
        this.zzY0b = new com.aspose.words.internal.zzZNR(",\\s{2}[.|,]$");
        this.zzY0a = new com.aspose.words.internal.zzZNR(",  ");
        this.zzY08 = false;
        this.zzZi = str;
        this.zzAr = ((Integer) zzyef.zzPj(730)).intValue();
        this.zzY7n = ((Integer) zzyef.zzPj(720)).intValue();
        this.zzY0p = ((Boolean) zzyef.zzPj(710)).booleanValue();
        this.zzY0o = ((Boolean) zzyef.zzPj(LogSeverity.ALERT_VALUE)).booleanValue();
    }

    private void zzF(com.aspose.words.internal.zzPM zzpm) {
        if (!"Cambria Math".equals(zzpm.zzPh()) || this.zzY0p || this.zzY0o) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzZi.length(); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzZ15.zzV(this.zzZi.charAt(i), this.zzAr, this.zzY7n));
        }
        this.zzZi = sb.toString();
    }

    private void zzH(zzYEF zzyef) {
        if ("Cambria Math".equals(this.zzY09) || "MS Mincho".equals(this.zzY09)) {
            if ("Cambria Math".equals(this.zzY09) || zzYG9()) {
                zzyef.zzQ(70, zzZU.zzZF7);
                zzyef.zzQ(60, zzZU.zzZF7);
            } else {
                int iZzYdG = zzyef.zzYdG();
                if (iZzYdG == 1) {
                    zzyef.zzQ(60, zzZU.zzZF6);
                } else if (iZzYdG == 2) {
                    zzyef.zzQ(70, zzZU.zzZF6);
                } else if (iZzYdG == 3) {
                    zzyef.zzQ(70, zzZU.zzZF6);
                    zzyef.zzQ(60, zzZU.zzZF6);
                }
            }
            zzyef.zzYdV();
        }
    }

    private com.aspose.words.internal.zzG zzIe(String str) throws Exception {
        Document documentZzZpS = zzYGj().zzYGE().zzZpS();
        boolean balanceSingleByteDoubleByteWidth = documentZzZpS.getCompatibilityOptions().getBalanceSingleByteDoubleByteWidth();
        documentZzZpS.getCompatibilityOptions().setBalanceSingleByteDoubleByteWidth(false);
        Shape shapeZzi = zzi(documentZzZpS);
        zzYEF zzyefZzYE7 = zzYE7();
        zzyefZzYE7.zzW(zzZU.zzZF7);
        zzYMX zzymx = new zzYMX();
        zzymx.zzwa(0);
        zzymx.zzYpI();
        zzymx.zzwb(0);
        Paragraph paragraph = new Paragraph(documentZzZpS, zzymx, zzyefZzYE7);
        paragraph.zzqy(0).getFont().setBold(false);
        paragraph.zzqy(0).getFont().setItalic(false);
        paragraph.getParagraphFormat().setSpaceBefore(0.0d);
        Run run = new Run(documentZzZpS, str, zzyefZzYE7);
        paragraph.appendChild(run);
        shapeZzi.appendChild(paragraph);
        documentZzZpS.getFirstSection().getBody().getFirstParagraph().appendChild(shapeZzi);
        com.aspose.words.internal.zzG zzgZzyv = shapeZzi.getShapeRenderer().zzyv();
        if (documentZzZpS.getCompatibilityOptions().getUseFELayout() && getIndex() != 0 && zzYE2() != null) {
            paragraph.insertBefore(new Run(documentZzZpS, zzYE2().zzZi, zzYE2().zzZYh()), run);
            documentZzZpS.zzZqk();
            this.zzY0n = (zzG0().zzZ((com.aspose.words.internal.zzZL) shapeZzi.getShapeRenderer().zzyv()).getWidth() - (zzYE2().zzY0n ? zzYE2().zzHi - this.zzY1I : zzYE2().zzHi)) - zzG0().zzZ((com.aspose.words.internal.zzZL) zzgZzyv).getWidth() > this.zzY1I / 2.0f;
            return zzZ(zzgZzyv, documentZzZpS, balanceSingleByteDoubleByteWidth);
        }
        return zzZ(zzgZzyv, documentZzZpS, balanceSingleByteDoubleByteWidth);
    }

    private void zzIf(String str) throws Exception {
        int i = 0;
        com.aspose.words.internal.zzUW zzuw = new com.aspose.words.internal.zzUW(zzZr(), this.zzZi, false, false);
        Iterator<Integer> it = new com.aspose.words.internal.zzZYE(str).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            String strZzZ = zzZ(str, i, zzYGf());
            int iZzZ = com.aspose.words.internal.zzUW.zzZ(zzYGf(), iIntValue);
            if ("MS Mincho".equals(strZzZ) || iZzZ == 0) {
                this.zzY08 = true;
                com.aspose.words.internal.zzPM zzpmZzY = zztv().zzY(strZzZ, getFontSize(), zzza());
                zzh(zzpmZzY.getAscentPoints(), zzpmZzY.getDescentPoints() + zzpmZzY.zzPe());
            } else {
                com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzG0().zzZ((com.aspose.words.internal.zzZL) new com.aspose.words.internal.zzZG(zzuw.zzZ9(iIntValue)));
                zzh(Math.abs(zzzq4ZzZ.getY()), Math.abs(Math.max(zzzq4ZzZ.zzZn(), 0.0f)));
            }
            i++;
        }
    }

    private void zzIg(String str) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            com.aspose.words.internal.zzG zzgZzIe = zzIe(str);
            zzZ(str, zzgZzIe, zzG0().zzZ((com.aspose.words.internal.zzZL) zzgZzIe));
        }
    }

    private String zzIh(String str) {
        int iLastIndexOf = str.lastIndexOf(44) - (com.aspose.words.internal.zzZKN.zzW(str, ",  ,", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? 3 : 0);
        int length = str.length() - iLastIndexOf;
        if (iLastIndexOf >= 0 && length < 5 && (length != 4 || (this.zzY0b.zzUV(str) && zzYG7()))) {
            int i = iLastIndexOf + length;
            String strSubstring = str.substring(iLastIndexOf, i);
            String[] strArr = new String[4];
            zzYZP[] zzyzpArr = new zzYZP[4];
            int i2 = 5 - length;
            zzYZP zzyzpZzYE0 = zzYE0();
            for (int i3 = 0; i2 > 0 && i3 < i2 && zzyzpZzYE0 != null; i3++) {
                int iMin = Math.min(zzyzpZzYE0.zzZi.length(), i2);
                String strSubstring2 = zzyzpZzYE0.zzZi.substring(0, iMin);
                strArr[i3] = strSubstring2;
                zzyzpArr[i3] = zzyzpZzYE0;
                strSubstring = com.aspose.words.internal.zzZKN.zzZI(strSubstring, strSubstring2);
                i2 -= iMin;
                zzyzpZzYE0 = zzyzpZzYE0.zzYE0();
            }
            boolean zZzUV = this.zzY0b.zzUV(strSubstring);
            boolean z = zzYDW() && com.aspose.words.internal.zzZKN.zzW(strSubstring, ",  ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
            if (this.zzY0c.zzUV(strSubstring) || z) {
                String strSubstring3 = str.substring(0, iLastIndexOf);
                str = (!(zzYG7() && zZzUV) && (!z || zzYDV())) ? com.aspose.words.internal.zzZKN.zzZI(strSubstring3, ",         ") : com.aspose.words.internal.zzZKN.zzZI(strSubstring3, str.substring(iLastIndexOf, i).replace(ControlChar.zzZs5, ""));
                for (int i4 = 0; i4 < 4; i4++) {
                    if (!com.aspose.words.internal.zzZKN.zzU3(strArr[i4])) {
                        zzYZP zzyzp = zzyzpArr[i4];
                        zzyzp.zzZi = com.aspose.words.internal.zzZKN.zzU(zzyzp.zzZi, ControlChar.SPACE_CHAR);
                    }
                }
            }
        }
        return str;
    }

    private String zzIi(String str) {
        if (!zzZYh().zzYdI()) {
            boolean zZzd = zzd(10);
            boolean z = zzYGr() != null && zzYGr().isInline();
            if (zzYDY() || zzYDZ() || (zZzd && z)) {
                return this.zzY0a.zzZS(str, zzZWP);
            }
            if (!zZzd && !z) {
                if (zzYDY() || zzYDZ()) {
                    str = this.zzY0a.zzZS(str, zzZWP);
                }
                str = zzIh(str);
                for (com.aspose.words.internal.zzZNT zzznt : this.zzY0c.zzUW(str)) {
                    str = str.replace(zzznt.getValue(), zzznt.getValue().replace(",  ", ",         "));
                }
            }
        }
        return str;
    }

    private void zzIj(String str) throws Exception {
        com.aspose.words.internal.zzZXH zzzxhZzN = zzYGj().zztv().zzN("Cambria Math", 0);
        this.zzY1I = zzZ15.zzW(this);
        boolean z = zzYDY() || zzYDZ();
        StringBuilder sb = new StringBuilder();
        this.zzY09 = getFontName();
        if (zzZYh().zzYdI()) {
            zzTi(false);
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!zzYDS() || cCharAt != '#') {
                String strZzZ = zzZ(str, i, zzzxhZzN);
                if (i == 0) {
                    this.zzY09 = strZzZ;
                }
                if (!com.aspose.words.internal.zzZKN.equals(this.zzY09, strZzZ)) {
                    sb = zzy(sb);
                    sb.append(cCharAt);
                    this.zzY09 = strZzZ;
                } else if (zzZ15.zzYv(cCharAt) && !z) {
                    sb = zzZ(cCharAt, sb, i);
                } else if (zzZ15.zzYs(cCharAt) && z) {
                    sb = zzy(sb);
                    zzYE8();
                } else {
                    if (!z) {
                        zzuh(i);
                    }
                    sb.append(cCharAt);
                }
            }
        }
        zzx(sb);
        zzIg(sb.toString());
    }

    private static boolean zzU(char c, int i, int i2) {
        if (i2 >= i) {
            return i2 == i && !zzZ15.zzYu(c);
        }
        return true;
    }

    private static boolean zzW(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        int length2 = iArr2.length - 1;
        if (iArr.length < iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr2.length; i++) {
            if (iArr[length - i] != iArr2[length2 - i]) {
                return false;
            }
        }
        return true;
    }

    private boolean zzYDS() {
        return (zzYGr() == null || zzYGr().zzYGr() == null || zzYGr().zzYGr().zzYGr() == null || zzYGr().zzYGr().zzYGr().zzYGk().zzZsL().getMathObjectType() != 9) ? false : true;
    }

    private boolean zzYDT() {
        return zzYGr() != null && zzYGr().zzYGk() != null && zzYGr().isInline() && zzYDX();
    }

    private boolean zzYDU() {
        OfficeMath officeMathZzc = zzc(0);
        return officeMathZzc != null && (officeMathZzc.getFirstChild() instanceof zzZAM) && ((zzZAM) officeMathZzc.getFirstChild()).getRunPr_IInline().getUnderline() == 0;
    }

    private boolean zzYDV() {
        return zzYDW() && zzYGr().getIndex() < zzYGr().zzYGr().zzQw().size() - 1 && zzd(9);
    }

    private boolean zzYDW() {
        return (zzYGr() == null || zzYGr().zzYGr() == null || !(zzYGr().zzYGr() instanceof zzZ0L)) ? false : true;
    }

    private boolean zzYDX() {
        return zzd(10);
    }

    private boolean zzYDY() {
        return zzd(24);
    }

    private boolean zzYDZ() {
        return zzd(25);
    }

    private zzYZP zzYE0() {
        zzYZP zzyzp = this.zzY0q;
        if (zzyzp != null) {
            return zzyzp;
        }
        if (zzYGr() == null || getIndex() + 1 > zzYGr().zzQw().size() - 1) {
            return null;
        }
        zzYZP zzyzp2 = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzYGr().zzQw().get(getIndex() + 1), zzYZP.class);
        this.zzY0q = zzyzp2;
        return zzyzp2;
    }

    private zzZ13 zzYE1() {
        if (zzYGr() == null || getIndex() == zzYGr().zzQw().size() - 1) {
            return null;
        }
        return zzYGr().zzQw().get(getIndex() + 1);
    }

    private zzYZP zzYE2() {
        zzYZP zzyzp = this.zzY0r;
        if (zzyzp != null) {
            return zzyzp;
        }
        zzYZP zzyzp2 = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(zzYE3(), zzYZP.class);
        this.zzY0r = zzyzp2;
        return zzyzp2;
    }

    private zzZ13 zzYE3() {
        if (zzYGr() == null) {
            return null;
        }
        zzZ13 zzz13 = this.zzY0s;
        if (zzz13 != null) {
            return zzz13;
        }
        if (getIndex() <= 0) {
            return null;
        }
        zzZ13 zzz132 = zzYGr().zzQw().get(getIndex() - 1);
        this.zzY0s = zzz132;
        return zzz132;
    }

    private float zzYE5() throws Exception {
        return (zzYGa() || zzYGb() || zzYG2() == zzYG5()) ? zzYG5() : (zzYG5() * 2.0f) - zzYG2();
    }

    private float zzYE6() throws Exception {
        if (zzZr().zzPl().zzHR()) {
            return (zzYG5() * 2.0f) - zzZr().getAscentPoints();
        }
        return 0.0f;
    }

    private zzYEF zzYE7() throws Exception {
        zzYEF zzyef = (zzYEF) zzZYh().zzbn();
        if (!zzYG9()) {
            zzyef.getBorder().clearFormatting();
        }
        zzyef.setSize(com.aspose.words.internal.zzSA.zzt(zzZr().zzPg()));
        zzyef.setName(this.zzY09);
        zzyef.zzQ(20, com.aspose.words.internal.zzPV.zzHZ);
        zzyef.getShading().zzZK(com.aspose.words.internal.zzPV.zzHZ);
        if (zzYDY() || zzYDZ() || zzYDU()) {
            zzyef.setUnderline(0);
        }
        if (!zzYG9()) {
            zzyef.setSpacing(0);
        }
        zzH(zzyef);
        return zzyef;
    }

    private void zzYE8() throws Exception {
        String string = Character.toString((char) 8242);
        com.aspose.words.internal.zzG zzgZzIe = zzIe(string);
        zzZ(string, zzgZzIe, zzZ6(zzG0().zzZ((com.aspose.words.internal.zzZL) zzgZzIe)));
    }

    private int[] zzYE9() {
        com.aspose.words.internal.zzKZ zzkz = new com.aspose.words.internal.zzKZ();
        OfficeMath officeMathZzYG8 = zzYG8();
        if (officeMathZzYG8 != null) {
            zzkz.add(officeMathZzYG8.getMathObjectType());
        }
        while (officeMathZzYG8 != null && officeMathZzYG8.getParentNode() != null && officeMathZzYG8.getParentNode().getNodeType() == 35) {
            officeMathZzYG8 = (OfficeMath) officeMathZzYG8.getParentNode();
            zzkz.add(officeMathZzYG8.getMathObjectType());
        }
        zzkz.reverse();
        return zzkz.toArray();
    }

    private float zzYEa() {
        if (!this.zzZi.contains("𝑓")) {
            return 0.06723f;
        }
        float[] fArr = {26.0f, 22.5f, 20.5f, 19.0f, 17.0f, 15.5f, 15.0f, 13.5f, 13.0f, 12.0f, 10.0f, 8.5f, 8.0f, 7.5f, 6.5f, 6.0f, 5.0f, 4.5f, 4.0f, 3.0f, 2.5f, 2.0f, 1.5f, 1.0f};
        for (int i = 0; i < 24; i++) {
            if (zzYGm() == fArr[i] * 2.0f) {
                return -0.025f;
            }
        }
        return 0.06723f;
    }

    private void zzYEb() {
        zzZ11.zzY(this, zzYGm() * zzYEa());
    }

    private void zzYEc() throws Exception {
        zzI(new com.aspose.words.internal.zzZQ4(zzZj().getX(), zzZj().getY(), this.zzHi, this.zzwo));
        zzYp(zzYE5());
        if (zzYG9()) {
            return;
        }
        zzYp((zzYG1() / 2.0f) + zzYGq());
        int[] iArrZzYE9 = zzYE9();
        boolean zZzU = zzZ11.zzU(21, iArrZzYE9);
        boolean zZzU2 = zzZ11.zzU(2, iArrZzYE9);
        boolean zZzU3 = zzZ11.zzU(13, iArrZzYE9);
        boolean zZzU4 = zzZ11.zzU(23, iArrZzYE9);
        boolean zZzb = zzb(iArrZzYE9);
        boolean z = true;
        boolean z2 = zzW(iArrZzYE9, zzY0e) || zzW(iArrZzYE9, new int[]{6});
        if (zZzU || zZzU2 || zZzU3 || zzYDX() || zZzb || z2 || zZzU4) {
            zzIf(this.zzZi);
        }
        if (zZzU || zZzU3 || zzYDX() || zZzb || z2 || zZzU4) {
            boolean zZzW = zzW(iArrZzYE9, zzY0g);
            boolean zZzW2 = zzW(iArrZzYE9, zzY0f);
            if (!zzW(iArrZzYE9, zzY0k) && !zzW(iArrZzYE9, zzY0j)) {
                z = false;
            }
            if (zzW(iArrZzYE9, zzY0m) || zzW(iArrZzYE9, zzY0l) || zZzb || zZzW || zZzW2 || ((z && !zzYDX()) || zzW(iArrZzYE9, zzY0h) || zzW(iArrZzYE9, zzY0i) || z2 || zzW(iArrZzYE9, zzY0d))) {
                float ascentPoints = zzZr().getAscentPoints();
                float descentPoints = zzZr().getDescentPoints();
                float fZzPc = this.zzY08 ? 0.0f : zzZr().zzPc();
                zzZ11.zzZ(this, ((this.zzY0t - zzZj().getHeight()) + descentPoints) - fZzPc);
                zzZ11.zzY(this, (this.zzZcc - descentPoints) + fZzPc);
                if (zzZ11.zzM(this) && (this.zzZi.contains("𝑓") || this.zzZi.contains("q"))) {
                    zzYEb();
                }
                zzYp(((this.zzY0t - ascentPoints) - (zzYG1() / 2.0f)) + zzYGq());
            }
        }
    }

    private float zzYe(float f) throws Exception {
        float fZzYE6 = (-f) + zzYE6();
        if (!com.aspose.words.internal.zzZKN.equals(this.zzY09, getFontName())) {
            fZzYE6 += zzYG5() - (zzIp(this.zzY09) / 2.0f);
        }
        if ((zzYGa() || (zzYGb() && zzZYh().zzYdA() && !zzYDX())) && zzZr().zzOZ() && com.aspose.words.internal.zzZKN.equals(zzYGr().zzZr().zzPh(), zzZr().zzPh())) {
            fZzYE6 += (-zzZr().zzOX().zznI()) * 1.5f;
        }
        return ("Cambria Math".equals(this.zzY09) || zzZYh().getVerticalAlignment() != 2) ? fZzYE6 : ((zzZr().getDescentRawPoints() - zzZr().zzPe()) * 2.0f) + fZzYE6;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.aspose.words.internal.zzZQ4 zzZ6(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq42;
        float ascentPoints;
        float f;
        if (zzZYh().contains(400)) {
            boolean z = true;
            if (((Integer) zzZYh().zzPk(400)).intValue() == 1) {
                OfficeMath officeMathZzYGk = zzYGk() == null ? zzYGr().zzYGk() : zzYGk();
                boolean z2 = false;
                if (officeMathZzYGk != null) {
                    int iIntValue = ((Integer) officeMathZzYGk.getDocument().getStyles().zzY37().zzPk(390)).intValue();
                    if (!zzZ3X.zzwN(iIntValue) && !zzZ3X.zzwO(iIntValue)) {
                        z = false;
                    }
                    z2 = z;
                }
                float fZzPg = zzZr().zzPg();
                float y = zzzq4.getY();
                if (z2) {
                    y -= zzzq4.getHeight() * 0.15f;
                }
                float x = zzzq4.getX();
                zzzq42 = new com.aspose.words.internal.zzZQ4(z2 ? x - (zzzq4.getHeight() * 0.2f) : x - (0.2f * fZzPg), y, fZzPg, zzzq4.getHeight() * (z2 ? 1.2f : 0.9f));
                float f2 = this.zzY0t;
                com.aspose.words.internal.zzPM zzpmZzZr = zzZr();
                if (z2) {
                    ascentPoints = zzpmZzZr.getLineSpacingPoints();
                    f = 0.95f;
                } else {
                    ascentPoints = zzpmZzZr.getAscentPoints();
                    f = 1.1f;
                }
                this.zzY0t = Math.max(f2, ascentPoints * f);
            } else {
                zzzq42 = new com.aspose.words.internal.zzZQ4(zzzq4.getX(), -zzzq4.getY(), zzzq4.getWidth(), zzzq4.getHeight() * 0.25f);
            }
        }
        this.zzwo = Math.max(this.zzwo, zzzq42.getHeight());
        return zzzq42;
    }

    private float zzZ7(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        float fMax = Math.max(this.zzwo, zzZr().zzPg());
        if (zzYGr() == null) {
            return fMax;
        }
        if (zzYGr().zzYG8().getMathObjectType() != 0 && zzYGr().zzYG8().getMathObjectType() != 1) {
            return fMax;
        }
        if (zzzq4.getHeight() > zzZr().zzPg() * 2.0f) {
            fMax = zzzq4.getHeight();
        }
        if (zzZr().zzPe() != 0.0f) {
            return fMax;
        }
        return (zzZr().zzOX().zznJ() * 2.0f) + zzZr().zzPg();
    }

    private static int zzZn(String str, int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        for (int i3 = i - 1; i3 >= 0; i3--) {
            if (!zzZ15.zzYu(str.charAt(i3))) {
                return zzZ15.zzYv(str.charAt(i3)) ? i2 + 1 : i2;
            }
            i2++;
        }
        return i2;
    }

    private static boolean zzb(int[] iArr) {
        return zzW(iArr, new int[]{25}) || zzW(iArr, new int[]{24}) || (zzW(iArr, new int[]{27, 8}) || zzW(iArr, new int[]{29, 8}) || zzW(iArr, new int[]{28, 8}) || zzW(iArr, new int[]{26, 8}) || zzW(iArr, new int[]{27, 8}));
    }

    private void zzh(float f, float f2) {
        this.zzY0t = Math.max(this.zzY0t, f);
        this.zzZcc = Math.max(this.zzZcc, f2);
    }

    private static Shape zzi(Document document) throws Exception {
        Shape shape = new Shape(document);
        shape.setStroked(false);
        shape.setFilled(false);
        shape.setWidth(document.getFirstSection().getPageSetup().getPageWidth());
        shape.setHeight(document.getFirstSection().getPageSetup().getPageHeight());
        shape.getTextBox().setTextBoxWrapMode(2);
        shape.getTextBox().setInternalMarginLeft(0.0d);
        shape.getTextBox().setInternalMarginTop(0.0d);
        shape.getTextBox().setInternalMarginRight(0.0d);
        shape.getTextBox().setInternalMarginBottom(0.0d);
        return shape;
    }

    private void zzr(int i, String str) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ11.zzZ(i, zzYGf(), zzZr().zzPg(), zzZy());
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzzgZzZ);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzG0().zzZ((com.aspose.words.internal.zzZL) zzzgZzZ);
        float fZzPg = zzZr().zzPg() / 15.0f;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(fZzPg, (zzZr().zzPg() + zzzq4ZzZ.getY()) - zzZr().getDescentPoints(), 1);
        zzzgZzZ.zzY(zzp9);
        zzZ(str, zzg, zzzq4ZzZ);
        this.zzHi = (fZzPg * 2.0f) + this.zzHi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    private boolean zzue(int i) {
        int iZzYv = zzZ15.zzYv(this.zzZi.charAt(i));
        zzYZP zzyzpZzYE2 = this;
        while (zzyzpZzYE2 != null) {
            iZzYv = iZzYv;
            if (i > 0) {
                int iZzZn = zzZn(zzyzpZzYE2.zzZi, i);
                int i2 = iZzYv + iZzZn;
                iZzYv = i2;
                if (zzU(zzyzpZzYE2.zzZi.charAt(0), i, iZzZn)) {
                    return com.aspose.words.internal.zzAN.zzZP(i2);
                }
            }
            if (zzyzpZzYE2.zzYE2() == null && zzyzpZzYE2.zzYE3() != null) {
                return com.aspose.words.internal.zzAN.zzZP((long) iZzYv);
            }
            zzyzpZzYE2 = zzyzpZzYE2.zzYE2();
            i = zzyzpZzYE2 == null ? 0 : zzyzpZzYE2.zzZi.length();
        }
        return com.aspose.words.internal.zzAN.zzZP(iZzYv + 1);
    }

    private char zzuf(int i) {
        int length;
        if (i > 0) {
            return this.zzZi.charAt(i - 1);
        }
        if (zzYE2() == null || (length = zzYE2().zzZi.length()) == 0) {
            return (char) 0;
        }
        return zzYE2().zzZi.charAt(length - 1);
    }

    private boolean zzug(int i) {
        if (zzYDT()) {
            return false;
        }
        char cCharAt = this.zzZi.charAt(i);
        boolean zZzYv = zzZ15.zzYv(cCharAt);
        boolean zZzYu = zzZ15.zzYu(cCharAt);
        boolean zZzYt = zzZ15.zzYt(cCharAt);
        char cZzuf = zzuf(i);
        boolean zZzYv2 = zzZ15.zzYv(cZzuf);
        boolean zZzYu2 = zzZ15.zzYu(cZzuf);
        if (zZzYv) {
            if (zZzYv2 && !zZzYu) {
                return zZzYu2 && !zZzYt && zzue(i);
            }
            return true;
        }
        if (!zZzYv2 || zZzYu2) {
            return zZzYu2 && zzue(i);
        }
        return true;
    }

    private void zzuh(int i) {
        char cZzuf = zzuf(0);
        if ((!zzZYh().zzYdI() || zzYE3() == null || (zzZ15.zzYv(cZzuf) && !zzYE3().zzZYh().zzYdI())) && zzug(i)) {
            this.zzHi += this.zzY1I;
        }
    }

    private static void zzx(StringBuilder sb) {
        if (sb.length() == 0) {
            return;
        }
        int length = sb.length();
        int i = length - 1;
        if (sb.charAt(i) == ' ') {
            sb.delete(i, length);
            sb.append(ControlChar.NON_BREAKING_SPACE_CHAR);
        }
    }

    private StringBuilder zzy(StringBuilder sb) throws Exception {
        if (sb.length() <= 0) {
            return sb;
        }
        zzIg(sb.toString());
        return new StringBuilder();
    }

    public final String getText() {
        return this.zzZi;
    }

    public final float zzYE4() {
        return this.zzY0t;
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return false;
    }

    @Override // com.aspose.words.zzZ13
    public final com.aspose.words.internal.zzZQ4 zzYGt() throws Exception {
        return zzd(21) ? new com.aspose.words.internal.zzZQ4(zzZj().getX(), zzZr().getAscentPoints() - this.zzY0t, zzZj().getWidth(), this.zzY0t + this.zzZcc) : zzZj();
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGu() {
        if (!zzYG9() && zzZYh().zzYdz() && zzYG8().getMathObjectType() != 1) {
            return true;
        }
        if (zzZYh().contains(235) && zzZYh().zzYdG() != 2) {
            zzU1 zzu1 = (zzU1) zzZYh().zzPk(235);
            zzU1 zzu1ZzMW = zzU1.zzMW(131075);
            if (zzu1ZzMW.zzZYI() && zzu1ZzMW.zzZYJ() == 131075 && !zzu1.zzZYI() && "MS Mincho".equals(zzu1.getName())) {
                return true;
            }
        }
        return super.zzYGu();
    }

    @Override // com.aspose.words.zzZ13
    public final String zzYGv() {
        return (this.zzZi.length() <= 0 || !zzZ15.zzYv(this.zzZi.charAt(0)) || this.zzY0p || zzYGb() || zzYGa()) ? super.zzYGv() : "Cambria Math";
    }

    @Override // com.aspose.words.zzZ13
    public void zzYHg() throws Exception {
        if (this.zzZi.length() == 0) {
            return;
        }
        this.zzZi = zzIi(this.zzZi);
        zzF(zzZr());
        zzIj(this.zzZi);
        zzYEc();
        zzYGB();
        this.zzY25 = false;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        throw new UnsupportedOperationException("Text element cannot have children.");
    }

    private String zzZ(String str, int i, com.aspose.words.internal.zzZXH zzzxh) {
        zzU1 zzu1ZzYdR = zzZYh().zzYdR();
        char cCharAt = str.charAt(i);
        if (zzZ15.zzYp(cCharAt)) {
            return "MS Mincho";
        }
        if ((zzZ15.zzYv(cCharAt) || zzZ15.zzYr(cCharAt)) && !zzYG9() && zzZz()) {
            return "Cambria Math";
        }
        if (com.aspose.words.internal.zzZVS.zz3(cCharAt)) {
            return this.zzY09;
        }
        return zzzxh.zzpP().zzSw(com.aspose.words.internal.zzZVS.zzA(str, i)) ? getFontName() : (!(zzu1ZzYdR.zzZYI() && zzu1ZzYdR.zzZYJ() == 131075 && "Cambria Math".equals(getFontName())) && (zzu1ZzYdR.zzZYI() || !"Cambria Math".equals(zzu1ZzYdR.getName()))) ? (!(zzZYh().zzZ7n() == 1 && !zzZYh().zzYdR().zzZYI() && "MS Mincho".equals(zzZYh().zzYdR().getName())) && (zzZYh().zzYdP().zzZYI() || !"MS Mincho".equals(zzZYh().zzYdP().getName()))) ? (zzZYh().zzYdP().zzZYI() || "Times New Roman".equals(zzZYh().zzYdP().getName())) ? getFontName() : zzZYh().zzYdP().getName() : "MS Mincho" : "MS Mincho";
    }

    private StringBuilder zzZ(char c, StringBuilder sb, int i) throws Exception {
        StringBuilder sbZzy = zzy(sb);
        String string = Character.toString(c);
        if (zzYDT() && zzYGe()) {
            com.aspose.words.internal.zzD4 zzd4ZzYGJ = zzZ15.zzYGJ();
            int iZzZ = com.aspose.words.internal.zzUW.zzZ(zzYGf(), (int) c);
            if (zzd4ZzYGJ.zzVE(iZzZ)) {
                zzr(zzd4ZzYGJ.get(iZzZ), string);
                return sbZzy;
            }
            zzIg(string);
            return sbZzy;
        }
        if (zzZYh().zzYdI() && "Cambria Math".equals(getFontName())) {
            zzIg(string);
            return sbZzy;
        }
        if (i == 0 && zzZ11.zzJ(zzYE3())) {
            this.zzHi = (this.zzY1I / 2.0f) + this.zzHi;
        } else {
            zzuh(i);
        }
        zzIg(string);
        if (i == this.zzZi.length() - 1 && zzYE0() == null && !zzYDT()) {
            this.zzHi = ((zzZ11.zzJ(zzYE1()) ? 0.5f : 1.0f) * this.zzY1I) + this.zzHi;
        }
        return sbZzy;
    }

    private void zzZ(String str, com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        this.zzHi += this.zzY0n ? this.zzY1I : 0.0f;
        zzg.zzZO().zzY((-zzzq4.zzZm()) + this.zzHi, zzYe(zzzq4.zzZo()), 0);
        float width = zzzq4.getWidth();
        if (zzZYh().getScaling() != 100) {
            width = (zzZr().zz7(str) * zzZYh().getScaling()) / 100.0f;
        }
        this.zzHi += width;
        this.zzwo = zzZ7(zzzq4);
        zzYGn().zzX((com.aspose.words.internal.zzZL) zzg);
    }

    private static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, Document document, boolean z) {
        document.getCompatibilityOptions().setBalanceSingleByteDoubleByteWidth(z);
        return zzg;
    }
}
