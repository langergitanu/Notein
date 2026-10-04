package o0ooO0Oo;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import o0ooO0o.C31454OooO;
import o0ooO0o.C31459OooO0o;
import o0ooO0o.C31460OooO0o0;
import o0ooO0o.C31462OooO0oo;
import o0ooO0o0.AbstractC31473OooOO0O;

/* JADX INFO: renamed from: o0ooO0Oo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31446OooOOOO extends FilterOutputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31448OooOOo f112470OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f112471OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C31454OooO f112472OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C31462OooO0oo f112473OooOoO0;

    public C31446OooOOOO(ArrayList arrayList, C31448OooOOo c31448OooOOo, C31459OooO0o c31459OooO0o, C31462OooO0oo c31462OooO0oo) throws IOException {
        super(c31459OooO0o);
        this.f112471OooOo0o = arrayList;
        this.f112470OooOo = c31448OooOOo;
        this.f112473OooOoO0 = c31462OooO0oo;
        if (arrayList.isEmpty()) {
            this.f112472OooOoO = null;
        } else {
            c31462OooO0oo.getClass();
            this.f112472OooOoO = new C31454OooO(c31462OooO0oo);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f112471OooOo0o;
        try {
            if (this.f112472OooOoO != null) {
                try {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C31460OooO0o0 c31460OooO0o0 = new C31460OooO0o0(this.f112472OooOoO);
                        C31448OooOOo c31448OooOOo = this.f112470OooOo;
                        if (size == 0) {
                            try {
                                AbstractC31473OooOO0O abstractC31473OooOO0O = (AbstractC31473OooOO0O) arrayList.get(size);
                                OutputStream outputStream = ((FilterOutputStream) this).out;
                                abstractC31473OooOO0O.getClass();
                                c31448OooOOo.getClass();
                                C31453OooOo0O c31453OooOo0O = new C31453OooOo0O();
                                c31453OooOo0O.f112222OooOoO0 = c31448OooOOo.f112222OooOoO0;
                                abstractC31473OooOO0O.OooO0OO(c31460OooO0o0, outputStream, c31453OooOo0O);
                            } finally {
                            }
                        } else {
                            C31462OooO0oo c31462OooO0oo = this.f112473OooOoO0;
                            c31462OooO0oo.getClass();
                            C31454OooO c31454OooO = new C31454OooO(c31462OooO0oo);
                            try {
                                C31459OooO0o c31459OooO0o = new C31459OooO0o(c31454OooO);
                                try {
                                    AbstractC31473OooOO0O abstractC31473OooOO0O2 = (AbstractC31473OooOO0O) arrayList.get(size);
                                    abstractC31473OooOO0O2.getClass();
                                    c31448OooOOo.getClass();
                                    C31453OooOo0O c31453OooOo0O2 = new C31453OooOo0O();
                                    c31453OooOo0O2.f112222OooOoO0 = c31448OooOOo.f112222OooOoO0;
                                    abstractC31473OooOO0O2.OooO0OO(c31460OooO0o0, c31459OooO0o, c31453OooOo0O2);
                                    c31459OooO0o.close();
                                    C31454OooO c31454OooO2 = this.f112472OooOoO;
                                    try {
                                        this.f112472OooOoO = c31454OooO;
                                        c31454OooO2.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        c31454OooO = c31454OooO2;
                                        c31454OooO.close();
                                        throw th;
                                    }
                                } finally {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        c31460OooO0o0.close();
                    }
                    this.f112472OooOoO.close();
                    this.f112472OooOoO = null;
                } catch (Throwable th3) {
                    this.f112472OooOoO.close();
                    this.f112472OooOoO = null;
                    throw th3;
                }
            }
            super.close();
        } catch (Throwable th4) {
            super.close();
            throw th4;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f112472OooOoO == null) {
            super.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        C31454OooO c31454OooO = this.f112472OooOoO;
        if (c31454OooO != null) {
            c31454OooO.OooOOoo(bArr);
        } else {
            super.write(bArr);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C31454OooO c31454OooO = this.f112472OooOoO;
        if (c31454OooO != null) {
            c31454OooO.OooOooo(bArr, i, i2);
        } else {
            super.write(bArr, i, i2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        C31454OooO c31454OooO = this.f112472OooOoO;
        if (c31454OooO != null) {
            c31454OooO.OooOOo0(i);
        } else {
            super.write(i);
        }
    }
}
