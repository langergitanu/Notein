package com.orion.editor;

import OooO0Oo.C20398OooO0O0;
import OooOoOO.C20519OooO0Oo;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import androidx.core.util.Pair;
import com.aspose.slides.internal.p332p7.OooOOOO;
import com.orion.editor.p600ui.textselection.TextSelectionHandle;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.penkit.models.PdfTextInfo;
import com.orion.penkit.models.QuoteInfo;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.PdfText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oooo.C26395Oooo0o0;
import o0oo000O.OooOO0;
import o0oo0OOO.C31235OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ExecutorService f69122OooO0oO = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f69123OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PDFView f69125OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public QuoteInfo f69126OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f69128OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicReference<PointF> f69124OooO0O0 = new AtomicReference<>(new PointF(0.0f, 0.0f));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f69127OooO0o = new Object();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public QuoteInfo f69129OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f69130OooO0O0;

        public static OooO00o OooO00o(PDFView pDFView, QuoteInfo quoteInfo) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo;
            if (quoteInfo == null || (abstractC22830OooO0Oo = pDFView.f69170OooOooO) == null) {
                return null;
            }
            int iIntValue = abstractC22830OooO0Oo.OooOOOo(quoteInfo.getBoundingBox(pDFView.getZoomLevel())).first.intValue();
            Pair<Float, Float> pairOooOOO = abstractC22830OooO0Oo.OooOOO(iIntValue);
            float fOooOo0O = pDFView.OooOo0O(2, iIntValue);
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = quoteInfo.deepCopy(quoteInfo.getId());
            interfaceC31284OooO0O0DeepCopy.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
            interfaceC31284OooO0O0DeepCopy.scale(fOooOo0O, pDFView.getPenWidthScale());
            OooO00o oooO00o = new OooO00o();
            oooO00o.f69129OooO00o = (QuoteInfo) interfaceC31284OooO0O0DeepCopy;
            oooO00o.f69130OooO0O0 = iIntValue;
            return oooO00o;
        }

        public final QuoteInfo OooO0O0(PDFView pDFView) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
            if (abstractC22830OooO0Oo == null) {
                return null;
            }
            int i = this.f69130OooO0O0;
            float fOooOo0O = pDFView.OooOo0O(1, i);
            Pair<Float, Float> pairOooOOO = abstractC22830OooO0Oo.OooOOO(i);
            QuoteInfo quoteInfo = this.f69129OooO00o;
            QuoteInfo quoteInfo2 = (QuoteInfo) quoteInfo.deepCopy(quoteInfo.getId());
            quoteInfo2.scale(fOooOo0O, pDFView.getPenWidthScale());
            quoteInfo2.offset(-pairOooOOO.first.floatValue(), -pairOooOOO.second.floatValue());
            return quoteInfo2;
        }
    }

    public OooO0o(PDFView pDFView) {
        this.f69125OooO0OO = pDFView;
        this.f69123OooO00o = ViewConfiguration.get(pDFView.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [long] */
    /* JADX WARN: Type inference failed for: r0v34, types: [long] */
    public static void OooO0o(QuoteInfo quoteInfo, TextSelectionHandle textSelectionHandle, TextSelectionHandle textSelectionHandle2, boolean z) {
        List<RectF> rectList;
        PointF pointF;
        PointF pointF2;
        HashMap map;
        if (quoteInfo == null || textSelectionHandle == null || textSelectionHandle2 == null || (rectList = quoteInfo.getRectList()) == null || rectList.isEmpty()) {
            return;
        }
        List<RectF> rectList2 = quoteInfo.getRectList();
        if (rectList2 == null || rectList2.isEmpty()) {
            pointF = new PointF(0.0f, 0.0f);
        } else {
            boolean zIsVerticalPdfText = quoteInfo.isVerticalPdfText();
            RectF rectF = quoteInfo.isRtlOrBttPdfText() ? (RectF) System.currentTimeMillis() : rectList2.get(0);
            pointF = zIsVerticalPdfText ? new PointF(rectF.centerX(), rectF.top) : new PointF(rectF.left, rectF.centerY());
        }
        List<RectF> rectList3 = quoteInfo.getRectList();
        if (rectList3 == null || rectList3.isEmpty()) {
            pointF2 = new PointF(0.0f, 0.0f);
        } else {
            boolean zIsVerticalPdfText2 = quoteInfo.isVerticalPdfText();
            RectF rectF2 = quoteInfo.isRtlOrBttPdfText() ? rectList3.get(0) : (RectF) System.currentTimeMillis();
            pointF2 = zIsVerticalPdfText2 ? new PointF(rectF2.centerX(), rectF2.bottom) : new PointF(rectF2.right, rectF2.centerY());
        }
        if (z) {
            map = new HashMap();
            PointF textPosition = textSelectionHandle.getTextPosition();
            PointF textPosition2 = textSelectionHandle2.getTextPosition();
            if (Math.hypot(pointF.x - textPosition.x, pointF.y - textPosition.y) < Math.hypot(pointF.x - textPosition2.x, pointF.y - textPosition2.y)) {
                map.put(textSelectionHandle, pointF);
                map.put(textSelectionHandle2, pointF2);
            } else {
                map.put(textSelectionHandle2, pointF);
                map.put(textSelectionHandle, pointF2);
            }
        } else {
            map = new HashMap();
            map.put(textSelectionHandle, pointF);
            map.put(textSelectionHandle2, pointF2);
        }
        if (quoteInfo.isVerticalPdfText()) {
            textSelectionHandle.OooO00o(2, ((PointF) map.get(textSelectionHandle)).x, ((PointF) map.get(textSelectionHandle)).y, true);
            textSelectionHandle2.OooO00o(3, ((PointF) map.get(textSelectionHandle2)).x, ((PointF) map.get(textSelectionHandle2)).y, true);
        } else {
            textSelectionHandle.OooO00o(0, ((PointF) map.get(textSelectionHandle)).x, ((PointF) map.get(textSelectionHandle)).y, false);
            textSelectionHandle2.OooO00o(1, ((PointF) map.get(textSelectionHandle2)).x, ((PointF) map.get(textSelectionHandle2)).y, false);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("TextSelectionManager");
        c20358OooO00o.OooO00o("showSmartTextSelectionHandles: isVertical=%b, start=(%f,%f), end=(%f,%f)", Boolean.valueOf(quoteInfo.isVerticalPdfText()), Float.valueOf(pointF.x), Float.valueOf(pointF.y), Float.valueOf(pointF2.x), Float.valueOf(pointF2.y));
    }

    public final Boolean OooO00o(float f, float f2) {
        QuoteInfo quoteInfoOooO0O0;
        OooO00o oooO00o = this.f69128OooO0o0;
        if (oooO00o != null && (quoteInfoOooO0O0 = oooO00o.OooO0O0(this.f69125OooO0OO)) != null) {
            Iterator<RectF> it = quoteInfoOooO0O0.getRectList().iterator();
            while (it.hasNext()) {
                if (it.next().contains(f, f2)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public final QuoteInfo OooO0O0() {
        OooO00o oooO00o = this.f69128OooO0o0;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooO0O0(this.f69125OooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ae A[PHI: r7
      0x05ae: PHI (r7v22 boolean) = (r7v20 boolean), (r7v24 boolean) binds: [B:223:0x05b7, B:217:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b0 A[PHI: r7
      0x05b0: PHI (r7v21 boolean) = (r7v20 boolean), (r7v24 boolean) binds: [B:223:0x05b7, B:217:0x05ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PdfTextInfo OooO0OO(PointF pointF, PointF pointF2, boolean z) {
        PdfTextInfo empty;
        List list;
        int i;
        int iOooOO0;
        Object objOooO00o;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        boolean zOooO0O0;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        boolean z5;
        PDFView pDFView = this.f69125OooO0OO;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (pDFView.f69173Oooo0.get() || abstractC22830OooO0Oo == null) {
            return PdfTextInfo.INSTANCE.getEMPTY();
        }
        int iOooOO0o = abstractC22830OooO0Oo.OooOO0o(pDFView.getZoom(), pointF);
        PointF pointFOooO0Oo = OooO0Oo(iOooOO0o, pointF);
        PointF pointFOooO0Oo2 = OooO0Oo(iOooOO0o, pointF2);
        PointF pointF3 = new PointF(pointFOooO0Oo.x, pointFOooO0Oo.y);
        PointF pointF4 = new PointF(pointFOooO0Oo2.x, pointFOooO0Oo2.y);
        final C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        int iOooOO0O = c26395Oooo0o0.OooOO0O(iOooOO0o, pointF3);
        int iOooOO0O2 = c26395Oooo0o0.OooOO0O(iOooOO0o, pointF4);
        if (((float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y)) < this.f69123OooO00o && iOooOO0O > iOooOO0O2) {
            return PdfTextInfo.INSTANCE.getEMPTY();
        }
        if (iOooOO0o < 0 || iOooOO0o >= c26395Oooo0o0.f90560OooOO0.size()) {
            empty = PdfTextInfo.INSTANCE.getEMPTY();
        } else {
            Page page = c26395Oooo0o0.f90560OooOO0.get(iOooOO0o);
            if (page.getPaperTheme() instanceof PdfPaperTheme) {
                PaperTheme paperTheme = page.getPaperTheme();
                OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme;
                final PdfDocument pdfDocument = c26395Oooo0o0.f90561OooOO0O.get(pdfPaperTheme.getPdfInfo().getPdfPath());
                if (pdfDocument == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteInCore");
                    c20358OooO00o.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("doc is null, pdfPath: ", pdfPaperTheme.getPdfInfo().getPdfPath()), new Object[0]);
                    empty = PdfTextInfo.INSTANCE.getEMPTY();
                } else {
                    C26111OooO0oO c26111OooO0oOOooOoO = c26395Oooo0o0.OooOoO(iOooOO0o);
                    OooOO0.f111232OooO00o.getClass();
                    PointF pointFOooO0O0 = OooOO0.OooO0O0(page, pointFOooO0Oo);
                    PointF pointFOooO0O02 = OooOO0.OooO0O0(page, pointFOooO0Oo2);
                    float f7 = pointFOooO0O0.y;
                    float f8 = pointFOooO0O02.y;
                    if (f7 >= f8 && (f7 != f8 || pointFOooO0O0.x > pointFOooO0O02.x)) {
                        float f9 = pointFOooO0O0.x;
                        pointFOooO0O0.x = pointFOooO0O02.x;
                        pointFOooO0O0.y = f8;
                        pointFOooO0O02.x = f9;
                        pointFOooO0O02.y = f7;
                    }
                    C26112OooO0oo c26112OooO0ooOooOo0O = c26395Oooo0o0.OooOo0O(iOooOO0o);
                    float f10 = c26112OooO0ooOooOo0O.f89149OooO00o / c26111OooO0oOOooOoO.f89147OooO00o;
                    float f11 = c26112OooO0ooOooOo0O.f89150OooO0O0;
                    int i4 = (int) f11;
                    PointF pointFOooO0oo = C26395Oooo0o0.OooO0oo(f10, pointFOooO0O0, i4);
                    PointF pointFOooO0oo2 = C26395Oooo0o0.OooO0oo(f10, pointFOooO0O02, i4);
                    int charIndexAtPos = c26395Oooo0o0.f90551OooO.getCharIndexAtPos(pdfDocument, pdfPaperTheme.getPageNum(), pointFOooO0oo.x, pointFOooO0oo.y, 1.0f, 1.0f);
                    int charIndexAtPos2 = c26395Oooo0o0.f90551OooO.getCharIndexAtPos(pdfDocument, pdfPaperTheme.getPageNum(), pointFOooO0oo2.x, pointFOooO0oo2.y, 30.0f, 30.0f);
                    c26395Oooo0o0.f90584Oooo00O = charIndexAtPos;
                    if (charIndexAtPos2 != -1) {
                        c26395Oooo0o0.f90585Oooo00o = charIndexAtPos2;
                    }
                    if (pointFOooO0oo.equals(pointFOooO0oo2) && c26395Oooo0o0.f90585Oooo00o == -1) {
                        c26395Oooo0o0.f90585Oooo00o = c26395Oooo0o0.f90584Oooo00O;
                    }
                    C34406OooO00o.f123390OooO00o.OooO00o("p0InPdf: " + pointFOooO0oo + ", p1InPdf: " + pointFOooO0oo2 + ", startIndex: " + c26395Oooo0o0.f90584Oooo00O + ", endIndex: " + c26395Oooo0o0.f90585Oooo00o, new Object[0]);
                    int i5 = c26395Oooo0o0.f90584Oooo00O;
                    if (i5 == -1 || (i = c26395Oooo0o0.f90585Oooo00o) == -1) {
                        empty = PdfTextInfo.INSTANCE.getEMPTY();
                    } else {
                        int iMin = Math.min(i5, i);
                        int iMax = Math.max(c26395Oooo0o0.f90584Oooo00O, c26395Oooo0o0.f90585Oooo00o);
                        final int pageNum = pdfPaperTheme.getPageNum();
                        if (iMin > 0) {
                            try {
                                iOooOO0 = c26395Oooo0o0.OooOO0(iMin, true, 0, new InterfaceC32507OooOO0o() { // from class: o0O0oooo.OooOoO
                                    @Override // oO0O000o.InterfaceC32507OooOO0o
                                    public final Object invoke(Object obj) {
                                        Character ch;
                                        int iIntValue = ((Integer) obj).intValue();
                                        final PdfDocument pdfDocument2 = pdfDocument;
                                        final C26395Oooo0o0 c26395Oooo0o02 = c26395Oooo0o0;
                                        final int i6 = pageNum;
                                        Character chOooOo = c26395Oooo0o02.OooOo(pdfDocument2, i6, iIntValue);
                                        final int i7 = iIntValue - 1;
                                        boolean z6 = false;
                                        if (i7 < 0) {
                                            i7 = 0;
                                        }
                                        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0O0oooo.OooOooO
                                            @Override // oO0O000o.OooO00o
                                            public final Object invoke() {
                                                return c26395Oooo0o02.OooOo(pdfDocument2, i6, i7);
                                            }
                                        });
                                        if (i7 != iIntValue && chOooOo != null && C26395Oooo0o0.OooOooo(chOooOo) && (ch = (Character) c32447OooOOoOooO0OO.getValue()) != null && C26395Oooo0o0.OooOooo(ch)) {
                                            z6 = true;
                                        }
                                        return Boolean.valueOf(z6);
                                    }
                                });
                            } catch (Throwable th) {
                                objOooO00o = C32446OooOOOo.OooO00o(th);
                            }
                        } else {
                            iOooOO0 = iMin;
                        }
                        objOooO00o = new C32443OooOOO(Integer.valueOf(iOooOO0), Integer.valueOf(iMax > 0 ? c26395Oooo0o0.OooOO0(iMax, false, 0, new InterfaceC32507OooOO0o() { // from class: o0O0oooo.OooOoOO
                            @Override // oO0O000o.InterfaceC32507OooOO0o
                            public final Object invoke(Object obj) {
                                Character ch;
                                int iIntValue = ((Integer) obj).intValue();
                                final PdfDocument pdfDocument2 = pdfDocument;
                                final C26395Oooo0o0 c26395Oooo0o02 = c26395Oooo0o0;
                                final int i6 = pageNum;
                                Character chOooOo = c26395Oooo0o02.OooOo(pdfDocument2, i6, iIntValue);
                                final int i7 = iIntValue + 1;
                                return Boolean.valueOf(chOooOo != null && C26395Oooo0o0.OooOooo(chOooOo) && (ch = (Character) C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0O0oooo.OooOoo
                                    @Override // oO0O000o.OooO00o
                                    public final Object invoke() {
                                        return c26395Oooo0o02.OooOo(pdfDocument2, i6, i7);
                                    }
                                }).getValue()) != null && C26395Oooo0o0.OooOooo(ch));
                            }
                        }) : iMax));
                        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                        if (thOooO00o != null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            StringBuilder sbOooO00o = OooOOOO.OooO00o(c20358OooO00o2, "NoteInCore", "correctSelectIndexInEngEnvSafely, start: ", iMin, ", end: ");
                            sbOooO00o.append(iMax);
                            f = f11;
                            sbOooO00o.append(", error: ");
                            sbOooO00o.append(thOooO00o);
                            sbOooO00o.append(".");
                            c20358OooO00o2.OooO0OO(sbOooO00o.toString(), new Object[0]);
                        } else {
                            f = f11;
                        }
                        if (C32445OooOOOO.OooO00o(objOooO00o) != null) {
                            objOooO00o = new C32443OooOOO(Integer.valueOf(iMin), Integer.valueOf(iMax));
                        }
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) objOooO00o;
                        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                        RectF[] rectsByIndexRange = c26395Oooo0o0.f90551OooO.getRectsByIndexRange(pdfDocument, pdfPaperTheme.getPageNum(), iIntValue, iIntValue2, true);
                        OooOOO0.OooO0Oo(rectsByIndexRange);
                        ArrayList arrayListOooO0oO = c26395Oooo0o0.OooO0oO(iOooOO0o, OooOOO.OoooOO0(rectsByIndexRange), c26112OooO0ooOooOo0O);
                        if (arrayListOooO0oO.isEmpty()) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("NoteInCore");
                            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("getRectsByIndexRange return empty, pageIndex: ", iOooOO0o, ", pageNum: ", ", start: ", pdfPaperTheme.getPageNum());
                            sbOooO0O0.append(iMin);
                            sbOooO0O0.append(", end: ");
                            sbOooO0O0.append(iMax);
                            c20358OooO00o3.OooOO0O(sbOooO0O0.toString(), new Object[0]);
                            empty = PdfTextInfo.INSTANCE.getEMPTY();
                        } else {
                            PdfiumCore pdfiumCore = c26395Oooo0o0.f90551OooO;
                            String text = z ? pdfiumCore.getText(pdfDocument, pdfPaperTheme.getPageNum(), iIntValue, iIntValue2) : "";
                            List<PdfText> pageContent = pdfiumCore.getPageContent(pdfDocument, pdfPaperTheme.getPageNum());
                            OooOOO0.OooO0Oo(pageContent);
                            List<PdfText> list2 = pageContent;
                            ArrayList<RectF> arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((PdfText) it.next()).getBounds());
                            }
                            ArrayList<RectF> arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                            for (RectF rectF : arrayList) {
                                arrayList2.add(new RectF(rectF.left, f - rectF.top, rectF.right, f - rectF.bottom));
                            }
                            C26111OooO0oO c26111OooO0oOOooOoO2 = c26395Oooo0o0.OooOoO(iOooOO0o);
                            C26112OooO0oo c26112OooO0ooOooOo0O2 = c26395Oooo0o0.OooOo0O(iOooOO0o);
                            float f12 = c26111OooO0oOOooOoO2.f89147OooO00o / c26112OooO0ooOooOo0O2.f89149OooO00o;
                            float f13 = c26111OooO0oOOooOoO2.f89148OooO0O0 / c26112OooO0ooOooOo0O2.f89150OooO0O0;
                            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                            for (RectF rectF2 : arrayList2) {
                                arrayList3.add(new RectF(rectF2.left * f12, rectF2.top * f13, rectF2.right * f12, rectF2.bottom * f13));
                            }
                            float f14 = 1.0E-6f;
                            if (arrayList3.isEmpty()) {
                                f2 = 1.0E-6f;
                                f3 = 0.15f;
                                f4 = 0.0f;
                                zOooO0O0 = false;
                            } else if (arrayList3.size() == 1) {
                                RectF rectF3 = (RectF) arrayList3.get(0);
                                if (rectF3 == null) {
                                    f2 = 1.0E-6f;
                                    zOooO0O0 = false;
                                    f3 = 0.15f;
                                    f4 = 0.0f;
                                } else {
                                    float fWidth = rectF3.width();
                                    float fHeight = rectF3.height();
                                    if (fWidth <= 1.0E-6f || fHeight / fWidth > 1.5f) {
                                        f2 = 1.0E-6f;
                                        f3 = 0.15f;
                                        f4 = 0.0f;
                                        zOooO0O0 = true;
                                    }
                                }
                            } else {
                                int size = arrayList3.size();
                                if (size < 2) {
                                    f2 = 1.0E-6f;
                                    i2 = 0;
                                    f3 = 0.15f;
                                    f4 = 0.0f;
                                    f5 = 0.0f;
                                    f6 = 0.0f;
                                } else {
                                    int i6 = size - 1;
                                    float[] fArr = new float[i6];
                                    float[] fArr2 = new float[i6];
                                    float[] fArr3 = new float[i6];
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        RectF rectF4 = (RectF) arrayList3.get(i7);
                                        int i8 = i7 + 1;
                                        RectF rectF5 = (RectF) arrayList3.get(i8);
                                        float fAbs = Math.abs(rectF5.centerX() - rectF4.centerX());
                                        float fCenterY = rectF5.centerY() - rectF4.centerY();
                                        float f15 = f14;
                                        float fAbs2 = Math.abs(fCenterY);
                                        int i9 = i7;
                                        float[] fArr4 = fArr;
                                        float fHypot = (float) Math.hypot(fAbs, fAbs2);
                                        fArr2[i9] = fAbs;
                                        fArr3[i9] = fAbs2;
                                        fArr4[i9] = fHypot;
                                        i7 = i8;
                                        f14 = f15;
                                        fArr = fArr4;
                                    }
                                    f2 = f14;
                                    float[] fArr5 = fArr;
                                    f3 = 0.15f;
                                    f4 = 0.0f;
                                    float fOooO0OO = C31235OooO00o.OooO0OO(fArr5);
                                    float f16 = fOooO0OO <= f2 ? Float.POSITIVE_INFINITY : fOooO0OO * 1.8f;
                                    f5 = 0.0f;
                                    f6 = 0.0f;
                                    int i10 = 0;
                                    for (int i11 = 0; i11 < i6; i11++) {
                                        if (fArr5[i11] <= f16) {
                                            f5 += fArr2[i11];
                                            f6 += fArr3[i11];
                                            i10++;
                                        }
                                    }
                                    i2 = i10;
                                }
                                if (i2 == 0) {
                                    zOooO0O0 = C31235OooO00o.OooO0O0(arrayList3);
                                } else {
                                    zOooO0O0 = f6 > f5;
                                    boolean zOooO0O02 = C31235OooO00o.OooO0O0(arrayList3);
                                    if (zOooO0O0 != zOooO0O02) {
                                        if (Math.abs(f6 - f5) / ((f5 + f6) + f2) < f3) {
                                            zOooO0O0 = zOooO0O02;
                                        }
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty() && arrayList3.size() >= 2) {
                                C31235OooO00o.C20167OooO00o c20167OooO00oOooO00o = C31235OooO00o.OooO00o(arrayList3);
                                if (zOooO0O0) {
                                    z2 = c20167OooO00oOooO00o.f111399OooO0o > 0 ? false : false;
                                } else if (c20167OooO00oOooO00o.f111395OooO00o <= 0 || Math.abs(c20167OooO00oOooO00o.f111398OooO0Oo) / (c20167OooO00oOooO00o.f111396OooO0O0 + f2) < f3) {
                                    float f17 = c20167OooO00oOooO00o.f111398OooO0Oo + c20167OooO00oOooO00o.f111394OooO;
                                    float f18 = c20167OooO00oOooO00o.f111396OooO0O0 + c20167OooO00oOooO00o.f111401OooO0oO;
                                    if (f18 <= f2 || Math.abs(f17) / (f18 + f2) < 0.05f ? ((RectF) OooOo.OoooOOo(arrayList3)).centerX() - ((RectF) OooOo.Oooo0oO(arrayList3)).centerX() < f4 : f17 < f4) {
                                        z2 = true;
                                    }
                                } else if (c20167OooO00oOooO00o.f111398OooO0Oo < f4) {
                                }
                                if (arrayList3.isEmpty()) {
                                    i3 = C26395Oooo0o0.C26396OooO0Oo.f90599OooO00o[page.getRotationDirection().ordinal()];
                                    if (i3 == 1) {
                                    }
                                }
                            } else if (!arrayList3.isEmpty() || arrayList3.size() < 2) {
                                i3 = C26395Oooo0o0.C26396OooO0Oo.f90599OooO00o[page.getRotationDirection().ordinal()];
                                if (i3 == 1) {
                                    z4 = !zOooO0O0;
                                    if (zOooO0O0) {
                                        if (!z3) {
                                        }
                                        zOooO0O0 = z4;
                                        z2 = z5;
                                        OooOOO0.OooO0Oo(text);
                                        empty = new PdfTextInfo(text, arrayListOooO0oO, zOooO0O0, z2);
                                    } else {
                                        z5 = z2;
                                        zOooO0O0 = z4;
                                        z2 = z5;
                                        OooOOO0.OooO0Oo(text);
                                        empty = new PdfTextInfo(text, arrayListOooO0oO, zOooO0O0, z2);
                                    }
                                } else if (i3 == 2) {
                                    z4 = !zOooO0O0;
                                    if (zOooO0O0) {
                                        z5 = z3;
                                        zOooO0O0 = z4;
                                        z2 = z5;
                                        OooOOO0.OooO0Oo(text);
                                        empty = new PdfTextInfo(text, arrayListOooO0oO, zOooO0O0, z2);
                                    } else {
                                        z5 = !z2;
                                        zOooO0O0 = z4;
                                        z2 = z5;
                                        OooOOO0.OooO0Oo(text);
                                        empty = new PdfTextInfo(text, arrayListOooO0oO, zOooO0O0, z2);
                                    }
                                } else if (i3 == 3) {
                                    z5 = !zOooO0O0 ? z2 : z3;
                                    z2 = z5;
                                    OooOOO0.OooO0Oo(text);
                                    empty = new PdfTextInfo(text, arrayListOooO0oO, zOooO0O0, z2);
                                } else {
                                    if (i3 != 4) {
                                        throw new C32442OooOO0o();
                                    }
                                    if (zOooO0O0) {
                                        z2 = z3;
                                    }
                                    OooOOO0.OooO0Oo(text);
                                    empty = new PdfTextInfo(text, arrayListOooO0oO, zOooO0O0, z2);
                                }
                            } else {
                                C31235OooO00o.C20167OooO00o c20167OooO00oOooO00o2 = C31235OooO00o.OooO00o(arrayList3);
                                if (!zOooO0O0) {
                                    z3 = c20167OooO00oOooO00o2.f111399OooO0o > 0 ? false : false;
                                } else if (c20167OooO00oOooO00o2.f111395OooO00o <= 0 || Math.abs(c20167OooO00oOooO00o2.f111400OooO0o0) / (c20167OooO00oOooO00o2.f111397OooO0OO + f2) < f3) {
                                    float f19 = c20167OooO00oOooO00o2.f111400OooO0o0 + c20167OooO00oOooO00o2.f111403OooOO0;
                                    float f20 = c20167OooO00oOooO00o2.f111397OooO0OO + c20167OooO00oOooO00o2.f111402OooO0oo;
                                    if (f20 <= f2 || Math.abs(f19) / (f20 + f2) < 0.05f ? ((RectF) OooOo.OoooOOo(arrayList3)).centerY() - ((RectF) OooOo.Oooo0oO(arrayList3)).centerY() < f4 : f19 < f4) {
                                        z3 = true;
                                    }
                                } else if (c20167OooO00oOooO00o2.f111400OooO0o0 < f4) {
                                }
                                i3 = C26395Oooo0o0.C26396OooO0Oo.f90599OooO00o[page.getRotationDirection().ordinal()];
                                if (i3 == 1) {
                                }
                            }
                        }
                    }
                }
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("NoteInCore");
                c20358OooO00o4.OooOO0O("page.paperTheme is not PdfPaperTheme", new Object[0]);
                empty = PdfTextInfo.INSTANCE.getEMPTY();
            }
        }
        if (empty == null || empty == PdfTextInfo.INSTANCE.getEMPTY()) {
            return PdfTextInfo.INSTANCE.getEMPTY();
        }
        List<RectF> rects = empty.getRects();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            final Pair<Float, Float> pairOooOOO = abstractC22830OooO0Oo2.OooOOO(iOooOO0o);
            final float fOooOo0O = pDFView.OooOo0O(1, iOooOO0o);
            list = (List) rects.stream().map(new Function() { // from class: o0O0o00.o0000O00
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    RectF rectF6 = new RectF((RectF) obj);
                    float f21 = rectF6.left;
                    float f22 = fOooOo0O;
                    rectF6.left = f21 * f22;
                    rectF6.right *= f22;
                    rectF6.top *= f22;
                    rectF6.bottom *= f22;
                    Pair pair = pairOooOOO;
                    rectF6.offset(-((Float) pair.first).floatValue(), -((Float) pair.second).floatValue());
                    return rectF6;
                }
            }).collect(Collectors.toList());
        }
        return new PdfTextInfo(empty.getText(), list, empty.isVerticalText(), empty.isRtlOrBttText());
    }

    public final PointF OooO0Oo(int i, PointF pointF) {
        PDFView pDFView = this.f69125OooO0OO;
        Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(i);
        float fOooOo0O = pDFView.OooOo0O(2, i);
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
        pointF2.x *= fOooOo0O;
        pointF2.y *= fOooOo0O;
        return pointF2;
    }

    public final void OooO0o0(QuoteInfo quoteInfo) {
        synchronized (this.f69127OooO0o) {
            this.f69124OooO0O0.set(new PointF(0.0f, 0.0f));
            this.f69126OooO0Oo = null;
            this.f69128OooO0o0 = OooO00o.OooO00o(this.f69125OooO0OO, quoteInfo);
        }
    }
}
