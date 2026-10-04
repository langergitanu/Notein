package oOo00O0O;

import ooOOoOO0.C35142Oooo0o;

/* JADX INFO: renamed from: oOo00O0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34468OooOo0O extends AbstractC34475OooOooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f123525OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f123526OooOo0o;

    public C34468OooOo0O(String body, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(body, "body");
        this.f123526OooOo0o = z;
        this.f123525OooOo = body.toString();
    }

    @Override // oOo00O0O.AbstractC34475OooOooO
    public final String OooO0O0() {
        return this.f123525OooOo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34468OooOo0O.class != obj.getClass()) {
            return false;
        }
        C34468OooOo0O c34468OooOo0O = (C34468OooOo0O) obj;
        return this.f123526OooOo0o == c34468OooOo0O.f123526OooOo0o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123525OooOo, c34468OooOo0O.f123525OooOo);
    }

    public final int hashCode() {
        return this.f123525OooOo.hashCode() + (Boolean.hashCode(this.f123526OooOo0o) * 31);
    }

    @Override // oOo00O0O.AbstractC34475OooOooO
    public final String toString() {
        boolean z = this.f123526OooOo0o;
        String str = this.f123525OooOo;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        C35142Oooo0o.OooO00o(str, sb);
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }
}
