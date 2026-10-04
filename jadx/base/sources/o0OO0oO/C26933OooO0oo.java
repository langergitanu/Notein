package o0OO0oO;

import android.net.Uri;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.UUID;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27296OooOO0o;
import o0OOo0o.o0000;
import o0OOo0o.o0000O00;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33718OooO0O0;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26933OooO0oo implements InterfaceC27296OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f93539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26938OooOOoo f93540OooO0O0;

    public C26933OooO0oo(OooO0o asposeRemoteDataSource, OooOO0O oooOO0O, OooO oooO, C26932OooO0oO caj2PdfRemoteDataSource, C26938OooOOoo wpsFileConvertDataSource) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(asposeRemoteDataSource, "asposeRemoteDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(caj2PdfRemoteDataSource, "caj2PdfRemoteDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(wpsFileConvertDataSource, "wpsFileConvertDataSource");
        this.f93539OooO00o = asposeRemoteDataSource;
        this.f93540OooO0O0 = wpsFileConvertDataSource;
    }

    @Override // o0OOo0Oo.InterfaceC27296OooOO0o
    public final Object OooO00o(Uri uri, String str, String str2, String str3, o0000 o0000Var) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("DocRepoImpl");
        c20358OooO00o.OooO0o0("convertDocToPdf: fallback to local convertor ", new Object[0]);
        return this.f93539OooO00o.OooO0O0(uri, str, str2, o0000Var);
    }

    @Override // o0OOo0Oo.InterfaceC27296OooOO0o
    public final C33718OooO0O0 OooO0O0() {
        OooO0o oooO0o = this.f93539OooO00o;
        oooO0o.getClass();
        return C25252OooO0Oo.OooO0o0(new C26931OooO0o0(oooO0o, null));
    }

    @Override // o0OOo0Oo.InterfaceC27296OooOO0o
    public final Object OooO0OO(Uri uri, String str, String str2, o0000 o0000Var) {
        String strOoooOoo;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            strOoooOoo = C33599OooOo0O.OoooOoo(IOUtils.DIR_SEPARATOR_UNIX, lastPathSegment, lastPathSegment);
        } else {
            strOoooOoo = UUID.randomUUID() + ".xlsx";
        }
        String str3 = strOoooOoo;
        C26938OooOOoo c26938OooOOoo = this.f93540OooO0O0;
        c26938OooOOoo.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooOOO(c26938OooOOoo, uri, str3, str2, str, null), o0000Var);
    }

    @Override // o0OOo0Oo.InterfaceC27296OooOO0o
    public final Object OooO0Oo(Uri uri, String str, String str2, String str3, o0000O00 o0000o00, o0000 o0000Var) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("DocRepoImpl");
        c20358OooO00o.OooO0o0("convertPPTToPdf: fallback to local convertor ", new Object[0]);
        return this.f93539OooO00o.OooO0OO(uri, str, str3, str2, o0000o00, o0000Var);
    }
}
