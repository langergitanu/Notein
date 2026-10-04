package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ShapeRenderer extends NodeRendererBase {
    public ShapeRenderer(ShapeBase shapeBase) throws Exception {
        if (shapeBase == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: shape");
        }
        zzYC1 zzyc1ZzYB = zzYB(shapeBase);
        zz5(zzyc1ZzYB.zzyv());
        zzY(shapeBase.getDocument());
        zzZ5(zzyc1ZzYB.zzY8K().zz7t());
    }

    private static zzYC1 zzYB(ShapeBase shapeBase) throws Exception {
        zzYC1 zz1n = shapeBase.getMarkupLanguage() == 0 ? new zz1N(shapeBase) : new zzY2B(shapeBase);
        zz1n.zzX(zz1n.zzZua());
        zz1n.zz5(zz1n.zzY(zz1n.zzY8K()));
        zz1n.zzY8L();
        return zz1n;
    }
}
