package o0Ooo0O;

import OooOoO.C20504OooO0O0;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0O0o0oO.ViewOnClickListenerC26047OoooO00;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28244OooOo0o;
import o0OoOOOo.ViewOnClickListenerC29099OooO0oO;
import o0Ooo0O.C29375OooO00o;
import o0oOOOoo.C30837OooO00o;

/* JADX INFO: renamed from: o0Ooo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29375OooO00o extends AbstractC22050OooOo0o<C30837OooO00o, OooO0OO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f104159OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC19985OooO00o f104160OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19985OooO00o {
        void OooO00o(View view);

        Bitmap OooO0O0(C30837OooO00o c30837OooO00o);

        void OooO0OO(View view);

        void OooO0Oo(View view);

        void OooO0o0(View view);
    }

    /* JADX INFO: renamed from: o0Ooo0O.OooO00o$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<C30837OooO00o> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C30837OooO00o c30837OooO00o, C30837OooO00o c30837OooO00o2) {
            C30837OooO00o c30837OooO00o3 = c30837OooO00o;
            C30837OooO00o c30837OooO00o4 = c30837OooO00o2;
            Bundle bundle = new Bundle();
            boolean z = c30837OooO00o3.f110203OooO0oo;
            boolean z2 = c30837OooO00o4.f110203OooO0oo;
            if (z != z2) {
                bundle.putBoolean("visible", z2);
            }
            boolean z3 = c30837OooO00o3.f110195OooO;
            boolean z4 = c30837OooO00o4.f110195OooO;
            if (z3 != z4) {
                bundle.putBoolean("selected", z4);
            }
            Size size = c30837OooO00o3.f110200OooO0o;
            Size size2 = c30837OooO00o4.f110200OooO0o;
            if (!size.equals(size2)) {
                bundle.putSize("tn_size", size2);
            }
            long j = c30837OooO00o3.f110202OooO0oO;
            long j2 = c30837OooO00o4.f110202OooO0oO;
            if (j != j2) {
                bundle.putLong("tn_content", j2);
            }
            boolean z5 = c30837OooO00o3.f110204OooOO0;
            boolean z6 = c30837OooO00o4.f110204OooOO0;
            if (z5 != z6) {
                bundle.putBoolean("more_button", z6);
            }
            String str = c30837OooO00o3.f110201OooO0o0;
            String str2 = c30837OooO00o4.f110201OooO0o0;
            if (OooOOO0.OooO0O0(str, str2)) {
                return false;
            }
            bundle.putString("name", str2);
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C30837OooO00o c30837OooO00o, C30837OooO00o c30837OooO00o2) {
            C30837OooO00o c30837OooO00o3 = c30837OooO00o;
            C30837OooO00o c30837OooO00o4 = c30837OooO00o2;
            return OooOOO0.OooO0O0(c30837OooO00o3.f110196OooO00o, c30837OooO00o4.f110196OooO00o) && OooOOO0.OooO0O0(c30837OooO00o3.f110197OooO0O0, c30837OooO00o4.f110197OooO0O0) && OooOOO0.OooO0O0(c30837OooO00o3.f110198OooO0OO, c30837OooO00o4.f110198OooO0OO);
        }
    }

    /* JADX INFO: renamed from: o0Ooo0O.OooO00o$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final View f104161OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f104162OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f104163OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f104164OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f104165OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final View f104166OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f104167OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final View f104168OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final View f104169OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final TextView f104170OooOO0;

        public OooO0OO(View view) {
            super(view);
            this.f104162OooO00o = (ImageView) view.findViewById(R.id.f57988tn);
            this.f104163OooO0O0 = view.findViewById(R.id.tn_wrapper);
            View viewFindViewById = view.findViewById(R.id.btn_more);
            this.f104164OooO0OO = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.btn_visibility);
            this.f104165OooO0Oo = viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.fl_add_button);
            this.f104167OooO0o0 = viewFindViewById3;
            this.f104166OooO0o = view.findViewById(R.id.btn_lock);
            this.f104168OooO0oO = view.findViewById(R.id.cl_layer);
            this.f104169OooO0oo = view.findViewById(R.id.v_selected_mask);
            this.f104161OooO = view.findViewById(R.id.v_drop_mask);
            this.f104170OooOO0 = (TextView) view.findViewById(R.id.tv_name);
            C28050OooO0OO.OooO00o(view, 500L, new ViewOnClickListenerC29099OooO0oO(C29375OooO00o.this, 1));
            view.setOnContextClickListener(new View.OnContextClickListener() { // from class: o0Ooo0O.OooO0O0
                @Override // android.view.View.OnContextClickListener
                public final boolean onContextClick(View view2) {
                    C29375OooO00o.InterfaceC19985OooO00o interfaceC19985OooO00o = c29375OooO00o.f104160OooO0O0;
                    if (interfaceC19985OooO00o != null) {
                        OooOOO0.OooO0Oo(view2);
                        interfaceC19985OooO00o.OooO00o(view2);
                    }
                    return true;
                }
            });
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28244OooOo0o(C29375OooO00o.this, 3));
            C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC26036Oooo(C29375OooO00o.this, 3));
            C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC26047OoooO00(C29375OooO00o.this, 2));
        }

        public final void OooO00o(C30837OooO00o c30837OooO00o) {
            this.itemView.setTag(c30837OooO00o);
            View view = this.f104164OooO0OO;
            view.setTag(c30837OooO00o);
            View view2 = this.f104165OooO0Oo;
            view2.setTag(c30837OooO00o);
            View view3 = this.f104167OooO0o0;
            view3.setTag(c30837OooO00o);
            OooO0OO(c30837OooO00o);
            InterfaceC19985OooO00o interfaceC19985OooO00o = C29375OooO00o.this.f104160OooO0O0;
            Bitmap bitmapOooO0O0 = interfaceC19985OooO00o != null ? interfaceC19985OooO00o.OooO0O0(c30837OooO00o) : null;
            ImageView imageView = this.f104162OooO00o;
            if (bitmapOooO0O0 != null) {
                imageView.setImageBitmap(bitmapOooO0O0);
            } else {
                imageView.setImageResource(R.drawable.bg_item_white);
            }
            boolean z = c30837OooO00o.f110195OooO;
            this.f104169OooO0oo.setVisibility(z ? 0 : 8);
            view3.setVisibility(z ? 0 : 8);
            view2.setActivated(c30837OooO00o.f110203OooO0oo);
            view.setVisibility(c30837OooO00o.f110204OooOO0 ? 0 : 8);
            OooO0O0(c30837OooO00o);
            String str = c30837OooO00o.f110196OooO00o;
            this.f104168OooO0oO.setVisibility(str.length() > 0 ? 0 : 8);
            this.f104166OooO0o.setVisibility(str.equals("default") ? 0 : 8);
            this.f104161OooO.setVisibility(8);
        }

        public final void OooO0O0(C30837OooO00o c30837OooO00o) {
            String str = c30837OooO00o.f110201OooO0o0;
            TextView textView = this.f104170OooOO0;
            if (str != null && str.length() != 0) {
                textView.setText(str);
            } else if (OooOOO0.OooO0O0(c30837OooO00o.f110196OooO00o, "default")) {
                textView.setText(this.itemView.getContext().getString(R.string.default_page_layer_name));
            } else {
                textView.setText(this.itemView.getContext().getString(R.string.unnamed_page_layer_name));
            }
        }

        public final void OooO0OO(C30837OooO00o c30837OooO00o) {
            ViewGroup.LayoutParams layoutParams = this.f104163OooO0O0.getLayoutParams();
            Size size = c30837OooO00o.f110200OooO0o;
            layoutParams.width = size.getWidth();
            layoutParams.height = size.getHeight();
            ViewGroup.LayoutParams layoutParams2 = this.f104162OooO00o.getLayoutParams();
            layoutParams2.width = size.getWidth();
            layoutParams2.height = size.getHeight();
        }

        public final void OooO0Oo(boolean z) {
            this.f104161OooO.setVisibility(z ? 0 : 8);
        }
    }

    public C29375OooO00o() {
        super(f104159OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C30837OooO00o c30837OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c30837OooO00oOooO0OO);
        holder.OooO00o(c30837OooO00oOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_page_layer_add, viewGroup, false);
        OooOOO0.OooO0o(viewOooO0OO, "inflate(...)");
        return new OooO0OO(viewOooO0OO);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) obj;
        C30837OooO00o c30837OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c30837OooO00oOooO0OO, "getItem(...)");
        C30837OooO00o c30837OooO00o = c30837OooO00oOooO0OO;
        if (bundle.isEmpty()) {
            holder.OooO00o(c30837OooO00o);
            return;
        }
        holder.itemView.setTag(c30837OooO00o);
        View view = holder.f104164OooO0OO;
        view.setTag(c30837OooO00o);
        View view2 = holder.f104165OooO0Oo;
        view2.setTag(c30837OooO00o);
        View view3 = holder.f104167OooO0o0;
        view3.setTag(c30837OooO00o);
        Set<String> setKeySet = bundle.keySet();
        OooOOO0.OooO0o(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1562742948:
                        if (str.equals("more_button")) {
                            view.setVisibility(c30837OooO00o.f110204OooOO0 ? 0 : 8);
                        }
                        break;
                    case -1183283546:
                        if (str.equals("tn_size")) {
                            holder.OooO0OO(c30837OooO00o);
                        }
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            holder.OooO0O0(c30837OooO00o);
                        }
                        break;
                    case 466743410:
                        if (str.equals("visible")) {
                            view2.setActivated(c30837OooO00o.f110203OooO0oo);
                        }
                        break;
                    case 737529780:
                        if (str.equals("tn_content")) {
                            InterfaceC19985OooO00o interfaceC19985OooO00o = C29375OooO00o.this.f104160OooO0O0;
                            Bitmap bitmapOooO0O0 = interfaceC19985OooO00o != null ? interfaceC19985OooO00o.OooO0O0(c30837OooO00o) : null;
                            ImageView imageView = holder.f104162OooO00o;
                            if (bitmapOooO0O0 != null) {
                                imageView.setImageBitmap(bitmapOooO0O0);
                            } else {
                                imageView.setImageResource(R.drawable.bg_item_white);
                            }
                        }
                        break;
                    case 1191572123:
                        if (str.equals("selected")) {
                            boolean z = c30837OooO00o.f110195OooO;
                            holder.f104169OooO0oo.setVisibility(z ? 0 : 8);
                            view3.setVisibility(z ? 0 : 8);
                        }
                        break;
                }
            }
        }
    }
}
