package androidx.compose.p002ui.platform;

import Oooo000.C20901OooOOo0;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000OO;
import OoooOOo.C21192OooO0o;
import OoooOOo.C21200OooOOO0;
import OoooOOo.C21210OooOo0o;
import OoooOOo.C21211OooOoO;
import OoooOOo.C21212OooOoO0;
import OoooOoO.InterfaceC21233OooO0o;
import OoooOoo.C21237OooO00o;
import OoooOoo.C21239OooO0OO;
import OoooOoo.C21240OooO0Oo;
import OoooOoo.C21241OooO0o;
import OoooOoo.C21242OooO0o0;
import OoooOoo.C21243OooO0oO;
import OoooOoo.InterfaceC21238OooO0O0;
import Ooooo0o.C21256OooO0OO;
import Ooooo0o.C21264OooOO0o;
import Ooooo0o.InterfaceC21263OooOO0O;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import OooooO0.C21292OooO0oo;
import OooooOO.C21325OooOooo;
import OooooOO.C21343OoooOOo;
import OooooOO.C21355Ooooooo;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p002ui.input.rotary.OnRotaryScrollEventElement;
import androidx.compose.p002ui.platform.AndroidComposeView;
import androidx.compose.p002ui.platform.ViewLayer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.oo000o;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOOO;
import o00000.C24060OooOoo;
import o00000.C24061OooOoo0;
import o00000.C24061OooOoo0.OooO00o;
import o00000.C24070Oooo0o0;
import o00000.InterfaceC24057OooOoO;
import o00000.InterfaceC24058OooOoO0;
import o00000.InterfaceC24068Oooo0OO;
import o00000.OooO00o;
import o000000o.AbstractC24088OooO0oO;
import o000000o.C24090OooOO0o;
import o000000o.OooO0o;
import o0000Ooo.C24226OooO;
import o0000Ooo.C24227OooO00o;
import o0000Ooo.C24228OooO0O0;
import o0000Ooo.C24230OooO0Oo;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000ooo0.C24754OooO0oO;
import o000ooo0.InterfaceC24753OooO0o0;
import o00Ooo.C25079OooO0oo;
import o00Ooo.C25086OooOo0O;
import o00Ooo.C25087OooOo0o;
import o00Ooo.C25090OooOoOO;
import o00Ooo.InterfaceC25082OooOOo;
import o00Ooo.OooOo;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.C25496OooOOo0;
import o00oO0O.C25503OooOoOO;
import o00oO0O.C25508OooOoo;
import o00oO0O.C25511OooOooo;
import o00oO0O.C25517Oooo0o;
import o00oO0O.C25527OoooO00;
import o00oO0O.C25545o00oO0o;
import o00oO0O.C25549ooOO;
import o00oO0O.InterfaceC25540Oooooo;
import o00oO0O.InterfaceC25542OoooooO;
import o00oO0O.o0OOO0o;
import o00oO0O.o0Oo0oo;
import o00oO0O.oo0o0Oo;
import o00oO0o.C25576OooO0o0;
import o00ooo.C25796OooO0OO;
import o0Oo0oo.C28391OooOOO0;
import o0Oo0oo.C28393OooOOOo;
import o0Oo0oo.C28394OooOOo;
import o0Oo0oo.C28395OooOOo0;
import o0Oo0oo.C28396OooOOoo;
import o0Oo0oo.InterfaceC28404OooOoO0;
import o0OoOo0.C29199OooO0O0;
import o0OoOo0.InterfaceC29198OooO00o;
import o0ooOO0.C31499OooO;
import o0ooOO0.C31508OooOO0;
import o0ooOO0.C31531Oooo0O0;
import o0ooOO0.C31532Oooo0OO;
import o0ooOO0.C31534Oooo0o0;
import o0ooOO0.C31540OoooO0O;
import o0ooOO0.C31541OoooOO0;
import o0ooOO0.C31548Ooooo0o;
import o0ooOO0.C31550OooooOO;
import o0ooOO0.C31587o000O0oO;
import o0ooOO0.C31604o0ooOoO;
import o0ooOO0.InterfaceC31549OooooO0;
import o0ooOO0.InterfaceC31574o0000o;
import o0ooOO0.InterfaceC31586o000O0o0;
import o0ooOO0.Oooo0;
import o0ooOO0.RunnableC31513OooOOOO;
import o0ooOO0.ViewTreeObserverOnGlobalLayoutListenerC31510OooOO0o;
import o0ooOO0.ViewTreeObserverOnScrollChangedListenerC31512OooOOO0;
import o0ooOO0.ViewTreeObserverOnTouchModeChangeListenerC31511OooOOO;
import o0ooOO0.o000O0O;
import o0ooOO0.o000O0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oo000o.C34650Oooo;
import ooOO.C35029OooO00o;
import ooOO.C35031OooO0OO;
import ooOO.InterfaceC35030OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u0004:\u0004È\u0001É\u0001J!\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R.\u0010A\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00070\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\nR\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010S\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR(\u0010]\u001a\u00020T8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u0010\\\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR(\u0010l\u001a\u00020d8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\be\u0010f\u0012\u0004\bk\u0010\\\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR/\u0010s\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010y\u001a\u00020t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001a\u0010\u007f\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R'\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u0012\u0005\b\u0085\u0001\u0010\\\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R3\u0010\u008d\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0017\u001a\u00030\u0087\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010n\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R3\u0010\u0094\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u0017\u001a\u00030\u008e\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010n\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010 \u0001\u001a\u00030\u009b\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¦\u0001\u001a\u00030¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010¬\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u0017\u0010¯\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0016\u0010½\u0001\u001a\u00020d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010hR\u0016\u0010¿\u0001\u001a\u00020T8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010XR\u001a\u0010Ã\u0001\u001a\u0005\u0018\u00010À\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001¨\u0006Ê\u0001"}, m80612d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lo00oO0O/OoooooO;", "", "Landroidx/lifecycle/OooO0o;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$OooO0O0;", "LoO00ooO/OooOooO;", "callback", "setOnViewTreeOwnersAvailable", "(LoO0O000o/OooOO0o;)V", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "Lo00oO0O/OooOoo;", "OooOoO0", "Lo00oO0O/OooOoo;", "getSharedDrawScope", "()Lo00oO0O/OooOoo;", "sharedDrawScope", "Lo0000Ooo/OooO0OO;", "<set-?>", "OooOoO", "Lo0000Ooo/OooO0OO;", "getDensity", "()Lo0000Ooo/OooO0OO;", "density", "LOoooo0o/OooOO0O;", "OooOoOO", "LOoooo0o/OooOO0O;", "getFocusOwner", "()LOoooo0o/OooOO0O;", "focusOwner", "Lo00oO0O/OooOoOO;", "OooOooo", "Lo00oO0O/OooOoOO;", "getRoot", "()Lo00oO0O/OooOoOO;", "root", "Lo00oO0O/o0OOO0o;", "Oooo000", "Lo00oO0O/o0OOO0o;", "getRootForTest", "()Lo00oO0O/o0OOO0o;", "rootForTest", "Lo0Oo0oo/OooOOo;", "Oooo00O", "Lo0Oo0oo/OooOOo;", "getSemanticsOwner", "()Lo0Oo0oo/OooOOo;", "semanticsOwner", "LOoooOoo/OooO0oO;", "Oooo0", "LOoooOoo/OooO0oO;", "getAutofillTree", "()LOoooOoo/OooO0oO;", "autofillTree", "Landroid/content/res/Configuration;", "Oooo0oo", "LoO0O000o/OooOO0o;", "getConfigurationChangeObserver", "()LoO0O000o/OooOO0o;", "setConfigurationChangeObserver", "configurationChangeObserver", "Lo0ooOO0/OooOO0;", "OoooO0", "Lo0ooOO0/OooOO0;", "getClipboardManager", "()Lo0ooOO0/OooOO0;", "clipboardManager", "Lo0ooOO0/OooO;", "OoooO0O", "Lo0ooOO0/OooO;", "getAccessibilityManager", "()Lo0ooOO0/OooO;", "accessibilityManager", "Lo00oO0O/o00oO0o;", "OoooO", "Lo00oO0O/o00oO0o;", "getSnapshotObserver", "()Lo00oO0O/o00oO0o;", "snapshotObserver", "", "OoooOO0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Lo0ooOO0/o000O0O;", "OoooOoo", "Lo0ooOO0/o000O0O;", "getViewConfiguration", "()Lo0ooOO0/o000O0O;", "viewConfiguration", "", "OooooOo", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "Ooooooo", "LOooo0oO/o00oO0O;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$OooO0O0;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$OooO0O0;)V", "viewTreeOwners", "Lo00000/OooOoo0;", "o00Ooo", "Lo00000/OooOoo0;", "getPlatformTextInputPluginRegistry", "()Lo00000/OooOoo0;", "platformTextInputPluginRegistry", "Lo00000/Oooo0o0;", "o00o0O", "Lo00000/Oooo0o0;", "getTextInputService", "()Lo00000/Oooo0o0;", "textInputService", "Lo000000o/OooO0o$OooO00o;", "o00ooo", "Lo000000o/OooO0o$OooO00o;", "getFontLoader", "()Lo000000o/OooO0o$OooO00o;", "getFontLoader$annotations", "fontLoader", "Lo000000o/OooO0oO$OooO00o;", "oo000o", "getFontFamilyResolver", "()Lo000000o/OooO0oO$OooO00o;", "setFontFamilyResolver", "(Lo000000o/OooO0oO$OooO00o;)V", "fontFamilyResolver", "Lo0000Ooo/OooOOO;", "o00oO0O", "getLayoutDirection", "()Lo0000Ooo/OooOOO;", "setLayoutDirection", "(Lo0000Ooo/OooOOO;)V", "layoutDirection", "Lo0OoOo0/OooO00o;", "o0ooOO0", "Lo0OoOo0/OooO00o;", "getHapticFeedBack", "()Lo0OoOo0/OooO00o;", "hapticFeedBack", "Lo00oO0o/OooO0o0;", "o0ooOoO", "Lo00oO0o/OooO0o0;", "getModifierLocalManager", "()Lo00oO0o/OooO0o0;", "modifierLocalManager", "Lo0ooOO0/o0000o;", "o0OOO0o", "Lo0ooOO0/o0000o;", "getTextToolbar", "()Lo0ooOO0/o0000o;", "textToolbar", "Lo00Ooo/OooOOo;", "o00000O", "Lo00Ooo/OooOOo;", "getPointerIconService", "()Lo00Ooo/OooOOo;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Lo0ooOO0/o000O0o0;", "getWindowInfo", "()Lo0ooOO0/o000O0o0;", "windowInfo", "LOoooOoo/OooO0O0;", "getAutofill", "()LOoooOoo/OooO0O0;", "autofill", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lo00000/Oooo0OO;", "getTextInputForTests", "()Lo00000/Oooo0OO;", "textInputForTests", "LooOO/OooO0O0;", "getInputModeManager", "()LooOO/OooO0O0;", "inputModeManager", "OooO00o", "OooO0O0", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class AndroidComposeView extends ViewGroup implements InterfaceC25542OoooooO, o0OOO0o, androidx.lifecycle.OooO0o {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public static Class<?> f63364o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static Method f63365o00000Oo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f63366OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f63367OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C24230OooO0Oo f63368OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    public final C25508OooOoo sharedDrawScope;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C21264OooOO0o f63370OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final InterfaceC21233OooO0o f63371OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C31587o000O0oO f63372OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C21343OoooOOo f63373OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name and from kotlin metadata */
    public final C25503OooOoOO root;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final C21237OooO00o f63375Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name and from kotlin metadata */
    public final C21243OooO0oO autofillTree;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AndroidComposeView f63377Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public final C28394OooOOo semanticsOwner;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final androidx.compose.p002ui.platform.OooO00o f63379Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final ArrayList f63380Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ArrayList f63381Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C25079OooO0oo f63382Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f63383Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooOo f63384Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super Configuration, C32460OooOooO> configurationChangeObserver;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public final C25545o00oO0o snapshotObserver;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    public final C31508OooOO0 clipboardManager;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f63388OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    public final C31499OooO accessibilityManager;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public DrawChildContainer f63391OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public C24227OooO00o f63392OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f63393OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final C25517Oooo0o f63394OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final C31548Ooooo0o f63395OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f63396Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final int[] f63397Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final float[] f63398OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final float[] f63399OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public long f63401Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f63402Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f63403OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63404Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public final InterfaceC31549OooooO0 f63405o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public final RunnableC31513OooOOOO f63406o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f63407o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final OooO f63408o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final C21602OooO0oo f63409o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public boolean f63410o00000O0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public final OooOO0 f63411o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public AndroidViewsHandler f63412o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC31512OooOOO0 f63413o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC31511OooOOO f63414o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name and from kotlin metadata */
    public final C24061OooOoo0 platformTextInputPluginRegistry;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name and from kotlin metadata */
    public final C24070Oooo0o0 textInputService;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63417o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f63418o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final C31540OoooO0O f63419o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public final Oooo.OooO0O0<oO0O000o.OooO00o<C32460OooOooO>> f63420o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public long f63421o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public final C31541OoooOO0 f63422o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public MotionEvent f63423o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super OooO0O0, C32460OooOooO> f63424o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final C29199OooO0O0 f63425o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public final C35031OooO0OO f63426o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name and from kotlin metadata */
    public final C25576OooO0o0 modifierLocalManager;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63428oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public final o000O0O0<InterfaceC25540Oooooo> f63429oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC31510OooOO0o f63430ooOO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.f63423o0Oo0oo;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.f63421o0OO00O = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.f63411o000OOo);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO00o {
        public static final boolean OooO00o() {
            Class<?> cls = AndroidComposeView.f63364o00000OO;
            try {
                if (AndroidComposeView.f63364o00000OO == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.f63364o00000OO = cls2;
                    AndroidComposeView.f63365o00000Oo = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.f63365o00000Oo;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC21987OooOoo f63432OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC24753OooO0o0 f63433OooO0O0;

        public OooO0O0(InterfaceC21987OooOoo interfaceC21987OooOoo, InterfaceC24753OooO0o0 interfaceC24753OooO0o0) {
            this.f63432OooO00o = interfaceC21987OooOoo;
            this.f63433OooO0O0 = interfaceC24753OooO0o0;
        }
    }

    public static final class OooO0OO extends OooOOOO implements InterfaceC32507OooOO0o<C35029OooO00o, Boolean> {
        public OooO0OO() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C35029OooO00o c35029OooO00o) {
            int i = c35029OooO00o.f125768OooO00o;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            boolean zRequestFocusFromTouch = true;
            if (i == 1) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode();
            } else if (i != 2) {
                zRequestFocusFromTouch = false;
            } else if (androidComposeView.isInTouchMode()) {
                zRequestFocusFromTouch = androidComposeView.requestFocusFromTouch();
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21599OooO0Oo extends OooOOOO implements InterfaceC32507OooOO0o<Configuration, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C21599OooO0Oo f63435OooOo0o = new C21599OooO0Oo(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Configuration configuration) {
            Configuration it = configuration;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o extends OooOOOO implements InterfaceC32507OooOO0o<o00O0O.OooO0O0, Boolean> {
        public OooO0o() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(o00O0O.OooO0O0 oooO0O0) {
            C21256OooO0OO c21256OooO0OO;
            KeyEvent keyEvent = oooO0O0.f84203OooO00o;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.getClass();
            long jOooO0OO = C21292OooO0oo.OooO0OO(keyEvent.getKeyCode());
            if (o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84198OooO0oo)) {
                c21256OooO0OO = new C21256OooO0OO(keyEvent.isShiftPressed() ? 2 : 1);
            } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84195OooO0o)) {
                c21256OooO0OO = new C21256OooO0OO(4);
            } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84196OooO0o0)) {
                c21256OooO0OO = new C21256OooO0OO(3);
            } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84193OooO0OO)) {
                c21256OooO0OO = new C21256OooO0OO(5);
            } else if (o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84194OooO0Oo)) {
                c21256OooO0OO = new C21256OooO0OO(6);
            } else {
                if (o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84197OooO0oO) ? true : o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84191OooO) ? true : o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84200OooOO0O)) {
                    c21256OooO0OO = new C21256OooO0OO(7);
                } else {
                    c21256OooO0OO = o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84192OooO0O0) ? true : o00O0O.OooO00o.OooO00o(jOooO0OO, o00O0O.OooO00o.f84199OooOO0) ? new C21256OooO0OO(8) : null;
                }
            }
            if (c21256OooO0OO != null) {
                if (o00O0O.OooO0OO.OooO00o(keyEvent) == 2) {
                    return Boolean.valueOf(androidComposeView.getFocusOwner().OooOO0(c21256OooO0OO.f61650OooO00o));
                }
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$OooO0o0, reason: case insensitive filesystem */
    public static final class C21600OooO0o0 extends OooOOOO implements InterfaceC32507OooOO0o<oO0O000o.OooO00o<? extends C32460OooOooO>, C32460OooOooO> {
        public C21600OooO0o0() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(oO0O000o.OooO00o<? extends C32460OooOooO> oooO00o) {
            oO0O000o.OooO00o<? extends C32460OooOooO> it = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            AndroidComposeView.this.OooOo0(it);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$OooO0oO, reason: case insensitive filesystem */
    public static final class C21601OooO0oO extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC24057OooOoO<?>, o00000.OooOo, InterfaceC24058OooOoO0> {
        public C21601OooO0oO() {
            super(2);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final InterfaceC24058OooOoO0 invoke(InterfaceC24057OooOoO<?> interfaceC24057OooOoO, o00000.OooOo oooOo) {
            InterfaceC24057OooOoO<?> factory = interfaceC24057OooOoO;
            o00000.OooOo platformTextInput = oooOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(factory, "factory");
            kotlin.jvm.internal.OooOOO0.OooO0oO(platformTextInput, "platformTextInput");
            return factory.OooO00o(AndroidComposeView.this, platformTextInput);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$OooO0oo, reason: case insensitive filesystem */
    public static final class C21602OooO0oo implements InterfaceC25082OooOOo {
    }

    public static final class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f63423o0Oo0oo;
            if (motionEvent != null) {
                boolean z = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                androidComposeView2.OooOoO0(motionEvent, i, androidComposeView2.f63421o0OO00O, false);
            }
        }
    }

    public static final class OooOO0O extends OooOOOO implements InterfaceC32507OooOO0o<C25796OooO0OO, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooOO0O f63440OooOo0o = new OooOO0O(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C25796OooO0OO c25796OooO0OO) {
            C25796OooO0OO it = c25796OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$OooOO0o, reason: case insensitive filesystem */
    public static final class C21603OooOO0o extends OooOOOO implements InterfaceC32507OooOO0o<InterfaceC28404OooOoO0, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C21603OooOO0o f63441OooOo0o = new C21603OooOO0o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(InterfaceC28404OooOoO0 interfaceC28404OooOoO0) {
            InterfaceC28404OooOoO0 $receiver = interfaceC28404OooOoO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO($receiver, "$this$$receiver");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements InterfaceC32507OooOO0o<oO0O000o.OooO00o<? extends C32460OooOooO>, C32460OooOooO> {
        public OooOOO0() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(oO0O000o.OooO00o<? extends C32460OooOooO> oooO00o) {
            final oO0O000o.OooO00o<? extends C32460OooOooO> command = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(command, "command");
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                command.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: o0ooOO0.OooOOOo
                        @Override // java.lang.Runnable
                        public final void run() {
                            oO0O000o.OooO00o tmp0 = command;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(tmp0, "$tmp0");
                            tmp0.invoke();
                        }
                    });
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [o0ooOO0.OooOO0o] */
    /* JADX WARN: Type inference failed for: r3v17, types: [o0ooOO0.OooOOO0] */
    /* JADX WARN: Type inference failed for: r3v18, types: [o0ooOO0.OooOOO] */
    public AndroidComposeView(Context context) {
        super(context);
        this.f63367OooOo0o = C21290OooO0o0.f61720OooO0Oo;
        this.f63366OooOo = true;
        this.sharedDrawScope = new C25508OooOoo();
        this.f63368OooOoO = OooO0O0.OooO0O0.OooO00o(context);
        C28391OooOOO0 c28391OooOOO0 = new C28391OooOOO0(C21603OooOO0o.f63441OooOo0o, C31604o0ooOoO.f112933OooO00o, false);
        this.f63370OooOoOO = new C21264OooOO0o(new C21600OooO0o0());
        this.f63372OooOoo0 = new C31587o000O0oO();
        InterfaceC21233OooO0o interfaceC21233OooO0oOooO0oO = C21289OooO0o.OooO0oO(InterfaceC21233OooO0o.OooO00o.f61602OooOo0o, new OooO0o());
        this.f63371OooOoo = interfaceC21233OooO0oOooO0oO;
        OooOO0O onRotaryScrollEvent = OooOO0O.f63440OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(onRotaryScrollEvent, "onRotaryScrollEvent");
        OnRotaryScrollEventElement onRotaryScrollEventElement = new OnRotaryScrollEventElement(onRotaryScrollEvent);
        this.f63373OooOooO = new C21343OoooOOo();
        C25503OooOoOO c25503OooOoOO = new C25503OooOoOO(3);
        c25503OooOoOO.OooO0o(C34650Oooo.f124837OooO00o);
        c25503OooOoOO.OooO(getDensity());
        c25503OooOoOO.OooO0o0(c28391OooOOO0.o00ooo(onRotaryScrollEventElement).o00ooo(getFocusOwner().OooO0o0()).o00ooo(interfaceC21233OooO0oOooO0oO));
        this.root = c25503OooOoOO;
        this.f63377Oooo000 = this;
        this.semanticsOwner = new C28394OooOOo(getRoot());
        androidx.compose.p002ui.platform.OooO00o oooO00o = new androidx.compose.p002ui.platform.OooO00o(this);
        this.f63379Oooo00o = oooO00o;
        this.autofillTree = new C21243OooO0oO();
        this.f63380Oooo0O0 = new ArrayList();
        this.f63382Oooo0o = new C25079OooO0oo();
        this.f63384Oooo0oO = new OooOo(getRoot());
        this.configurationChangeObserver = C21599OooO0Oo.f63435OooOo0o;
        this.f63375Oooo = new C21237OooO00o(this, getAutofillTree());
        this.clipboardManager = new C31508OooOO0(context);
        C31499OooO c31499OooO = new C31499OooO();
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = c31499OooO;
        this.snapshotObserver = new C25545o00oO0o(new OooOOO0());
        this.f63394OoooOoO = new C25517Oooo0o(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewConfiguration, "get(context)");
        this.f63395OoooOoo = new C31548Ooooo0o(viewConfiguration);
        this.f63396Ooooo00 = C24235OooOO0.OooO00o(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f63397Ooooo0o = new int[]{0, 0};
        this.f63398OooooO0 = C21355Ooooooo.OooO00o();
        this.f63399OooooOO = C21355Ooooooo.OooO00o();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f63401Oooooo = C21290OooO0o0.f61719OooO0OO;
        this.f63403OoooooO = true;
        Oooo0oO.o000O0O0 o000o0o02 = Oooo0oO.o000O0O0.f61218OooO00o;
        this.f63404Ooooooo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f63430ooOO = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o0ooOO0.OooOO0o
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class<?> cls = AndroidComposeView.f63364o00000OO;
                AndroidComposeView this$0 = this.f112693OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.OooOoO();
            }
        };
        this.f63413o00O0O = new ViewTreeObserver.OnScrollChangedListener() { // from class: o0ooOO0.OooOOO0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class<?> cls = AndroidComposeView.f63364o00000OO;
                AndroidComposeView this$0 = this.f112695OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.OooOoO();
            }
        };
        this.f63414o00Oo0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: o0ooOO0.OooOOO
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                Class<?> cls = AndroidComposeView.f63364o00000OO;
                AndroidComposeView this$0 = this.f112694OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                int i = z ? 1 : 2;
                C35031OooO0OO c35031OooO0OO = this$0.f63426o0ooOOo;
                c35031OooO0OO.getClass();
                c35031OooO0OO.f125769OooO00o.setValue(new C35029OooO00o(i));
            }
        };
        this.platformTextInputPluginRegistry = new C24061OooOoo0(new C21601OooO0oO());
        C24061OooOoo0 platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        o00000.OooO00o oooO00o2 = o00000.OooO00o.f81029OooO00o;
        platformTextInputPluginRegistry.getClass();
        C21210OooOo0o<InterfaceC24057OooOoO<?>, C24061OooOoo0.OooO0O0<?>> c21210OooOo0o = platformTextInputPluginRegistry.f81070OooO0O0;
        C24061OooOoo0.OooO0O0<?> oooO0O0 = c21210OooOo0o.get(oooO00o2);
        if (oooO0O0 == null) {
            C24061OooOoo0.OooO0O0<?> oooO0O02 = new C24061OooOoo0.OooO0O0<>(platformTextInputPluginRegistry, (InterfaceC24058OooOoO0) platformTextInputPluginRegistry.f81069OooO00o.invoke(oooO00o2, platformTextInputPluginRegistry.new OooO00o()));
            c21210OooOo0o.put(oooO00o2, oooO0O02);
            oooO0O0 = oooO0O02;
        }
        oooO0O0.f81074OooO0O0.setValue(Integer.valueOf(oooO0O0.OooO00o() + 1));
        new C24060OooOoo(oooO0O0);
        this.textInputService = ((OooO00o.C19597OooO00o) oooO0O0.f81073OooO00o).f81030OooO00o;
        this.f63419o00ooo = new C31540OoooO0O();
        this.f63428oo000o = C21105o000OoO.OooO0OO(C24090OooOO0o.OooO00o(context), o000OO.f61221OooO00o);
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.OooOOO0.OooO0o(configuration, "context.resources.configuration");
        int i = Build.VERSION.SDK_INT;
        this.f63418o00oO0o = i >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        kotlin.jvm.internal.OooOOO0.OooO0o(configuration2, "context.resources.configuration");
        C31534Oooo0o0.OooO00o oooO00o3 = C31534Oooo0o0.f112729OooO00o;
        int layoutDirection = configuration2.getLayoutDirection();
        EnumC24238OooOOO enumC24238OooOOO = EnumC24238OooOOO.f81494OooOo0o;
        if (layoutDirection != 0 && layoutDirection == 1) {
            enumC24238OooOOO = EnumC24238OooOOO.f81493OooOo;
        }
        this.f63417o00oO0O = C21105o000OoO.OooO0OO(enumC24238OooOOO, o000o0o02);
        this.f63425o0ooOO0 = new C29199OooO0O0(this);
        this.f63426o0ooOOo = new C35031OooO0OO(isInTouchMode() ? 1 : 2, new OooO0OO());
        this.modifierLocalManager = new C25576OooO0o0(this);
        this.f63422o0OOO0o = new C31541OoooOO0(this);
        this.f63429oo0o0Oo = new o000O0O0<>();
        this.f63420o0O0O00 = new Oooo.OooO0O0<>(new oO0O000o.OooO00o[16]);
        this.f63411o000OOo = new OooOO0();
        this.f63406o000000 = new RunnableC31513OooOOOO(this);
        this.f63408o000000o = new OooO();
        this.f63405o00000 = i >= 29 ? new C31550OooooOO() : new o00O0OoO.OooO0o();
        setWillNotDraw(false);
        setFocusable(true);
        C31532Oooo0OO.f112727OooO00o.OooO00o(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, oooO00o);
        getRoot().OooOO0(this);
        if (i >= 29) {
            Oooo0.f112722OooO00o.OooO00o(this);
        }
        this.f63409o00000O = new C21602OooO0oo();
    }

    public static void OooO00o(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).OooOOO0();
            } else if (childAt instanceof ViewGroup) {
                OooO00o((ViewGroup) childAt);
            }
        }
    }

    public static C32443OooOOO OooO0O0(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return new C32443OooOOO(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new C32443OooOOO(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new C32443OooOOO(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static View OooO0OO(int i, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            kotlin.jvm.internal.OooOOO0.OooO0o(childAt, "currentView.getChildAt(i)");
            View viewOooO0OO = OooO0OO(i, childAt);
            if (viewOooO0OO != null) {
                return viewOooO0OO;
            }
        }
        return null;
    }

    public static void OooO0o0(C25503OooOoOO c25503OooOoOO) {
        c25503OooOoOO.OooOo();
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo0 = c25503OooOoOO.OooOo0();
        int i = oooO0O0OooOo0.f59746OooOoO0;
        if (i > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo0.f59745OooOo0o;
            int i2 = 0;
            do {
                OooO0o0(c25503OooOoOOArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public static boolean OooO0oO(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (Float.isInfinite(x) || Float.isNaN(x)) {
            return true;
        }
        float y = motionEvent.getY();
        if (Float.isInfinite(y) || Float.isNaN(y)) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return Float.isInfinite(rawY) || Float.isNaN(rawY);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private void setFontFamilyResolver(AbstractC24088OooO0oO.OooO00o oooO00o) {
        this.f63428oo000o.setValue(oooO00o);
    }

    private void setLayoutDirection(EnumC24238OooOOO enumC24238OooOOO) {
        this.f63417o00oO0O.setValue(enumC24238OooOOO);
    }

    private final void setViewTreeOwners(OooO0O0 oooO0O0) {
        this.f63404Ooooooo.setValue(oooO0O0);
    }

    public final boolean OooO(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f63423o0Oo0oo) != null && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0Oo(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int actionMasked;
        float[] fArr = this.f63398OooooO0;
        removeCallbacks(this.f63411o000OOo);
        try {
            this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
            this.f63405o00000.OooO00o(this, fArr);
            C20901OooOOo0.OooO0O0(fArr, this.f63399OooooOO);
            long jOooO0OO = C21355Ooooooo.OooO0OO(fArr, C21289OooO0o.OooO00o(motionEvent.getX(), motionEvent.getY()));
            this.f63401Oooooo = C21289OooO0o.OooO00o(motionEvent.getRawX() - C21290OooO0o0.OooO0OO(jOooO0OO), motionEvent.getRawY() - C21290OooO0o0.OooO0Oo(jOooO0OO));
            boolean z = true;
            this.f63402Oooooo0 = true;
            OooOO0O(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f63423o0Oo0oo;
                boolean z2 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                if (motionEvent3 == null) {
                    motionEvent2 = motionEvent3;
                } else {
                    if ((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            this.f63384Oooo0oO.OooO0O0();
                        } else if (motionEvent3.getActionMasked() != 10 && z2) {
                            OooOoO0(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked2 != 3 && actionMasked2 != 9 && OooO0oo(motionEvent)) {
                    OooOoO0(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f63423o0Oo0oo = MotionEvent.obtainNoHistory(motionEvent);
                int iOooOo = OooOo(motionEvent);
                Trace.endSection();
                C31531Oooo0O0.f112726OooO00o.OooO00o(this, null);
                return iOooOo;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.f63402Oooooo0 = false;
        }
    }

    public final void OooO0o(C25503OooOoOO c25503OooOoOO) {
        int i = 0;
        this.f63394OoooOoO.OooOO0O(c25503OooOoOO, false);
        Oooo.OooO0O0<C25503OooOoOO> oooO0O0OooOo0 = c25503OooOoOO.OooOo0();
        int i2 = oooO0O0OooOo0.f59746OooOoO0;
        if (i2 > 0) {
            C25503OooOoOO[] c25503OooOoOOArr = oooO0O0OooOo0.f59745OooOo0o;
            do {
                OooO0o(c25503OooOoOOArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public final boolean OooO0oo(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final long OooOO0(long j) {
        OooOOo();
        long jOooO0OO = C21355Ooooooo.OooO0OO(this.f63398OooooO0, j);
        return C21289OooO0o.OooO00o(C21290OooO0o0.OooO0OO(this.f63401Oooooo) + C21290OooO0o0.OooO0OO(jOooO0OO), C21290OooO0o0.OooO0Oo(this.f63401Oooooo) + C21290OooO0o0.OooO0Oo(jOooO0OO));
    }

    public final void OooOO0O(boolean z) {
        OooO oooO;
        C25517Oooo0o c25517Oooo0o = this.f63394OoooOoO;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                oooO = this.f63408o000000o;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            oooO = null;
        }
        if (c25517Oooo0o.OooO0Oo(oooO)) {
            requestLayout();
        }
        c25517Oooo0o.OooO00o(false);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        Trace.endSection();
    }

    public final void OooOO0o(InterfaceC25540Oooooo interfaceC25540Oooooo, boolean z) {
        ArrayList arrayList = this.f63380Oooo0O0;
        if (!z) {
            if (this.f63383Oooo0o0) {
                return;
            }
            arrayList.remove(interfaceC25540Oooooo);
            ArrayList arrayList2 = this.f63381Oooo0OO;
            if (arrayList2 != null) {
                arrayList2.remove(interfaceC25540Oooooo);
                return;
            }
            return;
        }
        if (!this.f63383Oooo0o0) {
            arrayList.add(interfaceC25540Oooooo);
            return;
        }
        ArrayList arrayList3 = this.f63381Oooo0OO;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f63381Oooo0OO = arrayList3;
        }
        arrayList3.add(interfaceC25540Oooooo);
    }

    public final void OooOOO(C25503OooOoOO layoutNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        androidx.compose.p002ui.platform.OooO00o oooO00o = this.f63379Oooo00o;
        oooO00o.getClass();
        oooO00o.f63465OooOOOo = true;
        if (oooO00o.OooOO0()) {
            oooO00o.OooOO0O(layoutNode);
        }
    }

    public final void OooOOO0() {
        if (this.f63388OoooO00) {
            C21212OooOoO0 c21212OooOoO0 = getSnapshotObserver().f87129OooO00o;
            C25549ooOO c25549ooOO = C25549ooOO.f87136OooOo0o;
            synchronized (c21212OooOoO0.f61533OooO0o) {
                try {
                    Oooo.OooO0O0<C21212OooOoO0.OooO00o> oooO0O0 = c21212OooOoO0.f61533OooO0o;
                    int i = oooO0O0.f59746OooOoO0;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C21212OooOoO0.OooO00o oooO00o = oooO0O0.f59745OooOo0o[i3];
                        oooO00o.OooO0o0(c25549ooOO);
                        if (oooO00o.f61542OooO0o.f58535OooO0o0 == 0) {
                            i2++;
                        } else if (i2 > 0) {
                            C21212OooOoO0.OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
                            oooO00oArr[i3 - i2] = oooO00oArr[i3];
                        }
                    }
                    int i4 = i - i2;
                    Arrays.fill(oooO0O0.f59745OooOo0o, i4, i, (Object) null);
                    oooO0O0.f59746OooOoO0 = i4;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f63388OoooO00 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f63412o000oOoO;
        if (androidViewsHandler != null) {
            OooO00o(androidViewsHandler);
        }
        while (this.f63420o0O0O00.OooOO0()) {
            int i5 = this.f63420o0O0O00.f59746OooOoO0;
            for (int i6 = 0; i6 < i5; i6++) {
                oO0O000o.OooO00o<C32460OooOooO>[] oooO00oArr2 = this.f63420o0O0O00.f59745OooOo0o;
                oO0O000o.OooO00o<C32460OooOooO> oooO00o2 = oooO00oArr2[i6];
                oooO00oArr2[i6] = null;
                if (oooO00o2 != null) {
                    oooO00o2.invoke();
                }
            }
            this.f63420o0O0O00.OooOOO0(0, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOOO(C25503OooOoOO layoutNode, boolean z, boolean z2) {
        boolean z3;
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        C25517Oooo0o c25517Oooo0o = this.f63394OoooOoO;
        if (!z) {
            if (c25517Oooo0o.OooOO0(layoutNode, z2)) {
                OooOo0O(null);
                return;
            }
            return;
        }
        c25517Oooo0o.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutNode, "layoutNode");
        C25511OooOooo c25511OooOooo = layoutNode.f86962OoooOOO;
        int iOrdinal = c25511OooOooo.f86987OooO0O0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new C32442OooOO0o();
                        }
                        if (c25511OooOooo.f86990OooO0o) {
                            c25511OooOooo.f86990OooO0o = true;
                            c25511OooOooo.f86989OooO0Oo = true;
                            c25511OooOooo.f86991OooO0o0 = true;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(layoutNode.OooOoOO(), Boolean.TRUE)) {
                            }
                            if (c25517Oooo0o.f87027OooO0OO) {
                            }
                        }
                    }
                }
            }
        } else if (c25511OooOooo.f86990OooO0o || z2) {
            c25511OooOooo.f86990OooO0o = true;
            c25511OooOooo.f86989OooO0Oo = true;
            c25511OooOooo.f86991OooO0o0 = true;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(layoutNode.OooOoOO(), Boolean.TRUE)) {
                C25503OooOoOO c25503OooOoOOOooOOoo = layoutNode.OooOOoo();
                if (c25503OooOoOOOooOOoo != null) {
                    c25503OooOoOOOooOOoo.f86962OoooOOO.getClass();
                }
                if (c25503OooOoOOOooOOoo == null || !c25503OooOoOOOooOOoo.f86962OoooOOO.f86990OooO0o) {
                    c25517Oooo0o.f87026OooO0O0.OooO0OO(layoutNode);
                }
            }
            z3 = c25517Oooo0o.f87027OooO0OO ? false : true;
        }
        if (z3) {
            OooOo0O(null);
        }
    }

    public final void OooOOOo() {
        androidx.compose.p002ui.platform.OooO00o oooO00o = this.f63379Oooo00o;
        oooO00o.f63465OooOOOo = true;
        if (!oooO00o.OooOO0() || oooO00o.f63474OooOoO) {
            return;
        }
        oooO00o.f63474OooOoO = true;
        oooO00o.f63457OooO0oO.post(oooO00o.f63476OooOoOO);
    }

    public final void OooOOo() {
        if (this.f63402Oooooo0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            InterfaceC31549OooooO0 interfaceC31549OooooO0 = this.f63405o00000;
            float[] fArr = this.f63398OooooO0;
            interfaceC31549OooooO0.OooO00o(this, fArr);
            C20901OooOOo0.OooO0O0(fArr, this.f63399OooooOO);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f63397Ooooo0o;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f63401Oooooo = C21289OooO0o.OooO00o(f - iArr[0], f2 - iArr[1]);
        }
    }

    @Override // androidx.lifecycle.OooO0o
    public final void OooOOoo(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        setShowLayoutBounds(OooO00o.OooO00o());
    }

    public final int OooOo(MotionEvent motionEvent) {
        Object objPrevious;
        if (this.f63410o00000O0) {
            this.f63410o00000O0 = false;
            int metaState = motionEvent.getMetaState();
            this.f63372OooOoo0.getClass();
            C31587o000O0oO.f112857OooO0O0.setValue(new C25090OooOoOO(metaState));
        }
        C25079OooO0oo c25079OooO0oo = this.f63382Oooo0o;
        C25086OooOo0O c25086OooOo0OOooO00o = c25079OooO0oo.OooO00o(motionEvent, this);
        OooOo oooOo = this.f63384Oooo0oO;
        if (c25086OooOo0OOooO00o == null) {
            oooOo.OooO0O0();
            return 0;
        }
        ArrayList arrayList = (ArrayList) c25086OooOo0OOooO00o.f85155OooO00o;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C25087OooOo0o) objPrevious).f85163OooO0o0) {
                break;
            }
        }
        C25087OooOo0o c25087OooOo0o = (C25087OooOo0o) objPrevious;
        if (c25087OooOo0o != null) {
            this.f63367OooOo0o = c25087OooOo0o.f85161OooO0Oo;
        }
        int iOooO00o = oooOo.OooO00o(c25086OooOo0OOooO00o, this, OooO0oo(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iOooO00o & 1) != 0) {
            return iOooO00o;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c25079OooO0oo.f85112OooO0OO.delete(pointerId);
        c25079OooO0oo.f85111OooO0O0.delete(pointerId);
        return iOooO00o;
    }

    public final void OooOo0(oO0O000o.OooO00o<C32460OooOooO> listener) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "listener");
        Oooo.OooO0O0<oO0O000o.OooO00o<C32460OooOooO>> oooO0O0 = this.f63420o0O0O00;
        if (oooO0O0.OooO0oO(listener)) {
            return;
        }
        oooO0O0.OooO0O0(listener);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooOo00(InterfaceC25540Oooooo interfaceC25540Oooooo) {
        o000O0O0<InterfaceC25540Oooooo> o000o0o02;
        Object objPoll;
        Oooo.OooO0O0<Reference<T>> oooO0O0;
        if (this.f63391OoooOOO != null) {
            ViewLayer.OooO0O0 oooO0O02 = ViewLayer.f63521Oooo0OO;
        }
        do {
            o000o0o02 = this.f63429oo0o0Oo;
            objPoll = o000o0o02.f112855OooO0O0.poll();
            oooO0O0 = o000o0o02.f112854OooO00o;
            if (objPoll != null) {
                oooO0O0.OooOO0O((Reference<T>) objPoll);
            }
        } while (objPoll != null);
        oooO0O0.OooO0O0(new WeakReference(interfaceC25540Oooooo, o000o0o02.f112855OooO0O0));
    }

    public final void OooOo0O(C25503OooOoOO c25503OooOoOO) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c25503OooOoOO != null) {
            while (c25503OooOoOO != null && c25503OooOoOO.f86959OoooO00 == C25503OooOoOO.OooO0o.f86977OooOo0o) {
                if (!this.f63393OoooOo0) {
                    C25503OooOoOO c25503OooOoOOOooOOoo = c25503OooOoOO.OooOOoo();
                    if (c25503OooOoOOOooOOoo == null) {
                        break;
                    }
                    long j = c25503OooOoOOOooOOoo.f86970o000oOoO.f87084OooO0O0.f124846OooOoO;
                    if (C24227OooO00o.OooO0o(j) && C24227OooO00o.OooO0o0(j)) {
                        break;
                    }
                }
                c25503OooOoOO = c25503OooOoOO.OooOOoo();
            }
            if (c25503OooOoOO == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long OooOo0o(long j) {
        OooOOo();
        return C21355Ooooooo.OooO0OO(this.f63399OooooOO, C21289OooO0o.OooO00o(C21290OooO0o0.OooO0OO(j) - C21290OooO0o0.OooO0OO(this.f63401Oooooo), C21290OooO0o0.OooO0Oo(j) - C21290OooO0o0.OooO0Oo(this.f63401Oooooo)));
    }

    public final void OooOoO() {
        int[] iArr = this.f63397Ooooo0o;
        getLocationOnScreen(iArr);
        long j = this.f63396Ooooo00;
        int i = C24226OooO.f81469OooO0OO;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        boolean z = false;
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1]) {
            this.f63396Ooooo00 = C24235OooOO0.OooO00o(i4, iArr[1]);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                getRoot().f86962OoooOOO.f86993OooO0oo.o00000();
                z = true;
            }
        }
        this.f63394OoooOoO.OooO00o(z);
    }

    public final void OooOoO0(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jOooOO0 = OooOO0(C21289OooO0o.OooO00o(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C21290OooO0o0.OooO0OO(jOooOO0);
            pointerCoords.y = C21290OooO0o0.OooO0Oo(jOooOO0);
            i4++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        kotlin.jvm.internal.OooOOO0.OooO0o(event, "event");
        C25086OooOo0O c25086OooOo0OOooO00o = this.f63382Oooo0o.OooO00o(event, this);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c25086OooOo0OOooO00o);
        this.f63384Oooo0oO.OooO00o(c25086OooOo0OOooO00o, this, true);
        event.recycle();
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> values) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        C21237OooO00o c21237OooO00o = this.f63375Oooo;
        if (c21237OooO00o != null) {
            int size = values.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = values.keyAt(i);
                AutofillValue value = values.get(iKeyAt);
                C21240OooO0Oo c21240OooO0Oo = C21240OooO0Oo.f61622OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0o(value, "value");
                if (c21240OooO0Oo.OooO0Oo(value)) {
                    String value2 = c21240OooO0Oo.OooO(value).toString();
                    C21243OooO0oO c21243OooO0oO = c21237OooO00o.f61619OooO0O0;
                    c21243OooO0oO.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(value2, "value");
                } else {
                    if (c21240OooO0Oo.OooO0O0(value)) {
                        throw new C32444OooOOO0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (c21240OooO0Oo.OooO0OO(value)) {
                        throw new C32444OooOOO0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (c21240OooO0Oo.OooO0o0(value)) {
                        throw new C32444OooOOO0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f63379Oooo00o.OooO0OO(i, this.f63367OooOo0o, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f63379Oooo00o.OooO0OO(i, this.f63367OooOo0o, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        if (!isAttachedToWindow()) {
            OooO0o0(getRoot());
        }
        OooOO0O(true);
        this.f63383Oooo0o0 = true;
        C21343OoooOOo c21343OoooOOo = this.f63373OooOooO;
        C21325OooOooo c21325OooOooo = c21343OoooOOo.f61756OooO00o;
        Canvas canvas2 = c21325OooOooo.f61733OooO00o;
        c21325OooOooo.f61733OooO00o = canvas;
        C25503OooOoOO root = getRoot();
        C21325OooOooo c21325OooOooo2 = c21343OoooOOo.f61756OooO00o;
        root.OooOOOo(c21325OooOooo2);
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas2, "<set-?>");
        c21325OooOooo2.f61733OooO00o = canvas2;
        ArrayList arrayList = this.f63380Oooo0O0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC25540Oooooo) arrayList.get(i)).OooO();
            }
        }
        if (ViewLayer.f63520Oooo) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f63383Oooo0o0 = false;
        ArrayList arrayList2 = this.f63381Oooo0OO;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (!event.isFromSource(4194304)) {
            return (OooO0oO(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : (OooO0Oo(event) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -event.getAxisValue(26);
        return getFocusOwner().OooO0o(new C25796OooO0OO(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f, ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()) * f, event.getEventTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent event) {
        int iOooOOOO;
        int i;
        C25503OooOoOO c25503OooOoOOOooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        boolean z = this.f63407o000000O;
        RunnableC31513OooOOOO runnableC31513OooOOOO = this.f63406o000000;
        if (z) {
            removeCallbacks(runnableC31513OooOOOO);
            runnableC31513OooOOOO.run();
        }
        boolean z2 = false;
        if (!OooO0oO(event) && isAttachedToWindow()) {
            if (event.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN) && event.getToolType(0) == 1) {
                androidx.compose.p002ui.platform.OooO00o oooO00o = this.f63379Oooo00o;
                oooO00o.getClass();
                AccessibilityManager accessibilityManager = oooO00o.f63453OooO0OO;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    int action = event.getAction();
                    AndroidComposeView androidComposeView = oooO00o.f63451OooO00o;
                    if (action == 7 || action == 9) {
                        float x = event.getX();
                        float y = event.getY();
                        androidComposeView.OooOO0O(true);
                        C25496OooOOo0 c25496OooOOo0 = new C25496OooOOo0();
                        C25503OooOoOO root = androidComposeView.getRoot();
                        long jOooO00o = C21289OooO0o.OooO00o(x, y);
                        C25503OooOoOO.OooO0OO oooO0OO = C25503OooOoOO.f86933OooooOO;
                        root.getClass();
                        C25527OoooO00 c25527OoooO00 = root.f86970o000oOoO;
                        c25527OoooO00.f87085OooO0OO.o0000OoO(AbstractC25521OoooO.f87049OoooOoo, c25527OoooO00.f87085OooO0OO.o0000OOO(jOooO00o), c25496OooOOo0, true, true);
                        o0Oo0oo o0oo0oo2 = (o0Oo0oo) oOo000Oo.OooOo.OoooOo0(c25496OooOOo0);
                        o0Oo0oo o0oo0ooOooO0o = (o0oo0oo2 == null || (c25503OooOoOOOooO0o0 = o00oO0O.OooO.OooO0o0(o0oo0oo2)) == null) ? null : C28395OooOOo0.OooO0o(c25503OooOoOOOooO0o0);
                        if (o0oo0ooOooO0o == null) {
                            iOooOOOO = Integer.MIN_VALUE;
                            boolean zDispatchGenericMotionEvent = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                            i = oooO00o.f63452OooO0O0;
                            if (i != iOooOOOO) {
                                oooO00o.f63452OooO0O0 = iOooOOOO;
                                androidx.compose.p002ui.platform.OooO00o.OooOOo(oooO00o, iOooOOOO, 128, null, 12);
                                androidx.compose.p002ui.platform.OooO00o.OooOOo(oooO00o, i, 256, null, 12);
                            }
                            if (iOooOOOO != Integer.MIN_VALUE) {
                                return zDispatchGenericMotionEvent;
                            }
                        } else {
                            C28393OooOOOo c28393OooOOOo = new C28393OooOOOo(o0oo0ooOooO0o, false, o00oO0O.OooO.OooO0o0(o0oo0ooOooO0o));
                            AbstractC25521OoooO abstractC25521OoooOOooO0O0 = c28393OooOOOo.OooO0O0();
                            if (!(abstractC25521OoooOOooO0O0 != null ? abstractC25521OoooOOooO0O0.o0000o0o() : false)) {
                                if (!c28393OooOOOo.f100654OooO0o.OooO0Oo(C28396OooOOoo.f100674OooOOO0)) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                C25503OooOoOO c25503OooOoOOOooO0o02 = o00oO0O.OooO.OooO0o0(o0oo0ooOooO0o);
                                if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c25503OooOoOOOooO0o02) == null) {
                                    iOooOOOO = oooO00o.OooOOOO(c25503OooOoOOOooO0o02.f86937OooOo);
                                }
                                boolean zDispatchGenericMotionEvent2 = androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                                i = oooO00o.f63452OooO0O0;
                                if (i != iOooOOOO) {
                                }
                                if (iOooOOOO != Integer.MIN_VALUE) {
                                }
                            }
                        }
                    } else if (action == 10) {
                        int i2 = oooO00o.f63452OooO0O0;
                        if (i2 == Integer.MIN_VALUE) {
                            return androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                        }
                        if (i2 != Integer.MIN_VALUE) {
                            oooO00o.f63452OooO0O0 = Integer.MIN_VALUE;
                            androidx.compose.p002ui.platform.OooO00o.OooOOo(oooO00o, Integer.MIN_VALUE, 128, null, 12);
                            androidx.compose.p002ui.platform.OooO00o.OooOOo(oooO00o, i2, 256, null, 12);
                            return true;
                        }
                    }
                    return true;
                }
            } else {
                int actionMasked = event.getActionMasked();
                if (actionMasked != 7) {
                    if (actionMasked == 10 && OooO0oo(event)) {
                        if (event.getToolType(0) != 3) {
                            MotionEvent motionEvent = this.f63423o0Oo0oo;
                            if (motionEvent != null) {
                                motionEvent.recycle();
                            }
                            this.f63423o0Oo0oo = MotionEvent.obtainNoHistory(event);
                            this.f63407o000000O = true;
                            post(runnableC31513OooOOOO);
                            return false;
                        }
                        if (event.getButtonState() == 0) {
                            if ((OooO0Oo(event) & 1) != 0) {
                                return true;
                            }
                        }
                    }
                } else if (OooO(event)) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        int metaState = event.getMetaState();
        this.f63372OooOoo0.getClass();
        C31587o000O0oO.f112857OooO0O0.setValue(new C25090OooOoOO(metaState));
        return getFocusOwner().OooO0oo(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(motionEvent, "motionEvent");
        if (this.f63407o000000O) {
            RunnableC31513OooOOOO runnableC31513OooOOOO = this.f63406o000000;
            removeCallbacks(runnableC31513OooOOOO);
            MotionEvent motionEvent2 = this.f63423o0Oo0oo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f63407o000000O = false;
            } else {
                runnableC31513OooOOOO.run();
            }
        }
        if (!OooO0oO(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || OooO(motionEvent))) {
            int iOooO0Oo = OooO0Oo(motionEvent);
            if ((iOooO0Oo & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iOooO0Oo & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return OooO0OO(accessibilityId, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f63412o000oOoO == null) {
            Context context = getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.f63412o000oOoO = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.f63412o000oOoO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC21238OooO0O0 getAutofill() {
        return this.f63375Oooo;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C21243OooO0oO getAutofillTree() {
        return this.autofillTree;
    }

    public final InterfaceC32507OooOO0o<Configuration, C32460OooOooO> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC24229OooO0OO getDensity() {
        return this.f63368OooOoO;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC21263OooOO0O getFocusOwner() {
        return this.f63370OooOoOO;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C32460OooOooO c32460OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(rect, "rect");
        C21291OooO0oO c21291OooO0oOOooOO0O = getFocusOwner().OooOO0O();
        if (c21291OooO0oOOooOO0O != null) {
            rect.left = oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooOO0O.f61724OooO00o);
            rect.top = oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooOO0O.f61725OooO0O0);
            rect.right = oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooOO0O.f61726OooO0OO);
            rect.bottom = oO0O00O.OooO00o.OooO0O0(c21291OooO0oOOooOO0O.f61727OooO0Oo);
            c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } else {
            c32460OooOooO = null;
        }
        if (c32460OooOooO == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public AbstractC24088OooO0oO.OooO00o getFontFamilyResolver() {
        return (AbstractC24088OooO0oO.OooO00o) this.f63428oo000o.getValue();
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public OooO0o.OooO00o getFontLoader() {
        return this.f63419o00ooo;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC29198OooO00o getHapticFeedBack() {
        return this.f63425o0ooOO0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !((oo0o0Oo) this.f63394OoooOoO.f87026OooO0O0.f86896OooO0OO).isEmpty();
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC35030OooO0O0 getInputModeManager() {
        return this.f63426o0ooOOo;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, o00oO0O.InterfaceC25542OoooooO
    public EnumC24238OooOOO getLayoutDirection() {
        return (EnumC24238OooOOO) this.f63417o00oO0O.getValue();
    }

    public long getMeasureIteration() {
        C25517Oooo0o c25517Oooo0o = this.f63394OoooOoO;
        if (c25517Oooo0o.f87027OooO0OO) {
            return c25517Oooo0o.f87029OooO0o;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C25576OooO0o0 getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC25082OooOOo getPointerIconService() {
        return this.f63409o00000O;
    }

    public C25503OooOoOO getRoot() {
        return this.root;
    }

    public o0OOO0o getRootForTest() {
        return this.f63377Oooo000;
    }

    public C28394OooOOo getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C25508OooOoo getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C25545o00oO0o getSnapshotObserver() {
        return this.snapshotObserver;
    }

    public InterfaceC24068Oooo0OO getTextInputForTests() {
        C24061OooOoo0 platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        C24061OooOoo0.OooO0O0<?> oooO0O0 = platformTextInputPluginRegistry.f81070OooO0O0.get(platformTextInputPluginRegistry.f81071OooO0OO);
        InterfaceC24058OooOoO0 interfaceC24058OooOoO0 = oooO0O0 != null ? oooO0O0.f81073OooO00o : null;
        if (interfaceC24058OooOoO0 != null) {
            return interfaceC24058OooOoO0.OooO00o();
        }
        return null;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C24070Oooo0o0 getTextInputService() {
        return this.textInputService;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC31574o0000o getTextToolbar() {
        return this.f63422o0OOO0o;
    }

    public View getView() {
        return this;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public o000O0O getViewConfiguration() {
        return this.f63395OoooOoo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooO0O0 getViewTreeOwners() {
        return (OooO0O0) this.f63404Ooooooo.getValue();
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public InterfaceC31586o000O0o0 getWindowInfo() {
        return this.f63372OooOoo0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC21979OooOOo0 lifecycle;
        InterfaceC21987OooOoo interfaceC21987OooOoo;
        super.onAttachedToWindow();
        OooO0o(getRoot());
        OooO0o0(getRoot());
        C21212OooOoO0 c21212OooOoO0 = getSnapshotObserver().f87129OooO00o;
        C21211OooOoO c21211OooOoO = c21212OooOoO0.f61532OooO0Oo;
        C21200OooOOO0.OooO0o(C21200OooOOO0.f61494OooO00o);
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            C21200OooOOO0.f61501OooO0oo = oOo000Oo.OooOo.OooooOo((Collection) C21200OooOOO0.f61501OooO0oo, c21211OooOoO);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        c21212OooOoO0.f61535OooO0oO = new C21192OooO0o(c21211OooOoO);
        C21237OooO00o c21237OooO00o = this.f63375Oooo;
        if (c21237OooO00o != null) {
            C21242OooO0o0.f61623OooO00o.OooO00o(c21237OooO00o);
        }
        InterfaceC21987OooOoo interfaceC21987OooOooOooO00o = oo000o.OooO00o(this);
        InterfaceC24753OooO0o0 interfaceC24753OooO0o0 = (InterfaceC24753OooO0o0) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOo00(C33574OooOOO0.OooO(this, o000ooo0.OooO0o.f83959OooOo0o), C24754OooO0oO.f83960OooOo0o));
        OooO0O0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC21987OooOooOooO00o != null && interfaceC24753OooO0o0 != null && (interfaceC21987OooOooOooO00o != (interfaceC21987OooOoo = viewTreeOwners.f63432OooO00o) || interfaceC24753OooO0o0 != interfaceC21987OooOoo))) {
            if (interfaceC21987OooOooOooO00o == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC24753OooO0o0 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f63432OooO00o.getLifecycle()) != null) {
                lifecycle.OooO0OO(this);
            }
            interfaceC21987OooOooOooO00o.getLifecycle().OooO00o(this);
            OooO0O0 oooO0O0 = new OooO0O0(interfaceC21987OooOooOooO00o, interfaceC24753OooO0o0);
            setViewTreeOwners(oooO0O0);
            InterfaceC32507OooOO0o<? super OooO0O0, C32460OooOooO> interfaceC32507OooOO0o = this.f63424o0OoOo0;
            if (interfaceC32507OooOO0o != null) {
                interfaceC32507OooOO0o.invoke(oooO0O0);
            }
            this.f63424o0OoOo0 = null;
        }
        int i = isInTouchMode() ? 1 : 2;
        C35031OooO0OO c35031OooO0OO = this.f63426o0ooOOo;
        c35031OooO0OO.getClass();
        c35031OooO0OO.f125769OooO00o.setValue(new C35029OooO00o(i));
        OooO0O0 viewTreeOwners2 = getViewTreeOwners();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewTreeOwners2);
        viewTreeOwners2.f63432OooO00o.getLifecycle().OooO00o(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f63430ooOO);
        getViewTreeObserver().addOnScrollChangedListener(this.f63413o00O0O);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f63414o00Oo0);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C24061OooOoo0 platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        C24061OooOoo0.OooO0O0<?> oooO0O0 = platformTextInputPluginRegistry.f81070OooO0O0.get(platformTextInputPluginRegistry.f81071OooO0OO);
        return (oooO0O0 != null ? oooO0O0.f81073OooO00o : null) != null;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "context");
        this.f63368OooOoO = OooO0O0.OooO0O0.OooO00o(context);
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? newConfig.fontWeightAdjustment : 0) != this.f63418o00oO0o) {
            this.f63418o00oO0o = i >= 31 ? newConfig.fontWeightAdjustment : 0;
            Context context2 = getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context2, "context");
            setFontFamilyResolver(C24090OooOO0o.OooO00o(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outAttrs, "outAttrs");
        C24061OooOoo0 platformTextInputPluginRegistry = getPlatformTextInputPluginRegistry();
        C24061OooOoo0.OooO0O0<?> oooO0O0 = platformTextInputPluginRegistry.f81070OooO0O0.get(platformTextInputPluginRegistry.f81071OooO0OO);
        InterfaceC24058OooOoO0 interfaceC24058OooOoO0 = oooO0O0 != null ? oooO0O0.f81073OooO00o : null;
        if (interfaceC24058OooOoO0 != null) {
            return interfaceC24058OooOoO0.OooO0O0(outAttrs);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC21979OooOOo0 lifecycle;
        super.onDetachedFromWindow();
        C21212OooOoO0 c21212OooOoO0 = getSnapshotObserver().f87129OooO00o;
        C21192OooO0o c21192OooO0o = c21212OooOoO0.f61535OooO0oO;
        if (c21192OooO0o != null) {
            c21192OooO0o.OooO0O0();
        }
        synchronized (c21212OooOoO0.f61533OooO0o) {
            try {
                Oooo.OooO0O0<C21212OooOoO0.OooO00o> oooO0O0 = c21212OooOoO0.f61533OooO0o;
                int i = oooO0O0.f59746OooOoO0;
                if (i > 0) {
                    C21212OooOoO0.OooO00o[] oooO00oArr = oooO0O0.f59745OooOo0o;
                    int i2 = 0;
                    do {
                        C21212OooOoO0.OooO00o oooO00o = oooO00oArr[i2];
                        ((OooOo.OooOo) oooO00o.f61543OooO0o0.f59765OooO00o).OooO0OO();
                        oooO00o.f61542OooO0o.OooO0OO();
                        ((OooOo.OooOo) oooO00o.f61547OooOO0O.f59765OooO00o).OooO0OO();
                        oooO00o.f61548OooOO0o.clear();
                        i2++;
                    } while (i2 < i);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        OooO0O0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f63432OooO00o.getLifecycle()) != null) {
            lifecycle.OooO0OO(this);
        }
        C21237OooO00o c21237OooO00o = this.f63375Oooo;
        if (c21237OooO00o != null) {
            C21242OooO0o0.f61623OooO00o.OooO0O0(c21237OooO00o);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f63430ooOO);
        getViewTreeObserver().removeOnScrollChangedListener(this.f63413o00O0O);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f63414o00Oo0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        if (z) {
            getFocusOwner().OooO0OO();
        } else {
            getFocusOwner().OooOO0o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f63394OoooOoO.OooO0Oo(this.f63408o000000o);
        this.f63392OoooOOo = null;
        OooOoO();
        if (this.f63412o000oOoO != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C25517Oooo0o c25517Oooo0o = this.f63394OoooOoO;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                OooO0o(getRoot());
            }
            C32443OooOOO c32443OooOOOOooO0O0 = OooO0O0(i);
            int iIntValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue();
            int iIntValue2 = ((Number) c32443OooOOOOooO0O0.f116637OooOo).intValue();
            C32443OooOOO c32443OooOOOOooO0O02 = OooO0O0(i2);
            long jOooO00o = C24228OooO0O0.OooO00o(iIntValue, iIntValue2, ((Number) c32443OooOOOOooO0O02.f116638OooOo0o).intValue(), ((Number) c32443OooOOOOooO0O02.f116637OooOo).intValue());
            C24227OooO00o c24227OooO00o = this.f63392OoooOOo;
            if (c24227OooO00o == null) {
                this.f63392OoooOOo = new C24227OooO00o(jOooO00o);
                this.f63393OoooOo0 = false;
            } else if (!C24227OooO00o.OooO0O0(c24227OooO00o.f81474OooO00o, jOooO00o)) {
                this.f63393OoooOo0 = true;
            }
            c25517Oooo0o.OooOO0o(jOooO00o);
            c25517Oooo0o.OooO0o0();
            setMeasuredDimension(getRoot().f86962OoooOOO.f86993OooO0oo.f124845OooOo0o, getRoot().f86962OoooOOO.f86993OooO0oo.f124844OooOo);
            if (this.f63412o000oOoO != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f86962OoooOOO.f86993OooO0oo.f124845OooOo0o, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f86962OoooOOO.f86993OooO0oo.f124844OooOo, 1073741824));
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C21237OooO00o c21237OooO00o;
        if (viewStructure == null || (c21237OooO00o = this.f63375Oooo) == null) {
            return;
        }
        C21239OooO0OO c21239OooO0OO = C21239OooO0OO.f61621OooO00o;
        C21243OooO0oO c21243OooO0oO = c21237OooO00o.f61619OooO0O0;
        int iOooO00o = c21239OooO0OO.OooO00o(viewStructure, c21243OooO0oO.f61624OooO00o.size());
        Iterator it = c21243OooO0oO.f61624OooO00o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            C21241OooO0o c21241OooO0o = (C21241OooO0o) entry.getValue();
            Iterator it2 = it;
            ViewStructure viewStructureOooO0O0 = c21239OooO0OO.OooO0O0(viewStructure, iOooO00o);
            if (viewStructureOooO0O0 != null) {
                C21240OooO0Oo c21240OooO0Oo = C21240OooO0Oo.f61622OooO00o;
                AutofillId autofillIdOooO00o = c21240OooO0Oo.OooO00o(viewStructure);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(autofillIdOooO00o);
                c21240OooO0Oo.OooO0oO(viewStructureOooO0O0, autofillIdOooO00o, iIntValue);
                c21239OooO0OO.OooO0Oo(viewStructureOooO0O0, iIntValue, c21237OooO00o.f61618OooO00o.getContext().getPackageName(), null, null);
                c21240OooO0Oo.OooO0oo(viewStructureOooO0O0, 1);
                c21241OooO0o.getClass();
                throw null;
            }
            iOooO00o++;
            it = it2;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f63366OooOo) {
            C31534Oooo0o0.OooO00o oooO00o = C31534Oooo0o0.f112729OooO00o;
            EnumC24238OooOOO enumC24238OooOOO = EnumC24238OooOOO.f81494OooOo0o;
            if (i != 0 && i == 1) {
                enumC24238OooOOO = EnumC24238OooOOO.f81493OooOo;
            }
            setLayoutDirection(enumC24238OooOOO);
            getFocusOwner().OooO00o(enumC24238OooOOO);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zOooO00o;
        this.f63372OooOoo0.f112858OooO00o.setValue(Boolean.valueOf(z));
        this.f63410o00000O0 = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (zOooO00o = OooO00o.OooO00o())) {
            return;
        }
        setShowLayoutBounds(zOooO00o);
        OooO0o0(getRoot());
    }

    public final void setConfigurationChangeObserver(InterfaceC32507OooOO0o<? super Configuration, C32460OooOooO> interfaceC32507OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32507OooOO0o, "<set-?>");
        this.configurationChangeObserver = interfaceC32507OooOO0o;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC32507OooOO0o<? super OooO0O0, C32460OooOooO> callback) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
        OooO0O0 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f63424o0OoOo0 = callback;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C31499OooO getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C31508OooOO0 getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // o00oO0O.InterfaceC25542OoooooO
    public C24061OooOoo0 getPlatformTextInputPluginRegistry() {
        return this.platformTextInputPluginRegistry;
    }
}
