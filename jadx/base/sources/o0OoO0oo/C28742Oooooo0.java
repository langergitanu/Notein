package o0OoO0oo;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.DualLinkSourceConverter;
import com.orion.notein.data.p602db.entity.DualLinkSourceEntity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import java.util.ArrayList;
import java.util.List;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0ooO.ViewOnClickListenerC28407OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoO0OO.ViewOnClickListenerC28609OooO0oO;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import o0OoOO00.ViewOnClickListenerC28989OooO00o;
import o0OoOOo0.C29185OooO0o;
import o0Ooo0oo.C29553o00O0O;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import o0o000oO.C29789OooOOO0;
import o0o000oO.ViewOnClickListenerC29777OooO00o;
import o0o000oO.ViewOnClickListenerC29781OooO0o;
import o0o000oO.ViewOnClickListenerC29783OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28742Oooooo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101791OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101792OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f101793OooOoO0;

    public /* synthetic */ C28742Oooooo0(int i, Object obj, Object obj2) {
        this.f101792OooOo0o = i;
        this.f101791OooOo = obj;
        this.f101793OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        String strO000OoO;
        int i;
        int i2;
        int i3;
        Float fValueOf;
        int i4;
        switch (this.f101792OooOo0o) {
            case 0:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                final TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) it;
                InterfaceC21987OooOoo viewLifecycleOwner = ((NoteEditorContainerFragment) this.f101793OooOoO0).getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                View view = (View) this.f101791OooOo;
                textStyleBarChildFragment.f76431OooOooO = viewLifecycleOwner;
                textStyleBarChildFragment.f76432OooOooo = (ConstraintLayout) view.findViewById(R.id.text_style_bar);
                final View viewFindViewById = view.findViewById(R.id.cl_text_style_bar_container);
                textStyleBarChildFragment.f76449OoooOOO = 0;
                textStyleBarChildFragment.f76450OoooOOo = 0;
                textStyleBarChildFragment.f76451OoooOo0 = false;
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0o000oO.OooO0OO
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                        int iOooO0o;
                        boolean z;
                        int width = view2.getWidth();
                        TextStyleBarChildFragment textStyleBarChildFragment2 = textStyleBarChildFragment;
                        int i13 = textStyleBarChildFragment2.f76449OoooOOO;
                        View view3 = viewFindViewById;
                        int id = 0;
                        if (width != i13) {
                            Context context = textStyleBarChildFragment2.getContext();
                            C32443OooOOO<Integer, Integer> c32443OooOOOOooO00o = context != null ? C28038OooO0Oo.OooO00o(context) : null;
                            int iOooO0OO = c32443OooOOOOooO00o != null ? o000000O.OooO0OO(c32443OooOOOOooO00o.f116638OooOo0o.intValue()) : 0;
                            int iOooO0OO2 = c32443OooOOOOooO00o != null ? o000000O.OooO0OO(c32443OooOOOOooO00o.f116637OooOo.intValue()) : 0;
                            int iOooO0o2 = (iOooO0OO < 600 || iOooO0OO2 < 600) ? (iOooO0OO < 480 || iOooO0OO2 < 480) ? o000000O.OooO0o(StyleIdentifier.LIST_TABLE_3_ACCENT_2) : o000000O.OooO0o(392) : Math.min(o000000O.OooO0o(iOooO0OO), o000000O.OooO0o(iOooO0OO2));
                            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
                            int i14 = (width - iOooO0o2) / 2;
                            if (i14 <= 0) {
                                i14 = 0;
                            }
                            oooO00o.setMarginStart(i14);
                            view3.setLayoutParams(oooO00o);
                        }
                        int width2 = view3.getWidth();
                        if (width != textStyleBarChildFragment2.f76449OoooOOO || width2 != textStyleBarChildFragment2.f76450OoooOOo) {
                            textStyleBarChildFragment2.f76451OoooOo0 = false;
                        }
                        if (!textStyleBarChildFragment2.f76451OoooOo0) {
                            Rect rect = new Rect();
                            RecyclerView recyclerView = textStyleBarChildFragment2.f76442Oooo0oO;
                            if (recyclerView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextStyle");
                                throw null;
                            }
                            recyclerView.getGlobalVisibleRect(rect);
                            int iOooO0OO3 = o000000O.OooO0OO((((width - rect.left) - o000000O.OooO0o(24)) - o000000O.OooO0o(24)) - o000000O.OooO0o(14)) / 34;
                            if (iOooO0OO3 >= 6) {
                                iOooO0o = o000000O.OooO0o(204);
                                z = true;
                            } else {
                                iOooO0o = o000000O.OooO0o(iOooO0OO3 * 34);
                                z = false;
                            }
                            RecyclerView recyclerView2 = textStyleBarChildFragment2.f76442Oooo0oO;
                            if (recyclerView2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextStyle");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams2 = recyclerView2.getLayoutParams();
                            layoutParams2.width = iOooO0o;
                            RecyclerView recyclerView3 = textStyleBarChildFragment2.f76442Oooo0oO;
                            if (recyclerView3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextStyle");
                                throw null;
                            }
                            recyclerView3.setLayoutParams(layoutParams2);
                            RecyclerView recyclerView4 = textStyleBarChildFragment2.f76442Oooo0oO;
                            if (recyclerView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvTextStyle");
                                throw null;
                            }
                            recyclerView4.setVisibility(z ? 0 : 8);
                            ImageView imageView = textStyleBarChildFragment2.f76433Oooo;
                            if (imageView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreStyle");
                                throw null;
                            }
                            imageView.setVisibility(z ? 0 : 8);
                            ImageView imageView2 = textStyleBarChildFragment2.f76443Oooo0oo;
                            if (imageView2 != null) {
                                imageView2.setVisibility(z ? 8 : 0);
                            }
                            ImageView imageView3 = textStyleBarChildFragment2.f76446OoooO00;
                            if (imageView3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivCloseTextBoxStyle");
                                throw null;
                            }
                            ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams3;
                            if (z) {
                                ImageView imageView4 = textStyleBarChildFragment2.f76433Oooo;
                                if (imageView4 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("ivMoreStyle");
                                    throw null;
                                }
                                id = imageView4.getId();
                            } else {
                                ImageView imageView5 = textStyleBarChildFragment2.f76443Oooo0oo;
                                if (imageView5 != null) {
                                    id = imageView5.getId();
                                }
                            }
                            oooO00o2.f63894OooOOoo = id;
                            oooO00o2.setMarginStart(o000000O.OooO0o(14));
                            ImageView imageView6 = textStyleBarChildFragment2.f76446OoooO00;
                            if (imageView6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("ivCloseTextBoxStyle");
                                throw null;
                            }
                            imageView6.setLayoutParams(oooO00o2);
                            textStyleBarChildFragment2.f76451OoooOo0 = true;
                        }
                        textStyleBarChildFragment2.f76449OoooOOO = width;
                        textStyleBarChildFragment2.f76450OoooOOo = width2;
                    }
                });
                textStyleBarChildFragment.f76436Oooo00O = (ConstraintLayout) view.findViewById(R.id.cl_text_box_font_style);
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_text_box);
                imageView.setOnClickListener(new ViewOnClickListenerC29781OooO0o(textStyleBarChildFragment, 0));
                textStyleBarChildFragment.f76435Oooo000 = imageView;
                TextView textView = (TextView) view.findViewById(R.id.tv_text_box_font);
                textView.setOnClickListener(new ViewOnClickListenerC28407OooO00o(textStyleBarChildFragment, 2));
                textStyleBarChildFragment.f76437Oooo00o = textView;
                TextView textView2 = (TextView) view.findViewById(R.id.tv_text_box_font_size);
                textView2.setOnClickListener(new ViewOnClickListenerC28408OooO0O0(textStyleBarChildFragment, 4));
                textStyleBarChildFragment.f76434Oooo0 = textView2;
                TextView textView3 = (TextView) view.findViewById(R.id.tv_text_box_line_height);
                textView3.setOnClickListener(new ViewOnClickListenerC28609OooO0oO(textStyleBarChildFragment, 1));
                textStyleBarChildFragment.f76438Oooo0O0 = textView3;
                textStyleBarChildFragment.f76439Oooo0OO = (ConstraintLayout) view.findViewById(R.id.cl_text_box_color);
                RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_font_color_list);
                recyclerView.setItemAnimator(null);
                C29553o00O0O c29553o00O0O = textStyleBarChildFragment.f76448OoooOO0;
                recyclerView.setAdapter(c29553o00O0O);
                c29553o00O0O.f104835OooO0Oo = new ViewOnClickListenerC28610OooO0oo(textStyleBarChildFragment, 2);
                ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_star_text_color);
                imageView2.setOnClickListener(new ViewOnClickListenerC29783OooO0oO(0, viewLifecycleOwner, textStyleBarChildFragment));
                textStyleBarChildFragment.f76441Oooo0o0 = imageView2;
                textStyleBarChildFragment.f76440Oooo0o = (ConstraintLayout) view.findViewById(R.id.cl_text_box_style);
                RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_text_style);
                recyclerView2.setItemAnimator(null);
                C29185OooO0o c29185OooO0o = textStyleBarChildFragment.f76444OoooO;
                recyclerView2.setAdapter(c29185OooO0o);
                c29185OooO0o.f103511OooO0OO = new ViewOnClickListenerC29578OooO00o(textStyleBarChildFragment, 1);
                textStyleBarChildFragment.f76442Oooo0oO = recyclerView2;
                ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_full_style_replace_rv);
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new ViewOnClickListenerC29777OooO00o(textStyleBarChildFragment, 0));
                } else {
                    imageView3 = null;
                }
                textStyleBarChildFragment.f76443Oooo0oo = imageView3;
                ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_more_style);
                imageView4.setOnClickListener(new ViewOnClickListenerC28583o0000OoO(textStyleBarChildFragment, 2));
                textStyleBarChildFragment.f76433Oooo = imageView4;
                ImageView imageView5 = (ImageView) view.findViewById(R.id.iv_close_text_box_style);
                imageView5.setOnClickListener(new ViewOnClickListenerC28586o0000o0(textStyleBarChildFragment, 3));
                textStyleBarChildFragment.f76446OoooO00 = imageView5;
                textStyleBarChildFragment.f76445OoooO0 = (ConstraintLayout) view.findViewById(R.id.cl_full_style);
                ImageView imageView6 = (ImageView) view.findViewById(R.id.iv_full_style);
                if (imageView6 != null) {
                    imageView6.setOnClickListener(new ViewOnClickListenerC28603OooO00o(textStyleBarChildFragment, 3));
                } else {
                    imageView6 = null;
                }
                textStyleBarChildFragment.f76447OoooO0O = imageView6;
                ImageView imageView7 = (ImageView) view.findViewById(R.id.iv_close_text_box_style_small);
                if (imageView7 != null) {
                    imageView7.setOnClickListener(new ViewOnClickListenerC28989OooO00o(textStyleBarChildFragment, 2));
                }
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29789OooOOO0(textStyleBarChildFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            default:
                DualLinkSourceConverter dualLinkSourceConverter = ((oo0oO0.o00000) this.f101791OooOo).f125104OooO0OO;
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from DualLinkSourceEntity where note_id = ?");
                String str = (String) this.f101793OooOoO0;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "note_id");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "page_id");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO0Oo5 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bounds");
                    int iOooO0Oo6 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "text_bounds");
                    int iOooO0Oo7 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "ref_id");
                    int iOooO0Oo8 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "ref_note_id");
                    int iOooO0Oo9 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "creation_time");
                    int iOooO0Oo10 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "last_modification_time");
                    int iOooO0Oo11 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "left");
                    int iOooO0Oo12 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "top");
                    int iOooO0Oo13 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "right");
                    int iOooO0Oo14 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "bottom");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = null;
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3)) {
                            strO000OoO = null;
                            i2 = iOooO0Oo2;
                            i = iOooO0Oo3;
                        } else {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                            i = iOooO0Oo3;
                            i2 = iOooO0Oo2;
                        }
                        int i5 = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo4);
                        RectF rectFStringToRect = dualLinkSourceConverter.stringToRect(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo5));
                        List<RectF> listStringToRectList = dualLinkSourceConverter.stringToRectList(interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo6) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo6));
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo7) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo7);
                        String strO000OoO5 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo8) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo8);
                        long j = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo9);
                        long j2 = interfaceC24749OooO0OoO0ooOOo.getLong(iOooO0Oo10);
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo11)) {
                            i3 = i5;
                            fValueOf = null;
                        } else {
                            i3 = i5;
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo11));
                        }
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo12) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo12));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo13) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(iOooO0Oo13));
                        int i6 = iOooO0Oo14;
                        if (interfaceC24749OooO0OoO0ooOOo.isNull(i6)) {
                            i4 = iOooO0Oo4;
                        } else {
                            i4 = iOooO0Oo4;
                            fValueOf2 = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(i6));
                        }
                        arrayList.add(new DualLinkSourceEntity(strO000OoO2, strO000OoO3, strO000OoO, i3, rectFStringToRect, listStringToRectList, strO000OoO4, strO000OoO5, j, j2, fValueOf, fValueOf3, fValueOf4, fValueOf2));
                        iOooO0Oo4 = i4;
                        iOooO0Oo14 = i6;
                        iOooO0Oo2 = i2;
                        iOooO0Oo3 = i;
                        break;
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
