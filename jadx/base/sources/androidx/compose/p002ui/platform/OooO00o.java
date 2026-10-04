package androidx.compose.p002ui.platform;

import OooOo.C20494Oooo0O0;
import OooOo.OooO0O0;
import OooOo.Oooo0;
import OooOoO0.C20511OooO00o;
import OooOoo0.o0000OO;
import OoooOoO.C21236OooO0oo;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.platform.OooO00o;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.AbstractC21979OooOOo0;
import com.aspose.slides.C22207OooOOoo;
import com.aspose.words.ControlChar;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000000o.AbstractC24088OooO0oO;
import o000OoO.C24536OooO0Oo;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.C25503OooOoOO;
import o00oO0O.o0OO00O;
import o00oO0O.o0Oo0oo;
import o0Oo0oo.C28378OooO;
import o0Oo0oo.C28379OooO00o;
import o0Oo0oo.C28380OooO0O0;
import o0Oo0oo.C28381OooO0OO;
import o0Oo0oo.C28382OooO0Oo;
import o0Oo0oo.C28383OooO0o;
import o0Oo0oo.C28384OooO0o0;
import o0Oo0oo.C28385OooO0oO;
import o0Oo0oo.C28386OooO0oo;
import o0Oo0oo.C28387OooOO0;
import o0Oo0oo.C28388OooOO0O;
import o0Oo0oo.C28393OooOOOo;
import o0Oo0oo.C28394OooOOo;
import o0Oo0oo.C28395OooOOo0;
import o0Oo0oo.C28396OooOOoo;
import o0Oo0oo.OooOo;
import o0Oo0oo.OooOo00;
import o0ooOO0.AccessibilityManagerAccessibilityStateChangeListenerC31516OooOOo0;
import o0ooOO0.AccessibilityManagerTouchExplorationStateChangeListenerC31515OooOOo;
import o0ooOO0.C31507OooO0oo;
import o0ooOO0.C31518OooOo0;
import o0ooOO0.C31519OooOo0O;
import o0ooOO0.C31520OooOo0o;
import o0ooOO0.C31521OooOoO;
import o0ooOO0.C31522OooOoO0;
import o0ooOO0.C31523OooOoOO;
import o0ooOO0.C31524OooOoo;
import o0ooOO0.C31525OooOoo0;
import o0ooOO0.C31526OooOooO;
import o0ooOO0.C31527OooOooo;
import o0ooOO0.C31529Oooo00O;
import o0ooOO0.C31530Oooo00o;
import o0ooOO0.C31575o0000o0;
import o0ooOO0.C31576o0000o0O;
import o0ooOO0.Oooo000;
import o0ooOO0.RunnableC31517OooOOoo;
import o0ooOOo.C31652OooO00o;
import o0ooOOo.C31653OooO0O0;
import o0ooOOo.C31654OooO0OO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOo.C32473OooO00o;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O00oo.C32517OooO0Oo;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.OooOOO;
import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34695OooOOo0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f63449OooOooO = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f63450OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AndroidComposeView f63451OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f63452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AccessibilityManager f63453OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AccessibilityManagerAccessibilityStateChangeListenerC31516OooOOo0 f63454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<AccessibilityServiceInfo> f63455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC31515OooOOo f63456OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Handler f63457OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AccessibilityNodeProviderCompat f63458OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Oooo0<Oooo0<CharSequence>> f63459OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Oooo0<Map<CharSequence, Integer>> f63460OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f63461OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOo.OooO0O0<C25503OooOoOO> f63462OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Integer f63463OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33695OooO0o0 f63464OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f63465OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Object f63466OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO0o f63467OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooOo.OooO0O0<Integer> f63468OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final LinkedHashMap f63469OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final HashMap<Integer, Integer> f63470OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final HashMap<Integer, Integer> f63471OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final String f63472OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f63473OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f63474OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C21606OooO0oO f63475OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final RunnableC31517OooOOoo f63476OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C21607OooO0oo f63477OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ArrayList f63478OooOoo0;

    public static final class OooO extends OooOOOO implements InterfaceC32507OooOO0o<C25503OooOoOO, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO f63479OooOo0o = new OooO(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C25503OooOoOO c25503OooOoOO) {
            C28387OooOO0 c28387OooOO0OooO00o;
            C25503OooOoOO it = c25503OooOoOO;
            OooOOO0.OooO0oO(it, "it");
            o0Oo0oo o0oo0ooOooO0o = C28395OooOOo0.OooO0o(it);
            boolean z = false;
            if (o0oo0ooOooO0o != null && (c28387OooOO0OooO00o = o0OO00O.OooO00o(o0oo0ooOooO0o)) != null && c28387OooOO0OooO00o.f100642OooOo) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC18998OooO00o implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC18998OooO00o() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            OooOOO0.OooO0oO(view, "view");
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f63453OooO0OO.addAccessibilityStateChangeListener(oooO00o.f63454OooO0Oo);
            oooO00o.f63453OooO0OO.addTouchExplorationStateChangeListener(oooO00o.f63456OooO0o0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            OooOOO0.OooO0oO(view, "view");
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f63457OooO0oO.removeCallbacks(oooO00o.f63476OooOoOO);
            AccessibilityManager accessibilityManager = oooO00o.f63453OooO0OO;
            accessibilityManager.removeAccessibilityStateChangeListener(oooO00o.f63454OooO0Oo);
            accessibilityManager.removeTouchExplorationStateChangeListener(oooO00o.f63456OooO0o0);
        }
    }

    public static final class OooO0O0 {
        public static final void OooO00o(AccessibilityNodeInfoCompat info, C28393OooOOOo semanticsNode) {
            OooOOO0.OooO0oO(info, "info");
            OooOOO0.OooO0oO(semanticsNode, "semanticsNode");
            if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                OooOo<C28379OooO00o<InterfaceC32507OooOO0o<List<C34695OooOOo0>, Boolean>>> oooOo = C28378OooO.f100617OooO00o;
                C28379OooO00o c28379OooO00o = (C28379OooO00o) C28388OooOO0O.OooO00o(semanticsNode.f100654OooO0o, C28378OooO.f100622OooO0o0);
                if (c28379OooO00o != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, c28379OooO00o.f100635OooO00o));
                }
            }
        }
    }

    public static final class OooO0OO {
        public static final void OooO00o(AccessibilityEvent event, int i, int i2) {
            OooOOO0.OooO0oO(event, "event");
            event.setScrollDeltaX(i);
            event.setScrollDeltaY(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21604OooO0Oo {
        public static final void OooO00o(AccessibilityNodeInfoCompat info, C28393OooOOOo semanticsNode) {
            OooOOO0.OooO0oO(info, "info");
            OooOOO0.OooO0oO(semanticsNode, "semanticsNode");
            if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                OooOo<C28379OooO00o<InterfaceC32507OooOO0o<List<C34695OooOOo0>, Boolean>>> oooOo = C28378OooO.f100617OooO00o;
                OooOo<C28379OooO00o<oO0O000o.OooO00o<Boolean>>> oooOo2 = C28378OooO.f100631OooOOOo;
                C28387OooOO0 c28387OooOO0 = semanticsNode.f100654OooO0o;
                C28379OooO00o c28379OooO00o = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, oooOo2);
                if (c28379OooO00o != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, c28379OooO00o.f100635OooO00o));
                }
                C28379OooO00o c28379OooO00o2 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100632OooOOo);
                if (c28379OooO00o2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, c28379OooO00o2.f100635OooO00o));
                }
                C28379OooO00o c28379OooO00o3 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100633OooOOo0);
                if (c28379OooO00o3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, c28379OooO00o3.f100635OooO00o));
                }
                C28379OooO00o c28379OooO00o4 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100634OooOOoo);
                if (c28379OooO00o4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, c28379OooO00o4.f100635OooO00o));
                }
            }
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C28393OooOOOo f63481OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f63482OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f63483OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f63484OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f63485OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f63486OooO0o0;

        public OooO0o(C28393OooOOOo node, int i, int i2, int i3, int i4, long j) {
            OooOOO0.OooO0oO(node, "node");
            this.f63481OooO00o = node;
            this.f63482OooO0O0 = i;
            this.f63483OooO0OO = i2;
            this.f63484OooO0Oo = i3;
            this.f63486OooO0o0 = i4;
            this.f63485OooO0o = j;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public final class C21605OooO0o0 extends AccessibilityNodeProvider {
        public C21605OooO0o0() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
            OooOOO0.OooO0oO(info, "info");
            OooOOO0.OooO0oO(extraDataKey, "extraDataKey");
            OooO00o.this.OooO00o(i, info, extraDataKey, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:256:0x0560  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x0565  */
        /* JADX WARN: Removed duplicated region for block: B:358:0x07a6  */
        /* JADX WARN: Removed duplicated region for block: B:371:0x080c  */
        /* JADX WARN: Removed duplicated region for block: B:475:0x0a84  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            float f;
            boolean z;
            boolean z2;
            Map<CharSequence, Integer> map;
            int iOooO0o;
            C28387OooOO0 c28387OooOO0OooO00o;
            boolean z3;
            boolean zBooleanValue;
            C34680OooO0O0 c34680OooO0O0;
            String str;
            String str2;
            AbstractC21979OooOOo0 lifecycle;
            boolean z4 = true;
            OooO00o oooO00o = OooO00o.this;
            AndroidComposeView androidComposeView = oooO00o.f63451OooO00o;
            AndroidComposeView.OooO0O0 viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f63432OooO00o.getLifecycle()) == null) ? null : lifecycle.OooO0O0()) != AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
                OooOOO0.OooO0o(accessibilityNodeInfoCompatObtain, "obtain()");
                C31576o0000o0O c31576o0000o0O = oooO00o.OooO0oo().get(Integer.valueOf(i));
                if (c31576o0000o0O != null) {
                    C28393OooOOOo semanticsNode = c31576o0000o0O.f112834OooO00o;
                    if (i == -1) {
                        Object parentForAccessibility = ViewCompat.getParentForAccessibility(androidComposeView);
                        accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
                    } else {
                        if (semanticsNode.OooO0oo() == null) {
                            throw new IllegalStateException(Oooo0oO.o0Oo0oo.OooO0O0(i, "semanticsNode ", " has null parent"));
                        }
                        C28393OooOOOo c28393OooOOOoOooO0oo = semanticsNode.OooO0oo();
                        OooOOO0.OooO0Oo(c28393OooOOOoOooO0oo);
                        int i2 = androidComposeView.getSemanticsOwner().OooO00o().f100656OooO0oO;
                        int i3 = c28393OooOOOoOooO0oo.f100656OooO0oO;
                        accessibilityNodeInfoCompatObtain.setParent(androidComposeView, i3 != i2 ? i3 : -1);
                    }
                    accessibilityNodeInfoCompatObtain.setSource(androidComposeView, i);
                    Rect rect = c31576o0000o0O.f112835OooO0O0;
                    long jOooOO0 = androidComposeView.OooOO0(C21289OooO0o.OooO00o(rect.left, rect.top));
                    long jOooOO02 = androidComposeView.OooOO0(C21289OooO0o.OooO00o(rect.right, rect.bottom));
                    accessibilityNodeInfoCompatObtain.setBoundsInScreen(new Rect((int) Math.floor(C21290OooO0o0.OooO0OO(jOooOO0)), (int) Math.floor(C21290OooO0o0.OooO0Oo(jOooOO0)), (int) Math.ceil(C21290OooO0o0.OooO0OO(jOooOO02)), (int) Math.ceil(C21290OooO0o0.OooO0Oo(jOooOO02))));
                    OooOOO0.OooO0oO(semanticsNode, "semanticsNode");
                    boolean z5 = semanticsNode.f100653OooO0Oo;
                    C25503OooOoOO c25503OooOoOO = semanticsNode.f100652OooO0OO;
                    boolean z6 = !z5 && semanticsNode.OooO0o(false, true).isEmpty() && androidx.compose.p002ui.platform.OooO0OO.OooO0Oo(c25503OooOoOO, C31518OooOo0.f112702OooOo0o) == null;
                    accessibilityNodeInfoCompatObtain.setClassName("android.view.View");
                    OooOo<C28385OooO0oO> oooOo = C28396OooOOoo.f100678OooOOo0;
                    C28387OooOO0 c28387OooOO0 = semanticsNode.f100654OooO0o;
                    C28385OooO0oO c28385OooO0oO = (C28385OooO0oO) C28388OooOO0O.OooO00o(c28387OooOO0, oooOo);
                    if (c28385OooO0oO != null) {
                        if (semanticsNode.f100653OooO0Oo || semanticsNode.OooO0o(false, true).isEmpty()) {
                            int i4 = c28385OooO0oO.f100639OooO00o;
                            if (i4 == 4) {
                                accessibilityNodeInfoCompatObtain.setRoleDescription(androidComposeView.getContext().getResources().getString(R.string.tab));
                            } else if (i4 == 2) {
                                accessibilityNodeInfoCompatObtain.setRoleDescription(androidComposeView.getContext().getResources().getString(R.string.switch_role));
                            } else {
                                if (i4 == 0) {
                                    str2 = "android.widget.Button";
                                } else if (i4 == 1) {
                                    str2 = "android.widget.CheckBox";
                                } else {
                                    str = i4 == 3 ? "android.widget.RadioButton" : i4 == 5 ? "android.widget.ImageView" : i4 == 6 ? "android.widget.Spinner" : null;
                                    if (i4 == 5 || z6 || c28387OooOO0.f100642OooOo) {
                                        accessibilityNodeInfoCompatObtain.setClassName(str);
                                    }
                                }
                                str = str2;
                                if (i4 == 5) {
                                    accessibilityNodeInfoCompatObtain.setClassName(str);
                                }
                            }
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    if (c28387OooOO0.OooO0Oo(C28378OooO.f100623OooO0oO)) {
                        accessibilityNodeInfoCompatObtain.setClassName("android.widget.EditText");
                    }
                    if (semanticsNode.OooO0oO().OooO0Oo(C28396OooOOoo.f100679OooOOoo)) {
                        accessibilityNodeInfoCompatObtain.setClassName("android.widget.TextView");
                    }
                    accessibilityNodeInfoCompatObtain.setPackageName(androidComposeView.getContext().getPackageName());
                    accessibilityNodeInfoCompatObtain.setImportantForAccessibility(true);
                    List<C28393OooOOOo> listOooO0o = semanticsNode.OooO0o(false, true);
                    int size = listOooO0o.size();
                    int i5 = 0;
                    while (i5 < size) {
                        C28393OooOOOo c28393OooOOOo = listOooO0o.get(i5);
                        boolean z7 = z4;
                        if (oooO00o.OooO0oo().containsKey(Integer.valueOf(c28393OooOOOo.f100656OooO0oO))) {
                            AndroidViewHolder androidViewHolder = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c28393OooOOOo.f100652OooO0OO);
                            if (androidViewHolder != null) {
                                accessibilityNodeInfoCompatObtain.addChild(androidViewHolder);
                            } else {
                                accessibilityNodeInfoCompatObtain.addChild(androidComposeView, c28393OooOOOo.f100656OooO0oO);
                            }
                        }
                        i5++;
                        z4 = z7;
                    }
                    boolean z8 = z4;
                    if (oooO00o.f63450OooO == i) {
                        accessibilityNodeInfoCompatObtain.setAccessibilityFocused(z8);
                        accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
                    } else {
                        accessibilityNodeInfoCompatObtain.setAccessibilityFocused(false);
                        accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
                    }
                    AbstractC24088OooO0oO.OooO00o fontFamilyResolver = androidComposeView.getFontFamilyResolver();
                    C34680OooO0O0 c34680OooO0O02 = (C34680OooO0O0) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100682OooOo00);
                    SpannableString spannableString = (SpannableString) OooO00o.OooOoO(c34680OooO0O02 != null ? o00000O.OooO00o.OooO00o(c34680OooO0O02, androidComposeView.getDensity(), fontFamilyResolver) : null);
                    List list = (List) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100679OooOOoo);
                    SpannableString spannableString2 = (SpannableString) OooO00o.OooOoO((list == null || (c34680OooO0O0 = (C34680OooO0O0) oOo000Oo.OooOo.Oooo(list)) == null) ? null : o00000O.OooO00o.OooO00o(c34680OooO0O0, androidComposeView.getDensity(), fontFamilyResolver));
                    if (spannableString == null) {
                        spannableString = spannableString2;
                    }
                    accessibilityNodeInfoCompatObtain.setText(spannableString);
                    OooOo<String> oooOo2 = C28396OooOOoo.f100685OooOoO;
                    if (c28387OooOO0.OooO0Oo(oooOo2)) {
                        accessibilityNodeInfoCompatObtain.setContentInvalid(true);
                        accessibilityNodeInfoCompatObtain.setError((CharSequence) C28388OooOO0O.OooO00o(c28387OooOO0, oooOo2));
                    }
                    accessibilityNodeInfoCompatObtain.setStateDescription((CharSequence) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100663OooO0O0));
                    o0OO00O.OooO00o oooO00o2 = (o0OO00O.OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100680OooOo);
                    if (oooO00o2 != null) {
                        accessibilityNodeInfoCompatObtain.setCheckable(true);
                        int iOrdinal = oooO00o2.ordinal();
                        if (iOrdinal == 0) {
                            accessibilityNodeInfoCompatObtain.setChecked(true);
                            if (c28385OooO0oO != null && c28385OooO0oO.f100639OooO00o == 2 && accessibilityNodeInfoCompatObtain.getStateDescription() == null) {
                                accessibilityNodeInfoCompatObtain.setStateDescription(androidComposeView.getContext().getResources().getString(R.string.f57991on));
                            }
                        } else if (iOrdinal == 1) {
                            accessibilityNodeInfoCompatObtain.setChecked(false);
                            if (c28385OooO0oO != null && c28385OooO0oO.f100639OooO00o == 2 && accessibilityNodeInfoCompatObtain.getStateDescription() == null) {
                                accessibilityNodeInfoCompatObtain.setStateDescription(androidComposeView.getContext().getResources().getString(R.string.off));
                            }
                        } else if (iOrdinal == 2 && accessibilityNodeInfoCompatObtain.getStateDescription() == null) {
                            accessibilityNodeInfoCompatObtain.setStateDescription(androidComposeView.getContext().getResources().getString(R.string.indeterminate));
                        }
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    }
                    Boolean bool = (Boolean) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100684OooOo0o);
                    if (bool != null) {
                        boolean zBooleanValue2 = bool.booleanValue();
                        if (c28385OooO0oO != null && c28385OooO0oO.f100639OooO00o == 4) {
                            accessibilityNodeInfoCompatObtain.setSelected(zBooleanValue2);
                        } else {
                            accessibilityNodeInfoCompatObtain.setCheckable(true);
                            accessibilityNodeInfoCompatObtain.setChecked(zBooleanValue2);
                            if (accessibilityNodeInfoCompatObtain.getStateDescription() == null) {
                                accessibilityNodeInfoCompatObtain.setStateDescription(zBooleanValue2 ? androidComposeView.getContext().getResources().getString(R.string.selected) : androidComposeView.getContext().getResources().getString(R.string.not_selected));
                            }
                        }
                        C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    }
                    if (!c28387OooOO0.f100642OooOo || semanticsNode.OooO0o(false, true).isEmpty()) {
                        List list2 = (List) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100662OooO00o);
                        accessibilityNodeInfoCompatObtain.setContentDescription(list2 != null ? (String) oOo000Oo.OooOo.Oooo(list2) : null);
                    }
                    String str3 = (String) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100677OooOOo);
                    if (str3 != null) {
                        C28393OooOOOo c28393OooOOOoOooO0oo2 = semanticsNode;
                        while (true) {
                            if (c28393OooOOOoOooO0oo2 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            OooOo<Boolean> oooOo3 = OooOo00.f100698OooO00o;
                            C28387OooOO0 c28387OooOO02 = c28393OooOOOoOooO0oo2.f100654OooO0o;
                            if (c28387OooOO02.OooO0Oo(oooOo3)) {
                                zBooleanValue = ((Boolean) c28387OooOO02.OooO0o0(oooOo3)).booleanValue();
                                break;
                            }
                            c28393OooOOOoOooO0oo2 = c28393OooOOOoOooO0oo2.OooO0oo();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfoCompatObtain.setViewIdResourceName(str3);
                        }
                    }
                    if (((C32460OooOooO) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100669OooO0oo)) != null) {
                        accessibilityNodeInfoCompatObtain.setHeading(true);
                        C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                    }
                    accessibilityNodeInfoCompatObtain.setPassword(semanticsNode.OooO0oO().OooO0Oo(C28396OooOOoo.f100686OooOoO0));
                    OooOo<C28379OooO00o<InterfaceC32507OooOO0o<C34680OooO0O0, Boolean>>> oooOo4 = C28378OooO.f100623OooO0oO;
                    accessibilityNodeInfoCompatObtain.setEditable(c28387OooOO0.OooO0Oo(oooOo4));
                    accessibilityNodeInfoCompatObtain.setEnabled(androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode));
                    OooOo<Boolean> oooOo5 = C28396OooOOoo.f100671OooOO0O;
                    accessibilityNodeInfoCompatObtain.setFocusable(c28387OooOO0.OooO0Oo(oooOo5));
                    if (accessibilityNodeInfoCompatObtain.isFocusable()) {
                        accessibilityNodeInfoCompatObtain.setFocused(((Boolean) c28387OooOO0.OooO0o0(oooOo5)).booleanValue());
                        if (accessibilityNodeInfoCompatObtain.isFocused()) {
                            accessibilityNodeInfoCompatObtain.addAction(2);
                        } else {
                            accessibilityNodeInfoCompatObtain.addAction(1);
                        }
                    }
                    AbstractC25521OoooO abstractC25521OoooOOooO0O0 = semanticsNode.OooO0O0();
                    accessibilityNodeInfoCompatObtain.setVisibleToUser(((abstractC25521OoooOOooO0O0 != null ? abstractC25521OoooOOooO0O0.o0000o0o() : false) || c28387OooOO0.OooO0Oo(C28396OooOOoo.f100674OooOOO0)) ? false : true);
                    if (((C28384OooO0o0) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100670OooOO0)) != null) {
                        accessibilityNodeInfoCompatObtain.setLiveRegion(1);
                        C32460OooOooO c32460OooOooO5 = C32460OooOooO.f116667OooO00o;
                    }
                    accessibilityNodeInfoCompatObtain.setClickable(false);
                    C28379OooO00o c28379OooO00o = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100618OooO0O0);
                    if (c28379OooO00o != null) {
                        boolean zOooO0O0 = OooOOO0.OooO0O0(C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100684OooOo0o), Boolean.TRUE);
                        accessibilityNodeInfoCompatObtain.setClickable(!zOooO0O0);
                        if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode) && !zOooO0O0) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, c28379OooO00o.f100635OooO00o));
                        }
                        C32460OooOooO c32460OooOooO6 = C32460OooOooO.f116667OooO00o;
                    }
                    accessibilityNodeInfoCompatObtain.setLongClickable(false);
                    C28379OooO00o c28379OooO00o2 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100619OooO0OO);
                    if (c28379OooO00o2 != null) {
                        accessibilityNodeInfoCompatObtain.setLongClickable(true);
                        if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, c28379OooO00o2.f100635OooO00o));
                        }
                        C32460OooOooO c32460OooOooO7 = C32460OooOooO.f116667OooO00o;
                    }
                    C28379OooO00o c28379OooO00o3 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100624OooO0oo);
                    if (c28379OooO00o3 != null) {
                        accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, c28379OooO00o3.f100635OooO00o));
                        C32460OooOooO c32460OooOooO8 = C32460OooOooO.f116667OooO00o;
                    }
                    if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                        C28379OooO00o c28379OooO00o4 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, oooOo4);
                        if (c28379OooO00o4 != null) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, c28379OooO00o4.f100635OooO00o));
                            C32460OooOooO c32460OooOooO9 = C32460OooOooO.f116667OooO00o;
                        }
                        C28379OooO00o c28379OooO00o5 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100616OooO);
                        if (c28379OooO00o5 != null) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, c28379OooO00o5.f100635OooO00o));
                            C32460OooOooO c32460OooOooO10 = C32460OooOooO.f116667OooO00o;
                        }
                        C28379OooO00o c28379OooO00o6 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100625OooOO0);
                        if (c28379OooO00o6 != null) {
                            if (accessibilityNodeInfoCompatObtain.isFocused() && androidComposeView.getClipboardManager().hasText()) {
                                accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, c28379OooO00o6.f100635OooO00o));
                            }
                            C32460OooOooO c32460OooOooO11 = C32460OooOooO.f116667OooO00o;
                        }
                    }
                    String strOooO = OooO00o.OooO(semanticsNode);
                    if (!(strOooO == null || strOooO.length() == 0)) {
                        accessibilityNodeInfoCompatObtain.setTextSelection(oooO00o.OooO0oO(semanticsNode), oooO00o.OooO0o(semanticsNode));
                        C28379OooO00o c28379OooO00o7 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100621OooO0o);
                        accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, c28379OooO00o7 != null ? c28379OooO00o7.f100635OooO00o : null));
                        accessibilityNodeInfoCompatObtain.addAction(256);
                        accessibilityNodeInfoCompatObtain.addAction(512);
                        accessibilityNodeInfoCompatObtain.setMovementGranularities(11);
                        List list3 = (List) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100662OooO00o);
                        if ((list3 == null || list3.isEmpty()) && c28387OooOO0.OooO0Oo(C28378OooO.f100617OooO00o)) {
                            if (!androidx.compose.p002ui.platform.OooO0OO.OooO0o(semanticsNode) || OooOOO0.OooO0O0(C28388OooOO0O.OooO00o(c28387OooOO0, oooOo5), Boolean.TRUE)) {
                                C25503OooOoOO c25503OooOoOOOooO0Oo = androidx.compose.p002ui.platform.OooO0OO.OooO0Oo(c25503OooOoOO, C31530Oooo00o.f112725OooOo0o);
                                if (c25503OooOoOOOooO0Oo != null) {
                                    o0Oo0oo o0oo0ooOooO0o = C28395OooOOo0.OooO0o(c25503OooOoOOOooO0Oo);
                                    z3 = (o0oo0ooOooO0o == null || (c28387OooOO0OooO00o = o0OO00O.OooO00o(o0oo0ooOooO0o)) == null) ? false : OooOOO0.OooO0O0(C28388OooOO0O.OooO00o(c28387OooOO0OooO00o, oooOo5), Boolean.TRUE) ? false : true;
                                    if (!z3) {
                                        accessibilityNodeInfoCompatObtain.setMovementGranularities(accessibilityNodeInfoCompatObtain.getMovementGranularities() | 20);
                                    }
                                }
                                if (!z3) {
                                }
                            }
                        }
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    ArrayList arrayList = new ArrayList();
                    CharSequence text = accessibilityNodeInfoCompatObtain.getText();
                    if (!(text == null || text.length() == 0) && c28387OooOO0.OooO0Oo(C28378OooO.f100617OooO00o)) {
                        arrayList.add(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY);
                    }
                    if (c28387OooOO0.OooO0Oo(C28396OooOOoo.f100677OooOOo)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (!arrayList.isEmpty()) {
                        C31507OooO0oo c31507OooO0oo = C31507OooO0oo.f112691OooO00o;
                        AccessibilityNodeInfo accessibilityNodeInfoUnwrap = accessibilityNodeInfoCompatObtain.unwrap();
                        OooOOO0.OooO0o(accessibilityNodeInfoUnwrap, "info.unwrap()");
                        c31507OooO0oo.OooO00o(accessibilityNodeInfoUnwrap, arrayList);
                    }
                    C28383OooO0o c28383OooO0o = (C28383OooO0o) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100664OooO0OO);
                    float f2 = 0.0f;
                    if (c28383OooO0o != null) {
                        OooOo<C28379OooO00o<InterfaceC32507OooOO0o<Float, Boolean>>> oooOo6 = C28378OooO.f100622OooO0o0;
                        if (c28387OooOO0.OooO0Oo(oooOo6)) {
                            accessibilityNodeInfoCompatObtain.setClassName("android.widget.SeekBar");
                        } else {
                            accessibilityNodeInfoCompatObtain.setClassName("android.widget.ProgressBar");
                        }
                        C28383OooO0o c28383OooO0o2 = C28383OooO0o.f100637OooO0O0;
                        C32517OooO0Oo c32517OooO0Oo = c28383OooO0o.f100638OooO00o;
                        if (c28383OooO0o != c28383OooO0o2) {
                            c32517OooO0Oo.getClass();
                            accessibilityNodeInfoCompatObtain.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, Float.valueOf(0.0f).floatValue(), Float.valueOf(0.0f).floatValue(), 0.0f));
                            if (accessibilityNodeInfoCompatObtain.getStateDescription() == null) {
                                float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(((Float.valueOf(0.0f).floatValue() - Float.valueOf(0.0f).floatValue()) > 0.0f ? 1 : ((Float.valueOf(0.0f).floatValue() - Float.valueOf(0.0f).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (0.0f - Float.valueOf(0.0f).floatValue()) / (Float.valueOf(0.0f).floatValue() - Float.valueOf(0.0f).floatValue()), 0.0f, 1.0f);
                                if (fOooO0o0 == 0.0f) {
                                    iOooO0o = 0;
                                } else {
                                    iOooO0o = 100;
                                    if (!(fOooO0o0 == 1.0f)) {
                                        iOooO0o = oO0O00oo.OooOO0.OooO0o(oO0O00O.OooO00o.OooO0O0(fOooO0o0 * 100), 1, 99);
                                    }
                                }
                                accessibilityNodeInfoCompatObtain.setStateDescription(androidComposeView.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iOooO0o)));
                            }
                        } else if (accessibilityNodeInfoCompatObtain.getStateDescription() == null) {
                            accessibilityNodeInfoCompatObtain.setStateDescription(androidComposeView.getContext().getResources().getString(R.string.in_progress));
                        }
                        if (c28387OooOO0.OooO0Oo(oooOo6) && androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                            c32517OooO0Oo.getClass();
                            float fFloatValue = Float.valueOf(0.0f).floatValue();
                            float fFloatValue2 = Float.valueOf(0.0f).floatValue();
                            if (fFloatValue < fFloatValue2) {
                                fFloatValue = fFloatValue2;
                            }
                            if (0.0f < fFloatValue) {
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                            }
                            float fFloatValue3 = Float.valueOf(0.0f).floatValue();
                            float fFloatValue4 = Float.valueOf(0.0f).floatValue();
                            if (fFloatValue3 > fFloatValue4) {
                                fFloatValue3 = fFloatValue4;
                            }
                            if (0.0f > fFloatValue3) {
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            }
                        }
                    }
                    OooO0O0.OooO00o(accessibilityNodeInfoCompatObtain, semanticsNode);
                    if (((C28380OooO0O0) C28388OooOO0O.OooO00o(semanticsNode.OooO0oO(), C28396OooOOoo.f100666OooO0o)) != null) {
                        accessibilityNodeInfoCompatObtain.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(0, 0, false, 0));
                        f = 0.0f;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        if (C28388OooOO0O.OooO00o(semanticsNode.OooO0oO(), C28396OooOOoo.f100667OooO0o0) != null) {
                            List<C28393OooOOOo> listOooO0o2 = semanticsNode.OooO0o(false, true);
                            int size2 = listOooO0o2.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                C28393OooOOOo c28393OooOOOo2 = listOooO0o2.get(i7);
                                float f3 = f2;
                                int i8 = size2;
                                if (c28393OooOOOo2.OooO0oO().OooO0Oo(C28396OooOOoo.f100684OooOo0o)) {
                                    arrayList2.add(c28393OooOOOo2);
                                }
                                i7++;
                                f2 = f3;
                                size2 = i8;
                            }
                        }
                        f = f2;
                        if (!arrayList2.isEmpty()) {
                            boolean zOooO00o = C31654OooO0OO.OooO00o(arrayList2);
                            accessibilityNodeInfoCompatObtain.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(zOooO00o ? 1 : arrayList2.size(), zOooO00o ? arrayList2.size() : 1, false, 0));
                        }
                    }
                    if (((C28381OooO0OO) C28388OooOO0O.OooO00o(semanticsNode.OooO0oO(), C28396OooOOoo.f100668OooO0oO)) != null) {
                        C28387OooOO0 c28387OooOO0OooO0oO = semanticsNode.OooO0oO();
                        OooOo<Boolean> key = C28396OooOOoo.f100684OooOo0o;
                        c28387OooOO0OooO0oO.getClass();
                        OooOOO0.OooO0oO(key, "key");
                        C31653OooO0O0 defaultValue = C31653OooO0O0.f113155OooOo0o;
                        OooOOO0.OooO0oO(defaultValue, "defaultValue");
                        Object obj = c28387OooOO0OooO0oO.f100643OooOo0o.get(key);
                        if (obj == null) {
                            obj = Boolean.FALSE;
                        }
                        accessibilityNodeInfoCompatObtain.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 0, 0, 0, false, ((Boolean) obj).booleanValue()));
                    }
                    C28393OooOOOo c28393OooOOOoOooO0oo3 = semanticsNode.OooO0oo();
                    if (c28393OooOOOoOooO0oo3 != null && C28388OooOO0O.OooO00o(c28393OooOOOoOooO0oo3.OooO0oO(), C28396OooOOoo.f100667OooO0o0) != null) {
                        if (semanticsNode.OooO0oO().OooO0Oo(C28396OooOOoo.f100684OooOo0o)) {
                            ArrayList arrayList3 = new ArrayList();
                            int i9 = 0;
                            List<C28393OooOOOo> listOooO0o3 = c28393OooOOOoOooO0oo3.OooO0o(false, true);
                            int size3 = listOooO0o3.size();
                            int i10 = 0;
                            while (i9 < size3) {
                                List<C28393OooOOOo> list4 = listOooO0o3;
                                C28393OooOOOo c28393OooOOOo3 = listOooO0o3.get(i9);
                                boolean z9 = z6;
                                int i11 = i9;
                                if (c28393OooOOOo3.OooO0oO().OooO0Oo(C28396OooOOoo.f100684OooOo0o)) {
                                    arrayList3.add(c28393OooOOOo3);
                                    if (c28393OooOOOo3.f100652OooO0OO.f86955Oooo0oO < c25503OooOoOO.f86955Oooo0oO) {
                                        i10++;
                                    }
                                }
                                i9 = i11 + 1;
                                z6 = z9;
                                listOooO0o3 = list4;
                            }
                            z = z6;
                            if (!arrayList3.isEmpty()) {
                                boolean zOooO00o2 = C31654OooO0OO.OooO00o(arrayList3);
                                int i12 = zOooO00o2 ? 0 : i10;
                                int i13 = zOooO00o2 ? i10 : 0;
                                C28387OooOO0 c28387OooOO0OooO0oO2 = semanticsNode.OooO0oO();
                                OooOo<Boolean> key2 = C28396OooOOoo.f100684OooOo0o;
                                c28387OooOO0OooO0oO2.getClass();
                                OooOOO0.OooO0oO(key2, "key");
                                C31652OooO00o defaultValue2 = C31652OooO00o.f113154OooOo0o;
                                OooOOO0.OooO0oO(defaultValue2, "defaultValue");
                                Object obj2 = c28387OooOO0OooO0oO2.f100643OooOo0o.get(key2);
                                if (obj2 == null) {
                                    obj2 = Boolean.FALSE;
                                }
                                AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfoCompatObtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i12, 1, i13, 1, false, ((Boolean) obj2).booleanValue());
                                if (collectionItemInfoCompatObtain != null) {
                                    accessibilityNodeInfoCompatObtain.setCollectionItemInfo(collectionItemInfoCompatObtain);
                                }
                            }
                        } else {
                            z = z6;
                        }
                    }
                    C28386OooO0oo c28386OooO0oo = (C28386OooO0oo) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100673OooOOO);
                    C28379OooO00o c28379OooO00o8 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100620OooO0Oo);
                    if (c28386OooO0oo != null && c28379OooO00o8 != null) {
                        if (!C31654OooO0OO.OooO0O0(semanticsNode)) {
                            accessibilityNodeInfoCompatObtain.setClassName("android.widget.HorizontalScrollView");
                        }
                        if (((Number) c28386OooO0oo.f100641OooO0O0.invoke()).floatValue() > f) {
                            accessibilityNodeInfoCompatObtain.setScrollable(true);
                        }
                        if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                            if (OooO00o.OooOOO(c28386OooO0oo)) {
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                accessibilityNodeInfoCompatObtain.addAction(!androidx.compose.p002ui.platform.OooO0OO.OooO0O0(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT);
                            }
                            if (OooO00o.OooOOO0(c28386OooO0oo)) {
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                accessibilityNodeInfoCompatObtain.addAction(!androidx.compose.p002ui.platform.OooO0OO.OooO0O0(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT : AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT);
                            }
                        }
                    }
                    C28386OooO0oo c28386OooO0oo2 = (C28386OooO0oo) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100675OooOOOO);
                    if (c28386OooO0oo2 != null && c28379OooO00o8 != null) {
                        if (!C31654OooO0OO.OooO0O0(semanticsNode)) {
                            accessibilityNodeInfoCompatObtain.setClassName("android.widget.ScrollView");
                        }
                        if (((Number) c28386OooO0oo2.f100641OooO0O0.invoke()).floatValue() > f) {
                            accessibilityNodeInfoCompatObtain.setScrollable(true);
                        }
                        if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                            if (OooO00o.OooOOO(c28386OooO0oo2)) {
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                            }
                            if (OooO00o.OooOOO0(c28386OooO0oo2)) {
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                                accessibilityNodeInfoCompatObtain.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                            }
                        }
                    }
                    if (i6 >= 29) {
                        C21604OooO0Oo.OooO00o(accessibilityNodeInfoCompatObtain, semanticsNode);
                    }
                    accessibilityNodeInfoCompatObtain.setPaneTitle((CharSequence) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100665OooO0Oo));
                    if (androidx.compose.p002ui.platform.OooO0OO.OooO00o(semanticsNode)) {
                        C28379OooO00o c28379OooO00o9 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100626OooOO0O);
                        if (c28379OooO00o9 != null) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, c28379OooO00o9.f100635OooO00o));
                            C32460OooOooO c32460OooOooO12 = C32460OooOooO.f116667OooO00o;
                        }
                        C28379OooO00o c28379OooO00o10 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100627OooOO0o);
                        if (c28379OooO00o10 != null) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, c28379OooO00o10.f100635OooO00o));
                            C32460OooOooO c32460OooOooO13 = C32460OooOooO.f116667OooO00o;
                        }
                        C28379OooO00o c28379OooO00o11 = (C28379OooO00o) C28388OooOO0O.OooO00o(c28387OooOO0, C28378OooO.f100629OooOOO0);
                        if (c28379OooO00o11 != null) {
                            accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, c28379OooO00o11.f100635OooO00o));
                            C32460OooOooO c32460OooOooO14 = C32460OooOooO.f116667OooO00o;
                        }
                        OooOo<List<C28382OooO0Oo>> oooOo7 = C28378OooO.f100630OooOOOO;
                        if (c28387OooOO0.OooO0Oo(oooOo7)) {
                            List list5 = (List) c28387OooOO0.OooO0o0(oooOo7);
                            if (list5.size() >= 32) {
                                throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                            }
                            Oooo0<CharSequence> oooo0 = new Oooo0<>();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Oooo0<Map<CharSequence, Integer>> oooo02 = oooO00o.f63460OooOO0O;
                            if (oooo02.f58538OooOo0o) {
                                C20494Oooo0O0.OooO00o(oooo02);
                            }
                            boolean z10 = C20511OooO00o.OooO0O0(oooo02.f58537OooOo, oooo02.f58539OooOoO, i) >= 0;
                            int[] iArr = OooO00o.f63449OooOooO;
                            if (z10) {
                                Map<CharSequence, Integer> mapOooO0OO = oooo02.OooO0OO(i);
                                ArrayList arrayListOoooOOO = OooOOO.OoooOOO(iArr);
                                ArrayList arrayList4 = new ArrayList();
                                int size4 = list5.size();
                                int i14 = 0;
                                while (i14 < size4) {
                                    C28382OooO0Oo c28382OooO0Oo = (C28382OooO0Oo) list5.get(i14);
                                    OooOOO0.OooO0Oo(mapOooO0OO);
                                    c28382OooO0Oo.getClass();
                                    int i15 = size4;
                                    if (mapOooO0OO.containsKey(null)) {
                                        Integer num = mapOooO0OO.get(null);
                                        OooOOO0.OooO0Oo(num);
                                        map = mapOooO0OO;
                                        oooo0.OooO0o0(num.intValue(), null);
                                        linkedHashMap.put(null, num);
                                        arrayListOoooOOO.remove(num);
                                        accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), null));
                                    } else {
                                        map = mapOooO0OO;
                                        arrayList4.add(c28382OooO0Oo);
                                    }
                                    i14++;
                                    size4 = i15;
                                    mapOooO0OO = map;
                                }
                                int size5 = arrayList4.size();
                                for (int i16 = 0; i16 < size5; i16++) {
                                    C28382OooO0Oo c28382OooO0Oo2 = (C28382OooO0Oo) arrayList4.get(i16);
                                    int iIntValue = ((Number) arrayListOoooOOO.get(i16)).intValue();
                                    c28382OooO0Oo2.getClass();
                                    oooo0.OooO0o0(iIntValue, null);
                                    linkedHashMap.put(null, Integer.valueOf(iIntValue));
                                    accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iIntValue, null));
                                }
                            } else {
                                int size6 = list5.size();
                                for (int i17 = 0; i17 < size6; i17++) {
                                    C28382OooO0Oo c28382OooO0Oo3 = (C28382OooO0Oo) list5.get(i17);
                                    int i18 = iArr[i17];
                                    c28382OooO0Oo3.getClass();
                                    oooo0.OooO0o0(i18, null);
                                    linkedHashMap.put(null, Integer.valueOf(i18));
                                    accessibilityNodeInfoCompatObtain.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i18, null));
                                }
                            }
                            z2 = true;
                            oooO00o.f63459OooOO0.OooO0o0(i, oooo0);
                            oooo02.OooO0o0(i, linkedHashMap);
                        }
                    } else {
                        z2 = true;
                    }
                    accessibilityNodeInfoCompatObtain.setScreenReaderFocusable((c28387OooOO0.f100642OooOo || (z && ((accessibilityNodeInfoCompatObtain.getContentDescription() != null || accessibilityNodeInfoCompatObtain.getText() != null || accessibilityNodeInfoCompatObtain.getHintText() != null || accessibilityNodeInfoCompatObtain.getStateDescription() != null || accessibilityNodeInfoCompatObtain.isCheckable()) ? z2 : false))) ? z2 : false);
                    HashMap<Integer, Integer> map2 = oooO00o.f63471OooOo00;
                    if (map2.get(Integer.valueOf(i)) != null) {
                        Integer num2 = map2.get(Integer.valueOf(i));
                        if (num2 != null) {
                            accessibilityNodeInfoCompatObtain.setTraversalBefore(androidComposeView, num2.intValue());
                            C32460OooOooO c32460OooOooO15 = C32460OooOooO.f116667OooO00o;
                        }
                        AccessibilityNodeInfo accessibilityNodeInfoUnwrap2 = accessibilityNodeInfoCompatObtain.unwrap();
                        OooOOO0.OooO0o(accessibilityNodeInfoUnwrap2, "info.unwrap()");
                        oooO00o.OooO00o(i, accessibilityNodeInfoUnwrap2, oooO00o.f63472OooOo0O, null);
                    }
                    HashMap<Integer, Integer> map3 = oooO00o.f63470OooOo0;
                    if (map3.get(Integer.valueOf(i)) != null) {
                        Integer num3 = map3.get(Integer.valueOf(i));
                        if (num3 != null) {
                            accessibilityNodeInfoCompatObtain.setTraversalAfter(androidComposeView, num3.intValue());
                            C32460OooOooO c32460OooOooO16 = C32460OooOooO.f116667OooO00o;
                        }
                        AccessibilityNodeInfo accessibilityNodeInfoUnwrap3 = accessibilityNodeInfoCompatObtain.unwrap();
                        OooOOO0.OooO0o(accessibilityNodeInfoUnwrap3, "info.unwrap()");
                        oooO00o.OooO00o(i, accessibilityNodeInfoUnwrap3, oooO00o.f63473OooOo0o, null);
                    }
                    return accessibilityNodeInfoCompatObtain.unwrap();
                }
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:222:0x0386  */
        /* JADX WARN: Removed duplicated region for block: B:243:0x03e7  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x0535  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0141 -> B:78:0x0142). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x0142
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        @Override // android.view.accessibility.AccessibilityNodeProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean performAction(int r19, int r20, android.os.Bundle r21) {
            /*
                Method dump skipped, instruction units count: 1818
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.OooO00o.C21605OooO0o0.performAction(int, int, android.os.Bundle):boolean");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.OooO00o$OooO0oO, reason: case insensitive filesystem */
    public static final class C21606OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C28393OooOOOo f63488OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C28387OooOO0 f63489OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final LinkedHashSet f63490OooO0OO;

        public C21606OooO0oO(C28393OooOOOo semanticsNode, Map<Integer, C31576o0000o0O> currentSemanticsNodes) {
            OooOOO0.OooO0oO(semanticsNode, "semanticsNode");
            OooOOO0.OooO0oO(currentSemanticsNodes, "currentSemanticsNodes");
            this.f63488OooO00o = semanticsNode;
            this.f63489OooO0O0 = semanticsNode.f100654OooO0o;
            this.f63490OooO0OO = new LinkedHashSet();
            List<C28393OooOOOo> listOooO0o = semanticsNode.OooO0o(false, true);
            int size = listOooO0o.size();
            for (int i = 0; i < size; i++) {
                C28393OooOOOo c28393OooOOOo = listOooO0o.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(c28393OooOOOo.f100656OooO0oO))) {
                    this.f63490OooO0OO.add(Integer.valueOf(c28393OooOOOo.f100656OooO0oO));
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.OooO00o$OooO0oo, reason: case insensitive filesystem */
    public static final class C21607OooO0oo extends OooOOOO implements InterfaceC32507OooOO0o<C31575o0000o0, C32460OooOooO> {
        public C21607OooO0oo() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(C31575o0000o0 c31575o0000o0) {
            C31575o0000o0 it = c31575o0000o0;
            OooOOO0.OooO0oO(it, "it");
            OooO00o oooO00o = OooO00o.this;
            oooO00o.getClass();
            if (it.f112828OooOo.contains(it)) {
                oooO00o.f63451OooO00o.getSnapshotObserver().OooO00o(it, oooO00o.f63477OooOoo, new androidx.compose.p002ui.platform.OooO0O0(it, oooO00o));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOO0 extends OooOOOO implements InterfaceC32507OooOO0o<C25503OooOoOO, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooOO0 f63492OooOo0o = new OooOO0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C25503OooOoOO c25503OooOoOO) {
            C25503OooOoOO it = c25503OooOoOO;
            OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(C28395OooOOo0.OooO0o(it) != null);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o0ooOO0.OooOOo0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [o0ooOO0.OooOOo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o0ooOO0.OooOOoo] */
    public OooO00o(AndroidComposeView view) {
        OooOOO0.OooO0oO(view, "view");
        this.f63451OooO00o = view;
        this.f63452OooO0O0 = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f63453OooO0OO = accessibilityManager;
        this.f63454OooO0Oo = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: o0ooOO0.OooOOo0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                androidx.compose.p002ui.platform.OooO00o this$0 = this.f112699OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.f63455OooO0o = z ? this$0.f63453OooO0OO.getEnabledAccessibilityServiceList(-1) : C34434OooOoO.f123453OooOo0o;
            }
        };
        this.f63456OooO0o0 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o0ooOO0.OooOOo
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                androidx.compose.p002ui.platform.OooO00o this$0 = this.f112698OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.f63455OooO0o = this$0.f63453OooO0OO.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f63455OooO0o = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f63457OooO0oO = new Handler(Looper.getMainLooper());
        this.f63458OooO0oo = new AccessibilityNodeProviderCompat(new C21605OooO0o0());
        this.f63450OooO = Integer.MIN_VALUE;
        this.f63459OooOO0 = new Oooo0<>();
        this.f63460OooOO0O = new Oooo0<>();
        this.f63461OooOO0o = -1;
        this.f63462OooOOO = new OooOo.OooO0O0<>();
        this.f63464OooOOOO = C33703OooOOO0.OooO00o(-1, 6, null);
        this.f63465OooOOOo = true;
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        this.f63466OooOOo = c34436OooOoOO;
        this.f63468OooOOoo = new OooOo.OooO0O0<>();
        this.f63471OooOo00 = new HashMap<>();
        this.f63470OooOo0 = new HashMap<>();
        this.f63472OooOo0O = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f63473OooOo0o = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f63469OooOo = new LinkedHashMap();
        this.f63475OooOoO0 = new C21606OooO0oO(view.getSemanticsOwner().OooO00o(), c34436OooOoOO);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC18998OooO00o());
        this.f63476OooOoOO = new Runnable() { // from class: o0ooOO0.OooOOoo
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x02cd  */
            /* JADX WARN: Removed duplicated region for block: B:204:0x04f6  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                LinkedHashMap linkedHashMap;
                C28387OooOO0 c28387OooOO0;
                C28387OooOO0 c28387OooOO02;
                boolean z;
                AndroidComposeView androidComposeView;
                OooO00o.C21606OooO0oO c21606OooO0oO;
                C28393OooOOOo c28393OooOOOo;
                int i;
                Integer num;
                int i2;
                C28393OooOOOo c28393OooOOOo2;
                int i3;
                char c;
                Integer num2;
                int i4;
                int i5;
                boolean z2;
                AccessibilityEvent accessibilityEventOooO0o0;
                androidx.compose.p002ui.platform.OooO00o this$0 = this.f112700OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                Integer num3 = 0;
                AndroidComposeView androidComposeView2 = this$0.f63451OooO00o;
                boolean z3 = true;
                androidComposeView2.OooOO0O(true);
                this$0.OooOo0(androidComposeView2.getSemanticsOwner().OooO00o(), this$0.f63475OooOoO0);
                Map<Integer, C31576o0000o0O> newSemanticsNodes = this$0.OooO0oo();
                kotlin.jvm.internal.OooOOO0.OooO0oO(newSemanticsNodes, "newSemanticsNodes");
                ArrayList arrayList = this$0.f63478OooOoo0;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                Iterator<Integer> it = newSemanticsNodes.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = this$0.f63469OooOo;
                    if (!zHasNext) {
                        break;
                    }
                    int iIntValue = it.next().intValue();
                    OooO00o.C21606OooO0oO c21606OooO0oO2 = (OooO00o.C21606OooO0oO) linkedHashMap.get(Integer.valueOf(iIntValue));
                    if (c21606OooO0oO2 != null) {
                        C31576o0000o0O c31576o0000o0O = newSemanticsNodes.get(Integer.valueOf(iIntValue));
                        C28393OooOOOo c28393OooOOOo3 = c31576o0000o0O != null ? c31576o0000o0O.f112834OooO00o : null;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c28393OooOOOo3);
                        C28387OooOO0 c28387OooOO03 = c28393OooOOOo3.f100654OooO0o;
                        Iterator<Map.Entry<? extends o0Oo0oo.OooOo<?>, ? extends Object>> it2 = c28387OooOO03.iterator();
                        boolean z4 = false;
                        while (true) {
                            boolean zHasNext2 = it2.hasNext();
                            c28387OooOO02 = c21606OooO0oO2.f63489OooO0O0;
                            if (!zHasNext2) {
                                break;
                            }
                            Map.Entry<? extends o0Oo0oo.OooOo<?>, ? extends Object> next = it2.next();
                            o0Oo0oo.OooOo<?> key = next.getKey();
                            o0Oo0oo.OooOo<C28386OooO0oo> oooOo = C28396OooOOoo.f100673OooOOO;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(key, oooOo) || kotlin.jvm.internal.OooOOO0.OooO0O0(next.getKey(), C28396OooOOoo.f100675OooOOOO)) {
                                C31575o0000o0 c31575o0000o0OooO0OO = androidx.compose.p002ui.platform.OooO0OO.OooO0OO(iIntValue, arrayList2);
                                if (c31575o0000o0OooO0OO != null) {
                                    z = false;
                                } else {
                                    c31575o0000o0OooO0OO = new C31575o0000o0(iIntValue, arrayList);
                                    z = true;
                                }
                                arrayList.add(c31575o0000o0OooO0OO);
                            } else {
                                z = false;
                            }
                            if (z || !kotlin.jvm.internal.OooOOO0.OooO0O0(next.getValue(), C28388OooOO0O.OooO00o(c28387OooOO02, next.getKey()))) {
                                o0Oo0oo.OooOo<?> key2 = next.getKey();
                                o0Oo0oo.OooOo<String> oooOo2 = C28396OooOOoo.f100665OooO0Oo;
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, oooOo2)) {
                                    Object value = next.getValue();
                                    kotlin.jvm.internal.OooOOO0.OooO0o0(value, "null cannot be cast to non-null type kotlin.String");
                                    String str = (String) value;
                                    if (c28387OooOO02.OooO0Oo(oooOo2)) {
                                        this$0.OooOOoo(iIntValue, 8, str);
                                    }
                                } else if ((kotlin.jvm.internal.OooOOO0.OooO0O0(key2, C28396OooOOoo.f100663OooO0O0) ? true : kotlin.jvm.internal.OooOOO0.OooO0O0(key2, C28396OooOOoo.f100680OooOo)) || kotlin.jvm.internal.OooOOO0.OooO0O0(key2, C28396OooOOoo.f100664OooO0OO)) {
                                    androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(iIntValue), 2048, 64, 8);
                                    androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(iIntValue), 2048, num3, 8);
                                } else {
                                    o0Oo0oo.OooOo<Boolean> oooOo3 = C28396OooOOoo.f100684OooOo0o;
                                    androidComposeView = androidComposeView2;
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, oooOo3)) {
                                        C28385OooO0oO c28385OooO0oO = (C28385OooO0oO) C28388OooOO0O.OooO00o(c28393OooOOOo3.OooO0oO(), C28396OooOOoo.f100678OooOOo0);
                                        if (!(c28385OooO0oO != null && c28385OooO0oO.f100639OooO00o == 4)) {
                                            androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(iIntValue), 2048, 64, 8);
                                            androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(iIntValue), 2048, num3, 8);
                                        } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(C28388OooOO0O.OooO00o(c28393OooOOOo3.OooO0oO(), oooOo3), Boolean.TRUE)) {
                                            AccessibilityEvent accessibilityEventOooO0Oo = this$0.OooO0Oo(this$0.OooOOOO(iIntValue), 4);
                                            C28393OooOOOo c28393OooOOOo4 = new C28393OooOOOo(c28393OooOOOo3.f100650OooO00o, true);
                                            List list = (List) C28388OooOO0O.OooO00o(c28393OooOOOo4.OooO0oO(), C28396OooOOoo.f100662OooO00o);
                                            String strOooO0O0 = list != null ? C21236OooO0oo.OooO0O0(list) : null;
                                            List list2 = (List) C28388OooOO0O.OooO00o(c28393OooOOOo4.OooO0oO(), C28396OooOOoo.f100679OooOOoo);
                                            String strOooO0O02 = list2 != null ? C21236OooO0oo.OooO0O0(list2) : null;
                                            if (strOooO0O0 != null) {
                                                accessibilityEventOooO0Oo.setContentDescription(strOooO0O0);
                                            }
                                            if (strOooO0O02 != null) {
                                                accessibilityEventOooO0Oo.getText().add(strOooO0O02);
                                            }
                                            this$0.OooOOOo(accessibilityEventOooO0Oo);
                                        } else {
                                            androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(iIntValue), 2048, num3, 8);
                                        }
                                    } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, C28396OooOOoo.f100662OooO00o)) {
                                        int iOooOOOO = this$0.OooOOOO(iIntValue);
                                        Object value2 = next.getValue();
                                        kotlin.jvm.internal.OooOOO0.OooO0o0(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                        this$0.OooOOo0(iOooOOOO, 2048, 4, (List) value2);
                                    } else {
                                        o0Oo0oo.OooOo<C34680OooO0O0> oooOo4 = C28396OooOOoo.f100682OooOo00;
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, oooOo4)) {
                                            if (c28387OooOO03.OooO0Oo(C28378OooO.f100623OooO0oO)) {
                                                CharSequence charSequence = (C34680OooO0O0) C28388OooOO0O.OooO00o(c28387OooOO02, oooOo4);
                                                if (charSequence == null) {
                                                    charSequence = "";
                                                }
                                                C34680OooO0O0 c34680OooO0O0 = (C34680OooO0O0) C28388OooOO0O.OooO00o(c28387OooOO03, oooOo4);
                                                CharSequence charSequence2 = c34680OooO0O0 != null ? c34680OooO0O0 : "";
                                                C28393OooOOOo c28393OooOOOo5 = c28393OooOOOo3;
                                                CharSequence charSequenceOooOoO = androidx.compose.p002ui.platform.OooO00o.OooOoO(charSequence2);
                                                int length = charSequence.length();
                                                int length2 = charSequence2.length();
                                                int i6 = length > length2 ? length2 : length;
                                                c28393OooOOOo2 = c28393OooOOOo5;
                                                int i7 = 0;
                                                while (true) {
                                                    num2 = num3;
                                                    if (i7 >= i6) {
                                                        i4 = length;
                                                        break;
                                                    }
                                                    i4 = length;
                                                    if (charSequence.charAt(i7) != charSequence2.charAt(i7)) {
                                                        break;
                                                    }
                                                    i7++;
                                                    length = i4;
                                                    num3 = num2;
                                                }
                                                int i8 = 0;
                                                while (true) {
                                                    if (i8 >= i6 - i7) {
                                                        i5 = i8;
                                                        break;
                                                    }
                                                    i5 = i8;
                                                    if (charSequence.charAt((i4 - 1) - i8) != charSequence2.charAt((length2 - 1) - i5)) {
                                                        break;
                                                    } else {
                                                        i8 = i5 + 1;
                                                    }
                                                }
                                                int i9 = (i4 - i5) - i7;
                                                int i10 = (length2 - i5) - i7;
                                                C28393OooOOOo c28393OooOOOo6 = c21606OooO0oO2.f63488OooO00o;
                                                if (androidx.compose.p002ui.platform.OooO0OO.OooO0o(c28393OooOOOo6)) {
                                                    C28387OooOO0 c28387OooOO0OooO0oO = c28393OooOOOo6.OooO0oO();
                                                    c21606OooO0oO = c21606OooO0oO2;
                                                    o0Oo0oo.OooOo<C32460OooOooO> oooOo5 = C28396OooOOoo.f100686OooOoO0;
                                                    if (!c28387OooOO0OooO0oO.OooO0Oo(oooOo5) && c28393OooOOOo2.OooO0oO().OooO0Oo(oooOo5)) {
                                                        z2 = true;
                                                    }
                                                    if (!c28393OooOOOo6.f100654OooO0o.OooO0Oo(C28378OooO.f100623OooO0oO)) {
                                                        C28387OooOO0 c28387OooOO0OooO0oO2 = c28393OooOOOo6.OooO0oO();
                                                        o0Oo0oo.OooOo<C32460OooOooO> oooOo6 = C28396OooOOoo.f100686OooOoO0;
                                                        boolean z5 = c28387OooOO0OooO0oO2.OooO0Oo(oooOo6) && !c28393OooOOOo2.OooO0oO().OooO0Oo(oooOo6);
                                                        if (z2 || z5) {
                                                            i3 = iIntValue;
                                                            int iOooOOOO2 = this$0.OooOOOO(i3);
                                                            Integer numValueOf = Integer.valueOf(length2);
                                                            num3 = num2;
                                                            c = ControlChar.SPACE_CHAR;
                                                            accessibilityEventOooO0o0 = this$0.OooO0o0(iOooOOOO2, num3, num2, numValueOf, charSequenceOooOoO);
                                                        } else {
                                                            accessibilityEventOooO0o0 = this$0.OooO0Oo(this$0.OooOOOO(iIntValue), 16);
                                                            accessibilityEventOooO0o0.setFromIndex(i7);
                                                            accessibilityEventOooO0o0.setRemovedCount(i9);
                                                            accessibilityEventOooO0o0.setAddedCount(i10);
                                                            accessibilityEventOooO0o0.setBeforeText(charSequence);
                                                            accessibilityEventOooO0o0.getText().add(charSequenceOooOoO);
                                                            i3 = iIntValue;
                                                            num3 = num2;
                                                            c = ControlChar.SPACE_CHAR;
                                                        }
                                                        accessibilityEventOooO0o0.setClassName("android.widget.EditText");
                                                        this$0.OooOOOo(accessibilityEventOooO0o0);
                                                        if (z2 || z5) {
                                                            long j = ((C34696OooOOoo) c28387OooOO03.OooO0o0(C28396OooOOoo.f100681OooOo0)).f124980OooO00o;
                                                            accessibilityEventOooO0o0.setFromIndex((int) (j >> c));
                                                            accessibilityEventOooO0o0.setToIndex((int) (j & 4294967295L));
                                                            this$0.OooOOOo(accessibilityEventOooO0o0);
                                                        }
                                                    }
                                                } else {
                                                    c21606OooO0oO = c21606OooO0oO2;
                                                }
                                                z2 = false;
                                                if (!c28393OooOOOo6.f100654OooO0o.OooO0Oo(C28378OooO.f100623OooO0oO)) {
                                                }
                                            } else {
                                                i3 = iIntValue;
                                                c21606OooO0oO = c21606OooO0oO2;
                                                c28393OooOOOo2 = c28393OooOOOo3;
                                                c = ControlChar.SPACE_CHAR;
                                                androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(i3), 2048, 2, 8);
                                            }
                                            i = i3;
                                            num = num3;
                                        } else {
                                            c21606OooO0oO = c21606OooO0oO2;
                                            c28393OooOOOo = c28393OooOOOo3;
                                            o0Oo0oo.OooOo<C34696OooOOoo> oooOo7 = C28396OooOOoo.f100681OooOo0;
                                            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(key2, oooOo7);
                                            int i11 = c28393OooOOOo.f100656OooO0oO;
                                            if (zOooO0O0) {
                                                C34680OooO0O0 c34680OooO0O02 = (C34680OooO0O0) C28388OooOO0O.OooO00o(c28387OooOO03, oooOo4);
                                                String str2 = "";
                                                if (c34680OooO0O02 != null) {
                                                    String str3 = c34680OooO0O02.f124887OooOo0o;
                                                    str2 = "";
                                                    if (str3 != null) {
                                                        str2 = str3;
                                                    }
                                                }
                                                C34696OooOOoo c34696OooOOoo = (C34696OooOOoo) c28387OooOO03.OooO0o0(oooOo7);
                                                int i12 = iIntValue;
                                                int iOooOOOO3 = this$0.OooOOOO(i12);
                                                androidx.compose.p002ui.platform.OooO00o oooO00o = this$0;
                                                long j2 = c34696OooOOoo.f124980OooO00o;
                                                Integer numValueOf2 = Integer.valueOf((int) (j2 >> 32));
                                                Integer numValueOf3 = Integer.valueOf((int) (j2 & 4294967295L));
                                                Integer numValueOf4 = Integer.valueOf(str2.length());
                                                CharSequence charSequenceOooOoO2 = androidx.compose.p002ui.platform.OooO00o.OooOoO(str2);
                                                this$0 = oooO00o;
                                                i = i12;
                                                c28393OooOOOo2 = c28393OooOOOo;
                                                num = num3;
                                                this$0.OooOOOo(this$0.OooO0o0(iOooOOOO3, numValueOf2, numValueOf3, numValueOf4, charSequenceOooOoO2));
                                                this$0.OooOo00(i11);
                                            } else {
                                                i = iIntValue;
                                                num = num3;
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, oooOo) ? true : kotlin.jvm.internal.OooOOO0.OooO0O0(key2, C28396OooOOoo.f100675OooOOOO)) {
                                                    this$0.OooOO0O(c28393OooOOOo.f100652OooO0OO);
                                                    C31575o0000o0 c31575o0000o0OooO0OO2 = androidx.compose.p002ui.platform.OooO0OO.OooO0OO(i, arrayList);
                                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c31575o0000o0OooO0OO2);
                                                    c31575o0000o0OooO0OO2.f112832OooOoOO = (C28386OooO0oo) C28388OooOO0O.OooO00o(c28387OooOO03, oooOo);
                                                    c31575o0000o0OooO0OO2.f112833OooOoo0 = (C28386OooO0oo) C28388OooOO0O.OooO00o(c28387OooOO03, C28396OooOOoo.f100675OooOOOO);
                                                    if (c31575o0000o0OooO0OO2.f112828OooOo.contains(c31575o0000o0OooO0OO2)) {
                                                        androidComposeView.getSnapshotObserver().OooO00o(c31575o0000o0OooO0OO2, this$0.f63477OooOoo, new androidx.compose.p002ui.platform.OooO0O0(c31575o0000o0OooO0OO2, this$0));
                                                    }
                                                } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, C28396OooOOoo.f100671OooOO0O)) {
                                                    Object value3 = next.getValue();
                                                    kotlin.jvm.internal.OooOOO0.OooO0o0(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                    if (((Boolean) value3).booleanValue()) {
                                                        i2 = 8;
                                                        this$0.OooOOOo(this$0.OooO0Oo(this$0.OooOOOO(i11), 8));
                                                    } else {
                                                        i2 = 8;
                                                    }
                                                    androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(i11), 2048, num, i2);
                                                } else {
                                                    o0Oo0oo.OooOo<List<C28382OooO0Oo>> oooOo8 = C28378OooO.f100630OooOOOO;
                                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(key2, oooOo8)) {
                                                        List list3 = (List) c28387OooOO03.OooO0o0(oooOo8);
                                                        List list4 = (List) C28388OooOO0O.OooO00o(c28387OooOO02, oooOo8);
                                                        if (list4 != null) {
                                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                            int size = list3.size();
                                                            for (int i13 = 0; i13 < size; i13++) {
                                                                ((C28382OooO0Oo) list3.get(i13)).getClass();
                                                                linkedHashSet.add(null);
                                                            }
                                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                            int size2 = list4.size();
                                                            for (int i14 = 0; i14 < size2; i14++) {
                                                                ((C28382OooO0Oo) list4.get(i14)).getClass();
                                                                linkedHashSet2.add(null);
                                                            }
                                                            z4 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                        } else if (!list3.isEmpty()) {
                                                            num3 = num;
                                                            c28393OooOOOo3 = c28393OooOOOo;
                                                            iIntValue = i;
                                                            androidComposeView2 = androidComposeView;
                                                            c21606OooO0oO2 = c21606OooO0oO;
                                                            z3 = true;
                                                            z4 = true;
                                                        }
                                                        num3 = num;
                                                        c28393OooOOOo3 = c28393OooOOOo;
                                                        iIntValue = i;
                                                        androidComposeView2 = androidComposeView;
                                                        c21606OooO0oO2 = c21606OooO0oO;
                                                        z3 = true;
                                                    } else {
                                                        if (next.getValue() instanceof C28379OooO00o) {
                                                            Object value4 = next.getValue();
                                                            kotlin.jvm.internal.OooOOO0.OooO0o0(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                            C28379OooO00o c28379OooO00o = (C28379OooO00o) value4;
                                                            Object objOooO00o = C28388OooOO0O.OooO00o(c28387OooOO02, next.getKey());
                                                            if (c28379OooO00o != objOooO00o) {
                                                                if (objOooO00o instanceof C28379OooO00o) {
                                                                    C28379OooO00o c28379OooO00o2 = (C28379OooO00o) objOooO00o;
                                                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c28379OooO00o.f100635OooO00o, c28379OooO00o2.f100635OooO00o)) {
                                                                        T t = c28379OooO00o2.f100636OooO0O0;
                                                                        T t2 = c28379OooO00o.f100636OooO0O0;
                                                                        boolean z6 = (t2 != 0 || t == 0) && (t2 == 0 || t != 0);
                                                                        z4 = !z6;
                                                                        num3 = num;
                                                                        c28393OooOOOo3 = c28393OooOOOo;
                                                                        iIntValue = i;
                                                                        z3 = true;
                                                                    }
                                                                }
                                                                z4 = !z6;
                                                                num3 = num;
                                                                c28393OooOOOo3 = c28393OooOOOo;
                                                                iIntValue = i;
                                                                z3 = true;
                                                            }
                                                        } else {
                                                            num3 = num;
                                                            c28393OooOOOo3 = c28393OooOOOo;
                                                            iIntValue = i;
                                                            z3 = true;
                                                            z4 = true;
                                                        }
                                                        androidComposeView2 = androidComposeView;
                                                        c21606OooO0oO2 = c21606OooO0oO;
                                                    }
                                                }
                                                num3 = num;
                                                c28393OooOOOo3 = c28393OooOOOo;
                                                iIntValue = i;
                                                androidComposeView2 = androidComposeView;
                                                c21606OooO0oO2 = c21606OooO0oO;
                                                z3 = true;
                                            }
                                        }
                                        c28393OooOOOo = c28393OooOOOo2;
                                        num3 = num;
                                        c28393OooOOOo3 = c28393OooOOOo;
                                        iIntValue = i;
                                        androidComposeView2 = androidComposeView;
                                        c21606OooO0oO2 = c21606OooO0oO;
                                        z3 = true;
                                    }
                                    i = iIntValue;
                                    num = num3;
                                    c21606OooO0oO = c21606OooO0oO2;
                                    c28393OooOOOo = c28393OooOOOo3;
                                    num3 = num;
                                    c28393OooOOOo3 = c28393OooOOOo;
                                    iIntValue = i;
                                    androidComposeView2 = androidComposeView;
                                    c21606OooO0oO2 = c21606OooO0oO;
                                    z3 = true;
                                }
                                i = iIntValue;
                                num = num3;
                                c21606OooO0oO = c21606OooO0oO2;
                                c28393OooOOOo = c28393OooOOOo3;
                                androidComposeView = androidComposeView2;
                                num3 = num;
                                c28393OooOOOo3 = c28393OooOOOo;
                                iIntValue = i;
                                androidComposeView2 = androidComposeView;
                                c21606OooO0oO2 = c21606OooO0oO;
                                z3 = true;
                            } else {
                                i = iIntValue;
                                num = num3;
                                c21606OooO0oO = c21606OooO0oO2;
                                c28393OooOOOo = c28393OooOOOo3;
                                androidComposeView = androidComposeView2;
                                num3 = num;
                                c28393OooOOOo3 = c28393OooOOOo;
                                iIntValue = i;
                                androidComposeView2 = androidComposeView;
                                c21606OooO0oO2 = c21606OooO0oO;
                                z3 = true;
                            }
                        }
                        int i15 = iIntValue;
                        Integer num4 = num3;
                        C28393OooOOOo c28393OooOOOo7 = c28393OooOOOo3;
                        AndroidComposeView androidComposeView3 = androidComposeView2;
                        boolean z7 = z3;
                        if (!z4) {
                            Iterator<Map.Entry<? extends o0Oo0oo.OooOo<?>, ? extends Object>> it3 = c28387OooOO02.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!c28393OooOOOo7.OooO0oO().OooO0Oo(it3.next().getKey())) {
                                        z4 = z7;
                                        break;
                                    }
                                } else {
                                    z4 = false;
                                    break;
                                }
                            }
                        }
                        if (z4) {
                            androidx.compose.p002ui.platform.OooO00o.OooOOo(this$0, this$0.OooOOOO(i15), 2048, num4, 8);
                        }
                        num3 = num4;
                        z3 = z7;
                        androidComposeView2 = androidComposeView3;
                    }
                }
                AndroidComposeView androidComposeView4 = androidComposeView2;
                int i16 = 32;
                OooOo.OooO0O0 oooO0O0 = new OooOo.OooO0O0();
                OooOo.OooO0O0<Integer> oooO0O02 = this$0.f63468OooOOoo;
                oooO0O02.getClass();
                OooO0O0.OooO00o oooO00o2 = new OooO0O0.OooO00o();
                while (oooO00o2.hasNext()) {
                    Integer id = (Integer) oooO00o2.next();
                    C31576o0000o0O c31576o0000o0O2 = this$0.OooO0oo().get(id);
                    C28393OooOOOo c28393OooOOOo8 = c31576o0000o0O2 != null ? c31576o0000o0O2.f112834OooO00o : null;
                    if (c28393OooOOOo8 == null || !c28393OooOOOo8.OooO0oO().OooO0Oo(C28396OooOOoo.f100665OooO0Oo)) {
                        oooO0O0.add(id);
                        kotlin.jvm.internal.OooOOO0.OooO0o(id, "id");
                        int iIntValue2 = id.intValue();
                        OooO00o.C21606OooO0oO c21606OooO0oO3 = (OooO00o.C21606OooO0oO) linkedHashMap.get(id);
                        int i17 = i16;
                        this$0.OooOOoo(iIntValue2, i17, (c21606OooO0oO3 == null || (c28387OooOO0 = c21606OooO0oO3.f63489OooO0O0) == null) ? null : (String) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100665OooO0Oo));
                        i16 = i17;
                    }
                }
                int i18 = oooO0O0.f58463OooOoO0;
                for (int i19 = 0; i19 < i18; i19++) {
                    oooO0O02.remove(oooO0O0.f58461OooOo[i19]);
                }
                linkedHashMap.clear();
                for (Map.Entry<Integer, C31576o0000o0O> entry : this$0.OooO0oo().entrySet()) {
                    C28387OooOO0 c28387OooOO0OooO0oO3 = entry.getValue().f112834OooO00o.OooO0oO();
                    o0Oo0oo.OooOo<String> oooOo9 = C28396OooOOoo.f100665OooO0Oo;
                    if (c28387OooOO0OooO0oO3.OooO0Oo(oooOo9) && oooO0O02.add(entry.getKey())) {
                        this$0.OooOOoo(entry.getKey().intValue(), 16, (String) entry.getValue().f112834OooO00o.f100654OooO0o.OooO0o0(oooOo9));
                    }
                    linkedHashMap.put(entry.getKey(), new OooO00o.C21606OooO0oO(entry.getValue().f112834OooO00o, this$0.OooO0oo()));
                }
                this$0.f63475OooOoO0 = new OooO00o.C21606OooO0oO(androidComposeView4.getSemanticsOwner().OooO00o(), this$0.OooO0oo());
                this$0.f63474OooOoO = false;
            }
        };
        this.f63478OooOoo0 = new ArrayList();
        this.f63477OooOoo = new C21607OooO0oo();
    }

    public static String OooO(C28393OooOOOo c28393OooOOOo) {
        C34680OooO0O0 c34680OooO0O0;
        if (c28393OooOOOo == null) {
            return null;
        }
        OooOo<List<String>> oooOo = C28396OooOOoo.f100662OooO00o;
        C28387OooOO0 c28387OooOO0 = c28393OooOOOo.f100654OooO0o;
        if (c28387OooOO0.OooO0Oo(oooOo)) {
            return C21236OooO0oo.OooO0O0((List) c28387OooOO0.OooO0o0(oooOo));
        }
        if (c28387OooOO0.OooO0Oo(C28378OooO.f100623OooO0oO)) {
            C34680OooO0O0 c34680OooO0O02 = (C34680OooO0O0) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100682OooOo00);
            if (c34680OooO0O02 != null) {
                return c34680OooO0O02.f124887OooOo0o;
            }
            return null;
        }
        List list = (List) C28388OooOO0O.OooO00o(c28387OooOO0, C28396OooOOoo.f100679OooOOoo);
        if (list == null || (c34680OooO0O0 = (C34680OooO0O0) oOo000Oo.OooOo.Oooo(list)) == null) {
            return null;
        }
        return c34680OooO0O0.f124887OooOo0o;
    }

    public static final boolean OooOO0o(C28386OooO0oo c28386OooO0oo, float f) {
        o0000OO o0000oo2 = c28386OooO0oo.f100640OooO00o;
        if (f >= 0.0f || ((Number) o0000oo2.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) o0000oo2.invoke()).floatValue() < ((Number) c28386OooO0oo.f100641OooO0O0.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean OooOOO(C28386OooO0oo c28386OooO0oo) {
        o0000OO o0000oo2 = c28386OooO0oo.f100640OooO00o;
        if (((Number) o0000oo2.invoke()).floatValue() < ((Number) c28386OooO0oo.f100641OooO0O0.invoke()).floatValue()) {
            return true;
        }
        ((Number) o0000oo2.invoke()).floatValue();
        return false;
    }

    public static final boolean OooOOO0(C28386OooO0oo c28386OooO0oo) {
        o0000OO o0000oo2 = c28386OooO0oo.f100640OooO00o;
        if (((Number) o0000oo2.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) o0000oo2.invoke()).floatValue();
        ((Number) c28386OooO0oo.f100641OooO0O0.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void OooOOo(OooO00o oooO00o, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        oooO00o.OooOOo0(i, i2, num, null);
    }

    public static CharSequence OooOoO(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        OooOOO0.OooO0o0(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    public static final void OooOoO0(ArrayList arrayList, LinkedHashMap linkedHashMap, OooO00o oooO00o, boolean z, C28393OooOOOo c28393OooOOOo) {
        arrayList.add(c28393OooOOOo);
        C28387OooOO0 c28387OooOO0OooO0oO = c28393OooOOOo.OooO0oO();
        OooOo<Boolean> oooOo = C28396OooOOoo.f100672OooOO0o;
        boolean zOooO0O0 = OooOOO0.OooO0O0((Boolean) C28388OooOO0O.OooO00o(c28387OooOO0OooO0oO, oooOo), Boolean.FALSE);
        boolean z2 = c28393OooOOOo.f100651OooO0O0;
        if (!zOooO0O0 && (OooOOO0.OooO0O0((Boolean) C28388OooOO0O.OooO00o(c28393OooOOOo.OooO0oO(), oooOo), Boolean.TRUE) || c28393OooOOOo.OooO0oO().OooO0Oo(C28396OooOOoo.f100666OooO0o) || c28393OooOOOo.OooO0oO().OooO0Oo(C28378OooO.f100620OooO0Oo))) {
            linkedHashMap.put(Integer.valueOf(c28393OooOOOo.f100656OooO0oO), oooO00o.OooOo(oOo000Oo.OooOo.o0ooOoO(c28393OooOOOo.OooO0o(!z2, false)), z));
            return;
        }
        List<C28393OooOOOo> listOooO0o = c28393OooOOOo.OooO0o(!z2, false);
        int size = listOooO0o.size();
        for (int i = 0; i < size; i++) {
            OooOoO0(arrayList, linkedHashMap, oooO00o, z, listOooO0o.get(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        C28393OooOOOo c28393OooOOOo;
        String str2;
        long jOooO0oo;
        C21291OooO0oO c21291OooO0oOOooO0Oo;
        RectF rectF;
        C31576o0000o0O c31576o0000o0O = OooO0oo().get(Integer.valueOf(i));
        if (c31576o0000o0O == null || (c28393OooOOOo = c31576o0000o0O.f112834OooO00o) == null) {
            return;
        }
        String strOooO = OooO(c28393OooOOOo);
        if (OooOOO0.OooO0O0(str, this.f63472OooOo0O)) {
            Integer num = this.f63471OooOo00.get(Integer.valueOf(i));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                return;
            }
            return;
        }
        if (OooOOO0.OooO0O0(str, this.f63473OooOo0o)) {
            Integer num2 = this.f63470OooOo0.get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        OooOo<C28379OooO00o<InterfaceC32507OooOO0o<List<C34695OooOOo0>, Boolean>>> oooOo = C28378OooO.f100617OooO00o;
        C28387OooOO0 c28387OooOO0 = c28393OooOOOo.f100654OooO0o;
        if (!c28387OooOO0.OooO0Oo(oooOo) || bundle == null || !OooOOO0.OooO0O0(str, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            OooOo<String> oooOo2 = C28396OooOOoo.f100677OooOOo;
            if (!c28387OooOO0.OooO0Oo(oooOo2) || bundle == null || !OooOOO0.OooO0O0(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) C28388OooOO0O.OooO00o(c28387OooOO0, oooOo2)) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            return;
        }
        int i2 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
        int i3 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
        if (i3 > 0 && i2 >= 0) {
            if (i2 < (strOooO != null ? strOooO.length() : Integer.MAX_VALUE)) {
                ArrayList arrayList = new ArrayList();
                InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) ((C28379OooO00o) c28387OooOO0.OooO0o0(oooOo)).f100636OooO0O0;
                if (OooOOO0.OooO0O0(interfaceC32507OooOO0o != null ? (Boolean) interfaceC32507OooOO0o.invoke(arrayList) : null, Boolean.TRUE)) {
                    C34695OooOOo0 c34695OooOOo0 = (C34695OooOOo0) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = i2 + i4;
                        if (i5 >= c34695OooOOo0.f124972OooO00o.f124963OooO00o.f124887OooOo0o.length()) {
                            arrayList2.add(null);
                        } else {
                            C21291OooO0oO c21291OooO0oOOooO0O0 = c34695OooOOo0.OooO0O0(i5);
                            AbstractC25521OoooO abstractC25521OoooOOooO0O0 = c28393OooOOOo.OooO0O0();
                            if (abstractC25521OoooOOooO0O0 == null) {
                                jOooO0oo = C21290OooO0o0.f61718OooO0O0;
                                C21291OooO0oO c21291OooO0oOOooO0o = c21291OooO0oOOooO0O0.OooO0o(jOooO0oo);
                                C21291OooO0oO c21291OooO0oOOooO0Oo2 = c28393OooOOOo.OooO0Oo();
                                c21291OooO0oOOooO0Oo = (c21291OooO0oOOooO0o.f61726OooO0OO > c21291OooO0oOOooO0Oo2.f61724OooO00o || c21291OooO0oOOooO0Oo2.f61726OooO0OO <= c21291OooO0oOOooO0o.f61724OooO00o || c21291OooO0oOOooO0o.f61727OooO0Oo <= c21291OooO0oOOooO0Oo2.f61725OooO0O0 || c21291OooO0oOOooO0Oo2.f61727OooO0Oo <= c21291OooO0oOOooO0o.f61725OooO0O0) ? null : c21291OooO0oOOooO0o.OooO0Oo(c21291OooO0oOOooO0Oo2);
                                if (c21291OooO0oOOooO0Oo == null) {
                                    long jOooO00o = C21289OooO0o.OooO00o(c21291OooO0oOOooO0Oo.f61724OooO00o, c21291OooO0oOOooO0Oo.f61725OooO0O0);
                                    AndroidComposeView androidComposeView = this.f63451OooO00o;
                                    long jOooOO0 = androidComposeView.OooOO0(jOooO00o);
                                    long jOooOO02 = androidComposeView.OooOO0(C21289OooO0o.OooO00o(c21291OooO0oOOooO0Oo.f61726OooO0OO, c21291OooO0oOOooO0Oo.f61727OooO0Oo));
                                    rectF = new RectF(C21290OooO0o0.OooO0OO(jOooOO0), C21290OooO0o0.OooO0Oo(jOooOO0), C21290OooO0o0.OooO0OO(jOooOO02), C21290OooO0o0.OooO0Oo(jOooOO02));
                                } else {
                                    rectF = null;
                                }
                                arrayList2.add(rectF);
                            } else {
                                if (!abstractC25521OoooOOooO0O0.OooOo()) {
                                    abstractC25521OoooOOooO0O0 = null;
                                }
                                if (abstractC25521OoooOOooO0O0 != null) {
                                    jOooO0oo = o00000.OooOO0.OooO0oo(abstractC25521OoooOOooO0O0);
                                }
                                C21291OooO0oO c21291OooO0oOOooO0o2 = c21291OooO0oOOooO0O0.OooO0o(jOooO0oo);
                                C21291OooO0oO c21291OooO0oOOooO0Oo22 = c28393OooOOOo.OooO0Oo();
                                if (c21291OooO0oOOooO0o2.f61726OooO0OO > c21291OooO0oOOooO0Oo22.f61724OooO00o) {
                                    if (c21291OooO0oOOooO0Oo == null) {
                                    }
                                    arrayList2.add(rectF);
                                }
                            }
                        }
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                    return;
                }
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (oO0o0OO.C33644OoooO0.OooO00o(100, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x002c, B:25:0x005a, B:29:0x006d, B:31:0x0075, B:34:0x0080, B:36:0x0085, B:37:0x0094, B:39:0x009b, B:40:0x00a4, B:20:0x0043), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b5 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o0ooOO0.OooOo00 oooOo00;
        OooO00o oooO00o;
        OooOo.OooO0O0<Integer> oooO0O0;
        InterfaceC33701OooOO0o oooO00o2;
        OooOo.OooO0O0<Integer> oooO0O02;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof o0ooOO0.OooOo00) {
            oooOo00 = (o0ooOO0.OooOo00) abstractC32479OooO0OO;
            int i = oooOo00.f112708OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f112708OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new o0ooOO0.OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOo00.f112705OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo00.f112708OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                try {
                    oooO0O0 = new OooOo.OooO0O0<>();
                    C33695OooO0o0 c33695OooO0o0 = this.f63464OooOOOO;
                    c33695OooO0o0.getClass();
                    oooO00o2 = new C33695OooO0o0.OooO00o();
                    oooO00o = this;
                    oooOo00.f112704OooOo0o = oooO00o;
                    oooOo00.f112703OooOo = oooO0O0;
                    oooOo00.f112706OooOoO0 = oooO00o2;
                    oooOo00.f112708OooOoo0 = 1;
                    objOooO00o = oooO00o2.OooO00o(oooOo00);
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                } catch (Throwable th) {
                    th = th;
                    oooO00o = this;
                    oooO00o.f63462OooOOO.clear();
                    throw th;
                }
            } else if (i2 == 1) {
                interfaceC33701OooOO0o = oooOo00.f112706OooOoO0;
                oooO0O02 = oooOo00.f112703OooOo;
                oooO00o = oooOo00.f112704OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33701OooOO0o = oooOo00.f112706OooOoO0;
                oooO0O02 = oooOo00.f112703OooOo;
                oooO00o = oooOo00.f112704OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                oooO0O0 = oooO0O02;
                oooO00o2 = interfaceC33701OooOO0o;
                oooOo00.f112704OooOo0o = oooO00o;
                oooOo00.f112703OooOo = oooO0O0;
                oooOo00.f112706OooOoO0 = oooO00o2;
                oooOo00.f112708OooOoo0 = 1;
                objOooO00o = oooO00o2.OooO00o(oooOo00);
                if (objOooO00o != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                InterfaceC33701OooOO0o interfaceC33701OooOO0o2 = oooO00o2;
                oooO0O02 = oooO0O0;
                obj = objOooO00o;
                interfaceC33701OooOO0o = interfaceC33701OooOO0o2;
                if (((Boolean) obj).booleanValue()) {
                    oooO00o.f63462OooOOO.clear();
                    return C32460OooOooO.f116667OooO00o;
                }
                interfaceC33701OooOO0o.next();
                boolean zOooOO0 = oooO00o.OooOO0();
                OooOo.OooO0O0<C25503OooOoOO> oooO0O03 = oooO00o.f63462OooOOO;
                if (zOooOO0) {
                    int i3 = oooO0O03.f58463OooOoO0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Object obj2 = oooO0O03.f58461OooOo[i4];
                        OooOOO0.OooO0Oo(obj2);
                        oooO00o.OooOo0O((C25503OooOoOO) obj2, oooO0O02);
                    }
                    oooO0O02.clear();
                    if (!oooO00o.f63474OooOoO) {
                        oooO00o.f63474OooOoO = true;
                        oooO00o.f63457OooO0oO.post(oooO00o.f63476OooOoOO);
                    }
                }
                oooO0O03.clear();
                oooOo00.f112704OooOo0o = oooO00o;
                oooOo00.f112703OooOo = oooO0O02;
                oooOo00.f112706OooOoO0 = interfaceC33701OooOO0o;
                oooOo00.f112708OooOoo0 = 2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean OooO0OO(int i, long j, boolean z) {
        OooOo<C28386OooO0oo> oooOo;
        C28386OooO0oo c28386OooO0oo;
        Collection<C31576o0000o0O> currentSemanticsNodes = OooO0oo().values();
        OooOOO0.OooO0oO(currentSemanticsNodes, "currentSemanticsNodes");
        if (C21290OooO0o0.OooO00o(j, C21290OooO0o0.f61720OooO0Oo)) {
            return false;
        }
        if (Float.isNaN(C21290OooO0o0.OooO0OO(j)) || Float.isNaN(C21290OooO0o0.OooO0Oo(j))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        if (z) {
            oooOo = C28396OooOOoo.f100675OooOOOO;
        } else {
            if (z) {
                throw new C32442OooOO0o();
            }
            oooOo = C28396OooOOoo.f100673OooOOO;
        }
        Collection<C31576o0000o0O> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return false;
        }
        for (C31576o0000o0O c31576o0000o0O : collection) {
            Rect rect = c31576o0000o0O.f112835OooO0O0;
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            if (C21290OooO0o0.OooO0OO(j) >= f && C21290OooO0o0.OooO0OO(j) < f3 && C21290OooO0o0.OooO0Oo(j) >= f2 && C21290OooO0o0.OooO0Oo(j) < f4 && (c28386OooO0oo = (C28386OooO0oo) C28388OooOO0O.OooO00o(c31576o0000o0O.f112834OooO00o.OooO0oO(), oooOo)) != null) {
                o0000OO o0000oo2 = c28386OooO0oo.f100640OooO00o;
                if (i < 0) {
                    if (((Number) o0000oo2.invoke()).floatValue() > 0.0f) {
                        return true;
                    }
                } else if (((Number) o0000oo2.invoke()).floatValue() < ((Number) c28386OooO0oo.f100641OooO0O0.invoke()).floatValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AccessibilityEvent OooO0Oo(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        OooOOO0.OooO0o(accessibilityEventObtain, "obtain(eventType)");
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f63451OooO00o;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        C31576o0000o0O c31576o0000o0O = OooO0oo().get(Integer.valueOf(i));
        if (c31576o0000o0O != null) {
            accessibilityEventObtain.setPassword(c31576o0000o0O.f112834OooO00o.OooO0oO().OooO0Oo(C28396OooOOoo.f100686OooOoO0));
        }
        return accessibilityEventObtain;
    }

    public final int OooO0o(C28393OooOOOo c28393OooOOOo) {
        C28387OooOO0 c28387OooOO0 = c28393OooOOOo.f100654OooO0o;
        OooOo<List<String>> oooOo = C28396OooOOoo.f100662OooO00o;
        if (!c28387OooOO0.OooO0Oo(C28396OooOOoo.f100662OooO00o)) {
            OooOo<C34696OooOOoo> oooOo2 = C28396OooOOoo.f100681OooOo0;
            C28387OooOO0 c28387OooOO02 = c28393OooOOOo.f100654OooO0o;
            if (c28387OooOO02.OooO0Oo(oooOo2)) {
                return (int) (4294967295L & ((C34696OooOOoo) c28387OooOO02.OooO0o0(oooOo2)).f124980OooO00o);
            }
        }
        return this.f63461OooOO0o;
    }

    public final AccessibilityEvent OooO0o0(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventOooO0Oo = OooO0Oo(i, 8192);
        if (num != null) {
            accessibilityEventOooO0Oo.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventOooO0Oo.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventOooO0Oo.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventOooO0Oo.getText().add(charSequence);
        }
        return accessibilityEventOooO0Oo;
    }

    public final int OooO0oO(C28393OooOOOo c28393OooOOOo) {
        C28387OooOO0 c28387OooOO0 = c28393OooOOOo.f100654OooO0o;
        OooOo<List<String>> oooOo = C28396OooOOoo.f100662OooO00o;
        if (!c28387OooOO0.OooO0Oo(C28396OooOOoo.f100662OooO00o)) {
            OooOo<C34696OooOOoo> oooOo2 = C28396OooOOoo.f100681OooOo0;
            C28387OooOO0 c28387OooOO02 = c28393OooOOOo.f100654OooO0o;
            if (c28387OooOO02.OooO0Oo(oooOo2)) {
                return (int) (((C34696OooOOoo) c28387OooOO02.OooO0o0(oooOo2)).f124980OooO00o >> 32);
            }
        }
        return this.f63461OooOO0o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map<java.lang.Integer, o0ooOO0.o0000o0O>] */
    public final Map<Integer, C31576o0000o0O> OooO0oo() {
        if (this.f63465OooOOOo) {
            this.f63465OooOOOo = false;
            C28394OooOOo semanticsOwner = this.f63451OooO00o.getSemanticsOwner();
            OooOOO0.OooO0oO(semanticsOwner, "<this>");
            C28393OooOOOo c28393OooOOOoOooO00o = semanticsOwner.OooO00o();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C25503OooOoOO c25503OooOoOO = c28393OooOOOoOooO00o.f100652OooO0OO;
            if (c25503OooOoOO.f86953Oooo0o && c25503OooOoOO.OooOoO()) {
                Region region = new Region();
                C21291OooO0oO c21291OooO0oOOooO0Oo = c28393OooOOOoOooO00o.OooO0Oo();
                region.set(new Rect(oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooO0Oo.f61724OooO00o), oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooO0Oo.f61725OooO0O0), oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooO0Oo.f61726OooO0OO), oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooO0Oo.f61727OooO0Oo)));
                androidx.compose.p002ui.platform.OooO0OO.OooO0o0(region, c28393OooOOOoOooO00o, linkedHashMap, c28393OooOOOoOooO00o);
            }
            this.f63466OooOOo = linkedHashMap;
            HashMap<Integer, Integer> map = this.f63471OooOo00;
            map.clear();
            HashMap<Integer, Integer> map2 = this.f63470OooOo0;
            map2.clear();
            C31576o0000o0O c31576o0000o0O = OooO0oo().get(-1);
            C28393OooOOOo c28393OooOOOo = c31576o0000o0O != null ? c31576o0000o0O.f112834OooO00o : null;
            OooOOO0.OooO0Oo(c28393OooOOOo);
            int i = 1;
            ArrayList arrayListOooOo = OooOo(oOo000Oo.OooOo.o0ooOoO(c28393OooOOOo.OooO0o(!c28393OooOOOo.f100651OooO0O0, false)), androidx.compose.p002ui.platform.OooO0OO.OooO0O0(c28393OooOOOo));
            int iOooOO0O = C34429OooOOo0.OooOO0O(arrayListOooOo);
            if (1 <= iOooOO0O) {
                while (true) {
                    int i2 = ((C28393OooOOOo) arrayListOooOo.get(i - 1)).f100656OooO0oO;
                    int i3 = ((C28393OooOOOo) arrayListOooOo.get(i)).f100656OooO0oO;
                    map2.put(C22207OooOOoo.OooO00o(i3, map, Integer.valueOf(i2), i3), Integer.valueOf(i2));
                    if (i == iOooOO0O) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f63466OooOOo;
    }

    public final boolean OooOO0() {
        if (!this.f63453OooO0OO.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledServices = this.f63455OooO0o;
        OooOOO0.OooO0o(enabledServices, "enabledServices");
        return !enabledServices.isEmpty();
    }

    public final void OooOO0O(C25503OooOoOO c25503OooOoOO) {
        if (this.f63462OooOOO.add(c25503OooOoOO)) {
            this.f63464OooOOOO.OooO0o0(C32460OooOooO.f116667OooO00o);
        }
    }

    public final int OooOOOO(int i) {
        if (i == this.f63451OooO00o.getSemanticsOwner().OooO00o().f100656OooO0oO) {
            return -1;
        }
        return i;
    }

    public final boolean OooOOOo(AccessibilityEvent accessibilityEvent) {
        if (!OooOO0()) {
            return false;
        }
        View view = this.f63451OooO00o;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean OooOOo0(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !OooOO0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventOooO0Oo = OooO0Oo(i, i2);
        if (num != null) {
            accessibilityEventOooO0Oo.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventOooO0Oo.setContentDescription(C21236OooO0oo.OooO0O0(list));
        }
        return OooOOOo(accessibilityEventOooO0Oo);
    }

    public final void OooOOoo(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventOooO0Oo = OooO0Oo(OooOOOO(i), 32);
        accessibilityEventOooO0Oo.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventOooO0Oo.getText().add(str);
        }
        OooOOOo(accessibilityEventOooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList OooOo(ArrayList arrayList, boolean z) {
        char c;
        char c2;
        int i;
        char c3 = 1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooOoO0(arrayList2, linkedHashMap, this, z, (C28393OooOOOo) arrayList.get(i2));
        }
        ArrayList arrayList3 = new ArrayList();
        int iOooOO0O = C34429OooOOo0.OooOO0O(arrayList2);
        if (iOooOO0O >= 0) {
            int i3 = 0;
            while (true) {
                C28393OooOOOo c28393OooOOOo = (C28393OooOOOo) arrayList2.get(i3);
                if (i3 != 0) {
                    C21291OooO0oO c21291OooO0oOOooO0o0 = c28393OooOOOo.OooO0o0();
                    C21291OooO0oO c21291OooO0oOOooO0o02 = c28393OooOOOo.OooO0o0();
                    int iOooOO0O2 = C34429OooOOo0.OooOO0O(arrayList3);
                    if (iOooOO0O2 >= 0) {
                        int i4 = 0;
                        c2 = 3;
                        while (true) {
                            c = c3;
                            C21291OooO0oO c21291OooO0oO = (C21291OooO0oO) ((C32443OooOOO) arrayList3.get(i4)).f116638OooOo0o;
                            i = 0;
                            float f = c21291OooO0oO.f61725OooO0O0;
                            float f2 = c21291OooO0oO.f61727OooO0Oo;
                            if (f < f2) {
                                float f3 = c21291OooO0oOOooO0o0.f61725OooO0O0;
                                float f4 = c21291OooO0oOOooO0o02.f61727OooO0Oo;
                                if (f3 < f4 && Math.max(f, f3) < Math.min(f2, f4)) {
                                    arrayList3.set(i4, new C32443OooOOO(new C21291OooO0oO(Math.max(c21291OooO0oO.f61724OooO00o, 0.0f), Math.max(c21291OooO0oO.f61725OooO0O0, f3), Math.min(c21291OooO0oO.f61726OooO0OO, Float.POSITIVE_INFINITY), Math.min(f2, f4)), ((C32443OooOOO) arrayList3.get(i4)).f116637OooOo));
                                    ((List) ((C32443OooOOO) arrayList3.get(i4)).f116637OooOo).add(c28393OooOOOo);
                                    break;
                                }
                            }
                            if (i4 == iOooOO0O2) {
                                break;
                            }
                            i4++;
                            c3 = c;
                        }
                    } else {
                        c = c3;
                        c2 = 3;
                        i = 0;
                    }
                    arrayList3.add(new C32443OooOOO(c28393OooOOOo.OooO0o0(), C34429OooOOo0.OooOOO(c28393OooOOOo)));
                    if (i3 == iOooOO0O) {
                        break;
                    }
                    i3++;
                    c3 = c;
                }
            }
        } else {
            c = 1;
            c2 = 3;
            i = 0;
        }
        InterfaceC32507OooOO0o[] interfaceC32507OooOO0oArr = new InterfaceC32507OooOO0o[2];
        interfaceC32507OooOO0oArr[i] = Oooo000.f112723OooOo0o;
        interfaceC32507OooOO0oArr[c] = C31529Oooo00O.f112724OooOo0o;
        C34431OooOo0.OooOooO(arrayList3, C24536OooO0Oo.OooO00o(interfaceC32507OooOO0oArr));
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        for (int i5 = i; i5 < size2; i5++) {
            C32443OooOOO c32443OooOOO = (C32443OooOOO) arrayList3.get(i5);
            List list = (List) c32443OooOOO.f116637OooOo;
            InterfaceC32507OooOO0o[] interfaceC32507OooOO0oArr2 = new InterfaceC32507OooOO0o[4];
            interfaceC32507OooOO0oArr2[i] = C31525OooOoo0.f112716OooOo0o;
            interfaceC32507OooOO0oArr2[c] = C31524OooOoo.f112715OooOo0o;
            interfaceC32507OooOO0oArr2[2] = C31526OooOooO.f112717OooOo0o;
            interfaceC32507OooOO0oArr2[c2] = C31527OooOooo.f112718OooOo0o;
            C32473OooO00o c32473OooO00oOooO00o = C24536OooO0Oo.OooO00o(interfaceC32507OooOO0oArr2);
            if (z) {
                InterfaceC32507OooOO0o[] interfaceC32507OooOO0oArr3 = new InterfaceC32507OooOO0o[4];
                interfaceC32507OooOO0oArr3[i] = o0ooOO0.OooOo.f112701OooOo0o;
                interfaceC32507OooOO0oArr3[c] = C31522OooOoO0.f112713OooOo0o;
                interfaceC32507OooOO0oArr3[2] = C31521OooOoO.f112712OooOo0o;
                interfaceC32507OooOO0oArr3[c2] = C31523OooOoOO.f112714OooOo0o;
                c32473OooO00oOooO00o = C24536OooO0Oo.OooO00o(interfaceC32507OooOO0oArr3);
            }
            C34431OooOo0.OooOooO(list, new C31520OooOo0o(new C31519OooOo0O(c32473OooO00oOooO00o, C25503OooOoOO.f86935Oooooo)));
            List list2 = (List) c32443OooOOO.f116637OooOo;
            int size3 = list2.size();
            for (int i6 = i; i6 < size3; i6++) {
                C28393OooOOOo c28393OooOOOo2 = (C28393OooOOOo) list2.get(i6);
                List list3 = (List) linkedHashMap.get(Integer.valueOf(c28393OooOOOo2.f100656OooO0oO));
                arrayList4.addAll(list3 != null ? list3 : C34429OooOOo0.OooOOO(c28393OooOOOo2));
            }
        }
        return arrayList4;
    }

    public final void OooOo0(C28393OooOOOo c28393OooOOOo, C21606OooO0oO c21606OooO0oO) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<C28393OooOOOo> listOooO0o = c28393OooOOOo.OooO0o(false, true);
        int size = listOooO0o.size();
        int i = 0;
        while (true) {
            C25503OooOoOO c25503OooOoOO = c28393OooOOOo.f100652OooO0OO;
            if (i >= size) {
                Iterator it = c21606OooO0oO.f63490OooO0OO.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        OooOO0O(c25503OooOoOO);
                        return;
                    }
                }
                List<C28393OooOOOo> listOooO0o2 = c28393OooOOOo.OooO0o(false, true);
                int size2 = listOooO0o2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C28393OooOOOo c28393OooOOOo2 = listOooO0o2.get(i2);
                    if (OooO0oo().containsKey(Integer.valueOf(c28393OooOOOo2.f100656OooO0oO))) {
                        Object obj = this.f63469OooOo.get(Integer.valueOf(c28393OooOOOo2.f100656OooO0oO));
                        OooOOO0.OooO0Oo(obj);
                        OooOo0(c28393OooOOOo2, (C21606OooO0oO) obj);
                    }
                }
                return;
            }
            C28393OooOOOo c28393OooOOOo3 = listOooO0o.get(i);
            if (OooO0oo().containsKey(Integer.valueOf(c28393OooOOOo3.f100656OooO0oO))) {
                LinkedHashSet linkedHashSet2 = c21606OooO0oO.f63490OooO0OO;
                int i3 = c28393OooOOOo3.f100656OooO0oO;
                if (!linkedHashSet2.contains(Integer.valueOf(i3))) {
                    OooOO0O(c25503OooOoOO);
                    return;
                }
                linkedHashSet.add(Integer.valueOf(i3));
            }
            i++;
        }
    }

    public final void OooOo00(int i) {
        OooO0o oooO0o = this.f63467OooOOo0;
        if (oooO0o != null) {
            C28393OooOOOo c28393OooOOOo = oooO0o.f63481OooO00o;
            if (i != c28393OooOOOo.f100656OooO0oO) {
                return;
            }
            if (SystemClock.uptimeMillis() - oooO0o.f63485OooO0o <= 1000) {
                AccessibilityEvent accessibilityEventOooO0Oo = OooO0Oo(OooOOOO(c28393OooOOOo.f100656OooO0oO), 131072);
                accessibilityEventOooO0Oo.setFromIndex(oooO0o.f63484OooO0Oo);
                accessibilityEventOooO0Oo.setToIndex(oooO0o.f63486OooO0o0);
                accessibilityEventOooO0Oo.setAction(oooO0o.f63482OooO0O0);
                accessibilityEventOooO0Oo.setMovementGranularity(oooO0o.f63483OooO0OO);
                accessibilityEventOooO0Oo.getText().add(OooO(c28393OooOOOo));
                OooOOOo(accessibilityEventOooO0Oo);
            }
        }
        this.f63467OooOOo0 = null;
    }

    public final void OooOo0O(C25503OooOoOO c25503OooOoOO, OooOo.OooO0O0<Integer> oooO0O0) {
        C25503OooOoOO c25503OooOoOOOooO0Oo;
        o0Oo0oo o0oo0ooOooO0o;
        if (c25503OooOoOO.OooOoO() && !this.f63451OooO00o.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(c25503OooOoOO)) {
            o0Oo0oo o0oo0ooOooO0o2 = C28395OooOOo0.OooO0o(c25503OooOoOO);
            if (o0oo0ooOooO0o2 == null) {
                C25503OooOoOO c25503OooOoOOOooO0Oo2 = androidx.compose.p002ui.platform.OooO0OO.OooO0Oo(c25503OooOoOO, OooOO0.f63492OooOo0o);
                o0oo0ooOooO0o2 = c25503OooOoOOOooO0Oo2 != null ? C28395OooOOo0.OooO0o(c25503OooOoOOOooO0Oo2) : null;
                if (o0oo0ooOooO0o2 == null) {
                    return;
                }
            }
            if (!o0OO00O.OooO00o(o0oo0ooOooO0o2).f100642OooOo && (c25503OooOoOOOooO0Oo = androidx.compose.p002ui.platform.OooO0OO.OooO0Oo(c25503OooOoOO, OooO.f63479OooOo0o)) != null && (o0oo0ooOooO0o = C28395OooOOo0.OooO0o(c25503OooOoOOOooO0Oo)) != null) {
                o0oo0ooOooO0o2 = o0oo0ooOooO0o;
            }
            int i = o00oO0O.OooO.OooO0o0(o0oo0ooOooO0o2).f86937OooOo;
            if (oooO0O0.add(Integer.valueOf(i))) {
                OooOOo(this, OooOOOO(i), 2048, 1, 8);
            }
        }
    }

    public final boolean OooOo0o(C28393OooOOOo c28393OooOOOo, int i, int i2, boolean z) {
        String strOooO;
        C28387OooOO0 c28387OooOO0 = c28393OooOOOo.f100654OooO0o;
        OooOo<C28379OooO00o<InterfaceC32510OooOOo0<Integer, Integer, Boolean, Boolean>>> oooOo = C28378OooO.f100621OooO0o;
        if (c28387OooOO0.OooO0Oo(oooOo) && androidx.compose.p002ui.platform.OooO0OO.OooO00o(c28393OooOOOo)) {
            InterfaceC32510OooOOo0 interfaceC32510OooOOo0 = (InterfaceC32510OooOOo0) ((C28379OooO00o) c28393OooOOOo.f100654OooO0o.OooO0o0(oooOo)).f100636OooO0O0;
            if (interfaceC32510OooOOo0 != null) {
                return ((Boolean) interfaceC32510OooOOo0.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f63461OooOO0o) && (strOooO = OooO(c28393OooOOOo)) != null) {
            if (i < 0 || i != i2 || i2 > strOooO.length()) {
                i = -1;
            }
            this.f63461OooOO0o = i;
            boolean z2 = strOooO.length() > 0;
            int i3 = c28393OooOOOo.f100656OooO0oO;
            OooOOOo(OooO0o0(OooOOOO(i3), z2 ? Integer.valueOf(this.f63461OooOO0o) : null, z2 ? Integer.valueOf(this.f63461OooOO0o) : null, z2 ? Integer.valueOf(strOooO.length()) : null, strOooO));
            OooOo00(i3);
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        OooOOO0.OooO0oO(host, "host");
        return this.f63458OooO0oo;
    }
}
