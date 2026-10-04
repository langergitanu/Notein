package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o00oo.C25638OooO0oO;
import o00ooO0.C25750OooOoOO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22278OooOooo extends AbstractC22281Oooo00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AssetManager f67388OooO0OO;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooOooo$OooO00o */
    public static final class OooO00o {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22278OooOooo(Executor executor, C25750OooOoOO pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pooledByteBufferFactory, "pooledByteBufferFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(assetManager, "assetManager");
        this.f67388OooO0OO = assetManager;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o imageRequest) throws IOException {
        int length;
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageRequest, "imageRequest");
        Uri uri = imageRequest.f87911OooO0O0;
        String path = uri.getPath();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(path);
        String strSubstring = path.substring(1);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        AssetManager assetManager = this.f67388OooO0OO;
        InputStream inputStreamOpen = assetManager.open(strSubstring, 2);
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            String path2 = uri.getPath();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(path2);
            String strSubstring2 = path2.substring(1);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring2, "substring(...)");
            assetFileDescriptorOpenFd = assetManager.openFd(strSubstring2);
            length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return OooO0O0(inputStreamOpen, length);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "LocalAssetFetchProducer";
    }
}
