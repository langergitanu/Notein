package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUS {
    int zzXSJ;
    boolean zzXSK;
    PreferredWidth zzXSL;
    PreferredWidth zzXSM;
    int zzXSN;
    int zzXSO;
    int zzXSP;
    int zzXSQ;
    int zzXSR;
    int zzXSS;
    String zzXST = null;
    String zzXSU;
    String zzXSV;
    String zzXSW;
    boolean zzXSX;
    Object zzXSY;
    Object zzXSZ;
    Object zzXT0;
    String zzXT1;
    String zzXT2;
    String zzXT3;
    PreferredWidth zzXT4;
    PreferredWidth zzXT5;
    PreferredWidth zzXT6;
    PreferredWidth zzXT7;
    Shading zzXT8;
    Border zzXT9;
    Border zzXTa;
    Border zzXTb;
    Border zzXTc;
    Border zzXTd;
    Border zzXTe;
    PreferredWidth zzXTf;
    PreferredWidth zzXTg;
    String zzXTh;
    PreferredWidth zzXTi;
    boolean zzXTj;
    boolean zzXTk;
    String zzXTl;
    String zzXTm;
    String zzXTn;
    String zzXTo;
    String zzXTp;
    String zzXTq;
    String zzXTr;
    String zzXTs;
    String zzXTt;
    String zzXTu;
    String zzXTv;
    String zzXTw;
    String zzXTx;
    String zzXTy;

    public zzYUS(zzY6G zzy6g, boolean z, zzZ9W zzz9w) {
        this.zzXTk = true;
        this.zzXSK = zzz9w.zzZmh();
        this.zzXSJ = zzz9w.getCompliance();
        for (int i = 0; i < zzy6g.getCount(); i++) {
            int iZzT3 = zzy6g.zzT3(i);
            Object objZzVY = zzy6g.zzVY(i);
            switch (iZzT3) {
                case 4005:
                    Integer num = (Integer) objZzVY;
                    if (num.intValue() != 0) {
                        this.zzXTy = zzz9w.zzFs(num.intValue());
                    }
                    break;
                case 4010:
                    this.zzXTh = zzYUB.zzW(((Integer) objZzVY).intValue(), this.zzXSK, zzz9w.getCompliance());
                    this.zzXSS++;
                    this.zzXSR++;
                    break;
                case 4020:
                    this.zzXT6 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    this.zzXSR++;
                    break;
                case 4040:
                    this.zzXT0 = (Boolean) objZzVY;
                    this.zzXSS++;
                    break;
                case 4050:
                    this.zzXTa = (Border) objZzVY;
                    this.zzXSR++;
                    break;
                case 4060:
                    this.zzXTc = (Border) objZzVY;
                    this.zzXSR++;
                    break;
                case 4070:
                    this.zzXTe = (Border) objZzVY;
                    this.zzXSR++;
                    break;
                case 4080:
                    this.zzXTb = (Border) objZzVY;
                    this.zzXSR++;
                    break;
                case 4090:
                    this.zzXTd = (Border) objZzVY;
                    this.zzXSR++;
                    break;
                case EditingLanguage.CHINESE_SINGAPORE /* 4100 */:
                    this.zzXT9 = (Border) objZzVY;
                    this.zzXSR++;
                    break;
                case 4120:
                    this.zzXSS++;
                    this.zzXT2 = com.aspose.words.internal.zzJB.zzWF(zzy6g.getHeight());
                    int heightRule = zzy6g.getHeightRule();
                    if (heightRule != 0) {
                        this.zzXT1 = zzYUB.zzZL(heightRule, this.zzXSK);
                    }
                    break;
                case 4140:
                    this.zzXT3 = com.aspose.words.internal.zzJB.zzWu(zzY6G.zzjU(((Integer) objZzVY).intValue()));
                    this.zzXSR++;
                    break;
                case 4150:
                    int iIntValue = ((Integer) objZzVY).intValue();
                    if (iIntValue != 2) {
                        this.zzXTp = zzY8T.zztb(iIntValue);
                    }
                    break;
                case 4160:
                    int iIntValue2 = ((Integer) objZzVY).intValue();
                    if (iIntValue2 != 0) {
                        this.zzXTq = zzY8T.zzta(iIntValue2);
                    }
                    break;
                case 4170:
                    this.zzXTn = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue() + 1);
                    break;
                case 4180:
                    int iIntValue3 = ((Integer) objZzVY).intValue();
                    if (iIntValue3 != 0) {
                        this.zzXTo = zzY8T.zztc(iIntValue3);
                    }
                    break;
                case 4190:
                    this.zzXTl = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue() + 1);
                    break;
                case 4200:
                    int iIntValue4 = ((Integer) objZzVY).intValue();
                    if (iIntValue4 != 0) {
                        this.zzXTm = zzY8T.zztd(iIntValue4);
                    }
                    break;
                case 4210:
                    this.zzXTt = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    break;
                case 4220:
                    this.zzXTu = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    break;
                case 4230:
                    this.zzXTi = (PreferredWidth) objZzVY;
                    if (this.zzXSK) {
                        this.zzXSR++;
                    }
                    break;
                case 4240:
                    if (!z) {
                        this.zzXSY = objZzVY;
                        this.zzXSR++;
                    }
                    break;
                case 4250:
                    int iIntValue5 = ((Integer) objZzVY).intValue();
                    this.zzXSP = iIntValue5;
                    if (iIntValue5 > 0) {
                        this.zzXSS++;
                    }
                    break;
                case 4253:
                    PreferredWidth preferredWidth = (PreferredWidth) objZzVY;
                    this.zzXSM = preferredWidth;
                    if (preferredWidth.zzYmB()) {
                        this.zzXSS++;
                    }
                    break;
                case 4260:
                    int iIntValue6 = ((Integer) objZzVY).intValue();
                    this.zzXSN = iIntValue6;
                    if (iIntValue6 > 0) {
                        this.zzXSS++;
                    }
                    break;
                case 4261:
                    PreferredWidth preferredWidth2 = (PreferredWidth) objZzVY;
                    this.zzXSL = preferredWidth2;
                    if (preferredWidth2.zzYmB()) {
                        this.zzXSS++;
                    }
                    break;
                case 4270:
                    this.zzXTr = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    break;
                case 4280:
                    this.zzXTs = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    break;
                case 4290:
                    this.zzXTg = (PreferredWidth) objZzVY;
                    this.zzXSS++;
                    this.zzXSR++;
                    break;
                case 4300:
                    this.zzXT7 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    this.zzXSR++;
                    break;
                case 4310:
                    this.zzXT5 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    this.zzXSR++;
                    break;
                case 4320:
                    this.zzXT4 = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    this.zzXSR++;
                    break;
                case 4330:
                    this.zzXT8 = (Shading) objZzVY;
                    this.zzXSR++;
                    break;
                case 4340:
                    this.zzXTf = PreferredWidth.zzpK(((Integer) objZzVY).intValue());
                    this.zzXSR++;
                    break;
                case 4350:
                    this.zzXTk = ((Boolean) objZzVY).booleanValue();
                    break;
                case 4360:
                    this.zzXSZ = (Boolean) objZzVY;
                    this.zzXSS++;
                    break;
                case 4380:
                    this.zzXTj = ((Boolean) objZzVY).booleanValue();
                    break;
                case 4400:
                    this.zzXSU = zzYU3.zzZl((Integer) objZzVY);
                    break;
                case 4500:
                    this.zzXTw = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    break;
                case 4510:
                    this.zzXTv = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    break;
                case 4520:
                    if (zzz9w.zzZmh()) {
                        this.zzXSX = true;
                        this.zzXSS++;
                    }
                    break;
                case 5000:
                    this.zzXSW = (String) objZzVY;
                    break;
                case 5010:
                    this.zzXSV = (String) objZzVY;
                    break;
                case 5015:
                    this.zzXTx = com.aspose.words.internal.zzJB.zzWF(((Integer) objZzVY).intValue());
                    this.zzXSS++;
                    break;
                case 5104:
                    this.zzXSQ = ((Integer) objZzVY).intValue();
                    break;
                case 5105:
                    this.zzXSO = ((Integer) objZzVY).intValue();
                    break;
            }
        }
        if (z) {
            return;
        }
        if (this.zzXSY == null) {
            this.zzXSY = Boolean.valueOf(zzy6g.getAllowAutoFit());
            this.zzXSR++;
        }
        if (((Boolean) this.zzXSY).booleanValue()) {
            this.zzXSR--;
        }
    }
}
