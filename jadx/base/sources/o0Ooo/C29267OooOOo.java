package o0Ooo;

import Oooo0.o000000O;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.util.List;
import o0Oo00oO.C28038OooO0Oo;
import o0OoO0oo.C28971o0OO00O;
import o0OoOo.C29194OooO00o;
import o0o000oo.C29818OooOOoo;
import o0o00oOo.C30030OooO0O0;
import o0o0O00.C30201OooOOO0;
import o0ooOOoo.C31657OooO0OO;
import o0ooOOoo.DialogC31655OooO00o;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29267OooOOo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103775OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103776OooOo0o;

    public /* synthetic */ C29267OooOOo(Object obj, int i) {
        this.f103776OooOo0o = i;
        this.f103775OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        InterfaceC31661OooO0oO c31657OooO0OO;
        Object obj = this.f103775OooOo;
        switch (this.f103776OooOo0o) {
            case 0:
                int i = PenBoxChildFragment.f75355o0000Ooo;
                final PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj;
                Integer num = (Integer) penBoxChildFragment.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                if (num == null) {
                    C34406OooO00o.f123390OooO00o.OooO00o("switchToNormalMode: uiPosition is null", new Object[0]);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(0L);
                    return valueAnimatorOfFloat;
                }
                final int iIntValue = num.intValue();
                final float fOooO0o0 = o000000O.OooO0o0(16.0f);
                View view = penBoxChildFragment.f75365Oooo00O;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ViewParent parent = view.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                final int width = ((ViewGroup) parent).getWidth();
                View view2 = penBoxChildFragment.f75365Oooo00O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view2.getWidth(), penBoxChildFragment.Oooo00o());
                View view3 = penBoxChildFragment.f75366Oooo00o;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
                    throw null;
                }
                view3.setVisibility(0);
                View view4 = penBoxChildFragment.f75366Oooo00o;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
                    throw null;
                }
                view4.setAlpha(1.0f);
                View view5 = penBoxChildFragment.f75376OoooO0O;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
                view5.setVisibility(8);
                penBoxChildFragment.OooOoo(false);
                penBoxChildFragment.OooOooO(iIntValue);
                if (penBoxChildFragment.Ooooo0o() && penBoxChildFragment.Oooo0() == PenBoxChildFragment.OooO00o.f75422OooOo0o) {
                    if (iIntValue == 0 || iIntValue == 6) {
                        View view6 = penBoxChildFragment.f75365Oooo00O;
                        if (view6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view6.setRotation(90.0f);
                    }
                    if (iIntValue == 2 || iIntValue == 4) {
                        View view7 = penBoxChildFragment.f75365Oooo00O;
                        if (view7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view7.setRotation(90.0f);
                        View view8 = penBoxChildFragment.f75365Oooo00O;
                        if (view8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view8.setScaleY(-1.0f);
                        RecyclerView recyclerView = penBoxChildFragment.f75381OoooOoO;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                            throw null;
                        }
                        recyclerView.setScaleX(-1.0f);
                        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        ((LinearLayoutManager) layoutManager).setReverseLayout(true);
                        recyclerView.invalidateItemDecorations();
                    }
                }
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo.OooOoO
                    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i2 = PenBoxChildFragment.f75355o0000Ooo;
                        int iIntValue2 = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                        PenBoxChildFragment penBoxChildFragment2 = penBoxChildFragment;
                        if (penBoxChildFragment2.f75365Oooo00O == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        float f = (r1.getLayoutParams().width - iIntValue2) / 2.0f;
                        boolean zOoooo0o = penBoxChildFragment2.Ooooo0o();
                        int i3 = iIntValue;
                        if (zOoooo0o && penBoxChildFragment2.Oooo0() == PenBoxChildFragment.OooO00o.f75422OooOo0o) {
                            if (i3 == 0 || i3 == 2) {
                                View view9 = penBoxChildFragment2.f75365Oooo00O;
                                if (view9 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view9.setX(view9.getX() + f);
                                View view10 = penBoxChildFragment2.f75365Oooo00O;
                                if (view10 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view10.setY(view10.getY() - f);
                                View view11 = penBoxChildFragment2.f75365Oooo00O;
                                if (view11 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view11.getLayoutParams().width = iIntValue2;
                                View view12 = penBoxChildFragment2.f75365Oooo00O;
                                if (view12 != null) {
                                    view12.requestLayout();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                            if (i3 == 4 || i3 == 6) {
                                View view13 = penBoxChildFragment2.f75365Oooo00O;
                                if (view13 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view13.setX(view13.getX() + f);
                                View view14 = penBoxChildFragment2.f75365Oooo00O;
                                if (view14 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view14.setY(view14.getY() + f);
                                View view15 = penBoxChildFragment2.f75365Oooo00O;
                                if (view15 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view15.getLayoutParams().width = iIntValue2;
                                View view16 = penBoxChildFragment2.f75365Oooo00O;
                                if (view16 != null) {
                                    view16.requestLayout();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                        }
                        View view17 = penBoxChildFragment2.f75365Oooo00O;
                        if (view17 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view17.setX(view17.getX() + f);
                        float f2 = fOooO0o0;
                        if (i3 == 0) {
                            View view18 = penBoxChildFragment2.f75365Oooo00O;
                            if (view18 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view18.setX(f2);
                        } else if (i3 == 2 || i3 == 4) {
                            View view19 = penBoxChildFragment2.f75365Oooo00O;
                            if (view19 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view19.setX((width - f2) - iIntValue2);
                        } else if (i3 == 6) {
                        }
                        View view20 = penBoxChildFragment2.f75365Oooo00O;
                        if (view20 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view20.getLayoutParams().width = iIntValue2;
                        View view21 = penBoxChildFragment2.f75365Oooo00O;
                        if (view21 != null) {
                            view21.requestLayout();
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(valueAnimatorOfInt);
                animatorSet.addListener(new C29311OoooOOo(penBoxChildFragment));
                return animatorSet;
            case 1:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) obj;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                    Context contextRequireContext2 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                    c31657OooO0OO = new DialogC31655OooO00o(contextRequireContext2);
                } else {
                    Context contextRequireContext3 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
                    c31657OooO0OO = new C31657OooO0OO(contextRequireContext3);
                }
                c31657OooO0OO.OooO(new C29818OooOOoo(baseToolbarChildFragment, c31657OooO0OO));
                c31657OooO0OO.OooOOoo((List) baseToolbarChildFragment.Oooo000().f74248OooOooo.f121747OooOo0o.getValue(), (C29194OooO00o) baseToolbarChildFragment.Oooo000().f74239OooOo00.f121747OooOo0o.getValue(), true);
                c31657OooO0OO.OooO0Oo((List) baseToolbarChildFragment.Oooo000().f74244OooOoOO.f121747OooOo0o.getValue());
                return c31657OooO0OO;
            default:
                final C30201OooOOO0 c30201OooOOO0 = (C30201OooOOO0) obj;
                Context contextRequireContext4 = c30201OooOOO0.f107547OooO00o.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext4, "requireContext(...)");
                return new C30030OooO0O0(contextRequireContext4, new InterfaceC32508OooOOOo() { // from class: o0o0O00.OooOO0o
                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Object obj2, Object obj3) {
                        String folderId = (String) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
                        c30201OooOOO0.OooO0OO(iIntValue2, folderId);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
        }
    }
}
