package o0o00oO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.orion.notein.global.R;
import java.util.List;

/* JADX INFO: renamed from: o0o00oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29962OooO0oo extends ArrayAdapter<C29954OooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LayoutInflater f106423OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29962OooO0oo(Context context, List<C29954OooO> list) {
        super(context, 0, list);
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(layoutInflaterFrom, "from(...)");
        this.f106423OooOo0o = layoutInflaterFrom;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup parent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        if (view == null) {
            view = this.f106423OooOo0o.inflate(R.layout.item_language, parent, false);
        }
        C29954OooO item = getItem(i);
        if (item != null) {
            TextView textView = (TextView) view.findViewById(R.id.language);
            ImageView imageView = (ImageView) view.findViewById(R.id.selected_icon);
            int i2 = item.f106400OooO00o;
            if (i2 == 0) {
                textView.setText("");
            } else {
                textView.setText(getContext().getString(i2));
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView);
            boolean z = item.f106401OooO0O0;
            imageView.setVisibility(z ? 0 : 8);
            view.setSelected(z);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup parent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        if (view == null) {
            view = this.f106423OooOo0o.inflate(R.layout.item_selected_language, parent, false);
        }
        C29954OooO item = getItem(i);
        if (item != null) {
            TextView textView = (TextView) view.findViewById(R.id.language);
            int i2 = item.f106400OooO00o;
            if (i2 == 0) {
                textView.setText("");
            } else {
                textView.setText(getContext().getString(i2));
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
        return view;
    }
}
