package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ8 extends zzQJ<zzQG> {
    private ArrayList<zzQG> zzKA;
    private ArrayList<zzQG> zzKB;
    private int zzKC;
    private int zzKD;
    private ArrayList<zzQG> zzKy;
    private ArrayList<zzQG> zzKz;

    public zzQ8() {
        this.zzKB = new ArrayList<>();
        this.zzKA = new ArrayList<>();
        this.zzKz = new ArrayList<>();
        this.zzKy = new ArrayList<>();
    }

    private boolean zzQ4() {
        return this.zzKB.size() > 0;
    }

    public final zzQ6 zzQ0() {
        if (zzQ3()) {
            return this.zzKA.get(0).zzQv();
        }
        return null;
    }

    public final zzQ6 zzQ1() {
        if (zzQ4()) {
            return this.zzKB.get(0).zzQv();
        }
        return null;
    }

    public final boolean zzQ2() {
        return this.zzKy.size() > 0;
    }

    public final boolean zzQ3() {
        return this.zzKA.size() > 0;
    }

    public final int zzQ5() {
        return this.zzKC;
    }

    public final int zzQ6() {
        return this.zzKD;
    }

    public final zzQG[] zzQ7() {
        return (zzQG[]) this.zzKz.toArray(new zzQG[0]);
    }

    public final zzQG[] zzQ8() {
        return (zzQG[]) this.zzKA.toArray(new zzQG[0]);
    }

    public final zzQG[] zzQ9() {
        return (zzQG[]) this.zzKB.toArray(new zzQG[0]);
    }

    @Override // com.aspose.words.internal.zzQJ
    /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final int zzZ(zzQG zzqg) {
        int type = zzqg.getType();
        if (type == 1) {
            zzZQG.zzZ(this.zzKB, zzqg);
        } else if (type == 2) {
            zzZQG.zzZ(this.zzKA, zzqg);
        } else if (type == 8) {
            zzZQG.zzZ(this.zzKz, zzqg);
        } else if (type == 16) {
            zzZQG.zzZ(this.zzKy, zzqg);
        }
        return super.zzZ(zzqg);
    }

    @Override // com.aspose.words.internal.zzQJ, com.aspose.words.internal.zzQI
    public final void zzZ(zzQA zzqa) throws Exception {
        zzqa.zzZ(this);
        super.zzZ(zzqa);
        zzqa.zzQd();
    }

    public final int zzZ(zzQG[] zzqgArr) {
        int iZzZ = -1;
        if (zzqgArr.length > 0) {
            for (zzQG zzqg : zzqgArr) {
                iZzZ = zzZ(zzqg);
            }
        }
        return iZzZ;
    }

    public zzQ8(int i, int i2, int i3, int i4) {
        this.zzKB = new ArrayList<>(i);
        this.zzKA = new ArrayList<>(i2);
        this.zzKz = new ArrayList<>(i3);
        this.zzKy = new ArrayList<>(i4);
        this.zzKD = i3;
        this.zzKC = i4;
    }

    public final void zzW(zzQ9 zzq9) {
        if (zzQw().size() == 0) {
            return;
        }
        zzZ(new zzQH(zzq9));
        zzQF zzqf = new zzQF();
        zzQK zzqk = new zzQK();
        zzqk.zzZ(zzqf, zzQw());
        zzQw().clear();
        zzqk.zzZ(zzQw(), zzqf);
    }
}
