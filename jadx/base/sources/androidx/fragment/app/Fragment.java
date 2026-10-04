package androidx.fragment.app;

import OooO0o.AbstractC20425OooO0o0;
import OooO0oO.AbstractC20431OooO00o;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.ContextCompat;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21990OooOooo;
import androidx.lifecycle.C21996Oooo0OO;
import androidx.lifecycle.C22011Ooooo00;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00O0O;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.oo000o;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.global.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o000O0oo.C24442Oooo00o;
import o000Oo0.C24509OooO0Oo;
import o000Oo0.C24510OooO0o0;
import o000Oo0.C24512OooO0oo;
import o000Oo0.OooO0O0;
import o000o00.AbstractC24555OooO00o;
import o000o00.C24556OooO0O0;
import o000o00O.AbstractC24558OooO00o;
import o000o00O.C24559OooO0O0;
import o000ooo0.C24752OooO0Oo;
import o000ooo0.InterfaceC24753OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC21987OooOoo, InterfaceC22023o00ooo, androidx.lifecycle.OooOOOO, InterfaceC24753OooO0o0 {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    OooOO0O mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    o00Oo0.OooO0O0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC21900OooOoO<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C21990OooOooo mLifecycleRegistry;
    AbstractC21979OooOOo0.OooO0O0 mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OooOOO0> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final OooOOO0 mSavedStateAttachListener;
    C24752OooO0Oo mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    o000oOoO mViewLifecycleOwner;
    C21996Oooo0OO<InterfaceC21987OooOoo> mViewLifecycleOwnerLiveData;
    String mWho;

    public class OooO implements OooOOOO.OooO00o<Void, AbstractC20425OooO0o0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ AbstractC20425OooO0o0 f64757OooO00o;

        public OooO(AbstractC20425OooO0o0 abstractC20425OooO0o0) {
            this.f64757OooO00o = abstractC20425OooO0o0;
        }

        @Override // OooOOOO.OooO00o
        public final AbstractC20425OooO0o0 apply(Void r1) {
            return this.f64757OooO00o;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class OooO00o<I> extends OooO0o.OooO0O0<I> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f64758OooO00o;

        public OooO00o(AtomicReference atomicReference) {
            this.f64758OooO00o = atomicReference;
        }

        @Override // OooO0o.OooO0O0
        public final void OooO00o(Object obj) {
            OooO0o.OooO0O0 oooO0O0 = (OooO0o.OooO0O0) this.f64758OooO00o.get();
            if (oooO0O0 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            oooO0O0.OooO00o(obj);
        }

        @Override // OooO0o.OooO0O0
        public final void OooO0O0() {
            OooO0o.OooO0O0 oooO0O0 = (OooO0o.OooO0O0) this.f64758OooO00o.getAndSet(null);
            if (oooO0O0 != null) {
                oooO0O0.OooO0O0();
            }
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class OooO0OO extends OooOOO0 {
        public OooO0OO() {
        }

        @Override // androidx.fragment.app.Fragment.OooOOO0
        public final void OooO00o() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.OooO00o();
            C22011Ooooo00.OooO0O0(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.OooO0O0(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$OooO0Oo, reason: case insensitive filesystem */
    public class RunnableC21871OooO0Oo implements Runnable {
        public RunnableC21871OooO0Oo() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class OooO0o extends AbstractC21899OooOo0o {
        public OooO0o() {
        }

        @Override // androidx.fragment.app.AbstractC21899OooOo0o
        public final View OooO0O0(int i) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC21899OooOo0o
        public final boolean OooO0OO() {
            return Fragment.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$OooO0o0, reason: case insensitive filesystem */
    public class RunnableC21872OooO0o0 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC21925OoooOoO f64763OooOo0o;

        public RunnableC21872OooO0o0(AbstractC21925OoooOoO abstractC21925OoooOoO) {
            this.f64763OooOo0o = abstractC21925OoooOoO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC21925OoooOoO abstractC21925OoooOoO = this.f64763OooOo0o;
            if (abstractC21925OoooOoO.f65078OooO0O0.isEmpty()) {
                return;
            }
            abstractC21925OoooOoO.OooO0o0();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$OooO0oO, reason: case insensitive filesystem */
    public class C21873OooO0oO implements InterfaceC21986OooOoOO {
        public C21873OooO0oO() {
        }

        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            View view;
            if (oooO00o != AbstractC21979OooOOo0.OooO00o.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$OooO0oo, reason: case insensitive filesystem */
    public class C21874OooO0oo implements OooOOOO.OooO00o<Void, AbstractC20425OooO0o0> {
        public C21874OooO0oo() {
        }

        @Override // OooOOOO.OooO00o
        public final AbstractC20425OooO0o0 apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof OooO0o.OooO ? ((OooO0o.OooO) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class OooOO0 extends OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOOOO.OooO00o f64766OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f64767OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ AbstractC20431OooO00o f64768OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o.OooO00o f64769OooO0Oo;

        public OooOO0(OooOOOO.OooO00o oooO00o, AtomicReference atomicReference, AbstractC20431OooO00o abstractC20431OooO00o, OooO0o.OooO00o oooO00o2) {
            this.f64766OooO00o = oooO00o;
            this.f64767OooO0O0 = atomicReference;
            this.f64768OooO0OO = abstractC20431OooO00o;
            this.f64769OooO0Oo = oooO00o2;
        }

        @Override // androidx.fragment.app.Fragment.OooOOO0
        public final void OooO00o() {
            Fragment fragment = Fragment.this;
            this.f64767OooO0O0.set(((AbstractC20425OooO0o0) this.f64766OooO00o.apply(null)).OooO0OO(fragment.generateActivityResultKey(), fragment, this.f64768OooO0OO, this.f64769OooO0Oo));
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Object f64771OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f64772OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f64773OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f64774OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f64775OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f64776OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f64777OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList<String> f64778OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList<String> f64779OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Object f64780OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Object f64781OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Object f64782OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Object f64783OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Object f64784OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Boolean f64785OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Boolean f64786OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public SharedElementCallback f64787OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public SharedElementCallback f64788OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public float f64789OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f64790OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public View f64791OooOo00;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$OooOO0o, reason: case insensitive filesystem */
    public static class C21875OooOO0o extends RuntimeException {
    }

    public static abstract class OooOOO0 {
        public abstract void OooO00o();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C21910Oooo0O0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new OooO0O0();
        this.mMaxState = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
        this.mViewLifecycleOwnerLiveData = new C21996Oooo0OO<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new OooO0OO();
        initLifecycle();
    }

    private OooOO0O ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            OooOO0O oooOO0O = new OooOO0O();
            oooOO0O.f64771OooO = null;
            Object obj = USE_DEFAULT_TRANSITION;
            oooOO0O.f64780OooOO0 = obj;
            oooOO0O.f64781OooOO0O = null;
            oooOO0O.f64782OooOO0o = obj;
            oooOO0O.f64784OooOOO0 = null;
            oooOO0O.f64783OooOOO = obj;
            oooOO0O.f64788OooOOo0 = null;
            oooOO0O.f64787OooOOo = null;
            oooOO0O.f64789OooOOoo = 1.0f;
            oooOO0O.f64791OooOo00 = null;
            this.mAnimationInfo = oooOO0O;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        AbstractC21979OooOOo0.OooO0O0 oooO0O0 = this.mMaxState;
        return (oooO0O0 == AbstractC21979OooOOo0.OooO0O0.f65537OooOo || this.mParentFragment == null) ? oooO0O0.ordinal() : Math.min(oooO0O0.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C21990OooOooo(this);
        this.mSavedStateRegistryController = new C24752OooO0Oo(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        o000oOoO o000oooo2 = this.mViewLifecycleOwner;
        o000oooo2.f65113OooOoo0.OooO0O0(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> OooO0o.OooO0O0<I> prepareCallInternal(AbstractC20431OooO00o<I, O> abstractC20431OooO00o, OooOOOO.OooO00o<Void, AbstractC20425OooO0o0> oooO00o, OooO0o.OooO00o<O> oooO00o2) {
        if (this.mState > 1) {
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new OooOO0(oooO00o, atomicReference, abstractC20431OooO00o, oooO00o2));
        return new OooO00o(atomicReference);
    }

    private void registerOnPreAttachListener(OooOOO0 oooOOO0) {
        if (this.mState >= 0) {
            oooOOO0.OooO00o();
        } else {
            this.mOnPreAttachedListeners.add(oooOOO0);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O != null) {
            oooOO0O.f64790OooOo0 = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        AbstractC21925OoooOoO abstractC21925OoooOoOOooO = AbstractC21925OoooOoO.OooO(viewGroup, fragmentManager);
        abstractC21925OoooOoOOooO.OooOO0O();
        if (z) {
            this.mHost.f64993OooOoO0.post(new RunnableC21872OooO0o0(abstractC21925OoooOoOOooO));
        } else {
            abstractC21925OoooOoOOooO.OooO0o0();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public AbstractC21899OooOo0o createFragmentContainer() {
        return new OooO0o();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC24558OooO00o.OooO00o(this).OooO0O0(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + C18241k5.f55433h);
        this.mChildFragmentManager.OooOo0O(C21111o0ooOoO.OooO0Oo(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f64800OooO0OO.OooO0OO(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final ActivityC21897OooOo0 getActivity() {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        if (abstractC21900OooOoO == null) {
            return null;
        }
        return abstractC21900OooOoO.f64991OooOo0o;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null || (bool = oooOO0O.f64786OooOOOo) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null || (bool = oooOO0O.f64785OooOOOO) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        oooOO0O.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        if (abstractC21900OooOoO == null) {
            return null;
        }
        return abstractC21900OooOoO.f64990OooOo;
    }

    @Override // androidx.lifecycle.OooOOOO
    public AbstractC24555OooO00o getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C24556OooO0O0 c24556OooO0O0 = new C24556OooO0O0(0);
        LinkedHashMap linkedHashMap = c24556OooO0O0.f83135OooO00o;
        if (application != null) {
            linkedHashMap.put(o00O0O.f65682OooO00o, application);
        }
        linkedHashMap.put(C22011Ooooo00.f65654OooO00o, this);
        linkedHashMap.put(C22011Ooooo00.f65655OooO0O0, this);
        if (getArguments() != null) {
            linkedHashMap.put(C22011Ooooo00.f65656OooO0OO, getArguments());
        }
        return c24556OooO0O0;
    }

    @Override // androidx.lifecycle.OooOOOO
    public o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.Oooo0o(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C22015OooooOo(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return 0;
        }
        return oooOO0O.f64773OooO0O0;
    }

    public Object getEnterTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        return oooOO0O.f64771OooO;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        return oooOO0O.f64788OooOOo0;
    }

    public int getExitAnim() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return 0;
        }
        return oooOO0O.f64774OooO0OO;
    }

    public Object getExitTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        return oooOO0O.f64781OooOO0O;
    }

    public SharedElementCallback getExitTransitionCallback() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        return oooOO0O.f64787OooOOo;
    }

    public View getFocusedView() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        return oooOO0O.f64791OooOo00;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        if (abstractC21900OooOoO == null) {
            return null;
        }
        return abstractC21900OooOoO.OooO0o0();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC21987OooOoo
    public AbstractC21979OooOOo0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC24558OooO00o getLoaderManager() {
        return AbstractC24558OooO00o.OooO00o(this);
    }

    public int getNextTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return 0;
        }
        return oooOO0O.f64776OooO0o;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return false;
        }
        return oooOO0O.f64772OooO00o;
    }

    public int getPopEnterAnim() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return 0;
        }
        return oooOO0O.f64775OooO0Oo;
    }

    public int getPopExitAnim() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return 0;
        }
        return oooOO0O.f64777OooO0o0;
    }

    public float getPostOnViewCreatedAlpha() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return 1.0f;
        }
        return oooOO0O.f64789OooOOoo;
    }

    public Object getReenterTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        Object obj = oooOO0O.f64782OooOO0o;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
        o000Oo0.OooO0O0.OooO0O0(new C24509OooO0Oo(this, "Attempting to get retain instance for fragment " + this));
        o000Oo0.OooO0O0.OooO00o(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        Object obj = oooOO0O.f64780OooOO0;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // o000ooo0.InterfaceC24753OooO0o0
    public final o000ooo0.OooO0OO getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f83957OooO0O0;
    }

    public Object getSharedElementEnterTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        return oooOO0O.f64784OooOOO0;
    }

    public Object getSharedElementReturnTransition() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return null;
        }
        Object obj = oooOO0O.f64783OooOOO;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        OooOO0O oooOO0O = this.mAnimationInfo;
        return (oooOO0O == null || (arrayList = oooOO0O.f64778OooO0oO) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        OooOO0O oooOO0O = this.mAnimationInfo;
        return (oooOO0O == null || (arrayList = oooOO0O.f64779OooO0oo) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
        o000Oo0.OooO0O0.OooO0O0(new C24510OooO0o0(this, "Attempting to get target request code from fragment " + this));
        o000Oo0.OooO0O0.OooO00o(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC21987OooOoo getViewLifecycleOwner() {
        o000oOoO o000oooo2 = this.mViewLifecycleOwner;
        if (o000oooo2 != null) {
            return o000oooo2;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.Oooo0<InterfaceC21987OooOoo> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC22023o00ooo
    public C22021o00o0O getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, C22021o00o0O> map = this.mFragmentManager.f64840OoooO00.f65040OooO0o;
        C22021o00o0O c22021o00o0O = map.get(this.mWho);
        if (c22021o00o0O != null) {
            return c22021o00o0O;
        }
        C22021o00o0O c22021o00o0O2 = new C22021o00o0O();
        map.put(this.mWho, c22021o00o0O2);
        return c22021o00o0O2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C21910Oooo0O0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        OooOO0O oooOO0O = this.mAnimationInfo;
        if (oooOO0O == null) {
            return false;
        }
        return oooOO0O.f64790OooOo0;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.OoooO00();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.OoooO0O();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        ActivityC21897OooOo0 activityC21897OooOo0 = abstractC21900OooOoO == null ? null : abstractC21900OooOoO.f64991OooOo0o;
        if (activityC21897OooOo0 != null) {
            this.mCalled = false;
            onAttach((Activity) activityC21897OooOo0);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f64820OooOo0o >= 1) {
            return;
        }
        fragmentManager.f64833Oooo0O0 = false;
        fragmentManager.f64834Oooo0OO = false;
        fragmentManager.f64840OoooO00.f65038OooO = false;
        fragmentManager.OooOo0(1);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        ActivityC21897OooOo0 activityC21897OooOo0 = abstractC21900OooOoO == null ? null : abstractC21900OooOoO.f64991OooOo0o;
        if (activityC21897OooOo0 != null) {
            this.mCalled = false;
            onInflate((Activity) activityC21897OooOo0, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.OoooO0O();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f64833Oooo0O0 = false;
        fragmentManager.f64834Oooo0OO = false;
        fragmentManager.f64840OoooO00.f65038OooO = false;
        fragmentManager.OooOo0(4);
    }

    public void performAttach() {
        Iterator<OooOOO0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().OooO00o();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.OooO0O0(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f64990OooOo);
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        Iterator<InterfaceC21913Oooo0o0> it2 = fragmentManager.f64814OooOOo0.iterator();
        while (it2.hasNext()) {
            it2.next().OooO00o(fragmentManager, this);
        }
        FragmentManager fragmentManager2 = this.mChildFragmentManager;
        fragmentManager2.f64833Oooo0O0 = false;
        fragmentManager2.f64834Oooo0OO = false;
        fragmentManager2.f64840OoooO00.f65038OooO = false;
        fragmentManager2.OooOo0(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.OooOO0(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.OoooO0O();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.OooO00o(new C21873OooO0oO());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.OooOO0O(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.OoooO0O();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new o000oOoO(this, getViewModelStore(), new OooOOOO(this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f65112OooOoOO != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.OooO0O0();
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        oo000o.OooO0O0(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        o000oOoO o000oooo2 = this.mViewLifecycleOwner;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, o000oooo2);
        C24442Oooo00o.OooO0O0(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.OooOO0(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.OooOO0o();
        this.mLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.OooOo0(1);
        if (this.mView != null) {
            o000oOoO o000oooo2 = this.mViewLifecycleOwner;
            o000oooo2.OooO0O0();
            if (o000oooo2.f65112OooOoOO.f65563OooO0Oo.compareTo(AbstractC21979OooOOo0.OooO0O0.f65540OooOoO0) >= 0) {
                this.mViewLifecycleOwner.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        OooOo.Oooo0<C24559OooO0O0.OooO00o> oooo0 = AbstractC24558OooO00o.OooO00o(this).f83138OooO0O0.f83146OooO0Oo;
        int iOooO0o = oooo0.OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            oooo0.OooO0oO(i).OooOO0O();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f64836Oooo0o0) {
            return;
        }
        fragmentManager.OooOO0o();
        this.mChildFragmentManager = new C21910Oooo0O0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.OooOOOo(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.OooOOo0(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.OooOo0(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_PAUSE);
        }
        this.mLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.OooOo00(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zOooo = FragmentManager.Oooo(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zOooo) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zOooo);
            onPrimaryNavigationFragmentChanged(zOooo);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.o00Oo0();
            fragmentManager.OooOOo(fragmentManager.f64823OooOoOO);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.OoooO0O();
        this.mChildFragmentManager.OooOoO(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onResume()"));
        }
        C21990OooOooo c21990OooOooo = this.mLifecycleRegistry;
        AbstractC21979OooOOo0.OooO00o oooO00o = AbstractC21979OooOOo0.OooO00o.ON_RESUME;
        c21990OooOooo.OooO0o(oooO00o);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f65112OooOoOO.OooO0o(oooO00o);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f64833Oooo0O0 = false;
        fragmentManager.f64834Oooo0OO = false;
        fragmentManager.f64840OoooO00.f65038OooO = false;
        fragmentManager.OooOo0(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.OoooO0O();
        this.mChildFragmentManager.OooOoO(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onStart()"));
        }
        C21990OooOooo c21990OooOooo = this.mLifecycleRegistry;
        AbstractC21979OooOOo0.OooO00o oooO00o = AbstractC21979OooOOo0.OooO00o.ON_START;
        c21990OooOooo.OooO0o(oooO00o);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f65112OooOoOO.OooO0o(oooO00o);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f64833Oooo0O0 = false;
        fragmentManager.f64834Oooo0OO = false;
        fragmentManager.f64840OoooO00.f65038OooO = false;
        fragmentManager.OooOo0(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f64834Oooo0OO = true;
        fragmentManager.f64840OoooO00.f65038OooO = true;
        fragmentManager.OooOo0(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
        }
        this.mLifecycleRegistry.OooO0o(AbstractC21979OooOOo0.OooO00o.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.OooOo0(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f64790OooOo0 = true;
    }

    public final <I, O> OooO0o.OooO0O0<I> registerForActivityResult(AbstractC20431OooO00o<I, O> abstractC20431OooO00o, OooO0o.OooO00o<O> oooO00o) {
        return prepareCallInternal(abstractC20431OooO00o, new C21874OooO0oo(), oooO00o);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f64831Oooo00O == null) {
            parentFragmentManager.f64816OooOo.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(permissions, "permissions");
        } else {
            parentFragmentManager.f64832Oooo00o.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
            parentFragmentManager.f64831Oooo00O.OooO00o(permissions);
        }
    }

    public final ActivityC21897OooOo0 requireActivity() {
        ActivityC21897OooOo0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.OoooOoo(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f64833Oooo0O0 = false;
        fragmentManager.f64834Oooo0OO = false;
        fragmentManager.f64840OoooO00.f65038OooO = false;
        fragmentManager.OooOo0(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C21928Ooooo00(C21893OooOOOo.OooO00o("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.OooO00o(AbstractC21979OooOOo0.OooO00o.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f64786OooOOOo = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f64785OooOOOO = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().f64773OooO0O0 = i;
        ensureAnimationInfo().f64774OooO0OO = i2;
        ensureAnimationInfo().f64775OooO0Oo = i3;
        ensureAnimationInfo().f64777OooO0o0 = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f64788OooOOo0 = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f64771OooO = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f64787OooOOo = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f64781OooOO0O = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f64791OooOo00 = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.OooO0oo();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f64792OooOo0o) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.OooO0oo();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f64776OooO0o = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f64772OooO00o = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f64789OooOOoo = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f64782OooOO0o = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
        o000Oo0.OooO0O0.OooO0O0(new C24512OooO0oo(this, "Attempting to set retain instance for fragment " + this));
        o000Oo0.OooO0O0.OooO00o(this).getClass();
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f64840OoooO00.OooO0o0(this);
        } else {
            fragmentManager.f64840OoooO00.OooO(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f64780OooOO0 = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f64784OooOOO0 = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        OooOO0O oooOO0O = this.mAnimationInfo;
        oooOO0O.f64778OooO0oO = arrayList;
        oooOO0O.f64779OooO0oo = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f64783OooOOO = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
            o000Oo0.OooO0O0.OooO0O0(new o000Oo0.OooO(this, "Attempting to set target fragment " + fragment + " with request code " + i + " for fragment " + this));
            o000Oo0.OooO0O0.OooO00o(this).getClass();
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(C21893OooOOOo.OooO00o("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
        o000Oo0.OooO0O0.OooO0O0(new o000Oo0.OooOO0(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        o000Oo0.OooO0O0.OooO00o(this).getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            C21914Oooo0oO c21914Oooo0oOOooO0oO = fragmentManager.OooO0oO(this);
            Fragment fragment = c21914Oooo0oOOooO0oO.f65046OooO0OO;
            if (fragment.mDeferStart) {
                if (fragmentManager.f64799OooO0O0) {
                    fragmentManager.f64835Oooo0o = true;
                } else {
                    fragment.mDeferStart = false;
                    c21914Oooo0oOOooO0oO.OooOO0O();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        if (abstractC21900OooOoO != null) {
            return abstractC21900OooOoO.OooO0oO(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to Activity"));
        }
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f64830Oooo000 == null) {
            AbstractC21900OooOoO<?> abstractC21900OooOoO = parentFragmentManager.f64816OooOo;
            abstractC21900OooOoO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ActivityC21897OooOo0 activityC21897OooOo0 = abstractC21900OooOoO.f64991OooOo0o;
            if (activityC21897OooOo0 == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ActivityCompat.startIntentSenderForResult(activityC21897OooOo0, intent, i, intent2, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intentSender");
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intent, intent2, i2, i3);
        parentFragmentManager.f64832Oooo00o.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        if (FragmentManager.Oooo0o(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f64830Oooo000.OooO00o(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f64790OooOo0) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f64790OooOo0 = false;
        } else if (Looper.myLooper() != this.mHost.f64993OooOoO0.getLooper()) {
            this.mHost.f64993OooOoO0.postAtFrontOfQueue(new RunnableC21871OooO0Oo());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Bundle f64792OooOo0o;

        public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f64792OooOo0o = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f64792OooOo0o);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f64792OooOo0o = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            OooO0O0.C19620OooO0O0 c19620OooO0O0 = o000Oo0.OooO0O0.f82897OooO00o;
            o000Oo0.OooO0O0.OooO0O0(new o000Oo0.OooO0o(this, "Attempting to get target fragment from fragment " + this));
            o000Oo0.OooO0O0.OooO00o(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.f64800OooO0OO.OooO0O0(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C21901OooOoO0.OooO0OO(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            throw new C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C21875OooOO0o(C20593OooO0Oo.OooO0O0("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().f64790OooOo0 = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.f64816OooOo.f64993OooOoO0;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> OooO0o.OooO0O0<I> registerForActivityResult(AbstractC20431OooO00o<I, O> abstractC20431OooO00o, AbstractC20425OooO0o0 abstractC20425OooO0o0, OooO0o.OooO00o<O> oooO00o) {
        return prepareCallInternal(abstractC20431OooO00o, new OooO(abstractC20425OooO0o0), oooO00o);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        if (abstractC21900OooOoO == null) {
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to Activity"));
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        ContextCompat.startActivity(abstractC21900OooOoO.f64990OooOo, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(C21893OooOOOo.OooO00o("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f64827OooOooo != null) {
            parentFragmentManager.f64832Oooo00o.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f64827OooOooo.OooO00o(intent);
            return;
        }
        AbstractC21900OooOoO<?> abstractC21900OooOoO = parentFragmentManager.f64816OooOo;
        abstractC21900OooOoO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(abstractC21900OooOoO.f64990OooOo, intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC21900OooOoO<?> abstractC21900OooOoO = this.mHost;
        if (abstractC21900OooOoO != null) {
            LayoutInflater layoutInflaterOooO0o = abstractC21900OooOoO.OooO0o();
            LayoutInflaterCompat.setFactory2(layoutInflaterOooO0o, this.mChildFragmentManager.f64802OooO0o);
            return layoutInflaterOooO0o;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void restoreViewState() {
        if (FragmentManager.Oooo0o(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }
}
