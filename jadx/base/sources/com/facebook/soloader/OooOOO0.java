package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final FileLock f67505OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FileOutputStream f67506OooOo0o;

    public OooOOO0(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f67506OooOo0o = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f67505OooOo = fileLockLock;
        } catch (Throwable th) {
            this.f67506OooOo0o.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f67506OooOo0o;
        try {
            FileLock fileLock = this.f67505OooOo;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            fileOutputStream.close();
        }
    }
}
