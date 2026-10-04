package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oO.C29437OooOO0O;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B(\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000bR#\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/RequestOptions;", "", "", "timeoutInMillis", "<init>", "(J)V", "LoO0o0O/OooO00o;", "timeout", "", "endpoint", "apiVersion", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/OooO0oo;)V", "J", "getTimeout-UwyO8pc$com_google_firebase_firebase_vertexai", "()J", "Ljava/lang/String;", "getEndpoint$com_google_firebase_firebase_vertexai", "()Ljava/lang/String;", "getApiVersion$com_google_firebase_firebase_vertexai", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class RequestOptions {
    private final String apiVersion;
    private final String endpoint;
    private final long timeout;

    public RequestOptions() {
        this(0L, 1, (C24018OooO0oo) null);
    }

    /* JADX INFO: renamed from: getApiVersion$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    /* JADX INFO: renamed from: getEndpoint$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: getTimeout-UwyO8pc$com_google_firebase_firebase_vertexai, reason: not valid java name and from getter */
    public final long getTimeout() {
        return this.timeout;
    }

    public /* synthetic */ RequestOptions(long j, String str, String str2, C24018OooO0oo c24018OooO0oo) {
        this(j, str, str2);
    }

    private RequestOptions(long j, String endpoint, String apiVersion) {
        OooOOO0.OooO0oO(endpoint, "endpoint");
        OooOOO0.OooO0oO(apiVersion, "apiVersion");
        this.timeout = j;
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
    }

    public /* synthetic */ RequestOptions(long j, String str, String str2, int i, C24018OooO0oo c24018OooO0oo) {
        this(j, (i & 2) != 0 ? "https://firebasevertexai.googleapis.com" : str, (i & 4) != 0 ? "v1beta" : str2, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RequestOptions(long j, int i, C24018OooO0oo c24018OooO0oo) {
        if ((i & 1) != 0) {
            int i2 = C33549OooO00o.f121147OooOoO;
            j = C33549OooO00o.OooO0Oo(C29437OooOO0O.OooO0o(180, EnumC33551OooO0OO.f121152OooOoO));
        }
        this(j);
    }

    public RequestOptions(long j) {
        this(C29437OooOO0O.OooO0oO(j, EnumC33551OooO0OO.f121153OooOoO0), null, null, 6, null);
    }
}
