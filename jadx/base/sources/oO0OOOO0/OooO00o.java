package oO0OOOO0;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import oO0OOOO0.InterfaceC32958OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o implements InterfaceC32958OooOOOo {

    /* JADX INFO: renamed from: oO0OOOO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC20287OooO00o<BuilderType extends AbstractC20287OooO00o> implements InterfaceC32958OooOOOo.OooO00o {
        @Override // oO0OOOO0.InterfaceC32958OooOOOo.OooO00o
        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType Oooo0OO(C32951OooO0Oo c32951OooO0Oo, OooO0o oooO0o) throws IOException;

        /* JADX INFO: renamed from: oO0OOOO0.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20288OooO00o extends FilterInputStream {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f119052OooOo0o;

            public C20288OooO00o(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.f119052OooOo0o = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.f119052OooOo0o);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f119052OooOo0o <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f119052OooOo0o--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f119052OooOo0o));
                if (jSkip >= 0) {
                    this.f119052OooOo0o = (int) (((long) this.f119052OooOo0o) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f119052OooOo0o;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f119052OooOo0o -= i4;
                }
                return i4;
            }
        }
    }
}
