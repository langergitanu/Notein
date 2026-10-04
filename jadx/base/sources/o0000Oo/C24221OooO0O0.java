package o0000Oo;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.ViewOnClickListenerC21560Oooo0oo;

/* JADX INFO: renamed from: o0000Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24221OooO0O0 extends Filter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AbstractC24220OooO00o f81462OooO00o;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC21560Oooo0oo) this.f81462OooO00o).OooO0Oo((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorOooO0oo;
        ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo = (ViewOnClickListenerC21560Oooo0oo) this.f81462OooO00o;
        if (charSequence == null) {
            string = "";
        } else {
            viewOnClickListenerC21560Oooo0oo.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = viewOnClickListenerC21560Oooo0oo.f63071Oooo00O;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorOooO0oo = viewOnClickListenerC21560Oooo0oo.OooO0oo(viewOnClickListenerC21560Oooo0oo.f63072Oooo00o, string);
                if (cursorOooO0oo != null) {
                    cursorOooO0oo.getCount();
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorOooO0oo = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorOooO0oo != null) {
            filterResults.count = cursorOooO0oo.getCount();
            filterResults.values = cursorOooO0oo;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC24220OooO00o abstractC24220OooO00o = this.f81462OooO00o;
        Cursor cursor = abstractC24220OooO00o.f81456OooOoO0;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC21560Oooo0oo) abstractC24220OooO00o).OooO0OO((Cursor) obj);
    }
}
