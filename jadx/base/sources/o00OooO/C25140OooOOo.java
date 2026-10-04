package o00OooO;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.InterfaceC25116OooO0o;

/* JADX INFO: renamed from: o00OooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25140OooOOo extends Exception {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final StackTraceElement[] f85555OooOoo0 = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC25116OooO0o f85556OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<Throwable> f85557OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Class<?> f85558OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public EnumC25112OooO00o f85559OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f85560OooOoOO;

    public C25140OooOOo(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void OooO00o(Throwable th, ArrayList arrayList) {
        if (!(th instanceof C25140OooOOo)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((C25140OooOOo) th).f85557OooOo0o.iterator();
        while (it.hasNext()) {
            OooO00o(it.next(), arrayList);
        }
    }

    public static void OooO0O0(List list, OooO00o oooO00o) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            oooO00o.append("Cause (");
            int i2 = i + 1;
            oooO00o.append(String.valueOf(i2));
            oooO00o.append(" of ");
            oooO00o.append(String.valueOf(size));
            oooO00o.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C25140OooOOo) {
                ((C25140OooOOo) th).OooO0o0(oooO00o);
            } else {
                OooO0OO(th, oooO00o);
            }
            i = i2;
        }
    }

    public static void OooO0OO(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void OooO0Oo() {
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void OooO0o0(Appendable appendable) {
        OooO0OO(this, appendable);
        try {
            OooO0O0(this.f85557OooOo0o, new OooO00o(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f85560OooOoOO);
        sb.append(this.f85558OooOoO != null ? ", " + this.f85558OooOoO : "");
        sb.append(this.f85559OooOoO0 != null ? ", " + this.f85559OooOoO0 : "");
        sb.append(this.f85556OooOo != null ? ", " + this.f85556OooOo : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        OooO00o(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        OooO0o0(System.err);
    }

    public C25140OooOOo(String str, List<Throwable> list) {
        this.f85560OooOoOO = str;
        setStackTrace(f85555OooOoo0);
        this.f85557OooOo0o = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        OooO0o0(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        OooO0o0(printWriter);
    }

    /* JADX INFO: renamed from: o00OooO.OooOOo$OooO00o */
    public static final class OooO00o implements Appendable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f85561OooOo = true;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Appendable f85562OooOo0o;

        public OooO00o(Appendable appendable) {
            this.f85562OooOo0o = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.f85561OooOo;
            Appendable appendable = this.f85562OooOo0o;
            if (z) {
                this.f85561OooOo = false;
                appendable.append("  ");
            }
            this.f85561OooOo = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.f85561OooOo;
            Appendable appendable = this.f85562OooOo0o;
            boolean z2 = false;
            if (z) {
                this.f85561OooOo = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.f85561OooOo = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }
    }
}
