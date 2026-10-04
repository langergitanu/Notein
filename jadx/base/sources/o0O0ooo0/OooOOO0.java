package o0O0ooo0;

import Oooo0.o000000O;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.p609vo.PenVO;
import o000O00O.C24397OooOo0;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0o0o.ViewOnClickListenerC28244OooOo0o;
import o0OoO0oo.C28720Oooo0O0;
import o0OoO0oo.C28971o0OO00O;
import o0Ooo.C29263OooOO0o;
import o0Ooo.C29310OoooOOO;
import o0o00OOO.DialogC29885OooO0O0;
import o0o00OOO.InterfaceC29884OooO00o;
import o0o00Oo.C29901OooO0oo;
import o0o00oOo.C30037OooOO0;
import o0o0O00.C30201OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooOOO0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89680OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89681OooOo0o;

    public /* synthetic */ OooOOO0(Object obj, int i) {
        this.f89681OooOo0o = i;
        this.f89680OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        InterfaceC29884OooO00o c28720Oooo0O0;
        int i = 4;
        Object obj = this.f89680OooOo;
        switch (this.f89681OooOo0o) {
            case 0:
                ((InterfaceC32507OooOO0o) obj).invoke("");
                return C32460OooOooO.f116667OooO00o;
            case 1:
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                final PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) obj;
                Integer num = (Integer) penBoxChildFragment.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                if (num == null) {
                    C34406OooO00o.f123390OooO00o.OooO00o("smoothSwitchToIconMode: position is null", new Object[0]);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
                    valueAnimatorOfFloat.setDuration(0L);
                    return valueAnimatorOfFloat;
                }
                final int iIntValue = num.intValue();
                PenVO penVO = (PenVO) penBoxChildFragment.Oooo0o().f75176Oooo0o0.f121747OooOo0o.getValue();
                if (penVO == null) {
                    C34406OooO00o.f123390OooO00o.OooO00o("smoothSwitchToIconMode: pen is null", new Object[0]);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f);
                    valueAnimatorOfFloat2.setDuration(0L);
                    return valueAnimatorOfFloat2;
                }
                View view = penBoxChildFragment.f75365Oooo00O;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ViewParent parent = view.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                final int width = ((ViewGroup) parent).getWidth();
                final float fOooO0o0 = o000000O.OooO0o0(16.0f);
                C29901OooO0oo c29901OooO0oo = penBoxChildFragment.f75375OoooO00;
                new C29263OooOO0o(penBoxChildFragment, c29901OooO0oo.OooO0o(penVO), penVO.getType(), c29901OooO0oo.OooO0oO(penVO), penVO.getColor()).invoke();
                int iOooO0o = o000000O.OooO0o(48);
                int iOooO0o2 = o000000O.OooO0o(60) + (iOooO0o * 2);
                View view2 = penBoxChildFragment.f75376OoooO0O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = -2;
                marginLayoutParams.setMarginStart(iOooO0o);
                View view3 = penBoxChildFragment.f75376OoooO0O;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
                view3.setLayoutParams(marginLayoutParams);
                View view4 = penBoxChildFragment.f75376OoooO0O;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
                view4.requestLayout();
                View view5 = penBoxChildFragment.f75376OoooO0O;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
                view5.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo.OooOo00
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i3 = PenBoxChildFragment.f75355o0000Ooo;
                        float fFloatValue = ((Float) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        PenBoxChildFragment penBoxChildFragment2 = penBoxChildFragment;
                        View view6 = penBoxChildFragment2.f75366Oooo00o;
                        if (view6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
                            throw null;
                        }
                        view6.setAlpha(fFloatValue);
                        View view7 = penBoxChildFragment2.f75363Oooo0;
                        if (view7 != null) {
                            view7.setAlpha(fFloatValue);
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                            throw null;
                        }
                    }
                });
                View view6 = penBoxChildFragment.f75365Oooo00O;
                if (view6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view6.getWidth(), iOooO0o2);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo.OooOo0
                    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i3 = PenBoxChildFragment.f75355o0000Ooo;
                        int iIntValue2 = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                        PenBoxChildFragment penBoxChildFragment2 = penBoxChildFragment;
                        if (penBoxChildFragment2.f75365Oooo00O == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        float f = (r1.getLayoutParams().width - iIntValue2) / 2.0f;
                        boolean zOoooo0o = penBoxChildFragment2.Ooooo0o();
                        int i4 = iIntValue;
                        if (zOoooo0o && penBoxChildFragment2.Oooo0() == PenBoxChildFragment.OooO00o.f75422OooOo0o) {
                            if (i4 == 0 || i4 == 2) {
                                View view7 = penBoxChildFragment2.f75365Oooo00O;
                                if (view7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view7.setX(view7.getX() + f);
                                View view8 = penBoxChildFragment2.f75365Oooo00O;
                                if (view8 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view8.setY(view8.getY() - f);
                                View view9 = penBoxChildFragment2.f75365Oooo00O;
                                if (view9 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view9.getLayoutParams().width = iIntValue2;
                                View view10 = penBoxChildFragment2.f75365Oooo00O;
                                if (view10 != null) {
                                    view10.requestLayout();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                            if (i4 == 4 || i4 == 6) {
                                View view11 = penBoxChildFragment2.f75365Oooo00O;
                                if (view11 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view11.setX(view11.getX() + f);
                                View view12 = penBoxChildFragment2.f75365Oooo00O;
                                if (view12 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view12.setY(view12.getY() + f);
                                View view13 = penBoxChildFragment2.f75365Oooo00O;
                                if (view13 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view13.getLayoutParams().width = iIntValue2;
                                View view14 = penBoxChildFragment2.f75365Oooo00O;
                                if (view14 != null) {
                                    view14.requestLayout();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                        }
                        View view15 = penBoxChildFragment2.f75365Oooo00O;
                        if (view15 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view15.setX(view15.getX() + f);
                        View view16 = penBoxChildFragment2.f75365Oooo00O;
                        if (view16 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view16.getLayoutParams().width = iIntValue2;
                        float f2 = fOooO0o0;
                        if (i4 == 0) {
                            View view17 = penBoxChildFragment2.f75365Oooo00O;
                            if (view17 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view17.setX(f2);
                        } else if (i4 == 2 || i4 == 4) {
                            View view18 = penBoxChildFragment2.f75365Oooo00O;
                            if (view18 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view18.setX((width - f2) - iIntValue2);
                        } else if (i4 == 6) {
                        }
                        View view19 = penBoxChildFragment2.f75365Oooo00O;
                        if (view19 != null) {
                            view19.requestLayout();
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                    }
                });
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(iOooO0o2, PenBoxChildFragment.f75352o00000oO);
                valueAnimatorOfInt2.setDuration(100L);
                valueAnimatorOfInt2.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo.OooOo0O
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i3 = PenBoxChildFragment.f75355o0000Ooo;
                        int iIntValue2 = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                        PenBoxChildFragment penBoxChildFragment2 = penBoxChildFragment;
                        if (penBoxChildFragment2.f75365Oooo00O == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        float f = (r1.getLayoutParams().width - iIntValue2) / 2.0f;
                        boolean zOoooo0o = penBoxChildFragment2.Ooooo0o();
                        int i4 = iIntValue;
                        if (zOoooo0o && penBoxChildFragment2.Oooo0() == PenBoxChildFragment.OooO00o.f75422OooOo0o) {
                            if (i4 == 0 || i4 == 2) {
                                View view7 = penBoxChildFragment2.f75365Oooo00O;
                                if (view7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view7.setX(view7.getX() + f);
                                View view8 = penBoxChildFragment2.f75365Oooo00O;
                                if (view8 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view8.setY(view8.getY() - f);
                                View view9 = penBoxChildFragment2.f75365Oooo00O;
                                if (view9 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view9.getLayoutParams().width = iIntValue2;
                                View view10 = penBoxChildFragment2.f75365Oooo00O;
                                if (view10 != null) {
                                    view10.requestLayout();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                            if (i4 == 4 || i4 == 6) {
                                View view11 = penBoxChildFragment2.f75365Oooo00O;
                                if (view11 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view11.setX(view11.getX() + f);
                                View view12 = penBoxChildFragment2.f75365Oooo00O;
                                if (view12 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view12.setY(view12.getY() + f);
                                View view13 = penBoxChildFragment2.f75365Oooo00O;
                                if (view13 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view13.getLayoutParams().width = iIntValue2;
                                View view14 = penBoxChildFragment2.f75365Oooo00O;
                                if (view14 != null) {
                                    view14.requestLayout();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                        }
                        View view15 = penBoxChildFragment2.f75365Oooo00O;
                        if (view15 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view15.setX(view15.getX() + f);
                        View view16 = penBoxChildFragment2.f75365Oooo00O;
                        if (view16 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view16.getLayoutParams().width = iIntValue2;
                        int i5 = ((iIntValue2 - PenBoxChildFragment.f75352o00000oO) / 2) + PenBoxChildFragment.f75351o0000;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                        marginLayoutParams2.setMarginStart(i5);
                        View view17 = penBoxChildFragment2.f75376OoooO0O;
                        if (view17 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                            throw null;
                        }
                        view17.setLayoutParams(marginLayoutParams2);
                        View view18 = penBoxChildFragment2.f75376OoooO0O;
                        if (view18 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                            throw null;
                        }
                        view18.requestLayout();
                        float f2 = fOooO0o0;
                        if (i4 == 0) {
                            View view19 = penBoxChildFragment2.f75365Oooo00O;
                            if (view19 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view19.setX(f2);
                        } else if (i4 == 2 || i4 == 4) {
                            View view20 = penBoxChildFragment2.f75365Oooo00O;
                            if (view20 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view20.setX((width - f2) - iIntValue2);
                        } else if (i4 == 6) {
                        }
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
                animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat3);
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(animatorSet, valueAnimatorOfInt2);
                animatorSet2.addListener(new C29310OoooOOO(penBoxChildFragment, marginLayoutParams));
                return animatorSet2;
            case 2:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) obj;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                    Context contextRequireContext2 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                    DialogC29885OooO0O0 dialogC29885OooO0O0 = new DialogC29885OooO0O0(contextRequireContext2, R.layout.dialog_bottom_sheet_lock_up_note);
                    View view7 = dialogC29885OooO0O0.f110684OooOo0o;
                    view7.findViewById(R.id.cl_lock_note).setOnClickListener(new ViewOnClickListenerC28244OooOo0o(dialogC29885OooO0O0, i));
                    view7.findViewById(R.id.cl_remove_lock_for_note).setOnClickListener(new ViewOnClickListenerC26036Oooo(dialogC29885OooO0O0, i));
                    c28720Oooo0O0 = dialogC29885OooO0O0;
                } else {
                    Context contextRequireContext3 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
                    c28720Oooo0O0 = new C28720Oooo0O0(contextRequireContext3);
                }
                c28720Oooo0O0.OooOOo0(new C24397OooOo0(baseToolbarChildFragment));
                return c28720Oooo0O0;
            default:
                Context contextRequireContext4 = ((C30201OooOOO0) obj).f107547OooO00o.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext4, "requireContext(...)");
                return new C30037OooOO0(contextRequireContext4);
        }
    }
}
