package o0OO0o0;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.C21904OooOoo0;
import com.microsoft.identity.client.AcquireTokenSilentParameters;
import com.microsoft.identity.client.IAccount;
import com.microsoft.identity.client.IAuthenticationResult;
import com.microsoft.identity.client.ICurrentAccountResult;
import com.microsoft.identity.client.ISingleAccountPublicClientApplication;
import com.microsoft.identity.client.SignInParameters;
import com.microsoft.identity.client.exception.MsalException;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOO00.C26988OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0o0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26837Oooo0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f92904OooO0o = C24340OooO0oo.OooO0o0("key_one_drive_authority");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f92905OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f92906OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26800OooO f92907OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33781o00o0O f92908OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33769Ooooo0o f92909OooO0o0;

    /* JADX INFO: renamed from: o0OO0o0.Oooo0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f92910OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f92911OooO0O0;

        public OooO00o(String accessToken, String driveId) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(accessToken, "accessToken");
            kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
            this.f92910OooO00o = accessToken;
            this.f92911OooO0O0 = driveId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f92910OooO00o, oooO00o.f92910OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f92911OooO0O0, oooO00o.f92911OooO0O0);
        }

        public final int hashCode() {
            return this.f92911OooO0O0.hashCode() + (this.f92910OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthContext(accessToken=");
            sb.append(this.f92910OooO00o);
            sb.append(", driveId=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f92911OooO0O0, ")");
        }
    }

    public C26837Oooo0OO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, o0000o0O.OooOO0 preferences, C26800OooO oneDriveCloudService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        kotlin.jvm.internal.OooOOO0.OooO0oO(oneDriveCloudService, "oneDriveCloudService");
        this.f92905OooO00o = abstractApplicationC26277OooOoOO;
        this.f92906OooO0O0 = preferences;
        this.f92907OooO0OO = oneDriveCloudService;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f92908OooO0Oo = c33781o00o0OOooO00o;
        this.f92909OooO0o0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C26837Oooo0OO c26837Oooo0OO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C26844OoooO00 c26844OoooO00;
        String str2;
        c26837Oooo0OO.getClass();
        if (abstractC32479OooO0OO instanceof C26844OoooO00) {
            c26844OoooO00 = (C26844OoooO00) abstractC32479OooO0OO;
            int i = c26844OoooO00.f92936OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26844OoooO00.f92936OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26844OoooO00 = new C26844OoooO00(c26837Oooo0OO, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c26844OoooO00.f92935OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26844OoooO00.f92936OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            OooO00o oooO00o = (OooO00o) c26837Oooo0OO.f92908OooO0Oo.getValue();
            if (oooO00o != null && (str2 = oooO00o.f92911OooO0O0) != null) {
                return str2;
            }
            c26844OoooO00.f92936OooOoO0 = 1;
            C26800OooO c26800OooO = c26837Oooo0OO.f92907OooO0OO;
            c26800OooO.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26818OooOOo0(c26800OooO, str, null), c26844OoooO00);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        C26808OooO0oO c26808OooO0oO = (C26808OooO0oO) objOooO0o;
        if (c26808OooO0oO != null) {
            return c26808OooO0oO.getId();
        }
        return null;
    }

    public static String OooO0O0(ISingleAccountPublicClientApplication iSingleAccountPublicClientApplication, IAccount iAccount) throws MsalException, InterruptedException, NoSuchAlgorithmException {
        IAuthenticationResult iAuthenticationResultAcquireTokenSilent = iSingleAccountPublicClientApplication.acquireTokenSilent(new AcquireTokenSilentParameters.Builder().withScopes(C26988OooO0Oo.f93787OooO0OO).forAccount(iAccount).fromAuthority(iAccount.getAuthority()).build());
        kotlin.jvm.internal.OooOOO0.OooO0Oo(iAuthenticationResultAcquireTokenSilent);
        OooO0oO(iAuthenticationResultAcquireTokenSilent, NotificationCompat.GROUP_KEY_SILENT);
        return iAuthenticationResultAcquireTokenSilent.getAccessToken();
    }

    public static void OooO0oO(IAuthenticationResult iAuthenticationResult, String str) throws NoSuchAlgorithmException {
        Date expiresOn = iAuthenticationResult.getExpiresOn();
        kotlin.jvm.internal.OooOOO0.OooO0o(expiresOn, "getExpiresOn(...)");
        long time = (expiresOn.getTime() - System.currentTimeMillis()) / ((long) 1000);
        String accessToken = iAuthenticationResult.getAccessToken();
        kotlin.jvm.internal.OooOOO0.OooO0o(accessToken, "getAccessToken(...)");
        MessageDigest messageDigest = MessageDigest.getInstance(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
        byte[] bytes = accessToken.getBytes(C33580OooO00o.f121231OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        char[] cArr = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            byte b = bArrDigest[i];
            int i2 = i * 2;
            cArr[i2] = "0123456789abcdef".charAt((b & 255) >>> 4);
            cArr[i2 + 1] = "0123456789abcdef".charAt(b & 15);
        }
        String strO0OoOo0 = C33600OooOo0o.o0OoOo0(12, new String(cArr));
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("OneDriveSession");
        c20358OooO00o.OooO0o0("MSAL token %s expiresOn=%s ttl=%ds hash=%s", str, expiresOn, Long.valueOf(time), strO0OoOo0);
    }

    public final Object OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000oOoO(this, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cf, code lost:
    
        if (r12.OooO0oo(r0, r13) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(CloudAuthRequest cloudAuthRequest, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26839Oooo0o0 c26839Oooo0o0;
        C26837Oooo0OO c26837Oooo0OO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26839Oooo0o0) {
            c26839Oooo0o0 = (C26839Oooo0o0) abstractC32479OooO0OO;
            int i = c26839Oooo0o0.f92920OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26839Oooo0o0.f92920OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26839Oooo0o0 = new C26839Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        C26839Oooo0o0 c26839Oooo0o02 = c26839Oooo0o0;
        Object objOooOOo = c26839Oooo0o02.f92918OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26839Oooo0o02.f92920OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            Object payload = cloudAuthRequest != null ? cloudAuthRequest.getPayload() : null;
            SignInParameters.SignInParametersBuilder signInParametersBuilder = payload instanceof SignInParameters.SignInParametersBuilder ? (SignInParameters.SignInParametersBuilder) payload : null;
            if (signInParametersBuilder == null) {
                return new CloudAuthResult.Failure(null, "OneDrive authorization requires activity context", null, 5, null);
            }
            ISingleAccountPublicClientApplication iSingleAccountPublicClientApplication = C26988OooO0Oo.f93786OooO0O0;
            if (iSingleAccountPublicClientApplication == null) {
                return new CloudAuthResult.Failure(null, "OneDrive client not initialized", null, 5, null);
            }
            try {
                c26839Oooo0o02.f92919OooOo0o = this;
                c26839Oooo0o02.f92920OooOoO = 1;
                try {
                    try {
                        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c26839Oooo0o02));
                        c33614OooOOO0.OooOOoo();
                        iSingleAccountPublicClientApplication.signIn(signInParametersBuilder.withScopes(C26988OooO0Oo.f93787OooO0OO).withCallback(new C26847OoooOOO(this, c33614OooOOO0)).build());
                        objOooOOo = c33614OooOOO0.OooOOo();
                        if (objOooOOo != enumC32485OooO00o) {
                            c26837Oooo0OO = this;
                        }
                    } catch (Throwable th) {
                        th = th;
                        c26837Oooo0OO = this;
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26837Oooo0OO = c26839Oooo0o02.f92919OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            ((C32445OooOOOO) objOooOOo).getClass();
            c26837Oooo0OO.getClass();
            return CloudAuthResult.Success.INSTANCE;
        }
        c26837Oooo0OO = c26839Oooo0o02.f92919OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objOooOOo);
        } catch (Throwable th4) {
            th = th4;
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        objOooO00o = (IAuthenticationResult) objOooOOo;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveSession");
            c20358OooO00o.OooO0Oo(thOooO00o, "OneDrive interactive signIn failed", new Object[0]);
            return new CloudAuthResult.Failure(null, thOooO00o.getMessage(), thOooO00o, 1, null);
        }
        String authority = ((IAuthenticationResult) objOooO00o).getAccount().getAuthority();
        c26839Oooo0o02.f92919OooOo0o = c26837Oooo0OO;
        c26839Oooo0o02.f92920OooOoO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ff, code lost:
    
        if (r0 == r1) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:16:0x0032, B:77:0x0102, B:22:0x0044, B:73:0x00f1, B:25:0x004b, B:69:0x00dc, B:61:0x00c0, B:64:0x00c5, B:66:0x00c9, B:70:0x00e2, B:60:0x00bb, B:33:0x0066, B:43:0x0085, B:45:0x0089, B:47:0x008f, B:74:0x00f5, B:36:0x006d, B:39:0x007e), top: B:81:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:16:0x0032, B:77:0x0102, B:22:0x0044, B:73:0x00f1, B:25:0x004b, B:69:0x00dc, B:61:0x00c0, B:64:0x00c5, B:66:0x00c9, B:70:0x00e2, B:60:0x00bb, B:33:0x0066, B:43:0x0085, B:45:0x0089, B:47:0x008f, B:74:0x00f5, B:36:0x006d, B:39:0x007e), top: B:81:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(CloudAuthRequest cloudAuthRequest, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26838Oooo0o c26838Oooo0o;
        C26837Oooo0OO c26837Oooo0OO;
        C26837Oooo0OO c26837Oooo0OO2;
        CloudAuthRequest cloudAuthRequest2;
        IAccount iAccount;
        ICurrentAccountResult currentAccount;
        Object objOooO00o;
        C26837Oooo0OO c26837Oooo0OO3;
        Object obj;
        if (abstractC32479OooO0OO instanceof C26838Oooo0o) {
            c26838Oooo0o = (C26838Oooo0o) abstractC32479OooO0OO;
            int i = c26838Oooo0o.f92917OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26838Oooo0o.f92917OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26838Oooo0o = new C26838Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        C26838Oooo0o c26838Oooo0o2 = c26838Oooo0o;
        Object objOooO0O0 = c26838Oooo0o2.f92914OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26838Oooo0o2.f92917OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                c26838Oooo0o2.f92913OooOo0o = this;
                c26838Oooo0o2.f92912OooOo = cloudAuthRequest;
                c26838Oooo0o2.f92917OooOoo0 = 1;
                Object objOooO00o2 = C26988OooO0Oo.f93785OooO00o.OooO00o(this.f92905OooO00o, c26838Oooo0o2);
                if (objOooO00o2 != enumC32485OooO00o) {
                    objOooO00o2 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO00o2 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26837Oooo0OO = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c26837Oooo0OO3 = c26838Oooo0o2.f92913OooOo0o;
                            C32446OooOOOo.OooO0O0(objOooO0O0);
                            ((C32445OooOOOO) objOooO0O0).getClass();
                            c26837Oooo0OO3.getClass();
                            return CloudAuthResult.Success.INSTANCE;
                        }
                        if (i2 == 4) {
                            C32446OooOOOo.OooO0O0(objOooO0O0);
                            return (CloudAuthResult) objOooO0O0;
                        }
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(objOooO0O0);
                        return (CloudAuthResult) objOooO0O0;
                    }
                    iAccount = c26838Oooo0o2.f92915OooOoO0;
                    cloudAuthRequest2 = c26838Oooo0o2.f92912OooOo;
                    c26837Oooo0OO2 = c26838Oooo0o2.f92913OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0O0);
                        objOooO00o = (String) objOooO0O0;
                    } catch (Throwable th) {
                        th = th;
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    Object obj2 = objOooO00o;
                    IAccount iAccount2 = iAccount;
                    c26837Oooo0OO3 = c26837Oooo0OO2;
                    CloudAuthRequest cloudAuthRequest3 = cloudAuthRequest2;
                    obj = obj2;
                    if (obj instanceof C32445OooOOOO.OooO00o) {
                        obj = null;
                    }
                    if (((String) obj) != null) {
                        c26838Oooo0o2.f92913OooOo0o = null;
                        c26838Oooo0o2.f92912OooOo = null;
                        c26838Oooo0o2.f92915OooOoO0 = null;
                        c26838Oooo0o2.f92917OooOoo0 = 4;
                        objOooO0O0 = c26837Oooo0OO3.OooO0OO(cloudAuthRequest3, c26838Oooo0o2);
                        if (objOooO0O0 == enumC32485OooO00o) {
                        }
                        return (CloudAuthResult) objOooO0O0;
                    }
                    String authority = iAccount2.getAuthority();
                    c26838Oooo0o2.f92913OooOo0o = c26837Oooo0OO3;
                    c26838Oooo0o2.f92912OooOo = null;
                    c26838Oooo0o2.f92915OooOoO0 = null;
                    c26838Oooo0o2.f92917OooOoo0 = 3;
                    if (c26837Oooo0OO3.OooO0oo(authority, c26838Oooo0o2) == enumC32485OooO00o) {
                    }
                    c26837Oooo0OO3.getClass();
                    return CloudAuthResult.Success.INSTANCE;
                    return enumC32485OooO00o;
                }
                cloudAuthRequest = c26838Oooo0o2.f92912OooOo;
                c26837Oooo0OO = c26838Oooo0o2.f92913OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            ISingleAccountPublicClientApplication iSingleAccountPublicClientApplication = C26988OooO0Oo.f93786OooO0O0;
            IAccount currentAccount2 = (iSingleAccountPublicClientApplication == null || (currentAccount = iSingleAccountPublicClientApplication.getCurrentAccount()) == null) ? null : currentAccount.getCurrentAccount();
            if (currentAccount2 != null) {
                try {
                    c26838Oooo0o2.f92913OooOo0o = c26837Oooo0OO;
                    c26838Oooo0o2.f92912OooOo = cloudAuthRequest;
                    c26838Oooo0o2.f92915OooOoO0 = currentAccount2;
                    c26838Oooo0o2.f92917OooOoo0 = 2;
                    c26837Oooo0OO.getClass();
                    objOooO0O0 = OooO0O0(iSingleAccountPublicClientApplication, currentAccount2);
                } catch (Throwable th2) {
                    th = th2;
                    c26837Oooo0OO2 = c26837Oooo0OO;
                    cloudAuthRequest2 = cloudAuthRequest;
                    iAccount = currentAccount2;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (objOooO0O0 != enumC32485OooO00o) {
                    c26837Oooo0OO2 = c26837Oooo0OO;
                    cloudAuthRequest2 = cloudAuthRequest;
                    iAccount = currentAccount2;
                    objOooO00o = (String) objOooO0O0;
                    Object obj22 = objOooO00o;
                    IAccount iAccount22 = iAccount;
                    c26837Oooo0OO3 = c26837Oooo0OO2;
                    CloudAuthRequest cloudAuthRequest32 = cloudAuthRequest2;
                    obj = obj22;
                    if (obj instanceof C32445OooOOOO.OooO00o) {
                    }
                    if (((String) obj) != null) {
                    }
                }
            } else {
                c26838Oooo0o2.f92913OooOo0o = null;
                c26838Oooo0o2.f92912OooOo = null;
                c26838Oooo0o2.f92917OooOoo0 = 5;
                objOooO0O0 = c26837Oooo0OO.OooO0OO(cloudAuthRequest, c26838Oooo0o2);
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveSession");
            c20358OooO00o.OooO0Oo(th3, "ensureSignedIn failed", new Object[0]);
            return new CloudAuthResult.Failure(null, th3.getMessage(), th3, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26832Oooo c26832Oooo;
        if (abstractC32479OooO0OO instanceof C26832Oooo) {
            c26832Oooo = (C26832Oooo) abstractC32479OooO0OO;
            int i = c26832Oooo.f92866OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26832Oooo.f92866OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26832Oooo = new C26832Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26832Oooo.f92865OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26832Oooo.f92866OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c26832Oooo.f92866OooOoO0 = 1;
                if (OooO(c26832Oooo) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r2.f92907OooO0OO.OooO0o(r0) != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26840Oooo0oO c26840Oooo0oO;
        C26837Oooo0OO c26837Oooo0OO;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C26840Oooo0oO) {
            c26840Oooo0oO = (C26840Oooo0oO) abstractC32479OooO0OO;
            int i = c26840Oooo0oO.f92924OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26840Oooo0oO.f92924OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26840Oooo0oO = new C26840Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26840Oooo0oO.f92922OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26840Oooo0oO.f92924OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            try {
                c26840Oooo0oO.f92923OooOo0o = this;
                c26840Oooo0oO.f92924OooOoO = 1;
                if (OooOO0(c26840Oooo0oO) != enumC32485OooO00o) {
                    c26837Oooo0OO = this;
                }
            } catch (Throwable th) {
                th = th;
                c26837Oooo0OO = this;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            c26837Oooo0OO = c26840Oooo0oO.f92923OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th2) {
                th = th2;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            c26837Oooo0OO = c26840Oooo0oO.f92923OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c26837Oooo0OO.f92908OooO0Oo.setValue(null);
            c26840Oooo0oO.f92923OooOo0o = null;
            c26840Oooo0oO.f92924OooOoO = 3;
        }
        objOooO00o = C32460OooOooO.f116667OooO00o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OneDriveSession");
            c20358OooO00o.OooO0Oo(thOooO00o, "cancelAuthorization: signOut failed", new Object[0]);
        }
        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = c26837Oooo0OO.f92906OooO0O0;
        C26841Oooo0oo c26841Oooo0oo = new C26841Oooo0oo(2, null);
        c26840Oooo0oO.f92923OooOo0o = c26837Oooo0OO;
        c26840Oooo0oO.f92924OooOoO = 2;
        if (C24332OooO.OooO00o(oooOO02, c26841Oooo0oo, c26840Oooo0oO) != enumC32485OooO00o) {
            c26837Oooo0OO.f92908OooO0Oo.setValue(null);
            c26840Oooo0oO.f92923OooOo0o = null;
            c26840Oooo0oO.f92924OooOoO = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26842OoooO c26842OoooO;
        if (abstractC32479OooO0OO instanceof C26842OoooO) {
            c26842OoooO = (C26842OoooO) abstractC32479OooO0OO;
            int i = c26842OoooO.f92929OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26842OoooO.f92929OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26842OoooO = new C26842OoooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26842OoooO.f92928OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26842OoooO.f92929OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = this.f92906OooO0O0;
                C26846OoooOO0 c26846OoooOO0 = new C26846OoooOO0(str, null);
                c26842OoooO.f92929OooOoO0 = 1;
                if (C24332OooO.OooO00o(oooOO02, c26846OoooOO0, c26842OoooO) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26848OoooOOo c26848OoooOOo;
        if (abstractC32479OooO0OO instanceof C26848OoooOOo) {
            c26848OoooOOo = (C26848OoooOOo) abstractC32479OooO0OO;
            int i = c26848OoooOOo.f92945OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26848OoooOOo.f92945OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26848OoooOOo = new C26848OoooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26848OoooOOo.f92943OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26848OoooOOo.f92945OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ISingleAccountPublicClientApplication iSingleAccountPublicClientApplication = C26988OooO0Oo.f93786OooO0O0;
            if (iSingleAccountPublicClientApplication == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            c26848OoooOOo.f92944OooOo0o = iSingleAccountPublicClientApplication;
            c26848OoooOOo.f92945OooOoO = 1;
            C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c26848OoooOOo));
            c33614OooOOO0.OooOOoo();
            iSingleAccountPublicClientApplication.signOut(new C26849OoooOo0(c33614OooOOO0));
            if (c33614OooOOO0.OooOOo() == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C26988OooO0Oo c26988OooO0Oo = C26988OooO0Oo.f93785OooO00o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("OneDriveRequestManager");
        c20358OooO00o.OooO0o0("OneDriveManager.cancelAuthorize.", new Object[0]);
        C26988OooO0Oo.f93786OooO0O0 = null;
        return C32460OooOooO.f116667OooO00o;
    }
}
