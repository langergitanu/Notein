package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;
import com.google.logging.type.LogSeverity;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSE {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("viewBox", "points", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "engine", "[-]", "+", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, C18358t1.g.f56183c, "/", "sin", "cos", "if", "abs", "sqrt", "min", "max", "atan2", ContextChain.TAG_PRODUCT_AND_INFRA, "left", "top", "right", "bottom", "handle-position", "handle-mirror-horizontal", "handle-mirror-vertical", "handle-switched", "handle-range-x-minimum", "handle-range-x-maximum", "handle-range-y-minimum", "handle-range-y-maximum", "handle-polar", "handle-radius-range-maximum", "handle-radius-range-minimum", "hasfill", "hasstroke", "height", "logheight", "logwidth", "width", "xstretch", "ystretch", "concentric-gradient-fill-allowed", "extrusion-allowed", "extrusion-color", "extrusion-number-of-line-segments", "text-path-allowed", "text-path-mode", "text-path-same-letter-heights", "text-path-scale", "text-rotate-angle", C18437z2.f56754h, "enhanced-path", "modifiers", "text-path", "text-areas", "mirror-horizontal", "mirror-vertical", "path-stretchpoint-x", "path-stretchpoint-y", "shade-mode", "projection", "glue-point-type", "glue-points", "glue-point-leaving-directions", "extrusion", "extrusion-brightness", "extrusion-shininess", "extrusion-specularity", "extrusion-diffusion", "extrusion-metal", "extrusion-rotation-angle", "extrusion-origin", "extrusion-first-light-direction", "extrusion-second-light-direction", "extrusion-rotation-center", "extrusion-skew", "extrusion-depth", "extrusion-viewpoint", "extrusion-first-light-level", "extrusion-second-light-level", "extrusion-first-light-harsh", "extrusion-second-light-harsh", "extrusion-light-face");
    private zzYQ7 zzXQE;
    private boolean zzXQF;
    private int zzXQH;
    private int zzXQI;
    private int zzXQJ;
    private int zzXQK;
    private String[] zzXQL;
    private String[] zzXQM;
    private String[] zzXQN;
    private zzZL3[] zzXQP;
    private zzYC3 zzXQQ;
    private Shape zzZ2R;
    private StringBuilder zzxe = new StringBuilder();
    private ArrayList<Object> zzXQO = new ArrayList<>();
    private ArrayList<zzYRS> zzXQR = new ArrayList<>();
    private boolean zzXQG = false;

    public zzYSE(zzYQ7 zzyq7) {
        this.zzXQE = zzyq7;
    }

    private void zzFA(String str) {
        boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(str);
        this.zzXQF = zEquals;
        this.zzXQQ.zzQ(241, Boolean.valueOf(zEquals));
        if (this.zzXQF) {
            this.zzXQQ.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 136);
        }
    }

    private void zzFB(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        int[] iArr = new int[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            iArr[i] = zzYOU.zzDH(com.aspose.words.internal.zzZKN.zzS(strArrZzR[i], ControlChar.SPACE_CHAR));
        }
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_3_ACCENT_2, iArr);
    }

    private void zzFC(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str.replace("(", "").replace(")", ""), ControlChar.SPACE_CHAR);
        if (strArrZzR.length == 3) {
            this.zzXQQ.zzQ(715, Integer.valueOf(zzYSF.zzFU(strArrZzR[0])));
            this.zzXQQ.zzQ(716, Integer.valueOf(zzYSF.zzFU(strArrZzR[1])));
            this.zzXQQ.zzQ(717, Integer.valueOf(zzYSF.zzFU(strArrZzR[2])));
        }
    }

    private void zzFD(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        if (strArrZzR.length != 2) {
            return;
        }
        this.zzXQQ.zzQ(645, Integer.valueOf(zzYSF.zzFU(strArrZzR[0])));
        this.zzXQQ.zzQ(644, Integer.valueOf(com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzJB.parseDouble(strArrZzR[1]))));
    }

    private void zzFE(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR);
        if (strArrZzR.length == 2) {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(strArrZzR[0]);
            if (iZzZo != Integer.MIN_VALUE) {
                this.zzXQQ.zzQ(721, Integer.valueOf(iZzZo));
            }
            this.zzXQQ.zzQ(720, Integer.valueOf(zzYOU.zzDH(strArrZzR[1])));
        }
    }

    private void zzFF(String str) {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(str.replace("%", ""));
        if (iZzZo != Integer.MIN_VALUE) {
            this.zzXQQ.zzQ(642, Integer.valueOf(iZzZo / 10));
        }
    }

    private void zzFG(String str) {
        if ("draft".equals(str)) {
            this.zzXQQ.zzQ(713, 1);
        } else {
            this.zzXQQ.zzQ(713, 0);
            this.zzXQE.zzv("draw:custom-shape", "dr3d:shade-mode", str);
        }
    }

    private static boolean zzFH(String str) {
        return str.contains("height") || str.contains("width") || str.contains("xstretch") || str.contains("ystretch") || str.contains("hasfill") || str.contains("hasstroke") || str.contains("tan");
    }

    private void zzFI(String str) {
        if (zzFH(str.toLowerCase())) {
            this.zzXQE.zzT(256, "Import of hasfill, hasstroke, height, logheight, logwidth, width, xstretch, ystretch, tan(n) and atan(n) values for 'draw:equation' -> 'draw:formula' attribute are not supported for this format by Aspose.Words");
        }
    }

    private static boolean zzFJ(String str) {
        switch (zzUR.zzTP(str)) {
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                return true;
            default:
                return false;
        }
    }

    private double zzFK(String str) {
        int i;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0.0d;
        }
        switch (zzUR.zzTP(str.toLowerCase())) {
            case 17:
                return 3.141592653589793d;
            case 18:
                i = this.zzXQK;
                break;
            case 19:
                i = this.zzXQJ;
                break;
            case 20:
                boolean zZzYut = this.zzXQE.zzYut();
                int iZzYur = this.zzXQE.zzYur();
                return zZzYut ? ((double) iZzYur) * this.zzXQE.zzYup() : iZzYur;
            case 21:
                boolean zZzYus = this.zzXQE.zzYus();
                int iZzYuq = this.zzXQE.zzYuq();
                return zZzYus ? ((double) iZzYuq) / this.zzXQE.zzYup() : iZzYuq;
            default:
                if (str.charAt(0) == '$') {
                    int iZzZo = com.aspose.words.internal.zzJB.zzZo(str.substring(1));
                    String[] strArr = this.zzXQL;
                    if (strArr == null || iZzZo > strArr.length - 1) {
                        return 0.0d;
                    }
                    double dZzZs = com.aspose.words.internal.zzJB.zzZs(strArr[iZzZo]);
                    if (!Double.isNaN(dZzZs)) {
                        return dZzZs;
                    }
                }
                double dZzZs2 = com.aspose.words.internal.zzJB.zzZs(str);
                if (Double.isNaN(dZzZs2)) {
                    return 0.0d;
                }
                return dZzZs2;
        }
        return i;
    }

    private void zzFL(String str) {
        String str2 = null;
        for (String str3 : com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR)) {
            str2 = str2 == null ? "M" : com.aspose.words.internal.zzZKN.format("{0} L", str2);
            String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str3, ',');
            if (strArrZzR.length == 2) {
                str2 = com.aspose.words.internal.zzZKN.format("{0} {1} {2}", str2, strArrZzR[0], strArrZzR[1]);
            }
        }
        if (str2 != null) {
            str2 = this.zzXQG ? com.aspose.words.internal.zzZKN.format("F {0} N", str2) : com.aspose.words.internal.zzZKN.format("{0} Z N", str2);
        }
        zzFy(str2);
    }

    private void zzFM(String str) {
        this.zzXQE.zzE5(null);
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        this.zzXQE.zzZ(zzyq9ZzYuT, this.zzXQQ, str);
        boolean z = false;
        boolean z2 = false;
        while (zzyq9ZzYuT.zzi()) {
            zzYQ7 zzyq7 = this.zzXQE;
            if (!zzyq7.zzV(zzyq7, this.zzXQQ, str)) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP == 0) {
                    this.zzXQE.zzZ(zzyq9ZzYuT.getValue(), false, false, this.zzXQQ);
                    zzYwO();
                    z = true;
                } else if (iZzTP == 1) {
                    zzFL(zzyq9ZzYuT.getValue());
                    z2 = true;
                } else if (iZzTP == 2 || iZzTP == 3) {
                    this.zzXQE.zzZ(256, false, str);
                } else {
                    zzYQ7 zzyq72 = this.zzXQE;
                    zzyq72.zzYi(str, zzyq72.zzYuT().getLocalName());
                }
            }
        }
        if (z && z2) {
            zzYwK();
        }
    }

    private void zzFN(String str) throws Exception {
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            if (!zzYQ7.zzZ(this.zzXQE, this.zzZ2R) && !this.zzXQE.zzR(this.zzXQQ)) {
                if ("enhanced-geometry".equals(zzyq9ZzYuT.getLocalName())) {
                    zzYwT();
                }
                if (zzYQ7.zzE8(zzyq9ZzYuT.getLocalName())) {
                    this.zzXQE.zzZ(1, true, str);
                }
            }
        }
        if (this.zzXQF) {
            this.zzXQQ.zzQ(192, this.zzZ2R.getText());
            this.zzZ2R.getChildNodes(0, false).clear();
        }
        zzZL3[] zzzl3Arr = this.zzXQP;
        if (zzzl3Arr == null || zzzl3Arr.length <= 0) {
            return;
        }
        this.zzZ2R.zzYvW().zzQ(StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_2, this.zzXQP);
    }

    private static int zzFr(String str) {
        String lowerCase = str.toLowerCase();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "[-]", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "[+]", i)) {
            return 3;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "if", i)) {
            return 2;
        }
        boolean z = com.aspose.words.internal.zzZKN.zzS(lowerCase, "min", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "max", i);
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "abs", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "sin", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "cos", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "tan", i) || z) {
            return 3;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "atan2", i)) {
            return 5;
        }
        return (com.aspose.words.internal.zzZKN.zzS(lowerCase, "sqrt", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "atan", i)) ? 4 : 0;
    }

    private static int zzFs(String str) {
        String lowerCase = str.toLowerCase();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, ContextChain.TAG_PRODUCT_AND_INFRA, i)) {
            return 2;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "top", i)) {
            return 3;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "left", i)) {
            return 4;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "right", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "width", i)) {
            return 5;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "bottom", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "height", i)) {
            return 6;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "hasfill", i)) {
            return 7;
        }
        if (com.aspose.words.internal.zzZKN.zzS(lowerCase, "xstretch", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "ystretch", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "logwidth", i)) {
            return 8;
        }
        return (com.aspose.words.internal.zzZKN.zzS(lowerCase, "hasstroke", i) || com.aspose.words.internal.zzZKN.zzS(lowerCase, "logheight", i)) ? 9 : 0;
    }

    private static boolean zzFt(String str) {
        return str.length() == 1 && zzYv(str.charAt(0));
    }

    private static boolean zzFu(String str) {
        return zzFr(str) == 0 && !zzFt(str);
    }

    private static String zzFv(String str) {
        StringBuilder sb = new StringBuilder();
        boolean zZzV = true;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt == '+' || cCharAt == '-') && zZzV) {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("[{0}] ", Character.valueOf(cCharAt)));
                zZzV = false;
            } else {
                sb.append(cCharAt);
            }
            zZzV = zzV(cCharAt, zZzV);
        }
        return sb.toString();
    }

    private static String[] zzFw(String str) {
        boolean z;
        com.aspose.words.internal.zzZQC zzzqc = new com.aspose.words.internal.zzZQC();
        StringBuilder sb = new StringBuilder();
        String strZzFv = zzFv(str);
        int i = 0;
        boolean z2 = false;
        boolean zZzZ = false;
        boolean z3 = true;
        while (i < strZzFv.length()) {
            int i2 = i;
            char cCharAt = strZzFv.charAt(i2);
            int iZzFr = zzFr(strZzFv.substring(i2));
            if (zzY9(cCharAt)) {
                if (zzZ((com.aspose.words.internal.zzZQC<Object>) zzzqc, z2)) {
                    com.aspose.words.internal.zzZNH.zzZ(sb, " {0}", zzzqc.pop());
                }
                z2 = false;
            }
            if (zzW(cCharAt, zZzZ)) {
                sb.append(cCharAt);
                z = true;
            } else {
                z = z2;
            }
            int iZzZ = !zZzZ ? zzZ(strZzFv, i2, sb, iZzFr, (com.aspose.words.internal.zzZQC<Object>) zzzqc) : i2;
            zZzZ = zzZ(cCharAt, iZzZ, (com.aspose.words.internal.zzZQC<Object>) zzzqc, sb, z3, zZzZ);
            z3 = cCharAt == '(' || zzYv(cCharAt) || iZzFr != 0 || (cCharAt == ' ' && z3);
            i = iZzZ + 1;
            z2 = z;
        }
        zzZ(sb, (com.aspose.words.internal.zzZQC<Object>) zzzqc);
        return com.aspose.words.internal.zzZKN.zzR(sb.toString(), ControlChar.SPACE_CHAR);
    }

    private int zzFx(String str) {
        for (zzYRS zzyrs : this.zzXQR) {
            if (com.aspose.words.internal.zzZKN.equals(zzyrs.zzLJ, str)) {
                double dZzZs = com.aspose.words.internal.zzJB.zzZs(zzyrs.zzXPz);
                if (!Double.isNaN(dZzZs)) {
                    return zzYOU.zzR((int) dZzZs, this.zzXQE.zzYuu());
                }
            }
        }
        return 0;
    }

    private void zzFy(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (zzYS3.zzY7(cCharAt) != -1) {
                zzYwN();
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Character>) this.zzXQO, Character.valueOf(cCharAt));
            } else if (cCharAt == '$' || cCharAt == '?') {
                zzYwN();
                this.zzxe.append(cCharAt);
            } else if (Character.isDigit(cCharAt) || cCharAt == '-' || Character.isLetter(cCharAt)) {
                this.zzxe.append(cCharAt);
            } else {
                zzYwN();
            }
        }
        zzYwN();
    }

    private void zzFz(String str) {
        this.zzXQL = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(str), ControlChar.SPACE_CHAR);
        int i = 0;
        while (true) {
            String[] strArr = this.zzXQL;
            if (i >= strArr.length || i >= 8) {
                return;
            }
            double dZzZs = com.aspose.words.internal.zzJB.zzZs(strArr[i]);
            if (!Double.isNaN(dZzZs)) {
                this.zzXQQ.zzQ(i + StyleIdentifier.LIST_TABLE_6_COLORFUL, Integer.valueOf(zzYOU.zzR(com.aspose.words.internal.zzAN.zzZG(dZzZs), this.zzXQE.zzYuu())));
            }
            i++;
        }
    }

    private zzYM2 zzM(String str, boolean z, boolean z2) {
        Object objZzPk;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(str, "$", i)) {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(str.substring(1));
            if (iZzZo >= 0 && iZzZo < 10 && (objZzPk = this.zzXQQ.zzPk(iZzZo + StyleIdentifier.LIST_TABLE_6_COLORFUL)) != null) {
                return new zzYM2(((Integer) objZzPk).intValue(), true);
            }
        } else {
            if (com.aspose.words.internal.zzZKN.zzS(str, MsalUtils.QUERY_STRING_SYMBOL, i)) {
                return new zzYM2(zzFx(str.substring(1)), false);
            }
            int iZzZo2 = com.aspose.words.internal.zzJB.zzZo(str);
            boolean zZzYut = this.zzXQE.zzYut();
            boolean zZzYus = this.zzXQE.zzYus();
            int iZzYur = this.zzXQE.zzYur();
            int iZzYuq = this.zzXQE.zzYuq();
            double dZzYup = this.zzXQE.zzYup();
            if (zZzYut && z2 && iZzZo2 == iZzYur) {
                iZzZo2 = (int) (((double) iZzZo2) * dZzYup);
            }
            if (zZzYus && !z2 && iZzZo2 == iZzYuq) {
                iZzZo2 = (int) (((double) iZzZo2) / dZzYup);
            }
            if (iZzZo2 != Integer.MIN_VALUE) {
                if (!z) {
                    iZzZo2 = zzYOU.zzR(iZzZo2, this.zzXQE.zzYuu());
                }
                return new zzYM2(iZzZo2);
            }
        }
        return new zzYM2();
    }

    private static boolean zzV(char c, boolean z) {
        if (c == '(' || zzYv(c)) {
            return true;
        }
        return c == ' ' && z;
    }

    private static boolean zzW(char c, boolean z) {
        if ((Character.isDigit(c) || c == '.') && !z) {
            return true;
        }
        return Character.isLetterOrDigit(c) && z;
    }

    private static boolean zzWy(int i, int i2) {
        return (i2 == 167 || i2 == 168) && i2 == i;
    }

    private static StringBuilder zzX(com.aspose.words.internal.zzZQC<Object> zzzqc) {
        StringBuilder sb = new StringBuilder();
        while (zzzqc.size() != 0 && !zzZk(zzzqc.peek())) {
            if (!(zzzqc.peek() instanceof String) || zzFr(zzzqc.peek().toString()) == 0) {
                zzzqc.pop();
            } else {
                com.aspose.words.internal.zzZNH.zzZ(sb, zzzqc.pop());
            }
        }
        if (zzFr(sb.toString()) != 0) {
            return sb;
        }
        throw new IllegalStateException("ODT formula is wrong");
    }

    private static int zzY8(char c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        return (c == '*' || c == '/') ? 2 : 0;
    }

    private static boolean zzY9(char c) {
        return c == ' ' || c == '?' || c == ',' || c == ')' || Character.isLetter(c) || zzYv(c);
    }

    private boolean zzYq(String str, String str2) {
        switch (zzUR.zzTP(str)) {
            case 64:
                if (TelemetryEventStrings.Value.TRUE.equals(str2)) {
                    this.zzXQQ.zzQ(LogSeverity.ALERT_VALUE, Boolean.TRUE);
                }
                break;
            case 65:
                this.zzXQQ.zzQ(722, Integer.valueOf(zzYOU.zzDy(str2)));
                break;
            case 66:
                zzFF(str2);
                break;
            case 67:
                this.zzXQQ.zzQ(640, Integer.valueOf(zzYOU.zzDy(str2)));
                break;
            case 68:
                this.zzXQQ.zzQ(641, Integer.valueOf(zzYOU.zzDy(str2)));
                break;
            case 69:
                if (TelemetryEventStrings.Value.TRUE.equals(str2)) {
                    this.zzXQQ.zzQ(701, Boolean.TRUE);
                }
                break;
            case 70:
                zzZ(this.zzXQQ, 705, 704, -1, str2);
                break;
            case 71:
                zzZ(this.zzXQQ, 718, 719, -1, str2);
                break;
            case 72:
                zzZ(this.zzXQQ, 723, 724, 725, str2);
                break;
            case 73:
                zzZ(this.zzXQQ, 727, 728, 729, str2);
                break;
            case 74:
                zzZ(this.zzXQQ, 710, 711, 712, str2);
                break;
            case 75:
                zzFE(str2);
                break;
            case 76:
                zzFD(str2);
                break;
            case 77:
                zzFC(str2);
                break;
            case 78:
                this.zzXQQ.zzQ(726, Integer.valueOf(zzYOU.zzDI(str2)));
                break;
            case 79:
                this.zzXQQ.zzQ(730, Integer.valueOf(zzYOU.zzDI(str2)));
                break;
            case 80:
                if (TelemetryEventStrings.Value.FALSE.equals(str2)) {
                    this.zzXQQ.zzQ(766, Boolean.FALSE);
                }
                break;
            case 81:
                if (TelemetryEventStrings.Value.TRUE.equals(str2)) {
                    this.zzXQQ.zzQ(767, Boolean.TRUE);
                }
                break;
            case 82:
                if (TelemetryEventStrings.Value.FALSE.equals(str2)) {
                    this.zzXQQ.zzQ(703, Boolean.FALSE);
                }
                break;
        }
        return true;
    }

    private boolean zzYr(String str, String str2) {
        switch (zzUR.zzTP(str)) {
            case 61:
                this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_3, Integer.valueOf(zzYS3.zzFj(str2)));
                break;
            case 62:
                this.zzXQM = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(str2), ControlChar.SPACE_CHAR);
                break;
            case 63:
                zzFB(str2);
                break;
        }
        return true;
    }

    private static boolean zzYv(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private void zzYwK() {
        zzYM6 zzym6;
        ArrayList<zzYM5> arrayList = new ArrayList<>();
        ArrayList<zzYM6> arrayList2 = new ArrayList<>();
        zzYM6 zzym62 = new zzYM6();
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.zzXQO.size()) {
            if (zzZj(this.zzXQO.get(i3))) {
                RefInt refInt = new RefInt(i2);
                Ref<zzYM6> ref = new Ref<>(zzym62);
                zzZ(i3, arrayList2, i, refInt, ref);
                int i4 = refInt.get();
                zzym6 = ref.get();
                i3++;
                i2 = i4;
                z = true;
            } else {
                int i5 = i3;
                boolean z2 = z;
                Ref<zzYM6> ref2 = new Ref<>(zzym62);
                RefInt refInt2 = new RefInt(i5);
                int iZzZ = zzZ(z2, arrayList2, arrayList, i, i2, ref2, refInt2);
                zzym6 = ref2.get();
                i2 = iZzZ;
                i3 = refInt2.get();
                z = false;
            }
            zzym62 = zzym6;
            i = i2;
        }
        zzZi(arrayList);
        zzZj(arrayList2);
    }

    private void zzYwL() {
        String[] strArr = this.zzXQM;
        if (strArr == null) {
            return;
        }
        int length = strArr.length / 2;
        zzYM5[] zzym5Arr = new zzYM5[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            zzym5Arr[i] = new zzYM5(zzM(this.zzXQM[i2], false, true), zzM(this.zzXQM[i2 + 1], false, false));
        }
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_2, zzym5Arr);
    }

    private void zzYwM() {
        String[] strArr = this.zzXQN;
        if (strArr == null || strArr.length < 4) {
            return;
        }
        zzYM4[] zzym4Arr = new zzYM4[strArr.length / 4];
        for (int i = 0; i < this.zzXQN.length; i += 4) {
            zzYM4 zzym4 = new zzYM4();
            zzym4.zzXFj = zzM(this.zzXQN[i], false, true);
            zzym4.zzXFi = zzM(this.zzXQN[i + 1], false, false);
            zzym4.zzXFh = zzM(this.zzXQN[i + 2], false, true);
            zzym4.zzXFg = zzM(this.zzXQN[i + 3], false, false);
            zzym4Arr[i / 4] = zzym4;
        }
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, zzym4Arr);
    }

    private void zzYwN() {
        String string = this.zzxe.toString();
        if (string.length() > 0) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) this.zzXQO, string);
        }
        this.zzxe.setLength(0);
    }

    private void zzYwO() {
        Object objZzPk = this.zzXQQ.zzPk(4125);
        Object objZzPk2 = this.zzXQQ.zzPk(4126);
        Object objZzPk3 = this.zzXQQ.zzPk(4127);
        Object objZzPk4 = this.zzXQQ.zzPk(4128);
        if (objZzPk != null) {
            this.zzXQK = ((Integer) objZzPk).intValue();
        }
        if (objZzPk2 != null) {
            this.zzXQJ = ((Integer) objZzPk2).intValue();
        }
        if (objZzPk3 != null) {
            this.zzXQI = ((Integer) objZzPk3).intValue();
        }
        if (objZzPk4 != null) {
            this.zzXQH = ((Integer) objZzPk4).intValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzYwP() {
        zzYSE zzyse;
        boolean z;
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        String str = "0 0 21600 21600";
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            String value = zzyq9ZzYuT.getValue();
            Ref<String> ref = new Ref<>(str);
            RefInt refInt = new RefInt(i);
            RefBoolean refBoolean = new RefBoolean(z2);
            RefBoolean refBoolean2 = new RefBoolean(z3);
            if (zzYq(localName, value) || zzYr(localName, value)) {
                zzyse = this;
            } else {
                zzyse = this;
                if (!zzyse.zzZ(this.zzXQE, value, ref, refInt, refBoolean, refBoolean2)) {
                    z = false;
                }
                String str2 = ref.get();
                i = refInt.get();
                boolean z4 = refBoolean.get();
                boolean z5 = refBoolean2.get();
                if (z) {
                    switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                            zzyse.zzXQE.zzZ(256, false, "draw:enhanced-geometry");
                            break;
                        default:
                            zzyse.zzXQE.zzYi("draw:enhanced-geometry", zzyq9ZzYuT.getLocalName());
                            break;
                    }
                }
                str = str2;
                z2 = z4;
                z3 = z5;
            }
            z = true;
            String str22 = ref.get();
            i = refInt.get();
            boolean z42 = refBoolean.get();
            boolean z52 = refBoolean2.get();
            if (z) {
            }
            str = str22;
            z2 = z42;
            z3 = z52;
        }
        this.zzXQE.zzZ(str, z2, z3, this.zzXQQ);
        zzYwO();
        this.zzXQQ.zzQ(4096, Integer.valueOf(i));
    }

    private static zzZL3 zzYwQ() {
        zzZL3 zzzl3 = new zzZL3();
        zzzl3.zzYtX = new zzYM2(Integer.MIN_VALUE);
        zzzl3.zzYtW = new zzYM2(Integer.MAX_VALUE);
        zzzl3.zzYtV = new zzYM2(Integer.MIN_VALUE);
        zzzl3.zzYtU = new zzYM2(Integer.MAX_VALUE);
        return zzzl3;
    }

    private void zzYwR() {
        zzZL3 zzzl3Zzx;
        zzYQ9 zzyq9ZzYuT = this.zzXQE.zzYuT();
        ArrayList arrayList = new ArrayList();
        while (zzyq9ZzYuT.zzQ("enhanced-geometry")) {
            if ("equation".equals(zzyq9ZzYuT.getLocalName())) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXQR, zzw(this.zzXQE));
            } else if ("handle".equals(zzyq9ZzYuT.getLocalName()) && (zzzl3Zzx = zzx(this.zzXQE)) != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZL3>) arrayList, zzzl3Zzx);
            }
        }
        if (arrayList.size() > 0) {
            this.zzXQP = (zzZL3[]) arrayList.toArray(new zzZL3[0]);
        }
    }

    private void zzYwS() {
        Iterator<zzYRS> it = this.zzXQR.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
    }

    private void zzYwT() {
        zzYwP();
        zzYwR();
        zzYwS();
        zzYwK();
        zzYwM();
        zzYwL();
    }

    private static boolean zzZ(char c, boolean z, boolean z2) {
        if (c == '+' || c == '-') {
            return z || z2;
        }
        return false;
    }

    private void zzZi(ArrayList<zzYM5> arrayList) {
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_4, (zzYM5[]) arrayList.toArray(new zzYM5[0]));
    }

    private void zzZj(ArrayList<zzYM6> arrayList) {
        this.zzXQQ.zzQ(StyleIdentifier.LIST_TABLE_5_DARK, (zzYM6[]) arrayList.toArray(new zzYM6[0]));
    }

    private static boolean zzZk(Object obj) {
        if (obj instanceof Character) {
            return zzYv(((Character) obj).charValue());
        }
        String str = (String) com.aspose.words.internal.zzZKW.zzZ(obj, String.class);
        return str != null && zzFt(str);
    }

    private zzZL1 zzc(String str, boolean z) {
        if ("left".equals(str)) {
            return new zzZL1(z ? 1 : 6, z ? 0 : this.zzXQK + this.zzXQI);
        }
        if ("top".equals(str)) {
            return new zzZL1(z ? 6 : 1, z ? this.zzXQJ : 0);
        }
        if ("right".equals(str)) {
            return new zzZL1(z ? 2 : 6, z ? 0 : this.zzXQK + this.zzXQI);
        }
        if ("bottom".equals(str)) {
            return new zzZL1(z ? 6 : 2, z ? this.zzXQJ + this.zzXQH : 0);
        }
        if (str.charAt(0) == '?') {
            return new zzZL1(6, zzFx(str.substring(1)));
        }
        if (str.charAt(0) == '$') {
            int iZzZo = com.aspose.words.internal.zzJB.zzZo(str.substring(1));
            return iZzZo != Integer.MIN_VALUE ? new zzZL1(5, iZzZo) : new zzZL1(6, 0);
        }
        int iZzZo2 = com.aspose.words.internal.zzJB.zzZo(str);
        return iZzZo2 != Integer.MIN_VALUE ? new zzZL1(6, zzYOU.zzR(iZzZo2, this.zzXQE.zzYuu())) : new zzZL1();
    }

    private zzYM2 zzd(String str, boolean z) {
        int iZzZo;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return new zzYM2(0, false);
        }
        if ("left".equals(str)) {
            return new zzYM2(z ? 0 : this.zzXQK + this.zzXQI, true);
        }
        if ("top".equals(str)) {
            return new zzYM2(z ? this.zzXQJ : 0, true);
        }
        if ("right".equals(str)) {
            return new zzYM2(z ? 1 : this.zzXQK + this.zzXQI, true);
        }
        if ("bottom".equals(str)) {
            return new zzYM2(z ? this.zzXQJ + this.zzXQH : 1, true);
        }
        if (str.charAt(0) == '?') {
            for (int i = 0; i < this.zzXQR.size(); i++) {
                if (com.aspose.words.internal.zzZKN.equals(this.zzXQR.get(i).zzLJ, str.substring(1))) {
                    return new zzYM2(i + 3, true);
                }
            }
        }
        if (str.charAt(0) == '$' && (iZzZo = com.aspose.words.internal.zzJB.zzZo(str.substring(1))) != Integer.MIN_VALUE) {
            return new zzYM2(iZzZo + 256, true);
        }
        int iZzZo2 = com.aspose.words.internal.zzJB.zzZo(str);
        return iZzZo2 != Integer.MIN_VALUE ? new zzYM2(zzYOU.zzR(iZzZo2, this.zzXQE.zzYuu()), false) : new zzYM2(0, false);
    }

    private static int zzsB(int i) {
        if (i == 3 || i == 4 || i == 2) {
            return 0;
        }
        if (i == 165 || i == 163 || i == 164) {
            return 4;
        }
        return (i == 162 || i == 161) ? 3 : 1;
    }

    private static int zzsC(int i) {
        return i == 2 ? 3 : 1;
    }

    private static int zzsD(int i) {
        return i == 1 ? 3 : 2;
    }

    private zzYRS zzw(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYRS zzyrs = new zzYRS();
        while (zzyq9ZzYuT.zzi()) {
            if ("name".equals(zzyq9ZzYuT.getLocalName())) {
                zzyrs.zzLJ = zzyq9ZzYuT.getValue();
            } else if ("formula".equals(zzyq9ZzYuT.getLocalName())) {
                String value = zzyq9ZzYuT.getValue();
                zzyrs.zzXPB = value;
                zzFI(value);
            }
        }
        return zzyrs;
    }

    private zzZL3 zzx(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzZL3 zzzl3ZzYwQ = zzYwQ();
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 22:
                    zzZ(zzzl3ZzYwQ);
                    break;
                case 23:
                    zzzl3ZzYwQ.zzYu3 = TelemetryEventStrings.Value.TRUE.equals(value);
                    break;
                case 24:
                    zzzl3ZzYwQ.zzYu2 = TelemetryEventStrings.Value.TRUE.equals(value);
                    break;
                case 25:
                    zzzl3ZzYwQ.zzYu4 = TelemetryEventStrings.Value.TRUE.equals(value);
                    break;
                case 26:
                    zzzl3ZzYwQ.zzYu7 = true;
                    zzzl3ZzYwQ.zzYtX = zzd(value, true);
                    break;
                case 27:
                    zzzl3ZzYwQ.zzYu7 = true;
                    zzzl3ZzYwQ.zzYtW = zzd(value, true);
                    break;
                case 28:
                    zzzl3ZzYwQ.zzYu7 = true;
                    zzzl3ZzYwQ.zzYtV = zzd(value, false);
                    break;
                case 29:
                    zzzl3ZzYwQ.zzYu7 = true;
                    zzzl3ZzYwQ.zzYtU = zzd(value, false);
                    break;
                case 30:
                case 31:
                case 32:
                    zzyq7.zzZ(256, false, "draw:handle");
                    break;
                default:
                    this.zzXQE.zzYi("handle", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        if (zzzl3ZzYwQ.zzYu1 == null || zzzl3ZzYwQ.zzYu0 == null) {
            return null;
        }
        return zzzl3ZzYwQ;
    }

    public final void zzZ(CompositeNode compositeNode, zzYEF zzyef, String str) throws Exception {
        this.zzXQE.zzS8(true);
        this.zzXQG = "polyline".equals(str);
        this.zzXQE.zzWz(1.0d);
        this.zzZ2R = new Shape(this.zzXQE.getDocument());
        String localName = this.zzXQE.zzYuT().getLocalName();
        if (zzyef != null) {
            zzyef.zzY(this.zzZ2R.zzZYh());
        }
        zzYC3 zzyc3 = new zzYC3();
        this.zzXQQ = zzyc3;
        zzyc3.zzQ(EditingLanguage.LULE_SAMI_NORWAY, 0);
        zzFM(str);
        zzYRR.zzX(this.zzXQE, this.zzZ2R.zzYvW());
        zzFN(localName);
        this.zzXQQ.zzY(this.zzZ2R.zzYvW());
        zzYRR.zzZ(this.zzZ2R, (zzYRL) this.zzXQE.zzYuS().zzY(this.zzXQE.zzYuP(), "graphic", this.zzXQE.zzYuO(), true));
        compositeNode.appendChild(this.zzZ2R);
        this.zzXQE.zzS8(false);
    }

    private static boolean zzZj(Object obj) {
        return (obj instanceof Character) && "ABCFLMNQSTUVWXYZ".indexOf(((Character) obj).charValue()) != -1;
    }

    private void zzZ(zzYRS zzyrs) {
        zzyrs.zzXPA = zzFw(zzyrs.zzXPB);
        int i = 0;
        while (true) {
            String[] strArr = zzyrs.zzXPA;
            if (i >= strArr.length) {
                break;
            }
            String str = strArr[i];
            if (com.aspose.words.internal.zzZKN.zzS(str, MsalUtils.QUERY_STRING_SYMBOL, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                int i2 = 0;
                boolean z = false;
                while (i2 < this.zzXQR.size() && !z) {
                    zzYRS zzyrs2 = this.zzXQR.get(i2);
                    boolean zEquals = com.aspose.words.internal.zzZKN.equals(zzyrs2.zzLJ, str.substring(1));
                    if (zEquals) {
                        if (zzyrs2.zzXPz == null) {
                            zzZ(zzyrs2);
                        }
                        zzyrs.zzXPA[i] = zzyrs2.zzXPz;
                    }
                    i2++;
                    z = zEquals;
                }
            }
            i++;
        }
        com.aspose.words.internal.zzZQC<String> zzzqc = new com.aspose.words.internal.zzZQC<>();
        for (String str2 : zzyrs.zzXPA) {
            if (zzFu(str2)) {
                zzzqc.push(str2);
            } else if (zzFt(str2) || zzFr(str2) > 0) {
                zzZ(zzzqc, str2);
            }
        }
        String strZzZZ = com.aspose.words.internal.zzJB.zzZZ(zzFK(zzzqc.pop()));
        zzyrs.zzXPz = strZzZZ;
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(strZzZZ);
        zzyrs.zzXPB = Double.isNaN(dZzZs) ? "0" : com.aspose.words.internal.zzJB.zzWD(com.aspose.words.internal.zzAN.zzZG(dZzZs));
    }

    private void zzZ(com.aspose.words.internal.zzZQC<String> zzzqc, String str) {
        switch (zzUR.zzTP(str)) {
            case 4:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(-zzFK(zzzqc.pop())));
                return;
            case 5:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(zzFK(zzzqc.pop()) + zzFK(zzzqc.pop())));
                return;
            case 6:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(zzFK(zzzqc.pop()) - zzFK(zzzqc.pop())));
                return;
            case 7:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(zzFK(zzzqc.pop()) * zzFK(zzzqc.pop())));
                return;
            case 8:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(zzFK(zzzqc.pop()) / zzFK(zzzqc.pop())));
                return;
            case 9:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(Math.sin(zzFK(zzzqc.pop()))));
                return;
            case 10:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(Math.cos(zzFK(zzzqc.pop()))));
                return;
            case 11:
                String strPop = zzzqc.pop();
                String strPop2 = zzzqc.pop();
                if (zzFK(zzzqc.pop()) > 0.0d) {
                    strPop = strPop2;
                }
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(zzFK(strPop)));
                return;
            case 12:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(Math.abs(zzFK(zzzqc.pop()))));
                return;
            case 13:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(Math.sqrt(zzFK(zzzqc.pop()))));
                return;
            case 14:
                double dZzFK = zzFK(zzzqc.pop());
                double dZzFK2 = zzFK(zzzqc.pop());
                if (dZzFK2 < dZzFK) {
                    dZzFK = dZzFK2;
                }
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(dZzFK));
                return;
            case 15:
                double dZzFK3 = zzFK(zzzqc.pop());
                double dZzFK4 = zzFK(zzzqc.pop());
                if (dZzFK4 > dZzFK3) {
                    dZzFK3 = dZzFK4;
                }
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(dZzFK3));
                return;
            case 16:
                zzzqc.push(com.aspose.words.internal.zzJB.zzZZ(Math.atan2(zzFK(zzzqc.pop()), zzFK(zzzqc.pop()))));
                return;
            default:
                if (!zzFH(str)) {
                    throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unknown operation function of custom shape formula: '{0}'", str));
                }
                return;
        }
    }

    private void zzZ(zzZL3 zzzl3) {
        String value = this.zzXQE.zzYuT().getValue();
        if (zzFJ(value)) {
            this.zzXQE.zzv("draw:handle", "draw:handle-position", value);
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(value, ControlChar.SPACE_CHAR);
        if (strArrZzR.length == 2) {
            zzzl3.zzYu1 = zzc(strArrZzR[0], true);
            zzzl3.zzYu0 = zzc(strArrZzR[1], false);
        }
    }

    private boolean zzZ(zzYQ7 zzyq7, String str, Ref<String> ref, RefInt refInt, RefBoolean refBoolean, RefBoolean refBoolean2) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
        if (iZzTP != 0) {
            switch (iZzTP) {
                case 51:
                    if (!"drawooo".equals(zzyq9ZzYuT.getPrefix())) {
                        zzFy(str);
                    }
                    break;
                case 52:
                    zzFz(str);
                    break;
                case 53:
                    zzFA(str);
                    break;
                case 54:
                    this.zzXQN = com.aspose.words.internal.zzZKN.zzR(com.aspose.words.internal.zzZKN.zzTX(str), ControlChar.SPACE_CHAR);
                    break;
                case 55:
                    refInt.set(zzsC(refInt.get()));
                    break;
                case 56:
                    refInt.set(zzsD(refInt.get()));
                    break;
                case 57:
                    refBoolean.set(true);
                    break;
                case 58:
                    refBoolean2.set(true);
                    break;
                case 59:
                    zzFG(str);
                    break;
                case 60:
                    if ("perspective".equals(str)) {
                        this.zzXQQ.zzQ(765, Boolean.FALSE);
                    }
                    break;
            }
            return true;
        }
        ref.set(str);
        return true;
    }

    private static void zzZ(zzZS zzzs, int i, int i2, int i3, String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str.replace("(", "").replace(")", ""), ControlChar.SPACE_CHAR);
        if (i != -1) {
            zzZ(zzzs, i, strArrZzR[0]);
        }
        if (strArrZzR.length > 1 && i2 != -1) {
            zzZ(zzzs, i2, strArrZzR[1]);
        }
        if (strArrZzR.length <= 2 || i3 == -1) {
            return;
        }
        zzZ(zzzs, i3, strArrZzR[2]);
    }

    private static void zzZ(zzZS zzzs, int i, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzzs.zzQ(i, Integer.valueOf(zzYOU.zzDI(str)));
        }
    }

    private int zzZ(boolean z, ArrayList<zzYM6> arrayList, ArrayList<zzYM5> arrayList2, int i, int i2, Ref<zzYM6> ref, RefInt refInt) {
        if (i2 == -1) {
            return i2;
        }
        RefInt refInt2 = new RefInt(i2);
        zzZ(z, arrayList, i, refInt2, ref);
        int i3 = refInt2.get();
        zzZ(arrayList2, ref.get(), refInt);
        return i3;
    }

    private void zzZ(ArrayList<zzYM5> arrayList, zzYM6 zzym6, RefInt refInt) {
        int i = 0;
        while (i < zzym6.zzYnJ()) {
            boolean z = i == 2 && (zzym6.zzYnL() == 162 || zzym6.zzYnL() == 161);
            zzYM2 zzym2ZzM = zzM((String) this.zzXQO.get(refInt.set(refInt.get() + 1) - 1), z, true);
            zzYM2 zzym2ZzM2 = zzM((String) this.zzXQO.get(refInt.set(refInt.get() + 1) - 1), z, false);
            if (z) {
                zzYM2 zzym2 = new zzYM2(zzym2ZzM.getValue() * 65536);
                zzym2ZzM2 = new zzYM2(zzym2ZzM2.getValue() * 65536);
                zzym2ZzM = zzym2;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYM5(zzym2ZzM, zzym2ZzM2));
            i++;
        }
    }

    private static void zzZ(boolean z, ArrayList<zzYM6> arrayList, int i, RefInt refInt, Ref<zzYM6> ref) {
        if (!z && refInt.get() == i && zzWy(i, refInt.get())) {
            refInt.set(refInt.get() == 167 ? 168 : 167);
            ref.set(new zzYM6(refInt.get(), ref.get().zzYnK()));
        }
        com.aspose.words.internal.zzZQG.zzZ(arrayList, ref.get());
    }

    private int zzZ(int i, ArrayList<zzYM6> arrayList, int i2, RefInt refInt, Ref<zzYM6> ref) {
        refInt.set(zzYS3.zzY7(((Character) this.zzXQO.get(i)).charValue()));
        if (zzWy(i2, refInt.get())) {
            refInt.set(refInt.get() == 167 ? 168 : 167);
        }
        ref.set(new zzYM6(refInt.get(), zzsB(refInt.get())));
        if (ref.get().zzYnJ() == 0) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, ref.get());
        }
        return refInt.get();
    }

    private static int zzZ(String str, int i, StringBuilder sb, int i2, com.aspose.words.internal.zzZQC<Object> zzzqc) {
        int iZzFs = zzFs(str.substring(i));
        if (iZzFs != 0) {
            com.aspose.words.internal.zzZNH.zzU(sb, str.substring(i, iZzFs + i));
        }
        if (i2 == 0) {
            return i;
        }
        zzzqc.push(str.substring(i, i + i2));
        return (i2 - 1) + i;
    }

    private static boolean zzZ(char c, int i, com.aspose.words.internal.zzZQC<Object> zzzqc, StringBuilder sb, boolean z, boolean z2) {
        if (c != ' ') {
            if (c != '$') {
                if (c != ',') {
                    if (c == '?') {
                        sb.append(c);
                        return true;
                    }
                    if (c == '(') {
                        zzzqc.push(Character.valueOf(c));
                        return z2;
                    }
                    if (c != ')') {
                        if (!zzYv(c)) {
                            return z2;
                        }
                        zzZ(c, sb, zzzqc, i == 0, z);
                        return false;
                    }
                }
                zzZ(zzzqc, sb, c);
                if (zzZ(c, zzzqc)) {
                    com.aspose.words.internal.zzZNH.zzZ(sb, " {0}", zzzqc.pop());
                }
                return false;
            }
            sb.append(c);
        }
        return false;
    }

    private static void zzZ(char c, StringBuilder sb, com.aspose.words.internal.zzZQC<Object> zzzqc, boolean z, boolean z2) {
        if (zzZ(c, z, z2)) {
            com.aspose.words.internal.zzZNH.zzU(sb, "0");
        }
        sb.append(ControlChar.SPACE_CHAR);
        boolean z3 = true;
        while (zzzqc.size() != 0 && (zzzqc.peek() instanceof Character) && z3) {
            char cCharValue = ((Character) zzzqc.peek()).charValue();
            z3 = zzYv(cCharValue) && zzY8(c) <= zzY8(cCharValue);
            if (z3) {
                com.aspose.words.internal.zzZNH.zzZ(sb, "{0} ", zzzqc.pop());
            }
        }
        zzzqc.push(Character.valueOf(c));
    }

    private static void zzZ(com.aspose.words.internal.zzZQC<Object> zzzqc, StringBuilder sb, char c) {
        if (zzzqc.peek() instanceof Character) {
            boolean z = c == ',';
            char cCharValue = ((Character) (z ? zzzqc.peek() : zzzqc.pop())).charValue();
            while (cCharValue != '(') {
                if (z) {
                    zzzqc.pop();
                }
                com.aspose.words.internal.zzZNH.zzZ(sb, " {0}", Character.valueOf(cCharValue));
                if (zzzqc.size() == 0) {
                    throw new IllegalStateException("ODT formula is wrong");
                }
                cCharValue = ((Character) (z ? zzzqc.peek() : zzzqc.pop())).charValue();
            }
            if (z) {
                sb.append(ControlChar.SPACE_CHAR);
            }
        }
    }

    private static boolean zzZ(com.aspose.words.internal.zzZQC<Object> zzzqc, boolean z) {
        return zzzqc.size() > 0 && (zzzqc.peek() instanceof String) && "[-]".equals((String) zzzqc.peek()) && z;
    }

    private static boolean zzZ(char c, com.aspose.words.internal.zzZQC<Object> zzzqc) {
        return c == ')' && zzzqc.size() > 0 && zzFr(zzzqc.peek().toString()) > 0;
    }

    private static void zzZ(StringBuilder sb, com.aspose.words.internal.zzZQC<Object> zzzqc) {
        Object objPop;
        while (zzzqc.size() != 0) {
            if (!zzZk(zzzqc.peek())) {
                objPop = zzX(zzzqc);
            } else {
                objPop = zzzqc.pop();
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, " {0}", objPop);
        }
    }
}
