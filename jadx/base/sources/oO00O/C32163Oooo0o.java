package oO00O;

import java.security.SecureRandom;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: oO00O.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32163Oooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SecureRandom f115381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f115382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final X509TrustManager f115383OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f115384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f115385OooO0o0;

    public C32163Oooo0o(SecureRandom secureRandom, ArrayList certificates, X509TrustManager trustManager, ArrayList cipherSuites, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(certificates, "certificates");
        kotlin.jvm.internal.OooOOO0.OooO0oO(trustManager, "trustManager");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cipherSuites, "cipherSuites");
        this.f115381OooO00o = secureRandom;
        this.f115382OooO0O0 = certificates;
        this.f115383OooO0OO = trustManager;
        this.f115384OooO0Oo = cipherSuites;
        this.f115385OooO0o0 = str;
    }
}
