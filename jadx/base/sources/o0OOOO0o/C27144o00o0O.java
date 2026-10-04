package o0OOOO0o;

import android.content.IntentFilter;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.tencent.p610mm.opensdk.constants.ConstantsAPI;
import com.tencent.p610mm.opensdk.openapi.IWXAPI;
import com.tencent.p610mm.opensdk.openapi.WXAPIFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0OOOo.InterfaceC27172OooO00o;
import o0OoO000.C28560OoooOOO;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import ooooOOo0.C35240OooOoOO;

/* JADX INFO: renamed from: o0OOOO0o.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27144o00o0O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f94734OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94735OooOo0o;

    public /* synthetic */ C27144o00o0O(Object obj, int i) {
        this.f94735OooOo0o = i;
        this.f94734OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f94735OooOo0o) {
            case 0:
                o0O0O00 o0o0o00 = (o0O0O00) this.f94734OooOo;
                IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(o0o0o00.f94738OooO0O0, "wxc4d946ffb632036e", true);
                iwxapiCreateWXAPI.registerApp("wxc4d946ffb632036e");
                o0o0o00.f94738OooO0O0.registerReceiver(new C27145o00oO0o(o0o0o00), new IntentFilter(ConstantsAPI.ACTION_REFRESH_WXAPP), 2);
                return iwxapiCreateWXAPI;
            case 1:
                ((C28560OoooOOO) this.f94734OooOo).getClass();
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                List protocols = com.facebook.soloader.OooOo.OooO0oO(Protocol.HTTP_1_1);
                kotlin.jvm.internal.OooOOO0.OooO0oO(protocols, "protocols");
                ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(protocols);
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!arrayListO0ooOoO.contains(protocol) && !arrayListO0ooOoO.contains(Protocol.HTTP_1_1)) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.OooOOO0.OooOOO0(arrayListO0ooOoO, "protocols must contain h2_prior_knowledge or http/1.1: ").toString());
                }
                if (arrayListO0ooOoO.contains(protocol) && arrayListO0ooOoO.size() > 1) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.OooOOO0.OooOOO0(arrayListO0ooOoO, "protocols containing h2_prior_knowledge cannot use other protocols: ").toString());
                }
                if (arrayListO0ooOoO.contains(Protocol.HTTP_1_0)) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.OooOOO0.OooOOO0(arrayListO0ooOoO, "protocols must not contain http/1.0: ").toString());
                }
                if (arrayListO0ooOoO.contains(null)) {
                    throw new IllegalArgumentException("protocols must not contain null");
                }
                arrayListO0ooOoO.remove(Protocol.SPDY_3);
                if (!arrayListO0ooOoO.equals(builder.f124219OooOOoo)) {
                    builder.f124228OooOoo0 = null;
                }
                List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(arrayListO0ooOoO);
                kotlin.jvm.internal.OooOOO0.OooO0o(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
                builder.f124219OooOOoo = listUnmodifiableList;
                OkHttpClient okHttpClient = new OkHttpClient(builder);
                C35240OooOoOO.OooO0O0 oooO0O0 = new C35240OooOoOO.OooO0O0();
                oooO0O0.OooO00o("https://graph.microsoft.com/v1.0/");
                oooO0O0.f126591OooO0O0 = okHttpClient;
                Object objOooO0O0 = oooO0O0.OooO0O0().OooO0O0(InterfaceC27172OooO00o.class);
                kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0O0, "create(...)");
                return (InterfaceC27172OooO00o) objOooO0O0;
            default:
                return ((PenBarChildFragment) this.f94734OooOo).f75298o0000oO;
        }
    }
}
