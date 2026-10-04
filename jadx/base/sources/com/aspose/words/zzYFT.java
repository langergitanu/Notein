package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFT implements zzZ9Y {
    private zzZ4J zzXsJ;
    private boolean zzXsK;
    private String zzXsO;
    private RtfLoadOptions zzXsP;
    private boolean zzXsQ;
    private int zzXsT;
    private zzYHC zzXsZ;
    private zzYH1 zzXt0;
    private zzYF1 zzXt1;
    private zzYH2 zzXt2;
    private zzYGC zzXt3;
    private zzYLV zzXt4;
    private zzYFS zzXt5;
    private zzYHV zzXt6;
    zzYEF zzXt7;
    boolean zzXt8;
    boolean zzXt9;
    private zzZRH zzXta;
    private zzZRH zzXtb;
    private int zzXtc;
    private int zzXtd;
    private Document zzZEY;
    private com.aspose.words.internal.zzD3<String> zzXsY = new com.aspose.words.internal.zzD3<>();
    private ArrayList<Border> zzXsX = new ArrayList<>();
    private String zzXsW = "";
    private String zzXsV = "";
    private zzYCZ zzXsU = new zzYCZ();
    private com.aspose.words.internal.zz7D<Object> zzXsS = new com.aspose.words.internal.zz7D<>();
    private com.aspose.words.internal.zzD3<String> zzXsR = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzZQ9 zzXsN = com.aspose.words.internal.zzZQ9.zz35;
    private int zzXsM = -1;
    private int zzXsL = -1;

    public zzYFT(Document document, LoadOptions loadOptions) {
        this.zzZEY = document;
        RtfLoadOptions rtfLoadOptions = (RtfLoadOptions) com.aspose.words.internal.zzZKW.zzZ(loadOptions, RtfLoadOptions.class);
        this.zzXsP = rtfLoadOptions;
        if (rtfLoadOptions == null) {
            this.zzXsP = new RtfLoadOptions(loadOptions);
        }
        this.zzXt6 = new zzYHV(false);
        this.zzXt5 = new zzYFS(false);
        this.zzXt4 = new zzYLV();
        this.zzXt3 = new zzYGC(this);
        this.zzXt2 = new zzYH2(this);
        this.zzXt1 = new zzYF1();
        this.zzXt0 = new zzYH1();
        this.zzXsZ = new zzYHC(document.getFontInfos(), this.zzXt0.zzYie());
        this.zzXsO = "";
        zzYEF zzyef = new zzYEF();
        this.zzXt7 = zzyef;
        zzyef.zzS(zzU1.zzSP(zzYEF.zzYdx()));
        this.zzXt7.zzQ(zzU1.zzSP(zzYEF.zzYdx()));
        this.zzXt7.zzR(zzU1.zzSP(zzYEF.zzYdx()));
        this.zzXt7.zzP(zzU1.zzSP(zzYEF.zzYdx()));
    }

    private int zzYg8() {
        int i = this.zzXsL;
        return i != -1 ? i : this.zzXt0.zzYic();
    }

    private int zzZm(int i, boolean z) {
        int iZzYid = this.zzXt0.zzYid();
        zzYH3 zzyh3ZzYiL = this.zzXt2.zzYiL();
        boolean zZzVE = zzyh3ZzYiL.zzZYh().zzVE(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2);
        if (zZzVE) {
            iZzYid = zzyh3ZzYiL.zzYWo() != -1 ? zzyh3ZzYiL.zzYWo() : zzyh3ZzYiL.zzZYh().getLocaleIdBi();
        }
        int iZzoj = zzoj(iZzYid);
        if (iZzoj == 0 || (!zZzVE && z)) {
            if (zzYEO.zznv(iZzYid)) {
                if (com.aspose.words.internal.zzT8.isRightToLeft(i)) {
                    return 1252;
                }
                return i;
            }
            if (com.aspose.words.internal.zzT8.isRightToLeft(i)) {
                return i;
            }
            if (iZzoj == 0) {
                return 1256;
            }
        }
        return iZzoj;
    }

    private static int zzoj(int i) {
        if (i == -1) {
            return 0;
        }
        if (zzYEO.zznx(i)) {
            return 1255;
        }
        return com.aspose.words.internal.zzBZ.zzZY(i, 1) ? 1256 : 0;
    }

    private int zzt(int i, int i2) {
        int iZzt = com.aspose.words.internal.zzT8.zzt(i, Integer.MIN_VALUE);
        return iZzt != Integer.MIN_VALUE ? iZzt : (this.zzXt0.zzYib() && i == 1 && !com.aspose.words.internal.zzJF.zzZK(this.zzXsZ.zzB6(i2))) ? com.aspose.words.internal.zzZXR.zzpZ().zzj5().zzjY() : this.zzXt0.zzYic();
    }

    public final int getCodePage() {
        zzYH3 zzyh3ZzYiL = this.zzXt2.zzYiL();
        if (zzyh3ZzYiL.zzYij() == -1) {
            return zzYg8();
        }
        int iZzoV = this.zzXsZ.zzoV(zzyh3ZzYiL.zzYij());
        int iZzt = zzt(iZzoV, zzyh3ZzYiL.zzYij());
        if (!zzyh3ZzYiL.zzYik().getBidi()) {
            return iZzt;
        }
        if (iZzoV == 0 && zzyh3ZzYiL.zzYii() != -1) {
            int iZzoV2 = this.zzXsZ.zzoV(zzyh3ZzYiL.zzYii());
            if (com.aspose.words.internal.zzT8.zzYT(iZzoV2)) {
                iZzt = zzt(iZzoV2, zzyh3ZzYiL.zzYii());
                iZzoV = iZzoV2;
            }
        }
        return zzZm(iZzt, iZzoV != 0);
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    public final IWarningCallback getWarningCallback() {
        RtfLoadOptions rtfLoadOptions = this.zzXsP;
        if (rtfLoadOptions != null) {
            return rtfLoadOptions.getWarningCallback();
        }
        return null;
    }

    public final void zz3(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzXsN = zzzq9;
    }

    public final void zzBW(String str) throws Exception {
        if (com.aspose.words.internal.zzJF.zzZ(this.zzZEY.zzZqy(), str)) {
            return;
        }
        this.zzZEY.zzZpV().zzYVg.setUseFELayout(false);
    }

    public final void zzBX(String str) {
        this.zzXsV = str;
    }

    public final void zzBY(String str) {
        this.zzXsW = str;
    }

    public final void zzBZ(String str) {
        this.zzXsO = str;
    }

    public final void zzC0(String str) {
        zzT(65536, com.aspose.words.internal.zzZKN.format("Import of element {0} is not supported in Rtf by Aspose.Words.", str));
    }

    public final void zzH(Object obj, int i) {
        this.zzXsS.set(obj, i);
    }

    @Override // com.aspose.words.zzZ9Y
    public final int zzJ(Object obj, int i) {
        int i2 = this.zzXsS.get(obj);
        return com.aspose.words.internal.zz7D.zzWm(i2) ? i : i2;
    }

    public final void zzR(zzZS zzzs, int i) {
        this.zzXsX.clear();
        Border border = new Border();
        zzzs.zzQ(i, border);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXsX, border);
    }

    public final void zzRk(boolean z) {
        this.zzXsQ = z;
    }

    public final void zzT(int i, String str) {
        RtfLoadOptions rtfLoadOptions = this.zzXsP;
        if (rtfLoadOptions == null || rtfLoadOptions.getWarningCallback() == null) {
            return;
        }
        OooO00o.OooO0O0(this.zzXsP.getWarningCallback(), i, 12, str);
    }

    public final void zzX(zzYCZ zzycz) {
        this.zzXsU.zzY(zzycz);
    }

    public final void zzY(String str, Object... objArr) {
        zzY1Z.zzZ(getWarningCallback(), 12, str, objArr);
    }

    public final zzZ4J zzYg9() {
        if (this.zzXsJ == null) {
            Document document = this.zzZEY;
            this.zzXsJ = new zzZ4J(document, document.getLists().zzYP3(), 1, 0);
        }
        return this.zzXsJ;
    }

    public final void zzYga() {
        this.zzXsK = true;
    }

    public final boolean zzYgb() {
        return this.zzXsK;
    }

    public final void zzYgc() throws Exception {
        this.zzXt7.clear();
        zzU1 zzu1Zzol = zzol(this.zzXt0.zzYie());
        this.zzXt7.zzS(zzu1Zzol);
        this.zzXt7.zzQ(zzu1Zzol);
        if (!zzu1Zzol.zzZYI() && com.aspose.words.internal.zzJF.zzZ(this.zzZEY.zzZqy(), zzu1Zzol.getName())) {
            this.zzXt7.zzR(zzu1Zzol);
        }
        this.zzXt7.zzP(zzu1Zzol);
        zzYEF zzyefZzY37 = this.zzZEY.getStyles().zzY37();
        int i = this.zzXt0.zzXvd;
        zzyefZzY37.zzS(i != -1 ? zzol(i) : zzU1.zzMW(131073));
        int i2 = this.zzXt0.zzXvb;
        zzyefZzY37.zzQ(i2 != -1 ? zzol(i2) : zzU1.zzMW(131076));
        int i3 = this.zzXt0.zzXva;
        zzyefZzY37.zzP(i3 != -1 ? zzol(i3) : zzU1.zzMW(131074));
        int i4 = this.zzXt0.zzXvc;
        zzyefZzY37.zzR(i4 != -1 ? zzol(i4) : zzU1.zzMW(131075));
    }

    public final zzZRH zzYgd() {
        return this.zzXta;
    }

    public final zzZRH zzYge() {
        return this.zzXtb;
    }

    public final int zzYgf() {
        return this.zzXtc;
    }

    public final int zzYgg() {
        return this.zzXsM;
    }

    public final int zzYgh() {
        return this.zzXtd;
    }

    public final RtfLoadOptions zzYgi() {
        return this.zzXsP;
    }

    public final boolean zzYgj() {
        zzYH2 zzyh2 = this.zzXt2;
        if (zzyh2 == null) {
            return false;
        }
        int type = zzyh2.zzYiL().zzYiN().getType();
        return type == 29 || type == 30 || type == 31;
    }

    public final String zzYgk() {
        return this.zzXsV;
    }

    public final String zzYgl() {
        return this.zzXsW;
    }

    public final zzYH1 zzYgm() {
        return this.zzXt0;
    }

    public final ArrayList<Border> zzYgn() {
        return this.zzXsX;
    }

    public final zzYH2 zzYgo() {
        return this.zzXt2;
    }

    public final com.aspose.words.internal.zzZQ9 zzYgp() {
        return this.zzXsN;
    }

    public final String zzYgq() {
        return this.zzXsO;
    }

    public final boolean zzYgr() {
        return this.zzXsQ;
    }

    public final com.aspose.words.internal.zzD3<String> zzYgs() {
        return this.zzXsY;
    }

    public final zzYHC zzYgt() {
        return this.zzXsZ;
    }

    public final zzYLV zzYgu() {
        return this.zzXt4;
    }

    public final zzYFS zzYgv() {
        return this.zzXt5;
    }

    public final zzYHV zzYgw() {
        return this.zzXt6;
    }

    public final int zzYgx() {
        int i = this.zzXsT + 1;
        this.zzXsT = i;
        return i;
    }

    public final zzYF1 zzYhj() {
        return this.zzXt1;
    }

    public final zzYGC zzYiM() {
        return this.zzXt3;
    }

    public final void zzZW(int i, Object obj) {
        if (i == 2260 || i == 2270) {
            obj = Integer.valueOf(((Integer) obj).intValue() & 65535);
        }
        this.zzXsU.zzQ(i, obj);
        this.zzXt2.zzYiL().zzYvR().zzQ(i, obj);
    }

    public final void zzk(int i, String str) {
        this.zzXsR.set(i, str);
    }

    public final void zzof(int i) {
        this.zzXsL = i;
    }

    public final void zzog(int i) {
        this.zzXtc = i;
    }

    public final void zzoh(int i) {
        this.zzXsM = i;
    }

    public final void zzoi(int i) {
        this.zzXtd = i;
    }

    public final String zzok(int i) {
        String str = this.zzXsR.get(i);
        return str != null ? str : "";
    }

    public final zzU1 zzol(int i) {
        String strZzom = zzom(i);
        int iZzoW = this.zzXsZ.zzoW(i);
        return iZzoW != 0 ? zzU1.zzMW(iZzoW) : zzU1.zzSP(strZzom);
    }

    public final String zzom(int i) {
        return this.zzXsZ.zzB6(i);
    }

    public final void zzX(zzZRH zzzrh) {
        this.zzXta = zzzrh;
    }

    public final void zzY(zzZRH zzzrh) {
        this.zzXtb = zzzrh;
    }
}
