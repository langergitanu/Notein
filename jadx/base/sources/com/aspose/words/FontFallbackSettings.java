package com.aspose.words;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class FontFallbackSettings {
    private FontSettings zzYSG;
    private com.aspose.words.internal.zzK2 zzYxt = com.aspose.words.internal.zzK2.zzHY();
    private Object zzZDm;

    public FontFallbackSettings(Object obj, FontSettings fontSettings) {
        this.zzZDm = obj;
        this.zzYSG = fontSettings;
    }

    private void zzZ8(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        synchronized (this.zzZDm) {
            this.zzYxt.zzH(zzzop);
        }
    }

    private void zzZ9(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzK2 zzk2ZzI = com.aspose.words.internal.zzK2.zzI(zzzop);
        synchronized (this.zzZDm) {
            this.zzYxt = zzk2ZzI;
        }
    }

    public void buildAutomatic() {
        com.aspose.words.internal.zzK2 zzk2ZzW = com.aspose.words.internal.zzK2.zzW(this.zzYSG.zzIj());
        synchronized (this.zzZDm) {
            this.zzYxt = zzk2ZzW;
        }
    }

    public void load(String str) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzVj = com.aspose.words.internal.zzZOU.zzVj(str);
        try {
            zzZ9(zzzosZzVj);
        } finally {
            zzzosZzVj.close();
        }
    }

    public void loadMsOfficeFallbackSettings() {
        com.aspose.words.internal.zzK2 zzk2ZzHY = com.aspose.words.internal.zzK2.zzHY();
        synchronized (this.zzZDm) {
            this.zzYxt = zzk2ZzHY;
        }
    }

    public void loadNotoFallbackSettings() throws Exception {
        com.aspose.words.internal.zzK2 zzk2ZzHX = com.aspose.words.internal.zzK2.zzHX();
        synchronized (this.zzZDm) {
            this.zzYxt = zzk2ZzHX;
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        zzZ8(com.aspose.words.internal.zzZOP.zzY(outputStream));
    }

    public final com.aspose.words.internal.zzK2 zzHv() {
        com.aspose.words.internal.zzK2 zzk2;
        synchronized (this.zzZDm) {
            zzk2 = this.zzYxt;
        }
        return zzk2;
    }

    public void save(String str) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
        try {
            zzZ8(zzzosZzVl);
        } finally {
            zzzosZzVl.close();
        }
    }

    public void load(InputStream inputStream) throws Exception {
        zzZ9(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }
}
