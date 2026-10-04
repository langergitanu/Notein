package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7C {
    private static final zzZHW zzUR = new zzZHW("application/vnd.openxmlformats-package.relationships+xml", "image/bmp", "image/x-emf", "image/gif", "image/jpeg", "image/x-pcz", "image/png", "image/x-wmf", "image/webp", "application/vnd.openxmlformats-officedocument.obfuscatedFont", "application/vnd.openxmlformats-package.digital-signature-origin", "application/vnd.openxmlformats-package.digital-signature-certificate");

    private static void zzY(String str, String str2, zzP zzp) {
        zzp.zzY("Override");
        zzp.zzX("PartName", str);
        zzp.zzX("ContentType", str2);
        zzp.zzp();
    }

    public static void zzZ(zz79 zz79Var, boolean z) throws Exception {
        zzZYT<Map.Entry> zzzyt = new zzZYT();
        zzZYT<Map.Entry> zzzyt2 = new zzZYT();
        for (zz77 zz77Var : zz79Var.zzxo()) {
            switch (zzUR.zzTP(zz77Var.getContentType())) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    zzzyt.set(zz77Var.zzxl(), zz77Var.getContentType());
                    break;
                default:
                    zzzyt2.zzB(zz77Var.getName(), zz77Var.getContentType());
                    break;
            }
        }
        zz77 zz77Var2 = new zz77("/[Content_Types].xml", "");
        zz79Var.zzxo().zzY(zz77Var2);
        zzP zzp = new zzP(zz77Var2.zzR1(), z);
        zzp.zzZ("Types");
        zzp.zzX("xmlns", "http://schemas.openxmlformats.org/package/2006/content-types");
        for (Map.Entry entry : zzzyt) {
            zzZ((String) entry.getKey(), (String) entry.getValue(), zzp);
        }
        zzZ("rels", "application/vnd.openxmlformats-package.relationships+xml", zzp);
        zzZ("xml", "application/xml", zzp);
        for (Map.Entry entry2 : zzzyt2) {
            zzY((String) entry2.getKey(), (String) entry2.getValue(), zzp);
        }
        zzp.endDocument();
    }

    private static void zzZ(String str, String str2, zzP zzp) {
        zzp.zzY("Default");
        zzp.zzX("Extension", str);
        zzp.zzX("ContentType", str2);
        zzp.zzp();
    }
}
