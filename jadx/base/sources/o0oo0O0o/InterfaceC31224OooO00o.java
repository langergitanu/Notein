package o0oo0O0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import android.graphics.Matrix;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import androidx.ink.authoring.InProgressShapesView;
import androidx.ink.authoring.InProgressStrokesView;
import androidx.ink.authoring.internal.OooOO0;
import androidx.ink.strokes.StrokeInput;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o000O.C24359OooO0Oo;
import o000O.OooO00o;
import o000O0oO.C24410OooO0Oo;
import o000O0oO.OooO;
import o000O0oo.C24442Oooo00o;
import o000O0oo.Oooo000;
import o0O0o00.C25927OooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo0O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31224OooO00o {

    /* JADX INFO: renamed from: o0oo0O0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20166OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Matrix f111348OooO00o = new Matrix();
    }

    /* JADX INFO: renamed from: o0oo0O0o.OooO00o$OooO0O0 */
    public static final class OooO0O0 {
        public static void OooO00o(InterfaceC31224OooO00o interfaceC31224OooO00o, MotionEvent motionEvent, o000OO00.OooO0O0 oooO0O0, Matrix matrix, Map map) {
            Matrix motionEventToWorldTransform = C20166OooO00o.f111348OooO00o;
            C25927OooOo c25927OooOo = (C25927OooOo) interfaceC31224OooO00o;
            if (c25927OooOo.f88503OooO0Oo) {
                c25927OooOo.OooO0o0();
            }
            if (c25927OooOo.f88504OooO0o != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("InProgressStrokeViewWrapper");
                c20358OooO00o.OooOO0O("startStroke called while another stroke is in progress. Cancelling previous stroke.", new Object[0]);
                c25927OooOo.OooO0O0(null);
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            o000OO00.OooO0O0 brush = c25927OooOo.f88508OooOO0 ? o000OO00.OooO0O0.OooO00o(oooO0O0, C25927OooOo.OooO0Oo(oooO0O0.OooO0O0())) : oooO0O0;
            InProgressStrokesView inProgressStrokesView = c25927OooOo.f88500OooO00o;
            inProgressStrokesView.getClass();
            OooOOO0.OooO0oO(brush, "brush");
            OooOOO0.OooO0oO(motionEventToWorldTransform, "motionEventToWorldTransform");
            InProgressShapesView<o000OO00.OooO0O0, OooO, androidx.ink.strokes.OooOOO0> inProgressShapesView = inProgressStrokesView.f65173OooOo0o;
            inProgressShapesView.getClass();
            InProgressShapesView<o000OO00.OooO0O0, OooO, androidx.ink.strokes.OooOOO0>.OooO00o OooO00o2 = inProgressShapesView.OooO00o();
            Matrix matrix2 = new Matrix();
            if (!motionEventToWorldTransform.invert(matrix2)) {
                throw new IllegalArgumentException(("motionEventToWorldTransform must be invertible, but was " + motionEventToWorldTransform).toString());
            }
            matrix2.preConcat(matrix);
            ViewCompat.transformMatrixToGlobal(inProgressShapesView, matrix2);
            DisplayMetrics displayMetrics = inProgressShapesView.getContext().getResources().getDisplayMetrics();
            matrix2.postScale(2.54f / displayMetrics.xdpi, 2.54f / displayMetrics.ydpi);
            matrix2.getValues(new float[9]);
            float fHypot = (((float) Math.hypot(r6[0], r6[1])) + ((float) Math.hypot(r6[3], r6[4]))) * 0.5f;
            OooOO0<o000OO00.OooO0O0, InProgressShapeT, androidx.ink.strokes.OooOOO0> oooOO02 = OooO00o2.f65167OooO0OO;
            oooOO02.getClass();
            long jLongValue = oooOO02.f65268OooO0o.invoke().longValue();
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                throw new IllegalArgumentException(o0Oo0oo.OooO0O0(pointerId, "Pointer id ", " is not present in event.").toString());
            }
            Matrix matrix3 = new Matrix();
            if (!matrix.invert(matrix3)) {
                throw new IllegalArgumentException(("strokeToWorldTransform must be invertible, but was " + matrix).toString());
            }
            matrix3.preConcat(motionEventToWorldTransform);
            C24410OooO0Oo c24410OooO0Oo = new C24410OooO0Oo();
            Oooo000 oooo000 = oooOO02.f65275OooOOO.f65335OooO0o0;
            long eventTime = motionEvent.getEventTime();
            oooo000.getClass();
            StrokeInput strokeInputOooO0OO = oooo000.OooO0OO(motionEvent, iFindPointerIndex, motionEvent.getHistorySize(), matrix3, eventTime, fHypot, null, null, null);
            long eventTime2 = motionEvent.getEventTime();
            o000O.OooO00o oooO00oOooO0OO = C24359OooO0Oo.OooO0OO(oooOO02.f65272OooOO0, motionEvent, OooO00o.C24358OooO0Oo.f82156OooO0O0, c24410OooO0Oo, jLongValue);
            C24442Oooo00o.OooO00o();
            oooOO02.f65273OooOO0O.f65340OooO00o.put(c24410OooO0Oo, new OooOO0.OooOo0.C21953OooO0Oo(matrix3, eventTime2, strokeInputOooO0OO.f65495OooO0o0));
            oooOO02.OooOOo0(new OooOO0.C21951OooOOo0(strokeInputOooO0OO, c24410OooO0Oo, matrix3, brush, oooO00oOooO0OO, eventTime2));
            C20481OooOOoo<C24410OooO0Oo> c20481OooOOoo = inProgressShapesView.f65164Oooo000;
            int iOooO0OO = c20481OooOOoo.OooO0OO(pointerId);
            Object[] objArr = c20481OooOOoo.f58482OooO0OO;
            Object obj = objArr[iOooO0OO];
            c20481OooOOoo.f58481OooO0O0[iOooO0OO] = pointerId;
            objArr[iOooO0OO] = c24410OooO0Oo;
            c25927OooOo.f88507OooO0oo.put(c24410OooO0Oo, new Matrix(matrix));
            if (map != null) {
                c25927OooOo.f88499OooO.put(c24410OooO0Oo, map);
            }
            c25927OooOo.f88505OooO0o0 = pointerId;
            c25927OooOo.f88504OooO0o = c24410OooO0Oo;
        }
    }
}
