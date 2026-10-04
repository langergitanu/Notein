package o0OoO0oo;

import OooOoo.C20593OooO0Oo;
import android.net.Uri;
import android.os.Bundle;
import com.orion.notein.global.R;
import java.util.Arrays;

/* JADX INFO: renamed from: o0OoO0oo.o000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28795o000Oo0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri[] f101965OooO00o;

    public C28795o000Oo0(Uri[] uriArr) {
        this.f101965OooO00o = uriArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28795o000Oo0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101965OooO00o, ((C28795o000Oo0) obj).f101965OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_to_addToStickerCollectionDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("to_added_uris", this.f101965OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f101965OooO00o);
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("ActionToAddToStickerCollectionDialogFragment(toAddedUris=", Arrays.toString(this.f101965OooO00o), ")");
    }
}
