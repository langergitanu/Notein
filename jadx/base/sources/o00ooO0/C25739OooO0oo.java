package o00ooO0;

import android.graphics.Bitmap;
import o00o0o.InterfaceC25436OooO0OO;
import o00ooOO.C25767OooO0OO;

/* JADX INFO: renamed from: o00ooO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25739OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f87842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f87843OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f87844OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f87845OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f87846OooO0o0;

    /* JADX INFO: renamed from: o00ooO0.OooO0oo$OooO00o */
    public class OooO00o implements InterfaceC25436OooO0OO<Bitmap> {
        public OooO00o() {
        }

        @Override // o00o0o.InterfaceC25436OooO0OO
        public final void release(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            try {
                C25739OooO0oo.this.OooO00o(bitmap2);
            } finally {
                bitmap2.recycle();
            }
        }
    }

    public C25739OooO0oo(int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f87844OooO0OO = i;
        this.f87845OooO0Oo = i2;
        this.f87846OooO0o0 = new OooO00o();
    }

    public final synchronized void OooO00o(Bitmap bitmap) {
        int iOooO0Oo = C25767OooO0OO.OooO0Oo(bitmap);
        OooOoo0.OooOo00.OooO0OO(this.f87842OooO00o > 0, "No bitmaps registered.");
        long j = iOooO0Oo;
        OooOoo0.OooOo00.OooO0Oo(j <= this.f87843OooO0O0, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iOooO0Oo), Long.valueOf(this.f87843OooO0O0));
        this.f87843OooO0O0 -= j;
        this.f87842OooO00o--;
    }

    public final synchronized int OooO0O0() {
        return this.f87845OooO0Oo;
    }
}
