package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C21628OooO0oo;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0OO;
import androidx.constraintlayout.widget.OooO0o;
import com.orion.notein.global.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o000OO.C24445OooO0oO;
import o000OO.C24449OooOOo;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final SparseIntArray f63716OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MotionLayout f63717OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21628OooO0oo f63718OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0 f63719OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO0O0> f63720OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList<OooO0O0> f63721OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f63722OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.OooO0OO> f63723OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<String, Integer> f63724OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f63725OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f63726OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public MotionEvent f63727OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f63728OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f63729OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public MotionLayout.OooO0OO f63730OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f63731OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f63732OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C21623OooO0Oo f63733OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f63734OooOOoo;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public class InterpolatorC19001OooO00o implements Interpolator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O00.OooO0OO f63735OooO00o;

        public InterpolatorC19001OooO00o(o0000O00.OooO0OO oooO0OO) {
            this.f63735OooO00o = oooO0OO;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (float) this.f63735OooO00o.OooO00o(f);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooO00o(Context context, MotionLayout motionLayout, int i) {
        int eventType;
        OooO0O0 oooO0O0;
        this.f63718OooO0O0 = null;
        this.f63719OooO0OO = null;
        ArrayList<OooO0O0> arrayList = new ArrayList<>();
        this.f63720OooO0Oo = arrayList;
        this.f63722OooO0o0 = null;
        this.f63721OooO0o = new ArrayList<>();
        this.f63723OooO0oO = new SparseArray<>();
        this.f63724OooO0oo = new HashMap<>();
        this.f63716OooO = new SparseIntArray();
        this.f63725OooOO0 = 400;
        this.f63726OooOO0O = 0;
        this.f63729OooOOO0 = false;
        this.f63728OooOOO = false;
        this.f63717OooO00o = motionLayout;
        this.f63733OooOOo0 = new C21623OooO0Oo(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            oooO0O0 = null;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        while (true) {
            byte b = 1;
            if (eventType != 1) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 5;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                b = 8;
                                break;
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                b = 7;
                                break;
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                b = 9;
                                break;
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                b = 3;
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                b = 2;
                                break;
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b = 4;
                                break;
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                b = 6;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    MotionLayout motionLayout2 = this.f63717OooO00o;
                    switch (b) {
                        case 0:
                            OooOO0(context, xml);
                            break;
                        case 1:
                            oooO0O0 = new OooO0O0(this, context, xml);
                            arrayList.add(oooO0O0);
                            if (this.f63719OooO0OO == null && !oooO0O0.f63738OooO0O0) {
                                this.f63719OooO0OO = oooO0O0;
                                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O02 = oooO0O0.f63747OooOO0o;
                                if (oooO0O02 != null) {
                                    oooO0O02.OooO0OO(this.f63731OooOOOo);
                                }
                            }
                            if (oooO0O0.f63738OooO0O0) {
                                if (oooO0O0.f63739OooO0OO == -1) {
                                    this.f63722OooO0o0 = oooO0O0;
                                } else {
                                    this.f63721OooO0o.add(oooO0O0);
                                }
                                arrayList.remove(oooO0O0);
                            }
                            break;
                        case 2:
                            if (oooO0O0 == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (oooO0O0 != null) {
                                oooO0O0.f63747OooOO0o = new androidx.constraintlayout.motion.widget.OooO0O0(context, motionLayout2, xml);
                            }
                            break;
                        case 3:
                            if (oooO0O0 != null && !motionLayout2.isInEditMode()) {
                                oooO0O0.f63749OooOOO0.add(new OooO0O0.ViewOnClickListenerC19002OooO00o(context, oooO0O0, xml));
                            }
                            break;
                        case 4:
                            this.f63718OooO0O0 = new C21628OooO0oo(context, xml);
                            break;
                        case 5:
                            OooO0oO(context, xml);
                            break;
                        case 6:
                        case 7:
                            OooO(context, xml);
                            break;
                        case 8:
                            C24445OooO0oO c24445OooO0oO = new C24445OooO0oO(context, xml);
                            if (oooO0O0 != null) {
                                oooO0O0.f63746OooOO0O.add(c24445OooO0oO);
                            }
                            break;
                        case 9:
                            OooO0OO oooO0OO = new OooO0OO(context, xml);
                            C21623OooO0Oo c21623OooO0Oo = this.f63733OooOOo0;
                            c21623OooO0Oo.f63821OooO0O0.add(oooO0OO);
                            c21623OooO0Oo.f63822OooO0OO = null;
                            int i2 = oooO0OO.f63788OooO0O0;
                            if (i2 == 4 || i2 == 5) {
                                ConstraintLayout.getSharedValues().OooO00o(oooO0OO.f63805OooOo0, new C24449OooOOo());
                            }
                            break;
                    }
                }
                eventType = xml.next();
            }
            this.f63723OooO0oO.put(R.id.motion_base, new androidx.constraintlayout.widget.OooO0OO());
            this.f63724OooO0oo.put("motion_base", Integer.valueOf(R.id.motion_base));
            return;
        }
    }

    public static int OooO0Oo(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final void OooO(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64153OooOoO0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                OooO0oo(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean OooO00o(int i, MotionLayout motionLayout) {
        OooO0O0 oooO0O0;
        if (this.f63730OooOOOO != null) {
            return false;
        }
        for (OooO0O0 oooO0O02 : this.f63720OooO0Oo) {
            int i2 = oooO0O02.f63748OooOOO;
            if (i2 != 0 && ((oooO0O0 = this.f63719OooO0OO) != oooO0O02 || (oooO0O0.f63752OooOOo0 & 2) == 0)) {
                int i3 = oooO0O02.f63740OooO0Oo;
                MotionLayout.OooO0o oooO0o = MotionLayout.OooO0o.f63715OooOoO0;
                MotionLayout.OooO0o oooO0o2 = MotionLayout.OooO0o.f63712OooOo;
                MotionLayout.OooO0o oooO0o3 = MotionLayout.OooO0o.f63713OooOo0o;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(oooO0o);
                    motionLayout.setTransition(oooO0O02);
                    if (oooO0O02.f63748OooOOO == 4) {
                        motionLayout.OooO0oo();
                        motionLayout.setState(oooO0o3);
                        motionLayout.setState(oooO0o2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.OooO0O0(true);
                    motionLayout.setState(oooO0o3);
                    motionLayout.setState(oooO0o2);
                    motionLayout.setState(oooO0o);
                    motionLayout.OooO0o0();
                    return true;
                }
                if (i == oooO0O02.f63739OooO0OO && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(oooO0o);
                    motionLayout.setTransition(oooO0O02);
                    if (oooO0O02.f63748OooOOO == 3) {
                        motionLayout.OooO00o(0.0f);
                        motionLayout.setState(oooO0o3);
                        motionLayout.setState(oooO0o2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.OooO0O0(true);
                    motionLayout.setState(oooO0o3);
                    motionLayout.setState(oooO0o2);
                    motionLayout.setState(oooO0o);
                    motionLayout.OooO0o0();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.OooO0OO OooO0O0(int i) {
        int iOooO00o;
        C21628OooO0oo c21628OooO0oo = this.f63718OooO0O0;
        if (c21628OooO0oo != null && (iOooO00o = c21628OooO0oo.OooO00o(i)) != -1) {
            i = iOooO00o;
        }
        SparseArray<androidx.constraintlayout.widget.OooO0OO> sparseArray = this.f63723OooO0oO;
        if (sparseArray.get(i) != null) {
            return sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + o000OO.OooO00o.OooO0O0(this.f63717OooO00o.getContext(), i) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final int OooO0OO() {
        OooO0O0 oooO0O0 = this.f63719OooO0OO;
        return oooO0O0 != null ? oooO0O0.f63744OooO0oo : this.f63725OooOO0;
    }

    public final float OooO0o() {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        OooO0O0 oooO0O02 = this.f63719OooO0OO;
        if (oooO0O02 == null || (oooO0O0 = oooO0O02.f63747OooOO0o) == null) {
            return 0.0f;
        }
        return oooO0O0.f63774OooOOo;
    }

    public final Interpolator OooO0o0() {
        OooO0O0 oooO0O0 = this.f63719OooO0OO;
        int i = oooO0O0.f63742OooO0o0;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f63717OooO00o.getContext(), this.f63719OooO0OO.f63743OooO0oO);
        }
        if (i == -1) {
            return new InterpolatorC19001OooO00o(o0000O00.OooO0OO.OooO0O0(oooO0O0.f63741OooO0o));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final int OooO0oO(Context context, XmlResourceParser xmlResourceParser) {
        String attributeValue;
        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
        oooO0OO.f64008OooO0o0 = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iOooO0Oo = -1;
        int iOooO0Oo2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            attributeValue = xmlResourceParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iOooO0Oo2 = OooO0Oo(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        break;
                    }
                    break;
                case "id":
                    iOooO0Oo = OooO0Oo(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f63724OooO0oo.put(attributeValue, Integer.valueOf(iOooO0Oo));
                    oooO0OO.f64003OooO00o = o000OO.OooO00o.OooO0O0(context, iOooO0Oo);
                    break;
                case "stateLabels":
                    oooO0OO.f64005OooO0OO = attributeValue.split(",");
                    int i2 = 0;
                    while (true) {
                        String[] strArr = oooO0OO.f64005OooO0OO;
                        if (i2 < strArr.length) {
                            strArr[i2] = strArr[i2].trim();
                            i2++;
                        }
                    }
                    break;
            }
        }
        if (iOooO0Oo != -1) {
            int i3 = this.f63717OooO00o.f63680Oooo0oO;
            oooO0OO.OooOOO0(context, xmlResourceParser);
            if (iOooO0Oo2 != -1) {
                this.f63716OooO.put(iOooO0Oo, iOooO0Oo2);
            }
            this.f63723OooO0oO.put(iOooO0Oo, oooO0OO);
        }
        return iOooO0Oo;
    }

    public final int OooO0oo(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return OooO0oO(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void OooOO0(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64143OooOOOO);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f63725OooOO0);
                this.f63725OooOO0 = i2;
                if (i2 < 8) {
                    this.f63725OooOO0 = 8;
                }
            } else if (index == 1) {
                this.f63726OooOO0O = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOO0O(int i, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.OooO0OO> sparseArray = this.f63723OooO0oO;
        androidx.constraintlayout.widget.OooO0OO oooO0OO = sparseArray.get(i);
        oooO0OO.f64004OooO0O0 = oooO0OO.f64003OooO00o;
        int i2 = this.f63716OooO.get(i);
        HashMap<Integer, OooO0OO.OooO00o> map = oooO0OO.f64007OooO0o;
        if (i2 > 0) {
            OooOO0O(i2, motionLayout);
            androidx.constraintlayout.widget.OooO0OO oooO0OO2 = sparseArray.get(i2);
            if (oooO0OO2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + o000OO.OooO00o.OooO0O0(this.f63717OooO00o.getContext(), i2));
                return;
            }
            oooO0OO.f64004OooO0O0 += "/" + oooO0OO2.f64004OooO0O0;
            HashMap<Integer, OooO0OO.OooO00o> map2 = oooO0OO2.f64007OooO0o;
            for (Integer num : map2.keySet()) {
                num.getClass();
                OooO0OO.OooO00o oooO00o = map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new OooO0OO.OooO00o());
                }
                OooO0OO.OooO00o oooO00o2 = map.get(num);
                if (oooO00o2 != null) {
                    OooO0OO.OooO0O0 oooO0O0 = oooO00o2.f64014OooO0o0;
                    if (!oooO0O0.f64032OooO0O0) {
                        oooO0O0.OooO00o(oooO00o.f64014OooO0o0);
                    }
                    OooO0OO.OooO0Oo oooO0Oo = oooO00o2.f64011OooO0OO;
                    if (!oooO0Oo.f64109OooO00o) {
                        OooO0OO.OooO0Oo oooO0Oo2 = oooO00o.f64011OooO0OO;
                        oooO0Oo.f64109OooO00o = oooO0Oo2.f64109OooO00o;
                        oooO0Oo.f64110OooO0O0 = oooO0Oo2.f64110OooO0O0;
                        oooO0Oo.f64112OooO0Oo = oooO0Oo2.f64112OooO0Oo;
                        oooO0Oo.f64113OooO0o0 = oooO0Oo2.f64113OooO0o0;
                        oooO0Oo.f64111OooO0OO = oooO0Oo2.f64111OooO0OO;
                    }
                    OooO0OO.C21624OooO0o0 c21624OooO0o0 = oooO00o2.f64013OooO0o;
                    if (!c21624OooO0o0.f64116OooO00o) {
                        c21624OooO0o0.OooO00o(oooO00o.f64013OooO0o);
                    }
                    OooO0OO.C19007OooO0OO c19007OooO0OO = oooO00o2.f64012OooO0Oo;
                    if (!c19007OooO0OO.f64100OooO00o) {
                        c19007OooO0OO.OooO00o(oooO00o.f64012OooO0Oo);
                    }
                    for (String str : oooO00o.f64015OooO0oO.keySet()) {
                        if (!oooO00o2.f64015OooO0oO.containsKey(str)) {
                            oooO00o2.f64015OooO0oO.put(str, oooO00o.f64015OooO0oO.get(str));
                        }
                    }
                }
            }
        } else {
            oooO0OO.f64004OooO0O0 = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), oooO0OO.f64004OooO0O0, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.OooO00o oooO00o3 = (ConstraintLayout.OooO00o) childAt.getLayoutParams();
                int id = childAt.getId();
                if (oooO0OO.f64008OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new OooO0OO.OooO00o());
                }
                OooO0OO.OooO00o oooO00o4 = map.get(Integer.valueOf(id));
                if (oooO00o4 != null) {
                    OooO0OO.OooO0O0 oooO0O02 = oooO00o4.f64014OooO0o0;
                    if (!oooO0O02.f64032OooO0O0) {
                        oooO00o4.OooO0OO(id, oooO00o3);
                        if (childAt instanceof ConstraintHelper) {
                            oooO0O02.f64090Ooooooo = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                oooO0O02.f64094o00Ooo = barrier.getAllowsGoneWidget();
                                oooO0O02.f64088Oooooo0 = barrier.getType();
                                oooO0O02.f64087Oooooo = barrier.getMargin();
                            }
                        }
                        oooO0O02.f64032OooO0O0 = true;
                    }
                    OooO0OO.OooO0Oo oooO0Oo3 = oooO00o4.f64011OooO0OO;
                    if (!oooO0Oo3.f64109OooO00o) {
                        oooO0Oo3.f64110OooO0O0 = childAt.getVisibility();
                        oooO0Oo3.f64112OooO0Oo = childAt.getAlpha();
                        oooO0Oo3.f64109OooO00o = true;
                    }
                    OooO0OO.C21624OooO0o0 c21624OooO0o02 = oooO00o4.f64013OooO0o;
                    if (!c21624OooO0o02.f64116OooO00o) {
                        c21624OooO0o02.f64116OooO00o = true;
                        c21624OooO0o02.f64117OooO0O0 = childAt.getRotation();
                        c21624OooO0o02.f64118OooO0OO = childAt.getRotationX();
                        c21624OooO0o02.f64119OooO0Oo = childAt.getRotationY();
                        c21624OooO0o02.f64121OooO0o0 = childAt.getScaleX();
                        c21624OooO0o02.f64120OooO0o = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            c21624OooO0o02.f64122OooO0oO = pivotX;
                            c21624OooO0o02.f64123OooO0oo = pivotY;
                        }
                        c21624OooO0o02.f64124OooOO0 = childAt.getTranslationX();
                        c21624OooO0o02.f64125OooOO0O = childAt.getTranslationY();
                        c21624OooO0o02.f64126OooOO0o = childAt.getTranslationZ();
                        if (c21624OooO0o02.f64128OooOOO0) {
                            c21624OooO0o02.f64127OooOOO = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (OooO0OO.OooO00o oooO00o5 : map.values()) {
            if (oooO00o5.f64016OooO0oo != null) {
                if (oooO00o5.f64010OooO0O0 == null) {
                    oooO00o5.f64016OooO0oo.OooO0o0(oooO0OO.OooOO0O(oooO00o5.f64009OooO00o));
                } else {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        OooO0OO.OooO00o oooO00oOooOO0O = oooO0OO.OooOO0O(it.next().intValue());
                        String str2 = oooO00oOooOO0O.f64014OooO0o0.f64097ooOO;
                        if (str2 != null && oooO00o5.f64010OooO0O0.matches(str2)) {
                            oooO00o5.f64016OooO0oo.OooO0o0(oooO00oOooOO0O);
                            oooO00oOooOO0O.f64015OooO0oO.putAll((HashMap) oooO00o5.f64015OooO0oO.clone());
                        }
                    }
                }
            }
        }
    }

    public final void OooOO0o(MotionLayout motionLayout) {
        int i = 0;
        loop0: while (true) {
            SparseArray<androidx.constraintlayout.widget.OooO0OO> sparseArray = this.f63723OooO0oO;
            if (i >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i);
            SparseIntArray sparseIntArray = this.f63716OooO;
            int i2 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i2 > 0) {
                if (i2 == iKeyAt) {
                    break loop0;
                }
                int i3 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i2 = sparseIntArray.get(i2);
                size = i3;
            }
            OooOO0O(iKeyAt, motionLayout);
            i++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    public final boolean OooOOO() {
        Iterator<OooO0O0> it = this.f63720OooO0Oo.iterator();
        while (it.hasNext()) {
            if (it.next().f63747OooOO0o != null) {
                return true;
            }
        }
        OooO0O0 oooO0O0 = this.f63719OooO0OO;
        return (oooO0O0 == null || oooO0O0.f63747OooOO0o == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOO0(int i, int i2) {
        int iOooO00o;
        int iOooO00o2;
        OooO0O0 oooO0O0;
        C21628OooO0oo c21628OooO0oo = this.f63718OooO0O0;
        if (c21628OooO0oo != null) {
            iOooO00o = c21628OooO0oo.OooO00o(i);
            if (iOooO00o == -1) {
                iOooO00o = i;
            }
            iOooO00o2 = this.f63718OooO0O0.OooO00o(i2);
            if (iOooO00o2 == -1) {
            }
            oooO0O0 = this.f63719OooO0OO;
            if (oooO0O0 == null && oooO0O0.f63739OooO0OO == i2 && oooO0O0.f63740OooO0Oo == i) {
                return;
            }
            ArrayList<OooO0O0> arrayList = this.f63720OooO0Oo;
            for (OooO0O0 oooO0O02 : arrayList) {
                int i3 = oooO0O02.f63739OooO0OO;
                if ((i3 == iOooO00o2 && oooO0O02.f63740OooO0Oo == iOooO00o) || (i3 == i2 && oooO0O02.f63740OooO0Oo == i)) {
                    this.f63719OooO0OO = oooO0O02;
                    androidx.constraintlayout.motion.widget.OooO0O0 oooO0O03 = oooO0O02.f63747OooOO0o;
                    if (oooO0O03 != null) {
                        oooO0O03.OooO0OO(this.f63731OooOOOo);
                        return;
                    }
                    return;
                }
            }
            OooO0O0 oooO0O04 = this.f63722OooO0o0;
            for (OooO0O0 oooO0O05 : this.f63721OooO0o) {
                if (oooO0O05.f63739OooO0OO == i2) {
                    oooO0O04 = oooO0O05;
                }
            }
            OooO0O0 oooO0O06 = new OooO0O0(this, oooO0O04);
            oooO0O06.f63740OooO0Oo = iOooO00o;
            oooO0O06.f63739OooO0OO = iOooO00o2;
            if (iOooO00o != -1) {
                arrayList.add(oooO0O06);
            }
            this.f63719OooO0OO = oooO0O06;
        }
        iOooO00o = i;
        iOooO00o2 = i2;
        oooO0O0 = this.f63719OooO0OO;
        if (oooO0O0 == null) {
        }
        ArrayList<OooO0O0> arrayList2 = this.f63720OooO0Oo;
        while (r4.hasNext()) {
        }
        OooO0O0 oooO0O042 = this.f63722OooO0o0;
        while (r4.hasNext()) {
        }
        OooO0O0 oooO0O062 = new OooO0O0(this, oooO0O042);
        oooO0O062.f63740OooO0Oo = iOooO00o;
        oooO0O062.f63739OooO0OO = iOooO00o2;
        if (iOooO00o != -1) {
        }
        this.f63719OooO0OO = oooO0O062;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f63736OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f63737OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f63738OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f63739OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f63740OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f63741OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f63742OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f63743OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f63744OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final OooO00o f63745OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ArrayList<C24445OooO0oO> f63746OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.OooO0O0 f63747OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final int f63748OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final ArrayList<ViewOnClickListenerC19002OooO00o> f63749OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final boolean f63750OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final int f63751OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final int f63752OooOOo0;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static class ViewOnClickListenerC19002OooO00o implements View.OnClickListener {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final int f63753OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final OooO0O0 f63754OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final int f63755OooOoO0;

            public ViewOnClickListenerC19002OooO00o(Context context, OooO0O0 oooO0O0, XmlResourceParser xmlResourceParser) {
                this.f63753OooOo = -1;
                this.f63755OooOoO0 = 17;
                this.f63754OooOo0o = oooO0O0;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64144OooOOOo);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.f63753OooOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f63753OooOo);
                    } else if (index == 0) {
                        this.f63755OooOoO0 = typedArrayObtainStyledAttributes.getInt(index, this.f63755OooOoO0);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void OooO00o(MotionLayout motionLayout, int i, OooO0O0 oooO0O0) {
                int i2 = this.f63753OooOo;
                View viewFindViewById = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (viewFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = oooO0O0.f63740OooO0Oo;
                int i4 = oooO0O0.f63739OooO0OO;
                if (i3 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i5 = this.f63755OooOoO0;
                int i6 = i5 & 1;
                if (((i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4)) || ((i5 & 4096) != 0 && i == i4)) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            public final void OooO0O0(MotionLayout motionLayout) {
                int i = this.f63753OooOo;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21628OooO0oo c21628OooO0oo;
                OooO0O0 oooO0O0 = this.f63754OooOo0o;
                OooO00o oooO00o = oooO0O0.f63745OooOO0;
                MotionLayout motionLayout = oooO00o.f63717OooO00o;
                if (motionLayout.f63670OooOooo) {
                    boolean z = false;
                    if (oooO0O0.f63740OooO0Oo != -1) {
                        OooO0O0 oooO0O02 = oooO00o.f63719OooO0OO;
                        int i = this.f63755OooOoO0;
                        int i2 = i & 1;
                        boolean z2 = true;
                        boolean z3 = (i2 == 0 && (i & 256) == 0) ? false : true;
                        int i3 = i & 16;
                        if (i3 == 0 && (i & 4096) == 0) {
                            z2 = false;
                        }
                        if (z3 && z2) {
                            if (oooO0O02 != oooO0O0) {
                                motionLayout.setTransition(oooO0O0);
                            }
                            if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                                z2 = false;
                                z = z3;
                            }
                        } else {
                            z = z3;
                        }
                        if (oooO0O0 != oooO0O02) {
                            int i4 = oooO0O0.f63739OooO0OO;
                            int i5 = oooO0O0.f63740OooO0Oo;
                            if (i5 != -1) {
                                int i6 = motionLayout.f63666OooOoOO;
                                if (i6 != i5 && i6 != i4) {
                                    return;
                                }
                            } else if (motionLayout.f63666OooOoOO == i4) {
                                return;
                            }
                        }
                        if (z && i2 != 0) {
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.OooO0oo();
                            return;
                        }
                        if (z2 && i3 != 0) {
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.OooO00o(0.0f);
                            return;
                        } else if (z && (i & 256) != 0) {
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.setProgress(1.0f);
                            return;
                        } else {
                            if (!z2 || (i & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(oooO0O0);
                            motionLayout.setProgress(0.0f);
                            return;
                        }
                    }
                    int currentState = motionLayout.getCurrentState();
                    if (currentState != -1) {
                        OooO0O0 oooO0O03 = new OooO0O0(oooO00o, oooO0O0);
                        oooO0O03.f63740OooO0Oo = currentState;
                        oooO0O03.f63739OooO0OO = oooO0O0.f63739OooO0OO;
                        motionLayout.setTransition(oooO0O03);
                        motionLayout.OooO0oo();
                        return;
                    }
                    int i7 = oooO0O0.f63739OooO0OO;
                    if (!motionLayout.isAttachedToWindow()) {
                        motionLayout.f63698Oooooo0.f63710OooO0Oo = i7;
                        return;
                    }
                    OooO00o oooO00o2 = motionLayout.f63663OooOo0o;
                    if (oooO00o2 != null && (c21628OooO0oo = oooO00o2.f63718OooO0O0) != null) {
                        int i8 = motionLayout.f63666OooOoOO;
                        float f = -1;
                        C21628OooO0oo.OooO00o oooO00o3 = c21628OooO0oo.f64156OooO0O0.get(i7);
                        if (oooO00o3 == null) {
                            i8 = i7;
                        } else {
                            ArrayList<C21628OooO0oo.OooO0O0> arrayList = oooO00o3.f64158OooO0O0;
                            int i9 = oooO00o3.f64159OooO0OO;
                            if (f != -1.0f && f != -1.0f) {
                                Iterator<C21628OooO0oo.OooO0O0> it = arrayList.iterator();
                                C21628OooO0oo.OooO0O0 oooO0O04 = null;
                                while (true) {
                                    if (it.hasNext()) {
                                        C21628OooO0oo.OooO0O0 next = it.next();
                                        if (next.OooO00o(f, f)) {
                                            if (i8 == next.f64164OooO0o0) {
                                                break;
                                            } else {
                                                oooO0O04 = next;
                                            }
                                        }
                                    } else if (oooO0O04 != null) {
                                        i8 = oooO0O04.f64164OooO0o0;
                                    }
                                }
                            } else if (i9 != i8) {
                                Iterator<C21628OooO0oo.OooO0O0> it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    if (i8 == it2.next().f64164OooO0o0) {
                                        break;
                                    }
                                }
                                i8 = i9;
                            }
                        }
                        if (i8 != -1) {
                            i7 = i8;
                        }
                    }
                    int i10 = motionLayout.f63666OooOoOO;
                    if (i10 == i7) {
                        return;
                    }
                    if (motionLayout.f63664OooOoO == i7) {
                        motionLayout.OooO00o(0.0f);
                        return;
                    }
                    if (motionLayout.f63668OooOoo0 == i7) {
                        motionLayout.OooO00o(1.0f);
                        return;
                    }
                    motionLayout.f63668OooOoo0 = i7;
                    if (i10 != -1) {
                        motionLayout.OooO0o(i10, i7);
                        motionLayout.OooO00o(1.0f);
                        motionLayout.f63675Oooo00o = 0.0f;
                        motionLayout.OooO0oo();
                        return;
                    }
                    motionLayout.f63676Oooo0O0 = 1.0f;
                    motionLayout.f63674Oooo00O = 0.0f;
                    motionLayout.f63675Oooo00o = 0.0f;
                    motionLayout.f63672Oooo0 = motionLayout.getNanoTime();
                    motionLayout.getNanoTime();
                    motionLayout.f63677Oooo0OO = false;
                    motionLayout.f63673Oooo000 = motionLayout.f63663OooOo0o.OooO0OO() / 1000.0f;
                    motionLayout.f63664OooOoO = -1;
                    motionLayout.f63663OooOo0o.OooOOO0(-1, motionLayout.f63668OooOoo0);
                    new SparseArray();
                    motionLayout.getChildCount();
                    throw null;
                }
            }
        }

        public OooO0O0(OooO00o oooO00o, OooO0O0 oooO0O0) {
            this.f63737OooO00o = -1;
            this.f63738OooO0O0 = false;
            this.f63739OooO0OO = -1;
            this.f63740OooO0Oo = -1;
            this.f63742OooO0o0 = 0;
            this.f63741OooO0o = null;
            this.f63743OooO0oO = -1;
            this.f63744OooO0oo = 400;
            this.f63736OooO = 0.0f;
            this.f63746OooOO0O = new ArrayList<>();
            this.f63747OooOO0o = null;
            this.f63749OooOOO0 = new ArrayList<>();
            this.f63748OooOOO = 0;
            this.f63750OooOOOO = false;
            this.f63751OooOOOo = 0;
            this.f63752OooOOo0 = 0;
            this.f63745OooOO0 = oooO00o;
            this.f63744OooO0oo = oooO00o.f63725OooOO0;
            if (oooO0O0 != null) {
                this.f63742OooO0o0 = oooO0O0.f63742OooO0o0;
                this.f63741OooO0o = oooO0O0.f63741OooO0o;
                this.f63743OooO0oO = oooO0O0.f63743OooO0oO;
                this.f63744OooO0oo = oooO0O0.f63744OooO0oo;
                this.f63746OooOO0O = oooO0O0.f63746OooOO0O;
                this.f63736OooO = oooO0O0.f63736OooO;
                this.f63751OooOOOo = oooO0O0.f63751OooOOOo;
            }
        }

        public OooO0O0(OooO00o oooO00o, Context context, XmlResourceParser xmlResourceParser) {
            this.f63737OooO00o = -1;
            this.f63738OooO0O0 = false;
            this.f63739OooO0OO = -1;
            this.f63740OooO0Oo = -1;
            this.f63742OooO0o0 = 0;
            this.f63741OooO0o = null;
            this.f63743OooO0oO = -1;
            this.f63744OooO0oo = 400;
            this.f63736OooO = 0.0f;
            this.f63746OooOO0O = new ArrayList<>();
            this.f63747OooOO0o = null;
            this.f63749OooOOO0 = new ArrayList<>();
            this.f63748OooOOO = 0;
            this.f63750OooOOOO = false;
            this.f63751OooOOOo = 0;
            this.f63752OooOOo0 = 0;
            this.f63744OooO0oo = oooO00o.f63725OooOO0;
            this.f63751OooOOOo = oooO00o.f63726OooOO0O;
            this.f63745OooOO0 = oooO00o;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64151OooOo0O);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseArray<androidx.constraintlayout.widget.OooO0OO> sparseArray = oooO00o.f63723OooO0oO;
                if (index == 2) {
                    this.f63739OooO0OO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f63739OooO0OO);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
                        oooO0OO.OooOO0o(context, this.f63739OooO0OO);
                        sparseArray.append(this.f63739OooO0OO, oooO0OO);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f63739OooO0OO = oooO00o.OooO0oo(context, this.f63739OooO0OO);
                    }
                } else if (index == 3) {
                    this.f63740OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f63740OooO0Oo);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f63740OooO0Oo);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.OooO0OO oooO0OO2 = new androidx.constraintlayout.widget.OooO0OO();
                        oooO0OO2.OooOO0o(context, this.f63740OooO0Oo);
                        sparseArray.append(this.f63740OooO0Oo, oooO0OO2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f63740OooO0Oo = oooO00o.OooO0oo(context, this.f63740OooO0Oo);
                    }
                } else if (index == 6) {
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f63743OooO0oO = resourceId;
                        if (resourceId != -1) {
                            this.f63742OooO0o0 = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f63741OooO0o = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f63743OooO0oO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f63742OooO0o0 = -2;
                            } else {
                                this.f63742OooO0o0 = -1;
                            }
                        }
                    } else {
                        this.f63742OooO0o0 = typedArrayObtainStyledAttributes.getInteger(index, this.f63742OooO0o0);
                    }
                } else if (index == 4) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f63744OooO0oo);
                    this.f63744OooO0oo = i3;
                    if (i3 < 8) {
                        this.f63744OooO0oo = 8;
                    }
                } else if (index == 8) {
                    this.f63736OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f63736OooO);
                } else if (index == 1) {
                    this.f63748OooOOO = typedArrayObtainStyledAttributes.getInteger(index, this.f63748OooOOO);
                } else if (index == 0) {
                    this.f63737OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f63737OooO00o);
                } else if (index == 9) {
                    this.f63750OooOOOO = typedArrayObtainStyledAttributes.getBoolean(index, this.f63750OooOOOO);
                } else if (index == 7) {
                    typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f63751OooOOOo = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f63752OooOOo0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f63740OooO0Oo == -1) {
                this.f63738OooO0O0 = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
