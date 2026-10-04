package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class o000O0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101917OooO00o;

    public o000O0(String str) {
        this.f101917OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101917OooO00o, ((o000O0) obj).f101917OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_to_stickerCollectionEditDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("sticker_collection_id", this.f101917OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f101917OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionToStickerCollectionEditDialogFragment(stickerCollectionId="), this.f101917OooO00o, ")");
    }
}
