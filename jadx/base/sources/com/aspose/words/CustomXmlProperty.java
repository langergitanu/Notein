package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CustomXmlProperty implements Cloneable {
    private String mName;
    private String mValue;
    private String zzkB;

    public CustomXmlProperty(String str, String str2, String str3) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
        setUri(str2);
        setValue(str3);
    }

    public String getName() {
        return this.mName;
    }

    public String getUri() {
        return this.zzkB;
    }

    public String getValue() {
        return this.mValue;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setUri(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "uri");
        this.zzkB = str;
    }

    public void setValue(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.mValue = str;
    }

    public final CustomXmlProperty zzZTE() {
        return (CustomXmlProperty) memberwiseClone();
    }
}
