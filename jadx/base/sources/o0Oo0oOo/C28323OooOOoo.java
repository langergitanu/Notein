package o0Oo0oOo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0oOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28323OooOOoo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100446OooO00o;

    public C28323OooOOoo(String creatorId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(creatorId, "creatorId");
        this.f100446OooO00o = creatorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28323OooOOoo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100446OooO00o, ((C28323OooOOoo) obj).f100446OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_creativeLibraryDetailFragment_to_creatorProfileFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("creatorId", this.f100446OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return this.f100446OooO00o.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionCreativeLibraryDetailFragmentToCreatorProfileFragment(creatorId="), this.f100446OooO00o, ")");
    }
}
