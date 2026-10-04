package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import o00O000o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(OooO00o oooO00o) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Parcelable parcelableOooOO0O = audioAttributesImplApi21.f65714OooO00o;
        if (oooO00o.OooO0oo(1)) {
            parcelableOooOO0O = oooO00o.OooOO0O();
        }
        audioAttributesImplApi21.f65714OooO00o = (AudioAttributes) parcelableOooOO0O;
        audioAttributesImplApi21.f65715OooO0O0 = oooO00o.OooOO0(audioAttributesImplApi21.f65715OooO0O0, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, OooO00o oooO00o) {
        oooO00o.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f65714OooO00o;
        oooO00o.OooOOO(1);
        oooO00o.OooOo00(audioAttributes);
        oooO00o.OooOOoo(audioAttributesImplApi21.f65715OooO0O0, 2);
    }
}
