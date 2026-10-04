package com.orion.notein.p607ui.noteeditor.penbar;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.appcheck.internal.RunnableC22537OooO0oO;
import com.google.firebase.sessions.C22798OooO0o0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.penbar.OooO0O0;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000OO00.C24456OooOOOo;
import o000OO00.C24459OooOOo0;
import o000o00.AbstractC24555OooO00o;
import o00oo0Oo.C25707OooOoO0;
import o0O0oooO.C26320o0000OoO;
import o0OOOoo0.C27216OooO0Oo;
import o0Oo.C28016OooO0o0;
import o0Oo00o.C28026OooO0OO;
import o0Oo0oOo.C28334OooOooO;
import o0OoO000.C28546Oooo00O;
import o0OoO0oo.C28767o0000Oo0;
import o0OoO0oo.C28836o00O0O0o;
import o0OoO0oo.C28971o0OO00O;
import o0OoOOo.C29132OooO0o0;
import o0Ooo0oo.C29439OooO00o;
import o0Ooo0oo.C29457OooOo;
import o0Ooo0oo.C29466OooOoo0;
import o0Ooo0oo.C29470Oooo0;
import o0Ooo0oo.C29473Oooo00o;
import o0Ooo0oo.C29474Oooo0O0;
import o0Ooo0oo.C29480OoooO;
import o0Ooo0oo.C29484OoooOO0;
import o0Ooo0oo.C29485OoooOOO;
import o0Ooo0oo.C29486OoooOOo;
import o0Ooo0oo.C29487OoooOo0;
import o0Ooo0oo.C29488OoooOoO;
import o0Ooo0oo.C29489OoooOoo;
import o0Ooo0oo.C29490Ooooo00;
import o0Ooo0oo.C29491Ooooo0o;
import o0Ooo0oo.C29492OooooO0;
import o0Ooo0oo.C29493OooooOO;
import o0Ooo0oo.C29494OooooOo;
import o0Ooo0oo.C29495Oooooo;
import o0Ooo0oo.C29496Oooooo0;
import o0Ooo0oo.C29497OoooooO;
import o0Ooo0oo.C29498Ooooooo;
import o0Ooo0oo.C29544o000O0oO;
import o0Ooo0oo.C29552o000oOoO;
import o0Ooo0oo.C29553o00O0O;
import o0Ooo0oo.C29554o00Oo0;
import o0Ooo0oo.C29555o00Ooo;
import o0Ooo0oo.InterfaceC29545o000O0oo;
import o0Ooo0oo.RunnableC29459OooOo00;
import o0o00O00.C29869OooO0Oo;
import o0o00Oo.InterfaceC29896OooO0OO;
import o0o00Oo.InterfaceC29898OooO0o;
import o0o00Ooo.OooOO0;
import o0o00o.C29921OooO00o;
import o0o00o.C29922OooO0O0;
import o0o00o.C29925OooO0o0;
import o0o00o.C29926OooO0oO;
import o0o00o.C29927OooO0oo;
import o0o00o.C29928OooOO0o;
import o0o00o0.InterfaceC29932OooO0OO;
import o0o00o0O.C29947OooO0OO;
import o0o00o0O.C29948OooO0Oo;
import o0o00o0O.C29949OooO0o;
import o0o00o0O.C29950OooO0o0;
import o0o00o0O.C29951OooO0oO;
import o0o00o0O.C29952OooO0oo;
import o0o00o0O.C29953OooOO0o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/penbar/PenBarChildFragment;", "Landroidx/fragment/app/Fragment;", "Lo0Ooo0oo/o000O0oo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PenBarChildFragment extends Hilt_PenBarChildFragment implements InterfaceC29545o000O0oo {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75245OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75246OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public InterfaceC21987OooOoo f75247OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f75248OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RecyclerView f75249Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f75250Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f75251Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f75252Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f75253Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ImageView f75254Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f75255Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f75256Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ImageView f75257Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ConstraintLayout f75258Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ConstraintLayout f75259Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public RecyclerView f75260OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ConstraintLayout f75261OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ImageView f75262OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ConstraintLayout f75263OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ImageView f75264OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ImageView f75265OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ImageView f75266OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ImageView f75267OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextView f75268OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ConstraintLayout f75269OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ConstraintLayout f75270Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ConstraintLayout f75271Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ImageView f75272OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ImageView f75273OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ImageView f75274OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public RecyclerView f75275Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ConstraintLayout f75276Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public ImageView f75277OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public ConstraintLayout f75278Ooooooo;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public final C32447OooOOo f75279o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final C32447OooOOo f75280o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f75281o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public final C32447OooOOo f75282o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final C32447OooOOo f75283o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final C32447OooOOo f75284o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public final C32447OooOOo f75285o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final C32447OooOOo f75286o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final C32447OooOOo f75287o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public final C32447OooOOo f75288o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public final C32447OooOOo f75289o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public o0o00o0O.OooOO0O f75290o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public C29949OooO0o f75291o0000O;
    public C29947OooO0OO o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public o0o00o0O.OooO f75292o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public C29951OooO0oO f75293o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.toolbox.OooO00o f75294o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public C29952OooO0oo f75295o0000OO0;

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public final OooO00o f75296o0000OOO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public C29950OooO0o0 f75297o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public o0o00Ooo.OooOO0 f75298o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public C29948OooO0Oo f75299o0000oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public C29953OooOO0o f75300o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public OooOO0.OooO00o f75301o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ConstraintLayout f75302o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public TextView f75303o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public ImageView f75304o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public ImageView f75305o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public ViewGroup f75306o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final C29553o00O0O f75307o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final C29554o00Oo0 f75308o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final LinkedHashMap f75309o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public boolean f75310o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public final boolean f75311o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public int f75312o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public Rect f75313o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public ConstraintLayout f75314o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final C29544o000O0oO f75315o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final C29555o00Ooo f75316o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final C22026ooOO f75317o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f75318oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public final Handler f75319oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ImageView f75320ooOO;

    /* JADX INFO: renamed from: o0000OOo, reason: collision with root package name */
    public static final int f75240o0000OOo = o000000O.OooO0o(80);

    /* JADX INFO: renamed from: o0000Oo0, reason: collision with root package name */
    public static final int f75242o0000Oo0 = o000000O.OooO0o(80);

    /* JADX INFO: renamed from: o0000Oo, reason: collision with root package name */
    public static final int f75241o0000Oo = o000000O.OooO0o(0);

    /* JADX INFO: renamed from: o0000OoO, reason: collision with root package name */
    public static final int f75243o0000OoO = o000000O.OooO0o(0);
    public static final int o0000o0 = o000000O.OooO0o(0);

    /* JADX INFO: renamed from: o0000o0O, reason: collision with root package name */
    public static final int f75244o0000o0O = o000000O.OooO0o(0);

    public /* synthetic */ class OooO extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public static final class OooO00o implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public long f75321OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f75322OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final PointF f75324OooOoO0 = new PointF();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final PointF f75323OooOoO = new PointF();

        public OooO00o() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            if (r14 != 3) goto L75;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View v, MotionEvent event) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            float rawX = event.getRawX();
            float rawY = event.getRawY();
            int action = event.getAction() & 255;
            PointF pointF = this.f75324OooOoO0;
            PointF pointF2 = this.f75323OooOoO;
            PenBarChildFragment penBarChildFragment = PenBarChildFragment.this;
            boolean z = false;
            if (action == 0) {
                this.f75322OooOo0o = false;
                this.f75321OooOo = System.currentTimeMillis();
                pointF.set(rawX, rawY);
                pointF2.set(rawX, rawY);
                View view = penBarChildFragment.f75248OooOooo;
                if (view != null) {
                    view.setPointerIcon(PointerIcon.getSystemIcon(v.getContext(), PointerIconCompat.TYPE_GRABBING));
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (action != 1) {
                if (action == 2) {
                    float f = rawX - pointF2.x;
                    float f2 = rawY - pointF2.y;
                    pointF2.set(rawX, rawY);
                    if (!this.f75322OooOo0o) {
                        int scaledTouchSlop = ViewConfiguration.get(penBarChildFragment.requireContext()).getScaledTouchSlop();
                        float f3 = rawX - pointF.x;
                        float f4 = rawY - pointF.y;
                        float f5 = scaledTouchSlop * scaledTouchSlop;
                        if ((f4 * f4) + (f3 * f3) > f5) {
                            z = true;
                            this.f75322OooOo0o = z;
                            if (z) {
                                View view2 = penBarChildFragment.f75252Oooo00O;
                                if (view2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                    throw null;
                                }
                                view2.setActivated(true);
                                View view3 = penBarChildFragment.f75248OooOooo;
                                if (view3 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                Object parent = view3.getParent();
                                View view4 = parent instanceof View ? (View) parent : null;
                                Integer numValueOf = view4 != null ? Integer.valueOf(view4.getWidth()) : null;
                                View view5 = penBarChildFragment.f75248OooOooo;
                                if (view5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                Object parent2 = view5.getParent();
                                View view6 = parent2 instanceof View ? (View) parent2 : null;
                                Integer numValueOf2 = view6 != null ? Integer.valueOf(view6.getHeight()) : null;
                                if (numValueOf != null && numValueOf2 != null) {
                                    View view7 = penBarChildFragment.f75248OooOooo;
                                    if (view7 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    float x = view7.getX();
                                    View view8 = penBarChildFragment.f75248OooOooo;
                                    if (view8 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    float y = view8.getY();
                                    if (penBarChildFragment.f75248OooOooo == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    float f6 = (-r7.getWidth()) / 2.0f;
                                    float fIntValue = numValueOf.intValue();
                                    if (penBarChildFragment.f75248OooOooo == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    float width = fIntValue - (r10.getWidth() / 2.0f);
                                    View view9 = penBarChildFragment.f75248OooOooo;
                                    if (view9 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    view9.setX(Math.max(f6, Math.min(x + f, width)));
                                    float fIntValue2 = numValueOf2.intValue() * 1.0f;
                                    if (penBarChildFragment.f75248OooOooo == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    float height = fIntValue2 - r0.getHeight();
                                    View view10 = penBarChildFragment.f75248OooOooo;
                                    if (view10 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    view10.setY(Math.max(0.0f, Math.min(y + f2, height)));
                                    penBarChildFragment.Oooo000();
                                    return true;
                                }
                            }
                        } else {
                            float f7 = rawX - pointF2.x;
                            float f8 = rawY - pointF2.y;
                            if ((f8 * f8) + (f7 * f7) > f5) {
                            }
                            this.f75322OooOo0o = z;
                            if (z) {
                            }
                        }
                    }
                }
                return true;
            }
            View view11 = penBarChildFragment.f75252Oooo00O;
            if (view11 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                throw null;
            }
            view11.setActivated(false);
            View view12 = penBarChildFragment.f75248OooOooo;
            if (view12 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view12.setPointerIcon(PointerIcon.getSystemIcon(v.getContext(), 1000));
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f75321OooOo;
            if (jCurrentTimeMillis >= 100 || this.f75322OooOo0o) {
                if (jCurrentTimeMillis < 200) {
                    penBarChildFragment.f75319oo0o0Oo.postDelayed(new RunnableC22537OooO0oO(penBarChildFragment, 1), ((long) 200) - jCurrentTimeMillis);
                    return true;
                }
                penBarChildFragment.Oooo000();
                return true;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBarChildFragment");
            c20358OooO00o.OooO00o("PenBar onTouch: click", new Object[0]);
            View view13 = penBarChildFragment.f75248OooOooo;
            if (view13 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view13.requestFocus();
            penBarChildFragment.Oooo0oO().OooOO0(0);
            return true;
        }
    }

    public static final class OooO0O0 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f75326OooOo;

        public OooO0O0(int i) {
            this.f75326OooOo = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int i9 = PenBarChildFragment.f75240o0000OOo;
            PenBarChildFragment.this.Oooo0oo(this.f75326OooOo, true);
        }
    }

    public static final class OooO0OO implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f75328OooOo;

        public OooO0OO(int i) {
            this.f75328OooOo = i;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int i9 = PenBarChildFragment.f75240o0000OOo;
            PenBarChildFragment.this.Oooo(this.f75328OooOo, true);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooO0Oo, reason: case insensitive filesystem */
    public /* synthetic */ class C23472OooO0Oo extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public /* synthetic */ class OooO0o extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooO0o0, reason: case insensitive filesystem */
    public /* synthetic */ class C23473OooO0o0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Integer, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Integer num) {
            int iIntValue = num.intValue();
            PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.receiver;
            int i = PenBarChildFragment.f75240o0000OOo;
            penBarChildFragment.Oooo0oO().OooOOo0(true, Integer.valueOf(iIntValue));
            penBarChildFragment.Oooooo(11, Integer.valueOf(iIntValue));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23474OooO0oO implements OooOO0.OooO00o {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$initPenColorPopupWindow$1$4$onEyeDropperClicked$1", m80623f = "PenBarChildFragment.kt", m80624l = {617}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PenBarChildFragment f75331OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75332OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PenBarChildFragment penBarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75331OooOo = penBarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75331OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOO0.OooO00o oooO00o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75332OooOo0o;
                PenBarChildFragment penBarChildFragment = this.f75331OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f75332OooOo0o = 1;
                    obj = PenBarChildFragment.OooOoo0(penBarChildFragment, 2, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                if (!((Boolean) obj).booleanValue() && (oooO00o = penBarChildFragment.f75301o000OOo) != null) {
                    oooO00o.OooO00o();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23474OooO0oO() {
        }

        @Override // o0o00Ooo.OooOO0.OooO00o
        public final void OooO00o() {
            PenBarChildFragment penBarChildFragment = PenBarChildFragment.this;
            PenBarChildFragment.OooOoOO(penBarChildFragment);
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(penBarChildFragment), null, null, new OooO00o(penBarChildFragment, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooO0oo, reason: case insensitive filesystem */
    public /* synthetic */ class C23475OooO0oo extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public /* synthetic */ class OooOO0 extends C24019OooOO0o implements oO0O000o.OooO00o<C32460OooOooO> {
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            PenBarChildFragment.OooOoOO((PenBarChildFragment) this.receiver);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public /* synthetic */ class OooOO0O extends C24019OooOO0o implements InterfaceC32507OooOO0o<Boolean, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.receiver;
            int i = PenBarChildFragment.f75240o0000OOo;
            penBarChildFragment.Oooooo(23, bool2);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOO0o, reason: case insensitive filesystem */
    public /* synthetic */ class C23476OooOO0o extends C24019OooOO0o implements InterfaceC32507OooOO0o<Integer, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Integer num) {
            int iIntValue = num.intValue();
            PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.receiver;
            int i = PenBarChildFragment.f75240o0000OOo;
            penBarChildFragment.Oooooo(22, Integer.valueOf(iIntValue));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public /* synthetic */ class OooOOO extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public /* synthetic */ class OooOOO0 extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return PenBarChildFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23477OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23477OooOOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return PenBarChildFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23478OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24456OooOOOo f75335OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23478OooOOo(C24456OooOOOo c24456OooOOOo) {
            super(0);
            this.f75335OooOo0o = c24456OooOOOo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75335OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23479OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23479OooOOo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return PenBarChildFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23480OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75337OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23480OooOOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75337OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75337OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75338OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75338OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75338OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOo0, reason: case insensitive filesystem */
    public static final class C23481OooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75339OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23481OooOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75339OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75339OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PenBarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75341OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75341OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75341OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23482OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28836o00O0O0o f75342OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23482OooOo0O(C28836o00O0O0o c28836o00O0O0o) {
            super(0);
            this.f75342OooOo0o = c28836o00O0O0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75342OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23483OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75343OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23483OooOo0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75343OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75343OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOoO, reason: case insensitive filesystem */
    public /* synthetic */ class C23484OooOoO extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Object, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(Integer num, Object obj) {
            int iIntValue = num.intValue();
            PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.receiver;
            int i = PenBarChildFragment.f75240o0000OOo;
            penBarChildFragment.Oooooo(iIntValue, obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOoO0, reason: case insensitive filesystem */
    public static final class C23485OooOoO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75344OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23485OooOoO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75344OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75344OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PenBarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment$OooOoOO, reason: case insensitive filesystem */
    public /* synthetic */ class C23486OooOoOO extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBarChildFragment.OooOoo0((PenBarChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public PenBarChildFragment() {
        C24456OooOOOo c24456OooOOOo = new C24456OooOOOo(this, 2);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23478OooOOo(c24456OooOOOo));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75246OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23480OooOOoo(interfaceC32440OooOO0OooO0O0), new C23481OooOo0(interfaceC32440OooOO0OooO0O0), new OooOo00(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23482OooOo0O(new C28836o00O0O0o(this, 1)));
        this.f75245OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.class), new C23483OooOo0o(interfaceC32440OooOO0OooO0O02), new C23485OooOoO0(interfaceC32440OooOO0OooO0O02), new OooOo(interfaceC32440OooOO0OooO0O02));
        this.f75309o00ooo = new LinkedHashMap();
        this.f75308o00oO0o = new C29554o00Oo0(C29554o00Oo0.OooO00o.f104840OooO00o);
        int i = 0;
        this.f75307o00oO0O = new C29553o00O0O(i, 3, i);
        this.f75315o0ooOO0 = new C29544o000O0oO(C29544o000O0oO.OooO00o.f104804OooO00o);
        this.f75316o0ooOOo = new C29555o00Ooo(C29555o00Ooo.OooO00o.f104846OooO00o);
        this.f75317o0ooOoO = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooOOOO(), new C23479OooOOo0(), new C23477OooOOOo());
        this.f75313o0Oo0oo = new Rect();
        new Rect();
        this.f75311o0OO00O = true;
        this.f75319oo0o0Oo = new Handler(Looper.getMainLooper());
        this.f75282o000000O = C20519OooO0Oo.OooO0OO(new C28334OooOooO(this, 2));
        this.f75283o000000o = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Ooo0oo.Oooo00O
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i2 = PenBarChildFragment.f75240o0000OOo;
                PenBarChildFragment penBarChildFragment = this.f104552OooOo0o;
                return new C29928OooOO0o(penBarChildFragment.Oooo0oO(), penBarChildFragment.getActivity());
            }
        });
        this.f75280o00000 = C20519OooO0Oo.OooO0OO(new C29473Oooo00o(this, 0));
        this.f75285o00000O0 = C20519OooO0Oo.OooO0OO(new C27216OooO0Oo(this, 1));
        this.f75284o00000O = C20519OooO0Oo.OooO0OO(new C29470Oooo0(this, 0));
        this.f75286o00000OO = C20519OooO0Oo.OooO0OO(new C25707OooOoO0(this, 3));
        this.f75287o00000Oo = C20519OooO0Oo.OooO0OO(new C24459OooOOo0(this, 1));
        this.f75288o00000o0 = C20519OooO0Oo.OooO0OO(new C29439OooO00o(this, 0));
        this.f75289o00000oO = C20519OooO0Oo.OooO0OO(new C22798OooO0o0(this, 2));
        this.f75279o0000 = C20519OooO0Oo.OooO0OO(new C28546Oooo00O(this, 1));
        this.f75296o0000OOO = new OooO00o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
    
        if (r11 == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9 A[PHI: r9 r10
      0x00d9: PHI (r9v9 com.orion.notein.ui.vo.PenVO) = (r9v6 com.orion.notein.ui.vo.PenVO), (r9v10 com.orion.notein.ui.vo.PenVO) binds: [B:43:0x00b9, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r10v7 com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment) = 
      (r10v5 com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment)
      (r10v8 com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment)
     binds: [B:43:0x00b9, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff A[PHI: r9 r10
      0x00ff: PHI (r9v12 com.orion.notein.ui.vo.PenVO) = (r9v9 com.orion.notein.ui.vo.PenVO), (r9v15 com.orion.notein.ui.vo.PenVO) binds: [B:52:0x00df, B:57:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r10v9 com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment) = 
      (r10v7 com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment)
      (r10v12 com.orion.notein.ui.noteeditor.penbar.PenBarChildFragment)
     binds: [B:52:0x00df, B:57:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(PenBarChildFragment penBarChildFragment, PenVO penVO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29474Oooo0O0 c29474Oooo0O0;
        PenBarChildFragment penBarChildFragment2;
        PenVO penVO2;
        penBarChildFragment.getClass();
        if (abstractC32479OooO0OO instanceof C29474Oooo0O0) {
            c29474Oooo0O0 = (C29474Oooo0O0) abstractC32479OooO0OO;
            int i = c29474Oooo0O0.f104559OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29474Oooo0O0.f104559OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29474Oooo0O0 = new C29474Oooo0O0(penBarChildFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c29474Oooo0O0.f104558OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29474Oooo0O0.f104559OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (penVO.getType() == 7) {
                C26320o0000OoO c26320o0000OoOOooo0o = penBarChildFragment.Oooo0o();
                c29474Oooo0O0.f104556OooOo0o = penBarChildFragment;
                c29474Oooo0O0.f104555OooOo = penVO;
                c29474Oooo0O0.f104559OooOoOO = 1;
                objOooOOO0 = c26320o0000OoOOooo0o.OooOOO0(3, c29474Oooo0O0);
            } else if (penVO.getType() != 8) {
                C26320o0000OoO c26320o0000OoOOooo0o2 = penBarChildFragment.Oooo0o();
                c29474Oooo0O0.f104556OooOo0o = penBarChildFragment;
                c29474Oooo0O0.f104555OooOo = penVO;
                c29474Oooo0O0.f104559OooOoOO = 2;
                objOooOOO0 = c26320o0000OoOOooo0o2.OooOOO0(4, c29474Oooo0O0);
                if (objOooOOO0 != enumC32485OooO00o) {
                    PenVO penVO3 = penVO;
                    penBarChildFragment2 = penBarChildFragment;
                    penVO2 = penVO3;
                    if (((Number) objOooOOO0).intValue() != 0) {
                    }
                    if (penVO2.getType() == 11) {
                    }
                }
            } else {
                PenVO penVO4 = penVO;
                penBarChildFragment2 = penBarChildFragment;
                penVO2 = penVO4;
                if (penVO2.getType() == 11) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                penVO2 = c29474Oooo0O0.f104555OooOo;
                penBarChildFragment2 = c29474Oooo0O0.f104556OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Number) objOooOOO0).intValue() != 0) {
                    return Boolean.FALSE;
                }
                if (penVO2.getType() == 11) {
                    C26320o0000OoO c26320o0000OoOOooo0o3 = penBarChildFragment2.Oooo0o();
                    c29474Oooo0O0.f104556OooOo0o = penBarChildFragment2;
                    c29474Oooo0O0.f104555OooOo = penVO2;
                    c29474Oooo0O0.f104559OooOoOO = 3;
                    objOooOOO0 = c26320o0000OoOOooo0o3.OooOOO0(13, c29474Oooo0O0);
                } else if (penVO2.getType() == 10) {
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                penVO2 = c29474Oooo0O0.f104555OooOo;
                penBarChildFragment2 = c29474Oooo0O0.f104556OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Number) objOooOOO0).intValue() != 0) {
                    return Boolean.FALSE;
                }
                if (penVO2.getType() == 10) {
                    if (penVO2.getType() == 12) {
                    }
                    return Boolean.TRUE;
                }
                C26320o0000OoO c26320o0000OoOOooo0o4 = penBarChildFragment2.Oooo0o();
                c29474Oooo0O0.f104556OooOo0o = penBarChildFragment2;
                c29474Oooo0O0.f104555OooOo = penVO2;
                c29474Oooo0O0.f104559OooOoOO = 4;
                objOooOOO0 = c26320o0000OoOOooo0o4.OooOOO0(16, c29474Oooo0O0);
                return enumC32485OooO00o;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Number) objOooOOO0).intValue() != 0) {
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            penVO2 = c29474Oooo0O0.f104555OooOo;
            penBarChildFragment2 = c29474Oooo0O0.f104556OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (((Number) objOooOOO0).intValue() != 0) {
                return Boolean.FALSE;
            }
            if (penVO2.getType() == 12) {
                C26320o0000OoO c26320o0000OoOOooo0o5 = penBarChildFragment2.Oooo0o();
                c29474Oooo0O0.f104556OooOo0o = null;
                c29474Oooo0O0.f104555OooOo = null;
                c29474Oooo0O0.f104559OooOoOO = 5;
                objOooOOO0 = c26320o0000OoOOooo0o5.OooOOO0(47, c29474Oooo0O0);
            }
            return Boolean.TRUE;
        }
        penVO = c29474Oooo0O0.f104555OooOo;
        penBarChildFragment = c29474Oooo0O0.f104556OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO0);
        if (((Number) objOooOOO0).intValue() != 0) {
            return Boolean.FALSE;
        }
        if (penVO.getType() != 8) {
        }
    }

    public static final void OooOoOO(PenBarChildFragment penBarChildFragment) {
        o0o00Ooo.OooOO0 oooOO02 = penBarChildFragment.f75298o0000oO;
        if (oooOO02 != null) {
            oooOO02.dismiss();
        }
        C29952OooO0oo c29952OooO0oo = penBarChildFragment.f75295o0000OO0;
        if (c29952OooO0oo != null) {
            c29952OooO0oo.dismiss();
        }
        C29950OooO0o0 c29950OooO0o0 = penBarChildFragment.f75297o0000Ooo;
        if (c29950OooO0o0 != null) {
            c29950OooO0o0.dismiss();
        }
        C29948OooO0Oo c29948OooO0Oo = penBarChildFragment.f75299o0000oo;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.dismiss();
        }
        o0o00o0O.OooOO0O oooOO0O = penBarChildFragment.f75290o00000oo;
        if (oooOO0O != null) {
            oooOO0O.dismiss();
        }
        C29947OooO0OO c29947OooO0OO = penBarChildFragment.o0000O0;
        if (c29947OooO0OO != null) {
            c29947OooO0OO.dismiss();
        }
        C29951OooO0oO c29951OooO0oO = penBarChildFragment.f75293o0000O0O;
        if (c29951OooO0oO != null) {
            c29951OooO0oO.dismiss();
        }
        C29953OooOO0o c29953OooOO0o = penBarChildFragment.f75300o000OO;
        if (c29953OooOO0o != null) {
            c29953OooOO0o.dismiss();
        }
        C29949OooO0o c29949OooO0o = penBarChildFragment.f75291o0000O;
        if (c29949OooO0o != null) {
            c29949OooO0o.dismiss();
        }
        o0o00o0O.OooO oooO = penBarChildFragment.f75292o0000O00;
        if (oooO != null) {
            oooO.dismiss();
        }
    }

    public static final void OooOoo(PenBarChildFragment penBarChildFragment, View view, boolean z) {
        ConstraintLayout constraintLayout = penBarChildFragment.f75314o0OoOo0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clSelectedPenWidth");
            throw null;
        }
        boolean z2 = true;
        int i = 8;
        constraintLayout.setVisibility(z && kotlin.jvm.internal.OooOOO0.OooO0O0(view, constraintLayout) ? 0 : 8);
        boolean z3 = constraintLayout.getVisibility() == 0;
        ImageView imageView = penBarChildFragment.f75304o00Oo0;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedEraserType");
            throw null;
        }
        imageView.setVisibility((z && kotlin.jvm.internal.OooOOO0.OooO0O0(view, imageView)) ? 0 : 8);
        if (!z3 && imageView.getVisibility() != 0) {
            z2 = false;
        }
        ImageView imageView2 = penBarChildFragment.f75305o00Ooo;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivSelectedLassoType");
            throw null;
        }
        if (z && kotlin.jvm.internal.OooOOO0.OooO0O0(view, imageView2)) {
            i = 0;
        }
        imageView2.setVisibility(i);
        if (z2 || imageView2.getVisibility() == 0) {
            return;
        }
        ConstraintLayout constraintLayout2 = penBarChildFragment.f75314o0OoOo0;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clSelectedPenWidth");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(PenBarChildFragment penBarChildFragment, int i, Continuation continuation) {
        C29480OoooO c29480OoooO;
        boolean zBooleanValue;
        penBarChildFragment.getClass();
        if (continuation instanceof C29480OoooO) {
            c29480OoooO = (C29480OoooO) continuation;
            int i2 = c29480OoooO.f104572OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29480OoooO.f104572OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29480OoooO = new C29480OoooO(penBarChildFragment, continuation);
            }
        }
        C29480OoooO c29480OoooO2 = c29480OoooO;
        Object objShowNonVipFeatureLimitedDialog$default = c29480OoooO2.f104571OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29480OoooO2.f104572OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = penBarChildFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29480OoooO2.f104572OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29480OoooO2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0Ooo0oo.InterfaceC29545o000O0oo
    public final void OooOOO0() {
        Integer num;
        Object next;
        View view;
        View view2;
        PenVO penVO = (PenVO) Oooo0oO().f75176Oooo0o0.f121747OooOo0o.getValue();
        if (penVO == null || (num = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue()) == null) {
            return;
        }
        int iIntValue = num.intValue();
        Iterator it = ((Iterable) Oooo0oO().f75193OooooOo.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((PenWidthVO) next).getSelected()) {
                    break;
                }
            }
        }
        PenWidthVO penWidthVO = (PenWidthVO) next;
        Iterator it2 = ((List) Oooo0oO().f75174Oooo0OO.f121747OooOo0o.getValue()).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (((PenVO) it2.next()).getSelected()) {
                break;
            } else {
                i++;
            }
        }
        Integer num2 = (Integer) Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
        if (num2 != null && num2.intValue() == 1) {
            View view3 = this.f75248OooOooo;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view2 = view3;
        } else {
            if (i >= 0) {
                RecyclerView recyclerView = this.f75249Oooo;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenList");
                    throw null;
                }
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                if ((abstractC22078OooOooOFindViewHolderForAdapterPosition == null || (view = abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView) == null) && (view = this.f75250Oooo0) == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                    throw null;
                }
            } else {
                view = this.f75250Oooo0;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                    throw null;
                }
            }
            view2 = view;
        }
        switch (penVO.getType()) {
            case 0:
            case 1:
                List<PenVO> list = (List) Oooo0oO().f75172Oooo00o.f121747OooOo0o.getValue();
                List<PenColorVO> list2 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PenBarChildFragment");
                    c20358OooO00o.OooO0OO("TOOL_BALLPOINT_PEN, TOOL_FOUNTAIN_PEN penWidthVO is null", new Object[0]);
                    return;
                } else {
                    OoooOOO();
                    C29950OooO0o0 c29950OooO0o0 = this.f75297o0000Ooo;
                    if (c29950OooO0o0 != null) {
                        c29950OooO0o0.OooO0oO(view2, iIntValue, penVO, list, list2, penWidthVO);
                        return;
                    }
                    return;
                }
            case 2:
            case 9:
                List<PenVO> list3 = (List) Oooo0oO().f75173Oooo0O0.f121747OooOo0o.getValue();
                List<PenColorVO> list4 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PenBarChildFragment");
                    c20358OooO00o2.OooO0OO("PEN_HIGHLIGHTER_PEN, PEN_HIGHLIGHTER_PEN_RECT penWidthVO is null", new Object[0]);
                    return;
                } else {
                    o000oOoO();
                    C29948OooO0Oo c29948OooO0Oo = this.f75299o0000oo;
                    if (c29948OooO0Oo != null) {
                        c29948OooO0Oo.OooO0oO(view2, iIntValue, penVO, list3, list4, penWidthVO);
                        return;
                    }
                    return;
                }
            case 3:
                String string = penVO.getExtra().getString("penPressToEraser");
                if (string == null) {
                    string = TelemetryEventStrings.Value.TRUE;
                }
                string.equals(TelemetryEventStrings.Value.TRUE);
                String string2 = penVO.getExtra().getString("eraseHighlighterOnly");
                String str = TelemetryEventStrings.Value.FALSE;
                if (string2 == null) {
                    string2 = TelemetryEventStrings.Value.FALSE;
                }
                string2.equals(TelemetryEventStrings.Value.TRUE);
                String string3 = penVO.getExtra().getString("eraseTapeOnly");
                if (string3 != null) {
                    str = string3;
                }
                str.equals(TelemetryEventStrings.Value.TRUE);
                penVO.getExtra().getFloat("eraserPressure");
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("PenBarChildFragment");
                    c20358OooO00o3.OooO0OO("PEN_ERASER penWidthVO is null", new Object[0]);
                    return;
                } else {
                    view2.setTag(penVO);
                    OoooOO0();
                    C29947OooO0OO c29947OooO0OO = this.o0000O0;
                    if (c29947OooO0OO != null) {
                        c29947OooO0OO.OooO0o0(view2, iIntValue, penWidthVO);
                        return;
                    }
                    return;
                }
            case 4:
                String string4 = penVO.getExtra().getString(C18437z2.f56754h);
                if (string4 == null) {
                    string4 = DrawToolFactory.LASSO_TYPE_FREE;
                }
                String str2 = string4;
                String string5 = penVO.getExtra().getString("filter");
                List listOoooOO0 = string5 != null ? C33599OooOo0O.OoooOO0(string5, new String[]{","}) : C34434OooOoO.f123453OooOo0o;
                String string6 = penVO.getExtra().getString("showDualLinkIcon");
                if (string6 == null) {
                    string6 = TelemetryEventStrings.Value.TRUE;
                }
                List list5 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                view2.setTag(penVO);
                OoooOo0();
                C29951OooO0oO c29951OooO0oO = this.f75293o0000O0O;
                if (c29951OooO0oO != null) {
                    string6.equals(TelemetryEventStrings.Value.TRUE);
                    c29951OooO0oO.OooO0Oo(view2, iIntValue, str2, list5, listOoooOO0, this.f75318oo000o);
                    return;
                }
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                List list6 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("PenBarChildFragment");
                    c20358OooO00o4.OooO0OO("PEN_LASER_PEN penWidthVO is null", new Object[0]);
                    return;
                }
                view2.setTag(penVO);
                OoooOOo();
                C29949OooO0o c29949OooO0o = this.f75291o0000O;
                if (c29949OooO0o != null) {
                    penVO.getColor();
                    c29949OooO0o.OooO0o0(view2, iIntValue, list6, penWidthVO);
                    return;
                }
                return;
            case 8:
                String string7 = penVO.getExtra().getString(C18437z2.f56754h);
                if (string7 != null) {
                    Integer.parseInt(string7);
                }
                List list7 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("PenBarChildFragment");
                    c20358OooO00o5.OooO0OO("PEN_VECTOR_PEN penWidthVO is null", new Object[0]);
                    return;
                } else {
                    view2.setTag(penVO);
                    Ooooo0o();
                    C29953OooOO0o c29953OooOO0o = this.f75300o000OO;
                    if (c29953OooOO0o != null) {
                        c29953OooOO0o.OooO0o(view2, iIntValue, list7, penWidthVO);
                        return;
                    }
                    return;
                }
            case 10:
            case 12:
                List<PenVO> list8 = (List) Oooo0oO().f75169Oooo0.f121747OooOo0o.getValue();
                List<PenColorVO> list9 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o6.OooOOO0("PenBarChildFragment");
                    c20358OooO00o6.OooO0OO("PEN_PENCIL, PEN_RAINBOW penWidthVO is null", new Object[0]);
                    return;
                } else {
                    OoooOoo();
                    o0o00o0O.OooO oooO = this.f75292o0000O00;
                    if (oooO != null) {
                        oooO.OooO0Oo(view2, iIntValue, penVO, list8, list9, penWidthVO);
                        return;
                    }
                    return;
                }
            case 11:
                List<PenColorVO> list10 = (List) Oooo0oO().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o7.OooOOO0("PenBarChildFragment");
                    c20358OooO00o7.OooO0OO("PEN_TAPE_PEN penWidthVO is null", new Object[0]);
                    return;
                } else {
                    view2.setTag(penVO);
                    Ooooo00();
                    o0o00o0O.OooOO0O oooOO0O = this.f75290o00000oo;
                    if (oooOO0O != null) {
                        oooOO0O.OooO0o0(view2, iIntValue, list10, penWidthVO);
                        return;
                    }
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        List<Integer> listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(2);
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        boolean z = false;
        if (view.getVisibility() != 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBarChildFragment");
            c20358OooO00o.OooO00o("checkBeginnerGuide: !isVisible", new Object[0]);
            Oooo00O().OoooO0O(listOooO0oO, false);
            return;
        }
        if (this.f75310o0O0O00) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PenBarChildFragment");
            c20358OooO00o2.OooO00o("checkBeginnerGuide: isAnimating", new Object[0]);
            Oooo00O().OoooO0O(listOooO0oO, false);
            this.f75319oo0o0Oo.postDelayed(new RunnableC29459OooOo00(this, 0), 200L);
            return;
        }
        Integer num = (Integer) Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = Oooo00O();
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        oooO0OOOooo00O.OoooO0O(listOooO0oO, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointF OooOooo() {
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int width = view2 != null ? view2.getWidth() : 0;
        View view3 = this.f75248OooOooo;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent2 = view3.getParent();
        View view4 = parent2 instanceof View ? (View) parent2 : null;
        int height = view4 != null ? view4.getHeight() : 0;
        if (width <= 0 || height <= 0) {
            return null;
        }
        Integer num = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
        if (num == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBarChildFragment");
            c20358OooO00o.OooO0OO("findAnchorPointByPosition: uiPosition is null", new Object[0]);
            return null;
        }
        if (num.intValue() == 9 || num.intValue() == 12 || num.intValue() == 10 || num.intValue() == 11 || num.intValue() == 8) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PenBarChildFragment");
            c20358OooO00o2.OooO00o("findAnchorPointByPosition: uiPosition is moving", new Object[0]);
            return null;
        }
        Integer num2 = (Integer) Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
        C32443OooOOO c32443OooOOO = (num2 != null && num2.intValue() == 1) ? new C32443OooOOO(Integer.valueOf(f75240o0000OOo), Integer.valueOf(f75242o0000Oo0)) : new C32443OooOOO(Integer.valueOf(Oooo0o0(num.intValue())), Integer.valueOf(Oooo0O0(num.intValue())));
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
        View view5 = this.f75248OooOooo;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int i = view5.getLayoutParams().height - iIntValue2;
        Insets insets = (Insets) Oooo00O().f73365OooOo.f121747OooOo0o.getValue();
        int iIntValue3 = num.intValue();
        int i2 = f75243o0000OoO;
        int i3 = f75241o0000Oo;
        if (iIntValue3 == 0) {
            return new PointF((iIntValue2 / 2.0f) + i3, ((iIntValue2 + i) / 2.0f) + i2);
        }
        int iIntValue4 = num.intValue();
        int i4 = f75244o0000o0O;
        int i5 = o0000o0;
        if (iIntValue4 == 1) {
            return new PointF((width / 2.0f) + i5, ((iIntValue2 + i) / 2.0f) + i4);
        }
        if (num.intValue() == 2) {
            return new PointF((width - (iIntValue / 2.0f)) - i3, ((iIntValue2 + i) / 2.0f) + i2);
        }
        if (num.intValue() == 3) {
            return new PointF(((width - (iIntValue2 / 2.0f)) - i5) - (insets != null ? insets.right : 0), ((height + i) / 2.0f) + i4);
        }
        if (num.intValue() == 4) {
            return new PointF((width - (iIntValue / 2.0f)) - i3, ((height - ((iIntValue2 - i) / 2.0f)) - i2) - (insets != null ? insets.bottom : 0));
        }
        if (num.intValue() == 5) {
            return new PointF((width / 2.0f) + i5, ((height - ((iIntValue2 - i) / 2.0f)) - i4) - (insets != null ? insets.bottom : 0));
        }
        if (num.intValue() == 6) {
            return new PointF((iIntValue / 2.0f) + i3, ((height - ((iIntValue2 - i) / 2.0f)) - i2) - (insets != null ? insets.bottom : 0));
        }
        if (num.intValue() == 7) {
            return new PointF((iIntValue2 / 2.0f) + (insets != null ? insets.left : 0) + i5, ((height + i) / 2.0f) + i4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo(int i, boolean z) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o(C20860Ooooooo.OooO0OO(c20358OooO00o, "PenBarChildFragment", "handleUiPositionChanged: ", i), new Object[0]);
        if (!OooooOO()) {
            View view = this.f75248OooOooo;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new OooO0OO(i));
                return;
            } else {
                Oooo(i, true);
                return;
            }
        }
        if (z) {
            OooooOo();
        } else {
            View view2 = this.f75248OooOooo;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (view2.getVisibility() == 0) {
                PointF pointFOooOooo = OooOooo();
                if (pointFOooOooo == null) {
                    c20358OooO00o.OooOOO0("PenBarChildFragment");
                    c20358OooO00o.OooO0OO("smoothMoveToPosition: anchorPoint is null", new Object[0]);
                } else {
                    c20358OooO00o.OooOOO0("PenBarChildFragment");
                    c20358OooO00o.OooO00o("smoothMoveToPosition: anchorPoint: " + pointFOooOooo, new Object[0]);
                    View view3 = this.f75248OooOooo;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    float x = view3.getX();
                    if (this.f75248OooOooo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    float width = (r4.getWidth() / 2.0f) + x;
                    View view4 = this.f75248OooOooo;
                    if (view4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    float y = view4.getY();
                    if (this.f75248OooOooo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    float height = (r9.getHeight() / 2.0f) + y;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pointFOooOooo.x - width);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, pointFOooOooo.y - height);
                    if (width == pointFOooOooo.x && height == pointFOooOooo.y) {
                        c20358OooO00o.OooOOO0("PenBarChildFragment");
                        c20358OooO00o.OooO00o("smoothMoveToPosition: viewX == anchorPoint.x && viewY == anchorPoint.y", new Object[0]);
                    } else {
                        valueAnimatorOfFloat.addUpdateListener(new C29486OoooOOo(this));
                        valueAnimatorOfFloat2.addUpdateListener(new C29487OoooOo0(this));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(200L);
                        animatorSet.setInterpolator(new DecelerateInterpolator());
                        animatorSet.addListener(new C29485OoooOOO(this));
                        C28016OooO0o0 c28016OooO0o0 = new C28016OooO0o0(this, 1);
                        animatorSet.addListener(new C29552o000oOoO(c28016OooO0o0));
                        animatorSet.addListener(new C29484OoooOO0(c28016OooO0o0));
                        animatorSet.start();
                    }
                }
            }
        }
        Oooo0oO().OooO0oo(2);
    }

    public final PenBox.OooOOO Oooo0() {
        return (PenBox.OooOOO) this.f75282o000000O.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo000() {
        char c;
        int i;
        int i2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer numValueOf;
        Integer num4;
        Integer numValueOf2;
        Object next;
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Integer numValueOf3 = view2 != null ? Integer.valueOf(view2.getWidth()) : null;
        View view3 = this.f75248OooOooo;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent2 = view3.getParent();
        View view4 = parent2 instanceof View ? (View) parent2 : null;
        Integer numValueOf4 = view4 != null ? Integer.valueOf(view4.getHeight()) : null;
        if (numValueOf3 == null || numValueOf4 == null) {
            return;
        }
        View view5 = this.f75252Oooo00O;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
            throw null;
        }
        boolean zIsActivated = view5.isActivated();
        int iOooO0o = o000000O.OooO0o(70);
        View view6 = this.f75248OooOooo;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float x = view6.getX();
        View view7 = this.f75248OooOooo;
        if (view7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float y = view7.getY();
        View view8 = this.f75248OooOooo;
        if (view8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int width = view8.getWidth();
        View view9 = this.f75248OooOooo;
        if (view9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int height = view9.getHeight();
        float f = x + (width / 2);
        float f2 = (height / 2) + y;
        View view10 = this.f75248OooOooo;
        if (view10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float rotation = view10.getRotation();
        Matrix matrix = new Matrix();
        matrix.setRotate(-rotation, f, f2);
        float[] fArr = {f, f2};
        matrix.mapPoints(fArr);
        int i3 = zIsActivated ? 9 : 1;
        float f3 = iOooO0o;
        if (y < f3) {
            c = 1;
            i = 0;
            i2 = 2;
            num = numValueOf3;
            num2 = numValueOf4;
            num3 = null;
            if (fArr[0] > (((double) numValueOf3.intValue()) * 0.5d) - (((double) Oooo0o0(i3)) * 0.3d) && fArr[0] < (((double) Oooo0o0(i3)) * 0.3d) + (((double) num.intValue()) * 0.5d)) {
                numValueOf = Integer.valueOf(i3);
            }
            if (numValueOf != null) {
                num4 = numValueOf;
                numValueOf2 = num4;
            } else {
                int i4 = zIsActivated ? 10 : 3;
                if (fArr[i] > num.intValue() - iOooO0o && fArr[c] > (((double) num2.intValue()) * 0.5d) - (((double) Oooo0o0(i4)) * 0.3d)) {
                    num4 = numValueOf;
                    int i5 = i4;
                    if (fArr[c] < (((double) Oooo0o0(i4)) * 0.3d) + (((double) num2.intValue()) * 0.5d)) {
                        numValueOf2 = Integer.valueOf(i5);
                    }
                }
                numValueOf2 = num4;
            }
            if (numValueOf2 == null) {
                int i6 = zIsActivated ? 11 : 5;
                if (y + height > num2.intValue() - iOooO0o && fArr[i] > (((double) num.intValue()) * 0.5d) - (((double) Oooo0o0(i6)) * 0.3d) && fArr[i] < (((double) Oooo0o0(i6)) * 0.3d) + (((double) num.intValue()) * 0.5d)) {
                    numValueOf2 = Integer.valueOf(i6);
                }
            }
            if (numValueOf2 == null) {
                int i7 = zIsActivated ? 12 : 7;
                if (fArr[i] < f3 && fArr[c] > (((double) num2.intValue()) * 0.5d) - (((double) Oooo0o0(i7)) * 0.3d) && fArr[c] < (((double) Oooo0o0(i7)) * 0.3d) + (((double) num2.intValue()) * 0.5d)) {
                    numValueOf2 = Integer.valueOf(i7);
                }
            }
            if (numValueOf2 == null && zIsActivated) {
                numValueOf2 = 8;
            }
            if (numValueOf2 == null) {
                Integer numValueOf5 = Integer.valueOf(i);
                float f4 = fArr[i];
                float f5 = fArr[c];
                C32443OooOOO c32443OooOOO = new C32443OooOOO(numValueOf5, Float.valueOf((f5 * f5) + (f4 * f4)));
                Integer numValueOf6 = Integer.valueOf(i2);
                float fIntValue = (num.intValue() - fArr[i]) * (num.intValue() - fArr[i]);
                float f6 = fArr[c];
                C32443OooOOO c32443OooOOO2 = new C32443OooOOO(numValueOf6, Float.valueOf((f6 * f6) + fIntValue));
                C32443OooOOO c32443OooOOO3 = new C32443OooOOO(4, Float.valueOf(((num2.intValue() - fArr[c]) * (num2.intValue() - fArr[c])) + ((num.intValue() - fArr[i]) * (num.intValue() - fArr[i]))));
                float fIntValue2 = (num2.intValue() - fArr[c]) * (num2.intValue() - fArr[c]);
                float f7 = fArr[i];
                Iterator it = C34444Oooo0O0.OooO0oo(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, new C32443OooOOO(6, Float.valueOf((f7 * f7) + fIntValue2))).entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                        do {
                            Object next2 = it.next();
                            float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                            if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                                next = next2;
                                fFloatValue = fFloatValue2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = num3;
                }
                Map.Entry entry = (Map.Entry) next;
                numValueOf2 = entry != null ? Integer.valueOf(((Number) entry.getKey()).intValue()) : 6;
            }
            Oooo0oO().OooO(numValueOf2.intValue());
        }
        c = 1;
        i = 0;
        i2 = 2;
        num = numValueOf3;
        num2 = numValueOf4;
        num3 = null;
        numValueOf = num3;
        if (numValueOf != null) {
        }
        if (numValueOf2 == null) {
        }
        if (numValueOf2 == null) {
        }
        if (numValueOf2 == null) {
            numValueOf2 = 8;
        }
        if (numValueOf2 == null) {
        }
        Oooo0oO().OooO(numValueOf2.intValue());
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO Oooo00O() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f75246OooOoo0.getValue();
    }

    public final InterfaceC29898OooO0o Oooo00o() {
        return (InterfaceC29898OooO0o) this.f75285o00000O0.getValue();
    }

    public final int Oooo0O0(int i) {
        int iOooO0o = o000000O.OooO0o(50);
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int width = view2 != null ? view2.getWidth() : 0;
        View view3 = this.f75248OooOooo;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent2 = view3.getParent();
        View view4 = parent2 instanceof View ? (View) parent2 : null;
        return (width <= 0 || (view4 != null ? view4.getHeight() : 0) <= 0 || !(i == 0 || i == 2 || i == 4 || i == 6)) ? iOooO0o : f75242o0000Oo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int Oooo0OO(int i) {
        Insets insets;
        if ((i == 3 || i == 7 || i == 10 || i == 12) && (insets = (Insets) Oooo00O().f73365OooOo.f121747OooOo0o.getValue()) != null) {
            return insets.bottom;
        }
        return 0;
    }

    public final C26320o0000OoO Oooo0o() {
        return (C26320o0000OoO) this.f75317o0ooOoO.getValue();
    }

    public final int Oooo0o0(int i) {
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.max_pen_bar_content_width);
        View view2 = this.f75248OooOooo;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent = view2.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        int width = view3 != null ? view3.getWidth() : 0;
        View view4 = this.f75248OooOooo;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent2 = view4.getParent();
        View view5 = parent2 instanceof View ? (View) parent2 : null;
        int height = view5 != null ? view5.getHeight() : 0;
        if (width > 0 && height > 0) {
            if (i != 0) {
                if (i != 10 && i != 12) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 && i != 6) {
                                if (i != 7) {
                                    return width;
                                }
                            }
                        }
                    }
                }
                return height;
            }
            int i2 = width - f75241o0000Oo;
            if (i2 <= dimensionPixelSize) {
                return i2;
            }
        }
        return dimensionPixelSize;
    }

    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 Oooo0oO() {
        return (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0) this.f75245OooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x075f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0oo(final int i, final boolean z) {
        ValueAnimator valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2;
        boolean z2 = this.f75281o000000;
        this.f75281o000000 = false;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "PenBarChildFragment", "handleUiModeChanged: ", i, ", dueToLassoColorChanged: ");
        sbOooO00o.append(z2);
        c20358OooO00o.OooO00o(sbOooO00o.toString(), new Object[0]);
        int i2 = 1;
        if (!OooooOO()) {
            View view = this.f75248OooOooo;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new OooO0O0(i));
                return;
            } else {
                Oooo0oo(i, true);
                return;
            }
        }
        Integer num = (Integer) Oooo0oO().f75157OooOo0.f121747OooOo0o.getValue();
        if (num == null || i != num.intValue()) {
            c20358OooO00o.OooOOO0("PenBarChildFragment");
            c20358OooO00o.OooO0OO("handleUiModeChanged: newMode is not equal to viewModel.uiMode.value", new Object[0]);
            return;
        }
        if (this.f75310o0O0O00) {
            c20358OooO00o.OooOOO0("PenBarChildFragment");
            c20358OooO00o.OooO00o("handleUiModeChanged: isMoveAnimating or isLayoutAnimating", new Object[0]);
            this.f75319oo0o0Oo.postDelayed(new Runnable() { // from class: o0Ooo0oo.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = PenBarChildFragment.f75240o0000OOo;
                    this.f104490OooOo0o.Oooo0oo(i, z);
                }
            }, 200L);
            return;
        }
        int i3 = f75241o0000Oo;
        if (i == 0) {
            C29132OooO0o0 c29132OooO0o0 = z2 ? new C29132OooO0o0(this, i2) : null;
            if (z) {
                c20358OooO00o.OooOOO0("PenBarChildFragment");
                c20358OooO00o.OooO00o("switchToNormalMode", new Object[0]);
                View view2 = this.f75248OooOooo;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                Object parent = view2.getParent();
                View view3 = parent instanceof View ? (View) parent : null;
                int width = view3 != null ? view3.getWidth() : 0;
                View view4 = this.f75248OooOooo;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                Object parent2 = view4.getParent();
                View view5 = parent2 instanceof View ? (View) parent2 : null;
                int height = view5 != null ? view5.getHeight() : 0;
                if (width > 0 && height > 0) {
                    Integer num2 = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                    if (num2 == null) {
                        c20358OooO00o.OooOOO0("PenBarChildFragment");
                        c20358OooO00o.OooO0OO("switchToNormalMode: uiPosition is null", new Object[0]);
                    } else {
                        if (num2.intValue() == 12 || num2.intValue() == 7) {
                            View view6 = this.f75248OooOooo;
                            if (view6 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view6.setRotation(90.0f);
                            View view7 = this.f75248OooOooo;
                            if (view7 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view7.setLayoutDirection(0);
                            ConstraintLayout constraintLayout = this.f75259Oooo0oo;
                            if (constraintLayout == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                throw null;
                            }
                            constraintLayout.setScaleY(-1.0f);
                            ViewGroup viewGroup = this.f75306o00o0O;
                            if (viewGroup == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                throw null;
                            }
                            viewGroup.setRotation(270.0f);
                            View view8 = this.f75252Oooo00O;
                            if (view8 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                throw null;
                            }
                            view8.setScaleY(1.0f);
                            RecyclerView recyclerView = this.f75260OoooO;
                            if (recyclerView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                throw null;
                            }
                            recyclerView.setScaleY(1.0f);
                        } else if (num2.intValue() == 10 || num2.intValue() == 3) {
                            View view9 = this.f75248OooOooo;
                            if (view9 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view9.setRotation(90.0f);
                            View view10 = this.f75248OooOooo;
                            if (view10 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view10.setLayoutDirection(1);
                            ConstraintLayout constraintLayout2 = this.f75259Oooo0oo;
                            if (constraintLayout2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                throw null;
                            }
                            constraintLayout2.setScaleY(1.0f);
                            ViewGroup viewGroup2 = this.f75306o00o0O;
                            if (viewGroup2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                throw null;
                            }
                            viewGroup2.setRotation(0.0f);
                            View view11 = this.f75252Oooo00O;
                            if (view11 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                throw null;
                            }
                            view11.setScaleY(-1.0f);
                            RecyclerView recyclerView2 = this.f75260OoooO;
                            if (recyclerView2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                throw null;
                            }
                            recyclerView2.setScaleY(-1.0f);
                        } else if (num2.intValue() == 11 || num2.intValue() == 5) {
                            View view12 = this.f75248OooOooo;
                            if (view12 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view12.setRotation(0.0f);
                            View view13 = this.f75248OooOooo;
                            if (view13 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view13.setLayoutDirection(0);
                            ConstraintLayout constraintLayout3 = this.f75259Oooo0oo;
                            if (constraintLayout3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                throw null;
                            }
                            constraintLayout3.setScaleY(-1.0f);
                            ViewGroup viewGroup3 = this.f75306o00o0O;
                            if (viewGroup3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                throw null;
                            }
                            viewGroup3.setRotation(270.0f);
                            View view14 = this.f75252Oooo00O;
                            if (view14 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                throw null;
                            }
                            view14.setScaleY(1.0f);
                            RecyclerView recyclerView3 = this.f75260OoooO;
                            if (recyclerView3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                throw null;
                            }
                            recyclerView3.setScaleY(1.0f);
                        } else {
                            View view15 = this.f75248OooOooo;
                            if (view15 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view15.setRotation(0.0f);
                            View view16 = this.f75248OooOooo;
                            if (view16 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view16.setLayoutDirection(0);
                            ConstraintLayout constraintLayout4 = this.f75259Oooo0oo;
                            if (constraintLayout4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                throw null;
                            }
                            constraintLayout4.setScaleY(1.0f);
                            ViewGroup viewGroup4 = this.f75306o00o0O;
                            if (viewGroup4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                throw null;
                            }
                            viewGroup4.setRotation(0.0f);
                            View view17 = this.f75252Oooo00O;
                            if (view17 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                throw null;
                            }
                            view17.setScaleY(1.0f);
                            RecyclerView recyclerView4 = this.f75260OoooO;
                            if (recyclerView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                throw null;
                            }
                            recyclerView4.setScaleY(1.0f);
                        }
                        if (num2.intValue() == 0 || num2.intValue() == 6) {
                            View view18 = this.f75248OooOooo;
                            if (view18 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view18.setX(i3);
                        } else if (num2.intValue() == 2 || num2.intValue() == 4) {
                            View view19 = this.f75248OooOooo;
                            if (view19 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view19.setX(((width * 1.0f) - Oooo0o0(num2.intValue())) - i3);
                        } else {
                            View view20 = this.f75248OooOooo;
                            if (view20 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            float x = view20.getX();
                            if (this.f75248OooOooo == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            view20.setX(((r5.getWidth() / 2.0f) + x) - (Oooo0o0(num2.intValue()) / 2.0f));
                        }
                        View view21 = this.f75248OooOooo;
                        if (view21 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view21.getLayoutParams().width = Oooo0o0(num2.intValue());
                        View view22 = this.f75248OooOooo;
                        if (view22 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view22.getLayoutParams().height = Oooo0O0(num2.intValue());
                        View view23 = this.f75248OooOooo;
                        if (view23 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        int paddingLeft = view23.getPaddingLeft();
                        View view24 = this.f75248OooOooo;
                        if (view24 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        int paddingTop = view24.getPaddingTop();
                        int iOooo0OO = Oooo0OO(num2.intValue());
                        View view25 = this.f75248OooOooo;
                        if (view25 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view23.setPadding(paddingLeft, paddingTop, iOooo0OO, view25.getPaddingBottom());
                        View view26 = this.f75248OooOooo;
                        if (view26 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view26.requestLayout();
                        View view27 = this.f75252Oooo00O;
                        if (view27 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                            throw null;
                        }
                        view27.setVisibility(0);
                        View view28 = this.f75252Oooo00O;
                        if (view28 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                            throw null;
                        }
                        view28.setAlpha(1.0f);
                        View view29 = this.f75251Oooo000;
                        if (view29 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                            throw null;
                        }
                        view29.setVisibility(0);
                        View view30 = this.f75251Oooo000;
                        if (view30 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                            throw null;
                        }
                        view30.setAlpha(1.0f);
                        View view31 = this.f75253Oooo00o;
                        if (view31 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
                            throw null;
                        }
                        view31.setVisibility(0);
                        View view32 = this.f75253Oooo00o;
                        if (view32 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
                            throw null;
                        }
                        view32.setAlpha(1.0f);
                        View view33 = this.f75250Oooo0;
                        if (view33 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                            throw null;
                        }
                        view33.setAlpha(0.0f);
                        View view34 = this.f75250Oooo0;
                        if (view34 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                            throw null;
                        }
                        view34.setVisibility(8);
                        if (c29132OooO0o0 != null) {
                            c29132OooO0o0.invoke();
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        }
                    }
                }
            } else {
                View view35 = this.f75248OooOooo;
                if (view35 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                if (view35.getVisibility() == 0) {
                    c20358OooO00o.OooOOO0("PenBarChildFragment");
                    c20358OooO00o.OooO00o("smoothSwitchToNormalMode", new Object[0]);
                    View view36 = this.f75248OooOooo;
                    if (view36 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    Object parent3 = view36.getParent();
                    View view37 = parent3 instanceof View ? (View) parent3 : null;
                    int width2 = view37 != null ? view37.getWidth() : 0;
                    View view38 = this.f75248OooOooo;
                    if (view38 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    Object parent4 = view38.getParent();
                    View view39 = parent4 instanceof View ? (View) parent4 : null;
                    int height2 = view39 != null ? view39.getHeight() : 0;
                    if (width2 > 0 && height2 > 0) {
                        Integer num3 = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                        if (num3 == null) {
                            c20358OooO00o.OooOOO0("PenBarChildFragment");
                            c20358OooO00o.OooO0OO("smoothSwitchToNormalMode: uiPosition is null", new Object[0]);
                        } else {
                            if (num3.intValue() == 12 || num3.intValue() == 7) {
                                View view40 = this.f75248OooOooo;
                                if (view40 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view40.setRotation(90.0f);
                                View view41 = this.f75248OooOooo;
                                if (view41 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view41.setLayoutDirection(0);
                                ConstraintLayout constraintLayout5 = this.f75259Oooo0oo;
                                if (constraintLayout5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                    throw null;
                                }
                                constraintLayout5.setScaleY(-1.0f);
                                ViewGroup viewGroup5 = this.f75306o00o0O;
                                if (viewGroup5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                    throw null;
                                }
                                viewGroup5.setRotation(270.0f);
                                View view42 = this.f75250Oooo0;
                                if (view42 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                                view42.setRotation(0.0f);
                                View view43 = this.f75252Oooo00O;
                                if (view43 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                    throw null;
                                }
                                view43.setScaleY(1.0f);
                                RecyclerView recyclerView5 = this.f75260OoooO;
                                if (recyclerView5 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                    throw null;
                                }
                                recyclerView5.setScaleY(1.0f);
                            } else if (num3.intValue() == 10 || num3.intValue() == 3) {
                                View view44 = this.f75248OooOooo;
                                if (view44 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view44.setRotation(90.0f);
                                View view45 = this.f75248OooOooo;
                                if (view45 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view45.setLayoutDirection(1);
                                ConstraintLayout constraintLayout6 = this.f75259Oooo0oo;
                                if (constraintLayout6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                    throw null;
                                }
                                constraintLayout6.setScaleY(1.0f);
                                ViewGroup viewGroup6 = this.f75306o00o0O;
                                if (viewGroup6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                    throw null;
                                }
                                viewGroup6.setRotation(0.0f);
                                View view46 = this.f75250Oooo0;
                                if (view46 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                                view46.setRotation(180.0f);
                                View view47 = this.f75252Oooo00O;
                                if (view47 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                    throw null;
                                }
                                view47.setScaleY(-1.0f);
                                RecyclerView recyclerView6 = this.f75260OoooO;
                                if (recyclerView6 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                    throw null;
                                }
                                recyclerView6.setScaleY(-1.0f);
                            } else if (num3.intValue() == 11 || num3.intValue() == 5 || num3.intValue() == 6 || num3.intValue() == 4) {
                                View view48 = this.f75248OooOooo;
                                if (view48 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view48.setRotation(0.0f);
                                View view49 = this.f75248OooOooo;
                                if (view49 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view49.setLayoutDirection(0);
                                ConstraintLayout constraintLayout7 = this.f75259Oooo0oo;
                                if (constraintLayout7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                    throw null;
                                }
                                constraintLayout7.setScaleY(-1.0f);
                                ViewGroup viewGroup7 = this.f75306o00o0O;
                                if (viewGroup7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                    throw null;
                                }
                                viewGroup7.setRotation(270.0f);
                                View view50 = this.f75250Oooo0;
                                if (view50 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                                view50.setRotation(0.0f);
                                View view51 = this.f75252Oooo00O;
                                if (view51 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                    throw null;
                                }
                                view51.setScaleY(1.0f);
                                RecyclerView recyclerView7 = this.f75260OoooO;
                                if (recyclerView7 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                    throw null;
                                }
                                recyclerView7.setScaleY(1.0f);
                            } else {
                                View view52 = this.f75248OooOooo;
                                if (view52 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view52.setRotation(0.0f);
                                View view53 = this.f75248OooOooo;
                                if (view53 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view53.setLayoutDirection(0);
                                ConstraintLayout constraintLayout8 = this.f75259Oooo0oo;
                                if (constraintLayout8 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPenList");
                                    throw null;
                                }
                                constraintLayout8.setScaleY(1.0f);
                                ViewGroup viewGroup8 = this.f75306o00o0O;
                                if (viewGroup8 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
                                    throw null;
                                }
                                viewGroup8.setRotation(0.0f);
                                View view54 = this.f75250Oooo0;
                                if (view54 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                                view54.setRotation(180.0f);
                                View view55 = this.f75252Oooo00O;
                                if (view55 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                    throw null;
                                }
                                view55.setScaleY(1.0f);
                                RecyclerView recyclerView8 = this.f75260OoooO;
                                if (recyclerView8 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                                    throw null;
                                }
                                recyclerView8.setScaleY(1.0f);
                            }
                            if (num3.intValue() == 0 || num3.intValue() == 6) {
                                float f = i3;
                                View view56 = this.f75248OooOooo;
                                if (view56 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f - view56.getX());
                            } else if (num3.intValue() == 2 || num3.intValue() == 4) {
                                View view57 = this.f75248OooOooo;
                                if (view57 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (((width2 * 1.0f) - Oooo0o0(num3.intValue())) - i3) - view57.getX());
                            } else {
                                View view58 = this.f75248OooOooo;
                                if (view58 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                float x2 = view58.getX();
                                View view59 = this.f75248OooOooo;
                                if (view59 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                float x3 = view59.getX();
                                if (this.f75248OooOooo == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (((r5.getWidth() / 2.0f) + x3) - (Oooo0o0(num3.intValue()) / 2.0f)) - x2);
                            }
                            valueAnimatorOfFloat.addUpdateListener(new C29496Oooooo0(this));
                            int iOooo0o0 = Oooo0o0(num3.intValue());
                            View view60 = this.f75248OooOooo;
                            if (view60 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(view60.getWidth(), iOooo0o0);
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0oo.OooOoO0
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i4 = PenBarChildFragment.f75240o0000OOo;
                                    int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                                    PenBarChildFragment penBarChildFragment = this.f104532OooO00o;
                                    View view61 = penBarChildFragment.f75248OooOooo;
                                    if (view61 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    view61.getLayoutParams().width = iIntValue;
                                    View view62 = penBarChildFragment.f75248OooOooo;
                                    if (view62 != null) {
                                        view62.requestLayout();
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                }
                            });
                            int iOooo0O0 = Oooo0O0(num3.intValue());
                            View view61 = this.f75248OooOooo;
                            if (view61 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(view61.getHeight(), iOooo0O0);
                            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0oo.OooOoO
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i4 = PenBarChildFragment.f75240o0000OOo;
                                    int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                                    PenBarChildFragment penBarChildFragment = this.f104531OooO00o;
                                    View view62 = penBarChildFragment.f75248OooOooo;
                                    if (view62 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    view62.getLayoutParams().height = iIntValue;
                                    View view63 = penBarChildFragment.f75248OooOooo;
                                    if (view63 != null) {
                                        view63.requestLayout();
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                }
                            });
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0oo.OooOoOO
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    int i4 = PenBarChildFragment.f75240o0000OOo;
                                    float fFloatValue = ((Float) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                                    PenBarChildFragment penBarChildFragment = this.f104533OooO00o;
                                    View view62 = penBarChildFragment.f75250Oooo0;
                                    if (view62 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                        throw null;
                                    }
                                    view62.setAlpha(1 - fFloatValue);
                                    View view63 = penBarChildFragment.f75251Oooo000;
                                    if (view63 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                                        throw null;
                                    }
                                    view63.setAlpha(fFloatValue);
                                    View view64 = penBarChildFragment.f75252Oooo00O;
                                    if (view64 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                        throw null;
                                    }
                                    view64.setAlpha(fFloatValue);
                                    View view65 = penBarChildFragment.f75253Oooo00o;
                                    if (view65 != null) {
                                        view65.setAlpha(fFloatValue);
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
                                        throw null;
                                    }
                                }
                            });
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt, valueAnimatorOfInt2, valueAnimatorOfFloat3);
                            animatorSet.setDuration(200L);
                            animatorSet.setInterpolator(new LinearInterpolator());
                            animatorSet.addListener(new C29494OooooOo(this));
                            C29466OooOoo0 c29466OooOoo0 = new C29466OooOoo0(this, iOooo0o0, iOooo0O0, num3, c29132OooO0o0);
                            animatorSet.addListener(new C29493OooooOO(c29466OooOoo0));
                            animatorSet.addListener(new C29492OooooO0(c29466OooOoo0));
                            animatorSet.start();
                        }
                    }
                }
            }
        } else if (i == 1) {
            View view62 = this.f75250Oooo0;
            if (view62 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                throw null;
            }
            view62.setRotation(0.0f);
            int i4 = f75242o0000Oo0;
            int i5 = f75240o0000OOo;
            if (z) {
                c20358OooO00o.OooOOO0("PenBarChildFragment");
                c20358OooO00o.OooO00o("switchToIconMode", new Object[0]);
                View view63 = this.f75248OooOooo;
                if (view63 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                Object parent5 = view63.getParent();
                View view64 = parent5 instanceof View ? (View) parent5 : null;
                int width3 = view64 != null ? view64.getWidth() : 0;
                View view65 = this.f75248OooOooo;
                if (view65 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                Object parent6 = view65.getParent();
                View view66 = parent6 instanceof View ? (View) parent6 : null;
                int height3 = view66 != null ? view66.getHeight() : 0;
                if (width3 > 0 && height3 > 0) {
                    View view67 = this.f75250Oooo0;
                    if (view67 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                        throw null;
                    }
                    view67.setVisibility(0);
                    Integer num4 = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                    if ((num4 != null && num4.intValue() == 0) || (num4 != null && num4.intValue() == 6)) {
                        View view68 = this.f75248OooOooo;
                        if (view68 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view68.setX(i3);
                    } else if ((num4 != null && num4.intValue() == 2) || (num4 != null && num4.intValue() == 4)) {
                        View view69 = this.f75248OooOooo;
                        if (view69 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view69.setX(((width3 * 1.0f) - i5) - i3);
                    } else {
                        View view70 = this.f75248OooOooo;
                        if (view70 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        float x4 = view70.getX();
                        if (this.f75248OooOooo == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view70.setX(((r4.getWidth() / 2.0f) + x4) - (i5 / 2.0f));
                    }
                    View view71 = this.f75251Oooo000;
                    if (view71 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                        throw null;
                    }
                    view71.setVisibility(8);
                    View view72 = this.f75252Oooo00O;
                    if (view72 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                        throw null;
                    }
                    view72.setVisibility(8);
                    View view73 = this.f75253Oooo00o;
                    if (view73 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
                        throw null;
                    }
                    view73.setVisibility(8);
                    View view74 = this.f75250Oooo0;
                    if (view74 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = view74.getLayoutParams();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(0);
                    View view75 = this.f75250Oooo0;
                    if (view75 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                        throw null;
                    }
                    view75.setLayoutParams(marginLayoutParams);
                    View view76 = this.f75250Oooo0;
                    if (view76 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                        throw null;
                    }
                    view76.setAlpha(1.0f);
                    View view77 = this.f75248OooOooo;
                    if (view77 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view77.setRotation(0.0f);
                    View view78 = this.f75248OooOooo;
                    if (view78 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view78.getLayoutParams().width = i5;
                    View view79 = this.f75248OooOooo;
                    if (view79 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view79.getLayoutParams().height = i4;
                    View view80 = this.f75248OooOooo;
                    if (view80 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view80.setPadding(0, 0, 0, 0);
                    View view81 = this.f75248OooOooo;
                    if (view81 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view81.setLayoutDirection(0);
                    View view82 = this.f75248OooOooo;
                    if (view82 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view82.requestLayout();
                }
            } else {
                View view83 = this.f75248OooOooo;
                if (view83 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                if (view83.getVisibility() == 0) {
                    c20358OooO00o.OooOOO0("PenBarChildFragment");
                    c20358OooO00o.OooO00o("smoothSwitchToIconMode", new Object[0]);
                    View view84 = this.f75248OooOooo;
                    if (view84 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    Object parent7 = view84.getParent();
                    View view85 = parent7 instanceof View ? (View) parent7 : null;
                    int width4 = view85 != null ? view85.getWidth() : 0;
                    View view86 = this.f75248OooOooo;
                    if (view86 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    Object parent8 = view86.getParent();
                    View view87 = parent8 instanceof View ? (View) parent8 : null;
                    int height4 = view87 != null ? view87.getHeight() : 0;
                    if (width4 > 0 && height4 > 0) {
                        Integer num5 = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                        int iOooO0o = o000000O.OooO0o(40);
                        List<T> list = this.f75308o00oO0o.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                        Iterator it = list.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i6 = -1;
                                break;
                            } else if (((PenVO) it.next()).getSelected()) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        float f2 = i6 * iOooO0o;
                        ConstraintLayout constraintLayout9 = this.f75258Oooo0oO;
                        if (constraintLayout9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("clSecondary");
                            throw null;
                        }
                        final int x5 = (int) (constraintLayout9.getX() + f2);
                        View view88 = this.f75248OooOooo;
                        if (view88 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(view88.getWidth(), i5);
                        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0oo.OooOo0
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i7 = PenBarChildFragment.f75240o0000OOo;
                                int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                                PenBarChildFragment penBarChildFragment = this.f104525OooO00o;
                                View view89 = penBarChildFragment.f75248OooOooo;
                                if (view89 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view89.getLayoutParams().width = iIntValue;
                                int i8 = PenBarChildFragment.f75240o0000OOo;
                                int i9 = x5;
                                if (iIntValue <= i9 + i8) {
                                    i9 = iIntValue - i8;
                                }
                                View view90 = penBarChildFragment.f75250Oooo0;
                                if (view90 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                                ViewGroup.LayoutParams layoutParams2 = view90.getLayoutParams();
                                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                marginLayoutParams2.setMarginStart(i9);
                                View view91 = penBarChildFragment.f75250Oooo0;
                                if (view91 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                                view91.setLayoutParams(marginLayoutParams2);
                                View view92 = penBarChildFragment.f75248OooOooo;
                                if (view92 != null) {
                                    view92.requestLayout();
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                        });
                        if ((num5 != null && num5.intValue() == 0) || (num5 != null && num5.intValue() == 6)) {
                            float f3 = i3;
                            View view89 = this.f75248OooOooo;
                            if (view89 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, f3 - view89.getX());
                        } else if ((num5 != null && num5.intValue() == 2) || (num5 != null && num5.intValue() == 4)) {
                            View view90 = this.f75248OooOooo;
                            if (view90 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, (((width4 * 1.0f) - i5) - i3) - view90.getX());
                        } else {
                            View view91 = this.f75248OooOooo;
                            if (view91 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            float x6 = view91.getX();
                            View view92 = this.f75248OooOooo;
                            if (view92 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            float x7 = view92.getX();
                            if (this.f75248OooOooo == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                throw null;
                            }
                            valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, (((r8.getWidth() / 2.0f) + x7) - (i5 / 2.0f)) - x6);
                        }
                        valueAnimatorOfFloat2.addUpdateListener(new C29491Ooooo0o(this));
                        View view93 = this.f75248OooOooo;
                        if (view93 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(view93.getHeight(), i4);
                        valueAnimatorOfInt4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0oo.OooOo0O
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i7 = PenBarChildFragment.f75240o0000OOo;
                                int iIntValue = ((Integer) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Int")).intValue();
                                PenBarChildFragment penBarChildFragment = this.f104529OooO00o;
                                View view94 = penBarChildFragment.f75248OooOooo;
                                if (view94 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                view94.getLayoutParams().height = iIntValue;
                                View view95 = penBarChildFragment.f75248OooOooo;
                                if (view95 != null) {
                                    view95.requestLayout();
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                            }
                        });
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0oo.OooOo0o
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                int i7 = PenBarChildFragment.f75240o0000OOo;
                                float fFloatValue = ((Float) C28971o0OO00O.OooO00o(valueAnimator, TranslateLanguage.ITALIAN, "null cannot be cast to non-null type kotlin.Float")).floatValue();
                                PenBarChildFragment penBarChildFragment = this.f104530OooO00o;
                                View view94 = penBarChildFragment.f75251Oooo000;
                                if (view94 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                                    throw null;
                                }
                                view94.setAlpha(fFloatValue);
                                View view95 = penBarChildFragment.f75252Oooo00O;
                                if (view95 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                                    throw null;
                                }
                                view95.setAlpha(fFloatValue);
                                View view96 = penBarChildFragment.f75253Oooo00o;
                                if (view96 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
                                    throw null;
                                }
                                view96.setAlpha(fFloatValue);
                                View view97 = penBarChildFragment.f75250Oooo0;
                                if (view97 != null) {
                                    view97.setAlpha(1 - fFloatValue);
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
                                    throw null;
                                }
                            }
                        });
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(valueAnimatorOfInt3, valueAnimatorOfFloat2, valueAnimatorOfInt4, valueAnimatorOfFloat4);
                        animatorSet2.setDuration(200L);
                        animatorSet2.setInterpolator(new LinearInterpolator());
                        animatorSet2.addListener(new C29490Ooooo00(this, x5));
                        C29457OooOo c29457OooOo = new C29457OooOo(this, 0);
                        animatorSet2.addListener(new C29489OoooOoo(c29457OooOo));
                        animatorSet2.addListener(new C29488OoooOoO(c29457OooOo));
                        animatorSet2.start();
                    }
                }
            }
        }
        Oooo0oO().OooO0oo(1);
        OooOooO();
    }

    public final void OoooO() {
        C29950OooO0o0 c29950OooO0o0 = this.f75297o0000Ooo;
        if (c29950OooO0o0 != null) {
            c29950OooO0o0.dismiss();
        }
        C29948OooO0Oo c29948OooO0Oo = this.f75299o0000oo;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.dismiss();
        }
        o0o00o0O.OooOO0O oooOO0O = this.f75290o00000oo;
        if (oooOO0O != null) {
            oooOO0O.dismiss();
        }
        o0o00Ooo.OooOO0 oooOO02 = this.f75298o0000oO;
        if (oooOO02 != null) {
            oooOO02.dismiss();
        }
        C29947OooO0OO c29947OooO0OO = this.o0000O0;
        if (c29947OooO0OO != null) {
            c29947OooO0OO.dismiss();
        }
        C29951OooO0oO c29951OooO0oO = this.f75293o0000O0O;
        if (c29951OooO0oO != null) {
            c29951OooO0oO.dismiss();
        }
        C29953OooOO0o c29953OooOO0o = this.f75300o000OO;
        if (c29953OooOO0o != null) {
            c29953OooOO0o.dismiss();
        }
        C29949OooO0o c29949OooO0o = this.f75291o0000O;
        if (c29949OooO0o != null) {
            c29949OooO0o.dismiss();
        }
        C29952OooO0oo c29952OooO0oo = this.f75295o0000OO0;
        if (c29952OooO0oo != null) {
            c29952OooO0oo.dismiss();
        }
        com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = this.f75294o0000OO;
        if (oooO00o != null) {
            oooO00o.dismiss();
        }
        o0o00o0O.OooO oooO = this.f75292o0000O00;
        if (oooO != null) {
            oooO.dismiss();
        }
        for (Map.Entry entry : this.f75309o00ooo.entrySet()) {
            ((Number) entry.getKey()).intValue();
            Object value = ((InterfaceC32440OooOO0) entry.getValue()).getValue();
            if (value instanceof C29869OooO0Oo) {
                ((C29869OooO0Oo) value).OooO00o();
            }
        }
    }

    public final void OoooO0(OooO0O0.OooO00o oooO00o) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PenBarChildFragment");
        c20358OooO00o.OooO0o0("handleUiWidthLevelChanged: " + oooO00o, new Object[0]);
        int iOrdinal = oooO00o.ordinal();
        if (iOrdinal == 0) {
            ConstraintLayout constraintLayout = this.f75278Ooooooo;
            if (constraintLayout == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternarySmall");
                throw null;
            }
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = this.f75269OoooOoo;
            if (constraintLayout2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternaryLarge");
                throw null;
            }
            constraintLayout2.setVisibility(8);
            ConstraintLayout constraintLayout3 = this.f75261OoooO0;
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clTertiary");
                throw null;
            }
        }
        if (iOrdinal == 1) {
            ConstraintLayout constraintLayout4 = this.f75278Ooooooo;
            if (constraintLayout4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternarySmall");
                throw null;
            }
            constraintLayout4.setVisibility(0);
            ConstraintLayout constraintLayout5 = this.f75269OoooOoo;
            if (constraintLayout5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternaryLarge");
                throw null;
            }
            constraintLayout5.setVisibility(8);
            ConstraintLayout constraintLayout6 = this.f75261OoooO0;
            if (constraintLayout6 != null) {
                constraintLayout6.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clTertiary");
                throw null;
            }
        }
        if (iOrdinal == 2) {
            ConstraintLayout constraintLayout7 = this.f75278Ooooooo;
            if (constraintLayout7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternarySmall");
                throw null;
            }
            constraintLayout7.setVisibility(0);
            ConstraintLayout constraintLayout8 = this.f75269OoooOoo;
            if (constraintLayout8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternaryLarge");
                throw null;
            }
            constraintLayout8.setVisibility(8);
            ConstraintLayout constraintLayout9 = this.f75261OoooO0;
            if (constraintLayout9 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clTertiary");
                throw null;
            }
            constraintLayout9.setVisibility(0);
            RecyclerView recyclerView = this.f75260OoooO;
            if (recyclerView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                throw null;
            }
            recyclerView.getLayoutParams().width = o000000O.OooO0o(88);
            RecyclerView recyclerView2 = this.f75260OoooO;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                throw null;
            }
            recyclerView2.requestLayout();
            TextView textView = this.f75268OoooOoO;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvClearPage");
                throw null;
            }
        }
        if (iOrdinal == 3) {
            ConstraintLayout constraintLayout10 = this.f75278Ooooooo;
            if (constraintLayout10 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternarySmall");
                throw null;
            }
            constraintLayout10.setVisibility(8);
            ConstraintLayout constraintLayout11 = this.f75269OoooOoo;
            if (constraintLayout11 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternaryLarge");
                throw null;
            }
            constraintLayout11.setVisibility(0);
            ConstraintLayout constraintLayout12 = this.f75261OoooO0;
            if (constraintLayout12 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clTertiary");
                throw null;
            }
            constraintLayout12.setVisibility(0);
            RecyclerView recyclerView3 = this.f75260OoooO;
            if (recyclerView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                throw null;
            }
            recyclerView3.getLayoutParams().width = o000000O.OooO0o(88);
            RecyclerView recyclerView4 = this.f75260OoooO;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                throw null;
            }
            recyclerView4.requestLayout();
            TextView textView2 = this.f75268OoooOoO;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvClearPage");
                throw null;
            }
        }
        if (iOrdinal == 4) {
            ConstraintLayout constraintLayout13 = this.f75278Ooooooo;
            if (constraintLayout13 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternarySmall");
                throw null;
            }
            constraintLayout13.setVisibility(8);
            ConstraintLayout constraintLayout14 = this.f75269OoooOoo;
            if (constraintLayout14 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternaryLarge");
                throw null;
            }
            constraintLayout14.setVisibility(0);
            ConstraintLayout constraintLayout15 = this.f75261OoooO0;
            if (constraintLayout15 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clTertiary");
                throw null;
            }
            constraintLayout15.setVisibility(0);
            RecyclerView recyclerView5 = this.f75260OoooO;
            if (recyclerView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                throw null;
            }
            recyclerView5.getLayoutParams().width = o000000O.OooO0o(180);
            RecyclerView recyclerView6 = this.f75260OoooO;
            if (recyclerView6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                throw null;
            }
            recyclerView6.requestLayout();
            TextView textView3 = this.f75268OoooOoO;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("tvClearPage");
                throw null;
            }
        }
        if (iOrdinal != 5) {
            throw new C32442OooOO0o();
        }
        ConstraintLayout constraintLayout16 = this.f75278Ooooooo;
        if (constraintLayout16 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternarySmall");
            throw null;
        }
        constraintLayout16.setVisibility(8);
        ConstraintLayout constraintLayout17 = this.f75269OoooOoo;
        if (constraintLayout17 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clQuaternaryLarge");
            throw null;
        }
        constraintLayout17.setVisibility(0);
        ConstraintLayout constraintLayout18 = this.f75261OoooO0;
        if (constraintLayout18 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clTertiary");
            throw null;
        }
        constraintLayout18.setVisibility(0);
        RecyclerView recyclerView7 = this.f75260OoooO;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
            throw null;
        }
        recyclerView7.getLayoutParams().width = -2;
        RecyclerView recyclerView8 = this.f75260OoooO;
        if (recyclerView8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
            throw null;
        }
        recyclerView8.requestLayout();
        TextView textView4 = this.f75268OoooOoO;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tvClearPage");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OoooO00(boolean z, boolean z2) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PenBarChildFragment");
        c20358OooO00o.OooO00o("handleUiVisibilityChanged: " + z, new Object[0]);
        if (z2) {
            View view = this.f75248OooOooo;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view.setVisibility(z ? 0 : 8);
            View view2 = this.f75248OooOooo;
            if (view2 != null) {
                view2.setAlpha(z ? 1.0f : 0.0f);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
        }
        View view3 = this.f75248OooOooo;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float alpha = view3.getAlpha();
        float f = z ? 1.0f : 0.0f;
        View view4 = this.f75248OooOooo;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        if ((view4.getVisibility() == 0) == z) {
            View view5 = this.f75248OooOooo;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view5.setAlpha(f);
            View view6 = this.f75248OooOooo;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view6.setVisibility(z ? 0 : 8);
        } else {
            View view7 = this.f75248OooOooo;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (view7.getVisibility() != 4) {
                View view8 = this.f75248OooOooo;
                if (view8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view8, "alpha", alpha, f);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                objectAnimatorOfFloat.addListener(new C29498Ooooooo(this));
                objectAnimatorOfFloat.addListener(new C29497OoooooO(this, z));
                objectAnimatorOfFloat.addListener(new C29495Oooooo(this, z));
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.start();
            }
        }
        OooOooO();
    }

    public final void OoooO0O() {
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        int width = view.getWidth();
        o000000O.OooO0o(40);
        Rect rect = new Rect();
        View view2 = this.f75251Oooo000;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
            throw null;
        }
        view2.getGlobalVisibleRect(rect);
        if (width != this.f75312o0OOO0o) {
            View view3 = this.f75256Oooo0o;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clPrimary");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
            int marginStart = oooO00o.getMarginStart();
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            Resources resources = contextRequireContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.xlarge_pen_bar_content_width);
            if (width < dimensionPixelSize && width < (dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.large_pen_bar_content_width)) && width < (dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.medium_pen_bar_content_width)) && width < (dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.small_pen_bar_content_width))) {
                dimensionPixelSize = width;
            }
            if (width >= dimensionPixelSize) {
                oooO00o.setMarginStart((width - dimensionPixelSize) / 2);
                View view4 = this.f75256Oooo0o;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPrimary");
                    throw null;
                }
                view4.setLayoutParams(oooO00o);
            } else {
                oooO00o.setMarginStart(0);
                View view5 = this.f75256Oooo0o;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clPrimary");
                    throw null;
                }
                view5.setLayoutParams(oooO00o);
            }
            int marginStart2 = oooO00o.getMarginStart();
            Rect rect2 = new Rect();
            View view6 = this.f75248OooOooo;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view6.getGlobalVisibleRect(rect2);
            View view7 = this.f75248OooOooo;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (view7.getRotation() == 90.0f) {
                rect.offset(0, marginStart2 - marginStart);
                rect.bottom = Math.min(rect.bottom, rect2.bottom);
            } else {
                View view8 = this.f75248OooOooo;
                if (view8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                if (view8.getRotation() == 270.0f) {
                    rect.offset(0, marginStart - marginStart2);
                    rect.top = Math.max(rect.top, rect2.top);
                } else {
                    rect.offset(marginStart2 - marginStart, 0);
                    rect.right = Math.min(rect.right, rect2.right);
                }
            }
        }
        if (width != this.f75312o0OOO0o || !rect.equals(this.f75313o0Oo0oo)) {
            OoooooO(width, true);
        }
        this.f75312o0OOO0o = width;
        this.f75313o0Oo0oo.set(rect);
    }

    public final void OoooOO0() {
        if (this.o0000O0 == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            final C29947OooO0OO c29947OooO0OO = new C29947OooO0OO(contextRequireContext);
            c29947OooO0OO.f106337OooO0o = Oooo0();
            c29947OooO0OO.f106339OooO0oO = new View.OnClickListener() { // from class: o0Ooo0oo.Oooo000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = PenBarChildFragment.f75240o0000OOo;
                    C29947OooO0OO c29947OooO0OO2 = c29947OooO0OO;
                    if (c29947OooO0OO2.OooO00o()) {
                        c29947OooO0OO2.dismiss();
                    }
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C28767o0000Oo0());
                }
            };
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = Oooo0oO();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75247OooOooO;
            Object obj = null;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29947OooO0OO.f106338OooO0o0 = new C29921OooO00o(oooO0O0Oooo0oO, interfaceC21987OooOoo);
            Iterator it = ((Iterable) Oooo0oO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((PenVO) next).getType() == 3) {
                    obj = next;
                    break;
                }
            }
            PenVO penVO = (PenVO) obj;
            if (penVO != null) {
                String string = penVO.getExtra().getString(C18437z2.f56754h);
                if (string == null) {
                    string = "";
                }
                c29947OooO0OO.OooO0Oo(string);
            }
            this.o0000O0 = c29947OooO0OO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOOO() {
        if (this.f75297o0000Ooo == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29950OooO0o0 c29950OooO0o0 = new C29950OooO0o0(contextRequireContext);
            c29950OooO0o0.f106363OooO0oo = Oooo0();
            c29950OooO0o0.f106356OooO = (PenBox.OooOOO0) this.f75283o000000o.getValue();
            c29950OooO0o0.f106365OooOO0O = Oooo00o();
            c29950OooO0o0.f106362OooO0oO = (PenBox.OooO0OO) this.f75284o00000O.getValue();
            c29950OooO0o0.OooO0o0(((Boolean) Oooo0oO().f75191OooooO0.f121747OooOo0o.getValue()).booleanValue());
            c29950OooO0o0.f106364OooOO0 = (PenBox.OooOOOO) this.f75280o00000.getValue();
            c29950OooO0o0.OooO0o((int) (((Number) Oooo0oO().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100), ((Boolean) Oooo0oO().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue());
            this.f75297o0000Ooo = c29950OooO0o0;
        }
    }

    public final void OoooOOo() {
        if (this.f75291o0000O == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29949OooO0o c29949OooO0o = new C29949OooO0o(contextRequireContext);
            c29949OooO0o.f106353OooO0o = Oooo0();
            c29949OooO0o.f106355OooO0oO = Oooo00o();
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = Oooo0oO();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75247OooOooO;
            Object obj = null;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29949OooO0o.f106354OooO0o0 = new C29925OooO0o0(oooO0O0Oooo0oO, interfaceC21987OooOoo);
            Iterator it = ((Iterable) Oooo0oO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((PenVO) next).getType() == 7) {
                    obj = next;
                    break;
                }
            }
            PenVO penVO = (PenVO) obj;
            if (penVO != null) {
                String string = penVO.getExtra().getString(C18437z2.f56754h);
                if (string == null) {
                    string = "line";
                }
                InterfaceC29932OooO0OO interfaceC29932OooO0OOOooO0Oo = c29949OooO0o.OooO0Oo();
                if (interfaceC29932OooO0OOOooO0Oo != null) {
                    interfaceC29932OooO0OOOooO0Oo.OooO0o0(string);
                }
                penVO.getExtra().getDouble(PenInfo.LASER_DISAPPEAR_DURATION);
            }
            c29949OooO0o.OooO0o((List) Oooo0oO().f75196OoooooO.f121747OooOo0o.getValue());
            this.f75291o0000O = c29949OooO0o;
        }
    }

    public final void OoooOo0() {
        if (this.f75293o0000O0O == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29951OooO0oO c29951OooO0oO = new C29951OooO0oO(contextRequireContext);
            c29951OooO0oO.f106370OooO0o0 = Oooo0();
            c29951OooO0oO.f106369OooO0o = Oooo00o();
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = Oooo0oO();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75247OooOooO;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29951OooO0oO.f106368OooO0Oo = new C29926OooO0oO(oooO0O0Oooo0oO, interfaceC21987OooOoo, new C23472OooO0Oo(2, this, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), getActivity());
            this.f75293o0000O0O = c29951OooO0oO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOoO() {
        if (this.f75298o0000oO == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0o00Ooo.OooOO0 oooOO02 = new o0o00Ooo.OooOO0(true, true, contextRequireContext);
            oooOO02.OooO0o0(((Boolean) Oooo0o().f90249OoooOOo.f121747OooOo0o.getValue()).booleanValue());
            ((Boolean) Oooo0oO().f75180OoooO0.f121747OooOo0o.getValue()).getClass();
            ((Number) Oooo0oO().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue();
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = Oooo0oO();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75247OooOooO;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            oooOO02.f106174OooO0oo = new C29927OooO0oo(oooO0O0Oooo0oO, interfaceC21987OooOoo, new C23473OooO0o0(1, this, PenBarChildFragment.class, "onLassoColorChanged", "onLassoColorChanged(I)V", 0));
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO2 = Oooo0oO();
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: o0Ooo0oo.OooOOoo
                @Override // oO0O000o.InterfaceC32507OooOO0o
                public final Object invoke(Object obj) {
                    o000o0O0.OooOo directions = (o000o0O0.OooOo) obj;
                    int i = PenBarChildFragment.f75240o0000OOo;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(directions, "directions");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this.f104522OooOo0o), directions);
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            InterfaceC21987OooOoo interfaceC21987OooOoo2 = this.f75247OooOooO;
            if (interfaceC21987OooOoo2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            oooOO02.f106173OooO0oO = new o0o00o.OooO(oooO0O0Oooo0oO2, oooOO02, interfaceC32507OooOO0o, interfaceC21987OooOoo2, new OooO0o(2, this, PenBarChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            oooOO02.f106167OooO = new C23474OooO0oO();
            oooOO02.OooOO0((List) Oooo0oO().f75190Ooooo0o.f121747OooOo0o.getValue());
            this.f75298o0000oO = oooOO02;
        }
    }

    public final void OoooOoo() {
        if (this.f75292o0000O00 == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0o00o0O.OooO oooO = new o0o00o0O.OooO(contextRequireContext);
            oooO.f106323OooO0O0 = Oooo00o();
            oooO.f106325OooO0Oo = Oooo0();
            oooO.f106324OooO0OO = (PenBox.InterfaceC23608OooO0oo) this.f75279o0000.getValue();
            this.f75292o0000O00 = oooO;
        }
    }

    public final void Ooooo00() {
        if (this.f75290o00000oo == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0o00o0O.OooOO0O oooOO0O = new o0o00o0O.OooOO0O(contextRequireContext);
            oooOO0O.f106390OooO0o0 = Oooo00o();
            oooOO0O.f106389OooO0o = Oooo0();
            oooOO0O.f106388OooO0Oo = (PenBox.OooO) this.f75289o00000oO.getValue();
            this.f75290o00000oo = oooOO0O;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ooooo0o() {
        if (this.f75300o000OO == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29953OooOO0o c29953OooOO0o = new C29953OooOO0o(contextRequireContext);
            c29953OooOO0o.OooO0o0((int) (((Number) Oooo0oO().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100), ((Boolean) Oooo0oO().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue());
            c29953OooOO0o.f106396OooO0o = (PenBox.InterfaceC23609OooOO0o) this.f75286o00000OO.getValue();
            c29953OooOO0o.f106398OooO0oO = Oooo0();
            c29953OooOO0o.f106399OooO0oo = (PenBox.OooOOOO) this.f75280o00000.getValue();
            c29953OooOO0o.f106392OooO = Oooo00o();
            this.f75300o000OO = c29953OooOO0o;
        }
    }

    public final boolean OooooO0() {
        List<InterfaceC29896OooO0OO> listOooOO0o = C34429OooOOo0.OooOO0o(this.f75297o0000Ooo, this.f75299o0000oo, this.f75290o00000oo, this.f75298o0000oO, this.o0000O0, this.f75294o0000OO, this.f75293o0000O0O, this.f75300o000OO, this.f75291o0000O, this.f75295o0000OO0, this.f75292o0000O00);
        if ((listOooOO0o instanceof Collection) && listOooOO0o.isEmpty()) {
            return false;
        }
        for (InterfaceC29896OooO0OO interfaceC29896OooO0OO : listOooOO0o) {
            if (interfaceC29896OooO0OO != null && interfaceC29896OooO0OO.OooO00o()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooooOO() {
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int width = view2 != null ? view2.getWidth() : 0;
        View view3 = this.f75248OooOooo;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent2 = view3.getParent();
        View view4 = parent2 instanceof View ? (View) parent2 : null;
        return width > 0 && (view4 != null ? view4.getHeight() : 0) > 0;
    }

    public final void OooooOo() {
        PointF pointFOooOooo = OooOooo();
        if (pointFOooOooo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBarChildFragment");
            c20358OooO00o.OooO0OO("moveToPosition: anchorPoint is null", new Object[0]);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("PenBarChildFragment");
        c20358OooO00o2.OooO00o("moveToPosition: anchorPoint: " + pointFOooOooo, new Object[0]);
        View view = this.f75248OooOooo;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float x = view.getX();
        if (this.f75248OooOooo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float width = (r4.getWidth() / 2.0f) + x;
        View view2 = this.f75248OooOooo;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float y = view2.getY();
        if (this.f75248OooOooo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float height = (r6.getHeight() / 2.0f) + y;
        View view3 = this.f75248OooOooo;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view3.setX((pointFOooOooo.x - width) + view3.getX());
        View view4 = this.f75248OooOooo;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view4.setY((pointFOooOooo.y - height) + view4.getY());
        Oooooo0();
    }

    public final void Oooooo(int i, Object obj) {
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            noteEditorContainerFragment.Oooo0OO(i, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooooo0() {
        Integer num = (Integer) Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
        View view = this.f75252Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
        View view2 = this.f75253Oooo00o;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams2;
        View view3 = this.f75251Oooo000;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o3 = (ConstraintLayout.OooO00o) layoutParams3;
        if ((num != null && num.intValue() == 1) || ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 2) || ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 10))))) {
            oooO00o.f63876OooO = -1;
            View view4 = this.f75251Oooo000;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                throw null;
            }
            oooO00o.f63885OooOO0 = view4.getId();
            oooO00o.f63887OooOO0o = 0;
            oooO00o.f63886OooOO0O = -1;
            oooO00o2.f63886OooOO0O = -1;
            View view5 = this.f75251Oooo000;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                throw null;
            }
            oooO00o2.f63885OooOO0 = view5.getId();
            oooO00o3.f63876OooO = 0;
            oooO00o3.f63885OooOO0 = -1;
            oooO00o3.f63887OooOO0o = -1;
            View view6 = this.f75252Oooo00O;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                throw null;
            }
            oooO00o3.f63886OooOO0O = view6.getId();
        } else {
            oooO00o.f63876OooO = 0;
            oooO00o.f63885OooOO0 = -1;
            oooO00o.f63887OooOO0o = -1;
            View view7 = this.f75251Oooo000;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                throw null;
            }
            oooO00o.f63886OooOO0O = view7.getId();
            View view8 = this.f75251Oooo000;
            if (view8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
                throw null;
            }
            oooO00o2.f63886OooOO0O = view8.getId();
            oooO00o2.f63885OooOO0 = -1;
            oooO00o3.f63876OooO = -1;
            View view9 = this.f75252Oooo00O;
            if (view9 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
                throw null;
            }
            oooO00o3.f63885OooOO0 = view9.getId();
            oooO00o3.f63887OooOO0o = 0;
            oooO00o3.f63886OooOO0O = -1;
        }
        View view10 = this.f75252Oooo00O;
        if (view10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
            throw null;
        }
        view10.setLayoutParams(oooO00o);
        View view11 = this.f75253Oooo00o;
        if (view11 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
            throw null;
        }
        view11.setLayoutParams(oooO00o2);
        View view12 = this.f75251Oooo000;
        if (view12 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
            throw null;
        }
        view12.setLayoutParams(oooO00o3);
        View view13 = this.f75252Oooo00O;
        if (view13 != null) {
            view13.setRotation((num != null && num.intValue() == 1) ? 180.0f : 0.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
            throw null;
        }
    }

    public final void OoooooO(int i, boolean z) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        OooO0O0.OooO00o oooO00o = i >= resources.getDimensionPixelSize(R.dimen.xxlarge_pen_bar_content_width) ? OooO0O0.OooO00o.f75212OooOoo0 : i >= resources.getDimensionPixelSize(R.dimen.xlarge_pen_bar_content_width) ? OooO0O0.OooO00o.f75210OooOoOO : i >= resources.getDimensionPixelSize(R.dimen.large_pen_bar_content_width) ? OooO0O0.OooO00o.f75208OooOoO : i >= resources.getDimensionPixelSize(R.dimen.medium_pen_bar_content_width) ? OooO0O0.OooO00o.f75209OooOoO0 : i >= resources.getDimensionPixelSize(R.dimen.small_pen_bar_content_width) ? OooO0O0.OooO00o.f75206OooOo : OooO0O0.OooO00o.f75207OooOo0o;
        if (z && oooO00o != Oooo0oO().f75155OooOOoo.f121747OooOo0o.getValue()) {
            OoooO0(oooO00o);
        }
        C33781o00o0O c33781o00o0O = Oooo0oO().f75153OooOOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o000oOoO() {
        if (this.f75299o0000oo == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29948OooO0Oo c29948OooO0Oo = new C29948OooO0Oo(contextRequireContext);
            c29948OooO0Oo.f106345OooO0o0 = Oooo0();
            c29948OooO0Oo.f106341OooO0O0 = Oooo00o();
            c29948OooO0Oo.f106343OooO0Oo = (PenBox.OooOOO0) this.f75283o000000o.getValue();
            c29948OooO0Oo.OooO0o0(((Boolean) Oooo0oO().f75191OooooO0.f121747OooOo0o.getValue()).booleanValue());
            c29948OooO0Oo.f106344OooO0o = (PenBox.OooOOOO) this.f75280o00000.getValue();
            c29948OooO0Oo.OooO0o((int) (((Number) Oooo0oO().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100), ((Boolean) Oooo0oO().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue());
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0oO = Oooo0oO();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75247OooOooO;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29948OooO0Oo.f106342OooO0OO = new C29922OooO0O0(oooO0O0Oooo0oO, interfaceC21987OooOoo);
            this.f75299o0000oo = c29948OooO0Oo;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OoooO();
        this.f75309o00ooo.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OoooO();
    }
}
