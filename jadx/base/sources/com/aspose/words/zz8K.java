package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zz8K {
    private static String zzT(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        if (shapeBase == null) {
            return null;
        }
        boolean z = zzzxr.getCompliance() == 2;
        Ref ref = new Ref(null);
        zzZYD zzzydZzZ = zzZ(zzzxr, zzZWV.zz0(40, z), "application/vnd.ms-office.drawingml.diagramDrawing+xml", "/word/diagrams/drawing{0}.xml", ref);
        String str = (String) ref.get();
        zzzxr.zzY(zzzydZzZ);
        zzA0.zzY(shapeBase, zzzxr);
        zzzxr.zzZlX();
        return str;
    }

    private static String zzY(zz9L zz9l, zzZXR zzzxr) throws Exception {
        boolean z = zzzxr.getCompliance() == 2;
        Ref ref = new Ref(null);
        zzZYD zzzydZzZ = zzZ(zzzxr, zzZWV.zz0(26, z), "application/vnd.openxmlformats-officedocument.drawingml.diagramLayout+xml", "/word/diagrams/layout{0}.xml", ref);
        String str = (String) ref.get();
        zzzxr.zzY(zzzydZzZ);
        zz96.zzZ(zz9l, zzzxr);
        zzzxr.zzZlX();
        return str;
    }

    public static void zzZ(zz53 zz53Var, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY("dgm:relIds");
        zzzydZzZlV.zz0("xmlns:dgm", zzZX5.zz9(8, z));
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        zzAV zzav = (zzAV) zz53Var;
        String strZzZ = zzZ(zzav.zzZER(), zzzxr);
        String strZzY = zzY(zzav.zzZES(), zzzxr);
        String strZzY2 = zzY(zzav.zzZEQ(), zzzxr);
        String strZzY3 = zzY(zzav.zzZEP(), zzzxr);
        zzzydZzZlV.zz0("r:dm", strZzZ);
        zzzydZzZlV.zz0("r:lo", strZzY);
        zzzydZzZlV.zz0("r:qs", strZzY2);
        zzzydZzZlV.zz0("r:cs", strZzY3);
        zzzydZzZlV.zzo();
    }

    private static String zzY(zz8S zz8s, zzZXR zzzxr) throws Exception {
        boolean z = zzzxr.getCompliance() == 2;
        Ref ref = new Ref(null);
        zzZYD zzzydZzZ = zzZ(zzzxr, zzZWV.zz0(27, z), "application/vnd.openxmlformats-officedocument.drawingml.diagramStyle+xml", "/word/diagrams/quickStyle{0}.xml", ref);
        String str = (String) ref.get();
        zzzxr.zzY(zzzydZzZ);
        zz8R.zzZ(zz8s, zzzxr);
        zzzxr.zzZlX();
        return str;
    }

    private static String zzY(zzAT zzat, zzZXR zzzxr) throws Exception {
        boolean z = zzzxr.getCompliance() == 2;
        Ref ref = new Ref(null);
        zzZYD zzzydZzZ = zzZ(zzzxr, zzZWV.zz0(24, z), "application/vnd.openxmlformats-officedocument.drawingml.diagramColors+xml", "/word/diagrams/colors{0}.xml", ref);
        String str = (String) ref.get();
        zzzxr.zzY(zzzydZzZ);
        zzAR.zzZ(zzat, zzzxr);
        zzzxr.zzZlX();
        return str;
    }

    private static String zzZ(zzAM zzam, zzZXR zzzxr) throws Exception {
        String strZzT = zzT(zzam.zzZEs(), zzzxr);
        boolean z = zzzxr.getCompliance() == 2;
        Ref ref = new Ref(null);
        zzZYD zzzydZzZ = zzZ(zzzxr, zzZWV.zz0(25, z), "application/vnd.openxmlformats-officedocument.drawingml.diagramData+xml", "/word/diagrams/data{0}.xml", ref);
        String str = (String) ref.get();
        zzzxr.zzY(zzzydZzZ);
        zzA4.zzZ(zzam, strZzT, zzzxr);
        zzzxr.zzZlX();
        return str;
    }

    private static zzZYD zzZ(zzZXR zzzxr, String str, String str2, String str3, Ref<String> ref) throws Exception {
        return zzzxr.zzY(zzzxr.zzZlV().zzZmN(), com.aspose.words.internal.zzZKN.format(str3, Integer.valueOf(zzzxr.zzNG(str))), str2, str, ref);
    }
}
