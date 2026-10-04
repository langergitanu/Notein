package oOo00OoO;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: oOo00OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34526OooO0o0 extends InterfaceC34544OooOoO, WritableByteChannel {
    C34524OooO0Oo OooOO0();

    C34524OooO0Oo OooOO0O();

    InterfaceC34526OooO0o0 Oooo0O0(C34527OooO0oO c34527OooO0oO) throws IOException;

    InterfaceC34526OooO0o0 Oooo0oo(long j) throws IOException;

    InterfaceC34526OooO0o0 Oooooo(long j) throws IOException;

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    void flush() throws IOException;

    InterfaceC34526OooO0o0 o000000() throws IOException;

    InterfaceC34526OooO0o0 o00000Oo(String str) throws IOException;

    long o0000O00(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) throws IOException;

    InterfaceC34526OooO0o0 o000O0o0(int i, int i2, byte[] bArr) throws IOException;

    OutputStream o000O0oo();

    InterfaceC34526OooO0o0 write(byte[] bArr) throws IOException;

    InterfaceC34526OooO0o0 writeByte(int i) throws IOException;

    InterfaceC34526OooO0o0 writeInt(int i) throws IOException;

    InterfaceC34526OooO0o0 writeShort(int i) throws IOException;
}
