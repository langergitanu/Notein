package o0oOoo;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.orion.notein.p607ui.widget.crop.AnimatableRectF;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import o0Oo0oOo.C28349OoooO00;
import o0oOooOo.C31161OooO0O0;

/* JADX INFO: renamed from: o0oOoo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31111OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImageCropView f111019OooO00o;

    public C31111OooO0oo(ImageCropView imageCropView) {
        this.f111019OooO00o = imageCropView;
    }

    public final void OooO00o() {
        int i = ImageCropView.f80139OooooO0;
        ImageCropView imageCropView = this.f111019OooO00o;
        RectF rectF = new RectF();
        Matrix matrix = imageCropView.f80155Oooo0OO;
        matrix.mapRect(rectF, imageCropView.f80151Oooo000);
        AnimatableRectF animatableRectF = imageCropView.f80144OooOoOO;
        float fWidth = animatableRectF.width() / rectF.width();
        float fHeight = animatableRectF.height() / rectF.height();
        float fMax = (fWidth > 1.0f || fHeight > 1.0f) ? Math.max(fWidth, fHeight) : 1.0f;
        RectF rectF2 = new RectF();
        Matrix matrix2 = new Matrix();
        matrix2.setScale(fMax, fMax);
        matrix2.mapRect(rectF2, rectF);
        float f = rectF2.left;
        float f2 = ((RectF) animatableRectF).left;
        float f3 = f > f2 ? f2 - f : 0.0f;
        float f4 = rectF2.right;
        float f5 = ((RectF) animatableRectF).right;
        if (f4 < f5) {
            f3 = f5 - f4;
        }
        float f6 = rectF2.top;
        float f7 = ((RectF) animatableRectF).top;
        float f8 = f6 > f7 ? f7 - f6 : 0.0f;
        float f9 = rectF2.bottom;
        float f10 = ((RectF) animatableRectF).bottom;
        if (f9 < f10) {
            f8 = f10 - f9;
        }
        Matrix matrixOooO0O0 = C31161OooO0O0.OooO0O0(matrix);
        Matrix matrix3 = new Matrix();
        matrix3.setScale(fMax, fMax);
        matrix3.postTranslate(f3, f8);
        matrixOooO0O0.postConcat(matrix3);
        C31161OooO0O0.OooO00o(matrix, matrixOooO0O0, new C28349OoooO00(imageCropView, 1));
    }
}
