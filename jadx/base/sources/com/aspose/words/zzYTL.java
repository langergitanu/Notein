package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTL {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("href", "class-id", "filter-name", "actuate", "show", C18437z2.f56754h, "id", FirebaseAnalytics.Param.LEVEL, "opacity", RequestParameters.POSITION, "repeat");

    private static String zzY(zzYQ7 zzyq7, Shape shape, String str, boolean z) throws Exception {
        byte[] bArrZzZ;
        String value = zzyq7.zzYuT().getValue();
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(value, "http:", i) || com.aspose.words.internal.zzZKN.zzS(value, "https:", i) || com.aspose.words.internal.zzZKN.zzS(value, "file:", i)) {
            if ("object-ole".equals(str) || "object".equals(str)) {
                shape.getOleFormat().setSourceFullName(zzYOU.zzDo(value));
            }
            if (com.aspose.words.internal.zzZKN.zzW(str, "image", i)) {
                shape.getImageData().setSourceFullName(zzYOU.zzDo(value));
            }
        } else {
            if ("object-ole".equals(str) || "object".equals(str)) {
                return zzZ(zzyq7, value, shape);
            }
            if (com.aspose.words.internal.zzZKN.zzW(str, "image", i) && (bArrZzZ = zzZ(zzyq7)) != null) {
                if (z) {
                    shape.zzY9J().setImageBytes(bArrZzZ);
                    return null;
                }
                shape.getImageData().zzY7(bArrZzZ);
                return null;
            }
        }
        return null;
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, Shape shape) throws Exception {
        zzyq7.zzE5(null);
        String localName = zzyq7.zzYuT().getLocalName();
        zzZ(zzyq7, shape, localName, false);
        zzY(zzyq7, shape, localName);
        if (compositeNode == null || !compositeNode.getChildNodes(0, false).contains(shape)) {
            zzyq7.zzZ(compositeNode, shape);
        }
    }

    public static void zzZ(zzYQ7 zzyq7, Shape shape, String str) throws Exception {
        zzZ(zzyq7, shape, str, false);
    }

    public static void zzZ(zzYQ7 zzyq7, Shape shape, String str, boolean z) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String strZzY = null;
        String value = null;
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    strZzY = zzY(zzyq7, shape, str, z);
                    break;
                case 1:
                    value = zzyq9ZzYuT.getValue();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    zzyq7.zzZ(256, false, str);
                    break;
                default:
                    zzyq7.zzYi(str, zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        zzZ(shape, str, strZzY, value);
    }

    private static void zzY(zzYQ7 zzyq7, Shape shape, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            if (!zzyq7.zzR(shape.zzYvW())) {
                String localName = zzyq9ZzYuT.getLocalName();
                if (!"binary-data".equals(localName) && !"list".equals(localName) && !ContextChain.TAG_PRODUCT.equals(localName)) {
                    zzyq9ZzYuT.zzk();
                } else {
                    zzyq7.zzZ(1, true, "draw:image");
                }
            }
        }
    }

    private static void zzZ(Shape shape, String str, String str2, String str3) {
        if (zzZ(shape, str)) {
            return;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(str2) || "00000000-0000-0000-0000-000000000000".equals(str2)) {
            str2 = str3;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            shape.getOleFormat().setProgId(zzYS3.zzFk(str2));
        }
    }

    private static boolean zzZ(Shape shape, String str) {
        if (shape.getOleFormat() == null || com.aspose.words.internal.zzZYD.zzXk(shape.getOleFormat().getProgId())) {
            return true;
        }
        return ("object-ole".equals(str) || "object".equals(str)) ? false : true;
    }

    private static String zzZ(zzYQ7 zzyq7, String str, Shape shape) throws Exception {
        byte[] bArrZzZ = zzZ(zzyq7);
        if (bArrZzZ == null) {
            shape.getImageData().setSourceFullName(zzYOU.zzDo(str));
            return null;
        }
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(bArrZzZ));
        zzUD zzudZzO = zzYOU.zzO(zzkd.zzIf());
        OleFormat oleFormat = shape.getOleFormat();
        oleFormat.zzY(zzZ(zzyq7, zzudZzO, zzkd, str));
        if (zzudZzO != null && com.aspose.words.internal.zzZYD.zzXk(zzudZzO.getProgId())) {
            oleFormat.setProgId(zzudZzO.getProgId());
        }
        return oleFormat.zzYrC().toString();
    }

    private static zzZBL zzZ(zzYQ7 zzyq7, zzUD zzud, com.aspose.words.internal.zzKD zzkd, String str) throws Exception {
        String strZzFm;
        if (!"application/octet-stream".equals(zzYOU.zzN(zzyq7, str))) {
            return new zzYOC(zzkd.zzIf());
        }
        if (zzud == null) {
            strZzFm = "application/vnd.openxmlformats-officedocument.oleObject";
        } else if (com.aspose.words.internal.zzZYD.zzXk(zzud.getProgId()) && com.aspose.words.internal.zzZKN.zzW(zzud.getProgId(), ".12", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            strZzFm = zzYS3.zzFn(zzud.getProgId());
        } else {
            strZzFm = zzYS3.zzFm(zzud.zzAC().toString());
        }
        if (!"application/vnd.openxmlformats-officedocument.oleObject".equals(strZzFm)) {
            return new zzYO2(zzkd.zzIf().zzYt("Package"), strZzFm, str);
        }
        return new zzYOC(zzkd.zzIf());
    }

    private static byte[] zzZ(zzYQ7 zzyq7) throws Exception {
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn(com.aspose.words.internal.zzZKN.format("/{0}", zzyq7.zzYuT().getValue().replace("./", "")));
        if (zzyqoZzEn == null) {
            return null;
        }
        byte[] bArrZzZ = zzZ(zzyq7, zzyqoZzEn.zzYvo());
        com.aspose.words.internal.zzXC zzxcZz3 = com.aspose.words.internal.zzIL.zz3(bArrZzZ);
        com.aspose.words.internal.zzXA<byte[]> zzxaZzYuM = zzyq7.zzYuM();
        byte[] bArrZzX = zzxaZzYuM.zzX(zzxcZz3);
        if (bArrZzX != null) {
            return bArrZzX;
        }
        zzxaZzYuM.zzZ(zzxcZz3, bArrZzZ);
        return bArrZzZ;
    }

    private static byte[] zzZ(zzYQ7 zzyq7, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        com.aspose.words.internal.zzZXX zzzxx = new com.aspose.words.internal.zzZXX(zzzor, new zzY21(zzyq7.zzYyZ().getWarningCallback()), zzyq7.getDocument().zzZqy());
        if (!zzzxx.zzqK()) {
            return zzzor.zzWy();
        }
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzG zzgZzqL = zzzxx.zzqL();
            long jZzG = com.aspose.words.internal.zzZPW.zzG(zzzxx.getWidth(), zzzxx.getHeight());
            ImageSaveOptions imageSaveOptions = new ImageSaveOptions(103);
            imageSaveOptions.zzYVT();
            imageSaveOptions.setUseGdiEmfRenderer(false);
            zzYDY.zzZ(zzgZzqL, jZzG, zzzor2, imageSaveOptions, zzyq7.getDocument().zzZqx().zzZo7());
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor2);
        } finally {
            zzzor2.close();
        }
    }
}
