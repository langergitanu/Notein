package o0oOOO0o;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0oOOO0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30825OooO0OO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110173OooO0O0;

    public C30825OooO0OO(String str, String str2) {
        this.f110172OooO00o = str;
        this.f110173OooO0O0 = str2;
    }

    public static final C30825OooO0OO fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30825OooO0OO.class, "note_id")) {
            throw new IllegalArgumentException("Required argument \"note_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("note_id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"note_id\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("page_id")) {
            throw new IllegalArgumentException("Required argument \"page_id\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("page_id");
        if (string2 != null) {
            return new C30825OooO0OO(string, string2);
        }
        throw new IllegalArgumentException("Argument \"page_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30825OooO0OO)) {
            return false;
        }
        C30825OooO0OO c30825OooO0OO = (C30825OooO0OO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110172OooO00o, c30825OooO0OO.f110172OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110173OooO0O0, c30825OooO0OO.f110173OooO0O0);
    }

    public final int hashCode() {
        return this.f110173OooO0O0.hashCode() + (this.f110172OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagePaddingDialogFragmentArgs(noteId=");
        sb.append(this.f110172OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110173OooO0O0, ")");
    }
}
