package okhttp3.internal.p621ws;

import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18177fb;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O000.OooO00o;
import oOo00OoO.C34522OooO0O0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34528OooO0oo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34543OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class WebSocketWriter implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Random f124778OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34540OooOo0 f124779OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f124780OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f124781OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final long f124782OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C34524OooO0Oo f124783OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C34524OooO0Oo f124784OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f124785OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public MessageDeflater f124786OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final byte[] f124787Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C34524OooO0Oo.OooO00o f124788Oooo00O;

    public WebSocketWriter(C34540OooOo0 sink, Random random, boolean z, boolean z2, long j) {
        OooOOO0.OooO0oO(sink, "sink");
        this.f124779OooOo0o = sink;
        this.f124778OooOo = random;
        this.f124781OooOoO0 = z;
        this.f124780OooOoO = z2;
        this.f124782OooOoOO = j;
        this.f124784OooOoo0 = new C34524OooO0Oo();
        this.f124783OooOoo = sink.f123766OooOo;
        this.f124787Oooo000 = new byte[4];
        this.f124788Oooo00O = new C34524OooO0Oo.OooO00o();
    }

    public final void OooO00o(int i, C34527OooO0oO c34527OooO0oO) throws IOException {
        if (this.f124785OooOooO) {
            throw new IOException("closed");
        }
        int iOooO0OO = c34527OooO0oO.OooO0OO();
        if (iOooO0OO > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        C34524OooO0Oo c34524OooO0Oo = this.f124783OooOoo;
        c34524OooO0Oo.o0OoO0o(i | 128);
        c34524OooO0Oo.o0OoO0o(iOooO0OO | 128);
        byte[] bArr = this.f124787Oooo000;
        OooOOO0.OooO0Oo(bArr);
        this.f124778OooOo.nextBytes(bArr);
        c34524OooO0Oo.o0000ooO(bArr);
        if (iOooO0OO > 0) {
            long j = c34524OooO0Oo.f123723OooOo;
            c34524OooO0Oo.o0000o0(c34527OooO0oO);
            C34524OooO0Oo.OooO00o oooO00o = this.f124788Oooo00O;
            OooOOO0.OooO0Oo(oooO00o);
            c34524OooO0Oo.o00Oo0(oooO00o);
            oooO00o.OooO0OO(j);
            WebSocketProtocol.f124763OooO00o.getClass();
            WebSocketProtocol.OooO0O0(oooO00o, bArr);
            oooO00o.close();
        }
        this.f124779OooOo0o.flush();
    }

    public final void OooO0OO(int i, C34527OooO0oO c34527OooO0oO) throws IOException {
        long j;
        if (this.f124785OooOooO) {
            throw new IOException("closed");
        }
        C34524OooO0Oo c34524OooO0Oo = this.f124784OooOoo0;
        c34524OooO0Oo.o0000o0(c34527OooO0oO);
        int i2 = i | 128;
        if (!this.f124781OooOoO0 || c34527OooO0oO.f123736OooOo0o.length < this.f124782OooOoOO) {
            j = 0;
        } else {
            MessageDeflater messageDeflater = this.f124786OooOooo;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.f124780OooOoO);
                this.f124786OooOooo = messageDeflater;
            }
            C34524OooO0Oo c34524OooO0Oo2 = messageDeflater.f124725OooOo;
            if (c34524OooO0Oo2.f123723OooOo != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (messageDeflater.f124726OooOo0o) {
                messageDeflater.f124728OooOoO0.reset();
            }
            long j2 = c34524OooO0Oo.f123723OooOo;
            C34528OooO0oo c34528OooO0oo = messageDeflater.f124727OooOoO;
            c34528OooO0oo.write(c34524OooO0Oo, j2);
            c34528OooO0oo.flush();
            C34527OooO0oO c34527OooO0oO2 = MessageDeflaterKt.f124729OooO00o;
            long j3 = c34524OooO0Oo2.f123723OooOo;
            byte[] bArr = c34527OooO0oO2.f123736OooOo0o;
            long length = j3 - ((long) bArr.length);
            int length2 = bArr.length;
            if (length < 0 || length2 < 0) {
                j = 0;
            } else {
                j = 0;
                if (j3 - length >= length2 && bArr.length >= length2) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (c34524OooO0Oo2.OooOooo(((long) i3) + length) == c34527OooO0oO2.f123736OooOo0o[i3]) {
                        }
                    }
                    long j4 = c34524OooO0Oo2.f123723OooOo - ((long) 4);
                    C34524OooO0Oo.OooO00o oooO00oO00Oo0 = c34524OooO0Oo2.o00Oo0(C34522OooO0O0.f123717OooO00o);
                    try {
                        oooO00oO00Oo0.OooO00o(j4);
                        oooO00oO00Oo0.close();
                        c34524OooO0Oo.write(c34524OooO0Oo2, c34524OooO0Oo2.f123723OooOo);
                        i2 = i | 192;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            OooO00o.OooO00o(oooO00oO00Oo0, th);
                            throw th2;
                        }
                    }
                }
            }
            c34524OooO0Oo2.o0OoO0o(0);
            c34524OooO0Oo.write(c34524OooO0Oo2, c34524OooO0Oo2.f123723OooOo);
            i2 = i | 192;
        }
        long j5 = c34524OooO0Oo.f123723OooOo;
        C34524OooO0Oo c34524OooO0Oo3 = this.f124783OooOoo;
        c34524OooO0Oo3.o0OoO0o(i2);
        if (j5 <= 125) {
            c34524OooO0Oo3.o0OoO0o(((int) j5) | 128);
        } else if (j5 <= C18177fb.f54859s) {
            c34524OooO0Oo3.o0OoO0o(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6);
            c34524OooO0Oo3.o000OOoO((int) j5);
        } else {
            c34524OooO0Oo3.o0OoO0o(255);
            C34543OooOo0o c34543OooOo0oO0000Oo0 = c34524OooO0Oo3.o0000Oo0(8);
            int i4 = c34543OooOo0oO0000Oo0.f123782OooO0OO;
            byte[] bArr2 = c34543OooOo0oO0000Oo0.f123780OooO00o;
            bArr2[i4] = (byte) ((j5 >>> 56) & 255);
            bArr2[i4 + 1] = (byte) ((j5 >>> 48) & 255);
            bArr2[i4 + 2] = (byte) ((j5 >>> 40) & 255);
            bArr2[i4 + 3] = (byte) ((j5 >>> 32) & 255);
            bArr2[i4 + 4] = (byte) ((j5 >>> 24) & 255);
            bArr2[i4 + 5] = (byte) ((j5 >>> 16) & 255);
            bArr2[i4 + 6] = (byte) ((j5 >>> 8) & 255);
            bArr2[i4 + 7] = (byte) (255 & j5);
            c34543OooOo0oO0000Oo0.f123782OooO0OO = i4 + 8;
            c34524OooO0Oo3.f123723OooOo += 8;
        }
        byte[] bArr3 = this.f124787Oooo000;
        OooOOO0.OooO0Oo(bArr3);
        this.f124778OooOo.nextBytes(bArr3);
        c34524OooO0Oo3.o0000ooO(bArr3);
        if (j5 > j) {
            C34524OooO0Oo.OooO00o oooO00o = this.f124788Oooo00O;
            OooOOO0.OooO0Oo(oooO00o);
            c34524OooO0Oo.o00Oo0(oooO00o);
            oooO00o.OooO0OO(j);
            WebSocketProtocol.f124763OooO00o.getClass();
            WebSocketProtocol.OooO0O0(oooO00o, bArr3);
            oooO00o.close();
        }
        c34524OooO0Oo3.write(c34524OooO0Oo, j5);
        C34540OooOo0 c34540OooOo0 = this.f124779OooOo0o;
        if (c34540OooOo0.f123768OooOoO0) {
            throw new IllegalStateException("closed");
        }
        C34524OooO0Oo c34524OooO0Oo4 = c34540OooOo0.f123766OooOo;
        long j6 = c34524OooO0Oo4.f123723OooOo;
        if (j6 > 0) {
            c34540OooOo0.f123767OooOo0o.write(c34524OooO0Oo4, j6);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        MessageDeflater messageDeflater = this.f124786OooOooo;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }
}
