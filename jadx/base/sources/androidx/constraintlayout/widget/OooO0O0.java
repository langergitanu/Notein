package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConstraintLayout f63985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f63986OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f63987OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseArray<OooO00o> f63988OooO0Oo = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SparseArray<OooO0OO> f63989OooO0o0 = new SparseArray<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f63990OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<C19005OooO0O0> f63991OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f63992OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f63993OooO0Oo;

        public OooO00o(Context context, XmlResourceParser xmlResourceParser) {
            this.f63992OooO0OO = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64147OooOOoo);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f63990OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f63990OooO00o);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f63992OooO0OO);
                    this.f63992OooO0OO = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        OooO0OO oooO0OO = new OooO0OO();
                        this.f63993OooO0Oo = oooO0OO;
                        oooO0OO.OooO0o0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C19005OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f63994OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f63995OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f63996OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f63997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO0OO f63998OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f63999OooO0o0;

        public C19005OooO0O0(Context context, XmlResourceParser xmlResourceParser) {
            this.f63994OooO00o = Float.NaN;
            this.f63995OooO0O0 = Float.NaN;
            this.f63996OooO0OO = Float.NaN;
            this.f63997OooO0Oo = Float.NaN;
            this.f63999OooO0o0 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64152OooOo0o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f63999OooO0o0);
                    this.f63999OooO0o0 = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        OooO0OO oooO0OO = new OooO0OO();
                        this.f63998OooO0o = oooO0OO;
                        oooO0OO.OooO0o0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f63997OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.f63997OooO0Oo);
                } else if (index == 2) {
                    this.f63995OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.f63995OooO0O0);
                } else if (index == 3) {
                    this.f63996OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f63996OooO0OO);
                } else if (index == 4) {
                    this.f63994OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.f63994OooO00o);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean OooO00o(float f, float f2) {
            float f3 = this.f63994OooO00o;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f63995OooO0O0;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f63996OooO0OO;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.f63997OooO0Oo;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooO0O0(Context context, ConstraintLayout constraintLayout, int i) {
        this.f63985OooO00o = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            OooO00o oooO00o = null;
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 4;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b == 2) {
                        OooO00o oooO00o2 = new OooO00o(context, xml);
                        this.f63988OooO0Oo.put(oooO00o2.f63990OooO00o, oooO00o2);
                        oooO00o = oooO00o2;
                    } else if (b == 3) {
                        C19005OooO0O0 c19005OooO0O0 = new C19005OooO0O0(context, xml);
                        if (oooO00o != null) {
                            oooO00o.f63991OooO0O0.add(c19005OooO0O0);
                        }
                    } else if (b == 4) {
                        OooO00o(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }

    public final void OooO00o(Context context, XmlResourceParser xmlResourceParser) {
        OooO0OO oooO0OO = new OooO0OO();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                oooO0OO.OooOOO0(context, xmlResourceParser);
                this.f63989OooO0o0.put(identifier, oooO0OO);
                return;
            }
        }
    }

    public final void OooO0O0(float f, float f2, int i) {
        int i2 = this.f63986OooO0O0;
        SparseArray<OooO00o> sparseArray = this.f63988OooO0Oo;
        int i3 = 0;
        ConstraintLayout constraintLayout = this.f63985OooO00o;
        if (i2 == i) {
            OooO00o oooO00oValueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(i2);
            int i4 = this.f63987OooO0OO;
            if (i4 == -1 || !oooO00oValueAt.f63991OooO0O0.get(i4).OooO00o(f, f2)) {
                while (true) {
                    ArrayList<C19005OooO0O0> arrayList = oooO00oValueAt.f63991OooO0O0;
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (arrayList.get(i3).OooO00o(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (this.f63987OooO0OO == i3) {
                    return;
                }
                ArrayList<C19005OooO0O0> arrayList2 = oooO00oValueAt.f63991OooO0O0;
                OooO0OO oooO0OO = i3 == -1 ? null : arrayList2.get(i3).f63998OooO0o;
                if (i3 != -1) {
                    int i5 = arrayList2.get(i3).f63999OooO0o0;
                }
                if (oooO0OO == null) {
                    return;
                }
                this.f63987OooO0OO = i3;
                oooO0OO.OooO0O0(constraintLayout);
                return;
            }
            return;
        }
        this.f63986OooO0O0 = i;
        OooO00o oooO00o = sparseArray.get(i);
        while (true) {
            ArrayList<C19005OooO0O0> arrayList3 = oooO00o.f63991OooO0O0;
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (arrayList3.get(i3).OooO00o(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList<C19005OooO0O0> arrayList4 = oooO00o.f63991OooO0O0;
        OooO0OO oooO0OO2 = i3 == -1 ? oooO00o.f63993OooO0Oo : arrayList4.get(i3).f63998OooO0o;
        if (i3 != -1) {
            int i6 = arrayList4.get(i3).f63999OooO0o0;
        }
        if (oooO0OO2 != null) {
            this.f63987OooO0OO = i3;
            oooO0OO2.OooO0O0(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }
}
