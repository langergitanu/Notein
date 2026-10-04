package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzYME {
    static boolean zzZD5 = false;
    private int zzXFF;
    private int zzXFG;
    private zzVG zzXFH;
    private int zzXFI;
    private int zzXFJ;
    private zzZLF zzXFK;
    private zzY8C zzXFL;
    private zzYVP zzXFM;
    private zzYVP zzXFN;
    private zzUL zzXFO;
    private zzUJ zzXFP;
    private zzYAZ zzXFQ;
    private zzYAY zzXFR;
    private zzZV6 zzXFS;
    private zzZV3 zzXFT;
    private zzYB zzXFU;
    private zzY5 zzXFV;
    private zzY6K zzXFW;
    private zzVC zzXFX;
    private zzZZC zzXFY;
    private int zzYzl;

    public zzYME(zzZZC zzzzc) {
        this(zzzzc, 0);
    }

    private void zzM(zzYMX zzymx) throws Exception {
        boolean z;
        int i;
        zzYEF zzyef;
        zzYME zzyme;
        this.zzXFY.zzZrD().zzYWL();
        int iZz0R = this.zzXFX.zz0R();
        int i2 = 0;
        boolean z2 = false;
        zzYEF zzyef2 = null;
        while (i2 < this.zzXFX.getCount()) {
            zzVG zzvgZzNl = this.zzXFX.zzNl(i2);
            int i3 = 0;
            boolean z3 = z2;
            while (true) {
                if (i3 < zzvgZzNl.zzr5().length) {
                    int iZzNm = zzvgZzNl.zzNm(i3);
                    Ref<zzYEF> ref = new Ref<>(zzyef2);
                    Ref<zzYE5> ref2 = new Ref<>(null);
                    int iZzZ = this.zzXFY.zzZ(iZzNm, zzvgZzNl.zz16().zzZYE().zzZYF(), ref, ref2);
                    zzYEF zzyef3 = ref.get();
                    zzYE5 zzye5 = ref2.get();
                    if (iZzZ == iZzNm) {
                        zzyef2 = zzyef3;
                        break;
                    }
                    int i4 = iZzZ - iZzNm;
                    if (i4 < (zzvgZzNl.isUnicode() ? 2 : 1)) {
                        i4 = zzvgZzNl.isUnicode() ? 2 : 1;
                        z3 = true;
                    }
                    int i5 = i4 >> (zzvgZzNl.isUnicode() ? 1 : 0);
                    int length = zzvgZzNl.zzr5().length - i3;
                    if (i5 > length) {
                        i5 = length;
                    }
                    if (iZz0R == i5) {
                        z = true;
                        zzyef = zzyef3;
                        zzyme = this;
                        i = i5;
                    } else {
                        z = false;
                        i = i5;
                        zzyef = zzyef3;
                        zzyme = this;
                    }
                    zzyme.zzZ(zzyef, zzye5, zzvgZzNl, i3, i, z);
                    i3 += i;
                    iZz0R -= i;
                    zzyef2 = zzyef;
                    z3 = z3;
                }
            }
            i2++;
            z2 = z3;
        }
        if (z2) {
            zzTG(com.aspose.words.internal.zzZKN.format("File is corrupted, data loss at FC: 0x{0:x4}.", Integer.valueOf(this.zzXFX.zzNl(0).zzNm(0))));
        }
        this.zzXFY.zzZrD().zzY(zzymx, zzyef2);
    }

    private boolean zzN(char c, int i) {
        if (c != '\b') {
            return false;
        }
        int i2 = this.zzYzl;
        return (i2 == 0 || i2 == 2) && this.zzXFY.zzGf(i2).zzBX(this.zzXFY.zzZrw().zzDM(i)) != null;
    }

    private void zzT(int i, String str) throws Exception {
        this.zzXFY.zzZrD().zzT(i, str);
    }

    private void zzTG(String str) throws Exception {
        zzT(16777216, str);
    }

    private void zzV(String str, zzYEF zzyef) throws Exception {
        this.zzXFY.zzZrD().zzY(str, zzyef);
    }

    private void zzW(zzYEF zzyef, int i) throws Exception {
        zzYOC zzyocZzGh = this.zzXFY.zzGh(i);
        if (zzyocZzGh == null) {
            return;
        }
        Shape shape = new Shape(this.zzXFY.getDocument());
        shape.setShapeType(-2);
        shape.zzZ(zzyef);
        shape.setWrapType(0);
        com.aspose.words.internal.zzZOR zzzorZzYru = zzyocZzGh.zzYru();
        if (zzzorZzYru != null) {
            int length = (int) (zzzorZzYru.getLength() - 8);
            byte[] bArr = new byte[length];
            zzzorZzYru.zzH(0L);
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzorZzYru);
            zzzox.zzX9();
            int iZzX9 = zzzox.zzX9() & 65535;
            int iZzX92 = 65535 & zzzox.zzX9();
            zzzox.zzX9();
            zzzorZzYru.read(bArr, 0, length);
            shape.getImageData().zzY7(com.aspose.words.internal.zzEF.zzZ(bArr, com.aspose.words.internal.zzEG.zzX((int) ((((double) iZzX9) / 2540.0d) * 1963.0d), (int) ((((double) iZzX92) / 2540.0d) * 1963.0d), 1963.0d)));
        } else {
            zzTG("OLE 1.0 object stream 'META' is missing, possible image size problem.");
        }
        com.aspose.words.internal.zzZOR zzzorZzYrt = zzyocZzGh.zzYrt();
        if (zzzorZzYrt != null) {
            com.aspose.words.internal.zzZOX zzzox2 = new com.aspose.words.internal.zzZOX(zzzorZzYrt);
            zzzorZzYrt.zzH(12L);
            zzzox2.zzX9();
            zzzox2.zzX9();
            zzzox2.zzX9();
            zzzox2.zzX9();
            int iZzXc = zzzox2.zzXc();
            int iZzXc2 = zzzox2.zzXc();
            zzzorZzYrt.zzH(44L);
            int iZzXc3 = zzzox2.zzXc();
            int iZzXc4 = zzzox2.zzXc();
            zzzox2.zzXc();
            zzzox2.zzXc();
            zzzox2.zzXc();
            zzzox2.zzXc();
            shape.zzWf(((((double) iZzXc) / 20.0d) * ((double) iZzXc3)) / 1000.0d);
            shape.zzWe(((((double) iZzXc2) / 20.0d) * ((double) iZzXc4)) / 1000.0d);
        }
        this.zzXFY.zzZrD().zza(shape);
    }

    private void zzX(zzYEF zzyef, int i) throws Exception {
        int iZzZe6 = this.zzXFY.zzZrD().zzZe6();
        if (zzZOO.zzCJ(iZzZe6)) {
            this.zzXFY.zzZrx().zzq().zzH(i);
            zzZMM zzzmmZzO = zzZRB.zzO(this.zzXFY.zzZrx(), this.zzXFY.zzZrw().zzYHB);
            if (zzzmmZzO != null) {
                this.zzXFY.zzZrD().zzZ(zzzmmZzO, zzyef);
            }
        }
        if (zzZOO.zzCs(iZzZe6)) {
            com.aspose.words.internal.zzZOX zzzoxZzZrx = this.zzXFY.zzZrx();
            zzzoxZzZrx.zzq().zzH(i);
            int iZzXc = zzzoxZzZrx.zzXc();
            short sZzXa = zzzoxZzZrx.zzXa();
            zzzoxZzZrx.zzn(62);
            this.zzXFY.zzZrD().zzY8(zzzoxZzZrx.zzn(iZzXc - sZzXa));
        }
    }

    private boolean zzY(zzVG zzvg, int i) {
        if (zzvg != this.zzXFH) {
            this.zzXFH = zzvg;
            com.aspose.words.internal.zz0R zz0rZzTf = this.zzXFY.zzZrn().zzTf(zzvg.zzNn(i + 1));
            this.zzXFJ = !zz0rZzTf.zzYC() ? zz0rZzTf.getPosition() - zzvg.zzNn(1) : -1;
        }
        if (i != this.zzXFJ) {
            return false;
        }
        this.zzXFH = null;
        return true;
    }

    private static boolean zzY4(char c) {
        return c == '\f' || c == 7 || c == '\r';
    }

    private void zzZ(int i, int i2, zzZ82 zzz82) throws Exception {
        char[] cArrZzqk;
        int iZzXL = this.zzXFY.zzZrw().zzXL(this.zzYzl, i);
        zzqj(iZzXL);
        int iZzMT = this.zzXFY.zzZrv().zzMT(iZzXL);
        if (iZzMT == -1) {
            zzT(1, "Cannot find a piece for the position, continue.");
            return;
        }
        int start = iZzXL - this.zzXFY.zzZrv().zzMS(iZzMT).zzZYG().getStart();
        while (i2 > 0 && iZzMT < this.zzXFY.zzZrv().getCount()) {
            zzTZ zztzZzMS = this.zzXFY.zzZrv().zzMS(iZzMT);
            int i3 = zztzZzMS.zzZtf;
            int length = zztzZzMS.zzZYG().getLength();
            if (start > 0) {
                i3 += (zztzZzMS.zzZte ? 2 : 1) * start;
                length -= start;
            }
            this.zzXFY.zzZrz().zzq().zzH(i3);
            if (length > i2) {
                length = i2;
            }
            if (this.zzXFY.zzZrw().zzZgX()) {
                cArrZzqk = zzqk(length);
            } else {
                boolean z = zztzZzMS.zzZte;
                cArrZzqk = (z ? zzZZ7.zzWB(true) : this.zzXFY.zzZrh()).zzYO(this.zzXFY.zzZrz().zzn((z ? 2 : 1) * length));
            }
            zzZ(new zzVG(cArrZzqk, new zzTY(zztzZzMS, start), i3), zzz82);
            i2 -= length;
            iZzMT++;
            start = 0;
        }
        if (this.zzXFX.getCount() > 0) {
            zzZ(this.zzXFX.zzNl(0), 0, new zzYMW(new zzYMX(), new zzYMT(), new zzY6G()));
        }
    }

    private void zzZ8(ShapeBase shapeBase) throws Exception {
        if (shapeBase.isGroup()) {
            for (Node firstChild = ((GroupShape) shapeBase).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                zzZ8((ShapeBase) firstChild);
            }
            return;
        }
        zzZO1 zzzo1ZzBW = this.zzXFY.zzGf(this.zzYzl).zzBW(shapeBase.getId());
        if (zzzo1ZzBW == null || zzzo1ZzBW.getLength() <= 0) {
            return;
        }
        this.zzXFY.zzZrD().zzt((Shape) shapeBase);
        new zzYME(this.zzXFY, zzZZ5.zzGd(this.zzYzl)).zzZ(zzzo1ZzBW.getStart(), zzzo1ZzBW.getLength(), (zzZ82) null);
        this.zzXFY.zzZrD().zzYWK();
    }

    private boolean zzZ9(ShapeBase shapeBase) {
        if (shapeBase == null) {
            return false;
        }
        if (!shapeBase.zzZtk()) {
            return shapeBase.getParentNode() != null;
        }
        ListCollection lists = this.zzXFY.getDocument().getLists();
        for (int i = 0; i < lists.zzYP0(); i++) {
            if (com.aspose.words.internal.zzZKO.zzA(shapeBase, lists.zzxn(i))) {
                return true;
            }
        }
        return false;
    }

    private void zzZa(ShapeBase shapeBase) {
        if (this.zzXFY.zzZrC()) {
            shapeBase.zzQT(true);
        } else if (shapeBase.zzZtk()) {
            shapeBase.zzQT(false);
        }
    }

    private void zzqi(int i) {
        int iZzDM;
        int i2 = this.zzYzl;
        if (i2 == 0 || i2 == 2) {
            int i3 = this.zzXFF;
            if (i3 < 0 || i3 < i) {
                zzZO4 zzzo4ZzGf = this.zzXFY.zzGf(i2);
                try {
                    iZzDM = this.zzXFY.zzZrw().zzDM(i);
                } catch (Exception unused) {
                    iZzDM = Integer.MAX_VALUE;
                }
                this.zzXFF = this.zzXFY.zzZrw().zzXL(this.zzYzl, zzzo4ZzGf.zzZ9N().zzTf(iZzDM).getPosition());
            }
        }
    }

    private void zzqj(int i) {
        zzZOI zzzoiZzZrs = this.zzXFY.zzZrs();
        this.zzXFV.zzZ(this.zzXFY, zzzoiZzZrs.zzZap(), i);
        this.zzXFU.zzZ(this.zzXFY, zzzoiZzZrs.zzZao(), i);
        zzZOG zzzogZzZrr = this.zzXFY.zzZrr();
        this.zzXFT.zzZ(this.zzXFY, zzzogZzZrr.zzZap(), i);
        this.zzXFS.zzZ(this.zzXFY, zzzogZzZrr.zzZao(), i);
        zzZO3 zzzo3ZzZrk = this.zzXFY.zzZrk();
        this.zzXFR.zzZ(this.zzXFY, zzzo3ZzZrk.zzZ9H(), i);
        this.zzXFQ.zzZ(this.zzXFY, zzzo3ZzZrk.zzZ9G(), i);
        zzZOH zzzohZzZro = this.zzXFY.zzZro();
        this.zzXFP.zzZ(this.zzXFY, zzzohZzZro.zzZah(), i);
        this.zzXFO.zzZ(this.zzXFY, zzzohZzZro.zzZag(), i);
        zzZO8 zzzo8ZzZrq = this.zzXFY.zzZrq();
        zzZO8 zzzo8ZzZrp = this.zzXFY.zzZrp();
        this.zzXFN.zzZ(this.zzXFY, zzzo8ZzZrq.zzZ9Q(), i);
        this.zzXFM.zzZ(this.zzXFY, zzzo8ZzZrp.zzZ9Q(), i);
        zzY8C zzy8c = this.zzXFL;
        zzZZC zzzzc = this.zzXFY;
        zzy8c.zzZ(zzzzc, zzzzc.zzZrj().zzZ9F(), 0);
        zzZLF zzzlf = this.zzXFK;
        zzZZC zzzzc2 = this.zzXFY;
        zzzlf.zzZ(zzzzc2, zzzzc2.zzZri().zzYzv, i);
    }

    private char[] zzqk(int i) throws Exception {
        byte[] bArrZzn = this.zzXFY.zzZrz().zzn(i * 2);
        for (int i2 = 0; i2 < bArrZzn.length; i2 += 2) {
            byte b = bArrZzn[i2];
            int i3 = i2 + 1;
            bArrZzn[i2] = bArrZzn[i3];
            bArrZzn[i3] = b;
        }
        char[] cArrZzYO = com.aspose.words.internal.zzZO0.zzQz(932).zzYO(bArrZzn);
        StringBuilder sb = new StringBuilder(cArrZzYO.length);
        for (char c : cArrZzYO) {
            if (c != 0) {
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }

    private void zzql(int i) throws Exception {
        zzYBC zzybcZzC1 = this.zzXFY.zzZrt().zzC1(i);
        if (zzybcZzC1 != null && zzybcZzC1.getLength() > 0) {
            zzYME zzyme = new zzYME(this.zzXFY, 2);
            this.zzXFY.zzZrD().zzyr(i);
            zzyme.zzZ(zzybcZzC1.getStart(), zzybcZzC1.getLength(), (zzZ82) null);
            this.zzXFY.zzZrD().zzYWM();
        }
        this.zzXFG++;
    }

    private void zzqm(int i) throws Exception {
        zzYBC zzybcZzC0 = this.zzXFY.zzZrt().zzC0(this.zzXFG);
        if (zzybcZzC0 != null && zzybcZzC0.getLength() > 0) {
            zzYME zzyme = new zzYME(this.zzXFY, 2);
            this.zzXFY.zzZrD().zzys(i);
            zzyme.zzZ(zzybcZzC0.getStart(), zzybcZzC0.getLength(), (zzZ82) null);
            this.zzXFY.zzZrD().zzYWN();
        }
        this.zzXFG++;
    }

    private void zzqn(int i) throws Exception {
        if ((i & 1) != 0) {
            zzqm(0);
        }
        if ((i & 2) != 0) {
            zzqm(1);
        }
        if ((i & 4) != 0) {
            zzqm(2);
        }
        if ((i & 8) != 0) {
            zzqm(3);
        }
        if ((i & 16) != 0) {
            zzqm(4);
        }
        if ((i & 32) != 0) {
            zzqm(5);
        }
    }

    public final void zz0P() throws Exception {
        this.zzXFY.zzZrD().zzYWR();
        if (zzZRA.zzDL(this.zzXFY.zzZrw().zzYHB)) {
            int i = this.zzXFY.getDocument().zzZpV().zzYWD;
            if ((i & 1) != 0) {
                zzql(0);
            }
            if ((i & 2) != 0) {
                zzql(1);
            }
            if ((i & 4) != 0) {
                zzql(2);
            }
            if ((i & 8) != 0) {
                this.zzXFG++;
            }
            if ((i & 16) != 0) {
                this.zzXFG++;
            }
            if ((i & 32) != 0) {
                this.zzXFG++;
            }
        } else {
            zzql(0);
            zzql(1);
            zzql(2);
            zzql(3);
            zzql(4);
            zzql(5);
        }
        zzYCZ zzyczZzGj = this.zzXFY.zzGj(0);
        if (zzyczZzGj == null) {
            zzTG("Section properties is missed, used defaults.");
            zzyczZzGj = new zzYCZ();
        }
        this.zzXFY.zzZrD().zzZ(zzyczZzGj);
        zzqn(zzZRA.zzDL(this.zzXFY.zzZrw().zzYHB) ? ((Integer) zzyczZzGj.zzPj(2650)).intValue() : 63);
        zzZ82 zzz82 = new zzZ82(this.zzXFY.getDocument(), this.zzXFY.getProgressCallback(), 1024, this.zzXFY.zzZrw().zzYGY);
        this.zzXFY.zzZrD().zzYWP();
        zzZ(0, this.zzXFY.zzZrw().zzYGY * (this.zzXFY.zzZrw().zzZgX() ? 2 : 1), zzz82);
        this.zzXFY.zzZrD().zzYWO();
        zzz82.zzV6(true);
        this.zzXFY.zzZrD().zzYWQ();
        this.zzXFY.zzZrD().zzVa(this.zzXFY.zzZrF());
    }

    private zzYME(zzZZC zzzzc, int i) {
        this.zzXFX = new zzVC();
        this.zzXFV = new zzY5();
        this.zzXFU = new zzYB();
        this.zzXFT = new zzZV3();
        this.zzXFS = new zzZV6();
        this.zzXFR = new zzYAY();
        this.zzXFQ = new zzYAZ();
        this.zzXFP = new zzUJ();
        this.zzXFO = new zzUL();
        this.zzXFN = new zzYVP();
        this.zzXFM = new zzYVP();
        this.zzXFL = new zzY8C();
        this.zzXFK = new zzZLF();
        this.zzXFF = -1;
        this.zzXFY = zzzzc;
        this.zzYzl = i;
        this.zzXFW = new zzY6K(zzzzc.zzZrD());
    }

    private void zzV(zzYEF zzyef, int i) throws Exception {
        this.zzXFY.zzZrx().zzq().zzH(i);
        zzYLS zzyls = new zzYLS(this.zzXFY.zzZrx());
        int i2 = zzyls.zzXEJ;
        if (i2 != 58 && i2 != 68) {
            zzTG(com.aspose.words.internal.zzZKN.format("Invalid PICF structure at 0x{0:x4}, shape is ignored.", Integer.valueOf(i)));
            return;
        }
        this.zzXFY.zzZrx().zzq().zzH(zzyls.zzXEJ + i);
        int i3 = zzyls.zzXEI;
        if (i3 != 8) {
            if (i3 != 94) {
                if (i3 == 100) {
                    zzZ(zzyls, zzyef, zzyls.zzXEK - zzyls.zzXEJ);
                    return;
                } else if (i3 != 102) {
                    zzTG(com.aspose.words.internal.zzZKN.format("Invalid PICF structure at 0x{0:x4}, shape is ignored.", Integer.valueOf(i)));
                    return;
                }
            }
            zzZ(zzyls, zzyef, ((zzyls.zzXEK - zzyls.zzXEJ) - zzZZR.zzZ(this.zzXFY.zzZrx(), false, false).length()) - 1);
            return;
        }
        byte[] bArrZzn = this.zzXFY.zzZrx().zzn(zzyls.zzXEK - zzyls.zzXEJ);
        Shape shape = new Shape(this.zzXFY.getDocument(), 75);
        shape.setWrapType(0);
        if (bArrZzn.length > 0) {
            shape.getImageData().zzY7(bArrZzn);
        }
        shape.zzZ(zzyef);
        zzyls.zzZ7(shape);
        this.zzXFY.zzZrD().zza(shape);
    }

    private void zzX(int i, zzYEF zzyef) throws Exception {
        zzZO4 zzzo4ZzGf = this.zzXFY.zzGf(this.zzYzl);
        zzZLQ zzzlqZzBX = zzzo4ZzGf.zzBX(i);
        if (zzzlqZzBX == null) {
            zzTG("Couldn't get FSPA structure for shape, shape is ignored.");
            return;
        }
        int iZzGc = zzZZ5.zzGc(this.zzYzl);
        ShapeBase shapeBaseZzXX = this.zzXFY.zzXX(zzzlqZzBX.zzYva, iZzGc);
        if (zzZ9(shapeBaseZzXX)) {
            if (iZzGc != 0 || shapeBaseZzXX.isGroup() || shapeBaseZzXX.zzZtk()) {
                shapeBaseZzXX = null;
            } else {
                shapeBaseZzXX = (ShapeBase) shapeBaseZzXX.deepClone(false);
                if (zzzlqZzBX.isZero()) {
                    zzzlqZzBX = zzZ(zzzo4ZzGf, zzzlqZzBX);
                }
            }
        }
        if (shapeBaseZzXX == null) {
            zzTG("Couldn't get OfficeArt record for shape, shape is ignored.");
            return;
        }
        zzzlqZzBX.zzY(shapeBaseZzXX, this.zzXFY.zzZrw().zzYHB > 193);
        shapeBaseZzXX.zzZ(zzyef);
        if (!shapeBaseZzXX.isGroup()) {
            zzZa(shapeBaseZzXX);
        }
        this.zzXFY.zzZrD().zza(shapeBaseZzXX);
        zzZ8(shapeBaseZzXX);
    }

    private void zzZ(zzVG zzvg, zzZ82 zzz82) throws Exception {
        int i = 0;
        for (int i2 = 0; i2 < zzvg.zzr5().length; i2++) {
            if (zzY(zzvg, i2)) {
                zzZ(zzvg, i, i2);
                i = i2 + 1;
            } else if (zzY4(zzvg.zzr5()[i2]) && zzZ(zzvg, i2)) {
                zzZ(zzvg, i2, zzZ(zzvg, i, i2, zzvg.zzr5()[i2] == '\f'));
                i = i2 + 1;
            }
            if (zzz82 != null) {
                zzz82.zzV6(false);
            }
        }
        if (i < zzvg.zzr5().length) {
            this.zzXFX.zzZ(new zzVG(zzvg, i, zzvg.zzr5().length, false));
        }
    }

    private void zzZ(zzVG zzvg, int i, int i2) throws Exception {
        char c = zzvg.zzr5()[i2];
        int iZzNn = zzvg.zzNn(i2 + 1);
        zzYCZ zzyczZzGj = this.zzXFY.zzGj(iZzNn);
        boolean z = true;
        if (c != '\f') {
            zzTG(com.aspose.words.internal.zzZKN.format("Invalid section break character at CP: {0}.", Integer.valueOf(iZzNn)));
            if ((i2 > 0 ? zzvg.zzr5()[i2 - 1] : (char) 0) != '\r' && i2 != 0 && (zzyczZzGj == null || zzyczZzGj.getSectionStart() != 0)) {
                z = false;
            }
        }
        zzYMW zzymwZzZ = zzZ(zzvg, i, i2, false);
        zzZ(zzvg, i2, zzymwZzZ);
        if (zzymwZzZ.zzXGU.zzXGL != 0) {
            zzTG("Section breaks are not allowed inside tables by Aspose.Words.");
            return;
        }
        if (this.zzXFW.zzXXF() != 0) {
            zzTG("Section breaks are not allowed inside tables by Aspose.Words.");
            return;
        }
        if (this.zzYzl != 0) {
            zzTG("Section breaks allowed only inside main document.");
            return;
        }
        if (z) {
            this.zzXFY.zzZrD().zzYWO();
            this.zzXFY.zzZrD().zzYWQ();
            this.zzXFY.zzZrD().zzZ(zzyczZzGj);
            zzqn(zzZRA.zzDL(this.zzXFY.zzZrw().zzYHB) ? ((Integer) zzyczZzGj.zzPj(2650)).intValue() : 63);
            this.zzXFY.zzZrD().zzYWP();
        }
    }

    private zzZO9 zzW(int i, RefInt refInt) {
        refInt.set(0);
        if (this.zzYzl != 0) {
            return null;
        }
        int iZzDM = this.zzXFY.zzZrw().zzDM(i);
        zzZO9 zzzo9ZzBZ = this.zzXFY.zzZrq().zzBZ(iZzDM);
        if (zzzo9ZzBZ != null) {
            return zzzo9ZzBZ;
        }
        refInt.set(1);
        return this.zzXFY.zzZrp().zzBZ(iZzDM);
    }

    private void zzW(int i, zzYEF zzyef) throws Exception {
        int i2;
        zzZOH zzzohZzZro = this.zzXFY.zzZro();
        int iZzTh = zzzohZzZro.zzZaj().zzTh(i);
        if (iZzTh < 0) {
            zzTG(com.aspose.words.internal.zzZKN.format("Invalid annotation reference at local CP: 0x{0:x4}.", Integer.valueOf(i)));
            return;
        }
        zzZX zzzx = zzzohZzZro.zzZaj().get(iZzTh);
        String strZzCj = zzzohZzZro.zzCj(zzzx.zzZFg);
        int i3 = zzzx.zzZFd;
        this.zzXFY.zzZrD().zzZ(zzzx.zzZFf, (i3 == 0 || (i2 = i3 + iZzTh) < 0) ? -1 : zzzohZzZro.zzZaj().get(i2).zzZFf, zzzx.zzZFh, strZzCj, zzzx.zzZFe, zzyef);
        zzYME zzyme = new zzYME(this.zzXFY, 3);
        int iZzTe = zzzohZzZro.zzZai().zzTe(iZzTh);
        zzyme.zzZ(iZzTe, zzzohZzZro.zzZai().zzTe(iZzTh + 1) - iZzTe, (zzZ82) null);
        this.zzXFY.zzZrD().zzYWI();
    }

    private boolean zzZ(zzVG zzvg, int i) {
        return this.zzXFY.zzZrm().zzTg(zzvg.zzNm(i + 1)) >= 0;
    }

    private zzYMW zzZ(zzVG zzvg, int i, int i2, boolean z) throws Exception {
        this.zzXFX.zzZ(new zzVG(zzvg, i, i2 + 1, z));
        return this.zzXFY.zzZ(zzvg.zzNm(i2), this.zzXFX.zz0Q());
    }

    private void zzZ(zzVG zzvg, int i, zzYMW zzymw) throws Exception {
        this.zzXFW.zzZ(zzymw.zzXGU);
        int iZzNn = zzvg.zzNn(i);
        if (zzymw.zzXGU.zzYpb()) {
            Ref<zzYEF> ref = new Ref<>(null);
            Ref<zzYE5> ref2 = new Ref<>(null);
            this.zzXFY.zzZ(zzvg.zzNm(i), zzvg.zz16().zzZYE().zzZYF(), ref, ref2);
            zzYEF zzyef = ref.get();
            ref2.get();
            Object obj = zzyef.get(130);
            if (obj != null) {
                zzZU zzzu = (zzZU) obj;
                if (zzzu.getValue() == zzZU.zzZF4.getValue() || zzzu.getValue() == zzZU.zzZF6.getValue()) {
                    zzymw.zzXGT.set(4520, Boolean.TRUE);
                }
            }
            zzyef.zzY(zzymw.zzXGT, 14);
            zzyef.zzY(zzymw.zzXGT, 12);
            this.zzXFV.zzjO(iZzNn);
            this.zzXFU.zzjO(iZzNn);
            this.zzXFT.zzjO(iZzNn);
            this.zzXFS.zzjO(iZzNn);
        } else {
            zzM(zzymw.zzXGV);
        }
        this.zzXFW.zzZ(zzymw.zzXGU, zzymw.zzXGT, this.zzXFX.zz0S().zz15());
        int i2 = iZzNn + 1;
        if (this.zzXFW.zzXXF() == 1 && this.zzXFV.getPosition() != i2 && this.zzXFT.getPosition() != i2) {
            this.zzXFV.zzjO(i2);
            this.zzXFU.zzjO(i2);
            this.zzXFT.zzjO(i2);
            this.zzXFS.zzjO(i2);
        }
        this.zzXFX.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzYEF zzyef, zzYE5 zzye5, zzVG zzvg, int i, int i2, boolean z) throws Exception {
        zzYEF zzyef2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        zzYE5 zzye52 = zzye5;
        char c = 1;
        if (!zzye52.zzXpL && i2 == 1 && zzvg.zzr5()[i] == 21) {
            zzTG(com.aspose.words.internal.zzZKN.format("Field char is invalid at FC: 0x{0:x4}.", Integer.valueOf(zzvg.zzNm(i))));
            zzye52.zzXpL = true;
        }
        int i6 = i + i2;
        int iZzNn = zzvg.zzNn(i) - i;
        int iZzzG = zzY0C.zzzG(zzvg.zzr5()[i]);
        int i7 = i;
        int i8 = i7;
        char c2 = 0;
        while (i8 < i6) {
            int i9 = i8 + iZzNn;
            zzqi(i9);
            char c3 = (this.zzXFN.getPosition() == i9 || this.zzXFM.getPosition() == i9) ? c : c2;
            char c4 = zzvg.zzr5()[i8];
            char c5 = (i9 != this.zzXFF || c4 == '\b' || c4 == c) ? (char) 0 : c;
            int iZzzG2 = zzY0C.zzzG(c4);
            if (iZzzG != iZzzG2) {
                zzyef2 = zzyef;
                if (zzyef2.contains(400) && (iZzzG == 0 || iZzzG2 == 0)) {
                    z2 = true;
                }
                if (c4 != '\b' || zzye52.zzXpL || this.zzXFV.getPosition() == i9 || this.zzXFU.getPosition() == i9 || this.zzXFT.getPosition() == i9 || this.zzXFS.getPosition() == i9 || this.zzXFR.getPosition() == i9 || this.zzXFQ.getPosition() == i9 || this.zzXFP.getPosition() == i9 || this.zzXFO.getPosition() == i9 || this.zzXFL.getPosition() == i9 || this.zzXFK.getPosition() == i9 || c3 != 0 || c5 != 0 || z2) {
                    zzYEF zzyef3 = (zzYEF) zzyef2.zzbn();
                    if (!zzye52.zzXpL || i8 <= i7) {
                        iZzzG2 = iZzzG;
                        i3 = i7;
                    } else {
                        zzZ(zzye52, zzyef3, zzvg, i7, i8 - i7);
                        zzyef3 = zzyef3;
                        i3 = i8;
                    }
                    this.zzXFV.zzjO(i9);
                    this.zzXFT.zzjO(i9);
                    if (this.zzXFR.getPosition() == this.zzXFU.getPosition() && this.zzXFR.getPosition() != this.zzXFS.getPosition()) {
                        this.zzXFR.zzjO(i9);
                        this.zzXFQ.zzjO(i9);
                        this.zzXFU.zzjO(i9);
                        this.zzXFS.zzjO(i9);
                    } else {
                        this.zzXFU.zzjO(i9);
                        this.zzXFS.zzjO(i9);
                        this.zzXFR.zzjO(i9);
                        this.zzXFQ.zzjO(i9);
                    }
                    if (!zzZRA.zzDL(this.zzXFY.zzZrw().zzYHB)) {
                        this.zzXFP.zzjO(i9);
                        this.zzXFO.zzjO(i9);
                    }
                    this.zzXFL.zzjO(i9);
                    this.zzXFK.zzjO(i9);
                    if (c3 == 0) {
                        if (this.zzXFN.getPosition() == i9) {
                            this.zzXFN.zzjO(i9);
                        } else {
                            this.zzXFM.zzjO(i9);
                        }
                        RefInt refInt = new RefInt(0);
                        zzZO9 zzzo9ZzW = zzW(i9, refInt);
                        int i10 = refInt.get();
                        if (zzzo9ZzW != null) {
                            i4 = i6;
                            int i11 = i8;
                            zzZ(zzzo9ZzW, i10, zzvg, i11, i4, zzye5, zzyef3);
                            i8 = i11;
                            zzye52 = zzye5;
                            i5 = i4;
                        } else {
                            zzye52 = zzye5;
                            i4 = i6;
                            i5 = i3;
                        }
                        i7 = i5;
                        c2 = 0;
                        iZzzG = iZzzG2;
                    } else {
                        zzye52 = zzye5;
                        zzYEF zzyef4 = zzyef3;
                        i4 = i6;
                        if (zzye52.zzXpL || zzN(c4, i9)) {
                            zzZ(c4, i9, zzyef4, zzye52);
                            i3 = i8 + 1;
                        }
                        if (c5 != 0) {
                            zzX(this.zzXFY.zzZrw().zzDM(i9), zzyef4);
                        }
                        c2 = c3;
                        iZzzG = iZzzG2;
                        i7 = i3;
                    }
                } else {
                    i4 = i6;
                    c2 = c3;
                }
                i8++;
                i6 = i4;
                c = 1;
            } else {
                zzyef2 = zzyef;
            }
            z2 = false;
            if (c4 != '\b') {
                zzYEF zzyef32 = (zzYEF) zzyef2.zzbn();
                if (zzye52.zzXpL) {
                    iZzzG2 = iZzzG;
                    i3 = i7;
                    this.zzXFV.zzjO(i9);
                    this.zzXFT.zzjO(i9);
                    if (this.zzXFR.getPosition() == this.zzXFU.getPosition()) {
                        this.zzXFU.zzjO(i9);
                        this.zzXFS.zzjO(i9);
                        this.zzXFR.zzjO(i9);
                        this.zzXFQ.zzjO(i9);
                        if (!zzZRA.zzDL(this.zzXFY.zzZrw().zzYHB)) {
                        }
                        this.zzXFL.zzjO(i9);
                        this.zzXFK.zzjO(i9);
                        if (c3 == 0) {
                        }
                    }
                }
            }
            i8++;
            i6 = i4;
            c = 1;
        }
        if (z) {
            i8--;
        }
        if (i8 > i7) {
            zzZ(zzye52, zzyef, zzvg, i7, i8 - i7);
        }
    }

    private void zzZ(zzYE5 zzye5, zzYEF zzyef, zzVG zzvg, int i, int i2) throws Exception {
        if (i2 == 0) {
            return;
        }
        if (this.zzXFI == 0 && zzye5.zzXpF != null && !zzyef.contains(130)) {
            zzyef.zzZ(zzye5.zzXpF);
        }
        zzV(new String(zzvg.zzr5(), i, i2), zzyef);
    }

    private void zzZ(char c, int i, zzYEF zzyef, zzYE5 zzye5) throws Exception {
        boolean z;
        boolean zIsPrivate;
        int iZzDM = this.zzXFY.zzZrw().zzDM(i);
        if (c == 1) {
            if (zzye5.zzXpK) {
                zzX(zzyef, zzye5.zzdZ);
                return;
            } else if (zzye5.zzXpI) {
                zzW(zzyef, zzye5.zzdZ);
                return;
            } else {
                zzV(zzyef, zzye5.zzdZ);
                return;
            }
        }
        if (c == 5) {
            if (this.zzYzl == 0) {
                zzW(iZzDM, zzyef);
                return;
            } else {
                this.zzXFY.zzZrD().zzX(c, zzyef);
                return;
            }
        }
        if (c == '\b') {
            zzX(iZzDM, zzyef);
            return;
        }
        if (c == '(') {
            zzyef.zzBp(zzye5.zzXpG);
            zzyef.remove(400);
            zzyef.zzQ(890, Boolean.TRUE);
            zzV(Character.toString(zzye5.zzXpH), zzyef);
            return;
        }
        if (c == '<') {
            zzT(1, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
            return;
        }
        if (c != '>') {
            zzyocZzGh = null;
            zzYOC zzyocZzGh = null;
            boolean z2 = false;
            switch (c) {
                case 19:
                    zzZNP zzznpZzXA = this.zzXFY.zzZru().zzXA(this.zzYzl, iZzDM);
                    if (zzznpZzXA == null) {
                        zzznpZzXA = new zzZNP(19, 0);
                    }
                    int iZzXz = this.zzXFY.zzZru().zzXz(this.zzYzl, iZzDM);
                    zzZKK zzzkk = this.zzXFY.zzZrE().getBuiltInDocumentProperties().zzZAZ;
                    this.zzXFY.zzZrD().zzY(zzyef, zzznpZzXA.getType(), zzzkk != null ? zzzkk.zzWZ(this.zzYzl, iZzXz) : null);
                    this.zzXFI++;
                    break;
                case 20:
                    if (zzye5.zzXpJ && zzye5.zzXpI) {
                        zzyocZzGh = this.zzXFY.zzGh(zzye5.zzdZ);
                    }
                    this.zzXFY.zzZrD().zzZ(zzyef, zzyocZzGh);
                    break;
                case 21:
                    zzZNP zzznpZzXA2 = this.zzXFY.zzZru().zzXA(this.zzYzl, iZzDM);
                    if (zzznpZzXA2 != null) {
                        boolean zIsDirty = zzznpZzXA2.isDirty();
                        boolean zIsLocked = zzznpZzXA2.isLocked();
                        zIsPrivate = zzznpZzXA2.isPrivate();
                        z = zIsDirty;
                        z2 = zIsLocked;
                    } else {
                        z = false;
                        zIsPrivate = false;
                    }
                    this.zzXFY.zzZrD().zzZ(zzyef, z2, z, zIsPrivate);
                    this.zzXFI--;
                    break;
                default:
                    this.zzXFY.zzZrD().zzX(c, zzyef);
                    break;
            }
        }
    }

    private void zzZ(zzYLS zzyls, zzYEF zzyef, int i) throws Exception {
        Shape shapeZzGi;
        if (i == 0) {
            shapeZzGi = new Shape(this.zzXFY.getDocument(), 75);
        } else {
            shapeZzGi = this.zzXFY.zzGi(i);
        }
        if (shapeZzGi == null) {
            return;
        }
        if (!zzyls.isValid()) {
            zzTG("Invalid PICF structure, shape is ignored.");
            return;
        }
        shapeZzGi.zzZ(zzyef);
        zzyls.zzZ7(shapeZzGi);
        zzZa(shapeZzGi);
        this.zzXFY.zzZrD().zza(shapeZzGi);
    }

    private static zzZLQ zzZ(zzZO4 zzzo4, zzZLQ zzzlq) {
        for (int i = 0; i < zzzo4.zzZ9N().zzsk(); i++) {
            zzZLQ zzzlq2 = zzzo4.zzZ9N().get(i);
            if (com.aspose.words.internal.zzZKO.zzA(zzzlq, zzzlq2)) {
                break;
            }
            if (zzzlq2.zzYva == zzzlq.zzYva) {
                return zzzlq2;
            }
        }
        return zzzlq;
    }

    private void zzZ(zzZO9 zzzo9, int i, zzVG zzvg, int i2, int i3, zzYE5 zzye5, zzYEF zzyef) throws Exception {
        String str;
        if (zzzo9.zzYzp) {
            str = null;
        } else {
            str = new String(zzvg.zzr5(), i2, i3 - i2);
            if (zzye5.zzXpL && zzye5.zzXpH != 0 && str.charAt(0) == '(') {
                str = com.aspose.words.internal.zzZKN.zzS(zzye5.zzXpH, 1);
                zzyef.zzBp(zzye5.zzXpG);
            }
        }
        this.zzXFY.zzZrD().zzZ(i, zzzo9.zzYzp, str, zzyef);
        new zzYME(this.zzXFY, i != 0 ? 4 : 1).zzZ(zzzo9.getStart(), zzzo9.getLength(), (zzZ82) null);
        this.zzXFY.zzZrD().zzYWJ();
    }
}
