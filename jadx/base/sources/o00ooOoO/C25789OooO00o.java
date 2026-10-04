package o00ooOoO;

import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StreamDownloadTask;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OoooO.C25190OooOo0O;
import o00OoooO.InterfaceC25186OooOOo;
import o00OoooO.InterfaceC25188OooOOoo;
import o00ooOoO.C25789OooO00o;

/* JADX INFO: renamed from: o00ooOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25789OooO00o implements InterfaceC25186OooOOo<StorageReference, InputStream> {

    /* JADX INFO: renamed from: o00ooOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19717OooO00o implements InterfaceC25188OooOOoo<StorageReference, InputStream> {
        @Override // o00OoooO.InterfaceC25188OooOOoo
        public final InterfaceC25186OooOOo<StorageReference, InputStream> OooO0OO(C25190OooOo0O c25190OooOo0O) {
            return new C25789OooO00o();
        }
    }

    /* JADX INFO: renamed from: o00ooOoO.OooO00o$OooO0O0 */
    public static class OooO0O0 implements InterfaceC22255OooO0Oo<InputStream> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public StreamDownloadTask f87962OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public StorageReference f87963OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public InputStream f87964OooOoO0;

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0O0() {
            InputStream inputStream = this.f87964OooOoO0;
            if (inputStream != null) {
                try {
                    inputStream.close();
                    this.f87964OooOoO0 = null;
                } catch (IOException e) {
                    Log.w("FirebaseImageLoader", "Could not close stream", e);
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final EnumC25112OooO00o OooO0OO() {
            return EnumC25112OooO00o.f85369OooOo;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, final InterfaceC22255OooO0Oo.OooO00o<? super InputStream> oooO00o) {
            StreamDownloadTask stream = this.f87963OooOo0o.getStream();
            this.f87962OooOo = stream;
            stream.addOnSuccessListener(new OnSuccessListener() { // from class: o00ooOoO.OooO0O0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C25789OooO00o.OooO0O0 oooO0O0 = this.f87966OooO00o;
                    oooO0O0.getClass();
                    InputStream stream2 = ((StreamDownloadTask.TaskSnapshot) obj).getStream();
                    oooO0O0.f87964OooOoO0 = stream2;
                    oooO00o.OooO0o0(stream2);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: o00ooOoO.OooO0OO
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    oooO00o.OooO0o(exc);
                }
            });
        }

        @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
        public final void cancel() {
            StreamDownloadTask streamDownloadTask = this.f87962OooOo;
            if (streamDownloadTask == null || !streamDownloadTask.isInProgress()) {
                return;
            }
            this.f87962OooOo.cancel();
        }
    }

    /* JADX INFO: renamed from: o00ooOoO.OooO00o$OooO0OO */
    public static class OooO0OO implements InterfaceC25116OooO0o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public StorageReference f87965OooO0O0;

        @Override // o00Ooo0o.InterfaceC25116OooO0o
        public final void OooO00o(MessageDigest messageDigest) {
            messageDigest.update(this.f87965OooO0O0.getPath().getBytes(Charset.defaultCharset()));
        }

        @Override // o00Ooo0o.InterfaceC25116OooO0o
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0OO.class != obj.getClass()) {
                return false;
            }
            return this.f87965OooO0O0.equals(((OooO0OO) obj).f87965OooO0O0);
        }

        @Override // o00Ooo0o.InterfaceC25116OooO0o
        public final int hashCode() {
            return this.f87965OooO0O0.hashCode();
        }
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final InterfaceC25186OooOOo.OooO00o<InputStream> OooO00o(StorageReference storageReference, int i, int i2, C25111OooO c25111OooO) {
        StorageReference storageReference2 = storageReference;
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f87965OooO0O0 = storageReference2;
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f87963OooOo0o = storageReference2;
        return new InterfaceC25186OooOOo.OooO00o<>(oooO0OO, oooO0O0);
    }

    @Override // o00OoooO.InterfaceC25186OooOOo
    public final /* bridge */ /* synthetic */ boolean OooO0O0(StorageReference storageReference) {
        return true;
    }
}
