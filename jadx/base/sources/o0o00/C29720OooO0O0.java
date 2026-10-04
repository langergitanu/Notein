package o0o00;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.MotionEvent;
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
import o0Oo0O0.C28050OooO0OO;
import o0OoOOo.ViewOnClickListenerC29131OooO0o;
import o0o00OOo.C29891OooO0o0;
import o0o00Oo0.C29909OooO0O0;

/* JADX INFO: renamed from: o0o00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29720OooO0O0 extends AbstractC22050OooOo0o<C29909OooO0O0, C20018OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C29891OooO0o0.OooO00o f105375OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f105376OooO0OO;

    /* JADX INFO: renamed from: o0o00.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C29909OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f105377OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29909OooO0O0 c29909OooO0O0, C29909OooO0O0 c29909OooO0O02) {
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29909OooO0O0 c29909OooO0O0, C29909OooO0O0 c29909OooO0O02) {
            return c29909OooO0O0.f106118OooO00o == c29909OooO0O02.f106118OooO00o;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C29909OooO0O0 c29909OooO0O0, C29909OooO0O0 c29909OooO0O02) {
            C29909OooO0O0 c29909OooO0O03 = c29909OooO0O0;
            C29909OooO0O0 c29909OooO0O04 = c29909OooO0O02;
            Bundle bundle = new Bundle();
            int i = c29909OooO0O03.f106119OooO0O0;
            int i2 = c29909OooO0O04.f106119OooO0O0;
            if (i != i2) {
                bundle.putInt("icon_res", i2);
            }
            int i3 = c29909OooO0O03.f106120OooO0OO;
            int i4 = c29909OooO0O04.f106120OooO0OO;
            if (i3 != i4) {
                bundle.putInt("description_res", i4);
            }
            boolean z = c29909OooO0O03.f106121OooO0Oo;
            boolean z2 = c29909OooO0O04.f106121OooO0Oo;
            if (z != z2) {
                bundle.putBoolean("visible", z2);
            }
            boolean z3 = c29909OooO0O03.f106122OooO0o0;
            boolean z4 = c29909OooO0O04.f106122OooO0o0;
            if (z3 != z4) {
                bundle.putBoolean("draggable", z4);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public final class C20018OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f105378OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f105379OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f105380OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f105381OooO0Oo;

        public C20018OooO0O0(final C29720OooO0O0 c29720OooO0O0, View view) {
            super(view);
            this.f105378OooO00o = (ImageView) view.findViewById(R.id.iv_item);
            this.f105379OooO0O0 = (TextView) view.findViewById(R.id.tv_name);
            ImageView btnVisibility = (ImageView) view.findViewById(R.id.btn_visibility);
            this.f105380OooO0OO = btnVisibility;
            ImageView imageView = (ImageView) view.findViewById(R.id.drag_handle);
            this.f105381OooO0Oo = imageView;
            OooOOO0.OooO0o(btnVisibility, "btnVisibility");
            C28050OooO0OO.OooO00o(btnVisibility, 500L, new ViewOnClickListenerC29131OooO0o(c29720OooO0O0, 1));
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00.OooO0OO
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    C29720OooO0O0 c29720OooO0O02 = c29720OooO0O0;
                    if (action == 0) {
                        c29720OooO0O02.f105376OooO0OO = true;
                    } else if (action == 1 || action == 3) {
                        c29720OooO0O02.f105376OooO0OO = false;
                    }
                    return true;
                }
            });
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void OooO00o(C29909OooO0O0 c29909OooO0O0, Bundle bundle) {
            this.itemView.setTag(c29909OooO0O0);
            ImageView imageView = this.f105380OooO0OO;
            imageView.setTag(c29909OooO0O0);
            TextView textView = this.f105379OooO0O0;
            ImageView imageView2 = this.f105381OooO0Oo;
            ImageView imageView3 = this.f105378OooO00o;
            int i = c29909OooO0O0.f106120OooO0OO;
            boolean z = c29909OooO0O0.f106122OooO0o0;
            int i2 = c29909OooO0O0.f106119OooO0O0;
            boolean z2 = c29909OooO0O0.f106121OooO0Oo;
            if (bundle == null || bundle.isEmpty()) {
                imageView3.setImageResource(i2);
                textView.setText(this.itemView.getContext().getString(i));
                imageView2.setVisibility(z ? 0 : 4);
                imageView.setActivated(z2);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -737591334:
                            if (str.equals("icon_res")) {
                                textView.setText(this.itemView.getContext().getString(i));
                            }
                            break;
                        case -304480883:
                            if (str.equals("draggable")) {
                                imageView2.setVisibility(z ? 0 : 4);
                            }
                            break;
                        case 466743410:
                            if (str.equals("visible")) {
                                imageView.setActivated(z2);
                            }
                            break;
                        case 986189277:
                            if (str.equals("description_res")) {
                                imageView3.setImageResource(i2);
                            }
                            break;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C20018OooO0O0 holder = (C20018OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29909OooO0O0 c29909OooO0O0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c29909OooO0O0OooO0OO);
        holder.OooO00o(c29909OooO0O0OooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_toolbar_settings, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new C20018OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        C20018OooO0O0 holder = (C20018OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        C29909OooO0O0 c29909OooO0O0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29909OooO0O0OooO0OO, "getItem(...)");
        holder.OooO00o(c29909OooO0O0OooO0OO, (Bundle) obj);
    }
}
