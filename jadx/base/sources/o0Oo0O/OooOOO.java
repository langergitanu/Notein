package o0Oo0O;

import OooOoOO.C20519OooO0Oo;
import OooOooO.C20741OooOOoo;
import Oooo0oO.C21091o0000o;
import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.MessageDigest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o00oo0Oo.C25706OooOoO;
import o0OOOoo.C27205OooO0OO;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import o0Oo0OO.C28063OooO00o;
import o0Oo0OO0.C28066OooO0OO;
import o0Oo0OO0.C28070OooO0oO;
import o0Oo0OO0.C28071OooO0oo;
import o0oo000O.C31183OooO00o;
import oO000oo.C32132OooO0Oo;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32187OooOO0o;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32192OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33207OooOO0O;
import oO0Oo0Oo.C33209OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOoo0.C34614OooOo0o;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Oo0O/OooOOO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooOOO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final StandardIntegrityManager f99426OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27322Oooo0o0 f99427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C32447OooOOo f99428OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f99429OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C32447OooOOo f99430OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f99431OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public StandardIntegrityManager.StandardIntegrityTokenProvider f99432OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public C28071OooO0oo f99433OooOO0O;

    public OooOOO(InterfaceC27322Oooo0o0 remoteConfigRepo, o0000o0O.OooOO0<AbstractC24338OooO0o0> userIrrelevantDataStore, Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(remoteConfigRepo, "remoteConfigRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(userIrrelevantDataStore, "userIrrelevantDataStore");
        this.f99427OooO0Oo = remoteConfigRepo;
        this.f99429OooO0o0 = userIrrelevantDataStore;
        this.f99428OooO0o = C20519OooO0Oo.OooO0OO(new C25706OooOoO(this, 1));
        this.f99430OooO0oO = C20519OooO0Oo.OooO0OO(new C28040OooO00o());
        this.f99431OooO0oo = new Object();
        StandardIntegrityManager standardIntegrityManagerCreateStandard = IntegrityManagerFactory.createStandard(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(standardIntegrityManagerCreateStandard, "createStandard(...)");
        this.f99426OooO = standardIntegrityManagerCreateStandard;
        this.f99433OooOO0O = C28071OooO0oo.f99511OooO0o0;
        Task<StandardIntegrityManager.StandardIntegrityTokenProvider> taskPrepareIntegrityToken = standardIntegrityManagerCreateStandard.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(C31183OooO00o.f111226OooO0o0).build());
        final C28041OooO0O0 c28041OooO0O0 = new C28041OooO0O0(this, 0);
        taskPrepareIntegrityToken.addOnSuccessListener(new OnSuccessListener() { // from class: o0Oo0O.OooO0OO
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) throws Exception {
                c28041OooO0O0.invoke(obj);
            }
        }).addOnFailureListener(new C28043OooO0Oo());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:59:0x0168, B:61:0x016c, B:63:0x0182, B:64:0x01a7, B:66:0x01ac, B:69:0x01af, B:70:0x01b0, B:21:0x0050, B:51:0x0116, B:53:0x011a, B:55:0x0130, B:47:0x0102, B:65:0x01a8), top: B:78:0x002c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:59:0x0168, B:61:0x016c, B:63:0x0182, B:64:0x01a7, B:66:0x01ac, B:69:0x01af, B:70:0x01b0, B:21:0x0050, B:51:0x0116, B:53:0x011a, B:55:0x0130, B:47:0x0102, B:65:0x01a8), top: B:78:0x002c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016c A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:59:0x0168, B:61:0x016c, B:63:0x0182, B:64:0x01a7, B:66:0x01ac, B:69:0x01af, B:70:0x01b0, B:21:0x0050, B:51:0x0116, B:53:0x011a, B:55:0x0130, B:47:0x0102, B:65:0x01a8), top: B:78:0x002c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:14:0x0038, B:59:0x0168, B:61:0x016c, B:63:0x0182, B:64:0x01a7, B:66:0x01ac, B:69:0x01af, B:70:0x01b0, B:21:0x0050, B:51:0x0116, B:53:0x011a, B:55:0x0130, B:47:0x0102, B:65:0x01a8), top: B:78:0x002c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider;
        String commandString;
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider2;
        OooOOO oooOOO;
        String str2;
        String str3;
        OooOOO oooOOO2;
        C28071OooO0oo c28071OooO0oo;
        StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken;
        String str4;
        OooOOO oooOOO3;
        C28066OooO0OO c28066OooO0OO;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f99419OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f99419OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = oooOO02.f99416OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f99419OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0oO);
                synchronized (this.f99431OooO0oo) {
                    standardIntegrityTokenProvider = this.f99432OooOO0;
                }
                if (standardIntegrityTokenProvider == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("IntegrityViewModel");
                    c20358OooO00o.OooO0o0("integrityTokenProvider is null", new Object[0]);
                    return new C28071OooO0oo(o0Oo0OO0.OooO.f99480OooOo0o, 14);
                }
                oooOO02.f99415OooOo0o = this;
                commandString = str;
                oooOO02.f99414OooOo = commandString;
                oooOO02.f99417OooOoO0 = standardIntegrityTokenProvider;
                oooOO02.f99419OooOoo0 = 1;
                Object objOooO0o0 = OooO0o0(oooOO02);
                if (objOooO0o0 != enumC32485OooO00o) {
                    standardIntegrityTokenProvider2 = standardIntegrityTokenProvider;
                    objOooO0oO = objOooO0o0;
                    oooOOO = this;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = oooOO02.f99414OooOo;
                    oooOOO3 = oooOO02.f99415OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oO);
                    c28066OooO0OO = (C28066OooO0OO) objOooO0oO;
                    if (c28066OooO0OO != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("IntegrityViewModel");
                        c20358OooO00o2.OooO0o0("performCommand failed", new Object[0]);
                        return new C28071OooO0oo(o0Oo0OO0.OooO.f99482OooOoO0, 14);
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("IntegrityViewModel");
                    c20358OooO00o3.OooO0o0("performCommand success. " + c28066OooO0OO, new Object[0]);
                    C28071OooO0oo c28071OooO0oo2 = new C28071OooO0oo(o0Oo0OO0.OooO.f99479OooOo, str4, c28066OooO0OO.f99494OooO0OO, c28066OooO0OO.f99492OooO00o);
                    synchronized (oooOOO3.f99433OooOO0O) {
                        oooOOO3.f99433OooOO0O = c28071OooO0oo2;
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    return c28071OooO0oo2;
                }
                str2 = (String) oooOO02.f99417OooOoO0;
                str3 = oooOO02.f99414OooOo;
                oooOOO2 = oooOO02.f99415OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                standardIntegrityToken = (StandardIntegrityManager.StandardIntegrityToken) objOooO0oO;
                if (standardIntegrityToken != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("IntegrityViewModel");
                    c20358OooO00o4.OooO0o0("requestIntegrityToken failed. IntegrityTokenResponse is null", new Object[0]);
                    return new C28071OooO0oo(o0Oo0OO0.OooO.f99481OooOoO, 14);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("IntegrityViewModel");
                c20358OooO00o5.OooO00o("requestIntegrityToken success: " + standardIntegrityToken.token(), new Object[0]);
                String str5 = standardIntegrityToken.token();
                kotlin.jvm.internal.OooOOO0.OooO0o(str5, "token(...)");
                oooOO02.f99415OooOo0o = oooOOO2;
                oooOO02.f99414OooOo = str2;
                oooOO02.f99417OooOoO0 = null;
                oooOO02.f99419OooOoo0 = 3;
                objOooO0oO = oooOOO2.OooO0oO(str3, str5, oooOO02);
                if (objOooO0oO != enumC32485OooO00o) {
                    str4 = str2;
                    oooOOO3 = oooOOO2;
                    c28066OooO0OO = (C28066OooO0OO) objOooO0oO;
                    if (c28066OooO0OO != null) {
                    }
                }
                return enumC32485OooO00o;
            }
            StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider3 = (StandardIntegrityManager.StandardIntegrityTokenProvider) oooOO02.f99417OooOoO0;
            String str6 = oooOO02.f99414OooOo;
            oooOOO = oooOO02.f99415OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
            standardIntegrityTokenProvider2 = standardIntegrityTokenProvider3;
            commandString = str6;
            if (!((Boolean) objOooO0oO).booleanValue()) {
                synchronized (oooOOO.f99433OooOO0O) {
                    c28071OooO0oo = oooOOO.f99433OooOO0O;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o6.OooOOO0("IntegrityViewModel");
                c20358OooO00o6.OooO0o0("Integrity check interval not reached. Returning cached state. " + c28071OooO0oo, new Object[0]);
                return c28071OooO0oo;
            }
            kotlin.jvm.internal.OooOOO0.OooO0oO(commandString, "commandString");
            MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
            byte[] bytes = commandString.getBytes(C33580OooO00o.f121231OooO0O0);
            kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(bArrDigest);
            String strOooo00o = oOo000Oo.OooOOO.Oooo00o(bArrDigest, "", new C28063OooO00o(), 30);
            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o7.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o7, "PlayIntegrityNotein", "requestHash: ", strOooo00o), new Object[0]);
            oooOO02.f99415OooOo0o = oooOOO;
            oooOO02.f99414OooOo = commandString;
            oooOO02.f99417OooOoO0 = strOooo00o;
            oooOO02.f99419OooOoo0 = 2;
            Object objOooO0oo = oooOOO.OooO0oo(standardIntegrityTokenProvider2, strOooo00o, oooOO02);
            if (objOooO0oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            String str7 = commandString;
            str2 = strOooo00o;
            objOooO0oO = objOooO0oo;
            str3 = str7;
            oooOOO2 = oooOOO;
            standardIntegrityToken = (StandardIntegrityManager.StandardIntegrityToken) objOooO0oO;
            if (standardIntegrityToken != null) {
            }
        } catch (Throwable th) {
            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o8.OooOOO0("IntegrityViewModel");
            c20358OooO00o8.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("requestIntegrityToken exception ", th.getMessage()), new Object[0]);
            return new C28071OooO0oo(o0Oo0OO0.OooO.f99481OooOoO, 14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r14, r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28046OooO0oo c28046OooO0oo;
        long jLongValue;
        long jCurrentTimeMillis;
        OooOOO oooOOO;
        if (abstractC32479OooO0OO instanceof C28046OooO0oo) {
            c28046OooO0oo = (C28046OooO0oo) abstractC32479OooO0OO;
            int i = c28046OooO0oo.f99413OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28046OooO0oo.f99413OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c28046OooO0oo = new C28046OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c28046OooO0oo.f99410OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28046OooO0oo.f99413OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            jLongValue = ((Number) this.f99428OooO0o.getValue()).longValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("IntegrityViewModel");
            c20358OooO00o.OooO0o0("Integrity check value: " + jLongValue, new Object[0]);
            if (jLongValue <= 0) {
                c20358OooO00o.OooOOO0("IntegrityViewModel");
                c20358OooO00o.OooO00o("Integrity check is disabled", new Object[0]);
                return Boolean.FALSE;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = this.f99429OooO0o0.getData();
            c28046OooO0oo.f99409OooOo0o = this;
            c28046OooO0oo.f99408OooOo = jLongValue;
            c28046OooO0oo.f99411OooOoO0 = jCurrentTimeMillis;
            c28046OooO0oo.f99413OooOoo0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(data, c28046OooO0oo);
            if (objOooOOo != enumC32485OooO00o) {
                oooOOO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo);
            return Boolean.TRUE;
        }
        jCurrentTimeMillis = c28046OooO0oo.f99411OooOoO0;
        jLongValue = c28046OooO0oo.f99408OooOo;
        oooOOO = c28046OooO0oo.f99409OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo);
        Long l = (Long) ((AbstractC24338OooO0o0) objOooOOo).OooO0OO(C27205OooO0OO.f95019OooOOoo);
        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) < jLongValue) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("IntegrityViewModel");
            c20358OooO00o2.OooO00o("Integrity check interval not reached", new Object[0]);
            return Boolean.FALSE;
        }
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooOOO.f99429OooO0o0;
        OooO oooO = new OooO(jCurrentTimeMillis, null);
        c28046OooO0oo.f99409OooOo0o = null;
        c28046OooO0oo.f99413OooOoo0 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (r14 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28047OooOO0o c28047OooOO0o;
        if (abstractC32479OooO0OO instanceof C28047OooOO0o) {
            c28047OooOO0o = (C28047OooOO0o) abstractC32479OooO0OO;
            int i = c28047OooOO0o.f99425OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28047OooOO0o.f99425OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28047OooOO0o = new C28047OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c28047OooOO0o.f99424OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28047OooOO0o.f99425OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                oO000o0.OooO0o oooO0o = (oO000o0.OooO0o) this.f99430OooO0oO.getValue();
                C32132OooO0Oo c32132OooO0Oo = new C32132OooO0Oo();
                C21091o0000o.OooOOo0(c32132OooO0Oo, "https://blissful-hash-404505.uc.r.appspot.com/performCommand");
                C32183OooO0Oo type = C32183OooO0Oo.OooO00o.f115523OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                List<String> list = C32190OooOOo0.f115537OooO00o;
                String value = type.toString();
                C32187OooOO0o c32187OooOO0o = c32132OooO0Oo.f115205OooO0OO;
                c32187OooOO0o.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                c32187OooOO0o.OooO0oo(value);
                List<String> listOooO0Oo = c32187OooOO0o.OooO0Oo("Content-Type");
                listOooO0Oo.clear();
                listOooO0Oo.add(value);
                c32132OooO0Oo.f115206OooO0Oo = new C28070OooO0oO(str, str2);
                InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o = C24035Oooo00o.OooO00o(C28070OooO0oO.class);
                c32132OooO0Oo.OooO0OO(o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o), C24035Oooo00o.f80943OooO00o.OooO0O0(C28070OooO0oO.class), interfaceC34606OooOOOoOooO00o));
                c32132OooO0Oo.OooO0Oo(C32192OooOo0.f115539OooO0OO);
                C33209OooOOO0 c33209OooOOO0 = new C33209OooOOO0(c32132OooO0Oo, oooO0o);
                c28047OooOO0o.f99425OooOoO0 = 1;
                objOooO0O0 = c33209OooOOO0.OooO0O0(new C33207OooOO0O(2, null), c28047OooOO0o);
                if (objOooO0O0 == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
                if (objOooO0O0 != null) {
                    return (C28066OooO0OO) objOooO0O0;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.orion.notein.integrity.data.CommandResult");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
            ooOOOOOo.OooO0OO oooO0OOOooO00o = ((AbstractC33200OooO0OO) objOooO0O0).OooO00o();
            InterfaceC34606OooOOOo interfaceC34606OooOOOoOooO00o2 = C24035Oooo00o.OooO00o(C28066OooO0OO.class);
            oOOoOoOO.OooO00o oooO00oOooO = o000ooOO.OooOOO0.OooO(C34614OooOo0o.OooO0Oo(interfaceC34606OooOOOoOooO00o2), C24035Oooo00o.f80943OooO00o.OooO0O0(C28066OooO0OO.class), interfaceC34606OooOOOoOooO00o2);
            c28047OooOO0o.f99425OooOoO0 = 2;
            objOooO0O0 = oooO0OOOooO00o.OooO00o(oooO00oOooO, c28047OooOO0o);
        } catch (Throwable th) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("IntegrityViewModel");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("performCommand exception ", th.getMessage()), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO0 oooOOO0;
        Task<StandardIntegrityManager.StandardIntegrityToken> taskRequest;
        if (abstractC32479OooO0OO instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) abstractC32479OooO0OO;
            int i = oooOOO0.f99436OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f99436OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOOO0.f99434OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO0.f99436OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                taskRequest = standardIntegrityTokenProvider.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build());
                kotlin.jvm.internal.OooOOO0.OooO0o(taskRequest, "request(...)");
                oooOOO0.f99435OooOo0o = taskRequest;
                oooOOO0.f99436OooOoO = 1;
                if (C20741OooOOoo.OooO0o(taskRequest, oooOOO0) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                taskRequest = oooOOO0.f99435OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            return taskRequest.getResult();
        } catch (Throwable th) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("IntegrityViewModel");
            c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("requestIntegrityToken exception ", th.getMessage()), new Object[0]);
            return null;
        }
    }
}
