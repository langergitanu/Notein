package o0OoOO;

import android.view.View;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OoO0oo.ViewOnClickListenerC28700OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28986OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f102719OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnClickListenerC28700OooOOo f102720OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Integer> f102721OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f102722OooO0Oo;

    public C28986OooO0O0(View view, ViewOnClickListenerC28700OooOOo viewOnClickListenerC28700OooOOo) {
        this.f102719OooO00o = view;
        this.f102720OooO0O0 = viewOnClickListenerC28700OooOOo;
        List<Integer> listOooOO0o = C34429OooOOo0.OooOO0o(Integer.valueOf(R.id.item_rename), Integer.valueOf(R.id.item_delete));
        this.f102721OooO0OO = listOooOO0o;
        List<Integer> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            View viewFindViewById = this.f102719OooO00o.findViewById(((Number) it.next()).intValue());
            viewFindViewById.setOnClickListener(this.f102720OooO0O0);
            arrayList.add(viewFindViewById);
        }
        this.f102722OooO0Oo = arrayList;
    }
}
