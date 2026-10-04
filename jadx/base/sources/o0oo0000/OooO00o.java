package o0oo0000;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends RecyclerView.AbstractC22062OooO0oO<C20162OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f111217OooO00o;

    /* JADX INFO: renamed from: o0oo0000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20162OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f111218OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f111219OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f111220OooO0OO;

        public C20162OooO00o(View view) {
            super(view);
            this.f111218OooO00o = (ImageView) view.findViewById(R.id.iv_banner);
            this.f111219OooO0O0 = (TextView) view.findViewById(R.id.tv_title);
            this.f111220OooO0OO = (TextView) view.findViewById(R.id.tv_description);
        }
    }

    public OooO00o(List<String> list) {
        this.f111217OooO00o = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f111217OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C20162OooO00o holder = (C20162OooO00o) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        String contentType = this.f111217OooO00o.get(i);
        OooOOO0.OooO0oO(contentType, "contentType");
        Context context = holder.itemView.getContext();
        int iHashCode = contentType.hashCode();
        TextView textView = holder.f111220OooO0OO;
        TextView textView2 = holder.f111219OooO0O0;
        ImageView imageView = holder.f111218OooO00o;
        if (iHashCode != -900674644) {
            if (iHashCode != -649662132) {
                if (iHashCode == 113399775 && contentType.equals("write")) {
                    imageView.setImageResource(R.drawable.bg_setup_wizard_banner_1);
                    imageView.setBackgroundColor(context.getColor(R.color.bg_setup_wizard_banner_color_1));
                    textView2.setText(context.getString(R.string.title_setup_wizard_1));
                    textView.setText(context.getString(R.string.content_setup_wizard_1));
                }
            } else if (contentType.equals("annotate")) {
                imageView.setImageResource(R.drawable.bg_setup_wizard_banner_3);
                imageView.setBackgroundColor(context.getColor(R.color.bg_setup_wizard_banner_color_3));
                textView2.setText(context.getString(R.string.title_setup_wizard_3));
                textView.setText(context.getString(R.string.content_setup_wizard_3));
            }
        } else if (contentType.equals("sketch")) {
            imageView.setImageResource(R.drawable.bg_setup_wizard_banner_2);
            imageView.setBackgroundColor(context.getColor(R.color.bg_setup_wizard_banner_color_2));
            textView2.setText(context.getString(R.string.title_setup_wizard_2));
            textView.setText(context.getString(R.string.content_setup_wizard_2));
        }
        if (holder.itemView.getResources().getConfiguration().screenHeightDp >= 1024) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = o000000O.OooO0o(120);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = o000000O.OooO0o(60);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
        OooOOO0.OooO0o0(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = o000000O.OooO0o(20);
        ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
        OooOOO0.OooO0o0(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = o000000O.OooO0o(16);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_wizard_page, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new C20162OooO00o(viewOooO0OO);
    }
}
