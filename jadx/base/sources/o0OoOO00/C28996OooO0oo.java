package o0OoOO00;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: o0OoOO00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28996OooO0oo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102743OooO0O0;

    public C28996OooO0oo(String str, String str2) {
        this.f102742OooO00o = str;
        this.f102743OooO0O0 = str2;
    }

    public static final C28996OooO0oo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28996OooO0oo.class, NoteMeta.PROPERTY_NOTE_ID)) {
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
            return new C28996OooO0oo(string, string2);
        }
        throw new IllegalArgumentException("Argument \"pageId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28996OooO0oo)) {
            return false;
        }
        C28996OooO0oo c28996OooO0oo = (C28996OooO0oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102742OooO00o, c28996OooO0oo.f102742OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102743OooO0O0, c28996OooO0oo.f102743OooO0O0);
    }

    public final int hashCode() {
        return this.f102743OooO0O0.hashCode() + (this.f102742OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddPageDialogFragmentArgs(noteId=");
        sb.append(this.f102742OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f102743OooO0O0, ")");
    }
}
