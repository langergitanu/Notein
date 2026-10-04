package o0Oo0o0o;

import android.os.Bundle;
import com.orion.notein.p607ui.export.ExportProgressDialogFragment;

/* JADX INFO: renamed from: o0Oo0o0o.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28258Oooo0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100126OooOo0o;

    public /* synthetic */ C28258Oooo0o0(Object obj, int i) {
        this.f100126OooOo0o = i;
        this.f100125OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f100126OooOo0o) {
            case 0:
                Bundle bundleRequireArguments = ((ExportProgressDialogFragment) this.f100125OooOo).requireArguments();
                kotlin.jvm.internal.OooOOO0.OooO0o(bundleRequireArguments, "requireArguments(...)");
                bundleRequireArguments.setClassLoader(C28259Oooo0oO.class.getClassLoader());
                if (!bundleRequireArguments.containsKey("no_progress")) {
                    throw new IllegalArgumentException("Required argument \"no_progress\" is missing and does not have an android:defaultValue");
                }
                boolean z = bundleRequireArguments.getBoolean("no_progress");
                if (bundleRequireArguments.containsKey("export_source")) {
                    return new C28259Oooo0oO(z, bundleRequireArguments.getInt("export_source"));
                }
                throw new IllegalArgumentException("Required argument \"export_source\" is missing and does not have an android:defaultValue");
            default:
                return kotlin.jvm.internal.OooO0OO.OooO0O0((Object[]) this.f100125OooOo);
        }
    }
}
