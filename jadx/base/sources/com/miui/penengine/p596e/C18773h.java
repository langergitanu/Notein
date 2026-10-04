package com.miui.penengine.p596e;

import android.view.MotionEvent;
import androidx.core.view.InputDeviceCompat;

/* JADX INFO: renamed from: com.miui.penengine.e.h */
/* JADX INFO: loaded from: classes9.dex */
public class C18773h {

    /* JADX INFO: renamed from: c */
    public static final String f57233c = "h";

    /* JADX INFO: renamed from: a */
    public int f57234a = 0;

    /* JADX INFO: renamed from: b */
    public C18769d f57235b = null;

    /* JADX INFO: renamed from: a */
    public boolean m80350a(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & InputDeviceCompat.SOURCE_JOYSTICK) != 16777232 || motionEvent.getAction() != 2) {
            return false;
        }
        int axisValue = (int) (motionEvent.getAxisValue(17) * 360.0f);
        this.f57234a = axisValue;
        C18769d c18769d = this.f57235b;
        if (c18769d == null) {
            return true;
        }
        c18769d.m80333a(axisValue);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m80348a() {
        return this.f57234a;
    }

    /* JADX INFO: renamed from: a */
    public void m80349a(C18769d c18769d) {
        this.f57235b = c18769d;
    }
}
