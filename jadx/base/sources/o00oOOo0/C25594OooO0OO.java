package o00oOOo0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.OooOOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00oOOOO.C25585OooO00o;
import o00oOOOO.InterfaceC25586OooO0O0;
import o00oOOo0.C25593OooO0O0;
import o00oOOo0.C25593OooO0O0.OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oOOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25594OooO0OO implements InterfaceC25592OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f87307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Class<C25594OooO0OO> f87308OooO0O0;

    public C25594OooO0OO() {
        this(3);
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final AbstractC25434OooO00o<Bitmap> OooO00o(int i, int i2, int i3) {
        return null;
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void OooO0O0() {
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void OooO0OO(C25593OooO0O0 bitmapFramePreparer, InterfaceC25586OooO0O0 interfaceC25586OooO0O0, C25585OooO00o c25585OooO00o, int i) {
        C25593OooO0O0 c25593OooO0O0;
        InterfaceC25586OooO0O0 interfaceC25586OooO0O02;
        C25585OooO00o c25585OooO00o2;
        OooOOO0.OooO0oO(bitmapFramePreparer, "bitmapFramePreparer");
        int i2 = this.f87307OooO00o;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            int iOooO0O0 = (i + i3) % c25585OooO00o.f87276OooO0Oo.OooO0O0();
            if (C25438OooO00o.f86720OooO00o.OooO00o(2)) {
                C25438OooO00o.OooO0o0(this.f87308OooO0O0, "Preparing frame %d, last drawn: %d", Integer.valueOf(iOooO0O0), Integer.valueOf(i));
            }
            int iHashCode = (c25585OooO00o.hashCode() * 31) + iOooO0O0;
            synchronized (bitmapFramePreparer.f87301OooO0o0) {
                if (bitmapFramePreparer.f87301OooO0o0.get(iHashCode) != null) {
                    C25438OooO00o.OooO0Oo(C25593OooO0O0.class, Integer.valueOf(iOooO0O0), "Already scheduled decode job for frame %d");
                } else if (interfaceC25586OooO0O0.OooO0Oo(iOooO0O0)) {
                    C25438OooO00o.OooO0Oo(C25593OooO0O0.class, Integer.valueOf(iOooO0O0), "Frame %d is cached already.");
                } else {
                    c25593OooO0O0 = bitmapFramePreparer;
                    interfaceC25586OooO0O02 = interfaceC25586OooO0O0;
                    c25585OooO00o2 = c25585OooO00o;
                    C25593OooO0O0.OooO00o oooO00o = c25593OooO0O0.new OooO00o(c25585OooO00o2, interfaceC25586OooO0O02, iOooO0O0, iHashCode);
                    c25593OooO0O0.f87301OooO0o0.put(iHashCode, oooO00o);
                    c25593OooO0O0.f87300OooO0Oo.execute(oooO00o);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                c25593OooO0O0 = bitmapFramePreparer;
                interfaceC25586OooO0O02 = interfaceC25586OooO0O0;
                c25585OooO00o2 = c25585OooO00o;
            }
            if (i3 == i2) {
                return;
            }
            i3++;
            bitmapFramePreparer = c25593OooO0O0;
            c25585OooO00o = c25585OooO00o2;
            interfaceC25586OooO0O0 = interfaceC25586OooO0O02;
        }
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void OooO0Oo(int i, int i2) {
    }

    @Override // o00oOOo0.InterfaceC25592OooO00o
    public final void onStop() {
    }

    public C25594OooO0OO(int i) {
        this.f87307OooO00o = i;
        this.f87308OooO0O0 = C25594OooO0OO.class;
    }
}
