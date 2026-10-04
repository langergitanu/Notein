package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6N extends zzZ6S {
    private ArrayList<zzY3C> zzYfl;
    private ArrayList<zzZ6Q> zzYfm;
    private int zzYfn;
    private Border zzYfo;
    private Border zzYfp;
    private com.aspose.words.internal.zzZZQ zzYfq;
    private com.aspose.words.internal.zzZQ4 zzYfr;
    protected float zzYfs;
    private zzZ55 zzYft;
    private Border zzZC1;
    private Border zzZC2;

    public zzZ6N(zzYMD zzymd) {
        super(zzymd);
        this.zzYfs = -3.4028235E38f;
        this.zzYfr = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzYfq = new com.aspose.words.internal.zzZZQ();
    }

    private TabStopCollection getTabStops() {
        TabStopCollection tabStopCollection = new TabStopCollection();
        zzZ37 zzz37 = (zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt();
        if (zzz37.zzYLI().zzYKy().length > 0) {
            int[] iArrZzYKy = zzz37.zzYLI().zzYKy();
            float[] fArr = new float[iArrZzYKy.length];
            for (int i = 0; i < iArrZzYKy.length; i++) {
                fArr[i] = iArrZzYKy[i] / 1000.0f;
            }
            int[] iArrZzYKz = zzz37.zzYLI().zzYKz();
            int[] iArrZzYKA = zzz37.zzYLI().zzYKA();
            for (int i2 = 0; i2 < zzz37.zzYLI().zzYKy().length; i2++) {
                tabStopCollection.add(fArr[i2], iArrZzYKA[i2], iArrZzYKz[i2]);
            }
        }
        return tabStopCollection;
    }

    private static boolean zzU(zzZ55 zzz55) throws Exception {
        zzZ4N zzz4nZzYPe = zzz55.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(((zzYMM) zzz55.zza9()).zzZ9s());
        while (zzz4nZzYPe.movePrevious()) {
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            if (((zzYAU) zzz55.zz6x()).zzYTl() != zzyau.zzYTl()) {
                return false;
            }
            if (zzY9R.zzmR(zzyau.zzZo6())) {
                return zzyau.zzY6Z();
            }
        }
        return false;
    }

    private static com.aspose.words.internal.zzZQ5 zzY(int i, int i2, com.aspose.words.internal.zzZQ5 zzzq5) {
        return new com.aspose.words.internal.zzZQ5(zzzq5.getX() + i, zzzq5.getY() + i2, zzzq5.getWidth(), zzzq5.getHeight());
    }

    private ArrayList<zzY3C> zzYSb() throws Exception {
        zzYMM zzymm;
        ArrayList<zzY3C> arrayList = new ArrayList<>();
        float[] fArrZzY0r = getTabStops().zzY0r();
        if (fArrZzY0r.length != 0) {
            float fZz5X = ((zzZ55) this.zzYgm).zzYQf() ? ((zzWT) ((zzZ55) this.zzYgm).zzZZJ()).zz5X() / 1000.0f : 0.0f;
            for (zzZ55 zzz55 = (zzZ55) this.zzYgm; zzz55 != null; zzz55 = (zzZ55) zzz55.zzYo1()) {
                if (!zzz55.zzYTn() || !zzY9R.zzmR(zzz55.zzYQc().zzZo6()) || (zzymm = (zzYMM) com.aspose.words.internal.zzZKW.zzZ(zzYSe().zzYTp(), zzYMM.class)) == null || !zzymm.zzYos().zzYQa()) {
                    zzYCP zzycpZzZ = zzZ(zzz55.getY(), zzz55.zzYQi().zzYPF());
                    if (!getShading().isVisible() && !zzz55.zzYQi().zzYPB().isVisible()) {
                        zzycpZzZ = new zzYCP(zzycpZzZ.getStart(), zzycpZzZ.getStart() + zzZ(zzycpZzZ.getStart(), zzycpZzZ.getLength(), zzz55));
                    }
                    float start = (zzycpZzZ.getStart() + zzz55.zzZXQ()) / 1000.0f;
                    float length = zzycpZzZ.getLength() / 1000.0f;
                    for (float width : fArrZzY0r) {
                        if (((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYSg()) {
                            width = (zzz55.getWidth() / 1000.0f) - width;
                        }
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzY3C(width + fZz5X, start, length));
                    }
                    if (zzz55 == zzYSj()) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private com.aspose.words.internal.zzZZQ zzYSc() throws Exception {
        com.aspose.words.internal.zzZZQ zzzzq = new com.aspose.words.internal.zzZZQ();
        for (zzZ55 zzz55 = (zzZ55) this.zzYgm; zzz55 != null; zzz55 = (zzZ55) zzz55.zzYo1()) {
            com.aspose.words.internal.zzZQ5 zzzq5ZzY = zzY(zzz55.getX(), zzz55.getY(), zzz55.zzYQi().zzYPH());
            com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(zzzq5ZzY.getX(), zzzq5ZzY.getY(), zzzq5ZzY.getWidth(), zzZ(zzzq5ZzY.getY(), zzzq5ZzY.getHeight(), zzz55));
            zzzzq.zzf(com.aspose.words.internal.zzSA.zzY(com.aspose.words.internal.zzZQ5.zzT(zzzq5.getLeft(), zzzq5.getTop() + zzz55.zzZXQ(), zzzq5.getRight(), zzzq5.getBottom() + zzz55.zzZXQ())));
            if (zzz55 == zzYSj()) {
                break;
            }
        }
        return zzzzq;
    }

    private com.aspose.words.internal.zzZQ4 zzYSd() throws Exception {
        com.aspose.words.internal.zzZQ5 zzzq5ZzY = zzY(((zzZ55) this.zzYgm).getX(), ((zzZ55) this.zzYgm).getY(), ((zzZ55) this.zzYgm).zzYQi().zzYPG());
        com.aspose.words.internal.zzZQ5 zzzq5ZzY2 = zzY(zzYSj().getX(), zzYSj().getY(), zzYSj().zzYQi().zzYPG());
        com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(zzzq5ZzY2.getX(), zzzq5ZzY2.getY(), zzzq5ZzY2.getWidth(), zzZ(zzzq5ZzY2.getY(), zzzq5ZzY2.getHeight(), zzYSj()));
        int iMin = Math.min(zzzq5ZzY.getLeft(), zzzq5.getLeft());
        int top = zzzq5ZzY.getTop();
        int iMax = Math.max(zzzq5ZzY.getRight(), zzzq5.getRight());
        int bottom = zzzq5.getBottom();
        int iZzZXQ = ((zzZ55) this.zzYgm).zzZXQ();
        return com.aspose.words.internal.zzSA.zzY(com.aspose.words.internal.zzZQ5.zzT(iMin, top + iZzZXQ, iMax, bottom + iZzZXQ));
    }

    private boolean zzYSf() throws Exception {
        if (((zzZ55) this.zzYgm).zzYQb()) {
            return false;
        }
        if (((zzZ55) this.zzYgm).zzYTm() || ((zzZ55) this.zzYgm).zzYQ3()) {
            return getOutlineLevel() != 9 || ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYop().size() > 0;
        }
        return false;
    }

    private zzZ55 zzYSj() {
        if (this.zzYft == null) {
            this.zzYft = ((zzZ55) this.zzYgm).zzYPZ();
        }
        return this.zzYft;
    }

    private float zzYSn() throws Exception {
        return zz8o().zz8R() + ((Math.max(((zzZ55) this.zzYgm).getRight(), ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYSj().getRight()) / 1000.0f) - zzYSp());
    }

    private float zzYSo() throws Exception {
        return (((zzZ55) this.zzYgm).getY() + ((zzZ55) this.zzYgm).zzYQj().zzYdy) / 1000.0f;
    }

    private float zzYSp() throws Exception {
        int x = ((zzZ55) this.zzYgm).getX();
        if (!((zzZ55) this.zzYgm).zzYQ9()) {
            x = ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYM7() + ((zzZ55) this.zzYgm).zzZZJ().zz5X();
        }
        return (x / 1000.0f) - zz8p().zz8R();
    }

    private boolean zzYSq() {
        return this.zzYfs < 0.0f;
    }

    private float zzYSr() throws Exception {
        if (zzYSq()) {
            this.zzYfs = ((zzYSj().getY() + zzYSj().zzYQj().zzYQD()) - ((zzZ55) this.zzYgm).getY()) / 1000.0f;
        }
        return this.zzYfs;
    }

    public final int getOutlineLevel() {
        return ((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).getOutlineLevel();
    }

    public final Shading getShading() {
        return zz5.zzZ(((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).zzYMW());
    }

    public final boolean isList() {
        return ((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).isList();
    }

    public final Border zz8m() throws Exception {
        if (this.zzYfo == null) {
            this.zzYfo = zz5.zzZ(zzYSj().zzYQi().zzYPB());
        }
        return this.zzYfo;
    }

    public final Border zz8n() throws Exception {
        if (this.zzZC1 == null) {
            this.zzZC1 = zz5.zzZ(((zzZ55) this.zzYgm).zzYQi().zzYPC());
        }
        return this.zzZC1;
    }

    public final Border zz8o() throws Exception {
        if (this.zzYfp == null) {
            this.zzYfp = zz5.zzZ(((zzZ55) this.zzYgm).zzYQi().zzYPD());
        }
        return this.zzYfp;
    }

    public final Border zz8p() throws Exception {
        if (this.zzZC2 == null) {
            this.zzZC2 = zz5.zzZ(((zzZ55) this.zzYgm).zzYQi().zzYPE());
        }
        return this.zzZC2;
    }

    public final zzYMM zzYSe() {
        return (zzYMM) ((zzZ55) this.zzYgm).zza9();
    }

    public final boolean zzYSg() {
        return ((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).zzYSg();
    }

    public final int zzYSh() {
        return ((zzYMM) ((zzZ55) this.zzYgm).zza9()).hashCode();
    }

    public final int zzYSi() {
        return ((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).zzYLL().getNumberStyle();
    }

    public final ArrayList<zzY3C> zzYSk() throws Exception {
        if (this.zzYfl == null) {
            this.zzYfl = zzYSb();
        }
        return this.zzYfl;
    }

    public final com.aspose.words.internal.zzZQ4 zzYSl() throws Exception {
        if (this.zzYfr.isEmpty()) {
            this.zzYfr = zzYSd();
        }
        return this.zzYfr;
    }

    public final com.aspose.words.internal.zzZZQ zzYSm() throws Exception {
        if (this.zzYfq.getCount() == 0) {
            this.zzYfq = zzYSc();
        }
        return this.zzYfq;
    }

    public final boolean zzYSs() throws Exception {
        if (this.zzYfn == 0) {
            zzYAU zzyauZzI = ((zzZ55) this.zzYgm).zzI(true, false);
            this.zzYfn = (zzyauZzI == null || zzyauZzI.zzZ(false, 13) == null) ? -1 : 1;
        }
        return this.zzYfn > 0;
    }

    public final boolean zzYSt() throws Exception {
        return !zzYSj().zzYnY() && zzYSj().zzYQi().zzUL(true);
    }

    public final boolean zzYSu() throws Exception {
        if (((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYoi()) {
            return false;
        }
        return ((zzZ55) this.zzYgm).zzYQi().zzYPE().isVisible() || ((zzZ55) this.zzYgm).zzYQi().zzYPD().isVisible() || ((zzZ55) this.zzYgm).zzYQi().zzYPC().isVisible() || zzYSj().zzYQi().zzYPB().isVisible();
    }

    public final ArrayList<zzZ6Q> zzYSv() throws Exception {
        if (this.zzYfm == null && zzYSf()) {
            ArrayList<String> arrayListZzU = ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzab().zzU((zzYMM) ((zzZ55) this.zzYgm).zza9());
            if (arrayListZzU == null || arrayListZzU.size() == 0) {
                return null;
            }
            this.zzYfm = new ArrayList<>();
            int i = ((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).getOutlineLevel() == 9 ? 1 : 0;
            int i2 = i ^ 1;
            for (int i3 = i2; i3 < arrayListZzU.size(); i3++) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYfm, new zzZ6Q(((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYop().get(i3 - i2).intValue(), arrayListZzU.get(i3)));
            }
            if (i == 0 && arrayListZzU.size() > 0) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYfm, new zzZ6Q(((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).getOutlineLevel(), arrayListZzU.get(0)));
            }
        }
        return this.zzYfm;
    }

    public final com.aspose.words.internal.zzZQ4 zzYSx() throws Exception {
        return new com.aspose.words.internal.zzZQ4(zzYSp(), zzYSo(), zzYSn(), zzYSr());
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzz61.zzX(this);
        long jZzYK = ((zzZ55) this.zzYgm).zzYK();
        zzYMD zzymdZz5Z = (zzZ55) this.zzYgm;
        while (zzymdZz5Z != null && zzymdZz5Z.zza9() == ((zzYMM) ((zzZ55) this.zzYgm).zza9())) {
            new zzZ6U(zzymdZz5Z, jZzYK).zzZ(zzz61);
            zzymdZz5Z = zzymdZz5Z.zz5Z();
        }
        this.zzYgb = zzymdZz5Z;
        zzz61.zzV(this);
    }

    public final int zzZ0C() {
        return ((zzZ37) ((zzYMM) ((zzZ55) this.zzYgm).zza9()).zzYTt()).zzYLL().getLevel();
    }

    private static zzYCP zzZ(int i, zzYCP zzycp) {
        return new zzYCP(zzycp.getStart() + i, zzycp.getEnd() + i);
    }

    private int zzZ(int i, int i2, zzZ55 zzz55) throws Exception {
        int iZzY8M;
        return (zzz55.zzYnY() && zzz55.zzZZJ().zz60() == 2048 && (((zzTF) zzz55.zzZZJ().zzYo1()) == null || ((zzTF) zzz55.zzZZJ().zzYo1()).isEmpty()) && !zzU(zzz55) && (i + i2) + zzYSj().zzYQj().zzYdu <= (iZzY8M = ((zzYC4) zzYSj().zzZZJ()).zzY8M())) ? iZzY8M - i : i2;
    }
}
