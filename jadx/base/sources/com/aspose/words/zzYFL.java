package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFL extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\sectd", "\\ltrsect", "\\rtlsect", "\\binfsxn", "\\binsxn", "\\sectunlocked", "\\cols", "\\colsx", "\\linebetcol", "\\linemod", "\\linex", "\\linestarts", "\\pgwsxn", "\\pghsxn", "\\marglsxn", "\\margrsxn", "\\margtsxn", "\\margbsxn", "\\guttersxn", "\\headery", "\\footery", "\\pgnstarts", "\\pgnrestart", "\\titlepg", "\\pgnhn", "\\stextflow", "\\rtlgutter", "\\pgbrdrl", "\\pgbrdrr", "\\pgbrdrt", "\\pgbrdrb", "\\psz", "\\endnhere", "\\colno", "\\colw", "\\colsr", "\\lndscpsxn", "\\pgbrdropt", "\\sftnstart", "\\saftnstart", "\\sectlinegrid", "\\sectexpand", "\\srauth", "\\srdate", "\\pgncont", "\\sectrsid");
    private zzYCZ zzXss;
    private TextColumn zzXst;

    public zzYFL(zzYFT zzyft) {
        super(zzyft);
    }

    private void zzYg3() {
        if (this.zzXst == null) {
            this.zzXst = zzo5(0);
        }
    }

    private zzY5Y zzYg4() {
        Object objZzPk = zzYvR().zzPk(2380);
        if (objZzPk == null) {
            objZzPk = new zzY5Y();
            zzYvR().zzQ(2380, objZzPk);
        }
        return (zzY5Y) com.aspose.words.internal.zzZKW.zzZ(objZzPk, zzY5Y.class);
    }

    private void zzYiZ() {
        zzYvR().clear();
        zzYja().zzX(zzYvR());
        this.zzXst = null;
    }

    private zzYCZ zzYvR() {
        zzYCZ zzycz = this.zzXss;
        return zzycz != null ? zzycz : zzYja().zzYgo().zzYiL().zzYvR();
    }

    private TextColumn zzo5(int i) {
        zzY5Y zzy5yZzYg4 = zzYg4();
        while (zzy5yZzYg4.getCount() <= i) {
            zzy5yZzYg4.zzZ(new TextColumn());
        }
        return zzy5yZzYg4.get(i);
    }

    private void zzo6(int i) {
        if ((i & 1) != 0) {
            zzYvR().zzQ(2220, 1);
        }
        if ((i & 2) != 0) {
            zzYvR().zzQ(2220, 2);
        }
        if ((i & 8) != 0) {
            zzYvR().zzQ(2230, Boolean.FALSE);
        }
        if ((i & 32) != 0) {
            zzYvR().zzQ(2240, 1);
        }
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) throws Exception {
        int iZzBS = zzYFJ.zzBS(zzyet.getName());
        if (iZzBS != Integer.MIN_VALUE) {
            zzYvR().zzQ(2030, Integer.valueOf(iZzBS));
            return true;
        }
        int iZzBR = zzYFJ.zzBR(zzyet.getName());
        if (iZzBR != Integer.MIN_VALUE) {
            zzYvR().zzQ(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, Integer.valueOf(iZzBR));
            return true;
        }
        int iZzBQ = zzYFJ.zzBQ(zzyet.getName());
        if (iZzBQ != Integer.MIN_VALUE) {
            zzYvR().zzQ(CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH, Integer.valueOf(iZzBQ));
            return true;
        }
        int iZzBP = zzYFJ.zzBP(zzyet.getName());
        if (iZzBP != Integer.MIN_VALUE) {
            zzYvR().zzQ(2340, Integer.valueOf(iZzBP));
            return true;
        }
        int iZzBO = zzYFJ.zzBO(zzyet.getName());
        if (iZzBO != Integer.MIN_VALUE) {
            zzYvR().zzQ(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, Integer.valueOf(iZzBO));
            return true;
        }
        int iZzCv = zzYFJ.zzCv(zzyet.getName());
        if (iZzCv != Integer.MIN_VALUE) {
            zzYvR().zzQ(2500, Integer.valueOf(iZzCv));
            return true;
        }
        int iZzCt = zzYFJ.zzCt(zzyet.getName());
        if (iZzCt != Integer.MIN_VALUE) {
            zzYvR().zzQ(2510, Integer.valueOf(iZzCt));
            return true;
        }
        int iZzCs = zzYFJ.zzCs(zzyet.getName());
        if (iZzCs != Integer.MIN_VALUE) {
            zzYvR().zzQ(2610, Integer.valueOf(iZzCs));
            return true;
        }
        int iZzCr = zzYFJ.zzCr(zzyet.getName());
        if (iZzCr != Integer.MIN_VALUE) {
            zzYvR().zzQ(2530, Integer.valueOf(iZzCr));
            return true;
        }
        int iZzCq = zzYFJ.zzCq(zzyet.getName());
        if (iZzCq != Integer.MIN_VALUE) {
            zzYvR().zzQ(2630, Integer.valueOf(iZzCq));
            return true;
        }
        int iZzBN = zzYFJ.zzBN(zzyet.getName());
        if (iZzBN == Integer.MIN_VALUE) {
            return false;
        }
        zzYvR().zzQ(2430, Integer.valueOf(iZzBN));
        return true;
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        if (zzZrB()) {
            return false;
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                zzYiZ();
                return true;
            case 1:
                zzYvR().zzQ(2450, Boolean.FALSE);
                return true;
            case 2:
                zzYvR().zzQ(2450, Boolean.TRUE);
                return true;
            case 3:
                zzYvR().zzQ(EditingLanguage.PORTUGUESE_PORTUGAL, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 4:
                zzYvR().zzQ(2080, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 5:
                zzYvR().zzQ(2390, Boolean.TRUE);
                return true;
            case 6:
                zzYvR().zzQ(2350, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 7:
                zzYvR().zzQ(2370, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 8:
                zzYvR().zzQ(EditingLanguage.FRENCH_BELGIUM, Boolean.TRUE);
                return true;
            case 9:
                zzYvR().zzQ(2120, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 10:
                zzYvR().zzQ(2400, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 11:
                zzYvR().zzQ(2180, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 12:
                zzYvR().zzQ(2260, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 13:
                zzYvR().zzQ(2270, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 14:
                zzYvR().zzQ(2280, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 15:
                zzYvR().zzQ(2290, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 16:
                zzYvR().zzQ(2300, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 17:
                zzYvR().zzQ(2310, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 18:
                zzYvR().zzQ(2312, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 19:
                zzYvR().zzQ(2320, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 20:
                zzYvR().zzQ(2330, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 21:
                zzYvR().zzQ(2200, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 22:
                zzYvR().zzQ(2050, Boolean.TRUE);
                return true;
            case 23:
                zzYvR().zzQ(2040, Boolean.TRUE);
                return true;
            case 24:
                zzYvR().zzQ(2190, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 25:
                zzYvR().zzQ(2440, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 26:
                zzYvR().zzQ(2410, Boolean.TRUE);
                return true;
            case 27:
                zzYja().zzR(zzYvR(), 2140);
                return true;
            case 28:
                zzYja().zzR(zzYvR(), 2160);
                return true;
            case 29:
                zzYja().zzR(zzYvR(), 2130);
                return true;
            case 30:
                zzYja().zzR(zzYvR(), 2150);
                return true;
            case 31:
                zzYvR().zzQ(2090, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 32:
                zzYvR().zzQ(2100, Boolean.FALSE);
                return true;
            case 33:
                zzYvR().zzQ(2360, Boolean.FALSE);
                this.zzXst = zzo5(zzyet.zzYeT() - 1);
                return true;
            case 34:
                zzYg3();
                this.zzXst.zzjM(zzyet.zzYeT());
                return true;
            case 35:
                zzYg3();
                this.zzXst.zzjL(zzyet.zzYeT());
                return true;
            case 36:
                zzYvR().zzQ(2210, 2);
                return true;
            case 37:
                zzo6(zzyet.zzYeT());
                return true;
            case 38:
                zzYvR().zzQ(2520, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 39:
                zzYvR().zzQ(2620, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 40:
                zzYvR().zzQ(2170, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 41:
                zzYvR().zzQ(2420, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 42:
                zzYja().zzBZ(com.aspose.words.internal.zzJB.zzWD(zzyet.zzYeT()));
                return true;
            case 43:
                zzYja().zz3(zzYEO.zzM4(zzyet.zzYeT()));
                return true;
            case 44:
                zzYvR().remove(2050);
                return true;
            case 45:
                zzYvR().zzQ(2250, Integer.valueOf(zzyet.zzYeT()));
                return true;
            default:
                return false;
        }
    }

    public zzYFL(zzYFT zzyft, zzYCZ zzycz) {
        super(zzyft);
        this.zzXss = zzycz;
    }
}
