package o0oo0;

import OooOoO.C20509OooO0oo;
import android.graphics.PointF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.aspose.slides.C22205OooOOo;
import com.huawei.stylus.penengine.estimate.HwMotionEventInfo;
import com.huawei.stylus.penengine.estimate.HwMotionEventQueue;
import com.huawei.stylus.penengine.estimate.HwStrokeEstimate;
import com.orion.notein.domain.models.cloudsync.CloudSyncCredentialType;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.o0OoOo0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0oo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31181OooO0o0 implements OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HwMotionEventQueue f111214OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f111215OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList<HwMotionEventInfo> f111216OooOoO0;

    public C31181OooO0o0() {
        boolean zIsFeatureEnable = HwStrokeEstimate.isFeatureEnable();
        this.f111215OooOo0o = zIsFeatureEnable;
        Log.d("HwStrokeEstimator", "isSupportEstimate:" + zIsFeatureEnable);
        if (zIsFeatureEnable) {
            this.f111214OooOo = new HwMotionEventQueue();
            this.f111216OooOoO0 = new ArrayList<>();
        } else {
            this.f111214OooOo = null;
            this.f111216OooOoO0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // o0oo0.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF OooO00o(MotionEvent motionEvent) {
        PointF pointF;
        C32443OooOOO c32443OooOOO;
        float f;
        long j;
        float x;
        float y;
        long eventTime;
        long historicalEventTime;
        long jNanoTime;
        long jNanoTime2;
        if (this.f111215OooOo0o) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            motionEvent.getPressure();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                HwMotionEventQueue hwMotionEventQueue = this.f111214OooOo;
                if (actionMasked == 1) {
                    OooOOO0.OooO0Oo(hwMotionEventQueue);
                    hwMotionEventQueue.clear();
                    return null;
                }
                if (actionMasked == 2) {
                    ArrayList<HwMotionEventInfo> arrayList = this.f111216OooOoO0;
                    if (arrayList != null && hwMotionEventQueue != null) {
                        long jNanoTime3 = System.nanoTime();
                        int historySize = motionEvent.getHistorySize();
                        if (historySize > 0) {
                            arrayList.clear();
                            historicalEventTime = 0;
                            for (int i = 0; i < historySize; i++) {
                                arrayList.add(new HwMotionEventInfo(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), motionEvent.getHistoricalPressure(i), motionEvent.getHistoricalAxisValue(25, i), motionEvent.getHistoricalEventTime(i)));
                                historicalEventTime = motionEvent.getHistoricalEventTime(i);
                            }
                            hwMotionEventQueue.fill(arrayList);
                            arrayList.clear();
                            jNanoTime = System.nanoTime();
                            int estimateEvent = HwStrokeEstimate.getEstimateEvent(hwMotionEventQueue.getQueue(), arrayList);
                            jNanoTime2 = System.nanoTime();
                            if (estimateEvent != 0 || arrayList.size() <= 0) {
                                f = y2;
                                pointF = null;
                                j = 0;
                                x = x2;
                                y = f;
                                eventTime = 0;
                            } else {
                                HwMotionEventInfo hwMotionEventInfo = arrayList.get(arrayList.size() - 1);
                                OooOOO0.OooO0o(hwMotionEventInfo, "get(...)");
                                HwMotionEventInfo hwMotionEventInfo2 = hwMotionEventInfo;
                                x = hwMotionEventInfo2.getX();
                                y = hwMotionEventInfo2.getY();
                                f = y2;
                                eventTime = hwMotionEventInfo2.getEventTime();
                                pointF = null;
                                j = 0;
                                StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("predictX: ", x, ", predictY: ", y, ", predictTime: ");
                                sbOooO0Oo.append(eventTime);
                                Log.i("HwStrokeEstimator", sbOooO0Oo.toString());
                            }
                        } else {
                            f = y2;
                            pointF = null;
                            j = 0;
                            x = x2;
                            y = f;
                            eventTime = 0;
                            historicalEventTime = 0;
                            jNanoTime = 0;
                            jNanoTime2 = 0;
                        }
                        long jNanoTime4 = System.nanoTime();
                        long j2 = eventTime > j ? eventTime - historicalEventTime : j;
                        if (arrayList.size() > 0) {
                            int size = arrayList.size();
                            StringBuilder sbOooO00o = o0OoOo0.OooO00o(jNanoTime4 - jNanoTime3, "total cost: ", ", estimate cost:");
                            sbOooO00o.append(jNanoTime2 - jNanoTime);
                            sbOooO00o.append(", predict count:");
                            sbOooO00o.append(size);
                            C22205OooOOo.OooO0OO(j2, ", predict period:", ", dx:", sbOooO00o);
                            sbOooO00o.append(x - x2);
                            sbOooO00o.append(", dy:");
                            sbOooO00o.append(y - f);
                            Log.d("HwStrokeEstimator", sbOooO00o.toString());
                            c32443OooOOO = new C32443OooOOO(Float.valueOf(x), Float.valueOf(y));
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
        if (i == 0 && this.f111215OooOo0o) {
            float refreshRate = changedView.getDisplay().getRefreshRate();
            HwStrokeEstimate.setRefreshRate(refreshRate);
            Log.d("HwStrokeEstimator", "refresh rate: " + refreshRate);
        }
    }

    @Override // o0oo0.OooO0o
    public final void OooO0OO(float f) {
    }

    @Override // o0oo0.OooO0o
    public final String getTypeName() {
        return CloudSyncCredentialType.HUAWEI;
    }
}
