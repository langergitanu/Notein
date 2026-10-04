package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class WebExtensionProperty {
    private String mName;
    private String mValue;

    public WebExtensionProperty() {
    }

    public String getName() {
        return this.mName;
    }

    public String getValue() {
        return this.mValue;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setValue(String str) {
        this.mValue = str;
    }

    public WebExtensionProperty(String str, String str2) {
        setName(str);
        setValue(str2);
    }
}
