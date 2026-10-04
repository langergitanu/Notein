package com.orion.notein.p607ui.backup.netdisk.auth;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.transition.OooOOOO;
import com.aspose.slides.OooOOO;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o000o00.AbstractC24555OooO00o;
import o000oooo.C24761OooO;
import o00o00.C25206OooO0Oo;
import o0OOOoo0.C27213OooO00o;
import o0OOOoo0.C27214OooO0O0;
import o0OOOooO.EnumC27267OooO00o;
import o0Oo0Oo.C28086OooO00o;
import o0Oo0Oo.C28087OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/backup/netdisk/auth/BaiduNetDiskAuthFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class BaiduNetDiskAuthFragment extends Hilt_BaiduNetDiskAuthFragment {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String f70780OooOooo;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f70781OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public WebView f70782OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f70783OooOooO;

    public final class OooO00o extends WebViewClient {
        public OooO00o(String str) {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String queryParameter;
            Log.d("BaiduNetDiskAuthFragment", "new request: " + (webResourceRequest != null ? webResourceRequest.getUrl() : null));
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                if (!C33595OooOOo.OooOOo(url.getPath(), "/authorization/baidu/access_token", false)) {
                    url = null;
                }
                if (url != null && (queryParameter = url.getQueryParameter("code")) != null) {
                    C28086OooO00o c28086OooO00o = (C28086OooO00o) BaiduNetDiskAuthFragment.this.f70783OooOooO.getValue();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c28086OooO00o);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28087OooO0O0(c28086OooO00o, queryParameter, null), 2);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.netdisk.auth.BaiduNetDiskAuthFragment$onViewCreated$1", m80623f = "BaiduNetDiskAuthFragment.kt", m80624l = {63}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70786OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ BaiduNetDiskAuthFragment f70787OooOo0o;

            public OooO00o(BaiduNetDiskAuthFragment baiduNetDiskAuthFragment) {
                this.f70787OooOo0o = baiduNetDiskAuthFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                int iOrdinal = ((EnumC27267OooO00o) obj).ordinal();
                BaiduNetDiskAuthFragment baiduNetDiskAuthFragment = this.f70787OooOo0o;
                if (iOrdinal == 0) {
                    View view = baiduNetDiskAuthFragment.f70781OooOoo;
                    if (view == null) {
                        OooOOO0.OooOOOO("loadingView");
                        throw null;
                    }
                    view.setVisibility(8);
                } else if (iOrdinal == 1) {
                    View view2 = baiduNetDiskAuthFragment.f70781OooOoo;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("loadingView");
                        throw null;
                    }
                    view2.setVisibility(0);
                } else if (iOrdinal == 2) {
                    View view3 = baiduNetDiskAuthFragment.f70781OooOoo;
                    if (view3 == null) {
                        OooOOO0.OooOOOO("loadingView");
                        throw null;
                    }
                    view3.setVisibility(8);
                    ActivityC21897OooOo0 activity = baiduNetDiskAuthFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    if (iOrdinal != 3) {
                        throw new C32442OooOO0o();
                    }
                    View view4 = baiduNetDiskAuthFragment.f70781OooOoo;
                    if (view4 == null) {
                        OooOOO0.OooOOOO("loadingView");
                        throw null;
                    }
                    view4.setVisibility(8);
                    Context context = baiduNetDiskAuthFragment.getContext();
                    if (context != null) {
                        String string = baiduNetDiskAuthFragment.getString(R.string.get_baidu_authorization_failed);
                        OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaiduNetDiskAuthFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70786OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            BaiduNetDiskAuthFragment baiduNetDiskAuthFragment = BaiduNetDiskAuthFragment.this;
            C33772OooooOo c33772OooooOo = ((C28086OooO00o) baiduNetDiskAuthFragment.f70783OooOooO.getValue()).f99551OooO0o;
            OooO00o oooO00o = new OooO00o(baiduNetDiskAuthFragment);
            this.f70786OooOo0o = 1;
            c33772OooooOo.getClass();
            C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return BaiduNetDiskAuthFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.netdisk.auth.BaiduNetDiskAuthFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23009OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f70789OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23009OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f70789OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70789OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70790OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70790OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70790OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.netdisk.auth.BaiduNetDiskAuthFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23010OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70791OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23010OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70791OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70791OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.netdisk.auth.BaiduNetDiskAuthFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23011OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70792OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23011OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70792OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70792OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaiduNetDiskAuthFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    static {
        C27213OooO00o c27213OooO00o = C27214OooO0O0.f95055OooO00o;
        Log.d("ApiModule", "baseUri is: https://service.note-in.com/");
        f70780OooOooo = "https://service.note-in.com/authorization/baidu/access_token";
    }

    public BaiduNetDiskAuthFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23009OooO0Oo(new OooO0OO()));
        this.f70783OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28086OooO00o.class), new C23010OooO0o0(interfaceC32440OooOO0OooO0O0), new C23011OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_baidu_netdisk_auth, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        this.f70782OooOoo0 = webView;
        if (webView == null) {
            OooOOO0.OooOOOO("webView");
            throw null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        this.f70781OooOoo = view.findViewById(R.id.fl_loading);
        int i = requireArguments().getInt("vendor_id");
        if (i == BackupFile.DiskVendor.None.ordinal()) {
            Context context = getContext();
            if (context != null) {
                String string = getString(R.string.tips_netdisk_auth_error);
                OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        } else {
            String strOooO00o = C24761OooO.OooO00o("toString(...)");
            WebView webView2 = this.f70782OooOoo0;
            if (webView2 == null) {
                OooOOO0.OooOOOO("webView");
                throw null;
            }
            webView2.setWebViewClient(new OooO00o(strOooO00o));
            String strOooO0O0 = i == BackupFile.DiskVendor.Baidu.ordinal() ? OooOOO.OooO0O0(new StringBuilder("http://openapi.baidu.com/oauth/2.0/authorize?response_type=code&client_id=mnn0r1FxHgGhGZ4oIWYoa04wFHtWnpMM&redirect_uri="), f70780OooOooo, "&scope=basic,netdisk&display=mobile&state=", strOooO00o) : null;
            if (strOooO0O0 == null || strOooO0O0.length() == 0) {
                String str = getString(R.string.tips_netdisk_auth_error) + " Vendor: " + i + ",";
                Context context2 = getContext();
                if (context2 != null) {
                    C25206OooO0Oo.OooO0oO(context2, str);
                }
            } else {
                WebView webView3 = this.f70782OooOoo0;
                if (webView3 == null) {
                    OooOOO0.OooOOOO("webView");
                    throw null;
                }
                webView3.loadUrl(strOooO0O0);
            }
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
