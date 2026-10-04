package o0ooO0oo;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooO0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31494OooOO0O extends Closeable {
    byte[] OooO0oo(int i) throws IOException;

    boolean OooOOOo() throws IOException;

    void OooOo0o(int i, byte[] bArr) throws IOException;

    void Oooo0o(byte[] bArr) throws IOException;

    long getPosition() throws IOException;

    void o0000(int i) throws IOException;

    int peek() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}
