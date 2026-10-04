package oO0OOoo0;

import OooO0o.C20424OooO0Oo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: oO0OOoo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33131OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33131OooO0O0 f119803OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f119804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String[] f119805OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f119806OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f119807OooO0Oo;

    static {
        EnumC33130OooO00o[] enumC33130OooO00oArr = {EnumC33130OooO00o.f119798Oooo0OO, EnumC33130OooO00o.f119800Oooo0o0, EnumC33130OooO00o.f119799Oooo0o, EnumC33130OooO00o.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC33130OooO00o.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC33130OooO00o.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC33130OooO00o.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC33130OooO00o.f119797Oooo0O0, EnumC33130OooO00o.f119793Oooo0, EnumC33130OooO00o.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC33130OooO00o.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC33130OooO00o.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC33130OooO00o.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC33130OooO00o.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC33130OooO00o.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC33130OooO00o.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        OooO00o oooO00o = new OooO00o(true);
        oooO00o.OooO00o(enumC33130OooO00oArr);
        EnumC33144OooOOO0 enumC33144OooOOO0 = EnumC33144OooOOO0.TLS_1_3;
        EnumC33144OooOOO0 enumC33144OooOOO02 = EnumC33144OooOOO0.TLS_1_2;
        oooO00o.OooO0O0(enumC33144OooOOO0, enumC33144OooOOO02);
        if (!oooO00o.f119808OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o.f119811OooO0Oo = true;
        C33131OooO0O0 c33131OooO0O0 = new C33131OooO0O0(oooO00o);
        f119803OooO0o0 = c33131OooO0O0;
        OooO00o oooO00o2 = new OooO00o(c33131OooO0O0);
        oooO00o2.OooO0O0(enumC33144OooOOO0, enumC33144OooOOO02, EnumC33144OooOOO0.TLS_1_1, EnumC33144OooOOO0.TLS_1_0);
        if (!oooO00o2.f119808OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o2.f119811OooO0Oo = true;
        new C33131OooO0O0(oooO00o2);
        new C33131OooO0O0(new OooO00o(false));
    }

    public C33131OooO0O0(OooO00o oooO00o) {
        this.f119804OooO00o = oooO00o.f119808OooO00o;
        this.f119805OooO0O0 = oooO00o.f119809OooO0O0;
        this.f119806OooO0OO = oooO00o.f119810OooO0OO;
        this.f119807OooO0Oo = oooO00o.f119811OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C33131OooO0O0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C33131OooO0O0 c33131OooO0O0 = (C33131OooO0O0) obj;
        boolean z = c33131OooO0O0.f119804OooO00o;
        boolean z2 = this.f119804OooO00o;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f119805OooO0O0, c33131OooO0O0.f119805OooO0O0) && Arrays.equals(this.f119806OooO0OO, c33131OooO0O0.f119806OooO0OO) && this.f119807OooO0Oo == c33131OooO0O0.f119807OooO0Oo;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f119804OooO00o) {
            return ((((527 + Arrays.hashCode(this.f119805OooO0O0)) * 31) + Arrays.hashCode(this.f119806OooO0OO)) * 31) + (!this.f119807OooO0Oo ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        EnumC33144OooOOO0 enumC33144OooOOO0;
        if (!this.f119804OooO00o) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f119805OooO0O0;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            EnumC33130OooO00o[] enumC33130OooO00oArr = new EnumC33130OooO00o[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                enumC33130OooO00oArr[i] = str.startsWith("SSL_") ? EnumC33130OooO00o.valueOf("TLS_" + str.substring(4)) : EnumC33130OooO00o.valueOf(str);
            }
            String[] strArr2 = C33143OooOOO.f119858OooO00o;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) enumC33130OooO00oArr.clone()));
        }
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f119806OooO0OO;
        EnumC33144OooOOO0[] enumC33144OooOOO0Arr = new EnumC33144OooOOO0[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                enumC33144OooOOO0 = EnumC33144OooOOO0.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                enumC33144OooOOO0 = EnumC33144OooOOO0.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                enumC33144OooOOO0 = EnumC33144OooOOO0.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                enumC33144OooOOO0 = EnumC33144OooOOO0.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unexpected TLS version: ", str2));
                }
                enumC33144OooOOO0 = EnumC33144OooOOO0.SSL_3_0;
            }
            enumC33144OooOOO0Arr[i2] = enumC33144OooOOO0;
        }
        String[] strArr4 = C33143OooOOO.f119858OooO00o;
        sbOooO0o0.append(Collections.unmodifiableList(Arrays.asList((Object[]) enumC33144OooOOO0Arr.clone())));
        sbOooO0o0.append(", supportsTlsExtensions=");
        return androidx.appcompat.app.OooOOO.OooO00o(sbOooO0o0, ")", this.f119807OooO0Oo);
    }

    /* JADX INFO: renamed from: oO0OOoo0.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f119808OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String[] f119809OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String[] f119810OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f119811OooO0Oo;

        public OooO00o(boolean z) {
            this.f119808OooO00o = z;
        }

        public final void OooO00o(EnumC33130OooO00o... enumC33130OooO00oArr) {
            if (!this.f119808OooO00o) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[enumC33130OooO00oArr.length];
            for (int i = 0; i < enumC33130OooO00oArr.length; i++) {
                strArr[i] = enumC33130OooO00oArr[i].f119802OooOo0o;
            }
            this.f119809OooO0O0 = strArr;
        }

        public final void OooO0O0(EnumC33144OooOOO0... enumC33144OooOOO0Arr) {
            if (!this.f119808OooO00o) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (enumC33144OooOOO0Arr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[enumC33144OooOOO0Arr.length];
            for (int i = 0; i < enumC33144OooOOO0Arr.length; i++) {
                strArr[i] = enumC33144OooOOO0Arr[i].f119866OooOo0o;
            }
            this.f119810OooO0OO = strArr;
        }

        public OooO00o(C33131OooO0O0 c33131OooO0O0) {
            this.f119808OooO00o = c33131OooO0O0.f119804OooO00o;
            this.f119809OooO0O0 = c33131OooO0O0.f119805OooO0O0;
            this.f119810OooO0OO = c33131OooO0O0.f119806OooO0OO;
            this.f119811OooO0Oo = c33131OooO0O0.f119807OooO0Oo;
        }
    }
}
