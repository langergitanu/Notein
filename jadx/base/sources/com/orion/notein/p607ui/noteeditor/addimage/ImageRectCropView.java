package com.orion.notein.p607ui.noteeditor.addimage;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00OO0O0.OooO0O0;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addimage/ImageRectCropView;", "Lcom/orion/notein/ui/noteeditor/addimage/AbstractImageCropView;", "Landroid/graphics/Bitmap;", "getCroppedImage", "()Landroid/graphics/Bitmap;", "Landroid/graphics/RectF;", "getCroppedBounds", "()Landroid/graphics/RectF;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageRectCropView extends AbstractImageCropView {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final float f73744Oooo0o = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final float f73745Oooo0oO = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final float f73746Oooo0oo = o000000O.OooO0o0(4.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public RectF f73747OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Bitmap f73748OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f73749OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f73750OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Rect f73751OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f73752OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final PointF f73753OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f73754OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final RectF f73755OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Paint f73756Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final RectF f73757Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final RectF f73758Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RectF f73759Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Paint f73760Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public Bitmap f73761Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public Canvas f73762Oooo0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageRectCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f73750OooOoO0 = StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4;
        this.f73749OooOoO = StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4;
        this.f73751OooOoOO = new Rect();
        this.f73753OooOoo0 = new PointF();
        this.f73752OooOoo = new RectF();
        this.f73754OooOooO = new RectF();
        this.f73755OooOooo = new RectF();
        this.f73757Oooo000 = new RectF();
        this.f73758Oooo00O = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#007AFF"));
        paint.setStrokeWidth(o000000O.OooO0o0(4.0f));
        this.f73756Oooo0 = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f73760Oooo0O0 = paint2;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView
    public final void OooO00o(Bitmap image, RectF originImageBounds, int i, int i2) {
        OooOOO0.OooO0oO(image, "image");
        OooOOO0.OooO0oO(originImageBounds, "originImageBounds");
        this.f73748OooOo0o = image;
        this.f73747OooOo = new RectF(originImageBounds);
        this.f73750OooOoO0 = i;
        this.f73749OooOoO = i2;
    }

    public final void OooO0O0() {
        RectF rectF = this.f73752OooOoo;
        RectF rectF2 = this.f73758Oooo00O;
        float f = rectF2.left;
        float f2 = f73746Oooo0oo;
        float f3 = rectF2.top;
        float f4 = f73744Oooo0o;
        rectF.set(f - f2, f3 - f2, (f + f4) - f2, (f3 + f4) - f2);
        RectF rectF3 = this.f73754OooOooO;
        float f5 = rectF2.right;
        float f6 = rectF2.top;
        rectF3.set(f5 - f4, f6, f5, f6 + f4);
        rectF3.offset(f2, -f2);
        RectF rectF4 = this.f73755OooOooo;
        float f7 = rectF2.left;
        float f8 = rectF2.bottom;
        rectF4.set(f7, f8 - f4, f7 + f4, f8);
        rectF4.offset(-f2, f2);
        RectF rectF5 = this.f73757Oooo000;
        float f9 = rectF2.right;
        float f10 = rectF2.bottom;
        rectF5.set(f9 - f4, f10 - f4, f9, f10);
        rectF5.offset(f2, f2);
    }

    @Override // com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView
    public RectF getCroppedBounds() {
        float fHeight;
        RectF rectF = this.f73747OooOo;
        if (rectF == null) {
            OooOOO0.OooOOOO("originImageBounds");
            throw null;
        }
        float fWidth = rectF.width();
        RectF rectF2 = this.f73747OooOo;
        if (rectF2 == null) {
            OooOOO0.OooOOOO("originImageBounds");
            throw null;
        }
        float fHeight2 = fWidth / rectF2.height();
        int i = fHeight2 > 1.0f ? this.f73750OooOoO0 : this.f73749OooOoO;
        if (fHeight2 > 1.0f) {
            RectF rectF3 = this.f73747OooOo;
            if (rectF3 == null) {
                OooOOO0.OooOOOO("originImageBounds");
                throw null;
            }
            fHeight = rectF3.width();
        } else {
            RectF rectF4 = this.f73747OooOo;
            if (rectF4 == null) {
                OooOOO0.OooOOOO("originImageBounds");
                throw null;
            }
            fHeight = rectF4.height();
        }
        float f = fHeight / i;
        RectF rectF5 = new RectF(this.f73758Oooo00O);
        float f2 = f73746Oooo0oo;
        rectF5.offset(-f2, -f2);
        OooO0O0.OooOO0O(rectF5, f);
        return rectF5;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView
    public Bitmap getCroppedImage() {
        int height;
        Bitmap bitmap = this.f73748OooOo0o;
        if (bitmap == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        float width = bitmap.getWidth();
        if (this.f73748OooOo0o == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        float height2 = width / r3.getHeight();
        int i = height2 > 1.0f ? this.f73750OooOoO0 : this.f73749OooOoO;
        if (height2 > 1.0f) {
            Bitmap bitmap2 = this.f73748OooOo0o;
            if (bitmap2 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            height = bitmap2.getWidth();
        } else {
            Bitmap bitmap3 = this.f73748OooOo0o;
            if (bitmap3 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            height = bitmap3.getHeight();
        }
        float f = height / i;
        RectF rectF = new RectF(this.f73758Oooo00O);
        float f2 = -f73746Oooo0oo;
        rectF.offset(f2, f2);
        OooO0O0.OooOO0O(rectF, f);
        try {
            Bitmap bitmap4 = this.f73748OooOo0o;
            if (bitmap4 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            int i2 = (int) rectF.left;
            int i3 = (int) rectF.top;
            int iWidth = (int) rectF.width();
            Bitmap bitmap5 = this.f73748OooOo0o;
            if (bitmap5 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            int width2 = bitmap5.getWidth();
            if (iWidth > width2) {
                iWidth = width2;
            }
            int iHeight = (int) rectF.height();
            Bitmap bitmap6 = this.f73748OooOo0o;
            if (bitmap6 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            int height3 = bitmap6.getHeight();
            if (iHeight > height3) {
                iHeight = height3;
            }
            return Bitmap.createBitmap(bitmap4, i2, i3, iWidth, iHeight);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ImageRectCropView");
            c20358OooO00o.OooO0Oo(e, "getCroppedImage failed.", new Object[0]);
            return null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        Bitmap bitmap = this.f73748OooOo0o;
        if (bitmap == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.f73748OooOo0o;
        if (bitmap2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        int height = bitmap2.getHeight();
        Rect rect = this.f73751OooOoOO;
        rect.set(0, 0, width, height);
        float f = f73746Oooo0oo;
        RectF rectF = new RectF(f + 0.0f, 0.0f + f, getWidth() - f, getHeight() - f);
        Bitmap bitmap3 = this.f73748OooOo0o;
        if (bitmap3 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        canvas.drawBitmap(bitmap3, rect, rectF, (Paint) null);
        Canvas canvas2 = this.f73762Oooo0o0;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Canvas canvas3 = this.f73762Oooo0o0;
        if (canvas3 != null) {
            canvas3.drawColor(Color.parseColor("#66000000"));
        }
        RectF rectF2 = new RectF(this.f73758Oooo00O);
        rectF2.offset(-f, -f);
        Canvas canvas4 = this.f73762Oooo0o0;
        if (canvas4 != null) {
            canvas4.drawRect(rectF2, this.f73760Oooo0O0);
        }
        Bitmap bitmap4 = this.f73761Oooo0OO;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, f, f, (Paint) null);
        }
        Path path = new Path();
        float f2 = f / 2.0f;
        RectF rectF3 = this.f73752OooOoo;
        path.moveTo(rectF3.left + f2, rectF3.top);
        path.lineTo(rectF3.left + f2, rectF3.bottom);
        path.moveTo(rectF3.left, rectF3.top + f2);
        path.lineTo(rectF3.right, rectF3.top + f2);
        Paint paint = this.f73756Oooo0;
        canvas.drawPath(path, paint);
        Path path2 = new Path();
        float f3 = f / 2.0f;
        RectF rectF4 = this.f73754OooOooO;
        path2.moveTo(rectF4.right, rectF4.top + f3);
        path2.lineTo(rectF4.left, rectF4.top + f3);
        path2.moveTo(rectF4.right - f3, rectF4.top);
        path2.lineTo(rectF4.right - f3, rectF4.bottom);
        canvas.drawPath(path2, paint);
        Path path3 = new Path();
        float f4 = f / 2.0f;
        RectF rectF5 = this.f73757Oooo000;
        path3.moveTo(rectF5.right - f4, rectF5.top);
        path3.lineTo(rectF5.right - f4, rectF5.bottom);
        path3.moveTo(rectF5.left, rectF5.bottom - f4);
        path3.lineTo(rectF5.right, rectF5.bottom - f4);
        canvas.drawPath(path3, paint);
        Path path4 = new Path();
        float f5 = f / 2.0f;
        RectF rectF6 = this.f73755OooOooo;
        path4.moveTo(rectF6.left + f5, rectF6.top);
        path4.lineTo(rectF6.left + f5, rectF6.bottom);
        path4.moveTo(rectF6.left, rectF6.bottom - f5);
        path4.lineTo(rectF6.right, rectF6.bottom - f5);
        canvas.drawPath(path4, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f73752OooOoo;
        float f = f73745Oooo0oO;
        rectF.set(0.0f, 0.0f, f, f);
        RectF rectF2 = this.f73754OooOooO;
        float f2 = f73744Oooo0o;
        rectF2.set(width - f2, 0.0f, width, f);
        this.f73757Oooo000.set(width - f2, height - f, width, height);
        this.f73755OooOooo.set(0.0f, height - f, f, height);
        RectF rectF3 = this.f73758Oooo00O;
        float f3 = 0;
        float f4 = f73746Oooo0oo;
        rectF3.set(f3 + f4, f3 + f4, getWidth() - f4, getHeight() - f4);
        float f5 = 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (width - (f5 * f4)), (int) (height - (f5 * f4)), Bitmap.Config.ARGB_8888);
        this.f73762Oooo0o0 = new Canvas(bitmapCreateBitmap);
        this.f73761Oooo0OO = bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[PHI: r1 r15 r17
      0x007e: PHI (r1v43 float) = (r1v25 float), (r1v69 float) binds: [B:79:0x015d, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r15v24 float) = (r15v8 float), (r15v26 float) binds: [B:79:0x015d, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r17v6 boolean) = (r17v5 boolean), (r17v11 boolean) binds: [B:79:0x015d, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent event) {
        boolean z;
        Object next;
        float width;
        float f;
        float f2;
        OooOOO0.OooO0oO(event, "event");
        int action = event.getAction();
        float f3 = f73745Oooo0oO;
        RectF rectF = this.f73755OooOooo;
        RectF rectF2 = this.f73757Oooo000;
        RectF rectF3 = this.f73754OooOooO;
        RectF rectF4 = this.f73752OooOoo;
        PointF pointF = this.f73753OooOoo0;
        if (action == 0) {
            z = true;
            float x = event.getX();
            float y = event.getY();
            RectF rectF5 = new RectF(rectF4);
            rectF5.right += f3;
            rectF5.bottom += f3;
            RectF rectF6 = new RectF(rectF3);
            rectF6.left -= f3;
            rectF6.bottom += f3;
            RectF rectF7 = new RectF(rectF);
            rectF7.top -= f3;
            rectF7.right += f3;
            RectF rectF8 = new RectF(rectF2);
            rectF8.top -= f3;
            rectF8.left -= f3;
            Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(rectF5, rectF4), new C32443OooOOO(rectF6, rectF3), new C32443OooOOO(rectF7, rectF), new C32443OooOOO(rectF8, rectF2));
            Iterator it = C34429OooOOo0.OooOO0o(rectF5, rectF6, rectF7, rectF8).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((RectF) next).contains(x, y)) {
                    break;
                }
            }
            RectF rectF9 = (RectF) next;
            this.f73759Oooo00o = rectF9 != null ? (RectF) mapOooO0oo.get(rectF9) : null;
            pointF.set(event.getX(), event.getY());
        } else if (action == 1) {
            z = true;
            this.f73759Oooo00o = null;
        } else if (action != 2) {
            z = true;
        } else {
            float x2 = event.getX() - pointF.x;
            float y2 = event.getY() - pointF.y;
            RectF rectF10 = this.f73759Oooo00o;
            float f4 = f73746Oooo0oo;
            RectF rectF11 = this.f73758Oooo00O;
            if (rectF10 == null) {
                z = true;
                float f5 = rectF11.left;
                float width2 = f5 + x2 < f4 ? f4 - f5 : x2;
                float f6 = rectF11.top;
                float height = f6 + y2 < f4 ? f4 - f6 : y2;
                if (rectF11.right + x2 > getWidth() - f4) {
                    width2 = (getWidth() - f4) - rectF11.right;
                }
                if (rectF11.bottom + y2 > getHeight() - f4) {
                    height = (getHeight() - f4) - rectF11.bottom;
                }
                rectF11.offset(width2, height);
                OooO0O0();
            } else if (OooOOO0.OooO0O0(rectF10, rectF4)) {
                float f7 = rectF10.left;
                if (f7 + x2 < 0.0f) {
                    z = true;
                    f2 = 0 - f7;
                } else {
                    z = true;
                    f2 = x2;
                }
                float f8 = rectF10.top;
                f = f8 + y2 < 0.0f ? 0 - f8 : y2;
                float f9 = rectF10.right;
                float f10 = x2 + f9;
                float f11 = rectF11.right - f3;
                width = f10 > f11 ? f11 - f9 : f2;
                float f12 = rectF10.bottom;
                float f13 = y2 + f12;
                float f14 = rectF11.bottom - f3;
                y2 = f13 > f14 ? f14 - f12 : f;
                rectF10.offset(width, y2);
                if (!OooOOO0.OooO0O0(rectF10, rectF4)) {
                    rectF11.left = rectF10.left + f4;
                    rectF11.top = rectF10.top + f4;
                } else if (OooOOO0.OooO0O0(rectF10, rectF3)) {
                    rectF11.right = rectF10.right - f4;
                    rectF11.top = rectF10.top + f4;
                } else if (OooOOO0.OooO0O0(rectF10, rectF2)) {
                    rectF11.right = rectF10.right - f4;
                    rectF11.bottom = rectF10.bottom - f4;
                } else if (OooOOO0.OooO0O0(rectF10, rectF)) {
                    rectF11.left = rectF10.left + f4;
                    rectF11.bottom = rectF10.bottom - f4;
                }
                OooO0O0();
            } else {
                z = true;
                if (OooOOO0.OooO0O0(rectF10, rectF3)) {
                    float f15 = rectF10.left;
                    float f16 = f15 + x2;
                    float f17 = rectF11.left + f3;
                    float f18 = f16 < f17 ? f17 - f15 : x2;
                    float f19 = rectF10.top;
                    float f20 = f19 + y2 < 0.0f ? 0 - f19 : y2;
                    width = rectF10.right + x2 > ((float) getWidth()) ? getWidth() - rectF10.right : f18;
                    float f21 = rectF10.bottom;
                    float f22 = y2 + f21;
                    float f23 = rectF11.bottom - f3;
                    y2 = f22 > f23 ? f23 - f21 : f20;
                } else if (OooOOO0.OooO0O0(rectF10, rectF2)) {
                    float f24 = rectF10.left;
                    float f25 = f24 + x2;
                    float f26 = rectF11.left + f3;
                    float width3 = f25 < f26 ? f26 - f24 : x2;
                    float f27 = rectF10.top;
                    float f28 = f27 + y2;
                    float f29 = rectF11.top + f3;
                    float f30 = f28 < f29 ? f29 - f27 : y2;
                    if (rectF10.right + x2 > getWidth()) {
                        width3 = getWidth() - rectF10.right;
                    }
                    y2 = rectF10.bottom + y2 > ((float) getHeight()) ? getHeight() - rectF10.bottom : f30;
                    width = width3;
                } else if (OooOOO0.OooO0O0(rectF10, rectF)) {
                    float f31 = rectF10.left;
                    float f32 = f31 + x2 < 0.0f ? 0 - f31 : x2;
                    float f33 = rectF10.top;
                    float f34 = f33 + y2;
                    float f35 = rectF11.top + f3;
                    f = f34 < f35 ? f35 - f33 : y2;
                    float f36 = rectF10.right;
                    float f37 = f36 + x2;
                    float f38 = rectF11.right - f3;
                    width = f37 > f38 ? f38 - f36 : f32;
                    if (rectF10.bottom + y2 > getHeight()) {
                        y2 = getHeight() - rectF10.bottom;
                    }
                } else {
                    width = x2;
                }
                rectF10.offset(width, y2);
                if (!OooOOO0.OooO0O0(rectF10, rectF4)) {
                }
                OooO0O0();
            }
            pointF.set(event.getX(), event.getY());
        }
        invalidate();
        return z;
    }
}
