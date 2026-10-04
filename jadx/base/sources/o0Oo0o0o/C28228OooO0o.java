package o0Oo0o0o;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0o0o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28228OooO0o implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f100064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f100065OooO0OO;

    public C28228OooO0o(String str, String str2, String str3) {
        this.f100063OooO00o = str;
        this.f100064OooO0O0 = str2;
        this.f100065OooO0OO = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28228OooO0o)) {
            return false;
        }
        C28228OooO0o c28228OooO0o = (C28228OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100063OooO00o, c28228OooO0o.f100063OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100064OooO0O0, c28228OooO0o.f100064OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100065OooO0OO, c28228OooO0o.f100065OooO0OO);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_addWaterMarkFragment_to_editWaterMarkDialog;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", this.f100063OooO00o);
        bundle.putString("dialog_hint", this.f100064OooO0O0);
        bundle.putString("dialog_text", this.f100065OooO0OO);
        return bundle;
    }

    public final int hashCode() {
        int iHashCode = this.f100063OooO00o.hashCode() * 31;
        String str = this.f100064OooO0O0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f100065OooO0OO;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionAddWaterMarkFragmentToEditWaterMarkDialog(dialogTitle=");
        sb.append(this.f100063OooO00o);
        sb.append(", dialogHint=");
        sb.append(this.f100064OooO0O0);
        sb.append(", dialogText=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f100065OooO0OO, ")");
    }
}
