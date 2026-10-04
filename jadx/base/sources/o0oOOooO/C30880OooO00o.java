package o0oOOooO;

import OooOoo.C20593OooO0Oo;
import Oooo0.C20860Ooooooo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o0oOOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30880OooO00o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri[] f110362OooO00o;

    public C30880OooO00o(Uri[] uriArr) {
        this.f110362OooO00o = uriArr;
    }

    public static final C30880OooO00o fromBundle(Bundle bundle) {
        Uri[] uriArr;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30880OooO00o.class, "to_added_uris")) {
            throw new IllegalArgumentException("Required argument \"to_added_uris\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("to_added_uris");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.net.Uri");
                arrayList.add((Uri) parcelable);
            }
            uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
        } else {
            uriArr = null;
        }
        if (uriArr != null) {
            return new C30880OooO00o(uriArr);
        }
        throw new IllegalArgumentException("Argument \"to_added_uris\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30880OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110362OooO00o, ((C30880OooO00o) obj).f110362OooO00o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f110362OooO00o);
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("AddToStickerCollectionDialogFragmentArgs(toAddedUris=", Arrays.toString(this.f110362OooO00o), ")");
    }
}
