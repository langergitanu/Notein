package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKO {
    public static void zzZ(CustomXmlPart customXmlPart, com.aspose.words.internal.zzP zzp, boolean z) {
        zzp.zzZ("ds:datastoreItem");
        zzp.zzX("ds:itemID", customXmlPart.getId());
        zzp.zzX("xmlns:ds", zzZX5.zz9(4, z));
        zzp.zzY("ds:schemaRefs");
        for (String str : customXmlPart.getSchemas()) {
            zzp.zzY("ds:schemaRef");
            zzp.zzX("ds:uri", str);
            zzp.zzo();
        }
        zzp.zzo();
        zzp.endDocument();
    }
}
