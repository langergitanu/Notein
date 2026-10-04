package o00O0O0o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f84255OooO00o;

    public static class OooO00o extends OooOO0O {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f84256OooO0O0;

        public OooO00o(int i) {
            this.f84256OooO0O0 = i;
        }

        @Override // o00O0O0o.OooOO0O
        public final void OooO00o(String str, String str2, Throwable... thArr) {
            if (this.f84256OooO0O0 <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // o00O0O0o.OooOO0O
        public final void OooO0O0(String str, String str2, Throwable... thArr) {
            if (this.f84256OooO0O0 <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // o00O0O0o.OooOO0O
        public final void OooO0Oo(String str, String str2, Throwable... thArr) {
            if (this.f84256OooO0O0 <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // o00O0O0o.OooOO0O
        public final void OooO0o(String str, String str2, Throwable... thArr) {
            if (this.f84256OooO0O0 <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized OooOO0O OooO0OO() {
        try {
            if (f84255OooO00o == null) {
                f84255OooO00o = new OooO00o(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f84255OooO00o;
    }

    public static String OooO0o0(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void OooO00o(String str, String str2, Throwable... thArr);

    public abstract void OooO0O0(String str, String str2, Throwable... thArr);

    public abstract void OooO0Oo(String str, String str2, Throwable... thArr);

    public abstract void OooO0o(String str, String str2, Throwable... thArr);
}
