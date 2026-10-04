package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFK {
    static boolean zzZD5 = false;
    private zzYCZ zzXsU;
    private int zzXsq;
    private boolean zzXsr;
    private boolean zzXtP;
    private zzYEM zzXwl;

    public zzYFK(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    private void zzT(zzYCZ zzycz) throws Exception {
        zzZMK zzzmkZzYsN = zzycz.zzYsN();
        zzYHZ zzyhzZzYfW = this.zzXwl.zzYfW();
        zzyhzZzYfW.zzZ5("\\srauth", this.zzXwl.zzYgv().add(zzzmkZzYsN.getAuthor()));
        zzyhzZzYfW.zzZ5("\\srdate", zzYEO.zzt(zzzmkZzYsN.zzZx()));
        this.zzXwl.zzYfW().zzFg();
        zzyhzZzYfW.zzCC("\\*\\oldsprops");
        zzZ(zzycz, false);
        zzyhzZzYfW.zzYj3();
    }

    private void zzU(zzYCZ zzycz) throws Exception {
        this.zzXwl.zzYfW().zzCD(zzYFJ.zzZ0(zzycz.zzPk(2500)));
        Object objZzPk = zzycz.zzPk(2520);
        if (objZzPk != null) {
            this.zzXwl.zzYfW().zzt("\\sftnstart", ((Integer) objZzPk).intValue(), 1);
        }
        Object objZzPk2 = zzycz.zzPk(2620);
        if (objZzPk2 != null) {
            this.zzXwl.zzYfW().zzt("\\saftnstart", ((Integer) objZzPk2).intValue(), 1);
        }
        this.zzXwl.zzYfW().zzCD(zzYFJ.zzYY(zzycz.zzPk(2510)));
        this.zzXwl.zzYfW().zzCD(zzYFJ.zzYX(zzycz.zzPk(2610)));
        this.zzXwl.zzYfW().zzCD(zzYFJ.zzYW(zzycz.zzPk(2530)));
        this.zzXwl.zzYfW().zzCD(zzYFJ.zzYV(zzycz.zzPk(2630)));
    }

    private zzYCZ zzV(zzYCZ zzycz) {
        zzYCZ zzycz2 = (zzYCZ) zzycz.zzbn();
        zzycz2.zzX(zzYfZ());
        zzycz.zzY(zzycz2);
        return zzycz2;
    }

    private void zzY(zzYCZ zzycz, boolean z) throws Exception {
        if (z) {
            this.zzXwl.zzYfW().zzCD("\\sectd");
        }
        this.zzXsr = false;
        this.zzXsq = 0;
        this.zzXtP = false;
        for (int i = 0; i < zzycz.getCount(); i++) {
            int iZzT3 = zzycz.zzT3(i);
            Object objZzVY = zzycz.zzVY(i);
            switch (iZzT3) {
                case CommonConstant.RETCODE.CLEAR_ACCESSTOKEN_FAIL_NOT_MATCH /* 2010 */:
                    this.zzXwl.zzYfW().zzCD(zzYFJ.zzo1(((Integer) objZzVY).intValue()));
                    break;
                case CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED /* 2020 */:
                    this.zzXwl.zzYfW().zzCD(zzYFJ.zznZ(((Integer) objZzVY).intValue()));
                    break;
                case 2030:
                    this.zzXwl.zzYfW().zzCD(zzYFJ.zzo3(((Integer) objZzVY).intValue()));
                    break;
                case 2040:
                    this.zzXwl.zzYfW().zz7("\\titlepg", ((Boolean) objZzVY).booleanValue());
                    break;
                case 2050:
                    this.zzXwl.zzYfW().zz7("\\pgnrestart", ((Boolean) objZzVY).booleanValue());
                    break;
                case EditingLanguage.FRENCH_BELGIUM /* 2060 */:
                    this.zzXwl.zzYfW().zz7("\\linebetcol", ((Boolean) objZzVY).booleanValue());
                    break;
                case EditingLanguage.PORTUGUESE_PORTUGAL /* 2070 */:
                    this.zzXwl.zzYfW().zzZ5("\\binfsxn", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 2080:
                    this.zzXwl.zzYfW().zzZ5("\\binsxn", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                    break;
                case 2090:
                    this.zzXwl.zzYfW().zzZ5("\\psz", ((Integer) objZzVY).intValue());
                    break;
                case 2100:
                    this.zzXwl.zzYfW().zz7("\\endnhere", !((Boolean) objZzVY).booleanValue());
                    break;
                case EditingLanguage.MALAY_BRUNEI_DARUSSALAM /* 2110 */:
                    this.zzXwl.zzYfW().zzCD(zzYFJ.zzo2(((Integer) objZzVY).intValue()));
                    break;
                case 2120:
                    this.zzXwl.zzYfW().zzZ5("\\linemod", ((Integer) objZzVY).intValue());
                    break;
                case 2130:
                    this.zzXwl.zzYfW().zzCD("\\pgbrdrt");
                    zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    break;
                case 2140:
                    this.zzXwl.zzYfW().zzCD("\\pgbrdrl");
                    zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    break;
                case 2150:
                    this.zzXwl.zzYfW().zzCD("\\pgbrdrb");
                    zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    break;
                case 2160:
                    this.zzXwl.zzYfW().zzCD("\\pgbrdrr");
                    zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                    break;
                case 2170:
                    this.zzXwl.zzYfW().zzZ5("\\sectlinegrid", ((Integer) objZzVY).intValue());
                    break;
                case 2180:
                    this.zzXwl.zzYfW().zzZ5("\\linestarts", ((Integer) objZzVY).intValue());
                    break;
                case 2190:
                    this.zzXwl.zzYfW().zzZ5("\\pgnhn", ((Integer) objZzVY).intValue());
                    break;
                case 2200:
                    this.zzXwl.zzYfW().zzt("\\pgnstarts", ((Integer) objZzVY).intValue(), 1);
                    break;
                case 2210:
                    this.zzXwl.zzYfW().zz7("\\lndscpsxn", ((Integer) objZzVY).intValue() == 2);
                    break;
                case 2220:
                    zzo4(((Integer) objZzVY).intValue());
                    break;
                case 2230:
                    if (!((Boolean) objZzVY).booleanValue()) {
                        this.zzXsq |= 8;
                    }
                    break;
                case 2240:
                    if (((Integer) objZzVY).intValue() == 1) {
                        this.zzXsq |= 32;
                    }
                    break;
                case 2250:
                case 10010:
                    break;
                case 2260:
                    this.zzXwl.zzYfW().zzZ5("\\pgwsxn", ((Integer) objZzVY).intValue());
                    break;
                case 2270:
                    this.zzXwl.zzYfW().zzZ5("\\pghsxn", ((Integer) objZzVY).intValue());
                    break;
                case 2280:
                    this.zzXwl.zzYfW().zzZ5("\\marglsxn", ((Integer) objZzVY).intValue());
                    break;
                case 2290:
                    this.zzXwl.zzYfW().zzZ5("\\margrsxn", ((Integer) objZzVY).intValue());
                    break;
                case 2300:
                    this.zzXwl.zzYfW().zzZ5("\\margtsxn", ((Integer) objZzVY).intValue());
                    break;
                case 2310:
                    this.zzXwl.zzYfW().zzZ5("\\margbsxn", ((Integer) objZzVY).intValue());
                    break;
                case 2312:
                    this.zzXwl.zzYfW().zzZ5("\\guttersxn", ((Integer) objZzVY).intValue());
                    break;
                case 2320:
                    this.zzXwl.zzYfW().zzZ5("\\headery", ((Integer) objZzVY).intValue());
                    break;
                case 2330:
                    this.zzXwl.zzYfW().zzZ5("\\footery", ((Integer) objZzVY).intValue());
                    break;
                case 2340:
                    this.zzXwl.zzYfW().zzCD(zzYFJ.zzo0(((Integer) objZzVY).intValue()));
                    break;
                case 2350:
                    this.zzXwl.zzYfW().zzZ5("\\cols", ((Integer) objZzVY).intValue());
                    break;
                case 2360:
                    this.zzXsr = ((Boolean) objZzVY).booleanValue();
                    break;
                case 2370:
                    this.zzXwl.zzYfW().zzZ5("\\colsx", ((Integer) objZzVY).intValue());
                    break;
                case 2380:
                    zzZ((zzY5Y) objZzVY);
                    break;
                case 2390:
                    this.zzXwl.zzYfW().zz7("\\sectunlocked", ((Boolean) objZzVY).booleanValue());
                    break;
                case 2400:
                    this.zzXwl.zzYfW().zzZ5("\\linex", ((Integer) objZzVY).intValue());
                    break;
                case 2410:
                    this.zzXwl.zzYfW().zz7("\\rtlgutter", ((Boolean) objZzVY).booleanValue());
                    break;
                case 2420:
                    this.zzXwl.zzYfW().zzZ5("\\sectexpand", ((Integer) objZzVY).intValue());
                    break;
                case 2430:
                    this.zzXwl.zzYfW().zzCD(zzYFJ.zznY(((Integer) objZzVY).intValue()));
                    break;
                case 2440:
                    this.zzXwl.zzYfW().zzZ5("\\stextflow", ((Integer) objZzVY).intValue());
                    break;
                case 2450:
                    this.zzXtP = ((Boolean) objZzVY).booleanValue();
                    break;
                default:
                    if (zzZD5) {
                        com.aspose.words.internal.zzZKN.format("Unhandled section attribute: {0}", Integer.valueOf(iZzT3));
                    }
                    break;
            }
        }
        zzU(zzycz);
        zzYg0();
        this.zzXwl.zzYfW().zzt("\\pgbrdropt", this.zzXsq, 0);
    }

    private zzYCZ zzYfZ() {
        if (this.zzXsU == null) {
            zzYg1();
        }
        return this.zzXsU;
    }

    private void zzYg0() throws Exception {
        if (this.zzXwl.zzYen().getExportCompactSize()) {
            return;
        }
        this.zzXwl.zzYfW().zzCD(this.zzXtP ? "\\rtlsect" : "\\ltrsect");
    }

    private void zzYg1() {
        this.zzXsU = new zzYCZ();
        zzYCZ zzyczZzYvR = this.zzXwl.getDocument().getFirstSection().zzYvR();
        for (int i = 0; i < zzyczZzYvR.getCount(); i++) {
            int iZzT3 = zzyczZzYvR.zzT3(i);
            if (zzYFJ.zznW(iZzT3)) {
                this.zzXsU.zzQ(iZzT3, zzyczZzYvR.get(iZzT3));
            }
        }
    }

    private void zzZ(zzYCZ zzycz, boolean z) throws Exception {
        if (this.zzXwl.zzYen().zzYg5()) {
            zzY(zzV(zzycz), z);
        } else {
            zzY(zzycz, z);
        }
    }

    private void zzo4(int i) {
        if (i == 1) {
            this.zzXsq |= 1;
        } else {
            if (i != 2) {
                return;
            }
            this.zzXsq |= 2;
        }
    }

    public final void zzW(zzYCZ zzycz) throws Exception {
        if (!zzycz.zz6D()) {
            zzZ(zzycz, true);
            return;
        }
        zzYCZ zzycz2 = (zzYCZ) zzycz.zzbn();
        zzycz2.zzYpN();
        zzZ(zzycz2, true);
        zzT(zzycz);
    }

    public final void zzYg2() throws Exception {
        if (this.zzXwl.zzYen().zzYg5()) {
            zzYCZ zzyczZzYfZ = zzYfZ();
            for (int i = 0; i < zzyczZzYfZ.getCount(); i++) {
                this.zzXwl.zzYfW().zzZ5(zzYFJ.zznX(zzyczZzYfZ.zzT3(i)), com.aspose.words.internal.zzZQB.zz2(zzyczZzYfZ.zzVY(i)));
            }
        }
    }

    private void zzZ(zzY5Y zzy5y) throws Exception {
        if (this.zzXsr) {
            return;
        }
        int i = 0;
        while (i < zzy5y.getCount()) {
            int i2 = i + 1;
            this.zzXwl.zzYfW().zzZ5("\\colno", i2);
            this.zzXwl.zzYfW().zzZ5("\\colw", zzy5y.get(i).zzXW3());
            this.zzXwl.zzYfW().zzZ5("\\colsr", zzy5y.get(i).zzXW2());
            i = i2;
        }
    }
}
