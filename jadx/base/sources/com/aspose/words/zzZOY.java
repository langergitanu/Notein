package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOY extends zzZOX implements com.aspose.words.internal.zzZOY {
    private static Object zzYAZ = new Object();
    private byte zzYB0;
    private Object zzYB1;
    private zzZOY zzYB2;
    private zzYW0 zzYB3;
    private boolean zzYB4;
    private boolean zzYB5;
    private boolean zzYB7;
    private boolean zzYB8;
    private boolean zzYB9;
    private int zzYBa;
    private int zzYBb;
    private int zzYBe;
    private boolean zzYBf;
    private boolean zzYBg;
    private boolean zzYBh;
    private boolean zzYGq;
    private Field zzZz7;
    private int zzYBc = 0;
    private int zzYBd = 0;
    private byte zzYB6 = -1;

    public static class zzY implements zzZBF {
        private Field zzZz7;

        public zzY(Field field) {
            this.zzZz7 = field;
        }

        @Override // com.aspose.words.zzZBF
        public final void zzZgg() {
            this.zzZz7.zzZgU();
        }
    }

    public static final class zzZ implements com.aspose.words.internal.zzZOY {
        private zzZOY zzYAY;

        public zzZ(zzZOY zzzoy) {
            this.zzYAY = zzzoy;
        }

        @Override // com.aspose.words.internal.zzZOY
        public final void dispose() {
            this.zzYAY.zzZbm();
        }
    }

    private zzZOY(Field field, boolean z, zzZOT zzzot, byte b) {
        this.zzZz7 = field;
        this.zzYBg = z;
        this.zzYBf = zzzot.zzZbk();
        this.zzYB0 = b;
        int iZzZaW = zzzot.zzZaW();
        if (iZzZaW == 0) {
            this.zzYBe = 0;
        } else if (iZzZaW == 1) {
            this.zzYBe = 1;
        } else {
            if (iZzZaW != 2) {
                throw new IllegalArgumentException();
            }
            this.zzYBh = true;
        }
    }

    private void zzCU(int i) {
        int i2;
        if ((i & 8) == 0 || (i2 = i & 25) == 0) {
            return;
        }
        Iterator<zzZOY> it = zzZbr().iterator();
        while (it.hasNext()) {
            it.next().zzYBc |= i2;
        }
    }

    private boolean zzO(FieldStart fieldStart) {
        if (hasChildren() && !zzZ(zzZb1()).zzZax()) {
            char c = this.zzYB2 == null ? (char) 1 : (char) 0;
            for (zzZOY zzzoy : this) {
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            throw new IllegalArgumentException();
                        }
                        if (!zzzoy.zzYBg) {
                            return true;
                        }
                        zzV(zzzoy);
                    } else if (zzzoy.zzZz7.getStart() == fieldStart) {
                        zzV(zzzoy);
                        if (!zzZOO.zzCv(zzzoy.zzZz7.getType())) {
                            return true;
                        }
                        c = 2;
                    } else {
                        continue;
                    }
                } else if (zzzoy == this.zzYB2) {
                    c = 1;
                }
            }
            if (c == 2) {
                return true;
            }
        }
        return false;
    }

    private void zzU(zzZOY zzzoy) {
        if (zzzoy.zzYB5) {
            this.zzYB5 = true;
        }
    }

    private void zzV(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) throws Exception {
        Field fieldZzX = zzZQB.zzX(fieldStart, fieldSeparator, fieldEnd);
        zzZOY zzzoy = this.zzYB2;
        zzV(zzZ(fieldZzX, false, this, zzzoy, zzzoy != null, this.zzYB0));
    }

    private static boolean zzXF(int i, int i2) {
        if ((i & 2) == 0) {
            return false;
        }
        return (i2 & 2) == 2 || i2 == 0;
    }

    private static boolean zzY(zzZOX zzzox) {
        return zzzox.zzZb1() != null;
    }

    public static zzZOY zzZ(Field field, zzZOQ zzzoq, byte b) throws Exception {
        zzZOY zzzoyZzZ = zzZ(field, false, zzzoq, null, true, b);
        zzzoyZzZ.zzYB9 = true;
        return zzzoyZzZ;
    }

    private boolean zzZbe() {
        if (this.zzYBc != 0) {
            return true;
        }
        if (zzZOO.zzCF(this.zzZz7.getType()) == 0) {
            return false;
        }
        return this.zzYBf || !zzZbd();
    }

    private zzZOY zzZbp() {
        zzZOY zzzoyZzZbh = this;
        while (zzzoyZzZbh.zzZbh() != null && zzzoyZzZbh.zzZbh().zzZbe()) {
            zzzoyZzZbh = zzzoyZzZbh.zzZbh();
        }
        return zzzoyZzZbh;
    }

    private Iterable<zzZOY> zzZbr() {
        ArrayList arrayList = new ArrayList();
        for (zzZOY zzzoyZzZbh = zzZbh(); zzzoyZzZbh != null && zzzoyZzZbh.zzZbe(); zzzoyZzZbh = zzzoyZzZbh.zzZbh()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZOY>) arrayList, zzzoyZzZbh);
        }
        return arrayList;
    }

    private void zzZbu() {
        zzZbw();
        if (hasChildren()) {
            Iterator<zzZOY> it = iterator();
            while (it.hasNext()) {
                zzU(it.next());
            }
        }
    }

    private void zzZbw() {
        this.zzYB5 = zzZOO.zzCN(this.zzZz7.getType());
    }

    private void zzZby() {
        if (this.zzYB3 != null) {
            this.zzYB3 = null;
        }
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() {
        zzZby();
    }

    public final Field getField() {
        return this.zzZz7;
    }

    public final void zzCS(int i) {
        this.zzYBa = i;
    }

    public final void zzCT(int i) {
        this.zzYBb = i;
    }

    public final void zzCV(int i) {
        this.zzYBc |= i;
        if ((i & 4) == 0 || !zzZbi()) {
            return;
        }
        this.zzYBc |= i & 2;
        int i2 = (i ^ 4) | 1;
        zzZOY zzzoyZzZbp = zzZbp();
        boolean zZzXF = zzXF(i2, zzzoyZzZbp.zzYBc);
        int i3 = zzzoyZzZbp.zzYBc | i2;
        zzzoyZzZbp.zzYBc = i3;
        if (!zZzXF) {
            zzzoyZzZbp.zzYBc = i3 & (-3);
        }
        zzCU(i2);
    }

    public final void zzCW(int i) {
        if (i == 0) {
            this.zzYBd |= 2;
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: area");
            }
            this.zzYBd |= 1;
        }
        for (zzZOY zzzoyZzZbh = zzZbh(); zzzoyZzZbh != null; zzzoyZzZbh = zzzoyZzZbh.zzZbh()) {
            zzzoyZzZbh.zzYBd |= 2;
        }
    }

    public final void zzP(zzZR8 zzzr8) {
        if (hasChildren()) {
            for (zzZOY zzzoy : this) {
                if (zzzoy.zzYB1 == zzYAZ) {
                    zzzoy.zzYB1 = zzzr8;
                }
            }
        }
    }

    public final void zzT(zzZOY zzzoy) throws Exception {
        this.zzZz7.zzZ((zzZBF) zzzoy.zzYB1);
    }

    public final void zzVR(boolean z) {
        this.zzYGq = z;
    }

    public final void zzW(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) throws Exception {
        fieldEnd.hasSeparator();
        if (zzO(fieldStart)) {
            return;
        }
        zzV(fieldStart, fieldSeparator, fieldEnd);
    }

    public final void zzZb3() {
        if (this.zzYB4 || !this.zzZz7.zzZgm() || zzZ(zzZb1()).getDocument().zzZqa() == null) {
            return;
        }
        zzZ(zzZb1()).getDocument().zzZqa().zzZaR();
        zzZ(zzZb1()).getDocument().zzZqa().zzZaT();
        this.zzYB4 = true;
    }

    public final byte zzZb4() {
        return this.zzYB6;
    }

    public final boolean zzZb5() {
        return this.zzYB7;
    }

    public final boolean zzZb6() {
        return this.zzYB8;
    }

    public final boolean zzZb7() {
        return this.zzYB9;
    }

    public final int zzZb8() {
        return this.zzYBa;
    }

    public final int zzZb9() {
        return this.zzYBb;
    }

    public final int zzZba() {
        return this.zzYBc;
    }

    public final int zzZbb() {
        return this.zzYBd;
    }

    public final zzZBF zzZbc() {
        return (zzZBF) this.zzYB1;
    }

    public final boolean zzZbd() {
        return this.zzYB5 && this.zzZz7.zzZgt() && !zzZ(zzZb1()).zzZaz();
    }

    public final boolean zzZbf() {
        return this == zzZbp() && zzZbe();
    }

    public final zzZOY zzZbg() {
        zzZOY zzzoyZzZbh = this;
        while (zzzoyZzZbh.zzZbi()) {
            zzzoyZzZbh = zzzoyZzZbh.zzZbh();
        }
        return zzzoyZzZbh;
    }

    public final zzZOY zzZbh() {
        if (zzZbi()) {
            return (zzZOY) zzZb1();
        }
        return null;
    }

    public final boolean zzZbi() {
        return zzZb1() != null && zzY(zzZb1());
    }

    public final int zzZbj() {
        return this.zzYBe;
    }

    public final boolean zzZbk() {
        return this.zzYBf;
    }

    public final boolean zzZbl() {
        return this.zzYBh;
    }

    public final void zzZbm() {
        zzYW0 zzyw0 = this.zzYB3;
        if (zzyw0 != null) {
            zzyw0.zzts(zzZOO.zzg(this.zzZz7));
        }
        zzZby();
    }

    public final com.aspose.words.internal.zzZOY zzZbn() throws Exception {
        if (this.zzYB3 == null) {
            zzYW0 zzyw0 = new zzYW0(this.zzZz7.zzZgF(), zzZOO.zzf(this.zzZz7), false);
            this.zzYB3 = zzyw0;
            zzyw0.zzYzM();
        }
        return new zzZ(this);
    }

    public final void zzZbo() {
        this.zzYBc = 0;
    }

    public final void zzZbq() {
        zzZOY zzzoyZzZbh = this;
        while (zzzoyZzZbh.zzZbi()) {
            zzzoyZzZbh = zzzoyZzZbh.zzZbh();
            zzzoyZzZbh.zzZz7.zzZgU();
            zzzoyZzZbh.zzZz7.zzZgV();
        }
    }

    public final void zzZbs() {
        this.zzYB7 = true;
    }

    public final void zzZbt() throws Exception {
        int iZzZgN = this.zzZz7.zzZgN();
        if (this.zzYBe < iZzZgN) {
            this.zzYBe = iZzZgN;
        }
        this.zzYB8 = true;
        zzZb2();
    }

    public final void zzZbv() {
        this.zzYB2 = null;
        if (hasChildren()) {
            for (zzZOY zzzoy : this) {
                if (zzzoy.zzYB1 == zzYAZ) {
                    zzzoy.zzYB1 = new zzY(this.zzZz7);
                }
                if (zzzoy.zzYB1 == null) {
                    zzZOX.zzS(zzzoy);
                }
            }
        }
        if (zzZ(zzZb1()).zzZax()) {
            return;
        }
        for (zzZOY zzzoyZzZbh = zzZbh(); zzzoyZzZbh != null; zzzoyZzZbh = zzzoyZzZbh.zzZbh()) {
            zzzoyZzZbh.zzZbu();
        }
    }

    public final void zzZbx() {
        zzZbw();
        if (hasChildren()) {
            for (zzZOY zzzoy : this) {
                zzzoy.zzYB1 = null;
                zzzoy.zzYB9 = zzzoy.zzYBg;
            }
        }
    }

    public final boolean zzZfU() {
        return this.zzYBg;
    }

    public final boolean zzZgc() {
        return this.zzYGq;
    }

    public final boolean zzZgl() {
        if (zzZbi()) {
            return false;
        }
        if (this.zzYB0 == -1) {
            this.zzYB0 = this.zzZz7.zzZgl() ? (byte) 1 : (byte) 0;
        }
        return this.zzYB0 == 1;
    }

    public final zzZOQ zzZgo() {
        return zzZ(zzZb1());
    }

    public final void zzq(byte b) {
        this.zzYB6 = b;
    }

    public final zzZOY zzu(Field field) throws Exception {
        zzZOY zzzoyZzZ = zzZ(field, true, zzZb1(), this, true, this.zzYB0);
        zzzoyZzZ.zzYB1 = this.zzYB1;
        zzzoyZzZ.zzYB9 = true;
        zzZOY zzzoy = zzzoyZzZ;
        for (zzZOY zzzoyZzZbh = zzzoyZzZ.zzZbh(); zzzoyZzZbh != null; zzzoyZzZbh = zzzoyZzZbh.zzZbh()) {
            zzzoyZzZbh.zzU(zzzoy);
            zzzoy = zzzoyZzZbh;
        }
        return zzzoyZzZ;
    }

    private static zzZOY zzZ(Field field, boolean z, zzZOX zzzox, zzZOY zzzoy, boolean z2, byte b) throws Exception {
        zzZOQ zzzoqZzZ = zzZ(zzzox);
        boolean zZzY = zzY(zzzox);
        zzZOT zzzotZzV = zzzoqZzZ.zzZaw().zzV(field, zZzY);
        if (zzzotZzV != null) {
            field = zzzotZzV.getField();
        } else {
            zzzotZzV = zzZOT.zzYAM;
        }
        if (zZzY) {
            b = 0;
        }
        zzZOY zzzoy2 = new zzZOY(field, z, zzzotZzV, b);
        zzZOX.zzZ(zzzox, zzzoy, zzzoy2, z2);
        zzzoy2.zzCV(zzzotZzV.zzZaV());
        if (!zzzoy2.zzYBh) {
            zzzoy2.zzZz7.zzW(zzzoy2);
            if (zzzoqZzZ.getDocument().zzZqa() != null) {
                zzzoqZzZ.getDocument().zzZqa().zzZaS();
            }
        }
        if (zzZOO.zzj(field)) {
            zzZOQ.zzD(zzzoy2);
        }
        return zzzoy2;
    }

    private void zzV(zzZOY zzzoy) {
        zzzoy.zzYB1 = zzYAZ;
        if (this.zzYGq) {
            zzzoy.zzYB9 = true;
        }
        zzU(zzzoy);
        this.zzYB2 = zzzoy;
    }

    private static zzZOQ zzZ(zzZOX zzzox) {
        while (zzY(zzzox)) {
            zzzox = zzzox.zzZb1();
        }
        return (zzZOQ) zzzox;
    }
}
