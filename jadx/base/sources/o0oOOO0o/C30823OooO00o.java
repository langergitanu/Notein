package o0oOOO0o;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0oOOO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30823OooO00o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110171OooO0O0;

    public C30823OooO00o(String str, String str2) {
        this.f110170OooO00o = str;
        this.f110171OooO0O0 = str2;
    }

    public static final C30823OooO00o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30823OooO00o.class, "note_id")) {
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
            return new C30823OooO00o(string, string2);
        }
        throw new IllegalArgumentException("Argument \"page_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30823OooO00o)) {
            return false;
        }
        C30823OooO00o c30823OooO00o = (C30823OooO00o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110170OooO00o, c30823OooO00o.f110170OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110171OooO0O0, c30823OooO00o.f110171OooO0O0);
    }

    public final int hashCode() {
        return this.f110171OooO0O0.hashCode() + (this.f110170OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagePaddingBottomSheetDialogFragmentArgs(noteId=");
        sb.append(this.f110170OooO00o);
        sb.append(", pageId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f110171OooO0O0, ")");
    }
}
