package com.orion.editor;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.editor.PDFView;
import o0O0o0Oo.InterfaceC26010OooO00o;
import o0O0oOO.C26112OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0O0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f69105OooO00o;

    public OooO0O0(OooO00o oooO00o) {
        this.f69105OooO00o = oooO00o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        float width;
        float f2;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o("onDoubleTap in doubleTapGestureDetector", new Object[0]);
        OooO00o oooO00o = this.f69105OooO00o;
        int doubleTapMode = oooO00o.f69056OooO00o.getDoubleTapMode();
        if (doubleTapMode != 0 && oooO00o.f69056OooO00o.getEditMode() != PDFView.EnumC22832OooO0Oo.f69318OooOoOO) {
            if (!oooO00o.f69056OooO00o.f69232o0000oOo || oooO00o.f69096Oooo0oo.OooO00o()) {
                if (oooO00o.f69056OooO00o.getZoomHandle().OooO0OO()) {
                    oooO00o.f69056OooO00o.getZoomHandle().show();
                    return false;
                }
                oooO00o.f69056OooO00o.OooOo0o();
                PDFView pDFView = oooO00o.f69056OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                C26112OooO0oo c26112OooO0ooOooOo0o = abstractC22830OooO0Oo.OooOo0o(0, pDFView.getZoom());
                C26112OooO0oo c26112OooO0ooOooOOo0 = abstractC22830OooO0Oo.OooOOo0(0);
                if (doubleTapMode == 1) {
                    oooO00o.f69056OooO00o.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), oooO00o.f69056OooO00o.getWidth() / c26112OooO0ooOooOOo0.f89149OooO00o);
                    return true;
                }
                if (doubleTapMode == 2) {
                    oooO00o.f69056OooO00o.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), oooO00o.f69056OooO00o.getHeight() / c26112OooO0ooOooOOo0.f89150OooO0O0);
                    return true;
                }
                if (doubleTapMode != 3) {
                    c20358OooO00o.OooOOO0("DragPinchManager");
                    c20358OooO00o.OooO0OO("unknown double tap mode: %d", Integer.valueOf(doubleTapMode));
                    return true;
                }
                if (Math.abs(c26112OooO0ooOooOo0o.f89150OooO0O0 - oooO00o.f69056OooO00o.getHeight()) < 10.0f) {
                    width = oooO00o.f69056OooO00o.getWidth();
                    f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
                } else {
                    if (Math.abs(c26112OooO0ooOooOo0o.f89149OooO00o - oooO00o.f69056OooO00o.getWidth()) < 10.0f) {
                        width = oooO00o.f69056OooO00o.getHeight();
                        f2 = c26112OooO0ooOooOOo0.f89150OooO0O0;
                    } else {
                        if (Math.abs(oooO00o.f69056OooO00o.getZoom() - 1.0f) >= 0.1d) {
                            f = 1.0f;
                            oooO00o.f69056OooO00o.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), f);
                            return true;
                        }
                        width = oooO00o.f69056OooO00o.getWidth();
                        f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
                    }
                }
                f = width / f2;
                oooO00o.f69056OooO00o.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), f);
                return true;
            }
            c20358OooO00o.OooOOO0("DragPinchManager");
            c20358OooO00o.OooO0o0("intercept double tap event by palm detection in doubleTapGestureDetector", new Object[0]);
            InterfaceC26010OooO00o interfaceC26010OooO00o = oooO00o.f69056OooO00o.o0000o0;
            if (interfaceC26010OooO00o != null) {
                interfaceC26010OooO00o.stats();
            }
        }
        return false;
    }
}
