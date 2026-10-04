package o0Oooo0o;

import OooOoO.C20504OooO0O0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0OoooOO.C29633OooO00o;

/* JADX INFO: renamed from: o0Oooo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29612OooO00o extends AbstractC22050OooOo0o<C29633OooO00o, OooO0O0> {

    /* JADX INFO: renamed from: o0Oooo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20010OooO00o extends OooOOO.AbstractC22036OooO0o0<C29633OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20010OooO00o f104985OooO00o = new C20010OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29633OooO00o c29633OooO00o, C29633OooO00o c29633OooO00o2) {
            return c29633OooO00o.equals(c29633OooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29633OooO00o c29633OooO00o, C29633OooO00o c29633OooO00o2) {
            return OooOOO0.OooO0O0(c29633OooO00o.f105071OooO00o, c29633OooO00o2.f105071OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C29633OooO00o c29633OooO00o, C29633OooO00o c29633OooO00o2) {
            C29633OooO00o c29633OooO00o3 = c29633OooO00o;
            C29633OooO00o c29633OooO00o4 = c29633OooO00o2;
            Bundle bundle = new Bundle();
            String str = c29633OooO00o3.f105072OooO0O0;
            String str2 = c29633OooO00o4.f105072OooO0O0;
            if (!OooOOO0.OooO0O0(str, str2)) {
                bundle.putString("text", str2);
            }
            boolean z = c29633OooO00o3.f105073OooO0OO;
            boolean z2 = c29633OooO00o4.f105073OooO0OO;
            if (z != z2) {
                bundle.putBoolean("user_type", z2);
            }
            long j = c29633OooO00o3.f105074OooO0Oo;
            long j2 = c29633OooO00o4.f105074OooO0Oo;
            if (j != j2) {
                bundle.putLong("timestamp", j2);
            }
            int i = c29633OooO00o3.f105075OooO0o0;
            int i2 = c29633OooO00o4.f105075OooO0o0;
            if (i != i2) {
                bundle.putInt("text_res", i2);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0Oooo0o.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f104986OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f104987OooO0O0;

        public OooO0O0(ViewGroup viewGroup) {
            super(viewGroup);
            this.f104986OooO00o = (ImageView) viewGroup.findViewById(R.id.messageAuthor);
            this.f104987OooO0O0 = (TextView) viewGroup.findViewById(R.id.messageText);
        }

        public final void OooO00o(C29633OooO00o c29633OooO00o, Bundle bundle) {
            TextView textView = this.f104987OooO0O0;
            String string = c29633OooO00o.f105072OooO0O0;
            int i = c29633OooO00o.f105075OooO0o0;
            if (bundle == null) {
                if (i != 0) {
                    string = this.itemView.getContext().getString(i);
                }
                textView.setText(string);
                OooO0O0(c29633OooO00o);
                return;
            }
            if (bundle.containsKey("text") || bundle.containsKey("text_res")) {
                if (i != 0) {
                    string = this.itemView.getContext().getString(i);
                }
                textView.setText(string);
            }
            if (bundle.containsKey("user_type")) {
                OooO0O0(c29633OooO00o);
            }
        }

        public final void OooO0O0(C29633OooO00o c29633OooO00o) {
            Drawable drawable;
            ImageView imageView = this.f104986OooO00o;
            Context context = imageView.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            if (c29633OooO00o.f105073OooO0OO) {
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_ni_chat_account);
                OooOOO0.OooO0Oo(drawable);
            } else {
                drawable = ContextCompat.getDrawable(context, R.drawable.ic_ni_ai_helper);
                OooOOO0.OooO0Oo(drawable);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return OooO0OO(i).f105073OooO0OO ? R.layout.item_message_local : R.layout.item_message_remote;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29633OooO00o c29633OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c29633OooO00oOooO0OO);
        holder.OooO00o(c29633OooO00oOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", i, viewGroup, false);
        OooOOO0.OooO0o0(viewOooO0OO, "null cannot be cast to non-null type android.view.ViewGroup");
        return new OooO0O0((ViewGroup) viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        C29633OooO00o c29633OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29633OooO00oOooO0OO, "getItem(...)");
        holder.OooO00o(c29633OooO00oOooO0OO, (Bundle) obj);
    }
}
