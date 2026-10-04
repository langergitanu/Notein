package com.lzf.easyfloat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.lzf.easyfloat.data.FloatConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0O0O0oo.C25875OooO0O0;
import o0O0O0oo.C25877OooO0o0;
import o0O0OO0.InterfaceC25881OooO0o0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m80612d2 = {"Lcom/lzf/easyfloat/widget/ParentFrameLayout;", "Landroid/widget/FrameLayout;", "Lo0O0OO0/OooO0o0;", "OooOo", "Lo0O0OO0/OooO0o0;", "getTouchListener", "()Lo0O0OO0/OooO0o0;", "setTouchListener", "(Lo0O0OO0/OooO0o0;)V", "touchListener", "Lcom/lzf/easyfloat/widget/ParentFrameLayout$OooO00o;", "OooOoO0", "Lcom/lzf/easyfloat/widget/ParentFrameLayout$OooO00o;", "getLayoutListener", "()Lcom/lzf/easyfloat/widget/ParentFrameLayout$OooO00o;", "setLayoutListener", "(Lcom/lzf/easyfloat/widget/ParentFrameLayout$OooO00o;)V", "layoutListener", "OooO00o", "easyfloat_release"}, m80613k = 1, m80614mv = {1, 5, 1}, m80616xi = 48)
public final class ParentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public InterfaceC25881OooO0o0 touchListener;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FloatConfig f68995OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f68996OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    public OooO00o layoutListener;

    public interface OooO00o {
        void OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParentFrameLayout(Context context, FloatConfig config) {
        super(context, null, 0);
        OooOOO0.OooO0oO(config, "config");
        this.f68995OooOo0o = config;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C25875OooO0O0 c25875OooO0O0OooO0O0;
        FloatConfig floatConfig = this.f68995OooOo0o;
        if (floatConfig.getHasEditText() && keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4 && (c25875OooO0O0OooO0O0 = C25877OooO0o0.OooO0O0(floatConfig.getFloatTag())) != null) {
            c25875OooO0O0OooO0O0.OooO0OO().flags = 40;
            c25875OooO0O0OooO0O0.OooO0Oo().updateViewLayout(c25875OooO0O0OooO0O0.f88297OooO0o0, c25875OooO0O0OooO0O0.OooO0OO());
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final OooO00o getLayoutListener() {
        return this.layoutListener;
    }

    public final InterfaceC25881OooO0o0 getTouchListener() {
        return this.touchListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FloatConfig floatConfig = this.f68995OooOo0o;
        floatConfig.getCallbacks();
        o0O0OO0.OooO00o floatCallbacks = floatConfig.getFloatCallbacks();
        if (floatCallbacks == null) {
            return;
        }
        floatCallbacks.OooO00o();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC25881OooO0o0 interfaceC25881OooO0o0;
        if (motionEvent != null && (interfaceC25881OooO0o0 = this.touchListener) != null) {
            interfaceC25881OooO0o0.OooO00o(motionEvent);
        }
        return this.f68995OooOo0o.isDrag() || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f68996OooOoO) {
            return;
        }
        this.f68996OooOoO = true;
        OooO00o oooO00o = this.layoutListener;
        if (oooO00o == null) {
            return;
        }
        oooO00o.OooO00o();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC25881OooO0o0 interfaceC25881OooO0o0;
        if (motionEvent != null && (interfaceC25881OooO0o0 = this.touchListener) != null) {
            interfaceC25881OooO0o0.OooO00o(motionEvent);
        }
        return this.f68995OooOo0o.isDrag() || super.onTouchEvent(motionEvent);
    }

    public final void setLayoutListener(OooO00o oooO00o) {
        this.layoutListener = oooO00o;
    }

    public final void setTouchListener(InterfaceC25881OooO0o0 interfaceC25881OooO0o0) {
        this.touchListener = interfaceC25881OooO0o0;
    }
}
