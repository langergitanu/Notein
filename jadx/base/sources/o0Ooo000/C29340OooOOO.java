package o0Ooo000;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Ooo000.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29340OooOOO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f104065OooO00o;

    public C29340OooOOO(String str) {
        this.f104065OooO00o = str;
    }

    public static final C29340OooOOO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29340OooOOO.class, "source_note_id")) {
            throw new IllegalArgumentException("Required argument \"source_note_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("source_note_id");
        if (string != null) {
            return new C29340OooOOO(string);
        }
        throw new IllegalArgumentException("Argument \"source_note_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29340OooOOO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104065OooO00o, ((C29340OooOOO) obj).f104065OooO00o);
    }

    public final int hashCode() {
        return this.f104065OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("NoteTreeSelectionFragmentArgs(sourceNoteId="), this.f104065OooO00o, ")");
    }
}
