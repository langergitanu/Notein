package o0OOOOO0;

import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.orion.notein.data.service.dto.CreatorDto;
import com.orion.notein.data.service.dto.DownloadPermissionDto;
import com.orion.notein.data.service.dto.MaterialDto;
import com.orion.notein.data.service.dto.MaterialListResponse;
import com.orion.notein.data.service.dto.MaterialPurchaseRequest;
import com.orion.notein.data.service.dto.MaterialPurchaseResponse;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34401OooOOoo;
import oOO00oOo.OooOOOO;
import oOO00oOo.OooOo00;

/* JADX INFO: renamed from: o0OOOOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJF\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0007J:\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0015\u0010\u000eJ0\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\t2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010 \u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\b\u0001\u0010 \u001a\u00020\u0002H§@¢\u0006\u0004\b$\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, m80612d2 = {"Lo0OOOOO0/OooO0o0;", "", "", "id", IDToken.LOCALE, "Lcom/orion/notein/data/service/dto/MaterialDto;", "OooO0O0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C18437z2.f56754h, "", "page", "size", "Lcom/orion/notein/data/service/dto/MaterialListResponse;", "OooO0o", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keyword", "types", "OooO0OO", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orion/notein/data/service/dto/CreatorDto;", "OooO0Oo", "OooO0oo", "OooO", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orion/notein/data/service/dto/DownloadPermissionDto;", "OooO00o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orion/notein/data/service/dto/MaterialPurchaseRequest;", "request", "Lcom/orion/notein/data/service/dto/MaterialPurchaseResponse;", "OooOO0", "(Lcom/orion/notein/data/service/dto/MaterialPurchaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderNo", "Lcom/orion/notein/data/service/dto/MaterialPurchaseStatusResponse;", "OooO0oO", "LoO00ooO/OooOooO;", "OooO0o0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface InterfaceC27151OooO0o0 {
    @InterfaceC34391OooO0o("materials/{id}/recommendations")
    Object OooO(@InterfaceC34401OooOOoo("id") String str, @OooOo00("size") int i, @OooOo00(IDToken.LOCALE) String str2, Continuation<? super MaterialListResponse> continuation);

    @OooOOOO("materials/{id}/download")
    Object OooO00o(@InterfaceC34401OooOOoo("id") String str, Continuation<? super DownloadPermissionDto> continuation);

    @InterfaceC34391OooO0o("materials/{id}")
    Object OooO0O0(@InterfaceC34401OooOOoo("id") String str, @OooOo00(IDToken.LOCALE) String str2, Continuation<? super MaterialDto> continuation);

    @InterfaceC34391OooO0o("materials/search")
    Object OooO0OO(@OooOo00("keyword") String str, @OooOo00("types") String str2, @OooOo00("page") int i, @OooOo00("size") int i2, @OooOo00(IDToken.LOCALE) String str3, Continuation<? super MaterialListResponse> continuation);

    @InterfaceC34391OooO0o("creators/{id}")
    Object OooO0Oo(@InterfaceC34401OooOOoo("id") String str, @OooOo00(IDToken.LOCALE) String str2, Continuation<? super CreatorDto> continuation);

    @InterfaceC34391OooO0o("materials")
    Object OooO0o(@OooOo00("types") String str, @OooOo00("page") int i, @OooOo00("size") int i2, @OooOo00(IDToken.LOCALE) String str2, Continuation<? super MaterialListResponse> continuation);

    @OooOOOO("purchases/{orderNo}/cancel")
    Object OooO0o0(@InterfaceC34401OooOOoo("orderNo") String str, Continuation<? super C32460OooOooO> continuation);

    @InterfaceC34391OooO0o("purchases/{orderNo}/status")
    Object OooO0oO(@InterfaceC34401OooOOoo("orderNo") String str, Continuation<? super MaterialPurchaseStatusResponse> continuation);

    @InterfaceC34391OooO0o("creators/{id}/materials")
    Object OooO0oo(@InterfaceC34401OooOOoo("id") String str, @OooOo00("page") int i, @OooOo00("size") int i2, @OooOo00(IDToken.LOCALE) String str2, Continuation<? super MaterialListResponse> continuation);

    @OooOOOO("purchases")
    Object OooOO0(@InterfaceC34387OooO00o MaterialPurchaseRequest materialPurchaseRequest, Continuation<? super MaterialPurchaseResponse> continuation);
}
