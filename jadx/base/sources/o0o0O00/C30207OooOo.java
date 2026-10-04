package o0o0O00;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabBottomSheetDialog;
import com.orion.notein.p607ui.widget.EdgeFragment;
import o0O0oooO.C26320o0000OoO;
import o0Oo0o00.ViewOnClickListenerC28147OooO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0o00oOo.C30029OooO00o;
import o0oOo0o0.C30983OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0O00.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30207OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EdgeFragment f107583OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C30191OooO0oO f107584OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C30029OooO00o f107585OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f107586OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public FloatingActionButton f107587OooO0o0;

    /* JADX INFO: renamed from: o0o0O00.OooOo$OooO00o */
    public interface OooO00o {
        void OooO();

        void OooO00o();

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();

        void OooO0o();

        void OooO0o0();

        void OooO0oO();

        void OooO0oo();

        void OooOO0();

        void OooOO0O();

        void OooOO0o();
    }

    /* JADX INFO: renamed from: o0o0O00.OooOo$OooO0O0 */
    public interface OooO0O0 {
        void OooOo0O(OooO00o oooO00o);
    }

    public C30207OooOo(EdgeFragment edgeFragment, C30191OooO0oO c30191OooO0oO) {
        this.f107583OooO00o = edgeFragment;
        this.f107584OooO0O0 = c30191OooO0oO;
    }

    public final void OooO00o(View view, final C26320o0000OoO userViewModel, com.orion.notein.p607ui.notelist.OooO0OO noteListViewModel) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userViewModel, "userViewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteListViewModel, "noteListViewModel");
        this.f107586OooO0Oo = view;
        FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.fab_add);
        this.f107587OooO0o0 = floatingActionButton;
        if (floatingActionButton == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("fab");
            throw null;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener() { // from class: o0o0O00.OooOo0o
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C26320o0000OoO c26320o0000OoO = userViewModel;
                C30207OooOo c30207OooOo = this;
                boolean zBooleanValue = ((Boolean) c26320o0000OoO.f90249OoooOOo.f121747OooOo0o.getValue()).booleanValue();
                if (C30983OooO0o.OooO00o(view2, "getContext(...)")) {
                    FabBottomSheetDialog fabBottomSheetDialog = new FabBottomSheetDialog();
                    fabBottomSheetDialog.f77461OooOoO0 = c30207OooOo.f107584OooO0O0;
                    fabBottomSheetDialog.show(c30207OooOo.f107583OooO00o.getChildFragmentManager(), "NoteListFabBottomSheetDialog");
                    return;
                }
                C30029OooO00o c30029OooO00o = c30207OooOo.f107585OooO0OO;
                if (c30029OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("fabPopupWindow");
                    throw null;
                }
                FloatingActionButton floatingActionButton2 = c30207OooOo.f107587OooO0o0;
                if (floatingActionButton2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("fab");
                    throw null;
                }
                synchronized (c30029OooO00o) {
                    try {
                        int i = 0;
                        if (c30029OooO00o.f106740OooO0Oo.compareAndSet(false, true)) {
                            c30029OooO00o.OooO0O0();
                        }
                        PopupWindow popupWindow = c30029OooO00o.f106739OooO0OO;
                        if (popupWindow == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        View contentView = popupWindow.getContentView();
                        PopupWindow popupWindow2 = c30029OooO00o.f106739OooO0OO;
                        if (popupWindow2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        int width = popupWindow2.getWidth();
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                        PopupWindow popupWindow3 = c30029OooO00o.f106739OooO0OO;
                        if (popupWindow3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        int height = popupWindow3.getHeight();
                        if (height != -2) {
                            i = 1073741824;
                        }
                        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), i));
                        if (zBooleanValue) {
                            Drawable drawable = ContextCompat.getDrawable(c30029OooO00o.f106737OooO00o, R.drawable.ic_ni_vip_12);
                            int iOooO0o = o000000O.OooO0o(6);
                            TextView textView = c30029OooO00o.f106742OooO0o0;
                            if (textView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvCreateInfiniteCanvas");
                                throw null;
                            }
                            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                            TextView textView2 = c30029OooO00o.f106742OooO0o0;
                            if (textView2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvCreateInfiniteCanvas");
                                throw null;
                            }
                            textView2.setCompoundDrawablePadding(iOooO0o);
                            TextView textView3 = c30029OooO00o.f106741OooO0o;
                            if (textView3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportPpt");
                                throw null;
                            }
                            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                            TextView textView4 = c30029OooO00o.f106741OooO0o;
                            if (textView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportPpt");
                                throw null;
                            }
                            textView4.setCompoundDrawablePadding(iOooO0o);
                            TextView textView5 = c30029OooO00o.f106743OooO0oO;
                            if (textView5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportDoc");
                                throw null;
                            }
                            textView5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                            TextView textView6 = c30029OooO00o.f106743OooO0oO;
                            if (textView6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportDoc");
                                throw null;
                            }
                            textView6.setCompoundDrawablePadding(iOooO0o);
                            TextView textView7 = c30029OooO00o.f106744OooO0oo;
                            if (textView7 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportEpub");
                                throw null;
                            }
                            textView7.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                            TextView textView8 = c30029OooO00o.f106744OooO0oo;
                            if (textView8 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportEpub");
                                throw null;
                            }
                            textView8.setCompoundDrawablePadding(iOooO0o);
                            TextView textView9 = c30029OooO00o.f106736OooO;
                            if (textView9 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportCAJ");
                                throw null;
                            }
                            textView9.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                            TextView textView10 = c30029OooO00o.f106736OooO;
                            if (textView10 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportCAJ");
                                throw null;
                            }
                            textView10.setCompoundDrawablePadding(iOooO0o);
                            TextView textView11 = c30029OooO00o.f106745OooOO0;
                            if (textView11 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportXls");
                                throw null;
                            }
                            textView11.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                            TextView textView12 = c30029OooO00o.f106745OooOO0;
                            if (textView12 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportXls");
                                throw null;
                            }
                            textView12.setCompoundDrawablePadding(iOooO0o);
                        } else {
                            TextView textView13 = c30029OooO00o.f106742OooO0o0;
                            if (textView13 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvCreateInfiniteCanvas");
                                throw null;
                            }
                            textView13.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            TextView textView14 = c30029OooO00o.f106741OooO0o;
                            if (textView14 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportPpt");
                                throw null;
                            }
                            textView14.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            TextView textView15 = c30029OooO00o.f106743OooO0oO;
                            if (textView15 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportDoc");
                                throw null;
                            }
                            textView15.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            TextView textView16 = c30029OooO00o.f106744OooO0oo;
                            if (textView16 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportEpub");
                                throw null;
                            }
                            textView16.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            TextView textView17 = c30029OooO00o.f106736OooO;
                            if (textView17 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportCAJ");
                                throw null;
                            }
                            textView17.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            TextView textView18 = c30029OooO00o.f106745OooOO0;
                            if (textView18 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("tvImportXls");
                                throw null;
                            }
                            textView18.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        int iOooO0o2 = (-contentView.getMeasuredWidth()) - o000000O.OooO0o(14);
                        PopupWindow popupWindow4 = c30029OooO00o.f106739OooO0OO;
                        if (popupWindow4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        popupWindow4.showAtLocation(floatingActionButton2, 83, ((int) floatingActionButton2.getX()) + iOooO0o2, o000000O.OooO0o(14));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) view.findViewById(R.id.fab_create_scratch);
        if (floatingActionButton2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("createScratch");
            throw null;
        }
        floatingActionButton2.setOnClickListener(new ViewOnClickListenerC28155OooO0oo(this, 4));
        Context contextRequireContext = this.f107583OooO00o.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f107585OooO0OO = new C30029OooO00o(contextRequireContext, new ViewOnClickListenerC28147OooO(this, 5));
    }

    public final void OooO0O0() {
        C30029OooO00o c30029OooO00o = this.f107585OooO0OO;
        if (c30029OooO00o != null) {
            c30029OooO00o.OooO00o();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("fabPopupWindow");
            throw null;
        }
    }

    public final void OooO0OO(int i, boolean z) {
        try {
            View view = this.f107586OooO0Oo;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("view");
                throw null;
            }
            View viewFindViewById = view.findViewById(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(z ? 0 : 8);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ActionBarDelegate");
            c20358OooO00o.OooO0O0(e);
        }
    }
}
