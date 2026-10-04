package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class XmlDataSource implements zzZCV {
    private com.aspose.words.internal.zzZSV zzWSl;

    public XmlDataSource(String str) throws Exception {
        this(str, (XmlDataLoadOptions) null);
    }

    private static com.aspose.words.internal.zzZSW zzZ(XmlDataLoadOptions xmlDataLoadOptions) {
        if (xmlDataLoadOptions != null) {
            return xmlDataLoadOptions.zzXQP();
        }
        return null;
    }

    @Override // com.aspose.words.zzZCV
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzH8 toCore() {
        return this.zzWSl;
    }

    private XmlDataSource(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this(zzzop, (XmlDataLoadOptions) null);
    }

    public XmlDataSource(InputStream inputStream) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public XmlDataSource(String str, String str2) throws Exception {
        this(str, str2, (XmlDataLoadOptions) null);
    }

    private XmlDataSource(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        this(zzzop, zzzop2, (XmlDataLoadOptions) null);
    }

    public XmlDataSource(InputStream inputStream, InputStream inputStream2) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), com.aspose.words.internal.zzZOP.zzY(inputStream2));
    }

    public XmlDataSource(String str, XmlDataLoadOptions xmlDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "xmlPath");
        this.zzWSl = new com.aspose.words.internal.zzZSV(str, zzZ(xmlDataLoadOptions));
    }

    private XmlDataSource(com.aspose.words.internal.zzZOP zzzop, XmlDataLoadOptions xmlDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "xmlStream");
        this.zzWSl = new com.aspose.words.internal.zzZSV(zzzop, zzZ(xmlDataLoadOptions));
    }

    public XmlDataSource(InputStream inputStream, XmlDataLoadOptions xmlDataLoadOptions) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), xmlDataLoadOptions);
    }

    public XmlDataSource(String str, String str2, XmlDataLoadOptions xmlDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "xmlPath");
        com.aspose.words.internal.zzZ4.zzU(str2, "xmlSchemaPath");
        this.zzWSl = new com.aspose.words.internal.zzZSV(str, str2, zzZ(xmlDataLoadOptions));
    }

    private XmlDataSource(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, XmlDataLoadOptions xmlDataLoadOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "xmlStream");
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop2, "xmlSchemaStream");
        this.zzWSl = new com.aspose.words.internal.zzZSV(zzzop, zzzop2, zzZ(xmlDataLoadOptions));
    }

    public XmlDataSource(InputStream inputStream, InputStream inputStream2, XmlDataLoadOptions xmlDataLoadOptions) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), com.aspose.words.internal.zzZOP.zzY(inputStream2), xmlDataLoadOptions);
    }
}
