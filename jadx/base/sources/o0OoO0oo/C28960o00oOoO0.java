package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: o0OoO0oo.o00oOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28960o00oOoO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102614OooO00o;

    public C28960o00oOoO0(String str) {
        this.f102614OooO00o = str;
    }

    public static final C28960o00oOoO0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28960o00oOoO0.class, NoteMeta.PROPERTY_NOTE_ID)) {
            throw new IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
        if (string != null) {
            return new C28960o00oOoO0(string);
        }
        throw new IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28960o00oOoO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f102614OooO00o, ((C28960o00oOoO0) obj).f102614OooO00o);
    }

    public final int hashCode() {
        return this.f102614OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("NoteLockedDialogFragmentArgs(noteId="), this.f102614OooO00o, ")");
    }
}
