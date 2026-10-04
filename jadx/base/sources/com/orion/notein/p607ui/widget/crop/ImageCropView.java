package com.orion.notein.p607ui.widget.crop;

import OooOoO.C20503OooO00o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OoO000.C28597o00oO0o;
import o0Ooo0oo.C29473Oooo00o;
import o0o00ooo.C30144OooO0OO;
import o0oOoo.C31108OooO0o;
import o0oOoo.C31111OooO0oo;
import o0oOoo.EnumC31104OooO00o;
import o0oOoo.EnumC31105OooO0O0;
import o0oOooO.C31148OooO00o;
import o0oOooOo.C31161OooO0O0;
import o0oOooOo.C31163OooO0Oo;
import o0oOooo0.AbstractC31169OooO0OO;
import o0oOooo0.C31168OooO0O0;
import o0oOooo0.EnumC31167OooO00o;
import o0oOooo0.EnumC31170OooO0Oo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.OooOOO;
import oo0oO0.C34805o000oo00;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0006R*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006-"}, m80612d2 = {"Lcom/orion/notein/ui/widget/crop/ImageCropView;", "Landroid/view/View;", "Landroid/graphics/Bitmap;", "bitmap", "LoO00ooO/OooOooO;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "", "colorInt", "setTheme", "(I)V", "", "path", "setImage", "(Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "(Landroid/net/Uri;)V", "Lo0oOooo0/OooO0O0;", "getCroppedData", "()Lo0oOooo0/OooO0O0;", "Lo0oOoo/OooO0O0;", "aspectRatio", "setAspectRatio", "(Lo0oOoo/OooO0O0;)V", "Landroid/graphics/RectF;", "getCropSizeOriginal", "()Landroid/graphics/RectF;", "setBitmapInternal", "Lkotlin/Function0;", "OooOo0o", "LoO0O000o/OooO00o;", "getOnInitialized", "()LoO0O000o/OooO00o;", "setOnInitialized", "(LoO0O000o/OooO00o;)V", "onInitialized", "Lkotlin/Function1;", "OooOo", "LoO0O000o/OooOO0o;", "getObserveCropRectOnOriginalBitmapChanged", "()LoO0O000o/OooOO0o;", "setObserveCropRectOnOriginalBitmapChanged", "(LoO0O000o/OooOO0o;)V", "observeCropRectOnOriginalBitmapChanged", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImageCropView extends View {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f80139OooooO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super RectF, C32460OooOooO> observeCropRectOnOriginalBitmapChanged;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public oO0O000o.OooO00o<C32460OooOooO> onInitialized;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f80142OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Matrix f80143OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AnimatableRectF f80144OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RectF f80145OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final AnimatableRectF f80146OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f80147OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final RectF f80148OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public AbstractC31169OooO0OO f80149Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f80150Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final RectF f80151Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final RectF f80152Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f80153Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public Bitmap f80154Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Matrix f80155Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f80156Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Paint f80157Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public EnumC31105OooO0O0 f80158Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public EnumC31104OooO00o f80159Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Paint f80160OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Matrix f80161OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float[] f80162OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float f80163OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final float f80164OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final float f80165OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Paint f80166OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final int f80167OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Bitmap f80168OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f80169OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final C31108OooO0o f80170Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO0O0 f80171Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final float f80172o000oOoO;

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f80173OooO00o;

        static {
            int[] iArr = new int[EnumC31105OooO0O0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f80173OooO00o = iArr;
            int[] iArr2 = new int[EnumC31167OooO00o.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC31167OooO00o enumC31167OooO00o = EnumC31167OooO00o.f111178OooOo0o;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC31167OooO00o enumC31167OooO00o2 = EnumC31167OooO00o.f111178OooOo0o;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC31167OooO00o enumC31167OooO00o3 = EnumC31167OooO00o.f111178OooOo0o;
                iArr2[4] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[EnumC31104OooO00o.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EnumC31104OooO00o enumC31104OooO00o = EnumC31104OooO00o.f111002OooOo0o;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[EnumC31170OooO0Oo.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                EnumC31170OooO0Oo enumC31170OooO0Oo = EnumC31170OooO0Oo.f111189OooOo0o;
                iArr4[2] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                EnumC31170OooO0Oo enumC31170OooO0Oo2 = EnumC31170OooO0Oo.f111189OooOo0o;
                iArr4[3] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                EnumC31170OooO0Oo enumC31170OooO0Oo3 = EnumC31170OooO0Oo.f111189OooOo0o;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final class OooO0O0 extends AsyncTask<Uri, Integer, Bitmap> {
        public OooO0O0() {
        }

        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(Uri[] uriArr) {
            Uri[] params = uriArr;
            OooOOO0.OooO0oO(params, "params");
            Uri uri = (Uri) OooOOO.OooOoo(params);
            if (uri == null) {
                return null;
            }
            try {
                Context applicationContext = ImageCropView.this.getContext().getApplicationContext();
                OooOOO0.OooO0o(applicationContext, "getApplicationContext(...)");
                return C31148OooO00o.OooO00o(applicationContext, uri).f111141OooO00o;
            } catch (Exception e) {
                Log.e("ImageCropView", "Bitmap resize : " + e);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            super.onPostExecute(bitmap2);
            if (bitmap2 != null) {
                ImageCropView.this.setBitmap(bitmap2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f80143OooOoO0 = new Matrix();
        this.f80142OooOoO = getResources().getDimensionPixelSize(R.dimen.img_crop_view_touch_threshold);
        this.f80144OooOoOO = new AnimatableRectF();
        this.f80146OooOoo0 = new AnimatableRectF();
        this.f80145OooOoo = new RectF();
        this.f80147OooOooO = new RectF();
        this.f80148OooOooo = new RectF();
        this.f80151Oooo000 = new RectF();
        this.f80152Oooo00O = new RectF();
        this.f80155Oooo0OO = new Matrix();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f80157Oooo0o0 = paint;
        this.f80156Oooo0o = getResources().getDimensionPixelSize(R.dimen.img_crop_view_margin_max_crop_rect);
        this.f80158Oooo0oO = EnumC31105OooO0O0.f111005OooOoO0;
        this.f80159Oooo0oo = EnumC31104OooO00o.f111002OooOo0o;
        this.f80149Oooo = AbstractC31169OooO0OO.OooO0Oo.f111187OooO00o;
        this.f80162OoooO00 = new float[2];
        this.f80161OoooO0 = new Matrix();
        float dimension = getResources().getDimension(R.dimen.img_crop_view_grid_line_width);
        this.f80163OoooO0O = dimension;
        Paint paint2 = new Paint();
        paint2.setColor(getResources().getColor(R.color.gray_light));
        paint2.setStrokeWidth(dimension);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f80160OoooO = paint2;
        float dimension2 = getResources().getDimension(R.dimen.img_crop_view_corner_toggle_width);
        this.f80164OoooOO0 = dimension2;
        this.f80172o000oOoO = getResources().getDimension(R.dimen.img_crop_view_corner_toggle_length);
        this.f80165OoooOOO = getResources().getDimension(R.dimen.img_crop_view_min_rect);
        Paint paint3 = new Paint();
        paint3.setColor(ContextCompat.getColor(context, R.color.gray_light));
        paint3.setStrokeWidth(dimension2);
        paint3.setStyle(style);
        this.f80166OoooOOo = paint3;
        this.f80167OoooOo0 = ContextCompat.getColor(context, R.color.img_crop_view_color_crop_alpha);
        this.f80170Ooooo00 = new C31108OooO0o(context, new C31111OooO0oo(this));
        setWillNotDraw(false);
        setLayerType(2, null);
        setBackgroundColor(ContextCompat.getColor(context, R.color.notein_backgrounds_grouped_tertiary_elevated));
    }

    public static void OooO00o(ImageCropView imageCropView, Bitmap bitmap) {
        if (imageCropView.getWidth() == 0 || imageCropView.getHeight() == 0) {
            return;
        }
        imageCropView.setBitmapInternal(bitmap);
    }

    public static final boolean OooO0O0(ImageCropView imageCropView, float f) {
        Matrix matrixOooO0O0 = C31161OooO0O0.OooO0O0(imageCropView.f80155Oooo0OO);
        matrixOooO0O0.preScale(f, f);
        Matrix matrix = new Matrix();
        matrixOooO0O0.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, imageCropView.f80144OooOoOO);
        return Math.min(rectF.width(), rectF.height()) <= imageCropView.f80145OooOoo.width();
    }

    private final void setBitmapInternal(Bitmap bitmap) {
        this.f80154Oooo0O0 = bitmap;
        RectF rectF = this.f80151Oooo000;
        rectF.set(0.0f, 0.0f, bitmap != null ? bitmap.getWidth() : 0.0f, this.f80154Oooo0O0 != null ? r2.getHeight() : 0.0f);
        float fMax = Math.max(rectF.width(), rectF.height()) / 15.0f;
        this.f80145OooOoo.set(0.0f, 0.0f, fMax, fMax);
        OooO0Oo();
        requestLayout();
        invalidate();
    }

    public final void OooO0OO(Canvas canvas) {
        Paint paint = this.f80166OoooOOo;
        AnimatableRectF animatableRectF = this.f80144OooOoOO;
        float f = ((RectF) animatableRectF).left;
        float f2 = this.f80163OoooO0O;
        float f3 = ((RectF) animatableRectF).top;
        float f4 = this.f80164OoooOO0;
        float f5 = ((f4 / 2.0f) + f3) - f2;
        float f6 = this.f80172o000oOoO;
        canvas.drawLine(f - f2, f5, f + f6, f5, paint);
        float f7 = ((f4 / 2.0f) + ((RectF) animatableRectF).left) - f2;
        float f8 = ((RectF) animatableRectF).top;
        canvas.drawLine(f7, f8 - f2, f7, f8 + f6, paint);
        float f9 = ((RectF) animatableRectF).right;
        float f10 = ((f4 / 2.0f) + ((RectF) animatableRectF).top) - f2;
        canvas.drawLine(f9 - f6, f10, f9 + f2, f10, paint);
        float f11 = (((RectF) animatableRectF).right - (f4 / 2.0f)) + f2;
        float f12 = ((RectF) animatableRectF).top;
        canvas.drawLine(f11, f12 - f2, f11, f12 + f6, paint);
        float f13 = ((RectF) animatableRectF).left;
        float f14 = (((RectF) animatableRectF).bottom - (f4 / 2.0f)) + f2;
        canvas.drawLine(f13 - f2, f14, f13 + f6, f14, paint);
        float f15 = ((f4 / 2.0f) + ((RectF) animatableRectF).left) - f2;
        float f16 = ((RectF) animatableRectF).bottom;
        canvas.drawLine(f15, f16 + f2, f15, f16 - f6, paint);
        float f17 = ((RectF) animatableRectF).right;
        float f18 = (((RectF) animatableRectF).bottom - (f4 / 2.0f)) + f2;
        canvas.drawLine(f17 - f6, f18, f17 + f2, f18, paint);
        float f19 = (((RectF) animatableRectF).right - (f4 / 2.0f)) + f2;
        float f20 = ((RectF) animatableRectF).bottom;
        canvas.drawLine(f19, f20 + f2, f19, f20 - f6, paint);
    }

    public final void OooO0Oo() {
        float measuredWidth = getMeasuredWidth();
        float f = 2;
        float f2 = this.f80156Oooo0o;
        this.f80153Oooo00o = measuredWidth - (f2 * f);
        this.f80150Oooo0 = getMeasuredHeight() - (f * f2);
        this.f80152Oooo00O.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f80168OoooOoO = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap = this.f80168OoooOoO;
        OooOOO0.OooO0Oo(bitmap);
        new Canvas(bitmap);
        float f3 = this.f80153Oooo00o;
        RectF rectF = this.f80151Oooo000;
        float fMin = Math.min(f3 / rectF.width(), this.f80150Oooo0 / rectF.height());
        Matrix matrix = this.f80155Oooo0OO;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate(((this.f80153Oooo00o - (rectF.width() * fMin)) / 2.0f) + f2, ((this.f80150Oooo0 - (rectF.height() * fMin)) / 2.0f) + f2);
        matrix.mapRect(this.f80144OooOoOO, new RectF(0.0f, 0.0f, rectF.width(), rectF.height()));
        setAspectRatio(EnumC31105OooO0O0.f111004OooOoO);
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.onInitialized;
        if (oooO00o != null) {
            oooO00o.invoke();
        }
        invalidate();
    }

    public final void OooO0o() {
        AnimatableRectF animatableRectF = this.f80144OooOoOO;
        float f = ((RectF) animatableRectF).left;
        RectF rectF = this.f80148OooOooo;
        float f2 = rectF.left;
        if (f < f2) {
            ((RectF) animatableRectF).left = f2;
        }
        float f3 = ((RectF) animatableRectF).top;
        float f4 = rectF.top;
        if (f3 < f4) {
            ((RectF) animatableRectF).top = f4;
        }
        float f5 = ((RectF) animatableRectF).right;
        float f6 = rectF.right;
        if (f5 > f6) {
            ((RectF) animatableRectF).right = f6;
        }
        float f7 = ((RectF) animatableRectF).bottom;
        float f8 = rectF.bottom;
        if (f7 > f8) {
            ((RectF) animatableRectF).bottom = f8;
        }
    }

    public final void OooO0o0() {
        InterfaceC32507OooOO0o<? super RectF, C32460OooOooO> interfaceC32507OooOO0o = this.observeCropRectOnOriginalBitmapChanged;
        if (interfaceC32507OooOO0o != null) {
            interfaceC32507OooOO0o.invoke(getCropSizeOriginal());
        }
    }

    public final void OooO0oO() {
        AnimatableRectF animatableRectF = this.f80144OooOoOO;
        float f = ((RectF) animatableRectF).left;
        RectF rectF = this.f80147OooOooO;
        float f2 = rectF.left;
        if (f > f2) {
            ((RectF) animatableRectF).left = f2;
        }
        float f3 = ((RectF) animatableRectF).top;
        float f4 = rectF.top;
        if (f3 > f4) {
            ((RectF) animatableRectF).top = f4;
        }
        float f5 = ((RectF) animatableRectF).right;
        float f6 = rectF.right;
        if (f5 < f6) {
            ((RectF) animatableRectF).right = f6;
        }
        float f7 = ((RectF) animatableRectF).bottom;
        float f8 = rectF.bottom;
        if (f7 < f8) {
            ((RectF) animatableRectF).bottom = f8;
        }
    }

    public final RectF getCropSizeOriginal() {
        RectF rectF = new RectF();
        Matrix matrix = this.f80143OooOoO0;
        matrix.reset();
        this.f80155Oooo0OO.invert(matrix);
        matrix.mapRect(rectF, this.f80144OooOoOO);
        return rectF;
    }

    public final C31168OooO0O0 getCroppedData() {
        RectF cropSizeOriginal = getCropSizeOriginal();
        RectF rectF = this.f80151Oooo000;
        if (!rectF.intersect(cropSizeOriginal)) {
            return new C31168OooO0O0(this.f80154Oooo0O0);
        }
        float fOooO0O0 = oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.left);
        float f = rectF.left;
        int iOooO0O0 = fOooO0O0 < f ? (int) f : oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.left);
        float fOooO0O02 = oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.top);
        float f2 = rectF.top;
        int iOooO0O02 = fOooO0O02 < f2 ? (int) f2 : oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.top);
        float fOooO0O03 = oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.right);
        float f3 = rectF.right;
        int iOooO0O03 = fOooO0O03 > f3 ? (int) f3 : oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.right);
        float fOooO0O04 = oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.bottom);
        float f4 = rectF.bottom;
        int iOooO0O04 = fOooO0O04 > f4 ? (int) f4 : oO0O00O.OooO00o.OooO0O0(cropSizeOriginal.bottom);
        Bitmap bitmap = this.f80154Oooo0O0;
        if (bitmap == null) {
            throw new IllegalStateException("Bitmap is null.");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, iOooO0O0, iOooO0O02, iOooO0O03 - iOooO0O0, iOooO0O04 - iOooO0O02);
        OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        return new C31168OooO0O0(bitmapCreateBitmap);
    }

    public final InterfaceC32507OooOO0o<RectF, C32460OooOooO> getObserveCropRectOnOriginalBitmapChanged() {
        return this.observeCropRectOnOriginalBitmapChanged;
    }

    public final oO0O000o.OooO00o<C32460OooOooO> getOnInitialized() {
        return this.onInitialized;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        OooO0O0 oooO0O0;
        OooO0O0 oooO0O02 = this.f80171Ooooo0o;
        if (oooO0O02 != null && !oooO0O02.isCancelled() && (oooO0O0 = this.f80171Ooooo0o) != null) {
            oooO0O0.cancel(true);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmap = this.f80154Oooo0O0;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f80155Oooo0OO, this.f80157Oooo0o0);
        }
        boolean z = this.f80169OoooOoo;
        int i = this.f80167OoooOo0;
        AnimatableRectF animatableRectF = this.f80144OooOoOO;
        if (z) {
            canvas.save();
            float fWidth = animatableRectF.width() / 2;
            float f = ((RectF) animatableRectF).left + fWidth;
            float f2 = ((RectF) animatableRectF).top + fWidth;
            Path path = new Path();
            path.addCircle(f, f2, fWidth, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawColor(i);
            canvas.restore();
            OooO0OO(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(animatableRectF, Region.Op.DIFFERENCE);
        canvas.drawColor(i);
        canvas.restore();
        Log.d("ImageCropView", animatableRectF.toString());
        Paint paint = this.f80160OoooO;
        canvas.drawRect(animatableRectF, paint);
        canvas.drawLine((animatableRectF.width() / 3.0f) + ((RectF) animatableRectF).left, ((RectF) animatableRectF).top, (animatableRectF.width() / 3.0f) + ((RectF) animatableRectF).left, ((RectF) animatableRectF).bottom, paint);
        canvas.drawLine(((animatableRectF.width() * 2.0f) / 3.0f) + ((RectF) animatableRectF).left, ((RectF) animatableRectF).top, ((animatableRectF.width() * 2.0f) / 3.0f) + ((RectF) animatableRectF).left, ((RectF) animatableRectF).bottom, paint);
        canvas.drawLine(((RectF) animatableRectF).left, (animatableRectF.height() / 3.0f) + ((RectF) animatableRectF).top, ((RectF) animatableRectF).right, (animatableRectF.height() / 3.0f) + ((RectF) animatableRectF).top, paint);
        canvas.drawLine(((RectF) animatableRectF).left, ((animatableRectF.height() * 2.0f) / 3.0f) + ((RectF) animatableRectF).top, ((RectF) animatableRectF).right, ((animatableRectF.height() * 2.0f) / 3.0f) + ((RectF) animatableRectF).top, paint);
        OooO0OO(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OooO0Oo();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC31169OooO0OO abstractC31169OooO0OO;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f80148OooOooo;
        RectF rectF2 = this.f80151Oooo000;
        RectF rectF3 = this.f80147OooOooO;
        Matrix matrix = this.f80155Oooo0OO;
        AnimatableRectF animatableRectF = this.f80144OooOoOO;
        if (action == 0) {
            OooOOO0.OooO0oO(animatableRectF, "<this>");
            float y = motionEvent.getY();
            float f = ((RectF) animatableRectF).top;
            float f2 = this.f80142OooOoO;
            EnumC31167OooO00o enumC31167OooO00o = (y > (f + f2) ? 1 : (y == (f + f2) ? 0 : -1)) < 0 && (motionEvent.getY() > (((RectF) animatableRectF).top - f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).top - f2) ? 0 : -1)) > 0 && (motionEvent.getX() > (((RectF) animatableRectF).left + f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).left + f2) ? 0 : -1)) < 0 && (motionEvent.getX() > (((RectF) animatableRectF).left - f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).left - f2) ? 0 : -1)) > 0 ? EnumC31167OooO00o.f111180OooOoO0 : (motionEvent.getY() > (((RectF) animatableRectF).top + f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).top + f2) ? 0 : -1)) < 0 && (motionEvent.getY() > (((RectF) animatableRectF).top - f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).top - f2) ? 0 : -1)) > 0 && (motionEvent.getX() > (((RectF) animatableRectF).right + f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).right + f2) ? 0 : -1)) < 0 && (motionEvent.getX() > (((RectF) animatableRectF).right - f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).right - f2) ? 0 : -1)) > 0 ? EnumC31167OooO00o.f111177OooOo : (motionEvent.getY() > (((RectF) animatableRectF).bottom + f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).bottom + f2) ? 0 : -1)) < 0 && (motionEvent.getY() > (((RectF) animatableRectF).bottom - f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).bottom - f2) ? 0 : -1)) > 0 && (motionEvent.getX() > (((RectF) animatableRectF).left + f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).left + f2) ? 0 : -1)) < 0 && (motionEvent.getX() > (((RectF) animatableRectF).left - f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).left - f2) ? 0 : -1)) > 0 ? EnumC31167OooO00o.f111181OooOoOO : (motionEvent.getY() > (((RectF) animatableRectF).bottom + f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).bottom + f2) ? 0 : -1)) < 0 && (motionEvent.getY() > (((RectF) animatableRectF).bottom - f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).bottom - f2) ? 0 : -1)) > 0 && (motionEvent.getX() > (((RectF) animatableRectF).right + f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).right + f2) ? 0 : -1)) < 0 && (motionEvent.getX() > (((RectF) animatableRectF).right - f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).right - f2) ? 0 : -1)) > 0 ? EnumC31167OooO00o.f111179OooOoO : EnumC31167OooO00o.f111178OooOo0o;
            EnumC31170OooO0Oo enumC31170OooO0Oo = (motionEvent.getX() > (((RectF) animatableRectF).left + f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).left + f2) ? 0 : -1)) < 0 && (motionEvent.getX() > (((RectF) animatableRectF).left - f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).left - f2) ? 0 : -1)) > 0 && (motionEvent.getY() > ((RectF) animatableRectF).top ? 1 : (motionEvent.getY() == ((RectF) animatableRectF).top ? 0 : -1)) > 0 && (motionEvent.getY() > ((RectF) animatableRectF).bottom ? 1 : (motionEvent.getY() == ((RectF) animatableRectF).bottom ? 0 : -1)) < 0 ? EnumC31170OooO0Oo.f111188OooOo : (motionEvent.getX() > (((RectF) animatableRectF).right + f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).right + f2) ? 0 : -1)) < 0 && (motionEvent.getX() > (((RectF) animatableRectF).right - f2) ? 1 : (motionEvent.getX() == (((RectF) animatableRectF).right - f2) ? 0 : -1)) > 0 && (motionEvent.getY() > ((RectF) animatableRectF).top ? 1 : (motionEvent.getY() == ((RectF) animatableRectF).top ? 0 : -1)) > 0 && (motionEvent.getY() > ((RectF) animatableRectF).bottom ? 1 : (motionEvent.getY() == ((RectF) animatableRectF).bottom ? 0 : -1)) < 0 ? EnumC31170OooO0Oo.f111190OooOoO : (motionEvent.getX() > ((RectF) animatableRectF).right ? 1 : (motionEvent.getX() == ((RectF) animatableRectF).right ? 0 : -1)) < 0 && (motionEvent.getX() > ((RectF) animatableRectF).left ? 1 : (motionEvent.getX() == ((RectF) animatableRectF).left ? 0 : -1)) > 0 && (motionEvent.getY() > (((RectF) animatableRectF).top + f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).top + f2) ? 0 : -1)) < 0 && (motionEvent.getY() > (((RectF) animatableRectF).top - f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).top - f2) ? 0 : -1)) > 0 ? EnumC31170OooO0Oo.f111191OooOoO0 : (motionEvent.getX() > ((RectF) animatableRectF).right ? 1 : (motionEvent.getX() == ((RectF) animatableRectF).right ? 0 : -1)) < 0 && (motionEvent.getX() > ((RectF) animatableRectF).left ? 1 : (motionEvent.getX() == ((RectF) animatableRectF).left ? 0 : -1)) > 0 && (motionEvent.getY() > (((RectF) animatableRectF).bottom + f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).bottom + f2) ? 0 : -1)) < 0 && (motionEvent.getY() > (((RectF) animatableRectF).bottom - f2) ? 1 : (motionEvent.getY() == (((RectF) animatableRectF).bottom - f2) ? 0 : -1)) > 0 ? EnumC31170OooO0Oo.f111192OooOoOO : EnumC31170OooO0Oo.f111189OooOo0o;
            if (enumC31167OooO00o != EnumC31167OooO00o.f111178OooOo0o) {
                AbstractC31169OooO0OO.OooO0O0 oooO0O0 = new AbstractC31169OooO0OO.OooO0O0();
                oooO0O0.f111185OooO00o = enumC31167OooO00o;
                abstractC31169OooO0OO = oooO0O0;
            } else if (enumC31170OooO0Oo != EnumC31170OooO0Oo.f111189OooOo0o) {
                AbstractC31169OooO0OO.C20158OooO0OO c20158OooO0OO = new AbstractC31169OooO0OO.C20158OooO0OO();
                c20158OooO0OO.f111186OooO00o = enumC31170OooO0Oo;
                abstractC31169OooO0OO = c20158OooO0OO;
            } else {
                abstractC31169OooO0OO = AbstractC31169OooO0OO.OooO00o.f111184OooO00o;
            }
            this.f80149Oooo = abstractC31169OooO0OO;
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, this.f80145OooOoo);
            float fMax = Math.max(rectF4.width(), this.f80165OoooOOO);
            int iOrdinal = this.f80159Oooo0oo.ordinal();
            if (iOrdinal == 0) {
                AbstractC31169OooO0OO abstractC31169OooO0OO2 = this.f80149Oooo;
                if (abstractC31169OooO0OO2 instanceof AbstractC31169OooO0OO.C20158OooO0OO) {
                    int iOrdinal2 = ((AbstractC31169OooO0OO.C20158OooO0OO) abstractC31169OooO0OO2).f111186OooO00o.ordinal();
                    if (iOrdinal2 == 1) {
                        float f3 = ((RectF) animatableRectF).right;
                        rectF3.set(f3 - fMax, ((RectF) animatableRectF).top, f3, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal2 == 2) {
                        float f4 = ((RectF) animatableRectF).left;
                        float f5 = ((RectF) animatableRectF).bottom;
                        rectF3.set(f4, f5 - fMax, ((RectF) animatableRectF).right, f5);
                    } else if (iOrdinal2 == 3) {
                        float f6 = ((RectF) animatableRectF).left;
                        rectF3.set(f6, ((RectF) animatableRectF).top, fMax + f6, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal2 == 4) {
                        float f7 = ((RectF) animatableRectF).left;
                        float f8 = ((RectF) animatableRectF).top;
                        rectF3.set(f7, f8, ((RectF) animatableRectF).right, fMax + f8);
                    }
                } else if (abstractC31169OooO0OO2 instanceof AbstractC31169OooO0OO.OooO0O0) {
                    int iOrdinal3 = ((AbstractC31169OooO0OO.OooO0O0) abstractC31169OooO0OO2).f111185OooO00o.ordinal();
                    if (iOrdinal3 == 1) {
                        float f9 = ((RectF) animatableRectF).left;
                        float f10 = ((RectF) animatableRectF).bottom;
                        rectF3.set(f9, f10 - fMax, fMax + f9, f10);
                    } else if (iOrdinal3 == 2) {
                        float f11 = ((RectF) animatableRectF).right;
                        float f12 = ((RectF) animatableRectF).bottom;
                        rectF3.set(f11 - fMax, f12 - fMax, f11, f12);
                    } else if (iOrdinal3 == 3) {
                        float f13 = ((RectF) animatableRectF).left;
                        float f14 = ((RectF) animatableRectF).top;
                        rectF3.set(f13, f14, f13 + fMax, fMax + f14);
                    } else if (iOrdinal3 == 4) {
                        float f15 = ((RectF) animatableRectF).right;
                        float f16 = ((RectF) animatableRectF).top;
                        rectF3.set(f15 - fMax, f16, f15, fMax + f16);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw new C32442OooOO0o();
                }
                float fMax2 = Math.max(fMax / animatableRectF.width(), fMax / animatableRectF.height());
                AbstractC31169OooO0OO abstractC31169OooO0OO3 = this.f80149Oooo;
                if (abstractC31169OooO0OO3 instanceof AbstractC31169OooO0OO.C20158OooO0OO) {
                    Matrix matrix2 = new Matrix();
                    int iOrdinal4 = ((AbstractC31169OooO0OO.C20158OooO0OO) abstractC31169OooO0OO3).f111186OooO00o.ordinal();
                    if (iOrdinal4 == 1) {
                        matrix2.setScale(fMax2, fMax2, ((RectF) animatableRectF).right, animatableRectF.centerY());
                    } else if (iOrdinal4 == 2) {
                        matrix2.setScale(fMax2, fMax2, animatableRectF.centerX(), ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal4 == 3) {
                        matrix2.setScale(fMax2, fMax2, ((RectF) animatableRectF).left, animatableRectF.centerY());
                    } else if (iOrdinal4 == 4) {
                        matrix2.setScale(fMax2, fMax2, animatableRectF.centerX(), ((RectF) animatableRectF).top);
                    }
                    matrix2.mapRect(rectF3, animatableRectF);
                } else if (abstractC31169OooO0OO3 instanceof AbstractC31169OooO0OO.OooO0O0) {
                    Matrix matrix3 = new Matrix();
                    int iOrdinal5 = ((AbstractC31169OooO0OO.OooO0O0) abstractC31169OooO0OO3).f111185OooO00o.ordinal();
                    if (iOrdinal5 == 1) {
                        matrix3.setScale(fMax2, fMax2, ((RectF) animatableRectF).left, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal5 == 2) {
                        matrix3.setScale(fMax2, fMax2, ((RectF) animatableRectF).right, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal5 == 3) {
                        matrix3.setScale(fMax2, fMax2, ((RectF) animatableRectF).left, ((RectF) animatableRectF).top);
                    } else if (iOrdinal5 == 4) {
                        matrix3.setScale(fMax2, fMax2, ((RectF) animatableRectF).right, ((RectF) animatableRectF).top);
                    }
                    matrix3.mapRect(rectF3, animatableRectF);
                }
            }
            int iOrdinal6 = this.f80159Oooo0oo.ordinal();
            RectF rectF5 = this.f80152Oooo00O;
            if (iOrdinal6 == 0) {
                RectF rectF6 = new RectF();
                RectF rectF7 = new RectF();
                matrix.mapRect(rectF7, rectF2);
                rectF6.top = Math.max(rectF7.top, rectF5.top);
                rectF6.right = Math.min(rectF7.right, rectF5.right);
                rectF6.bottom = Math.min(rectF7.bottom, rectF5.bottom);
                rectF6.left = Math.max(rectF7.left, rectF5.left);
                AbstractC31169OooO0OO abstractC31169OooO0OO4 = this.f80149Oooo;
                if (abstractC31169OooO0OO4 instanceof AbstractC31169OooO0OO.C20158OooO0OO) {
                    int iOrdinal7 = ((AbstractC31169OooO0OO.C20158OooO0OO) abstractC31169OooO0OO4).f111186OooO00o.ordinal();
                    if (iOrdinal7 == 1) {
                        rectF.set(rectF6.left, ((RectF) animatableRectF).top, ((RectF) animatableRectF).right, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal7 == 2) {
                        rectF.set(((RectF) animatableRectF).left, rectF6.top, ((RectF) animatableRectF).right, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal7 == 3) {
                        rectF.set(((RectF) animatableRectF).left, ((RectF) animatableRectF).top, rectF6.right, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal7 == 4) {
                        rectF.set(((RectF) animatableRectF).left, ((RectF) animatableRectF).top, ((RectF) animatableRectF).right, rectF6.bottom);
                    }
                } else if (abstractC31169OooO0OO4 instanceof AbstractC31169OooO0OO.OooO0O0) {
                    int iOrdinal8 = ((AbstractC31169OooO0OO.OooO0O0) abstractC31169OooO0OO4).f111185OooO00o.ordinal();
                    if (iOrdinal8 == 1) {
                        rectF.set(((RectF) animatableRectF).left, rectF6.top, rectF6.right, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal8 == 2) {
                        rectF.set(rectF6.left, rectF6.top, ((RectF) animatableRectF).right, ((RectF) animatableRectF).bottom);
                    } else if (iOrdinal8 == 3) {
                        rectF.set(((RectF) animatableRectF).left, ((RectF) animatableRectF).top, rectF6.right, rectF6.bottom);
                    } else if (iOrdinal8 == 4) {
                        rectF.set(rectF6.left, ((RectF) animatableRectF).top, ((RectF) animatableRectF).right, rectF6.bottom);
                    }
                }
            } else {
                if (iOrdinal6 != 1) {
                    throw new C32442OooOO0o();
                }
                RectF rectF8 = new RectF();
                RectF rectF9 = new RectF();
                matrix.mapRect(rectF9, rectF2);
                rectF8.top = Math.max(rectF9.top, rectF5.top);
                rectF8.right = Math.min(rectF9.right, rectF5.right);
                rectF8.bottom = Math.min(rectF9.bottom, rectF5.bottom);
                float fMax3 = Math.max(rectF9.left, rectF5.left);
                rectF8.left = fMax3;
                AbstractC31169OooO0OO abstractC31169OooO0OO5 = this.f80149Oooo;
                if (abstractC31169OooO0OO5 instanceof AbstractC31169OooO0OO.C20158OooO0OO) {
                    float fCenterX = (animatableRectF.centerX() - rectF8.left) / (animatableRectF.width() / 2.0f);
                    float fCenterY = (animatableRectF.centerY() - rectF8.top) / (animatableRectF.height() / 2.0f);
                    float fCenterY2 = (rectF8.bottom - animatableRectF.centerY()) / (animatableRectF.height() / 2.0f);
                    float fCenterX2 = (rectF8.right - animatableRectF.centerX()) / (animatableRectF.width() / 2.0f);
                    int iOrdinal9 = ((AbstractC31169OooO0OO.C20158OooO0OO) abstractC31169OooO0OO5).f111186OooO00o.ordinal();
                    if (iOrdinal9 == 1) {
                        float fMin = Math.min((((RectF) animatableRectF).right - rectF8.left) / animatableRectF.width(), Math.min(fCenterY, fCenterY2));
                        Matrix matrix4 = new Matrix();
                        matrix4.setScale(fMin, fMin, ((RectF) animatableRectF).right, animatableRectF.centerY());
                        matrix4.mapRect(rectF, animatableRectF);
                    } else if (iOrdinal9 == 2) {
                        float fMin2 = Math.min((((RectF) animatableRectF).bottom - rectF8.top) / animatableRectF.height(), Math.min(fCenterX, fCenterX2));
                        Matrix matrix5 = new Matrix();
                        matrix5.setScale(fMin2, fMin2, animatableRectF.centerX(), ((RectF) animatableRectF).bottom);
                        matrix5.mapRect(rectF, animatableRectF);
                    } else if (iOrdinal9 == 3) {
                        float fMin3 = Math.min((rectF8.right - ((RectF) animatableRectF).left) / animatableRectF.width(), Math.min(fCenterY, fCenterY2));
                        Matrix matrix6 = new Matrix();
                        matrix6.setScale(fMin3, fMin3, ((RectF) animatableRectF).left, animatableRectF.centerY());
                        matrix6.mapRect(rectF, animatableRectF);
                    } else if (iOrdinal9 == 4) {
                        float fMin4 = Math.min((rectF8.bottom - ((RectF) animatableRectF).top) / animatableRectF.height(), Math.min(fCenterX, fCenterX2));
                        Matrix matrix7 = new Matrix();
                        matrix7.setScale(fMin4, fMin4, animatableRectF.centerX(), ((RectF) animatableRectF).top);
                        matrix7.mapRect(rectF, animatableRectF);
                    }
                } else if (abstractC31169OooO0OO5 instanceof AbstractC31169OooO0OO.OooO0O0) {
                    float fWidth = (((RectF) animatableRectF).right - fMax3) / animatableRectF.width();
                    float fHeight = (((RectF) animatableRectF).bottom - rectF8.top) / animatableRectF.height();
                    float fHeight2 = (rectF8.bottom - ((RectF) animatableRectF).top) / animatableRectF.height();
                    float fWidth2 = (rectF8.right - ((RectF) animatableRectF).left) / animatableRectF.width();
                    int iOrdinal10 = ((AbstractC31169OooO0OO.OooO0O0) abstractC31169OooO0OO5).f111185OooO00o.ordinal();
                    if (iOrdinal10 == 1) {
                        float fMin5 = Math.min(fWidth2, fHeight);
                        Matrix matrix8 = new Matrix();
                        matrix8.setScale(fMin5, fMin5, ((RectF) animatableRectF).left, ((RectF) animatableRectF).bottom);
                        matrix8.mapRect(rectF, animatableRectF);
                    } else if (iOrdinal10 == 2) {
                        float fMin6 = Math.min(fWidth, fHeight);
                        Matrix matrix9 = new Matrix();
                        matrix9.setScale(fMin6, fMin6, ((RectF) animatableRectF).right, ((RectF) animatableRectF).bottom);
                        matrix9.mapRect(rectF, animatableRectF);
                    } else if (iOrdinal10 == 3) {
                        float fMin7 = Math.min(fWidth2, fHeight2);
                        Matrix matrix10 = new Matrix();
                        matrix10.setScale(fMin7, fMin7, ((RectF) animatableRectF).left, ((RectF) animatableRectF).top);
                        matrix10.mapRect(rectF, animatableRectF);
                    } else if (iOrdinal10 == 4) {
                        float fMin8 = Math.min(fWidth, fHeight2);
                        Matrix matrix11 = new Matrix();
                        matrix11.setScale(fMin8, fMin8, ((RectF) animatableRectF).right, ((RectF) animatableRectF).top);
                        matrix11.mapRect(rectF, animatableRectF);
                    }
                }
            }
        } else if (action == 1) {
            rectF3.setEmpty();
            rectF.setEmpty();
            AbstractC31169OooO0OO abstractC31169OooO0OO6 = this.f80149Oooo;
            if ((abstractC31169OooO0OO6 instanceof AbstractC31169OooO0OO.C20158OooO0OO) || (abstractC31169OooO0OO6 instanceof AbstractC31169OooO0OO.OooO0O0)) {
                float fMin9 = Math.min(this.f80150Oooo0 / animatableRectF.height(), this.f80153Oooo00o / animatableRectF.width());
                float fWidth3 = animatableRectF.width() * fMin9;
                float fHeight3 = animatableRectF.height() * fMin9;
                float f17 = (this.f80153Oooo00o - fWidth3) / 2.0f;
                float f18 = this.f80156Oooo0o;
                float f19 = f17 + f18;
                float fOooO0O0 = C20503OooO00o.OooO0O0(this.f80150Oooo0, fHeight3, 2.0f, f18);
                AnimatableRectF animatableRectF2 = this.f80146OooOoo0;
                animatableRectF2.set(f19, fOooO0O0, fWidth3 + f19, fHeight3 + fOooO0O0);
                Matrix matrixOooO0O0 = C31161OooO0O0.OooO0O0(matrix);
                float fWidth4 = animatableRectF2.width() / animatableRectF.width();
                float fCenterX3 = animatableRectF2.centerX() - animatableRectF.centerX();
                float fCenterY3 = animatableRectF2.centerY() - animatableRectF.centerY();
                Matrix matrix12 = new Matrix();
                matrix12.setScale(fWidth4, fWidth4, animatableRectF.centerX(), animatableRectF.centerY());
                matrix12.postTranslate(fCenterX3, fCenterY3);
                matrixOooO0O0.postConcat(matrix12);
                C31161OooO0O0.OooO00o(matrix, matrixOooO0O0, new C28597o00oO0o(this, 2));
                C31163OooO0Oo.OooO00o(animatableRectF, animatableRectF2, new C34805o000oo00(this, 2));
            }
        } else if (action == 2) {
            AbstractC31169OooO0OO abstractC31169OooO0OO7 = this.f80149Oooo;
            if (abstractC31169OooO0OO7 instanceof AbstractC31169OooO0OO.OooO0O0) {
                EnumC31167OooO00o enumC31167OooO00o2 = ((AbstractC31169OooO0OO.OooO0O0) abstractC31169OooO0OO7).f111185OooO00o;
                int iOrdinal11 = this.f80159Oooo0oo.ordinal();
                if (iOrdinal11 == 0) {
                    int iOrdinal12 = enumC31167OooO00o2.ordinal();
                    if (iOrdinal12 == 1) {
                        animatableRectF.setTop(motionEvent.getY());
                        animatableRectF.setRight(motionEvent.getX());
                    } else if (iOrdinal12 == 2) {
                        animatableRectF.setTop(motionEvent.getY());
                        animatableRectF.setLeft(motionEvent.getX());
                    } else if (iOrdinal12 == 3) {
                        animatableRectF.setBottom(motionEvent.getY());
                        animatableRectF.setRight(motionEvent.getX());
                    } else if (iOrdinal12 == 4) {
                        animatableRectF.setBottom(motionEvent.getY());
                        animatableRectF.setLeft(motionEvent.getX());
                    }
                } else {
                    if (iOrdinal11 != 1) {
                        throw new C32442OooOO0o();
                    }
                    int iOrdinal13 = enumC31167OooO00o2.ordinal();
                    if (iOrdinal13 != 1) {
                        if (iOrdinal13 != 2) {
                            if (iOrdinal13 != 3) {
                                if (iOrdinal13 == 4 && (motionEvent.getY() >= rectF3.bottom || motionEvent.getX() <= rectF3.left)) {
                                    float fOooO0O02 = (C31163OooO0Oo.OooO0O0(animatableRectF) - ((float) Math.hypot(((RectF) animatableRectF).top - motionEvent.getY(), ((RectF) animatableRectF).right - motionEvent.getX()))) / 2;
                                    EnumC31105OooO0O0 enumC31105OooO0O0 = this.f80158Oooo0oO;
                                    animatableRectF.setBottom(((RectF) animatableRectF).bottom - ((enumC31105OooO0O0.f111007OooOo * fOooO0O02) / enumC31105OooO0O0.f111008OooOo0o));
                                    animatableRectF.setLeft(((RectF) animatableRectF).left + fOooO0O02);
                                }
                            } else if (motionEvent.getY() >= rectF3.bottom || motionEvent.getX() >= rectF3.right) {
                                float fOooO0O03 = (C31163OooO0Oo.OooO0O0(animatableRectF) - ((float) Math.hypot(((RectF) animatableRectF).top - motionEvent.getY(), ((RectF) animatableRectF).left - motionEvent.getX()))) / 2;
                                EnumC31105OooO0O0 enumC31105OooO0O02 = this.f80158Oooo0oO;
                                animatableRectF.setBottom(((RectF) animatableRectF).bottom - ((enumC31105OooO0O02.f111007OooOo * fOooO0O03) / enumC31105OooO0O02.f111008OooOo0o));
                                animatableRectF.setRight(((RectF) animatableRectF).right - fOooO0O03);
                            }
                        } else if (motionEvent.getY() <= rectF3.top || motionEvent.getX() <= rectF3.left) {
                            float fOooO0O04 = (C31163OooO0Oo.OooO0O0(animatableRectF) - ((float) Math.hypot(((RectF) animatableRectF).bottom - motionEvent.getY(), ((RectF) animatableRectF).right - motionEvent.getX()))) / 2;
                            EnumC31105OooO0O0 enumC31105OooO0O03 = this.f80158Oooo0oO;
                            animatableRectF.setTop(((RectF) animatableRectF).top + ((enumC31105OooO0O03.f111007OooOo * fOooO0O04) / enumC31105OooO0O03.f111008OooOo0o));
                            animatableRectF.setLeft(((RectF) animatableRectF).left + fOooO0O04);
                        }
                    } else if (motionEvent.getY() <= rectF3.top || motionEvent.getX() >= rectF3.right) {
                        float fOooO0O05 = (C31163OooO0Oo.OooO0O0(animatableRectF) - ((float) Math.hypot(motionEvent.getY() - ((RectF) animatableRectF).bottom, motionEvent.getX() - ((RectF) animatableRectF).left))) / 2;
                        EnumC31105OooO0O0 enumC31105OooO0O04 = this.f80158Oooo0oO;
                        animatableRectF.setTop(((RectF) animatableRectF).top + ((enumC31105OooO0O04.f111007OooOo * fOooO0O05) / enumC31105OooO0O04.f111008OooOo0o));
                        animatableRectF.setRight(((RectF) animatableRectF).right - fOooO0O05);
                    }
                }
                OooO0o();
                OooO0oO();
                OooO0o0();
            } else if (abstractC31169OooO0OO7 instanceof AbstractC31169OooO0OO.C20158OooO0OO) {
                EnumC31170OooO0Oo enumC31170OooO0Oo2 = ((AbstractC31169OooO0OO.C20158OooO0OO) abstractC31169OooO0OO7).f111186OooO00o;
                matrix.mapRect(new RectF(), rectF2);
                int iOrdinal14 = this.f80159Oooo0oo.ordinal();
                if (iOrdinal14 == 0) {
                    int iOrdinal15 = enumC31170OooO0Oo2.ordinal();
                    if (iOrdinal15 == 1) {
                        animatableRectF.setLeft(motionEvent.getX());
                    } else if (iOrdinal15 == 2) {
                        animatableRectF.setTop(motionEvent.getY());
                    } else if (iOrdinal15 == 3) {
                        animatableRectF.setRight(motionEvent.getX());
                    } else if (iOrdinal15 == 4) {
                        animatableRectF.setBottom(motionEvent.getY());
                    }
                } else {
                    if (iOrdinal14 != 1) {
                        throw new C32442OooOO0o();
                    }
                    int iOrdinal16 = enumC31170OooO0Oo2.ordinal();
                    if (iOrdinal16 == 1) {
                        float x = motionEvent.getX();
                        float f20 = ((RectF) animatableRectF).left;
                        float f21 = x - f20;
                        EnumC31105OooO0O0 enumC31105OooO0O05 = this.f80158Oooo0oO;
                        float f22 = (enumC31105OooO0O05.f111007OooOo * f21) / enumC31105OooO0O05.f111008OooOo0o;
                        animatableRectF.setLeft(f20 + f21);
                        float f23 = f22 / 2.0f;
                        animatableRectF.setTop(((RectF) animatableRectF).top + f23);
                        animatableRectF.setBottom(((RectF) animatableRectF).bottom - f23);
                    } else if (iOrdinal16 == 2) {
                        float y2 = motionEvent.getY();
                        float f24 = ((RectF) animatableRectF).top;
                        float f25 = y2 - f24;
                        EnumC31105OooO0O0 enumC31105OooO0O06 = this.f80158Oooo0oO;
                        float f26 = (enumC31105OooO0O06.f111008OooOo0o * f25) / enumC31105OooO0O06.f111007OooOo;
                        animatableRectF.setTop(f24 + f25);
                        float f27 = f26 / 2.0f;
                        animatableRectF.setLeft(((RectF) animatableRectF).left + f27);
                        animatableRectF.setRight(((RectF) animatableRectF).right - f27);
                    } else if (iOrdinal16 == 3) {
                        float x2 = ((RectF) animatableRectF).right - motionEvent.getX();
                        EnumC31105OooO0O0 enumC31105OooO0O07 = this.f80158Oooo0oO;
                        float f28 = (enumC31105OooO0O07.f111007OooOo * x2) / enumC31105OooO0O07.f111008OooOo0o;
                        animatableRectF.setRight(((RectF) animatableRectF).right - x2);
                        float f29 = f28 / 2.0f;
                        animatableRectF.setTop(((RectF) animatableRectF).top + f29);
                        animatableRectF.setBottom(((RectF) animatableRectF).bottom - f29);
                    } else if (iOrdinal16 == 4) {
                        float y3 = ((RectF) animatableRectF).bottom - motionEvent.getY();
                        EnumC31105OooO0O0 enumC31105OooO0O08 = this.f80158Oooo0oO;
                        float f30 = (enumC31105OooO0O08.f111008OooOo0o * y3) / enumC31105OooO0O08.f111007OooOo;
                        animatableRectF.setBottom(((RectF) animatableRectF).bottom - y3);
                        float f31 = f30 / 2.0f;
                        animatableRectF.setLeft(((RectF) animatableRectF).left + f31);
                        animatableRectF.setRight(((RectF) animatableRectF).right - f31);
                    }
                }
                OooO0o();
                OooO0oO();
                OooO0o0();
            }
        }
        if (OooOOO0.OooO0O0(this.f80149Oooo, AbstractC31169OooO0OO.OooO00o.f111184OooO00o)) {
            C31108OooO0o c31108OooO0o = this.f80170Ooooo00;
            c31108OooO0o.getClass();
            c31108OooO0o.f111013OooO0OO.onTouchEvent(motionEvent);
            c31108OooO0o.f111014OooO0Oo.onTouchEvent(motionEvent);
            c31108OooO0o.f111015OooO0o0.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 && c31108OooO0o.f111012OooO0O0) {
                c31108OooO0o.f111012OooO0O0 = false;
                c31108OooO0o.f111011OooO00o.OooO00o();
            }
        }
        invalidate();
        return true;
    }

    public final void setAspectRatio(EnumC31105OooO0O0 aspectRatio) {
        float fHeight;
        float fWidth;
        OooOOO0.OooO0oO(aspectRatio, "aspectRatio");
        this.f80158Oooo0oO = aspectRatio;
        this.f80159Oooo0oo = OooO00o.f80173OooO00o[aspectRatio.ordinal()] == 1 ? EnumC31104OooO00o.f111002OooOo0o : EnumC31104OooO00o.f111001OooOo;
        EnumC31105OooO0O0 enumC31105OooO0O0 = this.f80158Oooo0oO;
        EnumC31105OooO0O0 enumC31105OooO0O02 = EnumC31105OooO0O0.f111005OooOoO0;
        RectF rectF = this.f80151Oooo000;
        if (enumC31105OooO0O0 == enumC31105OooO0O02) {
            fWidth = rectF.width() / Math.min(rectF.width(), rectF.height());
            fHeight = rectF.height() / Math.min(rectF.width(), rectF.height());
        } else {
            float f = enumC31105OooO0O0.f111008OooOo0o;
            fHeight = enumC31105OooO0O0.f111007OooOo;
            fWidth = f;
        }
        float f2 = fWidth / fHeight;
        float f3 = this.f80153Oooo00o;
        float f4 = this.f80150Oooo0;
        if (f2 > f3 / f4) {
            f4 = (fHeight * f3) / fWidth;
        } else {
            f3 = (fWidth * f4) / fHeight;
        }
        RectF rectF2 = this.f80152Oooo00O;
        float fCenterX = rectF2.centerX() - (f3 / 2.0f);
        float fCenterY = rectF2.centerY() - (f4 / 2.0f);
        float f5 = f4 + fCenterY;
        AnimatableRectF animatableRectF = this.f80146OooOoo0;
        animatableRectF.set(fCenterX + 0.0f, 0.0f + fCenterY, f3 + fCenterX, f5);
        Matrix matrix = new Matrix();
        float fMax = Math.max(animatableRectF.width() / rectF.width(), animatableRectF.height() / rectF.height());
        matrix.setScale(fMax, fMax);
        float fWidth2 = (this.f80153Oooo00o - (rectF.width() * fMax)) / 2.0f;
        float f6 = this.f80156Oooo0o;
        matrix.postTranslate(fWidth2 + f6, ((this.f80150Oooo0 - (rectF.height() * fMax)) / 2.0f) + f6);
        C31161OooO0O0.OooO00o(this.f80155Oooo0OO, matrix, new C29473Oooo00o(this, 1));
        C31163OooO0Oo.OooO00o(this.f80144OooOoOO, animatableRectF, new C30144OooO0OO(this, 1));
        animatableRectF.setEmpty();
        invalidate();
    }

    public final void setBitmap(final Bitmap bitmap) {
        if (getWidth() == 0 || getHeight() == 0) {
            post(new Runnable() { // from class: o0oOoo.OooO0oO
                @Override // java.lang.Runnable
                public final void run() {
                    ImageCropView.OooO00o(this.f111018OooOo0o, bitmap);
                }
            });
        } else {
            setBitmapInternal(bitmap);
        }
    }

    public final void setImage(String path) {
        OooOOO0.OooO0oO(path, "path");
    }

    public final void setObserveCropRectOnOriginalBitmapChanged(InterfaceC32507OooOO0o<? super RectF, C32460OooOooO> interfaceC32507OooOO0o) {
        this.observeCropRectOnOriginalBitmapChanged = interfaceC32507OooOO0o;
    }

    public final void setOnInitialized(oO0O000o.OooO00o<C32460OooOooO> oooO00o) {
        this.onInitialized = oooO00o;
    }

    public final void setTheme(int colorInt) {
        this.f80166OoooOOo.setColor(ContextCompat.getColor(getContext(), colorInt));
        invalidate();
    }

    public final void setImage(Uri uri) {
        OooOOO0.OooO0oO(uri, "uri");
        OooO0O0 oooO0O0 = this.f80171Ooooo0o;
        if (oooO0O0 != null) {
            oooO0O0.cancel(true);
        }
        OooO0O0 oooO0O02 = new OooO0O0();
        this.f80171Ooooo0o = oooO0O02;
        oooO0O02.execute(uri);
    }
}
