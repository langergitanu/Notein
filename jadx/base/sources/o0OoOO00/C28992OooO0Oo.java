package o0OoOO00;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoOO00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28992OooO0Oo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102735OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102736OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f102737OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f102738OooO0Oo;

    public C28992OooO0Oo(Uri pdfUri, String key, String noteId, String pageId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfUri, "pdfUri");
        this.f102735OooO00o = key;
        this.f102736OooO0O0 = noteId;
        this.f102737OooO0OO = pageId;
        this.f102738OooO0Oo = pdfUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28992OooO0Oo)) {
            return false;
        }
        C28992OooO0Oo c28992OooO0Oo = (C28992OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102735OooO00o, c28992OooO0Oo.f102735OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102736OooO0O0, c28992OooO0Oo.f102736OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102737OooO0OO, c28992OooO0Oo.f102737OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102738OooO0Oo, c28992OooO0Oo.f102738OooO0Oo);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57916xf4346cce;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("key", this.f102735OooO00o);
        bundle.putString(NoteMeta.PROPERTY_NOTE_ID, this.f102736OooO0O0);
        bundle.putString("pageId", this.f102737OooO0OO);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = this.f102738OooO0Oo;
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
        return this.f102738OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f102735OooO00o.hashCode() * 31, 31, this.f102736OooO0O0), 31, this.f102737OooO0OO);
    }

    public final String toString() {
        return "ActionAddPageBottomSheetDialogFragmentToPDFPageSelectorDialogFragment(key=" + this.f102735OooO00o + ", noteId=" + this.f102736OooO0O0 + ", pageId=" + this.f102737OooO0OO + ", pdfUri=" + this.f102738OooO0Oo + ")";
    }
}
