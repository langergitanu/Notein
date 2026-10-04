package oOo00o0o;

import com.huawei.hms.network.embedded.C18101a5;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: oOo00o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34554OooO00o extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f123799OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<Throwable> f123800OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Throwable f123801OooOoO0;

    /* JADX INFO: renamed from: oOo00o0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20363OooO00o extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: oOo00o0o.OooO00o$OooO0O0 */
    public static abstract class OooO0O0 {
        public abstract void OooO00o(String str);
    }

    /* JADX INFO: renamed from: oOo00o0o.OooO00o$OooO0OO */
    public static final class OooO0OO extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PrintStream f123802OooO00o;

        public OooO0OO(PrintStream printStream) {
            this.f123802OooO00o = printStream;
        }

        @Override // oOo00o0o.C34554OooO00o.OooO0O0
        public final void OooO00o(String str) {
            this.f123802OooO00o.println((Object) str);
        }
    }

    /* JADX INFO: renamed from: oOo00o0o.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C34555OooO0Oo extends OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final PrintWriter f123803OooO00o;

        public C34555OooO0Oo(PrintWriter printWriter) {
            this.f123803OooO00o = printWriter;
        }

        @Override // oOo00o0o.C34554OooO00o.OooO0O0
        public final void OooO00o(String str) {
            this.f123803OooO00o.println((Object) str);
        }
    }

    public C34554OooO00o(Throwable... thArr) {
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
        for (Throwable th : this.f123800OooOo0o) {
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
        int i;
        try {
            if (this.f123801OooOoO0 == null) {
                String property = System.getProperty(C18101a5.f54156e);
                if (this.f123800OooOo0o.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.f123800OooOo0o.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable cause : this.f123800OooOo0o) {
                        int i2 = 0;
                        while (true) {
                            if (cause != null) {
                                for (int i3 = 0; i3 < i2; i3++) {
                                    sb.append("  ");
                                }
                                sb.append("|-- ");
                                sb.append(cause.getClass().getCanonicalName());
                                sb.append(": ");
                                String message = cause.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb.append(message);
                                    sb.append(property);
                                } else {
                                    sb.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i4 = 0; i4 < i2 + 2; i4++) {
                                            sb.append("  ");
                                        }
                                        sb.append(str);
                                        sb.append(property);
                                    }
                                }
                                int i5 = 0;
                                while (true) {
                                    i = i2 + 2;
                                    if (i5 >= i) {
                                        break;
                                    }
                                    sb.append("  ");
                                    i5++;
                                }
                                StackTraceElement[] stackTrace = cause.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb.append("at ");
                                    sb.append(stackTrace[0]);
                                    sb.append(property);
                                }
                                if (identityHashMap.containsKey(cause)) {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 != null) {
                                        for (int i6 = 0; i6 < i; i6++) {
                                            sb.append("  ");
                                        }
                                        sb.append("|-- ");
                                        sb.append("(cause not expanded again) ");
                                        sb.append(cause2.getClass().getCanonicalName());
                                        sb.append(": ");
                                        sb.append(cause2.getMessage());
                                        sb.append(property);
                                    }
                                } else {
                                    identityHashMap.put(cause, Boolean.TRUE);
                                    cause = cause.getCause();
                                    i2++;
                                }
                            }
                        }
                    }
                    this.f123801OooOoO0 = new C20363OooO00o(sb.toString().trim());
                } else {
                    this.f123801OooOoO0 = this.f123800OooOo0o.get(0);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f123801OooOoO0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f123799OooOo;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        OooO0O0(new OooO0OO(printStream));
    }

    public C34554OooO00o(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof C34554OooO00o) {
                    linkedHashSet.addAll(((C34554OooO00o) th).f123800OooOo0o);
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
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f123800OooOo0o = listUnmodifiableList;
            this.f123799OooOo = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        OooO0O0(new C34555OooO0Oo(printWriter));
    }
}
