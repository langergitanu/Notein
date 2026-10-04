package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class MailMergeSettings implements Cloneable {
    private int zzY4P = 1;
    private String zzY4O = "";
    private int zzY4N = 2;
    private String zzY4M = "";
    private String zzY4L = "";
    private int zzY4K = -1;
    private int zzY4J = 0;
    private boolean zzY4I = false;
    private String zzY4H = "";
    private boolean zzY4G = false;
    private boolean zzY4F = false;
    private String zzY4E = "";
    private int zzY4D = 0;
    private Odso zzY4C = new Odso();
    private String zzY4B = "";
    private boolean zzY4A = false;
    private int zzY4z = 24;
    private int zzY4y = 2;
    private int zzY4x = 6;
    private int zzY4w = 2;

    public void clear() {
        setMainDocumentType(0);
        setDataType(-1);
    }

    public MailMergeSettings deepClone() {
        MailMergeSettings mailMergeSettings = (MailMergeSettings) memberwiseClone();
        mailMergeSettings.zzY4C = this.zzY4C.deepClone();
        return mailMergeSettings;
    }

    public int getActiveRecord() {
        return this.zzY4P;
    }

    public String getAddressFieldName() {
        return this.zzY4O;
    }

    public int getCheckErrors() {
        return this.zzY4N;
    }

    public String getConnectString() {
        return this.zzY4M;
    }

    public String getDataSource() {
        return this.zzY4L;
    }

    public int getDataType() {
        return this.zzY4K;
    }

    public int getDestination() {
        return this.zzY4J;
    }

    public boolean getDoNotSupressBlankLines() {
        return this.zzY4I;
    }

    public String getHeaderSource() {
        return this.zzY4H;
    }

    public boolean getLinkToQuery() {
        return this.zzY4G;
    }

    public boolean getMailAsAttachment() {
        return this.zzY4F;
    }

    public String getMailSubject() {
        return this.zzY4E;
    }

    public int getMainDocumentType() {
        return this.zzY4D;
    }

    public Odso getOdso() {
        return this.zzY4C;
    }

    public String getQuery() {
        return this.zzY4B;
    }

    public boolean getViewMergedData() {
        return this.zzY4A;
    }

    public final boolean isEmpty() {
        return getMainDocumentType() == 0 || getDataType() == -1;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setActiveRecord(int i) {
        this.zzY4P = i;
    }

    public void setAddressFieldName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4O = str;
    }

    public void setCheckErrors(int i) {
        this.zzY4N = i;
    }

    public void setConnectString(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4M = str;
    }

    public void setDataSource(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4L = str;
    }

    public void setDataType(int i) {
        this.zzY4K = i;
    }

    public void setDestination(int i) {
        this.zzY4J = i;
    }

    public void setDoNotSupressBlankLines(boolean z) {
        this.zzY4I = z;
    }

    public void setHeaderSource(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4H = str;
    }

    public void setLinkToQuery(boolean z) {
        this.zzY4G = z;
    }

    public void setMailAsAttachment(boolean z) {
        this.zzY4F = z;
    }

    public void setMailSubject(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4E = str;
    }

    public void setMainDocumentType(int i) {
        this.zzY4D = i;
    }

    public void setOdso(Odso odso) {
        com.aspose.words.internal.zzZ4.zzY((Object) odso, "value");
        this.zzY4C = odso;
    }

    public void setQuery(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzY4B = str;
    }

    public void setViewMergedData(boolean z) {
        this.zzY4A = z;
    }

    public final int zzYJc() {
        return this.zzY4w;
    }

    public final int zzYJd() {
        return this.zzY4x;
    }

    public final int zzYJe() {
        return this.zzY4y;
    }

    public final int zzYJf() {
        return this.zzY4z;
    }

    public final void zzv8(int i) {
        this.zzY4w = i;
    }

    public final void zzv9(int i) {
        this.zzY4x = i;
    }

    public final void zzva(int i) {
        this.zzY4y = i;
    }

    public final void zzvb(int i) {
        this.zzY4z = i;
    }
}
