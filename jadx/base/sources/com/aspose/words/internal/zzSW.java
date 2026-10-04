package com.aspose.words.internal;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.huawei.hms.network.embedded.C18416x7;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzSW extends zz7X {
    private zzFV zzPA;
    private String zzPB;
    private int zzPC;
    private Object zzPv;
    private boolean zzPw;
    private boolean zzPx;
    private String zzPy;
    private zzFV zzPz;
    private String zzUW;
    private static String[] zzPu = {"build", "sourceStyles", "inline"};
    private static String[] zzPt = {"horz", "both"};
    private static final zzZHW zzUR = new zzZHW("arabic", "alphabetic", "roman", "ordinal", "ordinalText", "cardinal", "hex", "arabicDash", "dollarText", "caps", "firstCap", "lower", "upper", "foreach", "if", "elseif", "else", "backColor", "textColor", "bookmark", "image", OptionalModuleUtils.BARCODE, "doc", "link", "x", "x2", "x3", "y", "size", "pointColor", "seriesColor", "removeif", "next", "var", "cellMerge", "restartNum", "check", "item", "html", "fitHeight", "fitWidth", "fitSize", "fitSizeLim", "keepRatio", "barHeight", "scale", "ape", "ap", "aztec", "codabar", "codablockF", "codablockFGS1", "code11", "code128", "code16K", "code32", "code39E", "code39S", "code93E", "code93S", "databarE", "databarES", "databarL", "databarOD", "databarS", "databarSOD", "databarT", "databarGS1UPCA", "dltf", "dm", "dpi", "dpl", "dotCode", "dkix", "ean13", "ean14", "ean8", "code128GS1", "code128GS1UPCA", "dmGS1", "qrGS1", "iatatf", "itf", "isbn", "ismn", "issn", "ip25", "itf14", "itf6", "macroPdf417", "mtf", "maxiCode", "microPdf417", "msi", "oneCode", "opc", "patchCode", "pdf417", "pharmacode", "planet", "postnet", "pzn", "qr", "rm4scc", "scc14", "sp", "sscc18", "stf", "spp", "upca", "upce", "vin", "horz", "both", C18416x7.f56644n, "/");

    public static class zzY {
        private int zzPl;
        private int zzPm;
        private String zzPn;
        private zzSW zzPs;

        public zzY(zzSW zzsw) {
            this.zzPs = zzsw;
        }

        private void zzSl() {
            if (this.zzPn != null || this.zzPm != 0) {
                throw this.zzPs.zzSt();
            }
        }

        public final String getFormat() {
            return this.zzPn;
        }

        public final int getNumberStyle() {
            return this.zzPm;
        }

        public final void setFormat(String str) {
            zzSl();
            this.zzPn = str;
        }

        public final void setNumberStyle(int i) {
            zzSl();
            this.zzPm = i;
        }

        public final int zzSk() {
            return this.zzPl;
        }

        public final void zzYI(int i) {
            if (this.zzPl != 0) {
                throw this.zzPs.zzSt();
            }
            this.zzPl = i;
        }
    }

    public static class zzZ {
        private boolean zzPo;
        private int zzPr;
        private zzSW zzPs;
        private float zzPq = Float.NaN;
        private float zzPp = Float.NaN;

        public zzZ(zzSW zzsw) {
            this.zzPs = zzsw;
        }

        public final float getScale() {
            return this.zzPp;
        }

        public final void setScale(float f) {
            if (!Float.isNaN(this.zzPp)) {
                throw zzSW.zzt("scale");
            }
            this.zzPp = f;
        }

        public final void zzK(int i) {
            if (this.zzPr != 0) {
                throw this.zzPs.zzSt();
            }
            this.zzPr = i;
        }

        public final void zzSm() {
            if (this.zzPo) {
                throw this.zzPs.zzSt();
            }
            this.zzPo = true;
        }

        public final boolean zzSn() {
            return this.zzPo;
        }

        public final float zzSo() {
            return this.zzPq;
        }

        public final int zzSp() {
            return this.zzPr;
        }

        public final void zzV(float f) {
            if (!Float.isNaN(this.zzPq)) {
                throw zzSW.zzt("barHeight");
            }
            this.zzPq = f;
        }
    }

    private static int zzA(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
                return 1;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 8;
            case 5:
                return 7;
            case 6:
                return 9;
            case 7:
                return 61;
            case 8:
                return -1;
            default:
                return 0;
        }
    }

    private Object zzR(int i, boolean z) throws Exception {
        Object objZzEX = this.zzPA.zzEX();
        Object objZzEX2 = this.zzPz.zzEX();
        if (getMode() == 1) {
            return z ? new zz6R(objZzEX, objZzEX2) : objZzEX;
        }
        zzF(objZzEX, objZzEX2);
        Object objZzZ = zzxS().zzZ(i, objZzEX);
        return z ? new zz6R(objZzZ, zzxS().zzZ(i, objZzEX)) : objZzZ;
    }

    private boolean zzSA() {
        if (zzxT().zzFI() != '>') {
            return false;
        }
        if (!zzSw() || zzxT().zzFI() != '>') {
            zzX(0, ">");
            return true;
        }
        zzFV zzfvZzEF = zzxT().zzEF();
        if (zzfvZzEF != null) {
            this.zzPw = false;
        }
        zzSw();
        zzX(zzfvZzEF != null ? 7 : 0, ">>");
        this.zzPz = zzfvZzEF;
        return true;
    }

    private boolean zzSB() {
        if (zzxT().zzFI() != '<') {
            return false;
        }
        zzFV zzfvZzEG = zzxT().zzEG();
        if (zzSw() && zzxT().zzFI() == '<') {
            if (zzfvZzEG != null) {
                this.zzPw = true;
                this.zzPy = null;
            }
            zzSw();
            zzX(zzfvZzEG != null ? 6 : 0, "<<");
            this.zzPA = zzfvZzEG;
        } else {
            zzX(0, "<");
        }
        return true;
    }

    private boolean zzSC() {
        if (!this.zzPw) {
            do {
                if (!this.zzPx && zzSB() && this.zzPC != 0) {
                    return true;
                }
            } while (zzSw());
        }
        while (!this.zzPx && zzZKU.zzG(zzxT().zzFI())) {
            zzSw();
        }
        if (this.zzPx) {
            return false;
        }
        if (zzSA() || zzZ('[', 1) || zzZ(':', 2) || zzZ('-', 3) || zzZ('=', 4) || zzSz() || zzSy() || zzSx() || zzVP()) {
            return true;
        }
        char cZzFI = zzxT().zzFI();
        zzSw();
        zzX(0, Character.toString(cZzFI));
        return true;
    }

    private void zzSD() {
        if (!zzSC()) {
            throw zzSs();
        }
    }

    private void zzSE() throws Exception {
        zzYL(7);
        zzxQ().zzV(zzR(1, false), this.zzPy);
    }

    private void zzSF() throws Exception {
        zzYL(7);
        zzxQ().zzW(zzR(1, false), this.zzPy);
    }

    private void zzSG() throws Exception {
        zzYL(7);
        zzxQ().zzX(zzR(1, false), this.zzPy);
    }

    private boolean zzSH() {
        zzSD();
        return zzw("greedy");
    }

    private void zzSI() throws Exception {
        boolean zZzSH = zzSH();
        Object objZzSu = zzSu();
        zzxQ().zzZ(objZzSu, zZzSH, false, this.zzPy);
        zzxQ().zzX(objZzSu, zZzSH, this.zzPy);
    }

    private void zzSJ() throws Exception {
        boolean zZzSH = zzSH();
        zzIC();
        zzxQ().zzZ(zzSu(), zZzSH, this.zzPy);
    }

    private void zzSK() throws Exception {
        this.zzPB = "/";
        zzYL(9);
        String str = this.zzUW;
        this.zzPB = str;
        switch (zzUR.zzTP(str)) {
            case 13:
                zzSJ();
                return;
            case 14:
                zzSI();
                return;
            case 15:
            case 16:
            default:
                throw zzSt();
            case 17:
                zzSG();
                return;
            case 18:
                zzSF();
                return;
            case 19:
                zzSE();
                return;
        }
    }

    private void zzSL() {
        if (!zzxT().zzEq()) {
            throw new zzCW(zzZKN.format("Tag '{0}' must be located within a title of a combobox or dropdown list content control.", this.zzPB));
        }
    }

    private void zzSM() throws Exception {
        zzH0 zzh0Zzy0;
        zzSL();
        zzH0 zzh0ZzST = zzST();
        if (this.zzPC == 1) {
            zzh0Zzy0 = zzy0();
            zzSD();
        } else {
            zzh0Zzy0 = null;
        }
        zzYJ(7);
        zzxQ().zzY(zzYK(1), zzh0ZzST, zzh0Zzy0);
    }

    private void zzSN() {
        if (!zzxT().zzEr()) {
            throw new zzCW(zzZKN.format("Tag '{0}' must be located within a title of a checkbox content control.", this.zzPB));
        }
    }

    private void zzSO() throws Exception {
        zzSN();
        zzH0 zzh0ZzSU = zzSU();
        zzxQ().zzZ(zzYK(4), zzh0ZzSU);
    }

    private void zzSP() throws Exception {
        zzYL(7);
        zzxQ().zzY(zzYK(1));
    }

    private void zzSQ() throws Exception {
        zzH0 zzh0Zzy0;
        int i;
        zzSD();
        if (this.zzPC == 1) {
            zzh0Zzy0 = zzy0();
            zzSD();
        } else {
            zzh0Zzy0 = null;
        }
        String strZzX = zzX(zzPt);
        int iZzTP = zzUR.zzTP(strZzX);
        if (iZzTP == 112) {
            i = 0;
        } else if (iZzTP == 113) {
            i = 2;
        } else {
            if (strZzX != null) {
                throw new IllegalStateException();
            }
            i = 1;
        }
        zzxQ().zzZ(zzYK(1), i, zzh0Zzy0);
    }

    private void zzSR() throws Exception {
        zzYL(1);
        zzZVN zzzvnZzxY = zzxY();
        zzYL(7);
        zzxQ().zzZ(zzYK(1), zzzvnZzxY);
    }

    private void zzSS() throws Exception {
        zzYL(7);
        zzxQ().zzZ(zzYK(1));
    }

    private zzH0 zzST() throws Exception {
        zzYL(1);
        zzH0 zzh0Zzy0 = zzy0();
        zzSD();
        return zzh0Zzy0;
    }

    private zzH0 zzSU() throws Exception {
        zzH0 zzh0ZzST = zzST();
        zzYJ(7);
        return zzh0ZzST;
    }

    private void zzSV() {
        if (zzSq()) {
            throw new zzCW(zzZKN.format("Tag '{0}' with switch '{1}' applied cannot be used within a chart.", this.zzPB, "horz"));
        }
    }

    private void zzSW() {
        if (zzSq()) {
            throw new zzCW(zzZKN.format("Tag '{0}' cannot be used within a chart.", this.zzPB));
        }
    }

    private void zzSX() throws Exception {
        zzo(false);
        zzxQ().zzQ(zzxT().zzEt(), zzSU());
        zzR(0, false);
    }

    private void zzSY() throws Exception {
        zzo(false);
        zzxQ().zzS(zzxT().zzEt(), zzSU());
        zzR(0, false);
    }

    private void zzSZ() throws Exception {
        zzo(false);
        zzxQ().zzT(zzxT().zzEt(), zzSU());
        zzR(0, false);
    }

    private boolean zzSq() {
        return zzxT().zzEB() || zzxT().zzEA() || zzxT().zzEC();
    }

    private String zzSr() {
        int iZzTP = zzUR.zzTP(this.zzPB);
        return iZzTP != 114 ? iZzTP != 115 ? zzZKN.format("Tag '{0}'", this.zzPB) : "Closing tag" : "Expression tag";
    }

    private static zzCW zzSs() {
        return new zzCW("Unexpected end of template.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzCW zzSt() {
        return zzV(this.zzPC, this.zzUW);
    }

    private Object zzSu() throws Exception {
        return zzR(1, getMode() == 1);
    }

    private boolean zzSv() {
        if (this.zzPx) {
            return false;
        }
        if (!zzxT().moveNext()) {
            this.zzPx = true;
            return false;
        }
        if (this.zzPw && zzxT().zzFI() == 65535) {
            throw new zzCW("Non-text data inside a tag is forbidden.");
        }
        return true;
    }

    private boolean zzSw() {
        boolean zZzSv = zzSv();
        zzn(!zZzSv);
        return zZzSv;
    }

    private boolean zzSx() {
        if (zzxT().zzFI() != '\"') {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        while (zzSw()) {
            char cZzFI = zzxT().zzFI();
            if (cZzFI == '\"') {
                zzSw();
                zzX(8, sb.toString());
                return true;
            }
            if (cZzFI != '\\') {
                sb.append(zzxT().zzFI());
            } else if (zzSw()) {
                if (zzxT().zzFI() != '\"') {
                    sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
                sb.append(zzxT().zzFI());
            }
        }
        throw zzSs();
    }

    private boolean zzSy() {
        if (zzxT().zzFI() != '#') {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        while (zzSw()) {
            if (zzSA() || zzSz()) {
                if (this.zzPC == 7) {
                    this.zzPy = zzZKN.zzTX(sb.toString());
                    return true;
                }
                zzZNH.zzU(sb, this.zzUW);
            }
            sb.append(zzxT().zzFI());
        }
        throw zzSs();
    }

    private boolean zzSz() {
        if (zzxT().zzFI() != '/') {
            return false;
        }
        if (!zzSw() || zzxT().zzFI() != '/') {
            zzX(5, "/");
            return true;
        }
        while (zzSw()) {
            if (zzSA() && this.zzPC == 7) {
                return true;
            }
        }
        throw zzSs();
    }

    private void zzT(zzH0 zzh0) throws Exception {
        zz6R zz6r = (zz6R) zzR(1, true);
        boolean z = getMode() == 1;
        zzxQ().zzZ((Object) (z ? zz6r : zz6r.getFirst()), false, true, this.zzPy);
        zzG3 zzg3ZzxQ = zzxQ();
        zz6R zz6rZzwW = zz6r;
        if (!z) {
            zz6rZzwW = zz6r.zzwW();
        }
        zzg3ZzxQ.zzZ(zz6rZzwW, zzh0, this.zzPy);
    }

    private void zzT0() throws Exception {
        zzo(false);
        zzxQ().zzR(zzxT().zzEt(), zzSU());
        zzR(0, false);
    }

    private void zzT1() throws Exception {
        zzo(false);
        zzH0 zzh0ZzSU = zzSU();
        int iZzEt = zzxT().zzEt();
        zzxQ().zzU(iZzEt, zzh0ZzSU);
        zzxQ().zzZ(iZzEt, zzxT().zzEy(), zzxT().zzEz(), zzxT().zzEx());
        zzR(0, false);
    }

    private void zzT2() throws Exception {
        zzH0 zzh0Zzy0;
        zzSW();
        zzH0 zzh0ZzST = zzST();
        if (this.zzPC == 1) {
            zzh0Zzy0 = zzy0();
            zzSD();
        } else {
            zzh0Zzy0 = null;
        }
        zzYJ(7);
        zzxQ().zzZ(zzYK(1), zzh0ZzST, zzh0Zzy0);
    }

    private void zzT3() throws Exception {
        if (zzxT().zzED()) {
            throw new zzCW(zzZKN.format("Tag '{0}' is not supported within an image container.", this.zzPB));
        }
        zzSW();
        zzH0 zzh0ZzST = zzST();
        ArrayList<String> arrayListZzW = zzW(zzPu);
        boolean zContains = arrayListZzW.contains("build");
        boolean zContains2 = arrayListZzW.contains("sourceStyles");
        boolean zContains3 = arrayListZzW.contains("inline");
        zzxQ().zzZ(zzYK(1), zzh0ZzST, zContains, zContains2, zContains3);
    }

    private float zzT4() {
        String str = this.zzUW;
        zzYL(4);
        zzYL(8);
        double dZzZs = zzJB.zzZs(this.zzUW);
        if (Double.isNaN(dZzZs) || dZzZs <= 0.0d) {
            throw new zzCW(zzZKN.format("String '{0}' does not represent a valid positive real number and can not be used for attribute '{1}'.", this.zzUW, str));
        }
        return (float) dZzZs;
    }

    private void zzT5() throws Exception {
        if (zzxR() == null) {
            throw zzSt();
        }
        zzT6();
        zzH0 zzh0ZzST = zzST();
        zzZ zzz = new zzZ(this);
        while (this.zzPC != 7) {
            zzZ(zzz);
            zzSD();
        }
        if (zzz.zzSp() == 0) {
            throw new zzCW("Barcode type is not specified.");
        }
        zzZWP zzzwpZzEZ = this.zzPA.zzEZ();
        zzEN zzenZzEY = this.zzPA.zzEY();
        zzYY zzyy = new zzYY(zzz.zzSp(), zzenZzEY.getHeight(), zzenZzEY.getWidth(), zzz.zzSo(), zzz.getScale(), zzzwpZzEZ.zzon(), zzenZzEY.getFillColor(), zzzwpZzEZ.getFontName(), zzzwpZzEZ.getFontSize(), zzzwpZzEZ.zzza(), zzzwpZzEZ.zzon(), zzzwpZzEZ.getAlignment(), zzz.zzSn());
        zzxQ().zzZ(zzYK(2), zzh0ZzST, zzyy);
    }

    private void zzT6() {
        if (!zzxT().zzED()) {
            throw new zzCW(zzZKN.format("Tag '{0}' must be located within an image container.", this.zzPB));
        }
    }

    private void zzT7() throws Exception {
        int iZzy;
        zzT6();
        zzH0 zzh0ZzST = zzST();
        if (this.zzPC == 3) {
            zzYL(9);
            iZzy = zzy(this.zzUW);
            if (iZzy == 0) {
                throw zzSt();
            }
            zzSD();
        } else {
            iZzy = 0;
        }
        zzYJ(7);
        zzxQ().zzZ(zzYK(2), zzh0ZzST, iZzy);
    }

    private void zzT8() throws Exception {
        zzSW();
        zzH0 zzh0ZzSU = zzSU();
        zzxQ().zzW(zzR(1, false), zzh0ZzSU, this.zzPy);
    }

    private void zzT9() throws Exception {
        zzSW();
        zzH0 zzh0ZzSU = zzSU();
        zzxQ().zzX(zzR(1, false), zzh0ZzSU, this.zzPy);
    }

    private void zzTa() throws Exception {
        zzSW();
        zzH0 zzh0ZzSU = zzSU();
        zzxQ().zzY(zzR(1, false), zzh0ZzSU, this.zzPy);
    }

    private void zzTb() throws Exception {
        zzYL(7);
        zzT(null);
    }

    private void zzTc() throws Exception {
        zzT(zzSU());
    }

    private void zzTd() throws Exception {
        zzH0 zzh0ZzST = zzST();
        boolean zZzw = zzw("horz");
        if (zZzw) {
            zzSV();
            if (getMode() == 0) {
                zzxV();
            }
        }
        Object objZzSu = zzSu();
        zzxQ().zzY(objZzSu, zZzw, this.zzPy);
        zzxQ().zzZ(objZzSu, zzh0ZzST, this.zzPy);
    }

    private void zzTe() throws Exception {
        zzYL(1);
        boolean z = getMode() == 0;
        Object objZzxX = (z && zzxT().zzEE()) ? zzxX() : null;
        zzJC zzjcZzxZ = zzxZ();
        zzSD();
        boolean zZzw = zzw("horz");
        if (zZzw) {
            zzSV();
        }
        if (zZzw && z) {
            zzq(objZzxX);
            zzxV();
        }
        if (!zzxT().zzEB()) {
            zzxQ().zzZ(zzSu(), zzjcZzxZ, zZzw, this.zzPy);
            return;
        }
        zzxQ().zzZ(zzYK(3), zzjcZzxZ, zzxT().zzEv(), zzxT().zzEu(), zzxT().zzEw());
        if (zzxT().zzEw()) {
            for (int i = 0; i < zzxT().zzEu(); i++) {
                zzxQ().zzZ(i, false, false, false);
            }
        }
        this.zzPv = zzxT().zzEs();
    }

    private void zzTf() throws Exception {
        String str = this.zzUW;
        this.zzPB = str;
        switch (zzUR.zzTP(str)) {
            case 13:
                zzTe();
                return;
            case 14:
                zzTd();
                return;
            case 15:
                zzTc();
                return;
            case 16:
                zzTb();
                return;
            case 17:
                zzTa();
                return;
            case 18:
                zzT9();
                return;
            case 19:
                zzT8();
                return;
            case 20:
                zzT7();
                return;
            case 21:
                zzT5();
                return;
            case 22:
                zzT3();
                return;
            case 23:
                zzT2();
                return;
            case 24:
                zzYM(0);
                return;
            case 25:
                zzYM(1);
                return;
            case 26:
                zzYM(2);
                return;
            case 27:
                zzT1();
                return;
            case 28:
                zzT0();
                return;
            case 29:
                zzSY();
                return;
            case 30:
                zzSZ();
                return;
            case 31:
                zzSX();
                return;
            case 32:
                zzSS();
                return;
            case 33:
                zzSR();
                return;
            case 34:
                zzSQ();
                return;
            case 35:
                zzSP();
                return;
            case 36:
                zzSO();
                return;
            case 37:
                zzSM();
                return;
            case 38:
                zzTg();
                return;
            default:
                throw zzSt();
        }
    }

    private void zzTg() throws Exception {
        zzSW();
        zzYL(1);
        zzH0 zzh0Zzy0 = zzy0();
        zzSD();
        boolean zZzw = zzw("sourceStyles");
        zzxQ().zzZ(zzYK(1), zzh0Zzy0, zZzw);
    }

    private void zzTh() throws Exception {
        this.zzPB = C18416x7.f56644n;
        zzH0 zzh0Zzy0 = zzy0();
        zzY zzy = new zzY(this);
        zzSD();
        if (this.zzPC == 2) {
            zzZ(zzy);
            if (this.zzPC == 2) {
                zzZ(zzy);
            }
        }
        boolean zZzw = zzw("html");
        if (zZzw && zzSq()) {
            throw new zzCW(zzZKN.format("Switch '{0}' cannot be used within a chart.", this.zzUW));
        }
        zzxQ().zzZ(zzYK(1), zzh0Zzy0, zzy.getFormat(), zzy.getNumberStyle(), zzy.zzSk(), zZzw);
    }

    private void zzTi() throws Exception {
        zzSD();
        int i = this.zzPC;
        if (i == 1) {
            zzTh();
        } else if (i == 5) {
            zzSK();
        } else {
            if (i != 9) {
                throw zzSt();
            }
            zzTf();
        }
        this.zzPB = null;
        this.zzPA = null;
        this.zzPz = null;
    }

    private static String zzU(Class cls) {
        if (cls == zzYZ.class) {
            return "foreach";
        }
        if (cls == zzSH.class) {
            return "if";
        }
        throw new IllegalStateException();
    }

    private static zzCW zzV(int i, String str) {
        return new zzCW(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzW(str, i), " is unexpected."));
    }

    private boolean zzVP() {
        if (!zzZYD.isLetter(zzxT().zzFI())) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        do {
            sb.append(zzxT().zzFI());
            if (!zzSw()) {
                break;
            }
        } while (zzZYD.isLetterOrDigit(zzxT().zzFI()));
        if (this.zzPx) {
            throw zzSs();
        }
        zzX(9, sb.toString());
        return true;
    }

    private ArrayList<String> zzW(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>(strArr.length);
        while (this.zzPC == 3) {
            zzSD();
            zzYJ(9);
            if (!zzZ1.zzY(strArr, this.zzUW) || arrayList.contains(this.zzUW)) {
                throw zzSt();
            }
            zzZQG.zzZ(arrayList, this.zzUW);
            zzSD();
        }
        zzYJ(7);
        return arrayList;
    }

    private String zzX(String[] strArr) {
        String str;
        if (this.zzPC == 3) {
            zzSD();
            zzYJ(9);
            if (!zzZ1.zzY(strArr, this.zzUW)) {
                throw zzSt();
            }
            str = this.zzUW;
            zzSD();
        } else {
            str = null;
        }
        zzYJ(7);
        return str;
    }

    private void zzYJ(int i) {
        if (this.zzPC != i) {
            throw zzSt();
        }
    }

    private zzZZR zzYK(int i) throws Exception {
        return zzZZR.zzj(zzR(i, false));
    }

    private void zzYL(int i) {
        zzSD();
        zzYJ(i);
    }

    private void zzYM(int i) throws Exception {
        zzo(true);
        zzH0 zzh0ZzSU = zzSU();
        if (zzxT().zzEA()) {
            zzxQ().zzY(zzxT().zzEt(), zzh0ZzSU, i);
        } else {
            zzxQ().zzY(zzh0ZzSU, i);
        }
        zzR(0, false);
    }

    private void zzn(boolean z) {
        if (zzQL()) {
            if (z || this.zzPv != zzxT().zzEs()) {
                zzIC();
                zzxQ().zzQM();
                this.zzPv = null;
            }
        }
    }

    private void zzo(boolean z) {
        if ((!z || !zzxT().zzEB()) && !zzxT().zzEA()) {
            throw new zzCW(zzZKN.format("Tag '{0}' must be located within a {1}chart series name.", this.zzPB, z ? "chart title or " : ""));
        }
        if (!zzQL()) {
            throw new zzCW(zzZKN.format("Tag '{0}' must be located within a chart marked with tag '{1}' in its title.", this.zzPB, "foreach"));
        }
    }

    public static /* synthetic */ zzCW zzt(String str) {
        return zzV(9, str);
    }

    private static String zzu(String str) {
        return str != null ? zzZKN.format("'{0}'", str) : "<not set>";
    }

    private void zzv(String str) {
        zzYJ(9);
        if (!zzZKN.zzX(this.zzUW, str, zzZOF.ORDINAL$4894b8c8)) {
            throw zzSt();
        }
    }

    private boolean zzw(String str) {
        boolean z;
        if (this.zzPC == 3) {
            zzSD();
            zzv(str);
            zzSD();
            z = true;
        } else {
            z = false;
        }
        zzYJ(7);
        return z;
    }

    private static int zzx(String str) {
        switch (zzUR.zzTP(str)) {
            case 46:
                return 60;
            case 47:
                return 46;
            case 48:
                return 39;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            case 52:
                return 4;
            case 53:
                return 9;
            case 54:
                return 35;
            case 55:
                return 63;
            case 56:
                return 6;
            case 57:
                return 5;
            case 58:
                return 8;
            case 59:
                return 7;
            case 60:
                return 54;
            case 61:
                return 55;
            case 62:
                return 53;
            case 63:
                return 51;
            case 64:
                return 56;
            case 65:
                return 57;
            case 66:
                return 52;
            case 67:
                return 58;
            case 68:
                return 64;
            case 69:
                return 37;
            case 70:
                return 31;
            case 71:
                return 32;
            case 72:
                return 66;
            case 73:
                return 65;
            case 74:
                return 13;
            case 75:
                return 14;
            case 76:
                return 12;
            case 77:
                return 10;
            case 78:
                return 11;
            case 79:
                return 42;
            case 80:
                return 44;
            case 81:
                return 26;
            case 82:
                return 23;
            case 83:
                return 19;
            case 84:
                return 21;
            case 85:
                return 20;
            case 86:
                return 25;
            case 87:
                return 27;
            case 88:
                return 28;
            case 89:
                return 41;
            case 90:
                return 24;
            case 91:
                return 45;
            case 92:
                return 43;
            case 93:
                return 29;
            case 94:
                return 49;
            case 95:
                return 33;
            case 96:
                return 62;
            case 97:
                return 40;
            case 98:
                return 36;
            case 99:
                return 48;
            case 100:
                return 47;
            case 101:
                return 34;
            case 102:
                return 38;
            case 103:
                return 50;
            case 104:
                return 15;
            case 105:
                return 59;
            case 106:
                return 16;
            case 107:
                return 22;
            case 108:
                return 61;
            case 109:
                return 17;
            case 110:
                return 18;
            case 111:
                return 30;
            default:
                return 0;
        }
    }

    private static int zzy(String str) {
        switch (zzUR.zzTP(str)) {
            case 39:
                return 1;
            case 40:
                return 2;
            case 41:
                return 3;
            case 42:
                return 4;
            case 43:
                return 5;
            default:
                return 0;
        }
    }

    private static int zzz(String str) {
        switch (zzUR.zzTP(str)) {
            case 9:
                return 3;
            case 10:
                return 4;
            case 11:
                return 2;
            case 12:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.aspose.words.internal.zz7X
    public final String zzQ(String str, String str2) {
        return zzZKN.format("The closing tag header ({0}) does not match the header of the opening tag ({1}).", zzu(str), zzu(str2));
    }

    @Override // com.aspose.words.internal.zz7X
    public final void zzTj() throws Exception {
        if (zzSw()) {
            while (zzSC()) {
                zzTi();
            }
        }
    }

    private void zzZ(zzY zzy) {
        zzSD();
        int i = this.zzPC;
        if (i == 8) {
            zzy.setFormat(this.zzUW);
        } else {
            if (i != 9) {
                throw zzSt();
            }
            int iZzz = zzz(this.zzUW);
            if (iZzz != 0) {
                zzy.zzYI(iZzz);
            } else {
                int iZzA = zzA(this.zzUW);
                if (iZzA == 0) {
                    throw zzSt();
                }
                zzy.setNumberStyle(iZzA);
            }
        }
        zzSD();
    }

    private void zzX(int i, String str) {
        this.zzPC = i;
        this.zzUW = str;
    }

    private static String zzW(String str, int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return zzZKN.format("Character '{0}'", Character.valueOf(str.charAt(0)));
            case 6:
                return "Tag start";
            case 7:
                return "Tag end";
            case 8:
                return zzZKN.format("String literal '{0}'", str);
            case 9:
                return zzZKN.format("Token '{0}'", str);
            default:
                throw new IllegalStateException();
        }
    }

    private void zzZ(zzZ zzz) {
        int i = this.zzPC;
        if (i == 3) {
            zzYL(9);
            int iZzx = zzx(this.zzUW);
            if (iZzx != 0) {
                zzz.zzK(iZzx);
                return;
            } else {
                zzv("noText");
                zzz.zzSm();
                return;
            }
        }
        if (i == 9) {
            int iZzTP = zzUR.zzTP(this.zzUW);
            if (iZzTP == 44) {
                zzz.zzV(zzT4());
                return;
            } else {
                if (iZzTP == 45) {
                    zzz.setScale(zzT4());
                    return;
                }
                throw zzSt();
            }
        }
        throw zzSt();
    }

    private boolean zzZ(char c, int i) {
        if (zzxT().zzFI() != c) {
            return false;
        }
        zzSw();
        zzX(i, Character.toString(c));
        return true;
    }

    @Override // com.aspose.words.internal.zz7X
    public final String zzZ(String str, Class cls) {
        String strZzSr;
        if (this.zzPB == null && cls == null) {
            return str;
        }
        if (cls == null) {
            strZzSr = zzSr();
        } else {
            strZzSr = zzZKN.format("Tag '{0}'", zzU(cls));
        }
        return zzZKN.format("{0} is not well-formed. {1}", strZzSr, str);
    }
}
