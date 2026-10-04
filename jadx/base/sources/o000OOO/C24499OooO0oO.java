package o000OOO;

import OooooO0.C21292OooO0oo;
import java.util.Arrays;
import o000OO0o.C24495OooO00o;

/* JADX INFO: renamed from: o000OOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24499OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f82838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f82839OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f82840OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float[] f82841OooO0Oo;

    /* JADX INFO: renamed from: o000OOO.OooO0oO$OooO00o */
    public static final class OooO00o extends C24499OooO0oO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C24504OooOOo0 f82842OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C24504OooOOo0 f82843OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float[] f82844OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C24504OooOOo0 c24504OooOOo0, C24504OooOOo0 mDestination) {
            float[] fArrOooO0o;
            super(c24504OooOOo0, mDestination, c24504OooOOo0, mDestination, null);
            kotlin.jvm.internal.OooOOO0.OooO0oO(mDestination, "mDestination");
            this.f82843OooO0o0 = c24504OooOOo0;
            this.f82842OooO0o = mDestination;
            C24505OooOOoo c24505OooOOoo = c24504OooOOo0.f82868OooO0Oo;
            C24505OooOOoo c24505OooOOoo2 = mDestination.f82868OooO0Oo;
            boolean zOooO0OO = C24497OooO0Oo.OooO0OO(c24505OooOOoo, c24505OooOOoo2);
            float[] fArrOooO0o2 = c24504OooOOo0.f82867OooO;
            float[] fArrOooO0o0 = mDestination.f82873OooOO0;
            if (zOooO0OO) {
                fArrOooO0o = C24497OooO0Oo.OooO0o(fArrOooO0o0, fArrOooO0o2);
            } else {
                float[] fArrOooO00o = c24505OooOOoo.OooO00o();
                float[] fArrOooO00o2 = c24505OooOOoo2.OooO00o();
                C24505OooOOoo c24505OooOOoo3 = OooOO0.f82847OooO0O0;
                boolean zOooO0OO2 = C24497OooO0Oo.OooO0OO(c24505OooOOoo, c24505OooOOoo3);
                float[] fArr = OooOO0.f82850OooO0o0;
                float[] fArr2 = o000OOO.OooO00o.f82818OooO0O0.f82819OooO00o;
                if (!zOooO0OO2) {
                    float[] fArrCopyOf = Arrays.copyOf(fArr, 3);
                    kotlin.jvm.internal.OooOOO0.OooO0o(fArrCopyOf, "copyOf(...)");
                    fArrOooO0o2 = C24497OooO0Oo.OooO0o(C24497OooO0Oo.OooO0O0(fArr2, fArrOooO00o, fArrCopyOf), fArrOooO0o2);
                }
                if (!C24497OooO0Oo.OooO0OO(c24505OooOOoo2, c24505OooOOoo3)) {
                    float[] fArrCopyOf2 = Arrays.copyOf(fArr, 3);
                    kotlin.jvm.internal.OooOOO0.OooO0o(fArrCopyOf2, "copyOf(...)");
                    fArrOooO0o0 = C24497OooO0Oo.OooO0o0(C24497OooO0Oo.OooO0o(C24497OooO0Oo.OooO0O0(fArr2, fArrOooO00o2, fArrCopyOf2), mDestination.f82867OooO));
                }
                fArrOooO0o = C24497OooO0Oo.OooO0o(fArrOooO0o0, fArrOooO0o2);
            }
            this.f82844OooO0oO = fArrOooO0o;
        }

        @Override // o000OOO.C24499OooO0oO
        public final long OooO00o(long j) {
            float fOooO0o = C24495OooO00o.OooO0o(j);
            float fOooO0o0 = C24495OooO00o.OooO0o0(j);
            float fOooO0OO = C24495OooO00o.OooO0OO(j);
            float fOooO0O0 = C24495OooO00o.OooO0O0(j);
            C24504OooOOo0 c24504OooOOo0 = this.f82843OooO0o0;
            float fOooO00o = (float) c24504OooOOo0.f82876OooOOO.OooO00o(fOooO0o);
            OooOOOO oooOOOO = c24504OooOOo0.f82876OooOOO;
            float fOooO00o2 = (float) oooOOOO.OooO00o(fOooO0o0);
            float fOooO00o3 = (float) oooOOOO.OooO00o(fOooO0OO);
            float[] fArr = this.f82844OooO0oO;
            float f = (fArr[6] * fOooO00o3) + (fArr[3] * fOooO00o2) + (fArr[0] * fOooO00o);
            float f2 = (fArr[7] * fOooO00o3) + (fArr[4] * fOooO00o2) + (fArr[1] * fOooO00o);
            float f3 = (fArr[8] * fOooO00o3) + (fArr[5] * fOooO00o2) + (fArr[2] * fOooO00o);
            C24504OooOOo0 c24504OooOOo02 = this.f82842OooO0o;
            float fOooO00o4 = (float) c24504OooOOo02.f82875OooOO0o.OooO00o(f);
            double d = f2;
            com.google.gson.internal.OooO0OO oooO0OO = c24504OooOOo02.f82875OooOO0o;
            return C21292OooO0oo.OooO00o(fOooO00o4, (float) oooO0OO.OooO00o(d), (float) oooO0OO.OooO00o(f3), fOooO0O0, c24504OooOOo02);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24499OooO0oO(OooO0OO source, OooO0OO destination, int i) {
        float[] fArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
        long j = OooO0O0.f82820OooO00o;
        long j2 = source.f82826OooO0O0;
        OooO0OO oooO0OOOooO00o = OooO0O0.OooO00o(j2, j) ? C24497OooO0Oo.OooO00o(source) : source;
        long j3 = destination.f82826OooO0O0;
        OooO0OO oooO0OOOooO00o2 = OooO0O0.OooO00o(j3, j) ? C24497OooO0Oo.OooO00o(destination) : destination;
        if (i == 3) {
            boolean zOooO00o = OooO0O0.OooO00o(j2, j);
            boolean zOooO00o2 = OooO0O0.OooO00o(j3, j);
            if (!(zOooO00o && zOooO00o2) && (zOooO00o || zOooO00o2)) {
                OooO0OO oooO0OO = zOooO00o ? source : destination;
                float[] fArrOooO00o = OooOO0.f82850OooO0o0;
                C24505OooOOoo c24505OooOOoo = ((C24504OooOOo0) oooO0OO).f82868OooO0Oo;
                float[] fArrOooO00o2 = zOooO00o ? c24505OooOOoo.OooO00o() : fArrOooO00o;
                fArrOooO00o = zOooO00o2 ? c24505OooOOoo.OooO00o() : fArrOooO00o;
                fArr = new float[]{fArrOooO00o2[0] / fArrOooO00o[0], fArrOooO00o2[1] / fArrOooO00o[1], fArrOooO00o2[2] / fArrOooO00o[2]};
            } else {
                fArr = null;
            }
        }
        this(source, destination, oooO0OOOooO00o, oooO0OOOooO00o2, fArr);
    }

    public long OooO00o(long j) {
        float fOooO0o = C24495OooO00o.OooO0o(j);
        float fOooO0o0 = C24495OooO00o.OooO0o0(j);
        float fOooO0OO = C24495OooO00o.OooO0OO(j);
        float fOooO0O0 = C24495OooO00o.OooO0O0(j);
        OooO0OO oooO0OO = this.f82839OooO0O0;
        long jOooO0o0 = oooO0OO.OooO0o0(fOooO0o, fOooO0o0, fOooO0OO);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jOooO0o0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jOooO0o0 & 4294967295L));
        float fOooO0oO = oooO0OO.OooO0oO(fOooO0o, fOooO0o0, fOooO0OO);
        float[] fArr = this.f82841OooO0Oo;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fOooO0oO *= fArr[2];
        }
        float f = fIntBitsToFloat;
        float f2 = fIntBitsToFloat2;
        return this.f82840OooO0OO.OooO0oo(f, f2, fOooO0oO, fOooO0O0, this.f82838OooO00o);
    }

    public C24499OooO0oO(OooO0OO source, OooO0OO destination, OooO0OO oooO0OO, OooO0OO transformDestination, float[] fArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
        kotlin.jvm.internal.OooOOO0.OooO0oO(transformDestination, "transformDestination");
        this.f82838OooO00o = destination;
        this.f82839OooO0O0 = oooO0OO;
        this.f82840OooO0OO = transformDestination;
        this.f82841OooO0Oo = fArr;
    }
}
