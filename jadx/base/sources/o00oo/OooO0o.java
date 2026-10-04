package o00oo;

import android.graphics.Bitmap;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00oo0OO.C25683OooO0OO;
import o00ooOO.C25767OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o extends AbstractC25635OooO00o implements InterfaceC25637OooO0o0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f87495OooOooo = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AbstractC25434OooO00o f87496OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile Bitmap f87497OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f87498OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final InterfaceC25640OooOO0o f87499OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f87500OooOooO;

    public OooO0o(Bitmap bitmap, C25683OooO0OO c25683OooO0OO, OooOO0O oooOO0O) {
        this.f87497OooOoOO = bitmap;
        Bitmap bitmap2 = this.f87497OooOoOO;
        c25683OooO0OO.getClass();
        this.f87496OooOoO = AbstractC25434OooO00o.o0Oo0oo(bitmap2, c25683OooO0OO, AbstractC25434OooO00o.f86711OooOoo0);
        this.f87499OooOoo0 = oooOO0O;
        this.f87498OooOoo = 0;
        this.f87500OooOooO = 0;
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final int OooO0o0() {
        return C25767OooO0OO.OooO0Oo(this.f87497OooOoOO);
    }

    @Override // o00oo.InterfaceC25637OooO0o0
    public final synchronized AbstractC25434OooO00o OooOo00() {
        return AbstractC25434OooO00o.OooOOO0(this.f87496OooOoO);
    }

    @Override // o00oo.InterfaceC25637OooO0o0
    public final int Oooo() {
        return this.f87500OooOooO;
    }

    @Override // o00oo.InterfaceC25636OooO0Oo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC25434OooO00o abstractC25434OooO00o;
        synchronized (this) {
            abstractC25434OooO00o = this.f87496OooOoO;
            this.f87496OooOoO = null;
            this.f87497OooOoOO = null;
        }
        if (abstractC25434OooO00o != null) {
            abstractC25434OooO00o.close();
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        C25438OooO00o.OooOO0("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", OooO0o.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final int getHeight() {
        int i;
        if (this.f87498OooOoo % 180 != 0 || (i = this.f87500OooOooO) == 5 || i == 7) {
            Bitmap bitmap = this.f87497OooOoOO;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f87497OooOoOO;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // o00oo.InterfaceC25637OooO0o0
    public final int getRotationAngle() {
        return this.f87498OooOoo;
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final int getWidth() {
        int i;
        if (this.f87498OooOoo % 180 != 0 || (i = this.f87500OooOooO) == 5 || i == 7) {
            Bitmap bitmap = this.f87497OooOoOO;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f87497OooOoOO;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // o00oo.InterfaceC25636OooO0Oo
    public final synchronized boolean isClosed() {
        return this.f87496OooOoO == null;
    }

    @Override // o00oo.AbstractC25635OooO00o, o00oo.InterfaceC25636OooO0Oo
    public final InterfaceC25640OooOO0o o000() {
        return this.f87499OooOoo0;
    }

    @Override // o00oo.OooO0OO
    public final Bitmap o000Ooo() {
        return this.f87497OooOoOO;
    }

    public OooO0o(AbstractC25434OooO00o abstractC25434OooO00o, InterfaceC25640OooOO0o interfaceC25640OooOO0o, int i, int i2) {
        AbstractC25434OooO00o abstractC25434OooO00oOooO0OO = abstractC25434OooO00o.OooO0OO();
        abstractC25434OooO00oOooO0OO.getClass();
        this.f87496OooOoO = abstractC25434OooO00oOooO0OO;
        this.f87497OooOoOO = (Bitmap) abstractC25434OooO00oOooO0OO.Oooo000();
        this.f87499OooOoo0 = interfaceC25640OooOO0o;
        this.f87498OooOoo = i;
        this.f87500OooOooO = i2;
    }
}
