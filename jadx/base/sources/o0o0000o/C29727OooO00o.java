package o0o0000o;

import java.util.LinkedHashSet;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0o0000o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29727OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f105414OooO00o = (float) Math.toRadians(6.0d);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f105415OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Float f105416OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f105417OooO0Oo;

    public C29727OooO00o() {
        float[] fArr = {0.0f, 45.0f, 90.0f, 135.0f};
        if (fArr.length == 0) {
            throw new IllegalArgumentException("At least one anchor angle is required.");
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (float f : fArr) {
            float f2 = f % 360.0f;
            linkedHashSet.add(Float.valueOf(f2 < 0.0f ? f2 + 360.0f : f2));
            float f3 = (f + 180.0f) % 360.0f;
            if (f3 < 0.0f) {
                f3 += 360.0f;
            }
            linkedHashSet.add(Float.valueOf(f3));
        }
        this.f105415OooO0O0 = OooOo.oo000o(linkedHashSet);
    }

    public static float OooO00o(float f, float f2) {
        float f3 = (f - f2) % 360.0f;
        if (f3 < -180.0f) {
            f3 += 360.0f;
        } else if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        return Math.abs(f3);
    }
}
