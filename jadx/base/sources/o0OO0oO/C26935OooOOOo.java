package o0OO0oO;

import com.microsoft.identity.common.java.commands.SilentTokenCommand;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.Continuation;
import o00o00oo.C25298OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0oO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.doc.WPSFileConvertDataSource$downloadPdfFile$2", m80623f = "WPSFileConvertDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26935OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super File>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f93556OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f93557OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26935OooOOOo(String str, String str2, Continuation<? super C26935OooOOOo> continuation) {
        super(2, continuation);
        this.f93557OooOo0o = str;
        this.f93556OooOo = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26935OooOOOo(this.f93557OooOo0o, this.f93556OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super File> continuation) {
        return ((C26935OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        URLConnection uRLConnectionOpenConnection = new URL(this.f93557OooOo0o).openConnection();
        kotlin.jvm.internal.OooOOO0.OooO0o0(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        httpURLConnection.setConnectTimeout(SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS);
        httpURLConnection.setReadTimeout(SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS);
        if (httpURLConnection.getResponseCode() != 200) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("WPSFileConvertDataSource");
            c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO00o(httpURLConnection.getResponseCode(), "HTTP ", ": ", httpURLConnection.getResponseMessage()), new Object[0]);
            httpURLConnection.disconnect();
            return null;
        }
        File file = new File(this.f93556OooOo);
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(inputStream);
                C25298OooO0o.OooO00o(inputStream, fileOutputStream);
                fileOutputStream.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return file;
            } finally {
            }
        } finally {
        }
    }
}
