package oO0Oo;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: oO0Oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33187OooOooo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AiOcrSessionInputSource f120096OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f120097OooO0O0;

    public C33187OooOooo(AiOcrSessionInputSource aiOcrSessionInputSource, int i) {
        this.f120096OooO00o = aiOcrSessionInputSource;
        this.f120097OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33187OooOooo)) {
            return false;
        }
        C33187OooOooo c33187OooOooo = (C33187OooOooo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120096OooO00o, c33187OooOooo.f120096OooO00o) && this.f120097OooO0O0 == c33187OooOooo.f120097OooO0O0;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_textRecognizeFragment_to_pdfPageSelectorDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(AiOcrSessionInputSource.class);
        Parcelable parcelable = this.f120096OooO00o;
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
        bundle.putInt("default_page_index", this.f120097OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120097OooO0O0) + (this.f120096OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "ActionTextRecognizeFragmentToPdfPageSelectorDialogFragment(input=" + this.f120096OooO00o + ", defaultPageIndex=" + this.f120097OooO0O0 + ")";
    }
}
