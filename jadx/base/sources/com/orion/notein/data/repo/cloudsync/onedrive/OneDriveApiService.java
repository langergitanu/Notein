package com.orion.notein.data.repo.cloudsync.onedrive;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0OO0o0.C26803OooO0O0;
import o0OO0o0.C26804OooO0OO;
import o0OO0o0.C26805OooO0Oo;
import o0OO0o0.C26806OooO0o;
import o0OO0o0.C26808OooO0oO;
import oO00ooO.C32460OooOooO;
import oOO00oOo.InterfaceC34386OooO;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34388OooO0O0;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34398OooOOOo;
import oOO00oOo.InterfaceC34401OooOOoo;
import oOO00oOo.InterfaceC34404OooOo0o;
import oOO00oOo.InterfaceC34405OooOoO0;
import oOO00oOo.OooOOO;
import oOO00oOo.OooOOOO;
import oOO00oOo.OooOo00;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u000eJ.\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u000eJF\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u00020\u001a2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u000bJ.\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u000eJ8\u0010\"\u001a\u00020\u001f2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010#JD\u0010&\u001a\u00020%2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b&\u0010'J4\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010\u000eJ8\u0010-\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\tH§@¢\u0006\u0004\b-\u0010\u0011J8\u00100\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010/\u001a\u00020.H§@¢\u0006\u0004\b0\u00101J8\u00105\u001a\u0002042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b5\u00106JB\u00108\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010/\u001a\u00020.H§@¢\u0006\u0004\b8\u00109JB\u0010:\u001a\u0002042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b:\u0010;J>\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0(2\b\b\u0001\u0010<\u001a\u00020\u00022\b\b\u0001\u0010=\u001a\u00020\u00022\b\b\u0001\u0010?\u001a\u00020>2\b\b\u0001\u0010/\u001a\u00020.H§@¢\u0006\u0004\b@\u0010Aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006BÀ\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/data/repo/cloudsync/onedrive/OneDriveApiService;", "", "", CommonConstant.KEY_ACCESS_TOKEN, "Lo0OO0o0/OooO0oO;", "getDrive", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authHeader", "driveId", "Lo0OO0o0/OooO0OO;", "getRootDriveItem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemId", "getDriveItemById", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "metadata", "updateDriveItemById", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo0OO0o0/OooO0OO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "getDriveItemByName", "fileId", "Lo0OO0o0/OooO0o;", "getDriveItemVersions", "select", "", "top", "Lo0OO0o0/OooO0Oo;", "getDriveItemChildren", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextLink", "getDriveItemChildrenByUrl", "Lokhttp3/ResponseBody;", "getFileContent", "versionId", "downloadFileVersionContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deltaToken", "Lo0OO0o0/OooO0O0;", "getFileChanges", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LooooOOo0/OooOoO;", "LoO00ooO/OooOooO;", "deleteFile", NoteMeta.PROPERTY_PARENT_ID, "folderItem", "createFolder", "Lokhttp3/RequestBody;", "fileContent", "uploadFileContentById", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/orion/notein/data/repo/cloudsync/onedrive/CreateUploadSessionPostRequestBody;", "requestBody", "Lcom/orion/notein/data/repo/cloudsync/onedrive/UploadSession;", "createUploadSessionById", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/data/repo/cloudsync/onedrive/CreateUploadSessionPostRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parentItemId", "uploadFileContentByName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUploadSessionByName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/data/repo/cloudsync/onedrive/CreateUploadSessionPostRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUrl", "contentRange", "", "contentLength", "uploadFileChunk", "(Ljava/lang/String;Ljava/lang/String;JLokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface OneDriveApiService {
    static /* synthetic */ Object getDriveItemChildren$default(OneDriveApiService oneDriveApiService, String str, String str2, String str3, String str4, Integer num, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDriveItemChildren");
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        return oneDriveApiService.getDriveItemChildren(str, str2, str3, str4, num, continuation);
    }

    static /* synthetic */ Object getFileChanges$default(OneDriveApiService oneDriveApiService, String str, String str2, String str3, String str4, int i, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFileChanges");
        }
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        return oneDriveApiService.getFileChanges(str, str2, str3, str4, i, continuation);
    }

    @OooOOOO("drives/{driveId}/items/{parentId}/children")
    Object createFolder(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo(NoteMeta.PROPERTY_PARENT_ID) String str3, @InterfaceC34387OooO00o C26804OooO0OO c26804OooO0OO, Continuation<? super C26804OooO0OO> continuation);

    @OooOOOO("drives/{driveId}/items/{itemId}/createUploadSession")
    Object createUploadSessionById(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, @InterfaceC34387OooO00o CreateUploadSessionPostRequestBody createUploadSessionPostRequestBody, Continuation<? super UploadSession> continuation);

    @OooOOOO("drives/{driveId}/items/{parentItemId}:/{fileName}:/createUploadSession")
    Object createUploadSessionByName(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("parentItemId") String str3, @InterfaceC34401OooOOoo("fileName") String str4, @InterfaceC34387OooO00o CreateUploadSessionPostRequestBody createUploadSessionPostRequestBody, Continuation<? super UploadSession> continuation);

    @InterfaceC34388OooO0O0("drives/{driveId}/items/{itemId}")
    Object deleteFile(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, Continuation<? super C35238OooOoO<C32460OooOooO>> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/items/{itemId}/versions/{versionId}/content")
    @InterfaceC34404OooOo0o
    Object downloadFileVersionContent(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, @InterfaceC34401OooOOoo("versionId") String str4, Continuation<? super ResponseBody> continuation);

    @InterfaceC34391OooO0o("me/drive")
    Object getDrive(@InterfaceC34386OooO("Authorization") String str, Continuation<? super C26808OooO0oO> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/items/{itemId}")
    Object getDriveItemById(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, Continuation<? super C26804OooO0OO> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/root:/{fileName}")
    Object getDriveItemByName(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("fileName") String str3, Continuation<? super C26804OooO0OO> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/items/{itemId}/children")
    Object getDriveItemChildren(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, @OooOo00("$select") String str4, @OooOo00("$top") Integer num, Continuation<? super C26805OooO0Oo> continuation);

    @InterfaceC34391OooO0o
    Object getDriveItemChildrenByUrl(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34405OooOoO0 String str2, Continuation<? super C26805OooO0Oo> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/items/{fileId}/versions")
    Object getDriveItemVersions(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("fileId") String str3, Continuation<? super C26806OooO0o> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/items/{itemId}/delta")
    Object getFileChanges(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, @OooOo00(ResponseType.TOKEN) String str4, @OooOo00("$top") int i, Continuation<? super C26803OooO0O0> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/items/{itemId}/content")
    @InterfaceC34404OooOo0o
    Object getFileContent(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, Continuation<? super ResponseBody> continuation);

    @InterfaceC34391OooO0o("drives/{driveId}/root")
    Object getRootDriveItem(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, Continuation<? super C26804OooO0OO> continuation);

    @OooOOO("drives/{driveId}/items/{itemId}")
    Object updateDriveItemById(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, @InterfaceC34387OooO00o C26804OooO0OO c26804OooO0OO, Continuation<? super C26804OooO0OO> continuation);

    @InterfaceC34398OooOOOo
    Object uploadFileChunk(@InterfaceC34405OooOoO0 String str, @InterfaceC34386OooO(HttpHeaders.CONTENT_RANGE) String str2, @InterfaceC34386OooO("Content-Length") long j, @InterfaceC34387OooO00o RequestBody requestBody, Continuation<? super C35238OooOoO<ResponseBody>> continuation);

    @InterfaceC34398OooOOOo("drives/{driveId}/items/{itemId}/content")
    Object uploadFileContentById(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("itemId") String str3, @InterfaceC34387OooO00o RequestBody requestBody, Continuation<? super C26804OooO0OO> continuation);

    @InterfaceC34398OooOOOo("drives/{driveId}/items/{parentItemId}:/{fileName}:/content")
    Object uploadFileContentByName(@InterfaceC34386OooO("Authorization") String str, @InterfaceC34401OooOOoo("driveId") String str2, @InterfaceC34401OooOOoo("parentItemId") String str3, @InterfaceC34401OooOOoo("fileName") String str4, @InterfaceC34387OooO00o RequestBody requestBody, Continuation<? super C26804OooO0OO> continuation);
}
