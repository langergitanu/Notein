package oO000Oo;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: oO000Oo.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC32047o0000oO extends Closeable {
    int OooO0O0();

    InterfaceC32047o0000oO OooOo0O(int i);

    void Oooo0oO(ByteBuffer byteBuffer);

    boolean markSupported();

    void o0000o(int i, int i2, byte[] bArr);

    void o000O0(OutputStream outputStream, int i) throws IOException;

    void o0OoOo0();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i);
}
