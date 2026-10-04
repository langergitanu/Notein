package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz8U {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("urn:microsoft.com/office/officeart/2005/8/layout/list1", "urn:microsoft.com/office/officeart/2005/8/layout/chevron2");
    private zz8Z zzZ7J;

    public zz8U(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    private static zz99 zzX(zz99 zz99Var) {
        zz99 zz99Var2;
        zz99 zz99Var3;
        zz4U zz4u;
        zz99 zz99Var4 = (zz99) zz99Var.zzZFO();
        zz7N zz7n = (zz7N) zzY(zz99Var4.zzAy(), 7, 6, 5);
        if (zz7n == null || (zz99Var2 = (zz99) zzY(zz7n.zzAy(), 2, 0, 3)) == null || (zz99Var3 = (zz99) zzY(zz99Var2.zzAy(), 7, 5, 3)) == null || (zz4u = (zz4U) zzY(zz99Var3.zzAy(), 6, 5, 7)) == null || zz4u.zzl9().size() != 6) {
            return zz99Var;
        }
        com.aspose.words.internal.zzZQG.zzV(zz4u.zzl9(), 0, 5);
        return zz99Var4;
    }

    private static zz99 zzY(zz99 zz99Var) {
        zz99 zz99Var2 = (zz99) zz99Var.zzZFO();
        zzBD zzbd = (zzBD) zzY(zz99Var2.zzAy(), 7, 4, 2);
        if (zzbd == null || zzbd.zzl9().size() != 20) {
            return zz99Var;
        }
        zzbd.zzl9().remove(14);
        zzbd.zzl9().remove(13);
        zzbd.zzl9().remove(7);
        zzbd.zzl9().remove(6);
        return zz99Var2;
    }

    public final zz99 zzZCv() {
        try {
            int iZzTP = zzUR.zzTP(this.zzZ7J.zzZCE());
            return iZzTP != 0 ? iZzTP != 1 ? this.zzZ7J.zzZES().zzZE8() : zzX(this.zzZ7J.zzZES().zzZE8()) : zzY(this.zzZ7J.zzZES().zzZE8());
        } catch (Exception unused) {
            return this.zzZ7J.zzZES().zzZE8();
        }
    }

    private static zz98 zzY(ArrayList<zz98> arrayList, int i, int i2, int i3) {
        if (arrayList.size() != i) {
            return null;
        }
        zz98 zz98Var = arrayList.get(i2);
        if (zz98Var.zzZSn() != i3) {
            return null;
        }
        return zz98Var;
    }
}
