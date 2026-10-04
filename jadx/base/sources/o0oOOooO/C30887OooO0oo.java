package o0oOOooO;

import OooOoO.C20504OooO0O0;
import OooOoOO.C20519OooO0Oo;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import o00o00oO.C25291OooO0oO;
import o0OO00o0.C26618o00Oo0;
import o0OoOoo.ViewOnClickListenerC29223OooO0oO;
import o0oOo000.C30941OooO0O0;
import o0oOoOo.C31078OoooOo0;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o0oOOooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30887OooO0oo extends RecyclerView.AbstractC22062OooO0oO<OooO0OO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32447OooOOo f110379OooO0OO = C20519OooO0Oo.OooO0OO(new C26618o00Oo0(1));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f110380OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f110381OooO0O0;

    /* JADX INFO: renamed from: o0oOOooO.OooO0oo$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o0oOOooO.OooO0oo$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f110382OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<C31078OoooOo0> f110383OooO0O0;

        public OooO0O0(ArrayList oldList, List newList) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(oldList, "oldList");
            kotlin.jvm.internal.OooOOO0.OooO0oO(newList, "newList");
            this.f110382OooO00o = oldList;
            this.f110383OooO0O0 = newList;
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO00o(int i, int i2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110382OooO00o.get(i), this.f110383OooO0O0.get(i2));
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO0O0(int i, int i2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110382OooO00o.get(i), this.f110383OooO0O0.get(i2));
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0Oo() {
            return this.f110383OooO0O0.size();
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0o0() {
            return this.f110382OooO00o.size();
        }
    }

    /* JADX INFO: renamed from: o0oOOooO.OooO0oo$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f110384OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f110385OooO0O0;

        public OooO0OO(C30887OooO0oo c30887OooO0oo, View view) {
            super(view);
            this.f110384OooO00o = (ImageView) view.findViewById(R.id.iv_preview);
            View viewFindViewById = view.findViewById(R.id.iv_remove);
            this.f110385OooO0O0 = viewFindViewById;
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC29223OooO0oO(c30887OooO0oo, 2));
        }
    }

    public final void OooO0OO(List<C31078OoooOo0> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        ArrayList arrayList = this.f110380OooO00o;
        OooOOO.C22035OooO0Oo c22035OooO0OoOooO00o = androidx.recyclerview.widget.OooOOO.OooO00o(new OooO0O0(arrayList, list));
        arrayList.clear();
        arrayList.addAll(list);
        c22035OooO0OoOooO00o.OooO00o(new androidx.recyclerview.widget.OooO0O0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f110380OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C31078OoooOo0 item = (C31078OoooOo0) this.f110380OooO00o.get(i);
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        holder.itemView.setTag(item);
        View view = holder.f110385OooO0O0;
        view.setTag(item);
        view.setVisibility(item.f110916OooO0OO ? 0 : 8);
        C32447OooOOo c32447OooOOo = f110379OooO0OO;
        boolean z = item.f110915OooO0O0;
        ImageView imageView = holder.f110384OooO00o;
        Uri uri = item.f110914OooO00o;
        if (z) {
            com.bumptech.glide.OooO0OO.OooO0Oo(imageView.getContext()).OooO00o(PictureDrawable.class).OoooO(new C30941OooO0O0()).o000oOoO(uri).OooO00o((C25291OooO0oO) c32447OooOOo.getValue()).OoooO0(imageView);
        } else {
            com.bumptech.glide.OooO0OO.OooO0Oo(imageView.getContext()).OooO0oO(uri).OooO00o((C25291OooO0oO) c32447OooOOo.getValue()).OoooO0(imageView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_preview_image_added_to_stickers_in_creation, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0OO(this, viewOooO0OO);
    }
}
