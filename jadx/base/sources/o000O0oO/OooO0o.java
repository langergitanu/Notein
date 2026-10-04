package o000O0oO;

import androidx.ink.authoring.InProgressStrokesView;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.export.C23110OooO0oo;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.ui.notelist.label.LabelContainerFragment.OooO0O0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OOo0o.C27377o00000Oo;
import o0oo0Oo.C31243OooO0o;
import oO00OoO0.C32285OooO0o0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82419OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82420OooOo0o;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f82420OooOo0o = i;
        this.f82419OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82420OooOo0o) {
            case 0:
                InProgressStrokesView inProgressStrokesView = (InProgressStrokesView) this.f82419OooOo;
                inProgressStrokesView.f65173OooOo0o.getStrokePaintAnimator$ink_authoring();
                return new OooOO0O(new C24412OooO0oO(inProgressStrokesView, 0));
            case 1:
                return C32285OooO0o0.OooO0O0(((C27377o00000Oo) this.f82419OooOo).f95378OooO00o);
            case 2:
                List<Integer> list = AddWaterMarkFragment.f71503Oooo000;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    AddWaterMarkFragment addWaterMarkFragment = (AddWaterMarkFragment) this.f82419OooOo;
                    if (!zHasNext) {
                        return new C23110OooO0oo(OooOo.o0ooOO0(arrayList), new WeakReference(addWaterMarkFragment));
                    }
                    arrayList.add(addWaterMarkFragment.requireContext().getString(((Number) it.next()).intValue()));
                }
                break;
            case 3:
                ((oO0O000o.OooO00o) this.f82419OooOo).invoke();
                return C32460OooOooO.f116667OooO00o;
            case 4:
                LabelContainerFragment labelContainerFragment = (LabelContainerFragment) this.f82419OooOo;
                return labelContainerFragment.new OooO0O0(labelContainerFragment.OooOoo());
            default:
                return Double.valueOf(C31243OooO0o.OooOOo0(((C31243OooO0o) this.f82419OooOo).f111451OooOOo, "speed_correct"));
        }
    }
}
