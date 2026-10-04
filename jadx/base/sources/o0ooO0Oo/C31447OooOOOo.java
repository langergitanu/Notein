package o0ooO0Oo;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: o0ooO0Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31447OooOOOo extends FilterOutputStream {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C31448OooOOo f112474OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31447OooOOOo(C31448OooOOo c31448OooOOo, C31446OooOOOO c31446OooOOOO) {
        super(c31446OooOOOO);
        this.f112474OooOo0o = c31448OooOOo;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112340o000OooO;
        C31448OooOOo c31448OooOOo = this.f112474OooOo0o;
        c31448OooOOo.o000Oo(c31441OooOO0, (int) c31448OooOOo.f112475OooOoO.f112486OooOoO0);
        c31448OooOOo.f112477OooOoo0 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
