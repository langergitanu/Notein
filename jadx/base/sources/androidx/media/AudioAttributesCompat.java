package androidx.media;

import android.util.SparseIntArray;
import o00O000o.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f65712OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AudioAttributesImpl f65713OooO00o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f65713OooO00o;
        return audioAttributesImpl == null ? audioAttributesCompat.f65713OooO00o == null : audioAttributesImpl.equals(audioAttributesCompat.f65713OooO00o);
    }

    public final int hashCode() {
        return this.f65713OooO00o.hashCode();
    }

    public final String toString() {
        return this.f65713OooO00o.toString();
    }
}
