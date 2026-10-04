package com.orion.notein.p607ui.noteeditor.penbox;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.o0Oo0oo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.ink.strokes.C21968OooO0o0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0oo0.C26201OooO0o0;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28036OooO0O0;
import o0OoO0OO.C28619OooOOo0;
import o0OoO0oo.C28767o0000Oo0;
import o0Ooo.C29253OooO00o;
import o0Ooo.C29260OooO0oo;
import o0Ooo.C29264OooOOO;
import o0Ooo.C29267OooOOo;
import o0Ooo.C29268OooOOo0;
import o0Ooo.C29282Oooo00o;
import o0Ooo.C29283Oooo0O0;
import o0Ooo.C29307OoooO00;
import o0Ooo.C29312OoooOo0;
import o0Ooo.C29313OoooOoO;
import o0Ooo.C29314OoooOoo;
import o0Ooo.C29317OooooO0;
import o0Ooo.EnumC29316Ooooo0o;
import o0Ooo.Oooo000;
import o0Ooo.ViewOnLayoutChangeListenerC29265OooOOO0;
import o0Ooo.ViewOnLayoutChangeListenerC29281Oooo00O;
import o0Ooo0oo.InterfaceC29545o000O0oo;
import o0o00O00.C29869OooO0Oo;
import o0o00Oo.C29901OooO0oo;
import o0o00Oo.C29904OooOOo;
import o0o00Oo.C29906OooOOoo;
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
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/penbox/PenBoxChildFragment;", "Landroidx/fragment/app/Fragment;", "Lo0Ooo0oo/o000O0oo;", "<init>", "()V", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PenBoxChildFragment extends Hilt_PenBoxChildFragment implements InterfaceC29545o000O0oo {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75358OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75359OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f75360OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f75361OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RecyclerView f75362Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f75363Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public InterfaceC21987OooOoo f75364Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f75365Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f75366Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f75367Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f75368Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ViewOnLayoutChangeListenerC29265OooOOO0 f75369Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f75370Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final LinkedHashMap f75371Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0OO f75372Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageView f75373OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public C29317OooooO0 f75374OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C29901OooO0oo f75375OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f75376OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ImageView f75377OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public RecyclerView f75378OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final C29904OooOOo f75379OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ImageView f75380OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public RecyclerView f75381OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final C29906OooOOoo f75382OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public List<PenWidthVO> f75383Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public View f75384Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ImageView f75385OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public ImageView f75386OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ImageView f75387OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public View f75388Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View f75389Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public View f75390OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public ImageView f75391Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public C29947OooO0OO f75392o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public o0o00o0O.OooO f75393o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public C29948OooO0Oo f75394o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public o0o00Ooo.OooOO0 f75395o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public C29953OooOO0o f75396o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public C29951OooO0oO f75397o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public C29949OooO0o f75398o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public C29952OooO0oo f75399o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.toolbox.OooO00o f75400o00000o0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final C32447OooOOo f75401o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ImageView f75402o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public ViewGroup f75403o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final Handler f75404o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final o000O000.OooOO0 f75405o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public OooOO0.OooO00o f75406o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final C32447OooOOo f75407o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final C32447OooOOo f75408o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final LinkedList f75409o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public o0o00o0O.OooOO0O f75410o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public C29950OooO0o0 f75411o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final C32447OooOOo f75412o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public final C32447OooOOo f75413o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public ImageView f75414o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final C32447OooOOo f75415o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final C32447OooOOo f75416o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public final C32447OooOOo f75417o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public Animator f75418oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public final C32447OooOOo f75419oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ImageView f75420ooOO;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public static final int f75355o0000Ooo = o000000O.OooO0o(80);

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public static final int f75352o00000oO = o000000O.OooO0o(72);

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public static final int f75353o00000oo = o000000O.OooO0o(72);

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public static final int f75351o0000 = o000000O.OooO0o(6);

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public static final int f75354o0000O00 = o000000O.OooO0o(6);

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public static final int f75357o0000oo = o000000O.OooO0o(12);

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public static final int f75356o0000oO = o000000O.OooO0o(8);
    public static final int o0000O0 = o000000O.OooO0o(480);

    public /* synthetic */ class OooO extends C24019OooOO0o implements InterfaceC32507OooOO0o<Boolean, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) this.receiver;
            int i = PenBoxChildFragment.f75355o0000Ooo;
            penBoxChildFragment.Oooooo(23, bool2);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f75421OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f75422OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f75423OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO00o r0 = new com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO00o
                java.lang.String r1 = "PORTRAIT"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO00o.f75422OooOo0o = r0
                com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO00o r1 = new com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO00o
                java.lang.String r2 = "LANDSCAPE"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO00o.f75421OooOo = r1
                com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO00o[] r0 = new com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO00o[]{r0, r1}
                com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO00o.f75423OooOoO0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f75423OooOoO0.clone();
        }
    }

    public interface OooO0O0 {
        int OooO00o();
    }

    public static final class OooO0OO implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f75424OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f75427OooOoO0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f75425OooOo0o = o000000O.OooO0o(70);

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final PointF f75426OooOoO = new PointF();

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final PointF f75428OooOoOO = new PointF();

        public final class OooO00o implements OooO0O0 {
            public OooO00o() {
            }

            @Override // com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO0O0
            public final int OooO00o() {
                OooO0OO oooO0OO = OooO0OO.this;
                if (OooO0OO.OooO00o(oooO0OO)) {
                    return 11;
                }
                PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
                View view = penBoxChildFragment.f75365Oooo00O;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ViewParent parent = view.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                int width = ((ViewGroup) parent).getWidth();
                View view2 = penBoxChildFragment.f75365Oooo00O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                float x = view2.getX();
                View view3 = penBoxChildFragment.f75365Oooo00O;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                float y = view3.getY();
                View view4 = penBoxChildFragment.f75365Oooo00O;
                if (view4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                int width2 = view4.getWidth();
                if (penBoxChildFragment.f75365Oooo00O == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                float f = x + (width2 / 2);
                float height = (r10.getHeight() / 2) + y;
                View view5 = penBoxChildFragment.f75365Oooo00O;
                if (view5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                float rotation = view5.getRotation();
                Matrix matrix = new Matrix();
                matrix.setRotate(-rotation, f, height);
                matrix.mapPoints(new float[]{f, height});
                if (y < oooO0OO.f75425OooOo0o) {
                    double d = ((double) width) * 0.5d;
                    if (r1[0] > d - (((double) penBoxChildFragment.Oooo00o()) * 0.3d) && r1[0] < (((double) penBoxChildFragment.Oooo00o()) * 0.3d) + d) {
                        return 9;
                    }
                }
                if (OooO0OO.OooO0O0(oooO0OO)) {
                    return 12;
                }
                return OooO0OO.OooO0OO(oooO0OO) ? 10 : 8;
            }
        }

        public final class OooO0O0 implements OooO0O0 {
            public OooO0O0() {
            }

            @Override // com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment.OooO0O0
            public final int OooO00o() {
                OooO0OO oooO0OO = OooO0OO.this;
                if (OooO0OO.OooO00o(oooO0OO)) {
                    return 11;
                }
                if (OooO0OO.OooO0O0(oooO0OO)) {
                    return 12;
                }
                return OooO0OO.OooO0OO(oooO0OO) ? 10 : 8;
            }
        }

        public OooO0OO() {
        }

        public static final boolean OooO00o(OooO0OO oooO0OO) {
            PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
            View view = penBoxChildFragment.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            ViewParent parent = view.getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            View view2 = penBoxChildFragment.f75365Oooo00O;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float x = view2.getX();
            View view3 = penBoxChildFragment.f75365Oooo00O;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float y = view3.getY();
            View view4 = penBoxChildFragment.f75365Oooo00O;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            int width2 = view4.getWidth();
            View view5 = penBoxChildFragment.f75365Oooo00O;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            int height2 = view5.getHeight();
            float f = x + (width2 / 2);
            float f2 = (height2 / 2) + y;
            View view6 = penBoxChildFragment.f75365Oooo00O;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float rotation = view6.getRotation();
            Matrix matrix = new Matrix();
            matrix.setRotate(-rotation, f, f2);
            matrix.mapPoints(new float[]{f, f2});
            if (y + height2 > height - oooO0OO.f75425OooOo0o) {
                double d = ((double) width) * 0.5d;
                if (r2[0] > d - (((double) penBoxChildFragment.Oooo00o()) * 0.3d) && r2[0] < (((double) penBoxChildFragment.Oooo00o()) * 0.3d) + d) {
                    return true;
                }
            }
            return false;
        }

        public static final boolean OooO0O0(OooO0OO oooO0OO) {
            PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
            View view = penBoxChildFragment.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            ViewParent parent = view.getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int height = ((ViewGroup) parent).getHeight();
            View view2 = penBoxChildFragment.f75365Oooo00O;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float x = view2.getX();
            View view3 = penBoxChildFragment.f75365Oooo00O;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float y = view3.getY();
            View view4 = penBoxChildFragment.f75365Oooo00O;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            int width = view4.getWidth();
            if (penBoxChildFragment.f75365Oooo00O == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float f = x + (width / 2);
            float height2 = y + (r10.getHeight() / 2);
            View view5 = penBoxChildFragment.f75365Oooo00O;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float rotation = view5.getRotation();
            Matrix matrix = new Matrix();
            matrix.setRotate(-rotation, f, height2);
            float[] fArr = {f, height2};
            matrix.mapPoints(fArr);
            if (fArr[0] < oooO0OO.f75425OooOo0o) {
                double d = ((double) height) * 0.5d;
                if (fArr[1] > d - (((double) penBoxChildFragment.Oooo00o()) * 0.3d) && fArr[1] < (((double) penBoxChildFragment.Oooo00o()) * 0.3d) + d) {
                    return true;
                }
            }
            return false;
        }

        public static final boolean OooO0OO(OooO0OO oooO0OO) {
            PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
            View view = penBoxChildFragment.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            ViewParent parent = view.getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            View view2 = penBoxChildFragment.f75365Oooo00O;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float x = view2.getX();
            View view3 = penBoxChildFragment.f75365Oooo00O;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float y = view3.getY();
            View view4 = penBoxChildFragment.f75365Oooo00O;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            int width2 = view4.getWidth();
            if (penBoxChildFragment.f75365Oooo00O == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float f = x + (width2 / 2);
            float height2 = y + (r11.getHeight() / 2);
            View view5 = penBoxChildFragment.f75365Oooo00O;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float rotation = view5.getRotation();
            Matrix matrix = new Matrix();
            matrix.setRotate(-rotation, f, height2);
            float[] fArr = {f, height2};
            matrix.mapPoints(fArr);
            if (fArr[0] > width - oooO0OO.f75425OooOo0o) {
                double d = ((double) height) * 0.5d;
                if (fArr[1] > d - (((double) penBoxChildFragment.Oooo00o()) * 0.3d) && fArr[1] < (((double) penBoxChildFragment.Oooo00o()) * 0.3d) + d) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        
            if (r13 != 3) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View view, MotionEvent event) {
            int iIntValue;
            kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            float rawX = event.getRawX();
            float rawY = event.getRawY();
            int action = event.getAction() & 255;
            PointF pointF = this.f75426OooOoO;
            PointF pointF2 = this.f75428OooOoOO;
            PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
            Object next = null;
            boolean z = false;
            if (action == 0) {
                this.f75424OooOo = false;
                this.f75427OooOoO0 = System.currentTimeMillis();
                pointF.set(rawX, rawY);
                pointF2.set(rawX, rawY);
                View view2 = penBoxChildFragment.f75365Oooo00O;
                if (view2 != null) {
                    view2.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), PointerIconCompat.TYPE_GRABBING));
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (action != 1) {
                if (action == 2) {
                    float f = rawX - pointF2.x;
                    float f2 = rawY - pointF2.y;
                    View view3 = penBoxChildFragment.f75365Oooo00O;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view3.setX(view3.getX() + f);
                    View view4 = penBoxChildFragment.f75365Oooo00O;
                    if (view4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    view4.setY(Math.max(0.0f, view4.getY() + f2));
                    pointF2.set(rawX, rawY);
                    if (!this.f75424OooOo) {
                        int scaledTouchSlop = ViewConfiguration.get(penBoxChildFragment.requireContext()).getScaledTouchSlop();
                        float f3 = rawX - pointF.x;
                        float f4 = rawY - pointF.y;
                        float f5 = scaledTouchSlop * scaledTouchSlop;
                        if ((f4 * f4) + (f3 * f3) > f5) {
                            z = true;
                            this.f75424OooOo = z;
                            if (z) {
                                int iOooO00o = (penBoxChildFragment.Ooooo0o() ? new OooO0O0() : new OooO00o()).OooO00o();
                                penBoxChildFragment.Oooo0o().OooO(iOooO00o);
                                if (iOooO00o == 8) {
                                    penBoxChildFragment.Oooo0o().OooOO0(1);
                                }
                            }
                        } else {
                            float f6 = rawX - pointF2.x;
                            float f7 = rawY - pointF2.y;
                            if ((f7 * f7) + (f6 * f6) > f5) {
                            }
                            this.f75424OooOo = z;
                            if (z) {
                            }
                        }
                    }
                }
                return true;
            }
            View view5 = penBoxChildFragment.f75365Oooo00O;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view5.setPointerIcon(PointerIcon.getSystemIcon(view.getContext(), 1000));
            if (System.currentTimeMillis() - this.f75427OooOoO0 < 100 && !this.f75424OooOo) {
                View view6 = penBoxChildFragment.f75365Oooo00O;
                if (view6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view6.requestFocus();
                penBoxChildFragment.Oooo0o().OooOO0(0);
                return true;
            }
            Integer num = (Integer) penBoxChildFragment.Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
            int iIntValue2 = num != null ? num.intValue() : 1;
            View view7 = penBoxChildFragment.f75365Oooo00O;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            ViewParent parent = view7.getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            int width = ((ViewGroup) parent).getWidth();
            View view8 = penBoxChildFragment.f75365Oooo00O;
            if (view8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            ViewParent parent2 = view8.getParent();
            kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            int height = ((ViewGroup) parent2).getHeight();
            View view9 = penBoxChildFragment.f75365Oooo00O;
            if (view9 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float x = view9.getX();
            if (penBoxChildFragment.f75365Oooo00O == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float width2 = x + (r2.getWidth() / 2);
            View view10 = penBoxChildFragment.f75365Oooo00O;
            if (view10 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float y = view10.getY();
            if (penBoxChildFragment.f75365Oooo00O == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            float height2 = y + (r3.getHeight() / 2);
            if (iIntValue2 == 1) {
                float f8 = width2 * width2;
                float f9 = height2 * height2;
                float f10 = width - width2;
                float f11 = f10 * f10;
                float f12 = height - height2;
                float f13 = f12 * f12;
                iIntValue = 6;
                Iterator it = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, Float.valueOf(f8 + f9)), new C32443OooOOO(2, Float.valueOf(f9 + f11)), new C32443OooOOO(4, Float.valueOf(f11 + f13)), new C32443OooOOO(6, Float.valueOf(f13 + f8))).entrySet().iterator();
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
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    iIntValue = ((Number) entry.getKey()).intValue();
                }
            } else {
                iIntValue = 5;
                Iterator it2 = C34444Oooo0O0.OooO0oo(new C32443OooOOO(7, Float.valueOf(Math.abs(width2))), new C32443OooOOO(1, Float.valueOf(Math.abs(height2))), new C32443OooOOO(3, Float.valueOf(Math.abs(width - width2))), new C32443OooOOO(5, Float.valueOf(Math.abs(height - height2)))).entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        float fFloatValue3 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                        do {
                            Object next3 = it2.next();
                            float fFloatValue4 = ((Number) ((Map.Entry) next3).getValue()).floatValue();
                            if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                                next = next3;
                                fFloatValue3 = fFloatValue4;
                            }
                        } while (it2.hasNext());
                    }
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    iIntValue = ((Number) entry2.getKey()).intValue();
                }
            }
            penBoxChildFragment.Oooo0o().OooO(iIntValue);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class ViewOnLayoutChangeListenerC23487OooO0Oo implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC23487OooO0Oo() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int i9 = PenBoxChildFragment.f75355o0000Ooo;
            PenBoxChildFragment.this.Oooo0oO();
        }
    }

    public /* synthetic */ class OooO0o extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBoxChildFragment.OooOoo0((PenBoxChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class ViewOnLayoutChangeListenerC23488OooO0o0 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f75433OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f75435OooOoO0;

        public ViewOnLayoutChangeListenerC23488OooO0o0(int i, boolean z) {
            this.f75433OooOo = i;
            this.f75435OooOoO0 = z;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            int i9 = PenBoxChildFragment.f75355o0000Ooo;
            PenBoxChildFragment.this.Oooo(this.f75433OooOo, this.f75435OooOoO0, true);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO0oO, reason: case insensitive filesystem */
    public /* synthetic */ class C23489OooO0oO extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBoxChildFragment.OooOoo0((PenBoxChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooO0oo, reason: case insensitive filesystem */
    public /* synthetic */ class C23490OooO0oo extends C24019OooOO0o implements oO0O000o.OooO00o<C32460OooOooO> {
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            PenBoxChildFragment.OooOoOO((PenBoxChildFragment) this.receiver);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public /* synthetic */ class OooOO0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Integer, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Integer num) {
            int iIntValue = num.intValue();
            PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) this.receiver;
            int i = PenBoxChildFragment.f75355o0000Ooo;
            penBoxChildFragment.Oooooo(22, Integer.valueOf(iIntValue));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public /* synthetic */ class OooOO0O extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBoxChildFragment.OooOoo0((PenBoxChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOO0o, reason: case insensitive filesystem */
    public /* synthetic */ class C23491OooOO0o extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBoxChildFragment.OooOoo0((PenBoxChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return PenBoxChildFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return PenBoxChildFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return PenBoxChildFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23492OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29253OooO00o f75439OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23492OooOOOo(C29253OooO00o c29253OooO00o) {
            super(0);
            this.f75439OooOo0o = c29253OooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75439OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23493OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75440OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23493OooOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75440OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75440OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23494OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75441OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23494OooOOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75441OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75441OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23495OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75442OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23495OooOOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75442OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75442OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PenBoxChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOo extends AnimatorListenerAdapter {
        public OooOo() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(animation, "animation");
            PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
            penBoxChildFragment.f75418oo000o = null;
            penBoxChildFragment.Ooooooo();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(animation, "animation");
            PenBoxChildFragment penBoxChildFragment = PenBoxChildFragment.this;
            penBoxChildFragment.f75418oo000o = null;
            penBoxChildFragment.Ooooooo();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOo0, reason: case insensitive filesystem */
    public static final class C23496OooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75445OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23496OooOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75445OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75445OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.ink.geometry.OooOO0 f75446OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(androidx.ink.geometry.OooOO0 oooOO02) {
            super(0);
            this.f75446OooOo0o = oooOO02;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75446OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23497OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75447OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23497OooOo0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75447OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75447OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23498OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75448OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23498OooOo0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75448OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75448OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PenBoxChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOoO, reason: case insensitive filesystem */
    public /* synthetic */ class C23499OooOoO extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Continuation<? super Boolean>, Object> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return PenBoxChildFragment.OooOoo0((PenBoxChildFragment) this.receiver, num.intValue(), continuation);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment$OooOoO0, reason: case insensitive filesystem */
    public /* synthetic */ class C23500OooOoO0 extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Object, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(Integer num, Object obj) {
            int iIntValue = num.intValue();
            PenBoxChildFragment penBoxChildFragment = (PenBoxChildFragment) this.receiver;
            int i = PenBoxChildFragment.f75355o0000Ooo;
            penBoxChildFragment.Oooooo(iIntValue, obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public PenBoxChildFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75359OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooOOO0(), new OooOOOO(), new OooOOO());
        C29253OooO00o c29253OooO00o = new C29253OooO00o(this);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23492OooOOOo(c29253OooO00o));
        this.f75358OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23494OooOOo0(interfaceC32440OooOO0OooO0O0), new C23495OooOOoo(interfaceC32440OooOO0OooO0O0), new C23493OooOOo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooOo00(new androidx.ink.geometry.OooOO0(this, 2)));
        this.f75360OooOooO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.class), new C23496OooOo0(interfaceC32440OooOO0OooO0O02), new C23498OooOo0o(interfaceC32440OooOO0OooO0O02), new C23497OooOo0O(interfaceC32440OooOO0OooO0O02));
        this.f75371Oooo0oO = new LinkedHashMap();
        this.f75372Oooo0oo = new OooO0OO();
        this.f75375OoooO00 = new C29901OooO0oo();
        this.f75374OoooO0 = new C29317OooooO0(0, 0);
        this.f75379OoooOOo = new C29904OooOOo();
        this.f75382OoooOoo = new C29906OooOOoo();
        this.f75404o00Oo0 = new Handler(Looper.getMainLooper());
        this.f75405o00Ooo = new o000O000.OooOO0(this, 2);
        this.f75409o00ooo = new LinkedList();
        this.f75408o00oO0o = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Ooo.OooOoo0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103804OooOo0o;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                    throw null;
                }
                C26320o0000OoO c26320o0000OoOOooo0o0 = penBoxChildFragment.Oooo0o0();
                Context contextRequireContext = penBoxChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                return new o0o00o.OooOOO0(oooO0O0Oooo0o, interfaceC21987OooOoo, c26320o0000OoOOooo0o0, contextRequireContext, penBoxChildFragment.getActivity(), new PenBoxChildFragment.C23489OooO0oO(2, penBoxChildFragment, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new PenBoxChildFragment.C23490OooO0oo(0, penBoxChildFragment, PenBoxChildFragment.class, "dismissPopupWindow", "dismissPopupWindow()V", 0));
            }
        });
        this.f75407o00oO0O = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Ooo.OooOoo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103803OooOo0o;
                return new C29928OooOO0o(penBoxChildFragment.Oooo0o(), penBoxChildFragment.getActivity());
            }
        });
        this.f75415o0ooOO0 = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Ooo.OooOooO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103805OooOo0o;
                return new o0o00o.OooOOO(penBoxChildFragment.Oooo0o(), new PenBoxChildFragment.OooO(1, penBoxChildFragment, PenBoxChildFragment.class, "setLassoShapeFillColorEnable", "setLassoShapeFillColorEnable(Z)V", 0), new PenBoxChildFragment.OooOO0(1, penBoxChildFragment, PenBoxChildFragment.class, "setLassoShapeFillColorOpacity", "setLassoShapeFillColorOpacity(I)V", 0), new PenBoxChildFragment.OooOO0O(2, penBoxChildFragment, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            }
        });
        this.f75416o0ooOOo = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Ooo.OooOooo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i = 0;
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103806OooOo0o;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o.OooOO0O(oooO0O0Oooo0o, interfaceC21987OooOoo, new C28619OooOOo0(penBoxChildFragment, 1), new C29252OooO(penBoxChildFragment, i), new C29261OooOO0(penBoxChildFragment, i));
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
        });
        int i = 1;
        this.f75417o0ooOoO = C20519OooO0Oo.OooO0OO(new androidx.ink.strokes.OooO0O0(this, i));
        this.f75412o0OOO0o = C20519OooO0Oo.OooO0OO(new C26201OooO0o0(this, i));
        this.f75413o0Oo0oo = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0Ooo.OooO0O0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                PenBoxChildFragment penBoxChildFragment = this.f103748OooOo0o;
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = penBoxChildFragment.Oooo0o();
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBoxChildFragment.f75364Oooo000;
                if (interfaceC21987OooOoo != null) {
                    return new o0o00o.OooOO0(oooO0O0Oooo0o, interfaceC21987OooOoo);
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
        });
        int i2 = 0;
        this.f75419oo0o0Oo = C20519OooO0Oo.OooO0OO(new C29260OooO0oo(this, i2));
        this.f75401o000OOo = C20519OooO0Oo.OooO0OO(new C29264OooOOO(this, i2));
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
      0x00d9: PHI (r10v7 com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment) = 
      (r10v5 com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment)
      (r10v8 com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment)
     binds: [B:43:0x00b9, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff A[PHI: r9 r10
      0x00ff: PHI (r9v12 com.orion.notein.ui.vo.PenVO) = (r9v9 com.orion.notein.ui.vo.PenVO), (r9v15 com.orion.notein.ui.vo.PenVO) binds: [B:52:0x00df, B:57:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r10v9 com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment) = 
      (r10v7 com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment)
      (r10v12 com.orion.notein.ui.noteeditor.penbox.PenBoxChildFragment)
     binds: [B:52:0x00df, B:57:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(PenBoxChildFragment penBoxChildFragment, PenVO penVO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Oooo000 oooo000;
        PenBoxChildFragment penBoxChildFragment2;
        PenVO penVO2;
        penBoxChildFragment.getClass();
        if (abstractC32479OooO0OO instanceof Oooo000) {
            oooo000 = (Oooo000) abstractC32479OooO0OO;
            int i = oooo000.f103814OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f103814OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(penBoxChildFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = oooo000.f103813OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooo000.f103814OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (penVO.getType() == 7) {
                C26320o0000OoO c26320o0000OoOOooo0o0 = penBoxChildFragment.Oooo0o0();
                oooo000.f103811OooOo0o = penBoxChildFragment;
                oooo000.f103810OooOo = penVO;
                oooo000.f103814OooOoOO = 1;
                objOooOOO0 = c26320o0000OoOOooo0o0.OooOOO0(3, oooo000);
            } else if (penVO.getType() != 8) {
                C26320o0000OoO c26320o0000OoOOooo0o02 = penBoxChildFragment.Oooo0o0();
                oooo000.f103811OooOo0o = penBoxChildFragment;
                oooo000.f103810OooOo = penVO;
                oooo000.f103814OooOoOO = 2;
                objOooOOO0 = c26320o0000OoOOooo0o02.OooOOO0(4, oooo000);
                if (objOooOOO0 != enumC32485OooO00o) {
                    PenVO penVO3 = penVO;
                    penBoxChildFragment2 = penBoxChildFragment;
                    penVO2 = penVO3;
                    if (((Number) objOooOOO0).intValue() != 0) {
                    }
                    if (penVO2.getType() == 11) {
                    }
                }
            } else {
                PenVO penVO4 = penVO;
                penBoxChildFragment2 = penBoxChildFragment;
                penVO2 = penVO4;
                if (penVO2.getType() == 11) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                penVO2 = oooo000.f103810OooOo;
                penBoxChildFragment2 = oooo000.f103811OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Number) objOooOOO0).intValue() != 0) {
                    return Boolean.FALSE;
                }
                if (penVO2.getType() == 11) {
                    C26320o0000OoO c26320o0000OoOOooo0o03 = penBoxChildFragment2.Oooo0o0();
                    oooo000.f103811OooOo0o = penBoxChildFragment2;
                    oooo000.f103810OooOo = penVO2;
                    oooo000.f103814OooOoOO = 3;
                    objOooOOO0 = c26320o0000OoOOooo0o03.OooOOO0(13, oooo000);
                } else if (penVO2.getType() == 10) {
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                penVO2 = oooo000.f103810OooOo;
                penBoxChildFragment2 = oooo000.f103811OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Number) objOooOOO0).intValue() != 0) {
                    return Boolean.FALSE;
                }
                if (penVO2.getType() == 10) {
                    if (penVO2.getType() == 12) {
                    }
                    return Boolean.TRUE;
                }
                C26320o0000OoO c26320o0000OoOOooo0o04 = penBoxChildFragment2.Oooo0o0();
                oooo000.f103811OooOo0o = penBoxChildFragment2;
                oooo000.f103810OooOo = penVO2;
                oooo000.f103814OooOoOO = 4;
                objOooOOO0 = c26320o0000OoOOooo0o04.OooOOO0(16, oooo000);
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
            penVO2 = oooo000.f103810OooOo;
            penBoxChildFragment2 = oooo000.f103811OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (((Number) objOooOOO0).intValue() != 0) {
                return Boolean.FALSE;
            }
            if (penVO2.getType() == 12) {
                C26320o0000OoO c26320o0000OoOOooo0o05 = penBoxChildFragment2.Oooo0o0();
                oooo000.f103811OooOo0o = null;
                oooo000.f103810OooOo = null;
                oooo000.f103814OooOoOO = 5;
                objOooOOO0 = c26320o0000OoOOooo0o05.OooOOO0(47, oooo000);
            }
            return Boolean.TRUE;
        }
        penVO = oooo000.f103810OooOo;
        penBoxChildFragment = oooo000.f103811OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO0);
        if (((Number) objOooOOO0).intValue() != 0) {
            return Boolean.FALSE;
        }
        if (penVO.getType() != 8) {
        }
    }

    public static final void OooOoOO(PenBoxChildFragment penBoxChildFragment) {
        o0o00Ooo.OooOO0 oooOO02 = penBoxChildFragment.f75395o000000o;
        if (oooOO02 != null) {
            oooOO02.dismiss();
        }
        C29952OooO0oo c29952OooO0oo = penBoxChildFragment.f75399o00000Oo;
        if (c29952OooO0oo != null) {
            c29952OooO0oo.dismiss();
        }
        C29950OooO0o0 c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O;
        if (c29950OooO0o0 != null) {
            c29950OooO0o0.dismiss();
        }
        C29948OooO0Oo c29948OooO0Oo = penBoxChildFragment.f75394o000000O;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.dismiss();
        }
        o0o00o0O.OooOO0O oooOO0O = penBoxChildFragment.f75410o0O0O00;
        if (oooOO0O != null) {
            oooOO0O.dismiss();
        }
        C29947OooO0OO c29947OooO0OO = penBoxChildFragment.f75392o00000;
        if (c29947OooO0OO != null) {
            c29947OooO0OO.dismiss();
        }
        C29951OooO0oO c29951OooO0oO = penBoxChildFragment.f75397o00000O0;
        if (c29951OooO0oO != null) {
            c29951OooO0oO.dismiss();
        }
        C29953OooOO0o c29953OooOO0o = penBoxChildFragment.f75396o00000O;
        if (c29953OooOO0o != null) {
            c29953OooOO0o.dismiss();
        }
        C29949OooO0o c29949OooO0o = penBoxChildFragment.f75398o00000OO;
        if (c29949OooO0o != null) {
            c29949OooO0o.dismiss();
        }
        o0o00o0O.OooO oooO = penBoxChildFragment.f75393o000000;
        if (oooO != null) {
            oooO.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(PenBoxChildFragment penBoxChildFragment, int i, Continuation continuation) {
        C29307OoooO00 c29307OoooO00;
        boolean zBooleanValue;
        penBoxChildFragment.getClass();
        if (continuation instanceof C29307OoooO00) {
            c29307OoooO00 = (C29307OoooO00) continuation;
            int i2 = c29307OoooO00.f103949OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29307OoooO00.f103949OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29307OoooO00 = new C29307OoooO00(penBoxChildFragment, continuation);
            }
        }
        C29307OoooO00 c29307OoooO002 = c29307OoooO00;
        Object objShowNonVipFeatureLimitedDialog$default = c29307OoooO002.f103948OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29307OoooO002.f103949OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = penBoxChildFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29307OoooO002.f103949OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29307OoooO002, 6, null);
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

    public static void OoooO0(PenBoxChildFragment penBoxChildFragment) {
        C29950OooO0o0 c29950OooO0o0 = penBoxChildFragment.f75411o0OO00O;
        if (c29950OooO0o0 != null) {
            c29950OooO0o0.dismiss();
        }
        C29948OooO0Oo c29948OooO0Oo = penBoxChildFragment.f75394o000000O;
        if (c29948OooO0Oo != null) {
            c29948OooO0Oo.dismiss();
        }
        o0o00o0O.OooOO0O oooOO0O = penBoxChildFragment.f75410o0O0O00;
        if (oooOO0O != null) {
            oooOO0O.dismiss();
        }
        o0o00Ooo.OooOO0 oooOO02 = penBoxChildFragment.f75395o000000o;
        if (oooOO02 != null) {
            oooOO02.dismiss();
        }
        C29947OooO0OO c29947OooO0OO = penBoxChildFragment.f75392o00000;
        if (c29947OooO0OO != null) {
            c29947OooO0OO.dismiss();
        }
        C29951OooO0oO c29951OooO0oO = penBoxChildFragment.f75397o00000O0;
        if (c29951OooO0oO != null) {
            c29951OooO0oO.dismiss();
        }
        C29953OooOO0o c29953OooOO0o = penBoxChildFragment.f75396o00000O;
        if (c29953OooOO0o != null) {
            c29953OooOO0o.dismiss();
        }
        C29949OooO0o c29949OooO0o = penBoxChildFragment.f75398o00000OO;
        if (c29949OooO0o != null) {
            c29949OooO0o.dismiss();
        }
        C29952OooO0oo c29952OooO0oo = penBoxChildFragment.f75399o00000Oo;
        if (c29952OooO0oo != null) {
            c29952OooO0oo.dismiss();
        }
        com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = penBoxChildFragment.f75400o00000o0;
        if (oooO00o != null) {
            oooO00o.dismiss();
        }
        o0o00o0O.OooO oooO = penBoxChildFragment.f75393o000000;
        if (oooO != null) {
            oooO.dismiss();
        }
        for (Map.Entry entry : penBoxChildFragment.f75371Oooo0oO.entrySet()) {
            ((Number) entry.getKey()).intValue();
            InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) entry.getValue();
            if (interfaceC32440OooOO0.isInitialized()) {
                Object value = interfaceC32440OooOO0.getValue();
                if (value instanceof C29869OooO0Oo) {
                    ((C29869OooO0Oo) value).OooO00o();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0Ooo0oo.InterfaceC29545o000O0oo
    public final void OooOOO0() {
        Integer num;
        Object next;
        View view;
        View view2;
        PenVO penVO = (PenVO) Oooo0o().f75176Oooo0o0.f121747OooOo0o.getValue();
        if (penVO == null || (num = (Integer) Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue()) == null) {
            return;
        }
        int iIntValue = num.intValue();
        Iterator it = ((Iterable) Oooo0o().f75193OooooOo.f121747OooOo0o.getValue()).iterator();
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
        Iterator it2 = ((List) Oooo0o().f75174Oooo0OO.f121747OooOo0o.getValue()).iterator();
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
        Integer num2 = (Integer) Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
        if (num2 != null && num2.intValue() == 1) {
            View view3 = this.f75365Oooo00O;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view2 = view3;
        } else {
            if (i >= 0) {
                RecyclerView recyclerView = this.f75362Oooo;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
                    throw null;
                }
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooOFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
                if ((abstractC22078OooOooOFindViewHolderForAdapterPosition == null || (view = abstractC22078OooOooOFindViewHolderForAdapterPosition.itemView) == null) && (view = this.f75376OoooO0O) == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
            } else {
                view = this.f75376OoooO0O;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
            }
            view2 = view;
        }
        switch (penVO.getType()) {
            case 0:
            case 1:
                List<PenVO> list = (List) Oooo0o().f75172Oooo00o.f121747OooOo0o.getValue();
                List<PenColorVO> list2 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o.OooO0OO("TOOL_BALLPOINT_PEN, TOOL_FOUNTAIN_PEN penWidthVO is null", new Object[0]);
                    return;
                } else {
                    OoooOO0();
                    C29950OooO0o0 c29950OooO0o0 = this.f75411o0OO00O;
                    if (c29950OooO0o0 != null) {
                        c29950OooO0o0.OooO0oO(view2, iIntValue, penVO, list, list2, penWidthVO);
                        return;
                    }
                    return;
                }
            case 2:
            case 9:
                List<PenVO> list3 = (List) Oooo0o().f75173Oooo0O0.f121747OooOo0o.getValue();
                List<PenColorVO> list4 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o2.OooO0OO("PEN_HIGHLIGHTER_PEN, PEN_HIGHLIGHTER_PEN_RECT penWidthVO is null", new Object[0]);
                    return;
                } else {
                    OoooO();
                    C29948OooO0Oo c29948OooO0Oo = this.f75394o000000O;
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
                    c20358OooO00o3.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o3.OooO0OO("PEN_ERASER penWidthVO is null", new Object[0]);
                    return;
                } else {
                    view2.setTag(penVO);
                    OoooO0O();
                    C29947OooO0OO c29947OooO0OO = this.f75392o00000;
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
                List list5 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                view2.setTag(penVO);
                OoooOOO();
                C29951OooO0oO c29951OooO0oO = this.f75397o00000O0;
                if (c29951OooO0oO != null) {
                    string6.equals(TelemetryEventStrings.Value.TRUE);
                    c29951OooO0oO.OooO0Oo(view2, iIntValue, str2, list5, listOoooOO0, this.f75361OooOooo);
                    return;
                }
                return;
            case 5:
            case 6:
            default:
                return;
            case 7:
                List list6 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o4.OooO0OO("PEN_LASER_PEN penWidthVO is null", new Object[0]);
                    return;
                }
                view2.setTag(penVO);
                o000oOoO();
                C29949OooO0o c29949OooO0o = this.f75398o00000OO;
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
                List list7 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o5.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o5.OooO0OO("PEN_VECTOR_PEN penWidthVO is null", new Object[0]);
                    return;
                } else {
                    view2.setTag(penVO);
                    OoooOoo();
                    C29953OooOO0o c29953OooOO0o = this.f75396o00000O;
                    if (c29953OooOO0o != null) {
                        c29953OooOO0o.OooO0o(view2, iIntValue, list7, penWidthVO);
                        return;
                    }
                    return;
                }
            case 10:
            case 12:
                List<PenVO> list8 = (List) Oooo0o().f75169Oooo0.f121747OooOo0o.getValue();
                List<PenColorVO> list9 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o6.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o6.OooO0OO("PEN_PENCIL, PEN_RAINBOW penWidthVO is null", new Object[0]);
                    return;
                } else {
                    OoooOo0();
                    o0o00o0O.OooO oooO = this.f75393o000000;
                    if (oooO != null) {
                        oooO.OooO0Oo(view2, iIntValue, penVO, list8, list9, penWidthVO);
                        return;
                    }
                    return;
                }
            case 11:
                List<PenColorVO> list10 = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                if (penWidthVO == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o7.OooOOO0("PenBoxChildFragment");
                    c20358OooO00o7.OooO0OO("PEN_TAPE_PEN penWidthVO is null", new Object[0]);
                    return;
                } else {
                    view2.setTag(penVO);
                    OoooOoO();
                    o0o00o0O.OooOO0O oooOO0O = this.f75410o0O0O00;
                    if (oooOO0O != null) {
                        oooOO0O.OooO0o0(view2, iIntValue, list10, penWidthVO);
                        return;
                    }
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoo(boolean z) {
        Integer num = (Integer) Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
        if (num != null && num.intValue() == 0) {
            boolean zOoooo0o = Ooooo0o();
            PenVO penVO = (PenVO) Oooo0o().f75176Oooo0o0.f121747OooOo0o.getValue();
            int type = penVO != null ? penVO.getType() : -1;
            EnumC29316Ooooo0o enumC29316Ooooo0o = zOoooo0o ? EnumC29316Ooooo0o.f103961OooOo0o : type != 3 ? type != 4 ? EnumC29316Ooooo0o.f103960OooOo : EnumC29316Ooooo0o.f103962OooOoO : EnumC29316Ooooo0o.f103963OooOoO0;
            EnumC29316Ooooo0o enumC29316Ooooo0o2 = EnumC29316Ooooo0o.f103961OooOo0o;
            boolean z2 = enumC29316Ooooo0o == enumC29316Ooooo0o2;
            if (z) {
                View view = this.f75365Oooo00O;
                if (view == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = z2 ? getResources().getDimensionPixelSize(R.dimen.small_pen_box_container_width) : Oooo00o();
                view.setLayoutParams(layoutParams);
                View view2 = this.f75365Oooo00O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                view2.requestLayout();
            }
            View view3 = this.f75367Oooo0O0;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            layoutParams2.width = z2 ? getResources().getDimensionPixelSize(R.dimen.small_pen_box_content_width) : getResources().getDimensionPixelSize(R.dimen.normal_pen_box_content_width);
            view3.setLayoutParams(layoutParams2);
            View view4 = this.f75367Oooo0O0;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
                throw null;
            }
            view4.requestLayout();
            boolean z3 = enumC29316Ooooo0o == enumC29316Ooooo0o2;
            RecyclerView recyclerView = this.f75362Oooo;
            if (recyclerView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            ConstraintLayout.OooO00o oooO00o = layoutParams3 instanceof ConstraintLayout.OooO00o ? (ConstraintLayout.OooO00o) layoutParams3 : null;
            if (oooO00o != null) {
                C29317OooooO0 c29317OooooO0 = this.f75374OoooO0;
                C29317OooooO0 c29317OooooO02 = z3 ? new C29317OooooO0(0, 0) : new C29317OooooO0(c29317OooooO0.f103965OooO00o, c29317OooooO0.f103966OooO0O0);
                oooO00o.setMarginStart(c29317OooooO02.f103965OooO00o);
                oooO00o.setMarginEnd(c29317OooooO02.f103966OooO0O0);
                if (z3) {
                    oooO00o.f63897OooOo00 = 0;
                    oooO00o.f63894OooOOoo = -1;
                    oooO00o.f63896OooOo0 = -1;
                    oooO00o.f63898OooOo0O = 0;
                    RecyclerView recyclerView2 = this.f75362Oooo;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
                        throw null;
                    }
                    recyclerView2.setLayoutParams(oooO00o);
                } else {
                    oooO00o.f63897OooOo00 = 0;
                    oooO00o.f63894OooOOoo = -1;
                    oooO00o.f63896OooOo0 = -1;
                    oooO00o.f63898OooOo0O = -1;
                    RecyclerView recyclerView3 = this.f75362Oooo;
                    if (recyclerView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
                        throw null;
                    }
                    recyclerView3.setLayoutParams(oooO00o);
                }
            }
            boolean z4 = enumC29316Ooooo0o == enumC29316Ooooo0o2;
            View view5 = this.f75389Oooooo0;
            if (view5 != null) {
                view5.setVisibility(z4 ? 8 : 0);
            }
            View view6 = this.f75368Oooo0OO;
            if (view6 != null) {
                view6.setVisibility(z4 ? 8 : 0);
            }
            int iOrdinal = enumC29316Ooooo0o.ordinal();
            if (iOrdinal == 0) {
                View view7 = this.f75388Oooooo;
                if (view7 != null) {
                    view7.setVisibility(8);
                }
                RecyclerView recyclerView4 = this.f75378OoooOOO;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                    throw null;
                }
                recyclerView4.setVisibility(8);
                ImageView imageView = this.f75380OoooOo0;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                    throw null;
                }
                imageView.setVisibility(8);
                ImageView imageView2 = this.f75380OoooOo0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                    throw null;
                }
                imageView2.setEnabled(false);
                View view8 = this.f75384Ooooo0o;
                if (view8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
                    throw null;
                }
                view8.setVisibility(8);
                RecyclerView recyclerView5 = this.f75381OoooOoO;
                if (recyclerView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                    throw null;
                }
                recyclerView5.setVisibility(8);
                View view9 = this.f75390OoooooO;
                if (view9 != null) {
                    view9.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
                    throw null;
                }
            }
            if (iOrdinal == 1) {
                View view10 = this.f75388Oooooo;
                if (view10 != null) {
                    view10.setVisibility(4);
                }
                RecyclerView recyclerView6 = this.f75378OoooOOO;
                if (recyclerView6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                    throw null;
                }
                recyclerView6.setVisibility(0);
                ImageView imageView3 = this.f75380OoooOo0;
                if (imageView3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                    throw null;
                }
                imageView3.setVisibility(0);
                ImageView imageView4 = this.f75380OoooOo0;
                if (imageView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                    throw null;
                }
                imageView4.setEnabled(true);
                View view11 = this.f75384Ooooo0o;
                if (view11 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
                    throw null;
                }
                view11.setVisibility(8);
                RecyclerView recyclerView7 = this.f75381OoooOoO;
                if (recyclerView7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                    throw null;
                }
                recyclerView7.setVisibility(0);
                View view12 = this.f75390OoooooO;
                if (view12 != null) {
                    view12.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
                    throw null;
                }
            }
            if (iOrdinal == 2) {
                View view13 = this.f75388Oooooo;
                if (view13 != null) {
                    view13.setVisibility(0);
                }
                RecyclerView recyclerView8 = this.f75378OoooOOO;
                if (recyclerView8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                    throw null;
                }
                recyclerView8.setVisibility(8);
                ImageView imageView5 = this.f75380OoooOo0;
                if (imageView5 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                    throw null;
                }
                imageView5.setVisibility(8);
                ImageView imageView6 = this.f75380OoooOo0;
                if (imageView6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                    throw null;
                }
                imageView6.setEnabled(false);
                View view14 = this.f75384Ooooo0o;
                if (view14 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
                    throw null;
                }
                view14.setVisibility(0);
                RecyclerView recyclerView9 = this.f75381OoooOoO;
                if (recyclerView9 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                    throw null;
                }
                recyclerView9.setVisibility(0);
                View view15 = this.f75390OoooooO;
                if (view15 != null) {
                    view15.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
                    throw null;
                }
            }
            if (iOrdinal != 3) {
                throw new C32442OooOO0o();
            }
            View view16 = this.f75388Oooooo;
            if (view16 != null) {
                view16.setVisibility(4);
            }
            RecyclerView recyclerView10 = this.f75378OoooOOO;
            if (recyclerView10 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                throw null;
            }
            recyclerView10.setVisibility(0);
            ImageView imageView7 = this.f75380OoooOo0;
            if (imageView7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                throw null;
            }
            imageView7.setVisibility(8);
            ImageView imageView8 = this.f75380OoooOo0;
            if (imageView8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                throw null;
            }
            imageView8.setEnabled(false);
            View view17 = this.f75384Ooooo0o;
            if (view17 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
                throw null;
            }
            view17.setVisibility(8);
            RecyclerView recyclerView11 = this.f75381OoooOoO;
            if (recyclerView11 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                throw null;
            }
            recyclerView11.setVisibility(8);
            View view18 = this.f75390OoooooO;
            if (view18 != null) {
                view18.setVisibility(0);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
                throw null;
            }
        }
    }

    public final void OooOooO(int i) {
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view.setRotation(0.0f);
        View view2 = this.f75365Oooo00O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view2.setScaleY(1.0f);
        RecyclerView recyclerView = this.f75381OoooOoO;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        recyclerView.setScaleX(1.0f);
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setReverseLayout(false);
        recyclerView.invalidateItemDecorations();
        RecyclerView recyclerView2 = this.f75362Oooo;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
            throw null;
        }
        recyclerView2.setScaleY(1.0f);
        ViewGroup viewGroup = this.f75403o00O0O;
        if (viewGroup == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
            throw null;
        }
        viewGroup.setScaleY(1.0f);
        ViewGroup viewGroup2 = this.f75403o00O0O;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
        oooO00o.f63876OooO = 0;
        oooO00o.f63887OooOO0o = -1;
        viewGroup.setLayoutParams(oooO00o);
        RecyclerView recyclerView3 = this.f75378OoooOOO;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        if (recyclerView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = recyclerView3.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = o000000O.OooO0o(14);
        recyclerView3.setLayoutParams(marginLayoutParams);
        RecyclerView recyclerView4 = this.f75381OoooOoO;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        if (recyclerView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = recyclerView4.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams2.topMargin = o000000O.OooO0o(14);
        recyclerView4.setLayoutParams(marginLayoutParams2);
        View view3 = this.f75384Ooooo0o;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams3.topMargin = o000000O.OooO0o(21);
        view3.setLayoutParams(marginLayoutParams3);
        View view4 = this.f75390OoooooO;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams4.topMargin = o000000O.OooO0o(21);
        view4.setLayoutParams(marginLayoutParams4);
        if (i != 1) {
            if (i != 3) {
                if (i == 7 || i == 12) {
                    View view5 = this.f75365Oooo00O;
                    if (view5 != null) {
                        view5.setRotation(90.0f);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                }
                if (i != 9) {
                    if (i != 10) {
                        return;
                    }
                }
            }
            View view6 = this.f75365Oooo00O;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view6.setRotation(90.0f);
            View view7 = this.f75365Oooo00O;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view7.setScaleY(-1.0f);
            RecyclerView recyclerView5 = this.f75381OoooOoO;
            if (recyclerView5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                throw null;
            }
            recyclerView5.setScaleX(-1.0f);
            RecyclerView.OooOOOO layoutManager2 = recyclerView5.getLayoutManager();
            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager2).setReverseLayout(true);
            recyclerView5.invalidateItemDecorations();
            return;
        }
        RecyclerView recyclerView6 = this.f75362Oooo;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
            throw null;
        }
        recyclerView6.setScaleY(-1.0f);
        ViewGroup viewGroup3 = this.f75403o00O0O;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
            throw null;
        }
        viewGroup3.setScaleY(-1.0f);
        ViewGroup viewGroup4 = this.f75403o00O0O;
        if (viewGroup4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("flFavoritePenBox");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams6 = viewGroup4.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams6;
        oooO00o2.f63876OooO = -1;
        oooO00o2.f63887OooOO0o = 0;
        viewGroup3.setLayoutParams(oooO00o2);
        RecyclerView recyclerView7 = this.f75378OoooOOO;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        if (recyclerView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams7 = recyclerView7.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams7;
        marginLayoutParams5.topMargin = o000000O.OooO0o(8);
        recyclerView7.setLayoutParams(marginLayoutParams5);
        RecyclerView recyclerView8 = this.f75381OoooOoO;
        if (recyclerView8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        if (recyclerView8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams8 = recyclerView8.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams8;
        marginLayoutParams6.topMargin = o000000O.OooO0o(10);
        recyclerView8.setLayoutParams(marginLayoutParams6);
        View view8 = this.f75384Ooooo0o;
        if (view8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("clEraserType");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams9 = view8.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams9;
        marginLayoutParams7.topMargin = o000000O.OooO0o(15);
        view8.setLayoutParams(marginLayoutParams7);
        View view9 = this.f75390OoooooO;
        if (view9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("lassoTypeList");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams10 = view9.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams10, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams10;
        marginLayoutParams8.topMargin = o000000O.OooO0o(15);
        view9.setLayoutParams(marginLayoutParams8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooo() {
        Animator animator;
        List<Integer> listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(2);
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        boolean z = false;
        if (view.getVisibility() != 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBoxChildFragment");
            c20358OooO00o.OooO00o("checkBeginnerGuide: !isVisible", new Object[0]);
            Oooo00O().OoooO0O(listOooO0oO, false);
            return;
        }
        if (!this.f75409o00ooo.isEmpty() || ((animator = this.f75418oo000o) != null && animator.isRunning())) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("PenBoxChildFragment");
            c20358OooO00o2.OooO00o("checkBeginnerGuide: isAnimating", new Object[0]);
            Oooo00O().OoooO0O(listOooO0oO, false);
            this.f75404o00Oo0.postDelayed(new Runnable() { // from class: o0Ooo.OooOOOO
                @Override // java.lang.Runnable
                public final void run() {
                    int i = PenBoxChildFragment.f75355o0000Ooo;
                    this.f103774OooOo0o.OooOooo();
                }
            }, 200L);
            return;
        }
        Integer num = (Integer) Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = Oooo00O();
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        oooO0OOOooo00O.OoooO0O(listOooO0oO, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo(final int i, final boolean z, boolean z2) {
        if (!OooooO0()) {
            C34406OooO00o.f123390OooO00o.OooO00o(o0Oo0oo.OooO0O0(i, "handleUiPositionChanged: ", ", isViewReady: false"), new Object[0]);
            View view = this.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC23488OooO0o0(i, z));
                return;
            } else {
                Oooo(i, z, true);
                return;
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o(o0Oo0oo.OooO0O0(i, "handleUiPositionChanged: ", ", isViewReady: true"), new Object[0]);
        int i2 = (Ooooo0o() && i == 1) ? 5 : i;
        if (i2 != i) {
            Oooo0o().OooO(i2);
            return;
        }
        switch (i) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return;
            default:
                if (z2) {
                    OooooOO(i, z);
                } else {
                    View view2 = this.f75365Oooo00O;
                    if (view2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    if (view2.getVisibility() == 0) {
                        this.f75409o00ooo.add(new oO0O000o.OooO00o() { // from class: o0Ooo.OooOOoo
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                int i3 = PenBoxChildFragment.f75355o0000Ooo;
                                boolean z3 = z;
                                PenBoxChildFragment penBoxChildFragment = this.f103780OooOo0o;
                                int i4 = i;
                                PointF pointFOooo000 = penBoxChildFragment.Oooo000(i4, z3);
                                C34406OooO00o.f123390OooO00o.OooO00o("smoothMoveToPosition: " + i4 + ", anchorPoint: " + pointFOooo000, new Object[0]);
                                View view3 = penBoxChildFragment.f75365Oooo00O;
                                if (view3 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                float x = view3.getX();
                                View view4 = penBoxChildFragment.f75365Oooo00O;
                                if (view4 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                    throw null;
                                }
                                float y = view4.getY();
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(x, pointFOooo000.x);
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(y, pointFOooo000.y);
                                valueAnimatorOfFloat.addUpdateListener(new C29306OoooO0(penBoxChildFragment));
                                valueAnimatorOfFloat2.addUpdateListener(new C29308OoooO0O(penBoxChildFragment));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                                animatorSet.setDuration(200L);
                                animatorSet.setInterpolator(new DecelerateInterpolator());
                                animatorSet.addListener(new o000oOoO());
                                C29275OooOoOO c29275OooOoOO = new C29275OooOoOO(penBoxChildFragment);
                                animatorSet.addListener(new C29309OoooOO0(c29275OooOoOO));
                                animatorSet.addListener(new C29305OoooO(c29275OooOoOO));
                                return animatorSet;
                            }
                        });
                        if (this.f75418oo000o == null) {
                            Ooooooo();
                        }
                    }
                }
                Oooo0o().OooO0oo(2);
                return;
        }
    }

    public final OooO00o Oooo0() {
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getWidth() > viewGroup.getHeight() ? OooO00o.f75421OooOo : OooO00o.f75422OooOo0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PointF Oooo000(int i, boolean z) {
        float fMax;
        Activity activityOooO00o;
        Resources resources;
        Resources resources2;
        float fOooO0o0 = o000000O.OooO0o0(16.0f);
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        ViewParent parent = view.getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float width = ((ViewGroup) parent).getWidth();
        View view2 = this.f75365Oooo00O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        ViewParent parent2 = view2.getParent();
        kotlin.jvm.internal.OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        float height = ((ViewGroup) parent2).getHeight();
        Integer num = (Integer) Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
        C32443OooOOO c32443OooOOO = (num != null && num.intValue() == 1) ? new C32443OooOOO(Integer.valueOf(f75352o00000oO), Integer.valueOf(f75353o00000oo)) : new C32443OooOOO(Integer.valueOf(Oooo00o()), Integer.valueOf(f75355o0000Ooo));
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        int iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
        Insets insets = (Insets) Oooo00O().f73365OooOo.f121747OooOo0o.getValue();
        if (z) {
            fMax = insets != null ? insets.top : 0.0f;
        } else {
            Context context = getContext();
            float dimensionPixelSize = (context == null || (resources2 = context.getResources()) == null) ? 0.0f : resources2.getDimensionPixelSize(R.dimen.immersive_toolbar_height);
            Context context2 = getContext();
            fMax = Math.max((context2 == null || (resources = context2.getResources()) == null) ? 0.0f : resources.getDimensionPixelSize(R.dimen.default_fragment_view_padding_top), insets != null ? insets.top : 0.0f) + dimensionPixelSize;
        }
        int iOooO0o = Ooooo0o() ? o000000O.OooO0o(10) : o000000O.OooO0o(0);
        switch (i) {
            case 0:
                return new PointF(0.0f, fMax);
            case 1:
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = Oooo00O();
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                boolean zOooo0oo = oooO0OOOooo00O.Oooo0oo(contextRequireContext);
                Context context3 = getContext();
                return (context3 == null || (activityOooO00o = C28036OooO0O0.OooO00o(context3)) == null || !activityOooO00o.isInMultiWindowMode() || !zOooo0oo) ? new PointF((width - iIntValue) / 2.0f, fMax) : new PointF((width - iIntValue) / 2.0f, fMax + o000000O.OooO0o(16));
            case 2:
                return new PointF(width - iIntValue, fMax);
            case 3:
                return new PointF(((width - ((iIntValue + iIntValue2) / 2.0f)) + iOooO0o) - (insets != null ? insets.right : 0), (height - iIntValue2) / 2.0f);
            case 4:
                return new PointF(width - iIntValue, ((height - iIntValue2) - fOooO0o0) - (insets != null ? insets.bottom : 0));
            case 5:
                return new PointF((width - iIntValue) / 2.0f, ((height - iIntValue2) + iOooO0o) - (insets != null ? insets.bottom : 0));
            case 6:
                return new PointF(0.0f, ((height - iIntValue2) - fOooO0o0) - (insets != null ? insets.bottom : 0));
            case 7:
                return new PointF((((-(iIntValue - iIntValue2)) / 2.0f) - iOooO0o) + (insets != null ? insets.left : 0), (height - iIntValue2) / 2.0f);
            default:
                return new PointF(fOooO0o0, (height - iIntValue2) - fOooO0o0);
        }
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO Oooo00O() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f75358OooOoo.getValue();
    }

    public final int Oooo00o() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        return Ooooo0o() ? contextRequireContext.getResources().getDimensionPixelSize(R.dimen.small_pen_box_container_width) : contextRequireContext.getResources().getDimensionPixelSize(R.dimen.normal_pen_box_container_width);
    }

    public final InterfaceC29898OooO0o Oooo0O0() {
        return (InterfaceC29898OooO0o) this.f75416o0ooOOo.getValue();
    }

    public final PenBox.OooOOO Oooo0OO() {
        return (PenBox.OooOOO) this.f75408o00oO0o.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 Oooo0o() {
        return (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0) this.f75360OooOooO.getValue();
    }

    public final C26320o0000OoO Oooo0o0() {
        return (C26320o0000OoO) this.f75359OooOoo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0oO() {
        if (this.f75365Oooo00O == null) {
            return;
        }
        if (!OooooO0()) {
            View view = this.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC23487OooO0Oo());
                return;
            } else {
                Oooo0oO();
                return;
            }
        }
        Integer num = (Integer) Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                switch (iIntValue2) {
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return;
                    default:
                        boolean z = ((Boolean) Oooo00O().f73423o00o0O.f121747OooOo0o.getValue()).booleanValue() || ((Boolean) Oooo0o().f75199o00O0O.f121747OooOo0o.getValue()).booleanValue();
                        this.f75409o00ooo.clear();
                        Animator animator = this.f75418oo000o;
                        if (animator != null) {
                            animator.cancel();
                        }
                        if (iIntValue == 1) {
                            o0OoOo0();
                        } else {
                            View view2 = this.f75366Oooo00o;
                            if (view2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
                                throw null;
                            }
                            view2.setVisibility(0);
                            View view3 = this.f75366Oooo00o;
                            if (view3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
                                throw null;
                            }
                            view3.setAlpha(1.0f);
                            View view4 = this.f75376OoooO0O;
                            if (view4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                                throw null;
                            }
                            view4.setVisibility(8);
                            View view5 = this.f75363Oooo0;
                            if (view5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                                throw null;
                            }
                            view5.setAlpha(1.0f);
                            ooOO();
                        }
                        OooooOO(iIntValue2, z);
                        return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0oo(int i, boolean z) {
        if (!OooooO0()) {
            View view = this.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC29281Oooo00O(this, i));
                return;
            } else {
                Oooo0oo(i, true);
                return;
            }
        }
        Integer num = (Integer) Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
        if (num == null || i != num.intValue()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBoxChildFragment");
            c20358OooO00o.OooO0OO("handleUiModeChanged: newMode is not equal to viewModel.uiMode.value", new Object[0]);
            return;
        }
        LinkedList linkedList = this.f75409o00ooo;
        if (i != 0) {
            if (i == 1) {
                View view2 = this.f75376OoooO0O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                    throw null;
                }
                view2.setRotation(0.0f);
                if (z) {
                    o0OoOo0();
                } else {
                    View view3 = this.f75365Oooo00O;
                    if (view3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                        throw null;
                    }
                    if (view3.getVisibility() == 0) {
                        C34406OooO00o.f123390OooO00o.OooO00o("smoothSwitchToIconMode", new Object[0]);
                        linkedList.add(new o0O0ooo0.OooOOO0(this, 1));
                        if (this.f75418oo000o == null) {
                            Ooooooo();
                        }
                    }
                }
            }
        } else if (z) {
            ooOO();
        } else {
            View view4 = this.f75365Oooo00O;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (view4.getVisibility() == 0) {
                C34406OooO00o.f123390OooO00o.OooO00o("smoothSwitchToNormalMode", new Object[0]);
                linkedList.add(new C29267OooOOo(this, 0));
                if (this.f75418oo000o == null) {
                    Ooooooo();
                }
            }
        }
        Oooo0o().OooO0oo(1);
        OooOooo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooO() {
        if (this.f75394o000000O == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29948OooO0Oo c29948OooO0Oo = new C29948OooO0Oo(contextRequireContext);
            c29948OooO0Oo.f106345OooO0o0 = Oooo0OO();
            c29948OooO0Oo.f106341OooO0O0 = Oooo0O0();
            c29948OooO0Oo.f106343OooO0Oo = (PenBox.OooOOO0) this.f75407o00oO0O.getValue();
            c29948OooO0Oo.OooO0o0(((Boolean) Oooo0o().f75191OooooO0.f121747OooOo0o.getValue()).booleanValue());
            c29948OooO0Oo.f106344OooO0o = (PenBox.OooOOOO) this.f75415o0ooOO0.getValue();
            c29948OooO0Oo.OooO0o((int) (((Number) Oooo0o().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100), ((Boolean) Oooo0o().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue());
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = Oooo0o();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75364Oooo000;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29948OooO0Oo.f106342OooO0OO = new C29922OooO0O0(oooO0O0Oooo0o, interfaceC21987OooOoo);
            this.f75394o000000O = c29948OooO0Oo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OoooO00(boolean z, boolean z2) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PenBoxChildFragment");
        c20358OooO00o.OooO00o("handleUiVisibilityChanged: " + z, new Object[0]);
        if (z2) {
            View view = this.f75365Oooo00O;
            if (view == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view.setAlpha(z ? 1.0f : 0.0f);
            View view2 = this.f75365Oooo00O;
            if (view2 != null) {
                view2.setVisibility(z ? 0 : 8);
                return;
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
        }
        View view3 = this.f75365Oooo00O;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        float alpha = view3.getAlpha();
        float f = z ? 1.0f : 0.0f;
        View view4 = this.f75365Oooo00O;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        if ((view4.getVisibility() == 0) == z) {
            View view5 = this.f75365Oooo00O;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view5.setAlpha(f);
            View view6 = this.f75365Oooo00O;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            view6.setVisibility(z ? 0 : 8);
        } else {
            View view7 = this.f75365Oooo00O;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                throw null;
            }
            if (view7.getVisibility() != 4) {
                View view8 = this.f75365Oooo00O;
                if (view8 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                    throw null;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view8, "alpha", alpha, f);
                objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                objectAnimatorOfFloat.addListener(new C29314OoooOoo(this));
                objectAnimatorOfFloat.addListener(new C29313OoooOoO(this, z));
                objectAnimatorOfFloat.addListener(new C29312OoooOo0(this, z));
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.start();
            }
        }
        OooOooo();
    }

    public final void OoooO0O() {
        if (this.f75392o00000 == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            final C29947OooO0OO c29947OooO0OO = new C29947OooO0OO(contextRequireContext);
            c29947OooO0OO.f106337OooO0o = Oooo0OO();
            c29947OooO0OO.f106339OooO0oO = new View.OnClickListener() { // from class: o0Ooo.OooOo0o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = PenBoxChildFragment.f75355o0000Ooo;
                    C29947OooO0OO c29947OooO0OO2 = c29947OooO0OO;
                    if (c29947OooO0OO2.OooO00o()) {
                        c29947OooO0OO2.dismiss();
                    }
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C28767o0000Oo0());
                }
            };
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = Oooo0o();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75364Oooo000;
            Object obj = null;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29947OooO0OO.f106338OooO0o0 = new C29921OooO00o(oooO0O0Oooo0o, interfaceC21987OooOoo);
            Iterator it = ((Iterable) Oooo0o().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
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
            this.f75392o00000 = c29947OooO0OO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOO0() {
        if (this.f75411o0OO00O == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29950OooO0o0 c29950OooO0o0 = new C29950OooO0o0(contextRequireContext);
            c29950OooO0o0.f106363OooO0oo = Oooo0OO();
            c29950OooO0o0.f106356OooO = (PenBox.OooOOO0) this.f75407o00oO0O.getValue();
            c29950OooO0o0.f106365OooOO0O = Oooo0O0();
            c29950OooO0o0.f106362OooO0oO = (PenBox.OooO0OO) this.f75417o0ooOoO.getValue();
            c29950OooO0o0.OooO0o0(((Boolean) Oooo0o().f75191OooooO0.f121747OooOo0o.getValue()).booleanValue());
            c29950OooO0o0.f106364OooOO0 = (PenBox.OooOOOO) this.f75415o0ooOO0.getValue();
            c29950OooO0o0.OooO0o((int) (((Number) Oooo0o().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100), ((Boolean) Oooo0o().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue());
            this.f75411o0OO00O = c29950OooO0o0;
        }
    }

    public final void OoooOOO() {
        if (this.f75397o00000O0 == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29951OooO0oO c29951OooO0oO = new C29951OooO0oO(contextRequireContext);
            c29951OooO0oO.f106370OooO0o0 = Oooo0OO();
            c29951OooO0oO.f106369OooO0o = Oooo0O0();
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = Oooo0o();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75364Oooo000;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29951OooO0oO.f106368OooO0Oo = new C29926OooO0oO(oooO0O0Oooo0o, interfaceC21987OooOoo, new C29282Oooo00o(2, this, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), getActivity());
            this.f75397o00000O0 = c29951OooO0oO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOOo() {
        if (this.f75395o000000o == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0o00Ooo.OooOO0 oooOO02 = new o0o00Ooo.OooOO0(true, true, contextRequireContext);
            oooOO02.OooO0o0(((Boolean) Oooo0o0().f90249OoooOOo.f121747OooOo0o.getValue()).booleanValue());
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = Oooo0o();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75364Oooo000;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            oooOO02.f106174OooO0oo = new C29927OooO0oo(oooO0O0Oooo0o, interfaceC21987OooOoo, new C21968OooO0o0(1, this, PenBoxChildFragment.class, "onLassoColorChanged", "onLassoColorChanged(I)V", 0, 1));
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o2 = Oooo0o();
            C29268OooOOo0 c29268OooOOo0 = new C29268OooOOo0(this, 0);
            InterfaceC21987OooOoo interfaceC21987OooOoo2 = this.f75364Oooo000;
            if (interfaceC21987OooOoo2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            oooOO02.f106173OooO0oO = new o0o00o.OooO(oooO0O0Oooo0o2, oooOO02, c29268OooOOo0, interfaceC21987OooOoo2, new o0Ooo.Oooo0(2, this, PenBoxChildFragment.class, "showNonVipFeatureLimitedDialog", "showNonVipFeatureLimitedDialog(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            oooOO02.f106167OooO = new C29283Oooo0O0(this);
            oooOO02.OooOO0((List) Oooo0o().f75190Ooooo0o.f121747OooOo0o.getValue());
            this.f75395o000000o = oooOO02;
        }
    }

    public final void OoooOo0() {
        if (this.f75393o000000 == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0o00o0O.OooO oooO = new o0o00o0O.OooO(contextRequireContext);
            oooO.f106323OooO0O0 = Oooo0O0();
            oooO.f106325OooO0Oo = Oooo0OO();
            oooO.f106324OooO0OO = (PenBox.InterfaceC23608OooO0oo) this.f75401o000OOo.getValue();
            this.f75393o000000 = oooO;
        }
    }

    public final void OoooOoO() {
        if (this.f75410o0O0O00 == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0o00o0O.OooOO0O oooOO0O = new o0o00o0O.OooOO0O(contextRequireContext);
            oooOO0O.f106390OooO0o0 = Oooo0O0();
            oooOO0O.f106389OooO0o = Oooo0OO();
            oooOO0O.f106388OooO0Oo = (PenBox.OooO) this.f75419oo0o0Oo.getValue();
            this.f75410o0O0O00 = oooOO0O;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOoo() {
        if (this.f75396o00000O == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29953OooOO0o c29953OooOO0o = new C29953OooOO0o(contextRequireContext);
            c29953OooOO0o.OooO0o0((int) (((Number) Oooo0o().f75182OoooO0O.f121747OooOo0o.getValue()).floatValue() * 100), ((Boolean) Oooo0o().f75180OoooO0.f121747OooOo0o.getValue()).booleanValue());
            c29953OooOO0o.f106396OooO0o = (PenBox.InterfaceC23609OooOO0o) this.f75412o0OOO0o.getValue();
            c29953OooOO0o.f106398OooO0oO = Oooo0OO();
            c29953OooOO0o.f106399OooO0oo = (PenBox.OooOOOO) this.f75415o0ooOO0.getValue();
            c29953OooOO0o.f106392OooO = Oooo0O0();
            this.f75396o00000O = c29953OooOO0o;
        }
    }

    public final boolean Ooooo00() {
        List<InterfaceC29896OooO0OO> listOooOO0o = C34429OooOOo0.OooOO0o(this.f75411o0OO00O, this.f75394o000000O, this.f75410o0O0O00, this.f75395o000000o, this.f75392o00000, this.f75400o00000o0, this.f75397o00000O0, this.f75396o00000O, this.f75398o00000OO, this.f75399o00000Oo, this.f75393o000000);
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

    public final boolean Ooooo0o() {
        if (!OooooO0()) {
            return false;
        }
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return viewGroup != null && Math.min(viewGroup.getWidth(), viewGroup.getHeight()) < o0000O0;
    }

    public final boolean OooooO0() {
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int width = view2 != null ? view2.getWidth() : 0;
        View view3 = this.f75365Oooo00O;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        Object parent2 = view3.getParent();
        View view4 = parent2 instanceof View ? (View) parent2 : null;
        return width > 0 && (view4 != null ? view4.getHeight() : 0) > 0;
    }

    public final void OooooOO(int i, boolean z) {
        PointF pointFOooo000 = Oooo000(i, z);
        C34406OooO00o.f123390OooO00o.OooO00o("moveToPosition: " + i + ", anchorPoint: " + pointFOooo000, new Object[0]);
        View view = this.f75365Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view.setX(pointFOooo000.x);
        View view2 = this.f75365Oooo00O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view2.setY(pointFOooo000.y);
        OooooOo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooooOo() {
        Integer num = (Integer) Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
        if (num == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PenBoxChildFragment");
            c20358OooO00o.OooOO0O("reConstraintLayout: uiPosition is null", new Object[0]);
            return;
        }
        int iIntValue = num.intValue();
        View view = this.f75363Oooo0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) layoutParams;
        View view2 = this.f75367Oooo0O0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) layoutParams2;
        if (iIntValue == 1) {
            oooO00o2.f63876OooO = 0;
            ((ViewGroup.MarginLayoutParams) oooO00o2).topMargin = o000000O.OooO0o(10);
            View view3 = this.f75367Oooo0O0;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
                throw null;
            }
            oooO00o.f63885OooOO0 = view3.getId();
            oooO00o.f63876OooO = -1;
            ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = o000000O.OooO0o(-1);
        } else {
            oooO00o.f63876OooO = 0;
            ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = 0;
            View view4 = this.f75363Oooo0;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                throw null;
            }
            oooO00o2.f63885OooOO0 = view4.getId();
            oooO00o2.f63876OooO = -1;
            ((ViewGroup.MarginLayoutParams) oooO00o2).topMargin = o000000O.OooO0o(0);
        }
        View view5 = this.f75363Oooo0;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        view5.setLayoutParams(oooO00o);
        View view6 = this.f75367Oooo0O0;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanelWrapper");
            throw null;
        }
        view6.setLayoutParams(oooO00o2);
        View view7 = this.f75363Oooo0;
        if (view7 != null) {
            view7.setRotation(iIntValue == 1 ? 180.0f : 0.0f);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
    }

    public final void Oooooo(int i, Object obj) {
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            noteEditorContainerFragment.Oooo0OO(i, obj);
        }
    }

    public final void Oooooo0() {
        View view;
        ViewOnLayoutChangeListenerC29265OooOOO0 viewOnLayoutChangeListenerC29265OooOOO0 = this.f75369Oooo0o;
        if (viewOnLayoutChangeListenerC29265OooOOO0 != null && (view = this.f75370Oooo0o0) != null) {
            view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC29265OooOOO0);
        }
        this.f75369Oooo0o = null;
        this.f75370Oooo0o0 = null;
        View view2 = this.f75365Oooo00O;
        if (view2 != null) {
            view2.removeCallbacks(this.f75405o00Ooo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooooO(View view) {
        Object tag = view.getTag();
        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
        PenVO penVO = (PenVO) tag;
        Integer num = (Integer) Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            String string = penVO.getExtra().getString(C18437z2.f56754h);
            if (string == null) {
                string = DrawToolFactory.LASSO_TYPE_FREE;
            }
            String str = string;
            String string2 = penVO.getExtra().getString("filter");
            List listOoooOO0 = string2 != null ? C33599OooOo0O.OoooOO0(string2, new String[]{","}) : C34434OooOoO.f123453OooOo0o;
            String string3 = penVO.getExtra().getString("showDualLinkIcon");
            if (string3 == null) {
                string3 = TelemetryEventStrings.Value.TRUE;
            }
            List list = (List) Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
            OoooOOO();
            C29951OooO0oO c29951OooO0oO = this.f75397o00000O0;
            if (c29951OooO0oO != null) {
                string3.equals(TelemetryEventStrings.Value.TRUE);
                c29951OooO0oO.OooO0Oo(view, iIntValue, str, list, listOoooOO0, this.f75361OooOooo);
            }
        }
    }

    public final void Ooooooo() {
        oO0O000o.OooO00o oooO00o = (oO0O000o.OooO00o) this.f75409o00ooo.poll();
        if (oooO00o == null) {
            return;
        }
        Animator animator = (Animator) oooO00o.invoke();
        this.f75418oo000o = animator;
        animator.addListener(new OooOo());
        animator.start();
    }

    public final void o000oOoO() {
        if (this.f75398o00000OO == null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C29949OooO0o c29949OooO0o = new C29949OooO0o(contextRequireContext);
            c29949OooO0o.f106353OooO0o = Oooo0OO();
            c29949OooO0o.f106355OooO0oO = Oooo0O0();
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0o = Oooo0o();
            InterfaceC21987OooOoo interfaceC21987OooOoo = this.f75364Oooo000;
            Object obj = null;
            if (interfaceC21987OooOoo == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                throw null;
            }
            c29949OooO0o.f106354OooO0o0 = new C29925OooO0o0(oooO0O0Oooo0o, interfaceC21987OooOoo);
            Iterator it = ((Iterable) Oooo0o().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
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
            c29949OooO0o.OooO0o((List) Oooo0o().f75196OoooooO.f121747OooOo0o.getValue());
            this.f75398o00000OO = c29949OooO0o;
        }
    }

    public final void o0OoOo0() {
        C34406OooO00o.f123390OooO00o.OooO00o("switchToIconMode", new Object[0]);
        View view = this.f75376OoooO0O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        view.setVisibility(0);
        View view2 = this.f75376OoooO0O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -2;
        marginLayoutParams.setMargins(f75351o0000, f75357o0000oo, f75354o0000O00, f75356o0000oO);
        view.setLayoutParams(marginLayoutParams);
        View view3 = this.f75366Oooo00o;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
            throw null;
        }
        view3.setAlpha(0.0f);
        view3.setVisibility(8);
        View view4 = this.f75363Oooo0;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
        view4.setAlpha(0.0f);
        View view5 = this.f75365Oooo00O;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view5.getLayoutParams().width = f75352o00000oO;
        View view6 = this.f75365Oooo00O;
        if (view6 != null) {
            view6.requestLayout();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OoooO0(this);
        this.f75371Oooo0oO.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Oooooo0();
        OoooO0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ooOO() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o("switchToNormalMode", new Object[0]);
        if (OooooO0()) {
            Integer num = (Integer) Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
            if (num == null) {
                c20358OooO00o.OooO00o("switchToNormalMode: uiPosition is null", new Object[0]);
                return;
            }
            int iIntValue = num.intValue();
            OooOoo(true);
            OooOooO(iIntValue);
        }
    }
}
