package o0OoOO00;

import Oooo0.C20860Ooooooo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoOO00.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29028OoooO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102838OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f102839OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f102840OooO0Oo;

    public C29028OoooO0(Uri uri, String str, String str2, String str3) {
        this.f102837OooO00o = str;
        this.f102838OooO0O0 = str2;
        this.f102839OooO0OO = str3;
        this.f102840OooO0Oo = uri;
    }

    public static final C29028OoooO0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29028OoooO0.class, "key")) {
            throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(NoteMeta.PROPERTY_NOTE_ID)) {
            throw new IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("pageId")) {
            throw new IllegalArgumentException("Required argument \"pageId\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("pageId");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"pageId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("pdfUri")) {
            throw new IllegalArgumentException("Required argument \"pdfUri\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Uri.class) && !Serializable.class.isAssignableFrom(Uri.class)) {
            throw new UnsupportedOperationException(Uri.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Uri uri = (Uri) bundle.get("pdfUri");
        if (uri != null) {
            return new C29028OoooO0(uri, string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"pdfUri\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29028OoooO0)) {
            return false;
        }
        C29028OoooO0 c29028OoooO0 = (C29028OoooO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102837OooO00o, c29028OoooO0.f102837OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102838OooO0O0, c29028OoooO0.f102838OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102839OooO0OO, c29028OoooO0.f102839OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102840OooO0Oo, c29028OoooO0.f102840OooO0Oo);
    }

    public final int hashCode() {
        return this.f102840OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f102837OooO00o.hashCode() * 31, 31, this.f102838OooO0O0), 31, this.f102839OooO0OO);
    }

    public final String toString() {
        return "PDFPageSelectorDialogFragmentArgs(key=" + this.f102837OooO00o + ", noteId=" + this.f102838OooO0O0 + ", pageId=" + this.f102839OooO0OO + ", pdfUri=" + this.f102840OooO0Oo + ")";
    }
}
