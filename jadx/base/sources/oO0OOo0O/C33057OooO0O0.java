package oO0OOo0O;

import java.util.ArrayList;
import java.util.Locale;
import oO0OOoo0.C33133OooO0Oo;

/* JADX INFO: renamed from: oO0OOo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33057OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33056OooO00o f119510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33133OooO0Oo f119511OooO0O0;

    /* JADX INFO: renamed from: oO0OOo0O.OooO0O0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C33056OooO00o f119512OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C33133OooO0Oo.OooO00o f119513OooO0O0;

        public final void OooO00o(String str, String str2) {
            C33133OooO0Oo.OooO00o oooO00o = this.f119513OooO0O0;
            oooO00o.getClass();
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char cCharAt2 = str2.charAt(i3);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
                }
            }
            while (true) {
                ArrayList arrayList = oooO00o.f119820OooO00o;
                if (i >= arrayList.size()) {
                    arrayList.add(str);
                    arrayList.add(str2.trim());
                    return;
                } else {
                    if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                        arrayList.remove(i);
                        arrayList.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
            }
        }
    }

    public C33057OooO0O0(OooO00o oooO00o) {
        this.f119510OooO00o = oooO00o.f119512OooO00o;
        C33133OooO0Oo.OooO00o oooO00o2 = oooO00o.f119513OooO0O0;
        oooO00o2.getClass();
        this.f119511OooO0O0 = new C33133OooO0Oo(oooO00o2);
    }

    public final String toString() {
        return "Request{url=" + this.f119510OooO00o + '}';
    }
}
