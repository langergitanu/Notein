package o000Oo0O;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import androidx.ink.strokes.C21967OooO0Oo;
import androidx.ink.strokes.InProgressStrokeNative;
import androidx.ink.strokes.StrokeInputBatchNative;
import com.facebook.soloader.OooOo;
import java.util.ListIterator;
import o000OO00.C24457OooOOo;
import o000OO00.C24489OoooOO0;
import o000OO00.o000oOoO;
import o000Oo00.InterfaceC24514OooO00o;
import o000Oo0o.C24532OooO00o;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: renamed from: o000Oo0O.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24531OooOo0o implements InterfaceC24514OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000oOoO f82982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float[] f82983OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32465OooO0O0 f82984OooO0Oo;

    public C24531OooOo0o(o000oOoO textureStore, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textureStore, "textureStore");
        this.f82982OooO0O0 = textureStore;
        new Matrix();
        this.f82983OooO0OO = new float[9];
        C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
        if (Build.VERSION.SDK_INT >= 34 && !z) {
            c32465OooO0O0OooO0Oo.add(C20519OooO0Oo.OooO0OO(new C24529OooOo0(this, 0)));
        }
        c32465OooO0O0OooO0Oo.add(C20519OooO0Oo.OooO0OO(new C24530OooOo0O(this, 0)));
        this.f82984OooO0Oo = OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
    }

    @Override // o000Oo00.InterfaceC24514OooO00o
    public final void OooO00o(Canvas canvas, androidx.ink.strokes.OooOOO0 oooOOO0, Matrix matrix) {
        C24531OooOo0o c24531OooOo0o = this;
        Canvas canvas2 = canvas;
        androidx.ink.strokes.OooOOO0 stroke = oooOOO0;
        Matrix strokeToScreenTransform = matrix;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas2, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
        c24531OooOo0o.OooO0OO(strokeToScreenTransform);
        int iOooO0o0 = stroke.f65489OooO0Oo.OooO0o0();
        int i = 0;
        int i2 = 0;
        while (i2 < iOooO0o0) {
            o000OO00.OooO0O0 oooO0O0 = stroke.f65486OooO00o;
            o000OO00.OooOO0O oooOO0O = oooO0O0.f82632OooO0O0.f82669OooO0O0.get(i2);
            int size = oooOO0O.f82653OooO0OO.size();
            int i3 = i;
            while (true) {
                if (i3 >= size) {
                    Log.i("CanvasStrokeRenderer", "Coat " + i2 + " of a Stroke with the following brush cannot be rendered: " + oooO0O0);
                    break;
                }
                ListIterator listIterator = c24531OooOo0o.f82984OooO0Oo.listIterator(i);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (c20232OooO0O0.hasNext()) {
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) c20232OooO0O0.next();
                        if (((InterfaceC24528OooOOoo) interfaceC32440OooOO0.getValue()).OooO0OO(canvas2, stroke, i2, i3)) {
                            o000OO00.OooOo oooOo = oooOO0O.f82653OooO0OO.get(i3);
                            long jOooO0OO = oooO0O0.f82632OooO0O0.OooO0OO();
                            long jOooO00o = C24489OoooOO0.OooO00o(oooOo);
                            androidx.ink.strokes.OooO00o oooO00o = stroke.f65488OooO0OO;
                            oooO00o.getClass();
                            ((InterfaceC24528OooOOoo) interfaceC32440OooOO0.getValue()).OooO0Oo(canvas2, stroke, i2, i3, strokeToScreenTransform, C24532OooO00o.C19625OooO00o.OooO00o(jOooO0OO, jOooO00o, StrokeInputBatchNative.f65498OooO00o.getBaseAnimationPhase(oooO00o.OooO0O0())));
                            break;
                        }
                        canvas2 = canvas;
                        stroke = oooOOO0;
                        strokeToScreenTransform = matrix;
                    }
                }
                i3++;
                c24531OooOo0o = this;
                canvas2 = canvas;
                stroke = oooOOO0;
                strokeToScreenTransform = matrix;
                i = 0;
            }
            i2++;
            c24531OooOo0o = this;
            canvas2 = canvas;
            stroke = oooOOO0;
            strokeToScreenTransform = matrix;
            i = 0;
        }
    }

    @Override // o000Oo00.InterfaceC24514OooO00o
    public final void OooO0O0(Canvas canvas, C21967OooO0Oo c21967OooO0Oo, Matrix matrix) {
        Canvas canvas2 = canvas;
        C21967OooO0Oo inProgressStroke = c21967OooO0Oo;
        Matrix strokeToScreenTransform = matrix;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas2, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressStroke, "inProgressStroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToScreenTransform, "strokeToScreenTransform");
        OooO0OO(strokeToScreenTransform);
        o000OO00.OooO0O0 oooO0O0 = inProgressStroke.f65470OooO0O0;
        if (oooO0O0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iOooO0O0 = inProgressStroke.OooO0O0();
        int i = 0;
        int i2 = 0;
        while (i2 < iOooO0O0) {
            C24457OooOOo c24457OooOOo = oooO0O0.f82632OooO0O0;
            o000OO00.OooOO0O oooOO0O = c24457OooOOo.f82669OooO0O0.get(i2);
            int size = oooOO0O.f82653OooO0OO.size();
            int i3 = i;
            while (true) {
                if (i3 >= size) {
                    Log.i("CanvasStrokeRenderer", "Coat " + i2 + " of an InProgressStroke with the following brush cannot be rendered: " + oooO0O0);
                    break;
                }
                ListIterator listIterator = this.f82984OooO0Oo.listIterator(i);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (c20232OooO0O0.hasNext()) {
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) c20232OooO0O0.next();
                        if (((InterfaceC24528OooOOoo) interfaceC32440OooOO0.getValue()).OooO00o(canvas2, inProgressStroke, i2, i3)) {
                            ((InterfaceC24528OooOOoo) interfaceC32440OooOO0.getValue()).OooO0O0(canvas, c21967OooO0Oo, i2, i3, strokeToScreenTransform, C24532OooO00o.C19625OooO00o.OooO00o(c24457OooOOo.OooO0OO(), C24489OoooOO0.OooO00o(oooOO0O.f82653OooO0OO.get(i3)), InProgressStrokeNative.f65457OooO00o.getBaseAnimationPhase(c21967OooO0Oo.OooO0o0())));
                            break;
                        }
                        canvas2 = canvas;
                        inProgressStroke = c21967OooO0Oo;
                        strokeToScreenTransform = matrix;
                    }
                }
                i3++;
                canvas2 = canvas;
                inProgressStroke = c21967OooO0Oo;
                strokeToScreenTransform = matrix;
                i = 0;
            }
            i2++;
            canvas2 = canvas;
            inProgressStroke = c21967OooO0Oo;
            strokeToScreenTransform = matrix;
            i = 0;
        }
    }

    public final void OooO0OO(Matrix transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        if (transform.isAffine()) {
            return;
        }
        float[] fArr = this.f82983OooO0OO;
        transform.getValues(fArr);
        if (fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 1.0f) {
            throw new IllegalArgumentException("The matrix must be affine.");
        }
    }
}
