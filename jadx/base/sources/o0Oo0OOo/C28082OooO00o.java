package o0Oo0OOo;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C21570OoooOoo;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22205OooOOo;
import com.orion.notein.global.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0OOo.C28082OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28407OooO00o;
import o0oOoOo.C31055OooOoOO;

/* JADX INFO: renamed from: o0Oo0OOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28082OooO00o extends AbstractC22050OooOo0o<C31055OooOoOO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28407OooO00o f99534OooO0O0;

    /* JADX INFO: renamed from: o0Oo0OOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19888OooO00o extends OooOOO.AbstractC22036OooO0o0<C31055OooOoOO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19888OooO00o f99535OooO00o = new C19888OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31055OooOoOO c31055OooOoOO, C31055OooOoOO c31055OooOoOO2) {
            return c31055OooOoOO.equals(c31055OooOoOO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31055OooOoOO c31055OooOoOO, C31055OooOoOO c31055OooOoOO2) {
            return OooOOO0.OooO0O0(c31055OooOoOO.f110868OooO00o, c31055OooOoOO2.f110868OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31055OooOoOO c31055OooOoOO, C31055OooOoOO c31055OooOoOO2) {
            C31055OooOoOO c31055OooOoOO3 = c31055OooOoOO;
            C31055OooOoOO c31055OooOoOO4 = c31055OooOoOO2;
            if (OooOOO0.OooO0O0(c31055OooOoOO3.f110868OooO00o, c31055OooOoOO4.f110868OooO00o) && OooOOO0.OooO0O0(c31055OooOoOO3.f110869OooO0O0, c31055OooOoOO4.f110869OooO0O0) && c31055OooOoOO3.f110871OooO0Oo == c31055OooOoOO4.f110871OooO0Oo) {
                if (c31055OooOoOO3.f110872OooO0o == c31055OooOoOO4.f110872OooO0o && c31055OooOoOO3.f110873OooO0o0 != c31055OooOoOO4.f110873OooO0o0) {
                    return C22205OooOOo.OooO0O0("needRefresh", false);
                }
                return C22205OooOOo.OooO0O0("needRefresh", false);
            }
            return C22205OooOOo.OooO0O0("needRefresh", true);
        }
    }

    /* JADX INFO: renamed from: o0Oo0OOo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f99536OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f99537OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f99538OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f99539OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f99540OooO0o0;

        public OooO0O0(C28082OooO00o c28082OooO00o, View view) {
            super(view);
            this.f99536OooO00o = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
            this.f99537OooO0O0 = (TextView) view.findViewById(R.id.other_info);
            View viewFindViewById = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f99538OooO0OO = (TextView) viewFindViewById;
            this.f99539OooO0Oo = (ImageView) view.findViewById(R.id.selected);
            this.f99540OooO0o0 = (ImageView) view.findViewById(R.id.icon);
            ViewOnClickListenerC28407OooO00o viewOnClickListenerC28407OooO00o = c28082OooO00o.f99534OooO0O0;
            if (viewOnClickListenerC28407OooO00o != null) {
                this.itemView.setOnClickListener(viewOnClickListenerC28407OooO00o);
                this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0Oo0OOo.OooO0O0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        C28082OooO00o.OooO0O0 oooO0O0 = this.f99541OooO00o;
                        TextView textView = oooO0O0.f99538OooO0OO;
                        C21570OoooOoo.OooO00o(textView, textView.getText());
                        oooO0O0.f99538OooO0OO.performLongClick();
                        return true;
                    }
                });
            }
        }

        public final void OooO00o(C31055OooOoOO c31055OooOoOO) {
            this.itemView.setTag(c31055OooOoOO);
            this.f99538OooO0OO.setText(c31055OooOoOO.f110869OooO0O0);
            ImageView selected = this.f99539OooO0Oo;
            OooOOO0.OooO0o(selected, "selected");
            boolean z = c31055OooOoOO.f110871OooO0Oo;
            selected.setVisibility(!z ? 0 : 8);
            selected.setSelected(c31055OooOoOO.f110872OooO0o);
            SimpleDateFormat simpleDateFormat = this.f99536OooO00o;
            TextView textView = this.f99537OooO0O0;
            ImageView imageView = this.f99540OooO0o0;
            long j = c31055OooOoOO.f110873OooO0o0;
            if (z) {
                imageView.setImageResource(R.drawable.ic_ni_folder);
                textView.setText(this.itemView.getContext().getString(R.string.storage_dir_last_updated, simpleDateFormat.format(Long.valueOf(j))));
            } else {
                imageView.setImageResource(R.drawable.ic_ni_note);
                textView.setText(simpleDateFormat.format(Long.valueOf(j)));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31055OooOoOO c31055OooOoOOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31055OooOoOOOooO0OO, "getItem(...)");
        holder.OooO00o(c31055OooOoOOOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_cloud_notein_file_used_to_confirm, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
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
            C31055OooOoOO c31055OooOoOOOooO0OO = OooO0OO(i);
            OooOOO0.OooO0o(c31055OooOoOOOooO0OO, "getItem(...)");
            holder.OooO00o(c31055OooOoOOOooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
