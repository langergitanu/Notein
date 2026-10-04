package com.google.firebase.sessions;

import OooOooO.C20741OooOOoo;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, m80612d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFid", "()Ljava/lang/String;", "getAuthToken", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authToken;
    private final String fid;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "<init>", "()V", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(FirebaseInstallationsApi firebaseInstallationsApi, Continuation<? super InstallationId> continuation) {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r10;
            String str;
            ?? r9;
            if (continuation instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuation;
                int i = installationId$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
                }
            }
            Object objOooO0o = installationId$Companion$create$1.result;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = installationId$Companion$create$1.label;
            String str2 = "";
            try {
                try {
                } catch (Exception e) {
                    Log.w(FirebaseSessions.TAG, "Error getting authentication token.", e);
                    r10 = firebaseInstallationsApi;
                    str = "";
                }
            } catch (Exception e2) {
                Log.w(FirebaseSessions.TAG, "Error getting Firebase installation id .", e2);
                r9 = firebaseInstallationsApi;
            }
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                OooOOO0.OooO0o(token, "getToken(...)");
                installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                installationId$Companion$create$1.label = 1;
                objOooO0o = C20741OooOOoo.OooO0o(token, installationId$Companion$create$1);
                firebaseInstallationsApi = firebaseInstallationsApi;
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) installationId$Companion$create$1.L$0;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    firebaseInstallationsApi = str3;
                    String str4 = (String) objOooO0o;
                    r9 = firebaseInstallationsApi;
                    if (str4 != null) {
                        str2 = str4;
                        r9 = firebaseInstallationsApi;
                    }
                    return new InstallationId(str2, r9, null);
                }
                FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                C32446OooOOOo.OooO0O0(objOooO0o);
                firebaseInstallationsApi = firebaseInstallationsApi2;
            }
            String token2 = ((InstallationTokenResult) objOooO0o).getToken();
            r10 = firebaseInstallationsApi;
            str = token2;
            Task<String> id = r10.getId();
            OooOOO0.OooO0o(id, "getId(...)");
            installationId$Companion$create$1.L$0 = str;
            installationId$Companion$create$1.label = 2;
            objOooO0o = C20741OooOOoo.OooO0o(id, installationId$Companion$create$1);
            firebaseInstallationsApi = str;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, C24018OooO0oo c24018OooO0oo) {
        this(str, str2);
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getFid() {
        return this.fid;
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
