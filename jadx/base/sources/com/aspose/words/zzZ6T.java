package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ6T extends zzYS {
    private zzZ6T zzYgc;
    private zzY0B zzYgd = zzY0B.zzWTS;
    private zzZ6T zzYge;
    private zzZ3E zzYgf;
    private zzY9C zzYgg;
    private boolean zzYgh;
    private boolean zzZsu;

    public void merge() throws Exception {
        throw new IllegalStateException();
    }

    public void remove() throws Exception {
        zzY44.zzL(this);
        if (zza9() != null) {
            zza9().zzY(this);
        }
    }

    public zzZ6T zz6u() throws Exception {
        throw new IllegalStateException();
    }

    public zzYMD zz6w() {
        return null;
    }

    public zzYMD zz6x() {
        return null;
    }

    public abstract int zz6y();

    public ArrayList<zzYMD> zzA(zzYMD zzymd) {
        if (zzymd == null) {
            zzymd = zz6x();
        }
        ArrayList<zzYMD> arrayList = new ArrayList<>();
        while (zzymd != null) {
            if (this != zzymd.zza9()) {
                if (zzymd.zza9() != null) {
                    break;
                }
            } else {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzymd);
            }
            zzymd = zzymd.zzYo1();
        }
        return arrayList;
    }

    public void zzB(zzYMD zzymd) throws Exception {
        zzymd.zza9();
        if (zzymd.zzYo1() != null) {
            zzymd.zzYo1().zzt(zzymd.zzYo0());
        }
        if (zzymd.zzYo0() != null) {
            zzymd.zzYo0().zzu(zzymd.zzYo1());
        }
        if (zzymd == zz6x()) {
            zzZ(zzymd.zzYo1());
        }
        if (zzymd == zz6w()) {
            zzY(zzymd.zzYo0());
        }
        zzymd.zzZ((zzZ6T) null);
    }

    public final void zzFM(int i) {
        zzab().zzZoS().zzFM(i);
    }

    public final void zzT(zzZ6T zzz6t) {
        this.zzYgc = zzz6t;
    }

    public final void zzU(zzZ6T zzz6t) {
        this.zzYge = zzz6t;
    }

    public final void zzV1(boolean z) {
        this.zzYgh = z;
    }

    public void zzW(zzZ6T zzz6t) throws Exception {
        throw new IllegalStateException();
    }

    public ArrayList<zzZ6T> zzX(zzZ6T zzz6t) {
        return null;
    }

    public void zzY(zzYMD zzymd) {
    }

    public final zzY0B zzYTi() {
        return this.zzYgd;
    }

    public final zzZ6T zzYTj() {
        if ((zz6y() != 8 || zza9().zza9().zz6y() != 2) && (zz6y() != 32 || zza9().zz6y() != 2)) {
            return null;
        }
        zzZ6T zzz6t = this.zzYge;
        if (zzz6t == null && zz6y() == 8) {
            zzz6t = zza9().zzYge;
        }
        if (zzz6t == null) {
            return null;
        }
        int iZz6y = zzz6t.zz6y();
        if (iZz6y == 4) {
            return (zzYIC) ((zzY6N) zzz6t).zzZXZ();
        }
        if (iZz6y == 8 || iZz6y == 32) {
            return zzz6t;
        }
        throw new IllegalStateException("Unexpected layout type.");
    }

    public final zzYCT zzYTk() {
        return (zzYCT) zzxY(2);
    }

    public final int zzYTl() {
        int i = 0;
        for (zzZ6T zzz6tZza9 = this; zzz6tZza9 != null && zzz6tZza9.zz6y() != 2; zzz6tZza9 = zzz6tZza9.zza9()) {
            if (zzz6tZza9.zz6y() == 4) {
                i++;
            }
        }
        return i;
    }

    public final boolean zzYTm() {
        zza9();
        return this.zzYgc == null;
    }

    public final boolean zzYTn() {
        zza9();
        return this.zzYge == null;
    }

    public final zzZ6T zzYTo() {
        return this.zzYgc;
    }

    public final zzZ6T zzYTp() {
        return this.zzYge;
    }

    public void zzYTq() throws Exception {
        zza9();
        for (zzYMD zzymdZz6w = zz6w(); zzymdZz6w != null; zzymdZz6w = zzymdZz6w.zzYo0()) {
            zzymdZz6w.zzZZJ();
            zzX(zzymdZz6w).zzU(zzymdZz6w);
        }
    }

    public void zzYTr() throws Exception {
        if (zz6w() == null || zz6w().zzZZJ() == null) {
            return;
        }
        for (zzYMD zzymdZz6w = zz6w(); zzymdZz6w != null; zzymdZz6w = zzymdZz6w.zzYo0()) {
            zzymdZz6w.zzZZJ().zzY(zzymdZz6w, true);
        }
    }

    public boolean zzYTs() {
        return zz6x() == null;
    }

    public final zzZ3E zzYTt() {
        return this.zzYgf;
    }

    @Override // com.aspose.words.zzYS
    public final void zzYU(boolean z) {
        this.zzZsu = z;
    }

    public void zzZ(zzYMD zzymd) {
    }

    public abstract zzYAU zzZXV();

    public void zzZY0() throws Exception {
        throw new IllegalStateException();
    }

    public final void zzZoA() {
        zzab().zzZoS().zzZoA();
    }

    public final zzYJQ zzZoB() {
        return zzab().zzZoS().zzZoB();
    }

    public void zzZoU() {
        if (this.zzZsu) {
            this.zzZsu = false;
            if (zza9() != null) {
                zza9().zzZoU();
            } else {
                zzab().zzZoU();
            }
        }
    }

    @Override // com.aspose.words.zzYS
    public zzY9C zzaa() {
        if (this.zzYgg == null) {
            this.zzYgg = (zzY9C) zzxY(1);
        }
        return this.zzYgg;
    }

    @Override // com.aspose.words.zzYS
    public final boolean zzac() {
        return this.zzZsu;
    }

    public final zzZ6T zzxY(int i) {
        for (zzZ6T zzz6tZza9 = this; zzz6tZza9 != null; zzz6tZza9 = zzz6tZza9.zza9()) {
            if ((zzz6tZza9.zz6y() & i) != 0) {
                return zzz6tZza9;
            }
        }
        return null;
    }

    public final zzYMD zzy(zzYMD zzymd) {
        zzymd.zza9();
        while (zzymd != null && this == zzymd.zza9()) {
            if (zzymd.zzZZJ() != null) {
                return zzymd;
            }
            zzymd = zzymd.zzYo0();
        }
        return null;
    }

    public final zzYMD zzz(zzYMD zzymd) {
        zzymd.zza9();
        while (zzymd != null && this == zzymd.zza9()) {
            if (zzymd.zzZZJ() != null) {
                return zzymd;
            }
            zzymd = zzymd.zzYo1();
        }
        return null;
    }

    public zzTF zzX(zzYMD zzymd) throws Exception {
        throw new IllegalStateException();
    }

    public void zzY(zzZ6T zzz6t) throws Exception {
    }

    public void zzZ(zzZ6T zzz6t, zzZ6T zzz6t2, zzZ6T zzz6t3) throws Exception {
    }

    public void zzY(zzTG zztg) throws Exception {
        zza9();
        if (zztg == null) {
            zztg = (zzTG) zza9().zzYgc;
        }
        zza9();
        ArrayList<zzYMD> arrayListZzA = zzA(null);
        for (int size = arrayListZzA.size() - 1; size >= 0; size--) {
            arrayListZzA.get(size).zzZZJ().zzY(arrayListZzA.get(size), true);
        }
        zza9().zzY(this);
        zztg.zzZ(zztg.zzZXY(), null, this);
        for (zzYMD zzymd : arrayListZzA) {
            zzX(zzymd).zzU(zzymd);
        }
    }

    public void zzZ(zzZ3E zzz3e) throws Exception {
        if (this.zzYgf == zzz3e) {
            return;
        }
        this.zzYgf = zzz3e;
        if (this.zzYgh) {
            return;
        }
        zzZY0();
    }

    public void zzZ(zzTG zztg) throws Exception {
        zza9();
        if (zztg == null) {
            zztg = (zzTG) zza9().zzYge;
        }
        zza9();
        ArrayList<zzYMD> arrayListZzA = zzA(null);
        for (zzYMD zzymd : arrayListZzA) {
            zzymd.zzZZJ().zzY(zzymd, true);
        }
        zza9().zzY(this);
        zztg.zzZ(null, zztg.zzZXZ(), this);
        for (zzYMD zzymd2 : arrayListZzA) {
            zzX(zzymd2).zzU(zzymd2);
        }
    }

    public void zzZ(zzYMD zzymd, zzYMD zzymd2, zzYMD zzymd3, boolean z) throws Exception {
        zzymd3.zza9();
        zzYMD zzymdZz6x = zz6x();
        zzYMD zzymdZz6w = zz6w();
        Ref<zzYMD> ref = new Ref<>(zzymdZz6x);
        Ref<zzYMD> ref2 = new Ref<>(zzymdZz6w);
        zzZ(zzymd, zzymd2, zzymd3, ref, ref2);
        zzYMD zzymd4 = ref.get();
        zzYMD zzymd5 = ref2.get();
        zzZ(zzymd4);
        zzY(zzymd5);
        if (zzymd3.zzZZJ() == null && z) {
            zzX(zzymd3).zzU(zzymd3);
            zzymd3.zzZZJ();
        }
    }

    public final void zzZ(zzYMD zzymd, zzYMD zzymd2, zzYMD zzymd3, Ref<zzYMD> ref, Ref<zzYMD> ref2) {
        if (zzymd2 != null) {
            zzymd3.zzu(zzymd2);
            zzymd3.zzt(zzymd2.zzYo0());
            zzymd3.zzYo1().zzt(zzymd3);
            if (zzymd3.zzYo0() != null) {
                zzymd3.zzYo0().zzu(zzymd3);
            }
        } else if (zzymd != null) {
            zzymd3.zzt(zzymd);
            zzymd3.zzu(zzymd.zzYo1());
            zzymd3.zzYo0().zzu(zzymd3);
            if (zzymd3.zzYo1() != null) {
                zzymd3.zzYo1().zzt(zzymd3);
            }
        }
        if (ref.get() == null || ref.get().zzYo0() == zzymd3) {
            ref.set(zzymd3);
        }
        if (ref2.get() == null || ref2.get().zzYo1() == zzymd3) {
            ref2.set(zzymd3);
        }
        zzymd3.zzZ(this);
    }

    public final void zzZ(zzY0B zzy0b) {
        this.zzYgd = zzy0b;
    }
}
