package o0o0O0oo;

import android.view.View;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OoO000.ViewOnClickListenerC28566Ooooo0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0o0O0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30361OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f108299OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28566Ooooo0o f108300OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f108301OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Integer> f108302OooO0Oo;

    public C30361OooO0O0(View view, ViewOnClickListenerC28566Ooooo0o viewOnClickListenerC28566Ooooo0o) {
        this.f108299OooO00o = view;
        this.f108300OooO0O0 = viewOnClickListenerC28566Ooooo0o;
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_recover), Integer.valueOf(R.id.item_delete));
        this.f108302OooO0Oo = listOooOO0o;
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = this.f108299OooO00o.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(this.f108300OooO0O0);
            arrayList.add(viewFindViewById);
        }
        this.f108301OooO0OO = arrayList;
    }
}
