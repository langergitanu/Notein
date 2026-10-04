package Ooooooo;

import OooO0Oo.C20398OooO0O0;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: Ooooooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21474OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final XmlResourceParser f62188OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f62189OooO0O0 = 0;

    public C21474OooO00o(XmlResourceParser xmlResourceParser) {
        this.f62188OooO00o = xmlResourceParser;
    }

    public final float OooO00o(TypedArray typedArray, String str, int i, float f) {
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.f62188OooO00o, str, i, f);
        OooO0Oo(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int OooO0O0(TypedArray typedArray, String str, int i, int i2) {
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.f62188OooO00o, str, i, i2);
        OooO0Oo(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final TypedArray OooO0OO(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, iArr);
        OooOOO0.OooO0o(typedArrayObtainAttributes, "obtainAttributes(\n      …          attrs\n        )");
        OooO0Oo(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final void OooO0Oo(int i) {
        this.f62189OooO0O0 = i | this.f62189OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21474OooO00o)) {
            return false;
        }
        C21474OooO00o c21474OooO00o = (C21474OooO00o) obj;
        return this.f62188OooO00o.equals(c21474OooO00o.f62188OooO00o) && this.f62189OooO0O0 == c21474OooO00o.f62189OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62189OooO0O0) + (this.f62188OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f62188OooO00o);
        sb.append(", config=");
        return C20398OooO0O0.OooO00o(')', sb, this.f62189OooO0O0);
    }
}
