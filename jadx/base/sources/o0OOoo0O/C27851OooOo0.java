package o0OOoo0O;

import OooOoo0.o00000;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.domain.models.material.MaterialOperationContext;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOo0o.C27570o00oOoo0;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27851OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27304OooOo f98407OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27837OooO0o0 f98408OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27834OooO0OO f98409OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27836OooO0o f98410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27570o00oOoo0 f98411OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27848OooOOo0 f98412OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27844OooOOO0 f98413OooO0oO;

    /* JADX INFO: renamed from: o0OOoo0O.OooOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DownloadState f98414OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f98415OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final MaterialActionType f98416OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f98417OooO0Oo;

        public OooO00o(DownloadState downloadState, boolean z, MaterialActionType actionType, String actionLabel) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(downloadState, "downloadState");
            kotlin.jvm.internal.OooOOO0.OooO0oO(actionType, "actionType");
            kotlin.jvm.internal.OooOOO0.OooO0oO(actionLabel, "actionLabel");
            this.f98414OooO00o = downloadState;
            this.f98415OooO0O0 = z;
            this.f98416OooO0OO = actionType;
            this.f98417OooO0Oo = actionLabel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f98414OooO00o == oooO00o.f98414OooO00o && this.f98415OooO0O0 == oooO00o.f98415OooO0O0 && this.f98416OooO0OO == oooO00o.f98416OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98417OooO0Oo, oooO00o.f98417OooO0Oo);
        }

        public final int hashCode() {
            return this.f98417OooO0Oo.hashCode() + ((this.f98416OooO0OO.hashCode() + o00000.OooO0O0(this.f98414OooO00o.hashCode() * 31, 31, this.f98415OooO0O0)) * 31);
        }

        public final String toString() {
            return "MaterialState(downloadState=" + this.f98414OooO00o + ", isApplied=" + this.f98415OooO0O0 + ", actionType=" + this.f98416OooO0OO + ", actionLabel=" + this.f98417OooO0Oo + ")";
        }
    }

    public C27851OooOo0(InterfaceC27304OooOo downloadRepository, C27837OooO0o0 c27837OooO0o0, C27834OooO0OO c27834OooO0OO, C27836OooO0o c27836OooO0o, C27848OooOOo0 c27848OooOOo0, C27570o00oOoo0 c27570o00oOoo0, C27844OooOOO0 c27844OooOOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(downloadRepository, "downloadRepository");
        this.f98407OooO00o = downloadRepository;
        this.f98408OooO0O0 = c27837OooO0o0;
        this.f98409OooO0OO = c27834OooO0OO;
        this.f98410OooO0Oo = c27836OooO0o;
        this.f98412OooO0o0 = c27848OooOOo0;
        this.f98411OooO0o = c27570o00oOoo0;
        this.f98413OooO0oO = c27844OooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Material material, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27853OooOo0O c27853OooOo0O;
        C27851OooOo0 c27851OooOo0;
        Material material2;
        ?? BooleanValue;
        Material material3;
        ?? r2;
        Material material4 = material;
        if (abstractC32479OooO0OO instanceof C27853OooOo0O) {
            c27853OooOo0O = (C27853OooOo0O) abstractC32479OooO0OO;
            int i = c27853OooOo0O.f98427OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27853OooOo0O.f98427OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27853OooOo0O = new C27853OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objIsApplied = c27853OooOo0O.f98424OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27853OooOo0O.f98427OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objIsApplied);
            MaterialOperationContext materialOperationContext = new MaterialOperationContext(this.f98408OooO0O0, this.f98409OooO0OO, this.f98410OooO0Oo, this.f98412OooO0o0, this.f98411OooO0o, this.f98413OooO0oO);
            try {
                c27853OooOo0O.f98423OooOo0o = this;
                c27853OooOo0O.f98422OooOo = material4;
                c27853OooOo0O.f98427OooOoo0 = 1;
                objIsApplied = material4.isApplied(materialOperationContext, c27853OooOo0O);
                if (objIsApplied != enumC32485OooO00o) {
                    c27851OooOo0 = this;
                }
            } catch (Exception e) {
                e = e;
                c27851OooOo0 = this;
                C34406OooO00o.f123390OooO00o.OooOO0o(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to check isApplied for material: ", material4.getId()), new Object[0]);
                material2 = material4;
                BooleanValue = 0;
            } catch (C32444OooOOO0 unused) {
                c27851OooOo0 = this;
                material2 = material4;
                BooleanValue = 0;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = c27853OooOo0O.f98425OooOoO0;
            material3 = (Material) c27853OooOo0O.f98423OooOo0o;
            C32446OooOOOo.OooO0O0(objIsApplied);
            r2 = i3;
            DownloadState downloadState = !((Boolean) objIsApplied).booleanValue() ? DownloadState.DOWNLOADED : DownloadState.NOT_DOWNLOADED;
            MaterialActionType actionType = material3.getActionType(downloadState, r2 == 0);
            String actionLabel = material3.getActionLabel(downloadState, r2 == 0);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GetMaterialStateUseCase");
            String id = material3.getId();
            String simpleName = material3.getClass().getSimpleName();
            boolean z = r2 == 0;
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("execute: id=", id, ", type=", simpleName, ", isApplied=");
            sbOooO0O0.append(z);
            sbOooO0O0.append(", downloadState=");
            sbOooO0O0.append(downloadState);
            sbOooO0O0.append(", actionType=");
            sbOooO0O0.append(actionType);
            c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
            return new OooO00o(downloadState, r2 != 0, actionType, actionLabel);
        }
        material4 = c27853OooOo0O.f98422OooOo;
        c27851OooOo0 = (C27851OooOo0) c27853OooOo0O.f98423OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(objIsApplied);
        } catch (Exception e2) {
            e = e2;
            C34406OooO00o.f123390OooO00o.OooOO0o(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to check isApplied for material: ", material4.getId()), new Object[0]);
            material2 = material4;
            BooleanValue = 0;
        } catch (C32444OooOOO0 unused2) {
            material2 = material4;
            BooleanValue = 0;
        }
        Material material5 = material4;
        BooleanValue = ((Boolean) objIsApplied).booleanValue();
        material2 = material5;
        InterfaceC27304OooOo interfaceC27304OooOo = c27851OooOo0.f98407OooO00o;
        String id2 = material2.getId();
        c27853OooOo0O.f98423OooOo0o = material2;
        c27853OooOo0O.f98422OooOo = null;
        c27853OooOo0O.f98425OooOoO0 = BooleanValue;
        c27853OooOo0O.f98427OooOoo0 = 2;
        Object objOooO00o = interfaceC27304OooOo.OooO00o(id2, c27853OooOo0O);
        if (objOooO00o != enumC32485OooO00o) {
            material3 = material2;
            objIsApplied = objOooO00o;
            r2 = BooleanValue;
            if (!((Boolean) objIsApplied).booleanValue()) {
            }
            MaterialActionType actionType2 = material3.getActionType(downloadState, r2 == 0);
            String actionLabel2 = material3.getActionLabel(downloadState, r2 == 0);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GetMaterialStateUseCase");
            String id3 = material3.getId();
            String simpleName2 = material3.getClass().getSimpleName();
            if (r2 == 0) {
            }
            StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("execute: id=", id3, ", type=", simpleName2, ", isApplied=");
            sbOooO0O02.append(z);
            sbOooO0O02.append(", downloadState=");
            sbOooO0O02.append(downloadState);
            sbOooO0O02.append(", actionType=");
            sbOooO0O02.append(actionType2);
            c20358OooO00o2.OooO00o(sbOooO0O02.toString(), new Object[0]);
            return new OooO00o(downloadState, r2 != 0, actionType2, actionLabel2);
        }
        return enumC32485OooO00o;
    }
}
