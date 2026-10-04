package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zz32 extends zz33 {
    private String[] zzho;

    public zz32(zz4W zz4w) {
        super(zz4w);
        this.zzho = new String[]{"Title", "Author", "Subject", "Keywords", "Creator", "Producer", "CreationDate", "ModDate", "Trapped"};
    }

    private void zzE(zzFY zzfy) throws Exception {
        Iterator<Map.Entry<K, V>> it = zzuN().zzv9().zzQz().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (zzZ1.zzY(this.zzho, str)) {
                zzuN().zz2("Name of custom property " + str + " is not valid");
            } else {
                zzfy.zzYX(str);
                zzfy.zzYV(entry.getValue().toString());
            }
        }
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzQR zzqrZzv9 = zzuN().zzv9();
        zzfy.zzC("/Title", zzqrZzv9.getTitle());
        zzfy.zzC("/Author", zzqrZzv9.getAuthor());
        zzfy.zzC("/Subject", zzqrZzv9.getSubject());
        zzfy.zzC("/Keywords", zzqrZzv9.getKeywords());
        zzfy.zzC("/Creator", zzqrZzv9.zzQF());
        zzfy.zzC("/Producer", zzqrZzv9.zzQG());
        zzfy.zzY("/CreationDate", zzqrZzv9.zzQB());
        zzfy.zzY("/ModDate", zzqrZzv9.zzQA());
        if (zzuN().zzvc().getCustomPropertiesExport() == 1) {
            zzE(zzfy);
        }
        zzfy.zzFc();
    }
}
