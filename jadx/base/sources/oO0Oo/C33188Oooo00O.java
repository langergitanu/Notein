package oO0Oo;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: oO0Oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33188Oooo00O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AiOcrSessionInputSource f120102OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f120103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f120104OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f120105OooO0Oo;

    public C33188Oooo00O(AiOcrSessionInputSource aiOcrSessionInputSource, int i, int i2, int i3) {
        this.f120102OooO00o = aiOcrSessionInputSource;
        this.f120103OooO0O0 = i;
        this.f120104OooO0OO = i2;
        this.f120105OooO0Oo = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33188Oooo00O)) {
            return false;
        }
        C33188Oooo00O c33188Oooo00O = (C33188Oooo00O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120102OooO00o, c33188Oooo00O.f120102OooO00o) && this.f120103OooO0O0 == c33188Oooo00O.f120103OooO0O0 && this.f120104OooO0OO == c33188Oooo00O.f120104OooO0OO && this.f120105OooO0Oo == c33188Oooo00O.f120105OooO0Oo;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57979x81b013cd;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(AiOcrSessionInputSource.class);
        Parcelable parcelable = this.f120102OooO00o;
        if (zIsAssignableFrom) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("input", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(AiOcrSessionInputSource.class)) {
                throw new UnsupportedOperationException(AiOcrSessionInputSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("input", (Serializable) parcelable);
        }
        bundle.putInt("default_page_index", this.f120103OooO0O0);
        bundle.putInt("dst_text_page_index", this.f120104OooO0OO);
        bundle.putInt("dst_text_page_count", this.f120105OooO0Oo);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120105OooO0Oo) + C20785Oooo00o.OooO00o(this.f120104OooO0OO, C20785Oooo00o.OooO00o(this.f120103OooO0O0, this.f120102OooO00o.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionTextRecognizeFragmentToReplacePageSelectorDialogFragment(input=");
        sb.append(this.f120102OooO00o);
        sb.append(", defaultPageIndex=");
        sb.append(this.f120103OooO0O0);
        sb.append(", dstTextPageIndex=");
        sb.append(this.f120104OooO0OO);
        sb.append(", dstTextPageCount=");
        return C21023OooO0Oo.OooO0OO(")", this.f120105OooO0Oo, sb);
    }
}
