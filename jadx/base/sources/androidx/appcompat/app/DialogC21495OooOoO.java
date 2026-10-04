package androidx.appcompat.app;

import OooOO0o.AbstractC20443OooO00o;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.view.KeyEventDispatcher;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC21495OooOoO extends OooO0Oo.OooOo00 implements OooO {
    private AbstractC21486OooOO0o mDelegate;
    private final KeyEventDispatcher.Component mKeyDispatcher;

    public DialogC21495OooOoO(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // OooO0Oo.OooOo00, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().OooO00o(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().OooOOo();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.dispatchKeyEvent(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().OooO0o0(i);
    }

    public AbstractC21486OooOO0o getDelegate() {
        if (this.mDelegate == null) {
            AbstractC21486OooOO0o.OooO0OO oooO0OO = AbstractC21486OooOO0o.f62445OooOo0o;
            this.mDelegate = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public OooO00o getSupportActionBar() {
        return getDelegate().OooOO0o();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().OooOOO();
    }

    @Override // OooO0Oo.OooOo00, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().OooOOO0();
        super.onCreate(bundle);
        getDelegate().OooOOo0();
    }

    @Override // OooO0Oo.OooOo00, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().OooOo0O();
    }

    @Override // androidx.appcompat.app.OooO
    public void onSupportActionModeFinished(AbstractC20443OooO00o abstractC20443OooO00o) {
    }

    @Override // androidx.appcompat.app.OooO
    public void onSupportActionModeStarted(AbstractC20443OooO00o abstractC20443OooO00o) {
    }

    @Override // androidx.appcompat.app.OooO
    public AbstractC20443OooO00o onWindowStartingSupportActionMode(AbstractC20443OooO00o.InterfaceC18960OooO00o interfaceC18960OooO00o) {
        return null;
    }

    @Override // OooO0Oo.OooOo00, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().OooOoO0(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().OooOooo(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().OooOo(i);
    }

    public DialogC21495OooOoO(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.OooOoO0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f62465OooOo0o.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC21486OooOO0o delegate = getDelegate();
        delegate.OooOooO(getThemeResId(context, i));
        delegate.OooOOo0();
    }

    @Override // OooO0Oo.OooOo00, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().OooOoO(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().OooOooo(getContext().getString(i));
    }

    @Override // OooO0Oo.OooOo00, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().OooOoOO(view, layoutParams);
    }

    public DialogC21495OooOoO(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new KeyEventDispatcher.Component() { // from class: androidx.appcompat.app.OooOoO0
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f62465OooOo0o.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }
}
