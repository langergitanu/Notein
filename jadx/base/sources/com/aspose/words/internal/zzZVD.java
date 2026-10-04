package com.aspose.words.internal;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZVD {
    private zzFR zz7i;
    private zzZV8 zz7j;
    private zzEO zz7k;
    private zzP zzbN;
    private int zzu;
    private zzF4 zzv;
    private zzZYT<zzZVA> zz7h = new zzZYT<>();
    private zzZV9 zz7g = new zzZV9();

    public zzZVD(zzP zzp, zzZV8 zzzv8, int i) {
        this.zzbN = zzp;
        this.zz7j = zzzv8;
        this.zzu = i;
        this.zzv = zzzv8.zzI();
        this.zz7i = zzzv8.zzn7();
    }

    private zzZVA zzM(zzZXH zzzxh) {
        String strZzX = zzX(zzzxh);
        zzZVA zzzva = (zzZVA) zzQW.zzZ((zzZYT) this.zz7h, strZzX);
        if (zzzva != null) {
            return zzzva;
        }
        zzZVA zzzva2 = new zzZVA(zzzxh);
        this.zz7h.set(strZzX, zzzva2);
        return zzzva2;
    }

    private String zzP(String str, boolean z) throws Exception {
        return zzZVR.zzWF(str) ? str : z ? zzZOQ.zzVh(str) : zzZVR.zz3(this.zz7j.getResourcesFolderAlias(), str);
    }

    private void zznd() {
        if (!zzZYD.zzXk(this.zz7j.zzFB())) {
            throw new IllegalStateException("Resource file(s) cannot be written to disk. When saving the document to a stream either ResourceFolder should be specified or ExportEmbeddedImages, ExportEmbeddedFonts, ExportEmbeddedCss, and ExportEmbeddedSvg should be set or custom streams should be provided via ResourceSavingCallback.");
        }
    }

    public final void zz2(String str) {
        this.zzv.zzZ(2, this.zzu, str);
    }

    public abstract zzEO zzGf();

    public abstract void zzGn() throws Exception;

    public final zzF4 zzI() {
        return this.zzv;
    }

    public final String zzS(byte[] bArr, zzEP zzep) throws Exception {
        return zzZ(zznf().zzZW(bArr), zzep);
    }

    public String zzW7(int i) {
        return this.zz7g.zzW7(i);
    }

    public abstract String zzX(zzZXH zzzxh);

    public abstract String zzZ(byte[] bArr, zzEP zzep) throws Exception;

    public void zzZ(String str, zzZXH zzzxh, boolean z) {
        zzM(zzzxh).zzO(str, z);
    }

    public final zzJO[] zzne() {
        ArrayList arrayList = new ArrayList(this.zz7h.getCount());
        Iterator<zzZVA> it = this.zz7h.zzl9().iterator();
        while (it.hasNext()) {
            zzZQG.zzZ((ArrayList<zzJO>) arrayList, it.next().zzn8());
        }
        return (zzJO[]) arrayList.toArray(new zzJO[0]);
    }

    public final zzEO zznf() {
        if (this.zz7k == null) {
            this.zz7k = zzGf();
        }
        return this.zz7k;
    }

    public final zzP zzng() {
        return this.zzbN;
    }

    public final zzZV8 zznh() {
        return this.zz7j;
    }

    public final String zzZ(String str, byte[] bArr, boolean z) throws Exception {
        OutputStream fileOutputStream;
        zzZZD zzzzd = new zzZZD(str, zzP(str, z));
        this.zz7i.zzZ(zzzzd);
        if (zzzzd.zzro()) {
            fileOutputStream = zzzzd.getResourceStream();
        } else {
            zznd();
            if (!zzZOV.zzYb(this.zz7j.zzFB())) {
                zzZOV.zzVp(this.zz7j.zzFB());
            }
            fileOutputStream = new FileOutputStream(zzZOQ.zzZW(this.zz7j.zzFB(), zzzzd.getResourceFileName()));
        }
        if (zzzzd.getKeepResourceStreamOpen()) {
            fileOutputStream.write(bArr, 0, bArr.length);
        } else {
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                fileOutputStream.close();
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }
        if (zzzzd.zzrp()) {
            return zzzzd.getResourceFileUri();
        }
        return zzP(zzzzd.getResourceFileName(), z);
    }
}
