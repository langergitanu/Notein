package com.aspose.words;

import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR5 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("full-path", HTMLWriter.MEDIA_TYPE, "size", "encryption-data");
    private int zzVf;
    private zzYS5 zzXOl;
    private String zzXOm;
    private String zzYlV;

    public zzYR5() {
    }

    private void zzU(com.aspose.words.internal.zzO zzo) {
        while (zzo.zzQ("file-entry")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 3) {
                zzo.zzk();
            } else {
                zzYS5 zzys5 = new zzYS5();
                this.zzXOl = zzys5;
                zzys5.zzX(zzo);
            }
        }
    }

    public final int getSize() {
        return this.zzVf;
    }

    public final boolean isEncrypted() {
        return this.zzXOl != null;
    }

    public final void zzJ(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                this.zzXOm = zzyq9ZzYuT.getValue();
            } else if (iZzTP == 1) {
                this.zzYlV = zzyq9ZzYuT.getValue();
            } else if (iZzTP == 2) {
                this.zzVf = zzyq9ZzYuT.zzb();
            }
        }
        zzU(zzyq9ZzYuT);
    }

    public final void zzY(zzYU6 zzyu6) {
        zzyu6.zzY("manifest:file-entry");
        zzyu6.zzX("manifest:media-type", this.zzYlV);
        zzyu6.zz0("manifest:full-path", this.zzXOm);
        if (isEncrypted()) {
            zzyu6.zzZj("manifest:size", this.zzVf);
            this.zzXOl.zzY(zzyu6);
        }
        zzyu6.zzo();
    }

    public final String zzYZ5() {
        return this.zzYlV;
    }

    public final String zzYvG() {
        return this.zzXOm;
    }

    public final boolean zzYvH() {
        return zzYOU.zzDl(zzYOU.zzYf(this.zzXOm));
    }

    public final zzYS5 zzYvI() {
        return this.zzXOl;
    }

    public final void zzZ(zzYS5 zzys5) {
        this.zzXOl = zzys5;
    }

    public final String zzxf() {
        return zzYOU.zzYf(this.zzXOm);
    }

    public zzYR5(String str, String str2) {
        this.zzYlV = str;
        this.zzXOm = str2;
    }

    public zzYR5(zzYQO zzyqo) throws Exception {
        this.zzXOm = zzYOU.zzDm(zzyqo.getName());
        this.zzYlV = zzyqo.zzYZ5();
        this.zzVf = (int) zzyqo.zzYvo().getLength();
    }
}
