package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5B {
    private int zzYdX;
    private zzY9V zzYdY;
    private boolean zzYdZ;
    private zzVF zzYe0;
    private boolean zzYe1;
    private int zzYe2;
    private zzYAU zzYe3;
    private boolean zzYe4;
    private int zzYe5;
    private int zzYe6;
    private zzY76 zzYe7 = new zzY76();
    private zzVE zzYe8;
    private zzZ55 zzYeg;

    public static class zzX {
        private boolean zzYdJ;
        private boolean zzYdK;

        private zzX() {
        }

        public final void zzB(zzYAU zzyau) throws Exception {
            boolean z = false;
            if (!zzyau.zzY6o() || zzZ5B.zzS(zzyau.zzY6S()) || zzyau.zza7().getWrapTrailSpaces()) {
                this.zzYdK = false;
                this.zzYdJ = false;
            } else {
                if (this.zzYdK || this.zzYdJ) {
                    return;
                }
                if (zzyau.zza7().zzYMA() && zzyau.zzY6s()) {
                    z = true;
                }
                this.zzYdK = z;
                this.zzYdJ = !z;
            }
        }

        public final boolean zzYQI() {
            return this.zzYdJ;
        }

        public final boolean zzYQJ() {
            return this.zzYdK;
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static class zzZ {
        private int zzZn;
        static zzZ zzYdW = new zzZ(1);
        static zzZ zzYdV = new zzZ(-1);
        static zzZ zzYdU = new zzZ(0);

        private zzZ(int i) {
            this.zzZn = i;
        }

        public static boolean zzZ(zzZ zzz) {
            int i = zzz.zzZn;
            return i == -1 || i == 1;
        }

        public final boolean zzjR() {
            return this.zzZn != 1;
        }
    }

    public zzZ5B(zzZ55 zzz55, int i) {
        this.zzYeg = zzz55;
        this.zzYe6 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzE(zzZ55 zzz55) throws Exception {
        if (!((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLG() || zzz55.zzYQi().zzYPD().zzu4() > 0.0f || zzz55.zz5T()) {
            return false;
        }
        zzZ3A zzz3aZza7 = ((zzYMM) zzz55.zza9()).zza7();
        return (!zzz3aZza7.zzZYM() && zzz3aZza7.zzYMB() && ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).getAlignment() != 9) || (zzz3aZza7.zzZYM() && ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).getAlignment() == 3);
    }

    private static boolean zzM(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzYAU zzyauZzY = zzVE.zzY((zzYAU) zzyau.zzYo0(), zzyau2);
        return zzyauZzY != null && zzyauZzY.zzY6A();
    }

    private static boolean zzN(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        while (zzyau != null) {
            if (zzyau.zzZo6() == 10754) {
                return true;
            }
            if (zzyau == zzyau2) {
                return false;
            }
            zzyau = (zzYAU) zzyau.zzYo1();
        }
        return false;
    }

    private zzZ zzP(RefInt refInt) throws Exception {
        if (refInt.get() == Integer.MAX_VALUE) {
            if (this.zzYe8.zz14() instanceof zzY9U) {
                com.aspose.words.internal.zzZKW.zzZ(this.zzYe8.zz14(), zzY9U.class);
            }
            if (((zzYAU) this.zzYeg.zz6x()) != this.zzYe8.zz14()) {
                this.zzYe8.movePrevious();
                this.zzYe4 = true;
                return zzZ.zzYdW;
            }
            refInt.set(0);
        }
        return zzZ.zzYdU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzS(zzYMM zzymm) {
        return !((zzZ37) zzymm.zzYTt()).getWordWrap() && zzZ3X.zzwL(zzymm.zzZ9r().zzY6N().getLocaleIdFarEast());
    }

    private static zzYAU zzT(zzVE zzve) throws Exception {
        zzYAU zzyauZz14 = null;
        while (zzve.zz14().zzY6p()) {
            zzyauZz14 = zzve.zz14();
            zzve.zz0X();
        }
        return zzyauZz14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzZ5C[] zzV(boolean z, int i) throws Exception {
        int i2;
        boolean z2;
        zzZ5C zzz5c;
        boolean z3;
        boolean zIsAbsolute;
        boolean zZzZVX;
        int i3;
        zzVE zzve = this.zzYe8;
        if (zzve != null) {
            zzve.zz14();
        }
        byte b = 0;
        zzX zzx = new zzX(b);
        zzY zzy = new zzY(this.zzYeg, this.zzYe8);
        this.zzYdX = this.zzYeg.getWidth() + i;
        boolean zZzZ = zzZNV.zzZ(this.zzYeg);
        boolean z4 = !zZzZ;
        boolean z5 = i > 0;
        zzZ zzZ2 = zzZ.zzYdV;
        boolean z6 = z4;
        zzVF zzvf = null;
        boolean z7 = false;
        while (true) {
            if (!zzZ2.zzjR()) {
                break;
            }
            if (!zZzZ) {
                zzZ2 = zzYQU();
                if (zzZ.zzZ(zzZ2)) {
                    continue;
                }
            }
            this.zzYe8.zz14();
            zzk(this.zzYe8.zz14());
            if (z) {
                this.zzYe8.zz14().zzY76();
            }
            zzx.zzB(this.zzYe8.zz14());
            zzy.zzB(this.zzYe8.zz14());
            int iZzYQT = zzYQT();
            boolean z8 = (this.zzYe8.zz14().zzY7r() != 5121 || this.zzYe8.zz14().zzZo6() == 12803) ? b : 1;
            boolean z9 = zzY9R.zzmY(this.zzYe8.zz14().zzZo6()) || (this.zzYe8.zz14().zzY6o() && (zzS(this.zzYe8.zz14().zzY6S()) || this.zzYeg.zza7().getWrapTrailSpaces()));
            int iZzQ = this.zzYdX - iZzYQT;
            boolean z10 = zZzZ;
            if (this.zzYe8.zz14().zzY6N().zzYKI()) {
                z3 = z5;
                iZzQ = com.aspose.words.internal.zzSA.zzQ(iZzQ, this.zzYe8.zz14().zzY6N().zzZ7e().getDpi());
            } else {
                z3 = z5;
            }
            boolean z11 = (z9 || zzx.zzYQJ()) && (iZzQ >= 0 || z10);
            if (!z11) {
                zzZ2 = zzZ(zzx.zzYQJ(), z6, iZzYQT);
                if (!zzZ.zzZ(zzZ2)) {
                    if (z3) {
                        zzZ2 = zzZ(zzx.zzYQI(), zzy.zzYQK());
                        if (!zzZ.zzZ(zzZ2)) {
                            boolean z12 = this.zzYe8.zz14().isHorizontalRule() ? true : z7;
                            zzZ2 = zzZ(z8, z11, z12, zzx.zzYQI());
                            if (!zzZ.zzZ(zzZ2)) {
                                zzZ2 = zzYQS();
                                if (!zzZ.zzZ(zzZ2)) {
                                    if (zzY9R.zzmW(this.zzYe8.zz14().zzZo6()) && !this.zzYe8.zz14().zzYKV()) {
                                        this.zzYe4 = true;
                                        break;
                                    }
                                    if (!this.zzYe8.zz14().zzY6o() || (!z12 && !this.zzYeg.zza7().getWrapTrailSpaces() && !zzS(this.zzYe8.zz14().zzY6S()) && !zzx.zzYQJ())) {
                                        this.zzYe8.zz14().zzY6o();
                                    }
                                    if (!z12 || !this.zzYe8.zz14().zzY6p()) {
                                        RefInt refInt = new RefInt(zzYQO());
                                        zzZ2 = zzP(refInt);
                                        boolean zZzZ2 = zzZ.zzZ(zzZ2);
                                        int i4 = refInt.get();
                                        if (!zZzZ2) {
                                            int iZzY0y = this.zzYe5 + i4;
                                            this.zzYe5 = iZzY0y;
                                            if (this.zzYe8.zz14().zzZo6() == 12803) {
                                                zzY9U zzy9u = (zzY9U) this.zzYe8.zz14();
                                                zZzZVX = this.zzYe7.zzZVX();
                                                zIsAbsolute = zzy9u.isAbsolute();
                                                if (i4 == 0) {
                                                    iZzY0y += this.zzYe7.zzY0y();
                                                }
                                                if (zzZYM() && this.zzYe7.zzY0v() && this.zzYe7.zzZVX() && !this.zzYdZ) {
                                                    this.zzYdX += ((zzYMM) this.zzYeg.zza9()).zzYM4();
                                                    this.zzYdZ = true;
                                                }
                                                i2 = 2;
                                                this.zzYeg.zzUO(this.zzYe7.zzY0x() == 2 || this.zzYe7.zzY0x() == 1 || this.zzYe7.zzY0x() == 3);
                                            } else {
                                                i2 = 2;
                                                zIsAbsolute = false;
                                                zZzZVX = false;
                                            }
                                            if (z6 && this.zzYe8.zz14().zzY7r() != 5121) {
                                                int i5 = this.zzYe5 - i4;
                                                if (!zzZYM() && zZzZVX && !zIsAbsolute && iZzY0y >= this.zzYdX) {
                                                    if (this.zzYe8.movePrevious()) {
                                                        if (this.zzYe8.zz14().zzY6p() && i5 >= this.zzYdX) {
                                                            this.zzYe4 = true;
                                                            break;
                                                        }
                                                        this.zzYe8.moveNext();
                                                    }
                                                    z6 = false;
                                                } else if (this.zzYe7.zzY0z() == null && this.zzYe5 > this.zzYdX) {
                                                    this.zzYe4 = false;
                                                    zzZ2 = zzYQP();
                                                    if (!zzZ.zzZ(zzZ2)) {
                                                        zzZ2 = zzZ(zzy.zzYQK());
                                                        if (!zzZ.zzZ(zzZ2)) {
                                                            RefBoolean refBoolean = new RefBoolean(this.zzYe4);
                                                            Ref<zzVF> ref = new Ref<>(zzvf);
                                                            zzZ2 = zzy.zzZ(i5, this.zzYe5, this.zzYdX, this.zzYe0, refBoolean, ref);
                                                            this.zzYe4 = refBoolean.get();
                                                            zzvf = ref.get();
                                                            if (!zzZ.zzZ(zzZ2)) {
                                                                this.zzYe8.movePrevious();
                                                                if (this.zzYe8.zz14().zzY7r() == 5121) {
                                                                    this.zzYe8.moveNext();
                                                                    if (this.zzYe8.zz12()) {
                                                                        this.zzYe8.moveNext();
                                                                        if (zzY9R.zzmW(this.zzYe8.zz14().zzZo6())) {
                                                                            i3 = 1;
                                                                            this.zzYe4 = true;
                                                                        } else {
                                                                            i3 = 1;
                                                                            this.zzYe8.movePrevious();
                                                                        }
                                                                    } else {
                                                                        i3 = 1;
                                                                    }
                                                                    if ((this.zzYeg.zzYPU() != i3 || !z3) && zzZ58.zzZ(this.zzYeg, this.zzYe7, i, this.zzYe8, i5)) {
                                                                        if (this.zzYeg.zzYPU() == 1) {
                                                                            zzz5c = new zzZ5C(this.zzYe8.zz14(), this.zzYe8.getIndex(), true, null);
                                                                        } else {
                                                                            this.zzYe4 = true;
                                                                            zzz5c = null;
                                                                            z2 = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (this.zzYe8.isLast()) {
                                                break;
                                            }
                                            this.zzYe8.moveNext();
                                        }
                                    } else {
                                        this.zzYe8.movePrevious();
                                        break;
                                    }
                                }
                            }
                            z7 = z12;
                        }
                    }
                }
                zZzZ = z10;
                z5 = z3;
                b = 0;
            }
        }
        zzz5c = null;
        z2 = false;
        boolean zZzYQN = zzy.zzYQN();
        zzVF zzvf2 = zZzYQN ? new zzVF(this.zzYe8.zz14(), this.zzYe8.getIndex()) : null;
        if (!this.zzYe4) {
            zzZ(this.zzYeg, this.zzYe8, zzy.zzYQK(), this.zzYdZ, this.zzYdY);
        }
        if (zZzYQN) {
            if (zzvf2.zzY(this.zzYe8.zz0V())) {
                zzYAN.zzZ(zzy.zzYQM(), zzy.zzYQL());
            } else {
                this.zzYe0 = new zzVF(this.zzYe8.zz14(), this.zzYe8.getIndex());
            }
            this.zzYe3 = null;
        }
        zzZ5C[] zzz5cArr = new zzZ5C[i2];
        zzZ5C zzz5c2 = new zzZ5C(this.zzYe8.zz14(), this.zzYe8.getIndex(), z2, zzvf);
        if (zzz5c == null) {
            zzz5cArr[0] = zzz5c2;
            zzz5cArr[1] = null;
            return zzz5cArr;
        }
        zzz5cArr[0] = zzz5c;
        zzz5cArr[1] = zzz5c2;
        this.zzYe8.zzX(zzz5c.zzYQY());
        return zzz5cArr;
    }

    private zzZ5C zzW(zzVF zzvf) throws Exception {
        zzZ7A zzz7aZzZ = zzZ7A.zzZ(this.zzYeg.zza7());
        zzVE zzve = new zzVE(zzvf.zz14(), null);
        zzve.zzX(zzvf);
        while (zzve.moveNext() && zzY9R.zzmY(zzve.zz14().zzZo6())) {
            if (zzve.zz14().zzZo6() == 9217 && zzve.getCharacter() == '-' && (!zzve.zz12() || !zzve.zz14().zzY6q())) {
                zzve.moveNext();
                if (zzZ5H.zzs(zzve.zz14()) && (zzz7aZzZ == null || !zzz7aZzZ.zzW(zzve))) {
                    zzve.movePrevious();
                    return new zzZ5C(zzve.zz14(), zzve.getIndex(), false, null);
                }
                zzve.movePrevious();
            }
        }
        return null;
    }

    private static boolean zzX(zzZ3A zzz3a) {
        return (zzz3a.zzYMw() == 0 && zzz3a.zzYMB() && zzz3a.zzYMx() != 0) ? false : true;
    }

    public static boolean zzY(zzZ3A zzz3a) {
        return zzz3a.zzZYM() || !zzz3a.zzYMB() || zzz3a.zzYMx() == 0;
    }

    private int zzYQO() throws Exception {
        return this.zzYe8.zz14().zzZo6() == 12803 ? this.zzYe7.zzZ(this.zzYeg, this.zzYe6, (zzY9U) this.zzYe8.zz14(), this.zzYe5) : this.zzYe8.zz11();
    }

    private zzZ zzYQP() throws Exception {
        if (!this.zzYe8.isFirst()) {
            return zzZ.zzYdU;
        }
        this.zzYe4 = true;
        this.zzYe8.isFirst();
        this.zzYe8.isLast();
        zzY9R.zzmW(this.zzYe8.zz14().zzZo6());
        if (this.zzYe8.zz14().zzY6p() && !this.zzYe8.zz14().zza7().getWrapTrailSpaces()) {
            zzS(this.zzYe8.zz14().zzY6S());
        }
        boolean z = this.zzYe8.zz14().zzZo6() == 25604 && ((zzY9X) this.zzYe8.zz14()).zzY53().zzZid();
        this.zzYe8.moveNext();
        if (zzY9R.zzmW(this.zzYe8.zz14().zzZo6())) {
            if ((z || this.zzYe8.zz14().zzZo6() == 21514) && !zzZYM()) {
                this.zzYe8.movePrevious();
            }
            return zzZ.zzYdW;
        }
        if (!zzZYM()) {
            this.zzYe8.movePrevious();
            return zzZ.zzYdW;
        }
        if (this.zzYe8.zz14().zzY6p() && !zzS(this.zzYe8.zz14().zzY6S())) {
            zzT(this.zzYe8);
        }
        if (this.zzYe8.zz14().zzZo6() == 10528) {
            this.zzYe8.zz0X();
            zzY9R.zzmW(this.zzYe8.zz14().zzZo6());
            return zzZ.zzYdW;
        }
        if (!zzY9R.zzmW(this.zzYe8.zz14().zzZo6())) {
            this.zzYe8.movePrevious();
        }
        return zzZ.zzYdW;
    }

    private void zzYQQ() throws Exception {
        this.zzYe4 = true;
        if (this.zzYe8.movePrevious()) {
            this.zzYe8.zz14();
            zzYAU zzyauZz14 = this.zzYe8.zz14();
            while (zzyauZz14 != null && zzyauZz14.zzZo6() != 10754) {
                zzyauZz14 = ((zzZ55) zzyauZz14.zzZZJ()) == this.zzYeg ? (zzYAU) zzyauZz14.zz5Y() : (zzYAU) zzyauZz14.zzYo0();
            }
            if (zzyauZz14 == null) {
                zzyauZz14 = this.zzYe8.zz14();
            }
            this.zzYe8.zzU(zzyauZz14);
        }
    }

    private void zzYQR() throws Exception {
        this.zzYe5 = this.zzYe7.zzX(this.zzYe8.zz14(), this.zzYe5, this.zzYdX);
        if (this.zzYe7.zzY0z().isAbsolute() && this.zzYe5 > this.zzYeg.getWidth()) {
            this.zzYe4 = false;
        }
        this.zzYe8.zzV((zzYAU) this.zzYe7.zzY0z().zzYo1());
        if (this.zzYe8.zz14().zzZZJ() != null) {
            this.zzYe8.zz14().zza9();
        }
        this.zzYe1 = this.zzYe7.zzY0x() == 3;
        this.zzYe7.reset();
    }

    private zzZ zzYQS() throws Exception {
        if (this.zzYe7.zzY0z() == null || !(this.zzYe8.zz14().zzZo6() == 12803 || zzY9R.zzmW(this.zzYe8.zz14().zzZo6()))) {
            return zzZ.zzYdU;
        }
        zzYQR();
        return zzZ.zzYdV;
    }

    private int zzYQT() throws Exception {
        if (this.zzYe8.zz14().zzZo6() != 11799) {
            return this.zzYe5 + this.zzYe8.zz14().getWidth();
        }
        zzY9V zzy9v = (zzY9V) this.zzYe8.zz14();
        int iZzY4R = this.zzYe5 + zzy9v.zzY4R();
        if (this.zzYdX >= iZzY4R) {
            this.zzYdY = zzy9v;
        }
        return iZzY4R;
    }

    private zzZ zzYQU() throws Exception {
        if (!zzk(this.zzYe8.zz14())) {
            return zzZ.zzYdU;
        }
        zzZNV zzznvZzl = zzl(this.zzYe8.zz14());
        zzYAU zzyauZzT = zzVE.zzT((zzYAU) this.zzYeg.zz6x());
        if (this.zzYe5 + zzznvZzl.getWidth() <= this.zzYdX || zzznvZzl.zzZ9s() == zzyauZzT) {
            this.zzYe5 += zzznvZzl.getWidth();
            this.zzYe8.zzV((zzYAU) zzznvZzl.zzZ9r().zzYo1());
            return zzZ.zzYdV;
        }
        this.zzYe8.zzV(zzznvZzl.zzZ9s());
        this.zzYe8.movePrevious();
        this.zzYe4 = false;
        return zzZ.zzYdW;
    }

    private void zzYQV() throws Exception {
        zzVE zzve = new zzVE((zzYAU) this.zzYeg.zz6x(), null);
        this.zzYe8 = zzve;
        zzve.zz0Z();
        this.zzYe5 = 0;
        this.zzYe4 = true;
        this.zzYe3 = null;
        this.zzYe2 = 0;
        this.zzYeg.zzxE(0);
        this.zzYeg.zzUO(false);
        this.zzYdZ = false;
        this.zzYdY = null;
    }

    private zzZ5C zzZ(zzVF zzvf, zzY76 zzy76) throws Exception {
        zzVE zzve = new zzVE(zzvf.zz14(), null);
        zzve.zzX(zzvf);
        zzve.moveNext();
        zzVF zzvfZzZ = zzZ58.zzZ(this.zzYeg, zzve.zz0V(), zzy76);
        if (zzvfZzZ == null) {
            return null;
        }
        return new zzZ5C(zzvfZzZ.zz14(), zzvfZzZ.getIndex(), true, null);
    }

    private boolean zzZYM() {
        return this.zzYeg.zza7().zzZYM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzh(zzYAU zzyau) throws Exception {
        if (!zzY9R.zzmY(zzyau.zzZo6()) || (zzyau instanceof zzY9P)) {
            return false;
        }
        zzZ3A zzz3aZza7 = zzyau.zza7();
        if (zzyau.zzY6N().zzYL3() && com.aspose.words.internal.zzJF.zzZB(zzyau.zzY6N().zzZr().zzPh()) && !zzz3aZza7.zzZYM() && zzz3aZza7.zzYMw() != 0) {
            return false;
        }
        if (!zzz3aZza7.zzZYM() && zzz3aZza7.zzYMx() != 0) {
            RefInt refInt = new RefInt(0);
            zzYAU zzyauZzZ = zzZ(zzyau, refInt);
            refInt.get();
            if (zzyauZzZ.zzZo6() == 21537) {
                return false;
            }
        }
        return !zzz3aZza7.zzZYM() || zzz3aZza7.zzYMB();
    }

    private static boolean zzi(zzYAU zzyau) throws Exception {
        if (((zzZ37) zzyau.zzY6S().zzYTt()).getWordWrap()) {
            return false;
        }
        return (!zzyau.zzY6D() && (zzZ3X.zzwL(zzyau.zzY6S().zzZ9r().zzY6N().getLocaleIdFarEast()) || zzZ3X.zzwL(zzyau.zzY6N().getLocaleIdFarEast()))) || com.aspose.words.internal.zzUX.zzI(zzyau.getText().charAt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzj(zzYAU zzyau) throws Exception {
        return zzZ5H.zzs(zzyau) && zzyau.zzZo6() != 12803;
    }

    private static boolean zzk(zzYAU zzyau) throws Exception {
        if (zzyau.zza7().zzYMt() && zzZNV.zzBF(zzyau.zzZo6()) && !zzyau.zzYRO()) {
            return zzyau.zzY73() || zzyau.zzYQ1();
        }
        return false;
    }

    private static zzZNV zzl(zzYAU zzyau) throws Exception {
        if (zzyau.zzY72() == null) {
            zzZNV.zzz(zzyau);
        }
        return zzyau.zzY72();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzxL(int i) {
        return i == 2 || i == 1024 || i == 16384 || i == 4096;
    }

    public final zzZ5C zzUT(boolean z) throws Exception {
        int iZzZ;
        zzZ5C zzz5cZzW;
        zzYQV();
        zzZ5C[] zzz5cArrZzV = zzV(z, 0);
        zzZ5C zzz5cZzZ = zzz5cArrZzV[0];
        zzZ5C zzz5c = zzz5cArrZzV[1];
        this.zzYeg.zzUN(zzz5cZzZ.zzYQW());
        this.zzYe8.zz14();
        if (this.zzYe3 != null && ((((zzYAU) this.zzYe8.zz14().zzYo1()) == null || ((zzYAU) this.zzYe8.zz14().zzYo1()).zzZo6() != 12803 || zzN((zzYAU) this.zzYe8.zz14().zzYo1(), this.zzYe3)) && (iZzZ = zzZ5H.zzZ((zzYAU) this.zzYeg.zz6x(), this.zzYe3, this.zzYeg.zzYPU())) > 0)) {
            int iZzYPU = this.zzYeg.zzYPU();
            if (iZzYPU == 1) {
                zzz5cZzW = zzW(zzz5cZzZ.zzYQY());
                if (zzz5cZzW == null) {
                    zzz5cZzW = zzZ(zzz5cZzZ.zzYQY(), this.zzYe7);
                    zzZ(this.zzYe2, this.zzYe3);
                    zzZ5C[] zzz5cArrZzV2 = zzV(z, iZzZ);
                    if (zzz5cZzW == null || zzY9B.zzC(zzz5cZzW.zzYQY().zz14(), zzz5cArrZzV2[0].zzYQY().zz14())) {
                        zzz5cZzW = zzz5cArrZzV2[0];
                    }
                }
            } else if (iZzYPU != 2) {
                zzz5cZzW = null;
            } else {
                zzz5cZzW = zzZ(zzz5cZzZ.zzYQY(), this.zzYe7);
                if (zzz5cZzW == null) {
                    zzZ(this.zzYe2, this.zzYe3);
                    zzz5cZzW = zzV(z, iZzZ)[0];
                }
            }
            zzz5cZzZ = zzZ(zzz5cZzZ, (zzz5c != null ? zzz5c : zzz5cZzZ).zzZ(zzz5cZzW) ? null : zzz5cZzW, zzz5c, this.zzYeg, this.zzYe7, iZzZ);
        }
        if (this.zzYe0 != null) {
            zzYQV();
            zzz5cZzZ = zzV(z, 0)[0];
            this.zzYeg.zzUN(zzz5cZzZ.zzYQW());
        }
        this.zzYe7.zzZR(this.zzYeg);
        return zzz5cZzZ;
    }

    private void zzZ(int i, zzYAU zzyau) throws Exception {
        this.zzYe4 = true;
        this.zzYe5 = i;
        this.zzYe8.zzV(zzyau);
    }

    private zzZ zzZ(boolean z, boolean z2, int i) throws Exception {
        boolean z3 = this.zzYeg.zzYPU() != 0 && this.zzYe3 == null && z2 && i > this.zzYeg.getWidth();
        if (z3 && zzj(this.zzYe8.zz14())) {
            this.zzYe2 = this.zzYe5;
            this.zzYe3 = this.zzYe8.zz14();
        }
        if (z) {
            RefInt refInt = new RefInt(0);
            zzYAU zzyauZzZ = zzZ(this.zzYe8.zz14(), refInt);
            int i2 = refInt.get();
            if (zzY9R.zzmW(zzyauZzZ.zzZo6()) && !zzyauZzZ.zzYKV()) {
                this.zzYe8.zzU(zzyauZzZ);
                this.zzYe4 = true;
                return zzZ.zzYdW;
            }
            if (z3 && zzj(zzyauZzZ)) {
                this.zzYe2 = this.zzYe5 + i2 + this.zzYe8.zz14().getWidth();
                this.zzYe3 = zzyauZzZ;
            }
        }
        if ((this.zzYe8.zz14() instanceof zzYAD) && this.zzYe7.zzY0z() == null) {
            zzYQQ();
            return zzZ.zzYdW;
        }
        return zzZ.zzYdU;
    }

    private zzZ zzZ(boolean z, boolean z2, boolean z3, boolean z4) throws Exception {
        if (z3) {
            return zzZ.zzYdU;
        }
        if (!z && !z2 && !z4 && this.zzYe8.zz14().zzZo6() != 10528) {
            return zzZ.zzYdU;
        }
        if (zzY9R.zzlx(this.zzYe8.zz14().zzZo6()) != 1024) {
            this.zzYe1 = false;
        }
        zzYAA zzyaa = (zzYAA) com.aspose.words.internal.zzZKW.zzZ(this.zzYe8.zz14(), zzYAA.class);
        if (zzyaa != null) {
            zzZYV zzzyvZzZoS = this.zzYeg.zzab().zzZoS();
            zzzyvZzZoS.zzL(zzyaa);
            zzzyvZzZoS.commit();
        } else {
            this.zzYe5 += this.zzYe8.zz14().getWidth();
        }
        zzVE zzve = this.zzYe8;
        zzve.zzV((zzYAU) zzve.zz14().zzYo1());
        return zzZ.zzYdV;
    }

    public static class zzY {
        private boolean zzYdL;
        private boolean zzYdM;
        private boolean zzYdN;
        private zzTP zzYdO;
        private boolean zzYdP;
        private zzZ7A zzYdQ;
        private int zzYdR;
        private zzTO zzYdS;
        private boolean zzYdT = false;
        private zzVE zzYe8;

        public zzY(zzZ55 zzz55, zzVE zzve) throws Exception {
            this.zzYe8 = zzve;
            this.zzYdQ = zzZ7A.zzZ(zzz55.zza7());
            boolean z = false;
            int iZzP = zzZ5H.zzP(zzz55);
            boolean z2 = iZzP == 3 || iZzP == 4;
            zzZ3A zzz3aZza7 = zzz55.zza7();
            boolean zZzZ = zzZ(z2, zzz3aZza7);
            this.zzYdM = zZzZ;
            this.zzYdN = !zZzZ && zzz3aZza7.zzZYM() && z2;
            if (zzZ5B.zzxL(zzz55.zzZZJ().zz60()) && zzZ5B.zzE(zzz55)) {
                z = true;
            }
            this.zzYdL = z;
        }

        public final void zzB(zzYAU zzyau) {
            this.zzYdP = zzyau.zzY6D() | this.zzYdP;
        }

        public final zzZ7A zzYQK() {
            return this.zzYdQ;
        }

        public final int zzYQL() {
            return this.zzYdR;
        }

        public final zzTO zzYQM() {
            return this.zzYdS;
        }

        public final boolean zzYQN() {
            return this.zzYdT;
        }

        public final zzZ zzZ(int i, int i2, int i3, zzVF zzvf, RefBoolean refBoolean, Ref<zzVF> ref) throws Exception {
            if (this.zzYdL && zzZ5B.zzh(this.zzYe8.zz14()) && zzZL0.zzZ(this.zzYe8.zz14(), this.zzYe8.getCharacter()) && i <= i3) {
                ref.set(new zzVF(this.zzYe8.zz14(), this.zzYe8.getIndex()));
                this.zzYe8.moveNext();
                if (this.zzYe8.zz14().zzY6p()) {
                    return zzZ.zzYdV;
                }
                if (zzY9R.zzmW(this.zzYe8.zz14().zzZo6())) {
                    refBoolean.set(true);
                    return zzZ.zzYdW;
                }
                if (this.zzYe8.zz14().zzZo6() == 25604) {
                    this.zzYe8.movePrevious();
                    refBoolean.set(true);
                    return zzZ.zzYdW;
                }
                if (!zzZ5B.zzj(this.zzYe8.zz14())) {
                    return zzZ.zzYdW;
                }
                this.zzYe8.movePrevious();
                return zzZ.zzYdW;
            }
            if (this.zzYdP && this.zzYdQ != null && (this.zzYdM || this.zzYdN)) {
                int i4 = i2 - i3;
                if (this.zzYdO == null) {
                    this.zzYdO = new zzTP(this.zzYe8);
                }
                zzTO zztoZzZ = this.zzYdO.zzZ(this.zzYe8.zz0V(), i4, this.zzYdT, this.zzYdQ, this.zzYdN);
                if (zztoZzZ != null) {
                    this.zzYdS = zztoZzZ;
                    this.zzYdR = i4;
                    this.zzYdT = true;
                    if (zzvf == null || !zzvf.zzY(this.zzYe8.zz0V())) {
                        this.zzYe8.moveNext();
                        return zzZ.zzYdV;
                    }
                    refBoolean.set(true);
                    return zzZ.zzYdW;
                }
            }
            return zzZ.zzYdU;
        }

        private static boolean zzZ(boolean z, zzZ3A zzz3a) {
            if (!zzz3a.zzZYM() || z) {
                return zzz3a.zzYMx() == 1 || zzz3a.zzYMx() == 2;
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        r7.zzY(r2.zz14(), r2.getIndex());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzZ55 zzz55, zzVE zzve, zzZ7A zzz7a, boolean z, zzY9V zzy9v) throws Exception {
        zzY9U zzy9u;
        zzZ3A zzz3aZza7 = zzz55.zza7();
        zzYAU zzyau = (zzYAU) zzz55.zz6x();
        zzVE zzve2 = new zzVE(zzve);
        zzYAU zzyauZzZ = zzVE.zzZ(zzyau, zzve.zz14());
        if (!(zzz55.zzI(true, true) instanceof zzY9U)) {
            zzz55.zzI(true, true).zzZo6();
        }
        if (zzz55.zzI(true, true).zzZo6() == 12803) {
            zzy9u = (zzY9U) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzI(true, true), zzY9U.class);
            if (!zzy9u.zzY7w()) {
                zzy9u = null;
            }
        }
        while (true) {
            if (zzve2.zz14().zzY72() != null) {
                zzZNV zzznvZzY72 = zzve2.zz14().zzY72();
                if (zzznvZzY72.zzZ9s() == zzyauZzZ) {
                    zzve2.zz14();
                    return;
                }
                zzve2.zzV(zzznvZzY72.zzZ9s());
                zzve2.movePrevious();
                if (zzve2.zz14().zzY72() != null) {
                    continue;
                }
            }
            if (zzve2.zz14() == zzy9u) {
                if (zzve.zz14() == zzy9u) {
                    zzve.zz14().zzYnY();
                    zzve.moveNext();
                    if (!zzve.zz12() || ((zzYAU) zzve.zz14().zzYo1()) == null) {
                        return;
                    }
                    if (zzY9R.zzmV(((zzYAU) zzve.zz14().zzYo1()).zzZo6()) || zzY9R.zzmO(((zzYAU) zzve.zz14().zzYo1()).zzZo6())) {
                        zzve.moveNext();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!zzve2.zz14().zzYRO()) {
                if (zzve2.zz14().zzY6p() && ((!zzz3aZza7.zzYMA() || !zzve2.zz14().zzY6s()) && (zzz7a == null || !zzz7a.zzY(zzve2)))) {
                    break;
                }
                if (zzve2.zz14().zzY7r() == 4096 && !z) {
                    if (zzve2.zz14() != zzyauZzZ) {
                        zzve2.zz14();
                        zzYAU zzyauZzY = zzVE.zzY((zzYAU) zzve2.zz14().zzYo0(), zzyauZzZ);
                        if (zzyauZzY != null) {
                            zzve2.zz14();
                        }
                        if (zzyauZzY.zzY7r() != 5121) {
                            zzve.zzU(zzyauZzY);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (zzve2.getIndex() >= 0 && zzve2.getIndex() >= zzve2.zz14().getLength() && zzve2.zz14().getLength() == 0) {
                    zzve2.zz14().zzZo6();
                }
                if (zzve2.zz14() == zzy9v) {
                    zzve.zzV(zzve2.zz14());
                    return;
                }
                if (!zzve2.zz14().zzY7t() && (((zzve2.zz14().zzZo6() == 11284 && zzY(zzz3aZza7)) || ((zzve2.zz14().zzZo6() == 11285 && zzX(zzz3aZza7)) || (zzve2.zz14().zzZo6() == 9217 && zzve2.getCharacter() == '-' && zzY(zzz3aZza7)))) && ((zzz7a == null || !zzz7a.zzV(zzve2)) && ((!zzve2.zz14().zzY6q() || !zzve2.zz12() || !zzz3aZza7.zzZYM()) && !zzve2.zz14().zzZf5())))) {
                    zzve.zzY(zzve2.zz14(), zzve2.getIndex());
                    return;
                }
                if (zzve2.zz14().zzZo6() == 9752 && !zzM(zzve2.zz14(), zzyauZzZ)) {
                    zzve.zzV(zzve2.zz14());
                    return;
                }
                if (zzz7a != null && zzz7a.zzZ(zzve2)) {
                    zzve.zzY(zzve2.zz14(), zzve2.getIndex());
                    return;
                }
                if (zzve2.zz14().zzY6m() && (zzz7a == null || !zzz7a.zzV(zzve2))) {
                    if (zzz3aZza7.zzZYM()) {
                        if (!zzve2.zz14().zzY6q() || (!zzve2.zz14().zzY6r() && zzve2.zz14() != zzyauZzZ)) {
                            break;
                        }
                    } else if (!zzz3aZza7.zzYMu()) {
                        zzve.zzU(zzve2.zz14());
                        return;
                    }
                }
                if (zzve2.getIndex() == 0 && zzve2.zz14() == zzyauZzZ) {
                    return;
                } else {
                    zzve2.movePrevious();
                }
            } else {
                return;
            }
        }
        zzve.zzU(zzve2.zz14());
        if (zzve2.zz14().zzY6q()) {
            zzve2.zz14().zzY6r();
            zzve.movePrevious();
        }
    }

    public static int zzZ(zzZ55 zzz55, zzZ5C zzz5c, zzY76 zzy76) throws Exception {
        return zzZ((zzYAU) zzz55.zz6x(), zzz5c.zzYQY(), zzz5c.zzYQW(), zzy76, zzz5c.zzYQX() ? zzYAA.zzZ(zzz55, zzz5c.zzYQY().zz14().zzY6N()) : 0);
    }

    private static int zzV(zzVF zzvf) throws Exception {
        if (zzvf.zz12()) {
            return zzvf.zz14().getWidth();
        }
        int iZzlW = 0;
        for (int i = 0; i <= zzvf.getIndex(); i++) {
            iZzlW += zzvf.zz14().zzlW(i);
        }
        return iZzlW;
    }

    private static int zzZ(zzYAU zzyau, zzVF zzvf, boolean z, zzY76 zzy76, int i) throws Exception {
        int iZzlW;
        zzYAU zzyauZz14 = zzvf.zz14();
        zzYAU zzyau2 = null;
        int iZzV = 0;
        int i2 = 0;
        while (zzyau != zzyauZz14 && zzyau != null) {
            if (zzyau.zzY75()) {
                zzY9U zzy9u = (zzY9U) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9U.class);
                iZzV += zzy9u == null ? zzyau.getWidth() : zzy76.zzZ(zzy9u);
                if (zzZ5H.zzs(zzyau)) {
                    zzyau2 = zzyau;
                    i2 = iZzV;
                }
            }
            zzyau = (zzYAU) zzyau.zzYo1();
        }
        boolean zZzs = zzZ5H.zzs(zzyauZz14);
        if (zzyau2 == null && !zZzs) {
            return 0;
        }
        if (!zZzs) {
            iZzV = i2;
        } else if (zzY9R.zzmY(zzyauZz14.zzZo6())) {
            iZzV += zzV(zzvf);
        }
        if (z) {
            if (zZzs) {
                iZzlW = zzyauZz14.zzlW(zzvf.getIndex());
            } else {
                iZzlW = zzyau2.zzlW(zzyau2.getLength() - 1);
            }
            iZzV -= iZzlW;
        }
        int i3 = iZzV + i;
        return zzvf.zz14().zzZo6() == 11799 ? i3 + ((zzY9V) zzvf.zz14()).zzY4R() : i3;
    }

    private static zzZ5C zzZ(zzZ5C zzz5c, zzZ5C zzz5c2, zzZ5C zzz5c3, zzZ55 zzz55, zzY76 zzy76, int i) throws Exception {
        zzz55.zzxE(0);
        zzz55.zzUN(false);
        if (zzz55.zzYPU() == 2) {
            zzz55.zzxE(zzz5c2 != null ? 2 : 0);
            return zzz5c2 != null ? zzz5c2 : zzz5c;
        }
        zzz55.zzYPU();
        if (zzz5c2 == null && zzz5c3 == null) {
            zzz55.zzxE(0);
            zzz55.zzUN(zzz5c.zzYQW());
            return zzz5c;
        }
        if (zzz5c2 != null && zzz5c3 == null && zzz5c.zzYQY().zzY(zzz5c2.zzYQY())) {
            zzz55.zzxE(1);
            zzz55.zzUN(zzz5c2.zzYQW());
            return zzz5c2;
        }
        zzZ5C zzz5cZzZ = zzZ7F.zzZ(zzz55, zzy76, zzz5c, zzz5c2, zzz5c3, i);
        if (zzz5cZzZ.zzZ(zzz5c2)) {
            zzz55.zzxE(1);
            zzz55.zzUN(zzz5cZzZ.zzYQW());
            return zzz5cZzZ;
        }
        if (zzz5cZzZ.zzYQW()) {
            zzz55.zzxE(1);
            zzz55.zzUN(false);
            return zzz5cZzZ;
        }
        zzz55.zzxE(0);
        zzz55.zzUN(zzz5cZzZ.zzYQW());
        return zzz5cZzZ;
    }

    private zzZ zzZ(boolean z, zzZ7A zzz7a) throws Exception {
        if (this.zzYe8.zz14().zzZo6() == 12803) {
            this.zzYe8.movePrevious();
            this.zzYe4 = true;
            return zzZ.zzYdW;
        }
        if (z) {
            zzYAU zzyauZzT = zzT(this.zzYe8);
            while (this.zzYe8.zz14().zzY7t()) {
                this.zzYe8.moveNext();
            }
            if (zzZ5H.zzs(this.zzYe8.zz14()) && (zzz7a == null || !zzz7a.zzW(this.zzYe8))) {
                this.zzYe8.zzU(zzyauZzT);
                this.zzYe4 = true;
                return zzZ.zzYdW;
            }
            return zzZ.zzYdV;
        }
        return zzZ.zzYdU;
    }

    private zzZ zzZ(zzZ7A zzz7a) throws Exception {
        if (this.zzYe8.zz14().zzZo6() == 12803) {
            this.zzYe4 = true;
            return zzZ.zzYdU;
        }
        if (this.zzYe8.zz14().zzY6m()) {
            zzYAU zzyauZzS = zzVE.zzS((zzYAU) this.zzYe8.zz14().zzYo0());
            boolean z = false;
            if (zzyauZzS != null && zzyauZzS.zzZo6() == 12803) {
                this.zzYe4 = zzyauZzS == zzVE.zzT((zzYAU) this.zzYeg.zz6x());
            } else if (zzz7a == null || !zzz7a.zzX(this.zzYe8)) {
                if (zzZYM()) {
                    this.zzYe4 = !this.zzYe8.zz14().zzY6r();
                } else {
                    if (zzyauZzS != null && zzyauZzS.zzY6m() && this.zzYeg.zza7().zzYMu()) {
                        z = true;
                    }
                    this.zzYe4 = !z;
                }
            }
            return zzZ.zzYdU;
        }
        if (((zzY9R.zzmY(this.zzYe8.zz14().zzZo6()) && this.zzYe8.zz14().zzZo6() != 9747) || this.zzYe8.zz14().zzZo6() == 10754) && zzi(this.zzYe8.zz14())) {
            this.zzYe4 = true;
            return zzZ.zzYdU;
        }
        if (this.zzYeg.zza7().getWrapTrailSpaces() && this.zzYe8.zz14().zzY6p()) {
            if (this.zzYe8.zz12() && zzY9R.zzmW(zzVE.zzT((zzYAU) this.zzYe8.zz14().zzYo1()).zzZo6())) {
                this.zzYe8.moveNext();
            }
            this.zzYe4 = true;
            return zzZ.zzYdW;
        }
        if (this.zzYe1 && this.zzYe7.zzY0w()) {
            this.zzYe4 = true;
        }
        return zzZ.zzYdU;
    }

    private static zzYAU zzZ(zzYAU zzyau, RefInt refInt) throws Exception {
        zzYAU zzyauZzT = zzVE.zzT((zzYAU) zzyau.zzYo1());
        refInt.set(0);
        while (zzyauZzT != null && zzyauZzT.zzY6p()) {
            refInt.set(refInt.get() + zzyauZzT.getWidth());
            zzyauZzT = zzVE.zzT((zzYAU) zzyauZzT.zzYo1());
        }
        return zzyauZzT;
    }
}
