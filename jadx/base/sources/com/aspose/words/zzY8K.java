package com.aspose.words;

import com.google.common.primitives.Shorts;
import java.io.EOFException;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8K {
    static boolean zzZD5 = false;
    private com.aspose.words.internal.zzZOX zzW6;
    private zzY6F zzXH1;
    private zzY0M zzXXe;
    private StyleCollection zzYSm;
    private zzYEC zzYUx;
    private zzZZB zzYbA;
    private zzYMV zzYbB;
    private zzYMT zzX9c = new zzYMT();
    private zzYE5 zzX9b = new zzYE5();

    public zzY8K(zzZZB zzzzb, StyleCollection styleCollection) throws Exception {
        this.zzYbA = zzzzb;
        this.zzYSm = styleCollection;
        this.zzYbB = new zzYMV(zzzzb);
        this.zzYUx = new zzYEC(zzzzb);
        this.zzXH1 = new zzY6F(zzzzb);
        this.zzXXe = new zzY0M(styleCollection.getDocument());
    }

    private boolean zzE(int i, int i2, boolean z) throws Exception {
        boolean z2;
        int iZzX9 = this.zzW6.zzX9() & 65535;
        if (iZzX9 == 0) {
            if (i == 0) {
                this.zzYSm.zzZ(Style.zzX(1, 0, 0, "Normal"), (String[]) null);
            }
            return true;
        }
        int position = (int) this.zzW6.zzq().getPosition();
        Style styleZzkB = zzkB(i);
        if (styleZzkB == null) {
            return false;
        }
        if (styleZzkB.getStyleIdentifier() == 0 && zzZRA.zzDL(this.zzYbA.zzYUr)) {
            zzYMX zzymxZzZYj = styleZzkB.zzZYj();
            Boolean bool = Boolean.FALSE;
            zzymxZzZYj.zzQ(EditingLanguage.TURKMEN, bool);
            styleZzkB.zzZYj().zzQ(1240, bool);
            styleZzkB.zzZYj().zzQ(1250, bool);
            styleZzkB.zzZYj().zzQ(1270, bool);
            styleZzkB.zzZYj().zzQ(1510, 2);
        }
        if (i2 > 10) {
            short sZzX9 = this.zzW6.zzX9();
            styleZzkB.zzl3(sZzX9 & 4095);
            if (styleZzkB.zzY3t() == 0) {
                styleZzkB.zzl3(StyleIdentifier.NIL);
            }
            z2 = (sZzX9 & 4096) != 0;
            styleZzkB.zzl2(this.zzW6.zzXc());
            styleZzkB.setPriority(((65535 & this.zzW6.zzX9()) >> 4) & 4095);
        } else {
            z2 = false;
        }
        this.zzW6.zzq().zzH(i2 + position);
        zzQ(this.zzW6.zzq(), position);
        String strZzZ = zzZZR.zzZ(this.zzW6, z, true);
        int position2 = ((int) this.zzW6.zzq().getPosition()) - position;
        if (position2 > iZzX9) {
            this.zzW6.zzq().zzH(iZzX9 + position);
            zzQ(this.zzW6.zzq(), position);
            return false;
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(strZzZ, ',');
        styleZzkB.zzB0(strArrZzR[0]);
        if (position2 < iZzX9) {
            zzU(styleZzkB, position, iZzX9 - position2);
            styleZzkB.zzZYh().remove(10010);
            styleZzkB.zzZYj().remove(10010);
            zzQ(this.zzW6.zzq(), position);
            if ((position + iZzX9) - ((int) this.zzW6.zzq().getPosition()) > 0) {
                if (z2) {
                    zzX(styleZzkB, position);
                } else {
                    zzTG(com.aspose.words.internal.zzZKN.format("Invalid extra data in style '{0}', ignored.", styleZzkB.getName()));
                }
            }
        }
        this.zzW6.zzq().zzH(iZzX9 + position);
        zzQ(this.zzW6.zzq(), position);
        int length = strArrZzR.length - 1;
        String[] strArr = new String[length];
        com.aspose.words.internal.zzZKV.zzZ(strArrZzR, 1, strArr, 0, length);
        if (styleZzkB.getStyleIdentifier() == 0 && styleZzkB.zzY3v() != 12287) {
            zzTG("Normal style is based on other style which is not allowed, corrected.");
            styleZzkB.zzl5(StyleIdentifier.NIL);
        }
        this.zzYSm.zzZ(styleZzkB, strArr);
        this.zzXXe.zz4(styleZzkB);
        return true;
    }

    private static void zzQ(com.aspose.words.internal.zzZOP zzzop, int i) throws Exception {
        if (com.aspose.words.internal.zzAN.zzZP(((int) zzzop.getPosition()) - i)) {
            long position = ((int) zzzop.getPosition()) + 1;
            if (zzzop.getLength() < position) {
                zzzop.setLength(position);
            }
            zzzop.zzH(position);
        }
    }

    private void zzTG(String str) {
        IWarningCallback iWarningCallback = this.zzYbA.zzYUo;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 16777216, 10, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzU(Style style, int i, int i2) throws Exception {
        com.aspose.words.internal.zzZKN.format("\nReading '{1}', {0}.", Integer.valueOf(style.getType()), style.getName());
        int position = (int) this.zzW6.zzq().getPosition();
        int type = style.getType();
        boolean zZzq = true;
        if (type != 1) {
            if (type != 2) {
                if (type == 3) {
                    TableStyle tableStyle = (TableStyle) style;
                    zzQ(this.zzW6.zzq(), i);
                    zzW(tableStyle);
                    long j = position;
                    long j2 = i2;
                    if (this.zzW6.zzq().getPosition() - j < j2) {
                        zzQ(this.zzW6.zzq(), i);
                        zzU(tableStyle);
                        if (this.zzW6.zzq().getPosition() - j < j2) {
                            zzQ(this.zzW6.zzq(), i);
                            zzV(tableStyle);
                        } else {
                            zZzq = false;
                        }
                    }
                } else {
                    if (type != 4) {
                        throw new IllegalStateException("Unknown style type.");
                    }
                    zzQ(this.zzW6.zzq(), i);
                    zzE(style.zzZYj());
                }
            } else if (i2 >= 2) {
                zzQ(this.zzW6.zzq(), i);
                zzq(style.zzZYh());
            }
        } else if (i2 >= 6) {
            zzQ(this.zzW6.zzq(), i);
            zzE(style.zzZYj());
            if (this.zzW6.zzq().getPosition() - ((long) position) < i2) {
                zzQ(this.zzW6.zzq(), i);
                zZzq = zzq(style.zzZYh());
            }
        }
        if (zZzq) {
            return;
        }
        style.zzZYh().clear();
        style.zzZYj().clear();
        zzTG(com.aspose.words.internal.zzZKN.format("Style definition for Istd 0x{0:x2} is corrupt, ignored.", Integer.valueOf(style.zzZ7j())));
    }

    private void zzV(TableStyle tableStyle) throws Exception {
        this.zzYUx.zzY(zzXF.zzZ(this.zzW6, false).getData(), tableStyle);
    }

    private void zzW(TableStyle tableStyle) throws Exception {
        this.zzXH1.zzY(zzY78.zz6(this.zzW6).getData(), tableStyle);
    }

    private void zzX(Style style, int i) throws Exception {
        if (this.zzW6.zzXa() > 0) {
            this.zzW6.zzX9();
            com.aspose.words.internal.zzZQ9 zzzq9ZzM4 = zzKE.zzM4(this.zzW6.zzXc());
            String strZzpy = this.zzYbA.zzYUs.zzpy(this.zzW6.zzXa());
            if (style.getType() == 1) {
                zzQ(this.zzW6.zzq(), i);
                zzYMX zzymx = (zzYMX) style.zzZYj().zzbn();
                style.zzZYj().clear();
                zzE(style.zzZYj());
                style.zzZYj().zzZ(new zzZMK(zzymx, strZzpy, zzzq9ZzM4));
            }
            zzQ(this.zzW6.zzq(), i);
            zzYEF zzyef = (zzYEF) style.zzZYh().zzbn();
            style.zzZYh().clear();
            zzq(style.zzZYh());
            style.zzZYh().zzZ(new zzZMK(zzyef, strZzpy, zzzq9ZzM4));
        }
    }

    private void zzY2k() throws Exception {
        try {
            this.zzYUx.zzZ(this.zzW6.zzn(this.zzW6.zzXc()), this.zzYSm.zzY37(), this.zzX9b);
            this.zzYSm.zzY37().remove(190);
            this.zzYSm.zzY37().remove(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
            this.zzYbB.zzZ(this.zzW6.zzn(this.zzW6.zzXc()), new zzYMX(), this.zzX9c);
        } catch (EOFException unused) {
            this.zzYSm.zzY37().clear();
        }
    }

    private void zzY2l() {
        zzZ74 zzz74Zzy4;
        zzZ73 zzz73ZzYi5 = this.zzYSm.zzYi5();
        for (Style style : this.zzYSm) {
            if (style.getStyleIdentifier() != 65 && (zzz74Zzy4 = zzz73ZzYi5.zzy4(style.getStyleIdentifier())) != null) {
                style.setLocked(zzz74Zzy4.getLocked());
                style.isQuickStyle(zzz74Zzy4.zzYUl());
                style.setPriority(zzz74Zzy4.zzYUi());
                if (zzz74Zzy4.getUnhideWhenUsed()) {
                    style.setSemiHidden(false);
                    style.setUnhideWhenUsed(false);
                    zzz74Zzy4.zzYUj();
                    zzz74Zzy4.zzYUh();
                }
            }
        }
    }

    private Style zzkB(int i) throws Exception {
        short sZzX9 = this.zzW6.zzX9();
        int i2 = sZzX9 & 4095;
        boolean z = (sZzX9 & 8192) != 0;
        boolean z2 = (sZzX9 & Shorts.MAX_POWER_OF_TWO) != 0;
        short sZzX92 = this.zzW6.zzX9();
        int i3 = sZzX92 & 65535;
        int i4 = sZzX92 & 15;
        if (i4 <= 0 || i4 > 4) {
            zzTG(com.aspose.words.internal.zzZKN.format("Invalid style type value 0x{0:x2}, style is ignored.", Integer.valueOf(i4)));
            return null;
        }
        Style styleZzX = Style.zzX(i4, i, i2, null);
        styleZzX.zzl5(zzY0C.zzhE((i3 >> 4) & 4095));
        styleZzX.zzXab = z;
        styleZzX.zzXaa = z2;
        styleZzX.zzl4(zzY0C.zzhE(((this.zzW6.zzX9() & 65535) >> 4) & 4095));
        this.zzW6.zzX9();
        if (!zzZRA.zzDL(this.zzYbA.zzYUr)) {
            short sZzX93 = this.zzW6.zzX9();
            styleZzX.setAutomaticallyUpdate((sZzX93 & 1) != 0);
            styleZzX.setHidden((sZzX93 & 2) != 0);
            styleZzX.zzQf((sZzX93 & 12) != 0);
            styleZzX.zzQi((sZzX93 & 16) != 0);
            styleZzX.zzQh((sZzX93 & 32) != 0);
            styleZzX.zzQg((sZzX93 & 64) != 0);
            styleZzX.setSemiHidden((sZzX93 & 256) != 0);
            styleZzX.setLocked((sZzX93 & 512) != 0);
            styleZzX.zzXa9 = (sZzX93 & 1024) != 0;
            styleZzX.setUnhideWhenUsed((sZzX93 & 2048) != 0);
            styleZzX.isQuickStyle((sZzX93 & 4096) != 0);
        }
        return styleZzX;
    }

    private void zzkC(int i) throws Exception {
        this.zzW6.zzX9();
        zzZ73 zzz73ZzYi5 = this.zzYSm.zzYi5();
        for (int i2 = 0; i2 < i; i2++) {
            int iZzXc = this.zzW6.zzXc();
            zzZ74 zzz74 = new zzZ74(i2, (iZzXc & 1) != 0, (iZzXc & 8) != 0, (iZzXc & 2) != 0, (iZzXc >> 4) & 4095, (iZzXc & 4) != 0);
            if (!zzz73ZzYi5.zzY(zzz74)) {
                zzz73ZzYi5.zzX(zzz74);
            }
        }
    }

    private boolean zzq(zzYEF zzyef) throws Exception {
        return this.zzYUx.zzZ(zzXF.zzZ(this.zzW6, false).getData(), zzyef, this.zzX9b);
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRA zzzra) throws Exception {
        if (zzzra.zzYGE.zzXAE.zzYHJ == 0) {
            zzTG("Document contains empty stylesheet.");
            return;
        }
        this.zzW6 = zzzox;
        zzzox.zzq().zzH(zzzra.zzYGE.zzXAE.zzYHK);
        int iZzX9 = zzzox.zzX9() & 65535;
        long position = zzzox.zzq().getPosition();
        int iZzX92 = zzzox.zzX9() & 65535;
        int iZzX93 = zzzox.zzX9() & 65535;
        zzzox.zzX9();
        int iZzX94 = zzzox.zzX9() & 65535;
        if ((65535 & zzzox.zzX9()) != 15) {
            zzTG("Invalid fixed styles count, ignore whole stylesheet.");
            this.zzYSm.ensureMinimum();
            this.zzYSm.zzZ7(0, false).zzZYh().clear();
            return;
        }
        zzzox.zzX9();
        zzYEF zzyefZzY37 = this.zzYSm.zzY37();
        zzyefZzY37.setNameAscii(this.zzYbA.zzYUq.zzB6(zzzox.zzXa()));
        zzyefZzY37.setNameFarEast(this.zzYbA.zzYUq.zzB6(zzzox.zzXa()));
        zzyefZzY37.setNameOther(this.zzYbA.zzYUq.zzB6(zzzox.zzXa()));
        zzyefZzY37.setNameBi(zzYEF.zzYdw());
        long j = position + ((long) iZzX9);
        if (zzzox.zzq().getPosition() < j) {
            zzyefZzY37.setNameBi(this.zzYbA.zzYUq.zzB6(zzzox.zzXa()));
        }
        if (zzzox.zzq().getPosition() < j) {
            if (iZzX94 <= 156) {
                this.zzYSm.zzYi5().zzYU4();
            }
            zzkC(iZzX94);
        } else {
            this.zzYSm.zzYi5().zzYU3();
        }
        if (zzzox.zzq().getPosition() < j) {
            zzY2k();
        }
        zzzox.zzq().zzH(j);
        zzZ(zzzra, iZzX92, iZzX93);
        if (iZzX94 <= 156) {
            zzY2l();
        }
    }

    private void zzU(TableStyle tableStyle) throws Exception {
        this.zzYbB.zzZ(zzYNJ.zzY(this.zzW6, false, this.zzYbA.zzYUr).getData(), tableStyle);
    }

    private void zzZ(zzZRA zzzra, int i, int i2) throws Exception {
        boolean z = !zzZRA.zzDL(zzzra.zzYHB);
        zzZRG zzzrg = zzzra.zzYGE.zzXAE;
        int i3 = zzzrg.zzYHK + zzzrg.zzYHJ;
        for (int i4 = 0; i4 < i && this.zzW6.zzq().getPosition() < i3; i4++) {
            if (!zzE(i4, i2, z)) {
                zzTG(com.aspose.words.internal.zzZKN.format("Style definition for Istd 0x{0:x2} is corrupt, rest of stylesheet is ignored.", Integer.valueOf(i4)));
                return;
            }
        }
    }

    private void zzE(zzYMX zzymx) throws Exception {
        this.zzYbB.zzZ(zzYNJ.zzY(this.zzW6, false, this.zzYbA.zzYUr), zzymx, this.zzX9c);
    }
}
