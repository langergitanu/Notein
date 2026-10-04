package o0OO00o0;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: o0OO00o0.o00O0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$isSvgFile$2", m80623f = "ImageRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26591o00O0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f91704OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f91705OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26591o00O0Oo(C26596o00O0o0 c26596o00O0o0, Uri uri, Continuation<? super C26591o00O0Oo> continuation) {
        super(2, continuation);
        this.f91705OooOo0o = c26596o00O0o0;
        this.f91704OooOo = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26591o00O0Oo(this.f91705OooOo0o, this.f91704OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C26591o00O0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean z = false;
        try {
            ContentResolver contentResolver = this.f91705OooOo0o.f91722OooO0OO.getContentResolver();
            kotlin.jvm.internal.OooOOO0.OooO0o(contentResolver, "getContentResolver(...)");
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(this.f91704OooOo);
            if (inputStreamOpenInputStream != null) {
                try {
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(inputStreamOpenInputStream)).getElementsByTagName("svg");
                    kotlin.jvm.internal.OooOOO0.OooO0o(elementsByTagName, "getElementsByTagName(...)");
                    C34406OooO00o.f123390OooO00o.OooO00o("isSvgFile, svgElements.length: " + elementsByTagName.getLength(), new Object[0]);
                    boolean z2 = elementsByTagName.getLength() > 0;
                    inputStreamOpenInputStream.close();
                    z = z2;
                } finally {
                }
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ImageRepoImpl");
            c20358OooO00o.OooO0Oo(e, "isSvgFile by xml parse error.", new Object[0]);
        }
        return Boolean.valueOf(z);
    }
}
