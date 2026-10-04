package o0o0OO0O;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0o0OO0O.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30432OooOO0O implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108692OooO00o;

    public C30432OooOO0O(String str) {
        this.f108692OooO00o = str;
    }

    public static final C30432OooOO0O fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30432OooOO0O.class, "default_note_title")) {
            throw new IllegalArgumentException("Required argument \"default_note_title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("default_note_title");
        if (string != null) {
            return new C30432OooOO0O(string);
        }
        throw new IllegalArgumentException("Argument \"default_note_title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30432OooOO0O) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108692OooO00o, ((C30432OooOO0O) obj).f108692OooO00o);
    }

    public final int hashCode() {
        return this.f108692OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("PageSaveAsDialogFragmentArgs(defaultNoteTitle="), this.f108692OooO00o, ")");
    }
}
