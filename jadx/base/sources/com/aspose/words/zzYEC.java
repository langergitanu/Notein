package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEC extends zzYL2 implements zzZ97 {
    private static int[] zzXpY = {10, 12, 14, 20, 30, 40, 132, StyleIdentifier.BIBLIOGRAPHY, 400, 10010};
    private zzY9J zzXH2;
    private zzYE5 zzXpZ;

    public zzYEC(zzZZB zzzzb) throws Exception {
        super(zzzzb);
        this.zzXH2 = new zzY9J(this, null, zzzzb.zzYUr);
    }

    private void zz9(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzZRH zzzrh = new zzZRH();
        short sZzX9 = zzzox.zzX9();
        zzzrh.zzW7((sZzX9 & 1) != 0);
        zzzrh.zzW6((sZzX9 & 2) != 0);
        zzzrh.zzDO((sZzX9 & 1280) >> 8);
        zzzrh.zzW5((sZzX9 & 4096) != 0);
        zzzrh.zzDN(zzzox.zzXc());
        this.zzZF0.zzQ(780, zzzrh);
    }

    private void zzVP(int i, int i2) {
        this.zzZF0.zzQ(i, zzU1.zzSP(zzYmO() ? zzY6X.zzB6(i2) : zzYmN().zzYUq.zzB6(i2)));
    }

    private void zzW(zzZV8 zzzv8) throws Exception {
        com.aspose.words.internal.zzZQ9 zzzq9ZzM4 = zzKE.zzM4(this.zzW6.zzXc());
        if (zzzv8 != null) {
            zzzv8.zz4(zzzq9ZzM4);
        }
    }

    private void zzX(zzZV8 zzzv8) throws Exception {
        short sZzXa = this.zzW6.zzXa();
        if (zzzv8 != null) {
            zzzv8.setAuthor(zzYmN().zzYUs.zzpy(sZzXa));
        }
    }

    private int zzn5(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7 && i != 20 && i != 23 && i != 39 && i != 43 && i != 55) {
            switch (i) {
                default:
                    switch (i) {
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            zzY("Invalid underline type read, used defaults.", new Object[0]);
                            return 0;
                    }
                case 9:
                case 10:
                case 11:
                    return i;
            }
        }
        return i;
    }

    private zzZU zzn6(int i) {
        if (i == 0) {
            return zzZU.zzZF7;
        }
        if (i == 1) {
            return zzZU.zzZF6;
        }
        if (i == 128) {
            return zzZU.zzZF5;
        }
        if (i == 129) {
            return zzZU.zzZF4;
        }
        zzY("Invalid BoolEx value occurred, ignored.", new Object[0]);
        return zzZU.zzZF6;
    }

    public final void zzY(byte[] bArr, TableStyle tableStyle) throws Exception {
        this.zzYED = tableStyle;
        this.zzZF0 = tableStyle.zzZYh();
        this.zzXH2.zzXK(bArr);
    }

    public final boolean zzZ(byte[] bArr, zzYEF zzyef, zzYE5 zzye5) throws Exception {
        if (zzYmN().zzZrB()) {
            return true;
        }
        this.zzZF0 = zzyef;
        this.zzXpZ = zzye5;
        boolean zZzXK = this.zzXH2.zzXK(bArr);
        zzYL2.zzU(zzyef);
        return zZzXK;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.aspose.words.zzZ97
    public final boolean zzZ(int i, int i2, int i3, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (i2 != 2) {
            return true;
        }
        this.zzW6 = zzzox;
        switch (i) {
            case 0:
            case 18539:
                return true;
            case 68:
            case 27139:
                zzYE5 zzye5 = this.zzXpZ;
                if (zzye5 == null) {
                    return true;
                }
                zzye5.zzdZ = zzzox.zzXc();
                this.zzXpZ.zzXpL = true;
                return true;
            case 74:
            case 27145:
                zzYE5 zzye52 = this.zzXpZ;
                if (zzye52 != null) {
                    zzye52.zzXpG = zzYmN().zzYUq.zzB6(this.zzW6.zzX9() & 65535);
                    this.zzXpZ.zzXpH = (char) (i == 27145 ? this.zzW6.zzX9() & 65535 : this.zzW6.readByte() & 255);
                    if (com.aspose.words.internal.zzJF.zzZK(this.zzXpZ.zzXpG)) {
                        zzYE5 zzye53 = this.zzXpZ;
                        zzye53.zzXpH = com.aspose.words.internal.zzJF.zzE(zzye53.zzXpH);
                    }
                    this.zzXpZ.zzXpL = true;
                    return true;
                }
                return true;
            case 79:
            case 2138:
                this.zzZF0.zzQ(StyleIdentifier.BIBLIOGRAPHY, zzn6(zzzox.readByte() & 255));
                return true;
            case 93:
                short sZzXa = zzzox.zzXa();
                zzVP(230, sZzXa);
                zzVP(240, sZzXa);
                return true;
            case 111:
            case 2140:
                this.zzZF0.zzQ(250, zzn6(zzzox.readByte() & 255));
                return true;
            case 113:
            case 19038:
                zzVP(270, zzzox.zzXa());
                return true;
            case 116:
            case 19041:
                this.zzZF0.zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 2048:
                if ((zzzox.readByte() & 255) != 0) {
                    ((zzYEF) this.zzZF0).zzQ(12, new zzZV8(1));
                }
                return true;
            case EditingLanguage.ARABIC_IRAQ /* 2049 */:
                if ((zzzox.readByte() & 255) != 0) {
                    ((zzYEF) this.zzZF0).zzQ(14, new zzZV8(0));
                }
                return true;
            case 2050:
                this.zzXpZ.zzXpF = zzn6(zzzox.readByte() & 255);
                return true;
            case 2054:
                zzYE5 zzye54 = this.zzXpZ;
                if (zzye54 == null) {
                    return true;
                }
                zzye54.zzXpK = zzzox.readByte() == 1;
                return true;
            case EditingLanguage.SPANISH_MEXICO /* 2058 */:
                zzYE5 zzye55 = this.zzXpZ;
                if (zzye55 != null) {
                    zzye55.zzXpI = zzzox.readByte() == 1;
                    return true;
                }
                return true;
            case 2065:
                this.zzZF0.zzQ(132, zzn6(zzzox.readByte() & 255));
                return true;
            case 2072:
                this.zzZF0.zzQ(10, zzn6(zzzox.readByte() & 255));
                return true;
            case 2101:
                this.zzZF0.zzQ(60, zzn6(zzzox.readByte() & 255));
                return true;
            case 2102:
                this.zzZF0.zzQ(70, zzn6(zzzox.readByte() & 255));
                return true;
            case 2103:
                this.zzZF0.zzQ(80, zzn6(zzzox.readByte() & 255));
                return true;
            case 2104:
                this.zzZF0.zzQ(90, zzn6(zzzox.readByte() & 255));
                return true;
            case 2105:
                this.zzZF0.zzQ(100, zzn6(zzzox.readByte() & 255));
                return true;
            case 2106:
                this.zzZF0.zzQ(110, zzn6(zzzox.readByte() & 255));
                return true;
            case EditingLanguage.NORTHERN_SAMI_SWEDEN /* 2107 */:
                this.zzZF0.zzQ(120, zzn6(zzzox.readByte() & 255));
                return true;
            case EditingLanguage.IRISH /* 2108 */:
                this.zzZF0.zzQ(130, zzn6(zzzox.readByte() & 255));
                return true;
            case 2132:
                this.zzZF0.zzQ(180, zzn6(zzzox.readByte() & 255));
                return true;
            case 2133:
                zzYE5 zzye56 = this.zzXpZ;
                if (zzye56 == null) {
                    return true;
                }
                zzye56.zzXpL = zzzox.readByte() == 1;
                return true;
            case 2134:
                zzYE5 zzye57 = this.zzXpZ;
                if (zzye57 != null) {
                    zzye57.zzXpJ = zzzox.readByte() == 1;
                    return true;
                }
                return true;
            case 2136:
                this.zzZF0.zzQ(170, zzn6(zzzox.readByte() & 255));
                return true;
            case 2141:
                this.zzZF0.zzQ(StyleIdentifier.SUBTLE_EMPHASIS, zzn6(zzzox.readByte() & 255));
                return true;
            case 2152:
                this.zzZF0.zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_1, zzn6(zzzox.readByte() & 255));
                return true;
            case 2165:
                this.zzZF0.zzQ(440, zzn6(zzzox.readByte() & 255));
                return true;
            case 2178:
                this.zzZF0.zzQ(StyleIdentifier.PLAIN_TABLE_2, zzn6(zzzox.readByte() & 255));
                return true;
            case 10329:
                this.zzZF0.zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_5, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 10351:
                int i4 = zzzox.readByte() & 255;
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 255) {
                    this.zzZF0.zzQ(400, Integer.valueOf(i4));
                }
                return true;
            case 10361:
                this.zzZF0.zzQ(45, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 10764:
                this.zzZF0.zzQ(20, zzY0E.zzhL(zzzox.readByte() & 255));
                return true;
            case 10804:
                this.zzZF0.zzQ(770, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 10814:
                this.zzZF0.zzQ(140, Integer.valueOf(zzn5(zzzox.readByte() & 255)));
                return true;
            case 10818:
                this.zzZF0.zzQ(160, zzY0E.zzhL(zzzox.readByte() & 255));
                return true;
            case 10824:
                this.zzZF0.zzQ(210, Integer.valueOf(zzzox.readByte() & 255));
                return true;
            case 10835:
                this.zzZF0.zzQ(300, zzn6(zzzox.readByte() & 255));
                return true;
            case 10883:
                zzzox.readByte();
                return true;
            case 10886:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 10896:
            case 18439:
            case 19040:
            case 51810:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 18436:
                zzX(((zzYEF) this.zzZF0).getInsertRevision());
                return true;
            case 18501:
                this.zzZF0.zzQ(200, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 18507:
                this.zzZF0.zzQ(220, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 18510:
                this.zzZF0.zzQ(460, Integer.valueOf(zzzox.readByte() & 255));
                this.zzZF0.zzQ(470, Integer.valueOf(this.zzW6.readByte() & 255));
                return true;
            case 18514:
                this.zzZF0.zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_2, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 18527:
                this.zzZF0.zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 18531:
                zzX(((zzYEF) this.zzZF0).getDeleteRevision());
                return true;
            case 18534:
                zzpO(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
                return true;
            case 18535:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 18541:
                int iZzX9 = zzzox.zzX9() & 65535;
                if (iZzX9 != 1024) {
                    this.zzZF0.zzQ(380, Integer.valueOf(iZzX9));
                }
                return true;
            case 18542:
                int iZzX92 = zzzox.zzX9() & 65535;
                if (iZzX92 != 1024) {
                    this.zzZF0.zzQ(390, Integer.valueOf(iZzX92));
                }
                return true;
            case 18547:
                this.zzZF0.zzQ(380, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 18548:
                this.zzZF0.zzQ(390, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 18568:
                this.zzZF0.zzQ(490, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 18992:
                this.zzZF0.zzZX(zzXpY);
                this.zzZF0.zzQ(50, Integer.valueOf(this.zzW6.zzXa()));
                return true;
            case 19005:
                short sZzXa2 = zzzox.zzXa();
                zzVP(230, sZzXa2);
                zzVP(270, sZzXa2);
                zzVP(235, sZzXa2);
                zzVP(240, sZzXa2);
                return true;
            case 19009:
                int iZzX93 = zzzox.zzX9() & 65535;
                this.zzZF0.zzQ(380, Integer.valueOf(iZzX93));
                this.zzZF0.zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(iZzX93));
                this.zzZF0.zzQ(390, Integer.valueOf(iZzX93));
                return true;
            case 19011:
            case 51785:
                this.zzZF0.zzQ(190, Integer.valueOf(zzzox.zzX9() & 65535));
                return true;
            case 19023:
                zzVP(230, zzzox.zzXa());
                return true;
            case 19024:
                zzVP(235, zzzox.zzXa());
                return true;
            case 19025:
                zzVP(240, zzzox.zzXa());
                return true;
            case 26629:
                zzW(((zzYEF) this.zzZF0).getInsertRevision());
                return true;
            case 26638:
                zzYE5 zzye58 = this.zzXpZ;
                if (zzye58 != null) {
                    zzye58.zzdZ = zzzox.zzXc();
                }
                return true;
            case 26645:
                this.zzZF0.zzQ(30, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 26646:
                this.zzZF0.zzQ(40, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 26647:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 26724:
                zzW(((zzYEF) this.zzZF0).getDeleteRevision());
                return true;
            case 26725:
                zzWj(StyleIdentifier.LIST_TABLE_4_ACCENT_5, 2);
                return true;
            case 26736:
                this.zzZF0.zzQ(160, zzY0E.zzhI(zzzox.zzXc()));
                return true;
            case 26743:
                this.zzZF0.zzQ(450, zzY0E.zzhI(zzzox.zzXc()));
                return true;
            case 26759:
                this.zzZF0.zzQ(480, Integer.valueOf(zzzox.zzXc()));
                return true;
            case 34880:
                this.zzZF0.zzQ(150, Integer.valueOf(zzzox.zzXa()));
                return true;
            case 51226:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 51783:
            case 51788:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 51799:
                zzT("Text formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                return true;
            case 51825:
                zzpN(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
                return true;
            case 51826:
                zzWj(StyleIdentifier.LIST_TABLE_4_ACCENT_5, 3);
                return true;
            case 51830:
                int iZzXc = zzzox.zzXc();
                int iZzXc2 = zzzox.zzXc();
                if (iZzXc > 0) {
                    this.zzZF0.zzQ(880, new zzZNW(iZzXc, iZzXc2));
                }
                return true;
            case 51832:
                zz9(zzzox);
                return true;
            case 51845:
                zzZ(this, zzzox, i3, 0);
                return true;
            case 51849:
                zzV(new zzYEF());
                return true;
            default:
                zzY("Unknown formatting modifier 0x{0:x4} occurred while reading DOC file.", Integer.valueOf(i));
                return false;
        }
    }
}
