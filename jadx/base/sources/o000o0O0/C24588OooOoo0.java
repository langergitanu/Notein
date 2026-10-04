package o000o0O0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.huawei.hms.network.embedded.C18416x7;
import java.io.IOException;
import java.io.Serializable;
import o000o0O.C24563OooO00o;
import o000o0O0.AbstractC24590OooOooo;
import o000o0O0.C24565OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33595OooOOo;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o000o0O0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24588OooOoo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f83333OooO0OO = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f83334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C24600Oooo0OO f83335OooO0O0;

    /* JADX INFO: renamed from: o000o0O0.OooOoo0$OooO00o */
    public static final class OooO00o {
        public static AbstractC24590OooOooo OooO00o(TypedValue typedValue, AbstractC24590OooOooo abstractC24590OooOooo, AbstractC24590OooOooo abstractC24590OooOooo2, String str, String str2) throws XmlPullParserException {
            if (abstractC24590OooOooo == null || abstractC24590OooOooo == abstractC24590OooOooo2) {
                return abstractC24590OooOooo == null ? abstractC24590OooOooo2 : abstractC24590OooOooo;
            }
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Type is ", str, " but found ", str2, ": ");
            sbOooO0O0.append(typedValue.data);
            throw new XmlPullParserException(sbOooO0O0.toString());
        }
    }

    public C24588OooOoo0(Context context, C24600Oooo0OO navigatorProvider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(navigatorProvider, "navigatorProvider");
        this.f83334OooO00o = context;
        this.f83335OooO0O0 = navigatorProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO OooO0OO(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        boolean z;
        AbstractC24590OooOooo.C24592OooO0o0 c24592OooO0o0;
        AbstractC24590OooOooo abstractC24590OooOooo;
        AbstractC24590OooOooo c24596OooOOOo;
        Class cls;
        boolean z2;
        AbstractC24590OooOooo abstractC24590OooOooo2;
        Object objOooO0o0;
        AbstractC24590OooOooo c24596OooOOOo2;
        AbstractC24590OooOooo abstractC24590OooOoooOooO00o;
        Object objValueOf;
        int i2;
        boolean z3 = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f83333OooO0OO;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        AbstractC24590OooOooo.OooO oooO = AbstractC24590OooOooo.f83342OooO0OO;
        AbstractC24590OooOooo.OooO0OO oooO0OO = AbstractC24590OooOooo.f83347OooO0oo;
        AbstractC24590OooOooo.OooOO0 oooOO02 = AbstractC24590OooOooo.f83350OooOO0o;
        AbstractC24590OooOooo.OooO00o oooO00o = AbstractC24590OooOooo.f83348OooOO0;
        AbstractC24590OooOooo.C24593OooO0oO c24593OooO0oO = AbstractC24590OooOooo.f83344OooO0o;
        AbstractC24590OooOooo.C24592OooO0o0 c24592OooO0o02 = AbstractC24590OooOooo.f83343OooO0Oo;
        AbstractC24590OooOooo.C24594OooO0oo c24594OooO0oo = AbstractC24590OooOooo.f83345OooO0o0;
        AbstractC24590OooOooo.OooOO0O oooOO0O = AbstractC24590OooOooo.f83349OooOO0O;
        AbstractC24590OooOooo.OooO0O0 oooO0O0 = AbstractC24590OooOooo.f83340OooO;
        AbstractC24590OooOooo.C24591OooO0Oo c24591OooO0Oo = AbstractC24590OooOooo.f83346OooO0oO;
        AbstractC24590OooOooo.OooO0o oooO0o = AbstractC24590OooOooo.f83341OooO0O0;
        if (string != null) {
            c24592OooO0o0 = c24592OooO0o02;
            String resourcePackageName = resources.getResourcePackageName(i);
            if ("integer".equals(string)) {
                z = z3;
                abstractC24590OooOooo = c24594OooO0oo;
                c24596OooOOOo = oooO0o;
            } else {
                z = z3;
                if ("integer[]".equals(string)) {
                    abstractC24590OooOooo = c24594OooO0oo;
                    c24596OooOOOo = c24592OooO0o0;
                } else if ("long".equals(string)) {
                    c24596OooOOOo = c24594OooO0oo;
                    abstractC24590OooOooo = c24596OooOOOo;
                } else if ("long[]".equals(string)) {
                    abstractC24590OooOooo = c24594OooO0oo;
                    c24596OooOOOo = c24593OooO0oO;
                } else if ("boolean".equals(string)) {
                    abstractC24590OooOooo = c24594OooO0oo;
                    c24596OooOOOo = oooO0O0;
                } else if ("boolean[]".equals(string)) {
                    abstractC24590OooOooo = c24594OooO0oo;
                    c24596OooOOOo = oooO00o;
                } else if (!"string".equals(string)) {
                    if ("string[]".equals(string)) {
                        abstractC24590OooOooo = c24594OooO0oo;
                        c24596OooOOOo = oooOO02;
                    } else {
                        if ("float".equals(string)) {
                            c24596OooOOOo = c24591OooO0Oo;
                        } else if ("float[]".equals(string)) {
                            abstractC24590OooOooo = c24594OooO0oo;
                            c24596OooOOOo = oooO0OO;
                        } else if ("reference".equals(string)) {
                            c24596OooOOOo = oooO;
                        } else if (string.length() == 0) {
                            abstractC24590OooOooo = c24594OooO0oo;
                            c24596OooOOOo = oooOO0O;
                        } else {
                            try {
                                abstractC24590OooOooo = c24594OooO0oo;
                                String strConcat = (!C33595OooOOo.OooOoO0(string, ".", false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                                if (C33595OooOOo.OooOOo0(string, C18416x7.f56644n, false)) {
                                    strConcat = strConcat.substring(0, strConcat.length() - 2);
                                    kotlin.jvm.internal.OooOOO0.OooO0o(strConcat, "this as java.lang.String…ing(startIndex, endIndex)");
                                    Class<?> cls2 = Class.forName(strConcat);
                                    if (!Parcelable.class.isAssignableFrom(cls2)) {
                                        if (Serializable.class.isAssignableFrom(cls2)) {
                                            c24596OooOOOo = new AbstractC24590OooOooo.OooOOOO(cls2);
                                        }
                                        throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                                    }
                                    c24596OooOOOo = new AbstractC24590OooOooo.OooOOO0(cls2);
                                } else {
                                    Class<?> cls3 = Class.forName(strConcat);
                                    if (Parcelable.class.isAssignableFrom(cls3)) {
                                        c24596OooOOOo = new AbstractC24590OooOooo.OooOOO(cls3);
                                    } else {
                                        if (!Enum.class.isAssignableFrom(cls3)) {
                                            if (Serializable.class.isAssignableFrom(cls3)) {
                                                c24596OooOOOo = new AbstractC24590OooOooo.C24596OooOOOo(cls3);
                                            }
                                            throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                                        }
                                        c24596OooOOOo = new AbstractC24590OooOooo.C24595OooOO0o(cls3);
                                    }
                                }
                            } catch (ClassNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        abstractC24590OooOooo = c24594OooO0oo;
                    }
                }
            }
        } else {
            z = z3;
            c24592OooO0o0 = c24592OooO0o02;
            abstractC24590OooOooo = c24594OooO0oo;
            c24596OooOOOo = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (c24596OooOOOo == oooO) {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    i2 = i3;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + c24596OooOOOo.OooO0O0() + ". Must be a reference to a resource.");
                    }
                    i2 = 0;
                }
                objOooO0o0 = Integer.valueOf(i2);
            } else {
                int i4 = typedValue.resourceId;
                if (i4 == 0) {
                    if (c24596OooOOOo == oooOO0O) {
                        z2 = true;
                        objOooO0o0 = typedArray.getString(1);
                    } else {
                        z2 = true;
                        int i5 = typedValue.type;
                        if (i5 != 3) {
                            if (i5 == 4) {
                                abstractC24590OooOoooOooO00o = OooO00o.OooO00o(typedValue, c24596OooOOOo, c24591OooO0Oo, string, "float");
                                objValueOf = Float.valueOf(typedValue.getFloat());
                            } else if (i5 == 5) {
                                abstractC24590OooOoooOooO00o = OooO00o.OooO00o(typedValue, c24596OooOOOo, oooO0o, string, "dimension");
                                objValueOf = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            } else if (i5 == 18) {
                                abstractC24590OooOoooOooO00o = OooO00o.OooO00o(typedValue, c24596OooOOOo, oooO0O0, string, "boolean");
                                objValueOf = Boolean.valueOf(typedValue.data != 0);
                            } else {
                                if (i5 < 16 || i5 > 31) {
                                    throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                }
                                if (c24596OooOOOo == c24591OooO0Oo) {
                                    abstractC24590OooOoooOooO00o = OooO00o.OooO00o(typedValue, c24596OooOOOo, c24591OooO0Oo, string, "float");
                                    objValueOf = Float.valueOf(typedValue.data);
                                } else {
                                    abstractC24590OooOoooOooO00o = OooO00o.OooO00o(typedValue, c24596OooOOOo, oooO0o, string, "integer");
                                    objValueOf = Integer.valueOf(typedValue.data);
                                }
                            }
                            c24596OooOOOo = abstractC24590OooOoooOooO00o;
                            objOooO0o0 = objValueOf;
                        } else {
                            String value = typedValue.string.toString();
                            if (c24596OooOOOo == null) {
                                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                                try {
                                    oooO0o.OooO0o0(value);
                                    c24596OooOOOo = oooO0o;
                                    abstractC24590OooOooo2 = abstractC24590OooOooo;
                                } catch (IllegalArgumentException unused) {
                                    abstractC24590OooOooo2 = abstractC24590OooOooo;
                                    try {
                                        try {
                                            try {
                                                abstractC24590OooOooo2.OooO0o0(value);
                                                c24596OooOOOo = abstractC24590OooOooo2;
                                            } catch (IllegalArgumentException unused2) {
                                                c24596OooOOOo = oooOO0O;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            oooO0O0.OooO0o0(value);
                                            c24596OooOOOo = oooO0O0;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        c24591OooO0Oo.OooO0o0(value);
                                        c24596OooOOOo = c24591OooO0Oo;
                                    }
                                }
                                objOooO0o0 = c24596OooOOOo.OooO0o0(value);
                            } else {
                                abstractC24590OooOooo2 = abstractC24590OooOooo;
                                objOooO0o0 = c24596OooOOOo.OooO0o0(value);
                            }
                        }
                    }
                    abstractC24590OooOooo2 = abstractC24590OooOooo;
                } else {
                    if (c24596OooOOOo != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + c24596OooOOOo.OooO0O0() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    objOooO0o0 = Integer.valueOf(i4);
                    c24596OooOOOo = oooO;
                }
            }
            abstractC24590OooOooo2 = abstractC24590OooOooo;
            z2 = true;
        } else {
            cls = Serializable.class;
            z2 = true;
            abstractC24590OooOooo2 = abstractC24590OooOooo;
            objOooO0o0 = null;
        }
        if (objOooO0o0 == null) {
            objOooO0o0 = null;
            z2 = false;
        }
        AbstractC24590OooOooo abstractC24590OooOooo3 = c24596OooOOOo != null ? c24596OooOOOo : null;
        if (abstractC24590OooOooo3 != null) {
            c24596OooOOOo2 = abstractC24590OooOooo3;
        } else if (objOooO0o0 instanceof Integer) {
            c24596OooOOOo2 = oooO0o;
        } else if (objOooO0o0 instanceof int[]) {
            c24596OooOOOo2 = c24592OooO0o0;
        } else if (objOooO0o0 instanceof Long) {
            c24596OooOOOo2 = abstractC24590OooOooo2;
        } else if (objOooO0o0 instanceof long[]) {
            c24596OooOOOo2 = c24593OooO0oO;
        } else if (objOooO0o0 instanceof Float) {
            c24596OooOOOo2 = c24591OooO0Oo;
        } else if (objOooO0o0 instanceof float[]) {
            c24596OooOOOo2 = oooO0OO;
        } else if (objOooO0o0 instanceof Boolean) {
            c24596OooOOOo2 = oooO0O0;
        } else if (objOooO0o0 instanceof boolean[]) {
            c24596OooOOOo2 = oooO00o;
        } else if ((objOooO0o0 instanceof String) || objOooO0o0 == null) {
            c24596OooOOOo2 = oooOO0O;
        } else if ((objOooO0o0 instanceof Object[]) && (((Object[]) objOooO0o0) instanceof String[])) {
            c24596OooOOOo2 = oooOO02;
        } else if (objOooO0o0.getClass().isArray()) {
            Class<?> componentType = objOooO0o0.getClass().getComponentType();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(componentType);
            if (Parcelable.class.isAssignableFrom(componentType)) {
                Class<?> componentType2 = objOooO0o0.getClass().getComponentType();
                if (componentType2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                }
                c24596OooOOOo2 = new AbstractC24590OooOooo.OooOOO0(componentType2);
            } else if (objOooO0o0.getClass().isArray()) {
                Class<?> componentType3 = objOooO0o0.getClass().getComponentType();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(componentType3);
                if (cls.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = objOooO0o0.getClass().getComponentType();
                    if (componentType4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                    c24596OooOOOo2 = new AbstractC24590OooOooo.OooOOOO(componentType4);
                } else if (objOooO0o0 instanceof Parcelable) {
                    c24596OooOOOo2 = new AbstractC24590OooOooo.OooOOO(objOooO0o0.getClass());
                } else if (objOooO0o0 instanceof Enum) {
                    c24596OooOOOo2 = new AbstractC24590OooOooo.C24595OooOO0o(objOooO0o0.getClass());
                } else {
                    if (!(objOooO0o0 instanceof Serializable)) {
                        throw new IllegalArgumentException("Object of type " + objOooO0o0.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    c24596OooOOOo2 = new AbstractC24590OooOooo.C24596OooOOOo(objOooO0o0.getClass());
                }
            }
        }
        return new OooO(c24596OooOOOo2, z, objOooO0o0, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024d, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24583OooOo0o OooO00o(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strOooOo0O;
        String strOooOo0O2;
        Context context;
        int i2;
        TypedArray typedArray;
        int i3 = i;
        String name = xmlResourceParser.getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(name, "parser.name");
        C24583OooOo0o c24583OooOo0oOooO00o = this.f83335OooO0O0.OooO0O0(name).OooO00o();
        Context context2 = this.f83334OooO00o;
        c24583OooOo0oOooO00o.OooO0oo(context2, attributeSet);
        int i4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = C24563OooO00o.f83164OooO0O0;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    c24583OooOo0oOooO00o.f83300OooOoo.put(string, OooO0OO(typedArrayObtainAttributes, resources, i3));
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, C24563OooO00o.f83165OooO0OO);
                    kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i4);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    String strOooOo0O3 = null;
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(packageName, "context.packageName");
                        strOooOo0O = C33595OooOOo.OooOo0O(string2, "${applicationId}", packageName);
                    } else {
                        strOooOo0O = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strOooOo0O2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(packageName2, "context.packageName");
                        strOooOo0O2 = C33595OooOOo.OooOo0O(string3, "${applicationId}", packageName2);
                        if (strOooOo0O2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        kotlin.jvm.internal.OooOOO0.OooO0o(packageName3, "context.packageName");
                        strOooOo0O3 = C33595OooOOo.OooOo0O(string4, "${applicationId}", packageName3);
                    }
                    c24583OooOo0oOooO00o.OooO0O0(new C24580OooOOoo(strOooOo0O, strOooOo0O2, strOooOo0O3));
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C24563OooO00o.f83163OooO00o, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        int i5 = i4;
                        C24567OooO0o0 c24567OooO0o0 = new C24567OooO0o0(typedArrayObtainStyledAttributes.getResourceId(i4, 0));
                        c24567OooO0o0.f83182OooO0O0 = new C24587OooOoo(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        context = context2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            i2 = depth2;
                            if (next2 == i5) {
                                typedArray = typedArrayObtainStyledAttributes;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            typedArray = typedArrayObtainStyledAttributes;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    OooO oooOOooO0OO = OooO0OO(typedArrayObtainAttributes3, resources, i3);
                                    boolean z = oooOOooO0OO.f83170OooO0OO;
                                    if (z && z) {
                                        oooOOooO0OO.f83168OooO00o.OooO0Oo(bundle, string5, oooOOooO0OO.f83171OooO0Oo);
                                    }
                                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i3 = i;
                            }
                            depth2 = i2;
                            typedArrayObtainStyledAttributes = typedArray;
                            i5 = 1;
                        }
                        if (!bundle.isEmpty()) {
                            c24567OooO0o0.f83183OooO0OO = bundle;
                        }
                        if (c24583OooOo0oOooO00o instanceof C24565OooO0O0.OooO00o) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + c24583OooOo0oOooO00o + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0");
                        }
                        c24583OooOo0oOooO00o.f83301OooOoo0.OooO0o0(resourceId, c24567OooO0o0);
                        typedArray.recycle();
                    } else {
                        context = context2;
                        i2 = depth2;
                        if ("include".equals(name2) && (c24583OooOo0oOooO00o instanceof C24585OooOoO0)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, C24603Oooo0oO.f83375OooO0OO);
                            kotlin.jvm.internal.OooOOO0.OooO0o(typedArrayObtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            ((C24585OooOoO0) c24583OooOo0oOooO00o).OooO(OooO0O0(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                            typedArrayObtainAttributes4.recycle();
                        } else if (c24583OooOo0oOooO00o instanceof C24585OooOoO0) {
                            ((C24585OooOoO0) c24583OooOo0oOooO00o).OooO(OooO00o(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i3 = i;
                    context2 = context;
                    depth2 = i2;
                    i4 = 1;
                }
            }
        }
    }

    public final C24585OooOoO0 OooO0O0(int i) {
        int next;
        Resources resources = this.f83334OooO00o.getResources();
        XmlResourceParser xml = resources.getXml(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        kotlin.jvm.internal.OooOOO0.OooO0o(attrs, "attrs");
        C24583OooOo0o c24583OooOo0oOooO00o = OooO00o(resources, xml, attrs, i);
        if (c24583OooOo0oOooO00o instanceof C24585OooOoO0) {
            return (C24585OooOoO0) c24583OooOo0oOooO00o;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
