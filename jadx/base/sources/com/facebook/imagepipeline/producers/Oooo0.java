package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.io.IOException;
import o00oo.C25638OooO0oO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class Oooo0 extends AbstractC22281Oooo00o {
    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o imageRequest) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageRequest, "imageRequest");
        return OooO0O0(new FileInputStream(imageRequest.OooO0O0().toString()), (int) imageRequest.OooO0O0().length());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "LocalFileFetchProducer";
    }
}
