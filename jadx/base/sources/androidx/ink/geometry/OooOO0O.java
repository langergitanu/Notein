package androidx.ink.geometry;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20856OooooOo;
import androidx.ink.geometry.OooOOO;
import androidx.ink.geometry.OooOOO0;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.C32520OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.Oooo000;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f65411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO f65412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f65413OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f65414OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f65415OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f65410OooO0oO = {new C24028OooOoO0(OooOO0O.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO0O0 f65409OooO0o = new OooO0O0();

    public static final /* synthetic */ class OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<Long> {
        @Override // oO0O000o.OooO00o
        public final Long invoke() {
            return Long.valueOf(((MeshNative) this.receiver).createEmpty());
        }
    }

    public static final class OooO0O0 {
    }

    public static final /* synthetic */ class OooO0OO extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((MeshNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooOO0O(oO0O000o.OooO00o<Long> oooO00o) {
        MeshNative meshNative = MeshNative.f65388OooO00o;
        this.f65411OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0OO(1, meshNative, MeshNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        OooOOO.OooO00o oooO00o2 = OooOOO.f65418OooO0O0;
        OooO oooO = new OooO(this, 0);
        oooO00o2.getClass();
        this.f65412OooO0O0 = new OooOOO(oooO);
        this.f65413OooO0OO = meshNative.getVertexCount(OooO00o());
        meshNative.getVertexStride(OooO00o());
        meshNative.getTriangleCount(OooO00o());
        this.f65414OooO0Oo = C20519OooO0Oo.OooO0OO(new OooOO0(this, 0));
        oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, meshNative.getAttributeCount(OooO00o()));
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
        Iterator<Integer> it = OooO2.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            float[] fArr = new float[4];
            float[] fArr2 = new float[4];
            int iFillAttributeUnpackingParams = MeshNative.f65388OooO00o.fillAttributeUnpackingParams(OooO00o(), ((Oooo000) it).nextInt(), fArr, fArr2);
            float[] fArrOooo0o = oOo000Oo.OooOOO.Oooo0o(fArr, oO0O00oo.OooOO0.OooO(0, iFillAttributeUnpackingParams));
            float[] fArrOooo0o2 = oOo000Oo.OooOOO.Oooo0o(fArr2, oO0O00oo.OooOO0.OooO(0, iFillAttributeUnpackingParams));
            if (fArrOooo0o.length != fArrOooo0o2.length) {
                throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Given ", fArrOooo0o.length, " offsets and ", " scales but those should be the same size.", fArrOooo0o2.length).toString());
            }
            int iMin = Math.min(fArrOooo0o.length, fArrOooo0o2.length);
            ArrayList arrayList2 = new ArrayList(iMin);
            for (int i = 0; i < iMin; i++) {
                arrayList2.add(new OooOOO0.OooO00o(fArrOooo0o[i], fArrOooo0o2[i]));
            }
            arrayList.add(new OooOOO0(arrayList2));
        }
        this.f65415OooO0o0 = arrayList;
    }

    public final long OooO00o() {
        return this.f65411OooO00o.OooO00o(this, f65410OooO0oO[0]);
    }

    public final String toString() {
        return "Mesh(bounds=" + ((OooO0o) this.f65414OooO0Oo.getValue()) + ", vertexCount=" + this.f65413OooO0OO + ", nativePointer=" + OooO00o() + ")";
    }

    public OooOO0O() {
        this(new OooO00o(0, MeshNative.f65388OooO00o, MeshNative.class, "createEmpty", "createEmpty()J", 0));
    }
}
