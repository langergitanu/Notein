package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzC7 {
    public static void zzY(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        boolean z2 = shapeBase.zzY9i().zzZHY() == 13;
        String str = z2 ? "cx" : "c";
        zzzydZzZlV.zzY(str.concat(":chart"));
        zzzydZzZlV.zz0("xmlns:".concat(str), zzZX5.zz9(z2 ? 28 : 9, z));
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        String strZz0 = zzZWV.zz0(z2 ? 55 : 23, z);
        String str2 = com.aspose.words.internal.zzZKN.format("/word/charts/{0}{1}.xml", z2 ? "chartEx" : "chart", Integer.valueOf(zzzxr.zzNG(strZz0)));
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzY = zzzxr.zzY(zzzxr.zzZlV().zzZmN(), str2, z2 ? "application/vnd.ms-office.chartex+xml" : "application/vnd.openxmlformats-officedocument.drawingml.chart+xml", strZz0, ref);
        zzzydZzZlV.zz0("r:id", ref.get());
        zzzxr.zzY(zzzydZzY);
        zzD5.zzY(shapeBase, zzzxr);
        zzzxr.zzZlX();
        zzzydZzZlV.zzo();
    }
}
