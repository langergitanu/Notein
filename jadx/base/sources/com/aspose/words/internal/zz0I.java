package com.aspose.words.internal;

import android.graphics.Typeface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zz0I {
    private HashMap<String, Typeface> zze9 = new HashMap<>();

    private Typeface zzR(zzZXH zzzxh) throws Exception {
        String fileName = zzzxh.getFileName();
        if (fileName.endsWith(".ttc")) {
            fileName = zzzxh.getFileName() + zzzxh.zzPh();
            if (!this.zze9.containsKey(fileName)) {
                zzW(zzzxh, fileName);
            }
        } else if (!this.zze9.containsKey(fileName)) {
            fileName = zzX(zzzxh, fileName);
        }
        return this.zze9.get(fileName);
    }

    private String zzW(zzZXH zzzxh, String str) throws Exception {
        zzZXF zzzxf = new zzZXF();
        zzZOR zzzor = new zzZOR();
        zzzxf.zzZ(zzzxh, zzzor);
        zzzor.zzH(0L);
        this.zze9.put(str, Typeface.createFromFile(zzX(zzZKB.zzZX(zzzor), str)));
        return str;
    }

    private String zzX(zzZXH zzzxh, String str) throws Exception {
        zzGR zzgrZzpB = zzzxh.zzpB();
        if (zzgrZzpB instanceof zzKG) {
            this.zze9.put(str, Typeface.createFromFile(str));
            return str;
        }
        if (zzgrZzpB instanceof zzAB) {
            zzZ((zzAB) zzgrZzpB, str);
        }
        return str;
    }

    private void zzZ(zzAB zzab, String str) throws Exception {
        this.zze9.put(str, Typeface.createFromFile(zzX(zzab.getData(), str)));
    }

    public final void dispose() {
        HashMap<String, Typeface> map = this.zze9;
        if (map != null) {
            map.clear();
            this.zze9 = null;
        }
    }

    public final Typeface zzK(zzPM zzpm) throws Exception {
        return zzR(zzpm.zzPl());
    }

    private static File zzX(byte[] bArr, String str) throws InterruptedException, IOException {
        File file = new File(zzZOQ.zzix(), new File(str).getName() + ".tmp");
        File file2 = new File(file.getAbsolutePath() + ".0");
        if (!file.exists() && !file2.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            file2.renameTo(file);
        }
        return file;
    }
}
