package o0oOoo;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.orion.notein.p607ui.widget.crop.AnimatableRectF;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.jvm.internal.OooOOO0;
import o00oo0Oo.C25707OooOoO0;
import o0Ooo0oo.C29470Oooo0;
import o0oOooOo.C31161OooO0O0;

/* JADX INFO: renamed from: o0oOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31106OooO0OO extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C31108OooO0o f111009OooO00o;

    public C31106OooO0OO(C31108OooO0o c31108OooO0o) {
        this.f111009OooO00o = c31108OooO0o;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        ImageCropView imageCropView = this.f111009OooO00o.f111011OooO00o.f111019OooO00o;
        boolean zOooO0O0 = ImageCropView.OooO0O0(imageCropView, 2.0f);
        Matrix matrix = imageCropView.f80155Oooo0OO;
        if (!zOooO0O0) {
            float x = event.getX();
            float y = event.getY();
            C25707OooOoO0 c25707OooOoO0 = new C25707OooOoO0(imageCropView, 4);
            OooOOO0.OooO0oO(matrix, "<this>");
            Matrix matrixOooO0O0 = C31161OooO0O0.OooO0O0(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(2.0f, 2.0f, x, y);
            matrixOooO0O0.postConcat(matrix2);
            C31161OooO0O0.OooO00o(matrix, matrixOooO0O0, c25707OooOoO0);
            return true;
        }
        Matrix matrix3 = new Matrix();
        AnimatableRectF animatableRectF = imageCropView.f80144OooOoOO;
        float fWidth = animatableRectF.width();
        RectF rectF = imageCropView.f80151Oooo000;
        float fMax = Math.max(fWidth / rectF.width(), animatableRectF.height() / rectF.height());
        matrix3.setScale(fMax, fMax);
        float fWidth2 = (imageCropView.f80153Oooo00o - (rectF.width() * fMax)) / 2.0f;
        float f = imageCropView.f80156Oooo0o;
        matrix3.postTranslate(fWidth2 + f, ((imageCropView.f80150Oooo0 - (rectF.height() * fMax)) / 2.0f) + f);
        C31161OooO0O0.OooO00o(matrix, matrix3, new C29470Oooo0(imageCropView, 1));
        return true;
    }
}
