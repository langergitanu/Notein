package o0oo0O0;

import android.graphics.PointF;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import com.lenovo.api.stylusprediction.LRPenPrediction;
import com.lenovo.api.stylusprediction.TouchPointP;
import kotlin.jvm.internal.OooOOO0;
import o00o0Ooo.C25432OooOO0;
import o0oo0.OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oo0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31220OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static C25432OooOO0 f111344OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f111345OooOo0o;

    @Override // o0oo0.OooO0o
    public final PointF OooO00o(MotionEvent motionEvent) {
        C25432OooOO0 c25432OooOO0;
        if ((motionEvent.getToolType(motionEvent.getActionIndex()) == 2) && (c25432OooOO0 = f111344OooOo) != null) {
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                ((LRPenPrediction) c25432OooOO0.f86707OooO00o).clearPoints();
                return null;
            }
            if (action == 2) {
                int historySize = motionEvent.getHistorySize();
                for (int i = 0; i < historySize; i++) {
                    float historicalX = motionEvent.getHistoricalX(i);
                    float historicalY = motionEvent.getHistoricalY(i);
                    if (motionEvent.getPressure() > 0.0f) {
                        ((LRPenPrediction) c25432OooOO0.f86707OooO00o).addPoint(new TouchPointP(historicalX, historicalY, motionEvent.getEventTime(), motionEvent.getPressure()));
                    }
                }
                TouchPointP estimatedPoint = ((LRPenPrediction) c25432OooOO0.f86707OooO00o).getEstimatedPoint();
                PointF pointF = estimatedPoint != null ? new PointF(estimatedPoint.getX(), estimatedPoint.getY()) : null;
                PointF pointF2 = new PointF(motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()));
                if (pointF != null) {
                    float f = this.f111345OooOo0o;
                    float f2 = 1 - f;
                    return new PointF((pointF.x * f) + (pointF2.x * f2), (f * pointF.y) + (f2 * pointF2.y));
                }
            }
        }
        return null;
    }

    @Override // o0oo0.OooO0o
    public final void OooO0O0(View changedView, int i) {
        Display display;
        OooOOO0.OooO0oO(changedView, "changedView");
        if (i != 0 || (display = changedView.getDisplay()) == null) {
            return;
        }
        float refreshRate = display.getRefreshRate();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("LenovoSDKPrediction");
        c20358OooO00o.OooO0o0("Lenovo Estimator refresh rate: " + refreshRate + ".", new Object[0]);
    }

    @Override // o0oo0.OooO0o
    public final void OooO0OO(float f) {
        double d = f;
        if (0.0d > d || d > 1.0d) {
            this.f111345OooOo0o = 0.6f;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LenovoSDKPrediction");
            c20358OooO00o.OooO0OO("predictionFactor must be in 0.0f to 1.0f.", new Object[0]);
            return;
        }
        this.f111345OooOo0o = f;
        C34406OooO00o.f123390OooO00o.OooO00o("predictionFactor set to " + f + ".", new Object[0]);
    }

    @Override // o0oo0.OooO0o
    public final String getTypeName() {
        return "lenovo";
    }
}
