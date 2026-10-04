package com.google.firebase.functions;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.RunnableC21771OooO0Oo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.functions.FirebaseFunctionsException;
import com.google.firebase.functions.dagger.assisted.Assisted;
import com.google.firebase.functions.dagger.assisted.AssistedInject;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.base.util.HttpUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\u00020\u0001:\u0001FBG\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u001e¢\u0006\u0004\b\u001a\u0010\u001fJ\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b.\u0010/J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b.\u00100J/\u00105\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b3\u00104J/\u00105\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b3\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m80612d2 = {"Lcom/google/firebase/functions/FirebaseFunctions;", "", "Landroid/content/Context;", "context", "", "projectId", "regionOrCustomDomain", "Lcom/google/firebase/functions/ContextProvider;", "contextProvider", "Ljava/util/concurrent/Executor;", "executor", "uiExecutor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/functions/ContextProvider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "Ljava/net/URL;", "url", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/google/firebase/functions/HttpsCallableContext;", "Lcom/google/firebase/functions/HttpsCallOptions;", "options", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/functions/HttpsCallableResult;", NotificationCompat.CATEGORY_CALL, "(Ljava/net/URL;Ljava/lang/Object;Lcom/google/firebase/functions/HttpsCallableContext;Lcom/google/firebase/functions/HttpsCallOptions;)Lcom/google/android/gms/tasks/Task;", "name", "Lcom/google/firebase/functions/HttpsCallableReference;", "getHttpsCallable", "(Ljava/lang/String;)Lcom/google/firebase/functions/HttpsCallableReference;", "getHttpsCallableFromUrl", "(Ljava/net/URL;)Lcom/google/firebase/functions/HttpsCallableReference;", "Lcom/google/firebase/functions/HttpsCallableOptions;", "(Ljava/lang/String;Lcom/google/firebase/functions/HttpsCallableOptions;)Lcom/google/firebase/functions/HttpsCallableReference;", "(Ljava/net/URL;Lcom/google/firebase/functions/HttpsCallableOptions;)Lcom/google/firebase/functions/HttpsCallableReference;", "function", "getURL$com_google_firebase_firebase_functions", "(Ljava/lang/String;)Ljava/net/URL;", "getURL", "origin", "LoO00ooO/OooOooO;", "useFunctionsEmulator", "(Ljava/lang/String;)V", "host", "", "port", "useEmulator", "(Ljava/lang/String;I)V", "call$com_google_firebase_firebase_functions", "(Ljava/lang/String;Ljava/lang/Object;Lcom/google/firebase/functions/HttpsCallOptions;)Lcom/google/android/gms/tasks/Task;", "(Ljava/net/URL;Ljava/lang/Object;Lcom/google/firebase/functions/HttpsCallOptions;)Lcom/google/android/gms/tasks/Task;", "LoOO00OOO/OooO00o;", "Lcom/google/firebase/functions/StreamResponse;", "stream$com_google_firebase_firebase_functions", "(Ljava/lang/String;Ljava/lang/Object;Lcom/google/firebase/functions/HttpsCallOptions;)LoOO00OOO/OooO00o;", "stream", "(Ljava/net/URL;Ljava/lang/Object;Lcom/google/firebase/functions/HttpsCallOptions;)LoOO00OOO/OooO00o;", "Ljava/util/concurrent/Executor;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/OkHttpClient;", "Lcom/google/firebase/functions/Serializer;", "serializer", "Lcom/google/firebase/functions/Serializer;", "Lcom/google/firebase/functions/ContextProvider;", "Ljava/lang/String;", "region", "customDomain", "urlFormat", "Lcom/google/firebase/emulators/EmulatedServiceSettings;", "emulatorSettings", "Lcom/google/firebase/emulators/EmulatedServiceSettings;", "Companion", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class FirebaseFunctions {
    private static boolean providerInstallStarted;
    private final OkHttpClient client;
    private final ContextProvider contextProvider;
    private String customDomain;
    private EmulatedServiceSettings emulatorSettings;
    private final Executor executor;
    private final String projectId;
    private String region;
    private final Serializer serializer;
    private String urlFormat;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TaskCompletionSource<Void> providerInstalled = new TaskCompletionSource<>();

    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m80612d2 = {"Lcom/google/firebase/functions/FirebaseFunctions$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "uiExecutor", "LoO00ooO/OooOooO;", "maybeInstallProviders", "(Landroid/content/Context;Ljava/util/concurrent/Executor;)V", "Lcom/google/firebase/FirebaseApp;", "app", "", "regionOrCustomDomain", "Lcom/google/firebase/functions/FirebaseFunctions;", "getInstance", "(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)Lcom/google/firebase/functions/FirebaseFunctions;", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/functions/FirebaseFunctions;", "(Ljava/lang/String;)Lcom/google/firebase/functions/FirebaseFunctions;", "()Lcom/google/firebase/functions/FirebaseFunctions;", "Lcom/google/android/gms/tasks/TaskCompletionSource;", "Ljava/lang/Void;", "providerInstalled", "Lcom/google/android/gms/tasks/TaskCompletionSource;", "", "providerInstallStarted", "Z", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void maybeInstallProviders(Context context, Executor uiExecutor) {
            int i = 1;
            synchronized (FirebaseFunctions.providerInstalled) {
                if (FirebaseFunctions.providerInstallStarted) {
                    return;
                }
                FirebaseFunctions.providerInstallStarted = true;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                uiExecutor.execute(new RunnableC21771OooO0Oo(context, i));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void maybeInstallProviders$lambda$1(Context context) {
            ProviderInstaller.installIfNeededAsync(context, new ProviderInstaller.ProviderInstallListener() { // from class: com.google.firebase.functions.FirebaseFunctions$Companion$maybeInstallProviders$2$1
                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstallFailed(int i, Intent intent) {
                    Log.d("FirebaseFunctions", "Failed to update ssl context");
                    FirebaseFunctions.providerInstalled.setResult(null);
                }

                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstalled() {
                    FirebaseFunctions.providerInstalled.setResult(null);
                }
            });
        }

        public final FirebaseFunctions getInstance(FirebaseApp app, String regionOrCustomDomain) {
            OooOOO0.OooO0oO(app, "app");
            OooOOO0.OooO0oO(regionOrCustomDomain, "regionOrCustomDomain");
            Preconditions.checkNotNull(app, "You must call FirebaseApp.initializeApp first.");
            Preconditions.checkNotNull(regionOrCustomDomain);
            FunctionsMultiResourceComponent functionsMultiResourceComponent = (FunctionsMultiResourceComponent) app.get(FunctionsMultiResourceComponent.class);
            Preconditions.checkNotNull(functionsMultiResourceComponent, "Functions component does not exist.");
            FirebaseFunctions firebaseFunctions = functionsMultiResourceComponent.get(regionOrCustomDomain);
            OooOOO0.OooO0Oo(firebaseFunctions);
            return firebaseFunctions;
        }

        private Companion() {
        }

        public final FirebaseFunctions getInstance(FirebaseApp app) {
            OooOOO0.OooO0oO(app, "app");
            return getInstance(app, "us-central1");
        }

        public final FirebaseFunctions getInstance(String regionOrCustomDomain) {
            OooOOO0.OooO0oO(regionOrCustomDomain, "regionOrCustomDomain");
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            OooOOO0.OooO0o(firebaseApp, "getInstance(...)");
            return getInstance(firebaseApp, regionOrCustomDomain);
        }

        public final FirebaseFunctions getInstance() {
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            OooOOO0.OooO0o(firebaseApp, "getInstance(...)");
            return getInstance(firebaseApp, "us-central1");
        }
    }

    @AssistedInject
    public FirebaseFunctions(Context context, String str, @Assisted String str2, ContextProvider contextProvider, @Lightweight Executor executor, @UiThread Executor uiExecutor) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(executor, "executor");
        OooOOO0.OooO0oO(uiExecutor, "uiExecutor");
        this.executor = executor;
        this.client = new OkHttpClient();
        this.serializer = new Serializer();
        Object objCheckNotNull = Preconditions.checkNotNull(contextProvider);
        OooOOO0.OooO0o(objCheckNotNull, "checkNotNull(...)");
        this.contextProvider = (ContextProvider) objCheckNotNull;
        Object objCheckNotNull2 = Preconditions.checkNotNull(str);
        OooOOO0.OooO0o(objCheckNotNull2, "checkNotNull(...)");
        this.projectId = (String) objCheckNotNull2;
        this.urlFormat = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        try {
            new URL(str2);
            this.region = "us-central1";
            this.customDomain = str2;
        } catch (MalformedURLException unused) {
            this.region = str2;
            this.customDomain = null;
        }
        INSTANCE.maybeInstallProviders(context, uiExecutor);
    }

    private final Task<HttpsCallableResult> call(URL url, Object data, HttpsCallableContext context, HttpsCallOptions options) {
        Preconditions.checkNotNull(url, "url cannot be null");
        HashMap map = new HashMap();
        map.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.serializer.encode(data));
        JSONObject jSONObject = new JSONObject(map);
        MediaType.f124148OooO0o0.getClass();
        RequestBody body = RequestBody.create(MediaType.Companion.OooO0O0("application/json"), jSONObject.toString());
        Request.Builder builder = new Request.Builder();
        OooOOO0.OooO0oO(url, "url");
        HttpUrl.Companion companion = HttpUrl.f124126OooOO0O;
        String string = url.toString();
        OooOOO0.OooO0o(string, "url.toString()");
        companion.getClass();
        builder.f124244OooO00o = HttpUrl.Companion.OooO0OO(string);
        OooOOO0.OooO0oO(body, "body");
        builder.OooO0Oo("POST", body);
        OooOOO0.OooO0Oo(context);
        if (context.getAuthToken() != null) {
            builder.OooO0OO("Authorization", "Bearer " + context.getAuthToken());
        }
        if (context.getInstanceIdToken() != null) {
            builder.OooO0OO("Firebase-Instance-ID-Token", context.getInstanceIdToken());
        }
        if (context.getAppCheckToken() != null) {
            builder.OooO0OO("X-Firebase-AppCheck", context.getAppCheckToken());
        }
        RealCall realCallOooO00o = options.apply$com_google_firebase_firebase_functions(this.client).OooO00o(builder.OooO0O0());
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        realCallOooO00o.o0000O0O(new Callback() { // from class: com.google.firebase.functions.FirebaseFunctions.call.5
            @Override // okhttp3.Callback
            public void onFailure(Call ignored, IOException e) {
                OooOOO0.OooO0oO(ignored, "ignored");
                OooOOO0.OooO0oO(e, "e");
                if (e instanceof InterruptedIOException) {
                    taskCompletionSource.setException(new FirebaseFunctionsException("DEADLINE_EXCEEDED", FirebaseFunctionsException.Code.DEADLINE_EXCEEDED, null, e));
                } else {
                    taskCompletionSource.setException(new FirebaseFunctionsException("INTERNAL", FirebaseFunctionsException.Code.INTERNAL, null, e));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call ignored, Response response) throws IOException {
                OooOOO0.OooO0oO(ignored, "ignored");
                OooOOO0.OooO0oO(response, "response");
                FirebaseFunctionsException.Code codeFromHttpStatus = FirebaseFunctionsException.Code.INSTANCE.fromHttpStatus(response.f124259OooOoO);
                ResponseBody responseBody = response.f124262OooOoo;
                OooOOO0.OooO0Oo(responseBody);
                String strString = responseBody.string();
                FirebaseFunctionsException firebaseFunctionsExceptionFromResponse$com_google_firebase_firebase_functions = FirebaseFunctionsException.INSTANCE.fromResponse$com_google_firebase_firebase_functions(codeFromHttpStatus, strString, this.serializer);
                if (firebaseFunctionsExceptionFromResponse$com_google_firebase_firebase_functions != null) {
                    taskCompletionSource.setException(firebaseFunctionsExceptionFromResponse$com_google_firebase_firebase_functions);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(strString);
                    Object objOpt = jSONObject2.opt(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (objOpt == null) {
                        objOpt = jSONObject2.opt("result");
                    }
                    if (objOpt == null) {
                        taskCompletionSource.setException(new FirebaseFunctionsException("Response is missing data field.", FirebaseFunctionsException.Code.INTERNAL, null));
                    } else {
                        taskCompletionSource.setResult(new HttpsCallableResult(this.serializer.decode(objOpt)));
                    }
                } catch (JSONException e) {
                    taskCompletionSource.setException(new FirebaseFunctionsException("Response is not valid JSON object.", FirebaseFunctionsException.Code.INTERNAL, null, e));
                }
            }
        });
        Task<HttpsCallableResult> task = taskCompletionSource.getTask();
        OooOOO0.OooO0o(task, "getTask(...)");
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$0(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, Task it) {
        OooOOO0.OooO0oO(it, "it");
        return firebaseFunctions.contextProvider.getContext(httpsCallOptions.limitedUseAppCheckTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$1(FirebaseFunctions firebaseFunctions, String str, Object obj, HttpsCallOptions httpsCallOptions, Task task) {
        OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            return firebaseFunctions.call(firebaseFunctions.getURL$com_google_firebase_firebase_functions(str), obj, (HttpsCallableContext) task.getResult(), httpsCallOptions);
        }
        Exception exception = task.getException();
        OooOOO0.OooO0Oo(exception);
        return Tasks.forException(exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$2(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, Task it) {
        OooOOO0.OooO0oO(it, "it");
        return firebaseFunctions.contextProvider.getContext(httpsCallOptions.limitedUseAppCheckTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$3(FirebaseFunctions firebaseFunctions, URL url, Object obj, HttpsCallOptions httpsCallOptions, Task task) {
        OooOOO0.OooO0oO(task, "task");
        if (task.isSuccessful()) {
            return firebaseFunctions.call(url, obj, (HttpsCallableContext) task.getResult(), httpsCallOptions);
        }
        Exception exception = task.getException();
        OooOOO0.OooO0Oo(exception);
        return Tasks.forException(exception);
    }

    public static final FirebaseFunctions getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task stream$lambda$4(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, Task it) {
        OooOOO0.OooO0oO(it, "it");
        return firebaseFunctions.contextProvider.getContext(httpsCallOptions.limitedUseAppCheckTokens);
    }

    public final Task<HttpsCallableResult> call$com_google_firebase_firebase_functions(final String name, final Object data, final HttpsCallOptions options) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(options, "options");
        Task<HttpsCallableResult> taskContinueWithTask = providerInstalled.getTask().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.OooO0Oo
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FirebaseFunctions.call$lambda$0(this.f68438OooOo0o, options, task);
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.OooO0o0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FirebaseFunctions.call$lambda$1(this.f68442OooOo0o, name, data, options, task);
            }
        });
        OooOOO0.OooO0o(taskContinueWithTask, "continueWithTask(...)");
        return taskContinueWithTask;
    }

    public final HttpsCallableReference getHttpsCallable(String name) {
        OooOOO0.OooO0oO(name, "name");
        return new HttpsCallableReference(this, name, new HttpsCallOptions());
    }

    public final HttpsCallableReference getHttpsCallableFromUrl(URL url) {
        OooOOO0.OooO0oO(url, "url");
        return new HttpsCallableReference(this, url, new HttpsCallOptions());
    }

    public final URL getURL$com_google_firebase_firebase_functions(String function) {
        OooOOO0.OooO0oO(function, "function");
        EmulatedServiceSettings emulatedServiceSettings = this.emulatorSettings;
        if (emulatedServiceSettings != null) {
            this.urlFormat = HttpUtils.HTTP_PREFIX + emulatedServiceSettings.getHost() + ':' + emulatedServiceSettings.getPort() + "/%2$s/%1$s/%3$s";
        }
        String str = String.format(this.urlFormat, Arrays.copyOf(new Object[]{this.region, this.projectId, function}, 3));
        if (this.customDomain != null && emulatedServiceSettings == null) {
            str = this.customDomain + IOUtils.DIR_SEPARATOR_UNIX + function;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalStateException(e);
        }
    }

    public final oOO00OOO.OooO00o<StreamResponse> stream$com_google_firebase_firebase_functions(String name, Object data, HttpsCallOptions options) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(options, "options");
        return stream$com_google_firebase_firebase_functions(getURL$com_google_firebase_firebase_functions(name), data, options);
    }

    public final void useEmulator(String host, int port) {
        OooOOO0.OooO0oO(host, "host");
        this.emulatorSettings = new EmulatedServiceSettings(host, port);
    }

    public final void useFunctionsEmulator(String origin) {
        OooOOO0.OooO0oO(origin, "origin");
        Preconditions.checkNotNull(origin, "origin cannot be null");
        this.urlFormat = origin.concat("/%2$s/%1$s/%3$s");
    }

    public static final FirebaseFunctions getInstance(FirebaseApp firebaseApp) {
        return INSTANCE.getInstance(firebaseApp);
    }

    public final HttpsCallableReference getHttpsCallable(String name, HttpsCallableOptions options) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(options, "options");
        return new HttpsCallableReference(this, name, new HttpsCallOptions(options));
    }

    public final HttpsCallableReference getHttpsCallableFromUrl(URL url, HttpsCallableOptions options) {
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(options, "options");
        return new HttpsCallableReference(this, url, new HttpsCallOptions(options));
    }

    public final oOO00OOO.OooO00o<StreamResponse> stream$com_google_firebase_firebase_functions(URL url, Object data, final HttpsCallOptions options) {
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(options, "options");
        Task<TContinuationResult> taskContinueWithTask = providerInstalled.getTask().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.OooO0o
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FirebaseFunctions.stream$lambda$4(this.f68440OooOo0o, options, task);
            }
        });
        OooOOO0.OooO0o(taskContinueWithTask, "continueWithTask(...)");
        return new PublisherStream(url, data, options, this.client, this.serializer, taskContinueWithTask, this.executor);
    }

    public static final FirebaseFunctions getInstance(FirebaseApp firebaseApp, String str) {
        return INSTANCE.getInstance(firebaseApp, str);
    }

    public static final FirebaseFunctions getInstance(String str) {
        return INSTANCE.getInstance(str);
    }

    public final Task<HttpsCallableResult> call$com_google_firebase_firebase_functions(final URL url, final Object data, final HttpsCallOptions options) {
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(options, "options");
        Task<HttpsCallableResult> taskContinueWithTask = providerInstalled.getTask().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.OooO0oO
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FirebaseFunctions.call$lambda$2(this.f68446OooOo0o, options, task);
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.OooO0oo
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return FirebaseFunctions.call$lambda$3(this.f68448OooOo0o, url, data, options, task);
            }
        });
        OooOOO0.OooO0o(taskContinueWithTask, "continueWithTask(...)");
        return taskContinueWithTask;
    }
}
