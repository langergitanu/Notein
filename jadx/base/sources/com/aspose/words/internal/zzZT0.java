package com.aspose.words.internal;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT0 extends zzZSK {
    private zzZYG<String> zz6q;
    private zzZYG<zzZZD> zz6r;
    private zzZSY zz6s;
    private zzFR zz7i;

    public zzZT0(zzZSY zzzsy) {
        super(zzzsy.getResourcesFolderAlias(), zzzsy.getJpegQuality(), zzzsy.zzI(), false);
        this.zz6r = new zzZYG<>();
        this.zz6q = new zzZYG<>();
        this.zz6s = zzzsy;
        this.zz7i = zzzsy.zzn7();
    }

    private String zzWe(String str) throws Exception {
        if (this.zz6q.get(str) != null) {
            return this.zz6q.get(str);
        }
        zzZZD zzzzd = new zzZZD(zzZOQ.zzVh(str), str);
        this.zz7i.zzZ(zzzzd);
        String resourceFileUri = zzzzd.zzrp() ? zzzzd.getResourceFileUri() : zzW6(zzzzd.getResourceFileName());
        this.zz6r.set(resourceFileUri, zzzzd);
        this.zz6q.set(str, resourceFileUri);
        return resourceFileUri;
    }

    private OutputStream zzY(zzZZD zzzzd) throws Exception {
        if (zzzzd.zzro()) {
            return zzzzd.getResourceStream();
        }
        zznd();
        if (!zzZOV.zzYb(this.zz6s.zzFB())) {
            zzZOV.zzVp(this.zz6s.zzFB());
        }
        return new FileOutputStream(zzZOQ.zzZW(this.zz6s.zzFB(), zzzzd.getResourceFileName()));
    }

    private void zznd() {
        if (!zzZYD.zzXk(this.zz6s.zzFB())) {
            throw new IllegalStateException("Resource file(s) cannot be written to disk. When saving the document to a stream either ResourceFolder should be specified or ExportEmbeddedImages, ExportEmbeddedFonts, ExportEmbeddedCss, and ExportEmbeddedSvg should be set or custom streams should be provided via ResourceSavingCallback.");
        }
    }

    @Override // com.aspose.words.internal.zzZSK
    public final String zzL(zzZXH zzzxh) throws Exception {
        return zzWe(super.zzL(zzzxh));
    }

    @Override // com.aspose.words.internal.zzZSK
    public final String zzYZ(byte[] bArr) throws Exception {
        return zzWe(super.zzYZ(bArr));
    }

    public final zzZSY zzmB() {
        return this.zz6s;
    }

    @Override // com.aspose.words.internal.zzZSK
    public final boolean zzmC() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZSK
    public final void zzmD() throws Exception {
        OutputStream outputStreamZzY;
        if (zzmo().getCount() > 0 || zzmk().getCount() > 0) {
            for (Map.Entry<String, zzJO> entry : zzmo()) {
                zzJO value = entry.getValue();
                zzZZD zzzzd = this.zz6r.get(entry.getKey());
                outputStreamZzY = zzY(zzzzd);
                zzZOR zzzor = new zzZOR();
                if (zzzzd.getKeepResourceStreamOpen()) {
                    value.zzY(zzzor);
                    zzZKB.zzY(zzzor, outputStreamZzY);
                } else {
                    try {
                        value.zzY(zzzor);
                        zzZKB.zzY(zzzor, outputStreamZzY);
                        if (outputStreamZzY != null) {
                            outputStreamZzY.close();
                        }
                    } finally {
                    }
                }
            }
            for (int i = 0; i < zzmk().getCount(); i++) {
                zzZS9 zzzs9ZzVY = zzmk().zzVY(i);
                zzZZD zzzzd2 = this.zz6r.get(zzzs9ZzVY.getUri());
                outputStreamZzY = zzY(zzzzd2);
                if (zzzzd2.getKeepResourceStreamOpen()) {
                    outputStreamZzY.write(zzzs9ZzVY.getImageBytes(), 0, zzzs9ZzVY.getImageBytes().length);
                } else {
                    try {
                        outputStreamZzY.write(zzzs9ZzVY.getImageBytes(), 0, zzzs9ZzVY.getImageBytes().length);
                        outputStreamZzY.close();
                    } finally {
                    }
                }
            }
        }
    }
}
