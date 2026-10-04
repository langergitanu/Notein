package o0O0oo0O;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.OooO0OO;
import com.orion.editor.p600ui.contextmenu.textselect.p601vo.TextBasicStyleVO;
import com.orion.notein.global.R;
import o0O0o0oo.ViewOnClickListenerC26073OooO0O0;

/* JADX INFO: renamed from: o0O0oo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26211OooO0O0 extends AbstractC22050OooOo0o<TextBasicStyleVO, OooO00o> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26073OooO0O0 f89540OooO0O0;

    /* JADX INFO: renamed from: o0O0oo0O.OooO0O0$OooO00o */
    public static class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f89541OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f89542OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f89543OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f89544OooO0Oo;

        public OooO00o(View view, ViewOnClickListenerC26073OooO0O0 viewOnClickListenerC26073OooO0O0) {
            super(view);
            this.f89541OooO00o = view.findViewById(R.id.v_highlight_color);
            this.f89542OooO0O0 = view.findViewById(R.id.v_underline_color);
            this.f89543OooO0OO = (TextView) view.findViewById(R.id.tv_highlight_font);
            this.f89544OooO0Oo = (ImageView) view.findViewById(R.id.iv_clear);
            view.setOnClickListener(new ViewOnClickListenerC26210OooO00o(viewOnClickListenerC26073OooO0O0, 0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO00o oooO00o = (OooO00o) abstractC22078OooOooO;
        TextBasicStyleVO textBasicStyleVOOooO0OO = OooO0OO(i);
        oooO00o.itemView.setTag(textBasicStyleVOOooO0OO);
        boolean zIsEmpty = textBasicStyleVOOooO0OO.isEmpty();
        ImageView imageView = oooO00o.f89544OooO0Oo;
        View view = oooO00o.f89542OooO0O0;
        View view2 = oooO00o.f89541OooO00o;
        if (zIsEmpty) {
            view2.setVisibility(8);
            view.setVisibility(8);
            imageView.setVisibility(0);
            oooO00o.itemView.setSelected(false);
            return;
        }
        view2.setVisibility(0);
        view.setVisibility(0);
        imageView.setVisibility(8);
        int i2 = textBasicStyleVOOooO0OO.highlightColor;
        TextView textView = oooO00o.f89543OooO0OO;
        if (i2 == 0) {
            textView.setTextColor(oooO00o.itemView.getContext().getColor(R.color.editor_text_color));
        } else {
            textView.setTextColor(oooO00o.itemView.getContext().getColor(R.color.editor_text_color_black));
        }
        view2.setBackgroundTintList(ColorStateList.valueOf(textBasicStyleVOOooO0OO.highlightColor));
        view.setBackgroundColor(textBasicStyleVOOooO0OO.underlineColor);
        oooO00o.itemView.setSelected(textBasicStyleVOOooO0OO.isSelected);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new OooO00o(OooO0OO.OooO0O0(viewGroup, R.layout.item_text_highlight_style, viewGroup, false), this.f89540OooO0O0);
    }
}
