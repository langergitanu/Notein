package com.google.firebase.functions;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0010¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m80612d2 = {"Lcom/google/firebase/functions/HttpsCallOptions;", "", "Lcom/google/firebase/functions/HttpsCallableOptions;", "publicCallableOptions", "<init>", "(Lcom/google/firebase/functions/HttpsCallableOptions;)V", "()V", "", "getLimitedUseAppCheckTokens$com_google_firebase_firebase_functions", "()Z", "getLimitedUseAppCheckTokens", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "units", "LoO00ooO/OooOooO;", "setTimeout$com_google_firebase_firebase_functions", "(JLjava/util/concurrent/TimeUnit;)V", "setTimeout", "getTimeout$com_google_firebase_firebase_functions", "()J", "getTimeout", "Lokhttp3/OkHttpClient;", "client", "apply$com_google_firebase_firebase_functions", "(Lokhttp3/OkHttpClient;)Lokhttp3/OkHttpClient;", "apply", "J", "timeoutUnits", "Ljava/util/concurrent/TimeUnit;", "limitedUseAppCheckTokens", "Z", "Companion", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class HttpsCallOptions {
    private static final long DEFAULT_TIMEOUT = 70;
    public final boolean limitedUseAppCheckTokens;
    private long timeout;
    private TimeUnit timeoutUnits;
    private static final Companion Companion = new Companion(null);
    private static final TimeUnit DEFAULT_TIMEOUT_UNITS = TimeUnit.SECONDS;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/functions/HttpsCallOptions$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT", "", "DEFAULT_TIMEOUT_UNITS", "Ljava/util/concurrent/TimeUnit;", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private Companion() {
        }
    }

    public HttpsCallOptions(HttpsCallableOptions publicCallableOptions) {
        OooOOO0.OooO0oO(publicCallableOptions, "publicCallableOptions");
        this.timeout = DEFAULT_TIMEOUT;
        this.timeoutUnits = DEFAULT_TIMEOUT_UNITS;
        this.limitedUseAppCheckTokens = publicCallableOptions.limitedUseAppCheckTokens;
    }

    public final OkHttpClient apply$com_google_firebase_firebase_functions(OkHttpClient client) {
        OooOOO0.OooO0oO(client, "client");
        OkHttpClient.Builder builderOooO0O0 = client.OooO0O0();
        long j = this.timeout;
        TimeUnit unit = this.timeoutUnits;
        OooOOO0.OooO0oO(unit, "unit");
        builderOooO0O0.f124224OooOo0o = Util.OooO0O0(j, unit);
        builderOooO0O0.OooO0OO(this.timeout, this.timeoutUnits);
        return new OkHttpClient(builderOooO0O0);
    }

    /* JADX INFO: renamed from: getLimitedUseAppCheckTokens$com_google_firebase_firebase_functions, reason: from getter */
    public final boolean getLimitedUseAppCheckTokens() {
        return this.limitedUseAppCheckTokens;
    }

    public final long getTimeout$com_google_firebase_firebase_functions() {
        return this.timeoutUnits.toMillis(this.timeout);
    }

    public final void setTimeout$com_google_firebase_firebase_functions(long timeout, TimeUnit units) {
        OooOOO0.OooO0oO(units, "units");
        this.timeout = timeout;
        this.timeoutUnits = units;
    }

    public HttpsCallOptions() {
        this.timeout = DEFAULT_TIMEOUT;
        this.timeoutUnits = DEFAULT_TIMEOUT_UNITS;
        this.limitedUseAppCheckTokens = false;
    }
}
