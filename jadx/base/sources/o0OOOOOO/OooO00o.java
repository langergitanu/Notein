package o0OOOOOO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0OOOo0O.C27181OooO00o;
import o0OOOo0O.C27182OooO0O0;
import o0OOOo0O.C27183OooO0OO;
import o0OOOo0O.C27184OooO0Oo;
import o0OOOo0O.C27185OooO0o0;
import oOO00oOo.InterfaceC34389OooO0OO;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34392OooO0o0;
import oOO00oOo.InterfaceC34396OooOO0O;
import oOO00oOo.InterfaceC34397OooOO0o;
import oOO00oOo.InterfaceC34400OooOOo0;
import oOO00oOo.InterfaceC34404OooOo0o;
import oOO00oOo.InterfaceC34405OooOoO0;
import oOO00oOo.OooOOOO;
import oOO00oOo.OooOo00;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;
import ooooOOo0.InterfaceC35211OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jf\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000fJf\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018Jf\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010 JR\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u00062\b\b\u0003\u0010$\u001a\u00020\u0006H§@¢\u0006\u0004\b&\u0010'J>\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u0006H§@¢\u0006\u0004\b+\u0010,J4\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010-\u001a\u00020\u00062\b\b\u0003\u0010.\u001a\u00020\u0006H§@¢\u0006\u0004\b/\u00100J*\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b5\u00106ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00067À\u0006\u0001"}, m80612d2 = {"Lo0OOOOOO/OooO00o;", "", "", "method", CommonConstant.KEY_ACCESS_TOKEN, "path", "", "size", "isDir", "blockList", "autoInit", "rType", "LooooOOo0/OooOoO;", "Lo0OOOo0O/OooO0OO;", "OooO0oo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "baseUrl", C18437z2.f56754h, RequestParameters.UPLOAD_ID, "partSeq", "Lokhttp3/MultipartBody$Part;", "file", "Lo0OOOo0O/OooO0o0;", "OooO0oO", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OOOo0O/OooO00o;", "OooO0o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "opera", "async", "fileList", "OooO00o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "key", "dir", "recursion", "web", "Lo0OOOo0O/OooO0Oo;", "OooO0OO", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fsids", "dLink", "Lo0OOOo0O/OooO0O0;", "OooO", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkFree", "checkExpire", "OooO0Oo", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OooO0o0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LooooOOo0/OooO0O0;", "Lokhttp3/ResponseBody;", "OooO0O0", "(Ljava/lang/String;)LooooOOo0/OooO0O0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface OooO00o {
    @InterfaceC34391OooO0o("/rest/2.0/xpan/multimedia")
    Object OooO(@OooOo00("method") String str, @OooOo00("access_token") String str2, @OooOo00("fsids") String str3, @OooOo00("dlink") int i, Continuation<? super C35238OooOoO<C27182OooO0O0>> continuation);

    @InterfaceC34392OooO0o0
    @InterfaceC34396OooOO0O({"Content-Type:application/x-www-form-urlencoded; charset=utf-8"})
    @OooOOOO("/rest/2.0/xpan/file")
    Object OooO00o(@OooOo00("method") String str, @OooOo00("access_token") String str2, @OooOo00("opera") String str3, @InterfaceC34389OooO0OO("async") int i, @InterfaceC34389OooO0OO("filelist") String str4, Continuation<? super C35238OooOoO<C27185OooO0o0>> continuation);

    @InterfaceC34396OooOO0O({"User-Agent: pan.baidu.com"})
    @InterfaceC34391OooO0o
    @InterfaceC34404OooOo0o
    InterfaceC35211OooO0O0<ResponseBody> OooO0O0(@InterfaceC34405OooOoO0 String baseUrl);

    @InterfaceC34391OooO0o("/rest/2.0/xpan/file")
    Object OooO0OO(@OooOo00("method") String str, @OooOo00("access_token") String str2, @OooOo00("key") String str3, @OooOo00("dir") String str4, @OooOo00("recursion") int i, @OooOo00("web") int i2, Continuation<? super C35238OooOoO<C27184OooO0Oo>> continuation);

    @InterfaceC34391OooO0o("/api/quota")
    Object OooO0Oo(@OooOo00("access_token") String str, @OooOo00("checkfree") int i, @OooOo00("checkexpire") int i2, Continuation<? super C35238OooOoO<Object>> continuation);

    @InterfaceC34392OooO0o0
    @InterfaceC34396OooOO0O({"Content-Type:application/x-www-form-urlencoded; charset=utf-8"})
    @OooOOOO("/rest/2.0/xpan/file")
    Object OooO0o(@OooOo00("method") String str, @OooOo00("access_token") String str2, @InterfaceC34389OooO0OO("path") String str3, @InterfaceC34389OooO0OO("size") int i, @InterfaceC34389OooO0OO("isdir") int i2, @InterfaceC34389OooO0OO(encoded = true, value = "block_list") String str4, @InterfaceC34389OooO0OO("uploadid") String str5, @InterfaceC34389OooO0OO("rtype") int i3, Continuation<? super C35238OooOoO<C27181OooO00o>> continuation);

    @InterfaceC34391OooO0o("/rest/2.0/xpan/nas")
    Object OooO0o0(@OooOo00("method") String str, @OooOo00("access_token") String str2, Continuation<? super C35238OooOoO<Object>> continuation);

    @InterfaceC34397OooOO0o
    @OooOOOO
    Object OooO0oO(@InterfaceC34405OooOoO0 String str, @OooOo00("method") String str2, @OooOo00("access_token") String str3, @OooOo00(C18437z2.f56754h) String str4, @OooOo00("path") String str5, @OooOo00("uploadid") String str6, @OooOo00("partseq") int i, @InterfaceC34400OooOOo0 MultipartBody.Part part, Continuation<? super C35238OooOoO<C27185OooO0o0>> continuation);

    @InterfaceC34392OooO0o0
    @InterfaceC34396OooOO0O({"Content-Type:application/x-www-form-urlencoded; charset=utf-8"})
    @OooOOOO("/rest/2.0/xpan/file")
    Object OooO0oo(@OooOo00("method") String str, @OooOo00("access_token") String str2, @InterfaceC34389OooO0OO("path") String str3, @InterfaceC34389OooO0OO("size") int i, @InterfaceC34389OooO0OO("isdir") int i2, @InterfaceC34389OooO0OO(encoded = true, value = "block_list") String str4, @InterfaceC34389OooO0OO("autoinit") int i3, @InterfaceC34389OooO0OO("rtype") int i4, Continuation<? super C35238OooOoO<C27183OooO0OO>> continuation);
}
