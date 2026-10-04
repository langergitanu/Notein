package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYAU extends zzYMD implements zzZAK {
    private int zzTL = Integer.MIN_VALUE;
    protected int zzXcV = Integer.MIN_VALUE;
    protected zzYAI zzXcW;
    private short zzXcX;
    private short zzXcY;
    private zzZ32 zzXcZ;
    private long zzZj6;
    private zzZAK zzZj7;
    private zzZAK zzZj8;

    private void zz6b() {
        if (zzY6S() == null || zzY6S().zza9().zz6y() != 16) {
            return;
        }
        zzY6S().zz6b();
    }

    private static boolean zzP(zzYAU zzyau, int i) throws Exception {
        if (zzyau == null) {
            return false;
        }
        if ((i & 1) > 0 && zzyau.zzZo6() == 10754) {
            return true;
        }
        if ((i & 2) > 0 && zzyau.zzY6D()) {
            return true;
        }
        if ((i & 4) > 0 && zzyau.zzZo6() == 25604) {
            return true;
        }
        if ((i & 8) <= 0 || !(zzyau instanceof zzYAD)) {
            return (i & 16) > 0 && zzyau.zzY73();
        }
        return true;
    }

    private int zzQE(boolean z) {
        if (!z || zzYol()) {
            return 0;
        }
        return this.zzXcZ.zzYKO().zzYN3();
    }

    private int zzY6I() throws Exception {
        if (zzY9R.zzlt(zzZo6())) {
            return this.zzXcZ.zzYKO().zzYN3();
        }
        return 0;
    }

    private void zzY6h() {
        if (zzYQ0()) {
            return;
        }
        this.zzXcW.zzZy((zzYAU) zzYo1());
        this.zzXcW.zzZz((zzYAU) zzYo0());
    }

    private boolean zzY6k() {
        zzYAH zzyahZzY6j = zzY6j();
        return zzyahZzY6j != null && zzyahZzY6j.getFieldType() == 70;
    }

    private int zzY6v() {
        return zzVG(448, 6);
    }

    private boolean zzY6w() throws Exception {
        return zzY7f() != 0;
    }

    private int zzY7h() throws Exception {
        zz0R zz0rZzYRr = zzYRr();
        if (zz0rZzYRr == null) {
            return 0;
        }
        return (int) (((double) this.zzXcZ.zzYKN().zzP2()) * zz0rZzYRr.zzZt3());
    }

    private int zzY7i() throws Exception {
        zz0R zz0rZzYRr = zzYRr();
        if (zz0rZzYRr == null) {
            return 0;
        }
        return (int) (((double) this.zzXcZ.zzYKN().zzP2()) * zz0rZzYRr.zzZt4());
    }

    private int zzY7j() throws Exception {
        return this.zzXcZ.zzYKN().zzP5() + zzY7h();
    }

    private int zzY7k() throws Exception {
        zzZ3A zzz3aZza7 = zzaa() == null ? ((zzZ55) zzZZJ()).zza7() : zza7();
        boolean noLeading = zzz3aZza7.getNoLeading();
        boolean suppressTopSpacingWP = zzz3aZza7.getSuppressTopSpacingWP();
        return ((noLeading || suppressTopSpacingWP) ? (!noLeading || suppressTopSpacingWP) ? !noLeading ? this.zzXcZ.zzYKN().zzP9() : this.zzXcZ.zzYKN().zzP6() - this.zzXcZ.zzYKN().zzPb() : this.zzXcZ.zzYKN().zzP6() : this.zzXcZ.zzYKN().zzPd() + this.zzXcZ.zzYKN().zzP6()) + zzY7i();
    }

    private zzYAU zzY7x() {
        zzY6S();
        zzZZJ();
        if (zzY6V() == null || ((zzZ55) zzY6V().zzZZJ()) != ((zzZ55) zzZZJ())) {
            return null;
        }
        return zzY6V();
    }

    private zzYAU zzY7y() {
        zzY6S();
        zzZZJ();
        if (zzY6U() == null || ((zzZ55) zzY6U().zzZZJ()) != ((zzZ55) zzZZJ())) {
            return null;
        }
        return zzY6U();
    }

    private int zzZ9q() throws Exception {
        return zzY7e() ? zzY72().zzZ9q() : this.zzXcZ.zzZ9q();
    }

    private void zzlR(int i) {
        zzZY(448, 6, i);
    }

    public int getBaseline() throws Exception {
        int iZzZX = zzY75() ? ((zzZ37) ((zzYMM) ((zzZ55) zzZZJ()).zza9()).zzYTt()).getLineSpacingRule() == 1 ? zzZ56.zzZX(this) : ((zzZ55) zzZZJ()).zzYQj().zzZY(this) : 0;
        zzZ32 zzz32 = this.zzXcZ;
        return (((zzZ55) zzZZJ()).getBaseline() + (zzz32 != null ? zzz32.zzYKM() : 0)) - iZzZX;
    }

    @Override // com.aspose.words.zzYMD
    public int getContentHeight() throws Exception {
        if (zzYol()) {
            return 0;
        }
        return this.zzXcZ.zzYKN().zzP2();
    }

    @Override // com.aspose.words.zzYMD
    public int getHeight() throws Exception {
        zzZZJ();
        return zzZZJ().getContentHeight();
    }

    @Override // com.aspose.words.zzZAK
    public final int getIndex() {
        return this.zzTL;
    }

    public int getLeader() {
        return 0;
    }

    public int getLength() throws Exception {
        return 0;
    }

    public boolean getNoSpaceRaiseLower() {
        return ((zzZ55) zzZZJ()).zza7().getNoSpaceRaiseLower();
    }

    public final int getScaledWidth(int i) throws Exception {
        return zzY7c() ? zzT9.zzS(i, zzZ9q() * zzY7d()) : zzT9.zzYf(i, zzZ9q());
    }

    public final int getSpacing() throws Exception {
        if (zzYol() || !zzY7g()) {
            return 0;
        }
        return (zzY6I() * 2) + zzY7k() + zzY7j();
    }

    public String getText() throws Exception {
        return null;
    }

    @Override // com.aspose.words.zzYMD
    public int getWidth() throws Exception {
        return zzZXS() + zz63() + zz62();
    }

    @Override // com.aspose.words.zzYMD
    public int getY() throws Exception {
        return ((zzZ55) zzZZJ()).getBaseline() - ((zzZ55) zzZZJ()).zzYQj().zzYdD;
    }

    public boolean isHorizontalRule() {
        return false;
    }

    @Override // com.aspose.words.zzYMD
    public void remove() throws Exception {
        zzY7z();
        super.remove();
    }

    public final void setContentWidth(int i) throws Exception {
        this.zzXcV = i;
    }

    @Override // com.aspose.words.zzYMD
    public final void setHeight(int i) {
    }

    @Override // com.aspose.words.zzZAK
    public final void setIndex(int i) {
        this.zzTL = i;
    }

    public void setLeader(int i) {
    }

    @Override // com.aspose.words.zzYMD
    public final void setWidth(int i) {
    }

    public int zz0R() throws Exception {
        return 0;
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Y() {
        zzY6S();
        zzZZJ();
        if (((zzYAU) zzYo0()) == null || ((zzZ55) ((zzYAU) zzYo0()).zzZZJ()) != ((zzZ55) zzZZJ())) {
            return null;
        }
        return (zzYAU) zzYo0();
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Z() {
        zzY6S();
        zzZZJ();
        if (((zzYAU) zzYo1()) == null || ((zzZ55) ((zzYAU) zzYo1()).zzZZJ()) != ((zzZ55) zzZZJ())) {
            return null;
        }
        return (zzYAU) zzYo1();
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 64;
    }

    public final int zz62() {
        return zzQE(zzE((short) 8));
    }

    public final int zz63() {
        return zzQE(zzE((short) 4));
    }

    public final boolean zzE(short s) {
        int i = s & 65535;
        return ((this.zzXcX & 65535) & i) == i;
    }

    public int zzHU() throws Exception {
        if (zzYol() || zzYRO()) {
            return 0;
        }
        return zzY7j();
    }

    public int zzHV() throws Exception {
        if (zzYol()) {
            return 0;
        }
        return zzY7k();
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzNd(int i) throws Exception {
        zzF(null);
        if ((i & 2) == 0) {
            return false;
        }
        if (zzZZJ() != null) {
            zzZZJ().zzNd(i);
        }
        if (zzaa() == null) {
            return false;
        }
        zzaa().zzZoU();
        return false;
    }

    public final void zzQA(boolean z) {
        zzZ((short) 32, z);
    }

    public final void zzQB(boolean z) {
        zzZ((short) 16, true);
    }

    public final void zzQC(boolean z) {
        zzZ((short) 8, z);
    }

    public final void zzQD(boolean z) {
        zzZ((short) 4, z);
    }

    public void zzQF(boolean z) throws Exception {
        if (z != zzYol()) {
            zzlR(z ? zzY6v() | 1 : zzY6v() & (-2));
            zzNd(3);
        }
    }

    public final void zzQG(boolean z) {
        zzlR(z ? zzY6v() | 2 : zzY6v() & (-3));
    }

    public final void zzQH(boolean z) {
        zzZ((short) 1, z);
    }

    public final void zzQI(boolean z) {
        zzY6u();
        this.zzXcW.zzQI(z);
    }

    public zzYBY zzQJ(boolean z) {
        throw new IllegalStateException();
    }

    public boolean zzQK(boolean z) throws Exception {
        return false;
    }

    public final void zzU(zzZ32 zzz32) throws Exception {
        if (com.aspose.words.internal.zzZKO.zzA(zzz32, this.zzXcZ)) {
            return;
        }
        this.zzXcZ = zzz32;
        if (zzZZJ() != null) {
            zzZZJ().zzNd(3);
        }
    }

    public final int zzVG(int i, int i2) {
        return (i & (this.zzXcX & 65535)) >> i2;
    }

    public int zzVH(int i, int i2) throws Exception {
        return zzY7c() ? zzT9.zzZ(i, i2, zzZ9q() * zzY7d(), zzY7f()) : zzT9.zzK(i, i2, zzZ9q(), zzY7f());
    }

    public void zzX(zzYCT zzyct) {
    }

    public final void zzY(zzZ33 zzz33) {
        zzY6u();
        if (com.aspose.words.internal.zzZKO.zzA(zzz33, this.zzXcW.zzY6M())) {
            return;
        }
        zzz33.isCached();
        this.zzXcW.zzY(zzz33);
        zzZZJ();
    }

    public final boolean zzY6A() {
        return zzY7u() == 3;
    }

    public final boolean zzY6B() {
        return this.zzXcZ.zzZr().zzOZ();
    }

    public final boolean zzY6C() {
        return zza7().zzYMA() && zzY6D();
    }

    public final boolean zzY6D() {
        return zzY7u() == 2;
    }

    public final boolean zzY6E() {
        return zzE((short) 32);
    }

    public final boolean zzY6F() {
        return (zzZZJ() != null && ((zzZ55) zzZZJ()).zzYQh()) || zzE((short) 16);
    }

    public final boolean zzY6G() {
        return zzE((short) 8);
    }

    public final boolean zzY6H() {
        return zzE((short) 4);
    }

    public final int zzY6J() {
        return getX() + zz63();
    }

    public final void zzY6K() throws Exception {
        this.zzXcV = Integer.MIN_VALUE;
        zzZ4N zzz4nZzYPe = zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX((zzYAU) zzYo1());
        zzz4nZzYPe.zzYPf();
        zzz4nZzYPe.movePrevious();
        zzZ((short) 8, ((zzYAU) zzYo1()).zzE((short) 8));
        if (((zzYAU) zzYo1()).zzYnY()) {
            ((zzZ55) ((zzYAU) zzYo1()).zzZZJ()).zzY(this);
        }
        if (((zzYAU) zzYo1()).zzYTn()) {
            ((zzYAU) zzYo1()).zzY6S().zzZM(this);
        }
        zzYo1().zzY(null);
        zzYo1().zzZ((zzZ6T) null);
        zzYo1().zzZ((zzY9C) null);
        zzu(zzYo1().zzYo1());
        zzYo1().zzt(this);
    }

    public final zzYAU zzY6L() {
        if (zzY6t()) {
            return this.zzXcW.zzY6L();
        }
        return null;
    }

    public final zzZ33 zzY6M() {
        if (zzY6t()) {
            return this.zzXcW.zzY6M();
        }
        return null;
    }

    public final zzZ32 zzY6N() {
        return this.zzXcZ;
    }

    public final zzYAU zzY6O() {
        return !zzYQ0() ? (zzYAU) zz5Y() : zzY7x();
    }

    public final zzYAU zzY6P() {
        return (zzYAU) zz5Y();
    }

    public final zzYAU zzY6Q() {
        return !zzYQ0() ? (zzYAU) zz5Z() : zzY7y();
    }

    public final zzYAU zzY6R() {
        return (zzYAU) zz5Z();
    }

    public final zzYMM zzY6S() {
        return (zzYMM) com.aspose.words.internal.zzZKW.zzZ(super.zza9(), zzYMM.class);
    }

    public final void zzY6T() {
        if (zzY6t()) {
            this.zzXcW.zzZy(null);
            this.zzXcW.zzZz(null);
        }
    }

    public final zzYAU zzY6U() {
        return zzYQ0() ? this.zzXcW.zzY6U() : (zzYAU) zzYo1();
    }

    public final zzYAU zzY6V() {
        return zzYQ0() ? this.zzXcW.zzY6V() : (zzYAU) zzYo0();
    }

    public final boolean zzY6W() {
        return zzaa() != null;
    }

    public final boolean zzY6X() {
        return zzY6S() != null;
    }

    public final zzYAU zzY6Y() {
        if (zzY6t()) {
            return this.zzXcW.zzY6Y();
        }
        return null;
    }

    public final boolean zzY6Z() {
        return (zzY6v() & 2) != 0;
    }

    public boolean zzY6g() throws Exception {
        return false;
    }

    public final boolean zzY6i() {
        zzYJ7 zzyj7ZzYSR = zza8().zzYSR();
        return ((this.zzXcZ.isDeleteRevision() || this.zzXcZ.isMoveFromRevision()) && (zzyj7ZzYSR.zzYkX() && !zzyj7ZzYSR.zzYkW())) || ((this.zzXcZ.isInsertRevision() || this.zzXcZ.isMoveToRevision()) && (zzyj7ZzYSR.zzYkX() && zzyj7ZzYSR.zzYkW())) || (zzyj7ZzYSR.getShowInBalloons() == 2 && !zzyj7ZzYSR.zzYkX() && this.zzXcZ.isDeleteRevision());
    }

    public final zzYAH zzY6j() {
        for (zzYAU zzyauZzY6Y = zzY6Y(); zzyauZzY6Y != null; zzyauZzY6Y = zzyauZzY6Y.zzY6Y()) {
            zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyauZzY6Y, zzYAH.class);
            if (zzyah != null) {
                return zzyah;
            }
        }
        return null;
    }

    public final boolean zzY6l() throws Exception {
        return zzY9R.zzmY(zzZo6()) || zzY6m();
    }

    public final boolean zzY6m() throws Exception {
        return zzZo6() == 25604 && !zzY6M().zzYLJ().isFloating();
    }

    public final boolean zzY6n() throws Exception {
        return zzY6m() && zzY7r() != 5121;
    }

    public final boolean zzY6o() throws Exception {
        return zzZo6() != 10783 && zzY6p();
    }

    public final boolean zzY6p() throws Exception {
        int iZzZo6 = zzZo6();
        if (iZzZo6 == 10754) {
            return !zzZf5();
        }
        if (iZzZo6 != 10782 && iZzZo6 != 10783) {
            switch (iZzZo6) {
                case 10768:
                case 10770:
                    break;
                case 10769:
                    return !zzY6k();
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean zzY6q() throws Exception {
        for (zzYAU zzyauZzT = zzVE.zzT((zzYAU) zz5Z()); zzyauZzT != null; zzyauZzT = zzVE.zzT((zzYAU) zzyauZzT.zz5Z())) {
            if (zzyauZzT.zzZo6() == 9747) {
                return true;
            }
            if (!zzyauZzT.zzY6o()) {
                return false;
            }
        }
        return false;
    }

    public final boolean zzY6r() throws Exception {
        for (zzYAU zzyauZzS = zzVE.zzS((zzYAU) zz5Y()); zzyauZzS != null; zzyauZzS = zzVE.zzS((zzYAU) zzyauZzS.zz5Y())) {
            if (zzyauZzS.zzZo6() == 9747) {
                return true;
            }
            if (!zzyauZzS.zzY6o()) {
                return false;
            }
        }
        return false;
    }

    public final boolean zzY6s() throws Exception {
        return zzY6r() || zzY6q();
    }

    public final boolean zzY6t() {
        return this.zzXcW != null;
    }

    public final void zzY6u() {
        if (zzY6t()) {
            return;
        }
        this.zzXcW = new zzYAI(this);
    }

    public boolean zzY6x() throws Exception {
        return false;
    }

    public boolean zzY6y() throws Exception {
        return false;
    }

    public final zzYAU zzY6z() throws Exception {
        zzYAU zzyauZzT = zzVE.zzT((zzYAU) zz5Z());
        if (zzyauZzT == null || zzyauZzT.zzZo6() != 9217) {
            return null;
        }
        return zzyauZzT;
    }

    public boolean zzY70() {
        return false;
    }

    public abstract zzYAU zzY71() throws Exception;

    public final zzZNV zzY72() {
        if (zzY6t()) {
            return this.zzXcW.zzY72();
        }
        return null;
    }

    public final boolean zzY73() {
        return !zzZNU.zzZ(this.zzXcZ.zzYKK(), zzZNU.zzYyn);
    }

    public final boolean zzY74() throws Exception {
        return zzZo6() == 25604 && zzY6M().zzYLJ().isFloating();
    }

    public final boolean zzY75() throws Exception {
        return (zzZo6() == 0 || zzY74()) ? false : true;
    }

    public final void zzY76() throws Exception {
        zzlU(0);
        boolean z = zzE((short) 4) || zzE((short) 8) || zzY6F();
        zzZ((short) 4, false);
        zzZ((short) 8, false);
        zzZ((short) 16, false);
        if (z) {
            zzNd(3);
        }
    }

    public boolean zzY77() {
        return false;
    }

    public final int zzY78() {
        if (zzY77() && zzY6t()) {
            return this.zzXcW.zzY78();
        }
        return 0;
    }

    public final void zzY79() {
        zzZ((short) 2, true);
    }

    public final boolean zzY7a() {
        return zzE((short) 2);
    }

    public boolean zzY7b() throws Exception {
        return this.zzXcZ.zzZz();
    }

    public boolean zzY7c() throws Exception {
        return false;
    }

    public float zzY7d() throws Exception {
        throw new IllegalStateException();
    }

    public final boolean zzY7e() {
        return (zzY72() == null || zzY72().zzZ9o()) ? false : true;
    }

    public int zzY7f() throws Exception {
        int iZzY78;
        if (zzY72() != null) {
            iZzY78 = zzY72().zzZ9r() == this ? zzY72().zzZ9p() : zzY72().getSpacing();
        } else {
            iZzY78 = zzY78() + (zzYPO() * (zzY6x() ? 2 : 1)) + (this.zzXcZ.getSpacing() * (zzY6y() ? 2 : 1));
        }
        return (iZzY78 == 0 || !this.zzXcZ.zzYKI()) ? iZzY78 : com.aspose.words.internal.zzSA.zzZ(iZzY78, this.zzXcZ.zzZ7e().getDpi());
    }

    public boolean zzY7g() throws Exception {
        return !zzYRO();
    }

    public zzYCT zzY7l() {
        return null;
    }

    public zzZKW zzY7m() throws Exception {
        return null;
    }

    public int zzY7n() {
        return 0;
    }

    public zzYAU zzY7o() {
        return null;
    }

    public void zzY7p() throws Exception {
    }

    public final void zzY7q() {
        zzY6u();
        this.zzXcW.zzlJ(EditingLanguage.ARABIC_ALGERIA);
    }

    public int zzY7r() throws Exception {
        return (!zzY6t() || this.zzXcW.zzY7r() == 0) ? zzY9R.zzlx(zzZo6()) : this.zzXcW.zzY7r();
    }

    public boolean zzY7s() {
        return false;
    }

    public boolean zzY7t() throws Exception {
        return false;
    }

    public int zzY7u() {
        return 0;
    }

    public final void zzY7v() {
        if (true != zzYol()) {
            zzlR(zzY6v() | 4);
            if (zzZZJ() != null) {
                zzZZJ();
            }
        }
    }

    public final boolean zzY7w() {
        return (zzY6v() & 4) != 0;
    }

    public void zzY7z() throws Exception {
        zzY44.zzZ5(this);
        zzY44.zzZ3(this);
        zz6b();
    }

    public boolean zzYKV() throws Exception {
        return false;
    }

    public int zzYKY() throws Exception {
        return UnicodeScript.UNKNOWN;
    }

    public com.aspose.words.internal.zzZQ5 zzYPH() throws Exception {
        int y;
        int iZzYQD;
        if (((zzZ37) ((zzYMM) ((zzZ55) zzZZJ()).zza9()).zzYTt()).getLineSpacingRule() == 1 || ((zzZ55) zzZZJ()).zzYQj().zzYQD() < ((zzZ55) zzZZJ()).getContentHeight()) {
            y = ((zzZ55) zzZZJ()).zzYQj().zzYdA;
            iZzYQD = ((zzZ55) zzZZJ()).zzYQj().zzYQD();
        } else {
            y = getY();
            iZzYQD = ((zzZ55) zzZZJ()).getContentHeight();
        }
        int iZzYN3 = this.zzXcZ.zzYKO().zzYN3();
        return new com.aspose.words.internal.zzZQ5(zzY6J(), y + iZzYN3, zzZXS(), iZzYQD - (iZzYN3 * 2));
    }

    public final int zzYPO() {
        if (!this.zzXcZ.getSnapToGrid()) {
            return 0;
        }
        if (((zzZ55) zzZZJ()) != null) {
            return ((zzZ55) zzZZJ()).zzYPO();
        }
        throw new IllegalStateException("Span.DocGridSpacing, container is null");
    }

    public final boolean zzYQ0() {
        if (zzY6t()) {
            return (this.zzXcW.zzY6U() == null && this.zzXcW.zzY6V() == null) ? false : true;
        }
        return false;
    }

    public final boolean zzYQ1() {
        if (zzZZJ() != null) {
            return ((zzZ55) zzZZJ()).zzYQ1();
        }
        throw new IllegalStateException("Span.IsInCellMarkedAsFitText, container is null");
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzYQq() {
        zzY6S();
        return ((zzYAU) zzYo1()) == null;
    }

    @Override // com.aspose.words.zzYMD
    public final boolean zzYQr() {
        zzY6S();
        return ((zzYAU) zzYo0()) == null;
    }

    public boolean zzYRO() throws Exception {
        return false;
    }

    public final zz0R zzYRr() {
        if (!this.zzXcZ.zzYKL().zzYKj()) {
            return null;
        }
        zzY5W zzy5w = new zzY5W(this.zzXcZ);
        zz0R zz0r = (zz0R) com.aspose.words.internal.zzQW.zzZ((Map<zzY5W, TValue>) this.zzXcZ.zzZoP().zzZAw, zzy5w);
        if (zz0r != null) {
            return zz0r;
        }
        zz0R zz0rZzZ = zz0R.zzZ(this.zzXcZ.zzYKN(), zzab().zzZCQ(), this.zzXcZ.zzYKL());
        com.aspose.words.internal.zzZQF.zzY(this.zzXcZ.zzZoP().zzZAw, zzy5w, zz0rZzZ);
        return zz0rZzZ;
    }

    public final int zzYTl() {
        int iZzVG = zzVG(57344, 13);
        return iZzVG > 6 ? this.zzXcW.zzYTl() : iZzVG;
    }

    @Override // com.aspose.words.zzYS
    public final void zzYU(boolean z) {
    }

    @Override // com.aspose.words.zzZAK
    public final void zzYg(long j) {
        this.zzZj6 = j;
    }

    public final int zzYjL() throws Exception {
        if (zzYol()) {
            return 0;
        }
        return zzYRO() ? zzHU() : getNoSpaceRaiseLower() ? zzHU() + zzY6I() : Math.max(0, zzHU() + zzY6I() + this.zzXcZ.getPosition());
    }

    public final int zzYjN() throws Exception {
        return zzYRO() ? zzHV() : getNoSpaceRaiseLower() ? zzHV() + zzY6I() : Math.max(0, (zzHV() + zzY6I()) - this.zzXcZ.getPosition());
    }

    public int zzYoJ() throws Exception {
        return this.zzXcZ.zzZr().zz5(getText());
    }

    public final zzJR zzYof() throws Exception {
        return (((zzZ55) zzZZJ()) == null || !zzY6g()) ? zzYBO.zzY8o() : ((zzYMM) ((zzZ55) zzZZJ()).zza9()).zzYof();
    }

    public boolean zzYol() {
        return (zzY6v() & 1) != 0;
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(zzY9C zzy9c) {
        super.zzZ((zzZ6T) zzy9c);
    }

    public int zzZ1s() {
        return 0;
    }

    public final void zzZA(zzYAU zzyau) {
        if (zzyau != null) {
            zzY6u();
        }
        if (zzY6t()) {
            this.zzXcW.zzZA(zzyau);
        }
    }

    public final void zzZB(zzYAU zzyau) throws Exception {
        zzyau.zzU(this.zzXcZ);
        zzyau.zzlT(zzYTl());
        zzyau.zzlR(zzY6v());
        if (zzY6t()) {
            if (this.zzXcW.zzY6M() == null && this.zzXcW.zzY6L() == null) {
                return;
            }
            zzYAI zzyai = new zzYAI(zzyau);
            zzyau.zzXcW = zzyai;
            zzyai.zzY(this.zzXcW.zzY6M());
            zzyau.zzXcW.zzZx(this.zzXcW.zzY6L());
        }
    }

    public void zzZC(zzYAU zzyau) {
    }

    public final boolean zzZSu() {
        if (zzY6t()) {
            return this.zzXcW.zzZSu();
        }
        return false;
    }

    @Override // com.aspose.words.zzZAK
    public final void zzZT1() {
        this.zzTL = Integer.MIN_VALUE;
    }

    @Override // com.aspose.words.zzZAK
    public final boolean zzZT2() {
        return this.zzTL == Integer.MIN_VALUE;
    }

    @Override // com.aspose.words.zzZAK
    public final long zzZT3() {
        return this.zzZj6;
    }

    @Override // com.aspose.words.zzZAK
    public final zzZAK zzZT4() {
        return this.zzZj7;
    }

    @Override // com.aspose.words.zzZAK
    public final zzZAK zzZT5() {
        return this.zzZj8;
    }

    public int zzZXS() throws Exception {
        if (zzYol()) {
            return 0;
        }
        if (Integer.MIN_VALUE == this.zzXcV) {
            this.zzXcV = zzVH(zzYoJ(), getLength());
        }
        return this.zzXcV;
    }

    public final void zzZY(int i, int i2, int i3) {
        this.zzXcX = (short) ((i & (i3 << i2)) | (this.zzXcX & 65535 & (~i)));
    }

    public final boolean zzZf(int i, boolean z) throws Exception {
        if (zzYnY()) {
            return false;
        }
        if ((zzY7r() != 5121 && zzY7r() != i) || zzY6Z() || ((zzYAU) zzYo1()).zzZo6() != zzZo6() || (((zzYAU) zzYo1()) instanceof zzYAA) || (((zzYAU) zzYo1()) instanceof zzYAD) || (((zzYAU) zzYo1()) instanceof zzYA3) || zzY7r() != ((zzYAU) zzYo1()).zzY7r() || zzY7w() != ((zzYAU) zzYo1()).zzY7w()) {
            return false;
        }
        if ((!com.aspose.words.internal.zzZKO.zzA(this.zzXcZ, ((zzYAU) zzYo1()).zzXcZ) && !this.zzXcZ.equals(((zzYAU) zzYo1()).zzXcZ)) || zzY6w() || ((zzYAU) zzYo1()).zzY6w() || ((zzYAU) zzYo1()).zzY6Z() != zzY6Z()) {
            return false;
        }
        if (getText() != null && ((zzYAU) zzYo1()).getText() != null) {
            if (getText().length() + ((zzYAU) zzYo1()).getText().length() > 16382) {
                return false;
            }
        }
        if (Integer.MAX_VALUE - zzZXS() < ((zzYAU) zzYo1()).zzZXS()) {
            return false;
        }
        zzY9S zzy9s = (zzY9S) com.aspose.words.internal.zzZKW.zzZ(this, zzY9S.class);
        if (zzy9s != null && (zzy9s.zzY5J() != 0 || (zzy9s.zzY6D() && zz0.zzZC(zzy9s.getText().charAt(0))))) {
            return false;
        }
        zzY9S zzy9s2 = (zzY9S) com.aspose.words.internal.zzZKW.zzZ((zzYAU) zzYo1(), zzY9S.class);
        if (zzy9s2 != null && (zzy9s2.zzY5J() != 0 || (zzy9s2.zzY6D() && zz0.zzZC(zzy9s2.getText().charAt(0))))) {
            return false;
        }
        if (zzY7u() != ((zzYAU) zzYo1()).zzY7u() && (zzY6D() || ((zzYAU) zzYo1()).zzY6D() || zzY6A() || ((zzYAU) zzYo1()).zzY6A())) {
            return false;
        }
        if ((zzZZJ().zz5T() && (zzE((short) 2) || ((zzYAU) zzYo1()).zzE((short) 2))) || zzY7b() != ((zzYAU) zzYo1()).zzY7b()) {
            return false;
        }
        if (zzZo6() == 9217) {
            if (z && Character.isDigit(getText().charAt(0)) != Character.isDigit(((zzYAU) zzYo1()).getText().charAt(0))) {
                return false;
            }
            if ((getText().charAt(0) == 0) != (((zzYAU) zzYo1()).getText().charAt(0) == 0)) {
                return false;
            }
        }
        return zzZSu() == ((zzYAU) zzYo1()).zzZSu() && zzE((short) 1) == ((zzYAU) zzYo1()).zzE((short) 1);
    }

    public final boolean zzZf5() {
        return this.zzXcZ.zzZr().zzPl().zzpA() && !this.zzXcZ.zzZr().zzPl().zzpz();
    }

    public final int zzZo2() {
        return this.zzXcY;
    }

    public abstract int zzZo6() throws Exception;

    public final void zzZw(zzYAU zzyau) throws Exception {
        zzZ4N zzz4nZzY4s = zzaa().zzY4s();
        zzz4nZzY4s.zzX(this);
        zzz4nZzY4s.zzU(zzyau);
        zzyau.zzU(this.zzXcZ);
        zzyau.zzZA(zzY6Y());
        zzyau.zzlT(zzYTl());
        zzyau.zzQG(zzY6Z());
        zzyau.setX(getX());
        zzyau.setY(getY());
        zzyau.zzZ((short) 4, zzE((short) 4));
        zzyau.zzZ((short) 8, zzE((short) 8));
        super.zzZ((zzZ6T) zzaa());
        this.zzXcV = Integer.MIN_VALUE;
        if (zzY6X()) {
            zzY6S();
            boolean zZzYTm = zzYTm();
            zzyau.zzZ(zzY6S());
            zzyau.zzu(this);
            zzyau.zzt(zzYo0());
            if (zzyau.zzYo0() != null) {
                ((zzYAU) zzyau.zzYo0()).zzu(zzyau);
            }
            zzt(zzyau);
            if (zZzYTm) {
                zzY6S().zzZN(zzyau);
            }
            ((zzZ55) zzZZJ()).zzU(zzyau);
            zzyau.zzZZJ();
            zzYTn();
        }
    }

    public final void zzZx(zzYAU zzyau) {
        zzY6u();
        this.zzXcW.zzZx(zzyau);
    }

    public final void zzZy(zzYAU zzyau) {
        zzY6u();
        zzY6h();
        this.zzXcW.zzZy(zzyau);
    }

    public final void zzZz(zzYAU zzyau) {
        zzY6u();
        zzY6h();
        this.zzXcW.zzZz(zzyau);
    }

    @Override // com.aspose.words.zzYS
    public final zzZ6T zza9() {
        return zzY6S();
    }

    @Override // com.aspose.words.zzYS
    public final boolean zzac() {
        return true;
    }

    public final boolean zzlQ(int i) throws Exception {
        if (zzP(zzVE.zzS((zzYAU) zz5Y()), i)) {
            return true;
        }
        return zzP(zzVE.zzT((zzYAU) zz5Z()), i);
    }

    public final int zzlS(int i) throws Exception {
        int iZz63 = i == 0 ? zz63() : 0;
        return i >= getLength() + (-1) ? iZz63 + zz62() : iZz63;
    }

    public final void zzlT(int i) {
        if (i >= 0 && i <= 6) {
            zzZY(57344, 13, i);
            return;
        }
        zzZY(57344, 13, 7);
        zzY6u();
        this.zzXcW.zzlT(i);
    }

    public final void zzlU(int i) {
        if (zzY77()) {
            if (i != 0 || zzY6t()) {
                zzY6u();
                this.zzXcW.zzlU(i);
                this.zzXcV = Integer.MIN_VALUE;
            }
        }
    }

    public char zzlV(int i) throws Exception {
        return getText().charAt(i);
    }

    public int zzlW(int i) throws Exception {
        return zzZXS() + zzlS(i);
    }

    public zzYAU zzlX(int i) throws Exception {
        throw new IllegalStateException();
    }

    public final void zzlY(int i) {
        this.zzXcY = (short) i;
    }

    public final void zzZ(zzZNV zzznv) {
        if (zzY6t() || zzznv != null) {
            zzY6u();
            this.zzXcW.zzZ(zzznv);
        }
    }

    public void zzZ(Map<zzYAU, zzYAU> map, zzYAU zzyau) {
        zzYAU zzyau2;
        if (zzyau.zzY6Y() != null) {
            zzZA((zzYAU) com.aspose.words.internal.zzQW.zzZ((Map<zzYAU, TValue>) map, zzyau.zzY6Y()));
        }
        if (zzyau.zzY7o() == null || (zzyau2 = (zzYAU) com.aspose.words.internal.zzQW.zzZ((Map<zzYAU, TValue>) map, zzyau.zzY7o())) == null) {
            return;
        }
        zzZC(zzyau2);
        zzyau2.zzZC(this);
    }

    @Override // com.aspose.words.zzZAK
    public final void zzY(zzZAK zzzak) {
        this.zzZj7 = zzzak;
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(zzZ6T zzz6t) {
        if (zzz6t == null && super.zza9() != null) {
            zzz6t = super.zza9().zzaa();
        }
        super.zzZ(zzz6t);
    }

    public final zzYAH zzZ(boolean z, int... iArr) {
        for (zzYAU zzyauZzY6Y = z ? zzY6Y() : this; zzyauZzY6Y != null; zzyauZzY6Y = zzyauZzY6Y.zzY6Y()) {
            zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyauZzY6Y, zzYAH.class);
            if (zzyah != null && (iArr.length == 0 || com.aspose.words.internal.zzZKV.zzZ(iArr, zzyah.getFieldType(), 0, iArr.length) >= 0)) {
                return zzyah;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZAK
    public final void zzZ(zzZAK zzzak) {
        this.zzZj8 = zzzak;
    }

    public final void zzZ(short s, boolean z) {
        if (z) {
            this.zzXcX = (short) ((s & 65535) | (this.zzXcX & 65535));
        } else {
            this.zzXcX = (short) ((~(s & 65535)) & this.zzXcX & 65535);
        }
    }
}
