package oO0OOo0O;

import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: renamed from: oO0OOo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33056OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f119504OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f119505OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f119506OooO0OO;

    /* JADX INFO: renamed from: oO0OOo0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20296OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f119507OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f119508OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f119509OooO0OO;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f119507OooO00o);
            sb.append("://");
            int i = -1;
            if (this.f119508OooO0O0.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f119508OooO0O0);
                sb.append(']');
            } else {
                sb.append(this.f119508OooO0O0);
            }
            int i2 = this.f119509OooO0OO;
            if (i2 == -1) {
                String str = this.f119507OooO00o;
                i2 = str.equals("http") ? 80 : str.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING) ? 443 : -1;
            }
            String str2 = this.f119507OooO00o;
            if (str2.equals("http")) {
                i = 80;
            } else if (str2.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING)) {
                i = 443;
            }
            if (i2 != i) {
                sb.append(':');
                sb.append(i2);
            }
            return sb.toString();
        }
    }

    public C33056OooO00o(C20296OooO00o c20296OooO00o) {
        String str = c20296OooO00o.f119507OooO00o;
        this.f119504OooO00o = c20296OooO00o.f119508OooO0O0;
        int i = c20296OooO00o.f119509OooO0OO;
        this.f119505OooO0O0 = i == -1 ? str.equals("http") ? 80 : str.equals(AuthenticationConstants.HTTPS_PROTOCOL_STRING) ? 443 : -1 : i;
        this.f119506OooO0OO = c20296OooO00o.toString();
    }

    public static int OooO00o(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C33056OooO00o) && ((C33056OooO00o) obj).f119506OooO0OO.equals(this.f119506OooO0OO);
    }

    public final int hashCode() {
        return this.f119506OooO0OO.hashCode();
    }

    public final String toString() {
        return this.f119506OooO0OO;
    }
}
