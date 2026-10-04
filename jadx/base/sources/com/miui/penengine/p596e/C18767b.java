package com.miui.penengine.p596e;

import android.content.Context;
import android.os.Build;
import com.miui.penengine.estimate.MiuiMotionEventInfo;
import com.miui.penengine.facade.algorithm.JNIPathEstimateInterface;
import com.miui.penengine.p594c.C18759b;
import com.miui.penengine.p595d.C18763c;
import com.miui.penengine.p597f.C18776a;
import com.miui.penengine.p597f.C18781f;
import com.miui.penengine.p597f.C18784i;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.miui.penengine.e.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18767b implements InterfaceC18768c {

    /* JADX INFO: renamed from: f */
    public static final String f57187f = "b";

    /* JADX INFO: renamed from: g */
    public static final boolean f57188g = true;

    /* JADX INFO: renamed from: h */
    public static volatile C18767b f57189h;

    /* JADX INFO: renamed from: a */
    public C18784i f57190a;

    /* JADX INFO: renamed from: b */
    public float f57191b = 120.0f;

    /* JADX INFO: renamed from: c */
    public float f57192c = 1.0f;

    /* JADX INFO: renamed from: d */
    public boolean f57193d = false;

    /* JADX INFO: renamed from: e */
    public boolean f57194e = false;

    /* JADX INFO: renamed from: c */
    public static C18767b m80323c() {
        if (f57189h == null) {
            synchronized (C18767b.class) {
                try {
                    if (f57189h == null) {
                        f57189h = new C18767b();
                    }
                } finally {
                }
            }
        }
        return f57189h;
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public int mo80324a(List<MiuiMotionEventInfo> list, List<MiuiMotionEventInfo> list2) {
        if (!this.f57193d) {
            return -1;
        }
        if (!this.f57194e) {
            return -4;
        }
        if (list == null || list.isEmpty() || list2 == null) {
            C18759b.m80275a(f57187f, "Input error.");
            return -2;
        }
        Iterator<MiuiMotionEventInfo> it = list.iterator();
        while (it.hasNext()) {
            C18763c c18763cM80298a = C18763c.m80298a(it.next());
            if (c18763cM80298a != null) {
                this.f57190a.m80436a(c18763cM80298a);
            }
        }
        C18781f[] c18781fArrM80440d = this.f57190a.m80440d();
        if (c18781fArrM80440d == null) {
            C18759b.m80275a(f57187f, "Output error.");
            return -3;
        }
        list2.clear();
        MiuiMotionEventInfo miuiMotionEventInfo = list.get(list.size() - 1);
        for (C18781f c18781f : c18781fArrM80440d) {
            MiuiMotionEventInfo miuiMotionEventInfo2 = new MiuiMotionEventInfo(c18781f.m80410b(), c18781f.m80412c(), c18781f.m80407a());
            float fDistanceTo = miuiMotionEventInfo2.distanceTo(miuiMotionEventInfo);
            if (fDistanceTo > 300.0f) {
                C18759b.m80279e(f57187f, "Abnormal point, distance: " + fDistanceTo + " x: " + miuiMotionEventInfo2.getX() + " y: " + miuiMotionEventInfo2.getY());
            } else {
                list2.add(new MiuiMotionEventInfo(c18781f.m80410b(), c18781f.m80412c(), c18781f.m80407a()));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public float m80328b() {
        return this.f57192c;
    }

    /* JADX INFO: renamed from: d */
    public float m80330d() {
        return this.f57191b;
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public void mo80326a(Context context) {
        if (this.f57193d) {
            C18759b.m80277c(f57187f, "Init repeat");
            return;
        }
        C18784i c18784i = new C18784i(context);
        this.f57190a = c18784i;
        c18784i.m80434a(37);
        this.f57193d = true;
    }

    /* JADX INFO: renamed from: b */
    public void m80329b(float f) {
        this.f57192c = f;
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public boolean mo80327a() {
        this.f57194e = C18776a.m80369a(Build.DEVICE) && JNIPathEstimateInterface.isEstimateSystemSoEnable();
        C18759b.m80275a(f57187f, "Now enable is " + this.f57194e);
        return this.f57194e;
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public void mo80325a(float f) {
        this.f57191b = f;
    }
}
