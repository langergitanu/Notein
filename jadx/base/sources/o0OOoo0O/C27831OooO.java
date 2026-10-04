package o0OOoo0O;

import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialOperationContext;
import o0OOo0Oo.InterfaceC27304OooOo;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoo0O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27831OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27304OooOo f98323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27851OooOo0 f98324OooO0O0;

    /* JADX INFO: renamed from: o0OOoo0O.OooO$OooO00o */
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: o0OOoo0O.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19873OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98325OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final Exception f98326OooO0O0;

            public C19873OooO00o(String materialId, Exception exc) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                this.f98325OooO00o = materialId;
                this.f98326OooO0O0 = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19873OooO00o)) {
                    return false;
                }
                C19873OooO00o c19873OooO00o = (C19873OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98325OooO00o, c19873OooO00o.f98325OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98326OooO0O0, c19873OooO00o.f98326OooO0O0);
            }

            public final int hashCode() {
                return this.f98326OooO0O0.hashCode() + (this.f98325OooO00o.hashCode() * 31);
            }

            public final String toString() {
                return "Error(materialId=" + this.f98325OooO00o + ", exception=" + this.f98326OooO0O0 + ")";
            }
        }

        /* JADX INFO: renamed from: o0OOoo0O.OooO$OooO00o$OooO0O0 */
        public static final class OooO0O0 extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98327OooO00o;

            public OooO0O0(String materialId) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                this.f98327OooO00o = materialId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98327OooO00o, ((OooO0O0) obj).f98327OooO00o);
            }

            public final int hashCode() {
                return this.f98327OooO00o.hashCode();
            }

            public final String toString() {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Success(materialId="), this.f98327OooO00o, ")");
            }
        }
    }

    public C27831OooO(InterfaceC27304OooOo downloadRepository, C27851OooOo0 c27851OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(downloadRepository, "downloadRepository");
        this.f98323OooO00o = downloadRepository;
        this.f98324OooO0O0 = c27851OooOo0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        if (r4.apply(r0, r13, r5) == r6) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: Exception -> 0x0072, TryCatch #2 {Exception -> 0x0072, blocks: (B:51:0x00df, B:43:0x00c3, B:45:0x00c7, B:48:0x00d0, B:26:0x006e, B:35:0x0088, B:37:0x008c, B:39:0x00ad, B:53:0x00fd, B:54:0x010e, B:31:0x0078), top: B:61:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc A[PHI: r2 r4 r13
      0x00cc: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:47:0x00ce, B:44:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r4v10 com.orion.notein.domain.models.material.Material) = (r4v6 com.orion.notein.domain.models.material.Material), (r4v12 com.orion.notein.domain.models.material.Material) binds: [B:47:0x00ce, B:44:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r13v1 com.orion.notein.domain.models.material.MaterialOperationContext) = 
      (r13v0 com.orion.notein.domain.models.material.MaterialOperationContext)
      (r13v3 com.orion.notein.domain.models.material.MaterialOperationContext)
     binds: [B:47:0x00ce, B:44:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27840OooOO0 c27840OooOO0;
        C27831OooO c27831OooO;
        MaterialOperationContext materialOperationContext;
        Material material;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof C27840OooOO0) {
            c27840OooOO0 = (C27840OooOO0) abstractC32479OooO0OO;
            int i = c27840OooOO0.f98360OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27840OooOO0.f98360OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27840OooOO0 = new C27840OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o0 = c27840OooOO0.f98357OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27840OooOO0.f98360OooOoo0;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o0);
            InterfaceC27304OooOo interfaceC27304OooOo = this.f98323OooO00o;
            c27840OooOO0.f98356OooOo0o = this;
            c27840OooOO0.f98355OooOo = str2;
            c27840OooOO0.f98360OooOoo0 = 1;
            objOooO0o0 = interfaceC27304OooOo.OooO0o0(str2, c27840OooOO0);
            if (objOooO0o0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27831OooO = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    MaterialOperationContext materialOperationContext2 = c27840OooOO0.f98358OooOoO0;
                    material = (Material) c27840OooOO0.f98355OooOo;
                    String str3 = (String) c27840OooOO0.f98356OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0o0);
                        materialOperationContext = materialOperationContext2;
                        str2 = str3;
                        MaterialDownloadStateEntity materialDownloadStateEntity = (MaterialDownloadStateEntity) objOooO0o0;
                        String localPath = materialDownloadStateEntity == null ? materialDownloadStateEntity.getLocalPath() : null;
                        c27840OooOO0.f98356OooOo0o = str2;
                        c27840OooOO0.f98355OooOo = material;
                        c27840OooOO0.f98358OooOoO0 = null;
                        c27840OooOO0.f98360OooOoo0 = 3;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str3;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Material material2 = (Material) c27840OooOO0.f98355OooOo;
                    String str4 = (String) c27840OooOO0.f98356OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(objOooO0o0);
                        material = material2;
                        str2 = str4;
                        C34406OooO00o.f123390OooO00o.OooO00o("Material applied successfully: " + material.getTitle(), new Object[0]);
                        return new OooO00o.OooO0O0(str2);
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str4;
                    }
                }
                C34406OooO00o.f123390OooO00o.OooO0Oo(e, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to apply material: ", str2), new Object[0]);
                return new OooO00o.C19873OooO00o(str2, e);
            }
            str2 = (String) c27840OooOO0.f98355OooOo;
            c27831OooO = (C27831OooO) c27840OooOO0.f98356OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o0);
        }
        Material material3 = (Material) objOooO0o0;
        if (material3 == null) {
            throw new IllegalStateException("Material not downloaded: " + str2);
        }
        C27851OooOo0 c27851OooOo0 = c27831OooO.f98324OooO0O0;
        materialOperationContext = new MaterialOperationContext(c27851OooOo0.f98408OooO0O0, c27851OooOo0.f98409OooO0OO, c27851OooOo0.f98410OooO0Oo, c27851OooOo0.f98412OooO0o0, c27851OooOo0.f98411OooO0o, c27851OooOo0.f98413OooO0oO);
        if (material3.needsFileDownload()) {
            InterfaceC27304OooOo interfaceC27304OooOo2 = c27831OooO.f98323OooO00o;
            c27840OooOO0.f98356OooOo0o = str2;
            c27840OooOO0.f98355OooOo = material3;
            c27840OooOO0.f98358OooOoO0 = materialOperationContext;
            c27840OooOO0.f98360OooOoo0 = 2;
            Object objOooO = interfaceC27304OooOo2.OooO(str2, c27840OooOO0);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            material = material3;
            objOooO0o0 = objOooO;
            MaterialDownloadStateEntity materialDownloadStateEntity2 = (MaterialDownloadStateEntity) objOooO0o0;
            if (materialDownloadStateEntity2 == null) {
            }
            c27840OooOO0.f98356OooOo0o = str2;
            c27840OooOO0.f98355OooOo = material;
            c27840OooOO0.f98358OooOoO0 = null;
            c27840OooOO0.f98360OooOoo0 = 3;
        } else {
            material = material3;
            c27840OooOO0.f98356OooOo0o = str2;
            c27840OooOO0.f98355OooOo = material;
            c27840OooOO0.f98358OooOoO0 = null;
            c27840OooOO0.f98360OooOoo0 = 3;
        }
    }
}
