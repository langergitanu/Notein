package com.google.firebase.functions;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0012J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0011\u0010\u0018\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, m80612d2 = {"Lcom/google/firebase/functions/HttpsCallableReference;", "", "Lcom/google/firebase/functions/FirebaseFunctions;", "functionsClient", "", "name", "Lcom/google/firebase/functions/HttpsCallOptions;", "options", "<init>", "(Lcom/google/firebase/functions/FirebaseFunctions;Ljava/lang/String;Lcom/google/firebase/functions/HttpsCallOptions;)V", "Ljava/net/URL;", "url", "(Lcom/google/firebase/functions/FirebaseFunctions;Ljava/net/URL;Lcom/google/firebase/functions/HttpsCallOptions;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/functions/HttpsCallableResult;", NotificationCompat.CATEGORY_CALL, "(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;", "()Lcom/google/android/gms/tasks/Task;", "LoOO00OOO/OooO00o;", "Lcom/google/firebase/functions/StreamResponse;", "stream", "(Ljava/lang/Object;)LoOO00OOO/OooO00o;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "units", "LoO00ooO/OooOooO;", "setTimeout", "(JLjava/util/concurrent/TimeUnit;)V", "withTimeout", "(JLjava/util/concurrent/TimeUnit;)Lcom/google/firebase/functions/HttpsCallableReference;", "Lcom/google/firebase/functions/FirebaseFunctions;", "Ljava/lang/String;", "Ljava/net/URL;", "Lcom/google/firebase/functions/HttpsCallOptions;", "getOptions$com_google_firebase_firebase_functions", "()Lcom/google/firebase/functions/HttpsCallOptions;", "getOptions$com_google_firebase_firebase_functions$annotations", "()V", "getTimeout", "()J", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class HttpsCallableReference {
    private final FirebaseFunctions functionsClient;
    private final String name;
    private final HttpsCallOptions options;
    private final URL url;

    public HttpsCallableReference(FirebaseFunctions functionsClient, String str, HttpsCallOptions options) {
        OooOOO0.OooO0oO(functionsClient, "functionsClient");
        OooOOO0.OooO0oO(options, "options");
        this.functionsClient = functionsClient;
        this.name = str;
        this.url = null;
        this.options = options;
    }

    public static /* synthetic */ void getOptions$com_google_firebase_firebase_functions$annotations() {
    }

    public static /* synthetic */ oOO00OOO.OooO00o stream$default(HttpsCallableReference httpsCallableReference, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return httpsCallableReference.stream(obj);
    }

    public final Task<HttpsCallableResult> call(Object data) {
        String str = this.name;
        if (str != null) {
            return this.functionsClient.call$com_google_firebase_firebase_functions(str, data, this.options);
        }
        FirebaseFunctions firebaseFunctions = this.functionsClient;
        URL url = this.url;
        OooOOO0.OooO0Oo(url);
        return firebaseFunctions.call$com_google_firebase_firebase_functions(url, data, this.options);
    }

    /* JADX INFO: renamed from: getOptions$com_google_firebase_firebase_functions, reason: from getter */
    public final HttpsCallOptions getOptions() {
        return this.options;
    }

    public final long getTimeout() {
        return this.options.getTimeout$com_google_firebase_firebase_functions();
    }

    public final void setTimeout(long timeout, TimeUnit units) {
        OooOOO0.OooO0oO(units, "units");
        this.options.setTimeout$com_google_firebase_firebase_functions(timeout, units);
    }

    public final oOO00OOO.OooO00o<StreamResponse> stream() {
        return stream$default(this, null, 1, null);
    }

    public final HttpsCallableReference withTimeout(long timeout, TimeUnit units) {
        OooOOO0.OooO0oO(units, "units");
        HttpsCallableReference httpsCallableReference = new HttpsCallableReference(this.functionsClient, this.name, this.options);
        httpsCallableReference.setTimeout(timeout, units);
        return httpsCallableReference;
    }

    public final oOO00OOO.OooO00o<StreamResponse> stream(Object data) {
        String str = this.name;
        if (str != null) {
            return this.functionsClient.stream$com_google_firebase_firebase_functions(str, data, this.options);
        }
        FirebaseFunctions firebaseFunctions = this.functionsClient;
        URL url = this.url;
        if (url != null) {
            return firebaseFunctions.stream$com_google_firebase_firebase_functions(url, data, this.options);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final Task<HttpsCallableResult> call() {
        String str = this.name;
        if (str != null) {
            return this.functionsClient.call$com_google_firebase_firebase_functions(str, (Object) null, this.options);
        }
        FirebaseFunctions firebaseFunctions = this.functionsClient;
        URL url = this.url;
        OooOOO0.OooO0Oo(url);
        return firebaseFunctions.call$com_google_firebase_firebase_functions(url, (Object) null, this.options);
    }

    public HttpsCallableReference(FirebaseFunctions functionsClient, URL url, HttpsCallOptions options) {
        OooOOO0.OooO0oO(functionsClient, "functionsClient");
        OooOOO0.OooO0oO(options, "options");
        this.functionsClient = functionsClient;
        this.name = null;
        this.url = url;
        this.options = options;
    }
}
