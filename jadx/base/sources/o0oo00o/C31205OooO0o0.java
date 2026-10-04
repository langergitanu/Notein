package o0oo00o;

import Oooo0.C20860Ooooooo;
import android.graphics.PointF;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import com.miui.penengine.estimate.MiuiMotionEventInfo;
import com.miui.penengine.estimate.MiuiStrokeEstimate;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0O00oo.OooOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oo00o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31205OooO0o0 implements o0oo00oO.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f111272OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f111273OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f111274OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f111275OooO0Oo;

    public C31205OooO0o0(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        boolean zIsFeatureEnable = MiuiStrokeEstimate.isFeatureEnable(abstractApplicationC26277OooOoOO);
        this.f111272OooO00o = zIsFeatureEnable;
        this.f111273OooO0O0 = new ArrayList();
        this.f111274OooO0OO = new ArrayList();
        this.f111275OooO0Oo = 0.6f;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("XiaomiStrokePrediction");
        c20358OooO00o.OooO00o("XiaomiStrokePredictionCapability initialized, supported: " + zIsFeatureEnable, new Object[0]);
    }

    public static final PointF OooO0Oo(MotionEvent motionEvent, MiuiMotionEventInfo miuiMotionEventInfo, C31205OooO0o0 c31205OooO0o0) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c31205OooO0o0.f111273OooO0O0.clear();
                c31205OooO0o0.f111274OooO0OO.clear();
                return null;
            }
            if (actionMasked == 2) {
                int historySize = motionEvent.getHistorySize();
                for (int i = 0; i < historySize; i++) {
                    MiuiMotionEventInfo miuiMotionEventInfoCreateByMotionEvent = MiuiMotionEventInfo.createByMotionEvent(motionEvent, i);
                    if (miuiMotionEventInfoCreateByMotionEvent != null) {
                        c31205OooO0o0.f111273OooO0O0.add(miuiMotionEventInfoCreateByMotionEvent);
                    }
                }
                if (miuiMotionEventInfo != null) {
                    c31205OooO0o0.f111273OooO0O0.add(miuiMotionEventInfo);
                }
                ArrayList arrayList = c31205OooO0o0.f111274OooO0OO;
                arrayList.clear();
                ArrayList arrayList2 = c31205OooO0o0.f111273OooO0O0;
                int estimateEvent = MiuiStrokeEstimate.getEstimateEvent(arrayList2, arrayList);
                if (estimateEvent == 0 && !arrayList.isEmpty()) {
                    MiuiMotionEventInfo miuiMotionEventInfo2 = (MiuiMotionEventInfo) OooOo.OoooO00(OooOO0.OooO0o((int) (arrayList.size() * c31205OooO0o0.f111275OooO0Oo), 0, arrayList.size() - 1), arrayList);
                    if (miuiMotionEventInfo2 != null) {
                        PointF pointF = new PointF(miuiMotionEventInfo2.getX(), miuiMotionEventInfo2.getY());
                        arrayList2.clear();
                        return pointF;
                    }
                } else if (estimateEvent != 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o, "XiaomiStrokePrediction", "Stroke estimation failed with error code: ", estimateEvent), new Object[0]);
                }
                arrayList2.clear();
                return null;
            }
        } else if (miuiMotionEventInfo != null) {
            c31205OooO0o0.f111273OooO0O0.add(miuiMotionEventInfo);
        }
        return null;
    }

    @Override // o0oo00oO.OooO0o
    public final PointF OooO00o(MotionEvent motionEvent) {
        Object objOooO00o;
        if (!this.f111272OooO00o) {
            return null;
        }
        try {
            objOooO00o = OooO0Oo(motionEvent, MiuiMotionEventInfo.createByMotionEvent(motionEvent), this);
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaomiStrokePrediction");
            c20358OooO00o.OooO0Oo(thOooO00o, "getPointF error", new Object[0]);
        }
        return (PointF) (objOooO00o instanceof C32445OooOOOO.OooO00o ? null : objOooO00o);
    }

    @Override // o0oo00oO.OooO0o
    public final void OooO0O0(View view, int i) {
        Display display;
        OooOOO0.OooO0oO(view, "view");
        if (i == 0 && this.f111272OooO00o && (display = view.getDisplay()) != null) {
            float refreshRate = display.getRefreshRate();
            MiuiStrokeEstimate.setRefreshRate(refreshRate);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("XiaomiStrokePrediction");
            c20358OooO00o.OooO00o("Set refresh rate: " + refreshRate, new Object[0]);
        }
    }

    @Override // o0oo00oO.OooO0o
    public final void OooO0OO(float f) {
        double d = f;
        if (0.0d <= d && d <= 1.0d) {
            this.f111275OooO0Oo = f;
            return;
        }
        this.f111275OooO0Oo = 0.6f;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("XiaomiStrokePrediction");
        c20358OooO00o.OooOO0O("Invalid predictionFactor " + f + ", using default 0.6f", new Object[0]);
    }
}
