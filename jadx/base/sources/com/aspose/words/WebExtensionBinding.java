package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class WebExtensionBinding {
    private String zzWVk;
    private int zzWVl;
    private String zzZh;

    public WebExtensionBinding() {
    }

    public String getAppRef() {
        return this.zzWVk;
    }

    public int getBindingType() {
        return this.zzWVl;
    }

    public String getId() {
        return this.zzZh;
    }

    public void setAppRef(String str) {
        this.zzWVk = str;
    }

    public void setBindingType(int i) {
        this.zzWVl = i;
    }

    public void setId(String str) {
        this.zzZh = str;
    }

    public WebExtensionBinding(String str, int i, String str2) {
        setId(str);
        setAppRef(str2);
        setBindingType(i);
    }
}
