package o0ooOO0;

import android.os.Parcel;
import o0000Ooo.C24240OooOOOO;
import o0000Ooo.C24241OooOOOo;

/* JADX INFO: renamed from: o0ooOO0.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31599o00o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Parcel f112903OooO00o;

    public final void OooO00o(byte b) {
        this.f112903OooO00o.writeByte(b);
    }

    public final void OooO0O0(float f) {
        this.f112903OooO00o.writeFloat(f);
    }

    public final void OooO0OO(long j) {
        long jOooO0O0 = C24240OooOOOO.OooO0O0(j);
        byte b = 0;
        if (!C24241OooOOOo.OooO00o(jOooO0O0, 0L)) {
            if (C24241OooOOOo.OooO00o(jOooO0O0, 4294967296L)) {
                b = 1;
            } else if (C24241OooOOOo.OooO00o(jOooO0O0, 8589934592L)) {
                b = 2;
            }
        }
        OooO00o(b);
        if (C24241OooOOOo.OooO00o(C24240OooOOOO.OooO0O0(j), 0L)) {
            return;
        }
        OooO0O0(C24240OooOOOO.OooO0OO(j));
    }
}
