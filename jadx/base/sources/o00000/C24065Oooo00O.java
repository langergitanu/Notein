package o00000;

import OooO0Oo.C20398OooO0O0;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: renamed from: o00000.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24065Oooo00O implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34680OooO0O0 f81088OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81089OooO0O0;

    public C24065Oooo00O(String str, int i) {
        this.f81088OooO00o = new C34680OooO0O0(6, str, null);
        this.f81089OooO0O0 = i;
    }

    @Override // o00000.OooO0o
    public final void OooO00o(OooO buffer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        int i = buffer.f81027OooO0Oo;
        boolean z = i != -1;
        C34680OooO0O0 c34680OooO0O0 = this.f81088OooO00o;
        if (z) {
            buffer.OooO0Oo(i, buffer.f81028OooO0o0, c34680OooO0O0.f124887OooOo0o);
            String str = c34680OooO0O0.f124887OooOo0o;
            if (str.length() > 0) {
                buffer.OooO0o0(i, str.length() + i);
            }
        } else {
            int i2 = buffer.f81025OooO0O0;
            buffer.OooO0Oo(i2, buffer.f81026OooO0OO, c34680OooO0O0.f124887OooOo0o);
            String str2 = c34680OooO0O0.f124887OooOo0o;
            if (str2.length() > 0) {
                buffer.OooO0o0(i2, str2.length() + i2);
            }
        }
        int i3 = buffer.f81025OooO0O0;
        int i4 = buffer.f81026OooO0OO;
        int i5 = i3 == i4 ? i4 : -1;
        int i6 = this.f81089OooO0O0;
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(i6 > 0 ? (i5 + i6) - 1 : (i5 + i6) - c34680OooO0O0.f124887OooOo0o.length(), 0, buffer.f81024OooO00o.OooO00o());
        buffer.OooO0o(iOooO0o, iOooO0o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24065Oooo00O)) {
            return false;
        }
        C24065Oooo00O c24065Oooo00O = (C24065Oooo00O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f81088OooO00o.f124887OooOo0o, c24065Oooo00O.f81088OooO00o.f124887OooOo0o) && this.f81089OooO0O0 == c24065Oooo00O.f81089OooO0O0;
    }

    public final int hashCode() {
        return (this.f81088OooO00o.f124887OooOo0o.hashCode() * 31) + this.f81089OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f81088OooO00o.f124887OooOo0o);
        sb.append("', newCursorPosition=");
        return C20398OooO0O0.OooO00o(')', sb, this.f81089OooO0O0);
    }
}
