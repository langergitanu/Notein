package o0O0oO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.text.DecimalFormat;
import o0O0oO0o.OooOOOO;
import o0O0oOO0.C26116OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO extends AbstractC22050OooOo0o<C26116OooO0Oo, OooO00o> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOOO f89081OooO0O0;

    public static class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f89082OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f89083OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f89084OooO0OO;

        public OooO00o(View view, OooOOOO oooOOOO) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.btn_delete);
            this.f89082OooO00o = viewFindViewById;
            this.f89083OooO0O0 = (TextView) view.findViewById(R.id.zoom_desc);
            this.f89084OooO0OO = (ImageView) view.findViewById(R.id.iv_selected);
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC26091OooO00o(oooOOOO, 0));
            view.setOnClickListener(new OooO0O0(oooOOOO, 0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO00o oooO00o = (OooO00o) abstractC22078OooOooO;
        C26116OooO0Oo c26116OooO0OoOooO0OO = OooO0OO(i);
        oooO00o.itemView.setTag(c26116OooO0OoOooO0OO);
        oooO00o.f89082OooO00o.setTag(c26116OooO0OoOooO0OO);
        oooO00o.itemView.setSelected(c26116OooO0OoOooO0OO.f89157OooO0OO);
        boolean z = c26116OooO0OoOooO0OO.f89157OooO0OO;
        ImageView imageView = oooO00o.f89084OooO0OO;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        oooO00o.f89083OooO0O0.setText(new DecimalFormat("0%").format(c26116OooO0OoOooO0OO.f89156OooO0O0));
        oooO00o.itemView.setEnabled(!c26116OooO0OoOooO0OO.f89158OooO0Oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OooO00o(com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(viewGroup, R.layout.item_favorite_zoom, viewGroup, false), this.f89081OooO0O0);
    }
}
