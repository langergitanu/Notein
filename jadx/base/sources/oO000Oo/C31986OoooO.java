package oO000Oo;

import java.io.Closeable;
import java.util.zip.DataFormatException;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: oO000Oo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31986OoooO implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f114206OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f114207OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f114208OooOoO0;

    /* JADX INFO: renamed from: oO000Oo.OoooO$OooO00o */
    public class OooO00o {
        public final int OooO00o() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO000Oo.OoooO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f114209OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f114210OooOo0o;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("HEADER", 0);
            f114210OooOo0o = oooO0O0;
            f114209OooOo = new OooO0O0[]{oooO0O0, new OooO0O0("HEADER_EXTRA_LEN", 1), new OooO0O0("HEADER_EXTRA", 2), new OooO0O0("HEADER_NAME", 3), new OooO0O0("HEADER_COMMENT", 4), new OooO0O0("HEADER_CRC", 5), new OooO0O0("INITIALIZE_INFLATER", 6), new OooO0O0("INFLATING", 7), new OooO0O0("INFLATER_NEEDS_INPUT", 8), new OooO0O0("TRAILER", 9)};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f114209OooOo.clone();
        }
    }

    public final int OooO00o(int i, int i2, byte[] bArr) throws ZipException, DataFormatException {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
