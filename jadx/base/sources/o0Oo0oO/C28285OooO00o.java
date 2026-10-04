package o0Oo0oO;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.sessions.C22797OooO0Oo;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31029OooO;

/* JADX INFO: renamed from: o0Oo0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28285OooO00o extends AbstractC22050OooOo0o<C31029OooO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C22797OooO0Oo f100321OooO0O0;

    /* JADX INFO: renamed from: o0Oo0oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19900OooO00o extends OooOOO.AbstractC22036OooO0o0<C31029OooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19900OooO00o f100322OooO00o = new C19900OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31029OooO c31029OooO, C31029OooO c31029OooO2) {
            return c31029OooO.equals(c31029OooO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31029OooO c31029OooO, C31029OooO c31029OooO2) {
            return c31029OooO.f110771OooO00o.equals(c31029OooO2.f110771OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0Oo0oO.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f100323OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f100324OooO0O0;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.pic);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f100323OooO00o = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.remove);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f100324OooO0O0 = (ImageView) viewFindViewById2;
        }

        public final void OooO00o(final C31029OooO c31029OooO) {
            ImageView imageView = this.f100323OooO00o;
            imageView.setImageBitmap(MediaStore.Images.Media.getBitmap(imageView.getContext().getContentResolver(), c31029OooO.f110772OooO0O0));
            final C28285OooO00o c28285OooO00o = C28285OooO00o.this;
            this.f100324OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0oO.OooO0O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C22797OooO0Oo c22797OooO0Oo = c28285OooO00o.f100321OooO0O0;
                    if (c22797OooO0Oo != null) {
                        c22797OooO0Oo.invoke(c31029OooO);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31029OooO c31029OooOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31029OooOOooO0OO, "getItem(...)");
        holder.OooO00o(c31029OooOOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_feedback_pic, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
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
        if (!((Bundle) obj).getBoolean("needRefresh")) {
            C31029OooO c31029OooOOooO0OO = OooO0OO(i);
            OooOOO0.OooO0o(c31029OooOOooO0OO, "getItem(...)");
            holder.OooO00o(c31029OooOOooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
