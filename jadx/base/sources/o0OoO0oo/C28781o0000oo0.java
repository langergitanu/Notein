package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28781o0000oo0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f101910OooO0O0;

    public C28781o0000oo0(String str, boolean z) {
        this.f101909OooO00o = str;
        this.f101910OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28781o0000oo0)) {
            return false;
        }
        C28781o0000oo0 c28781o0000oo0 = (C28781o0000oo0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101909OooO00o, c28781o0000oo0.f101909OooO00o) && this.f101910OooO0O0 == c28781o0000oo0.f101910OooO0O0;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57955xb4782395;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("outlineId", this.f101909OooO00o);
        bundle.putBoolean("has_children", this.f101910OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101910OooO0O0) + (this.f101909OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "ActionNoteEditorContainerFragmentToOutlineDeleteAlertDialogFragment(outlineId=" + this.f101909OooO00o + ", hasChildren=" + this.f101910OooO0O0 + ")";
    }
}
