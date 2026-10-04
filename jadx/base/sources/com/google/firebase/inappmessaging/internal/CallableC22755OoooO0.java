package com.google.firebase.inappmessaging.internal;

import com.google.protobuf.AbstractMessageLite;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class CallableC22755OoooO0 implements Callable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractMessageLite f68544OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ProtoStorageClient f68545OooOo0o;

    public /* synthetic */ CallableC22755OoooO0(ProtoStorageClient protoStorageClient, AbstractMessageLite abstractMessageLite) {
        this.f68545OooOo0o = protoStorageClient;
        this.f68544OooOo = abstractMessageLite;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f68545OooOo0o.lambda$write$0(this.f68544OooOo);
    }
}
