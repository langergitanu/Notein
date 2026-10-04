package o0O0o00;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.editor.OooO0o;
import com.orion.editor.PDFView;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.PdfTextInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import java.util.UUID;
import o0O0oooo.C26395Oooo0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o00.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25917OooOO0 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.orion.editor.OooO00o f88477OooO00o;

    public C25917OooOO0(com.orion.editor.OooO00o oooO00o) {
        this.f88477OooO00o = oooO00o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        PdfTextInfo pdfTextInfoOooO0OO;
        com.orion.editor.OooO00o oooO00o = this.f88477OooO00o;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = oooO00o.f69095Oooo0oO;
        if (interfaceC31284OooO0O0 != null) {
            if ((interfaceC31284OooO0O0 instanceof DrawRecord) && !((DrawRecord) interfaceC31284OooO0O0).isTapeTransparent()) {
                return;
            }
            InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = oooO00o.f69095Oooo0oO;
            if ((interfaceC31284OooO0O02 instanceof ShapeInfo) && !((ShapeInfo) interfaceC31284OooO0O02).isTapeTransparent()) {
                return;
            }
        }
        if (oooO00o.f69058OooO0OO.OooO00o(motionEvent.getX(), motionEvent.getY()).booleanValue()) {
            oooO00o.f69056OooO00o.OooooO0();
            com.orion.editor.OooO0o oooO0o = oooO00o.f69058OooO0OO;
            OooO0o.OooO00o oooO00o2 = oooO0o.f69128OooO0o0;
            if (oooO00o2 == null) {
                return;
            }
            QuoteInfo quoteInfo = oooO00o2.f69129OooO00o;
            QuoteInfo quoteInfo2 = (QuoteInfo) quoteInfo.deepCopy(quoteInfo.getId());
            C26395Oooo0o0 c26395Oooo0o0 = oooO0o.f69125OooO0OO.f69170OooOooO.f69109OooO0O0;
            c26395Oooo0o0.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(quoteInfo2, "quoteInfo");
            c26395Oooo0o0.f90558OooO0oO.OooO0o0(quoteInfo2);
            return;
        }
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        if (oooO00o.f69067OooOOO || (pdfTextInfoOooO0OO = oooO00o.f69058OooO0OO.OooO0OO(pointF, pointF, false)) == null || pdfTextInfoOooO0OO.isEmpty()) {
            return;
        }
        oooO00o.f69056OooO00o.OooOooO();
        oooO00o.f69067OooOOO = true;
        final PointF pointF2 = new PointF(motionEvent.getX(), motionEvent.getY());
        oooO00o.f69072OooOOo0 = pointF2;
        final com.orion.editor.OooO0o oooO0o2 = oooO00o.f69058OooO0OO;
        PDFView pDFView = oooO0o2.f69125OooO0OO;
        pDFView.OoooOOo();
        pDFView.OooooO0();
        com.orion.editor.OooO0o.f69122OooO0oO.execute(new Runnable() { // from class: o0O0o00.o0000oo
            @Override // java.lang.Runnable
            public final void run() {
                com.orion.editor.OooO0o oooO0o3 = oooO0o2;
                PointF pointF3 = pointF2;
                PointF pointF4 = pointF2;
                PdfTextInfo pdfTextInfoOooO0OO2 = oooO0o3.OooO0OO(pointF3, pointF4, true);
                if (pdfTextInfoOooO0OO2.isEmpty()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TextSelectionManager");
                    c20358OooO00o.OooO00o("onPdfTextSelectBeginRunnable no text selected. p0: %s, p1: %s", pointF3, pointF4);
                    return;
                }
                synchronized (oooO0o3.f69127OooO0o) {
                    try {
                        if (oooO0o3.f69128OooO0o0 != null) {
                            return;
                        }
                        QuoteInfo quoteInfoCreateCandidateQuoteInfo = QuoteInfo.INSTANCE.createCandidateQuoteInfo(UUID.randomUUID().toString(), pdfTextInfoOooO0OO2.getRects(), pdfTextInfoOooO0OO2.getText(), pdfTextInfoOooO0OO2.isVerticalText(), pdfTextInfoOooO0OO2.isRtlOrBttText());
                        oooO0o3.f69126OooO0Oo = null;
                        oooO0o3.f69128OooO0o0 = OooO0o.OooO00o.OooO00o(oooO0o3.f69125OooO0OO, quoteInfoCreateCandidateQuoteInfo);
                        oooO0o3.f69125OooO0OO.postInvalidate();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        oooO00o.f69064OooOO0.OooO0OO();
    }
}
