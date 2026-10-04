package androidx.ink.geometry;

import Oooo0oO.o0Oo0oo;
import java.util.ArrayList;
import java.util.List;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO00o> f65421OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f65422OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f65423OooO0O0;

        public OooO00o(float f, float f2) {
            this.f65422OooO00o = f;
            this.f65423OooO0O0 = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f65422OooO00o == oooO00o.f65422OooO00o && this.f65423OooO0O0 == oooO00o.f65423OooO0O0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f65423OooO0O0) + (Float.hashCode(this.f65422OooO00o) * 31);
        }

        public final String toString() {
            return "ComponentUnpackingParams(offset=" + this.f65422OooO00o + ", scale=" + this.f65423OooO0O0 + ")";
        }
    }

    public OooOOO0(ArrayList arrayList) {
        this.f65421OooO00o = OooOo.o0ooOO0(arrayList);
        int size = arrayList.size();
        if (1 > size || size >= 5) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(arrayList.size(), "Given ", " components but there should be between 1 and 4.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOOO0) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f65421OooO00o, ((OooOOO0) obj).f65421OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65421OooO00o.hashCode();
    }

    public final String toString() {
        List<OooO00o> list = this.f65421OooO00o;
        return "MeshAttributeUnpackingParams[" + list.size() + "](components=" + list + ")";
    }
}
