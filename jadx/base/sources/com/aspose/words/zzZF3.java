package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZF3 {
    private ShapeBase zzYlM;
    private com.aspose.words.internal.zzZQ4 zzYlN;
    private long zzYlO;
    private com.aspose.words.internal.zzZQ4 zzZsf;

    private zzZF3(ShapeBase shapeBase, com.aspose.words.internal.zzZQ4 zzzq4, long j, com.aspose.words.internal.zzZQ4 zzzq42) {
        this.zzYlM = shapeBase;
        this.zzZsf = zzzq4;
        this.zzYlO = j;
        this.zzYlN = zzzq42;
    }

    private static int zzI(zzYMD zzymd) throws Exception {
        return (zzymd.zzZZJ() == null || (zzymd.zzZZJ() instanceof zzWT)) ? (int) zzymd.zzYqr() : ((int) zzymd.zzYqr()) - zzI(zzymd.zzZZJ());
    }

    public static zzZF3[] zzZ(Document document, Iterable<ShapeBase> iterable) throws Exception {
        ArrayList arrayList = new ArrayList();
        zzZ(arrayList, document.zzZqh(), iterable);
        return (zzZF3[]) arrayList.toArray(new zzZF3[0]);
    }

    public final ShapeBase zzYYZ() {
        return this.zzYlM;
    }

    public final long zzYZ0() {
        return this.zzYlO;
    }

    public final com.aspose.words.internal.zzZQ4 zzZPK() {
        return this.zzZsf;
    }

    private static void zzZ(ArrayList<zzZF3> arrayList, zzYNA zzyna, Iterable<ShapeBase> iterable) throws Exception {
        for (ShapeBase shapeBase : iterable) {
            zzY9X zzy9xZzZb = zzyna.zzZb(shapeBase);
            if (zzy9xZzZb != null) {
                zzy9xZzZb.zzY6X();
                long jZzYqr = ((zzZ55) zzy9xZzZb.zzZZJ()).zzYqr();
                long jZzX = com.aspose.words.internal.zzZPZ.zzX(zzy9xZzZb.zzYqr(), -zzI(zzy9xZzZb.zzZZJ()), -((int) (jZzYqr >> 32)));
                if (!(((zzZ55) zzy9xZzZb.zzZZJ()).zzZZJ() instanceof zzWT)) {
                    jZzX = com.aspose.words.internal.zzZPZ.zzX(jZzX, -zzy9xZzZb.zzZ8m().zz5X(), 0);
                }
                com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(jZzX, zzy9xZzZb.getSize()));
                zzYC5 zzyc5ZzU = zzZ68.zzU(zzy9xZzZb);
                zzzq4ZzY.offset(zzyc5ZzU.zz7t().getX() - zzyc5ZzU.zz7s().getX(), zzyc5ZzU.zz7t().getY() - zzyc5ZzU.zz7s().getY());
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzZF3(shapeBase, zzzq4ZzY, com.aspose.words.internal.zzSA.zzF(zzy9xZzZb.zzZZJ().zzYK()), com.aspose.words.internal.zzSA.zzY(new com.aspose.words.internal.zzZQ5(jZzYqr, ((zzZ55) zzy9xZzZb.zzZZJ()).getSize()))));
            }
        }
    }
}
