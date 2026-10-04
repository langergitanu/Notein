package o0o0O0o;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00oO.C28038OooO0Oo;

/* JADX INFO: renamed from: o0o0O0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30293OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C30292OooO00o f107957OooO00o;

    public C30293OooO0O0(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sort_key_list);
        Context context = recyclerView.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        C30292OooO00o c30292OooO00o = C28038OooO0Oo.OooO0O0(context) ? new C30292OooO00o(R.layout.item_sort_key_in_bottom_sheet, false) : new C30292OooO00o(R.layout.item_sort_key_in_popup_window, true);
        this.f107957OooO00o = c30292OooO00o;
        recyclerView.setAdapter(c30292OooO00o);
    }
}
