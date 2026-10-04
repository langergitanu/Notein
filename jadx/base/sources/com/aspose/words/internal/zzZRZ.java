package com.aspose.words.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
final class zzZRZ extends zzZRX {
    private boolean zz5r;
    private ZipEntry zz5s;
    private Enumeration<? extends ZipEntry> zz5t;
    private ZipFile zz5u;
    private File zz5v;

    public zzZRZ(zzZOP zzzop) throws Exception {
        if (zzzop instanceof zzZOS) {
            this.zz5v = new File(((zzZOS) zzzop).getFileName());
            this.zz5r = false;
        } else {
            this.zz5v = File.createTempFile(zzZOZ.zziD().toString(), ".zip");
            this.zz5r = true;
            FileOutputStream fileOutputStream = new FileOutputStream(this.zz5v);
            zzZKB.zzZ(zzzop, fileOutputStream);
            fileOutputStream.close();
        }
        ZipFile zipFile = new ZipFile(this.zz5v);
        this.zz5u = zipFile;
        this.zz5t = zipFile.entries();
    }

    @Override // com.aspose.words.internal.zzZRX, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zz5u.close();
        if (this.zz5r) {
            this.zz5v.delete();
        }
    }

    @Override // com.aspose.words.internal.zzZRX
    public final void zzZQ(zzZOP zzzop) throws Exception {
        InputStream inputStream = this.zz5u.getInputStream(this.zz5s);
        zzZKB.zzZ(inputStream, zzzop, (int) this.zz5s.getSize());
        inputStream.close();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final int zzlW() {
        return (int) this.zz5s.getSize();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final zzZQ9 zzlX() {
        return new zzZQ9(this.zz5s.getTime(), 2L);
    }

    @Override // com.aspose.words.internal.zzZRX
    public final int zzlY() {
        return this.zz5s.getMethod();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final String zzlZ() {
        return this.zz5s.getName();
    }

    @Override // com.aspose.words.internal.zzZRX
    public final boolean zzm0() {
        boolean zHasMoreElements = this.zz5t.hasMoreElements();
        if (zHasMoreElements) {
            this.zz5s = this.zz5t.nextElement();
        }
        return zHasMoreElements;
    }
}
