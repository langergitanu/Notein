package o0o0OO0o;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0ooO.ViewOnClickListenerC28415OooOO0;
import o0OoO000.ViewOnClickListenerC28588o0000o0o;
import o0o0OOO0.C30543OooO00o;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0o0OO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30453OooO0O0 extends AbstractC22050OooOo0o<C30543OooO00o, C20075OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28588o0000o0o f108745OooO0O0;

    /* JADX INFO: renamed from: o0o0OO0o.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C30543OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f108746OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C30543OooO00o c30543OooO00o, C30543OooO00o c30543OooO00o2) {
            return c30543OooO00o.equals(c30543OooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C30543OooO00o c30543OooO00o, C30543OooO00o c30543OooO00o2) {
            return c30543OooO00o == c30543OooO00o2;
        }
    }

    /* JADX INFO: renamed from: o0o0OO0o.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public final class C20075OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f108747OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f108748OooO0O0;

        public C20075OooO0O0(C30453OooO0O0 c30453OooO0O0, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.btn_operation);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f108747OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.iv_operation);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f108748OooO0O0 = (ImageView) viewFindViewById2;
            view.setOnClickListener(new ViewOnClickListenerC28415OooOO0(c30453OooO0O0, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C32443OooOOO c32443OooOOO;
        C32443OooOOO c32443OooOOO2;
        C20075OooO0O0 holder = (C20075OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C30543OooO00o c30543OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c30543OooO00oOooO0OO);
        holder.itemView.setTag(c30543OooO00oOooO0OO);
        TextView textView = holder.f108747OooO00o;
        Context context = textView.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        switch (c30543OooO00oOooO0OO.f109252OooO00o) {
            case 0:
                String string = context.getString(R.string.save_as);
                OooOOO0.OooO0o(string, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string, Integer.valueOf(R.drawable.ic_ni_backup_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            case 1:
                String string2 = context.getString(R.string.copy_and_move);
                OooOOO0.OooO0o(string2, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string2, Integer.valueOf(R.drawable.ic_ni_copy_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            case 2:
                String string3 = context.getString(R.string.paste);
                OooOOO0.OooO0o(string3, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string3, Integer.valueOf(R.drawable.ic_ni_paste_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            case 3:
                String string4 = context.getString(R.string.export_and_share_slash);
                OooOOO0.OooO0o(string4, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string4, Integer.valueOf(R.drawable.ic_ni_export_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            case 4:
                String string5 = context.getString(R.string.duplicate_pages);
                OooOOO0.OooO0o(string5, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string5, Integer.valueOf(R.drawable.ic_ni_duplicate_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            case 5:
                String string6 = context.getString(R.string.cut);
                OooOOO0.OooO0o(string6, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string6, Integer.valueOf(R.drawable.ic_ni_move_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            case 6:
                String string7 = context.getString(R.string.delete);
                OooOOO0.OooO0o(string7, "getString(...)");
                c32443OooOOO = new C32443OooOOO(string7, Integer.valueOf(R.drawable.ic_ni_trash_selector));
                c32443OooOOO2 = c32443OooOOO;
                break;
            default:
                c32443OooOOO2 = new C32443OooOOO("Unknown", 0);
                break;
        }
        String str = (String) c32443OooOOO2.f116638OooOo0o;
        int iIntValue = ((Number) c32443OooOOO2.f116637OooOo).intValue();
        textView.setText(str);
        ImageView imageView = holder.f108748OooO0O0;
        imageView.setImageResource(iIntValue);
        boolean z = c30543OooO00oOooO0OO.f109254OooO0OO;
        textView.setEnabled(z);
        imageView.setEnabled(z);
        if (!c30543OooO00oOooO0OO.f109253OooO0O0) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(textView.getContext(), R.drawable.ic_ni_vip_12_selector), (Drawable) null);
            textView.setCompoundDrawablePadding(o000000O.OooO0o(4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_page_operation, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new C20075OooO0O0(this, viewOooO0OO);
    }
}
