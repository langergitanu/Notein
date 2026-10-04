package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00o0oOo.C25461OooO0Oo;
import o00oOoO.InterfaceC25615OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0OO.C25683OooO0OO;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22287Oooo0oo implements InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f67408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ContentResolver f67409OooO0O0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0oo$OooO00o */
    public class OooO00o extends AbstractRunnableC22299Ooooo0o<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22288OoooO f67410OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f67411OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ C25763OooO00o f67412OooOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO oooO, o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, o000oOoO o000oooo3, InterfaceC22288OoooO interfaceC22288OoooO2, C25763OooO00o c25763OooO00o) {
            super(oooO, o000oooo2, interfaceC22288OoooO, "VideoThumbnailProducer");
            this.f67411OooOoo0 = o000oooo3;
            this.f67410OooOoo = interfaceC22288OoooO2;
            this.f67412OooOooO = c25763OooO00o;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0O0(Object obj) {
            AbstractC25434OooO00o.OooOooo((AbstractC25434OooO00o) obj);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final Map OooO0OO(AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o) {
            return C25428OooO0o.OooO00o("createdThumbnail", String.valueOf(abstractC25434OooO00o != null));
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final Object OooO0Oo() throws Exception {
            String strOooO00o;
            Bitmap bitmapCreateVideoThumbnail;
            MediaMetadataRetriever mediaMetadataRetriever;
            Bitmap frameAtTime;
            C22287Oooo0oo c22287Oooo0oo = C22287Oooo0oo.this;
            C25763OooO00o c25763OooO00o = this.f67412OooOooO;
            MediaMetadataRetriever mediaMetadataRetriever2 = null;
            try {
                c22287Oooo0oo.getClass();
                strOooO00o = C25461OooO0Oo.OooO00o(c22287Oooo0oo.f67409OooO0O0, c25763OooO00o.f87911OooO0O0);
            } catch (IllegalArgumentException unused) {
                strOooO00o = null;
            }
            if (strOooO00o != null) {
                c25763OooO00o.getClass();
                bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strOooO00o, 1);
            } else {
                bitmapCreateVideoThumbnail = null;
            }
            if (bitmapCreateVideoThumbnail == null) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = c22287Oooo0oo.f67409OooO0O0.openFileDescriptor(c25763OooO00o.f87911OooO0O0, "r");
                    parcelFileDescriptorOpenFileDescriptor.getClass();
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException unused2) {
                        }
                    } catch (FileNotFoundException unused3) {
                        if (mediaMetadataRetriever != null) {
                            try {
                                mediaMetadataRetriever.release();
                            } catch (IOException unused4) {
                            }
                        }
                        frameAtTime = null;
                    } catch (Throwable th) {
                        th = th;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        if (mediaMetadataRetriever2 != null) {
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused6) {
                    mediaMetadataRetriever = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                bitmapCreateVideoThumbnail = frameAtTime;
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            C25683OooO0OO c25683OooO0OOOooO00o = C25683OooO0OO.OooO00o();
            o00oo.OooOO0O oooOO0O = o00oo.OooOO0O.f87512OooO0Oo;
            int i = o00oo.OooO0o.f87495OooOooo;
            o00oo.OooO0o oooO0o = new o00oo.OooO0o(bitmapCreateVideoThumbnail, c25683OooO0OOOooO00o, oooOO0O);
            InterfaceC25615OooO00o interfaceC25615OooO00o = this.f67410OooOoo;
            interfaceC25615OooO00o.Oooo000("thumbnail", "image_format");
            oooO0o.OooOooo(interfaceC25615OooO00o.getExtras());
            return AbstractC25434OooO00o.o00Oo0(oooO0o);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0o(Exception exc) {
            super.OooO0o(exc);
            o000oOoO o000oooo2 = this.f67411OooOoo0;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67410OooOoo;
            o000oooo2.OooO0O0(interfaceC22288OoooO, "VideoThumbnailProducer", false);
            interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "video");
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0oO(AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o) {
            AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o2 = abstractC25434OooO00o;
            super.OooO0oO(abstractC25434OooO00o2);
            boolean z = abstractC25434OooO00o2 != null;
            o000oOoO o000oooo2 = this.f67411OooOoo0;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67410OooOoo;
            o000oooo2.OooO0O0(interfaceC22288OoooO, "VideoThumbnailProducer", z);
            interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "video");
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0oo$OooO0O0 */
    public class OooO0O0 extends C22260OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f67414OooO00o;

        public OooO0O0(OooO00o oooO00o) {
            this.f67414OooO00o = oooO00o;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
        public final void OooO0O0() {
            this.f67414OooO00o.OooO00o();
        }
    }

    public C22287Oooo0oo(Executor executor, ContentResolver contentResolver) {
        this.f67408OooO00o = executor;
        this.f67409OooO0O0 = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        o000oOoO o000ooooOooOOo0 = interfaceC22288OoooO.OooOOo0();
        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
        interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "video");
        OooO00o oooO00o = new OooO00o(oooO, o000ooooOooOOo0, interfaceC22288OoooO, o000ooooOooOOo0, interfaceC22288OoooO, c25763OooO00oOooOOoo);
        interfaceC22288OoooO.OooO0OO(new OooO0O0(oooO00o));
        this.f67408OooO00o.execute(oooO00o);
    }
}
