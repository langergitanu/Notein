package com.orion.notein.p607ui.creative_library;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.material.DownloadResult;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.o000Oo0;
import o0OOo0Oo.InterfaceC27304OooOo;
import o0OOo0Oo.InterfaceC27310OooOoO0;
import o0OOoo0O.C27831OooO;
import o0OOoo0O.C27849OooOOoo;
import o0OOoo0O.C27852OooOo00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$onRecommendationActionClicked$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {385, 389, 390, 394}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70975OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Material f70976OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70977OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23028OooO0Oo f70978OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.CreativeLibraryDetailViewModel$onRecommendationActionClicked$1$1", m80623f = "CreativeLibraryDetailViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<DownloadResult, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Material f70979OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f70980OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C23028OooO0Oo f70981OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Material material, C23028OooO0Oo c23028OooO0Oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f70979OooOo = material;
            this.f70981OooOoO0 = c23028OooO0Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f70979OooOo, this.f70981OooOoO0, continuation);
            oooO00o.f70980OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(DownloadResult downloadResult, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(downloadResult, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            DownloadResult downloadResult = (DownloadResult) this.f70980OooOo0o;
            boolean z = downloadResult instanceof DownloadResult.Success;
            C23028OooO0Oo c23028OooO0Oo = this.f70981OooOoO0;
            Material material = this.f70979OooOo;
            if (z || (downloadResult instanceof DownloadResult.NoFileNeeded)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
                c20358OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Recommendation downloaded: ", material.getTitle()), new Object[0]);
                String str = c23028OooO0Oo.f71015OooOOOO;
                if (str != null) {
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23028OooO0Oo), null, null, new C23031OooO0oO(c23028OooO0Oo, str, null), 3);
                }
            } else if (downloadResult instanceof DownloadResult.Failed) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CreativeLibraryDetailVM");
                c20358OooO00o2.OooO0Oo(((DownloadResult.Failed) downloadResult).getError(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to download recommendation: ", material.getTitle()), new Object[0]);
            } else if (!(downloadResult instanceof DownloadResult.InProgress)) {
                if (!(downloadResult instanceof DownloadResult.AuthRequired)) {
                    throw new C32442OooOO0o();
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("CreativeLibraryDetailVM");
                c20358OooO00o3.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Recommendation auth required: ", C24035Oooo00o.f80943OooO00o.OooO0O0(downloadResult.getClass()).OooOO0()), new Object[0]);
                List<C23028OooO0Oo.OooO0O0> list = C23028OooO0Oo.f71003OooOOOo;
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23028OooO0Oo), null, null, new OooO0o((DownloadResult.AuthRequired) downloadResult, c23028OooO0Oo, null), 3);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(C23028OooO0Oo c23028OooO0Oo, String str, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f70978OooOoO0 = c23028OooO0Oo;
        this.f70977OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO(this.f70978OooOoO0, this.f70977OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:9:0x001c, B:52:0x00d3, B:54:0x00d9, B:56:0x00fc, B:57:0x0109, B:59:0x010d, B:60:0x012d, B:61:0x0132, B:16:0x002e, B:46:0x00bd, B:48:0x00c5, B:62:0x0133, B:17:0x0033, B:42:0x00ab, B:18:0x0038, B:37:0x009d, B:21:0x003f, B:22:0x004f, B:24:0x0055, B:28:0x0066, B:30:0x006a, B:32:0x006e, B:34:0x0072, B:39:0x00a0), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:9:0x001c, B:52:0x00d3, B:54:0x00d9, B:56:0x00fc, B:57:0x0109, B:59:0x010d, B:60:0x012d, B:61:0x0132, B:16:0x002e, B:46:0x00bd, B:48:0x00c5, B:62:0x0133, B:17:0x0033, B:42:0x00ab, B:18:0x0038, B:37:0x009d, B:21:0x003f, B:22:0x004f, B:24:0x0055, B:28:0x0066, B:30:0x006a, B:32:0x006e, B:34:0x0072, B:39:0x00a0), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109 A[Catch: Exception -> 0x0021, TryCatch #0 {Exception -> 0x0021, blocks: (B:9:0x001c, B:52:0x00d3, B:54:0x00d9, B:56:0x00fc, B:57:0x0109, B:59:0x010d, B:60:0x012d, B:61:0x0132, B:16:0x002e, B:46:0x00bd, B:48:0x00c5, B:62:0x0133, B:17:0x0033, B:42:0x00ab, B:18:0x0038, B:37:0x009d, B:21:0x003f, B:22:0x004f, B:24:0x0055, B:28:0x0066, B:30:0x006a, B:32:0x006e, B:34:0x0072, B:39:0x00a0), top: B:67:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133 A[Catch: Exception -> 0x0021, TRY_LEAVE, TryCatch #0 {Exception -> 0x0021, blocks: (B:9:0x001c, B:52:0x00d3, B:54:0x00d9, B:56:0x00fc, B:57:0x0109, B:59:0x010d, B:60:0x012d, B:61:0x0132, B:16:0x002e, B:46:0x00bd, B:48:0x00c5, B:62:0x0133, B:17:0x0033, B:42:0x00ab, B:18:0x0038, B:37:0x009d, B:21:0x003f, B:22:0x004f, B:24:0x0055, B:28:0x0066, B:30:0x006a, B:32:0x006e, B:34:0x0072, B:39:0x00a0), top: B:67:0x0010 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object objOooO00o;
        Material material;
        Material material2;
        C27831OooO.OooO00o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70975OooOo;
        C23028OooO0Oo c23028OooO0Oo = this.f70978OooOoO0;
        String str = this.f70977OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Iterator<T> it = ((C23028OooO0Oo.C19176OooO0Oo) c23028OooO0Oo.f71010OooOO0.getValue()).f71042OooOOo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (OooOOO0.OooO0O0(((C23033OooOO0o.OooO00o) next).f71088OooO00o, str)) {
                        break;
                    }
                }
                C23033OooOO0o.OooO00o oooO00o2 = (C23033OooOO0o.OooO00o) next;
                if ((oooO00o2 != null ? oooO00o2.f71094OooO0oO : null) == MaterialActionType.GO_TO_CREATE) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("CreativeLibraryDetailVM");
                    c20358OooO00o.OooO00o("Recommendation GO_TO_CREATE clicked: " + str, new Object[0]);
                    C33772OooooOo c33772OooooOo = c23028OooO0Oo.f71012OooOO0o;
                    C23028OooO0Oo.OooO0OO.OooO0O0 oooO0O0 = new C23028OooO0Oo.OooO0OO.OooO0O0(str);
                    this.f70975OooOo = 1;
                    if (c33772OooooOo.emit(oooO0O0, this) == enumC32485OooO00o) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                InterfaceC27310OooOoO0 interfaceC27310OooOoO0 = c23028OooO0Oo.f71007OooO0o0;
                this.f70975OooOo = 2;
                obj = interfaceC27310OooOoO0.OooO0o(str, this);
                if (obj != enumC32485OooO00o) {
                    Material material3 = (Material) obj;
                    InterfaceC27304OooOo interfaceC27304OooOo = c23028OooO0Oo.f71006OooO0o;
                    this.f70976OooOo0o = material3;
                    this.f70975OooOo = 3;
                    objOooO00o = interfaceC27304OooOo.OooO00o(str, this);
                    if (objOooO00o != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                Material material32 = (Material) obj;
                InterfaceC27304OooOo interfaceC27304OooOo2 = c23028OooO0Oo.f71006OooO0o;
                this.f70976OooOo0o = material32;
                this.f70975OooOo = 3;
                objOooO00o = interfaceC27304OooOo2.OooO00o(str, this);
                if (objOooO00o != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                material = material32;
                obj = objOooO00o;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i == 3) {
                material = this.f70976OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    C27831OooO c27831OooO = c23028OooO0Oo.f71004OooO;
                    this.f70976OooOo0o = material;
                    this.f70975OooOo = 4;
                    obj = c27831OooO.OooO00o(str, this);
                    if (obj != enumC32485OooO00o) {
                        material2 = material;
                        oooO00o = (C27831OooO.OooO00o) obj;
                        if (!(oooO00o instanceof C27831OooO.OooO00o.OooO0O0)) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                C27852OooOo00 c27852OooOo00 = c23028OooO0Oo.f71009OooO0oo;
                c27852OooOo00.getClass();
                OooOOO0.OooO0oO(material, "material");
                C25252OooO0Oo.OooOo0o(new o000Oo0(new C33770OooooO0(new C27849OooOOoo(c27852OooOo00, material, null)), new OooO00o(material, c23028OooO0Oo, null), 1), o0OoOo0.OooO00o(c23028OooO0Oo));
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                material2 = this.f70976OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                oooO00o = (C27831OooO.OooO00o) obj;
                if (!(oooO00o instanceof C27831OooO.OooO00o.OooO0O0)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("CreativeLibraryDetailVM");
                    c20358OooO00o2.OooO00o("Recommendation applied: " + material2.getTitle(), new Object[0]);
                    String str2 = c23028OooO0Oo.f71015OooOOOO;
                    if (str2 != null) {
                        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c23028OooO0Oo), null, null, new C23031OooO0oO(c23028OooO0Oo, str2, null), 3);
                    }
                } else {
                    if (!(oooO00o instanceof C27831OooO.OooO00o.C19873OooO00o)) {
                        throw new C32442OooOO0o();
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("CreativeLibraryDetailVM");
                    c20358OooO00o3.OooO0OO("Failed to apply recommendation: " + material2.getTitle(), new Object[0]);
                }
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooO0Oo(e, androidx.core.app.OooO.OooO0O0(c20358OooO00o4, "CreativeLibraryDetailVM", "Failed to handle recommendation action: ", str), new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
