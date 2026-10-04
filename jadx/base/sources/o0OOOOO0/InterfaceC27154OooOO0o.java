package o0OOOOO0;

import com.orion.notein.data.service.dto.UserApiResultDto;
import com.orion.notein.domain.models.login.LoginInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0OOOOoo.C27169OooO00o;
import o0OOOOoo.C27170OooO0O0;
import o0OOOOoo.C27171OooO0OO;
import o0OOOo0.C27174OooO0O0;
import o0OOOo00.C27176OooO0O0;
import o0OOOo00.C27177OooO0OO;
import o0OOOo00.C27179OooO0o;
import oOO00oOo.InterfaceC34387OooO00o;
import oOO00oOo.InterfaceC34388OooO0O0;
import oOO00oOo.InterfaceC34391OooO0o;
import oOO00oOo.InterfaceC34397OooOO0o;
import oOO00oOo.InterfaceC34398OooOOOo;
import oOO00oOo.InterfaceC34400OooOOo0;
import oOO00oOo.OooOOOO;
import oOO00oOo.OooOo00;
import okhttp3.MultipartBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOOOO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\bH§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\bH§@¢\u0006\u0004\b\u001a\u0010\u0019J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u001b\u0010\fJ&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u00042\b\b\u0001\u0010\u0011\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00042\b\b\u0001\u0010\u0011\u001a\u00020!H§@¢\u0006\u0004\b%\u0010$J&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001d0\u00042\b\b\u0001\u0010\u0011\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(J \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b+\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, m80612d2 = {"Lo0OOOOO0/OooOO0o;", "", "Lo0OOOOoo/OooO00o;", "loginDto", "LooooOOo0/OooOoO;", "Lcom/orion/notein/data/service/dto/UserApiResultDto;", "OooOO0", "(Lo0OOOOoo/OooO00o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "region", "phone", "OooOO0o", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "version", "OooO", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OOOOoo/OooO0O0;", "body", "OooO0o", "(Lo0OOOOoo/OooO0O0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OOOOoo/OooO0OO;", "OooO0o0", "(Lo0OOOOoo/OooO0OO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "OooOOO0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OooO0oo", "OooO0oO", "Lo0OOOo00/OooO0O0;", "Lo0OOOo0/OooO0O0;", "Lcom/orion/notein/domain/models/login/LoginInfo;", "OooO0OO", "(Lo0OOOo00/OooO0O0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0OOOo00/OooO0OO;", "", "OooO0O0", "(Lo0OOOo00/OooO0OO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OooO0Oo", "Lo0OOOo00/OooO0o;", "OooO00o", "(Lo0OOOo00/OooO0o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MultipartBody$Part;", "avatar", "OooOO0O", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface InterfaceC27154OooOO0o {
    @InterfaceC34391OooO0o("user")
    Object OooO(@OooOo00("version") String str, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @OooOOOO("/user/mobile/verify")
    Object OooO00o(@InterfaceC34387OooO00o C27179OooO0o c27179OooO0o, Continuation<? super C35238OooOoO<C27174OooO0O0<Boolean>>> continuation);

    @oOO00oOo.OooOOO("/user/login/password")
    Object OooO0O0(@InterfaceC34387OooO00o C27177OooO0OO c27177OooO0OO, Continuation<? super C35238OooOoO<C27174OooO0O0<Boolean>>> continuation);

    @OooOOOO("/user/login/password")
    Object OooO0OO(@InterfaceC34387OooO00o C27176OooO0O0 c27176OooO0O0, Continuation<? super C35238OooOoO<C27174OooO0O0<LoginInfo>>> continuation);

    @oOO00oOo.OooOOO("/user/password")
    Object OooO0Oo(@InterfaceC34387OooO00o C27177OooO0OO c27177OooO0OO, Continuation<? super C35238OooOoO<C27174OooO0O0<LoginInfo>>> continuation);

    @OooOOOO("/user/mobile/verification")
    Object OooO0o(@InterfaceC34387OooO00o C27170OooO0O0 c27170OooO0O0, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @InterfaceC34398OooOOOo("/user")
    Object OooO0o0(@InterfaceC34387OooO00o C27171OooO0OO c27171OooO0OO, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @InterfaceC34391OooO0o("/user/send")
    Object OooO0oO(@OooOo00("region") String str, @OooOo00("mobile") String str2, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @InterfaceC34388OooO0O0("/user")
    Object OooO0oo(@OooOo00("region") String str, @OooOo00("mobile") String str2, @OooOo00("code") String str3, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @OooOOOO("user/login")
    Object OooOO0(@InterfaceC34387OooO00o C27169OooO00o c27169OooO00o, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @InterfaceC34397OooOO0o
    @OooOOOO("/user/avatar")
    Object OooOO0O(@InterfaceC34400OooOOo0 MultipartBody.Part part, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @InterfaceC34391OooO0o("/user/mobile/availability")
    Object OooOO0o(@OooOo00("region") String str, @OooOo00("mobile") String str2, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);

    @oOO00oOo.OooOOO("/user/mobile")
    Object OooOOO0(@OooOo00("region") String str, @OooOo00("mobile") String str2, @OooOo00("code") String str3, Continuation<? super C35238OooOoO<UserApiResultDto>> continuation);
}
