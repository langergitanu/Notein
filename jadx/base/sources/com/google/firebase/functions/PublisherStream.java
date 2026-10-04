package com.google.firebase.functions;

import com.aspose.words.ControlChar;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.functions.FirebaseFunctionsException;
import com.google.firebase.functions.StreamResponse;
import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000.C32502OooO0oo;
import oO0o0O0O.C33562OooO00o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.Oooo0;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0016J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00142\u000e\u0010+\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R.\u00108\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00020\u00020*\u0012\u0004\u0012\u00020706058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00109¨\u0006B"}, m80612d2 = {"Lcom/google/firebase/functions/PublisherStream;", "LoOO00OOO/OooO00o;", "Lcom/google/firebase/functions/StreamResponse;", "Ljava/net/URL;", "url", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/google/firebase/functions/HttpsCallOptions;", "options", "Lokhttp3/OkHttpClient;", "client", "Lcom/google/firebase/functions/Serializer;", "serializer", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/functions/HttpsCallableContext;", "contextTask", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/net/URL;Ljava/lang/Object;Lcom/google/firebase/functions/HttpsCallOptions;Lokhttp3/OkHttpClient;Lcom/google/firebase/functions/Serializer;Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;)V", "LoO00ooO/OooOooO;", "startStreaming", "()V", "cancelStream", "Ljava/io/InputStream;", "inputStream", "processSSEStream", "(Ljava/io/InputStream;)V", "", "dataChunk", "processEvent", "(Ljava/lang/String;)V", "dispatchMessages", "", "e", "notifyError", "(Ljava/lang/Throwable;)V", "notifyComplete", "Lokhttp3/Response;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "validateResponse", "(Lokhttp3/Response;)V", "LoOO00OOO/OooO0O0;", "subscriber", "subscribe", "(LoOO00OOO/OooO0O0;)V", "Ljava/net/URL;", "Ljava/lang/Object;", "Lcom/google/firebase/functions/HttpsCallOptions;", "Lokhttp3/OkHttpClient;", "Lcom/google/firebase/functions/Serializer;", "Lcom/google/android/gms/tasks/Task;", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "LoO00ooO/OooOOO;", "Ljava/util/concurrent/atomic/AtomicLong;", "subscribers", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lokhttp3/Call;", "activeCall", "Lokhttp3/Call;", "", "isStreamingStarted", "Z", "isCompleted", "messageQueue", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class PublisherStream implements oOO00OOO.OooO00o<StreamResponse> {
    private Call activeCall;
    private final OkHttpClient client;
    private final Task<HttpsCallableContext> contextTask;
    private final Object data;
    private final Executor executor;
    private volatile boolean isCompleted;
    private volatile boolean isStreamingStarted;
    private final ConcurrentLinkedQueue<StreamResponse> messageQueue;
    private final HttpsCallOptions options;
    private final Serializer serializer;
    private final ConcurrentLinkedQueue<C32443OooOOO<oOO00OOO.OooO0O0<? super StreamResponse>, AtomicLong>> subscribers;
    private final URL url;

    public PublisherStream(URL url, Object obj, HttpsCallOptions options, OkHttpClient client, Serializer serializer, Task<HttpsCallableContext> contextTask, Executor executor) {
        OooOOO0.OooO0oO(url, "url");
        OooOOO0.OooO0oO(options, "options");
        OooOOO0.OooO0oO(client, "client");
        OooOOO0.OooO0oO(serializer, "serializer");
        OooOOO0.OooO0oO(contextTask, "contextTask");
        OooOOO0.OooO0oO(executor, "executor");
        this.url = url;
        this.data = obj;
        this.options = options;
        this.client = client;
        this.serializer = serializer;
        this.contextTask = contextTask;
        this.executor = executor;
        this.subscribers = new ConcurrentLinkedQueue<>();
        this.messageQueue = new ConcurrentLinkedQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelStream() {
        Call call = this.activeCall;
        if (call != null) {
            call.cancel();
        }
        notifyError(new FirebaseFunctionsException("Stream was canceled", FirebaseFunctionsException.Code.CANCELLED, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchMessages() {
        synchronized (this) {
            try {
                Iterator<C32443OooOOO<oOO00OOO.OooO0O0<? super StreamResponse>, AtomicLong>> it = this.subscribers.iterator();
                OooOOO0.OooO0o(it, "iterator(...)");
                while (it.hasNext()) {
                    C32443OooOOO<oOO00OOO.OooO0O0<? super StreamResponse>, AtomicLong> next = it.next();
                    oOO00OOO.OooO0O0<? super StreamResponse> oooO0O0 = next.f116638OooOo0o;
                    AtomicLong atomicLong = next.f116637OooOo;
                    while (atomicLong.get() > 0 && !this.messageQueue.isEmpty()) {
                        oooO0O0.onNext(this.messageQueue.poll());
                        atomicLong.decrementAndGet();
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void notifyComplete() {
        if (this.isCompleted) {
            return;
        }
        this.isCompleted = true;
        Iterator<T> it = this.subscribers.iterator();
        while (it.hasNext()) {
            ((oOO00OOO.OooO0O0) ((C32443OooOOO) it.next()).f116638OooOo0o).onComplete();
        }
        this.subscribers.clear();
        this.messageQueue.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyError(Throwable e) {
        if (this.isCompleted) {
            return;
        }
        this.isCompleted = true;
        Iterator<T> it = this.subscribers.iterator();
        while (it.hasNext()) {
            try {
                ((oOO00OOO.OooO0O0) ((C32443OooOOO) it.next()).f116638OooOo0o).onError(e);
            } catch (Exception unused) {
            }
        }
        this.subscribers.clear();
        this.messageQueue.clear();
    }

    private final void processEvent(String dataChunk) {
        Object objDecode;
        try {
            JSONObject jSONObject = new JSONObject(dataChunk);
            if (jSONObject.has("message")) {
                Object objDecode2 = this.serializer.decode(jSONObject.opt("message"));
                if (objDecode2 != null) {
                    this.messageQueue.add(new StreamResponse.Message(new HttpsCallableResult(objDecode2)));
                }
                dispatchMessages();
                return;
            }
            if (jSONObject.has("error")) {
                Object objDecode3 = this.serializer.decode(jSONObject.opt("error"));
                if (objDecode3 != null) {
                    notifyError(new FirebaseFunctionsException(objDecode3.toString(), FirebaseFunctionsException.Code.INTERNAL, objDecode3));
                    return;
                }
                return;
            }
            if (!jSONObject.has("result") || (objDecode = this.serializer.decode(jSONObject.opt("result"))) == null) {
                return;
            }
            this.messageQueue.add(new StreamResponse.Result(new HttpsCallableResult(objDecode)));
            dispatchMessages();
            notifyComplete();
        } catch (Throwable th) {
            notifyError(new FirebaseFunctionsException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid JSON: ", dataChunk), FirebaseFunctionsException.Code.INTERNAL, th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processSSEStream(InputStream inputStream) throws IOException {
        String strOoooO0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                for (String str : (C33562OooO00o) C33574OooOOO0.OooO0oO(new C32502OooO0oo(bufferedReader))) {
                    if (C33599OooOo0O.Oooo0o0(str)) {
                        String string = sb.toString();
                        OooOOO0.OooO0o(string, "toString(...)");
                        processEvent(string);
                        sb.setLength(0);
                    } else {
                        if (C33595OooOOo.OooOoO0(str, "data:", false)) {
                            strOoooO0 = C33599OooOo0O.OoooO0(str, "data:");
                        } else if (C33595OooOOo.OooOoO0(str, "result:", false)) {
                            strOoooO0 = C33599OooOo0O.OoooO0(str, "result:");
                        }
                        sb.append(C33599OooOo0O.Oooooo0(strOoooO0).toString());
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                }
                if (sb.length() > 0) {
                    String string2 = sb.toString();
                    OooOOO0.OooO0o(string2, "toString(...)");
                    processEvent(string2);
                }
            } finally {
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Error reading stream";
            }
            notifyError(new FirebaseFunctionsException(message, FirebaseFunctionsException.Code.INTERNAL, e));
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        bufferedReader.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startStreaming() {
        this.contextTask.addOnCompleteListener(this.executor, new OnCompleteListener() { // from class: com.google.firebase.functions.OooOO0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                PublisherStream.startStreaming$lambda$6(this.f68451OooO00o, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startStreaming$lambda$6(final PublisherStream publisherStream, Task contextTask) {
        OooOOO0.OooO0oO(contextTask, "contextTask");
        if (!contextTask.isSuccessful()) {
            publisherStream.notifyError(new FirebaseFunctionsException("Error retrieving context", FirebaseFunctionsException.Code.INTERNAL, null, contextTask.getException()));
            return;
        }
        HttpsCallableContext httpsCallableContext = (HttpsCallableContext) contextTask.getResult();
        OkHttpClient okHttpClientApply$com_google_firebase_firebase_functions = publisherStream.options.apply$com_google_firebase_firebase_functions(publisherStream.client);
        MediaType.f124148OooO0o0.getClass();
        RequestBody body = RequestBody.create(MediaType.Companion.OooO0O0("application/json"), new JSONObject(Oooo0.OooO0o0(new C32443OooOOO(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, publisherStream.serializer.encode(publisherStream.data)))).toString());
        Request.Builder builder = new Request.Builder();
        URL url = publisherStream.url;
        OooOOO0.OooO0oO(url, "url");
        HttpUrl.Companion companion = HttpUrl.f124126OooOO0O;
        String string = url.toString();
        OooOOO0.OooO0o(string, "url.toString()");
        companion.getClass();
        builder.f124244OooO00o = HttpUrl.Companion.OooO0OO(string);
        OooOOO0.OooO0oO(body, "body");
        builder.OooO0Oo("POST", body);
        builder.OooO0OO("Accept", "text/event-stream");
        builder.OooO0OO("Content-Type", "application/json");
        if (httpsCallableContext != null) {
            String authToken = httpsCallableContext.getAuthToken();
            if (authToken != null) {
                builder.OooO0OO("Authorization", "Bearer ".concat(authToken));
            }
            String instanceIdToken = httpsCallableContext.getInstanceIdToken();
            if (instanceIdToken != null) {
                builder.OooO0OO("Firebase-Instance-ID-Token", instanceIdToken);
            }
            String appCheckToken = httpsCallableContext.getAppCheckToken();
            if (appCheckToken != null) {
                builder.OooO0OO("X-Firebase-AppCheck", appCheckToken);
            }
        }
        RealCall realCallOooO00o = okHttpClientApply$com_google_firebase_firebase_functions.OooO00o(builder.OooO0O0());
        publisherStream.activeCall = realCallOooO00o;
        realCallOooO00o.o0000O0O(new Callback() { // from class: com.google.firebase.functions.PublisherStream$startStreaming$1$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                OooOOO0.OooO0oO(call, "call");
                OooOOO0.OooO0oO(e, "e");
                FirebaseFunctionsException.Code code = e instanceof InterruptedIOException ? FirebaseFunctionsException.Code.DEADLINE_EXCEEDED : FirebaseFunctionsException.Code.INTERNAL;
                this.this$0.notifyError(new FirebaseFunctionsException(code.name(), code, null, e));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                OooOOO0.OooO0oO(call, "call");
                OooOOO0.OooO0oO(response, "response");
                this.this$0.validateResponse(response);
                ResponseBody responseBody = response.f124262OooOoo;
                InputStream inputStreamByteStream = responseBody != null ? responseBody.byteStream() : null;
                if (inputStreamByteStream != null) {
                    this.this$0.processSSEStream(inputStreamByteStream);
                } else {
                    this.this$0.notifyError(new FirebaseFunctionsException("Response body is null", FirebaseFunctionsException.Code.INTERNAL, null));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateResponse(Response response) {
        String strString;
        if (response.OooO0OO()) {
            return;
        }
        String str = "";
        ResponseBody responseBody = response.f124262OooOoo;
        int i = response.f124259OooOoO;
        if (i == 404) {
            String strOooO00o = Response.OooO00o("Content-Type", response);
            if (strOooO00o == null) {
                strOooO00o = "";
            }
            MediaType.f124148OooO0o0.getClass();
            MediaType mediaTypeOooO0O0 = MediaType.Companion.OooO0O0(strOooO00o);
            if (OooOOO0.OooO0O0(mediaTypeOooO0O0 != null ? mediaTypeOooO0O0.f124152OooO0OO : null, "html")) {
                StringBuilder sb = new StringBuilder("URL not found. Raw response: ");
                sb.append(responseBody != null ? responseBody.string() : null);
                notifyError(new FirebaseFunctionsException(C33591OooOOO.OooO(sb.toString()), FirebaseFunctionsException.Code.INSTANCE.fromHttpStatus(i), null));
                return;
            }
        }
        if (responseBody != null && (strString = responseBody.string()) != null) {
            str = strString;
        }
        try {
            Object objDecode = this.serializer.decode(new JSONObject(str).opt("error"));
            notifyError(new FirebaseFunctionsException(String.valueOf(objDecode), FirebaseFunctionsException.Code.INTERNAL, objDecode));
        } catch (Throwable th) {
            notifyError(new FirebaseFunctionsException(th.getMessage() + " Unexpected Response:\n" + str + ControlChar.SPACE_CHAR, FirebaseFunctionsException.Code.INTERNAL, th));
        }
    }

    @Override // oOO00OOO.OooO00o
    public void subscribe(final oOO00OOO.OooO0O0<? super StreamResponse> subscriber) {
        OooOOO0.OooO0oO(subscriber, "subscriber");
        synchronized (this) {
            if (this.isCompleted) {
                subscriber.onError(new FirebaseFunctionsException("Cannot subscribe: Streaming has already completed.", FirebaseFunctionsException.Code.CANCELLED, null));
            } else {
                this.subscribers.add(new C32443OooOOO<>(subscriber, new AtomicLong(0L)));
                subscriber.OooO0Oo(new oOO00OOO.OooO0OO() { // from class: com.google.firebase.functions.PublisherStream.subscribe.2
                    @Override // oOO00OOO.OooO0OO
                    public void cancel() {
                        PublisherStream publisherStream = this;
                        oOO00OOO.OooO0O0<? super StreamResponse> oooO0O0 = subscriber;
                        synchronized (publisherStream) {
                            try {
                                publisherStream.notifyError(new FirebaseFunctionsException("Stream was canceled", FirebaseFunctionsException.Code.CANCELLED, null));
                                Iterator it = publisherStream.subscribers.iterator();
                                OooOOO0.OooO0o(it, "iterator(...)");
                                while (it.hasNext()) {
                                    if (OooOOO0.OooO0O0(((C32443OooOOO) it.next()).f116638OooOo0o, oooO0O0)) {
                                        it.remove();
                                    }
                                }
                                if (publisherStream.subscribers.isEmpty()) {
                                    publisherStream.cancelStream();
                                }
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // oOO00OOO.OooO0OO
                    public void request(long n) {
                        Object next;
                        AtomicLong atomicLong;
                        if (n <= 0) {
                            subscriber.onError(new IllegalArgumentException("Requested messages must be positive."));
                            return;
                        }
                        PublisherStream publisherStream = this;
                        oOO00OOO.OooO0O0<? super StreamResponse> oooO0O0 = subscriber;
                        synchronized (publisherStream) {
                            try {
                                if (publisherStream.isCompleted) {
                                    return;
                                }
                                Iterator it = publisherStream.subscribers.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    } else {
                                        next = it.next();
                                        if (OooOOO0.OooO0O0(((C32443OooOOO) next).f116638OooOo0o, oooO0O0)) {
                                            break;
                                        }
                                    }
                                }
                                C32443OooOOO c32443OooOOO = (C32443OooOOO) next;
                                if (c32443OooOOO != null && (atomicLong = (AtomicLong) c32443OooOOO.f116637OooOo) != null) {
                                    atomicLong.addAndGet(n);
                                }
                                publisherStream.dispatchMessages();
                                if (!publisherStream.isStreamingStarted) {
                                    publisherStream.isStreamingStarted = true;
                                    publisherStream.startStreaming();
                                }
                                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }
}
