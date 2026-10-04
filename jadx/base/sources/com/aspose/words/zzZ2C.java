package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2C extends zzY9C {
    private zzYN8 zzY4m;
    private zzYN8 zzY4n;
    private zzYL5<zzYN8> zzY4o;
    private int zzY4p;

    public zzZ2C(zzZYW zzzyw) {
        super(zzzyw);
        this.zzY4p = -1;
        this.zzY4o = new zzYL5<>();
    }

    @Override // com.aspose.words.zzY9C
    public final int getStoryType() {
        return 1;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzY4m;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzY4n;
    }

    @Override // com.aspose.words.zzZ6T
    public final ArrayList<zzYMD> zzA(zzYMD zzymd) {
        throw new IllegalStateException("Use GetPages instead.");
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzB(zzYMD zzymd) {
        zzYN8 zzyn8 = this.zzY4n;
        if (zzyn8 == zzymd) {
            zzZ((zzYN8) zzyn8.zzYo1());
        }
        zzYN8 zzyn82 = this.zzY4m;
        if (zzyn82 == zzymd) {
            zzY((zzYN8) zzyn82.zzYo0());
        }
        if (this.zzY4o.zzZ4((zzYN8) zzymd)) {
            this.zzY4o.zzYPf();
        }
        zzZoU();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) {
        return null;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzY4m = (zzYN8) zzymd;
    }

    public final zzYL5<zzYN8> zzYIZ() {
        return this.zzY4o;
    }

    public final zzYN8 zzYJb() {
        return this.zzY4n;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzY4n = (zzYN8) zzymd;
    }

    @Override // com.aspose.words.zzY9C
    public final zzY9A zzZ4B() {
        if (super.zzZ4B() == null) {
            zzZ(new zzYN6(this));
        }
        return super.zzZ4B();
    }

    @Override // com.aspose.words.zzY9C
    public final boolean zzbD() {
        return true;
    }

    public final int zzv5(int i) {
        int i2;
        if (i == 1) {
            int count = this.zzY4o.getCount();
            this.zzY4p = count;
            return count;
        }
        if (i != 2) {
            return (i == 3 || (i2 = this.zzY4p) == -1) ? this.zzY4o.getCount() : i2;
        }
        this.zzY4p = -1;
        return this.zzY4o.getCount();
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzY(zzZ6T zzz6t) throws Exception {
        zzZ2D zzz2d = (zzZ2D) zzz6t;
        zzY44.zzW(zzz2d);
        if (zzz2d.zzYJb() != null) {
            if (zzz2d.zzYJb().isEmpty()) {
                zzz2d.zzYJb().remove();
            } else {
                this.zzY4n.zzZ((zzZ2D) zzz2d.zzYTp());
            }
        }
        super.zzY(zzz6t);
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd, zzYMD zzymd2, zzYMD zzymd3, boolean z) {
        zzymd3.zza9();
        zzymd3.zzZZJ();
        zzYN8 zzyn8 = (zzYN8) zzymd3;
        if (this.zzY4n == null || ((zzYN8) zzyn8.zzYo1()) == this.zzY4n) {
            zzZ(zzyn8);
        }
        if (this.zzY4m == null || ((zzYN8) zzyn8.zzYo0()) == this.zzY4m) {
            zzY(zzyn8);
        }
        if (((zzYN8) zzyn8.zzYo1()) != null) {
            this.zzY4o.zzZ4((zzYN8) zzyn8.zzYo1());
            this.zzY4o.zzZ6(zzyn8);
        } else {
            if (((zzYN8) zzyn8.zzYo0()) != null) {
                this.zzY4o.zzZ4((zzYN8) zzyn8.zzYo0());
            }
            this.zzY4o.zzZ5(zzyn8);
        }
        zzZoU();
    }
}
