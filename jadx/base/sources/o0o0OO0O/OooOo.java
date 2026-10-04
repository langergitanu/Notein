package o0o0OO0O;

import OooOoo0.o00000;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f108709OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f108710OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f108711OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f108712OooO0Oo;

    public OooOo(int i, int i2, String targetNoteId, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(targetNoteId, "targetNoteId");
        this.f108709OooO00o = i;
        this.f108710OooO0O0 = z;
        this.f108711OooO0OO = targetNoteId;
        this.f108712OooO0Oo = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f108709OooO00o == oooOo.f108709OooO00o && this.f108710OooO0O0 == oooOo.f108710OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108711OooO0OO, oooOo.f108711OooO0OO) && this.f108712OooO0Oo == oooOo.f108712OooO0Oo;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57981xafe6b8aa;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("action", this.f108709OooO00o);
        bundle.putBoolean(FirebaseAnalytics.Param.SUCCESS, this.f108710OooO0O0);
        bundle.putInt("num_pages", this.f108712OooO0Oo);
        bundle.putString("target_note_id", this.f108711OooO0OO);
        return bundle;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108712OooO0Oo) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(o00000.OooO0O0(Integer.hashCode(this.f108709OooO00o) * 31, 31, this.f108710OooO0O0), 31, this.f108711OooO0OO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionTiledPageEditorFragmentToPageOperationTipsDialogFragment(action=");
        sb.append(this.f108709OooO00o);
        sb.append(", success=");
        sb.append(this.f108710OooO0O0);
        sb.append(", targetNoteId=");
        sb.append(this.f108711OooO0OO);
        sb.append(", numPages=");
        return C21023OooO0Oo.OooO0OO(")", this.f108712OooO0Oo, sb);
    }
}
