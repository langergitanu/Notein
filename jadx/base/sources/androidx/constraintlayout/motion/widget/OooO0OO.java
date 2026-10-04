package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0OO;
import androidx.constraintlayout.widget.OooO0o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import o0000O00.C24140OooO0Oo;
import o000OO.AbstractC24443OooO0Oo;
import o000OO.C24445OooO0oO;
import o000OO.C24447OooOO0o;
import o000OO.InterpolatorC24450OooOOo0;
import o000OO.OooOOO;
import o000OO.OooOOO0;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f63787OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24445OooO0oO f63791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f63792OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0OO.OooO00o f63793OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f63795OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f63796OooOO0O;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Context f63800OooOOOO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f63788OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f63789OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f63790OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f63794OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f63786OooO = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f63797OooOO0o = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f63799OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f63798OooOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f63801OooOOOo = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f63803OooOOo0 = -1;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f63802OooOOo = -1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f63804OooOOoo = -1;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f63806OooOo00 = -1;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f63805OooOo0 = -1;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f63807OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f63808OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f63809OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOOO0 f63810OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f63811OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C21623OooO0Oo f63812OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C24140OooO0Oo f63813OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Interpolator f63814OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f63815OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f63816OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public long f63817OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final Rect f63818OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final boolean f63819OooOOO0;

        public OooO00o(C21623OooO0Oo c21623OooO0Oo, OooOOO0 oooOOO0, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            C24140OooO0Oo c24140OooO0Oo = new C24140OooO0Oo();
            c24140OooO0Oo.f81375OooO00o = new HashMap<>();
            this.f63813OooO0o0 = c24140OooO0Oo;
            this.f63815OooO0oo = false;
            this.f63818OooOO0o = new Rect();
            this.f63819OooOOO0 = false;
            this.f63812OooO0o = c21623OooO0Oo;
            this.f63810OooO0OO = oooOOO0;
            this.f63811OooO0Oo = i2;
            this.f63817OooOO0O = System.nanoTime();
            if (c21623OooO0Oo.f63825OooO0o0 == null) {
                c21623OooO0Oo.f63825OooO0o0 = new ArrayList<>();
            }
            c21623OooO0Oo.f63825OooO0o0.add(this);
            this.f63814OooO0oO = interpolator;
            this.f63808OooO00o = i4;
            this.f63809OooO0O0 = i5;
            if (i3 == 3) {
                this.f63819OooOOO0 = true;
            }
            this.f63816OooOO0 = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            OooO00o();
        }

        public final void OooO00o() {
            boolean z = this.f63815OooO0oo;
            C21623OooO0Oo c21623OooO0Oo = this.f63812OooO0o;
            Interpolator interpolator = this.f63814OooO0oO;
            OooOOO0 oooOOO0 = this.f63810OooO0OO;
            int i = this.f63809OooO0O0;
            int i2 = this.f63808OooO00o;
            if (z) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.f63817OooOO0O;
                this.f63817OooOO0O = jNanoTime;
                float f = this.f63807OooO - (((float) (j * 1.0E-6d)) * this.f63816OooOO0);
                this.f63807OooO = f;
                if (f < 0.0f) {
                    this.f63807OooO = 0.0f;
                }
                boolean zOooO0O0 = oooOOO0.OooO0O0(interpolator == null ? this.f63807OooO : interpolator.getInterpolation(this.f63807OooO), jNanoTime, oooOOO0.f82596OooO00o, this.f63813OooO0o0);
                if (this.f63807OooO <= 0.0f) {
                    if (i2 != -1) {
                        oooOOO0.f82596OooO00o.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        oooOOO0.f82596OooO00o.setTag(i, null);
                    }
                    c21623OooO0Oo.f63824OooO0o.add(this);
                }
                if (this.f63807OooO > 0.0f || zOooO0O0) {
                    c21623OooO0Oo.f63820OooO00o.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = jNanoTime2 - this.f63817OooOO0O;
            this.f63817OooOO0O = jNanoTime2;
            float f2 = (((float) (j2 * 1.0E-6d)) * this.f63816OooOO0) + this.f63807OooO;
            this.f63807OooO = f2;
            if (f2 >= 1.0f) {
                this.f63807OooO = 1.0f;
            }
            boolean zOooO0O02 = oooOOO0.OooO0O0(interpolator == null ? this.f63807OooO : interpolator.getInterpolation(this.f63807OooO), jNanoTime2, oooOOO0.f82596OooO00o, this.f63813OooO0o0);
            if (this.f63807OooO >= 1.0f) {
                if (i2 != -1) {
                    oooOOO0.f82596OooO00o.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    oooOOO0.f82596OooO00o.setTag(i, null);
                }
                if (!this.f63819OooOOO0) {
                    c21623OooO0Oo.f63824OooO0o.add(this);
                }
            }
            if (this.f63807OooO < 1.0f || zOooO0O02) {
                c21623OooO0Oo.f63820OooO00o.invalidate();
            }
        }

        public final void OooO0O0() {
            this.f63815OooO0oo = true;
            int i = this.f63811OooO0Oo;
            if (i != -1) {
                this.f63816OooOO0 = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f63812OooO0o.f63820OooO00o.invalidate();
            this.f63817OooOO0O = System.nanoTime();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooO0OO(Context context, XmlResourceParser xmlResourceParser) {
        byte b;
        this.f63800OooOOOO = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            b = !name.equals("ConstraintOverride") ? (byte) -1 : (byte) 2;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                b = 1;
                                break;
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                b = 4;
                                break;
                            }
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                b = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b == 0) {
                        OooO0Oo(context, xmlResourceParser);
                    } else if (b == 1) {
                        this.f63791OooO0o = new C24445OooO0oO(context, xmlResourceParser);
                    } else if (b == 2) {
                        this.f63793OooO0oO = androidx.constraintlayout.widget.OooO0OO.OooO0Oo(context, xmlResourceParser);
                    } else if (b == 3 || b == 4) {
                        androidx.constraintlayout.widget.OooO00o.OooO0Oo(context, xmlResourceParser, this.f63793OooO0oO.f64015OooO0oO);
                    } else {
                        Log.e("ViewTransition", o000OO.OooO00o.OooO00o() + " unknown tag " + name);
                        StringBuilder sb = new StringBuilder();
                        sb.append(".xml:");
                        sb.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public final void OooO00o(C21623OooO0Oo c21623OooO0Oo, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.OooO0OO oooO0OO, View... viewArr) {
        if (this.f63789OooO0OO) {
            return;
        }
        int i2 = this.f63792OooO0o0;
        Interpolator interpolatorLoadInterpolator = null;
        if (i2 != 2) {
            OooO0OO.OooO00o oooO00o = this.f63793OooO0oO;
            if (i2 == 1) {
                for (int i3 : motionLayout.getConstraintSetIds()) {
                    if (i3 != i) {
                        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = motionLayout.f63663OooOo0o;
                        androidx.constraintlayout.widget.OooO0OO oooO0OOOooO0O0 = oooO00o2 == null ? null : oooO00o2.OooO0O0(i3);
                        for (View view : viewArr) {
                            OooO0OO.OooO00o oooO00oOooOO0O = oooO0OOOooO0O0.OooOO0O(view.getId());
                            if (oooO00o != null) {
                                OooO0OO.OooO00o.C19006OooO00o c19006OooO00o = oooO00o.f64016OooO0oo;
                                if (c19006OooO00o != null) {
                                    c19006OooO00o.OooO0o0(oooO00oOooOO0O);
                                }
                                oooO00oOooOO0O.f64015OooO0oO.putAll(oooO00o.f64015OooO0oO);
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.widget.OooO0OO oooO0OO2 = new androidx.constraintlayout.widget.OooO0OO();
            HashMap<Integer, OooO0OO.OooO00o> map = oooO0OO2.f64007OooO0o;
            map.clear();
            for (Integer num : oooO0OO.f64007OooO0o.keySet()) {
                OooO0OO.OooO00o oooO00o3 = oooO0OO.f64007OooO0o.get(num);
                if (oooO00o3 != null) {
                    map.put(num, oooO00o3.clone());
                }
            }
            for (View view2 : viewArr) {
                OooO0OO.OooO00o oooO00oOooOO0O2 = oooO0OO2.OooOO0O(view2.getId());
                if (oooO00o != null) {
                    OooO0OO.OooO00o.C19006OooO00o c19006OooO00o2 = oooO00o.f64016OooO0oo;
                    if (c19006OooO00o2 != null) {
                        c19006OooO00o2.OooO0o0(oooO00oOooOO0O2);
                    }
                    oooO00oOooOO0O2.f64015OooO0oO.putAll(oooO00o.f64015OooO0oO);
                }
            }
            androidx.constraintlayout.motion.widget.OooO00o oooO00o4 = motionLayout.f63663OooOo0o;
            if (oooO00o4 != null) {
                oooO00o4.f63723OooO0oO.put(i, oooO0OO2);
            }
            motionLayout.f63663OooOo0o.OooO0O0(motionLayout.f63664OooOoO);
            motionLayout.f63663OooOo0o.OooO0O0(motionLayout.f63668OooOoo0);
            throw null;
        }
        View view3 = viewArr[0];
        OooOOO0 oooOOO0 = new OooOOO0();
        new Rect();
        oooOOO0.f82597OooO0O0 = false;
        oooOOO0.f82598OooO0OO = -1;
        oooOOO0.f82599OooO0Oo = new OooOOO();
        oooOOO0.f82601OooO0o0 = new OooOOO();
        oooOOO0.f82600OooO0o = new C24447OooOO0o();
        oooOOO0.f82602OooO0oO = new C24447OooOO0o();
        oooOOO0.f82604OooOO0 = 1.0f;
        oooOOO0.f82610OooOOOo = new float[4];
        oooOOO0.f82612OooOOo0 = new ArrayList<>();
        oooOOO0.f82611OooOOo = new ArrayList<>();
        oooOOO0.f82618OooOo0o = -1;
        oooOOO0.f82614OooOo = -1;
        oooOOO0.f82620OooOoO0 = null;
        oooOOO0.f82619OooOoO = -1;
        oooOOO0.f82621OooOoOO = Float.NaN;
        oooOOO0.f82622OooOoo0 = false;
        oooOOO0.f82596OooO00o = view3;
        view3.getId();
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.OooO00o) {
            ((ConstraintLayout.OooO00o) layoutParams).getClass();
        }
        OooOOO oooOOO = oooOOO0.f82599OooO0Oo;
        oooOOO.f82582OooOo = 0.0f;
        oooOOO.f82585OooOoO0 = 0.0f;
        oooOOO0.f82622OooOoo0 = true;
        float x = view3.getX();
        float y = view3.getY();
        float width = view3.getWidth();
        float height = view3.getHeight();
        oooOOO.f82584OooOoO = x;
        oooOOO.f82586OooOoOO = y;
        oooOOO.f82588OooOoo0 = width;
        oooOOO.f82587OooOoo = height;
        float x2 = view3.getX();
        float y2 = view3.getY();
        float width2 = view3.getWidth();
        float height2 = view3.getHeight();
        OooOOO oooOOO2 = oooOOO0.f82601OooO0o0;
        oooOOO2.f82584OooOoO = x2;
        oooOOO2.f82586OooOoOO = y2;
        oooOOO2.f82588OooOoo0 = width2;
        oooOOO2.f82587OooOoo = height2;
        oooOOO0.f82600OooO0o.OooO0OO(view3);
        oooOOO0.f82602OooO0oO.OooO0OO(view3);
        ArrayList<AbstractC24443OooO0Oo> arrayList = this.f63791OooO0o.f82515OooO00o.get(-1);
        if (arrayList != null) {
            oooOOO0.f82611OooOOo.addAll(arrayList);
        }
        oooOOO0.OooO0OO(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        int i4 = this.f63794OooO0oo;
        int i5 = this.f63786OooO;
        int i6 = this.f63788OooO0O0;
        Context context = motionLayout.getContext();
        int i7 = this.f63797OooOO0o;
        if (i7 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f63798OooOOO);
        } else if (i7 == -1) {
            interpolatorLoadInterpolator = new InterpolatorC24450OooOOo0(o0000O00.OooO0OO.OooO0O0(this.f63799OooOOO0));
        } else if (i7 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i7 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i7 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i7 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else if (i7 == 5) {
            interpolatorLoadInterpolator = new OvershootInterpolator();
        } else if (i7 == 6) {
            interpolatorLoadInterpolator = new AnticipateInterpolator();
        }
        new OooO00o(c21623OooO0Oo, oooOOO0, i4, i5, i6, interpolatorLoadInterpolator, this.f63801OooOOOo, this.f63803OooOOo0);
    }

    public final boolean OooO0O0(View view) {
        int i = this.f63802OooOOo;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f63804OooOOoo;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean OooO0OO(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f63795OooOO0 == -1 && this.f63796OooOO0O == null) || !OooO0O0(view)) {
            return false;
        }
        if (view.getId() == this.f63795OooOO0) {
            return true;
        }
        return this.f63796OooOO0O != null && (view.getLayoutParams() instanceof ConstraintLayout.OooO00o) && (str = ((ConstraintLayout.OooO00o) view.getLayoutParams()).f63925OoooOo0) != null && str.matches(this.f63796OooOO0O);
    }

    public final void OooO0Oo(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64148OooOo);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f63787OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f63787OooO00o);
            } else if (index == 8) {
                int i2 = MotionLayout.f63661ooOO;
                if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f63796OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f63795OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63795OooOO0);
                }
            } else if (index == 9) {
                this.f63788OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, this.f63788OooO0O0);
            } else if (index == 12) {
                this.f63789OooO0OO = typedArrayObtainStyledAttributes.getBoolean(index, this.f63789OooO0OO);
            } else if (index == 10) {
                this.f63790OooO0Oo = typedArrayObtainStyledAttributes.getInt(index, this.f63790OooO0Oo);
            } else if (index == 4) {
                this.f63794OooO0oo = typedArrayObtainStyledAttributes.getInt(index, this.f63794OooO0oo);
            } else if (index == 13) {
                this.f63786OooO = typedArrayObtainStyledAttributes.getInt(index, this.f63786OooO);
            } else if (index == 14) {
                this.f63792OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f63792OooO0o0);
            } else if (index == 7) {
                int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f63798OooOOO = resourceId;
                    if (resourceId != -1) {
                        this.f63797OooOO0o = -2;
                    }
                } else if (i3 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f63799OooOOO0 = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f63797OooOO0o = -1;
                    } else {
                        this.f63798OooOOO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f63797OooOO0o = -2;
                    }
                } else {
                    this.f63797OooOO0o = typedArrayObtainStyledAttributes.getInteger(index, this.f63797OooOO0o);
                }
            } else if (index == 11) {
                this.f63801OooOOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f63801OooOOOo);
            } else if (index == 3) {
                this.f63803OooOOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63803OooOOo0);
            } else if (index == 6) {
                this.f63802OooOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f63802OooOOo);
            } else if (index == 5) {
                this.f63804OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f63804OooOOoo);
            } else if (index == 2) {
                this.f63805OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63805OooOo0);
            } else if (index == 1) {
                this.f63806OooOo00 = typedArrayObtainStyledAttributes.getInteger(index, this.f63806OooOo00);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + o000OO.OooO00o.OooO0O0(this.f63800OooOOOO, this.f63787OooO00o) + ")";
    }
}
