package com.orion.notein.p607ui.settings.page;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o0o00oO0.ViewOnClickListenerC30013Oooo0o0;
import o0o0Oo0O.C30623OooOOOO;
import o0oOooOO.C31152OooO00o;
import oO00ooO.C32447OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33769Ooooo0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/settings/page/BasePageOptionFragment;", "T", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class BasePageOptionFragment<T> extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f79183OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C22026ooOO f79184OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public T f79185OooOoO0;

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f79186OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f79187OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f79188OooO0OO;

        public OooO00o(T t, View view, ImageView imageView) {
            this.f79186OooO00o = t;
            this.f79187OooO0O0 = view;
            this.f79188OooO0OO = imageView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return OooOOO0.OooO0O0(this.f79186OooO00o, oooO00o.f79186OooO00o) && OooOOO0.OooO0O0(this.f79187OooO0O0, oooO00o.f79187OooO0O0) && OooOOO0.OooO0O0(this.f79188OooO0OO, oooO00o.f79188OooO0OO);
        }

        public final int hashCode() {
            T t = this.f79186OooO00o;
            return this.f79188OooO0OO.hashCode() + ((this.f79187OooO0O0.hashCode() + ((t == null ? 0 : t.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "OptionHolder(value=" + this.f79186OooO00o + ", root=" + this.f79187OooO0O0 + ", checkView=" + this.f79188OooO0OO + ")";
        }
    }

    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Integer f79189OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CharSequence f79190OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Integer f79191OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final T f79192OooO0Oo;

        public OooO0O0() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Integer num, String str, Integer num2, Object obj, int i) {
            num = (i & 1) != 0 ? null : num;
            str = (i & 2) != 0 ? null : str;
            num2 = (i & 4) != 0 ? null : num2;
            this.f79189OooO00o = num;
            this.f79190OooO0O0 = str;
            this.f79191OooO0OO = num2;
            this.f79192OooO0Oo = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return OooOOO0.OooO0O0(this.f79189OooO00o, oooO0O0.f79189OooO00o) && OooOOO0.OooO0O0(this.f79190OooO0O0, oooO0O0.f79190OooO0O0) && OooOOO0.OooO0O0(this.f79191OooO0OO, oooO0O0.f79191OooO0OO) && OooOOO0.OooO0O0(this.f79192OooO0Oo, oooO0O0.f79192OooO0Oo);
        }

        public final int hashCode() {
            Integer num = this.f79189OooO00o;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            CharSequence charSequence = this.f79190OooO0O0;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            Integer num2 = this.f79191OooO0OO;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
            T t = this.f79192OooO0Oo;
            return iHashCode3 + (t != null ? t.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OptionItem(titleRes=");
            sb.append(this.f79189OooO00o);
            sb.append(", titleText=");
            sb.append((Object) this.f79190OooO0O0);
            sb.append(", subtitleRes=");
            sb.append(this.f79191OooO0OO);
            sb.append(", subtitleText=null, value=");
            return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f79192OooO0Oo, ")");
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(BasePageOptionFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.BasePageOptionFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23825OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79194OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23825OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79194OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f79194OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79195OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79195OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = BasePageOptionFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f79195OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.page.BasePageOptionFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23826OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79197OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23826OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79197OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f79197OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public BasePageOptionFragment() {
        super(R.layout.fragment_page_option_list);
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0OO());
        C23825OooO0Oo c23825OooO0Oo = new C23825OooO0Oo(c32447OooOOoOooO0OO);
        this.f79184OooOo0o = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30623OooOOOO.class), c23825OooO0Oo, new OooO0o(c32447OooOOoOooO0OO), new C23826OooO0o0(c32447OooOOoOooO0OO));
        this.f79183OooOo = C34434OooOoO.f123453OooOo0o;
    }

    public abstract Object OooOoO(Object obj, com.orion.notein.p607ui.settings.page.OooO00o oooO00o);

    public final C30623OooOOOO OooOoO0() {
        return (C30623OooOOOO) this.f79184OooOo0o.getValue();
    }

    public abstract List<OooO0O0<T>> OooOoOO();

    public abstract C33769Ooooo0o OooOoo0();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.option_container);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        List<OooO0O0<T>> listOooOoOO = OooOoOO();
        int dimensionPixelSize = listOooOoOO.size() > 1 ? view.getResources().getDimensionPixelSize(R.dimen.page_option_item_spacing) : 0;
        List<OooO0O0<T>> list = listOooOoOO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            OooO0O0 oooO0O0 = (OooO0O0) t;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.view_settings_option_item, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_option_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_option_subtitle);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_option_check);
            Integer num = oooO0O0.f79189OooO00o;
            if (num != null) {
                textView.setText(num.intValue());
            } else {
                CharSequence charSequence = oooO0O0.f79190OooO0O0;
                if (charSequence == null) {
                    charSequence = "";
                }
                textView.setText(charSequence);
            }
            Integer num2 = oooO0O0.f79191OooO0OO;
            String string = num2 != null ? viewInflate.getContext().getString(num2.intValue()) : null;
            if (string != null && string.length() != 0) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setText(string);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            viewInflate.setBackgroundResource(R.drawable.list_item_bg_selector);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            }
            marginLayoutParams.bottomMargin = i == C34429OooOOo0.OooOO0O(listOooOoOO) ? 0 : dimensionPixelSize;
            viewInflate.setLayoutParams(marginLayoutParams);
            viewInflate.setOnClickListener(new ViewOnClickListenerC30013Oooo0o0(1, this, oooO0O0));
            linearLayout.addView(viewInflate);
            OooOOO0.OooO0Oo(imageView);
            arrayList.add(new OooO00o(oooO0O0.f79192OooO0Oo, viewInflate, imageView));
            i = i2;
        }
        this.f79183OooOo = arrayList;
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C31152OooO00o(this, null), 3);
    }
}
