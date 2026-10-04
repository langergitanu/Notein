package com.aspose.words.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZRU implements Closeable {
    private ZipOutputStream zz5n;

    public zzZRU(zzZOP zzzop) {
        this(zzzop, 5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    public final void finish() throws Exception {
        this.zz5n.finish();
        this.zz5n.flush();
    }

    public final void zzW(String str, zzZOP zzzop) throws Exception {
        zzZ(str, zzzop, zzZQ9.zz35);
    }

    public final void zzX(String str, byte[] bArr) throws Exception {
        ZipEntry zipEntry = new ZipEntry(str);
        zipEntry.setMethod(0);
        zipEntry.setSize(bArr.length);
        zipEntry.setCompressedSize(bArr.length);
        zipEntry.setTime(zzR1.zzQO().zzkH().getTime());
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        zipEntry.setCrc(crc32.getValue());
        this.zz5n.putNextEntry(zipEntry);
        this.zz5n.write(bArr);
        this.zz5n.closeEntry();
    }

    public final void zzZ(String str, zzZOP zzzop, zzZQ9 zzzq9) throws Exception {
        ZipEntry zipEntry = new ZipEntry(str);
        if (zzzq9 == null || zzZQ9.zz35.equals(zzzq9)) {
            zipEntry.setTime(zzR1.zzQO().zzkH().getTime());
        } else {
            zipEntry.setTime(zzzq9.zzkF().zzkP());
        }
        this.zz5n.putNextEntry(zipEntry);
        zzZKB.zzZ(zzzop, this.zz5n);
        this.zz5n.closeEntry();
    }

    public zzZRU(zzZOP zzzop, int i) {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new zzZK6(zzzop));
        this.zz5n = zipOutputStream;
        zipOutputStream.setLevel(i);
    }
}
