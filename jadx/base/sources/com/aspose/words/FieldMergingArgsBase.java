package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FieldMergingArgsBase {
    private FieldMergeField zzYDf;
    private Object zzYDg;
    private String zzYDh;
    private int zzYDi;
    private String zzYDj;
    private String zzYDk;
    private Document zzZEY;

    public FieldMergingArgsBase(Document document, String str, int i, FieldMergeField fieldMergeField, String str2, String str3, Object obj) {
        this.zzZEY = document;
        this.zzYDj = str;
        this.zzYDi = i;
        this.zzYDf = fieldMergeField;
        this.zzYDk = str2;
        this.zzYDh = str3;
        setFieldValue(obj);
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public String getDocumentFieldName() {
        return this.zzYDh;
    }

    public FieldMergeField getField() {
        return this.zzYDf;
    }

    public String getFieldName() {
        return this.zzYDk;
    }

    public Object getFieldValue() {
        return this.zzYDg;
    }

    public int getRecordIndex() {
        return this.zzYDi;
    }

    public String getTableName() {
        return this.zzYDj;
    }

    public void setFieldValue(Object obj) {
        this.zzYDg = obj;
    }
}
