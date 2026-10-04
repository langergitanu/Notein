package o00000;

import OooO0Oo.C20398OooO0O0;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34680OooO0O0 f81032OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81033OooO0O0;

    public OooO0O0(C34680OooO0O0 annotatedString, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotatedString, "annotatedString");
        this.f81032OooO00o = annotatedString;
        this.f81033OooO0O0 = i;
    }

    @Override // o00000.OooO0o
    public final void OooO00o(OooO buffer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        int i = buffer.f81027OooO0Oo;
        boolean z = i != -1;
        C34680OooO0O0 c34680OooO0O0 = this.f81032OooO00o;
        if (z) {
            buffer.OooO0Oo(i, buffer.f81028OooO0o0, c34680OooO0O0.f124887OooOo0o);
        } else {
            buffer.OooO0Oo(buffer.f81025OooO0O0, buffer.f81026OooO0OO, c34680OooO0O0.f124887OooOo0o);
        }
        int i2 = buffer.f81025OooO0O0;
        int i3 = buffer.f81026OooO0OO;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f81033OooO0O0;
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c34680OooO0O0.f124887OooOo0o.length(), 0, buffer.f81024OooO00o.OooO00o());
        buffer.OooO0o(iOooO0o, iOooO0o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81032OooO00o.f124887OooOo0o, oooO0O0.f81032OooO00o.f124887OooOo0o) && this.f81033OooO0O0 == oooO0O0.f81033OooO0O0;
    }

    public final int hashCode() {
        return (this.f81032OooO00o.f124887OooOo0o.hashCode() * 31) + this.f81033OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f81032OooO00o.f124887OooOo0o);
        sb.append("', newCursorPosition=");
        return C20398OooO0O0.OooO00o(')', sb, this.f81033OooO0O0);
    }

    public OooO0O0(String str, int i) {
        this(new C34680OooO0O0(6, str, null), i);
    }
}
