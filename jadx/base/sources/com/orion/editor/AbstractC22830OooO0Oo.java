package com.orion.editor;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.util.Pair;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import com.orion.notein.domain.models.page.Page;
import com.orion.penkit.models.DrawResult;
import java.util.ArrayList;
import java.util.List;
import o0O0o00.AbstractC25969o00000Oo;
import o0O0o00.o000O000;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oooo.C26395Oooo0o0;
import o0oo000O.OooOO0;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.editor.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC22830OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f69108OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26395Oooo0o0 f69109OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC25969o00000Oo f69110OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f69111OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f69113OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f69112OooO0o = new ArrayList();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C26111OooO0oO f69114OooO0oO = new C26111OooO0oO(0, 0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C26111OooO0oO f69115OooO0oo = new C26111OooO0oO(0, 0);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C26112OooO0oo f69107OooO = new C26112OooO0oo(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C26112OooO0oo f69116OooOO0 = new C26112OooO0oo(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f69117OooOO0O = new ArrayList();

    /* JADX INFO: renamed from: com.orion.editor.OooO0Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f69118OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f69119OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f69120OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f69121OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        public OooO00o(PDFView pDFView, int i) throws OooO0O0 {
            try {
                this.f69118OooO00o = pDFView.OooOo0O(1, i);
                this.f69119OooO0O0 = pDFView.getPenWidthScale();
                this.f69120OooO0OO = pDFView.getShowDualLinkIcon();
                this.f69121OooO0Oo = pDFView.getEditMode() == PDFView.EnumC22832OooO0Oo.f69316OooOoO ? 2 : pDFView.getShowHyperLinkIcon();
            } catch (Exception e) {
                throw new OooO0O0("Failed to get render configuration", e);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.editor.OooO0Oo$OooO0O0 */
    public static class OooO0O0 extends Exception {
    }

    public AbstractC22830OooO0Oo(PDFView pDFView, C26395Oooo0o0 c26395Oooo0o0) {
        this.f69108OooO00o = pDFView;
        this.f69109OooO0O0 = c26395Oooo0o0;
    }

    public abstract void OooO(float f, float f2);

    public boolean OooO00o(boolean z) {
        return false;
    }

    public abstract void OooO0O0(float f, float f2);

    public final RectF OooO0OO(PagePart pagePart, RectF rectF) {
        RectF rectFOooOoo = OooOoo(rectF, pagePart.f69347OooO0O0);
        RectF rectFOooO0OO = pagePart.OooO0OO();
        if (!rectFOooOoo.intersect(rectFOooO0OO)) {
            return null;
        }
        float f = pagePart.f69350OooO0o;
        float f2 = pagePart.f69352OooO0oO;
        return new RectF(((rectFOooOoo.left - rectFOooO0OO.left) / rectFOooO0OO.width()) * f, ((rectFOooOoo.top - rectFOooO0OO.top) / rectFOooO0OO.height()) * f2, ((rectFOooOoo.right - rectFOooO0OO.left) / rectFOooO0OO.width()) * f, ((rectFOooOoo.bottom - rectFOooO0OO.top) / rectFOooO0OO.height()) * f2);
    }

    public boolean OooO0Oo(int i) {
        return this instanceof o000O000;
    }

    public Pair<Float, Float> OooO0o(float f, float f2) {
        Float fValueOf = Float.valueOf(0.0f);
        return new Pair<>(fValueOf, fValueOf);
    }

    public boolean OooO0o0(int i) {
        return this instanceof o000O000;
    }

    public boolean OooO0oO() {
        return false;
    }

    public final int OooO0oo(int i) {
        if (i < 0 || i >= this.f69111OooO0Oo) {
            return -1;
        }
        return i;
    }

    public abstract C26112OooO0oo OooOO0();

    public final C26112OooO0oo OooOO0O(int i) {
        if (OooO0oo(i) < 0) {
            return new C26112OooO0oo(0.0f, 0.0f);
        }
        if (i >= 0) {
            ArrayList arrayList = this.f69113OooO0o0;
            if (i < arrayList.size()) {
                C26111OooO0oO c26111OooO0oO = (C26111OooO0oO) arrayList.get(i);
                return new C26112OooO0oo(c26111OooO0oO.f89147OooO00o, c26111OooO0oO.f89148OooO0O0);
            }
        }
        return new C26112OooO0oo(0.0f, 0.0f);
    }

    public abstract int OooOO0o(float f, PointF pointF);

    public final Pair<Float, Float> OooOOO(int i) {
        Pair<Float, Float> pairOooOOO0 = OooOOO0(i);
        PDFView pDFView = this.f69108OooO00o;
        return new Pair<>(Float.valueOf((-pDFView.getCurrentXOffset()) - pairOooOOO0.first.floatValue()), Float.valueOf((-pDFView.getCurrentYOffset()) - pairOooOOO0.second.floatValue()));
    }

    public abstract Pair<Float, Float> OooOOO0(int i);

    public abstract RectF OooOOOO(float f);

    public abstract Pair<Integer, Integer> OooOOOo(RectF rectF);

    public abstract RectF OooOOo(int i);

    public final C26112OooO0oo OooOOo0(int i) {
        if (OooO0oo(i) < 0) {
            return new C26112OooO0oo(0.0f, 0.0f);
        }
        synchronized (this) {
            if (i >= 0) {
                try {
                    if (i < this.f69112OooO0o.size()) {
                        return (C26112OooO0oo) this.f69112OooO0o.get(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new C26112OooO0oo(0.0f, 0.0f);
        }
    }

    public abstract Pair<Float, Float> OooOOoo(int i);

    public Pair<Integer, Integer> OooOo() {
        return new Pair<>(0, 0);
    }

    public abstract float OooOo0(float f);

    public C26112OooO0oo OooOo00(int i) {
        return OooOOo0(i);
    }

    public abstract float OooOo0O(float f);

    public final C26112OooO0oo OooOo0o(int i, float f) {
        C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(i);
        return new C26112OooO0oo(c26112OooO0ooOooOOo0.f89149OooO00o * f, c26112OooO0ooOooOOo0.f89150OooO0O0 * f);
    }

    public abstract List<PagePart> OooOoO(int i);

    public float OooOoO0(float f) {
        return 0.0f;
    }

    public abstract List OooOoOO(RectF rectF, int i);

    public final RectF OooOoo(RectF rectF, int i) {
        C26112OooO0oo c26112OooO0ooOooOO0O = OooOO0O(i);
        float f = c26112OooO0ooOooOO0O.f89149OooO00o;
        float f2 = c26112OooO0ooOooOO0O.f89150OooO0O0;
        if (f > 0.0f && f2 > 0.0f) {
            return new RectF(rectF.left / f, rectF.top / f2, rectF.right / f, rectF.bottom / f2);
        }
        throw new IllegalArgumentException("Invalid page size for pageIndex " + i + ", size: " + f + "x" + f2);
    }

    public abstract void OooOoo0();

    public abstract boolean OooOooO(int i, RectF rectF, boolean z, boolean z2) throws o0O0o00O.OooO00o;

    public boolean OooOooo(int i) {
        return this instanceof o000O000;
    }

    public abstract void Oooo(int i, Point point, boolean z, boolean z2);

    public void Oooo0() {
    }

    public void Oooo000(float f, float f2) {
    }

    public abstract boolean Oooo00O(RectF rectF, int i);

    public abstract void Oooo00o();

    public abstract void Oooo0O0(C26111OooO0oO c26111OooO0oO);

    public final void Oooo0OO(PagePart pagePart, RectF rectF, boolean z, Canvas canvas, int i) {
        if (pagePart != null) {
            int i2 = pagePart.f69347OooO0O0;
            if (canvas != null && !pagePart.f69356OooOO0o.get()) {
                try {
                    OooO00o oooO00o = new OooO00o(this.f69108OooO00o, i2);
                    Oooo0oO(pagePart, rectF, z, canvas, oooO00o.f69118OooO00o);
                    if (((i & 2) == 0 && (i & 4) == 0) ? false : true) {
                        RectF rectFOooO0OO = pagePart.OooO0OO();
                        int i3 = pagePart.f69350OooO0o;
                        int i4 = pagePart.f69352OooO0oO;
                        boolean z2 = pagePart.f69353OooO0oo;
                        int iOooO0oo = OooO0oo(i2);
                        if (iOooO0oo < 0) {
                            return;
                        }
                        this.f69109OooO0O0.Oooo0o(canvas, i3, i4, iOooO0oo, null, rectF, rectFOooO0OO, oooO00o.f69118OooO00o, oooO00o.f69119OooO0O0, oooO00o.f69120OooO0OO, oooO00o.f69121OooO0Oo, z2, i & (-2));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteFile");
                    c20358OooO00o.OooO0Oo(e, "recordPagePartToCanvas failed for page %d", Integer.valueOf(i2));
                    return;
                }
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteFile");
        c20358OooO00o2.OooOO0O("recordPagePartToCanvas: Invalid input or recycled part", new Object[0]);
    }

    public final void Oooo0o(int i, int i2, int i3, RectF rectF, Canvas canvas) {
        if (i < 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteFile");
            c20358OooO00o.OooOO0O("recordPagePartToCanvas: Invalid input or recycled part", new Object[0]);
            return;
        }
        RectF rectF2 = new RectF();
        try {
            OooO00o oooO00o = new OooO00o(this.f69108OooO00o, i);
            int iOooO0oo = OooO0oo(i);
            if (iOooO0oo < 0) {
                return;
            }
            this.f69109OooO0O0.Oooo0o(canvas, i2, i3, iOooO0oo, null, rectF2, rectF, oooO00o.f69118OooO00o, oooO00o.f69119OooO0O0, oooO00o.f69120OooO0OO, oooO00o.f69121OooO0Oo, true, 6);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteFile");
            c20358OooO00o2.OooO0Oo(e, "recordPagePartToCanvas failed for page %d", Integer.valueOf(i));
        }
    }

    public final void Oooo0o0(Canvas canvas, Bitmap bitmap, int i, RectF rectF, OooO00o oooO00o, List<String> list, int i2) {
        int iOooO0oo = OooO0oo(i);
        if (iOooO0oo < 0) {
            return;
        }
        int i3 = oooO00o.f69121OooO0Oo;
        this.f69109OooO0O0.Oooo0o(canvas, bitmap.getWidth(), bitmap.getHeight(), iOooO0oo, list, new RectF(), rectF, oooO00o.f69118OooO00o, oooO00o.f69119OooO0O0, oooO00o.f69120OooO0OO, i3, false, i2 & (-17));
        canvas.setBitmap(null);
    }

    public final void Oooo0oO(PagePart pagePart, RectF rectF, boolean z, Canvas canvas, float f) {
        Bitmap bitmap;
        if (!z || pagePart.f69355OooOO0O == null) {
            int iOooO0oo = OooO0oo(pagePart.f69347OooO0O0);
            if (iOooO0oo < 0) {
                bitmap = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pagePart.f69350OooO0o, pagePart.f69352OooO0oO, Bitmap.Config.ARGB_8888);
                this.f69109OooO0O0.Oooo0oO(bitmapCreateBitmap, iOooO0oo, pagePart.OooO0OO(), pagePart.f69345OooO);
                pagePart.f69355OooOO0O = bitmapCreateBitmap;
                bitmap = bitmapCreateBitmap;
            }
        } else {
            bitmap = pagePart.f69355OooOO0O;
        }
        if (bitmap == null) {
            return;
        }
        if (rectF.isEmpty()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            RectF rectFOooO0OO = OooO0OO(pagePart, rectF);
            if (rectFOooO0OO == null) {
                return;
            }
            canvas.save();
            canvas.clipRect(rectFOooO0OO);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteFile");
            c20358OooO00o.OooO0Oo(e, "Failed to draw clipped bitmap for PagePart: %s", pagePart);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:22|(5:(9:30|(3:32|73|33)|67|37|38|77|39|40|82)(1:26)|77|39|40|82)|27|67|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0111, code lost:
    
        r17 = r26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0oo(Canvas canvas, Bitmap bitmap, int i, RectF rectF, OooO00o oooO00o, List<String> list, int i2) throws Throwable {
        Bitmap bitmap2;
        float f;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap3;
        float f2;
        RectF rectF2;
        float f3;
        float f4;
        float f5;
        RectF rectF3;
        Bitmap bitmap4;
        Object obj;
        if (Build.VERSION.SDK_INT < 34) {
            Oooo0o0(canvas, bitmap, i, rectF, oooO00o, list, i2 & (-17));
            return;
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this;
        RectF rectF4 = rectF;
        OooO00o oooO00o2 = oooO00o;
        int iOooO0oo = abstractC22830OooO0Oo.OooO0oo(i);
        if (iOooO0oo < 0) {
            return;
        }
        C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0Oo.OooOO0O(iOooO0oo);
        float f6 = rectF4.left;
        float f7 = c26112OooO0ooOooOO0O.f89149OooO00o;
        float f8 = rectF4.top;
        float f9 = c26112OooO0ooOooOO0O.f89150OooO0O0;
        RectF rectF5 = new RectF(f6 * f7, f8 * f9, rectF4.right * f7, rectF4.bottom * f9);
        int i3 = i2 & (-10);
        try {
            f = rectF5.top;
            bitmapCreateBitmap = null;
        } catch (Throwable th) {
            th = th;
            bitmap2 = null;
        }
        while (true) {
            try {
                float f10 = rectF5.bottom;
                if (f >= f10) {
                    break;
                }
                float f11 = f + 256.0f;
                float fMin = Math.min(f11, f10);
                float f12 = rectF5.left;
                while (true) {
                    try {
                        float f13 = rectF5.right;
                        if (f12 < f13) {
                            float f14 = f12 + 256.0f;
                            float fMin2 = Math.min(f14, f13);
                            if (fMin2 <= f12 || fMin <= f) {
                                f2 = f;
                                rectF2 = rectF5;
                                f3 = fMin;
                                f4 = f11;
                                f5 = f14;
                                bitmapCreateBitmap = bitmapCreateBitmap;
                            } else {
                                Picture picture = new Picture();
                                Canvas canvasBeginRecording = picture.beginRecording(bitmap.getWidth(), bitmap.getHeight());
                                try {
                                    if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) {
                                        rectF3 = rectF5;
                                        if (bitmapCreateBitmap == null) {
                                            bitmap4 = bitmapCreateBitmap;
                                            obj = null;
                                            try {
                                                canvasBeginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bitmap2 = bitmap4;
                                            }
                                        }
                                        f2 = f;
                                        rectF2 = rectF3;
                                        bitmap3 = bitmap4;
                                        f5 = f14;
                                        f3 = fMin;
                                        f4 = f11;
                                        abstractC22830OooO0Oo.f69109OooO0O0.Oooo0o(canvasBeginRecording, bitmap.getWidth(), bitmap.getHeight(), iOooO0oo, list, new RectF(f12, f, fMin2, fMin), rectF4, oooO00o2.f69118OooO00o, oooO00o2.f69119OooO0O0, oooO00o2.f69120OooO0OO, 0, false, i3);
                                        picture.endRecording();
                                        int width = bitmap.getWidth();
                                        int height = bitmap.getHeight();
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        bitmapCreateBitmap = Bitmap.createBitmap(picture, width, height, Bitmap.Config.ARGB_8888);
                                    } else {
                                        rectF3 = rectF5;
                                        canvasBeginRecording.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                                        bitmapCreateBitmap.recycle();
                                    }
                                    abstractC22830OooO0Oo.f69109OooO0O0.Oooo0o(canvasBeginRecording, bitmap.getWidth(), bitmap.getHeight(), iOooO0oo, list, new RectF(f12, f, fMin2, fMin), rectF4, oooO00o2.f69118OooO00o, oooO00o2.f69119OooO0O0, oooO00o2.f69120OooO0OO, 0, false, i3);
                                    picture.endRecording();
                                    int width2 = bitmap.getWidth();
                                    int height2 = bitmap.getHeight();
                                    Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                                    bitmapCreateBitmap = Bitmap.createBitmap(picture, width2, height2, Bitmap.Config.ARGB_8888);
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmap2 = bitmap3;
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    throw th;
                                }
                                bitmap4 = bitmapCreateBitmap;
                                obj = null;
                                f2 = f;
                                rectF2 = rectF3;
                                bitmap3 = bitmap4;
                                f5 = f14;
                                f3 = fMin;
                                f4 = f11;
                            }
                            abstractC22830OooO0Oo = this;
                            rectF4 = rectF;
                            oooO00o2 = oooO00o;
                            rectF5 = rectF2;
                            f = f2;
                            f11 = f4;
                            fMin = f3;
                            f12 = f5;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bitmap3 = bitmapCreateBitmap;
                    }
                }
                abstractC22830OooO0Oo = this;
                rectF4 = rectF;
                oooO00o2 = oooO00o;
                f = f11;
            } catch (Throwable th5) {
                th = th5;
                bitmap2 = bitmapCreateBitmap;
            }
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            throw th;
        }
        if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled()) {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            bitmapCreateBitmap.recycle();
        }
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) {
            return;
        }
        bitmapCreateBitmap.recycle();
    }

    public void OoooO0(Integer num, DrawResult drawResult) {
        C26395Oooo0o0 c26395Oooo0o0 = this.f69109OooO0O0;
        c26395Oooo0o0.getClass();
        int iIntValue = num.intValue();
        synchronized (c26395Oooo0o0.f90559OooO0oo) {
            Page page = c26395Oooo0o0.f90560OooOO0.get(iIntValue);
            OooOO0.f111232OooO00o.getClass();
            DrawResult drawResultOooO0OO = OooOO0.OooO0OO(page, drawResult);
            c26395Oooo0o0.OoooOOO(iIntValue, drawResultOooO0OO.getNewItemList(), drawResultOooO0OO.getRemoveItemList());
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public void OoooO00(int i, DrawResult drawResult, boolean z, String str) {
        this.f69109OooO0O0.OoooOOo(i, drawResult, z, str);
    }

    public void OoooO0O() {
    }
}
