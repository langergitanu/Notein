package oOo00OoO;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: oOo00OoO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34544OooOoO extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    C34547OooOoo timeout();

    void write(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException;
}
