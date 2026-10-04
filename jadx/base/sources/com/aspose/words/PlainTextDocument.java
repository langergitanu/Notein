package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class PlainTextDocument {
    private BuiltInDocumentProperties zzYTi;
    private CustomDocumentProperties zzYUK;
    private String zzZi;

    public PlainTextDocument(String str) throws Exception {
        LoadOptions loadOptions = new LoadOptions(0, "", "");
        loadOptions.zzYNF();
        com.aspose.words.internal.zzZOP zzzopZzX0 = com.aspose.words.internal.zzZXR.zzX0(str);
        try {
            zz4(new Document(zzzopZzX0, loadOptions, true));
        } finally {
            if (zzzopZzX0 != null) {
                zzzopZzX0.close();
            }
        }
    }

    private void zz4(Document document) {
        this.zzZi = document.getText();
        this.zzYTi = document.getBuiltInDocumentProperties();
        this.zzYUK = document.getCustomDocumentProperties();
    }

    public BuiltInDocumentProperties getBuiltInDocumentProperties() {
        return this.zzYTi;
    }

    public CustomDocumentProperties getCustomDocumentProperties() {
        return this.zzYUK;
    }

    public String getText() {
        return this.zzZi;
    }

    public PlainTextDocument(String str, LoadOptions loadOptions) throws Exception {
        LoadOptions loadOptionsZz1s;
        if (loadOptions == null) {
            loadOptionsZz1s = new LoadOptions();
        } else {
            loadOptionsZz1s = loadOptions.zz1s();
        }
        loadOptionsZz1s.zzYNF();
        com.aspose.words.internal.zzZOP zzzopZzX0 = com.aspose.words.internal.zzZXR.zzX0(str);
        try {
            zz4(new Document(zzzopZzX0, loadOptionsZz1s, true));
        } finally {
            if (zzzopZzX0 != null) {
                zzzopZzX0.close();
            }
        }
    }

    private PlainTextDocument(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        LoadOptions loadOptions = new LoadOptions(0, "", "");
        loadOptions.zzYNF();
        zz4(new Document(zzzop, loadOptions, true));
    }

    public PlainTextDocument(InputStream inputStream) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    private PlainTextDocument(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions) throws Exception {
        LoadOptions loadOptionsZz1s;
        if (loadOptions == null) {
            loadOptionsZz1s = new LoadOptions();
        } else {
            loadOptionsZz1s = loadOptions.zz1s();
        }
        loadOptionsZz1s.zzYNF();
        zz4(new Document(zzzop, loadOptionsZz1s, true));
    }

    public PlainTextDocument(InputStream inputStream, LoadOptions loadOptions) throws Exception {
        this(com.aspose.words.internal.zzZOP.zzY(inputStream), loadOptions);
    }
}
