package com.aspose.words.internal;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF7 {
    protected URL zzWM8;
    protected String zzYry;

    private zzZF7(String str, URL url) {
        if (str == null && url == null) {
            throw new IllegalArgumentException("Can not pass null for both systemId and url");
        }
        this.zzYry = str;
        this.zzWM8 = url;
    }

    public static zzZF7 zzX(URL url) {
        if (url == null) {
            return null;
        }
        return new zzZF7(null, url);
    }

    public static zzZF7 zzZ(String str, URL url) {
        if (str == null && url == null) {
            return null;
        }
        return new zzZF7(str, url);
    }

    public static zzZF7 zzxN(String str) {
        if (str == null) {
            return null;
        }
        return new zzZF7(str, null);
    }

    public final String toString() {
        if (this.zzYry == null) {
            this.zzYry = this.zzWM8.toExternalForm();
        }
        return this.zzYry;
    }

    public final URL zzXN9() throws IOException {
        if (this.zzWM8 == null) {
            this.zzWM8 = zzZDS.zzwS(this.zzYry);
        }
        return this.zzWM8;
    }
}
