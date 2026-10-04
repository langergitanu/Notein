package o0OoOOo0;

import Oooo0.o000000O;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.penkit.models.DelegateAdapter;
import java.util.Iterator;
import kotlin.jvm.internal.C24023OooOOoo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.o0OoOo0;
import o0oOoOo.C31087Oooooo0;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oOoo0.InterfaceC34602OooOO0o;
import org.json.JSONException;

/* JADX INFO: renamed from: o0OoOOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29182OooO0O0 extends AbstractC22050OooOo0o<C31087Oooooo0, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f103495OooO0o = {C24035Oooo00o.f80943OooO00o.OooO0o0(new C24023OooOOoo(C29182OooO0O0.class, "isInEditingMode", "isInEditingMode()Z", 0))};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f103496OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f103497OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C29183OooO0OO f103498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0OoOo0 f103499OooO0o0;

    /* JADX INFO: renamed from: o0OoOOo0.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31087Oooooo0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f103500OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31087Oooooo0 c31087Oooooo0, C31087Oooooo0 c31087Oooooo02) {
            return c31087Oooooo0.equals(c31087Oooooo02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31087Oooooo0 c31087Oooooo0, C31087Oooooo0 c31087Oooooo02) {
            C31087Oooooo0 c31087Oooooo03 = c31087Oooooo0;
            C31087Oooooo0 c31087Oooooo04 = c31087Oooooo02;
            return OooOOO0.OooO0O0(c31087Oooooo03.f110946OooO00o, c31087Oooooo04.f110946OooO00o) && OooOOO0.OooO0O0(c31087Oooooo03.f110952OooO0oO, c31087Oooooo04.f110952OooO0oO);
        }
    }

    /* JADX INFO: renamed from: o0OoOOo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public final class C19963OooO0O0 extends RecyclerView.AbstractC22078OooOooO {
    }

    /* JADX INFO: renamed from: o0OoOOo0.OooO0O0$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f103501OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f103502OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f103503OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f103504OooO0Oo;

        public OooO0OO(View view) {
            super(view);
            this.f103501OooO00o = (TextView) view.findViewById(R.id.name);
            this.f103502OooO0O0 = view.findViewById(R.id.selected);
            ImageView imageView = (ImageView) view.findViewById(R.id.download);
            this.f103503OooO0OO = imageView;
            View viewFindViewById = view.findViewById(R.id.btn_delete);
            this.f103504OooO0Oo = viewFindViewById;
            o0OoOo0 o0oooo02 = C29182OooO0O0.this.f103499OooO0o0;
            if (o0oooo02 != null) {
                view.setOnClickListener(o0oooo02);
                if (imageView != null) {
                    imageView.setOnClickListener(o0oooo02);
                }
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(o0oooo02);
                }
            }
        }
    }

    public C29182OooO0O0() {
        this(0, 0, 7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return OooO0OO(i).f110951OooO0o0 == null ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        String string;
        OooOOO0.OooO0oO(holder, "holder");
        if (!(holder instanceof OooO0OO)) {
            boolean z = holder instanceof C19963OooO0O0;
            return;
        }
        OooO0OO oooO0OO = (OooO0OO) holder;
        C31087Oooooo0 c31087Oooooo0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31087Oooooo0OooO0OO, "getItem(...)");
        C31087Oooooo0 c31087Oooooo0 = c31087Oooooo0OooO0OO;
        oooO0OO.itemView.setTag(c31087Oooooo0);
        ImageView imageView = oooO0OO.f103503OooO0OO;
        if (imageView != null) {
            imageView.setTag(c31087Oooooo0);
        }
        View view = oooO0OO.f103504OooO0Oo;
        if (view != null) {
            view.setTag(c31087Oooooo0);
        }
        TextView textView = oooO0OO.f103501OooO00o;
        if (textView != null) {
            Integer num = c31087Oooooo0.f110951OooO0o0;
            if (num != null && num.intValue() == 0) {
                string = oooO0OO.itemView.getContext().getString(R.string.section_sys_font);
            } else if (num != null && num.intValue() == 1) {
                string = oooO0OO.itemView.getContext().getString(R.string.section_chinese_font);
            } else if (num != null && num.intValue() == 2) {
                string = oooO0OO.itemView.getContext().getString(R.string.section_english_font);
            } else if (num != null && num.intValue() == 3) {
                string = oooO0OO.itemView.getContext().getString(R.string.section_imported_font);
            } else {
                Integer num2 = c31087Oooooo0.f110952OooO0oO;
                string = num2 != null ? oooO0OO.itemView.getContext().getString(num2.intValue()) : c31087Oooooo0.f110946OooO00o;
            }
            textView.setText(string);
        }
        Typeface typeface = c31087Oooooo0.f110947OooO0O0;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        View view2 = oooO0OO.f103502OooO0O0;
        boolean z2 = c31087Oooooo0.f110948OooO0OO;
        if (view2 != null) {
            view2.setVisibility(z2 ? 0 : 4);
        }
        oooO0OO.itemView.setSelected(z2);
        if (imageView != null) {
            imageView.setVisibility(typeface == null ? 0 : 4);
        }
        if (imageView != null && imageView.getVisibility() == 0 && c31087Oooooo0.f110949OooO0Oo) {
            imageView.setImageDrawable(oooO0OO.itemView.getContext().getDrawable(R.mipmap.bg_rotate));
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(oooO0OO.itemView.getContext(), R.anim.rotate_loop);
            OooOOO0.OooO0o(animationLoadAnimation, "loadAnimation(...)");
            imageView.startAnimation(animationLoadAnimation);
        } else {
            if (imageView != null) {
                imageView.setImageDrawable(oooO0OO.itemView.getContext().getDrawable(R.drawable.ic_ni_download_arrow));
            }
            if (imageView != null) {
                imageView.clearAnimation();
            }
        }
        if (view != null) {
            if (!OooOOO0.OooO0O0(textView != null ? textView.getText() : null, oooO0OO.itemView.getContext().getString(R.string.default_font))) {
                C29182OooO0O0 c29182OooO0O0 = C29182OooO0O0.this;
                int i2 = (!((Boolean) c29182OooO0O0.f103498OooO0Oo.getValue(c29182OooO0O0, f103495OooO0o[0])).booleanValue() || z2) ? 8 : 0;
                view.setVisibility(i2);
            }
        }
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z2 && c31087Oooooo0.f110950OooO0o) {
                marginLayoutParams.setMarginEnd(o000000O.OooO0o(16));
            } else {
                marginLayoutParams.setMarginEnd(o000000O.OooO0o(0));
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        InterfaceC33569OooO0oo<View> children;
        OooOOO0.OooO0oO(parent, "parent");
        int i2 = this.f103497OooO0OO;
        int i3 = this.f103496OooO0O0;
        if (i == 1) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_textstyle_text_font_section, parent, false);
            viewOooO0O0.setPadding(i3, viewOooO0O0.getPaddingTop(), i2, viewOooO0O0.getPaddingBottom());
            return new OooO0OO(viewOooO0O0);
        }
        if (i != 2) {
            View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_textstyle_text_font, parent, false);
            viewOooO0O02.setPadding(i3, viewOooO0O02.getPaddingTop(), i2, viewOooO0O02.getPaddingBottom());
            return new OooO0OO(viewOooO0O02);
        }
        View viewOooO0O03 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_textstyle_text_font_import, parent, false);
        viewOooO0O03.setPadding(0, viewOooO0O03.getPaddingTop(), 0, viewOooO0O03.getPaddingBottom());
        C19963OooO0O0 c19963OooO0O0 = new C19963OooO0O0(viewOooO0O03);
        View viewFindViewById = viewOooO0O03.findViewById(R.id.tv_import_font);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        if (this.f103499OooO0o0 != null) {
            ViewGroup viewGroup = viewOooO0O03 instanceof ViewGroup ? (ViewGroup) viewOooO0O03 : null;
            if (viewGroup != null && (children = ViewGroupKt.getChildren(viewGroup)) != null) {
                Iterator<View> it = children.iterator();
                while (it.hasNext()) {
                    it.next().setOnClickListener(this.f103499OooO0o0);
                }
            }
        }
        return c19963OooO0O0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29182OooO0O0(int i, int i2, int i3) {
        super(OooO00o.f103500OooO00o);
        int i4 = 0;
        i = (i3 & 1) != 0 ? o000000O.OooO0o(50) : i;
        i2 = (i3 & 2) != 0 ? o000000O.OooO0o(40) : i2;
        this.f103496OooO0O0 = i;
        this.f103497OooO0OO = i2;
        DelegateAdapter delegateAdapter = DelegateAdapter.INSTANCE;
        this.f103498OooO0Oo = new C29183OooO0OO(i4, false, this);
    }
}
