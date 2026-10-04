package o0oOo00;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;

/* JADX INFO: renamed from: o0oOo00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30935OooO0oo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110536OooO00o;

    public C30935OooO0oo(String str) {
        this.f110536OooO00o = str;
    }

    public static final C30935OooO0oo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30935OooO0oo.class, "sticker_collection_id")) {
            throw new IllegalArgumentException("Required argument \"sticker_collection_id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sticker_collection_id");
        if (string != null) {
            return new C30935OooO0oo(string);
        }
        throw new IllegalArgumentException("Argument \"sticker_collection_id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30935OooO0oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110536OooO00o, ((C30935OooO0oo) obj).f110536OooO00o);
    }

    public final int hashCode() {
        return this.f110536OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("StickerCollectionEditFragmentArgs(stickerCollectionId="), this.f110536OooO00o, ")");
    }
}
