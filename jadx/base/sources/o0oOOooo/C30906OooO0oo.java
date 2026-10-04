package o0oOOooo;

import android.net.Uri;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO00o0.o000000O;
import o0OOo0o.C27538o00o0o0O;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOOooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0oOOooo/OooO0oo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30906OooO0oo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33769Ooooo0o f110469OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27538o00o0o0O f110470OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f110471OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f110472OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f110473OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33769Ooooo0o f110474OooO0oo;

    public C30906OooO0oo(C27538o00o0o0O stickerUseCase, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        OooOOO0.OooO0oO(stickerUseCase, "stickerUseCase");
        this.f110470OooO0Oo = stickerUseCase;
        this.f110472OooO0o0 = abstractApplicationC26277OooOoOO;
        this.f110471OooO0o = C33784o00ooo.OooO00o("");
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f110473OooO0oO = c33781o00o0OOooO00o;
        o000000O o000000o2 = new o000000O(c33781o00o0OOooO00o, this, 1);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f110474OooO0oo = C25252OooO0Oo.OooOoO0(o000000o2, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        Boolean bool = Boolean.FALSE;
        this.f110469OooO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o, C33784o00ooo.OooO00o(bool), new C30903OooO0o(3, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), bool);
    }

    public final void OooO0o0(List<? extends Uri> uris) {
        OooOOO0.OooO0oO(uris, "uris");
        C33781o00o0O c33781o00o0O = this.f110473OooO0oO;
        List list = (List) c33781o00o0O.getValue();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : uris) {
            if (!list.contains((Uri) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListOooooOO = OooOo.OooooOO(list2, arrayList);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, arrayListOooooOO);
    }
}
