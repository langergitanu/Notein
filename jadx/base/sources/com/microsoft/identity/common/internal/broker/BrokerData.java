package com.microsoft.identity.common.internal.broker;

import android.content.Context;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.java.logging.Logger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÂ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/BrokerData;", "", "packageName", "", "signingCertificateThumbprint", "(Ljava/lang/String;Ljava/lang/String;)V", "nickName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getSigningCertificateThumbprint", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final /* data */ class BrokerData {
    private static final Set<String> accountManagerBrokers;
    private static final Set<BrokerData> allBrokers;
    private static final Set<BrokerData> debugBrokers;
    private static final Set<BrokerData> prodBrokers;
    private final String nickName;
    private final String packageName;
    private final String signingCertificateThumbprint;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(BrokerData.class).OooOO0();
    private static boolean sShouldTrustDebugBrokers = false;
    private static final BrokerData debugMicrosoftAuthenticator = new BrokerData(AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_PACKAGE_NAME, AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_DEBUG_SIGNATURE_SHA512, "debugMicrosoftAuthenticator");
    private static final BrokerData prodMicrosoftAuthenticator = new BrokerData(AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_PACKAGE_NAME, AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_RELEASE_SIGNATURE_SHA512, "prodMicrosoftAuthenticator");
    private static final BrokerData debugCompanyPortal = new BrokerData(AuthenticationConstants.Broker.COMPANY_PORTAL_APP_PACKAGE_NAME, AuthenticationConstants.Broker.COMPANY_PORTAL_APP_DEBUG_SIGNATURE_SHA512, "debugCompanyPortal");
    private static final BrokerData prodCompanyPortal = new BrokerData(AuthenticationConstants.Broker.COMPANY_PORTAL_APP_PACKAGE_NAME, AuthenticationConstants.Broker.COMPANY_PORTAL_APP_RELEASE_SIGNATURE_SHA512, "prodCompanyPortal");
    private static final BrokerData debugBrokerHost = new BrokerData(AuthenticationConstants.Broker.BROKER_HOST_APP_PACKAGE_NAME, AuthenticationConstants.Broker.BROKER_HOST_APP_SIGNATURE_SHA512, "debugBrokerHost");
    private static final BrokerData debugMockCp = new BrokerData(AuthenticationConstants.Broker.MOCK_CP_PACKAGE_NAME, AuthenticationConstants.Broker.MOCK_CP_SIGNATURE_SHA512, "debugMockCp");
    private static final BrokerData debugMockAuthApp = new BrokerData(AuthenticationConstants.Broker.MOCK_AUTH_APP_PACKAGE_NAME, AuthenticationConstants.Broker.MOCK_AUTH_APP_SIGNATURE_SHA512, "debugMockAuthApp");
    private static final BrokerData debugMockLtw = new BrokerData(AuthenticationConstants.Broker.MOCK_LTW_PACKAGE_NAME, AuthenticationConstants.Broker.MOCK_LTW_SIGNATURE_SHA512, "debugMockLtw");
    private static final BrokerData prodLTW = new BrokerData(AuthenticationConstants.Broker.LTW_APP_PACKAGE_NAME, AuthenticationConstants.Broker.LTW_APP_SHA512_RELEASE_SIGNATURE, "prodLTW");
    private static final BrokerData debugLTW = new BrokerData(AuthenticationConstants.Broker.LTW_APP_PACKAGE_NAME, AuthenticationConstants.Broker.LTW_APP_SHA512_DEBUG_SIGNATURE, "debugLTW");

    @Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b!\u0010\u001eR \u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001c\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010\u001eR \u0010&\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001c\u0012\u0004\b(\u0010\u0003\u001a\u0004\b'\u0010\u001eR \u0010)\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001c\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010\u001eR \u0010,\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001c\u0012\u0004\b.\u0010\u0003\u001a\u0004\b-\u0010\u001eR \u0010/\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010\u001c\u0012\u0004\b1\u0010\u0003\u001a\u0004\b0\u0010\u001eR \u00102\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010\u001c\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\u001eR \u00105\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\u001c\u0012\u0004\b7\u0010\u0003\u001a\u0004\b6\u0010\u001eR \u00108\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u001c\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010\u001eR&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u0010\u000eR&\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010<\u0012\u0004\bA\u0010\u0003\u001a\u0004\b@\u0010\u000eR&\u0010B\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010<\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010\u000eR&\u0010E\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bE\u0010<\u0012\u0004\bG\u0010\u0003\u001a\u0004\bF\u0010\u000eR\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/BrokerData$Companion;", "", "<init>", "()V", "", "value", "LoO00ooO/OooOooO;", "setShouldTrustDebugBrokers", "(Z)V", "getShouldTrustDebugBrokers", "()Z", "", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "getKnownBrokerApps", "()Ljava/util/Set;", "", "packageName", "isAccountManagerSupported", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "getFromContext", "(Landroid/content/Context;)Lcom/microsoft/identity/common/internal/broker/BrokerData;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "debugMicrosoftAuthenticator", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "getDebugMicrosoftAuthenticator", "()Lcom/microsoft/identity/common/internal/broker/BrokerData;", "getDebugMicrosoftAuthenticator$annotations", "prodMicrosoftAuthenticator", "getProdMicrosoftAuthenticator", "getProdMicrosoftAuthenticator$annotations", "debugCompanyPortal", "getDebugCompanyPortal", "getDebugCompanyPortal$annotations", "prodCompanyPortal", "getProdCompanyPortal", "getProdCompanyPortal$annotations", "debugBrokerHost", "getDebugBrokerHost", "getDebugBrokerHost$annotations", "debugMockCp", "getDebugMockCp", "getDebugMockCp$annotations", "debugMockAuthApp", "getDebugMockAuthApp", "getDebugMockAuthApp$annotations", "debugMockLtw", "getDebugMockLtw", "getDebugMockLtw$annotations", "prodLTW", "getProdLTW", "getProdLTW$annotations", "debugLTW", "getDebugLTW", "getDebugLTW$annotations", "accountManagerBrokers", "Ljava/util/Set;", "getAccountManagerBrokers", "getAccountManagerBrokers$annotations", "debugBrokers", "getDebugBrokers", "getDebugBrokers$annotations", "prodBrokers", "getProdBrokers", "getProdBrokers$annotations", "allBrokers", "getAllBrokers", "getAllBrokers$annotations", "sShouldTrustDebugBrokers", "Z", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ void getAccountManagerBrokers$annotations() {
        }

        public static /* synthetic */ void getAllBrokers$annotations() {
        }

        public static /* synthetic */ void getDebugBrokerHost$annotations() {
        }

        public static /* synthetic */ void getDebugBrokers$annotations() {
        }

        public static /* synthetic */ void getDebugCompanyPortal$annotations() {
        }

        public static /* synthetic */ void getDebugLTW$annotations() {
        }

        public static /* synthetic */ void getDebugMicrosoftAuthenticator$annotations() {
        }

        public static /* synthetic */ void getDebugMockAuthApp$annotations() {
        }

        public static /* synthetic */ void getDebugMockCp$annotations() {
        }

        public static /* synthetic */ void getDebugMockLtw$annotations() {
        }

        public static /* synthetic */ void getProdBrokers$annotations() {
        }

        public static /* synthetic */ void getProdCompanyPortal$annotations() {
        }

        public static /* synthetic */ void getProdLTW$annotations() {
        }

        public static /* synthetic */ void getProdMicrosoftAuthenticator$annotations() {
        }

        public final Set<String> getAccountManagerBrokers() {
            return BrokerData.accountManagerBrokers;
        }

        public final Set<BrokerData> getAllBrokers() {
            return BrokerData.allBrokers;
        }

        public final BrokerData getDebugBrokerHost() {
            return BrokerData.debugBrokerHost;
        }

        public final Set<BrokerData> getDebugBrokers() {
            return BrokerData.debugBrokers;
        }

        public final BrokerData getDebugCompanyPortal() {
            return BrokerData.debugCompanyPortal;
        }

        public final BrokerData getDebugLTW() {
            return BrokerData.debugLTW;
        }

        public final BrokerData getDebugMicrosoftAuthenticator() {
            return BrokerData.debugMicrosoftAuthenticator;
        }

        public final BrokerData getDebugMockAuthApp() {
            return BrokerData.debugMockAuthApp;
        }

        public final BrokerData getDebugMockCp() {
            return BrokerData.debugMockCp;
        }

        public final BrokerData getDebugMockLtw() {
            return BrokerData.debugMockLtw;
        }

        public final BrokerData getFromContext(Context context) {
            Object next;
            OooOOO0.OooO0oO(context, "context");
            String sha512SignatureForPackage = new PackageHelper(context).getSha512SignatureForPackage(context.getPackageName());
            if (OooOOO0.OooO0O0(context.getPackageName(), getDebugBrokerHost().getPackageName()) && (sha512SignatureForPackage == null || sha512SignatureForPackage.length() == 0)) {
                return getDebugBrokerHost();
            }
            Iterator<T> it = getAllBrokers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                BrokerData brokerData = (BrokerData) next;
                if (OooOOO0.OooO0O0(brokerData.getPackageName(), context.getPackageName()) && OooOOO0.OooO0O0(brokerData.getSigningCertificateThumbprint(), sha512SignatureForPackage)) {
                    break;
                }
            }
            return (BrokerData) next;
        }

        public final Set<BrokerData> getKnownBrokerApps() {
            return BrokerData.sShouldTrustDebugBrokers ? getAllBrokers() : getProdBrokers();
        }

        public final Set<BrokerData> getProdBrokers() {
            return BrokerData.prodBrokers;
        }

        public final BrokerData getProdCompanyPortal() {
            return BrokerData.prodCompanyPortal;
        }

        public final BrokerData getProdLTW() {
            return BrokerData.prodLTW;
        }

        public final BrokerData getProdMicrosoftAuthenticator() {
            return BrokerData.prodMicrosoftAuthenticator;
        }

        public final boolean getShouldTrustDebugBrokers() {
            return BrokerData.sShouldTrustDebugBrokers;
        }

        public final String getTAG() {
            return BrokerData.TAG;
        }

        public final boolean isAccountManagerSupported(String packageName) {
            OooOOO0.OooO0oO(packageName, "packageName");
            return getAccountManagerBrokers().contains(packageName);
        }

        public final void setShouldTrustDebugBrokers(boolean value) {
            String str = getTAG() + ":setShouldTrustDebugBrokers";
            if (value) {
                Logger.warn(str, "You are forcing to trust debug brokers in non-debug builds.");
            }
            BrokerData.sShouldTrustDebugBrokers = value;
        }

        private Companion() {
        }
    }

    static {
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet<String>() { // from class: com.microsoft.identity.common.internal.broker.BrokerData$Companion$accountManagerBrokers$1
            {
                add(AuthenticationConstants.Broker.AZURE_AUTHENTICATOR_APP_PACKAGE_NAME);
                add(AuthenticationConstants.Broker.COMPANY_PORTAL_APP_PACKAGE_NAME);
                add(AuthenticationConstants.Broker.BROKER_HOST_APP_PACKAGE_NAME);
                add(AuthenticationConstants.Broker.MOCK_AUTH_APP_PACKAGE_NAME);
                add(AuthenticationConstants.Broker.MOCK_CP_PACKAGE_NAME);
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof String) {
                    return contains((String) obj);
                }
                return false;
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean remove(Object obj) {
                if (obj instanceof String) {
                    return remove((String) obj);
                }
                return false;
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }

            public /* bridge */ boolean contains(String str) {
                return super.contains((Object) str);
            }

            public /* bridge */ boolean remove(String str) {
                return super.remove((Object) str);
            }
        });
        OooOOO0.OooO0o(setUnmodifiableSet, "unmodifiableSet(object :…         }\n            })");
        accountManagerBrokers = setUnmodifiableSet;
        Set<BrokerData> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet<BrokerData>() { // from class: com.microsoft.identity.common.internal.broker.BrokerData$Companion$debugBrokers$1
            {
                BrokerData.Companion companion = BrokerData.INSTANCE;
                add(companion.getDebugMicrosoftAuthenticator());
                add(companion.getDebugLTW());
                add(companion.getDebugCompanyPortal());
                add(companion.getDebugBrokerHost());
                add(companion.getDebugMockCp());
                add(companion.getDebugMockAuthApp());
                add(companion.getDebugMockLtw());
            }

            public /* bridge */ boolean contains(BrokerData brokerData) {
                return super.contains((Object) brokerData);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ boolean remove(BrokerData brokerData) {
                return super.remove((Object) brokerData);
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof BrokerData) {
                    return contains((BrokerData) obj);
                }
                return false;
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean remove(Object obj) {
                if (obj instanceof BrokerData) {
                    return remove((BrokerData) obj);
                }
                return false;
            }
        });
        OooOOO0.OooO0o(setUnmodifiableSet2, "unmodifiableSet(object :…         }\n            })");
        debugBrokers = setUnmodifiableSet2;
        Set<BrokerData> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet<BrokerData>() { // from class: com.microsoft.identity.common.internal.broker.BrokerData$Companion$prodBrokers$1
            {
                BrokerData.Companion companion = BrokerData.INSTANCE;
                add(companion.getProdMicrosoftAuthenticator());
                add(companion.getProdCompanyPortal());
                add(companion.getProdLTW());
            }

            public /* bridge */ boolean contains(BrokerData brokerData) {
                return super.contains((Object) brokerData);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ boolean remove(BrokerData brokerData) {
                return super.remove((Object) brokerData);
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof BrokerData) {
                    return contains((BrokerData) obj);
                }
                return false;
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean remove(Object obj) {
                if (obj instanceof BrokerData) {
                    return remove((BrokerData) obj);
                }
                return false;
            }
        });
        OooOOO0.OooO0o(setUnmodifiableSet3, "unmodifiableSet(object :…         }\n            })");
        prodBrokers = setUnmodifiableSet3;
        Set<BrokerData> setUnmodifiableSet4 = Collections.unmodifiableSet(new HashSet<BrokerData>() { // from class: com.microsoft.identity.common.internal.broker.BrokerData$Companion$allBrokers$1
            {
                BrokerData.Companion companion = BrokerData.INSTANCE;
                addAll(companion.getDebugBrokers());
                addAll(companion.getProdBrokers());
            }

            public /* bridge */ boolean contains(BrokerData brokerData) {
                return super.contains((Object) brokerData);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ boolean remove(BrokerData brokerData) {
                return super.remove((Object) brokerData);
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof BrokerData) {
                    return contains((BrokerData) obj);
                }
                return false;
            }

            @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final /* bridge */ boolean remove(Object obj) {
                if (obj instanceof BrokerData) {
                    return remove((BrokerData) obj);
                }
                return false;
            }
        });
        OooOOO0.OooO0o(setUnmodifiableSet4, "unmodifiableSet(object :…         }\n            })");
        allBrokers = setUnmodifiableSet4;
    }

    public BrokerData(String packageName, String signingCertificateThumbprint, String str) {
        OooOOO0.OooO0oO(packageName, "packageName");
        OooOOO0.OooO0oO(signingCertificateThumbprint, "signingCertificateThumbprint");
        this.packageName = packageName;
        this.signingCertificateThumbprint = signingCertificateThumbprint;
        this.nickName = str;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getNickName() {
        return this.nickName;
    }

    public static /* synthetic */ BrokerData copy$default(BrokerData brokerData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brokerData.packageName;
        }
        if ((i & 2) != 0) {
            str2 = brokerData.signingCertificateThumbprint;
        }
        if ((i & 4) != 0) {
            str3 = brokerData.nickName;
        }
        return brokerData.copy(str, str2, str3);
    }

    public static final Set<String> getAccountManagerBrokers() {
        return INSTANCE.getAccountManagerBrokers();
    }

    public static final Set<BrokerData> getAllBrokers() {
        return INSTANCE.getAllBrokers();
    }

    public static final BrokerData getDebugBrokerHost() {
        return INSTANCE.getDebugBrokerHost();
    }

    public static final Set<BrokerData> getDebugBrokers() {
        return INSTANCE.getDebugBrokers();
    }

    public static final BrokerData getDebugCompanyPortal() {
        return INSTANCE.getDebugCompanyPortal();
    }

    public static final BrokerData getDebugLTW() {
        return INSTANCE.getDebugLTW();
    }

    public static final BrokerData getDebugMicrosoftAuthenticator() {
        return INSTANCE.getDebugMicrosoftAuthenticator();
    }

    public static final BrokerData getDebugMockAuthApp() {
        return INSTANCE.getDebugMockAuthApp();
    }

    public static final BrokerData getDebugMockCp() {
        return INSTANCE.getDebugMockCp();
    }

    public static final BrokerData getDebugMockLtw() {
        return INSTANCE.getDebugMockLtw();
    }

    public static final BrokerData getFromContext(Context context) {
        return INSTANCE.getFromContext(context);
    }

    public static final Set<BrokerData> getKnownBrokerApps() {
        return INSTANCE.getKnownBrokerApps();
    }

    public static final Set<BrokerData> getProdBrokers() {
        return INSTANCE.getProdBrokers();
    }

    public static final BrokerData getProdCompanyPortal() {
        return INSTANCE.getProdCompanyPortal();
    }

    public static final BrokerData getProdLTW() {
        return INSTANCE.getProdLTW();
    }

    public static final BrokerData getProdMicrosoftAuthenticator() {
        return INSTANCE.getProdMicrosoftAuthenticator();
    }

    public static final boolean getShouldTrustDebugBrokers() {
        return INSTANCE.getShouldTrustDebugBrokers();
    }

    public static final boolean isAccountManagerSupported(String str) {
        return INSTANCE.isAccountManagerSupported(str);
    }

    public static final void setShouldTrustDebugBrokers(boolean z) {
        INSTANCE.setShouldTrustDebugBrokers(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSigningCertificateThumbprint() {
        return this.signingCertificateThumbprint;
    }

    public final BrokerData copy(String packageName, String signingCertificateThumbprint, String nickName) {
        OooOOO0.OooO0oO(packageName, "packageName");
        OooOOO0.OooO0oO(signingCertificateThumbprint, "signingCertificateThumbprint");
        return new BrokerData(packageName, signingCertificateThumbprint, nickName);
    }

    public boolean equals(Object other) {
        if (!(other instanceof BrokerData)) {
            return false;
        }
        BrokerData brokerData = (BrokerData) other;
        return C33595OooOOo.OooOOo(this.packageName, brokerData.packageName, true) && OooOOO0.OooO0O0(this.signingCertificateThumbprint, brokerData.signingCertificateThumbprint);
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getSigningCertificateThumbprint() {
        return this.signingCertificateThumbprint;
    }

    public int hashCode() {
        return this.signingCertificateThumbprint.hashCode() + (this.packageName.hashCode() * 31);
    }

    public String toString() {
        String str = this.nickName;
        if (str != null && str.length() != 0) {
            return this.nickName;
        }
        return this.packageName + "::" + this.signingCertificateThumbprint;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrokerData(String packageName, String signingCertificateThumbprint) {
        this(packageName, signingCertificateThumbprint, null);
        OooOOO0.OooO0oO(packageName, "packageName");
        OooOOO0.OooO0oO(signingCertificateThumbprint, "signingCertificateThumbprint");
    }
}
