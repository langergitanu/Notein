package o0Oo;

import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.login.countrycode.CountryCodeSelectDialogFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28016OooO0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99353OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99354OooOo0o;

    public /* synthetic */ C28016OooO0o0(Fragment fragment, int i) {
        this.f99354OooOo0o = i;
        this.f99353OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f99354OooOo0o) {
            case 0:
                return ((CountryCodeSelectDialogFragment) this.f99353OooOo).getResources().getConfiguration().getLocales().get(0);
            default:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f99353OooOo;
                penBarChildFragment.f75310o0O0O00 = false;
                penBarChildFragment.Oooooo0();
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
