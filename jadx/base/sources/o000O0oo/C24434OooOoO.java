package o000O0oo;

import OooOo.C20481OooOOoo;
import OooOo.C20483OooOo0O;
import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import o000O0oO.InterfaceC24414OooOO0o;
import o000O0oO.OooO0O0;

/* JADX INFO: renamed from: o000O0oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24434OooOoO<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ?>> implements InterfaceC24435OooOoO0<ShapeSpecT, InProgressShapeT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC24414OooOO0o<ShapeSpecT, InProgressShapeT, ?> f82457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C20481OooOOoo<OooO00o<InProgressShapeT>> f82458OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C20483OooOo0O<InProgressShapeT> f82459OooO0OO;

    /* JADX INFO: renamed from: o000O0oo.OooOoO$OooO00o */
    public static final class OooO00o<InProgressShapeT> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f82461OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f82462OooO0OO;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f82464OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f82460OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f82463OooO0Oo = new int[10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24434OooOoO(InterfaceC24414OooOO0o<? super ShapeSpecT, InProgressShapeT, ?> shapeWorkflow) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(shapeWorkflow, "shapeWorkflow");
        this.f82457OooO00o = shapeWorkflow;
        this.f82458OooO0O0 = new C20481OooOOoo<>((Object) null);
        this.f82459OooO0OO = new C20483OooOo0O<>((Object) null);
    }

    @Override // o000O0oo.InterfaceC24435OooOoO0
    public final void OooO00o(InProgressShapeT inProgressShape) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressShape, "inProgressShape");
        C20483OooOo0O<InProgressShapeT> c20483OooOo0O = this.f82459OooO0OO;
        if (c20483OooOo0O.OooO00o(inProgressShape) < 0) {
            throw new IllegalStateException(("Trying to recycle shape that was not obtained: " + inProgressShape).toString());
        }
        int iOooO0O0 = c20483OooOo0O.OooO0O0(inProgressShape);
        OooO00o<InProgressShapeT> oooO00oOooO0O0 = this.f82458OooO0O0.OooO0O0(iOooO0O0);
        if (oooO00oOooO0O0 == null) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(iOooO0O0, "Trying to recycle shape with unrecognized shape type: ").toString());
        }
        OooO00o<InProgressShapeT> oooO00o = oooO00oOooO0O0;
        inProgressShape.OooO0oO();
        ArrayList arrayList = oooO00o.f82460OooO00o;
        arrayList.add(inProgressShape);
        int i = oooO00o.f82461OooO0O0 - 1;
        oooO00o.f82461OooO0O0 = i;
        if (i == 0) {
            int i2 = oooO00o.f82464OooO0o0;
            int i3 = oooO00o.f82462OooO0OO;
            int[] iArr = oooO00o.f82463OooO0Oo;
            iArr[i2] = i3;
            oooO00o.f82462OooO0OO = 0;
            int i4 = 1;
            int i5 = i2 + 1;
            oooO00o.f82464OooO0o0 = i5;
            if (i5 >= iArr.length) {
                oooO00o.f82464OooO0o0 = 0;
            }
            if (iArr.length == 0) {
                throw new NoSuchElementException();
            }
            int i6 = iArr[0];
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i7 = iArr[i4];
                    if (i6 < i7) {
                        i6 = i7;
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (arrayList.size() <= i6) {
                return;
            }
            arrayList.subList(i6, arrayList.size()).clear();
            if (arrayList.size() != i6) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override // o000O0oo.InterfaceC24435OooOoO0
    public final o000O0oO.OooO0O0 OooO0O0(o000OO00.OooO0O0 oooO0O0) {
        InterfaceC24414OooOO0o<ShapeSpecT, InProgressShapeT, ?> interfaceC24414OooOO0o = this.f82457OooO00o;
        interfaceC24414OooOO0o.OooO0O0(oooO0O0);
        C20481OooOOoo<OooO00o<InProgressShapeT>> c20481OooOOoo = this.f82458OooO0O0;
        OooO00o<InProgressShapeT> oooO00oOooO0O0 = c20481OooOOoo.OooO0O0(91411);
        if (oooO00oOooO0O0 == null) {
            oooO00oOooO0O0 = new OooO00o<>();
            c20481OooOOoo.OooO0oO(91411, oooO00oOooO0O0);
        }
        OooO00o<InProgressShapeT> oooO00o = oooO00oOooO0O0;
        ArrayList arrayList = oooO00o.f82460OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(arrayList, "<this>");
        Object objRemove = arrayList.isEmpty() ? null : arrayList.remove(0);
        if (objRemove == null) {
            objRemove = interfaceC24414OooOO0o.OooO0Oo();
        }
        oooO00o.f82461OooO0O0++;
        oooO00o.f82462OooO0OO++;
        o000O0oO.OooO0O0 oooO0O02 = (o000O0oO.OooO0O0) objRemove;
        C20483OooOo0O<InProgressShapeT> c20483OooOo0O = this.f82459OooO0OO;
        int iOooO0Oo = c20483OooOo0O.OooO0Oo((InProgressShapeT) oooO0O02);
        if (iOooO0Oo < 0) {
            iOooO0Oo = ~iOooO0Oo;
        }
        c20483OooOo0O.f58521OooO0O0[iOooO0Oo] = oooO0O02;
        c20483OooOo0O.f58522OooO0OO[iOooO0Oo] = 91411;
        return oooO0O02;
    }
}
