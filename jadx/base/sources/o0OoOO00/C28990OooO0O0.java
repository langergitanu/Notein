package o0OoOO00;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: o0OoOO00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28990OooO0O0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102732OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102733OooO0O0;

    public C28990OooO0O0(String str, String str2) {
        this.f102732OooO00o = str;
        this.f102733OooO0O0 = str2;
    }

    public static final C28990OooO0O0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28990OooO0O0.class, NoteMeta.PROPERTY_NOTE_ID)) {
            throw new IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("pageId")) {
            throw new IllegalArgumentException("Required argument \"pageId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("pageId");
        if (string2 != null) {
            return new C28990OooO0O0(string, string2);
        }
        throw new IllegalArgumentException("Argument \"pageId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28990OooO0O0)) {
            return false;
        }
        C28990OooO0O0 c28990OooO0O0 = (C28990OooO0O0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102732OooO00o, c28990OooO0O0.f102732OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102733OooO0O0, c28990OooO0O0.f102733OooO0O0);
    }

    public final int hashCode() {
        return this.f102733OooO0O0.hashCode() + (this.f102732OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddPageBottomSheetDialogFragmentArgs(noteId=");
        sb.append(this.f102732OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f102733OooO0O0, ")");
    }
}
