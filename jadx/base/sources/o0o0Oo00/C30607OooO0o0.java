package o0o0Oo00;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o0Oo00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30607OooO0o0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109542OooO00o;

    public C30607OooO0o0(String str) {
        this.f109542OooO00o = str;
    }

    public static final C30607OooO0o0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30607OooO0o0.class, "note_id")) {
            throw new IllegalArgumentException("Required argument \"note_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("note_id");
        if (string != null) {
            return new C30607OooO0o0(string);
        }
        throw new IllegalArgumentException("Argument \"note_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30607OooO0o0) && OooOOO0.OooO0O0(this.f109542OooO00o, ((C30607OooO0o0) obj).f109542OooO00o);
    }

    public final int hashCode() {
        return this.f109542OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("RecoverNoteFromCloudDialogFragmentArgs(noteId="), this.f109542OooO00o, ")");
    }
}
