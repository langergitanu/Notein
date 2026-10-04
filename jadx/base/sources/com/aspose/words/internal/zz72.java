package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz72 extends zzZW8 {
    private HashMap<zzZW5, zzZ> zzmJ;
    private Class zzmK;

    public static class zzZ {
        private zzZVP zzBO;
        private zz6P[] zzmH;
        private zzZW5 zzmI;

        public zzZ(zzZW5 zzzw5) {
            this.zzmI = zzzw5;
        }

        public final zz6P zzUi(int i) {
            zz6P zz6p;
            zz6P[] zz6pArr = this.zzmH;
            if (zz6pArr == null) {
                this.zzmH = new zz6P[this.zzmI.zzAE().length];
                zz6p = null;
            } else {
                zz6p = zz6pArr[i];
            }
            if (zz6p != null) {
                return zz6p;
            }
            zz6P zz6p2 = new zz6P(zzZZO.zzA(this.zzmI.zzAE()[i].getType()));
            this.zzmH[i] = zz6p2;
            return zz6p2;
        }

        public final zzZVP zzt() {
            if (this.zzBO == null) {
                this.zzBO = new zzZVP(zzZZO.zzA(this.zzmI.zzAF().getType()));
            }
            return this.zzBO;
        }
    }

    public zz72(zzZVP[] zzzvpArr) {
        super(zzzvpArr);
    }

    private zzZ zzN(zzZW5 zzzw5) {
        zzZ zzz;
        HashMap<zzZW5, zzZ> map = this.zzmJ;
        if (map == null) {
            this.zzmJ = new HashMap<>();
            zzz = null;
        } else {
            zzz = (zzZ) zzQW.zzZ(map, zzzw5);
        }
        if (zzz != null) {
            return zzz;
        }
        zzZ zzz2 = new zzZ(zzzw5);
        this.zzmJ.put(zzzw5, zzz2);
        return zzz2;
    }

    private boolean zzQ(zzZW5 zzzw5) {
        if (this.zzmK == null) {
            return false;
        }
        return zzzw5.zznQ().isAssignableFrom(this.zzmK);
    }

    public final void zzH(Class cls) {
        this.zzmK = cls;
    }

    public final boolean zzO(zzZW5 zzzw5) {
        if (!zzzw5.zzAD()) {
            return false;
        }
        for (int i = 0; i < zznX().length; i++) {
            if (zznX()[i].zznl()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZW8
    public final zzZVP zzP(zzZW5 zzzw5) {
        return !zzO(zzzw5) ? zzzw5.zzAF() : zzN(zzzw5).zzt();
    }

    @Override // com.aspose.words.internal.zzZW8
    public final boolean zzW(zzZW5 zzzw5) {
        if (zzzw5.zzAG() == 3 && !zzQ(zzzw5)) {
            return zzZ(zzzw5);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZW8
    public final zz6P zzY(zzZW5 zzzw5, int i) {
        return !zzO(zzzw5) ? zzzw5.zzAE()[i] : zzN(zzzw5).zzUi(i);
    }

    public abstract boolean zzZ(zzZW5 zzzw5);

    @Override // com.aspose.words.internal.zzZW8
    public final boolean zzxe() {
        return true;
    }
}
