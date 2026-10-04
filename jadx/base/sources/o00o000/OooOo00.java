package o00o000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.fragment.app.C21929Ooooo0o;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o00OooOO.C25159OooO0oO;
import o00o0O0.C25308OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public interface OooOo00 {

    public static final class OooO00o implements OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f85919OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f85920OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C25159OooO0oO f85921OooO0OO;

        public OooO00o(ByteBuffer byteBuffer, ArrayList arrayList, C25159OooO0oO c25159OooO0oO) {
            this.f85919OooO00o = byteBuffer;
            this.f85920OooO0O0 = arrayList;
            this.f85921OooO0OO = c25159OooO0oO;
        }

        @Override // o00o000.OooOo00
        public final void OooO00o() {
        }

        @Override // o00o000.OooOo00
        public final int OooO0O0() throws IOException {
            ByteBuffer byteBufferOooO0OO = C25308OooO00o.OooO0OO(this.f85919OooO00o);
            C25159OooO0oO c25159OooO0oO = this.f85921OooO0OO;
            if (byteBufferOooO0OO != null) {
                ArrayList arrayList = this.f85920OooO0O0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iOooO0Oo = ((ImageHeaderParser) arrayList.get(i)).OooO0Oo(byteBufferOooO0OO, c25159OooO0oO);
                        if (iOooO0Oo != -1) {
                            return iOooO0Oo;
                        }
                    } finally {
                    }
                }
            }
            return -1;
        }

        @Override // o00o000.OooOo00
        public final Bitmap OooO0OO(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new C25308OooO00o.C19693OooO00o(C25308OooO00o.OooO0OO(this.f85919OooO00o)), null, options);
        }

        @Override // o00o000.OooOo00
        public final ImageHeaderParser.ImageType getImageType() throws IOException {
            return com.bumptech.glide.load.OooO00o.OooO0OO(this.f85920OooO0O0, C25308OooO00o.OooO0OO(this.f85919OooO00o));
        }
    }

    public static final class OooO0O0 implements OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.bumptech.glide.load.data.OooOO0O f85922OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C25159OooO0oO f85923OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f85924OooO0OO;

        public OooO0O0(o00o0O0.OooOO0 oooOO02, ArrayList arrayList, C25159OooO0oO c25159OooO0oO) {
            C21929Ooooo0o.OooO0OO(c25159OooO0oO, "Argument must not be null");
            this.f85923OooO0O0 = c25159OooO0oO;
            C21929Ooooo0o.OooO0OO(arrayList, "Argument must not be null");
            this.f85924OooO0OO = arrayList;
            this.f85922OooO00o = new com.bumptech.glide.load.data.OooOO0O(oooOO02, c25159OooO0oO);
        }

        @Override // o00o000.OooOo00
        public final void OooO00o() {
            OooOo oooOo = this.f85922OooO00o.f67213OooO00o;
            synchronized (oooOo) {
                oooOo.f85915OooOoO0 = oooOo.f85913OooOo0o.length;
            }
        }

        @Override // o00o000.OooOo00
        public final int OooO0O0() throws IOException {
            OooOo oooOo = this.f85922OooO00o.f67213OooO00o;
            oooOo.reset();
            return com.bumptech.glide.load.OooO00o.OooO00o(this.f85924OooO0OO, oooOo, this.f85923OooO0O0);
        }

        @Override // o00o000.OooOo00
        public final Bitmap OooO0OO(BitmapFactory.Options options) throws IOException {
            OooOo oooOo = this.f85922OooO00o.f67213OooO00o;
            oooOo.reset();
            return BitmapFactory.decodeStream(oooOo, null, options);
        }

        @Override // o00o000.OooOo00
        public final ImageHeaderParser.ImageType getImageType() throws IOException {
            OooOo oooOo = this.f85922OooO00o.f67213OooO00o;
            oooOo.reset();
            return com.bumptech.glide.load.OooO00o.OooO0O0(this.f85924OooO0OO, oooOo, this.f85923OooO0O0);
        }
    }

    public static final class OooO0OO implements OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25159OooO0oO f85925OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f85926OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f85927OooO0OO;

        public OooO0OO(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C25159OooO0oO c25159OooO0oO) {
            C21929Ooooo0o.OooO0OO(c25159OooO0oO, "Argument must not be null");
            this.f85925OooO00o = c25159OooO0oO;
            C21929Ooooo0o.OooO0OO(arrayList, "Argument must not be null");
            this.f85926OooO0O0 = arrayList;
            this.f85927OooO0OO = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o00o000.OooOo00
        public final void OooO00o() {
        }

        @Override // o00o000.OooOo00
        public final int OooO0O0() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f85927OooO0OO;
            C25159OooO0oO c25159OooO0oO = this.f85925OooO00o;
            ArrayList arrayList = this.f85926OooO0O0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                OooOo oooOo = null;
                try {
                    OooOo oooOo2 = new OooOo(new FileInputStream(parcelFileDescriptorRewinder.OooO0OO().getFileDescriptor()), c25159OooO0oO);
                    try {
                        int iOooO00o = imageHeaderParser.OooO00o(oooOo2, c25159OooO0oO);
                        oooOo2.release();
                        parcelFileDescriptorRewinder.OooO0OO();
                        if (iOooO00o != -1) {
                            return iOooO00o;
                        }
                    } catch (Throwable th) {
                        th = th;
                        oooOo = oooOo2;
                        if (oooOo != null) {
                            oooOo.release();
                        }
                        parcelFileDescriptorRewinder.OooO0OO();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // o00o000.OooOo00
        public final Bitmap OooO0OO(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f85927OooO0OO.OooO0OO().getFileDescriptor(), null, options);
        }

        @Override // o00o000.OooOo00
        public final ImageHeaderParser.ImageType getImageType() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f85927OooO0OO;
            C25159OooO0oO c25159OooO0oO = this.f85925OooO00o;
            ArrayList arrayList = this.f85926OooO0O0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                OooOo oooOo = null;
                try {
                    OooOo oooOo2 = new OooOo(new FileInputStream(parcelFileDescriptorRewinder.OooO0OO().getFileDescriptor()), c25159OooO0oO);
                    try {
                        ImageHeaderParser.ImageType imageTypeOooO0O0 = imageHeaderParser.OooO0O0(oooOo2);
                        oooOo2.release();
                        parcelFileDescriptorRewinder.OooO0OO();
                        if (imageTypeOooO0O0 != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeOooO0O0;
                        }
                    } catch (Throwable th) {
                        th = th;
                        oooOo = oooOo2;
                        if (oooOo != null) {
                            oooOo.release();
                        }
                        parcelFileDescriptorRewinder.OooO0OO();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    void OooO00o();

    int OooO0O0() throws IOException;

    Bitmap OooO0OO(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType getImageType() throws IOException;
}
