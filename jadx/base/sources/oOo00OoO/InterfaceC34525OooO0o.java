package oOo00OoO;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: oOo00OoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34525OooO0o extends InterfaceC34548OooOoo0, ReadableByteChannel {
    C34524OooO0Oo OooOO0();

    C34524OooO0Oo OooOO0O();

    C34527OooO0oO OoooO0O(long j) throws IOException;

    String OooooOo(Charset charset) throws IOException;

    C34527OooO0oO OoooooO() throws IOException;

    String o000000o(long j) throws IOException;

    String o00000oo() throws IOException;

    void o0000OOO(long j) throws IOException;

    boolean o0000o0O() throws IOException;

    byte[] o0000oo(long j) throws IOException;

    InputStream o000OO00();

    byte[] o000oOoO() throws IOException;

    long o00oO0O() throws IOException;

    long o0O0O00(C34524OooO0Oo c34524OooO0Oo) throws IOException;

    int o0OOO0o(C34536OooOOo c34536OooOOo) throws IOException;

    C34542OooOo0O peek();

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    void skip(long j) throws IOException;
}
