package com.miui.penengine.estimate;

import OooOoO.C20509OooO0oo;
import android.view.MotionEvent;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p594c.C18760c;
import com.miui.penengine.p595d.C18762b;
import com.miui.penengine.p595d.C18765e;
import com.miui.penengine.p595d.InterfaceC18761a;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiMotionEventInfo {
    public static final float DEFAULT_ORIENTATION = 0.7853982f;
    public static final float DEFAULT_PRESSURE = 1.0f;
    public static final float DEFAULT_TILT = 0.5f;
    private InterfaceC18761a miuiMotionEvent;

    public MiuiMotionEventInfo(float f, float f2, long j) {
        this(f, f2, j, 2);
    }

    public static MiuiMotionEventInfo createByMotionEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 2 && action != 0 && action != 1) {
            return null;
        }
        boolean z = motionEvent.getToolType(0) == 1;
        return new MiuiMotionEventInfo(motionEvent.getX(), motionEvent.getY(), motionEvent.getEventTime(), z ? 1.0f : motionEvent.getPressure(), z ? 0.5f : motionEvent.getAxisValue(25), z ? 0.7853982f : motionEvent.getOrientation(), motionEvent.getAction(), false);
    }

    public float distanceTo(MiuiMotionEventInfo miuiMotionEventInfo) {
        if (miuiMotionEventInfo == null) {
            return 0.0f;
        }
        return (float) C18760c.m80280a(miuiMotionEventInfo.getX(), miuiMotionEventInfo.getY(), getX(), getY());
    }

    public Object getMiuiMotionEvent() {
        if (C18756b.m80257h()) {
            return this.miuiMotionEvent.mo80293e();
        }
        return null;
    }

    public int getMotionAction() {
        return this.miuiMotionEvent.mo80295g();
    }

    public float getOrientation() {
        return this.miuiMotionEvent.mo80291c();
    }

    public float getPressure() {
        return this.miuiMotionEvent.mo80290b();
    }

    public float getTilt() {
        return this.miuiMotionEvent.mo80296h();
    }

    public long getTime() {
        return this.miuiMotionEvent.mo80297i();
    }

    public float getX() {
        return this.miuiMotionEvent.mo80289a();
    }

    public float getY() {
        return this.miuiMotionEvent.mo80294f();
    }

    public boolean isHistoryPoint() {
        return this.miuiMotionEvent.mo80292d();
    }

    public float timeDifferenceTo(MiuiMotionEventInfo miuiMotionEventInfo) {
        if (miuiMotionEventInfo == null) {
            return 0.0f;
        }
        return Math.abs(miuiMotionEventInfo.getTime() - getTime());
    }

    public String toString() {
        float x = getX();
        float y = getY();
        long time = getTime();
        float tilt = getTilt();
        float pressure = getPressure();
        int motionAction = getMotionAction();
        boolean zIsHistoryPoint = isHistoryPoint();
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("MiuiMotionEventInfo{x=", x, ", y=", y, ", time=");
        sbOooO0Oo.append(time);
        sbOooO0Oo.append(", pressure=");
        sbOooO0Oo.append(pressure);
        sbOooO0Oo.append(", tilt=");
        sbOooO0Oo.append(tilt);
        sbOooO0Oo.append(", motionAction=");
        sbOooO0Oo.append(motionAction);
        sbOooO0Oo.append(", historyPoint=");
        sbOooO0Oo.append(zIsHistoryPoint);
        sbOooO0Oo.append('}');
        return sbOooO0Oo.toString();
    }

    public MiuiMotionEventInfo(float f, float f2, long j, float f3, float f4, float f5, int i, boolean z) {
        if (C18756b.m80257h()) {
            this.miuiMotionEvent = new C18765e(f, f2, j, f3, f4, f5, i, z);
        } else {
            this.miuiMotionEvent = new C18762b(f, f2, j, f3, f4, f5, i, z);
        }
    }

    public static MiuiMotionEventInfo createByMotionEvent(MotionEvent motionEvent, int i) {
        if (motionEvent.getAction() != 2) {
            return null;
        }
        boolean z = motionEvent.getToolType(0) == 1;
        return new MiuiMotionEventInfo(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i), motionEvent.getHistoricalEventTime(i), z ? 1.0f : motionEvent.getHistoricalPressure(i), z ? 0.5f : motionEvent.getHistoricalAxisValue(25, i), z ? 0.7853982f : motionEvent.getHistoricalOrientation(i), 2, true);
    }

    public MiuiMotionEventInfo(float f, float f2, long j, int i) {
        this(f, f2, j, 1.0f, 0.5f, 0.7853982f, i, false);
    }

    public MiuiMotionEventInfo(Object obj) {
        if (C18756b.m80257h()) {
            this.miuiMotionEvent = new C18765e(obj);
        }
    }
}
