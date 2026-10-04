package o0OooooO;

import android.view.View;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0Oo0o0o.ViewOnClickListenerC28239OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OooooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29717OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f105363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28239OooOOo f105364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f105365OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Integer> f105366OooO0Oo;

    public C29717OooO00o(View view, ViewOnClickListenerC28239OooOOo viewOnClickListenerC28239OooOOo) {
        this.f105363OooO00o = view;
        this.f105364OooO0O0 = viewOnClickListenerC28239OooOOo;
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_add_outline), Integer.valueOf(R.id.item_add_comment), Integer.valueOf(R.id.item_copy), Integer.valueOf(R.id.item_delete), Integer.valueOf(R.id.item_export), Integer.valueOf(R.id.item_add_label));
        this.f105366OooO0Oo = listOooOO0o;
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = this.f105363OooO00o.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(this.f105364OooO0O0);
            arrayList.add(viewFindViewById);
        }
        this.f105365OooO0OO = arrayList;
    }
}
