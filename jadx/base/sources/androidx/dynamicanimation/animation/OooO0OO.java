package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO<T> {
    final String mPropertyName;

    public static class OooO00o extends OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f64688OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, FloatProperty floatProperty) {
            super(str);
            this.f64688OooO00o = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final float getValue(T t) {
            return ((Float) this.f64688OooO00o.get(t)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.OooO0OO
        public final void setValue(T t, float f) {
            this.f64688OooO00o.setValue(t, f);
        }
    }

    public OooO0OO(String str) {
        this.mPropertyName = str;
    }

    public static <T> OooO0OO<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new OooO00o(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
