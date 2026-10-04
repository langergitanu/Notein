package oOO00oo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oOO00oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34406OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20358OooO00o f123390OooO00o = new C20358OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ArrayList<OooO0O0> f123391OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile OooO0O0[] f123392OooO0OO = new OooO0O0[0];

    /* JADX INFO: renamed from: oOO00oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20358OooO00o extends OooO0O0 {
        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO(Exception exc, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooO(exc, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO00o(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooO00o(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO0O0(Exception exc) {
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooO0O0(exc);
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO0OO(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooO0OO(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO0Oo(Throwable th, String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooO0Oo(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO0o0(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooO0o0(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooO0oO(int i, String str, String message) {
            OooOOO0.OooO0oO(message, "message");
            throw new AssertionError();
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooOO0(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooOO0(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooOO0O(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooOO0O(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // oOO00oo.C34406OooO00o.OooO0O0
        public final void OooOO0o(Throwable th, String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            for (OooO0O0 oooO0O0 : C34406OooO00o.f123392OooO0OO) {
                oooO0O0.OooOO0o(th, str, Arrays.copyOf(args, args.length));
            }
        }

        public final void OooOOO0(String str) {
            OooO0O0[] oooO0O0Arr = C34406OooO00o.f123392OooO0OO;
            int length = oooO0O0Arr.length;
            int i = 0;
            while (i < length) {
                OooO0O0 oooO0O0 = oooO0O0Arr[i];
                i++;
                oooO0O0.f123393OooO00o.set(str);
            }
        }
    }

    /* JADX INFO: renamed from: oOO00oo.OooO00o$OooO0O0 */
    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadLocal<String> f123393OooO00o = new ThreadLocal<>();

        public void OooO(Exception exc, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(2, exc, "handleTouchEventWithInk failed", Arrays.copyOf(args, args.length));
        }

        public void OooO00o(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void OooO0O0(Exception exc) {
            OooO0oo(6, exc, null, new Object[0]);
        }

        public void OooO0OO(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void OooO0Oo(Throwable th, String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(6, th, str, Arrays.copyOf(args, args.length));
        }

        public boolean OooO0o(int i) {
            return true;
        }

        public void OooO0o0(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(4, null, str, Arrays.copyOf(args, args.length));
        }

        public abstract void OooO0oO(int i, String str, String str2);

        public final void OooO0oo(int i, Throwable th, String str, Object... objArr) {
            ThreadLocal<String> threadLocal = this.f123393OooO00o;
            String str2 = threadLocal.get();
            if (str2 != null) {
                threadLocal.remove();
            }
            if (OooO0o(i)) {
                if (str != null && str.length() != 0) {
                    if (objArr.length != 0) {
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) str);
                        sb.append('\n');
                        StringWriter stringWriter = new StringWriter(256);
                        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                        th.printStackTrace(printWriter);
                        printWriter.flush();
                        String string = stringWriter.toString();
                        OooOOO0.OooO0o(string, "sw.toString()");
                        sb.append(string);
                        str = sb.toString();
                    }
                } else {
                    if (th == null) {
                        return;
                    }
                    StringWriter stringWriter2 = new StringWriter(256);
                    PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                    th.printStackTrace(printWriter2);
                    printWriter2.flush();
                    str = stringWriter2.toString();
                    OooOOO0.OooO0o(str, "sw.toString()");
                }
                OooO0oO(i, str2, str);
            }
        }

        public void OooOO0(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void OooOO0O(String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void OooOO0o(Throwable th, String str, Object... args) {
            OooOOO0.OooO0oO(args, "args");
            OooO0oo(5, th, str, Arrays.copyOf(args, args.length));
        }
    }
}
