package o0oOOooO;

import OooOoo.C20593OooO0Oo;
import android.net.Uri;
import android.os.Bundle;
import com.orion.notein.global.R;
import java.util.Arrays;
import o000o0O0.OooOo;

/* JADX INFO: renamed from: o0oOOooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30881OooO0O0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri[] f110363OooO00o;

    public C30881OooO0O0(Uri[] uriArr) {
        this.f110363OooO00o = uriArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30881OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110363OooO00o, ((C30881OooO0O0) obj).f110363OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_to_stickerCollectionCreationDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("to_added_uris", this.f110363OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f110363OooO00o);
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("ActionToStickerCollectionCreationDialogFragment(toAddedUris=", Arrays.toString(this.f110363OooO00o), ")");
    }
}
