package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import o0oOoOoo.C31102OooO00o;
import o0oOoOoo.C31103OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00oO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100595OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100596OooOo0o;

    public /* synthetic */ o00oO0O(Fragment fragment, int i) {
        this.f100596OooOo0o = i;
        this.f100595OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(final View view) {
        switch (this.f100596OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((DownloadedMaterialListFragment) this.f100595OooOo).OooOOOo();
                return;
            case 1:
                C21030OooOO0o.OooO0OO((FirebaseUserModifyPasswordFragment) this.f100595OooOo).OooOOo0();
                return;
            default:
                final LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = (LatestOpenedNoteTabFragment) this.f100595OooOo;
                C31102OooO00o c31102OooO00o = latestOpenedNoteTabFragment.f74475Oooo00o;
                if (c31102OooO00o != null) {
                    c31102OooO00o.OooO00o();
                }
                Object tag = view.getTag();
                final C31103OooO0O0 c31103OooO0O0 = tag instanceof C31103OooO0O0 ? (C31103OooO0O0) tag : null;
                if (c31103OooO0O0 != null) {
                    LockNoteFragment lockNoteFragmentOooOoo = latestOpenedNoteTabFragment.OooOoo();
                    androidx.lifecycle.OooOo oooOo = latestOpenedNoteTabFragment.f74472Oooo0;
                    if (oooOo != null) {
                        LockNoteFragment.OooOoo(lockNoteFragmentOooOoo, oooOo, com.facebook.soloader.OooOo.OooO0oO(c31103OooO0O0.f110999OooO00o), new oO0O000o.OooO00o() { // from class: o0OoOoo0.OooO0oO
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                int id = view.getId();
                                C31103OooO0O0 c31103OooO0O02 = c31103OooO0O0;
                                LatestOpenedNoteTabFragment latestOpenedNoteTabFragment2 = latestOpenedNoteTabFragment;
                                String str = c31103OooO0O02.f110999OooO00o;
                                switch (id) {
                                    case R.id.item_close /* 2131297859 */:
                                        androidx.lifecycle.OooOo oooOo2 = latestOpenedNoteTabFragment2.f74472Oooo0;
                                        if (oooOo2 == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("lifecycleScope");
                                            throw null;
                                        }
                                        C33609OooO0oo.OooO0OO(oooOo2, null, null, new C29237OooOOO(latestOpenedNoteTabFragment2, c31103OooO0O02, null), 3);
                                        break;
                                        break;
                                    case R.id.item_split_h /* 2131297901 */:
                                        latestOpenedNoteTabFragment2.OooOoOO().OooOo0O(str, "", new PointF(0.0f, 0.0f), null, false);
                                        break;
                                    case R.id.item_split_v /* 2131297902 */:
                                        latestOpenedNoteTabFragment2.OooOoOO().OooOo(str, "", new PointF(0.0f, 0.0f), null, false);
                                        break;
                                    case R.id.item_switch_note /* 2131297905 */:
                                        latestOpenedNoteTabFragment2.OooOoOO().OoooO00();
                                        break;
                                    case R.id.item_switch_orientation /* 2131297906 */:
                                        latestOpenedNoteTabFragment2.OooOoOO().Oooo();
                                        break;
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("lifecycleScope");
                        throw null;
                    }
                }
                return;
        }
    }
}
