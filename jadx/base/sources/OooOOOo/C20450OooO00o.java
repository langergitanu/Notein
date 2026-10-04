package OooOOOo;

import java.util.Arrays;

/* JADX INFO: renamed from: OooOOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20450OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f58412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CharSequence f58413OooO0O0;

    public C20450OooO00o(int i, CharSequence charSequence) {
        this.f58412OooO00o = i;
        this.f58413OooO0O0 = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20450OooO00o)) {
            return false;
        }
        C20450OooO00o c20450OooO00o = (C20450OooO00o) obj;
        if (this.f58412OooO00o != c20450OooO00o.f58412OooO00o) {
            return false;
        }
        CharSequence charSequence = this.f58413OooO0O0;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = c20450OooO00o.f58413OooO0O0;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f58412OooO00o);
        CharSequence charSequence = this.f58413OooO0O0;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
