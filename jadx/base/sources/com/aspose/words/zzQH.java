package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
final class zzQH {
    private static Object zzZqM = new Object();
    private static volatile zzQH zzZqN;
    private com.aspose.words.internal.zzPV zzZqO;
    private int zzZqP;
    private boolean zzZr1;
    private int zzZr3;

    public zzQH() {
        this(0);
    }

    private zzK5 zzZWA() {
        return new zzK5(this.zzZr3, this.zzZqP, this.zzZr1);
    }

    private zzQ3 zzZWB() {
        return new zzQ3(this.zzZr1);
    }

    private zzQN zzZWx() {
        return new zzQN(this.zzZr3, (this.zzZqP & 2) == 0, this.zzZr1);
    }

    private zzOM zzZWy() {
        return new zzOM(this.zzZqP);
    }

    public static zzQH zzZWz() {
        if (zzZqN == null) {
            synchronized (zzZqM) {
                try {
                    if (zzZqN == null) {
                        zzZqN = new zzQH(0);
                    }
                } finally {
                }
            }
        }
        return zzZqN;
    }

    public final zzMJ zzX(Collection<zzLT> collection) {
        return new zzMJ(collection, zzZWA(), new zzQJ(), zzZWy(), zzZWB(), this.zzZr3, this.zzZqO);
    }

    public final zzML zzZ(String str, zzZFF zzzff) {
        return new zzML(str, zzzff, this.zzZr3, this.zzZr1);
    }

    public final zzZIJ zzZWC() {
        return new zzZIJ(this);
    }

    public zzQH(int i) {
        this(i, 0, com.aspose.words.internal.zzPV.zzKa, false);
    }

    public final zzLS zzZ(ArrayList<zzLT> arrayList, ArrayList<zzN0> arrayList2, String str, String str2, zzMJ zzmj, boolean z, boolean z2) {
        return new zzLS(arrayList, arrayList2, str, str2, zzmj, new zzZIJ(this), new zzZK7(), zzmj.zzZVq(), zzZWB(), zzZWx(), z, z2);
    }

    public zzQH(int i, int i2, com.aspose.words.internal.zzPV zzpv, boolean z) {
        this.zzZr3 = i;
        this.zzZqP = i2;
        this.zzZqO = zzpv;
        this.zzZr1 = z;
    }
}
