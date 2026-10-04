package o0oo0;

import OooOoO.C20509OooO0oo;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.aspose.slides.C22205OooOOo;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.o0OoOo0;
import o0O00000.C25828OooO0Oo;
import o0O00000.C25829OooO0o0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0oo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31180OooO0Oo implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0O00000.OooO0O0 f111211OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f111212OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList<o0O00000.OooO00o> f111213OooOoO0;

    public C31180OooO0Oo() {
        boolean zOooO00o = C25828OooO0Oo.OooO00o();
        this.f111212OooOo0o = zOooO00o;
        Log.d("HnStrokeEstimator", "isSupportEstimate:" + zOooO00o);
        if (zOooO00o) {
            this.f111211OooOo = new o0O00000.OooO0O0();
            this.f111213OooOoO0 = new ArrayList<>();
        } else {
            this.f111211OooOo = null;
            this.f111213OooOoO0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // o0oo0.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF OooO00o(MotionEvent motionEvent) {
        PointF pointF;
        C32443OooOOO c32443OooOOO;
        float f;
        long j;
        float f2;
        float f3;
        long j2;
        long historicalEventTime;
        long jNanoTime;
        long jNanoTime2;
        int iOooO0O0;
        if (this.f111212OooOo0o) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            motionEvent.getPressure();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    o0O00000.OooO0O0 oooO0O0 = this.f111211OooOo;
                    OooOOO0.OooO0Oo(oooO0O0);
                    o0O00000.OooO0OO oooO0OO = oooO0O0.f88122OooO00o;
                    if (oooO0OO != null) {
                        oooO0OO.OooO00o();
                        return null;
                    }
                    Log.e(o0O00000.OooO0O0.f88121OooO0O0, "HnMotionEventQueue, clear error, mRecycleQueue is null!");
                    return null;
                }
                if (actionMasked == 2) {
                    if (this.f111213OooOoO0 != null && this.f111211OooOo != null) {
                        long jNanoTime3 = System.nanoTime();
                        int historySize = motionEvent.getHistorySize();
                        if (historySize > 0) {
                            this.f111213OooOoO0.clear();
                            historicalEventTime = 0;
                            for (int i = 0; i < historySize; i++) {
                                this.f111213OooOoO0.add(new o0O00000.OooO00o(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), motionEvent.getHistoricalPressure(i), motionEvent.getHistoricalAxisValue(25, i), motionEvent.getHistoricalEventTime(i)));
                                historicalEventTime = motionEvent.getHistoricalEventTime(i);
                            }
                            o0O00000.OooO0O0 oooO0O02 = this.f111211OooOo;
                            ArrayList<o0O00000.OooO00o> arrayList = this.f111213OooOoO0;
                            o0O00000.OooO0OO oooO0OO2 = oooO0O02.f88122OooO00o;
                            if (oooO0OO2 != null) {
                                oooO0OO2.OooO0OO(arrayList);
                            } else {
                                Log.e(o0O00000.OooO0O0.f88121OooO0O0, "HnMotionEventQueue, fill error, mRecycleQueue is null!");
                            }
                            this.f111213OooOoO0.clear();
                            jNanoTime = System.nanoTime();
                            o0O00000.OooO0OO oooO0OO3 = this.f111211OooOo.f88122OooO00o;
                            ArrayList<o0O00000.OooO00o> arrayList2 = this.f111213OooOoO0;
                            String str = C25828OooO0Oo.f88124OooO00o;
                            synchronized (C25828OooO0Oo.class) {
                                C25829OooO0o0 c25829OooO0o0 = C25828OooO0Oo.f88125OooO0O0;
                                if (c25829OooO0o0 != null) {
                                    iOooO0O0 = c25829OooO0o0.OooO0O0(oooO0OO3, arrayList2);
                                } else {
                                    Log.e(C25828OooO0Oo.f88124OooO00o, "HnStrokeEstimate, getEstimateEvent error, sEstimate is null!");
                                    iOooO0O0 = -1;
                                }
                            }
                            jNanoTime2 = System.nanoTime();
                            if (iOooO0O0 != 0 || this.f111213OooOoO0.size() <= 0) {
                                f = y;
                                pointF = null;
                                j = 0;
                                f2 = x;
                                f3 = f;
                                j2 = 0;
                            } else {
                                o0O00000.OooO00o oooO00o = this.f111213OooOoO0.get(r0.size() - 1);
                                OooOOO0.OooO0o(oooO00o, "get(...)");
                                o0O00000.OooO00o oooO00o2 = oooO00o;
                                f2 = oooO00o2.f88116OooO00o;
                                f3 = oooO00o2.f88117OooO0O0;
                                f = y;
                                pointF = null;
                                j2 = oooO00o2.f88120OooO0o0;
                                j = 0;
                                StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("predictX: ", f2, ", predictY: ", f3, ", predictTime: ");
                                sbOooO0Oo.append(j2);
                                Log.i("HnStrokeEstimator", sbOooO0Oo.toString());
                            }
                        } else {
                            f = y;
                            pointF = null;
                            j = 0;
                            f2 = x;
                            f3 = f;
                            j2 = 0;
                            historicalEventTime = 0;
                            jNanoTime = 0;
                            jNanoTime2 = 0;
                        }
                        long jNanoTime4 = System.nanoTime();
                        long j3 = j2 > j ? j2 - historicalEventTime : j;
                        if (this.f111213OooOoO0.size() > 0) {
                            int size = this.f111213OooOoO0.size();
                            StringBuilder sbOooO00o = o0OoOo0.OooO00o(jNanoTime4 - jNanoTime3, "total cost: ", ", estimate cost:");
                            sbOooO00o.append(jNanoTime2 - jNanoTime);
                            sbOooO00o.append(", predict count:");
                            sbOooO00o.append(size);
                            C22205OooOOo.OooO0OO(j3, ", predict period:", ", dx:", sbOooO00o);
                            sbOooO00o.append(f2 - x);
                            sbOooO00o.append(", dy:");
                            sbOooO00o.append(f3 - f);
                            Log.d("HnStrokeEstimator", sbOooO00o.toString());
                            c32443OooOOO = new C32443OooOOO(Float.valueOf(f2), Float.valueOf(f3));
                        }
                        return c32443OooOOO == 0 ? new PointF(((Number) c32443OooOOO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOO.f116637OooOo).floatValue()) : pointF;
                    }
                    pointF = null;
                    c32443OooOOO = pointF;
                    if (c32443OooOOO == 0) {
                    }
                }
            }
        }
        return null;
    }

    @Override // o0oo0.OooO0o
    public final void OooO0O0(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
        if (i == 0 && this.f111212OooOo0o) {
            float refreshRate = changedView.getDisplay().getRefreshRate();
            String str = C25828OooO0Oo.f88124OooO00o;
            synchronized (C25828OooO0Oo.class) {
                C25829OooO0o0 c25829OooO0o0 = C25828OooO0Oo.f88125OooO0O0;
                if (c25829OooO0o0 != null) {
                    c25829OooO0o0.OooO0Oo(refreshRate);
                } else {
                    Log.e(C25828OooO0Oo.f88124OooO00o, "HnStrokeEstimate, setRefreshRate error, sEstimate is null!");
                }
            }
            Log.d("HnStrokeEstimator", "refresh rate: " + refreshRate);
        }
    }

    @Override // o0oo0.OooO0o
    public final void OooO0OO(float f) {
    }

    @Override // o0oo0.OooO0o
    public final String getTypeName() {
        return "honor";
    }
}
