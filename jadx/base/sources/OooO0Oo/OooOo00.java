package OooO0Oo;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21990OooOooo;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.oo000o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import o000O0oo.C24442Oooo00o;
import o000ooo0.C24752OooO0Oo;
import o000ooo0.InterfaceC24753OooO0o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001bJ!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u0017\u0010\u001eJ!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0017¢\u0006\u0004\b \u0010\u0013R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010(\u001a\u00020'8\u0006¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0013\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m80612d2 = {"LOooO0Oo/OooOo00;", "Landroid/app/Dialog;", "Landroidx/lifecycle/OooOoo;", "LOooO0Oo/Oooo000;", "Lo000ooo0/OooO0o0;", "Landroid/content/Context;", "context", "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "LoO00ooO/OooOooO;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroidx/lifecycle/OooOooo;", "_lifecycleRegistry", "Landroidx/lifecycle/OooOooo;", "Lo000ooo0/OooO0Oo;", "savedStateRegistryController", "Lo000ooo0/OooO0Oo;", "LOooO0Oo/OooOoo;", "onBackPressedDispatcher", "LOooO0Oo/OooOoo;", "getOnBackPressedDispatcher", "()LOooO0Oo/OooOoo;", "getOnBackPressedDispatcher$annotations", "getLifecycleRegistry", "()Landroidx/lifecycle/OooOooo;", "lifecycleRegistry", "Lo000ooo0/OooO0OO;", "getSavedStateRegistry", "()Lo000ooo0/OooO0OO;", "savedStateRegistry", "Landroidx/lifecycle/OooOOo0;", "getLifecycle", "()Landroidx/lifecycle/OooOOo0;", RequestParameters.SUBRESOURCE_LIFECYCLE, "activity_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class OooOo00 extends Dialog implements InterfaceC21987OooOoo, Oooo000, InterfaceC24753OooO0o0 {
    private C21990OooOooo _lifecycleRegistry;
    private final C20418OooOoo onBackPressedDispatcher;
    private final C24752OooO0Oo savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooOo00(Context context) {
        this(context, 0, 2, null);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
    }

    private final C21990OooOooo getLifecycleRegistry() {
        C21990OooOooo c21990OooOooo = this._lifecycleRegistry;
        if (c21990OooOooo != null) {
            return c21990OooOooo;
        }
        C21990OooOooo c21990OooOooo2 = new C21990OooOooo(this);
        this._lifecycleRegistry = c21990OooOooo2;
        return c21990OooOooo2;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public void OooO00o() {
        dismiss();
    }

    public boolean OooOO0o() {
        return isShowing();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, params);
    }

    @Override // androidx.lifecycle.InterfaceC21987OooOoo
    public AbstractC21979OooOOo0 getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // OooO0Oo.Oooo000
    public final C20418OooOoo getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // o000ooo0.InterfaceC24753OooO0o0
    public o000ooo0.OooO0OO getSavedStateRegistry() {
        return this.savedStateRegistryController.f83957OooO0O0;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView, "window!!.decorView");
        oo000o.OooO0O0(decorView, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.OooOOO0.OooO0o(decorView3, "window!!.decorView");
        C24442Oooo00o.OooO0O0(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.OooO0OO();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            C20418OooOoo c20418OooOoo = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.OooOOO0.OooO0o(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c20418OooOoo.f58232OooO0o0 = onBackInvokedDispatcher;
            c20418OooOoo.OooO0Oo(c20418OooOoo.f58233OooO0oO);
        }
        this.savedStateRegistryController.OooO0O0(savedInstanceState);
        getLifecycleRegistry().OooO0o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.OooOOO0.OooO0o(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.OooO0OO(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().OooO0o(AbstractC21979OooOOo0.OooO00o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().OooO0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        super.setContentView(layoutResID);
    }

    public /* synthetic */ OooOo00(Context context, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Context context, int i) {
        super(context, i);
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.savedStateRegistryController = new C24752OooO0Oo(this);
        this.onBackPressedDispatcher = new C20418OooOoo(new Runnable() { // from class: OooO0Oo.OooOOoo
            @Override // java.lang.Runnable
            public final void run() {
                super/*android.app.Dialog*/.onBackPressed();
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, params);
    }
}
