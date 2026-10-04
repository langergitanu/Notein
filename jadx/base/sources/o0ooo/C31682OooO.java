package o0ooo;

import OooOooo.C20785Oooo00o;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import java.io.Serializable;

/* JADX INFO: renamed from: o0ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31682OooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AiOcrSessionInputSource f113218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f113220OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f113221OooO0Oo;

    public C31682OooO(AiOcrSessionInputSource aiOcrSessionInputSource, int i, int i2, int i3) {
        this.f113218OooO00o = aiOcrSessionInputSource;
        this.f113219OooO0O0 = i;
        this.f113220OooO0OO = i2;
        this.f113221OooO0Oo = i3;
    }

    public static final C31682OooO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C31682OooO.class, "input")) {
            throw new IllegalArgumentException("Required argument \"input\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(AiOcrSessionInputSource.class) && !Serializable.class.isAssignableFrom(AiOcrSessionInputSource.class)) {
            throw new UnsupportedOperationException(AiOcrSessionInputSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        AiOcrSessionInputSource aiOcrSessionInputSource = (AiOcrSessionInputSource) bundle.get("input");
        if (aiOcrSessionInputSource != null) {
            return new C31682OooO(aiOcrSessionInputSource, bundle.containsKey("default_page_index") ? bundle.getInt("default_page_index") : 0, bundle.containsKey("dst_text_page_index") ? bundle.getInt("dst_text_page_index") : -1, bundle.containsKey("dst_text_page_count") ? bundle.getInt("dst_text_page_count") : 1);
        }
        throw new IllegalArgumentException("Argument \"input\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31682OooO)) {
            return false;
        }
        C31682OooO c31682OooO = (C31682OooO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f113218OooO00o, c31682OooO.f113218OooO00o) && this.f113219OooO0O0 == c31682OooO.f113219OooO0O0 && this.f113220OooO0OO == c31682OooO.f113220OooO0OO && this.f113221OooO0Oo == c31682OooO.f113221OooO0Oo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113221OooO0Oo) + C20785Oooo00o.OooO00o(this.f113220OooO0OO, C20785Oooo00o.OooO00o(this.f113219OooO0O0, this.f113218OooO00o.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplacePageSelectorDialogFragmentArgs(input=");
        sb.append(this.f113218OooO00o);
        sb.append(", defaultPageIndex=");
        sb.append(this.f113219OooO0O0);
        sb.append(", dstTextPageIndex=");
        sb.append(this.f113220OooO0OO);
        sb.append(", dstTextPageCount=");
        return C21023OooO0Oo.OooO0OO(")", this.f113221OooO0Oo, sb);
    }
}
