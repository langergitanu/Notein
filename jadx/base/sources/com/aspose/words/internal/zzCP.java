package com.aspose.words.internal;

import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes5.dex */
final class zzCP {
    private static Object zzZ(String str, Class cls, zzC8 zzc8, zzCO zzco) throws Exception {
        zzZ4.zzY((Object) str, "value");
        zzCC zzccZzZ = zzCC.zzZ(zzc8, zzco);
        zzC6 zzc6 = new zzC6(new zzZOM(str));
        try {
            return zzccZzZ.zzY(zzc6, cls);
        } finally {
            zzc6.dispose();
        }
    }

    public static Document zzZ(String str, zzC5 zzc5) throws Exception {
        return (Document) zzZ(str, Document.class, zzc5, new zzZSQ(zzc5));
    }
}
