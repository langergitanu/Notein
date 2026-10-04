package o00o000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.OooOOO;
import o00o000.OooOo00;
import o00o0O0.C25311OooO0Oo;

/* JADX INFO: renamed from: o00o000.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25229OooOoOO implements InterfaceC25121OooOO0O<InputStream, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f85935OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25159OooO0oO f85936OooO0O0;

    /* JADX INFO: renamed from: o00o000.OooOoOO$OooO00o */
    public static class OooO00o implements OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo f85937OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C25311OooO0Oo f85938OooO0O0;

        public OooO00o(OooOo oooOo, C25311OooO0Oo c25311OooO0Oo) {
            this.f85937OooO00o = oooOo;
            this.f85938OooO0O0 = c25311OooO0Oo;
        }

        @Override // o00o000.OooOOO.OooO0O0
        public final void OooO00o() {
            OooOo oooOo = this.f85937OooO00o;
            synchronized (oooOo) {
                oooOo.f85915OooOoO0 = oooOo.f85913OooOo0o.length;
            }
        }

        @Override // o00o000.OooOOO.OooO0O0
        public final void OooO0O0(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) throws IOException {
            IOException iOException = this.f85938OooO0O0.f86147OooOo;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                interfaceC25155OooO0O0.OooO00o(bitmap);
                throw iOException;
            }
        }
    }

    public C25229OooOoOO(OooOOO oooOOO, C25159OooO0oO c25159OooO0oO) {
        this.f85935OooO00o = oooOOO;
        this.f85936OooO0O0 = c25159OooO0oO;
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<Bitmap> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        boolean z;
        OooOo oooOo;
        C25311OooO0Oo c25311OooO0Oo;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof OooOo) {
            oooOo = (OooOo) inputStream2;
            z = false;
        } else {
            z = true;
            oooOo = new OooOo(inputStream2, this.f85936OooO0O0);
        }
        ArrayDeque arrayDeque = C25311OooO0Oo.f86146OooOoO0;
        synchronized (arrayDeque) {
            c25311OooO0Oo = (C25311OooO0Oo) arrayDeque.poll();
        }
        if (c25311OooO0Oo == null) {
            c25311OooO0Oo = new C25311OooO0Oo();
        }
        C25311OooO0Oo c25311OooO0Oo2 = c25311OooO0Oo;
        c25311OooO0Oo2.f86148OooOo0o = oooOo;
        o00o0O0.OooOO0 oooOO02 = new o00o0O0.OooOO0(c25311OooO0Oo2);
        OooO00o oooO00o = new OooO00o(oooOo, c25311OooO0Oo2);
        try {
            OooOOO oooOOO = this.f85935OooO00o;
            C25213OooO0o0 c25213OooO0o0OooO00o = oooOOO.OooO00o(new OooOo00.OooO0O0(oooOO02, oooOOO.f85888OooO0Oo, oooOOO.f85887OooO0OO), i, i2, c25111OooO, oooO00o);
            c25311OooO0Oo2.f86147OooOo = null;
            c25311OooO0Oo2.f86148OooOo0o = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(c25311OooO0Oo2);
            }
            if (z) {
                oooOo.release();
            }
            return c25213OooO0o0OooO00o;
        } catch (Throwable th) {
            c25311OooO0Oo2.f86147OooOo = null;
            c25311OooO0Oo2.f86148OooOo0o = null;
            ArrayDeque arrayDeque2 = C25311OooO0Oo.f86146OooOoO0;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(c25311OooO0Oo2);
                if (!z) {
                    throw th;
                }
                oooOo.release();
                throw th;
            }
        }
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
        return true;
    }
}
