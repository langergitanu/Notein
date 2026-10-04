package o00o0Ooo;

import java.util.Arrays;

/* JADX INFO: renamed from: o00o0Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25431OooO0oo {

    /* JADX INFO: renamed from: o00o0Ooo.OooO0oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f86701OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C19702OooO00o f86702OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C19702OooO00o f86703OooO0OO;

        /* JADX INFO: renamed from: o00o0Ooo.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19702OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public String f86704OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public Object f86705OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public C19702OooO00o f86706OooO0OO;
        }

        public OooO00o(String str) {
            C19702OooO00o c19702OooO00o = new C19702OooO00o();
            this.f86702OooO0O0 = c19702OooO00o;
            this.f86703OooO0OO = c19702OooO00o;
            this.f86701OooO00o = str;
        }

        public final void OooO00o(String str, int i) {
            OooO0OO(String.valueOf(i), str);
        }

        public final void OooO0O0(String str, boolean z) {
            OooO0OO(String.valueOf(z), str);
        }

        public final void OooO0OO(Object obj, String str) {
            C19702OooO00o c19702OooO00o = new C19702OooO00o();
            this.f86703OooO0OO.f86706OooO0OO = c19702OooO00o;
            this.f86703OooO0OO = c19702OooO00o;
            c19702OooO00o.f86705OooO0O0 = obj;
            c19702OooO00o.f86704OooO00o = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f86701OooO00o);
            sb.append('{');
            C19702OooO00o c19702OooO00o = this.f86702OooO0O0.f86706OooO0OO;
            String str = "";
            while (c19702OooO00o != null) {
                Object obj = c19702OooO00o.f86705OooO0O0;
                sb.append(str);
                String str2 = c19702OooO00o.f86704OooO00o;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                c19702OooO00o = c19702OooO00o.f86706OooO0OO;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean OooO00o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static OooO00o OooO0O0(Object obj) {
        return new OooO00o(obj.getClass().getSimpleName());
    }
}
