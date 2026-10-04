package o0ooO0o;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooO0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31461OooO0oO extends Closeable {
    byte[] OooO0oo(int i) throws IOException;

    boolean OooOOOo() throws IOException;

    void Ooooo00(int i) throws IOException;

    long getPosition() throws IOException;

    long length() throws IOException;

    int peek() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void seek(long j) throws IOException;
}
