package o000O0oo;

import android.graphics.Matrix;
import android.view.MotionEvent;
import androidx.ink.strokes.C21970OooO0oo;
import androidx.ink.strokes.MutableStrokeInputBatchNative;
import androidx.ink.strokes.StrokeInput;
import java.util.concurrent.ConcurrentLinkedQueue;
import o000OO00.C24478Oooo00o;
import oO00ooO.C32446OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentLinkedQueue<StrokeInput> f82471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f82472OooO0O0;

    public Oooo000(int i) {
        ConcurrentLinkedQueue<StrokeInput> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        for (int i2 = 0; i2 < 15; i2++) {
            concurrentLinkedQueue.add(new StrokeInput());
        }
        this.f82471OooO00o = concurrentLinkedQueue;
        this.f82472OooO0O0 = new float[2];
    }

    public static float OooO00o(int i, int i2, MotionEvent motionEvent, int i3) {
        return i3 == motionEvent.getHistorySize() ? motionEvent.getAxisValue(i, i2) : motionEvent.getHistoricalAxisValue(i, i2, i3);
    }

    public final void OooO0O0(MotionEvent motionEvent, int i, Matrix matrix, long j, float f, Boolean bool, Boolean bool2, Boolean bool3, C21970OooO0oo outBatch) {
        MotionEvent event = motionEvent;
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        kotlin.jvm.internal.OooOOO0.OooO0oO(outBatch, "outBatch");
        MutableStrokeInputBatchNative.f65459OooO00o.clear(outBatch.OooO0O0());
        int historySize = event.getHistorySize();
        if (historySize < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            StrokeInput strokeInputOooO0OO = OooO0OO(event, i, i3, matrix, j, f, bool, bool2, bool3);
            try {
                outBatch.OooO0oo(strokeInputOooO0OO);
            } catch (Throwable th) {
                C32446OooOOOo.OooO00o(th);
            }
            this.f82471OooO00o.offer(strokeInputOooO0OO);
            if (i3 == historySize) {
                return;
            }
            i2 = i3 + 1;
            event = motionEvent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StrokeInput OooO0OO(MotionEvent motionEvent, int i, int i2, Matrix matrix, long j, float f, Boolean bool, Boolean bool2, Boolean bool3) {
        C24478Oooo00o toolType;
        float fOooO00o = OooO00o(0, i, motionEvent, i2);
        float[] fArr = this.f82472OooO0O0;
        fArr[0] = fOooO00o;
        fArr[1] = OooO00o(1, i, motionEvent, i2);
        matrix.mapPoints(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        long eventTime = (i2 == motionEvent.getHistorySize() ? motionEvent.getEventTime() : motionEvent.getHistoricalEventTime(i2)) - j;
        int toolType2 = motionEvent.getToolType(i);
        if (toolType2 == 2) {
            toolType = C24478Oooo00o.f82775OooO0oO;
        } else if (toolType2 == 3) {
            toolType = C24478Oooo00o.f82774OooO0o0;
        } else if (toolType2 != 4) {
            toolType = C24478Oooo00o.f82773OooO0o;
        }
        float f4 = -1.0f;
        float fOooO0o0 = (motionEvent.getToolType(i) != 2 || kotlin.jvm.internal.OooOOO0.OooO0O0(bool, Boolean.FALSE) || (bool == null && (motionEvent.getDevice() == null || motionEvent.getDevice().getMotionRange(2, motionEvent.getSource()) == null))) ? -1.0f : oO0O00oo.OooOO0.OooO0o0(OooO00o(2, i, motionEvent, i2), 0.0f, 1.0f);
        float fOooO0o02 = (motionEvent.getToolType(i) != 2 || kotlin.jvm.internal.OooOOO0.OooO0O0(bool2, Boolean.FALSE) || (bool2 == null && (motionEvent.getDevice() == null || motionEvent.getDevice().getMotionRange(25, motionEvent.getSource()) == null))) ? -1.0f : oO0O00oo.OooOO0.OooO0o0(OooO00o(25, i, motionEvent, i2), 0.0f, 1.5707964f);
        if (motionEvent.getToolType(i) == 2 && !kotlin.jvm.internal.OooOOO0.OooO0O0(bool3, Boolean.FALSE) && (bool3 != null || (motionEvent.getDevice() != null && motionEvent.getDevice().getMotionRange(8, motionEvent.getSource()) != null))) {
            float fOooO00o2 = (OooO00o(8, i, motionEvent, i2) + 7.853982f) % 6.2831855f;
            if (fOooO00o2 != 0.0f && Math.signum(fOooO00o2) != Math.signum(6.2831855f)) {
                fOooO00o2 += 6.2831855f;
            }
            f4 = fOooO00o2;
        }
        float f5 = f4;
        kotlin.jvm.internal.OooOOO0.OooO0oO(toolType, "toolType");
        StrokeInput strokeInputPoll = this.f82471OooO00o.poll();
        if (strokeInputPoll == null) {
            strokeInputPoll = new StrokeInput();
        }
        StrokeInput strokeInput = strokeInputPoll;
        strokeInput.OooO00o(f2, f3, f, fOooO0o0, fOooO0o02, f5, eventTime, toolType);
        return strokeInput;
    }
}
