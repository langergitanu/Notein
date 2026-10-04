package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7B {
    public static void zzZ(zzP zzp, String str, String str2, String str3, String str4, String str5, String str6, String str7, zzZQ9 zzzq9, zzZQ9 zzzq92, zzZQ9 zzzq93, String str8, String str9, String str10, String str11) {
        zzp.zzZ("cp:coreProperties");
        zzp.zzX("xmlns:cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
        zzp.zzX("xmlns:dc", "http://purl.org/dc/elements/1.1/");
        zzp.zzX("xmlns:dcterms", "http://purl.org/dc/terms/");
        zzp.zzX("xmlns:dcmitype", "http://purl.org/dc/dcmitype/");
        zzp.zzX("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        zzp.zzY("dc:title", str);
        zzp.zzY("dc:subject", str2);
        zzp.zzY("dc:creator", str3);
        zzp.zzY("cp:keywords", str4);
        if (zzZYD.zzXk(str5)) {
            zzp.zzY("dc:description");
            zzp.zzV(str5);
            zzp.zzo();
        }
        zzp.zzY("cp:lastModifiedBy", str6);
        zzp.zzZ("cp:revision", str7);
        zzp.zzZ("cp:lastPrinted", zzzq9);
        zzZ(zzp, "created", zzzq92);
        zzZ(zzp, "modified", zzzq93);
        zzp.zzY("cp:category", str8);
        zzp.zzY("cp:contentStatus", str9);
        zzp.zzY("dc:language", str10);
        zzp.zzY("cp:version", str11);
        zzp.endDocument();
    }

    private static void zzZ(zzP zzp, String str, zzZQ9 zzzq9) {
        if (zzzq9.getYear() > 1) {
            zzp.zzY("dcterms:" + str);
            zzp.zzX("xsi:type", "dcterms:W3CDTF");
            zzp.writeString(zzJB.zzR(zzzq9));
            zzp.zzp();
        }
    }
}
