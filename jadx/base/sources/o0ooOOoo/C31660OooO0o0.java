package o0ooOOoo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.OooOOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28240OooOOo0;
import o0OoO.OooO;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29196OooO0OO;
import o0OoOo00.C29200OooO00o;
import o0OoOo00.C29204OooO0o;
import o0Ooo000.ViewOnClickListenerC29364Oooo0OO;
import o0Ooo00O.ViewOnClickListenerC29368OooO0OO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0ooOOoo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31660OooO0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ViewGroup f113163OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final View f113164OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC31656OooO0O0 f113165OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RecyclerView f113166OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C29200OooO00o f113167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C29204OooO0o f113168OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ViewGroup f113169OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f113170OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final View f113171OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final View f113172OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final View f113173OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f113174OooOO0o;

    /* JADX INFO: renamed from: o0ooOOoo.OooO0o0$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        public final void OooO00o(C29196OooO0OO c29196OooO0OO) {
            InterfaceC31656OooO0O0 interfaceC31656OooO0O0 = C31660OooO0o0.this.f113165OooO0O0;
            if (interfaceC31656OooO0O0 != null) {
                interfaceC31656OooO0O0.OooO0O0(c29196OooO0OO);
            }
        }
    }

    public C31660OooO0o0(View view) {
        OooOOO0.OooO0oO(view, "view");
        this.f113164OooO00o = view;
        TextView textView = (TextView) view.findViewById(R.id.btn_edit);
        this.f113170OooO0oO = textView;
        int i = 2;
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC29364Oooo0OO(this, i));
        View viewFindViewById = view.findViewById(R.id.btn_add_audio_file);
        this.f113171OooO0oo = viewFindViewById;
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new OooO(this, i));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_audio_file);
        this.f113166OooO0OO = recyclerView;
        recyclerView.addItemDecoration(new OooOOOO(view.getContext()));
        C29200OooO00o c29200OooO00o = new C29200OooO00o(C29200OooO00o.C19964OooO00o.f103569OooO00o);
        this.f113167OooO0Oo = c29200OooO00o;
        c29200OooO00o.f103567OooO0O0 = new OooO00o();
        recyclerView.setAdapter(c29200OooO00o);
        new C22041OooOOo(new C31659OooO0o(this)).OooO0o(recyclerView);
        this.f113169OooO0o0 = (ViewGroup) view.findViewById(R.id.ll_play_speed);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_play_speed);
        C29204OooO0o c29204OooO0o = new C29204OooO0o(C29204OooO0o.OooO00o.f103583OooO00o);
        this.f113168OooO0o = c29204OooO0o;
        c29204OooO0o.f103582OooO0O0 = new ViewOnClickListenerC26035OooOooo(this, 5);
        recyclerView2.setAdapter(c29204OooO0o);
        this.f113163OooO = (ViewGroup) view.findViewById(R.id.ll_export_and_delete);
        View viewFindViewById2 = view.findViewById(R.id.btn_delete);
        this.f113172OooOO0 = viewFindViewById2;
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC29368OooO0OO(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.btn_export);
        this.f113173OooOO0O = viewFindViewById3;
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28240OooOOo0(this, 3));
    }

    public final void OooO00o(boolean z) {
        ViewGroup viewGroup = this.f113169OooO0o0;
        ViewGroup viewGroup2 = this.f113163OooO;
        View view = this.f113171OooO0oo;
        View view2 = this.f113164OooO00o;
        TextView textView = this.f113170OooO0oO;
        if (z) {
            textView.setText(view2.getContext().getText(R.string.done));
            view.setVisibility(8);
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(8);
            return;
        }
        textView.setText(view2.getContext().getText(R.string.edit));
        view.setVisibility(0);
        viewGroup2.setVisibility(8);
        viewGroup.setVisibility(0);
    }

    public final void OooO0O0(List<C29196OooO0OO> list, C29194OooO00o c29194OooO00o, boolean z) {
        OooOOO0.OooO0oO(list, "list");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f113174OooOO0o < 50 && !z) {
            return;
        }
        this.f113174OooOO0o = jCurrentTimeMillis;
        List<C29196OooO0OO> list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C29200OooO00o c29200OooO00o = this.f113167OooO0Oo;
            if (!zHasNext) {
                final int itemCount = c29200OooO00o.getItemCount();
                c29200OooO00o.OooO0o0(arrayList, new Runnable() { // from class: o0ooOOoo.OooO0Oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        C31660OooO0o0 c31660OooO0o0 = this;
                        if (itemCount < c31660OooO0o0.f113167OooO0Oo.getItemCount()) {
                            c31660OooO0o0.f113166OooO0OO.scrollToPosition(0);
                        }
                    }
                });
                return;
            }
            C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) it.next();
            boolean z2 = z || !c29200OooO00o.f103568OooO0OO;
            if (OooOOO0.OooO0O0(c29196OooO0OO.f103556OooO00o, c29194OooO00o != null ? c29194OooO00o.f103544OooO00o : null) && z2) {
                List<Float> list3 = c29194OooO00o.f103547OooO0Oo;
                String id = c29196OooO0OO.f103556OooO00o;
                OooOOO0.OooO0oO(id, "id");
                String name = c29196OooO0OO.f103557OooO0O0;
                OooOOO0.OooO0oO(name, "name");
                c29196OooO0OO = new C29196OooO0OO(id, name, c29196OooO0OO.f103558OooO0OO, c29196OooO0OO.f103559OooO0Oo, c29196OooO0OO.f103561OooO0o0, c29196OooO0OO.f103560OooO0o, c29196OooO0OO.f103562OooO0oO, list3);
            }
            arrayList.add(c29196OooO0OO);
        }
    }
}
