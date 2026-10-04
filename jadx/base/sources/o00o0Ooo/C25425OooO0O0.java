package o00o0Ooo;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o00o0Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25425OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f86698OooO00o = Logger.getLogger(C25425OooO0O0.class.getName());

    public static void OooO00o(Closeable closeable) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            f86698OooO00o.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
        }
    }

    public static void OooO0O0(InputStream inputStream) {
        try {
            OooO00o(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
