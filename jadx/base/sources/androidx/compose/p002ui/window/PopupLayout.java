package androidx.compose.p002ui.window;

import Oooo0oO.AbstractC21043OooOoO;
import Oooo0oO.C21035OooOOo;
import Oooo0oO.C21059Oooo0oo;
import Oooo0oO.C21064OoooOO0;
import Oooo0oO.C21081o00000o0;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000OO;
import Oooo0oO.o000O0O0;
import OooooO0.C21290OooO0o0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.lifecycle.C22022o00oO0o;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00oO0O;
import androidx.lifecycle.oo000o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00000oo.C24122OooO00o;
import o00000oo.C24132OooOOo0;
import o00000oo.C24133OooOOoo;
import o00000oo.C24136OooOo0o;
import o00000oo.C24137OooOoO;
import o00000oo.EnumC24139OooOoOO;
import o00000oo.InterfaceC24134OooOo0;
import o00000oo.InterfaceC24138OooOoO0;
import o00000oo.OooOo;
import o00000oo.OooOo00;
import o0000Ooo.C24226OooO;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.C24236OooOO0O;
import o0000Ooo.C24237OooOO0o;
import o0000Ooo.C24239OooOOO0;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000O0oo.C24442Oooo00o;
import o000oOoO.C24633OooO00o;
import o000ooo0.C24754OooO0oO;
import o000ooo0.InterfaceC24753OooO0o0;
import o000ooo0.OooO0o;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010!\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R8\u0010:\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001028F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R/\u0010A\u001a\u0004\u0018\u00010;2\b\u00103\u001a\u0004\u0018\u00010;8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00105\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER7\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00050G2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050G8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00105\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010Q\u001a\u00020\b2\u0006\u00103\u001a\u00020\b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010ER\u0014\u0010T\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010V\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, m80612d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "", "layoutDirection", "LoO00ooO/OooOooO;", "setLayoutDirection", "(I)V", "", "isFocusable", "setIsFocusable", "(Z)V", "Lo00000oo/OooOoOO;", "securePolicy", "setSecurePolicy", "(Lo00000oo/OooOoOO;)V", "clippingEnabled", "setClippingEnabled", "", "Oooo00O", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/WindowManager$LayoutParams;", "Oooo0OO", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "params", "Lo00000oo/OooOoO0;", "Oooo0o0", "Lo00000oo/OooOoO0;", "getPositionProvider", "()Lo00000oo/OooOoO0;", "setPositionProvider", "(Lo00000oo/OooOoO0;)V", "positionProvider", "Lo0000Ooo/OooOOO;", "Oooo0o", "Lo0000Ooo/OooOOO;", "getParentLayoutDirection", "()Lo0000Ooo/OooOOO;", "setParentLayoutDirection", "(Lo0000Ooo/OooOOO;)V", "parentLayoutDirection", "Lo0000Ooo/OooOO0o;", "<set-?>", "Oooo0oO", "LOooo0oO/o00oO0O;", "getPopupContentSize-bOM6tXw", "()Lo0000Ooo/OooOO0o;", "setPopupContentSize-fhxjrPA", "(Lo0000Ooo/OooOO0o;)V", "popupContentSize", "Loo000o/OooOOOO;", "Oooo0oo", "getParentLayoutCoordinates", "()Loo000o/OooOOOO;", "setParentLayoutCoordinates", "(Loo000o/OooOOOO;)V", "parentLayoutCoordinates", "OoooO00", "LOooo0oO/o000O0;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lkotlin/Function0;", "OoooO0O", "getContent", "()LoO0O000o/OooOOOo;", "setContent", "(LoO0O000o/OooOOOo;)V", FirebaseAnalytics.Param.CONTENT, "OoooO", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "getDisplayWidth", "()I", "displayWidth", "getDisplayHeight", "displayHeight", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PopupLayout extends AbstractComposeView {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public oO0O000o.OooO00o<C32460OooOooO> f63561OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C24236OooOO0O f63562Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final InterfaceC24134OooOo0 f63563Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C24137OooOoO f63564Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public String testTag;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final View f63566Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final WindowManager f63567Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name and from kotlin metadata */
    public final WindowManager.LayoutParams params;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public EnumC24238OooOOO parentLayoutDirection;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name and from kotlin metadata */
    public InterfaceC24138OooOoO0 positionProvider;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63571Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63572Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Rect f63574OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C21059Oooo0oo f63575OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63576OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int[] f63577OoooOO0;

    public static final class OooO00o extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {
        public OooO00o(int i) {
            super(2);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
            num.intValue();
            int iOooO0oo = C21081o00000o0.OooO0oo(9);
            PopupLayout.this.OooO00o(iOooO0oo, interfaceC21033OooOOOO);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public PopupLayout() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupLayout(oO0O000o.OooO00o oooO00o, C24137OooOoO properties, String testTag, View composeView, InterfaceC24229OooO0OO density, InterfaceC24138OooOoO0 initialPositionProvider, UUID uuid) {
        InterfaceC24134OooOo0 c24136OooOo0o = Build.VERSION.SDK_INT >= 29 ? new C24136OooOo0o() : new OooOo();
        OooOOO0.OooO0oO(properties, "properties");
        OooOOO0.OooO0oO(testTag, "testTag");
        OooOOO0.OooO0oO(composeView, "composeView");
        OooOOO0.OooO0oO(density, "density");
        OooOOO0.OooO0oO(initialPositionProvider, "initialPositionProvider");
        Context context = composeView.getContext();
        OooOOO0.OooO0o(context, "composeView.context");
        super(context);
        this.f63561OooOooo = oooO00o;
        this.f63564Oooo000 = properties;
        this.testTag = testTag;
        this.f63566Oooo00o = composeView;
        this.f63563Oooo0 = c24136OooOo0o;
        Object systemService = composeView.getContext().getSystemService("window");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f63567Oooo0O0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = initialPositionProvider;
        this.parentLayoutDirection = EnumC24238OooOOO.f81494OooOo0o;
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f63571Oooo0oO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f63572Oooo0oo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f63575OoooO00 = C21105o000OoO.OooO0O0(new OooOo00(this));
        this.f63574OoooO0 = new Rect();
        setId(android.R.id.content);
        oo000o.OooO0O0(this, oo000o.OooO00o(composeView));
        setTag(R.id.view_tree_view_model_store_owner, (InterfaceC22023o00ooo) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOo00(C33574OooOOO0.OooO(composeView, C22022o00oO0o.f65692OooOo0o), o00oO0O.f65691OooOo0o)));
        C24442Oooo00o.OooO0O0(this, (InterfaceC24753OooO0o0) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOo00(C33574OooOOO0.OooO(composeView, OooO0o.f83959OooOo0o), C24754OooO0oO.f83960OooOo0o)));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.o0OOO0o((float) 8));
        setOutlineProvider(new C24133OooOOoo());
        this.f63576OoooO0O = C21105o000OoO.OooO0OO(C24132OooOOo0.f81329OooO00o, o000o0o02);
        this.f63577OoooOO0 = new int[2];
    }

    private final InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> getContent() {
        return (InterfaceC32508OooOOOo) this.f63576OoooO0O.getValue();
    }

    private final int getDisplayHeight() {
        return oO0O00O.OooO00o.OooO0O0(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return oO0O00O.OooO00o.OooO0O0(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC34635OooOOOO getParentLayoutCoordinates() {
        return (InterfaceC34635OooOOOO) this.f63572Oooo0oo.getValue();
    }

    private final void setClippingEnabled(boolean clippingEnabled) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = clippingEnabled ? layoutParams.flags & (-513) : layoutParams.flags | 512;
        this.f63563Oooo0.OooO0O0(this.f63567Oooo0O0, this, layoutParams);
    }

    private final void setContent(InterfaceC32508OooOOOo<? super InterfaceC21033OooOOOO, ? super Integer, C32460OooOooO> interfaceC32508OooOOOo) {
        this.f63576OoooO0O.setValue(interfaceC32508OooOOOo);
    }

    private final void setIsFocusable(boolean isFocusable) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = !isFocusable ? layoutParams.flags | 8 : layoutParams.flags & (-9);
        this.f63563Oooo0.OooO0O0(this.f63567Oooo0O0, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        this.f63572Oooo0oo.setValue(interfaceC34635OooOOOO);
    }

    private final void setSecurePolicy(EnumC24139OooOoOO securePolicy) {
        C21064OoooOO0 c21064OoooOO0 = C24122OooO00o.f81293OooO00o;
        View view = this.f63566Oooo00o;
        OooOOO0.OooO0oO(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = true;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        OooOOO0.OooO0oO(securePolicy, "<this>");
        int iOrdinal = securePolicy.ordinal();
        if (iOrdinal == 0) {
            z = z2;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
            z = false;
        }
        WindowManager.LayoutParams layoutParams3 = this.params;
        layoutParams3.flags = z ? layoutParams3.flags | 8192 : layoutParams3.flags & (-8193);
        this.f63563Oooo0.OooO0O0(this.f63567Oooo0O0, this, layoutParams3);
    }

    public final void OooO(AbstractC21043OooOoO parent, C24633OooO00o c24633OooO00o) {
        OooOOO0.OooO0oO(parent, "parent");
        setParentCompositionContext(parent);
        setContent(c24633OooO00o);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public final void OooO00o(int i, InterfaceC21033OooOOOO interfaceC21033OooOOOO) throws Throwable {
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(-857613600);
        getContent().invoke(c21035OooOOoOooOOO0, 0);
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new OooO00o(i);
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public final void OooO0o(int i, int i2) {
        this.f63564Oooo000.getClass();
        super.OooO0o(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public final void OooO0o0(boolean z, int i, int i2, int i3, int i4) {
        super.OooO0o0(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f63563Oooo0.OooO0O0(this.f63567Oooo0O0, this, layoutParams);
    }

    public final void OooOO0(oO0O000o.OooO00o<C32460OooOooO> oooO00o, C24137OooOoO properties, String testTag, EnumC24238OooOOO layoutDirection) {
        int i;
        OooOOO0.OooO0oO(properties, "properties");
        OooOOO0.OooO0oO(testTag, "testTag");
        OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        this.f63561OooOooo = oooO00o;
        this.f63564Oooo000 = properties;
        this.testTag = testTag;
        setIsFocusable(properties.f81332OooO00o);
        setSecurePolicy(properties.f81335OooO0Oo);
        setClippingEnabled(properties.f81336OooO0o);
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new C32442OooOO0o();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void OooOO0O() {
        InterfaceC34635OooOOOO parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jOooO00o = parentLayoutCoordinates.OooO00o();
        long jOooO0Oo = parentLayoutCoordinates.OooO0Oo(C21290OooO0o0.f61718OooO0O0);
        long jOooO00o2 = C24235OooOO0.OooO00o(oO0O00O.OooO00o.OooO0O0(C21290OooO0o0.OooO0OO(jOooO0Oo)), oO0O00O.OooO00o.OooO0O0(C21290OooO0o0.OooO0Oo(jOooO0Oo)));
        int i = C24226OooO.f81469OooO0OO;
        int i2 = (int) (jOooO00o2 >> 32);
        int i3 = (int) (jOooO00o2 & 4294967295L);
        C24236OooOO0O c24236OooOO0O = new C24236OooOO0O(i2, i3, ((int) (jOooO00o >> 32)) + i2, ((int) (jOooO00o & 4294967295L)) + i3);
        if (c24236OooOO0O.equals(this.f63562Oooo)) {
            return;
        }
        this.f63562Oooo = c24236OooOO0O;
        OooOOO0();
    }

    public final void OooOO0o(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        setParentLayoutCoordinates(interfaceC34635OooOOOO);
        OooOO0O();
    }

    public final void OooOOO0() {
        C24237OooOO0o c24237OooOO0oM80660getPopupContentSizebOM6tXw;
        C24236OooOO0O c24236OooOO0O = this.f63562Oooo;
        if (c24236OooOO0O == null || (c24237OooOO0oM80660getPopupContentSizebOM6tXw = m80660getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        InterfaceC24134OooOo0 interfaceC24134OooOo0 = this.f63563Oooo0;
        View view = this.f63566Oooo00o;
        Rect rect = this.f63574OoooO0;
        interfaceC24134OooOo0.OooO0OO(rect, view);
        C21064OoooOO0 c21064OoooOO0 = C24122OooO00o.f81293OooO00o;
        long jOooO00o = C24239OooOOO0.OooO00o(rect.right - rect.left, rect.bottom - rect.top);
        long jOooO00o2 = this.positionProvider.OooO00o(c24236OooOO0O, jOooO00o, this.parentLayoutDirection, c24237OooOO0oM80660getPopupContentSizebOM6tXw.f81492OooO00o);
        WindowManager.LayoutParams layoutParams = this.params;
        int i = C24226OooO.f81469OooO0OO;
        layoutParams.x = (int) (jOooO00o2 >> 32);
        layoutParams.y = (int) (jOooO00o2 & 4294967295L);
        if (this.f63564Oooo000.f81337OooO0o0) {
            interfaceC24134OooOo0.OooO00o(this, (int) (jOooO00o >> 32), (int) (jOooO00o & 4294967295L));
        }
        interfaceC24134OooOo0.OooO0O0(this.f63567Oooo0O0, this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        OooOOO0.OooO0oO(event, "event");
        if (event.getKeyCode() == 4 && this.f63564Oooo000.f81333OooO0O0) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f63561OooOooo;
                if (oooO00o != null) {
                    oooO00o.invoke();
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f63575OoooO00.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final EnumC24238OooOOO getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C24237OooOO0o m80660getPopupContentSizebOM6tXw() {
        return (C24237OooOO0o) this.f63571Oooo0oO.getValue();
    }

    public final InterfaceC24138OooOoO0 getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f63564Oooo000.f81334OooO0OO) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f63561OooOooo;
            if (oooO00o != null) {
                oooO00o.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            oO0O000o.OooO00o<C32460OooOooO> oooO00o2 = this.f63561OooOooo;
            if (oooO00o2 != null) {
                oooO00o2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(EnumC24238OooOOO enumC24238OooOOO) {
        OooOOO0.OooO0oO(enumC24238OooOOO, "<set-?>");
        this.parentLayoutDirection = enumC24238OooOOO;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m80661setPopupContentSizefhxjrPA(C24237OooOO0o c24237OooOO0o) {
        this.f63571Oooo0oO.setValue(c24237OooOO0o);
    }

    public final void setPositionProvider(InterfaceC24138OooOoO0 interfaceC24138OooOoO0) {
        OooOOO0.OooO0oO(interfaceC24138OooOoO0, "<set-?>");
        this.positionProvider = interfaceC24138OooOoO0;
    }

    public final void setTestTag(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.testTag = str;
    }
}
