package o0o0Oo00;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.OooOOO0;
import o0OoO000.ViewOnClickListenerC28568OooooOO;
import o0o00ooO.ViewOnClickListenerC30140OooO0OO;
import o0oOoOo.C31043OooOOOO;
import o0ooO0O0.C31430OooO00o;

/* JADX INFO: renamed from: o0o0Oo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30602OooO00o extends AbstractC22050OooOo0o<C31043OooOOOO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final SimpleDateFormat f109488OooO0OO = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28568OooooOO f109489OooO0O0;

    /* JADX INFO: renamed from: o0o0Oo00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20116OooO00o extends OooOOO.AbstractC22036OooO0o0<C31043OooOOOO> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31043OooOOOO c31043OooOOOO, C31043OooOOOO c31043OooOOOO2) {
            return c31043OooOOOO.equals(c31043OooOOOO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31043OooOOOO c31043OooOOOO, C31043OooOOOO c31043OooOOOO2) {
            return OooOOO0.OooO0O0(c31043OooOOOO.f110837OooO00o, c31043OooOOOO2.f110837OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0o0Oo00.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f109490OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f109491OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f109492OooO0OO;

        public OooO0O0(View view) {
            super(view);
            this.f109490OooO00o = (ImageView) view.findViewById(R.id.iv_selected);
            this.f109491OooO0O0 = (TextView) view.findViewById(R.id.tv_edited_time);
            this.f109492OooO0OO = (TextView) view.findViewById(R.id.tv_note_history_size);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31043OooOOOO c31043OooOOOOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c31043OooOOOOOooO0OO);
        holder.itemView.setTag(c31043OooOOOOOooO0OO);
        ImageView imageView = holder.f109490OooO00o;
        boolean z = c31043OooOOOOOooO0OO.f110840OooO0Oo;
        imageView.setSelected(z);
        holder.f109491OooO0O0.setText(f109488OooO0OO.format(new Date(c31043OooOOOOOooO0OO.f110839OooO0OO)));
        holder.f109492OooO0OO.setText(C31430OooO00o.OooO0OO(c31043OooOOOOOooO0OO.f110838OooO0O0));
        holder.itemView.setSelected(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_history_version, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC30140OooO0OO(this, 2));
        return new OooO0O0(viewOooO0OO);
    }
}
