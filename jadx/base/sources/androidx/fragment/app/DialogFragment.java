package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.FragmentManager.C21881OooOOOo;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import androidx.lifecycle.oo000o;
import com.orion.notein.global.R;
import o000O0oo.C24442Oooo00o;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private InterfaceC21998Oooo0o0<InterfaceC21987OooOoo> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogFragment dialogFragment = DialogFragment.this;
            dialogFragment.mOnDismissListener.onDismiss(dialogFragment.mDialog);
        }
    }

    public class OooO0O0 implements DialogInterface.OnCancelListener {
        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            if (dialogFragment.mDialog != null) {
                dialogFragment.onCancel(dialogFragment.mDialog);
            }
        }
    }

    public class OooO0OO implements DialogInterface.OnDismissListener {
        public OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            if (dialogFragment.mDialog != null) {
                dialogFragment.onDismiss(dialogFragment.mDialog);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public class C21869OooO0Oo implements InterfaceC21998Oooo0o0<InterfaceC21987OooOoo> {
        public C21869OooO0Oo() {
        }

        @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
        public final void OooO0O0(InterfaceC21987OooOoo interfaceC21987OooOoo) {
            if (interfaceC21987OooOoo != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                if (dialogFragment.mShowsDialog) {
                    View viewRequireView = dialogFragment.requireView();
                    if (viewRequireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogFragment.mDialog != null) {
                        if (FragmentManager.Oooo0o(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogFragment.mDialog);
                        }
                        dialogFragment.mDialog.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$OooO0o0, reason: case insensitive filesystem */
    public class C21870OooO0o0 extends AbstractC21899OooOo0o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC21899OooOo0o f64756OooOo0o;

        public C21870OooO0o0(AbstractC21899OooOo0o abstractC21899OooOo0o) {
            this.f64756OooOo0o = abstractC21899OooOo0o;
        }

        @Override // androidx.fragment.app.AbstractC21899OooOo0o
        public final View OooO0O0(int i) {
            AbstractC21899OooOo0o abstractC21899OooOo0o = this.f64756OooOo0o;
            return abstractC21899OooOo0o.OooO0OO() ? abstractC21899OooOo0o.OooO0O0(i) : DialogFragment.this.onFindViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC21899OooOo0o
        public final boolean OooO0OO() {
            return this.f64756OooOo0o.OooO0OO() || DialogFragment.this.onHasView();
        }
    }

    public DialogFragment() {
        this.mDismissRunnable = new OooO00o();
        this.mOnCancelListener = new OooO0O0();
        this.mOnDismissListener = new OooO0OO();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C21869OooO0Oo();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId < 0) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(parentFragmentManager, parentFragmentManager);
            oooO00oOooO0OO.f65021OooOOo = true;
            oooO00oOooO0OO.OooOOO0(this);
            if (z3) {
                oooO00oOooO0OO.OooOO0();
                return;
            } else if (z) {
                oooO00oOooO0OO.OooO(true, true);
                return;
            } else {
                oooO00oOooO0OO.OooO0oo();
                return;
            }
        }
        if (z3) {
            FragmentManager parentFragmentManager2 = getParentFragmentManager();
            int i = this.mBackStackId;
            if (i < 0) {
                parentFragmentManager2.getClass();
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Bad id: "));
            }
            parentFragmentManager2.OoooOO0(i, 1);
        } else {
            FragmentManager parentFragmentManager3 = getParentFragmentManager();
            int i2 = this.mBackStackId;
            parentFragmentManager3.getClass();
            if (i2 < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Bad id: "));
            }
            parentFragmentManager3.OooOo(parentFragmentManager3.new C21881OooOOOo(null, i2), z);
        }
        this.mBackStackId = -1;
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
                this.mCreatingDialog = false;
            } catch (Throwable th) {
                this.mCreatingDialog = false;
                throw th;
            }
        }
    }

    public void OooO0oO() {
        dismissAllowingStateLoss();
    }

    public void OooOO0O() {
        dismissAllowingStateLoss();
    }

    public void OooOOO() {
        dismissAllowingStateLoss();
    }

    public void OooOoO0() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public AbstractC21899OooOo0o createFragmentContainer() {
        return new C21870OooO0o0(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().OooO0o0(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new OooO0Oo.OooOo00(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().OooO(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true, false);
    }

    public View onFindViewById(int i) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (FragmentManager.Oooo0o(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.Oooo0o(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i = this.mStyle;
        if (i != 0) {
            bundle.putInt(SAVED_STYLE, i);
        }
        int i2 = this.mTheme;
        if (i2 != 0) {
            bundle.putInt(SAVED_THEME, i2);
        }
        boolean z = this.mCancelable;
        if (!z) {
            bundle.putBoolean(SAVED_CANCELABLE, z);
        }
        boolean z2 = this.mShowsDialog;
        if (!z2) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z2);
        }
        int i3 = this.mBackStackId;
        if (i3 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            oo000o.OooO0O0(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            C24442Oooo00o.OooO0O0(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final OooO0Oo.OooOo00 requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof OooO0Oo.OooOo00) {
            return (OooO0Oo.OooOo00) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i, int i2) {
        if (FragmentManager.Oooo0o(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.mStyle = i;
        if (i == 2 || i == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.mTheme = i2;
        }
    }

    public void setupDialog(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(fragmentManager, fragmentManager);
        oooO00oOooO0OO.f65021OooOOo = true;
        oooO00oOooO0OO.OooO0Oo(0, this, str, 1);
        oooO00oOooO0OO.OooO0oo();
    }

    public void showNow(FragmentManager fragmentManager, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(fragmentManager, fragmentManager);
        oooO00oOooO0OO.f65021OooOOo = true;
        oooO00oOooO0OO.OooO0Oo(0, this, str, 1);
        oooO00oOooO0OO.OooOO0();
    }

    public int show(AbstractC21907Oooo abstractC21907Oooo, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        abstractC21907Oooo.OooO0Oo(0, this, str, 1);
        this.mViewDestroyed = false;
        int iOooO = ((androidx.fragment.app.OooO00o) abstractC21907Oooo).OooO(false, true);
        this.mBackStackId = iOooO;
        return iOooO;
    }

    public DialogFragment(int i) {
        super(i);
        this.mDismissRunnable = new OooO00o();
        this.mOnCancelListener = new OooO0O0();
        this.mOnDismissListener = new OooO0OO();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C21869OooO0Oo();
        this.mDialogCreated = false;
    }
}
