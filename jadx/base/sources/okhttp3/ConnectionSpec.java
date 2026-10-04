package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooOo.C32474OooO0O0;
import oOo000Oo.OooOo;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/ConnectionSpec;", "", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ConnectionSpec {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ConnectionSpec f124076OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ConnectionSpec f124077OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f124078OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f124079OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f124080OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String[] f124081OooO0Oo;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f124082OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String[] f124083OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String[] f124084OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f124085OooO0Oo;

        public Builder(boolean z) {
            this.f124082OooO00o = z;
        }

        public final ConnectionSpec OooO00o() {
            return new ConnectionSpec(this.f124082OooO00o, this.f124085OooO0Oo, this.f124083OooO0O0, this.f124084OooO0OO);
        }

        public final void OooO0O0(String... cipherSuites) {
            OooOOO0.OooO0oO(cipherSuites, "cipherSuites");
            if (!this.f124082OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f124083OooO0O0 = (String[]) cipherSuites.clone();
        }

        public final void OooO0OO(CipherSuite... cipherSuites) {
            OooOOO0.OooO0oO(cipherSuites, "cipherSuites");
            if (!this.f124082OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f124075OooO00o);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            OooO0O0((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void OooO0Oo(String... tlsVersions) {
            OooOOO0.OooO0oO(tlsVersions, "tlsVersions");
            if (!this.f124082OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f124084OooO0OO = (String[]) tlsVersions.clone();
        }

        public final void OooO0o0(TlsVersion... tlsVersionArr) {
            if (!this.f124082OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f124300OooOo0o);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            OooO0Oo((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    @Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.f124071OooOOo;
        CipherSuite cipherSuite2 = CipherSuite.f124073OooOOoo;
        CipherSuite cipherSuite3 = CipherSuite.f124074OooOo00;
        CipherSuite cipherSuite4 = CipherSuite.f124066OooOO0o;
        CipherSuite cipherSuite5 = CipherSuite.f124067OooOOO;
        CipherSuite cipherSuite6 = CipherSuite.f124068OooOOO0;
        CipherSuite cipherSuite7 = CipherSuite.f124069OooOOOO;
        CipherSuite cipherSuite8 = CipherSuite.f124072OooOOo0;
        CipherSuite cipherSuite9 = CipherSuite.f124070OooOOOo;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f124064OooOO0, CipherSuite.f124065OooOO0O, CipherSuite.f124063OooO0oo, CipherSuite.f124056OooO, CipherSuite.f124060OooO0o, CipherSuite.f124062OooO0oO, CipherSuite.f124061OooO0o0};
        Builder builder = new Builder(true);
        builder.OooO0OO((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.OooO0o0(tlsVersion, tlsVersion2);
        if (!builder.f124082OooO00o) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder.f124085OooO0Oo = true;
        builder.OooO00o();
        Builder builder2 = new Builder(true);
        builder2.OooO0OO((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder2.OooO0o0(tlsVersion, tlsVersion2);
        if (!builder2.f124082OooO00o) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder2.f124085OooO0Oo = true;
        f124077OooO0o0 = builder2.OooO00o();
        Builder builder3 = new Builder(true);
        builder3.OooO0OO((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, 16));
        builder3.OooO0o0(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        if (!builder3.f124082OooO00o) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder3.f124085OooO0Oo = true;
        builder3.OooO00o();
        f124076OooO0o = new Builder(false).OooO00o();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f124078OooO00o = z;
        this.f124079OooO0O0 = z2;
        this.f124080OooO0OO = strArr;
        this.f124081OooO0Oo = strArr2;
    }

    public final List<CipherSuite> OooO00o() {
        String[] strArr = this.f124080OooO0OO;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f124057OooO0O0.OooO0O0(str));
        }
        return OooOo.o0ooOO0(arrayList);
    }

    public final boolean OooO0O0(SSLSocket sSLSocket) {
        if (!this.f124078OooO00o) {
            return false;
        }
        String[] strArr = this.f124081OooO0Oo;
        if (strArr != null) {
            if (!Util.OooOO0(C32474OooO0O0.f116717OooOo0o, strArr, sSLSocket.getEnabledProtocols())) {
                return false;
            }
        }
        String[] strArr2 = this.f124080OooO0OO;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        CipherSuite.f124057OooO0O0.getClass();
        return Util.OooOO0(CipherSuite.f124058OooO0OO, strArr2, enabledCipherSuites);
    }

    public final List<TlsVersion> OooO0OO() {
        String[] strArr = this.f124081OooO0Oo;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.f124293OooOo.getClass();
            arrayList.add(TlsVersion.Companion.OooO00o(str));
        }
        return OooOo.o0ooOO0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z = connectionSpec.f124078OooO00o;
        boolean z2 = this.f124078OooO00o;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f124080OooO0OO, connectionSpec.f124080OooO0OO) && Arrays.equals(this.f124081OooO0Oo, connectionSpec.f124081OooO0Oo) && this.f124079OooO0O0 == connectionSpec.f124079OooO0O0;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f124078OooO00o) {
            return 17;
        }
        String[] strArr = this.f124080OooO0OO;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f124081OooO0Oo;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f124079OooO0O0 ? 1 : 0);
    }

    public final String toString() {
        if (!this.f124078OooO00o) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(OooO00o(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(OooO0OO(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f124079OooO0O0 + ')';
    }
}
