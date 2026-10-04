package com.microsoft.identity.common.internal.broker;

import android.content.Context;
import android.content.pm.PackageManager;
import com.microsoft.identity.common.internal.util.PackageUtils;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.logging.Logger;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BQ\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0004\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c¨\u0006\u001e"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/BrokerValidator;", "Lcom/microsoft/identity/common/internal/broker/IBrokerValidator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "allowedBrokerApps", "Lkotlin/Function1;", "", "", "Ljava/security/cert/X509Certificate;", "getSigningCertificateForApp", "Lkotlin/Function2;", "LoO00ooO/OooOooO;", "validateSigningCertificate", "(Ljava/util/Set;LoO0O000o/OooOO0o;LoO0O000o/OooOOOo;)V", "packageName", "", "verifySignature", "(Ljava/lang/String;)Z", "isValidBrokerPackage", "brokerData", "isSignedByKnownKeys", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)Z", "Ljava/util/Set;", "LoO0O000o/OooOO0o;", "LoO0O000o/OooOOOo;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public class BrokerValidator implements IBrokerValidator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(BrokerValidator.class).OooOO0();
    private final Set<BrokerData> allowedBrokerApps;
    private final InterfaceC32507OooOO0o<String, List<X509Certificate>> getSigningCertificateForApp;
    private final InterfaceC32508OooOOOo<String, List<? extends X509Certificate>, C32460OooOooO> validateSigningCertificate;

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.broker.BrokerValidator$1 */
    @Metadata(m80611d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m80612d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "kotlin.jvm.PlatformType", "", "packageName", "", "invoke"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185631 extends OooOOOO implements InterfaceC32507OooOO0o<String, List<X509Certificate>> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185631(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final List<X509Certificate> invoke(String packageName) throws GeneralSecurityException, PackageManager.NameNotFoundException, IOException, ClientException {
            OooOOO0.OooO0oO(packageName, "packageName");
            List<X509Certificate> certDataForApp = PackageUtils.readCertDataForApp(packageName, this.$context);
            OooOOO0.OooO0o(certDataForApp, "readCertDataForApp(packageName, context)");
            return certDataForApp;
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.broker.BrokerValidator$2 */
    @Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public /* synthetic */ class C185642 extends C24019OooOO0o implements InterfaceC32508OooOOOo<String, List<? extends X509Certificate>, C32460OooOooO> {
        public C185642(Object obj) {
            super(2, obj, Companion.class, "validateSigningCertificate", "validateSigningCertificate(Ljava/lang/String;Ljava/util/List;)V", 0);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public /* bridge */ /* synthetic */ C32460OooOooO invoke(String str, List<? extends X509Certificate> list) throws GeneralSecurityException, ClientException {
            invoke2(str, list);
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0, List<? extends X509Certificate> p1) throws GeneralSecurityException, ClientException {
            OooOOO0.OooO0oO(p0, "p0");
            OooOOO0.OooO0oO(p1, "p1");
            ((Companion) this.receiver).validateSigningCertificate(p0, p1);
        }
    }

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/BrokerValidator$Companion;", "", "<init>", "()V", "", "expectedSigningCertificateThumbprint", "", "Ljava/security/cert/X509Certificate;", "signingCertificates", "LoO00ooO/OooOooO;", "validateSigningCertificate", "(Ljava/lang/String;Ljava/util/List;)V", "TAG", "Ljava/lang/String;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final void validateSigningCertificate(String expectedSigningCertificateThumbprint, List<? extends X509Certificate> signingCertificates) throws GeneralSecurityException, ClientException {
            OooOOO0.OooO0oO(expectedSigningCertificateThumbprint, "expectedSigningCertificateThumbprint");
            OooOOO0.OooO0oO(signingCertificates, "signingCertificates");
            PackageUtils.verifySignatureHash(signingCertificates, C34449Oooo0oo.OooOO0(expectedSigningCertificateThumbprint).iterator());
            if (signingCertificates.size() > 1) {
                PackageUtils.verifyCertificateChain(signingCertificates);
            }
        }

        private Companion() {
        }
    }

    public BrokerValidator(Context context) {
        OooOOO0.OooO0oO(context, "context");
        this.allowedBrokerApps = BrokerData.INSTANCE.getKnownBrokerApps();
        this.getSigningCertificateForApp = new C185631(context);
        this.validateSigningCertificate = new C185642(INSTANCE);
    }

    @Override // com.microsoft.identity.common.internal.broker.IBrokerValidator
    public boolean isSignedByKnownKeys(BrokerData brokerData) {
        OooOOO0.OooO0oO(brokerData, "brokerData");
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":isSignedByKnownKeys");
        try {
            this.validateSigningCertificate.invoke(brokerData.getSigningCertificateThumbprint(), this.getSigningCertificateForApp.invoke(brokerData.getPackageName()));
            Logger.verbose(strOooO0OO, brokerData + " is a valid broker app.");
            return true;
        } catch (Throwable th) {
            Logger.verbose(strOooO0OO, brokerData + " verification failed: " + th.getMessage());
            return false;
        }
    }

    @Override // com.microsoft.identity.common.internal.broker.IBrokerValidator
    public boolean isValidBrokerPackage(String packageName) {
        Object next;
        OooOOO0.OooO0oO(packageName, "packageName");
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":isValidBrokerPackage");
        Set<BrokerData> set = this.allowedBrokerApps;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (C33595OooOOo.OooOOo(((BrokerData) obj).getPackageName(), packageName, true)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (isSignedByKnownKeys((BrokerData) next)) {
                break;
            }
        }
        if (((BrokerData) next) != null) {
            return true;
        }
        Logger.info(strOooO0OO, packageName.concat(" does not match with any known broker apps."));
        return false;
    }

    public boolean verifySignature(String packageName) {
        OooOOO0.OooO0oO(packageName, "packageName");
        return isValidBrokerPackage(packageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrokerValidator(Set<BrokerData> allowedBrokerApps, InterfaceC32507OooOO0o<? super String, ? extends List<? extends X509Certificate>> getSigningCertificateForApp, InterfaceC32508OooOOOo<? super String, ? super List<? extends X509Certificate>, C32460OooOooO> validateSigningCertificate) {
        OooOOO0.OooO0oO(allowedBrokerApps, "allowedBrokerApps");
        OooOOO0.OooO0oO(getSigningCertificateForApp, "getSigningCertificateForApp");
        OooOOO0.OooO0oO(validateSigningCertificate, "validateSigningCertificate");
        this.allowedBrokerApps = allowedBrokerApps;
        this.getSigningCertificateForApp = getSigningCertificateForApp;
        this.validateSigningCertificate = validateSigningCertificate;
    }
}
