package o0oOoOoO;

import android.content.Context;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import o0OOOoo.C27205OooO0OO;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.web.WebHelper$getUrl$2", m80623f = "WebHelper.kt", m80624l = {69}, m80625m = "invokeSuspend")
public final class C31094OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Context f110981OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110982OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f110983OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31094OooO00o(Context context, String str, Continuation<? super C31094OooO00o> continuation) {
        super(2, continuation);
        this.f110981OooOo = context;
        this.f110983OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31094OooO00o(this.f110981OooOo, this.f110983OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C31094OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4 A[RETURN, SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110982OooOo0o;
        String str = this.f110983OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = C28051OooO00o.OooO0O0(this.f110981OooOo).getData();
                this.f110982OooOo0o = 1;
                obj = C25252OooO0Oo.OooOOo(data, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            JsonObject jsonObject = (JsonObject) new Gson().fromJson((String) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95016OooOOOo), JsonObject.class);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("WebHelper");
            c20358OooO00o.OooO00o("getUrlFromRemote(" + str + ") remoteUrls: " + jsonObject, new Object[0]);
            if (jsonObject.has(str)) {
                return jsonObject.get(str).getAsString();
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("WebHelper");
            c20358OooO00o2.OooO0OO(C22237OooO0o0.OooO00o("getUrlFromRemote(", str, ") failed. ", C32435OooO0Oo.OooO0O0(e)), new Object[0]);
        }
        switch (str.hashCode()) {
            case -991745245:
                if (str.equals("youtube")) {
                    return "https://www.youtube.com/channel/UC3iqG00TISJpp8XCGGw-Nwg";
                }
                return null;
            case -941558528:
                if (str.equals("service_agreement")) {
                    return "https://www.notein.ai/termsandconditions";
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    return "https://twitter.com/Notein_App";
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    return "https://www.instagram.com/noteinapp/";
                }
                break;
            case 273184065:
                if (str.equals("discount")) {
                    return "https://www.notein.ai/getdiscount";
                }
                break;
            case 761757459:
                if (str.equals("help_center")) {
                    return "https://support.note-in.com";
                }
                break;
            case 926873033:
                if (str.equals("privacy_policy")) {
                    return "https://www.notein.ai/privacypolicy";
                }
                break;
        }
    }
}
