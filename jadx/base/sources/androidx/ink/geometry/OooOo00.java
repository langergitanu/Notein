package androidx.ink.geometry;

import OooO0Oo.C20398OooO0O0;
import OooOoOO.C20519OooO0Oo;
import Oooo0.C20855OooooOO;
import androidx.ink.geometry.OooOOO;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f65438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f65439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32447OooOOo f65440OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f65437OooO0o0 = {new C24028OooOoO0(OooOo00.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f65436OooO0Oo = new OooO0O0();

    public static final /* synthetic */ class OooO00o extends C24019OooOO0o implements oO0O000o.OooO00o<Long> {
        @Override // oO0O000o.OooO00o
        public final Long invoke() {
            return Long.valueOf(((PartitionedMeshNative) this.receiver).createEmptyForTesting());
        }
    }

    public static final class OooO0O0 {
    }

    public static final /* synthetic */ class OooO0OO extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((PartitionedMeshNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooOo00(oO0O000o.OooO00o<Long> oooO00o) {
        this.f65438OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0OO(1, PartitionedMeshNative.f65441OooO00o, PartitionedMeshNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
        oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, OooO0o0());
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
        Iterator<Integer> it = OooO2.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            long[] renderGroupMeshPointers = PartitionedMeshNative.f65441OooO00o.getRenderGroupMeshPointers(OooO0O0(), ((Oooo000) it).nextInt());
            ArrayList arrayList2 = new ArrayList(renderGroupMeshPointers.length);
            for (long j : renderGroupMeshPointers) {
                OooOO0O.f65409OooO0o.getClass();
                arrayList2.add(new OooOO0O(new C21959OooOO0o(j, 0)));
            }
            arrayList.add(arrayList2);
        }
        this.f65439OooO0O0 = arrayList;
        this.f65440OooO0OO = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: androidx.ink.geometry.OooOOoo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return PartitionedMeshNative.f65441OooO00o.createBounds(this.f65435OooOo0o.OooO0O0());
            }
        });
    }

    public final OooO0o OooO00o() {
        return (OooO0o) this.f65440OooO0OO.getValue();
    }

    public final long OooO0O0() {
        return this.f65438OooO00o.OooO00o(this, f65437OooO0o0[0]);
    }

    public final int OooO0OO(int i) {
        if (i < 0 || i >= OooO0o0()) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, OooO0o0(), "groupIndex=", " must be between 0 and getRenderGroupCount()=").toString());
        }
        int outlineCount = PartitionedMeshNative.f65441OooO00o.getOutlineCount(OooO0O0(), i);
        if (outlineCount >= 0) {
            return outlineCount;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int OooO0Oo(int i, int i2) {
        if (i2 < 0 || i2 >= OooO0OO(i)) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, OooO0OO(i), "outlineIndex=", " must be between 0 and getOutlineCount=").toString());
        }
        int outlineVertexCount = PartitionedMeshNative.f65441OooO00o.getOutlineVertexCount(OooO0O0(), i, i2);
        if (outlineVertexCount >= 0) {
            return outlineVertexCount;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void OooO0o(int i, int i2, int i3, MutableVec mutableVec) {
        int iOooO0Oo = OooO0Oo(i, i2);
        if (i3 >= 0 && i3 < iOooO0Oo) {
            PartitionedMeshNative.f65441OooO00o.populateOutlineVertexPosition(OooO0O0(), i, i2, i3, mutableVec);
        } else {
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("outlineVertexIndex=", i3, " must be between 0 and outlineVertexCount(", ")=", i3);
            sbOooO0O0.append(iOooO0Oo);
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
    }

    public final int OooO0o0() {
        int renderGroupCount = PartitionedMeshNative.f65441OooO00o.getRenderGroupCount(OooO0O0());
        if (renderGroupCount >= 0) {
            return renderGroupCount;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final OooOOO OooO0oO(final int i) {
        if (i < 0 || i >= OooO0o0()) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, OooO0o0(), "groupIndex=", " must be between 0 and getRenderGroupCount()=").toString());
        }
        OooOOO.OooO00o oooO00o = OooOOO.f65418OooO0O0;
        oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: androidx.ink.geometry.OooOOo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return Long.valueOf(PartitionedMeshNative.f65441OooO00o.newCopyOfRenderGroupFormat(this.f65434OooOo0o.OooO0O0(), i));
            }
        };
        oooO00o.getClass();
        return new OooOOO(oooO00o2);
    }

    public final List<OooOO0O> OooO0oo(int i) {
        if (i < 0 || i >= OooO0o0()) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, OooO0o0(), "groupIndex=", " must be between 0 and getRenderGroupCount()=").toString());
        }
        return (List) this.f65439OooO0O0.get(i);
    }

    public final String toString() {
        return "PartitionedMesh(bounds=" + OooO00o() + ", meshesByGroup=" + this.f65439OooO0O0 + ")";
    }

    public OooOo00() {
        this(new OooO00o(0, PartitionedMeshNative.f65441OooO00o, PartitionedMeshNative.class, "createEmptyForTesting", "createEmptyForTesting()J", 0));
    }
}
