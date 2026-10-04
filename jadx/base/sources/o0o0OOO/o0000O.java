package o0o0OOO;

import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0000O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f109097OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109098OooOo0o;

    public /* synthetic */ o0000O(Object obj, int i) {
        this.f109098OooOo0o = i;
        this.f109097OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f109098OooOo0o) {
            case 0:
                StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) this.f109097OooOo;
                standardTemplateFragment.OooOooo().OooOoO(true);
                standardTemplateFragment.OooOooo().OooOo0O(PaperOrientation.VERTICAL);
                return C32460OooOooO.f116667OooO00o;
            default:
                return ((InterfaceC34606OooOOOo) ((List) this.f109097OooOo).get(0)).OooO0O0();
        }
    }
}
