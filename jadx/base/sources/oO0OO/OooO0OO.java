package oO0OO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends ArrayAdapter<C32879OooO0Oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LayoutInflater f117991OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(Context context, List<C32879OooO0Oo> list) {
        super(context, 0, list);
        OooOOO0.OooO0oO(list, "list");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        OooOOO0.OooO0o(layoutInflaterFrom, "from(...)");
        this.f117991OooOo0o = layoutInflaterFrom;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup parent) {
        OooOOO0.OooO0oO(parent, "parent");
        if (view == null) {
            view = this.f117991OooOo0o.inflate(R.layout.item_language_of_text_recognize, parent, false);
        }
        C32879OooO0Oo item = getItem(i);
        if (item != null) {
            TextView textView = (TextView) view.findViewById(R.id.language);
            ImageView imageView = (ImageView) view.findViewById(R.id.selected_icon);
            textView.setText(view.getContext().getString(item.f117992OooO00o));
            OooOOO0.OooO0Oo(imageView);
            boolean z = item.f117993OooO0O0;
            imageView.setVisibility(z ? 0 : 8);
            view.setSelected(z);
        }
        OooOOO0.OooO0Oo(view);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup parent) {
        OooOOO0.OooO0oO(parent, "parent");
        if (view == null) {
            view = this.f117991OooOo0o.inflate(R.layout.item_selected_language_of_aiocr, parent, false);
        }
        C32879OooO0Oo item = getItem(i);
        if (item != null) {
            ((TextView) view.findViewById(R.id.language)).setText(view.getContext().getString(item.f117992OooO00o));
        }
        OooOOO0.OooO0Oo(view);
        return view;
    }
}
