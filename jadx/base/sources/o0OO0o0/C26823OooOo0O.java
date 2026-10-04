package o0OO0o0;

import com.google.gson.Gson;
import com.orion.notein.data.repo.cloudsync.onedrive.OneDriveApiService;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO0o0.C26800OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OO0o0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveCloudService$listChildren$2", m80623f = "OneDriveCloudService.kt", m80624l = {58, 61, 71}, m80625m = "invokeSuspend")
public final class C26823OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<C26804OooO0OO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f92825OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26800OooO.OooO0OO f92826OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26800OooO f92827OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92828OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f92829OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26823OooOo0O(C26800OooO c26800OooO, String str, Continuation<? super C26823OooOo0O> continuation) {
        super(2, continuation);
        this.f92827OooOoO = c26800OooO;
        this.f92829OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26823OooOo0O(this.f92827OooOoO, this.f92829OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<C26804OooO0OO>> continuation) {
        return ((C26823OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r0 == r9) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a4 -> B:30:0x00a7). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0o0;
        List arrayList;
        Object driveItemChildren$default;
        C26800OooO.OooO0OO oooO0OO;
        List<C26804OooO0OO> listOooO0O0;
        String odataNextLink;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92828OooOoO0;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C26800OooO c26800OooO = this.f92827OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92828OooOoO0 = 1;
            Gson gson = C26800OooO.f92718OooO0o0;
            objOooO0o0 = c26800OooO.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = obj;
        } else {
            if (i == 2) {
                List list = this.f92825OooOo;
                oooO0OO = this.f92826OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                arrayList = list;
                driveItemChildren$default = obj;
                C26805OooO0Oo c26805OooO0Oo = (C26805OooO0Oo) driveItemChildren$default;
                List list2 = arrayList;
                listOooO0O0 = c26805OooO0Oo.OooO0O0();
                if (listOooO0O0 == null) {
                    listOooO0O0 = c34434OooOoO;
                }
                C34431OooOo0.OooOo0o(list2, listOooO0O0);
                odataNextLink = c26805OooO0Oo.getOdataNextLink();
                if (odataNextLink != null) {
                }
                return arrayList;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = this.f92825OooOo;
            oooO0OO = this.f92826OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            arrayList = list3;
            Object driveItemChildrenByUrl = obj;
            C26805OooO0Oo c26805OooO0Oo2 = (C26805OooO0Oo) driveItemChildrenByUrl;
            List list4 = arrayList;
            List<C26804OooO0OO> listOooO0O02 = c26805OooO0Oo2.OooO0O0();
            if (listOooO0O02 == null) {
                listOooO0O02 = c34434OooOoO;
            }
            C34431OooOo0.OooOo0o(list4, listOooO0O02);
            odataNextLink = c26805OooO0Oo2.getOdataNextLink();
            if (odataNextLink != null || odataNextLink.length() == 0) {
                return arrayList;
            }
            OneDriveApiService oneDriveApiService = c26800OooO.f92719OooO00o;
            String str = oooO0OO.f92729OooO0OO;
            this.f92826OooOo0o = oooO0OO;
            this.f92825OooOo = arrayList;
            this.f92828OooOoO0 = 3;
            driveItemChildrenByUrl = oneDriveApiService.getDriveItemChildrenByUrl(str, odataNextLink, this);
        }
        C26800OooO.OooO0OO oooO0OO2 = (C26800OooO.OooO0OO) objOooO0o0;
        arrayList = new ArrayList();
        OneDriveApiService oneDriveApiService2 = c26800OooO.f92719OooO00o;
        String str2 = oooO0OO2.f92729OooO0OO;
        Integer num = new Integer(200);
        this.f92826OooOo0o = oooO0OO2;
        this.f92825OooOo = arrayList;
        this.f92828OooOoO0 = 2;
        driveItemChildren$default = OneDriveApiService.getDriveItemChildren$default(oneDriveApiService2, str2, oooO0OO2.f92728OooO0O0, this.f92829OooOoOO, null, num, this, 8, null);
        if (driveItemChildren$default != enumC32485OooO00o) {
            oooO0OO = oooO0OO2;
            C26805OooO0Oo c26805OooO0Oo3 = (C26805OooO0Oo) driveItemChildren$default;
            List list22 = arrayList;
            listOooO0O0 = c26805OooO0Oo3.OooO0O0();
            if (listOooO0O0 == null) {
            }
            C34431OooOo0.OooOo0o(list22, listOooO0O0);
            odataNextLink = c26805OooO0Oo3.getOdataNextLink();
            if (odataNextLink != null) {
            }
            return arrayList;
        }
        return enumC32485OooO00o;
    }
}
