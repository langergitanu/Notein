package o0ooo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.io.Serializable;

/* JADX INFO: renamed from: o0ooo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31696OooOOOO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AiOcrSessionInputSource f113234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113235OooO0O0;

    public C31696OooOOOO(AiOcrSessionInputSource aiOcrSessionInputSource, int i) {
        this.f113234OooO00o = aiOcrSessionInputSource;
        this.f113235OooO0O0 = i;
    }

    public static final C31696OooOOOO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C31696OooOOOO.class, "input")) {
            throw new IllegalArgumentException("Required argument \"input\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(AiOcrSessionInputSource.class) && !Serializable.class.isAssignableFrom(AiOcrSessionInputSource.class)) {
            throw new UnsupportedOperationException(AiOcrSessionInputSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        AiOcrSessionInputSource aiOcrSessionInputSource = (AiOcrSessionInputSource) bundle.get("input");
        if (aiOcrSessionInputSource != null) {
            return new C31696OooOOOO(aiOcrSessionInputSource, bundle.containsKey("default_page_index") ? bundle.getInt("default_page_index") : 0);
        }
        throw new IllegalArgumentException("Argument \"input\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31696OooOOOO)) {
            return false;
        }
        C31696OooOOOO c31696OooOOOO = (C31696OooOOOO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113234OooO00o, c31696OooOOOO.f113234OooO00o) && this.f113235OooO0O0 == c31696OooOOOO.f113235OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113235OooO0O0) + (this.f113234OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "ScannedPageSelectDialogFragmentArgs(input=" + this.f113234OooO00o + ", defaultPageIndex=" + this.f113235OooO0O0 + ")";
    }
}
