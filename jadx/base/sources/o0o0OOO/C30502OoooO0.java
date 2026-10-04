package o0o0OOO;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0OOO.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30502OoooO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f108934OooO00o;

    public C30502OoooO0(Uri uri) {
        this.f108934OooO00o = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30502OoooO0)) {
            return false;
        }
        C30502OoooO0 c30502OoooO0 = (C30502OoooO0) obj;
        c30502OoooO0.getClass();
        return this.f108934OooO00o.equals(c30502OoooO0.f108934OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57971x1041a816;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", "add_pdf_page");
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, "");
        bundle.putString("pageId", "");
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = this.f108934OooO00o;
        if (zIsAssignableFrom) {
            bundle.putParcelable("pdfUri", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putSerializable("pdfUri", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        return this.f108934OooO00o.hashCode() + 1301058086;
    }

    public final String toString() {
        return "ActionPaperConfigDialogFragmentToPDFPageSelectorDialogFragment(key=add_pdf_page, noteId=, pageId=, pdfUri=" + this.f108934OooO00o + ")";
    }
}
