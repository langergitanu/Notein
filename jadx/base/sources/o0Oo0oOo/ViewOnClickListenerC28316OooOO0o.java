package o0Oo0oOo;

import android.view.View;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o0OoOOoO.C29192OooO0o0;
import o0oOOooO.C30897OooOOoo;
import o0oOOooO.C30898OooOo00;
import o0oOoOo.C31079OoooOoO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0oOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28316OooOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100434OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100435OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28316OooOO0o(Object obj, int i) {
        this.f100435OooOo0o = i;
        this.f100434OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100434OooOo;
        switch (this.f100435OooOo0o) {
            case 0:
                ((C28315OooOO0O) obj).invoke();
                break;
            case 1:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) ((C29192OooO0o0) obj).f103527OooO0O0.f88129OooO00o;
                Set set = (Set) baseToolbarChildFragment.Oooo0oO().f110442OooOOO0.getValue();
                List list = (List) baseToolbarChildFragment.Oooo0oO().f110445OooOOo.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (true) {
                    Object obj2 = null;
                    if (!it.hasNext()) {
                        if (!arrayList.isEmpty()) {
                            C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c30898OooOo00Oooo0oO);
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30897OooOOoo(c30898OooOo00Oooo0oO, arrayList, null), 2);
                            baseToolbarChildFragment.OooooOO(26, arrayList);
                        }
                        break;
                    } else {
                        String str = (String) it.next();
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C31079OoooOoO) next).f110917OooO00o, str)) {
                                    obj2 = next;
                                }
                            }
                        }
                        C31079OoooOoO c31079OoooOoO = (C31079OoooOoO) obj2;
                        if (c31079OoooOoO != null) {
                            arrayList.add(c31079OoooOoO);
                        }
                    }
                }
                break;
            default:
                ((TrashBinContainerFragment) obj).OooOoOO().OooOOo0(1);
                break;
        }
    }
}
