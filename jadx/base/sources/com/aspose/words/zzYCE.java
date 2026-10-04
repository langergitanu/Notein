package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYCE {
    private Map<ShapeBase, zzX0> zzXnj;
    protected IWarningCallback zzYUo;

    public zzYCE(IWarningCallback iWarningCallback, Map<ShapeBase, zzX0> map) {
        this.zzYUo = iWarningCallback;
        this.zzXnj = map;
    }

    private void zzYF(ShapeBase shapeBase) {
        if (shapeBase.isGroup()) {
            for (int i = 0; i < shapeBase.getChildNodes(0, false).getCount(); i++) {
                ShapeBase shapeBase2 = (ShapeBase) com.aspose.words.internal.zzZKW.zzZ(shapeBase.getChildNodes(0, false).get(i), ShapeBase.class);
                if (shapeBase2 != null) {
                    zzYF(shapeBase2);
                }
            }
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzXnj, shapeBase);
    }

    public final com.aspose.words.internal.zzG zzY(zzYC5 zzyc5, boolean z) {
        zzX0 zzx0 = (zzX0) com.aspose.words.internal.zzQW.zzZ((Map<ShapeBase, TValue>) this.zzXnj, zzyc5.zz7u());
        if (zzx0 == null) {
            return null;
        }
        zzyc5.zz1(zzx0.zz7s());
        zzyc5.zz2(zzx0.zz7t());
        if (z) {
            zzyc5.zzXf(zzx0.zz7s().getSize());
        }
        zzyc5.zzX(zzx0.zz6L());
        return zzx0.zz7v().zzZJ();
    }

    public final void zzYG(ShapeBase shapeBase) {
        zzYF(shapeBase.zzYa6());
    }

    public final void zzZ(ShapeBase shapeBase, zzX0 zzx0) {
        this.zzXnj.put(shapeBase, zzx0);
    }
}
