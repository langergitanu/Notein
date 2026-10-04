package o0Oo0o0o;

import android.os.Bundle;
import com.orion.notein.p607ui.BaseDialogFragment;
import com.orion.notein.p607ui.export.C23108OooO0o0;
import com.orion.notein.p607ui.export.ExportDialogFragment;

/* JADX INFO: renamed from: o0Oo0o0o.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28249OooOoo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseDialogFragment f100103OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100104OooOo0o;

    public /* synthetic */ C28249OooOoo0(BaseDialogFragment baseDialogFragment, int i) {
        this.f100104OooOo0o = i;
        this.f100103OooOo = baseDialogFragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f100104OooOo0o) {
            case 0:
                Bundle bundleRequireArguments = ((ExportDialogFragment) this.f100103OooOo).requireArguments();
                kotlin.jvm.internal.OooOOO0.OooO0o(bundleRequireArguments, "requireArguments(...)");
                return C23108OooO0o0.OooO00o.OooO00o(bundleRequireArguments);
            default:
                this.f100103OooOo.OooOoO0();
                return Boolean.TRUE;
        }
    }
}
