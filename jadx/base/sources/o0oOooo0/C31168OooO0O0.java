package o0oOooo0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0oOooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31168OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bitmap f111183OooO00o;

    public C31168OooO0O0(Bitmap bitmap) {
        this.f111183OooO00o = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31168OooO0O0) && OooOOO0.OooO0O0(this.f111183OooO00o, ((C31168OooO0O0) obj).f111183OooO00o);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f111183OooO00o;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    public final String toString() {
        return "CroppedBitmapData(croppedBitmap=" + this.f111183OooO00o + ")";
    }
}
