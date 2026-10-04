package o0Ooo000;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0Ooo000.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29333OooO0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f104050OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f104051OooO0O0;

    public C29333OooO0o(String str, String str2) {
        this.f104050OooO00o = str;
        this.f104051OooO0O0 = str2;
    }

    public static final C29333OooO0o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29333OooO0o.class, "note_id")) {
            throw new IllegalArgumentException("Required argument \"note_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("note_id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"note_id\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("source_note_id")) {
            throw new IllegalArgumentException("Required argument \"source_note_id\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("source_note_id");
        if (string2 != null) {
            return new C29333OooO0o(string, string2);
        }
        throw new IllegalArgumentException("Argument \"source_note_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29333OooO0o)) {
            return false;
        }
        C29333OooO0o c29333OooO0o = (C29333OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104050OooO00o, c29333OooO0o.f104050OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f104051OooO0O0, c29333OooO0o.f104051OooO0O0);
    }

    public final int hashCode() {
        return this.f104051OooO0O0.hashCode() + (this.f104050OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HyperlinkTiledPagesFragmentArgs(noteId=");
        sb.append(this.f104050OooO00o);
        sb.append(", sourceNoteId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f104051OooO0O0, ")");
    }
}
