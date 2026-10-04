package o0Oo0oOo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0oOo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28339Oooo00O implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100475OooO00o;

    public C28339Oooo00O(String materialId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
        this.f100475OooO00o = materialId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28339Oooo00O) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100475OooO00o, ((C28339Oooo00O) obj).f100475OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57924xc88a4ff7;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("materialId", this.f100475OooO00o);
        bundle.putString("source", null);
        return bundle;
    }

    public final int hashCode() {
        return this.f100475OooO00o.hashCode() * 31;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionCreativeLibraryListFragmentToCreativeLibraryDetailFragment(materialId="), this.f100475OooO00o, ", source=null)");
    }
}
