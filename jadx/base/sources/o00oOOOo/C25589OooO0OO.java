package o00oOOOo;

import android.graphics.Bitmap;
import kotlin.jvm.internal.OooOOO0;
import o00o0o.AbstractC25434OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;

/* JADX INFO: renamed from: o00oOOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25589OooO0OO implements InterfaceC25586OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f87291OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AbstractC25434OooO00o<Bitmap> f87292OooO0O0;

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized AbstractC25434OooO00o OooO00o() {
        return AbstractC25434OooO00o.OooOOO0(this.f87292OooO0O0);
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized AbstractC25434OooO00o OooO0O0() {
        try {
        } finally {
            OooO0oO();
        }
        return AbstractC25434OooO00o.OooOOO0(this.f87292OooO0O0);
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized void OooO0OO(int i, AbstractC25434OooO00o bitmapReference) {
        try {
            OooOOO0.OooO0oO(bitmapReference, "bitmapReference");
            if (this.f87292OooO0O0 != null) {
                Object objOooo000 = bitmapReference.Oooo000();
                AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o = this.f87292OooO0O0;
                if (objOooo000.equals(abstractC25434OooO00o != null ? abstractC25434OooO00o.Oooo000() : null)) {
                    return;
                }
            }
            AbstractC25434OooO00o.OooOooo(this.f87292OooO0O0);
            this.f87292OooO0O0 = bitmapReference.OooO0OO();
            this.f87291OooO00o = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // o00oOOOO.InterfaceC25586OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean OooO0Oo(int i) {
        boolean z;
        if (i == this.f87291OooO00o) {
            z = AbstractC25434OooO00o.ooOO(this.f87292OooO0O0);
        }
        return z;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized AbstractC25434OooO00o<Bitmap> OooO0o(int i) {
        return this.f87291OooO00o == i ? AbstractC25434OooO00o.OooOOO0(this.f87292OooO0O0) : null;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final void OooO0o0(int i, AbstractC25434OooO00o bitmapReference) {
        OooOOO0.OooO0oO(bitmapReference, "bitmapReference");
    }

    public final synchronized void OooO0oO() {
        AbstractC25434OooO00o.OooOooo(this.f87292OooO0O0);
        this.f87292OooO0O0 = null;
        this.f87291OooO00o = -1;
    }

    @Override // o00oOOOO.InterfaceC25586OooO0O0
    public final synchronized void clear() {
        OooO0oO();
    }
}
