package oO0O;

import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.HashMap;
import oO0O.OooO00o;
import oO0O0o0O.C32718OooO0O0;
import oO0OOo.C33036OooO0o;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import ooOOO0Oo.C35048OooOoo0;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements InterfaceC35196OooOOo0.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final boolean f116756OooO = TelemetryEventStrings.Value.TRUE.equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final HashMap f116757OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f116758OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f116759OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f116760OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String[] f116761OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String[] f116762OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String[] f116763OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO00o.EnumC20235OooO00o f116764OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String[] f116765OooO0oo;

    public static abstract class OooO00o implements InterfaceC35196OooOOo0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f116766OooO00o = new ArrayList();

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0O0
        public final void OooO00o() {
            OooO0o((String[]) this.f116766OooO00o.toArray(new String[0]));
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0O0
        public final void OooO0O0(C33036OooO0o c33036OooO0o) {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0O0
        public final InterfaceC35196OooOOo0.OooO00o OooO0OO(C33476OooO0O0 c33476OooO0O0) {
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0O0
        public final void OooO0Oo(Object obj) {
            if (obj instanceof String) {
                this.f116766OooO00o.add((String) obj);
            }
        }

        public abstract void OooO0o(String[] strArr);

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0O0
        public final void OooO0o0(C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o) {
        }
    }

    /* JADX INFO: renamed from: oO0O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C20236OooO0O0 implements InterfaceC35196OooOOo0.OooO00o {
        public C20236OooO0O0() {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO00o() {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0O0(C33479OooO0o c33479OooO0o, Object obj) {
            String strOooO0O0 = c33479OooO0o.OooO0O0();
            boolean zEquals = "k".equals(strOooO0O0);
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    OooO00o.EnumC20235OooO00o enumC20235OooO00o = (OooO00o.EnumC20235OooO00o) OooO00o.EnumC20235OooO00o.f116747OooOo.get((Integer) obj);
                    if (enumC20235OooO00o == null) {
                        enumC20235OooO00o = OooO00o.EnumC20235OooO00o.UNKNOWN;
                    }
                    oooO0O0.f116764OooO0oO = enumC20235OooO00o;
                    return;
                }
                return;
            }
            if ("mv".equals(strOooO0O0)) {
                if (obj instanceof int[]) {
                    oooO0O0.f116758OooO00o = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strOooO0O0)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    oooO0O0.f116759OooO0O0 = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strOooO0O0)) {
                if (obj instanceof Integer) {
                    oooO0O0.f116760OooO0OO = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strOooO0O0) && (obj instanceof String) && !((String) obj).isEmpty()) {
                oooO0O0.getClass();
            }
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final InterfaceC35196OooOOo0.OooO0O0 OooO0OO(C33479OooO0o c33479OooO0o) {
            String strOooO0O0 = c33479OooO0o.OooO0O0();
            if ("d1".equals(strOooO0O0)) {
                return new oO0O.OooO0OO(this);
            }
            if ("d2".equals(strOooO0O0)) {
                return new C32494OooO0Oo(this);
            }
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0Oo(C33479OooO0o c33479OooO0o, C33036OooO0o c33036OooO0o) {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final InterfaceC35196OooOOo0.OooO00o OooO0o(C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o) {
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0o0(C33479OooO0o c33479OooO0o, C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o2) {
        }
    }

    public class OooO0OO implements InterfaceC35196OooOOo0.OooO00o {
        public OooO0OO() {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO00o() {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0O0(C33479OooO0o c33479OooO0o, Object obj) {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final InterfaceC35196OooOOo0.OooO0O0 OooO0OO(C33479OooO0o c33479OooO0o) {
            if ("b".equals(c33479OooO0o.OooO0O0())) {
                return new C32495OooO0o0(this);
            }
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0Oo(C33479OooO0o c33479OooO0o, C33036OooO0o c33036OooO0o) {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final InterfaceC35196OooOOo0.OooO00o OooO0o(C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o) {
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0o0(C33479OooO0o c33479OooO0o, C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o2) {
        }
    }

    /* JADX INFO: renamed from: oO0O.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public class C32493OooO0Oo implements InterfaceC35196OooOOo0.OooO00o {
        public C32493OooO0Oo() {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO00o() {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0O0(C33479OooO0o c33479OooO0o, Object obj) {
            String strOooO0O0 = c33479OooO0o.OooO0O0();
            boolean zEquals = "version".equals(strOooO0O0);
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    oooO0O0.f116758OooO00o = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strOooO0O0)) {
                oooO0O0.f116759OooO0O0 = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final InterfaceC35196OooOOo0.OooO0O0 OooO0OO(C33479OooO0o c33479OooO0o) {
            String strOooO0O0 = c33479OooO0o.OooO0O0();
            if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(strOooO0O0) || "filePartClassNames".equals(strOooO0O0)) {
                return new OooO0o(this);
            }
            if ("strings".equals(strOooO0O0)) {
                return new C32496OooO0oO(this);
            }
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0Oo(C33479OooO0o c33479OooO0o, C33036OooO0o c33036OooO0o) {
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final InterfaceC35196OooOOo0.OooO00o OooO0o(C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o) {
            return null;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO00o
        public final void OooO0o0(C33479OooO0o c33479OooO0o, C33476OooO0O0 c33476OooO0O0, C33479OooO0o c33479OooO0o2) {
        }
    }

    static {
        HashMap map = new HashMap();
        f116757OooOO0 = map;
        map.put(C33476OooO0O0.OooOO0(new C33477OooO0OO("kotlin.jvm.internal.KotlinClass")), OooO00o.EnumC20235OooO00o.CLASS);
        map.put(C33476OooO0O0.OooOO0(new C33477OooO0OO("kotlin.jvm.internal.KotlinFileFacade")), OooO00o.EnumC20235OooO00o.FILE_FACADE);
        map.put(C33476OooO0O0.OooOO0(new C33477OooO0OO("kotlin.jvm.internal.KotlinMultifileClass")), OooO00o.EnumC20235OooO00o.MULTIFILE_CLASS);
        map.put(C33476OooO0O0.OooOO0(new C33477OooO0OO("kotlin.jvm.internal.KotlinMultifileClassPart")), OooO00o.EnumC20235OooO00o.MULTIFILE_CLASS_PART);
        map.put(C33476OooO0O0.OooOO0(new C33477OooO0OO("kotlin.jvm.internal.KotlinSyntheticClass")), OooO00o.EnumC20235OooO00o.SYNTHETIC_CLASS);
    }

    @Override // ooo0o.InterfaceC35196OooOOo0.OooO0OO
    public final void OooO00o() {
    }

    @Override // ooo0o.InterfaceC35196OooOOo0.OooO0OO
    public final InterfaceC35196OooOOo0.OooO00o OooO0O0(C33476OooO0O0 c33476OooO0O0, C32718OooO0O0 c32718OooO0O0) {
        OooO00o.EnumC20235OooO00o enumC20235OooO00o;
        C33477OooO0OO c33477OooO0OOOooO0O0 = c33476OooO0O0.OooO0O0();
        if (c33477OooO0OOOooO0O0.equals(C35048OooOoo0.f125851OooO00o)) {
            return new C20236OooO0O0();
        }
        if (c33477OooO0OOOooO0O0.equals(C35048OooOoo0.f125864OooOOOO)) {
            return new OooO0OO();
        }
        if (f116756OooO || this.f116764OooO0oO != null || (enumC20235OooO00o = (OooO00o.EnumC20235OooO00o) f116757OooOO0.get(c33476OooO0O0)) == null) {
            return null;
        }
        this.f116764OooO0oO = enumC20235OooO00o;
        return new C32493OooO0Oo();
    }
}
