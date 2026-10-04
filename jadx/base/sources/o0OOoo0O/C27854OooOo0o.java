package o0OOoo0O;

import Oooo0oO.C21023OooO0Oo;
import com.orion.notein.data.service.dto.DownloadPermissionDto;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import o0OOOOO0.InterfaceC27151OooO0o0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35219OooOO0O;

/* JADX INFO: renamed from: o0OOoo0O.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27854OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27151OooO0o0 f98428OooO00o;

    /* JADX INFO: renamed from: o0OOoo0O.OooOo0o$OooO00o */
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: o0OOoo0O.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19876OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98429OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final Long f98430OooO0O0;

            public C19876OooO00o(String str, Long l) {
                this.f98429OooO00o = str;
                this.f98430OooO0O0 = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19876OooO00o)) {
                    return false;
                }
                C19876OooO00o c19876OooO00o = (C19876OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98429OooO00o, c19876OooO00o.f98429OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98430OooO0O0, c19876OooO00o.f98430OooO0O0);
            }

            public final int hashCode() {
                int iHashCode = this.f98429OooO00o.hashCode() * 31;
                Long l = this.f98430OooO0O0;
                return iHashCode + (l == null ? 0 : l.hashCode());
            }

            public final String toString() {
                return "Allowed(downloadUrl=" + this.f98429OooO00o + ", fileSizeBytes=" + this.f98430OooO0O0 + ")";
            }
        }

        /* JADX INFO: renamed from: o0OOoo0O.OooOo0o$OooO00o$OooO0O0 */
        public static final class OooO0O0 extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Exception f98431OooO00o;

            public OooO0O0(Exception exc) {
                this.f98431OooO00o = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98431OooO00o, ((OooO0O0) obj).f98431OooO00o);
            }

            public final int hashCode() {
                return this.f98431OooO00o.hashCode();
            }

            public final String toString() {
                return "Error(exception=" + this.f98431OooO00o + ")";
            }
        }

        /* JADX INFO: renamed from: o0OOoo0O.OooOo0o$OooO00o$OooO0OO */
        public static final class OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0OO f98432OooO00o = new OooO0OO();
        }

        /* JADX INFO: renamed from: o0OOoo0O.OooOo0o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        public static final class C27855OooO0Oo extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f98433OooO00o;

            public C27855OooO0Oo(int i) {
                this.f98433OooO00o = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C27855OooO0Oo) && this.f98433OooO00o == ((C27855OooO0Oo) obj).f98433OooO00o;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f98433OooO00o);
            }

            public final String toString() {
                return C21023OooO0Oo.OooO0OO(")", this.f98433OooO00o, new StringBuilder("NeedPurchase(priceCents="));
            }
        }

        /* JADX INFO: renamed from: o0OOoo0O.OooOo0o$OooO00o$OooO0o0, reason: case insensitive filesystem */
        public static final class C27856OooO0o0 extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C27856OooO0o0 f98434OooO00o = new C27856OooO0o0();
        }
    }

    public C27854OooOo0o(InterfaceC27151OooO0o0 api) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(api, "api");
        this.f98428OooO00o = api;
    }

    public static DownloadResult.AuthRequired OooO0O0(OooO00o result, Material material) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        kotlin.jvm.internal.OooOOO0.OooO0oO(material, "material");
        if (result instanceof OooO00o.OooO0OO) {
            return new DownloadResult.AuthRequired.NeedLogin(material);
        }
        if (result instanceof OooO00o.C27856OooO0o0) {
            return new DownloadResult.AuthRequired.NeedVip(material);
        }
        if (result instanceof OooO00o.C27855OooO0Oo) {
            return new DownloadResult.AuthRequired.NeedPurchase(material, ((OooO00o.C27855OooO0Oo) result).f98433OooO00o);
        }
        if ((result instanceof OooO00o.C19876OooO00o) || (result instanceof OooO00o.OooO0O0)) {
            return null;
        }
        throw new C32442OooOO0o();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27850OooOo c27850OooOo;
        if (abstractC32479OooO0OO instanceof C27850OooOo) {
            c27850OooOo = (C27850OooOo) abstractC32479OooO0OO;
            int i = c27850OooOo.f98406OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27850OooOo.f98406OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27850OooOo = new C27850OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27850OooOo.f98405OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27850OooOo.f98406OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                InterfaceC27151OooO0o0 interfaceC27151OooO0o0 = this.f98428OooO00o;
                c27850OooOo.f98406OooOoO0 = 1;
                objOooO00o = interfaceC27151OooO0o0.OooO00o(str, c27850OooOo);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            DownloadPermissionDto downloadPermissionDto = (DownloadPermissionDto) objOooO00o;
            C34406OooO00o.f123390OooO00o.OooO00o("Download auth response: allowed=" + downloadPermissionDto.getAllowed() + ", reason=" + downloadPermissionDto.getReason(), new Object[0]);
            if (downloadPermissionDto.getAllowed()) {
                String downloadUrl = downloadPermissionDto.getDownloadUrl();
                if (downloadUrl == null) {
                    downloadUrl = "";
                }
                return new OooO00o.C19876OooO00o(downloadUrl, downloadPermissionDto.getFileSizeBytes());
            }
            String reason = downloadPermissionDto.getReason();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(reason, DownloadPermissionDto.REASON_VIP_REQUIRED)) {
                return OooO00o.C27856OooO0o0.f98434OooO00o;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(reason, DownloadPermissionDto.REASON_PURCHASE_REQUIRED)) {
                Integer priceCents = downloadPermissionDto.getPriceCents();
                return new OooO00o.C27855OooO0Oo(priceCents != null ? priceCents.intValue() : 0);
            }
            return new OooO00o.OooO0O0(new IllegalStateException("Unknown denial reason: " + downloadPermissionDto.getReason()));
        } catch (C35219OooOO0O e) {
            if (e.f126448OooOo0o == 401) {
                C34406OooO00o.f123390OooO00o.OooO00o("Download auth: need login (401)", new Object[0]);
                return OooO00o.OooO0OO.f98432OooO00o;
            }
            C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Download auth request failed", new Object[0]);
            return new OooO00o.OooO0O0(e);
        } catch (Exception e2) {
            C34406OooO00o.f123390OooO00o.OooO0Oo(e2, "Download auth request failed", new Object[0]);
            return new OooO00o.OooO0O0(e2);
        }
    }
}
