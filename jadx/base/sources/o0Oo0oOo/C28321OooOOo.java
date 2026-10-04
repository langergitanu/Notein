package o0Oo0oOo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0oOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28321OooOOo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100443OooO00o;

    public C28321OooOOo(String materialId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
        this.f100443OooO00o = materialId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28321OooOOo) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100443OooO00o, ((C28321OooOOo) obj).f100443OooO00o);
        }
        return false;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_creativeLibraryDetailFragment_self;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("materialId", this.f100443OooO00o);
        bundle.putString("source", null);
        return bundle;
    }

    public final int hashCode() {
        return this.f100443OooO00o.hashCode() * 31;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("ActionCreativeLibraryDetailFragmentSelf(materialId="), this.f100443OooO00o, ", source=null)");
    }
}
