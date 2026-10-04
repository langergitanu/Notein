package com.aspose.words;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6E extends zzYL1 implements zzZ98 {
    private zzWP zzX4P;
    private zzWM zzX4Q;
    private zzZZ6 zzX4R;
    private zzY6G zzX4S;
    private boolean zzX4T;
    private static Comparator<zzUC> zzX4O = new zzUB();
    private static Comparator<zzUC> zzX4N = new zzU9();

    public zzY6E(zzZZ2 zzzz2) throws Exception {
        super(zzzz2);
        this.zzX4P = new zzWP();
        this.zzX4Q = new zzWM();
    }

    private void zzPF(boolean z) throws Exception {
        if (((zzY6G) this.zzZF0).zzXXr()) {
            this.zzZzR.zzJ((short) (z ? 54803 : 54789));
            this.zzZzR.writeByte((byte) (zzXY.zzYM(z) * 6));
            zzXY.zzX(((zzY6G) this.zzZF0).zz5A(), this.zzZzR, z);
            zzXY.zzX(((zzY6G) this.zzZF0).zz5y(), this.zzZzR, z);
            zzXY.zzX(((zzY6G) this.zzZF0).zz5z(), this.zzZzR, z);
            zzXY.zzX(((zzY6G) this.zzZF0).zz5x(), this.zzZzR, z);
            zzXY.zzX(((zzY6G) this.zzZF0).zz5u(), this.zzZzR, z);
            zzXY.zzX(((zzY6G) this.zzZF0).zz5t(), this.zzZzR, z);
        }
    }

    private void zzPG(boolean z) throws Exception {
        Object objZzPk = ((zzY6G) this.zzZF0).zzPk(4010);
        if (objZzPk != null) {
            if (((zzY6G) this.zzZF0).getBidi() && !z) {
                objZzPk = Integer.valueOf(zzY6G.zzqE(((Integer) objZzPk).intValue()));
            }
            this.zzZzR.zzVA(z ? 21642 : 21504, ((Integer) objZzPk).intValue());
        }
    }

    private void zzV9(int i, int i2) throws Exception {
        Object objZzPk = ((zzY6G) this.zzZF0).zzPk(i2);
        if (objZzPk != null) {
            this.zzZzR.zzJ((short) i);
            this.zzZzR.writeByte((byte) 3);
            this.zzZzR.zzK((short) ((Integer) objZzPk).intValue());
        }
    }

    private void zzVa(int i, int i2) throws Exception {
        Object objZzPk = ((zzY6G) this.zzZF0).zzPk(i2);
        if (objZzPk != null) {
            this.zzZzR.zzJ((short) i);
            PreferredWidth preferredWidth = (PreferredWidth) objZzPk;
            this.zzZzR.writeByte((byte) preferredWidth.getType());
            this.zzZzR.zzK((short) (preferredWidth.getType() == 1 ? 0 : preferredWidth.zzYmE()));
        }
    }

    private void zzXWW() throws Exception {
        if (zzYmI() || ((zzY6G) this.zzZF0).getStyleOptions() == 1536) {
            return;
        }
        this.zzZzR.zzJ((short) 29706);
        this.zzZzR.zzK((short) 0);
        this.zzZzR.zzK((short) zzY6G.zzjU(((zzY6G) this.zzZF0).getStyleOptions()));
    }

    private void zzXWX() throws Exception {
        zzZKP zzzkp = (zzZKP) ((zzY6G) this.zzZF0).get(4120);
        if (zzzkp != null) {
            zzY9I zzy9i = this.zzZzR;
            int iZzZ4A = zzzkp.zzZ4A();
            int value = zzzkp.getValue();
            if (iZzZ4A == 1) {
                value = -value;
            }
            zzy9i.zzVA(37895, value);
        }
    }

    private boolean zzXWY() {
        return !zzYmI();
    }

    private void zzXWZ() throws Exception {
        if (zzXX0()) {
            this.zzZzR.zzZe(13315, true);
        } else {
            zzWg(13315, 4360);
        }
    }

    private boolean zzXX0() {
        for (int i = 0; i < ((zzY6G) this.zzZF0).zz5l().getCount(); i++) {
            if (((zzY6G) this.zzZF0).zz5l().zzOs(i).getHorizontalMerge() != 0 || ((zzY6G) this.zzZF0).zz5l().zzOs(i).getVerticalMerge() != 0) {
                return true;
            }
        }
        return false;
    }

    private void zzXX1() throws Exception {
        this.zzX4Q.zzZ(((zzY6G) this.zzZF0).zz5l());
        int leftPadding = (((zzY6G) this.zzZF0).getLeftPadding() + ((zzY6G) this.zzZF0).getRightPadding()) / 2;
        this.zzZzR.zzVA(38401, this.zzX4R.zzZrd() + leftPadding + ((zzY6G) this.zzZF0).zzYk9());
        this.zzX4Q.zzYD(zzYmI());
        this.zzX4Q.zzYC(false);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 3010, 30243, this.zzX4Q);
        if (zzXWY()) {
            this.zzZzR.zzVA(22074, ((zzY6G) this.zzZF0).zzZ7j());
        }
        if (!zzYmI() && leftPadding != 0) {
            this.zzZzR.zzVA(38402, leftPadding);
        }
        zzXWZ();
        zzWh(13316, 4040);
        zzXWX();
        this.zzX4Q.zzZ(this.zzX4S.zz5l(), 54793);
        zzWe(22027, 4380);
        zzXWW();
        zz0(13837, 4150, 4160);
        zzW(37902, 4170, 4180, true);
        zzV(37903, 4190, 4200, true);
        zzWe(37904, 4210);
        zzWe(37905, 4220);
        this.zzX4Q.zzZ(this.zzX4S.zz5l(), 54796);
        this.zzX4Q.zzZ(this.zzX4S.zz5l(), 54802);
        this.zzX4Q.zz5j();
        zzPF(true);
        zzVa(62996, 4230);
        zzWh(13845, 4240);
        this.zzX4Q.zzZ(this.zzX4S.zz5l(), 54806);
        zzZX(62999, 4250, 4253);
        zzZX(63000, 4260, 4261);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 3050, 30249, this.zzX4Q);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 3060, 54828, this.zzX4Q);
        zzWe(37918, 4270);
        zzWe(37919, 4280);
        this.zzX4Q.zz5i();
        this.zzX4Q.zzYC(true);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 3190, 63030, this.zzX4Q);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 3180, 54841, this.zzX4Q);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 54831, this.zzX4Q, zzX4O);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), 3220, 54850, this.zzX4Q);
        this.zzX4Q.zz5g();
        zzWg(13413, 4350);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), this.zzX4Q);
        zzS((PreferredWidth) ((zzY6G) this.zzZF0).get(4290));
        zzW9(54880, 4330);
        zzY9K.zzZ((zzY6G) this.zzZF0, this);
        zzWg(13414, 4360);
        this.zzX4Q.zzOo(54896);
        this.zzX4Q.zzOo(54897);
        this.zzX4Q.zzOo(54898);
        zzV9(63073, 4340);
        zzWc(29817, 4400);
        zzPG(true);
        zzWc(29801, 5015);
        zzW7(54887, 13928);
    }

    private void zzXX2() throws Exception {
        this.zzX4Q.zzZ(((zzY6G) this.zzZF0).zz5l());
        zzPG(false);
        if (((zzY6G) this.zzZF0).zzVE(4020) && !zzYmI()) {
            this.zzZzR.zzVA(38402, (((zzY6G) this.zzZF0).getLeftPadding() + ((zzY6G) this.zzZF0).getRightPadding()) / 2);
        }
        zzXWZ();
        zzWh(13316, 4040);
        zzPF(false);
        zzXWX();
        this.zzX4Q.zzZ(zzYmI(), this.zzX4R.zzZrd(), this.zzX4R.zzZrc(), ((zzY6G) this.zzZF0).zzYk9());
        this.zzX4Q.zzOo(54793);
        zzXWW();
        zzWe(22027, 4380);
        zz0(13837, 4150, 4160);
        zzW(37902, 4170, 4180, true);
        zzV(37903, 4190, 4200, true);
        zzWe(37904, 4210);
        zzWe(37905, 4220);
        this.zzX4Q.zzOo(54796);
        this.zzX4Q.zzOo(54802);
        zzPF(true);
        zzVa(62996, 4230);
        zzWh(13845, 4240);
        this.zzX4Q.zzOo(54806);
        zzZX(62999, 4250, 4253);
        zzZX(63000, 4260, 4261);
        this.zzX4Q.zz5h();
        zzWe(37918, 4270);
        zzWe(37919, 4280);
        zzY9K.zzZ(((zzY6G) this.zzZF0).zz5l(), this.zzX4Q);
        zzS((PreferredWidth) ((zzY6G) this.zzZF0).get(4290));
        if (!zzYmI()) {
            zzY9K.zzZ((zzY6G) this.zzZF0, this);
        }
        this.zzX4Q.zz5g();
        zzW9(54880, 4330);
        zzV9(63073, 4340);
        zzWg(13413, 4350);
        zzWg(13414, 4360);
        this.zzX4Q.zzOo(54896);
        this.zzX4Q.zzOo(54897);
        this.zzX4Q.zzOo(54898);
        zzWc(29817, 4400);
        zzWe(21642, 4010);
        zzWc(29801, 5015);
        zzW7(54887, 13928);
    }

    private void zzZX(int i, int i2, int i3) throws Exception {
        PreferredWidth preferredWidth = (PreferredWidth) ((zzY6G) this.zzZF0).get(i3);
        if (preferredWidth == null || !preferredWidth.zzYmB()) {
            zzV9(i, i2);
        } else {
            zzVa(i, i3);
        }
    }

    private zzZLN zzjQ(int i) throws Exception {
        this.zzZzR.zzq().zzH(0L);
        this.zzZzR.zzVy(25707, i);
        return new zzZLN(zzYmM());
    }

    public final zzY78 zzS(TableStyle tableStyle) throws Exception {
        this.zzZzR.zzq().zzH(0L);
        this.zzZF0 = tableStyle.zzZYf();
        this.zzX4Q.zzZ(this.zzZzR);
        if (tableStyle.zzZ7j() >= 15) {
            this.zzZzR.zzVA(22074, tableStyle.zzZ7j());
        }
        zzPF(true);
        zzV9(62999, 4250);
        zzY9K.zzZ((zzY6G) this.zzZF0, 54836, this, zzX4N);
        zzV9(63073, 4340);
        for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
            if (conditionalStyle.zzZYb()) {
                zzWP zzwpZz6G = conditionalStyle.zz6G();
                long jZzW8 = zzW8(54890, conditionalStyle.zzZYk());
                if (zzwpZz6G.contains(3060)) {
                    this.zzZzR.zzVB(13436, ((byte) zzwpZz6G.getVerticalAlignment()) & 255);
                }
                zzZZ(54399, zzwpZz6G.zz5A());
                zzZZ(54912, zzwpZz6G.zz5z());
                zzZZ(54913, zzwpZz6G.zz5y());
                zzZZ(54914, zzwpZz6G.zz5x());
                zzZZ(54915, zzwpZz6G.zz5u());
                zzZZ(54916, zzwpZz6G.zz5t());
                zzZZ(54917, zzwpZz6G.zz5v());
                zzZZ(54918, zzwpZz6G.zz5w());
                zzZX(54919, zzwpZz6G.get(3170));
                if (conditionalStyle.zzZYc()) {
                    zz7(13316, conditionalStyle.zzZYd().get(4040));
                }
                zzXq(jZzW8);
            }
        }
        if (this.zzZF0.contains(4500)) {
            this.zzZzR.zzVB(13448, ((Integer) this.zzZF0.get(4500)).intValue());
        }
        if (this.zzZF0.contains(4510)) {
            this.zzZzR.zzVB(13449, ((Integer) this.zzZF0.get(4510)).intValue());
        }
        if (this.zzZF0.contains(4290)) {
            zzS((PreferredWidth) this.zzZF0.get(4290));
        }
        zzZX(54919, tableStyle.zz6G().get(3170));
        if (tableStyle.zzZYd() != null && tableStyle.zzZYd().get(4360) != null) {
            zz7(13414, Boolean.valueOf(!((Boolean) tableStyle.zzZYd().get(4360)).booleanValue()));
        }
        return new zzY78(zzYmM());
    }

    @Override // com.aspose.words.zzYL1
    public final void zzYpe() throws Exception {
        if (this.zzX4T) {
            zzXX1();
        } else {
            zzXX2();
        }
    }

    @Override // com.aspose.words.zzZ98
    public final int zzYv(int i, int i2) {
        if (i2 == 1) {
            return 4300;
        }
        if (i2 == 2) {
            return 4020;
        }
        if (i2 != 4) {
            return i2 != 8 ? 0 : 4320;
        }
        return 4310;
    }

    @Override // com.aspose.words.zzZ98
    public final void zzZ(int i, int i2, int i3, int i4, Object obj) throws Exception {
        this.zzX4Q.zzM(i4, obj);
    }

    @Override // com.aspose.words.zzYL1
    public final void zzqA(int i) {
        throw new UnsupportedOperationException();
    }

    public final zzYNJ zzZ(Row row, zzYNJ zzynj, com.aspose.words.internal.zzZOW zzzow, zzZZ6 zzzz6) throws Exception {
        CellCollection cells = row.getCells();
        zzY6G zzy6gZzZYf = row.zzZYf();
        zzZ(cells, zzy6gZzZYf, false);
        zzZ(cells, zzy6gZzZYf);
        if (!zzzz6.zzZrb()) {
            zzY6G zzy6g = (zzY6G) row.zzZYf().zzXS2();
            zzZ(cells, zzy6g, true);
            zzZ(cells, zzy6g);
        }
        zzZLN zzzlnZzZ = zzZ(row.zzZYf(), true, zzzz6);
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzJ((short) (zzzlnZzZ.getData().length + zzynj.getData().length));
        zzzow.writeBytes(zzynj.getData());
        zzzow.writeBytes(zzzlnZzZ.getData());
        zzYNJ zzynjZzY = new zzYNJ(0, zzjQ(position).getData()).zzY((zzZLN) zzynj).zzY(zzZ(row.zzZYf(), false, zzzz6));
        row.zzZYf().zzXXc();
        return zzynjZzY;
    }

    private zzZLN zzZ(zzY6G zzy6g, boolean z, zzZZ6 zzzz6) throws Exception {
        this.zzX4T = z;
        this.zzX4R = zzzz6;
        this.zzX4Q.zzZ(this.zzZzR);
        this.zzX4S = zzy6g;
        if (z && !zzzz6.zzZrb()) {
            zzy6g = (zzY6G) zzy6g.zzXS2();
        }
        return new zzZLN(zzT(zzy6g));
    }

    private static void zzZ(CellCollection cellCollection, zzY6G zzy6g, boolean z) {
        zzWO zzwo = new zzWO();
        zzy6g.zzQ(5100, zzwo);
        Iterator<T> it = cellCollection.iterator();
        while (it.hasNext()) {
            WordAttrCollection wordAttrCollectionZz6G = ((Cell) it.next()).zz6G();
            if (z) {
                wordAttrCollectionZz6G = wordAttrCollectionZz6G.zzXS2();
            }
            zzwo.zzU(wordAttrCollectionZz6G);
        }
    }

    private void zzZ(CellCollection cellCollection, zzY6G zzy6g) {
        if (zzy6g.zz6D() || cellCollection.zz6D()) {
            zzZMK zzzmkZzYsN = zzy6g.zzYsN();
            if (zzzmkZzYsN == null) {
                Iterator<T> it = cellCollection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Cell cell = (Cell) it.next();
                    if (cell.zz6G().zzYsN() != null) {
                        zzZMK zzzmkZzYsN2 = cell.zz6G().zzYsN();
                        zzZMK zzzmk = new zzZMK(new zzY6G(), zzzmkZzYsN2.getAuthor(), zzzmkZzYsN2.zzZx());
                        zzy6g.zzZ(zzzmk);
                        zzzmkZzYsN = zzzmk;
                        break;
                    }
                }
            }
            zzY6G zzy6g2 = (zzY6G) zzzmkZzYsN.zzZ6C();
            zzWO zzwo = new zzWO();
            zzy6g2.zzQ(5100, zzwo);
            Iterator<T> it2 = cellCollection.iterator();
            while (it2.hasNext()) {
                zzZMK zzzmkZzYsN3 = ((Cell) it2.next()).zz6G().zzYsN();
                zzwo.zzU(zzzmkZzYsN3 != null ? zzzmkZzYsN3.zzZ6C() : this.zzX4P);
            }
        }
    }

    private void zzS(PreferredWidth preferredWidth) throws Exception {
        if (preferredWidth != null) {
            this.zzZzR.zzJ((short) -10701);
            this.zzZzR.writeByte((byte) 6);
            this.zzZzR.writeByte((byte) 0);
            this.zzZzR.writeByte((byte) 1);
            this.zzZzR.writeByte((byte) 15);
            this.zzZzR.writeByte((byte) preferredWidth.getType());
            this.zzZzR.zzK((short) preferredWidth.zzYmE());
        }
    }
}
