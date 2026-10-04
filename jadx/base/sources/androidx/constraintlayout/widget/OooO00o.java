package androidx.constraintlayout.widget;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f63968OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f63969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public EnumC19004OooO00o f63970OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f63971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f63972OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f63973OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f63974OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f63975OooO0oo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class EnumC19004OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC19004OooO00o f63976OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC19004OooO00o f63977OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC19004OooO00o f63978OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC19004OooO00o f63979OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final EnumC19004OooO00o f63980OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final EnumC19004OooO00o f63981OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final EnumC19004OooO00o f63982OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final EnumC19004OooO00o f63983OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final /* synthetic */ EnumC19004OooO00o[] f63984OooOooo;

        static {
            EnumC19004OooO00o enumC19004OooO00o = new EnumC19004OooO00o("INT_TYPE", 0);
            f63977OooOo0o = enumC19004OooO00o;
            EnumC19004OooO00o enumC19004OooO00o2 = new EnumC19004OooO00o("FLOAT_TYPE", 1);
            f63976OooOo = enumC19004OooO00o2;
            EnumC19004OooO00o enumC19004OooO00o3 = new EnumC19004OooO00o("COLOR_TYPE", 2);
            f63979OooOoO0 = enumC19004OooO00o3;
            EnumC19004OooO00o enumC19004OooO00o4 = new EnumC19004OooO00o("COLOR_DRAWABLE_TYPE", 3);
            f63978OooOoO = enumC19004OooO00o4;
            EnumC19004OooO00o enumC19004OooO00o5 = new EnumC19004OooO00o("STRING_TYPE", 4);
            f63980OooOoOO = enumC19004OooO00o5;
            EnumC19004OooO00o enumC19004OooO00o6 = new EnumC19004OooO00o("BOOLEAN_TYPE", 5);
            f63982OooOoo0 = enumC19004OooO00o6;
            EnumC19004OooO00o enumC19004OooO00o7 = new EnumC19004OooO00o("DIMENSION_TYPE", 6);
            f63981OooOoo = enumC19004OooO00o7;
            EnumC19004OooO00o enumC19004OooO00o8 = new EnumC19004OooO00o("REFERENCE_TYPE", 7);
            f63983OooOooO = enumC19004OooO00o8;
            f63984OooOooo = new EnumC19004OooO00o[]{enumC19004OooO00o, enumC19004OooO00o2, enumC19004OooO00o3, enumC19004OooO00o4, enumC19004OooO00o5, enumC19004OooO00o6, enumC19004OooO00o7, enumC19004OooO00o8};
        }

        public EnumC19004OooO00o() {
            throw null;
        }

        public static EnumC19004OooO00o valueOf(String str) {
            return (EnumC19004OooO00o) Enum.valueOf(EnumC19004OooO00o.class, str);
        }

        public static EnumC19004OooO00o[] values() {
            return (EnumC19004OooO00o[]) f63984OooOooo.clone();
        }
    }

    public OooO00o(OooO00o oooO00o, Object obj) {
        this.f63969OooO0O0 = oooO00o.f63969OooO0O0;
        this.f63970OooO0OO = oooO00o.f63970OooO0OO;
        OooO0o(obj);
    }

    public static void OooO0Oo(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        EnumC19004OooO00o enumC19004OooO00o;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64135OooO0o0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC19004OooO00o enumC19004OooO00o2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC19004OooO00o2 = EnumC19004OooO00o.f63982OooOoo0;
            } else {
                if (index == 3) {
                    enumC19004OooO00o = EnumC19004OooO00o.f63979OooOoO0;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC19004OooO00o = EnumC19004OooO00o.f63978OooOoO;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    EnumC19004OooO00o enumC19004OooO00o3 = EnumC19004OooO00o.f63981OooOoo;
                    if (index == 7) {
                        objValueOf2 = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf2 = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        enumC19004OooO00o = EnumC19004OooO00o.f63976OooOo;
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        enumC19004OooO00o = EnumC19004OooO00o.f63977OooOo0o;
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 9) {
                        enumC19004OooO00o = EnumC19004OooO00o.f63980OooOoOO;
                        objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    } else if (index == 8) {
                        enumC19004OooO00o = EnumC19004OooO00o.f63983OooOooO;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        if (resourceId == -1) {
                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        objValueOf = Integer.valueOf(resourceId);
                    }
                    enumC19004OooO00o2 = enumC19004OooO00o3;
                }
                Object obj = objValueOf;
                enumC19004OooO00o2 = enumC19004OooO00o;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f63969OooO0O0 = string;
            oooO00o.f63970OooO0OO = enumC19004OooO00o2;
            oooO00o.f63968OooO00o = z;
            oooO00o.OooO0o(objValueOf2);
            map.put(string, oooO00o);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void OooO0o0(View view, HashMap<String, OooO00o> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            OooO00o oooO00o = map.get(str);
            String strOooO00o = !oooO00o.f63968OooO00o ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("set", str) : str;
            try {
                int iOrdinal = oooO00o.f63970OooO0OO.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strOooO00o, cls3).invoke(view, Integer.valueOf(oooO00o.f63971OooO0Oo));
                        break;
                    case 1:
                        cls.getMethod(strOooO00o, cls2).invoke(view, Float.valueOf(oooO00o.f63973OooO0o0));
                        break;
                    case 2:
                        cls.getMethod(strOooO00o, cls3).invoke(view, Integer.valueOf(oooO00o.f63975OooO0oo));
                        break;
                    case 3:
                        Method method = cls.getMethod(strOooO00o, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(oooO00o.f63975OooO0oo);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strOooO00o, CharSequence.class).invoke(view, oooO00o.f63972OooO0o);
                        break;
                    case 5:
                        cls.getMethod(strOooO00o, Boolean.TYPE).invoke(view, Boolean.valueOf(oooO00o.f63974OooO0oO));
                        break;
                    case 6:
                        cls.getMethod(strOooO00o, cls2).invoke(view, Float.valueOf(oooO00o.f63973OooO0o0));
                        break;
                    case 7:
                        cls.getMethod(strOooO00o, cls3).invoke(view, Integer.valueOf(oooO00o.f63971OooO0Oo));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str, "\" not found on ");
                sbOooO0o0.append(cls.getName());
                Log.e("TransitionLayout", sbOooO0o0.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strOooO00o, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str, "\" not found on ");
                sbOooO0o02.append(cls.getName());
                Log.e("TransitionLayout", sbOooO0o02.toString(), e3);
            }
        }
    }

    public final float OooO00o() {
        switch (this.f63970OooO0OO.ordinal()) {
            case 0:
                return this.f63971OooO0Oo;
            case 1:
            case 6:
                return this.f63973OooO0o0;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f63974OooO0oO ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void OooO0O0(float[] fArr) {
        switch (this.f63970OooO0OO.ordinal()) {
            case 0:
                fArr[0] = this.f63971OooO0Oo;
                return;
            case 1:
                fArr[0] = this.f63973OooO0o0;
                return;
            case 2:
            case 3:
                int i = (this.f63975OooO0oo >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f63974OooO0oO ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f63973OooO0o0;
                return;
            default:
                return;
        }
    }

    public final int OooO0OO() {
        int iOrdinal = this.f63970OooO0OO.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void OooO0o(Object obj) {
        switch (this.f63970OooO0OO.ordinal()) {
            case 0:
            case 7:
                this.f63971OooO0Oo = ((Integer) obj).intValue();
                break;
            case 1:
                this.f63973OooO0o0 = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f63975OooO0oo = ((Integer) obj).intValue();
                break;
            case 4:
                this.f63972OooO0o = (String) obj;
                break;
            case 5:
                this.f63974OooO0oO = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f63973OooO0o0 = ((Float) obj).floatValue();
                break;
        }
    }
}
