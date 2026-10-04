package oO0OO0OO;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000OoO.C32078OooO0oo;
import oO000OoO.EnumC32073OooO00o;
import oO0OO0OO.OooO00o;
import oO0OO0OO.OooOO0O;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements oO000OoO.OooO0OO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Logger f118639OooOoO = Logger.getLogger(OooO.class.getName());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO000OoO.OooO0OO f118640OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f118641OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooOO0O f118642OooOoO0;

    public interface OooO00o {
        void onException(Exception exc);
    }

    public OooO0O0(OooO oooO, OooO00o.C32903OooO0Oo c32903OooO0Oo) {
        Level level = Level.FINE;
        this.f118642OooOoO0 = new OooOO0O();
        this.f118641OooOo0o = (OooO00o) Preconditions.checkNotNull(oooO, "transportExceptionHandler");
        this.f118640OooOo = (oO000OoO.OooO0OO) Preconditions.checkNotNull(c32903OooO0Oo, "frameWriter");
    }

    @Override // oO000OoO.OooO0OO
    public final void OooOoO(EnumC32073OooO00o enumC32073OooO00o, byte[] bArr) {
        oO000OoO.OooO0OO oooO0OO = this.f118640OooOo;
        this.f118642OooOoO0.OooO0OO(OooOO0O.OooO00o.f118714OooOo, 0, enumC32073OooO00o, C34527OooO0oO.OooO0oO(bArr));
        try {
            oooO0OO.OooOoO(enumC32073OooO00o, bArr);
            oooO0OO.flush();
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void OooOoO0() {
        try {
            this.f118640OooOo.OooOoO0();
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void OoooO(C32078OooO0oo c32078OooO0oo) {
        OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.f118714OooOo;
        OooOO0O oooOO0O = this.f118642OooOoO0;
        if (oooOO0O.OooO00o()) {
            oooOO0O.f118712OooO00o.log(oooOO0O.f118713OooO0O0, oooO00o + " SETTINGS: ack=true");
        }
        try {
            this.f118640OooOo.OoooO(c32078OooO0oo);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void OoooO0(C32078OooO0oo c32078OooO0oo) {
        this.f118642OooOoO0.OooO0o(OooOO0O.OooO00o.f118714OooOo, c32078OooO0oo);
        try {
            this.f118640OooOo.OoooO0(c32078OooO0oo);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void OoooO00(ArrayList arrayList, int i, boolean z) {
        try {
            this.f118640OooOo.OoooO00(arrayList, i, z);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void Ooooooo(int i, EnumC32073OooO00o enumC32073OooO00o) {
        this.f118642OooOoO0.OooO0o0(OooOO0O.OooO00o.f118714OooOo, i, enumC32073OooO00o);
        try {
            this.f118640OooOo.Ooooooo(i, enumC32073OooO00o);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f118640OooOo.close();
        } catch (IOException e) {
            f118639OooOoO.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void flush() {
        try {
            this.f118640OooOo.flush();
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void o00000O(int i, long j) {
        this.f118642OooOoO0.OooO0oO(OooOO0O.OooO00o.f118714OooOo, i, j);
        try {
            this.f118640OooOo.o00000O(i, j);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final int o0000OO0() {
        return this.f118640OooOo.o0000OO0();
    }

    @Override // oO000OoO.OooO0OO
    public final void o0000oo0(int i, int i2, boolean z) {
        OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.f118714OooOo;
        OooOO0O oooOO0O = this.f118642OooOoO0;
        if (z) {
            long j = (4294967295L & ((long) i2)) | (((long) i) << 32);
            if (oooOO0O.OooO00o()) {
                oooOO0O.f118712OooO00o.log(oooOO0O.f118713OooO0O0, oooO00o + " PING: ack=true bytes=" + j);
            }
        } else {
            oooOO0O.OooO0Oo(oooO00o, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f118640OooOo.o0000oo0(i, i2, z);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }

    @Override // oO000OoO.OooO0OO
    public final void o000O0O0(boolean z, int i, C34524OooO0Oo c34524OooO0Oo, int i2) {
        OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.f118714OooOo;
        c34524OooO0Oo.getClass();
        this.f118642OooOoO0.OooO0O0(oooO00o, i, c34524OooO0Oo, i2, z);
        try {
            this.f118640OooOo.o000O0O0(z, i, c34524OooO0Oo, i2);
        } catch (IOException e) {
            this.f118641OooOo0o.onException(e);
        }
    }
}
