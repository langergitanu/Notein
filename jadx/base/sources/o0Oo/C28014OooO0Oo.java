package o0Oo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.LocaleCountryCode;
import com.orion.notein.p607ui.login.countrycode.CountryCodeSelectDialogFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.Iterator;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28014OooO0Oo implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99351OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99352OooOo0o;

    public /* synthetic */ C28014OooO0Oo(Object obj, int i) {
        this.f99352OooOo0o = i;
        this.f99351OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        C28011OooO00o c28011OooO00o;
        switch (this.f99352OooOo0o) {
            case 0:
                CountryCodeSelectDialogFragment countryCodeSelectDialogFragment = (CountryCodeSelectDialogFragment) this.f99351OooOo;
                ((Integer) obj).intValue();
                String s = (String) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(s, "s");
                try {
                    c28011OooO00o = countryCodeSelectDialogFragment.f72138Oooo00O;
                } catch (Exception unused) {
                }
                if (c28011OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                    throw null;
                }
                List<T> list = c28011OooO00o.f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((LocaleCountryCode) it.next()).getLetter(), s)) {
                        i++;
                    }
                }
                RecyclerView recyclerView = countryCodeSelectDialogFragment.f72137Oooo000;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvCountryCode");
                    throw null;
                }
                RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i - 1, 0);
                return C32460OooOooO.f116667OooO00o;
            default:
                return Integer.valueOf(((com.orion.notein.p607ui.p609vo.OooO00o) this.f99351OooOo).f80099OooOo.invoke(((NoteVO) obj).mapToSortVO(), ((NoteVO) obj2).mapToSortVO()).intValue());
        }
    }
}
