package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class Odso implements Cloneable {
    private char zzXS5;
    private boolean zzXS4 = false;
    private String zzY4L = "";
    private String zzYDj = "";
    private int zzXS3 = 7;
    private String zzXS2 = "";
    private OdsoFieldMapDataCollection zzXS1 = new OdsoFieldMapDataCollection();
    private OdsoRecipientDataCollection zzXS0 = new OdsoRecipientDataCollection();

    public Odso deepClone() {
        Odso odso = (Odso) memberwiseClone();
        odso.zzXS1 = new OdsoFieldMapDataCollection();
        Iterator<OdsoFieldMapData> it = this.zzXS1.iterator();
        while (it.hasNext()) {
            odso.zzXS1.add(it.next().deepClone());
        }
        odso.zzXS0 = new OdsoRecipientDataCollection();
        Iterator<OdsoRecipientData> it2 = this.zzXS0.iterator();
        while (it2.hasNext()) {
            odso.zzXS0.add(it2.next().deepClone());
        }
        return odso;
    }

    public char getColumnDelimiter() {
        return this.zzXS5;
    }

    public String getDataSource() {
        return this.zzY4L;
    }

    public int getDataSourceType() {
        return this.zzXS3;
    }

    public OdsoFieldMapDataCollection getFieldMapDatas() {
        return this.zzXS1;
    }

    public boolean getFirstRowContainsColumnNames() {
        return this.zzXS4;
    }

    public OdsoRecipientDataCollection getRecipientDatas() {
        return this.zzXS0;
    }

    public String getTableName() {
        return this.zzYDj;
    }

    public String getUdlConnectString() {
        return this.zzXS2;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setColumnDelimiter(char c) {
        this.zzXS5 = c;
    }

    public void setDataSource(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4L = str;
    }

    public void setDataSourceType(int i) {
        this.zzXS3 = i;
    }

    public void setFieldMapDatas(OdsoFieldMapDataCollection odsoFieldMapDataCollection) {
        com.aspose.words.internal.zzZ4.zzY((Object) odsoFieldMapDataCollection, "value");
        this.zzXS1 = odsoFieldMapDataCollection;
    }

    public void setFirstRowContainsColumnNames(boolean z) {
        this.zzXS4 = z;
    }

    public void setRecipientDatas(OdsoRecipientDataCollection odsoRecipientDataCollection) {
        com.aspose.words.internal.zzZ4.zzY((Object) odsoRecipientDataCollection, "value");
        this.zzXS0 = odsoRecipientDataCollection;
    }

    public void setTableName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzYDj = str;
    }

    public void setUdlConnectString(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzXS2 = str;
    }
}
