package com.google.firebase.auth;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.huawei.hms.network.embedded.C18374u4;
import com.microsoft.identity.common.internal.p590ui.webview.ProcessUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00102\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0015\u0010\u0011\u001a\u00020\u0010*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, m80612d2 = {"Lkotlin/Function1;", "Lcom/google/firebase/auth/ActionCodeSettings$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/auth/ActionCodeSettings;", "actionCodeSettings", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/auth/ActionCodeSettings;", "", "providerId", "Lcom/google/firebase/auth/OAuthProvider$CredentialBuilder;", "Lcom/google/firebase/auth/AuthCredential;", "oAuthCredential", "(Ljava/lang/String;LoO0O000o/OooOO0o;)Lcom/google/firebase/auth/AuthCredential;", "Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/auth/FirebaseAuth;", ProcessUtil.AuthServiceProcess, "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/auth/FirebaseAuth;", "Lcom/google/firebase/auth/OAuthProvider$Builder;", "Lcom/google/firebase/auth/OAuthProvider;", "oAuthProvider", "(Ljava/lang/String;LoO0O000o/OooOO0o;)Lcom/google/firebase/auth/OAuthProvider;", "firebaseAuth", "(Ljava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;LoO0O000o/OooOO0o;)Lcom/google/firebase/auth/OAuthProvider;", "Lcom/google/firebase/auth/UserProfileChangeRequest$Builder;", "Lcom/google/firebase/auth/UserProfileChangeRequest;", "userProfileChangeRequest", "(LoO0O000o/OooOO0o;)Lcom/google/firebase/auth/UserProfileChangeRequest;", "getAuth", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/auth/FirebaseAuth;", "java.com.google.android.gmscore.integ.client.firebase-auth-api_firebase-auth-api"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AuthKt {
    public static final ActionCodeSettings actionCodeSettings(InterfaceC32507OooOO0o<? super ActionCodeSettings.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(init, "init");
        ActionCodeSettings.Builder builderNewBuilder = ActionCodeSettings.newBuilder();
        OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        ActionCodeSettings actionCodeSettingsBuild = builderNewBuilder.build();
        OooOOO0.OooO0o(actionCodeSettingsBuild, "build(...)");
        return actionCodeSettingsBuild;
    }

    public static final FirebaseAuth auth(Firebase firebase, FirebaseApp app) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(app, "app");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(app);
        OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final FirebaseAuth getAuth(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final AuthCredential oAuthCredential(String providerId, InterfaceC32507OooOO0o<? super OAuthProvider.CredentialBuilder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(providerId, "providerId");
        OooOOO0.OooO0oO(init, "init");
        OAuthProvider.CredentialBuilder credentialBuilderNewCredentialBuilder = OAuthProvider.newCredentialBuilder(providerId);
        OooOOO0.OooO0o(credentialBuilderNewCredentialBuilder, "newCredentialBuilder(...)");
        init.invoke(credentialBuilderNewCredentialBuilder);
        AuthCredential authCredentialBuild = credentialBuilderNewCredentialBuilder.build();
        OooOOO0.OooO0o(authCredentialBuild, "build(...)");
        return authCredentialBuild;
    }

    public static final OAuthProvider oAuthProvider(String providerId, InterfaceC32507OooOO0o<? super OAuthProvider.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(providerId, "providerId");
        OooOOO0.OooO0oO(init, "init");
        OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder(providerId);
        OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        OAuthProvider oAuthProviderBuild = builderNewBuilder.build();
        OooOOO0.OooO0o(oAuthProviderBuild, "build(...)");
        return oAuthProviderBuild;
    }

    public static final UserProfileChangeRequest userProfileChangeRequest(InterfaceC32507OooOO0o<? super UserProfileChangeRequest.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(init, "init");
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        init.invoke(builder);
        UserProfileChangeRequest userProfileChangeRequestBuild = builder.build();
        OooOOO0.OooO0o(userProfileChangeRequestBuild, "build(...)");
        return userProfileChangeRequestBuild;
    }

    public static final OAuthProvider oAuthProvider(String providerId, FirebaseAuth firebaseAuth, InterfaceC32507OooOO0o<? super OAuthProvider.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(providerId, "providerId");
        OooOOO0.OooO0oO(firebaseAuth, "firebaseAuth");
        OooOOO0.OooO0oO(init, "init");
        OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder(providerId, firebaseAuth);
        OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
        init.invoke(builderNewBuilder);
        OAuthProvider oAuthProviderBuild = builderNewBuilder.build();
        OooOOO0.OooO0o(oAuthProviderBuild, "build(...)");
        return oAuthProviderBuild;
    }
}
