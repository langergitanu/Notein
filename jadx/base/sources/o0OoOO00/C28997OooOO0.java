package o0OoOO00;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoOO00.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28997OooOO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102744OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102745OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f102746OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f102747OooO0Oo;

    public C28997OooOO0(Uri pdfUri, String key, String noteId, String pageId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfUri, "pdfUri");
        this.f102744OooO00o = key;
        this.f102745OooO0O0 = noteId;
        this.f102746OooO0OO = pageId;
        this.f102747OooO0Oo = pdfUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28997OooOO0)) {
            return false;
        }
        C28997OooOO0 c28997OooOO0 = (C28997OooOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102744OooO00o, c28997OooOO0.f102744OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102745OooO0O0, c28997OooOO0.f102745OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102746OooO0OO, c28997OooOO0.f102746OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102747OooO0Oo, c28997OooOO0.f102747OooO0Oo);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_addPageDialogFragment_to_PDFPageSelectorDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f102744OooO00o);
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f102745OooO0O0);
        bundle.putString("pageId", this.f102746OooO0OO);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = this.f102747OooO0Oo;
        if (zIsAssignableFrom) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("pdfUri", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("pdfUri", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        return this.f102747OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f102744OooO00o.hashCode() * 31, 31, this.f102745OooO0O0), 31, this.f102746OooO0OO);
    }

    public final String toString() {
        return "ActionAddPageDialogFragmentToPDFPageSelectorDialogFragment(key=" + this.f102744OooO00o + ", noteId=" + this.f102745OooO0O0 + ", pageId=" + this.f102746OooO0OO + ", pdfUri=" + this.f102747OooO0Oo + ")";
    }
}
