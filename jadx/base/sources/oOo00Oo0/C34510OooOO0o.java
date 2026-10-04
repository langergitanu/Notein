package oOo00Oo0;

import java.util.Locale;

/* JADX INFO: renamed from: oOo00Oo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34510OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f123682OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f123683OooO0O0;

    public C34510OooOO0o(String content) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        this.f123682OooO00o = content;
        String lowerCase = content.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f123683OooO0O0 = lowerCase.hashCode();
    }

    public final boolean equals(Object obj) {
        String str;
        C34510OooOO0o c34510OooOO0o = obj instanceof C34510OooOO0o ? (C34510OooOO0o) obj : null;
        return (c34510OooOO0o == null || (str = c34510OooOO0o.f123682OooO00o) == null || !str.equalsIgnoreCase(this.f123682OooO00o)) ? false : true;
    }

    public final int hashCode() {
        return this.f123683OooO0O0;
    }

    public final String toString() {
        return this.f123682OooO00o;
    }
}
