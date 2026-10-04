package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o00oo.C25638OooO0oO;
import o00ooO0.C25750OooOoOO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22282Oooo0O0 extends AbstractC22281Oooo00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Resources f67399OooO0OO;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0O0$OooO00o */
    public static final class OooO00o {
        public static final int OooO00o(C25763OooO00o c25763OooO00o) {
            String path = c25763OooO00o.f87911OooO0O0.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strSubstring = path.substring(1);
            kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
            return Integer.parseInt(strSubstring);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22282Oooo0O0(Executor executor, C25750OooOoOO pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pooledByteBufferFactory, "pooledByteBufferFactory");
        kotlin.jvm.internal.OooOOO0.OooO0oO(resources, "resources");
        this.f67399OooO0OO = resources;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final C25638OooO0oO OooO0OO(C25763OooO00o imageRequest) throws IOException {
        int length;
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageRequest, "imageRequest");
        int iOooO00o = OooO00o.OooO00o(imageRequest);
        Resources resources = this.f67399OooO0OO;
        InputStream inputStreamOpenRawResource = resources.openRawResource(iOooO00o);
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(OooO00o.OooO00o(imageRequest));
            length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
            } catch (IOException unused) {
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            length = -1;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return OooO0O0(inputStreamOpenRawResource, length);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC22281Oooo00o
    public final String OooO0Oo() {
        return "LocalResourceFetchProducer";
    }
}
