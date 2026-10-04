package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEA extends zzYL1 {
    private static int[] zzXpW = {16, 202, 402};
    private boolean zzXpX;
    private zzYE5 zzXpZ;
    private FontInfoCollection zzYSn;
    private Theme zzYTf;

    public zzYEA(zzZZ2 zzzz2) throws Exception {
        super(zzzz2);
        this.zzYSn = zzzz2.zzYUq;
        this.zzYTf = zzzz2.zzYTm;
    }

    private void zzR6(boolean z) throws Exception {
        zzZ(z, z ? ((zzYEF) this.zzZF0).getMoveToRevision() : ((zzYEF) this.zzZF0).getMoveFromRevision());
    }

    private void zzR7(boolean z) throws Exception {
        zzZ(z, z ? ((zzYEF) this.zzZF0).getInsertRevision() : ((zzYEF) this.zzZF0).getDeleteRevision());
    }

    private void zzT(zzZRH zzzrh) throws Exception {
        this.zzZzR.zzJ((short) -13704);
        this.zzZzR.writeByte((byte) 6);
        this.zzZzR.zzJ((short) ((zzzrh.zzZh5() ? 1 : 0) | (zzzrh.zzZh4() ? 2 : 0) | (zzzrh.zzZh3() << 8) | (zzzrh.zzZh2() ? 4096 : 0)));
        this.zzZzR.zzl(zzzrh.zzZh1());
    }

    private void zzZU(int i, Object obj) throws Exception {
        if (obj != null) {
            String strZzZ = zzU1.zzZ(obj, this.zzYTf);
            this.zzZzR.zzVA(i, zzYmO() ? zzY6X.zzLn(strZzZ) : this.zzYSn.zzLn(strZzZ));
        }
    }

    public final byte[] zzY(TableStyle tableStyle) throws Exception {
        this.zzZzR.zzq().zzH(0L);
        this.zzZF0 = tableStyle.zzZYh();
        zzYpe();
        for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
            if (conditionalStyle.zzZYg()) {
                long jZzW8 = zzW8(51845, conditionalStyle.zzZYk());
                this.zzZF0 = conditionalStyle.zzZYh();
                zzYpe();
                zzXq(jZzW8);
            }
        }
        return zzYmM();
    }

    @Override // com.aspose.words.zzYL1
    public final void zzYpe() throws Exception {
        zz3(zzXpW);
        if (this.zzXpX) {
            zz7(2050, Boolean.TRUE);
        }
        for (int i = 0; i < this.zzZF0.getCount(); i++) {
            int iZzT3 = this.zzZF0.zzT3(i);
            Object objZzVY = this.zzZF0.zzVY(i);
            zzpL(iZzT3);
            switch (iZzT3) {
                case 10:
                    zz6(2072, objZzVY);
                    break;
                case 12:
                    zzR7(false);
                    break;
                case 13:
                    zzR6(false);
                    break;
                case 14:
                    zzR7(true);
                    break;
                case 15:
                    zzR6(true);
                    break;
                case 20:
                    zz2(10764, objZzVY);
                    break;
                case 30:
                    zz3(26645, objZzVY);
                    break;
                case 40:
                    zz3(26646, objZzVY);
                    break;
                case 45:
                    zz6(10361, objZzVY);
                    break;
                case 50:
                    if (zzY0C.zzhF(((Integer) objZzVY).intValue())) {
                        zz4(18992, objZzVY);
                    }
                    break;
                case 60:
                    zz6(2101, objZzVY);
                    break;
                case 70:
                    zz6(2102, objZzVY);
                    break;
                case 80:
                    zz6(2103, objZzVY);
                    break;
                case 90:
                    zz6(2104, objZzVY);
                    break;
                case 100:
                    zz6(2105, objZzVY);
                    break;
                case 110:
                    zz6(2106, objZzVY);
                    break;
                case 120:
                    zz6(EditingLanguage.NORTHERN_SAMI_SWEDEN, objZzVY);
                    break;
                case 130:
                    zz6(EditingLanguage.IRISH, objZzVY);
                    break;
                case 132:
                    zz6(2065, objZzVY);
                    break;
                case 140:
                    zz6(10814, objZzVY);
                    break;
                case 150:
                    zz4(34880, objZzVY);
                    break;
                case 160:
                    zz2(10818, objZzVY);
                    break;
                case 170:
                    zz6(2136, objZzVY);
                    break;
                case 180:
                    zz6(2132, objZzVY);
                    break;
                case 190:
                    zz4(19011, objZzVY);
                    break;
                case 200:
                    zz4(18501, objZzVY);
                    break;
                case 210:
                    zz6(10824, objZzVY);
                    break;
                case 220:
                    zz4(18507, objZzVY);
                    break;
                case 230:
                    zzZU(19023, objZzVY);
                    break;
                case 235:
                    zzZU(19024, objZzVY);
                    break;
                case 240:
                    zzZU(19025, objZzVY);
                    break;
                case 250:
                    zz6(2140, objZzVY);
                    break;
                case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                    zz6(2141, objZzVY);
                    break;
                case StyleIdentifier.BIBLIOGRAPHY /* 265 */:
                    zz6(2138, objZzVY);
                    break;
                case StyleIdentifier.PLAIN_TABLE_2 /* 268 */:
                    zz6(2178, objZzVY);
                    break;
                case 270:
                    zzZU(19038, objZzVY);
                    break;
                case StyleIdentifier.GRID_TABLE_4_ACCENT_2 /* 290 */:
                    zz4(18514, objZzVY);
                    break;
                case 300:
                    zz6(10835, objZzVY);
                    break;
                case StyleIdentifier.GRID_TABLE_3_ACCENT_5 /* 310 */:
                    zz6(10329, objZzVY);
                    break;
                case StyleIdentifier.LIST_TABLE_2_ACCENT_1 /* 330 */:
                    zz6(2152, objZzVY);
                    break;
                case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                    zz4(18527, objZzVY);
                    break;
                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                    zz4(19041, objZzVY);
                    break;
                case StyleIdentifier.LIST_TABLE_4_ACCENT_5 /* 360 */:
                    zz0(26725, objZzVY);
                    break;
                case StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6 /* 370 */:
                    zzZY(18534, objZzVY);
                    break;
                case 380:
                    if (((zzYEF) this.zzZF0).zzYdK().zzZ((zzZ9G) this.zzZF0, 440).toBool()) {
                        zz4(18541, 1024);
                        zz4(18542, 1024);
                    } else {
                        zz4(18541, (Integer) objZzVY);
                        if (((zzYEF) this.zzZF0).getLocaleId() != ((zzYEF) this.zzZF0).getLocaleIdFarEast()) {
                            zz4(18542, ((zzYEF) this.zzZF0).zzPk(390));
                        }
                    }
                    break;
                case 400:
                    zz6(10351, objZzVY);
                    break;
                case 440:
                    zz6(2165, objZzVY);
                    break;
                case 450:
                    zz1(26743, objZzVY);
                    break;
                case 460:
                    if (this.zzZF0.zzVE(460)) {
                        this.zzZzR.zzJ((short) 18510);
                        this.zzZzR.writeByte((byte) ((Integer) this.zzZF0.zzPj(460)).intValue());
                        this.zzZzR.writeByte((byte) ((Integer) this.zzZF0.zzPj(470)).intValue());
                    }
                    break;
                case 480:
                    zz3(26759, objZzVY);
                    break;
                case 490:
                    zz4(18568, objZzVY);
                    break;
                case 770:
                    int iIntValue = ((Integer) objZzVY).intValue();
                    if (iIntValue != 0) {
                        zz6(10804, Byte.valueOf((byte) iIntValue));
                    }
                    break;
                case 780:
                    zzT((zzZRH) objZzVY);
                    break;
                case 880:
                    zzZNW zzznw = (zzZNW) objZzVY;
                    this.zzZzR.zzJ((short) -13706);
                    this.zzZzR.writeByte((byte) 8);
                    this.zzZzR.zzl(zzznw.getValue());
                    this.zzZzR.zzl(zzznw.getId());
                    break;
            }
        }
        zzYmH();
        zzW7(51849, 10883);
    }

    public final zzXF zzZ(zzYEF zzyef, zzYE5 zzye5, boolean z) throws Exception {
        this.zzXpZ = zzye5;
        this.zzXpX = z;
        return new zzXF(zzT(zzyef));
    }

    @Override // com.aspose.words.zzYL1
    public final void zzqA(int i) throws Exception {
        if (i == 16) {
            zzYE5 zzye5 = this.zzXpZ;
            if (zzye5 != null) {
                if (zzye5.zzXpH != 0) {
                    this.zzZzR.zzVy(27145, this.zzYSn.zzLn(zzye5.zzXpG) | (this.zzXpZ.zzXpH << 16));
                }
                int i2 = this.zzXpZ.zzdZ;
                if (i2 != -1) {
                    this.zzZzR.zzVy(27139, i2);
                }
                if (this.zzXpZ.zzXpI) {
                    this.zzZzR.zzVB(EditingLanguage.SPANISH_MEXICO, 1);
                }
                if (this.zzXpZ.zzXpK) {
                    this.zzZzR.zzVB(2054, 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 202) {
            if (i != 402) {
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Invalid virtual key {0}.", Integer.valueOf(i)));
            }
            zzYmL();
            zzW9(51825, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
            zzWa(51826, StyleIdentifier.LIST_TABLE_4_ACCENT_5);
            zz4(18547, ((zzYEF) this.zzZF0).zzPk(380));
            zz4(18548, ((zzYEF) this.zzZF0).zzPk(390));
            return;
        }
        zzYE5 zzye52 = this.zzXpZ;
        if (zzye52 != null) {
            if (zzye52.zzXpL) {
                this.zzZzR.zzVB(2133, 1);
            }
            if (this.zzXpZ.zzXpJ) {
                this.zzZzR.zzVB(2134, 1);
            }
        }
    }

    private void zzZ(boolean z, zzYJC zzyjc) throws Exception {
        if (zzyjc == null) {
            return;
        }
        this.zzZzR.zzVB(z ? EditingLanguage.ARABIC_IRAQ : 2048, 129);
        this.zzZzR.zzVA(z ? 18436 : 18531, this.zzYTI.zzCK(zzyjc.getAuthor()));
        this.zzZzR.zzJ((short) (z ? 26629 : 26724));
        zzKE.zzZ(zzyjc.zzZx(), this.zzZzR);
    }
}
