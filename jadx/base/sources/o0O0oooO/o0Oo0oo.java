package o0O0oooO;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.PopupAdFragment;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.LayerRenameDialogFragment;
import com.orion.notein.p607ui.notelist.recent.RecentFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o0OoO0.C28522OooOo0O;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOOo.C29108OooOOo;
import o0OoOOOo.InterfaceC29094OooO0O0;
import o0o00OOo.C29891OooO0o0;
import o0o00OOo.RunnableC29889OooO0Oo;
import o0oOoOo.C31089Ooooooo;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0Oo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90446OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90447OooOo0o;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f90447OooOo0o = i;
        this.f90446OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC29094OooO0O0 interfaceC29094OooO0O0;
        Editable text;
        switch (this.f90447OooOo0o) {
            case 0:
                ((PopupAdFragment) this.f90446OooOo).dismiss();
                return;
            case 1:
                ((ExportDialogFragment) this.f90446OooOo).Oooo0OO().OooOO0(1);
                return;
            case 2:
                C28522OooOo0O c28522OooOo0OOooOooo = ((PasswordLoginFragment) this.f90446OooOo).OooOooo();
                o0OoO0.OooOO0O oooOO0O = (o0OoO0.OooOO0O) c28522OooOo0OOooOooo.f101119OooO0oo.getValue();
                if (!oooOO0O.f101093OooO || oooOO0O.f101101OooO0oo) {
                    return;
                }
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c28522OooOo0OOooOooo), null, null, new com.orion.notein.p607ui.login.password.OooO0OO(c28522OooOo0OOooOooo, null), 3);
                return;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextStyleVO");
                C31089Ooooooo c31089Ooooooo = (C31089Ooooooo) tag;
                boolean z = c31089Ooooooo.f110963OooO0O0;
                boolean z2 = !z;
                C29108OooOOo c29108OooOOo = (C29108OooOOo) this.f90446OooOo;
                C29051OooOO0o c29051OooOO0o = c29108OooOOo.f103152OooOO0o;
                if (c29051OooOO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                List<C31089Ooooooo> list = (List) c29051OooOO0o.f102908OooOOo0.f121747OooOo0o.getValue();
                int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                for (C31089Ooooooo c31089Ooooooo2 : list) {
                    linkedHashMap.put(Integer.valueOf(c31089Ooooooo2.f110962OooO00o), Boolean.valueOf(c31089Ooooooo2.f110963OooO0O0));
                }
                LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(linkedHashMap);
                int i = c31089Ooooooo.f110962OooO00o;
                Integer numValueOf = Integer.valueOf(i);
                Set<Integer> set = C29108OooOOo.f103140OooOOo0;
                boolean z3 = true;
                if (!set.contains(numValueOf)) {
                    Integer numValueOf2 = Integer.valueOf(i);
                    Set<Integer> set2 = C29108OooOOo.f103139OooOOOo;
                    if (set2.contains(numValueOf2)) {
                        if (z) {
                            linkedHashMapOooOOOO.put(Integer.valueOf(i), Boolean.valueOf(z2));
                        } else {
                            Iterator<T> it = set2.iterator();
                            while (it.hasNext()) {
                                int iIntValue = ((Number) it.next()).intValue();
                                linkedHashMapOooOOOO.put(Integer.valueOf(iIntValue), Boolean.valueOf(iIntValue == i));
                            }
                        }
                    } else if (i != 6 && i != 5) {
                        linkedHashMapOooOOOO.put(Integer.valueOf(i), Boolean.valueOf(z2));
                    }
                } else if (z) {
                    z3 = false;
                } else {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        int iIntValue2 = ((Number) it2.next()).intValue();
                        linkedHashMapOooOOOO.put(Integer.valueOf(iIntValue2), Boolean.valueOf(iIntValue2 == i));
                    }
                }
                C29051OooOO0o c29051OooOO0o2 = c29108OooOOo.f103152OooOO0o;
                if (c29051OooOO0o2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                c29051OooOO0o2.OooOOOO(linkedHashMapOooOOOO);
                if (!z3 || (interfaceC29094OooO0O0 = c29108OooOOo.f103142OooO00o) == null) {
                    return;
                }
                interfaceC29094OooO0O0.OooO00o(i, z2);
                return;
            case 4:
                EditText editText = ((LayerRenameDialogFragment) this.f90446OooOo).f74741Oooo0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 5:
                final C29891OooO0o0 c29891OooO0o0 = (C29891OooO0o0) this.f90446OooOo;
                float width = c29891OooO0o0.f106038OooO0OO.getWidth();
                View view2 = c29891OooO0o0.f106039OooO0Oo;
                view2.setTranslationX(width);
                view2.animate().translationX(0.0f).withStartAction(new Runnable() { // from class: o0o00OOo.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        c29891OooO0o0.f106039OooO0Oo.setVisibility(0);
                    }
                }).withEndAction(new RunnableC29889OooO0Oo(c29891OooO0o0, 0));
                return;
            case 6:
                EditText editText2 = (EditText) this.f90446OooOo;
                if (editText2 == null || (text = editText2.getText()) == null) {
                    return;
                }
                text.clear();
                return;
            default:
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ((RecentFragment) this.f90446OooOo).requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
                ((MainActivity) activityC21897OooOo0RequireActivity).openDrawer();
                return;
        }
    }
}
