package o0OoooO0;

import android.view.View;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26051OoooOOo;
import o0Oo0O0.C28050OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29631OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f105061OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC26051OoooOOo f105062OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f105063OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Integer> f105064OooO0Oo;

    public C29631OooO0O0(View view, ViewOnClickListenerC26051OoooOOo viewOnClickListenerC26051OoooOOo) {
        this.f105061OooO00o = view;
        this.f105062OooO0O0 = viewOnClickListenerC26051OoooOOo;
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_merge_layers), Integer.valueOf(R.id.item_merge_visible_layers), Integer.valueOf(R.id.item_rename_layer), Integer.valueOf(R.id.item_delete_layer));
        this.f105064OooO0Oo = listOooOO0o;
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            final View viewFindViewById = this.f105061OooO00o.findViewById(((Number) it.next()).intValue());
            OooOOO0.OooO0Oo(viewFindViewById);
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, new View.OnClickListener() { // from class: o0OoooO0.OooO00o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ViewOnClickListenerC26051OoooOOo viewOnClickListenerC26051OoooOOo2 = this.f105060OooOo0o.f105062OooO0O0;
                    if (viewOnClickListenerC26051OoooOOo2 != null) {
                        viewOnClickListenerC26051OoooOOo2.onClick(viewFindViewById);
                    }
                }
            });
            arrayList.add(viewFindViewById);
        }
        this.f105063OooO0OO = arrayList;
    }
}
