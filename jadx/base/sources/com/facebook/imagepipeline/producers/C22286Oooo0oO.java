package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import o00o0Ooo.C25428OooO0o;
import o00o0o.AbstractC25434OooO00o;
import o00o0o0O.C25440OooO00o;
import o00o0oOo.C25461OooO0Oo;
import o00oOoO.InterfaceC25615OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0OO.C25683OooO0OO;
import o00ooO0o.C25763OooO00o;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22286Oooo0oO implements InterfaceC22291OoooO0O<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f67400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ContentResolver f67401OooO0O0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0oO$OooO00o */
    public class OooO00o extends AbstractRunnableC22299Ooooo0o<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22288OoooO f67402OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f67403OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ C25763OooO00o f67404OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f67405OooOooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO oooO, o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, o000oOoO o000oooo3, InterfaceC22288OoooO interfaceC22288OoooO2, C25763OooO00o c25763OooO00o, CancellationSignal cancellationSignal) {
            super(oooO, o000oooo2, interfaceC22288OoooO, "LocalThumbnailBitmapSdk29Producer");
            this.f67403OooOoo0 = o000oooo3;
            this.f67402OooOoo = interfaceC22288OoooO2;
            this.f67404OooOooO = c25763OooO00o;
            this.f67405OooOooo = cancellationSignal;
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
            Bitmap bitmapLoadThumbnail;
            C22286Oooo0oO c22286Oooo0oO = C22286Oooo0oO.this;
            C25763OooO00o c25763OooO00o = this.f67404OooOooO;
            c25763OooO00o.getClass();
            Uri uri = c25763OooO00o.f87911OooO0O0;
            Size size = new Size(2048, 2048);
            try {
                c22286Oooo0oO.getClass();
                strOooO00o = C25461OooO0Oo.OooO00o(c22286Oooo0oO.f67401OooO0O0, uri);
            } catch (IllegalArgumentException unused) {
                strOooO00o = null;
            }
            CancellationSignal cancellationSignal = this.f67405OooOooo;
            if (strOooO00o != null) {
                String strOooO00o2 = C25440OooO00o.OooO00o(strOooO00o);
                bitmapLoadThumbnail = strOooO00o2 != null ? C33595OooOOo.OooOoO0(strOooO00o2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strOooO00o), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strOooO00o), size, cancellationSignal);
            } else {
                bitmapLoadThumbnail = null;
            }
            if (bitmapLoadThumbnail == null) {
                bitmapLoadThumbnail = c22286Oooo0oO.f67401OooO0O0.loadThumbnail(uri, size, cancellationSignal);
            }
            if (bitmapLoadThumbnail == null) {
                return null;
            }
            C25683OooO0OO c25683OooO0OOOooO00o = C25683OooO0OO.OooO00o();
            o00oo.OooOO0O oooOO0O = o00oo.OooOO0O.f87512OooO0Oo;
            int i = o00oo.OooO0o.f87495OooOooo;
            o00oo.OooO0o oooO0o = new o00oo.OooO0o(bitmapLoadThumbnail, c25683OooO0OOOooO00o, oooOO0O);
            InterfaceC25615OooO00o interfaceC25615OooO00o = this.f67402OooOoo;
            interfaceC25615OooO00o.Oooo000("thumbnail", "image_format");
            oooO0o.OooOooo(interfaceC25615OooO00o.getExtras());
            return AbstractC25434OooO00o.o00Oo0(oooO0o);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0o(Exception exc) {
            super.OooO0o(exc);
            o000oOoO o000oooo2 = this.f67403OooOoo0;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67402OooOoo;
            o000oooo2.OooO0O0(interfaceC22288OoooO, "LocalThumbnailBitmapSdk29Producer", false);
            interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "thumbnail_bitmap");
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0o0() {
            super.OooO0o0();
            this.f67405OooOooo.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0oO(AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o) {
            AbstractC25434OooO00o<InterfaceC25636OooO0Oo> abstractC25434OooO00o2 = abstractC25434OooO00o;
            super.OooO0oO(abstractC25434OooO00o2);
            boolean z = abstractC25434OooO00o2 != null;
            o000oOoO o000oooo2 = this.f67403OooOoo0;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67402OooOoo;
            o000oooo2.OooO0O0(interfaceC22288OoooO, "LocalThumbnailBitmapSdk29Producer", z);
            interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "thumbnail_bitmap");
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo0oO$OooO0O0 */
    public class OooO0O0 extends C22260OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f67407OooO00o;

        public OooO0O0(OooO00o oooO00o) {
            this.f67407OooO00o = oooO00o;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
        public final void OooO0O0() {
            this.f67407OooO00o.OooO00o();
        }
    }

    public C22286Oooo0oO(Executor executor, ContentResolver contentResolver) {
        this.f67400OooO00o = executor;
        this.f67401OooO0O0 = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        o000oOoO o000ooooOooOOo0 = interfaceC22288OoooO.OooOOo0();
        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
        interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, "thumbnail_bitmap");
        OooO00o oooO00o = new OooO00o(oooO, o000ooooOooOOo0, interfaceC22288OoooO, o000ooooOooOOo0, interfaceC22288OoooO, c25763OooO00oOooOOoo, new CancellationSignal());
        interfaceC22288OoooO.OooO0OO(new OooO0O0(oooO00o));
        this.f67400OooO00o.execute(oooO00o);
    }
}
