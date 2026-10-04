package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.OooOo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21796OooOOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile C21796OooOOOo f64454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C21796OooOOOo f64455OooO0OO = new C21796OooOOOo(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<OooO00o, OooOo.C21801OooO0o0<?, ?>> f64456OooO00o;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOOOo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC21822OoooO0 f64457OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f64458OooO0O0;

        public OooO00o(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0) {
            this.f64457OooO00o = interfaceC21822OoooO0;
            this.f64458OooO0O0 = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f64457OooO00o == oooO00o.f64457OooO00o && this.f64458OooO0O0 == oooO00o.f64458OooO0O0;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f64457OooO00o) * 65535) + this.f64458OooO0O0;
        }
    }

    public C21796OooOOOo() {
        this.f64456OooO00o = new HashMap();
    }

    public static C21796OooOOOo OooO00o() {
        C21796OooOOOo c21796OooOOOo;
        C21834OooooOO c21834OooooOO = C21834OooooOO.f64546OooO0OO;
        C21796OooOOOo c21796OooOOOo2 = f64454OooO0O0;
        if (c21796OooOOOo2 != null) {
            return c21796OooOOOo2;
        }
        synchronized (C21796OooOOOo.class) {
            try {
                c21796OooOOOo = f64454OooO0O0;
                if (c21796OooOOOo == null) {
                    Class<?> cls = OooOOOO.f64453OooO00o;
                    C21796OooOOOo c21796OooOOOo3 = null;
                    if (cls != null) {
                        try {
                            c21796OooOOOo3 = (C21796OooOOOo) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c21796OooOOOo = c21796OooOOOo3 != null ? c21796OooOOOo3 : f64455OooO0OO;
                    f64454OooO0O0 = c21796OooOOOo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c21796OooOOOo;
    }

    public C21796OooOOOo(int i) {
        this.f64456OooO00o = Collections.EMPTY_MAP;
    }
}
