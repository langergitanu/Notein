package o0o0OOO;

import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0o0OOO.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30504OoooO0O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108936OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f108937OooO0O0;

    public C30504OoooO0O(String str, String str2) {
        this.f108936OooO00o = str;
        this.f108937OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30504OoooO0O)) {
            return false;
        }
        C30504OoooO0O c30504OoooO0O = (C30504OoooO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108936OooO00o, c30504OoooO0O.f108936OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108937OooO0O0, c30504OoooO0O.f108937OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_paperConfigDialogFragment_to_templateRenameDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f108936OooO00o);
        bundle.putString(NoteMeta.PROPERTY_TITLE, this.f108937OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f108937OooO0O0.hashCode() + (this.f108936OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionPaperConfigDialogFragmentToTemplateRenameDialogFragment(id=");
        sb.append(this.f108936OooO00o);
        sb.append(", title=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f108937OooO0O0, ")");
    }
}
