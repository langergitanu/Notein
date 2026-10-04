package o00oOooO;

import android.graphics.Bitmap;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;
import o00oOOOO.InterfaceC25586OooO0O0;
import o00oOoo0.InterfaceC25626OooO00o;
import o00oo00O.C25650OooO0Oo;

/* JADX INFO: renamed from: o00oOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25631OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25586OooO0O0 f87482OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC25626OooO00o f87483OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f87484OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C25650OooO0Oo f87485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C19714OooO00o f87486OooO0o0;

    /* JADX INFO: renamed from: o00oOooO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19714OooO00o implements C25650OooO0Oo.OooO00o {
        public C19714OooO00o() {
        }

        @Override // o00oo00O.C25650OooO0Oo.OooO00o
        public final void OooO00o(Bitmap bitmap) {
        }

        @Override // o00oo00O.C25650OooO0Oo.OooO00o
        public final AbstractC25434OooO00o<Bitmap> OooO0O0(int i) {
            return C25631OooO00o.this.f87482OooO00o.OooO0o(i);
        }
    }

    public C25631OooO00o(InterfaceC25586OooO0O0 interfaceC25586OooO0O0, InterfaceC25626OooO00o interfaceC25626OooO00o, boolean z) {
        this.f87482OooO00o = interfaceC25586OooO0O0;
        this.f87483OooO0O0 = interfaceC25626OooO00o;
        this.f87484OooO0OO = z;
        C19714OooO00o c19714OooO00o = new C19714OooO00o();
        this.f87486OooO0o0 = c19714OooO00o;
        this.f87485OooO0Oo = new C25650OooO0Oo(interfaceC25626OooO00o, z, c19714OooO00o);
    }

    public final boolean OooO00o(int i, Bitmap bitmap) {
        try {
            this.f87485OooO0Oo.OooO0Oo(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            if (!C25438OooO00o.f86720OooO00o.OooO00o(6)) {
                return false;
            }
            C25439OooO0O0.OooO0OO(6, C25631OooO00o.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }
}
