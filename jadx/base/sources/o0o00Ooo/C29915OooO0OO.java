package o0o00Ooo;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.o00Ooo;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;

/* JADX INFO: renamed from: o0o00Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29915OooO0OO extends AbstractC22050OooOo0o<C29920OooO0oo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106137OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f106138OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Ooo f106139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO0O0 f106140OooO0o0;

    /* JADX INFO: renamed from: o0o00Ooo.OooO0OO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C29920OooO0oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106141OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29920OooO0oo c29920OooO0oo, C29920OooO0oo c29920OooO0oo2) {
            return c29920OooO0oo.equals(c29920OooO0oo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29920OooO0oo c29920OooO0oo, C29920OooO0oo c29920OooO0oo2) {
            return c29920OooO0oo.equals(c29920OooO0oo2);
        }
    }

    /* JADX INFO: renamed from: o0o00Ooo.OooO0OO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f106142OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f106143OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final RecyclerView f106144OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f106145OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final View f106146OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f106147OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ImageView f106148OooO0oO;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.color_set_item);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f106142OooO00o = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f106143OooO0O0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.color_list);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f106144OooO0OO = (RecyclerView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.edit_border);
            OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
            this.f106145OooO0Oo = viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.btn_delete);
            OooOOO0.OooO0o(viewFindViewById5, "findViewById(...)");
            this.f106147OooO0o0 = viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.btn_edit_name);
            OooOOO0.OooO0o(viewFindViewById6, "findViewById(...)");
            this.f106146OooO0o = viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.iv_vip_badge);
            OooOOO0.OooO0o(viewFindViewById7, "findViewById(...)");
            this.f106148OooO0oO = (ImageView) viewFindViewById7;
        }

        public final void OooO00o(boolean z) {
            this.f106145OooO0Oo.setVisibility(z ? 0 : 8);
            this.f106147OooO0o0.setVisibility(z ? 0 : 8);
            this.f106146OooO0o.setVisibility(z ? 0 : 8);
        }
    }

    public C29915OooO0OO() {
        this(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29920OooO0oo c29920OooO0ooOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29920OooO0ooOooO0OO, "getItem(...)");
        C29920OooO0oo c29920OooO0oo = c29920OooO0ooOooO0OO;
        holder.itemView.setTag(c29920OooO0oo);
        holder.f106147OooO0o0.setTag(c29920OooO0oo);
        holder.f106146OooO0o.setTag(c29920OooO0oo);
        View viewFindViewById = holder.itemView.findViewById(R.id.show_press);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(8);
        TextView textView = holder.f106143OooO0O0;
        Integer num = c29920OooO0oo.f106165OooO0oo;
        if (num == null || num.intValue() == 0) {
            textView.setText(c29920OooO0oo.f106159OooO0O0);
        } else {
            textView.setText(holder.itemView.getContext().getString(num.intValue()));
        }
        View view = holder.f106142OooO00o;
        Drawable background = view.getBackground();
        OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) background).setColor(ContextCompat.getColor(view.getContext(), R.color.toolbox_window_color_set_bg_color));
        C29913OooO00o c29913OooO00o = new C29913OooO00o(C29915OooO0OO.this.f106138OooO0OO);
        RecyclerView recyclerView = holder.f106144OooO0OO;
        recyclerView.setAdapter(c29913OooO00o);
        c29913OooO00o.OooO0Oo(c29920OooO0oo.f106160OooO0OO);
        recyclerView.suppressLayout(true);
        holder.f106148OooO0oO.setVisibility(c29920OooO0oo.f106157OooO ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f106137OooO0O0, parent, false);
        OooOOO0.OooO0Oo(viewInflate);
        OooO0O0 oooO0O0 = new OooO0O0(viewInflate);
        final GestureDetector gestureDetector = new GestureDetector(viewInflate.getContext(), new C29916OooO0Oo(viewInflate, oooO0O0, this));
        viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00Ooo.OooO0O0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    View viewFindViewById = view.findViewById(R.id.show_press);
                    OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
                    viewFindViewById.setVisibility(8);
                }
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });
        viewInflate.findViewById(R.id.btn_delete).setOnClickListener(new o0O0oO.OooO0O0(this, 3));
        viewInflate.findViewById(R.id.btn_edit_name).setOnClickListener(new ViewOnClickListenerC28540OooOoOO(this, 3));
        return oooO0O0;
    }

    public /* synthetic */ C29915OooO0OO(int i) {
        this(R.layout.item_color_set, R.layout.item_color_set_color);
    }

    public C29915OooO0OO(int i, int i2) {
        super(OooO00o.f106141OooO00o);
        this.f106137OooO0O0 = i;
        this.f106138OooO0OO = i2;
    }
}
