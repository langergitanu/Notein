package o0oo0Oo;

import OooOoo.C20593OooO0Oo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.PressurePoint;
import java.util.ArrayList;
import java.util.List;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0O0oOo0.C26146OooO00o;
import o0O0oo00.OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oo0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31261OooOo0o<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f111599OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111601OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f111604OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float f111605OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f111606OooOo0O;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final PointF f111600OooOOo = new PointF();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final PointF f111602OooOOoo = new PointF();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f111607OooOo0o = 1.0f;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f111603OooOo = new ArrayList();

    public C31261OooOo0o(int i, float f, boolean z, o0O0oo00.OooO00o<T> oooO00o) {
        this.f111599OooOOOo = z;
        this.f111601OooOOo0 = oooO00o;
        this.f111605OooOo00 = f;
        this.f111604OooOo0 = i;
        OooO00o.C19734OooO00o.OooO00o(oooO00o, i, f, 0, 0, false, 24);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, C34434OooOoO.f123453OooOo0o);
        PressurePoint pressurePoint = new PressurePoint(f, f2, f3, i);
        o0O0oo00.OooO00o<T> oooO00o = this.f111601OooOOo0;
        boolean z = oooO00o instanceof C26120OooO0Oo;
        ArrayList arrayList = this.f111603OooOo;
        if (z) {
            OooOOOO((C26120OooO0Oo) oooO00o, !arrayList.isEmpty() ? (PressurePoint) oOo000Oo.OooOo.OoooOOo(arrayList) : pressurePoint, pressurePoint);
        }
        PointF pointF = this.f111600OooOOo;
        if (i == 0) {
            arrayList.clear();
            arrayList.add(pressurePoint);
            pointF.set(f, f2);
            this.f111602OooOOoo.set(f, f2);
            this.f111606OooOo0O = true;
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i == 1) {
            arrayList.add(new PressurePoint(f, f2, f3, i));
            this.f111606OooOo0O = false;
            return new DrawResult(3, drawResultOooO.getItem(), com.facebook.soloader.OooOo.OooO0oO(drawResultOooO.getItem()), null, null, false, false, null, null, false, null, 2040, null);
        }
        if (i != 2) {
            return new DrawResult(0, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        arrayList.add(new PressurePoint(f, f2, f3, i));
        pointF.set(f, f2);
        return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111604OooOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0o() {
        return this.f111607OooOo0o;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 12;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111605OooOo00;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (!z || this.f111606OooOo0O) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111601OooOOo0;
            oooO00o.OooOo00(target);
            oooO00o.OooO0Oo();
            if (this.f111415OooO0O0 && !this.f111422OooOO0 && !this.f111599OooOOOo) {
                oooO00o.lineTo(this.f111416OooO0OO, this.f111417OooO0Oo);
            }
            if (oooO00o instanceof C26120OooO0Oo) {
                oooO00o.OooOoo();
            } else {
                if (!(oooO00o instanceof C26146OooO00o)) {
                    throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Unsupported render target type: ", target.getClass().getSimpleName(), ". Only AndroidRenderTarget and PdfiumTarget are supported."));
                }
                RectF rectFOooOOOo = OooOOOo();
                Bitmap bitmap = null;
                if (rectFOooOOOo.width() > 0.0f && rectFOooOOOo.height() > 0.0f) {
                    Matrix matrix = new Matrix();
                    matrix.postTranslate(-rectFOooOOOo.left, -rectFOooOOOo.top);
                    matrix.postScale(4.0f, 4.0f);
                    int iWidth = (int) (rectFOooOOOo.width() * 4.0f);
                    int iHeight = (int) (rectFOooOOOo.height() * 4.0f);
                    if (iWidth > 0 && iHeight > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.setMatrix(matrix);
                        C26120OooO0Oo c26120OooO0Oo = new C26120OooO0Oo();
                        c26120OooO0Oo.OooOo00(new C26121OooO0o0(canvas, null));
                        ArrayList arrayList = this.f111603OooOo;
                        int i = 0;
                        for (Object obj : arrayList) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C34429OooOOo0.OooOOo();
                                throw null;
                            }
                            PressurePoint pressurePoint = (PressurePoint) obj;
                            OooOOOO(c26120OooO0Oo, i > 0 ? (PressurePoint) arrayList.get(i - 1) : pressurePoint, pressurePoint);
                            i = i2;
                        }
                        c26120OooO0Oo.OooOoo();
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                }
                if (bitmap != null) {
                    ((C26146OooO00o) oooO00o).OooOo0o(bitmap, OooOOOo(), 0.0f);
                    bitmap.recycle();
                }
            }
            oooO00o.OooO0o0();
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111601OooOOo0.reset();
        this.f111606OooOo0O = false;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
        this.f111607OooOo0o = f;
    }

    public final void OooOOOO(C26120OooO0Oo c26120OooO0Oo, PressurePoint pressurePoint, PressurePoint pressurePoint2) {
        float x = pressurePoint2.getX();
        float y = pressurePoint2.getY();
        int action = pressurePoint2.getAction();
        if (action == 0) {
            c26120OooO0Oo.reset();
            OooO00o.C19734OooO00o.OooO00o(c26120OooO0Oo, this.f111604OooOo0, this.f111605OooOo00 * this.f111607OooOo0o, 0, 0, false, 24);
            c26120OooO0Oo.moveTo(x, y);
            return;
        }
        if (action == 1) {
            c26120OooO0Oo.lineTo(x, y);
            return;
        }
        if (action != 2) {
            return;
        }
        float x2 = pressurePoint.getX();
        float y2 = pressurePoint.getY();
        float x3 = pressurePoint.getX() + x;
        float f = 2;
        c26120OooO0Oo.OooO0O0(x2, y2, x3 / f, (pressurePoint.getY() + y) / f);
    }

    public final RectF OooOOOo() {
        ArrayList<PressurePoint> arrayList = this.f111603OooOo;
        if (arrayList.size() < 2) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        RectF rectF = new RectF(((PressurePoint) oOo000Oo.OooOo.Oooo0oO(arrayList)).getX(), ((PressurePoint) oOo000Oo.OooOo.Oooo0oO(arrayList)).getY(), ((PressurePoint) oOo000Oo.OooOo.Oooo0oO(arrayList)).getX(), ((PressurePoint) oOo000Oo.OooOo.Oooo0oO(arrayList)).getY());
        for (PressurePoint pressurePoint : arrayList) {
            rectF.left = Math.min(rectF.left, pressurePoint.getX());
            rectF.top = Math.min(rectF.top, pressurePoint.getY());
            rectF.right = Math.max(rectF.right, pressurePoint.getX());
            rectF.bottom = Math.max(rectF.bottom, pressurePoint.getY());
        }
        float f = (this.f111605OooOo00 * this.f111607OooOo0o) / 2.0f;
        rectF.left -= f;
        rectF.top -= f;
        rectF.right += f;
        rectF.bottom += f;
        return rectF;
    }
}
