package o0OoooOo;

import OooOoO.C20504OooO0O0;
import OooOoo.C20593OooO0Oo;
import Oooo0.o000000O;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0Oo0O0.C28050OooO0OO;
import o0OoOO00.ViewOnClickListenerC29033OoooOOo;
import o0OoOO0o.ViewOnClickListenerC29034OooO00o;
import o0oo000O.C31183OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29635OooO00o extends RecyclerView.AbstractC22062OooO0oO<OooO0O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f105079OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26295OoooO00 f105080OooO0O0;

    /* JADX INFO: renamed from: o0OoooOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20012OooO00o extends OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f105081OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<CommentVO> f105082OooO0O0;

        public C20012OooO00o(ArrayList oldList, List newList) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(oldList, "oldList");
            kotlin.jvm.internal.OooOOO0.OooO0oO(newList, "newList");
            this.f105081OooO00o = oldList;
            this.f105082OooO0O0 = newList;
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO00o(int i, int i2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105081OooO00o.get(i), this.f105082OooO0O0.get(i2));
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO0O0(int i, int i2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105081OooO00o.get(i), this.f105082OooO0O0.get(i2));
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0Oo() {
            return this.f105082OooO0O0.size();
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0o0() {
            return this.f105081OooO00o.size();
        }
    }

    /* JADX INFO: renamed from: o0OoooOo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final View f105083OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f105084OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f105085OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f105086OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f105087OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final TextView f105088OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f105089OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final TextView f105090OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final ViewGroup f105091OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final TextView f105092OooOO0;

        public OooO0O0(C29635OooO00o c29635OooO00o, View view) {
            super(view);
            this.f105084OooO00o = view.findViewById(R.id.v_highlight);
            this.f105085OooO0O0 = view.findViewById(R.id.v_underline);
            this.f105086OooO0OO = view.findViewById(R.id.v_stroke_line);
            this.f105087OooO0Oo = (TextView) view.findViewById(R.id.tv_highlight_font);
            this.f105089OooO0o0 = (ImageView) view.findViewById(R.id.iv_text_anno_icon);
            this.f105088OooO0o = (TextView) view.findViewById(R.id.page_number);
            View viewFindViewById = view.findViewById(R.id.title);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f105090OooO0oO = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.cl_style);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f105091OooO0oo = (ViewGroup) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.btn_more);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f105083OooO = viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tv_creation_time);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
            this.f105092OooOO0 = (TextView) viewFindViewById4;
            view.setOnClickListener(new ViewOnClickListenerC29033OoooOOo(c29635OooO00o, 1));
            C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC29034OooO00o(c29635OooO00o, 1));
        }

        public static SpannableString OooO00o(int i, String str, String str2) throws PatternSyntaxException {
            SpannableString spannableString = new SpannableString(str);
            if (str2 != null && str2.length() != 0) {
                Pattern patternCompile = Pattern.compile(str2, 2);
                kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(spannableString);
                kotlin.jvm.internal.OooOOO0.OooO0o(matcher, "matcher(...)");
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

    public final void OooO0OO(List<CommentVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        ArrayList arrayList = this.f105079OooO00o;
        OooOOO.C22035OooO0Oo c22035OooO0OoOooO00o = androidx.recyclerview.widget.OooOOO.OooO00o(new C20012OooO00o(arrayList, list));
        arrayList.clear();
        arrayList.addAll(list);
        c22035OooO0OoOooO00o.OooO00o(new androidx.recyclerview.widget.OooO0O0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f105079OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        CharSequence title;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        CommentVO item = (CommentVO) this.f105079OooO00o.get(i);
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        holder.itemView.setTag(item);
        View view = holder.f105083OooO;
        view.setTag(item);
        Context context = holder.itemView.getContext();
        String strOooO0OO = C21532OooOOo.OooO0OO(item.getPageIndex() + 1, "Page ");
        TextView textView = holder.f105088OooO0o;
        textView.setText(strOooO0OO);
        try {
            title = OooO0O0.OooO00o(C31183OooO00o.f111221OooO00o, item.getTitle(), item.getHighlightText());
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CommentAdapter");
            c20358OooO00o.OooO0Oo(e, C20593OooO0Oo.OooO0O0("getHighlightString for :", item.getTitle(), " err."), new Object[0]);
            title = item.getTitle();
        }
        holder.f105090OooO0oO.setText(title);
        view.setVisibility(item.getSelected() ? 0 : 8);
        View bgColor = holder.f105084OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0o(bgColor, "bgColor");
        bgColor.setVisibility(8);
        View underlineColor = holder.f105085OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0o(underlineColor, "underlineColor");
        underlineColor.setVisibility(8);
        View strokeLineColor = holder.f105086OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0o(strokeLineColor, "strokeLineColor");
        strokeLineColor.setVisibility(8);
        ImageView textAnnoIcon = holder.f105089OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0o(textAnnoIcon, "textAnnoIcon");
        textAnnoIcon.setVisibility(8);
        int color = context.getColor(R.color.editor_text_color);
        TextView textView2 = holder.f105087OooO0Oo;
        textView2.setTextColor(color);
        if (item.getQuoteType() != null) {
            Integer quoteType = item.getQuoteType();
            if (quoteType != null && quoteType.intValue() == 0) {
                bgColor.setBackgroundColor(item.getBgColor());
                bgColor.setVisibility(0);
                textView2.setTextColor(context.getColor(R.color.color_black_87));
            } else if (quoteType != null && quoteType.intValue() == 1) {
                bgColor.setBackgroundResource(R.drawable.bg_comment_border_no_bg_color);
                bgColor.setVisibility(0);
                underlineColor.setBackgroundColor(item.getUnderlineColor());
                underlineColor.setVisibility(0);
            } else if (quoteType != null && quoteType.intValue() == 2) {
                bgColor.setBackgroundResource(R.drawable.bg_comment_border_no_bg_color);
                bgColor.setVisibility(0);
                strokeLineColor.setVisibility(0);
            } else if (quoteType != null && quoteType.intValue() == 4) {
                if (item.getBgColor() == 0) {
                    bgColor.setBackgroundResource(R.drawable.bg_comment_border_no_bg_color);
                    bgColor.setVisibility(0);
                } else {
                    bgColor.setBackgroundColor(item.getBgColor());
                    bgColor.setVisibility(0);
                    textView2.setTextColor(context.getColor(R.color.color_black_87));
                }
                if (item.getUnderlineColor() != 0) {
                    underlineColor.setBackgroundColor(item.getUnderlineColor());
                    underlineColor.setVisibility(0);
                }
            } else if ((quoteType != null && quoteType.intValue() == 5) || (quoteType != null && quoteType.intValue() == 6)) {
                textAnnoIcon.setVisibility(0);
            }
        }
        holder.f105091OooO0oo.setVisibility(item.getQuoteType() == null ? 8 : 0);
        holder.f105092OooOO0.setText(item.getCreationTimeStr());
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(item.getQuoteType() != null ? o000000O.OooO0o(4) : o000000O.OooO0o(19));
        textView.setLayoutParams(marginLayoutParams);
        if (item.getSelected()) {
            View view2 = holder.itemView;
            view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), R.color.item_bg_color_pressed));
        } else {
            View view3 = holder.itemView;
            view3.setBackgroundColor(ContextCompat.getColor(view3.getContext(), R.color.item_bg_secondary_color_normal));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_comment, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }
}
