package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21628OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f64155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<OooO00o> f64156OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f64157OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0O0> f64158OooO0O0 = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f64159OooO0OO;

        public OooO00o(Context context, XmlResourceParser xmlResourceParser) {
            this.f64159OooO0OO = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64147OooOOoo);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f64157OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f64157OooO00o);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f64159OooO0OO);
                    this.f64159OooO0OO = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0oo$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f64160OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f64161OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f64162OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f64163OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f64164OooO0o0;

        public OooO0O0(Context context, XmlResourceParser xmlResourceParser) {
            this.f64160OooO00o = Float.NaN;
            this.f64161OooO0O0 = Float.NaN;
            this.f64162OooO0OO = Float.NaN;
            this.f64163OooO0Oo = Float.NaN;
            this.f64164OooO0o0 = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64152OooOo0o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f64164OooO0o0);
                    this.f64164OooO0o0 = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f64163OooO0Oo = typedArrayObtainStyledAttributes.getDimension(index, this.f64163OooO0Oo);
                } else if (index == 2) {
                    this.f64161OooO0O0 = typedArrayObtainStyledAttributes.getDimension(index, this.f64161OooO0O0);
                } else if (index == 3) {
                    this.f64162OooO0OO = typedArrayObtainStyledAttributes.getDimension(index, this.f64162OooO0OO);
                } else if (index == 4) {
                    this.f64160OooO00o = typedArrayObtainStyledAttributes.getDimension(index, this.f64160OooO00o);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean OooO00o(float f, float f2) {
            float f3 = this.f64160OooO00o;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f64161OooO0O0;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f64162OooO0OO;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.f64163OooO0Oo;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21628OooO0oo(Context context, XmlResourceParser xmlResourceParser) {
        this.f64155OooO00o = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64150OooOo00);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f64155OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, this.f64155OooO00o);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            OooO00o oooO00o = null;
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            b = name.equals("State") ? (byte) 2 : (byte) -1;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
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
                        oooO00o = new OooO00o(context, xmlResourceParser);
                        this.f64156OooO0O0.put(oooO00o.f64157OooO00o, oooO00o);
                    } else if (b == 3) {
                        OooO0O0 oooO0O0 = new OooO0O0(context, xmlResourceParser);
                        if (oooO00o != null) {
                            oooO00o.f64158OooO0O0.add(oooO0O0);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    public final int OooO00o(int i) {
        float f = -1;
        SparseArray<OooO00o> sparseArray = this.f64156OooO0O0;
        int i2 = 0;
        if (-1 == i) {
            OooO00o oooO00oValueAt = i == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (oooO00oValueAt != null) {
                while (true) {
                    ArrayList<OooO0O0> arrayList = oooO00oValueAt.f64158OooO0O0;
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (arrayList.get(i2).OooO00o(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? oooO00oValueAt.f64159OooO0OO : oooO00oValueAt.f64158OooO0O0.get(i2).f64164OooO0o0;
                }
            }
        } else {
            OooO00o oooO00o = sparseArray.get(i);
            if (oooO00o != null) {
                while (true) {
                    ArrayList<OooO0O0> arrayList2 = oooO00o.f64158OooO0O0;
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (arrayList2.get(i2).OooO00o(f, f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? oooO00o.f64159OooO0OO : oooO00o.f64158OooO0O0.get(i2).f64164OooO0o0;
            }
        }
        return -1;
    }
}
