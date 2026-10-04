package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o00oo.C25638OooO0oO;
import o00ooO0.C25750OooOoOO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22293OoooOOO extends AbstractC22281Oooo00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ContentResolver f67433OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22293OoooOOO(Executor executor, C25750OooOoOO pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pooledByteBufferFactory, "pooledByteBufferFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(contentResolver, "contentResolver");
        this.f67433OooO0OO = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o imageRequest) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f67433OooO0OO.openInputStream(imageRequest.f87911OooO0O0);
        if (inputStreamOpenInputStream != null) {
            return OooO0O0(inputStreamOpenInputStream, -1);
        }
        throw new IllegalStateException("ContentResolver returned null InputStream");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "QualifiedResourceFetchProducer";
    }
}
