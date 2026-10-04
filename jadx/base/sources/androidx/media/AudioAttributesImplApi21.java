package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AudioAttributes f65714OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f65715OooO0O0 = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f65714OooO00o.equals(((AudioAttributesImplApi21) obj).f65714OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65714OooO00o.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f65714OooO00o;
    }
}
