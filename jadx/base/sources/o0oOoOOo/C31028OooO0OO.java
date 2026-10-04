package o0oOoOOo;

import OooOooO.C20741OooOOoo;
import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.storage.StorageKt;
import com.google.firebase.storage.StorageReference;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.p607ui.vip.VipFeaturesComparisonFragment;
import com.orion.notein.p607ui.widget.webview.jsbridge.BridgeWebView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.vip.VipFeaturesComparisonFragment$loadContent$1", m80623f = "VipFeaturesComparisonFragment.kt", m80624l = {120, 125}, m80625m = "invokeSuspend")
public final class C31028OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f110765OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110766OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ VipFeaturesComparisonFragment f110767OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f110768OooOoO0;

    /* JADX INFO: renamed from: o0oOoOOo.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.vip.VipFeaturesComparisonFragment$loadContent$1$1", m80623f = "VipFeaturesComparisonFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Uri f110769OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ VipFeaturesComparisonFragment f110770OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(VipFeaturesComparisonFragment vipFeaturesComparisonFragment, Uri uri, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110770OooOo0o = vipFeaturesComparisonFragment;
            this.f110769OooOo = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110770OooOo0o, this.f110769OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            BridgeWebView bridgeWebView = this.f110770OooOo0o.f80073OooOo;
            if (bridgeWebView != null) {
                bridgeWebView.loadUrl(this.f110769OooOo.toString());
                return C32460OooOooO.f116667OooO00o;
            }
            OooOOO0.OooOOOO("webView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31028OooO0OO(boolean z, String str, VipFeaturesComparisonFragment vipFeaturesComparisonFragment, Continuation<? super C31028OooO0OO> continuation) {
        super(2, continuation);
        this.f110765OooOo = z;
        this.f110768OooOoO0 = str;
        this.f110767OooOoO = vipFeaturesComparisonFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31028OooO0OO(this.f110765OooOo, this.f110768OooOoO0, this.f110767OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31028OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r3, r6) == r0) goto L24;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110766OooOo0o;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("VipFeaturesComparisonFragment");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getWebPageUrl error: ", e.getMessage()), new Object[0]);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            StorageReference reference = StorageKt.getStorage(Firebase.INSTANCE).getReference();
            OooOOO0.OooO0o(reference, "getReference(...)");
            StorageReference storageReferenceChild = reference.child("web/vip-comparison.html");
            OooOOO0.OooO0o(storageReferenceChild, "child(...)");
            Task<Uri> downloadUrl = storageReferenceChild.getDownloadUrl();
            OooOOO0.OooO0o(downloadUrl, "getDownloadUrl(...)");
            this.f110766OooOo0o = 1;
            obj = C20741OooOOoo.OooO0o(downloadUrl, this);
            if (obj == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        Uri uriBuild = ((Uri) obj).buildUpon().appendQueryParameter("isVIP", this.f110765OooOo ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE).appendQueryParameter("lan", this.f110768OooOoO0).build();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        OooO00o oooO00o = new OooO00o(this.f110767OooOoO, uriBuild, null);
        this.f110766OooOo0o = 2;
    }
}
