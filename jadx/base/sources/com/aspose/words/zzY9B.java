package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9B {
    private zzZ4N zzXaN;
    private int zzXaO;
    private zzY9C zzXaP;
    private zzYAU zzZw5;
    private zzYAU zzZw6;

    public zzY9B(zzY9C zzy9c) {
        this.zzXaP = zzy9c;
        this.zzXaN = zzy9c.zzY4s().zzYPe();
    }

    private void zzA(zzYAU zzyau, zzYAU zzyau2) {
        if (this.zzXaO == 0) {
            this.zzZw5 = zzyau2;
            this.zzZw6 = zzyau2;
        } else if (zzyau == null) {
            this.zzZw6 = zzyau2;
        } else {
            zzYAU zzyau3 = this.zzZw5;
            if (zzyau == zzyau3) {
                this.zzZw5 = zzyau2;
            } else {
                if (zzyau3 != null && zzZd(zzyau2)) {
                    this.zzZw5 = zzyau2;
                }
                if (this.zzZw6 != null && zzZc(zzyau2)) {
                    this.zzZw6 = zzyau2;
                }
            }
        }
        this.zzXaO++;
    }

    private void zzB(zzYAU zzyau, zzYAU zzyau2) {
        zzYAU zzyau3;
        if (this.zzXaO == 0) {
            this.zzZw6 = zzyau;
            this.zzZw5 = zzyau2;
        } else {
            if (zzyau == null) {
                this.zzZw6 = null;
            } else if (this.zzZw6 != null && zzZc(zzyau)) {
                this.zzZw6 = zzyau;
            }
            if (zzyau2 == null) {
                this.zzZw5 = null;
            } else if (this.zzZw5 != null && zzZd(zzyau2)) {
                this.zzZw5 = zzyau2;
            }
        }
        zzYAU zzyau4 = this.zzZw6;
        if (zzyau4 != null && (zzyau3 = this.zzZw5) != null) {
            zzC(zzyau4, zzyau3);
        }
        this.zzXaO++;
    }

    public static boolean zzC(zzYAU zzyau, zzYAU zzyau2) {
        if (zzyau.zzaa() != null) {
            zzyau.zzaa();
            zzyau2.zzaa();
        }
        return zzZ4N.zzZ(zzyau, zzyau2);
    }

    private void zzS(zzYAS zzyas) throws Exception {
        zzyas.zzY6W();
        if (zzY9R.zzmU(zzyas.zzZo6())) {
            this.zzXaN.zzX(zzyas);
            if (this.zzXaN.movePrevious()) {
                zzYAS zzyas2 = (zzYAS) this.zzXaN.zzYPi();
                zzY9R.zzmR(zzyas2.zzZo6());
                zzyas.zzX(zzyas2);
            }
        }
    }

    private static void zzT(zzYAS zzyas) throws Exception {
        zzyas.zzQG(false);
        zzZ32 zzz32ZzX = zzZ32.zzX(zzyas.zzY6N());
        zzz32ZzX.isHidden(false);
        zzz32ZzX.zzTJ(false);
        zzyas.zzU(zzZ32.zzW(zzz32ZzX));
    }

    private void zzX(Ref<zzYMM> ref, Ref<zzYAU> ref2) throws Exception {
        if (this.zzZw6 == null) {
            this.zzXaN.zz0Z();
            this.zzZw6 = (zzYAU) this.zzXaN.zzYPi();
        }
        this.zzZw5 = zzZ9(this.zzZw5);
        ref2.set(zzY4l());
        if (ref2.get().zzY6Z() && (this.zzXaP instanceof zzYBY)) {
            ref2.get();
        }
        if (ref2.get().zzY6X()) {
            ref.set(ref2.get().zzY6S());
        } else {
            this.zzXaN.zz0Y();
            zzY4k();
            ref.set(zzZ((zzYAS) this.zzZw5));
            ref2.set(null);
        }
        ref.get();
    }

    private void zzY4i() {
        this.zzXaP.zzZoB();
        this.zzXaP.zzZoA();
        this.zzXaO = 0;
        this.zzZw6 = null;
        this.zzZw5 = null;
    }

    private boolean zzY4j() {
        if (this.zzXaO == 0) {
            return true;
        }
        this.zzXaP.zzFM(1);
        return false;
    }

    private void zzY4k() throws Exception {
        if (this.zzXaN.isLast()) {
            zzYAU zzyau = (zzYAU) this.zzXaN.zzYPi();
            if (21639 == zzyau.zzZo6()) {
                return;
            }
            if (zzY9R.zzmT(zzyau.zzZo6())) {
                int storyType = this.zzXaP.getStoryType();
                if (storyType == 2 || storyType == 3 || storyType == 4) {
                    return;
                }
                switch (storyType) {
                }
                return;
            }
            zzZ4N zzz4nZzYPe = this.zzXaN.zzYPe();
            zzz4nZzYPe.zz0Y();
            zzY9R.zzmU(((zzYAU) com.aspose.words.internal.zzZKW.zzZ(zzz4nZzYPe.zzYPi(), zzYAU.class)).zzZo6());
            while (zzz4nZzYPe.movePrevious()) {
                zzYAU zzyau2 = (zzYAS) com.aspose.words.internal.zzZKW.zzZ(zzz4nZzYPe.zzYPi(), zzYAS.class);
                if (zzyau2 != null && zzY9R.zzmU(zzyau2.zzZo6())) {
                    zzz4nZzYPe.zzYPf();
                    zzD(zzyau, zzyau2);
                    this.zzXaN.zzYPi();
                    return;
                }
            }
            zzYAS zzyas = new zzYAS(21639, null);
            zzyas.zzlT(0);
            zzZYW zzzywZzab = this.zzXaP.zzab();
            zzZ32 zzz32 = new zzZ32(zzzywZzab.zzZoP(), zzzywZzab.zzZqy());
            zzz32.setName("Times New Roman");
            zzz32.setSize(0);
            zzyas.zzU(zzZ32.zzW(zzz32));
            zzZ37 zzz37 = new zzZ37(zzzywZzab.zzZoP());
            zzz37.setLineSpacingRule(2);
            zzz37.zzw6(1);
            zzyas.zzX(zzZ37.zzY(zzz37));
            zzD(zzyau, zzyas);
            this.zzXaN.zzYPi();
        }
    }

    private zzYAU zzY4l() {
        if (this.zzZw5.zzY6X() || this.zzXaN.isLast()) {
            return this.zzZw5;
        }
        zzYAU zzyau = this.zzZw5;
        zzZ4N zzz4nZzYPe = this.zzXaN.zzYPe();
        while (!zzyau.zzY6X() && !zzz4nZzYPe.isLast()) {
            zzz4nZzYPe.zzYPi();
            zzz4nZzYPe.moveNext();
            zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
        }
        if (!zzyau.zzY6X()) {
            zzz4nZzYPe.isLast();
        }
        return zzyau;
    }

    private boolean zzY4m() {
        if (this.zzXaN.isLast()) {
            return true;
        }
        int storyType = this.zzXaP.getStoryType();
        if (storyType != 2 && storyType != 3 && storyType != 4) {
            return false;
        }
        zzYAU zzyau = (zzYAU) this.zzXaN.zzYPh();
        return (zzyau instanceof zzYAQ) || (zzyau instanceof zzYAD);
    }

    private void zzY4n() throws Exception {
        zzZQL zzzql = new zzZQL();
        ArrayList<zzZAK> arrayList = new ArrayList<>();
        zzZ9(this.zzZw6);
        zzYAS zzyas = null;
        zzYAU zzyau = null;
        boolean zZzZew = false;
        while (!this.zzXaN.zz13()) {
            zzYAU zzyau2 = (zzYAU) this.zzXaN.zzYPi();
            boolean zZzY6i = zzyau2.zzY6i();
            boolean z = true;
            boolean z2 = zZzY6i || (!this.zzXaP.zza8().zzYTa() && zzyau2.zzY6N().isHidden());
            boolean zZzA = com.aspose.words.internal.zzZKO.zzA(this.zzZw5, this.zzXaN.zzYPi());
            zzzql.zzB(zzyau2);
            if (zzyau2 instanceof zzYA3) {
                boolean z3 = zzyau2 instanceof zzY9Z;
                if (z3 || (zzyau2 instanceof zzYAD)) {
                    boolean zZzZew2 = zzzql.zzZew() | z2;
                    if (z3) {
                        zzyau2.zzQG(zZzZew2);
                    } else {
                        zzyau2.zzQF(zZzZew2);
                    }
                } else if (zzyau2 instanceof zzYAC) {
                    if (!z2 && !zzzql.zzZev()) {
                        z = false;
                    }
                    zzyau2.zzQG(z);
                } else if (zzyau2 instanceof zzYAH) {
                    zzyau2.zzQG(zzyau2.zzZ1s() == 2 ? zzzql.zzZew() : ((zzYAH) zzyau2).zzY5C().zzY6Z());
                    if (!zZzY6i) {
                        zzyau2.zzZ1s();
                    }
                    zzyau2.zzQF(true);
                } else if (zzyau2 instanceof zzYA5) {
                    zzZ4N zzz4nZzYPe = this.zzXaN.zzYPe();
                    while (true) {
                        if (!zzz4nZzYPe.moveNext()) {
                            break;
                        }
                        zzYAU zzyau3 = (zzYAU) zzz4nZzYPe.zzYPi();
                        if (!(zzyau3 instanceof zzYAT)) {
                            if (zzyau3.zzZo6() == 21788) {
                                com.aspose.words.internal.zzZQG.zzZ(arrayList, this.zzXaN.zzYPi());
                            }
                        }
                    }
                } else {
                    zzyau2.zzQG(false);
                    if (z2) {
                        zzyau2.zzQF(true);
                    }
                }
            } else if (zzY9R.zzmQ(zzyau2.zzZo6())) {
                if ((zzyau2.zzZo6() != 25604 || !((zzY9X) zzyau2).zzY53().getHidden()) && !z2 && !zzzql.zzZew()) {
                    z = false;
                }
                zzyau2.zzQG(z);
            } else {
                boolean zZzZew3 = zzzql.zzZew();
                if (zzyau2.zzZo6() == 21537 || !(!zzY9R.zzmT(zzyau2.zzZo6()) || this.zzXaP.getStoryType() == 2 || this.zzXaP.getStoryType() == 3)) {
                    zzYAS zzyas2 = (zzYAS) zzyau2;
                    zzZ(zzyas, zzyas2);
                    zzZ(zZzZew, zzyas, zzyas2);
                    zZzZew = zzzql.zzZew();
                    if (z2 && !zZzZew3 && !zzY4m() && !zzZ(zzyau, zzyas2)) {
                        if (zzyas2.zzYTl() < zzZa(zzyas2)) {
                            zzZ4N zzz4nZzYPe2 = this.zzXaN.zzYPe();
                            while (zzz4nZzYPe2.movePrevious()) {
                                zzYAU zzyau4 = (zzYAU) zzz4nZzYPe2.zzYPi();
                                if (!zzyau4.zzY6Z() && !zzyau4.zzYol()) {
                                    zZzZew3 = zzY9R.zzmR(zzyau4.zzZo6());
                                    break;
                                }
                            }
                            zZzZew3 = true;
                        } else {
                            zZzZew3 = true;
                        }
                    }
                    zzyas = zzyas2;
                } else if (zzzql.zzZew()) {
                    zzyau2.zzZo6();
                }
                zzyau2.zzQG(zZzZew3);
                if (!zZzZew3 && z2) {
                    zzyau2.zzQF(true);
                }
            }
            if (zZzA) {
                break;
            }
            this.zzXaN.moveNext();
            zzyau = zzyau2;
        }
        zzYX(arrayList);
        zzZ(zzyas, (zzYAS) null);
        zzZ(zZzZew, zzyas, null);
    }

    private void zzY4o() throws Exception {
        zzZ9(this.zzZw6);
        boolean z = false;
        while (!this.zzXaN.isLast()) {
            zzYAU zzyau = (zzYAU) this.zzXaN.zzYPi();
            z |= zzyau == this.zzZw5;
            boolean zZzY6Z = zzyau.zzY6Z();
            if (zzyau.zzY6X() && zzyau.zzY6Z()) {
                zzyau.remove();
            }
            this.zzXaN.moveNext();
            if (z && !zZzY6Z) {
                return;
            }
        }
    }

    private void zzYX(ArrayList<zzZAK> arrayList) throws Exception {
        if (arrayList.size() == 0) {
            return;
        }
        zzZ4N zzz4nZzYPe = this.zzXaN.zzYPe();
        for (zzZAK zzzak : arrayList) {
            zzz4nZzYPe.zzX(zzzak);
            zzYAU zzyau = (zzYAU) zzzak;
            zzyau.zzQG(true);
            while (true) {
                if (zzz4nZzYPe.moveNext()) {
                    zzYAU zzyau2 = (zzYAU) zzz4nZzYPe.zzYPi();
                    if (!zzyau2.zzY6Z() && !zzyau2.zzYol() && zzyau2.zzZo6() != 21788) {
                        if (zzyau2.zzZo6() != 21537) {
                            zzyau.zzQG(false);
                        }
                    }
                }
            }
        }
    }

    private boolean zzZ(zzYAU zzyau, zzYAS zzyas) throws Exception {
        if (!zzY9R.zzmT(zzyas.zzZo6()) || zzyau == null) {
            return false;
        }
        boolean z = zzyau instanceof zzYA5;
        if (z || (zzyau instanceof zzYAT)) {
            zzZ4N zzz4nZzYPe = this.zzXaN.zzYPe();
            zzz4nZzYPe.zzX(zzyau);
            while (zzz4nZzYPe.movePrevious() && (z || (zzyau instanceof zzYAT))) {
            }
        }
        return (!zzY9R.zzmO(zzyau.zzZo6()) || zzyau.zzYol() || zzyau.zzY6Z()) ? false : true;
    }

    private static zzYAU zzZ6(zzYAU zzyau) {
        if (zzyau.zzY7o() == null || (zzyau instanceof zzYAT)) {
            return null;
        }
        return zzyau.zzY7o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zzZ7(zzYAU zzyau) {
        if (zzZ6(zzyau) != null) {
            if (2 == zzyau.zzZ1s() || 3 == zzyau.zzZ1s()) {
                zzYAU zzyauZzY7o = zzyau.zzZ1s() == 3 ? zzyau : zzyau.zzY7o();
                if (zzyau.zzZ1s() != 2) {
                    zzyau = zzyau.zzY7o();
                }
                HashMap map = new HashMap();
                com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
                com.aspose.words.internal.zzZQC zzzqc = new com.aspose.words.internal.zzZQC();
                this.zzXaN.zzX(zzyau);
                while (true) {
                    if (!this.zzXaN.moveNext()) {
                        break;
                    }
                    zzYAU zzyau2 = (zzYAU) this.zzXaN.zzYPi();
                    zzYAU zzyauZzZ6 = zzZ6(zzyau2);
                    if (3 == zzyau2.zzZ1s()) {
                        zzim.add(zzyau2);
                        if (zzyauZzZ6 != null && map.containsKey(zzyauZzZ6)) {
                            com.aspose.words.internal.zzZQF.zzY(map, zzyauZzZ6);
                        }
                    }
                    zzYAU zzyauZzY6Y = null;
                    if (map.size() > 0) {
                        while (true) {
                            if (zzzqc.size() <= 0) {
                                break;
                            }
                            zzYAU zzyau3 = (zzYAU) zzzqc.peek();
                            if (map.containsKey(zzyau3)) {
                                zzyauZzY6Y = zzyau3;
                                break;
                            }
                            zzzqc.pop();
                        }
                    }
                    if (zzyau2 == zzyauZzY7o) {
                        if (zzyauZzY6Y == null) {
                            zzyauZzY6Y = zzyau.zzY6Y();
                            while (zzyauZzY6Y != null && zzim.contains(zzyauZzY6Y.zzY7o())) {
                                zzyauZzY6Y = zzyauZzY6Y.zzY6Y();
                            }
                        }
                        zzyau2.zzZA(zzyauZzY6Y);
                    } else {
                        if (zzyauZzY6Y == null) {
                            zzyauZzY6Y = zzyau;
                        }
                        zzyau2.zzZA(zzyauZzY6Y);
                        if (zzyauZzZ6 != null && 2 == zzyau2.zzZ1s()) {
                            zzzqc.push(zzyau2);
                            com.aspose.words.internal.zzZQF.zzY(map, zzyau2, zzyauZzZ6);
                        }
                    }
                }
                zzB(zzyau, zzyauZzY7o);
            }
        }
    }

    private void zzZ8(zzYAU zzyau) throws Exception {
        zzYAU zzyau2;
        if (this.zzXaN.isEmpty()) {
            this.zzZw6 = null;
            this.zzZw5 = null;
            this.zzXaO = 0;
            return;
        }
        if (this.zzXaN.zzYPg()) {
            this.zzZw5 = null;
            if (this.zzZw6 == zzyau || (this.zzXaO == 0 && this.zzXaN.zz0Y())) {
                this.zzZw6 = (zzYAU) this.zzXaN.zzYPi();
            }
            if (this.zzXaO == 0 && this.zzXaN.isLast() && com.aspose.words.internal.zzZKO.zzA(this.zzZw6, this.zzXaN.zzYPi())) {
                zzY9R.zzmU(this.zzZw6.zzZo6());
            }
        } else {
            zzYAU zzyau3 = (zzYAU) this.zzXaN.zzYPi();
            if (this.zzXaO == 0 || (zzyau2 = this.zzZw5) == zzyau || (zzyau2 != null && zzZd(zzyau3))) {
                this.zzZw5 = zzyau3;
            }
            if (this.zzZw6 != null || this.zzXaO == 0) {
                if (this.zzXaN.isFirst()) {
                    this.zzZw6 = null;
                } else if (this.zzXaO == 0 || this.zzZw6 == zzyau || zzZc(zzyau3)) {
                    this.zzXaN.movePrevious();
                    this.zzZw6 = (zzYAU) this.zzXaN.zzYPi();
                }
            }
        }
        this.zzXaO++;
    }

    private zzYAU zzZ9(zzYAU zzyau) {
        if (!(zzyau == null ? this.zzXaN.zz0Y() : this.zzXaN.zzW(zzyau))) {
            zzyau.zzY6W();
            zzyau = zzZb(zzyau);
        }
        return zzyau != null ? zzyau : (zzYAU) this.zzXaN.zzYPi();
    }

    private int zzZa(zzYAU zzyau) {
        zzZ4N zzz4nZzYPe = this.zzXaN.zzYPe();
        zzz4nZzYPe.zzX(zzyau);
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau2 = (zzYAU) com.aspose.words.internal.zzZKW.zzZ(zzz4nZzYPe.zzYPi(), zzYAU.class);
            if (!(zzyau2 instanceof zzYA3)) {
                return zzyau2.zzYTl();
            }
        }
        return 0;
    }

    private static zzYAU zzZb(zzYAU zzyau) {
        if (!zzyau.zzY6W()) {
            while (zzyau.zzYo0() != null) {
                zzyau = (zzYAU) zzyau.zzYo0();
                if (zzyau.zzY6W()) {
                    break;
                }
            }
        }
        return zzyau;
    }

    private boolean zzZc(zzYAU zzyau) {
        if (!this.zzZw6.zzY6W()) {
            this.zzZw6 = zzZb(this.zzZw6);
        }
        return zzC(zzyau, this.zzZw6);
    }

    private boolean zzZd(zzYAU zzyau) {
        if (!this.zzZw5.zzY6W()) {
            this.zzZw5 = zzZb(this.zzZw5);
        }
        return zzC(this.zzZw5, zzyau);
    }

    private static void zzz(zzYAU zzyau, zzYAU zzyau2) {
        if (zzyau == null) {
            return;
        }
        if (zzyau.zzZ1s() != 2 || zzZ6(zzyau) == null || zzZ6(zzyau) == zzyau2) {
            zzyau2.zzZA(zzyau.zzY6Y());
        } else {
            zzyau2.zzZA(zzyau);
        }
    }

    public final void commit() throws Exception {
        zzY4n();
        zzY4o();
        if (zzY4j()) {
            return;
        }
        try {
            Ref<zzYMM> ref = new Ref<>(null);
            Ref<zzYAU> ref2 = new Ref<>(null);
            zzX(ref, ref2);
            zzYA6 zzya6 = new zzYA6(ref.get(), ref2.get());
            do {
                zzYAU zzyau = (zzYAU) this.zzXaN.zzYPi();
                zzya6.zz5(zzyau);
                if (zzyau == this.zzZw6) {
                    break;
                } else if (!com.aspose.words.internal.zzZKO.zzA(zzyau, this.zzXaN.zzYPi())) {
                    this.zzXaN.zzX(zzyau);
                }
            } while (this.zzXaN.movePrevious());
            this.zzXaN.zzX(this.zzZw5);
            zzya6.zzK(((zzYAU) this.zzXaN.zzYPi()).zzY6S());
            zzY4i();
        } catch (Throwable th) {
            zzY4i();
            throw th;
        }
    }

    public final void zzD(zzYAU zzyau, zzYAU zzyau2) {
        zzyau2.zzZ(this.zzXaP);
        zzz(zzyau, zzyau2);
        if (zzyau == null) {
            this.zzXaN.zz0Z();
            this.zzXaN.zzU(zzyau2);
            this.zzXaN.movePrevious();
            this.zzXaN.zzYPi();
        } else {
            this.zzXaN.zzX(zzyau);
            this.zzXaN.zzT(zzyau2);
            this.zzXaN.moveNext();
            this.zzXaN.zzYPi();
        }
        zzA(zzyau, zzyau2);
        zzZ7(zzyau2);
    }

    public final void zzL(zzYAU zzyau) throws Exception {
        try {
            this.zzXaP.zzFM(1);
            if (zzY9R.zzmU(zzyau.zzZo6())) {
                zzS((zzYAS) zzyau);
            }
            zzyau.remove();
            this.zzXaN.zzX(zzyau);
            this.zzXaN.zzYPf();
            zzZ8(zzyau);
            this.zzXaP.zzZoA();
        } catch (Throwable th) {
            this.zzXaP.zzZoA();
            throw th;
        }
    }

    public final void zzY4p() {
        if (!this.zzZw6.zzY6W()) {
            this.zzZw6 = zzZb(this.zzZw6);
        }
        if (!this.zzZw5.zzY6W()) {
            this.zzZw5 = zzZb(this.zzZw5);
        }
        if (((zzZ55) this.zzZw6.zzZZJ()) != ((zzZ55) this.zzZw5.zzZZJ())) {
            this.zzZw6.zzZZJ();
            this.zzZw5.zzZZJ();
        }
    }

    private static void zzZ(zzYAS zzyas, zzYAS zzyas2) throws Exception {
        if (zzyas != null && zzyas.zzY6Z() && zzyas.zzY6N().isHidden() && zzyas.zzY6c().zzYLC() == 0 && zzyas.zzY67().zztB(5) == null) {
            if (zzyas2 == null) {
                zzZ4N zzz4nZzYPe = zzyas.zzaa().zzY4s().zzYPe();
                zzz4nZzYPe.zzX(zzyas);
                while (zzz4nZzYPe.moveNext()) {
                    zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
                    if (zzY9R.zzmO(zzyau.zzZo6())) {
                        zzyas2 = (zzYAS) zzyau;
                        if (zzyas2.zzY6c().zzYLC() == 0 || !zzyas2.zzY6N().isHidden()) {
                            break;
                        } else {
                            zzyas2 = null;
                        }
                    }
                }
            }
            if (zzyas2 == null || !zzyas2.zzY6c().zzYLV()) {
                return;
            }
            zzyas.zzQG(false);
            zzyas.zzQF(true);
        }
    }

    private static void zzZ(boolean z, zzYAS zzyas, zzYAS zzyas2) throws Exception {
        if (zzyas != null && zzyas.zzY6Z() && zzyas.zzY6N().isHidden()) {
            zzY9R.zzmO(zzyas.zzZo6());
            boolean z2 = zzyas2 != null && zzyas2.zzY6c().zzYLJ().isFloating();
            boolean z3 = (zzyas.zzY67().zzYB4() instanceof Table) && !z;
            if (z2 || z3) {
                if (zzyas.zzY6c().zzYLC() == 0) {
                    zzT(zzyas);
                } else {
                    zzyas.zzQG(false);
                    zzyas.zzQF(true);
                }
            }
        }
    }

    private zzYMM zzZ(zzYAS zzyas) throws Exception {
        this.zzXaN.zzYPi();
        this.zzXaN.isLast();
        return this.zzXaP.zzZ(zzyas);
    }
}
