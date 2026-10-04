package o0oOOooO;

import OooOoO.C20504OooO0O0;
import OooOoOO.C20519OooO0Oo;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import o00o00oO.C25291OooO0oO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o0oOOooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30885OooO0o0 extends AbstractC22050OooOo0o<Uri, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32447OooOOo f110364OooO0O0 = C20519OooO0Oo.OooO0OO(new C30883OooO0Oo());

    /* JADX INFO: renamed from: o0oOOooO.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f110365OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(Uri uri, Uri uri2) {
            return uri.equals(uri2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(Uri uri, Uri uri2) {
            return uri.equals(uri2);
        }
    }

    /* JADX INFO: renamed from: o0oOOooO.OooO0o0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {
        public OooO0O0() {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        Uri uriOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(uriOooO0OO, "getItem(...)");
        Uri uri = uriOooO0OO;
        holder.itemView.setTag(uri);
        View view = holder.itemView;
        kotlin.jvm.internal.OooOOO0.OooO0o0(view, "null cannot be cast to non-null type android.widget.ImageView");
        com.bumptech.glide.OooO0OO.OooO0Oo(holder.itemView.getContext()).OooO0oO(uri).OooO00o((C25291OooO0oO) f110364OooO0O0.getValue()).OooO().OoooO0((ImageView) view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_preview_image_added_to_stickers, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
