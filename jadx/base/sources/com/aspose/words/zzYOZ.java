package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOZ {
    private zzYP1 zzXKL;
    private boolean zzXOC;
    private zzYOR zzXRT;
    private Theme zzYTf;

    public static class zzZ extends zzYWD {
        private zzYEF zzXKK;

        public zzZ(zzYEF zzyef) {
            this.zzXKK = zzyef;
        }

        private static boolean zzrw(int i) {
            return i == 30 || i == 40;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.words.zzYWD
        public final boolean zzJ(Node node) {
            if (node instanceof zzZAM) {
                zzYEF runPr_IInline = ((zzZAM) node).getRunPr_IInline();
                for (int i = 0; i < this.zzXKK.getCount(); i++) {
                    int iZzT3 = this.zzXKK.zzT3(i);
                    if (!zzrw(iZzT3) && !runPr_IInline.zzVE(iZzT3)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // com.aspose.words.zzYWD
        public final boolean zzZZP() {
            return false;
        }
    }

    public zzYOZ(zzYOR zzyor) {
        this.zzXRT = zzyor;
        this.zzYTf = zzyor.getDocument().zzZqI();
    }

    private String zzDK(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return str;
        }
        this.zzXKL.zzZfa++;
        return "10pt";
    }

    private void zzP(zzZ9G zzz9g) {
        if (zzYOR.zzX(zzz9g, false)) {
            zzYP1 zzyp1 = this.zzXKL;
            zzyp1.zzXLt = zzDK(zzyp1.zzXLt);
            zzYP1 zzyp12 = this.zzXKL;
            zzyp12.zzXLr = zzDK(zzyp12.zzXLr);
            zzYP1 zzyp13 = this.zzXKL;
            zzyp13.zzXLs = zzyp13.zzXLr;
        }
    }

    private void zzS1(boolean z) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (!z) {
            zzytgZzYsG.zz0("fo:hyphenate", this.zzXKL.zzXKP);
        } else if (this.zzXRT.getDocument().getHyphenationOptions().getAutoHyphenation()) {
            zzytgZzYsG.zz0("fo:hyphenate", TelemetryEventStrings.Value.TRUE);
        }
    }

    private zzZS zzX(zzZ9G zzz9g, zzZS zzzs, boolean z) {
        if (!zzYOR.zzX(zzz9g, z)) {
            return zzzs;
        }
        zzZS zzzsZzbn = this.zzXRT.getDocument().getStyles().zzY37().zzbn();
        for (int count = zzzsZzbn.getCount() - 1; count >= 0; count--) {
            if (zzrx(zzzsZzbn.zzT3(count))) {
                zzzsZzbn.removeAt(count);
            }
        }
        zzzs.zzY(zzzsZzbn);
        return zzzsZzbn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzY(zzZ9G zzz9g, zzZS zzzs, boolean z) {
        int i;
        int i2;
        boolean z2 = zzz9g instanceof Paragraph;
        Paragraph paragraph = z2 ? (Paragraph) zzz9g : null;
        zzZS zzzsZzX = zzX(zzz9g, zzzs, z);
        int i3 = 1;
        if (zzZ(z2, paragraph)) {
            int i4 = 0;
            while (i4 < zzzsZzX.getCount()) {
                int iZzT3 = zzzsZzX.zzT3(i4);
                Object objZzVY = zzzsZzX.zzVY(i4);
                if (objZzVY != null) {
                    zzYP1 zzyp1 = this.zzXKL;
                    zzyp1.zzZfa += i3;
                    boolean z3 = i3;
                    switch (iZzT3) {
                        case 10:
                        case 16:
                        case 45:
                        case 132:
                        case 202:
                        case 240:
                        case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                        case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                        case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                        case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                        case 400:
                        case 402:
                        case 440:
                        case 460:
                        case 470:
                        case 480:
                        case 490:
                        case 500:
                        case 510:
                        case 520:
                        case 521:
                        case 522:
                        case 523:
                        case ALERT_VALUE:
                        case 710:
                        case 720:
                        case 730:
                        case 740:
                        case 750:
                        case 760:
                        case 770:
                        case 790:
                        case 810:
                        case 815:
                        case 820:
                        case 825:
                        case 830:
                        case 835:
                        case 840:
                        case 850:
                        case 855:
                        case 860:
                        case 865:
                        case 870:
                            i2 = 1;
                            this.zzXRT.zzZ(iZzT3, "run", true, false);
                            this.zzXKL.zzZfa -= i2;
                            break;
                        case 20:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXKY)) {
                                this.zzXKL.zzZfa -= z3 ? 1 : 0;
                            }
                            this.zzXKL.zzXKY = zzYOU.zzV((com.aspose.words.internal.zzPV) objZzVY, false);
                            if (com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXKY)) {
                            }
                            i2 = 1;
                            this.zzXKL.zzZfa -= i2;
                            break;
                        case 30:
                        case 40:
                            this.zzXRT.zzZ(iZzT3, "run", false, true);
                            i2 = 1;
                            this.zzXKL.zzZfa -= i2;
                            break;
                        case 60:
                            zzyp1.zzXLa = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "bold", "normal");
                            zzYP1 zzyp12 = this.zzXKL;
                            zzyp12.zzXL9 = zzyp12.zzXLa;
                            break;
                        case 70:
                            zzyp1.zzXL6 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "italic", "normal");
                            zzYP1 zzyp13 = this.zzXKL;
                            zzyp13.zzXL5 = zzyp13.zzXL6;
                            break;
                        case 80:
                            zzyp1.zzXL1 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "solid");
                            zzYP1 zzyp14 = this.zzXKL;
                            if (zzyp14.zzXL1 == null) {
                                zzyp14.zzXL1 = "none";
                            }
                            break;
                        case 90:
                            zzyp1.zzXKX = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, TelemetryEventStrings.Value.TRUE);
                            break;
                        case 100:
                            zzyp1.zzXKW = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "1pt 1pt");
                            break;
                        case 110:
                            zzyp1.zzXL3 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "small-caps");
                            break;
                        case 120:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXL2)) {
                                this.zzXKL.zzZfa--;
                            }
                            this.zzXKL.zzXL2 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "uppercase");
                            if (com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXL2)) {
                            }
                            i2 = 1;
                            this.zzXKL.zzZfa -= i2;
                            break;
                        case 130:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXKU)) {
                                this.zzXKL.zzZfa--;
                            }
                            this.zzXKL.zzXKU = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "none", TelemetryEventStrings.Value.TRUE);
                            if (com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXKU)) {
                            }
                            i2 = 1;
                            this.zzXKL.zzZfa -= i2;
                            break;
                        case 140:
                            zzZa(objZzVY);
                            break;
                        case 150:
                            zzyp1.zzXKR = this.zzXRT.zzr2(((Integer) objZzVY).intValue());
                            break;
                        case 160:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXLb)) {
                                this.zzXKL.zzZfa--;
                            }
                            this.zzXKL.zzXLb = zzYOU.zzZQ((com.aspose.words.internal.zzPV) objZzVY);
                            if (com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXLb)) {
                            }
                            i2 = 1;
                            this.zzXKL.zzZfa -= i2;
                            break;
                        case 170:
                            zzyp1.zzXKV = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "embossed");
                            break;
                        case 180:
                            zzyp1.zzXKV = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "engraved");
                            break;
                        case 190:
                            zzyp1.zzXLt = zzYOU.zzZ9(objZzVY);
                            zzYP1 zzyp15 = this.zzXKL;
                            zzyp15.zzXLr = zzyp15.zzXLt;
                            break;
                        case 200:
                            zzyp1.zzXKZ = zzYOU.zzv(objZzVY, Integer.valueOf(((zzYEF) zzzsZzX).getSize()));
                            break;
                        case 210:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXKZ)) {
                                this.zzXKL.zzZfa -= z3 ? 1 : 0;
                            }
                            String strZzs6 = zzYS3.zzs6(((Integer) objZzVY).intValue());
                            if (!com.aspose.words.internal.zzZYD.zzXk(strZzs6)) {
                                this.zzXKL.zzXKZ = "";
                                i2 = 1;
                                this.zzXKL.zzZfa -= i2;
                            } else {
                                this.zzXKL.zzXKZ = com.aspose.words.internal.zzZKN.format("{0} 58%", strZzs6);
                            }
                            break;
                        case 220:
                            if (((Integer) objZzVY).intValue() > 0) {
                                this.zzXKL.zzXLq = z3;
                            }
                            break;
                        case 230:
                            zzyp1.zzXLw = zzU1.zzZ(objZzVY, this.zzYTf);
                            break;
                        case 235:
                            zzyp1.zzXLu = zzU1.zzZ(objZzVY, this.zzYTf);
                            break;
                        case 250:
                            zzyp1.zzXL8 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "bold", "normal");
                            break;
                        case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                            zzyp1.zzXL4 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "italic", "normal");
                            break;
                        case 270:
                            zzyp1.zzXLv = zzU1.zzZ(objZzVY, this.zzYTf);
                            break;
                        case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                            zzyp1.zzXKS = com.aspose.words.internal.zzZKN.format("{0}%", (Integer) objZzVY);
                            break;
                        case 300:
                            zzyp1.zzXL0 = zzYOU.zzZ((zzZU) objZzVY, zzz9g, iZzT3, "double");
                            zzYP1 zzyp16 = this.zzXKL;
                            if (zzyp16.zzXL1 == null) {
                                zzyp16.zzXL1 = "none";
                            }
                            break;
                        case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                            if (((Integer) objZzVY).intValue() == 0) {
                                i2 = z3 ? 1 : 0;
                                this.zzXKL.zzZfa -= i2;
                            } else {
                                this.zzXKL.zzXKT = TelemetryEventStrings.Value.TRUE;
                            }
                            break;
                        case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXLk) && "none".equals(this.zzXKL.zzXLk)) {
                                zzYP1 zzyp17 = this.zzXKL;
                                zzyp17.zzZfa--;
                            }
                            this.zzXKL.zzXLk = zzYS3.zzs4(((Integer) objZzVY).intValue());
                            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXLk) || "none".equals(this.zzXKL.zzXLk)) {
                                zzYP1 zzyp18 = this.zzXKL;
                                zzyp18.zzZfa--;
                            }
                            break;
                        case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                            zzyp1.zzXLs = zzYOU.zzZ9(objZzVY);
                            break;
                        case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXKY)) {
                                zzYP1 zzyp19 = this.zzXKL;
                                zzyp19.zzZfa--;
                            }
                            this.zzXKL.zzXKY = zzYOU.zzP((Shading) objZzVY);
                            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXKY)) {
                                i2 = z3 ? 1 : 0;
                                this.zzXKL.zzZfa -= i2;
                            }
                            break;
                        case 380:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXLm) && "none".equals(this.zzXKL.zzXLm)) {
                                zzYP1 zzyp110 = this.zzXKL;
                                zzyp110.zzZfa--;
                            }
                            this.zzXKL.zzXLm = zzYS3.zzs4(((Integer) objZzVY).intValue());
                            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXLm) || "none".equals(this.zzXKL.zzXLm)) {
                                zzYP1 zzyp111 = this.zzXKL;
                                zzyp111.zzZfa--;
                            }
                            break;
                        case 390:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXLl) && "none".equals(this.zzXKL.zzXLl)) {
                                zzYP1 zzyp112 = this.zzXKL;
                                zzyp112.zzZfa--;
                            }
                            this.zzXKL.zzXLl = zzYS3.zzs4(((Integer) objZzVY).intValue());
                            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXLl) || "none".equals(this.zzXKL.zzXLl)) {
                                zzYP1 zzyp113 = this.zzXKL;
                                zzyp113.zzZfa--;
                            }
                            break;
                        case 450:
                            if (com.aspose.words.internal.zzZYD.zzXk(zzyp1.zzXLc)) {
                                zzYP1 zzyp114 = this.zzXKL;
                                zzyp114.zzZfa--;
                            }
                            this.zzXKL.zzXLc = zzYOU.zzV((com.aspose.words.internal.zzPV) objZzVY, false);
                            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXLc)) {
                                i2 = z3 ? 1 : 0;
                                this.zzXKL.zzZfa -= i2;
                            }
                            break;
                        case 780:
                            zzZRH zzzrh = (zzZRH) objZzVY;
                            if (zzzrh.zzZh2()) {
                                this.zzXKL.zzXKM = "line-height";
                            }
                            if (zzzrh.zzZh5()) {
                                this.zzXKL.zzXL7 = "90";
                            }
                            break;
                        case 10010:
                            zzyp1.zzXMl = (zzZMK) objZzVY;
                            break;
                        default:
                            i2 = z3 ? 1 : 0;
                            this.zzXKL.zzZfa -= i2;
                            break;
                    }
                }
                i4++;
                i3 = 1;
            }
            zzYt1();
        }
        zzP(zzz9g);
        zzZ(zzz9g, z2);
        zzYD(paragraph);
        if (("none".equals(this.zzXKL.zzXLg) || this.zzXKL.zzXLg == null) && com.aspose.words.internal.zzZYD.zzXk(this.zzXKL.zzXLc)) {
            i = 1;
            this.zzXKL.zzZfa--;
        } else {
            i = 1;
        }
        if (z) {
            zzYP1 zzyp115 = this.zzXKL;
            zzyp115.zzXKQ = TelemetryEventStrings.Value.TRUE;
            zzyp115.zzZfa += i;
        }
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(zzz9g, Run.class);
        if (run == null || !run.zzYUT() || com.aspose.words.internal.zzZKN.zzU3(this.zzXKL.zzXLw) || !com.aspose.words.internal.zzZKN.zzU3(this.zzXKL.zzXLu)) {
            return;
        }
        zzYP1 zzyp116 = this.zzXKL;
        zzyp116.zzXLu = zzyp116.zzXLw;
        zzyp116.zzZfa++;
    }

    private void zzYD(Paragraph paragraph) {
        Object obj;
        if (paragraph == null || (obj = paragraph.zzZYj().get(1410)) == null || !((Boolean) obj).booleanValue()) {
            return;
        }
        zzYP1 zzyp1 = this.zzXKL;
        zzyp1.zzXKP = TelemetryEventStrings.Value.FALSE;
        zzyp1.zzXKO = "2";
        zzyp1.zzXKN = "2";
        zzyp1.zzZfa++;
    }

    private void zzYt1() {
        zzYP1 zzyp1 = this.zzXKL;
        zzyp1.zzXLp = zzYS3.zzES(zzyp1.zzXLm);
        zzYP1 zzyp12 = this.zzXKL;
        zzyp12.zzXLj = zzYS3.zzER(zzyp12.zzXLm);
        zzYP1 zzyp13 = this.zzXKL;
        zzyp13.zzXLo = zzYS3.zzES(zzyp13.zzXLl);
        zzYP1 zzyp14 = this.zzXKL;
        zzyp14.zzXLi = zzYS3.zzER(zzyp14.zzXLl);
        zzYP1 zzyp15 = this.zzXKL;
        zzyp15.zzXLn = zzYS3.zzES(zzyp15.zzXLk);
        zzYP1 zzyp16 = this.zzXKL;
        zzyp16.zzXLh = zzYS3.zzER(zzyp16.zzXLk);
    }

    private boolean zzYt2() {
        return "none".equals(this.zzXKL.zzXLg) || this.zzXKL.zzXLg == null;
    }

    private boolean zzYt3() {
        zzYP1 zzyp1 = this.zzXKL;
        return com.aspose.words.internal.zzZKN.equals(zzyp1.zzXLb, zzyp1.zzXLc) || this.zzXKL.zzXLc == null;
    }

    private void zzYt4() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zz0("style:text-underline-style", this.zzXKL.zzXLg);
        if (zzYt2()) {
            return;
        }
        zzytgZzYsG.zz0("style:text-underline-type", this.zzXKL.zzXLf);
        zzytgZzYsG.zz0("style:text-underline-width", this.zzXKL.zzXLd);
        zzytgZzYsG.zz0("style:text-underline-mode", this.zzXKL.zzXLe);
        zzytgZzYsG.zz0("style:text-underline-color", zzYt3() ? "font-color" : this.zzXKL.zzXLc);
    }

    private void zzZa(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        this.zzXKL.zzXLg = zzYS3.zzs8(iIntValue);
        zzYP1 zzyp1 = this.zzXKL;
        if (zzyp1.zzXLg == null) {
            zzyp1.zzZfa--;
            return;
        }
        zzyp1.zzXLd = zzYS3.zzs9(iIntValue);
        if (iIntValue == 3 || iIntValue == 43) {
            this.zzXKL.zzXLf = "double";
        }
        if (iIntValue == 2) {
            this.zzXKL.zzXLe = "skip-white-space";
        }
    }

    private static boolean zzrx(int i) {
        return i == 230 || i == 235 || i == 240 || i == 270 || i == 340 || i == 380 || i == 390;
    }

    public final boolean zzE(zzYEF zzyef) {
        return zzZ((zzZ9G) null, (zzZS) zzyef, false);
    }

    public final void zzS2(boolean z) {
        this.zzXOC = true;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzY("style:text-properties");
        zzytgZzYsG.zz0("fo:letter-spacing", this.zzXKL.zzXKR);
        zzytgZzYsG.zz0("style:text-scale", this.zzXKL.zzXKS);
        zzytgZzYsG.zz0("style:text-blinking", this.zzXKL.zzXKT);
        zzytgZzYsG.zz0("text:display", this.zzXKL.zzXKU);
        zzytgZzYsG.zz0("fo:text-shadow", this.zzXKL.zzXKW);
        zzytgZzYsG.zz0("style:font-relief", this.zzXKL.zzXKV);
        zzytgZzYsG.zz0("style:text-outline", this.zzXKL.zzXKX);
        zzytgZzYsG.zz0("style:use-window-font-color", this.zzXKL.zzXKQ);
        zzytgZzYsG.zz0("fo:background-color", this.zzXKL.zzXKY);
        zzytgZzYsG.zz0("style:text-position", this.zzXKL.zzXKZ);
        zzytgZzYsG.zz0("style:text-line-through-type", this.zzXKL.zzXL0);
        zzytgZzYsG.zz0("style:text-line-through-style", this.zzXKL.zzXL1);
        zzytgZzYsG.zz0("fo:text-transform", this.zzXKL.zzXL2);
        zzytgZzYsG.zz0("fo:font-variant", this.zzXKL.zzXL3);
        zzytgZzYsG.zz0("fo:font-style", this.zzXKL.zzXL6);
        zzytgZzYsG.zz0("style:font-style-asian", this.zzXKL.zzXL5);
        zzytgZzYsG.zz0("style:font-style-complex", this.zzXKL.zzXL4);
        zzytgZzYsG.zz0("fo:color", this.zzXKL.zzXLb);
        zzytgZzYsG.zz0("style:font-name", this.zzXKL.zzXLw);
        zzytgZzYsG.zz0("fo:font-size", this.zzXKL.zzXLt);
        zzytgZzYsG.zz0("style:font-name-asian", this.zzXKL.zzXLu);
        zzytgZzYsG.zz0("style:font-size-asian", this.zzXKL.zzXLr);
        zzytgZzYsG.zz0("style:font-name-complex", this.zzXKL.zzXLv);
        zzytgZzYsG.zz0("style:font-size-complex", this.zzXKL.zzXLs);
        zzytgZzYsG.zz0("fo:language", this.zzXKL.zzXLp);
        zzytgZzYsG.zz0("fo:language-asian", this.zzXKL.zzXLo);
        zzytgZzYsG.zz0("fo:language-complex", this.zzXKL.zzXLn);
        zzytgZzYsG.zz0("fo:country", this.zzXKL.zzXLj);
        zzytgZzYsG.zz0("fo:country-asian", this.zzXKL.zzXLi);
        zzytgZzYsG.zz0("fo:country-complex", this.zzXKL.zzXLh);
        zzytgZzYsG.zz0("fo:font-weight", this.zzXKL.zzXLa);
        zzytgZzYsG.zz0("style:font-weight-asian", this.zzXKL.zzXL9);
        zzytgZzYsG.zz0("style:font-weight-complex", this.zzXKL.zzXL8);
        zzytgZzYsG.zz0("style:text-rotation-angle", this.zzXKL.zzXL7);
        zzytgZzYsG.zz0("style:text-rotation-scale", this.zzXKL.zzXKM);
        zzYt4();
        zzS1(z);
        zzytgZzYsG.zz0("fo:hyphenation-remain-char-count", this.zzXKL.zzXKO);
        zzytgZzYsG.zz0("fo:hyphenation-push-char-count", this.zzXKL.zzXKN);
        zzytgZzYsG.zzw("style:letter-kerning", this.zzXKL.zzXLq);
        zzytgZzYsG.zzo();
        this.zzXOC = false;
    }

    public final void zzZ(zzZ9G zzz9g, zzYEF zzyef, boolean z) {
        zzZ(zzz9g, (zzZS) zzyef, z);
        if (this.zzXKL.zzZfa > 0) {
            zzS2(z);
        }
    }

    private boolean zzZ(zzZ9G zzz9g, zzZS zzzs, boolean z) {
        this.zzXKL = new zzYP1();
        zzY(zzz9g, zzzs, z);
        zzZMK zzzmk = this.zzXKL.zzXMl;
        if (zzzmk != null) {
            zzY(zzz9g, zzzmk.zzZ6C(), z);
            this.zzXKL.zzZfa--;
        }
        return this.zzXKL.zzZfa > 0;
    }

    private boolean zzZ(boolean z, Paragraph paragraph) {
        if (!z || !paragraph.hasChildNodes() || zzYOU.zzYC(paragraph)) {
            return true;
        }
        if (paragraph.zzZYj().getListId() == 0 || paragraph.zzYp5().getCount() <= 0) {
            return false;
        }
        if (!new NodeCollection((CompositeNode) paragraph, (zzYWD) new zzZ(paragraph.zzYp5()), true).iterator().hasNext()) {
            return true;
        }
        this.zzXRT.zzY(65536, "Cannot preserve list number/symbol formatting on saving to ODT file format.", true);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzZ(zzZ9G zzz9g, boolean z) {
        Paragraph paragraph;
        if (z || !(zzz9g instanceof Node) || (paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(((Node) zzz9g).getParentNode(), Paragraph.class)) == null) {
            return;
        }
        Object obj = (paragraph.isInCell() || paragraph.zzYpa()) ? paragraph.zzZex().zz6G().get(3050) : null;
        if (obj == null) {
            return;
        }
        this.zzXKL.zzXL7 = zzYS3.zzs7(((Integer) obj).intValue());
        zzYP1 zzyp1 = this.zzXKL;
        if (zzyp1.zzXL7 != null) {
            zzyp1.zzZfa++;
        }
    }
}
