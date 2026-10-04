package o000OO;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends AbstractC24443OooO0Oo {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f82562OooOo0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f82545OooO0Oo = 0.1f;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f82547OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f82546OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f82548OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public RectF f82549OooO0oo = new RectF();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public RectF f82544OooO = new RectF();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public HashMap<String, Method> f82550OooOO0 = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f82551OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f82552OooOO0o = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f82554OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f82553OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f82555OooOOOO = -1;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f82556OooOOOo = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public View f82558OooOOo0 = null;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f82557OooOOo = true;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f82559OooOOoo = true;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f82561OooOo00 = true;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f82560OooOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f82563OooOo0o = false;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f82564OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f82564OooO00o = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public OooOO0O() {
        this.f82477OooO0OO = new HashMap<>();
    }

    public static void OooO0oo(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO00o(HashMap<String, o0000O0O.OooO0OO> map) {
        throw null;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    /* JADX INFO: renamed from: OooO0O0 */
    public final AbstractC24443OooO0Oo clone() {
        OooOO0O oooOO0O = new OooOO0O();
        super.OooO0OO(this);
        oooOO0O.f82551OooOO0O = this.f82551OooOO0O;
        oooOO0O.f82552OooOO0o = this.f82552OooOO0o;
        oooOO0O.f82554OooOOO0 = this.f82554OooOOO0;
        oooOO0O.f82553OooOOO = this.f82553OooOOO;
        oooOO0O.f82555OooOOOO = this.f82555OooOOOO;
        oooOO0O.f82556OooOOOo = this.f82556OooOOOo;
        oooOO0O.f82558OooOOo0 = this.f82558OooOOo0;
        oooOO0O.f82545OooO0Oo = this.f82545OooO0Oo;
        oooOO0O.f82557OooOOo = this.f82557OooOOo;
        oooOO0O.f82559OooOOoo = this.f82559OooOOoo;
        oooOO0O.f82561OooOo00 = this.f82561OooOo00;
        oooOO0O.f82560OooOo0 = this.f82560OooOo0;
        oooOO0O.f82562OooOo0O = this.f82562OooOo0O;
        oooOO0O.f82563OooOo0o = this.f82563OooOo0o;
        oooOO0O.f82549OooO0oo = this.f82549OooO0oo;
        oooOO0O.f82544OooO = this.f82544OooO;
        oooOO0O.f82550OooOO0 = this.f82550OooOO0;
        return oooOO0O;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0Oo(HashSet<String> hashSet) {
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO0o.f64139OooOO0O);
        SparseIntArray sparseIntArray = OooO00o.f82564OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f82564OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f82554OooOOO0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f82553OooOOO = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f82551OooOO0O = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f82545OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f82545OooO0Oo);
                    break;
                case 6:
                    this.f82555OooOOOO = typedArrayObtainStyledAttributes.getResourceId(index, this.f82555OooOOOO);
                    break;
                case 7:
                    int i2 = MotionLayout.f63661ooOO;
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f82476OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f82476OooO0O0);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f82475OooO00o);
                    this.f82475OooO00o = integer;
                    this.f82560OooOo0 = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f82556OooOOOo = typedArrayObtainStyledAttributes.getResourceId(index, this.f82556OooOOOo);
                    break;
                case 10:
                    this.f82563OooOo0o = typedArrayObtainStyledAttributes.getBoolean(index, this.f82563OooOo0o);
                    break;
                case 11:
                    this.f82552OooOO0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f82552OooOO0o);
                    break;
                case 12:
                    this.f82548OooO0oO = typedArrayObtainStyledAttributes.getResourceId(index, this.f82548OooO0oO);
                    break;
                case 13:
                    this.f82547OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f82547OooO0o0);
                    break;
                case 14:
                    this.f82546OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f82546OooO0o);
                    break;
            }
        }
    }

    public final void OooO0oO(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f82550OooOO0.containsKey(str)) {
                method = this.f82550OooOO0.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f82550OooOO0.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f82550OooOO0.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + o000OO.OooO00o.OooO0OO(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f82551OooOO0O + "\"on class " + view.getClass().getSimpleName() + " " + o000OO.OooO00o.OooO0OO(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f82477OooO0OO.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.OooO00o oooO00o = this.f82477OooO0OO.get(str2);
                if (oooO00o != null) {
                    Class<?> cls = view.getClass();
                    boolean z2 = oooO00o.f63968OooO00o;
                    String str3 = oooO00o.f63969OooO0O0;
                    String strOooO00o = !z2 ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("set", str3) : str3;
                    try {
                        int iOrdinal = oooO00o.f63970OooO0OO.ordinal();
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iOrdinal) {
                            case 0:
                            case 7:
                                cls.getMethod(strOooO00o, cls2).invoke(view, Integer.valueOf(oooO00o.f63971OooO0Oo));
                                break;
                            case 1:
                                cls.getMethod(strOooO00o, cls3).invoke(view, Float.valueOf(oooO00o.f63973OooO0o0));
                                break;
                            case 2:
                                cls.getMethod(strOooO00o, cls2).invoke(view, Integer.valueOf(oooO00o.f63975OooO0oo));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strOooO00o, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(oooO00o.f63975OooO0oo);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strOooO00o, CharSequence.class).invoke(view, oooO00o.f63972OooO0o);
                                break;
                            case 5:
                                cls.getMethod(strOooO00o, Boolean.TYPE).invoke(view, Boolean.valueOf(oooO00o.f63974OooO0oO));
                                break;
                            case 6:
                                cls.getMethod(strOooO00o, cls3).invoke(view, Float.valueOf(oooO00o.f63973OooO0o0));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str3, "\" not found on ");
                        sbOooO0o0.append(cls.getName());
                        Log.e("TransitionLayout", sbOooO0o0.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strOooO00o, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str3, "\" not found on ");
                        sbOooO0o02.append(cls.getName());
                        Log.e("TransitionLayout", sbOooO0o02.toString(), e3);
                    }
                }
            }
        }
    }
}
