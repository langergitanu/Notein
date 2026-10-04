package com.orion.notein.p607ui.noteeditor.addimage;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.internal.view.SupportMenu;
import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00OO0O0.OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addimage/ImageCustomCropView;", "Lcom/orion/notein/ui/noteeditor/addimage/AbstractImageCropView;", "Landroid/graphics/RectF;", "getCroppedRect", "()Landroid/graphics/RectF;", "Landroid/graphics/Bitmap;", "getCroppedImage", "()Landroid/graphics/Bitmap;", "getCroppedBounds", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageCustomCropView extends AbstractImageCropView {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final float f73702Oooo0 = o000000O.OooO0o0(0.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public RectF f73703OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Bitmap f73704OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f73705OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f73706OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Rect f73707OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Path f73708OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Path f73709OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ArrayList f73710OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Paint f73711OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Paint f73712Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Bitmap f73713Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public Canvas f73714Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCustomCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f73706OooOoO0 = StyleIdentifier.LIST_TABLE_2_ACCENT_5;
        this.f73705OooOoO = StyleIdentifier.LIST_TABLE_2_ACCENT_5;
        this.f73707OooOoOO = new Rect();
        this.f73709OooOoo0 = new Path();
        this.f73708OooOoo = new Path();
        this.f73710OooOooO = new ArrayList();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#007AFF"));
        paint.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(4.0f), o000000O.OooO0o0(4.0f)}, 0.0f));
        paint.setStrokeWidth(o000000O.OooO0o0(1.5f));
        this.f73711OooOooo = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f73712Oooo000 = paint2;
    }

    private final RectF getCroppedRect() {
        ArrayList arrayList = this.f73710OooOooO;
        if (arrayList.isEmpty()) {
            return new RectF();
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin = ((PointF) it.next()).x;
        while (it.hasNext()) {
            fMin = Math.min(fMin, ((PointF) it.next()).x);
        }
        if (fMin < 0.0f) {
            fMin = 0.0f;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float fMin2 = ((PointF) it2.next()).y;
        while (it2.hasNext()) {
            fMin2 = Math.min(fMin2, ((PointF) it2.next()).y);
        }
        float f = fMin2 >= 0.0f ? fMin2 : 0.0f;
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float width = ((PointF) it3.next()).x;
        while (it3.hasNext()) {
            width = Math.max(width, ((PointF) it3.next()).x);
        }
        if (width > getWidth() - o000000O.OooO0o(8)) {
            width = getWidth() - o000000O.OooO0o(8);
        }
        Iterator it4 = arrayList.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float height = ((PointF) it4.next()).y;
        while (it4.hasNext()) {
            height = Math.max(height, ((PointF) it4.next()).y);
        }
        if (height > getHeight() - o000000O.OooO0o(8)) {
            height = getHeight() - o000000O.OooO0o(8);
        }
        return new RectF(fMin, f, width, height);
    }

    @Override // com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView
    public final void OooO00o(Bitmap image, RectF originImageBounds, int i, int i2) {
        OooOOO0.OooO0oO(image, "image");
        OooOOO0.OooO0oO(originImageBounds, "originImageBounds");
        this.f73704OooOo0o = image;
        this.f73703OooOo = originImageBounds;
        this.f73706OooOoO0 = i;
        this.f73705OooOoO = i2;
        this.f73710OooOooO.clear();
        this.f73708OooOoo.reset();
        this.f73709OooOoo0.reset();
    }

    @Override // com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView
    public RectF getCroppedBounds() {
        float fHeight;
        if (this.f73710OooOooO.isEmpty()) {
            return new RectF();
        }
        RectF rectF = this.f73703OooOo;
        if (rectF == null) {
            OooOOO0.OooOOOO("originImageBounds");
            throw null;
        }
        float fWidth = rectF.width();
        RectF rectF2 = this.f73703OooOo;
        if (rectF2 == null) {
            OooOOO0.OooOOOO("originImageBounds");
            throw null;
        }
        float fHeight2 = fWidth / rectF2.height();
        int i = fHeight2 > 1.0f ? this.f73706OooOoO0 : this.f73705OooOoO;
        if (fHeight2 > 1.0f) {
            RectF rectF3 = this.f73703OooOo;
            if (rectF3 == null) {
                OooOOO0.OooOOOO("originImageBounds");
                throw null;
            }
            fHeight = rectF3.width();
        } else {
            RectF rectF4 = this.f73703OooOo;
            if (rectF4 == null) {
                OooOOO0.OooOOOO("originImageBounds");
                throw null;
            }
            fHeight = rectF4.height();
        }
        float f = fHeight / i;
        RectF croppedRect = getCroppedRect();
        OooO0O0.OooOO0O(croppedRect, f);
        return croppedRect;
    }

    @Override // com.orion.notein.p607ui.noteeditor.addimage.AbstractImageCropView
    public Bitmap getCroppedImage() {
        int height;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap;
        RectF croppedRect = getCroppedRect();
        Bitmap bitmap2 = this.f73704OooOo0o;
        if (bitmap2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        float width = bitmap2.getWidth();
        if (this.f73704OooOo0o == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        float height2 = width / r4.getHeight();
        int i = height2 > 1.0f ? this.f73706OooOoO0 : this.f73705OooOoO;
        if (height2 > 1.0f) {
            Bitmap bitmap3 = this.f73704OooOo0o;
            if (bitmap3 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            height = bitmap3.getWidth();
        } else {
            Bitmap bitmap4 = this.f73704OooOo0o;
            if (bitmap4 == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            height = bitmap4.getHeight();
        }
        float f = height / i;
        RectF rectF = new RectF(croppedRect);
        OooO0O0.OooOO0O(rectF, f);
        try {
            bitmap = this.f73704OooOo0o;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ImageCustomCropView");
            c20358OooO00o.OooO0Oo(e, "getCroppedImage failed.", new Object[0]);
            bitmapCreateBitmap = null;
        }
        if (bitmap == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) rectF.height());
        if (bitmapCreateBitmap == null) {
            return null;
        }
        Path path = new Path(this.f73708OooOoo);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-croppedRect.left, -croppedRect.top);
        matrix.postScale(f, f);
        path.transform(matrix);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawPath(path, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        OooOOO0.OooO0oO(canvas, "canvas");
        Bitmap bitmap = this.f73704OooOo0o;
        if (bitmap == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        int width = bitmap.getWidth();
        Bitmap bitmap2 = this.f73704OooOo0o;
        if (bitmap2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        int height = bitmap2.getHeight();
        Rect rect = this.f73707OooOoOO;
        rect.set(0, 0, width, height);
        float f = f73702Oooo0;
        RectF rectF = new RectF(f + 0.0f, 0.0f + f, getWidth() - f, getHeight() - f);
        Bitmap bitmap3 = this.f73704OooOo0o;
        if (bitmap3 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        canvas.drawBitmap(bitmap3, rect, rectF, (Paint) null);
        Canvas canvas3 = this.f73714Oooo00o;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        Canvas canvas4 = this.f73714Oooo00o;
        if (canvas4 != null) {
            canvas4.drawColor(Color.parseColor("#33000000"));
        }
        canvas.drawPath(this.f73709OooOoo0, this.f73711OooOooo);
        Path path = this.f73708OooOoo;
        if (!path.isEmpty() && (canvas2 = this.f73714Oooo00o) != null) {
            canvas2.drawPath(path, this.f73712Oooo000);
        }
        Bitmap bitmap4 = this.f73713Oooo00O;
        if (bitmap4 != null) {
            canvas.drawBitmap(bitmap4, f, f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float width = getWidth();
        float height = getHeight();
        float f = 2;
        float f2 = f73702Oooo0;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (width - (f * f2)), (int) (height - (f * f2)), Bitmap.Config.ARGB_8888);
        this.f73714Oooo00o = new Canvas(bitmapCreateBitmap);
        this.f73713Oooo00O = bitmapCreateBitmap;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        int action = event.getAction();
        Path path = this.f73708OooOoo;
        ArrayList arrayList = this.f73710OooOooO;
        Path path2 = this.f73709OooOoo0;
        if (action == 0) {
            path2.reset();
            arrayList.clear();
            path.reset();
            path2.moveTo(event.getX(), event.getY());
            arrayList.add(new PointF(event.getX(), event.getY()));
        } else if (action == 1) {
            path2.lineTo(event.getX(), event.getY());
            arrayList.add(new PointF(event.getX(), event.getY()));
            PointF pointF = (PointF) arrayList.get(0);
            path2.lineTo(pointF.x, pointF.y);
            path.reset();
            path.set(path2);
        } else if (action == 2) {
            path2.lineTo(event.getX(), event.getY());
            arrayList.add(new PointF(event.getX(), event.getY()));
        }
        invalidate();
        return true;
    }
}
