package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzKN {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Item", "Properties");

    public static byte[] zzY(CustomXmlPartCollection customXmlPartCollection) throws Exception {
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOZ("88d96a0c-f192-11d4-a65f-0040963251e5"));
        zzkd.zzIf().zzZ("MsoDataStore", zzZ(customXmlPartCollection));
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzkd.zzL(zzzor);
        byte[] bArrZzWy = zzzor.zzWy();
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor2);
        zzzow.zzQ(8589935873L);
        zzzow.zzl(24);
        zzzow.writeBytes(com.aspose.words.internal.zzZO0.zzhX().getBytes("Msxml2.SAXXMLReader.6.0"));
        zzzow.writeByte((byte) 0);
        zzzow.zzQ(0L);
        zzzow.zzl(bArrZzWy.length);
        zzzow.writeBytes(bArrZzWy);
        zzzow.zzQ(1281L);
        return zzzor2.zzWy();
    }

    public static void zzZ(com.aspose.words.internal.zzKD zzkd, CustomXmlPartCollection customXmlPartCollection, IWarningCallback iWarningCallback) throws Exception {
        com.aspose.words.internal.zzAA<Map.Entry> zzaaZzYr = zzkd.zzIf().zzYr("MsoDataStore");
        if (zzaaZzYr == null) {
            return;
        }
        for (Map.Entry entry : zzaaZzYr) {
            entry.getValue();
            ((com.aspose.words.internal.zzAA) entry.getValue()).getCount();
            CustomXmlPart customXmlPart = new CustomXmlPart();
            for (Map.Entry entry2 : (com.aspose.words.internal.zzAA) entry.getValue()) {
                int iZzTP = zzUR.zzTP((String) entry2.getKey());
                if (iZzTP == 0) {
                    customXmlPart.setData(com.aspose.words.internal.zzZYQ.zzZX((com.aspose.words.internal.zzZOP) entry2.getValue()));
                } else if (iZzTP == 1) {
                    zzKP.zzZ((com.aspose.words.internal.zzZOP) entry2.getValue(), customXmlPart, iWarningCallback);
                }
            }
            customXmlPartCollection.add(customXmlPart);
        }
    }

    public static com.aspose.words.internal.zzAA zzZ(CustomXmlPartCollection customXmlPartCollection) throws Exception {
        if (customXmlPartCollection.getCount() == 0) {
            return null;
        }
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA();
        for (int i = 0; i < customXmlPartCollection.getCount(); i++) {
            CustomXmlPart customXmlPart = customXmlPartCollection.get(i);
            com.aspose.words.internal.zzAA zzaa2 = new com.aspose.words.internal.zzAA();
            zzaa2.zzZ("Item", new com.aspose.words.internal.zzZOR(customXmlPart.getData()));
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            zzKO.zzZ(customXmlPart, new com.aspose.words.internal.zzP(zzzor, new com.aspose.words.internal.zzZNI(false), false), false);
            zzaa2.zzB("Properties", zzzor);
            zzaa.zzZ(com.aspose.words.internal.zzZKN.format("cxds{0}", Integer.valueOf(i)), zzaa2);
        }
        return zzaa;
    }

    public static void zzZ(byte[] bArr, CustomXmlPartCollection customXmlPartCollection, IWarningCallback iWarningCallback) throws Exception {
        customXmlPartCollection.zzYx(bArr);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
        zzzox.zzXc();
        if (zzzox.zzXc() != 2) {
            zzY1Z.zzZ(iWarningCallback, 0, "Error is occurred while parsing Custom XML data.", new Object[0]);
            return;
        }
        zzzox.zzn(zzzox.zzXc());
        zzzox.zzX8();
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(zzzox.zzn(zzzox.zzXc())));
        if (com.aspose.words.internal.zzZYQ.zzT(zzzox, 8)) {
            zzzox.zzXc();
            zzzox.zzXc();
        }
        zzZ(zzkd, customXmlPartCollection, iWarningCallback);
    }
}
