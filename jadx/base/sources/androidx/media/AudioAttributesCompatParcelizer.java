package androidx.media;

import o00O000o.OooO00o;
import o00O000o.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(OooO00o oooO00o) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        OooO0OO oooO0OOOooOOO0 = audioAttributesCompat.f65713OooO00o;
        if (oooO00o.OooO0oo(1)) {
            oooO0OOOooOOO0 = oooO00o.OooOOO0();
        }
        audioAttributesCompat.f65713OooO00o = (AudioAttributesImpl) oooO0OOOooOOO0;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, OooO00o oooO00o) {
        oooO00o.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f65713OooO00o;
        oooO00o.OooOOO(1);
        oooO00o.OooOo0O(audioAttributesImpl);
    }
}
