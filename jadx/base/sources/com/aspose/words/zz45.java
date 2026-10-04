package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz45 implements Cloneable {
    private int zzH3;
    private double zzXA = -1.0d;
    private ArrayList<zzZC4> zzZ0B = new ArrayList<>();
    private boolean zzZ0A = true;
    private double zzXy = -1.0d;
    private boolean zzZ0z = false;
    private boolean zzZ0y = false;
    private boolean zzZ0x = false;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final void setHeight(double d) {
        this.zzXA = d;
        this.zzZ0y = true;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
        this.zzZ0z = true;
    }

    public final int zzO6() {
        return this.zzH3;
    }

    public final void zzWQ(boolean z) {
        this.zzZ0x = z;
    }

    public final void zzWR(boolean z) {
        this.zzZ0A = z;
    }

    public final void zzY1(int i) {
        this.zzH3 = i;
    }

    public final void zzZ(zzZC4 zzzc4) {
        if (zzzc4 == null) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ0B, zzzc4);
    }

    public final boolean zzZwZ() {
        return this.zzZ0x;
    }

    public final boolean zzZx0() {
        return this.zzZ0y;
    }

    public final boolean zzZx1() {
        return this.zzZ0z;
    }

    public final boolean zzZx2() {
        return this.zzZ0A;
    }

    public final ArrayList<zzZC4> zzZx3() {
        return this.zzZ0B;
    }

    public final zz45 zzZx4() {
        zz45 zz45Var = (zz45) memberwiseClone();
        if (zz45Var.zzZ0B != null) {
            zz45Var.zzZ0B = new ArrayList<>();
            Iterator<zzZC4> it = this.zzZ0B.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ(zz45Var.zzZ0B, it.next().zzZQP());
            }
        }
        return zz45Var;
    }
}
