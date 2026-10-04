package o0O0o00;

import android.os.Build;
import android.os.HandlerThread;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import o0O0oooo.C26395Oooo0o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o00.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25938OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88581OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public HandlerThread f88582OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public HandlerC25931OooOo0o f88583OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HandlerThread f88584OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f88585OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public HandlerC25978o0000o f88586OooO0o0;

    public C25938OooOooo(PDFView pDFView, boolean z) {
        this.f88581OooO00o = pDFView;
        boolean z2 = Build.VERSION.SDK_INT >= 34;
        boolean zIsHardwareAccelerated = pDFView.isHardwareAccelerated();
        boolean z3 = z && z2 && zIsHardwareAccelerated;
        this.f88585OooO0o = z3;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PDFRenderManager");
        c20358OooO00o.OooO0o0("PDFRenderManager initialized with HW acceleration: %b, API level supported: %b, view supported: %b", Boolean.valueOf(z3), Boolean.valueOf(z2), Boolean.valueOf(zIsHardwareAccelerated));
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            c20358OooO00o.OooOOO0("PDFRenderManager");
            c20358OooO00o.OooOO0O("PDF file is null, cannot set supportHardwareRendering.", new Object[0]);
        } else {
            C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
            if (c26395Oooo0o0 == null) {
                return;
            }
            c26395Oooo0o0.f90580OooOooO = z3;
        }
    }

    public final void OooO00o(o00000OO o00000oo2) {
        HandlerC25931OooOo0o handlerC25931OooOo0o;
        if (!o00000oo2.f88668OooO00o.f69353OooO0oo && (handlerC25931OooOo0o = this.f88583OooO0OO) != null) {
            handlerC25931OooOo0o.sendMessage(handlerC25931OooOo0o.obtainMessage(2, o00000oo2));
            return;
        }
        HandlerC25978o0000o handlerC25978o0000o = this.f88586OooO0o0;
        if (handlerC25978o0000o != null) {
            handlerC25978o0000o.sendMessage(handlerC25978o0000o.obtainMessage(2, o00000oo2));
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PDFRenderManager");
        c20358OooO00o.OooOO0O("No default render handler available to mark tile dirty for task: %s", o00000oo2);
    }

    public final void OooO0O0(boolean z, boolean z2) {
        int i = z ? 2 : 1;
        if (z2) {
            i |= 4;
        }
        HandlerC25931OooOo0o handlerC25931OooOo0o = this.f88583OooO0OO;
        if (handlerC25931OooOo0o != null) {
            handlerC25931OooOo0o.sendMessage(handlerC25931OooOo0o.obtainMessage(1, i, 0));
            return;
        }
        HandlerC25978o0000o handlerC25978o0000o = this.f88586OooO0o0;
        if (handlerC25978o0000o != null) {
            handlerC25978o0000o.sendMessage(handlerC25978o0000o.obtainMessage(1, i, 0));
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PDFRenderManager");
        c20358OooO00o.OooOO0O("No default render handler available to mark visible area dirty.", new Object[0]);
    }
}
