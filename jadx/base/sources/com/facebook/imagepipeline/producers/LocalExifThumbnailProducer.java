package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import androidx.core.util.Pools;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import o00O0oo0.C24969OooOO0;
import o00o00Oo.C25261OooO0o0;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o00.C25438OooO00o;
import o00o0o0o.C25444OooO0O0;
import o00o0o0o.C25450OooO0oo;
import o00o0oOo.C25461OooO0Oo;
import o00oOoOo.C25622OooO0O0;
import o00oo.C25638OooO0oO;
import o00ooO0.C25748OooOoO;
import o00ooO0.C25750OooOoOO;
import o00ooO0.C25752OooOoo0;
import o00ooO0o.C25763OooO00o;
import o00ooOO.C25767OooO0OO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalExifThumbnailProducer implements InterfaceC22305OoooooO<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f67274OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25750OooOoOO f67275OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ContentResolver f67276OooO0OO;

    public class Api24Utils {
    }

    public class OooO00o extends AbstractRunnableC22299Ooooo0o<C25638OooO0oO> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ C25763OooO00o f67278OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO oooO, o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, C25763OooO00o c25763OooO00o) {
            super(oooO, o000oooo2, interfaceC22288OoooO, "LocalExifThumbnailProducer");
            this.f67278OooOoo0 = c25763OooO00o;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0O0(Object obj) {
            C25638OooO0oO.OooO0OO((C25638OooO0oO) obj);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final Map OooO0OO(C25638OooO0oO c25638OooO0oO) {
            return C25428OooO0o.OooO00o("createdThumbnail", Boolean.toString(c25638OooO0oO != null));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[Catch: IOException -> 0x000f, StackOverflowError -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x000f, StackOverflowError -> 0x004c, blocks: (B:5:0x0011, B:7:0x001c, B:9:0x0022, B:10:0x0028, B:12:0x0034, B:16:0x003e), top: B:71:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object OooO0Oo() throws Exception {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
            ExifInterface exifInterface;
            Pair pair = null;
            Uri uri = this.f67278OooOoo0.f87911OooO0O0;
            LocalExifThumbnailProducer localExifThumbnailProducer = LocalExifThumbnailProducer.this;
            ContentResolver contentResolver = localExifThumbnailProducer.f67276OooO0OO;
            String strOooO00o = C25461OooO0Oo.OooO00o(contentResolver, uri);
            if (strOooO00o == null) {
                exifInterface = null;
            } else {
                try {
                    File file = new File(strOooO00o);
                    if (file.exists() && file.canRead()) {
                        exifInterface = new ExifInterface(strOooO00o);
                    } else if (FirebaseAnalytics.Param.CONTENT.equals(C25461OooO0Oo.OooO0O0(uri))) {
                        try {
                            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                        } catch (FileNotFoundException unused) {
                            assetFileDescriptorOpenAssetFileDescriptor = null;
                        }
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                            ExifInterface exifInterface2 = new ExifInterface(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                            exifInterface = exifInterface2;
                        }
                    } else {
                        assetFileDescriptorOpenAssetFileDescriptor = null;
                        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        }
                    }
                } catch (IOException unused2) {
                } catch (StackOverflowError unused3) {
                    C25438OooO00o.OooO00o(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
                }
            }
            if (exifInterface == null || !exifInterface.hasThumbnail()) {
                return null;
            }
            byte[] thumbnail = exifInterface.getThumbnail();
            thumbnail.getClass();
            C25750OooOoOO c25750OooOoOO = localExifThumbnailProducer.f67275OooO0O0;
            c25750OooOoOO.getClass();
            C25752OooOoo0 c25752OooOoo0 = new C25752OooOoo0(c25750OooOoOO.f87875OooO00o, thumbnail.length);
            try {
                try {
                    c25752OooOoo0.write(thumbnail, 0, thumbnail.length);
                    C25748OooOoO c25748OooOoOOooO00o = c25752OooOoo0.OooO00o();
                    c25752OooOoo0.close();
                    C25450OooO0oo c25450OooO0oo = new C25450OooO0oo(c25748OooOoOOooO00o);
                    C32447OooOOo c32447OooOOo = C25767OooO0OO.f87939OooO00o;
                    ByteBuffer byteBufferAllocate = (ByteBuffer) ((Pools.SynchronizedPool) c32447OooOOo.getValue()).acquire();
                    if (byteBufferAllocate == null) {
                        C25444OooO0O0.OooO00o oooO00o = C25444OooO0O0.f86726OooO00o;
                        byteBufferAllocate = ByteBuffer.allocate(16384);
                        kotlin.jvm.internal.OooOOO0.OooO0o(byteBufferAllocate, "allocate(...)");
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    try {
                        options.inTempStorage = byteBufferAllocate.array();
                        BitmapFactory.decodeStream(c25450OooO0oo, null, options);
                        if (options.outWidth != -1 && options.outHeight != -1) {
                            pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                        }
                        ((Pools.SynchronizedPool) c32447OooOOo.getValue()).release(byteBufferAllocate);
                        String attribute = exifInterface.getAttribute("Orientation");
                        attribute.getClass();
                        int iOooO0o0 = C25261OooO0o0.OooO0o0(Integer.parseInt(attribute));
                        int iIntValue = pair != null ? ((Integer) pair.first).intValue() : -1;
                        int iIntValue2 = pair != null ? ((Integer) pair.second).intValue() : -1;
                        C25435OooO0O0 c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(c25748OooOoOOooO00o);
                        try {
                            C25638OooO0oO c25638OooO0oO = new C25638OooO0oO(c25435OooO0O0O00Oo0);
                            c25435OooO0O0O00Oo0.close();
                            c25638OooO0oO.f87501OooOo = C25622OooO0O0.f87441OooO00o;
                            c25638OooO0oO.f87504OooOoO0 = iOooO0o0;
                            c25638OooO0oO.f87505OooOoOO = iIntValue;
                            c25638OooO0oO.f87507OooOoo0 = iIntValue2;
                            return c25638OooO0oO;
                        } catch (Throwable th) {
                            AbstractC25434OooO00o.OooOooo(c25435OooO0O0O00Oo0);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ((Pools.SynchronizedPool) C25767OooO0OO.f87939OooO00o.getValue()).release(byteBufferAllocate);
                        throw th2;
                    }
                } catch (IOException e) {
                    C24969OooOO0.OooO0o(e);
                    throw null;
                }
            } catch (Throwable th3) {
                c25752OooOoo0.close();
                throw th3;
            }
        }
    }

    public class OooO0O0 extends C22260OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f67279OooO00o;

        public OooO0O0(OooO00o oooO00o) {
            this.f67279OooO00o = oooO00o;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
        public final void OooO0O0() {
            this.f67279OooO00o.OooO00o();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, C25750OooOoOO c25750OooOoOO, ContentResolver contentResolver) {
        this.f67274OooO00o = executor;
        this.f67275OooO0O0 = c25750OooOoOO;
        this.f67276OooO0OO = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        o000oOoO o000ooooOooOOo0 = interfaceC22288OoooO.OooOOo0();
        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
        interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "exif");
        OooO00o oooO00o = new OooO00o(oooO, o000ooooOooOOo0, interfaceC22288OoooO, c25763OooO00oOooOOoo);
        interfaceC22288OoooO.OooO0OO(new OooO0O0(oooO00o));
        this.f67274OooO00o.execute(oooO00o);
    }
}
