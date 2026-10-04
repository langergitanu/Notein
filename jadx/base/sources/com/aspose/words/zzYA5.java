package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYA5 extends zzYA3 {
    private zzYA4 zzXbL;
    private ArrayList<zzYAU> zzXbM;
    private Paragraph zzYtC;

    public zzYA5(Node node) {
        super(0);
        this.zzYtC = (Paragraph) node;
    }

    private void zzQr(boolean z) {
        zzZ((short) 512, z);
    }

    private void zzQs(boolean z) throws Exception {
        if (zzY5l()) {
            zzZYV zzzyvZzZoS = zzab().zzZoS();
            for (zzYAU zzyau : this.zzXbM) {
                if (zzyau.zzY6W()) {
                    zzzyvZzZoS.zzL(zzyau);
                }
            }
        }
        if (z) {
            this.zzXbM = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzY(boolean z, Paragraph paragraph) throws Exception {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        String text;
        zzYAU zzyau;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        boolean z7 = z;
        Shape shapeZzQq = this.zzXbL.zzQq(z7);
        boolean z8 = true;
        int i5 = 0;
        if (shapeZzQq != null) {
            Shape shape = (Shape) shapeZzQq.deepClone(true);
            zzY9X zzy9x = new zzY9X(shape);
            zzy9x.zzY7v();
            zzy9x.zzY7q();
            zzX6 zzx6ZzZoP = zzY6N().zzZoP();
            zzZ6R zzz6rZza8 = zza8();
            zzYA4 zzya4 = this.zzXbL;
            zzy9x.zzU(zzZQ.zzZ(paragraph, zzx6ZzZoP, true, z7, zzz6rZza8, z7 ? zzya4.zzY5f() : zzya4.zzY5g(), 3, false, true, null, null));
            long size = shape.zzYzG().getSize();
            shape.setHeight(zzYLR.zzYc(zzy9x.zzY6N().zzZr().zzPg()));
            shape.setWidth((shape.getHeight() * ((double) Float.intBitsToFloat((int) size))) / ((double) com.aspose.words.internal.zzZPW.zzYz(size)));
            zzZ33 zzz33 = new zzZ33(zzab().zzZoP());
            if (zzz33.zzYLJ().getWrapType() != 0) {
                zzz33.zzW(null);
                zzz33.zzYLJ();
                zzz33.zzYLJ().setWrapType(0);
            }
            zzy9x.zzY(zzZ33.zzZ(zzz33));
            zzy9x.zzY6M().zzYLJ();
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzY9X>) this.zzXbM, zzy9x);
            return;
        }
        Paragraph paragraph2 = paragraph;
        String[] strArrZzQp = this.zzXbL.zzQp(z7);
        zzYMX zzymxZzZ = zzYMK.zzZ(paragraph2, zzab().zza8());
        zzYEF zzyefZzZ = zzZQ.zzZ(paragraph2, true, z7);
        boolean bidi = zzymxZzZ.getBidi();
        int localeIdBi = zzyefZzZ.getLocaleIdBi();
        int numeralFormat = zza8().getNumeralFormat();
        int length = strArrZzQp.length;
        int i6 = 0;
        while (i6 < length) {
            String str2 = strArrZzQp[i6];
            if (str2 != null) {
                if (zzab().zza8().zzYSN()) {
                    z3 = bidi;
                    i3 = localeIdBi;
                    i4 = numeralFormat;
                    text = str2;
                } else {
                    zzYBM zzybm = new zzYBM(str2, bidi, bidi, localeIdBi, numeralFormat);
                    i3 = localeIdBi;
                    i4 = numeralFormat;
                    z3 = bidi;
                    zzYBP.zzZ(zzybm);
                    text = zzybm.getText();
                }
                char cCharAt = text.charAt(i5);
                zzYAU zzy9s = cCharAt != '\t' ? cCharAt != 173 ? new zzY9S(text) : new zzY9V(9250) : new zzY9W(text.length());
                zzy9s.zzY7v();
                zzy9s.zzY7q();
                zzYAU zzyau2 = zzy9s;
                boolean zZz6 = com.aspose.words.internal.zzZVU.zz6(cCharAt);
                int iZzZ = zzZ(cCharAt, z3, zZz6, z7, paragraph2);
                if (!z3 || ((zzZ37) zzY6S().zzYTt()).getBaselineAlignment() == 0) {
                    zzyau = zzyau2;
                    z4 = i5;
                } else {
                    zzyau = zzyau2;
                    z4 = z8;
                }
                zzYA4 zzya42 = this.zzXbL;
                z2 = z3;
                zzYAU zzyau3 = zzyau;
                i2 = i6;
                String str3 = text;
                int iZzY5f = z7 ? zzya42.zzY5f() : zzya42.zzY5g();
                i = length;
                zzyau3.zzU(zzZQ.zzZ(paragraph2, zzY6N().zzZoP(), true, z7, zza8(), iZzY5f, iZzZ, zZz6, z4, null, str2));
                if (z4 == 0 || !com.aspose.words.internal.zzK5.zzZ(str3, zzyau3.zzY6N().zzYKN().zzPl())) {
                    z5 = false;
                    z6 = z4;
                } else {
                    z5 = true;
                    z6 = false;
                }
                if (com.aspose.words.internal.zzK5.zzZ(str3, zzyau3.zzY6N().zzZr().zzPl())) {
                    String strZzY = zzY(str3, zzyau3.zzY6N().zzZr().zzPl());
                    z5 |= strZzY != null;
                    str = strZzY;
                } else {
                    str = null;
                }
                if (z5) {
                    zzyau3.zzU(zzZQ.zzZ(paragraph, zzY6N().zzZoP(), true, z, zza8(), iZzY5f, iZzZ, zZz6, z6, str, str2));
                }
                com.aspose.words.internal.zzZQG.zzZ(this.zzXbM, zzyau3);
            } else {
                i = length;
                i2 = i6;
                z2 = bidi;
                i3 = localeIdBi;
                i4 = numeralFormat;
            }
            i6 = i2 + 1;
            z7 = z;
            paragraph2 = paragraph;
            length = i;
            localeIdBi = i3;
            numeralFormat = i4;
            bidi = z2;
            z8 = true;
            i5 = 0;
        }
    }

    private zzYAU zzY5i() {
        return (zzY5l() && zzY5j()) ? (zzYAU) ((zzYAU) C21505OooO0Oo.OooO00o(1, this.zzXbM)).zzYo1() : (zzYAU) zzYo1();
    }

    private boolean zzY5j() {
        if (!zzY5l()) {
            return false;
        }
        Iterator<zzYAU> it = this.zzXbM.iterator();
        while (it.hasNext()) {
            if (!it.next().zzY6X()) {
                return false;
            }
        }
        return true;
    }

    private zzYAU zzY5k() throws Exception {
        zzYAU zzyauZzZ9s = zzY6S().zzZ9s();
        zzyauZzZ9s.zza7();
        boolean z = false;
        while (true) {
            if (zzyauZzZ9s.zzZo6() != 21779 && zzyauZzZ9s.zzZo6() != 21788 && !(zzyauZzZ9s instanceof zzYAT) && !(zzyauZzZ9s instanceof zzY9Y) && ((z || !(zzyauZzZ9s instanceof zzYAH)) && ((!z || !(zzyauZzZ9s instanceof zzYA5)) && zzyauZzZ9s != this && !zzZj(zzyauZzZ9s) && !zzyauZzZ9s.zzY7a()))) {
                zzyauZzZ9s.zzY6S();
                zzY6S();
                return zzyauZzZ9s;
            }
            z |= zzyauZzZ9s == this;
            zzyauZzZ9s = (zzYAU) zzyauZzZ9s.zzYo1();
        }
    }

    private boolean zzY5l() {
        return this.zzXbM != null;
    }

    private void zzYi(Paragraph paragraph) throws Exception {
        zzYAU zzy9w;
        if (zzaa().getStoryType() == 4) {
            return;
        }
        if (this.zzXbL.getTrailingCharacter() == 0) {
            zzy9w = new zzY9U();
        } else if (this.zzXbL.getTrailingCharacter() != 1) {
            return;
        } else {
            zzy9w = new zzY9W(1);
        }
        zzy9w.zzY7v();
        zzy9w.zzY7q();
        zzy9w.zzU(zzZQ.zzZ(paragraph, zzY6N().zzZoP(), false, zzZ0M(), zza8(), this.zzXbL.zzY5e(), 0, false, true, null, null));
        zzZ(paragraph, zzy9w);
        zzZi(zzy9w);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXbM, zzy9w);
    }

    private void zzYj(Paragraph paragraph) throws Exception {
        if (this.zzXbM != null) {
            return;
        }
        this.zzXbM = new ArrayList<>();
        if (this.zzXbL.zzY5g() != 0) {
            zzY(false, paragraph);
        }
        if (this.zzXbL.zzY5f() != 0) {
            zzY(true, paragraph);
        }
        if (this.zzXbL.zzY5e() != 0) {
            zzYi(paragraph);
        }
    }

    private void zzZ(Paragraph paragraph, zzYAU zzyau) throws Exception {
        com.aspose.words.internal.zzPV zzpvZzYKP = zzZQ.zzZ(paragraph, zzY6N().zzZoP(), true, zzZ0M(), zza8(), this.zzXbL.zzY5e(), 0, false, true, null, null).zzYKP();
        if (com.aspose.words.internal.zzPV.zzZ(zzyau.zzY6N().zzYKP(), zzpvZzYKP)) {
            return;
        }
        zzZ32 zzz32ZzX = zzZ32.zzX(zzyau.zzY6N());
        zzz32ZzX.zzZV(zzpvZzYKP);
        zzyau.zzU(zzZ32.zzW(zzz32ZzX));
    }

    private boolean zzZ0M() {
        return !zza8().zzYSR().zzYkW();
    }

    private void zzZh(zzYAU zzyau) throws Exception {
        if (zzY6W()) {
            zzZYV zzzyvZzZoS = zzab().zzZoS();
            for (zzYAU zzyau2 : this.zzXbM) {
                zzzyvZzZoS.zzZ(zzaa(), zzyau, zzyau2);
                zzyau = zzyau2;
            }
            zzzyvZzZoS.commit();
        }
    }

    private void zzZi(zzYAU zzyau) throws Exception {
        Paragraph paragraph = this.zzYtC;
        if (paragraph == null || paragraph.hasRevisions()) {
            return;
        }
        boolean z = false;
        zzYAU zzyau2 = this.zzXbM.size() > 0 ? this.zzXbM.get(0) : null;
        zzYAU zzyauZzY5k = zzY5k();
        if (zzyau2 == null && zzyauZzY5k == null) {
            return;
        }
        zzZ32 zzz32ZzX = zzZ32.zzX(zzyau.zzY6N());
        zzZ32 zzz32ZzY6N = zzyau2 == null ? zzyauZzY5k.zzY6N() : zzyau2.zzY6N();
        zzZ32 zzz32ZzY6N2 = zzyauZzY5k == null ? zzyau2.zzY6N() : zzyauZzY5k.zzY6N();
        boolean z2 = (zzz32ZzY6N.zzYKW() == 0 || zzz32ZzY6N2.zzYKW() == 0) ? false : true;
        if (z2) {
            zzz32ZzX.zzvu(zzz32ZzY6N.zzYKW());
        }
        if (zzz32ZzY6N.getUnderline() != 0 && zzz32ZzY6N2.getUnderline() != 0 && zza7().getUnderlineTabInNumList()) {
            z = true;
        }
        if (z) {
            zzz32ZzX.setUnderline(zzz32ZzY6N.getUnderline());
            zzz32ZzX.zzZW(com.aspose.words.internal.zzPV.zzZ(zzz32ZzY6N.zzZUc(), com.aspose.words.internal.zzPV.zzHZ) ? zzz32ZzY6N2.zzZUc() : zzz32ZzY6N.zzZUc());
        }
        if (z2 || z) {
            zzyau.zzU(zzZ32.zzW(zzz32ZzX));
        }
    }

    private void zzlE(int i) {
        Iterator<zzYAU> it = this.zzXbM.iterator();
        while (it.hasNext()) {
            it.next().zzlT(i);
        }
    }

    @Override // com.aspose.words.zzYMD
    public final void zzP(zzTF zztf) throws Exception {
        zzQs(true);
        zzQr(false);
        super.zzP(zztf);
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYA5 zzya5 = new zzYA5(this.zzYtC);
        zzZB(zzya5);
        return zzya5;
    }

    @Override // com.aspose.words.zzYAU
    public final void zzY7p() throws Exception {
        boolean zZzYkW;
        if (zzE((short) 512)) {
            return;
        }
        if (zzY9B.zzC(zzY5k(), this)) {
            zzQs(true);
            return;
        }
        zzY6S();
        Paragraph paragraphZzY67 = ((zzYAS) zzY6S().zzZ9r()).zzY67();
        if (paragraphZzY67 != this.zzYtC && (((zZzYkW = zza8().zzYSR().zzYkW()) || !this.zzYtC.isDeleteRevision()) && (!zZzYkW || !this.zzYtC.isInsertRevision()))) {
            paragraphZzY67 = this.zzYtC;
        }
        this.zzXbL = new zzYA4(paragraphZzY67, !zza8().zzYSR().zzYkW(), !zza8().zzYSR().zzYkX());
        zzYAU zzyauZzY5k = zzY5k();
        if (zzY5l() && zzY5j() && zzyauZzY5k != zzY5i()) {
            zzQs(false);
        }
        if (this.zzXbL.zzY5g() != 0 || this.zzXbL.zzY5f() != 0 || this.zzXbL.zzY5e() != 0) {
            if (!zzY5l()) {
                zzYj(paragraphZzY67);
            }
            if (!zzY5j()) {
                zzlE(zzyauZzY5k.zzYTl());
                zzZh((zzYAU) zzyauZzY5k.zzYo0());
            }
        }
        zzQr(true);
        this.zzXbL = null;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYol() {
        return true;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        return 1;
    }

    public final boolean zzZj(zzYAU zzyau) {
        ArrayList<zzYAU> arrayList = this.zzXbM;
        return arrayList != null && arrayList.contains(zzyau);
    }

    private static int zzZ(char c, boolean z, boolean z2, boolean z3, Paragraph paragraph) {
        if (paragraph != null) {
            paragraph.getListLabel();
        }
        ListLevel listLevelZzRB = paragraph.zzRB(z3);
        if (listLevelZzRB == null) {
            return 3;
        }
        int iZzYOd = listLevelZzRB.zzYOd();
        if (iZzYOd == 1) {
            return iZzYOd;
        }
        if (z && !z2 && (iZzYOd == 2 || !Character.isDigit(c))) {
            return 2;
        }
        if (paragraph.getListLabel().zzR2()) {
            return zzY0C.zzzG(c);
        }
        return 3;
    }

    private String zzY(String str, com.aspose.words.internal.zzZXH zzzxh) {
        com.aspose.words.internal.zzZXH zzzxhZzZ = zzab().zzZqy().zzZ(zzzxh, com.aspose.words.internal.zzZVS.zzA(str, 0), true);
        if (zzzxhZzZ != null) {
            return zzzxhZzZ.zzPh();
        }
        return null;
    }
}
