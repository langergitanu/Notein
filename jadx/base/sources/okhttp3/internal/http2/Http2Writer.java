package okhttp3.internal.http2;

import Oooo.OooO0OO;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34540OooOo0;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Http2Writer implements Closeable {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final Logger f124635OooOoo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f124636OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34540OooOo0 f124637OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f124638OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f124639OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Hpack.Writer f124640OooOoOO;

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "()V", "logger", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        f124635OooOoo0 = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(C34540OooOo0 sink) {
        OooOOO0.OooO0oO(sink, "sink");
        this.f124637OooOo0o = sink;
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        this.f124636OooOo = c34524OooO0Oo;
        this.f124639OooOoO0 = 16384;
        this.f124640OooOoOO = new Hpack.Writer(c34524OooO0Oo);
    }

    public final synchronized void OooO00o(Settings peerSettings) throws IOException {
        try {
            OooOOO0.OooO0oO(peerSettings, "peerSettings");
            if (this.f124638OooOoO) {
                throw new IOException("closed");
            }
            int i = this.f124639OooOoO0;
            int i2 = peerSettings.f124650OooO00o;
            if ((i2 & 32) != 0) {
                i = peerSettings.f124651OooO0O0[5];
            }
            this.f124639OooOoO0 = i;
            if (((i2 & 2) != 0 ? peerSettings.f124651OooO0O0[1] : -1) != -1) {
                Hpack.Writer writer = this.f124640OooOoOO;
                int i3 = (i2 & 2) != 0 ? peerSettings.f124651OooO0O0[1] : -1;
                writer.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = writer.f124514OooO0Oo;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        writer.f124512OooO0O0 = Math.min(writer.f124512OooO0O0, iMin);
                    }
                    writer.f124513OooO0OO = true;
                    writer.f124514OooO0Oo = iMin;
                    int i5 = writer.f124518OooO0oo;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            Header[] headerArr = writer.f124516OooO0o0;
                            OooO0OO.OooOOOO(headerArr, null, 0, headerArr.length);
                            writer.f124515OooO0o = writer.f124516OooO0o0.length - 1;
                            writer.f124517OooO0oO = 0;
                            writer.f124518OooO0oo = 0;
                        } else {
                            writer.OooO00o(i5 - iMin);
                        }
                    }
                }
            }
            OooO0OO(0, 0, 4, 1);
            this.f124637OooOo0o.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0OO(int i, int i2, int i3, int i4) throws IOException {
        Level level = Level.FINE;
        Logger logger = f124635OooOoo0;
        if (logger.isLoggable(level)) {
            Http2.f124519OooO00o.getClass();
            logger.fine(Http2.OooO00o(false, i, i2, i3, i4));
        }
        if (i2 > this.f124639OooOoO0) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f124639OooOoO0 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(OooOOO0.OooOOO0(Integer.valueOf(i), "reserved bit set: ").toString());
        }
        byte[] bArr = Util.f124301OooO00o;
        C34540OooOo0 c34540OooOo0 = this.f124637OooOo0o;
        OooOOO0.OooO0oO(c34540OooOo0, "<this>");
        c34540OooOo0.writeByte((i2 >>> 16) & 255);
        c34540OooOo0.writeByte((i2 >>> 8) & 255);
        c34540OooOo0.writeByte(i2 & 255);
        c34540OooOo0.writeByte(i3 & 255);
        c34540OooOo0.writeByte(i4 & 255);
        c34540OooOo0.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void OooOOO0(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        if (errorCode.f124491OooOo0o == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        OooO0OO(0, bArr.length + 8, 7, 0);
        this.f124637OooOo0o.writeInt(i);
        this.f124637OooOo0o.writeInt(errorCode.f124491OooOo0o);
        if (bArr.length != 0) {
            this.f124637OooOo0o.write(bArr);
        }
        this.f124637OooOo0o.flush();
    }

    public final synchronized void OooOOo0(ArrayList arrayList, int i, boolean z) throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        this.f124640OooOoOO.OooO0Oo(arrayList);
        long j = this.f124636OooOo.f123723OooOo;
        long jMin = Math.min(this.f124639OooOoO0, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        OooO0OO(i, (int) jMin, 1, i2);
        this.f124637OooOo0o.write(this.f124636OooOo, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.f124639OooOoO0, j2);
                j2 -= jMin2;
                OooO0OO(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.f124637OooOo0o.write(this.f124636OooOo, jMin2);
            }
        }
    }

    public final synchronized void OooOOoo(int i, ErrorCode errorCode) throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        if (errorCode.f124491OooOo0o == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        OooO0OO(i, 4, 3, 0);
        this.f124637OooOo0o.writeInt(errorCode.f124491OooOo0o);
        this.f124637OooOo0o.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f124638OooOoO = true;
        this.f124637OooOo0o.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        this.f124637OooOo0o.flush();
    }

    public final synchronized void o00000O(int i, long j) throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(OooOOO0.OooOOO0(Long.valueOf(j), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
        }
        OooO0OO(i, 4, 8, 0);
        this.f124637OooOo0o.writeInt((int) j);
        this.f124637OooOo0o.flush();
    }

    public final synchronized void o0000oo0(int i, int i2, boolean z) throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        OooO0OO(0, 8, 6, z ? 1 : 0);
        this.f124637OooOo0o.writeInt(i);
        this.f124637OooOo0o.writeInt(i2);
        this.f124637OooOo0o.flush();
    }

    public final synchronized void o000O0O0(boolean z, int i, C34524OooO0Oo c34524OooO0Oo, int i2) throws IOException {
        if (this.f124638OooOoO) {
            throw new IOException("closed");
        }
        OooO0OO(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            OooOOO0.OooO0Oo(c34524OooO0Oo);
            this.f124637OooOo0o.write(c34524OooO0Oo, i2);
        }
    }
}
