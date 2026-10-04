package oO0Oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f120100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f120101OooO0O0;

    public Oooo000() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Oooo000) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120100OooO00o, ((Oooo000) obj).f120100OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f120101OooO0O0;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f120100OooO00o);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f120100OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionTextRecognizeFragmentToPdfPasswordDialogFragment(id="), this.f120100OooO00o, ")");
    }

    public Oooo000(String str) {
        this.f120100OooO00o = str;
        this.f120101OooO0O0 = R.id.action_textRecognizeFragment_to_pdfPasswordDialogFragment;
    }
}
