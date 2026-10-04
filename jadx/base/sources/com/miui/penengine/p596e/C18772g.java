package com.miui.penengine.p596e;

import android.content.Context;
import com.huawei.hms.network.embedded.C18374u4;
import com.miui.penengine.estimate.MiuiMotionEventInfo;
import com.miui.penengine.p594c.C18759b;
import dalvik.system.PathClassLoader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.miui.penengine.e.g */
/* JADX INFO: loaded from: classes9.dex */
public class C18772g implements InterfaceC18768c {

    /* JADX INFO: renamed from: a */
    public static final String f57224a = "g";

    /* JADX INFO: renamed from: b */
    public static final String f57225b = "com.miui.penengine.impl.algorithm.estimate.EstimateFacade";

    /* JADX INFO: renamed from: c */
    public static Class<?> f57226c;

    /* JADX INFO: renamed from: d */
    public static Method f57227d;

    /* JADX INFO: renamed from: e */
    public static Method f57228e;

    /* JADX INFO: renamed from: f */
    public static Method f57229f;

    /* JADX INFO: renamed from: g */
    public static Method f57230g;

    /* JADX INFO: renamed from: h */
    public static Method f57231h;

    /* JADX INFO: renamed from: i */
    public static Object f57232i;

    public C18772g() {
        Method method = f57228e;
        if (method == null || f57226c == null) {
            C18759b.m80276b(f57224a, "Method getInstance error, mEstimateGetInstance is null!");
            return;
        }
        try {
            f57232i = method.invoke(null, new Object[0]);
        } catch (Exception e) {
            f57232i = null;
            C25071OooO00o.OooO0O0(e, "Stroke estimate object is unavailable, ", f57224a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m80347a(PathClassLoader pathClassLoader) {
        try {
            Class<?> clsLoadClass = pathClassLoader.loadClass(f57225b);
            f57226c = clsLoadClass;
            Class<?>[] clsArr = {Context.class};
            try {
                f57228e = clsLoadClass.getDeclaredMethod("getInstance", new Class[0]);
                try {
                    f57227d = f57226c.getDeclaredMethod(C18374u4.f56270c, clsArr);
                    try {
                        f57230g = f57226c.getDeclaredMethod("isFeatureEnable", new Class[0]);
                        try {
                            f57229f = f57226c.getDeclaredMethod("setRefreshRate", Float.TYPE);
                            try {
                                f57231h = f57226c.getDeclaredMethod("getEstimateEvent", List.class, List.class);
                                return 0;
                            } catch (NoSuchMethodException e) {
                                C18759b.m80276b(f57224a, "Method getEstimateEvent does not exist, " + e.getMessage());
                                return -1;
                            }
                        } catch (NoSuchMethodException e2) {
                            C18759b.m80276b(f57224a, "Method setRefreshRate does not exist, " + e2.getMessage());
                            return -1;
                        }
                    } catch (NoSuchMethodException e3) {
                        C18759b.m80276b(f57224a, "Method isFeatureEnable does not exist, " + e3.getMessage());
                        return -1;
                    }
                } catch (NoSuchMethodException e4) {
                    C18759b.m80276b(f57224a, "Method init does not exist, " + e4.getMessage());
                    return -1;
                }
            } catch (NoSuchMethodException e5) {
                C18759b.m80276b(f57224a, "Method getInstance does not exist, " + e5.getMessage());
                return -1;
            }
        } catch (Exception e6) {
            C25071OooO00o.OooO0O0(e6, "Estimate class or constructor is unavailable, ", f57224a);
            return -1;
        }
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public void mo80325a(float f) {
        Object obj;
        Method method = f57229f;
        if (method != null && (obj = f57232i) != null) {
            try {
                method.invoke(obj, Float.valueOf(f));
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Set refresh rate fail, ", f57224a);
                return;
            }
        }
        C18759b.m80276b(f57224a, "Method setRefreshRate error, mEstimateSetRefreshRate is null!");
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public void mo80326a(Context context) {
        Object obj;
        Method method = f57227d;
        if (method != null && (obj = f57232i) != null) {
            try {
                method.invoke(obj, context);
                return;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Stroke estimate init fail, ", f57224a);
                return;
            }
        }
        C18759b.m80276b(f57224a, "Method init error, mEstimateInit is null!");
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public boolean mo80327a() {
        Object obj;
        Method method = f57230g;
        if (method != null && (obj = f57232i) != null) {
            try {
                Object objInvoke = method.invoke(obj, new Object[0]);
                if (objInvoke != null) {
                    if (((Boolean) objInvoke).booleanValue()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                C25071OooO00o.OooO0O0(e, "Get feature enable fail, ", f57224a);
                return false;
            }
        }
        C18759b.m80276b(f57224a, "Method isFeatureEnable error, mEstimateIsFeatureEnable is null!");
        return false;
    }

    @Override // com.miui.penengine.p596e.InterfaceC18768c
    /* JADX INFO: renamed from: a */
    public int mo80324a(List<MiuiMotionEventInfo> list, List<MiuiMotionEventInfo> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (f57231h == null || f57232i == null) {
            C18759b.m80276b(f57224a, "Method getEstimateEvent error, mEstimateGetEstimateEvent is null!");
            return -1;
        }
        Iterator<MiuiMotionEventInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getMiuiMotionEvent());
        }
        try {
            Object objInvoke = f57231h.invoke(f57232i, arrayList, arrayList2);
            int iIntValue = objInvoke != null ? ((Integer) objInvoke).intValue() : -10;
            list2.clear();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                list2.add(new MiuiMotionEventInfo(it2.next()));
            }
            return iIntValue;
        } catch (IllegalAccessException e) {
            C18759b.m80276b(f57224a, "Get estimate event fail, IllegalAccessException faults, " + e.getMessage());
            return -10;
        } catch (NullPointerException e2) {
            C18759b.m80276b(f57224a, "Get estimate event fail, NullPointerException faults, " + e2.getMessage());
            return -10;
        } catch (InvocationTargetException e3) {
            C18759b.m80276b(f57224a, "Get estimate event fail, InvocationTargetException faults, " + e3.getTargetException());
            return -10;
        }
    }
}
