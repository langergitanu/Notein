package o0Oo0oOo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes10.dex */
public final class o0Oo0oo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100606OooO00o;

    public o0Oo0oo(String materialId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
        this.f100606OooO00o = materialId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0Oo0oo) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100606OooO00o, ((o0Oo0oo) obj).f100606OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57930xdfefdc63;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("materialId", this.f100606OooO00o);
        bundle.putString("source", null);
        return bundle;
    }

    public final int hashCode() {
        return this.f100606OooO00o.hashCode() * 31;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionDownloadedMaterialListFragmentToCreativeLibraryDetailFragment(materialId="), this.f100606OooO00o, ", source=null)");
    }
}
