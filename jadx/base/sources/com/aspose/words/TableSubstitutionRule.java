package com.aspose.words;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class TableSubstitutionRule extends FontSubstitutionRule {
    private com.aspose.words.internal.zzZWU zzX4J;

    public TableSubstitutionRule(Object obj) {
        super(obj);
        if (com.aspose.words.internal.zz0T.zzsr()) {
            loadLinuxSettings();
        } else if (com.aspose.words.internal.zz0T.zzsq()) {
            loadAndroidSettings();
        } else {
            loadWindowsSettings();
        }
    }

    private void zzZ8(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        synchronized (getSyncRoot()) {
            this.zzX4J.zzL(zzzop);
        }
    }

    private void zzZ9(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZWU zzzwuZzZV = com.aspose.words.internal.zzZWU.zzZV(zzzop);
        synchronized (getSyncRoot()) {
            this.zzX4J = zzzwuZzZV;
        }
    }

    public void addSubstitutes(String str, String... strArr) {
        synchronized (getSyncRoot()) {
            this.zzX4J.addSubstitutes(str, strArr);
        }
    }

    public Iterable<String> getSubstitutes(String str) {
        Iterable<String> substitutes;
        synchronized (getSyncRoot()) {
            substitutes = this.zzX4J.getSubstitutes(str);
        }
        return substitutes;
    }

    public void load(String str) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzVj = com.aspose.words.internal.zzZOU.zzVj(str);
        try {
            zzZ9(zzzosZzVj);
        } finally {
            zzzosZzVj.close();
        }
    }

    public void loadAndroidSettings() {
        try {
            com.aspose.words.internal.zzZWU zzzwuZzos = com.aspose.words.internal.zzZWU.zzos();
            synchronized (getSyncRoot()) {
                this.zzX4J = zzzwuZzos;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void loadLinuxSettings() {
        try {
            com.aspose.words.internal.zzZWU zzzwuZzot = com.aspose.words.internal.zzZWU.zzot();
            synchronized (getSyncRoot()) {
                this.zzX4J = zzzwuZzot;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void loadWindowsSettings() {
        try {
            com.aspose.words.internal.zzZWU zzzwuZzou = com.aspose.words.internal.zzZWU.zzou();
            synchronized (getSyncRoot()) {
                this.zzX4J = zzzwuZzou;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void save(String str) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
        try {
            zzZ8(zzzosZzVl);
        } finally {
            zzzosZzVl.close();
        }
    }

    public void setSubstitutes(String str, String... strArr) {
        synchronized (getSyncRoot()) {
            this.zzX4J.setSubstitutes(str, strArr);
        }
    }

    @Override // com.aspose.words.FontSubstitutionRule
    public final com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj) {
        return this.zzX4J.zzZ(str, i, fontInfo != null ? fontInfo.getAltName() : null, zzkj);
    }

    public void load(InputStream inputStream) throws Exception {
        zzZ9(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public void save(OutputStream outputStream) throws Exception {
        zzZ8(com.aspose.words.internal.zzZOP.zzY(outputStream));
    }
}
