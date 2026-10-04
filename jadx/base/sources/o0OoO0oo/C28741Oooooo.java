package o0OoO0oo;

import OooOoOO.C20519OooO0Oo;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.ViewOnClickListenerC22469OooO0o0;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import java.util.LinkedHashMap;
import o000ooo.InterfaceC24747OooO0O0;
import o0O0oOoo.C26188OoooOo0;
import o0Oo0O0.C28050OooO0OO;
import o0OoOoo0.C29226OooO00o;
import o0OoOoo0.C29240OooOOOo;
import o0OoOoo0.C29243OooOOo0;
import o0OoOoo0.ViewOnClickListenerC29233OooO0oo;
import o0OoOoo0.ViewOnClickListenerC29234OooOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oo0oO0.C34897o00o0OO;

/* JADX INFO: renamed from: o0OoO0oo.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28741Oooooo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101788OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101789OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f101790OooOoO0;

    public /* synthetic */ C28741Oooooo(int i, Object obj, Object obj2) {
        this.f101789OooOo0o = i;
        this.f101788OooOo = obj;
        this.f101790OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f101789OooOo0o) {
            case 0:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                final LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = (LatestOpenedNoteTabFragment) it;
                InterfaceC21987OooOoo viewLifecycleOwner = ((NoteEditorContainerFragment) this.f101790OooOoO0).getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                View view = (View) this.f101788OooOo;
                latestOpenedNoteTabFragment.f74472Oooo0 = C21989OooOooO.OooO00o(viewLifecycleOwner);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_tab);
                latestOpenedNoteTabFragment.f74468OooOoo = recyclerView;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvTab");
                    throw null;
                }
                C29226OooO00o c29226OooO00o = latestOpenedNoteTabFragment.f74471OooOooo;
                recyclerView.setAdapter(c29226OooO00o);
                ViewOnClickListenerC29233OooO0oo viewOnClickListenerC29233OooO0oo = new ViewOnClickListenerC29233OooO0oo(latestOpenedNoteTabFragment, viewLifecycleOwner);
                c29226OooO00o.getClass();
                c29226OooO00o.f103627OooO0O0 = viewOnClickListenerC29233OooO0oo;
                C22041OooOOo c22041OooOOo = new C22041OooOOo(new com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o(new C29243OooOOo0(latestOpenedNoteTabFragment), 12));
                RecyclerView recyclerView2 = latestOpenedNoteTabFragment.f74468OooOoo;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvTab");
                    throw null;
                }
                c22041OooOOo.OooO0o(recyclerView2);
                RecyclerView recyclerView3 = latestOpenedNoteTabFragment.f74468OooOoo;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvTab");
                    throw null;
                }
                recyclerView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0OoOoo0.OooO
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        C29226OooO00o c29226OooO00o2 = latestOpenedNoteTabFragment.f74471OooOooo;
                        int width = view2.getWidth();
                        int i9 = c29226OooO00o2.f103628OooO0OO;
                        c29226OooO00o2.f103628OooO0OO = width;
                        if (i9 != width) {
                            c29226OooO00o2.notifyDataSetChanged();
                        }
                    }
                });
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_more_tab);
                latestOpenedNoteTabFragment.f74473Oooo000 = imageView;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivLatestOpenedNoteMore");
                    throw null;
                }
                imageView.setOnClickListener(new ViewOnClickListenerC22469OooO0o0(latestOpenedNoteTabFragment, 2));
                View viewFindViewById = view.findViewById(R.id.iv_tab_enable_fullscreen_mode);
                latestOpenedNoteTabFragment.f74470OooOooO = viewFindViewById;
                if (viewFindViewById == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnFullscreen");
                    throw null;
                }
                C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC29234OooOO0(latestOpenedNoteTabFragment, 0));
                LinkedHashMap linkedHashMap = latestOpenedNoteTabFragment.f74478Oooo0o0;
                linkedHashMap.clear();
                linkedHashMap.put(0, C20519OooO0Oo.OooO0OO(new C26188OoooOo0(latestOpenedNoteTabFragment, 2)));
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29240OooOOOo(view, latestOpenedNoteTabFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                ((C34897o00o0OO) this.f101788OooOo).f125435OooO0Oo.OoooOOO((InterfaceC24747OooO0O0) obj, (PageEntity[]) this.f101790OooOoO0);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
