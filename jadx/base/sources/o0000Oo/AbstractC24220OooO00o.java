package o0000Oo;

import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.appcompat.widget.ViewOnClickListenerC21560Oooo0oo;

/* JADX INFO: renamed from: o0000Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24220OooO00o extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f81453OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f81454OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f81455OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Cursor f81456OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C19606OooO00o f81457OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public C24221OooO0O0 f81458OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO0O0 f81459OooOoo0;

    /* JADX INFO: renamed from: o0000Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19606OooO00o extends ContentObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ViewOnClickListenerC21560Oooo0oo f81460OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19606OooO00o(ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo) {
            super(new Handler());
            this.f81460OooO00o = viewOnClickListenerC21560Oooo0oo;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo = this.f81460OooO00o;
            if (!viewOnClickListenerC21560Oooo0oo.f81453OooOo || (cursor = viewOnClickListenerC21560Oooo0oo.f81456OooOoO0) == null || cursor.isClosed()) {
                return;
            }
            viewOnClickListenerC21560Oooo0oo.f81454OooOo0o = viewOnClickListenerC21560Oooo0oo.f81456OooOoO0.requery();
        }
    }

    /* JADX INFO: renamed from: o0000Oo.OooO00o$OooO0O0 */
    public class OooO0O0 extends DataSetObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ViewOnClickListenerC21560Oooo0oo f81461OooO00o;

        public OooO0O0(ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo) {
            this.f81461OooO00o = viewOnClickListenerC21560Oooo0oo;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo = this.f81461OooO00o;
            viewOnClickListenerC21560Oooo0oo.f81454OooOo0o = true;
            viewOnClickListenerC21560Oooo0oo.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewOnClickListenerC21560Oooo0oo viewOnClickListenerC21560Oooo0oo = this.f81461OooO00o;
            viewOnClickListenerC21560Oooo0oo.f81454OooOo0o = false;
            viewOnClickListenerC21560Oooo0oo.notifyDataSetInvalidated();
        }
    }

    public abstract void OooO0O0(View view, Cursor cursor);

    public void OooO0OO(Cursor cursor) {
        Cursor cursor2 = this.f81456OooOoO0;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C19606OooO00o c19606OooO00o = this.f81457OooOoOO;
                if (c19606OooO00o != null) {
                    cursor2.unregisterContentObserver(c19606OooO00o);
                }
                OooO0O0 oooO0O0 = this.f81459OooOoo0;
                if (oooO0O0 != null) {
                    cursor2.unregisterDataSetObserver(oooO0O0);
                }
            }
            this.f81456OooOoO0 = cursor;
            if (cursor != null) {
                C19606OooO00o c19606OooO00o2 = this.f81457OooOoOO;
                if (c19606OooO00o2 != null) {
                    cursor.registerContentObserver(c19606OooO00o2);
                }
                OooO0O0 oooO0O02 = this.f81459OooOoo0;
                if (oooO0O02 != null) {
                    cursor.registerDataSetObserver(oooO0O02);
                }
                this.f81455OooOoO = cursor.getColumnIndexOrThrow("_id");
                this.f81454OooOo0o = true;
                notifyDataSetChanged();
            } else {
                this.f81455OooOoO = -1;
                this.f81454OooOo0o = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String OooO0Oo(Cursor cursor);

    public abstract View OooO0o0(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f81454OooOo0o || (cursor = this.f81456OooOoO0) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f81454OooOo0o) {
            return null;
        }
        this.f81456OooOoO0.moveToPosition(i);
        if (view == null) {
            AbstractC24222OooO0OO abstractC24222OooO0OO = (AbstractC24222OooO0OO) this;
            view = abstractC24222OooO0OO.f81465Oooo000.inflate(abstractC24222OooO0OO.f81464OooOooo, viewGroup, false);
        }
        OooO0O0(view, this.f81456OooOoO0);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f81458OooOoo == null) {
            C24221OooO0O0 c24221OooO0O0 = new C24221OooO0O0();
            c24221OooO0O0.f81462OooO00o = this;
            this.f81458OooOoo = c24221OooO0O0;
        }
        return this.f81458OooOoo;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f81454OooOo0o || (cursor = this.f81456OooOoO0) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f81456OooOoO0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f81454OooOo0o && (cursor = this.f81456OooOoO0) != null && cursor.moveToPosition(i)) {
            return this.f81456OooOoO0.getLong(this.f81455OooOoO);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f81454OooOo0o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f81456OooOoO0.moveToPosition(i)) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = OooO0o0(viewGroup);
        }
        OooO0O0(view, this.f81456OooOoO0);
        return view;
    }
}
