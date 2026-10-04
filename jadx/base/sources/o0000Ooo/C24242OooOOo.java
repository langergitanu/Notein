package o0000Ooo;

import OoooooO.C21445Oooo;
import java.util.ArrayList;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33912OooO0Oo;

/* JADX INFO: renamed from: o0000Ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24242OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81499OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f81500OooO0O0 = 0;

    public static final long OooO00o(float f, float f2) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = C24243OooOOo0.f81502OooO0OO;
        return jFloatToIntBits;
    }

    public static final void OooO0O0(int i, int i2, InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.OooO0o(i4));
            }
            i3 >>>= 1;
        }
        String serialName = descriptor.OooO0oo();
        kotlin.jvm.internal.OooOOO0.OooO0oO(serialName, "serialName");
        throw new C33912OooO0Oo(arrayList, arrayList.size() == 1 ? C21445Oooo.OooO0O0(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
