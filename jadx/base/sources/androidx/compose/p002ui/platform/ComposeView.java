package androidx.compose.p002ui.platform;

import Oooo0oO.C21035OooOOo;
import Oooo0oO.C21081o00000o0;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000OO;
import Oooo0oO.o000O0O0;
import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m80612d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", FirebaseAnalytics.Param.CONTENT, "setContent", "(LoO0O000o/OooOOOo;)V", "", "<set-?>", "Oooo000", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f63445OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public static final class OooO00o extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {
        public OooO00o(int i) {
            super(2);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
            num.intValue();
            int iOooO0oo = C21081o00000o0.OooO0oo(9);
            ComposeView.this.OooO00o(iOooO0oo, interfaceC21033OooOOOO);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context) {
        super(context);
        OooOOO0.OooO0oO(context, "context");
        this.f63445OooOooo = C21105o000OoO.OooO0OO(null, o000O0O0.f61218OooO00o);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public final void OooO00o(int i, InterfaceC21033OooOOOO interfaceC21033OooOOOO) throws Throwable {
        C21035OooOOo c21035OooOOoOooOOO0 = interfaceC21033OooOOOO.OooOOO0(420213850);
        InterfaceC32508OooOOOo interfaceC32508OooOOOo = (InterfaceC32508OooOOOo) this.f63445OooOooo.getValue();
        if (interfaceC32508OooOOOo != null) {
            interfaceC32508OooOOOo.invoke(c21035OooOOoOooOOO0, 0);
        }
        o00000OO o00000ooOoooO0 = c21035OooOOoOooOOO0.OoooO0();
        if (o00000ooOoooO0 == null) {
            return;
        }
        o00000ooOoooO0.f61064OooO0Oo = new OooO00o(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.p002ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(InterfaceC32508OooOOOo<? super InterfaceC21033OooOOOO, ? super Integer, C32460OooOooO> content) {
        OooOOO0.OooO0oO(content, "content");
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.f63445OooOooo.setValue(content);
        if (isAttachedToWindow()) {
            if (this.parentContext == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            OooO0Oo();
        }
    }
}
