package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 implements InterfaceC22310OooO0oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ZipEntry f67489OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InputStream f67490OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final long f67491OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ZipFile f67492OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f67493OooOoOO = true;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f67494OooOoo0 = 0;

    public OooOO0(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f67492OooOoO0 = zipFile;
        this.f67489OooOo = zipEntry;
        this.f67491OooOoO = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f67490OooOo0o = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.InterfaceC22310OooO0oo
    public final int OooOoOO(ByteBuffer byteBuffer, long j) throws IOException {
        if (this.f67490OooOo0o == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j2 = this.f67491OooOoO;
        long j3 = j2 - j;
        if (j3 <= 0) {
            return -1;
        }
        int i = (int) j3;
        if (iRemaining > i) {
            iRemaining = i;
        }
        InputStream inputStream = this.f67490OooOo0o;
        ZipEntry zipEntry = this.f67489OooOo;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j4 = this.f67494OooOoo0;
        if (j != j4) {
            if (j > j2) {
                j = j2;
            }
            if (j >= j4) {
                inputStream.skip(j - j4);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f67492OooOoO0.getInputStream(zipEntry);
                this.f67490OooOo0o = inputStream2;
                if (inputStream2 == null) {
                    throw new IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j);
            }
            this.f67494OooOoo0 = j;
        }
        if (byteBuffer.hasArray()) {
            this.f67490OooOo0o.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f67490OooOo0o.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f67494OooOoo0 += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f67490OooOo0o;
        if (inputStream != null) {
            inputStream.close();
            this.f67493OooOoOO = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f67493OooOoOO;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        return OooOoOO(byteBuffer, this.f67494OooOoo0);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
