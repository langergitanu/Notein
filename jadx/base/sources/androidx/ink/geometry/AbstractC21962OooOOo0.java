package androidx.ink.geometry;

import androidx.ink.geometry.Vec;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.ink.geometry.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Landroidx/ink/geometry/OooOOo0;", "", "<init>", "()V", "OooO00o", "ink-geometry"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractC21962OooOOo0 {

    /* JADX INFO: renamed from: androidx.ink.geometry.OooOOo0$OooO00o */
    public static final class OooO00o {
        public static boolean OooO00o(AbstractC21962OooOOo0 abstractC21962OooOOo0, AbstractC21962OooOOo0 second) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
            int i = Vec.f65442OooO00o;
            return Vec.OooO00o.OooO00o(abstractC21962OooOOo0.OooO00o(), second.OooO00o()) && abstractC21962OooOOo0.OooO0o0() == second.OooO0o0() && abstractC21962OooOOo0.OooO0O0() == second.OooO0O0() && abstractC21962OooOOo0.OooO0OO() == second.OooO0OO() && abstractC21962OooOOo0.OooO0Oo() == second.OooO0Oo();
        }

        public static String OooO0O0(AbstractC21962OooOOo0 abstractC21962OooOOo0) {
            Vec vecOooO00o = abstractC21962OooOOo0.OooO00o();
            float fOooO0o0 = abstractC21962OooOOo0.OooO0o0();
            float fOooO0O0 = abstractC21962OooOOo0.OooO0O0();
            float fOooO0OO = abstractC21962OooOOo0.OooO0OO();
            float fOooO0Oo = abstractC21962OooOOo0.OooO0Oo();
            StringBuilder sb = new StringBuilder("Parallelogram(center=");
            sb.append(vecOooO00o);
            sb.append(", width=");
            sb.append(fOooO0o0);
            sb.append(", height=");
            sb.append(fOooO0O0);
            sb.append(", rotationDegrees=");
            sb.append(fOooO0OO);
            sb.append(", skew=");
            return Oooo00o.OooO0OO.OooO0OO(sb, fOooO0Oo, ")");
        }
    }

    public abstract Vec OooO00o();

    public abstract float OooO0O0();

    public abstract float OooO0OO();

    public abstract float OooO0Oo();

    public abstract float OooO0o0();
}
