package o0OOOOO0;

import com.orion.notein.data.service.dto.BaiduAuthorizationDto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.OooOo00;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m80612d2 = {"Lo0OOOOO0/OooO0OO;", "", "", "code", "LooooOOo0/OooOoO;", "Lcom/orion/notein/data/service/dto/BaiduAuthorizationDto;", "OooO00o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface OooO0OO {
    @InterfaceC34391OooO0o("/authorization/baidu/access_token")
    Object OooO00o(@OooOo00("code") String str, Continuation<? super C35238OooOoO<BaiduAuthorizationDto>> continuation);

    @InterfaceC34391OooO0o("/authorization/baidu/refresh_token")
    Object OooO0O0(@OooOo00("refresh_token") String str, Continuation<? super C35238OooOoO<BaiduAuthorizationDto>> continuation);
}
