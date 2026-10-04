package androidx.transition;

import OooOoo.C20593OooO0Oo;
import OooOoo0.C20703o000000o;
import OooOoo0.C20706o00000oO;
import OooOoo0.o00000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.C21862OooO0Oo;
import androidx.dynamicanimation.animation.C21863OooO0o0;
import androidx.dynamicanimation.animation.OooO0O0;
import androidx.transition.OooOOO0;
import com.aspose.words.ControlChar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO0 implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<C22107OooOo0o> mEndValuesList;
    private OooO0o mEpicenterCallback;
    private OooO[] mListenersCache;
    private OooOo.OooO00o<String, String> mNameOverrides;
    AbstractC22104OooOOoo mPropagation;
    C22100OooO0oo mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<C22107OooOo0o> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final androidx.transition.OooO STRAIGHT_PATH_MOTION = new OooO00o();
    private static ThreadLocal<OooOo.OooO00o<Animator, C22097OooO0Oo>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private OooOo mStartValues = new OooOo();
    private OooOo mEndValues = new OooOo();
    C22105OooOo0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private OooOOO0 mCloneParent = null;
    private ArrayList<OooO> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private androidx.transition.OooO mPathMotion = STRAIGHT_PATH_MOTION;

    public interface OooO {
        void onTransitionCancel(OooOOO0 oooOOO0);

        void onTransitionEnd(OooOOO0 oooOOO0);

        default void onTransitionEnd(OooOOO0 oooOOO0, boolean z) {
            onTransitionEnd(oooOOO0);
        }

        void onTransitionPause(OooOOO0 oooOOO0);

        void onTransitionResume(OooOOO0 oooOOO0);

        void onTransitionStart(OooOOO0 oooOOO0);

        default void onTransitionStart(OooOOO0 oooOOO0, boolean z) {
            onTransitionStart(oooOOO0);
        }
    }

    public class OooO00o extends androidx.transition.OooO {
        @Override // androidx.transition.OooO
        public final Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    public class OooO0O0 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOo.OooO00o f66353OooO00o;

        public OooO0O0(OooOo.OooO00o oooO00o) {
            this.f66353OooO00o = oooO00o;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f66353OooO00o.remove(animator);
            OooOOO0.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            OooOOO0.this.mCurrentAnimators.add(animator);
        }
    }

    public class OooO0OO extends AnimatorListenerAdapter {
        public OooO0OO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooOOO0.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooOOO0$OooO0Oo, reason: case insensitive filesystem */
    public static class C22097OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public View f66356OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f66357OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C22107OooOo0o f66358OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public WindowId f66359OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Animator f66360OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOOO0 f66361OooO0o0;
    }

    public static abstract class OooO0o {
        public abstract Rect OooO00o();
    }

    /* JADX INFO: renamed from: androidx.transition.OooOOO0$OooO0o0, reason: case insensitive filesystem */
    public static class C22098OooO0o0 {
        public static <T> ArrayList<T> OooO00o(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> OooO0O0(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooOOO0$OooO0oO, reason: case insensitive filesystem */
    public static class C22099OooO0oO {
        public static long OooO00o(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void OooO0O0(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooOOO0$OooO0oo, reason: case insensitive filesystem */
    public class C22100OooO0oo extends C22103OooOOo0 implements OooOo00, OooO0O0.InterfaceC21859OooOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f66362OooO00o = -1;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f66363OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f66364OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public C21863OooO0o0 f66365OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public androidx.fragment.app.OooOO0O f66366OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C22109OooOoO0 f66367OooO0o0;

        public C22100OooO0oo() {
            C22109OooOoO0 c22109OooOoO0 = new C22109OooOoO0();
            long[] jArr = new long[20];
            c22109OooOoO0.f66398OooO00o = jArr;
            c22109OooOoO0.f66399OooO0O0 = new float[20];
            c22109OooOoO0.f66400OooO0OO = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.f66367OooO0o0 = c22109OooOoO0;
        }

        @Override // androidx.transition.OooOo00
        public final void OooO00o(androidx.fragment.app.OooOO0O oooOO0O) {
            this.f66366OooO0o = oooOO0O;
            OooO0o();
            this.f66365OooO0Oo.OooO0OO(0.0f);
        }

        @Override // androidx.transition.OooOo00
        public final void OooO0O0() {
            OooO0o();
            this.f66365OooO0Oo.OooO0OO(OooOOO0.this.getTotalDurationMillis() + 1);
        }

        @Override // androidx.transition.OooOo00
        public final long OooO0OO() {
            return OooOOO0.this.getTotalDurationMillis();
        }

        @Override // androidx.transition.OooOo00
        public final void OooO0Oo(long j) {
            if (this.f66365OooO0Oo != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j2 = this.f66362OooO00o;
            if (j == j2 || !this.f66363OooO0O0) {
                return;
            }
            if (!this.f66364OooO0OO) {
                OooOOO0 oooOOO0 = OooOOO0.this;
                if (j != 0 || j2 <= 0) {
                    long totalDurationMillis = oooOOO0.getTotalDurationMillis();
                    if (j == totalDurationMillis && this.f66362OooO00o < totalDurationMillis) {
                        j = 1 + totalDurationMillis;
                    }
                } else {
                    j = -1;
                }
                long j3 = this.f66362OooO00o;
                if (j != j3) {
                    oooOOO0.setCurrentPlayTimeMillis(j, j3);
                    this.f66362OooO00o = j;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            C22109OooOoO0 c22109OooOoO0 = this.f66367OooO0o0;
            int i = (c22109OooOoO0.f66400OooO0OO + 1) % 20;
            c22109OooOoO0.f66400OooO0OO = i;
            c22109OooOoO0.f66398OooO00o[i] = jCurrentAnimationTimeMillis;
            c22109OooOoO0.f66399OooO0O0[i] = j;
        }

        public final void OooO0o() {
            float fSqrt;
            char c;
            long[] jArr;
            if (this.f66365OooO0Oo != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.f66362OooO00o;
            C22109OooOoO0 c22109OooOoO0 = this.f66367OooO0o0;
            int i = c22109OooOoO0.f66400OooO0OO + 1;
            char c2 = ControlChar.FIELD_SEPARATOR_CHAR;
            int i2 = i % 20;
            c22109OooOoO0.f66400OooO0OO = i2;
            c22109OooOoO0.f66398OooO00o[i2] = jCurrentAnimationTimeMillis;
            c22109OooOoO0.f66399OooO0O0[i2] = f;
            C21862OooO0Oo c21862OooO0Oo = new C21862OooO0Oo();
            float f2 = 0.0f;
            c21862OooO0Oo.f64689OooO00o = 0.0f;
            C21863OooO0o0 c21863OooO0o0 = new C21863OooO0o0(c21862OooO0Oo);
            c21863OooO0o0.f64700OooOOoo = null;
            c21863OooO0o0.f64702OooOo00 = Float.MAX_VALUE;
            int i3 = 0;
            c21863OooO0o0.f64701OooOo0 = false;
            this.f66365OooO0Oo = c21863OooO0o0;
            androidx.dynamicanimation.animation.OooO0o oooO0o = new androidx.dynamicanimation.animation.OooO0o();
            oooO0o.f64692OooO0O0 = 1.0f;
            oooO0o.f64693OooO0OO = false;
            oooO0o.OooO00o(200.0f);
            C21863OooO0o0 c21863OooO0o02 = this.f66365OooO0Oo;
            c21863OooO0o02.f64700OooOOoo = oooO0o;
            c21863OooO0o02.f64675OooO0O0 = this.f66362OooO00o;
            c21863OooO0o02.f64676OooO0OO = true;
            if (c21863OooO0o02.f64678OooO0o) {
                throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            ArrayList<OooO0O0.InterfaceC21859OooOOo> arrayList = c21863OooO0o02.f64684OooOO0o;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            C21863OooO0o0 c21863OooO0o03 = this.f66365OooO0Oo;
            int i4 = c22109OooOoO0.f66400OooO0OO;
            long[] jArr2 = c22109OooOoO0.f66398OooO00o;
            long j = Long.MIN_VALUE;
            if (i4 != 0 || jArr2[i4] != Long.MIN_VALUE) {
                long j2 = jArr2[i4];
                long j3 = j2;
                while (true) {
                    long j4 = jArr2[i4];
                    if (j4 == j) {
                        break;
                    }
                    float f3 = j2 - j4;
                    float fAbs = Math.abs(j4 - j3);
                    if (f3 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i4 == 0) {
                        i4 = 20;
                    }
                    i4--;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    j3 = j4;
                    j = Long.MIN_VALUE;
                }
                if (i3 >= 2) {
                    float[] fArr = c22109OooOoO0.f66399OooO0O0;
                    if (i3 == 2) {
                        int i5 = c22109OooOoO0.f66400OooO0OO;
                        int i6 = i5 == 0 ? 19 : i5 - 1;
                        float f4 = jArr2[i5] - jArr2[i6];
                        if (f4 != 0.0f) {
                            fSqrt = (fArr[i5] - fArr[i6]) / f4;
                        }
                    } else {
                        int i7 = c22109OooOoO0.f66400OooO0OO;
                        int i8 = ((i7 - i3) + 21) % 20;
                        int i9 = (i7 + 21) % 20;
                        long j5 = jArr2[i8];
                        float f5 = fArr[i8];
                        int i10 = i8 + 1;
                        int i11 = i10 % 20;
                        float f6 = 0.0f;
                        while (i11 != i9) {
                            long j6 = jArr2[i11];
                            float f7 = f2;
                            int i12 = i9;
                            float f8 = j6 - j5;
                            if (f8 == f7) {
                                c = c2;
                                jArr = jArr2;
                            } else {
                                float f9 = fArr[i11];
                                c = c2;
                                jArr = jArr2;
                                float f10 = (f9 - f5) / f8;
                                float fAbs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * ((double) Math.signum(f6)))))) + f6;
                                if (i11 == i10) {
                                    fAbs2 *= 0.5f;
                                }
                                f6 = fAbs2;
                                f5 = f9;
                                j5 = j6;
                            }
                            i11 = (i11 + 1) % 20;
                            f2 = f7;
                            i9 = i12;
                            c2 = c;
                            jArr2 = jArr;
                        }
                        fSqrt = (float) (Math.sqrt(Math.abs(f6) * 2.0f) * ((double) Math.signum(f6)));
                    }
                    f2 = fSqrt * 1000.0f;
                }
            }
            c21863OooO0o03.f64674OooO00o = f2;
            this.f66365OooO0Oo.f64680OooO0oO = OooOOO0.this.getTotalDurationMillis() + 1;
            C21863OooO0o0 c21863OooO0o04 = this.f66365OooO0Oo;
            c21863OooO0o04.f64681OooO0oo = -1.0f;
            c21863OooO0o04.f64682OooOO0 = 4.0f;
            OooO0O0.InterfaceC21860OooOOo0 interfaceC21860OooOOo0 = new OooO0O0.InterfaceC21860OooOOo0() { // from class: androidx.transition.OooOOO
                @Override // androidx.dynamicanimation.animation.OooO0O0.InterfaceC21860OooOOo0
                public final void OooO00o(float f11) {
                    C22101OooOOOo c22101OooOOOo = OooOOO0.OooOO0.f66370OooO0O0;
                    OooOOO0.C22100OooO0oo c22100OooO0oo = this.f66352OooO00o;
                    OooOOO0 oooOOO0 = OooOOO0.this;
                    if (f11 >= 1.0f) {
                        oooOOO0.notifyListeners(c22101OooOOOo, false);
                        return;
                    }
                    long totalDurationMillis = oooOOO0.getTotalDurationMillis();
                    OooOOO0 oooOOO0OooO0O0 = ((C22105OooOo0) oooOOO0).OooO0O0(0);
                    OooOOO0 oooOOO02 = oooOOO0OooO0O0.mCloneParent;
                    oooOOO0OooO0O0.mCloneParent = null;
                    oooOOO0.setCurrentPlayTimeMillis(-1L, c22100OooO0oo.f66362OooO00o);
                    oooOOO0.setCurrentPlayTimeMillis(totalDurationMillis, -1L);
                    c22100OooO0oo.f66362OooO00o = totalDurationMillis;
                    androidx.fragment.app.OooOO0O oooOO0O = c22100OooO0oo.f66366OooO0o;
                    if (oooOO0O != null) {
                        oooOO0O.run();
                    }
                    oooOOO0.mAnimators.clear();
                    if (oooOOO02 != null) {
                        oooOOO02.notifyListeners(c22101OooOOOo, true);
                    }
                }
            };
            ArrayList<OooO0O0.InterfaceC21860OooOOo0> arrayList2 = c21863OooO0o04.f64683OooOO0O;
            if (arrayList2.contains(interfaceC21860OooOOo0)) {
                return;
            }
            arrayList2.add(interfaceC21860OooOOo0);
        }

        @Override // androidx.dynamicanimation.animation.OooO0O0.InterfaceC21859OooOOo
        public final void OooO0o0(float f) {
            OooOOO0 oooOOO0 = OooOOO0.this;
            long jMax = Math.max(-1L, Math.min(oooOOO0.getTotalDurationMillis() + 1, Math.round(f)));
            oooOOO0.setCurrentPlayTimeMillis(jMax, this.f66362OooO00o);
            this.f66362OooO00o = jMax;
        }

        @Override // androidx.transition.OooOo00
        public final boolean isReady() {
            return this.f66363OooO0O0;
        }

        @Override // androidx.transition.C22103OooOOo0, androidx.transition.OooOOO0.OooO
        public final void onTransitionCancel(OooOOO0 oooOOO0) {
            this.f66364OooO0OO = true;
        }
    }

    public interface OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOOO f66369OooO00o = new OooOOOO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C22101OooOOOo f66370OooO0O0 = new C22101OooOOOo();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final C20703o000000o f66371OooO0OO = new C20703o000000o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000 f66372OooO0Oo = new o00000();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final C20706o00000oO f66373OooO0o0 = new C20706o00000oO();

        void OooO00o(OooO oooO, OooOOO0 oooOOO0, boolean z);
    }

    public OooOOO0() {
    }

    private void addUnmatched(OooOo.OooO00o<View, C22107OooOo0o> oooO00o, OooOo.OooO00o<View, C22107OooOo0o> oooO00o2) {
        for (int i = 0; i < oooO00o.f58550OooOoO0; i++) {
            C22107OooOo0o c22107OooOo0oOooOO0O = oooO00o.OooOO0O(i);
            if (isValidTarget(c22107OooOo0oOooOO0O.f66395OooO0O0)) {
                this.mStartValuesList.add(c22107OooOo0oOooOO0O);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < oooO00o2.f58550OooOoO0; i2++) {
            C22107OooOo0o c22107OooOo0oOooOO0O2 = oooO00o2.OooOO0O(i2);
            if (isValidTarget(c22107OooOo0oOooOO0O2.f66395OooO0O0)) {
                this.mEndValuesList.add(c22107OooOo0oOooOO0O2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(OooOo oooOo, View view, C22107OooOo0o c22107OooOo0o) {
        oooOo.f66381OooO00o.put(view, c22107OooOo0o);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = oooOo.f66382OooO0O0;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            OooOo.OooO00o<String, View> oooO00o = oooOo.f66384OooO0Oo;
            if (oooO00o.containsKey(transitionName)) {
                oooO00o.put(transitionName, null);
            } else {
                oooO00o.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                OooOo.OooOOO<View> oooOOO = oooOo.f66383OooO0OO;
                if (oooOOO.OooO0OO(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    oooOOO.OooO0o0(itemIdAtPosition, view);
                    return;
                }
                View viewOooO0O0 = oooOOO.OooO0O0(itemIdAtPosition);
                if (viewOooO0O0 != null) {
                    viewOooO0O0.setHasTransientState(false);
                    oooOOO.OooO0o0(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C22107OooOo0o c22107OooOo0o = new C22107OooOo0o(view);
                    if (z) {
                        captureStartValues(c22107OooOo0o);
                    } else {
                        captureEndValues(c22107OooOo0o);
                    }
                    c22107OooOo0o.f66396OooO0OO.add(this);
                    capturePropagationValues(c22107OooOo0o);
                    if (z) {
                        addViewValues(this.mStartValues, view, c22107OooOo0o);
                    } else {
                        addViewValues(this.mEndValues, view, c22107OooOo0o);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                captureHierarchy(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        return i > 0 ? z ? C22098OooO0o0.OooO00o(arrayList, Integer.valueOf(i)) : C22098OooO0o0.OooO0O0(arrayList, Integer.valueOf(i)) : arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? C22098OooO0o0.OooO00o(arrayList, t) : C22098OooO0o0.OooO0O0(arrayList, t) : arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        return cls != null ? z ? C22098OooO0o0.OooO00o(arrayList, cls) : C22098OooO0o0.OooO0O0(arrayList, cls) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? C22098OooO0o0.OooO00o(arrayList, view) : C22098OooO0o0.OooO0O0(arrayList, view) : arrayList;
    }

    private static OooOo.OooO00o<Animator, C22097OooO0Oo> getRunningAnimators() {
        OooOo.OooO00o<Animator, C22097OooO0Oo> oooO00o = sRunningAnimators.get();
        if (oooO00o != null) {
            return oooO00o;
        }
        OooOo.OooO00o<Animator, C22097OooO0Oo> oooO00o2 = new OooOo.OooO00o<>();
        sRunningAnimators.set(oooO00o2);
        return oooO00o2;
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean isValueChanged(C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2, String str) {
        Object obj = c22107OooOo0o.f66394OooO00o.get(str);
        Object obj2 = c22107OooOo0o2.f66394OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(OooOo.OooO00o<View, C22107OooOo0o> oooO00o, OooOo.OooO00o<View, C22107OooOo0o> oooO00o2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C22107OooOo0o c22107OooOo0o = oooO00o.get(viewValueAt);
                C22107OooOo0o c22107OooOo0o2 = oooO00o2.get(view);
                if (c22107OooOo0o != null && c22107OooOo0o2 != null) {
                    this.mStartValuesList.add(c22107OooOo0o);
                    this.mEndValuesList.add(c22107OooOo0o2);
                    oooO00o.remove(viewValueAt);
                    oooO00o2.remove(view);
                }
            }
        }
    }

    private void matchInstances(OooOo.OooO00o<View, C22107OooOo0o> oooO00o, OooOo.OooO00o<View, C22107OooOo0o> oooO00o2) {
        C22107OooOo0o c22107OooOo0oRemove;
        for (int i = oooO00o.f58550OooOoO0 - 1; i >= 0; i--) {
            View viewOooO0oO = oooO00o.OooO0oO(i);
            if (viewOooO0oO != null && isValidTarget(viewOooO0oO) && (c22107OooOo0oRemove = oooO00o2.remove(viewOooO0oO)) != null && isValidTarget(c22107OooOo0oRemove.f66395OooO0O0)) {
                this.mStartValuesList.add(oooO00o.OooO(i));
                this.mEndValuesList.add(c22107OooOo0oRemove);
            }
        }
    }

    private void matchItemIds(OooOo.OooO00o<View, C22107OooOo0o> oooO00o, OooOo.OooO00o<View, C22107OooOo0o> oooO00o2, OooOo.OooOOO<View> oooOOO, OooOo.OooOOO<View> oooOOO2) {
        View viewOooO0O0;
        int iOooO0oO = oooOOO.OooO0oO();
        for (int i = 0; i < iOooO0oO; i++) {
            View viewOooO0oo = oooOOO.OooO0oo(i);
            if (viewOooO0oo != null && isValidTarget(viewOooO0oo) && (viewOooO0O0 = oooOOO2.OooO0O0(oooOOO.OooO0Oo(i))) != null && isValidTarget(viewOooO0O0)) {
                C22107OooOo0o c22107OooOo0o = oooO00o.get(viewOooO0oo);
                C22107OooOo0o c22107OooOo0o2 = oooO00o2.get(viewOooO0O0);
                if (c22107OooOo0o != null && c22107OooOo0o2 != null) {
                    this.mStartValuesList.add(c22107OooOo0o);
                    this.mEndValuesList.add(c22107OooOo0o2);
                    oooO00o.remove(viewOooO0oo);
                    oooO00o2.remove(viewOooO0O0);
                }
            }
        }
    }

    private void matchNames(OooOo.OooO00o<View, C22107OooOo0o> oooO00o, OooOo.OooO00o<View, C22107OooOo0o> oooO00o2, OooOo.OooO00o<String, View> oooO00o3, OooOo.OooO00o<String, View> oooO00o4) {
        View view;
        int i = oooO00o3.f58550OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            View viewOooOO0O = oooO00o3.OooOO0O(i2);
            if (viewOooOO0O != null && isValidTarget(viewOooOO0O) && (view = oooO00o4.get(oooO00o3.OooO0oO(i2))) != null && isValidTarget(view)) {
                C22107OooOo0o c22107OooOo0o = oooO00o.get(viewOooOO0O);
                C22107OooOo0o c22107OooOo0o2 = oooO00o2.get(view);
                if (c22107OooOo0o != null && c22107OooOo0o2 != null) {
                    this.mStartValuesList.add(c22107OooOo0o);
                    this.mEndValuesList.add(c22107OooOo0o2);
                    oooO00o.remove(viewOooOO0O);
                    oooO00o2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(OooOo oooOo, OooOo oooOo2) {
        OooOo.OooO00o<View, C22107OooOo0o> oooO00o = new OooOo.OooO00o<>(oooOo.f66381OooO00o);
        OooOo.OooO00o<View, C22107OooOo0o> oooO00o2 = new OooOo.OooO00o<>(oooOo2.f66381OooO00o);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                addUnmatched(oooO00o, oooO00o2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                matchInstances(oooO00o, oooO00o2);
            } else if (i2 == 2) {
                matchNames(oooO00o, oooO00o2, oooOo.f66384OooO0Oo, oooOo2.f66384OooO0Oo);
            } else if (i2 == 3) {
                matchIds(oooO00o, oooO00o2, oooOo.f66382OooO0O0, oooOo2.f66382OooO0O0);
            } else if (i2 == 4) {
                matchItemIds(oooO00o, oooO00o2, oooOo.f66383OooO0OO, oooOo2.f66383OooO0OO);
            }
            i++;
        }
    }

    private void notifyFromTransition(OooOOO0 oooOOO0, OooOO0 oooOO02, boolean z) {
        OooOOO0 oooOOO02 = this.mCloneParent;
        if (oooOOO02 != null) {
            oooOOO02.notifyFromTransition(oooOOO0, oooOO02, z);
        }
        ArrayList<OooO> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        OooO[] oooOArr = this.mListenersCache;
        if (oooOArr == null) {
            oooOArr = new OooO[size];
        }
        this.mListenersCache = null;
        OooO[] oooOArr2 = (OooO[]) this.mListeners.toArray(oooOArr);
        for (int i = 0; i < size; i++) {
            oooOO02.OooO00o(oooOArr2[i], oooOOO0, z);
            oooOArr2[i] = null;
        }
        this.mListenersCache = oooOArr2;
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException(C20593OooO0Oo.OooO0O0("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, OooOo.OooO00o<Animator, C22097OooO0Oo> oooO00o) {
        if (animator != null) {
            animator.addListener(new OooO0O0(oooO00o));
            animate(animator);
        }
    }

    public OooOOO0 addListener(OooO oooO) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(oooO);
        return this;
    }

    public OooOOO0 addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new OooO0OO());
        animator.start();
    }

    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(OooOO0.f66371OooO0OO, false);
    }

    public abstract void captureEndValues(C22107OooOo0o c22107OooOo0o);

    public void capturePropagationValues(C22107OooOo0o c22107OooOo0o) {
    }

    public abstract void captureStartValues(C22107OooOo0o c22107OooOo0o);

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        OooOo.OooO00o<String, String> oooO00o;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    C22107OooOo0o c22107OooOo0o = new C22107OooOo0o(viewFindViewById);
                    if (z) {
                        captureStartValues(c22107OooOo0o);
                    } else {
                        captureEndValues(c22107OooOo0o);
                    }
                    c22107OooOo0o.f66396OooO0OO.add(this);
                    capturePropagationValues(c22107OooOo0o);
                    if (z) {
                        addViewValues(this.mStartValues, viewFindViewById, c22107OooOo0o);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, c22107OooOo0o);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                C22107OooOo0o c22107OooOo0o2 = new C22107OooOo0o(view);
                if (z) {
                    captureStartValues(c22107OooOo0o2);
                } else {
                    captureEndValues(c22107OooOo0o2);
                }
                c22107OooOo0o2.f66396OooO0OO.add(this);
                capturePropagationValues(c22107OooOo0o2);
                if (z) {
                    addViewValues(this.mStartValues, view, c22107OooOo0o2);
                } else {
                    addViewValues(this.mEndValues, view, c22107OooOo0o2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (oooO00o = this.mNameOverrides) == null) {
            return;
        }
        int i3 = oooO00o.f58550OooOoO0;
        ArrayList arrayList3 = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList3.add(this.mStartValues.f66384OooO0Oo.remove(this.mNameOverrides.OooO0oO(i4)));
        }
        for (int i5 = 0; i5 < i3; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.mStartValues.f66384OooO0Oo.put(this.mNameOverrides.OooOO0O(i5), view2);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f66381OooO00o.clear();
            this.mStartValues.f66382OooO0O0.clear();
            this.mStartValues.f66383OooO0OO.OooO00o();
        } else {
            this.mEndValues.f66381OooO00o.clear();
            this.mEndValues.f66382OooO0O0.clear();
            this.mEndValues.f66383OooO0OO.OooO00o();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return null;
    }

    public void createAnimators(ViewGroup viewGroup, OooOo oooOo, OooOo oooOo2, ArrayList<C22107OooOo0o> arrayList, ArrayList<C22107OooOo0o> arrayList2) {
        int i;
        boolean z;
        int i2;
        View view;
        C22107OooOo0o c22107OooOo0o;
        Animator animator;
        Animator animator2;
        C22107OooOo0o c22107OooOo0o2;
        OooOo.OooO00o<Animator, C22097OooO0Oo> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = getRootTransition().mSeekController != null;
        int i3 = 0;
        while (i3 < size) {
            C22107OooOo0o c22107OooOo0o3 = arrayList.get(i3);
            C22107OooOo0o c22107OooOo0o4 = arrayList2.get(i3);
            if (c22107OooOo0o3 != null && !c22107OooOo0o3.f66396OooO0OO.contains(this)) {
                c22107OooOo0o3 = null;
            }
            if (c22107OooOo0o4 != null && !c22107OooOo0o4.f66396OooO0OO.contains(this)) {
                c22107OooOo0o4 = null;
            }
            if ((c22107OooOo0o3 != null || c22107OooOo0o4 != null) && (c22107OooOo0o3 == null || c22107OooOo0o4 == null || isTransitionRequired(c22107OooOo0o3, c22107OooOo0o4))) {
                Animator animatorCreateAnimator = createAnimator(viewGroup, c22107OooOo0o3, c22107OooOo0o4);
                if (animatorCreateAnimator != null) {
                    if (c22107OooOo0o4 != null) {
                        view = c22107OooOo0o4.f66395OooO0O0;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            c22107OooOo0o2 = new C22107OooOo0o(view);
                            C22107OooOo0o c22107OooOo0o5 = oooOo2.f66381OooO00o.get(view);
                            i = size;
                            if (c22107OooOo0o5 != null) {
                                int i4 = 0;
                                while (i4 < transitionProperties.length) {
                                    HashMap map = c22107OooOo0o2.f66394OooO00o;
                                    boolean z3 = z2;
                                    String str = transitionProperties[i4];
                                    map.put(str, c22107OooOo0o5.f66394OooO00o.get(str));
                                    i4++;
                                    z2 = z3;
                                    i3 = i3;
                                }
                            }
                            z = z2;
                            i2 = i3;
                            int i5 = runningAnimators.f58550OooOoO0;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = animatorCreateAnimator;
                                    break;
                                }
                                C22097OooO0Oo c22097OooO0Oo = runningAnimators.get(runningAnimators.OooO0oO(i6));
                                if (c22097OooO0Oo.f66358OooO0OO != null && c22097OooO0Oo.f66356OooO00o == view && c22097OooO0Oo.f66357OooO0O0.equals(getName()) && c22097OooO0Oo.f66358OooO0OO.equals(c22107OooOo0o2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i = size;
                            z = z2;
                            i2 = i3;
                            animator2 = animatorCreateAnimator;
                            c22107OooOo0o2 = null;
                        }
                        animator = animator2;
                        c22107OooOo0o = c22107OooOo0o2;
                    } else {
                        i = size;
                        z = z2;
                        i2 = i3;
                        view = c22107OooOo0o3.f66395OooO0O0;
                        c22107OooOo0o = null;
                        animator = animatorCreateAnimator;
                    }
                    if (animator != null) {
                        String name = getName();
                        WindowId windowId = viewGroup.getWindowId();
                        C22097OooO0Oo c22097OooO0Oo2 = new C22097OooO0Oo();
                        c22097OooO0Oo2.f66356OooO00o = view;
                        c22097OooO0Oo2.f66357OooO0O0 = name;
                        c22097OooO0Oo2.f66358OooO0OO = c22107OooOo0o;
                        c22097OooO0Oo2.f66359OooO0Oo = windowId;
                        c22097OooO0Oo2.f66361OooO0o0 = this;
                        c22097OooO0Oo2.f66360OooO0o = animator;
                        Animator animator3 = animator;
                        if (z) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            animator3 = animatorSet;
                        }
                        runningAnimators.put(animator3, c22097OooO0Oo2);
                        this.mAnimators.add(animator3);
                    }
                }
                i3 = i2 + 1;
                size = i;
                z2 = z;
            }
            i = size;
            z = z2;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
            z2 = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                C22097OooO0Oo c22097OooO0Oo3 = runningAnimators.get(this.mAnimators.get(sparseIntArray.keyAt(i7)));
                c22097OooO0Oo3.f66360OooO0o.setStartDelay(c22097OooO0Oo3.f66360OooO0o.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - LocationRequestCompat.PASSIVE_INTERVAL));
            }
        }
    }

    public OooOo00 createSeekController() {
        C22100OooO0oo c22100OooO0oo = new C22100OooO0oo();
        this.mSeekController = c22100OooO0oo;
        addListener(c22100OooO0oo);
        return this.mSeekController;
    }

    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(OooOO0.f66370OooO0O0, false);
            for (int i2 = 0; i2 < this.mStartValues.f66383OooO0OO.OooO0oO(); i2++) {
                View viewOooO0oo = this.mStartValues.f66383OooO0OO.OooO0oo(i2);
                if (viewOooO0oo != null) {
                    viewOooO0oo.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f66383OooO0OO.OooO0oO(); i3++) {
                View viewOooO0oo2 = this.mEndValues.f66383OooO0OO.OooO0oo(i3);
                if (viewOooO0oo2 != null) {
                    viewOooO0oo2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public OooOOO0 excludeChildren(View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    public OooOOO0 excludeTarget(View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void forceToEnd(ViewGroup viewGroup) {
        OooOo.OooO00o<Animator, C22097OooO0Oo> runningAnimators = getRunningAnimators();
        int i = runningAnimators.f58550OooOoO0;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        OooOo.OooO00o oooO00o = new OooOo.OooO00o(runningAnimators);
        runningAnimators.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            C22097OooO0Oo c22097OooO0Oo = (C22097OooO0Oo) oooO00o.OooOO0O(i2);
            if (c22097OooO0Oo.f66356OooO00o != null && windowId.equals(c22097OooO0Oo.f66359OooO0Oo)) {
                ((Animator) oooO00o.OooO0oO(i2)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        OooO0o oooO0o = this.mEpicenterCallback;
        if (oooO0o == null) {
            return null;
        }
        return oooO0o.OooO00o();
    }

    public OooO0o getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.mEndValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.mStartValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C22107OooOo0o getMatchedTransitionValues(View view, boolean z) {
        C22105OooOo0 c22105OooOo0 = this.mParent;
        if (c22105OooOo0 != null) {
            return c22105OooOo0.getMatchedTransitionValues(view, z);
        }
        ArrayList<C22107OooOo0o> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C22107OooOo0o c22107OooOo0o = arrayList.get(i);
            if (c22107OooOo0o == null) {
                return null;
            }
            if (c22107OooOo0o.f66395OooO0O0 == view) {
                break;
            }
            i++;
        }
    }

    public String getName() {
        return this.mName;
    }

    public androidx.transition.OooO getPathMotion() {
        return this.mPathMotion;
    }

    public AbstractC22104OooOOoo getPropagation() {
        return null;
    }

    public final OooOOO0 getRootTransition() {
        C22105OooOo0 c22105OooOo0 = this.mParent;
        return c22105OooOo0 != null ? c22105OooOo0.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public C22107OooOo0o getTransitionValues(View view, boolean z) {
        C22105OooOo0 c22105OooOo0 = this.mParent;
        if (c22105OooOo0 != null) {
            return c22105OooOo0.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f66381OooO00o.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        if (c22107OooOo0o != null && c22107OooOo0o2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(c22107OooOo0o, c22107OooOo0o2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c22107OooOo0o.f66394OooO00o.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(c22107OooOo0o, c22107OooOo0o2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && ViewCompat.getTransitionName(view) != null && this.mTargetNameExcludes.contains(ViewCompat.getTransitionName(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.getTransitionName(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(OooOO0 oooOO02, boolean z) {
        notifyFromTransition(this, oooOO02, z);
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(OooOO0.f66372OooO0Oo, false);
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        C22097OooO0Oo c22097OooO0Oo;
        View view;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        OooOo.OooO00o<Animator, C22097OooO0Oo> runningAnimators = getRunningAnimators();
        int i = runningAnimators.f58550OooOoO0;
        WindowId windowId = viewGroup.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            Animator animatorOooO0oO = runningAnimators.OooO0oO(i2);
            if (animatorOooO0oO != null && (c22097OooO0Oo = runningAnimators.get(animatorOooO0oO)) != null && (view = c22097OooO0Oo.f66356OooO00o) != null && windowId.equals(c22097OooO0Oo.f66359OooO0Oo)) {
                C22107OooOo0o transitionValues = getTransitionValues(view, true);
                C22107OooOo0o matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f66381OooO00o.get(view);
                }
                if (transitionValues != null || matchedTransitionValues != null) {
                    OooOOO0 oooOOO0 = c22097OooO0Oo.f66361OooO0o0;
                    if (oooOOO0.isTransitionRequired(c22097OooO0Oo.f66358OooO0OO, matchedTransitionValues)) {
                        if (oooOOO0.getRootTransition().mSeekController != null) {
                            animatorOooO0oO.cancel();
                            oooOOO0.mCurrentAnimators.remove(animatorOooO0oO);
                            runningAnimators.remove(animatorOooO0oO);
                            if (oooOOO0.mCurrentAnimators.size() == 0) {
                                oooOOO0.notifyListeners(OooOO0.f66371OooO0OO, false);
                                if (!oooOOO0.mEnded) {
                                    oooOOO0.mEnded = true;
                                    oooOOO0.notifyListeners(OooOO0.f66370OooO0O0, false);
                                }
                            }
                        } else if (animatorOooO0oO.isRunning() || animatorOooO0oO.isStarted()) {
                            animatorOooO0oO.cancel();
                        } else {
                            runningAnimators.remove(animatorOooO0oO);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            C22100OooO0oo c22100OooO0oo = this.mSeekController;
            OooOOO0 oooOOO02 = OooOOO0.this;
            long j = oooOOO02.getTotalDurationMillis() == 0 ? 1L : 0L;
            oooOOO02.setCurrentPlayTimeMillis(j, c22100OooO0oo.f66362OooO00o);
            c22100OooO0oo.f66362OooO00o = j;
            this.mSeekController.f66363OooO0O0 = true;
        }
    }

    public void prepareAnimatorsForSeeking() {
        OooOo.OooO00o<Animator, C22097OooO0Oo> runningAnimators = getRunningAnimators();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = this.mAnimators.get(i);
            C22097OooO0Oo c22097OooO0Oo = runningAnimators.get(animator);
            if (animator != null && c22097OooO0Oo != null) {
                long duration = getDuration();
                Animator animator2 = c22097OooO0Oo.f66360OooO0o;
                if (duration >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, C22099OooO0oO.OooO00o(animator));
            }
        }
        this.mAnimators.clear();
    }

    public OooOOO0 removeListener(OooO oooO) {
        OooOOO0 oooOOO0;
        ArrayList<OooO> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(oooO) && (oooOOO0 = this.mCloneParent) != null) {
                oooOOO0.removeListener(oooO);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public OooOOO0 removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(OooOO0.f66373OooO0o0, false);
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        OooOo.OooO00o<Animator, C22097OooO0Oo> runningAnimators = getRunningAnimators();
        for (Animator animator : this.mAnimators) {
            if (runningAnimators.containsKey(animator)) {
                start();
                runAnimator(animator, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    public void setCurrentPlayTimeMillis(long j, long j2) {
        long totalDurationMillis = getTotalDurationMillis();
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(OooOO0.f66369OooO00o, z);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C22099OooO0oO.OooO0O0(animator, Math.min(Math.max(0L, j), C22099OooO0oO.OooO00o(animator)));
            i++;
            totalDurationMillis = totalDurationMillis;
        }
        long j3 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.mEnded = true;
        }
        notifyListeners(OooOO0.f66370OooO0O0, z);
    }

    public OooOOO0 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(OooO0o oooO0o) {
        this.mEpicenterCallback = oooO0o;
    }

    public OooOOO0 setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(androidx.transition.OooO oooO) {
        if (oooO == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = oooO;
        }
    }

    public void setPropagation(AbstractC22104OooOOoo abstractC22104OooOOoo) {
    }

    public OooOOO0 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(OooOO0.f66369OooO00o, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString("");
    }

    public OooOOO0 addTarget(int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public OooOOO0 mo80680clone() {
        try {
            OooOOO0 oooOOO0 = (OooOOO0) super.clone();
            oooOOO0.mAnimators = new ArrayList<>();
            oooOOO0.mStartValues = new OooOo();
            oooOOO0.mEndValues = new OooOo();
            oooOOO0.mStartValuesList = null;
            oooOOO0.mEndValuesList = null;
            oooOOO0.mSeekController = null;
            oooOOO0.mCloneParent = this;
            oooOOO0.mListeners = null;
            return oooOOO0;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public OooOOO0 excludeChildren(int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    public OooOOO0 excludeTarget(int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    public OooOOO0 removeTarget(int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public OooOOO0 addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public OooOOO0 excludeChildren(Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    public OooOOO0 excludeTarget(String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    public OooOOO0 removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public OooOOO0 excludeTarget(Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    public OooOOO0 removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public OooOOO0 addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public OooOOO0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C22096OooOO0o.f66350OooO00o);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (namedInt >= 0) {
            setDuration(namedInt);
        }
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (namedInt2 > 0) {
            setStartDelay(namedInt2);
        }
        int namedResourceId = TypedArrayUtils.getNamedResourceId(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, namedResourceId));
        }
        String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (namedString != null) {
            setMatchOrder(parseMatchOrder(namedString));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
