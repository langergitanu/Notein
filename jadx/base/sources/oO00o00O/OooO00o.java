package oO00o00O;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f116250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<Throwable> f116251OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C20216OooO00o f116252OooOoO0;

    /* JADX INFO: renamed from: oO00o00O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20216OooO00o extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class OooO0O0 {
        public abstract void OooO00o(String str);
    }

    public static final class OooO0OO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PrintStream f116253OooO00o;

        public OooO0OO(PrintStream printStream) {
            this.f116253OooO00o = printStream;
        }

        @Override // oO00o00O.OooO00o.OooO0O0
        public final void OooO00o(String str) {
            this.f116253OooO00o.println((Object) str);
        }
    }

    /* JADX INFO: renamed from: oO00o00O.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32326OooO0Oo extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PrintWriter f116254OooO00o;

        public C32326OooO0Oo(PrintWriter printWriter) {
            this.f116254OooO00o = printWriter;
        }

        @Override // oO00o00O.OooO00o.OooO0O0
        public final void OooO00o(String str) {
            this.f116254OooO00o.println((Object) str);
        }
    }

    public OooO00o(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void OooO00o(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            OooO00o(sb, th.getCause(), "");
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f116251OooOo0o) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            OooO00o(sb, th, "\t");
            i++;
        }
        oooO0O0.OooO00o(sb.toString());
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        try {
            if (this.f116252OooOoO0 == null) {
                C20216OooO00o c20216OooO00o = new C20216OooO00o();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f116251OooOo0o.iterator();
                C20216OooO00o c20216OooO00o2 = c20216OooO00o;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = next.getCause();
                        if (cause != null && cause != next) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th : arrayList) {
                            if (hashSet.contains(th)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th);
                            }
                        }
                        try {
                            c20216OooO00o2.initCause(next);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = c20216OooO00o2.getCause();
                        if (cause3 != null && this.f116252OooOoO0 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                }
                                cause3 = cause4;
                            }
                            c20216OooO00o2 = cause3;
                        }
                    }
                }
                this.f116252OooOoO0 = c20216OooO00o;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f116252OooOoO0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f116250OooOo;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        OooO0O0(new OooO0OO(printStream));
    }

    public OooO00o(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof OooO00o) {
                    linkedHashSet.addAll(((OooO00o) th).f116251OooOo0o);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f116251OooOo0o = listUnmodifiableList;
            this.f116250OooOo = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        OooO0O0(new C32326OooO0Oo(printWriter));
    }
}
