package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWI {
    public static void zzZ(SmartTag smartTag, zzZYD zzzyd) {
        zzzyd.zzY("w:smartTag");
        zzzyd.zz0("w:uri", smartTag.getUri());
        zzzyd.zz0("w:element", smartTag.getElement());
        zzZ(smartTag.getProperties(), zzzyd);
    }

    private static void zzZ(CustomXmlPropertyCollection customXmlPropertyCollection, zzZYD zzzyd) {
        if (customXmlPropertyCollection.getCount() == 0) {
            return;
        }
        zzzyd.zzY("w:smartTagPr");
        for (CustomXmlProperty customXmlProperty : customXmlPropertyCollection) {
            zzzyd.zzY("w:attr");
            zzzyd.zz0("w:uri", customXmlProperty.getUri());
            zzzyd.zz0("w:name", customXmlProperty.getName());
            zzzyd.zz0("w:val", customXmlProperty.getValue());
            zzzyd.zzp();
        }
        zzzyd.zzp();
    }
}
