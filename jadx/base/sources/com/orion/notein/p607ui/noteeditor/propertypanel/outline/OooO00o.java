package com.orion.notein.p607ui.noteeditor.propertypanel.outline;

import OooOoo.C20593OooO0Oo;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.o000000O;
import o0Oo00o.C28025OooO0O0;
import o0Oo0oO0.ViewOnClickListenerC28291OooO0OO;
import o0OoO000.ViewOnClickListenerC28523OooO00o;
import o0OoO000.ViewOnClickListenerC28529OooOO0o;
import o0OoO0oo.RunnableC28761o0000O0O;
import o0oo000O.C31183OooO00o;
import oOO00oo.C34406OooO00o;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC22050OooOo0o<OutlineVO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28523OooO00o f75877OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f75878OooO0OO;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19370OooO00o extends RecyclerView.AbstractC22078OooOooO {
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f75879OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f75880OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f75881OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f75882OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f75884OooO0o0;

        public OooO0O0(View view) {
            super(view);
            ImageView expandIcon = (ImageView) view.findViewById(R.id.expand_icon);
            this.f75879OooO00o = expandIcon;
            this.f75880OooO0O0 = (TextView) view.findViewById(R.id.page_number);
            View viewFindViewById = view.findViewById(R.id.btn_more);
            this.f75881OooO0OO = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.title);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f75882OooO0Oo = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.divider);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f75884OooO0o0 = viewFindViewById3;
            int i = 3;
            view.setOnClickListener(new o000000O(OooO00o.this, i));
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC28291OooO0OO(OooO00o.this, i));
            OooOOO0.OooO0o(expandIcon, "expandIcon");
            C28025OooO0O0.OooO00o(expandIcon);
            expandIcon.setOnClickListener(new ViewOnClickListenerC28529OooOO0o(OooO00o.this, 2));
            view.post(new RunnableC28761o0000O0O(this, 1));
        }

        public static SpannableString OooO00o(int i, String str, String str2) {
            SpannableString spannableString = new SpannableString(str);
            if (str2 != null && str2.length() != 0) {
                Pattern patternCompile = Pattern.compile(str2, 2);
                OooOOO0.OooO0o(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(spannableString);
                OooOOO0.OooO0o(matcher, "matcher(...)");
                int i2 = 0;
                while (i2 < spannableString.length() && matcher.find(i2)) {
                    int iStart = matcher.start();
                    spannableString.setSpan(new BackgroundColorSpan(i), iStart, matcher.end(), 33);
                    i2 = iStart + 1;
                }
            }
            return spannableString;
        }
    }

    public static final class OooO0OO extends OooOOO.AbstractC22036OooO0o0<OutlineVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f75885OooO00o = new OooO0OO();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(OutlineVO outlineVO, OutlineVO outlineVO2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(OutlineVO outlineVO, OutlineVO outlineVO2) {
            return outlineVO.equals(outlineVO2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return OooOOO0.OooO0O0(OooO0OO(i).getId(), OutlineVO.FAKE_OUTLINE_ID) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        CharSequence title;
        OooOOO0.OooO0oO(holder, "holder");
        if (getItemViewType(i) == 1) {
            return;
        }
        OutlineVO outlineVOOooO0OO = OooO0OO(i);
        OooO0O0 oooO0O0 = (OooO0O0) holder;
        OooOOO0.OooO0Oo(outlineVOOooO0OO);
        oooO0O0.itemView.setTag(outlineVOOooO0OO);
        View view = oooO0O0.f75881OooO0OO;
        view.setTag(outlineVOOooO0OO);
        ImageView imageView = oooO0O0.f75879OooO00o;
        imageView.setTag(outlineVOOooO0OO);
        if (outlineVOOooO0OO.getHasChildren() && outlineVOOooO0OO.getSearchQuery().length() == 0) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        if (outlineVOOooO0OO.getHasChildren()) {
            imageView.setImageResource(outlineVOOooO0OO.getExpand() ? R.drawable.ic_ni_arrow_drop_down_normal : R.drawable.ic_ni_arrow_right);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(Oooo0.o000000O.OooO0o((Math.min(outlineVOOooO0OO.getLevel(), 3) * 10) + 3));
        imageView.requestLayout();
        oooO0O0.f75880OooO0O0.setText(C21532OooOOo.OooO0OO(outlineVOOooO0OO.getPageIndex() + 1, "Page "));
        int color = outlineVOOooO0OO.getLevel() == 0 ? ContextCompat.getColor(oooO0O0.itemView.getContext(), R.color.item_text_name_color) : ContextCompat.getColor(oooO0O0.itemView.getContext(), R.color.item_text_description_color);
        TextView textView = oooO0O0.f75882OooO0Oo;
        textView.setTextColor(color);
        try {
            title = OooO0O0.OooO00o(C31183OooO00o.f111221OooO00o, outlineVOOooO0OO.getTitle(), outlineVOOooO0OO.getSearchQuery());
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("OutlineAdapter");
            c20358OooO00o.OooO0Oo(e, C20593OooO0Oo.OooO0O0("OutlineAdapter.getHighlightString for: ", outlineVOOooO0OO.getTitle(), " err."), new Object[0]);
            title = outlineVOOooO0OO.getTitle();
        }
        textView.setText(title);
        textView.setMaxLines(OooO00o.this.f75878OooO0OO ? 1 : 4);
        View view2 = oooO0O0.f75884OooO0o0;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (outlineVOOooO0OO.getLevel() == 0) {
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
        } else {
            marginLayoutParams.setMarginStart(Oooo0.o000000O.OooO0o(18));
            marginLayoutParams.setMarginEnd(Oooo0.o000000O.OooO0o(18));
        }
        view2.setLayoutParams(marginLayoutParams);
        view.setVisibility(outlineVOOooO0OO.getSelected() ? 0 : 8);
        oooO0O0.itemView.setSelected(outlineVOOooO0OO.getSelected());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        OooOOO0.OooO0oO(parent, "parent");
        if (i == 1) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_outline_empty, parent, false);
            OooOOO0.OooO0Oo(viewOooO0O0);
            return new C19370OooO00o(viewOooO0O0);
        }
        View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_outline, parent, false);
        OooOOO0.OooO0Oo(viewOooO0O02);
        return new OooO0O0(viewOooO0O02);
    }
}
