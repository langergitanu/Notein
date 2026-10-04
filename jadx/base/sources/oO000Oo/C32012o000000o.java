package oO000Oo;

import Oooo0.C20855OooooOO;
import Oooo0oo.AbstractC21138OooO0oo;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.google.common.base.Preconditions;
import com.google.common.p563io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import oO0OO0OO.C32911OooOOOo;
import oO0OO0OO.C32914OooOOo0;
import oO0OOo0o.C33119o00o0O;
import oO0OOo0o.InterfaceC33064OooOO0o;
import oO0OOo0o.InterfaceC33071OooOo0;
import oO0OOo0o.InterfaceC33085Oooo0OO;
import oO0OOo0o.OooOO0O;

/* JADX INFO: renamed from: oO000Oo.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32012o000000o implements InterfaceC31988OoooO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C32043o0000o f114355OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f114356OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000O000 f114358OooO0OO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final InterfaceC32054o000OoO f114363OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f114364OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f114365OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f114367OooOOO0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f114357OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public InterfaceC33064OooOO0o f114359OooO0Oo = OooOO0O.OooO0O0.f119551OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f114361OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f114360OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ByteBuffer f114362OooO0oO = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f114366OooOO0o = -1;

    /* JADX INFO: renamed from: oO000Oo.o000000o$OooO0O0 */
    public class OooO0O0 extends OutputStream {
        public OooO0O0() {
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            C32012o000000o.this.OooO0oO(i, i2, bArr);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o000000o$OooO0OO */
    public interface OooO0OO {
        void OooO(o000O000 o000o0002, boolean z, boolean z2, int i);
    }

    public C32012o000000o(oO000Oo.OooO00o oooO00o, C32914OooOOo0 c32914OooOOo0, C32043o0000o c32043o0000o) {
        this.f114356OooO00o = (OooO0OO) Preconditions.checkNotNull(oooO00o, "sink");
        this.f114363OooO0oo = (InterfaceC32054o000OoO) Preconditions.checkNotNull(c32914OooOOo0, "bufferAllocator");
        this.f114355OooO = (C32043o0000o) Preconditions.checkNotNull(c32043o0000o, "statsTraceCtx");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int OooO0oo(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof InterfaceC33071OooOo0) {
            return ((InterfaceC33071OooOo0) inputStream).OooO00o(outputStream);
        }
        long jCopy = ByteStreams.copy(inputStream, outputStream);
        Preconditions.checkArgument(jCopy <= 2147483647L, "Message size overflow: %s", jCopy);
        return (int) jCopy;
    }

    public final int OooO(InputStream inputStream, int i) throws IOException {
        if (i == -1) {
            OooO00o oooO00o = new OooO00o();
            int iOooO0oo = OooO0oo(inputStream, oooO00o);
            OooO00o(oooO00o, false);
            return iOooO0oo;
        }
        this.f114367OooOOO0 = i;
        int i2 = this.f114357OooO0O0;
        if (i2 >= 0 && i > i2) {
            oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119721OooOO0O;
            Locale locale = Locale.US;
            throw o00oo02.OooO0oo("message too large " + i + " > " + i2).OooO00o();
        }
        ByteBuffer byteBuffer = this.f114362OooO0oO;
        byteBuffer.clear();
        byteBuffer.put((byte) 0).putInt(i);
        if (this.f114358OooO0OO == null) {
            this.f114358OooO0OO = this.f114363OooO0oo.OooO00o(byteBuffer.position() + i);
        }
        OooO0oO(0, byteBuffer.position(), byteBuffer.array());
        return OooO0oo(inputStream, this.f114360OooO0o);
    }

    public final void OooO00o(OooO00o oooO00o, boolean z) {
        ArrayList arrayList = oooO00o.f114369OooOo0o;
        Iterator it = arrayList.iterator();
        int iOooO0O0 = 0;
        while (it.hasNext()) {
            iOooO0O0 += ((o000O000) it.next()).OooO0O0();
        }
        int i = this.f114357OooO0O0;
        if (i >= 0 && iOooO0O0 > i) {
            oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119721OooOO0O;
            Locale locale = Locale.US;
            throw o00oo02.OooO0oo("message too large " + iOooO0O0 + " > " + i).OooO00o();
        }
        ByteBuffer byteBuffer = this.f114362OooO0oO;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iOooO0O0);
        C32911OooOOOo c32911OooOOOoOooO00o = this.f114363OooO0oo.OooO00o(5);
        c32911OooOOOoOooO00o.write(byteBuffer.array(), 0, byteBuffer.position());
        if (iOooO0O0 == 0) {
            this.f114358OooO0OO = c32911OooOOOoOooO00o;
            return;
        }
        int i2 = this.f114365OooOO0O - 1;
        OooO0OO oooO0OO = this.f114356OooO00o;
        oooO0OO.OooO(c32911OooOOOoOooO00o, false, false, i2);
        this.f114365OooOO0O = 1;
        for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
            oooO0OO.OooO((o000O000) arrayList.get(i3), false, false, 0);
        }
        this.f114358OooO0OO = (o000O000) C21505OooO0Oo.OooO00o(1, arrayList);
        this.f114367OooOOO0 = iOooO0O0;
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final InterfaceC31988OoooO00 OooO0O0(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
        this.f114359OooO0Oo = (InterfaceC33064OooOO0o) Preconditions.checkNotNull(interfaceC33064OooOO0o, "Can't pass an empty compressor");
        return this;
    }

    public final int OooO0OO(InputStream inputStream) throws IOException {
        OooO00o oooO00o = new OooO00o();
        OutputStream outputStreamOooO0OO = this.f114359OooO0Oo.OooO0OO(oooO00o);
        try {
            int iOooO0oo = OooO0oo(inputStream, outputStreamOooO0OO);
            outputStreamOooO0OO.close();
            int i = this.f114357OooO0O0;
            if (i < 0 || iOooO0oo <= i) {
                OooO00o(oooO00o, true);
                return iOooO0oo;
            }
            oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119721OooOO0O;
            Locale locale = Locale.US;
            throw o00oo02.OooO0oo("message too large " + iOooO0oo + " > " + i).OooO00o();
        } catch (Throwable th) {
            outputStreamOooO0OO.close();
            throw th;
        }
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final void OooO0Oo(int i) {
        Preconditions.checkState(this.f114357OooO0O0 == -1, "max size already set");
        this.f114357OooO0O0 = i;
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final void OooO0o(InputStream inputStream) {
        if (this.f114364OooOO0) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f114365OooOO0O++;
        int i = this.f114366OooOO0o + 1;
        this.f114366OooOO0o = i;
        this.f114367OooOOO0 = 0L;
        C32043o0000o c32043o0000o = this.f114355OooO;
        for (AbstractC21138OooO0oo abstractC21138OooO0oo : c32043o0000o.f114553OooO00o) {
            abstractC21138OooO0oo.Ooooo00(i);
        }
        boolean z = this.f114361OooO0o0 && this.f114359OooO0Oo != OooOO0O.OooO0O0.f119551OooO00o;
        try {
            int iAvailable = ((inputStream instanceof InterfaceC33085Oooo0OO) || (inputStream instanceof ByteArrayInputStream)) ? inputStream.available() : -1;
            int iOooO = (iAvailable == 0 || !z) ? OooO(inputStream, iAvailable) : OooO0OO(inputStream);
            if (iAvailable != -1 && iOooO != iAvailable) {
                throw oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo(C20855OooooOO.OooO0OO(iOooO, iAvailable, "Message length inaccurate ", " != ")).OooO00o();
            }
            long j = iOooO;
            AbstractC21138OooO0oo[] abstractC21138OooO0ooArr = c32043o0000o.f114553OooO00o;
            for (AbstractC21138OooO0oo abstractC21138OooO0oo2 : abstractC21138OooO0ooArr) {
                abstractC21138OooO0oo2.OooooO0(j);
            }
            long j2 = this.f114367OooOOO0;
            for (AbstractC21138OooO0oo abstractC21138OooO0oo3 : abstractC21138OooO0ooArr) {
                abstractC21138OooO0oo3.OooooOO(j2);
            }
            int i2 = this.f114366OooOO0o;
            long j3 = this.f114367OooOOO0;
            for (AbstractC21138OooO0oo abstractC21138OooO0oo4 : c32043o0000o.f114553OooO00o) {
                abstractC21138OooO0oo4.Ooooo0o(i2, j3, j);
            }
        } catch (IOException e) {
            throw oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Failed to frame message").OooO0oO(e).OooO00o();
        } catch (C33119o00o0O e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Failed to frame message").OooO0oO(e3).OooO00o();
        }
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final InterfaceC31988OoooO00 OooO0o0(boolean z) {
        this.f114361OooO0o0 = z;
        return this;
    }

    public final void OooO0oO(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            o000O000 o000o0002 = this.f114358OooO0OO;
            if (o000o0002 != null && o000o0002.OooO00o() == 0) {
                o000O000 o000o0003 = this.f114358OooO0OO;
                this.f114358OooO0OO = null;
                this.f114356OooO00o.OooO(o000o0003, false, false, this.f114365OooOO0O);
                this.f114365OooOO0O = 0;
            }
            if (this.f114358OooO0OO == null) {
                this.f114358OooO0OO = this.f114363OooO0oo.OooO00o(i2);
            }
            int iMin = Math.min(i2, this.f114358OooO0OO.OooO00o());
            this.f114358OooO0OO.write(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final void close() {
        if (this.f114364OooOO0) {
            return;
        }
        this.f114364OooOO0 = true;
        o000O000 o000o0002 = this.f114358OooO0OO;
        if (o000o0002 != null && o000o0002.OooO0O0() == 0 && this.f114358OooO0OO != null) {
            this.f114358OooO0OO = null;
        }
        o000O000 o000o0003 = this.f114358OooO0OO;
        this.f114358OooO0OO = null;
        this.f114356OooO00o.OooO(o000o0003, true, true, this.f114365OooOO0O);
        this.f114365OooOO0O = 0;
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final void flush() {
        o000O000 o000o0002 = this.f114358OooO0OO;
        if (o000o0002 == null || o000o0002.OooO0O0() <= 0) {
            return;
        }
        o000O000 o000o0003 = this.f114358OooO0OO;
        this.f114358OooO0OO = null;
        this.f114356OooO00o.OooO(o000o0003, false, true, this.f114365OooOO0O);
        this.f114365OooOO0O = 0;
    }

    @Override // oO000Oo.InterfaceC31988OoooO00
    public final boolean isClosed() {
        return this.f114364OooOO0;
    }

    /* JADX INFO: renamed from: oO000Oo.o000000o$OooO00o */
    public final class OooO00o extends OutputStream {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public o000O000 f114368OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayList f114369OooOo0o = new ArrayList();

        public OooO00o() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            o000O000 o000o0002 = this.f114368OooOo;
            if (o000o0002 == null || o000o0002.OooO00o() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
            } else {
                this.f114368OooOo.OooO0OO((byte) i);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            o000O000 o000o0002 = this.f114368OooOo;
            ArrayList arrayList = this.f114369OooOo0o;
            C32012o000000o c32012o000000o = C32012o000000o.this;
            if (o000o0002 == null) {
                C32911OooOOOo c32911OooOOOoOooO00o = c32012o000000o.f114363OooO0oo.OooO00o(i2);
                this.f114368OooOo = c32911OooOOOoOooO00o;
                arrayList.add(c32911OooOOOoOooO00o);
            }
            while (i2 > 0) {
                int iMin = Math.min(i2, this.f114368OooOo.OooO00o());
                if (iMin == 0) {
                    C32911OooOOOo c32911OooOOOoOooO00o2 = c32012o000000o.f114363OooO0oo.OooO00o(Math.max(i2, this.f114368OooOo.OooO0O0() * 2));
                    this.f114368OooOo = c32911OooOOOoOooO00o2;
                    arrayList.add(c32911OooOOOoOooO00o2);
                } else {
                    this.f114368OooOo.write(bArr, i, iMin);
                    i += iMin;
                    i2 -= iMin;
                }
            }
        }
    }
}
