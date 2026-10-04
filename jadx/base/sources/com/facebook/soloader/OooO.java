package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO implements InterfaceC22310OooO0oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public FileInputStream f67474OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f67475OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public FileChannel f67476OooOoO0;

    @Override // com.facebook.soloader.InterfaceC22310OooO0oo
    public final int OooOoOO(ByteBuffer byteBuffer, long j) throws IOException {
        return this.f67476OooOoO0.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f67474OooOo.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f67476OooOoO0.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        return this.f67476OooOoO0.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        return this.f67476OooOoO0.write(byteBuffer);
    }
}
