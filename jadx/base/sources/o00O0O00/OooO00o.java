package o00O0O00;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00O00o.C24806OooO00o;
import o00O00o.C24807OooO0O0;
import o00O00o.C24810OooO0oO;
import o00O00o.EnumC24811OooO0oo;
import o00O00oO.C24816OooO0Oo;
import o00O00oO.C24822OooOO0o;
import o00O00oO.InterfaceC24815OooO0OO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f84207OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC24811OooO0oo f84208OooO00o = EnumC24811OooO0oo.f84151OooOo0o;

    /* JADX INFO: renamed from: o00O0O00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19655OooO00o {
        public static int OooO00o(SidecarDeviceState sidecarDeviceState) {
            OooOOO0.OooO0oO(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) objInvoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public static int OooO0O0(SidecarDeviceState sidecarDeviceState) {
            OooOOO0.OooO0oO(sidecarDeviceState, "sidecarDeviceState");
            int iOooO00o = OooO00o(sidecarDeviceState);
            if (iOooO00o < 0 || iOooO00o > 4) {
                return 0;
            }
            return iOooO00o;
        }

        public static List OooO0OO(SidecarWindowLayoutInfo info) {
            List list;
            C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
            OooOOO0.OooO0oO(info, "info");
            try {
                try {
                    list = info.displayFeatures;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                    OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) objInvoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return list == null ? c34434OooOoO : list;
        }

        public static void OooO0Oo(SidecarDeviceState sidecarDeviceState, int i) {
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
            }
        }
    }

    public OooO00o(int i) {
    }

    public static boolean OooO00o(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (OooOOO0.OooO0O0(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return OooOOO0.OooO0O0(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean OooO0O0(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (OooO00o((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList OooO0OO(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24816OooO0Oo c24816OooO0OoOooO0o0 = OooO0o0((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c24816OooO0OoOooO0o0 != null) {
                arrayList.add(c24816OooO0OoOooO0o0);
            }
        }
        return arrayList;
    }

    public final C24822OooOO0o OooO0Oo(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C24822OooOO0o(C34434OooOoO.f123453OooOo0o);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C19655OooO00o.OooO0Oo(sidecarDeviceState2, C19655OooO00o.OooO0O0(sidecarDeviceState));
        return new C24822OooOO0o(OooO0OO(C19655OooO00o.OooO0OO(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final C24816OooO0Oo OooO0o0(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) {
        C24816OooO0Oo.OooO00o oooO00o;
        InterfaceC24815OooO0OO.OooO0O0 oooO0O0;
        OooOOO0.OooO0oO(feature, "feature");
        C24806OooO00o c24806OooO00o = C24806OooO00o.f84128OooO00o;
        EnumC24811OooO0oo verificationMode = this.f84208OooO00o;
        OooOOO0.OooO0oO(verificationMode, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new C24810OooO0oO(feature, verificationMode, c24806OooO00o).Oooooo0("Type must be either TYPE_FOLD or TYPE_HINGE", OooO0O0.f84209OooOo0o).Oooooo0("Feature bounds must not be 0", OooO0OO.f84210OooOo0o).Oooooo0("TYPE_FOLD must have 0 area", C24830OooO0Oo.f84211OooOo0o).Oooooo0("Feature be pinned to either left or top", C24831OooO0o0.f84214OooOo0o).Oooo0o();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            oooO00o = C24816OooO0Oo.OooO00o.f84166OooO0O0;
        } else {
            if (type != 2) {
                return null;
            }
            oooO00o = C24816OooO0Oo.OooO00o.f84167OooO0OO;
        }
        int iOooO0O0 = C19655OooO00o.OooO0O0(sidecarDeviceState);
        if (iOooO0O0 == 0 || iOooO0O0 == 1) {
            return null;
        }
        if (iOooO0O0 != 2) {
            oooO0O0 = InterfaceC24815OooO0OO.OooO0O0.f84160OooO0O0;
            if (iOooO0O0 != 3 && iOooO0O0 == 4) {
                return null;
            }
        } else {
            oooO0O0 = InterfaceC24815OooO0OO.OooO0O0.f84161OooO0OO;
        }
        Rect rect = feature.getRect();
        OooOOO0.OooO0o(rect, "feature.rect");
        return new C24816OooO0Oo(new C24807OooO0O0(rect), oooO00o, oooO0O0);
    }
}
